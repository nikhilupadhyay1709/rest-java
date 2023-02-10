package com.quest.crud.app.repository;

import com.quest.crud.app.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmRepository extends JpaRepository<Employee, Long> {

}
