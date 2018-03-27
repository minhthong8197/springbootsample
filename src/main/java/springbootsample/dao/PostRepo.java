package springbootsample.dao;

import org.springframework.data.repository.CrudRepository;

import springbootsample.model.Post;

public interface PostRepo extends CrudRepository<Post, Integer> {
}
