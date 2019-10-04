package cn.lybb.security.conf;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author lyb
 * @since 2019/10/4 23:02
 */
@EnableWebSecurity
public class MySecurity extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/","/login","/layui/**", "/css/**", "/js/**", "/images/**")
                .permitAll()
                .anyRequest()
                .authenticated();
    }
}
