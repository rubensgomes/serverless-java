package com.rubensgomes.serverless.function;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * {@link HelloFunction} is a simple hello {@link Function}.
 *
 * @author Gomes, Rubens <Rubens.S.Gomes@gmail.com>
 */
@Slf4j
@Component
class HelloFunction implements UnaryOperator< String >
{

   HelloFunction()
   {
      log.trace( "constructed" );
   }

   @Override
   public String apply( String name )
   {
      log.trace( "HelloFunction called" );
      return "Hello " + name;
   }
}
