package com.school.eazyschool.repository;

import com.school.eazyschool.model.Holiday;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolidaysRepository extends ListCrudRepository<Holiday, String> {

}
