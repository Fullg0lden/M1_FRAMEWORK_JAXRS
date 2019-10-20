package fr.pantheonsorbonne.ufr27.miage.endpoints;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.pantheonsorbonne.ufr27.miage.AvailabilityNeutralResponse;
import fr.pantheonsorbonne.ufr27.miage.TSTResponse;
import fr.pantheonsorbonne.ufr27.miage.business.AmadeusBusiness;
import fr.pantheonsorbonne.ufr27.miage.utils.Utils;

@Path("FXP")
public class FXPEndpoint {

	@Inject
	AmadeusBusiness business;

	@GET
	@Path("{AN}/{passenger}")
	@Produces(value = { MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public TSTResponse getTst(@PathParam("AN") AvailabilityNeutralResponse an, @PathParam("passenger") String passenger) {
		TSTResponse tst = Utils.FACTORY.createTSTResponse();
		return tst;
	}
}
