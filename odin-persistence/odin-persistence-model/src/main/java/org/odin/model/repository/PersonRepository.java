package org.odin.model.repository;

import org.odin.model.entity.Person;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository
    extends CrudRepository<Person, Long>, JpaSpecificationExecutor<Person>, BaseRepository {

  Person findByUsername (String username);
  Person findByEmail (String email);

}
