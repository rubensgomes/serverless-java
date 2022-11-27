package com.rubensgomes.srvless.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * {@link HelloRestController} is a simple hello RESTful API.
 *
 * @author Gomes, Rubens <Rubens.S.Gomes@gmail.com>
 */
@Slf4j
@RestController
public class HelloRestController
{
   static final String OPERATION = "/hello";

   /**
    * The hello operation.
    *
    * @param name some text to display back.
    * @return a hello text message.
    */
   //@formatter:off
   @GetMapping
   (
      path     = { OPERATION                        }
   )
   //@formatter:on
   @ResponseStatus( code = HttpStatus.OK )
   public String hello( @RequestParam( value = "name",
                                       defaultValue = "World" ) String name )
   {
      log.trace( "Processing hello" );
      return String.format( "Hello %s!",
                            name );
   }
}
