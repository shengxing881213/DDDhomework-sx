package Order.domain;

import java.io.Serializable;

public class Address implements Serializable {
    private final String Country;
    private final String Province;
    private final String City;
    private final String District;
    private final String Road;
    private final String Building;

    public Address(String country, String province, String city, String district, String road, String building) {
        this.Country = country;
        this.Province = province;
        this.City = city;
        this.District = district;
        this.Road = road;
        this.Building = building;
    }

    public String getCountry() {
        return Country;
    }

    public String getProvince() {
        return Province;
    }

    public String getCity() {
        return City;
    }

    public String getDistrict() {
        return District;
    }

    public String getRoad() {
        return Road;
    }

    public String getBuilding() {
        return Building;
    }
}
