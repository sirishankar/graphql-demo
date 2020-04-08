package com.vikasa.java.graphql.demo.service;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.vikasa.java.graphql.demo.dao.PostDao;
import com.vikasa.java.graphql.demo.model.Author;
import com.vikasa.java.graphql.demo.model.Post;

import java.util.List;

public class AuthorResolver implements GraphQLResolver<Author> {
    private PostDao postDao;

    public AuthorResolver(PostDao postDao) {
        this.postDao = postDao;
    }

    public List<Post> getPosts(Author author) {
        return postDao.getAuthorPosts(author.getId());
    }
}
