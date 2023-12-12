package com.abrahim.bookauthor.exception;

public class EntityNotFoundException extends RuntimeException{
  public EntityNotFoundException(String message){
    super(message);
  }
}
