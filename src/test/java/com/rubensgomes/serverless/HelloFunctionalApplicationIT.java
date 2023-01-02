package com.rubensgomes.serverless;

import java.util.function.Function;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * {@link HelloFunctionalApplication} integration test.
 *
 * @author Rubens Gomes
 */
@SpringBootTest
class HelloFunctionalApplicationIT
{
   private HelloFunctionalApplication obj;

   @BeforeEach
   void setup()
   {
      obj = new HelloFunctionalApplication();
   }

   @Test
   void ensureAppStarts()
   {
      Assertions.assertTrue( true );
   }

   @Test
   void ensureBeanCreated()
   {
      Function< String, String > test = obj.hello();
      Assertions.assertNotNull( test );
   }
}
