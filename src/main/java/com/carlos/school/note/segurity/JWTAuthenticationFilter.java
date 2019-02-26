package com.carlos.school.note.segurity;

import static com.carlos.school.note.utiliti.Constants.HEADER_STRING;
import static com.carlos.school.note.utiliti.Constants.EXPIRATION_TIME;
import static com.carlos.school.note.utiliti.Constants.TOKEN_PREFIX;
import static com.carlos.school.note.utiliti.Constants.SECRET;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.carlos.school.note.entity.UsuarioEntity;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTAuthenticationFilter extends  UsernamePasswordAuthenticationFilter {

	 private AuthenticationManager authenticationManager;
	    public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
	        this.authenticationManager = authenticationManager;
	    }
	    
	    @Override
	    public Authentication attemptAuthentication(HttpServletRequest req,
	                                                HttpServletResponse res) throws AuthenticationException {
	        try {
	            UsuarioEntity usuarioEntity = new ObjectMapper()
	                    .readValue(req.getInputStream(), UsuarioEntity.class);
	            return authenticationManager.authenticate(
	                    new UsernamePasswordAuthenticationToken(
	                    		usuarioEntity.getUserName(),
	                    		usuarioEntity.getPassword(),
	                            new ArrayList<>())
	            );
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }
	    }
	    
	    @Override
	    protected void successfulAuthentication(HttpServletRequest req,
	                                            HttpServletResponse res,
	                                            FilterChain chain,
	                                            Authentication auth) throws IOException, ServletException {
	        String token = Jwts.builder()
	                .setSubject(((User) auth.getPrincipal()).getUsername())
	                .claim("IdRol", ((User) auth.getPrincipal()).getAuthorities())
	                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
	                .signWith(SignatureAlgorithm.HS512, SECRET)
	                .compact();
	        res.addHeader(HEADER_STRING, TOKEN_PREFIX + token);
	    }

}
