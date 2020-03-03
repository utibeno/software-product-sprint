package com.google.sps.servlets;

public final class Comments {

  private final long id;
  private final String title;
  private final long timestamp;

  public Comments(long id, String title, long timestamp) {
    this.id = id;
    this.title = title;
    this.timestamp = timestamp;
  }
}