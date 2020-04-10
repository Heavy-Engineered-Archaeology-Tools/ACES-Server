package org.heat.aces.restservice;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePath {
    private static final String template = "ACES REST API";

    @GetMapping(value="/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getInfo() {
        return template;
    }
}
