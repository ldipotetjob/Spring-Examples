package com.ldg.spring.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ldg.spring.rest.controller.Track;

@Service
public class TrackJsonServiceImpl implements TrackJsonService {

public List<Track> getTrackInJSON(String varjson) {
	// TODO Auto-generated method stub
	
	List<Track> listtrack = new ArrayList<Track>();
	Track track = new Track();
	track.setTitle("Enter Sandman _" +varjson);
	track.setSinger("Metallica");
	
	Track track1 = new Track();
	track1.setTitle("Fragile _" +varjson);
	track1.setSinger("Sting");

	
	Track track2 = new Track();
	track2.setTitle("Imagine");
	track2.setSinger("Beattles _" +varjson);

	listtrack.add(track);
	listtrack.add(track1);
	listtrack.add(track2);
	
	return listtrack;
	
}	
}	
	
	