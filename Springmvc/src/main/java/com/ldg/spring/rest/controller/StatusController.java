package com.ldg.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ldg.spring.rest.service.StatusService;
import com.ldg.spring.rest.service.TrackJsonService;

/**
 * Created by mohan.saravanan on 13/05/2014.
 */
@Controller
public class StatusController {

    private StatusService statusService;
    private TrackJsonService trackService;
    
    @Autowired
    public StatusController(StatusService statusService,TrackJsonService trackService) {
        this.statusService = statusService;
		this.trackService = trackService;
    }

    @ResponseBody
    @RequestMapping(value = "/status", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public StatusJson findStatus() {
        return new StatusJson(statusService.getStatus());
    }

    @ResponseBody
    @RequestMapping(value = "/track", method = RequestMethod.GET/*, produces = MediaType.APPLICATION_JSON_VALUE*/)
    public List<Track> findTrack(@RequestParam(value = "usr", required = false) String varjson) {
	
        return trackService.getTrackInJSON(varjson);
    }


}