package com.demo.controller;

import com.demo.model.City;
import com.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
@RequestMapping(value = "/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(method = RequestMethod.GET, value = "/count")
    @ResponseBody
    public ResponseEntity<Long> countTotalCities() {
        long count = cityService.countTotalCities();

        return new ResponseEntity<Long>(count, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    @ResponseBody
    public ResponseEntity createCity(@RequestBody City city) {

        City persistedCity = cityService.createCity(city);

        return new ResponseEntity(HttpStatus.CREATED);
    }
}
