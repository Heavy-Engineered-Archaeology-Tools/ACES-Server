package org.heat.aces.restservice.discovery;

import org.apache.tomcat.util.json.JSONParser;
import org.heat.aces.model.Discovery;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscoveryPath {

    @GetMapping(value="/discovery/{id}")
    public Discovery getSingleDiscovery(@PathVariable(value = "id") String id) {
        return new Discovery(Long.parseLong(id), "C33", 5, "Holz", "Das ding aus Holz");
    }
}
