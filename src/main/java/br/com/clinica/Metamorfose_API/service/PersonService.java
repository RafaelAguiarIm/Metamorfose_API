package br.com.clinica.Metamorfose_API.service;

import br.com.clinica.Metamorfose_API.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong idCounter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public List<Person> findAll() {
        logger.info("Finding all persons");
        // Simulate finding all persons
        List<Person> persons = List.of(
                new Person(idCounter.incrementAndGet(), "John Doe","qwe@qwe.com", "123456789"),
                new Person(idCounter.incrementAndGet(), "Kevin Bacon","qwe@qwe.com", "123456789"),
                new Person(idCounter.incrementAndGet(), "Yohan Laud","qwe@qwe.com", "123456789"),
                new Person(idCounter.incrementAndGet(), "Stein Rissoka","qwe@qwe.com", "123456789"),
                new Person(idCounter.incrementAndGet(), "Mizura Ridoe","qwe@qwe.com", "123456789")
        );

        return persons;
    }

    public Person findById(String id) {
        logger.info("Finding person by ID: " + id);
        // Simulate finding a person by ID
        Person person = new Person();
        person.setId(idCounter.incrementAndGet());
        person.setName("John Doe")  ; // Example name
        person.setCpf("123.456.789-00"); // Example CPF
        person.setRg("12.345.678-9"); // Example RG

        return person;
    }

    public Person create(Person person) {
        logger.info("Creating person: " + person.getName());
        return person;
    }

    public Person update(Person person) {
        logger.info("Updating person: " + person.getName());
        return person;
    }

    public void delete(String id) {
        logger.info("Deleting person with ID: " + id);
    }

    private Person mockPerson(Long id) {
        Person person = new Person();
        person.setId(id);
        person.setName("Mock Person " + id);
        person.setCpf("123.456.789-00");
        person.setRg("12.345.678-9");
        return person;
    }
}
