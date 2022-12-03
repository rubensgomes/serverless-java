package com.rubensgomes.serverless.function;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * {@link HelloFunction} unit test.
 *
 * @author Rubens Gomes
 */
class HelloFunctionTest
{
   @Mock
   private HelloFunction mock;

   // object being tested
   private HelloFunction obj;

   @BeforeEach
   void setup()
   {
      MockitoAnnotations.initMocks( this );
      obj = new HelloFunction();
   }

   @Test
   void ensureApplyWorks()
   {
      final String NAME = "test";
      String expected = HelloFunction.HELLO_TXT + " " + NAME;
      String actual = obj.apply( NAME );
      Assertions.assertEquals( expected,
                               actual );
   }

   @Test
   void ensureMockingWorks()
   {
      final String NAME = "mock test";
      Mockito.when( mock.apply( Mockito.anyString() ) )
             .thenReturn( NAME );
      String expected = NAME;
      String actual = mock.apply( "hi" );
      Assertions.assertEquals( expected,
                               actual );
   }

}
