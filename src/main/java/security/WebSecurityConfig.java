package security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;
     
    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
            .dataSource(dataSource)
            .usersByUsernameQuery("select uname, password,'true' as enabled from userdetails where uname=?")
            .authoritiesByUsernameQuery("select uname,authority from authorities where uname = ?")           
        ;
    }
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            /*.anyRequest().authenticated()
            .and()
            .formLogin().permitAll()
            .and()
            .logout().permitAll(); 
            */
        	.antMatchers("/admin").hasRole("admin")
        	.antMatchers("/user").hasAnyRole("user","admin")
        	.and()
        	.formLogin()
        	.and()
            .logout().permitAll();;
    }
    
}
