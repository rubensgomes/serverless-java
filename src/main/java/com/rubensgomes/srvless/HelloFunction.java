package com.rubensgomes.srvless;

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
public class HelloFunction
{
   public static void main( String[] args )
   {
      log.debug( "Starting the [{}] function",
                 HelloFunction.class.getName() );
      SpringApplication.run( HelloFunction.class );
   }
}
