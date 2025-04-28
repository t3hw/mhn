package dev.t3hw.mhn.db.jpa.entity;

import dev.t3hw.mhn.model.PostDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "posts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PostDAO extends PostDTO {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "content")
    private String content;
}