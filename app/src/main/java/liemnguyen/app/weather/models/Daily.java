package liemnguyen.app.weather.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Daily {

    @SerializedName("dt")
    @Expose
    private int dt;
    @SerializedName("sunrise")
    @Expose
    private float sunrise;
    @SerializedName("sunset")
    @Expose
    private float sunset;
    @SerializedName("moonrise")
    @Expose
    private float moonrise;
    @SerializedName("moonset")
    @Expose
    private float moonset;
    @SerializedName("moon_phase")
    @Expose
    private float moonPhase;
    @SerializedName("temp")
    @Expose
    private Temp temp;
    @SerializedName("feels_like")
    @Expose
    private FeelsLike feelsLike;
    @SerializedName("pressure")
    @Expose
    private float pressure;
    @SerializedName("humidity")
    @Expose
    private float humidity;
    @SerializedName("dew_point")
    @Expose
    private float dewPoint;
    @SerializedName("wind_speed")
    @Expose
    private float windSpeed;
    @SerializedName("wind_deg")
    @Expose
    private float windDeg;
    @SerializedName("wind_gust")
    @Expose
    private float windGust;
    @SerializedName("weather")
    @Expose
    private List<Weather> weather = null;
    @SerializedName("clouds")
    @Expose
    private float clouds;
    @SerializedName("pop")
    @Expose
    private float pop;
    @SerializedName("rain")
    @Expose
    private float rain;
    @SerializedName("uvi")
    @Expose
    private float uvi;

    /**
     * No args constructor for use in serialization
     */
    public Daily() {
    }

    /**
     * @param moonset
     * @param rain
     * @param sunrise
     * @param temp
     * @param windGust
     * @param uvi
     * @param moonrise
     * @param pressure
     * @param clouds
     * @param dewPoint
     * @param dt
     * @param feelsLike
     * @param windDeg
     * @param pop
     * @param sunset
     * @param weather
     * @param humidity
     * @param moonPhase
     * @param windSpeed
     */
    public Daily(int dt, float sunrise, float sunset, float moonrise, float moonset, float moonPhase, Temp temp, FeelsLike feelsLike, float pressure, float humidity, float dewPoint, float windSpeed, float windDeg, float windGust, List<Weather> weather, float clouds, float pop, float rain, float uvi) {
        super();
        this.dt = dt;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.moonrise = moonrise;
        this.moonset = moonset;
        this.moonPhase = moonPhase;
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.pressure = pressure;
        this.humidity = humidity;
        this.dewPoint = dewPoint;
        this.windSpeed = windSpeed;
        this.windDeg = windDeg;
        this.windGust = windGust;
        this.weather = weather;
        this.clouds = clouds;
        this.pop = pop;
        this.rain = rain;
        this.uvi = uvi;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public float getSunrise() {
        return sunrise;
    }

    public void setSunrise(float sunrise) {
        this.sunrise = sunrise;
    }

    public float getSunset() {
        return sunset;
    }

    public void setSunset(float sunset) {
        this.sunset = sunset;
    }

    public float getMoonrise() {
        return moonrise;
    }

    public void setMoonrise(float moonrise) {
        this.moonrise = moonrise;
    }

    public float getMoonset() {
        return moonset;
    }

    public void setMoonset(float moonset) {
        this.moonset = moonset;
    }

    public float getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(float moonPhase) {
        this.moonPhase = moonPhase;
    }

    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public FeelsLike getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(FeelsLike feelsLike) {
        this.feelsLike = feelsLike;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(float dewPoint) {
        this.dewPoint = dewPoint;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public float getWindDeg() {
        return windDeg;
    }

    public void setWindDeg(float windDeg) {
        this.windDeg = windDeg;
    }

    public float getWindGust() {
        return windGust;
    }

    public void setWindGust(float windGust) {
        this.windGust = windGust;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public float getClouds() {
        return clouds;
    }

    public void setClouds(float clouds) {
        this.clouds = clouds;
    }

    public float getPop() {
        return pop;
    }

    public void setPop(float pop) {
        this.pop = pop;
    }

    public float getRain() {
        return rain;
    }

    public void setRain(float rain) {
        this.rain = rain;
    }

    public float getUvi() {
        return uvi;
    }

    public void setUvi(float uvi) {
        this.uvi = uvi;
    }

}
