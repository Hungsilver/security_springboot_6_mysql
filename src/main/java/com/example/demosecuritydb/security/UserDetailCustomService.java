package com.example.demosecuritydb.security;

import com.example.demosecuritydb.entity.Employee;
import com.example.demosecuritydb.entity.Role;
import com.example.demosecuritydb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.stream.Collectors;

@Transactional
@Service
public class UserDetailCustomService implements UserDetailsService {
    @Autowired
    EmployeeRepository emRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Employee e = emRepo.findById(username).orElse(null);
        if (e == null) {
            throw new UsernameNotFoundException(username);
        }
        return new User(e.getUserName(), e.getPassword(), mapRolesAuthor(e.getRoles()));
    }

    public Collection<? extends GrantedAuthority> mapRolesAuthor(Collection<Role> roles) {
        Collection<? extends GrantedAuthority> collect = roles.stream()
                .map(x -> new SimpleGrantedAuthority(x.getId()))
                .collect(Collectors.toList());
        return collect;
    }


}
