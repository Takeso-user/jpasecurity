package pl.malcew.jpasecurity.service;

import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.malcew.jpasecurity.model.SecurityUser;
import pl.malcew.jpasecurity.model.User;
import pl.malcew.jpasecurity.repo.UserRepo;

@Data
@AllArgsConstructor
@Service
public class JpaUserDetailsService implements UserDetailsService {
    private final UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new SecurityUser(userRepo
                .findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User " + username + " not found")));
    }

}
