package pl.malcew.jpasecurity.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.malcew.jpasecurity.model.Post;
import pl.malcew.jpasecurity.repo.PostRepo;

@RestController
@RequestMapping("/api/posts")
@Data

public class PostController {
    private final PostRepo postRepo;

    @GetMapping
    public Iterable<Post> findAll() {
        return postRepo.findAll();
    }

    @GetMapping("/{id}")
    public Post findById(@PathVariable("id") Post post) {
        return post;
    }
}
