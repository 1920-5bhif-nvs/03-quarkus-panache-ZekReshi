package at.htl.coincollection.boundary;

import at.htl.coincollection.control.CoinRepository;
import at.htl.coincollection.entity.Coin;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("coins")
public class CoinEndpoint {

    @Inject
    CoinRepository coinRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        List<Coin> coins = coinRepository.getAll();
        return Response
                .ok()
                .entity(coins)
                .build();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@PathParam("id") long id) {
        Coin coin = coinRepository.getById(id);
        if (coin == null) {
            return Response
                    .status(404)
                    .build();
        }
        return Response
                .ok()
                .entity(coin)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response save(Coin coin) {
        coinRepository.save(coin);
        return Response
                .noContent()
                .build();
    }

}
