package climblog.persistence;

import climblog.com.climr.Match;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class MatchDao {

    Match getMatch() {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://my.api.mockaroo.com/climbr.json?key=d8027830&id=1");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        Match match = null;
        try {
            Match[] matches = mapper.readValue(response, Match[].class);
            if (matches.length > 0) {
                match = matches[0]; // Assuming you want the first match
            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return match;
    }

}
