package com.abrahim.bookauthor.model.request;

import lombok.Data;

@Data
public class BookCreationRequest {

  private String name;
  private String isbn;
  private String authorId;

}
