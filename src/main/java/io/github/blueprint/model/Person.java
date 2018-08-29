package io.github.blueprint.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = {"cpf"})
@NoArgsConstructor
@AllArgsConstructor
public class Person {

  private String cpf;
  private String name;
  private LocalDate birthdate;
}
