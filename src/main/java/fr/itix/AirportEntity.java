package fr.itix;

public class AirportEntity {
    public String name;
    public String code;
    public double latitude;
    public double longitude;

    public AirportEntity() {
    }

    public AirportEntity(String name, String code, double latitude, double longitude) {
        this.name = name;
        this.code = code;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
