package dev.t3hw.mhn.db.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.t3hw.mhn.db.jpa.entity.PostDAO;

public interface PostsJpaRepo extends JpaRepository<PostDAO, Long> {

}