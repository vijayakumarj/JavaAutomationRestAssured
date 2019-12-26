package automation.restassured.domain.models;

public class WeatherSample {
    private String Temperature;

    private String WindDirectionDegree;

    private String Humidity;

    private String WeatherDescription;

    private String WindSpeed;

    private String City;

    public String getTemperature() {
        return Temperature;
    }

    public void setTemperature(String Temperature) {
        this.Temperature = Temperature;
    }

    public String getWindDirectionDegree() {
        return WindDirectionDegree;
    }

    public void setWindDirectionDegree(String WindDirectionDegree) {
        this.WindDirectionDegree = WindDirectionDegree;
    }

    public String getHumidity() {
        return Humidity;
    }

    public void setHumidity(String Humidity) {
        this.Humidity = Humidity;
    }

    public String getWeatherDescription() {
        return WeatherDescription;
    }

    public void setWeatherDescription(String WeatherDescription) {
        this.WeatherDescription = WeatherDescription;
    }

    public String getWindSpeed() {
        return WindSpeed;
    }

    public void setWindSpeed(String WindSpeed) {
        this.WindSpeed = WindSpeed;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    @Override
    public String toString() {
        return "{"+"Temperature = " + Temperature + ", WindDirectionDegree = " + WindDirectionDegree + ", Humidity = " + Humidity + ", WeatherDescription = " + WeatherDescription + ", WindSpeed = " + WindSpeed + ", City = " + City + "}";
    }
}
