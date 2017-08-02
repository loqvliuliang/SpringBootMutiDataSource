package com.example.demo.domain.p;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ll on 2017/8/1.
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
