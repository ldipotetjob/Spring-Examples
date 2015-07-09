package com.ldg.spring.rest.controller

import com.ldg.spring.rest.service.Greeting

import org.springframework.web.bind.annotation.RequestParam
import java.util.concurrent.atomic.AtomicInteger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import scala.collection.immutable.List
import collection.JavaConversions._

@Controller
@Autowired
class GreetingController {

    @ResponseBody
    @RequestMapping(value=Array("/greeting"),method = Array(RequestMethod.GET))
    def greeting(@RequestParam(value="name", required=false, defaultValue="World") name: String) : java.util.List[Greeting] = {
         List(Greeting(1, name+"1"),Greeting(1, name+"2"),Greeting(3, name+"3"));
    }
 }
