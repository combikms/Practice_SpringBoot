package com.kangcombi.shop.Comment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @PostMapping("/comment")
    String addComment(@RequestParam String content, String username, Long postId) {
        commentService.saveComment(content, username, postId);
        return "redirect:/detail/" + postId.toString();
    }

}
