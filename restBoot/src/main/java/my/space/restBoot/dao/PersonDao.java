package my.space.restBoot.dao;

import my.space.restBoot.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, Person person);

    public default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonbyId(UUID id);

    int deletePersonbyId(UUID id);

    int updatePersonById(UUID id, Person person) ;

}
