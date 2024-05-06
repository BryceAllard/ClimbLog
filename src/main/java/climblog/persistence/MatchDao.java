package climblog.persistence;

import climblog.com.climr.Match;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.*;

public class MatchDao {

    // Method to retrieve all matches
    public List<Match> getMatches() {
        // Call the getMatches method with a default value
        return getMatches(-1);
    }

    // Method to retrieve a specified number of matches
    public List<Match> getMatches(int numberOfMatches) {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://my.api.mockaroo.com/climbr.json?key=d8027830&id=1");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        List<Match> matches = null;
        try {
            Match[] matchesArray = mapper.readValue(response, Match[].class);
            if (matchesArray.length > 0) {
                // Convert array to list
                matches = Arrays.asList(matchesArray);
                // Return a certain number of matches
                if (numberOfMatches > 0 && numberOfMatches < matches.size()) {
                    matches = matches.subList(0, numberOfMatches);
                }
            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return matches;
    }
}
