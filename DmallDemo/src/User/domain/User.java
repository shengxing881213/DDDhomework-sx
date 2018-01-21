package User.domain;

import Order.domain.Address;

import java.io.Serializable;

public class User implements Serializable {
    private final int UserId;
    private String UserName;
    private int UserTel;
    private Gender gender;
    private Address UserAddress;

    public User(int userId, String userName, int userTel, Gender gender, Address userAddress) {
        UserId = userId;
        UserName = userName;
        UserAddress = userAddress;
        UserTel = userTel;
        this.gender = gender;
    }

    public int getUserId() {
        return UserId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public Address getUserAddress() {
        return UserAddress;
    }

    public void setUserAddress(Address userAddress) {
        UserAddress = userAddress;
    }

    public int getUserTel() {
        return UserTel;
    }

    public void setUserTel(int userTel) {
        UserTel = userTel;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

}
