package com.Amedus.AmedusCase.Repository;

import com.Amedus.AmedusCase.Entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
    @Query("SELECT ur FROM UserRole ur WHERE ur.authority = :authority")
    Optional<UserRole> findByAuthority(String authority);
}
