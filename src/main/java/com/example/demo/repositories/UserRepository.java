package com.example.demo.repositories;

import com.example.demo.models.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "data", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User,Long> {
}
