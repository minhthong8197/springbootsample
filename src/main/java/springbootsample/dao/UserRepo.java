package springbootsample.dao;

import org.springframework.data.repository.CrudRepository;

import springbootsample.model.User;

public interface UserRepo extends CrudRepository<User, String> {
}
