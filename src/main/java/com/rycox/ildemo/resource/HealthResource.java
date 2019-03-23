package com.rycox.ildemo.resource;

import com.rycox.ildemo.domain.HealthResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthResource {

    @RequestMapping(value="/health", method= RequestMethod.GET)
    public HealthResponse getHealth(@RequestParam(value="status", defaultValue="OK") String name) {
        return new HealthResponse(name);
    }
}
