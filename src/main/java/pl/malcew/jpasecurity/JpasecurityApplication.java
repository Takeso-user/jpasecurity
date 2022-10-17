package pl.malcew.jpasecurity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import pl.malcew.jpasecurity.model.Post;
import pl.malcew.jpasecurity.model.User;
import pl.malcew.jpasecurity.repo.PostRepo;
import pl.malcew.jpasecurity.repo.UserRepo;

@SpringBootApplication
public class JpasecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpasecurityApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(PostRepo postRepo, UserRepo userRepo, PasswordEncoder passwordEncoder) {
		return args -> {
			postRepo.save(new Post("title1", "content1", "author1", "slug1"));
			postRepo.save(new Post("title2", "content2", "author2", "slug2"));
			postRepo.save(new Post("title3", "content3", "author3", "slug3"));
			postRepo.save(new Post("title4", "content4", "author4", "slug4"));
			postRepo.save(new Post("title5", "content5", "author5", "slug5"));

			userRepo.save(new User("user", passwordEncoder.encode("password"), "ROLE_USER"));
			userRepo.save(new User("admin", passwordEncoder.encode("password"), "ROLE_USER,ROLE_ADMIN"));
		};
	}

}
