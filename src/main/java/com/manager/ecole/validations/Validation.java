package com.manager.ecole.validations;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Validation {
  private String fieldName;
  private String message;
}
