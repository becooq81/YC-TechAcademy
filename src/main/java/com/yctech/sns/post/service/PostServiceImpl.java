package com.yctech.sns.post.service;

import com.yctech.sns.post.domain.Post;
import com.yctech.sns.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public Post addPost(String title, String content) {
        return null;
    }

    @Override
    public Post getPost(Long id) {
        return null;
    }

    @Override
    public List<Post> getPostListByUserId() {
        return new ArrayList<>();
    }

    @Override
    public List<Post> getPostList() {
        return new ArrayList<>();
    }
}
