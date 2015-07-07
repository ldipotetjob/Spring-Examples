package com.ldg.spring.rest.service;

import java.util.List;

import com.ldg.spring.rest.controller.Track;


public interface TrackJsonService {

    List<Track> getTrackInJSON(String varjson);
}
