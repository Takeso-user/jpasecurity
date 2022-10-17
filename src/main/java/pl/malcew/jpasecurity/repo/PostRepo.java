package pl.malcew.jpasecurity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.malcew.jpasecurity.model.Post;

public interface PostRepo extends JpaRepository<Post, Long> {

}
