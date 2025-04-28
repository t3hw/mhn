package dev.t3hw.mhn.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import dev.t3hw.mhn.db.jpa.repository.PostsJpaRepo;
import dev.t3hw.mhn.db.repository.PostsRepository;
import dev.t3hw.mhn.model.PostDTO;
import dev.t3hw.mhn.server.MhnApiDelegate;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MhnApiService implements MhnApiDelegate {

    private final PostsRepository postsRepo;
    // private final PostsJpaRepo postsJpaRepo;

    @Override
    public ResponseEntity<List<PostDTO>> getPosts() {
        return getPostsWithJooq();

        // return getPostsWithJpa();
    }

    private ResponseEntity<List<PostDTO>> getPostsWithJooq() {
        var posts = postsRepo.findAll();
        return ResponseEntity.ok().body(posts);
    }

    // private ResponseEntity<List<PostDTO>> getPostsWithJpa() {
    //     var posts = postsJpaRepo.findAll();
    //     return ResponseEntity.ok(posts.stream().map(post -> {
    //         var postDTO = new PostDTO();
    //         postDTO.setId(post.getId());
    //         postDTO.setContent(post.getContent());
    //         return postDTO;
    //     }).toList());
    // }


}
