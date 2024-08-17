package com.kangcombi.shop.Comment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    public void saveComment(String content, String username, Long postId) {
        Comment comment = new Comment();
        comment.content = content;
        comment.username = username;
        comment.postId = postId;
        commentRepository.save(comment);
    }

//    public void editItem(Long id, String title, Integer price) {
//        Item item = new Item();
//        item.id = id;
//        item.title = title;
//        item.price = price;
//        itemRepository.save(item);
//    }

}