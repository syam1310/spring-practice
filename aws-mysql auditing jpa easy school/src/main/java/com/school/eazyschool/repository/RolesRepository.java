package com.school.eazyschool.repository;

import com.school.eazyschool.model.Roles;
import jakarta.persistence.criteria.CriteriaBuilder;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {

    Roles getByRoleName(String roleName);
}
