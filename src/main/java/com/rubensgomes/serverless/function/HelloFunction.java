package com.rubensgomes.serverless.function;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import lombok.extern.slf4j.Slf4j;

/**
 * {@link HelloFunction} is a simple hello {@link Function}.
 *
 * @author Gomes, Rubens <Rubens.S.Gomes@gmail.com>
 */
@Slf4j
public class HelloFunction implements UnaryOperator< String >
{
   static final String HELLO_TXT = "Hello";

   public HelloFunction()
   {
      log.trace( "constructed" );
   }

   @Override
   public String apply( String name )
   {
      log.trace( "HelloFunction called wih name: {}",
                 name );

      StringBuilder buff = new StringBuilder();
      buff.append( HELLO_TXT );
      buff.append( " " );
      buff.append( name );

      return buff.toString();
   }
}
