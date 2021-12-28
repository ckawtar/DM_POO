package fr.ensim.tp5.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {
    private float tmin;
    private float tmax;
    private float weather;


    public float getTmin() {
        return tmin;
    }

    public void setTmin(float tmin) {
        this.tmin = tmin;
    }

    public float getTmax() {
        return tmax;
    }

    public void setTmax(float tmax) {
        this.tmax = tmax;
    }

    public float getWeather() {
        return weather;
    }

    public void setWeather(float weather) {
        this.weather = weather;
    }
}
