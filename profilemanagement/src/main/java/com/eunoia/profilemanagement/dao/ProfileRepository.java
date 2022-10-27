package com.eunoia.profilemanagement.dao;

import com.eunoia.profilemanagement.entity.EmployeeProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<EmployeeProfile, Integer > {
}
