package xyz.icexmoon.protect_proxy;

public class PersonBeanImpl implements PersonBean {
    private String name;
    private String gender;
    private int rating = 0;
    private int ratingCount = 0;

    @Override
    public int getRating() {
        if (ratingCount == 0) {
            return 0;
        }
        return rating / ratingCount;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getGender() {
        return this.gender;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setRating(int rating) {
        this.rating += rating;
        this.ratingCount++;
    }

}
