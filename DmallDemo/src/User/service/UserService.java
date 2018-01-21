package User.service;

import Order.domain.Address;
import User.domain.Gender;
import User.domain.User;
import User.repository.UserRepositoryImp;

public class UserService {
    private UserRepositoryImp userRepositoryImp = new UserRepositoryImp();
    public User createUser() {
        Address address = new Address("China","Shanghai","Shanghai","Pudong","Zhangdong","1158");
        User user = new User(1000,"sx",3771, Gender.Male,address);
        return user;
    }

    public void modifyUserAddressInfo(int userId,Address address){
        User user = userRepositoryImp.QueryUser(userId);
        user.setUserAddress(address);
        userRepositoryImp.SaveUser(user);
    }
}
