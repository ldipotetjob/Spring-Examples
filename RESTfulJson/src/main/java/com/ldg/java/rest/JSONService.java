package com.ldg.java.rest;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.mkyong.Track;

@Path("/json/music")
public class JSONService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Track> getTrackInJSON() {

		List<Track> tracklist = new ArrayList<Track>();

		Track track = new Track();
		track.setTitle("Sinnerman");
		track.setSinger("Nina Simone");


		Track track1 = new Track();
		track1.setTitle("Incomaptibilidad de Genios");
		track1.setSinger("Joao Bosco");

		Track track2 = new Track();
		track2.setTitle("Lagrimas negras");
		track2.setSinger("Bebo & Cigala");

		tracklist.add(track);
		tracklist.add(track1);
		tracklist.add(track2);


		return tracklist;

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();
		
	}
	
}