package com.manager.ecole.exception;

public class EntityNotFoundException extends I18AbleException {
  public EntityNotFoundException(String key, Object... args) {
    super(key, args);
  }
}
