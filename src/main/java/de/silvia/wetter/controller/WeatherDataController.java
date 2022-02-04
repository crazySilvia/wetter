package de.silvia.wetter.controller;

import de.silvia.wetter.model.WeatherData;
import de.silvia.wetter.repository.WeatherDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherDataController {

    private WeatherDataRepository dataRepository;

    WeatherDataController(@Autowired WeatherDataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/weather")
    public java.util.Collection<WeatherData> retrieveWeatherData(){
        return this.dataRepository.findAll();
    }
    @RequestMapping(method = RequestMethod.POST, path = "/weather")
    public void createWeatherData(@RequestBody WeatherData weatherData){
        this.dataRepository.create(weatherData);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/weather/{id}")
    public WeatherData retrieveWeatherData(@PathVariable int id){
        return dataRepository.findById(id);
    }
}
