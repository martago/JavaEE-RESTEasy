package de.janosch.resteasy;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;

@Path("/version")
@ApplicationScoped
public class VersionREST {

    private String version = "1.0.0";

    @GET
    public String getVersion() {
        return version;
    }

    @POST
    public void setVersion(@QueryParam("version") String version) {
        this.version = version;
    }
}