package org.boot.activiti.poc.activiti_poc_boot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByUsername(String username);

}
