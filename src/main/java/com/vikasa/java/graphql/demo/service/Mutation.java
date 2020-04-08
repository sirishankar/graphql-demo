package com.vikasa.java.graphql.demo.service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.vikasa.java.graphql.demo.dao.PostDao;
import com.vikasa.java.graphql.demo.model.Post;

import java.util.UUID;

public class Mutation implements GraphQLMutationResolver {
    private PostDao postDao;

    public Mutation(PostDao postDao) {
        this.postDao = postDao;
    }

    public Post writePost(String title, String text, String category, String author) {
        Post post = new Post();
        post.setId(UUID.randomUUID().toString());
        post.setTitle(title);
        post.setText(text);
        post.setCategory(category);
        post.setAuthorId(author);
        postDao.savePost(post);

        return post;
    }
}
