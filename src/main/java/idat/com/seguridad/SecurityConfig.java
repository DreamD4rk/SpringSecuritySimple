package idat.com.seguridad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("antoine").password(passwordEncoder().encode("a123")).roles("ADMIN");
		auth.inMemoryAuthentication().withUser("andy").password(passwordEncoder().encode("andy123")).roles("ADMIN");
		auth.inMemoryAuthentication().withUser("werther").password(passwordEncoder().encode("w123")).roles("USER");
		auth.inMemoryAuthentication().withUser("andy1").password(passwordEncoder().encode("1")).roles("USER");
		auth.inMemoryAuthentication().withUser("andy2").password(passwordEncoder().encode("2")).roles("USER");
		auth.inMemoryAuthentication().withUser("andy3").password(passwordEncoder().encode("3")).roles("USER");
		auth.inMemoryAuthentication().withUser("andy4").password(passwordEncoder().encode("4")).roles("USER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/listar_public").permitAll().antMatchers("/listar_admin")
				.access("hasRole('ADMIN')").antMatchers("/listar_user").access("hasRole('USER')");

		http.authorizeRequests().and().httpBasic();

		http.authorizeRequests().and().csrf().disable();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(); //esto descifra y crear un valor
	}

}
