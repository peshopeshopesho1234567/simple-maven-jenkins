package org.sonatype.mavenbook.ch03;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.log4j.Logger;

public class NASARetriever {
  private static Logger log = Logger.getLogger(NASARetriever.class);
  public InputStream retrieve() throws Exception {
    log.info("Retrieveing NASA Data");
    String url = "https://www.nasa.gov/rss/dyn/breaking_news.rss";
    URLConnection conn = new URL(url).openConnection();
    return conn.getInputStream();
  }
}