package br.com.joaovitor.jsonparsing.pojo;

public class hotelPOJO {
    private String name;
    private String city;
    private String state;
    private String country;
    private String amenities;
    private Number rating;
    private Number reviews;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Number getRating() {
        return rating;
    }

    public void setRating(Number rating) {
        this.rating = rating;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public Number getReviews() {
        return reviews;
    }

    public void setReviews(Number reviews) {
        this.reviews = reviews;
    }
}
