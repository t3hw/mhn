package dev.t3hw.mhn.db.repository;

import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static dev.t3hw.mhn.db.jooq.Tables.POSTS;

import dev.t3hw.mhn.db.jooq.tables.records.PostsRecord;
import dev.t3hw.mhn.model.PostDTO;

@Repository
public class PostsRepository {

    private final DSLContext dslContext;

    public PostsRepository(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    public List<PostDTO> findAll() {
        return dslContext.selectFrom(POSTS)
                .fetchInto(PostDTO.class);
    }

    // public PostDTO findById(Long id) {
    //     return dslContext.selectFrom(POSTS)
    //             .where(POSTS.ID.eq(id))
    //             .fetchOneInto(PostDTO.class);
    // }

    // @Transactional
    // public PostDTO create(PostDTO post) {
    //     PostsRecord postRecord = dslContext.newRecord(POSTS, post);
    //     postRecord.store();
    //     return postRecord.into(PostDTO.class);
    // }

    // @Transactional
    // public PostDTO update(PostDTO post) {
    //     dslContext.update(POSTS)
    //             .set(POSTS.CONTENT, post.getContent())
    //             .where(POSTS.ID.eq(post.getId()))
    //             .execute();
    //     return findById(post.getId());
    // }

    // @Transactional
    // public void deleteById(Long id) {
    //     dslContext.deleteFrom(POSTS)
    //             .where(POSTS.ID.eq(id))
    //             .execute();
    // }
    
    // public List<PostDTO> findAuthorsWithBooks() {
    //     return dslContext.selectDistinct(AUTHOR.asterisk())
    //             .from(AUTHOR)
    //             .join(BOOK).on(AUTHOR.ID.eq(BOOK.AUTHOR_ID))
    //             .fetchInto(PostDTO.class);
    // }
}