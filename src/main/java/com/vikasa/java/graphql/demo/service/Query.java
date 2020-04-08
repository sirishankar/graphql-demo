package com.vikasa.java.graphql.demo.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.vikasa.java.graphql.demo.dao.PostDao;
import com.vikasa.java.graphql.demo.model.Post;

import java.util.List;
import java.util.Optional;

public class Query implements GraphQLQueryResolver {
    private PostDao postDao;

    public Query(PostDao postDao) {
        this.postDao = postDao;
    }

    public List<Post> getRecentPosts(int count, int offset) {

        return postDao.getRecentPosts(count, offset);
    }
    public List<Post> getAllPosts() {

        return postDao.getAllPosts();
    }

    public Optional<Post> getByPostId(String id){

        return postDao.getByPostId(id);
    }
}
