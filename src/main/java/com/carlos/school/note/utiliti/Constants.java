package com.carlos.school.note.utiliti;

public class Constants {

	
	// Spring Security

		public static final String LOGIN_URL = "/login";
		public static final String HEADER_AUTHORIZACION_KEY = "Authorization";
		public static final String TOKEN_BEARER_PREFIX = "Bearer ";

		// JWT

		public static final String ISSUER_INFO = "https://www.autentia.com/";
		public static final String SUPER_SECRET_KEY = "1234";
		public static final long TOKEN_EXPIRATION_TIME = 864_000_000; // 10 day
		
		public static final String SECRET = "SecretKeyToGenJWTs";
	    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
	    public static final String TOKEN_PREFIX = "Bearer ";
	    public static final String HEADER_STRING = "Authorization";
	    public static final String SIGN_UP_URL = "/users/sign-up";
	    
	    //rutas
	    public static final String  ROL="rol";
	    public static final String  ROL_ID="rol/{id}";
	    
	    public static final String  USUARIO="usuario";
	    public static final String  USUARIO_ID="usuario/{id}";
	    
	    public static final String  ALUMNO ="alumno" ;
	    public static final String  ALUMNO_ID="alumno/{id}";
	    
	    public static final String  ACUDIENTE="acudiente";
	    public static final String  ACUDIENTE_ID="acudiente/{id}";
	    
	    public static final String  PROFESOR="profesor";
	    public static final String  PROFESOR_ID="profesor/{id}";
	    
	    public static final String  CONTATO_PROFESOR="contato_profesor";
	    public static final String  CONTATO_PROFESOR_ID="contato_profesor/{id}";
	    
	    public static final String  CONTATO_ACUDIENTE="contato_acudiente";
	    public static final String  CONTATO_ACUDIENTE_ID="contato_acudiente/{id}";
	    
	    public static final String  GRUPO="grupo";
	    public static final String  GRUPO_ID="grupo/{id}";
	    
	    public static final String  MATERIA="materia";
	    public static final String  MATERIA_ID="materia/{id}";
	    
	    public static final String  NOTA="nota";
	    public static final String  NOTA_ID="nota/{id}";
	    
	    public static final String  LICENCIA="licencia";
	    public static final String  LICENCIA_ID="licencia/{id}";
	    
	   
	    
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
