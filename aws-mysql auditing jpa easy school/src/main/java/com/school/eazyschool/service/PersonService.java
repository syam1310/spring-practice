package com.school.eazyschool.service;

import com.school.eazyschool.constants.EazySchoolConstants;
import com.school.eazyschool.model.Person;
import com.school.eazyschool.model.Roles;
import com.school.eazyschool.repository.PersonRepository;
import com.school.eazyschool.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    RolesRepository rolesRepository;

    public boolean createNewPerson(Person person) {
        Roles roles = rolesRepository.getByRoleName(EazySchoolConstants.STUDENT_ROLE);
        person.setRoles(roles);
        person = personRepository.save(person);
        if (person != null && person.getPersonId() > 0) {
            return true;
        }
        return false;

    }
}
