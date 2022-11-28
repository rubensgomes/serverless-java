package com.rubensgomes.serverless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

/**
 * The application start class.
 *
 * @author Rubens Gomes
 */
@Slf4j
@SpringBootApplication
public class HelloFunctionApplication
{
   public static void main( String[] args )
   {
      log.debug( "Starting the [{}] function",
                 HelloFunctionApplication.class.getName() );
      SpringApplication.run( HelloFunctionApplication.class );
   }
}
