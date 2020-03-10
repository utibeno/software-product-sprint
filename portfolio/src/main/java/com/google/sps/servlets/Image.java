package com.google.sps.servlets;

public final class Image {

  private final long id;
  private final String uploadUrl;
  private final long timestamp;

  public Image(long id, String uploadUrl, long timestamp) {
    this.id = id;
    this.uploadUrl = uploadUrl;
    this.timestamp = timestamp;
  }
}