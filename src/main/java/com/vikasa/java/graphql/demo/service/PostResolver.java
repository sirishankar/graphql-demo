package com.vikasa.java.graphql.demo.service;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.vikasa.java.graphql.demo.dao.AuthorDao;
import com.vikasa.java.graphql.demo.model.Author;
import com.vikasa.java.graphql.demo.model.Post;

import java.util.Optional;

public class PostResolver implements GraphQLResolver<Post> {
    private AuthorDao authorDao;

    public PostResolver(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    public Optional<Author> getAuthor(Post post) {
        return authorDao.getAuthor(post.getAuthorId());
    }
}
