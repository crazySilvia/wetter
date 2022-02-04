package de.silvia.wetter.model;

import lombok.Data;

@Data
public class WeatherData {
    private int id;
    private int stationId;
    private int temperature;
    private int humidity;
    private Double latitude;
    private Double longitude;
}
