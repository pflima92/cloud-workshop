package io.github.blueprint.controller;

import io.github.blueprint.model.Person;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

  private static Set<Person> persons = new HashSet<>();

  @PostMapping("/persons")
  public void savePerson(@RequestBody Person person) {
    persons.add(person);
  }

  @GetMapping("/persons")
  public Collection<Person> listPersons() {
    return persons;
  }
}
