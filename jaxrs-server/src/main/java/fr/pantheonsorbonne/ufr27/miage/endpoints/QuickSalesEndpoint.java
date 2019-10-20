package fr.pantheonsorbonne.ufr27.miage.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;

import fr.pantheonsorbonne.ufr27.miage.KlassType;
import fr.pantheonsorbonne.ufr27.miage.QuickSalesResponses;
import fr.pantheonsorbonne.ufr27.miage.exceptions.DateParseException;
import fr.pantheonsorbonne.ufr27.miage.utils.Utils;

@Path("SS")
public class QuickSalesEndpoint {
	
	@GET
	@Path("{numSeat}/{klass}/{lineNumber}")
	@Produces(value = { MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public QuickSalesResponses getSs(@PathParam("numSeat") int numSeat, @PathParam("klass") KlassType klass, @PathParam("lineNumber") int lineNumber) throws JAXBException, DateParseException{
		QuickSalesResponses ss = Utils.FACTORY.createQuickSalesResponses();
		return ss;
	}
}
