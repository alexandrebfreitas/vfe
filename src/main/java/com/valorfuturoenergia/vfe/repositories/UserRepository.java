package com.valorfuturoenergia.vfe.repositories;

import com.valorfuturoenergia.vfe.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
