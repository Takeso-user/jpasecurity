package pl.malcew.jpasecurity.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
@Entity
@NoArgsConstructor
@Data
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;
    private String author;
    private String slug;

    private LocalDateTime publishedOn;
    private LocalDateTime updatedOn;

    public Post(String title, String content, String author, String slug) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.slug = slug;
        this.publishedOn = LocalDateTime.now();

    }
}
