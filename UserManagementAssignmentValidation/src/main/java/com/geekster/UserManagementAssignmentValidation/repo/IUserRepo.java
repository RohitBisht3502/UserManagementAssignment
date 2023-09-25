package com.geekster.UserManagementAssignmentValidation.repo;

import com.geekster.UserManagementAssignmentValidation.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<User,Integer> {
}
