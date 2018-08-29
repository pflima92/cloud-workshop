package io.github.blueprint.controller;

import io.github.blueprint.model.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api("The Person Resource Rest Api")
@RestController
public class PersonController {

  private static Set<Person> persons = new HashSet<>();

  @ApiOperation("Save a new person")
  @PostMapping("/persons")
  public void savePerson(@RequestBody Person person) {
    persons.add(person);
  }

  @ApiOperation("List all persons available")
  @GetMapping("/persons")
  public Collection<Person> listPersons() {
    return persons;
  }
}
