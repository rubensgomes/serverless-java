package com.rubensgomes.serverless.function;

import java.net.URI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.cloud.function.context.test.FunctionalSpringBootTest;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;

import com.rubensgomes.serverless.HelloFunctionalApplication;

/**
 * {@link HelloFunction} integration test.
 *
 * @author Rubens Gomes
 */
@FunctionalSpringBootTest( classes = HelloFunctionalApplication.class,
                           webEnvironment = WebEnvironment.RANDOM_PORT )
class HelloFunctionIT
{
   private static final String NAME = "test";

   @Autowired
   private TestRestTemplate template;

   @Test
   void ensureHelloFunctionWorks()
      throws Exception
   {
      ResponseEntity< String > result =
         this.template.exchange( RequestEntity.post( new URI( "/hello" ) )
                                              .body( NAME ),
                                 String.class );

      String expected = HelloFunction.HELLO_TXT + " " + NAME;
      String actual = result.getBody();
      Assertions.assertEquals( expected,
                               actual );
   }

}
