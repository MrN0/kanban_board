package fr.orsys.kanban.business;

import java.util.Objects;

public class City {

    private Long id;
    private String name;
    private String postalCode;
    private String inseeCode;
    private String complement;
    private double latitude;
    private double longitude;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getInseeCode() {
        return inseeCode;
    }

    public void setInseeCode(String inseeCode) {
        this.inseeCode = inseeCode;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Double.compare(city.latitude, latitude) == 0 &&
                Double.compare(city.longitude, longitude) == 0 &&
                Objects.equals(id, city.id) &&
                Objects.equals(name, city.name) &&
                Objects.equals(postalCode, city.postalCode) &&
                Objects.equals(inseeCode, city.inseeCode) &&
                Objects.equals(complement, city.complement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, postalCode, inseeCode, complement, latitude, longitude);
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", inseeCode='" + inseeCode + '\'' +
                ", complement='" + complement + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

}
