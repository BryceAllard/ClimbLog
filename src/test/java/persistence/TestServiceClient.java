package persistence;

import climblog.com.climr.Match;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServiceClient {

    @Test
    public void testswapiJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://my.api.mockaroo.com/climbr.json?key=d8027830&id=1");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        //assertEquals("???", response);
        ObjectMapper mapper = new ObjectMapper();
        Match[] matches = mapper.readValue(response, Match[].class);
        Match match = matches[0];
        assertEquals(1, match.getId());
    }
}