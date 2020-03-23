package at.htl.coincollection.boundary;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class CollectorEndpointTest {

    @Test
    public void testCollectorEndpointGetAll() {
        given()
          .when().get("/api/collectors")
          .then()
             .statusCode(200);
    }

}