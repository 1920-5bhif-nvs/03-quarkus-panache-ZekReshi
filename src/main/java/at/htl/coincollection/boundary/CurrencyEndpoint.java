package at.htl.coincollection.boundary;

import at.htl.coincollection.control.CurrencyRepsitory;
import at.htl.coincollection.entity.Currency;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("currencies")
public class CurrencyEndpoint {

    @Inject
    CurrencyRepsitory currencyRepsitory;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        List<Currency> currencies = currencyRepsitory.getAll();
        return Response
                .ok()
                .entity(currencies)
                .build();
    }

}
