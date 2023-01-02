package com.rubensgomes.serverless;

import java.util.function.UnaryOperator;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionalSpringApplication;
import org.springframework.context.annotation.Bean;

import com.rubensgomes.serverless.function.HelloFunction;

import lombok.extern.slf4j.Slf4j;

/**
 * The functional application start class.
 *
 * @author Rubens Gomes
 */
@Slf4j
@SpringBootApplication
public class HelloFunctionalApplication
{
   @Bean
   public UnaryOperator< String > hello()
   {
      log.trace( "Creating HelloFunction bean" );
      return new HelloFunction();
   }

   public static void main( String[] args )
   {
      log.debug( "Starting the [{}] function",
                 HelloFunctionalApplication.class.getName() );
      FunctionalSpringApplication.run( HelloFunctionalApplication.class );
   }
}
