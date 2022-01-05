package com.jersey.example.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/users")
public class MyResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/random")
    public Response get(){
        ArrayList<Integer> datas=new ArrayList<>();
        for(int i=0;i<5000;i++)
            datas.add(i);
        return Response.ok(datas).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/random/{id}")
    public Response get(@PathParam("id") String id){
        return Response.ok("Entered data is : "+id).build();
    }
}
