package com.carlos.school.note.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.carlos.school.note.entity.UsuarioEntity;
import com.carlos.school.note.repository.UsuarioRP;


import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private  UsuarioRP usuarioRP;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UsuarioEntity usuarioEntity = usuarioRP.findByUserName(username);
        if (usuarioEntity == null) {
            throw new UsernameNotFoundException(username);
        }
        
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        grantedAuthorities.add(new SimpleGrantedAuthority( usuarioEntity.getRolEntity().getNombre()));
        return new User(usuarioEntity.getUserName(), usuarioEntity.getPassword(), grantedAuthorities);
	
	}

}
