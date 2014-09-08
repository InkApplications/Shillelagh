package com.example.shillelagh.model;

import shillelagh.Field;
import shillelagh.OrmOnly;
import shillelagh.Table;

@Table
public class Author extends Base {
  @Field String name;

  /**
   * Used internally by Shillelagh. OrmOnly Annotation is only a documentation annotation, and
   * is not required for Shillelagh usage.
   */
  @OrmOnly Author() { }

  public Author(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override public String toString() {
    return "Author{" +
        "name='" + name + '\'' +
        '}';
  }
}
