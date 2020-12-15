package com.oltraining.oltraining.repository;

import com.oltraining.oltraining.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
    public Admin findByEmail(String email);
}
