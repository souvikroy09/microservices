package com.eunoia.profilemanagement.service;

import com.eunoia.profilemanagement.entity.EmployeeProfile;

import java.util.List;

public interface EmployeeProfileService {

    void addEmployeeProfile(EmployeeProfile profile);
    List< EmployeeProfile > getEmployeeProfiles();
}
