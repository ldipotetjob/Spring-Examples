package com.ldg.spring.rest.service

import scala.beans.BeanProperty
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.annotation.JsonInclude;

//@BeanProperty is required in order to have Java Bean Style getter/setter that can be inspected by Spring
/**
 * La siguiente anotacion no es necesario especificar que produce un JSON,ya lo solucionamos de manera declarativa 
 * en springContext-webapp.xml destacando que todo lo que se produzca sea convertido a JSON con lo que solo 
 * @JsonInclude(JsonInclude.Include.NON_NULL)
 *
 **/

@Service
case class Greeting(@BeanProperty id: Int, @BeanProperty content: String)

