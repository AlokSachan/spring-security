package com.alok.spring.security.config;

import com.alok.spring.security.model.Customer;
import com.alok.spring.security.model.SecurityCustomer;
import com.alok.spring.security.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class UserDetailsImpl{
//public class UserDetailsImpl implements UserDetailsService {

//    @Autowired
//    private CustomerRepository customerRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        List<Customer> customer = customerRepository.findByEmail(username);
//        if(CollectionUtils.isEmpty(customer))
//            throw new UsernameNotFoundException("User details not found for the user : "+ username);
//        return new SecurityCustomer(customer.get(0));
//    }
}
