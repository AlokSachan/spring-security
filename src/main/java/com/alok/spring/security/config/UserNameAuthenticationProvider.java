package com.alok.spring.security.config;

import com.alok.spring.security.model.Customer;
import com.alok.spring.security.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class UserNameAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String name = authentication.getName();
        String password = authentication.getCredentials().toString();
      List<Customer> customerList= customerRepository.findByEmail(name);
      if(! CollectionUtils.isEmpty(customerList)){
          if(passwordEncoder.matches(password, customerList.stream().map(Customer::getPwd).findFirst().get())){
              List<GrantedAuthority> authorities = new ArrayList<>();
              authorities.add(new SimpleGrantedAuthority(customerList.get(0).getRole()));
              return new UsernamePasswordAuthenticationToken(name,password, authorities);
          }
          else {
              throw new BadCredentialsException("Invalid password");
          }
      }
      else {
          throw new BadCredentialsException("No user registered with this details");
      }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
