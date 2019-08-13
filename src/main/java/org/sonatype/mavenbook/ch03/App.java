package org.sonatype.mavenbook.ch03;

import org.apache.log4j.PropertyConfigurator;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        PropertyConfigurator.configure(App.class.getClassLoader()
            .getResource("log4j.properties"));
        NASARetriever retriever = new NASARetriever();
	System.out.format("Testing the jenkins-maven build!!! %s", "Hooraaay");
        try {
            retriever.retrieve();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println( "Hello World!" );
    }
}
