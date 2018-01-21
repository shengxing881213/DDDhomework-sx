package User.repository;

import User.domain.User;
import repository.UserRepository;

import java.io.*;
import java.util.ArrayList;

public class UserRepositoryImp implements UserRepository {
    private ArrayList<User> users = new ArrayList<User>();
    @Override
    public void SaveUser(User user) {
            users.add(user);
    }

    @Override
    public User QueryUser(int UserId) {
        return users.stream().filter(o->o.getUserId()==UserId).findAny().orElse(null);
    }
}
