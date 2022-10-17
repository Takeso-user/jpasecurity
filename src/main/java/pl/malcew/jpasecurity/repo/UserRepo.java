package pl.malcew.jpasecurity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.malcew.jpasecurity.model.User;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
