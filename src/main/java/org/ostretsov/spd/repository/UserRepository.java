package org.ostretsov.spd.repository;

import org.ostretsov.spd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
