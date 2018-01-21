package repository;

import User.domain.User;

public interface UserRepository {
    void SaveUser(User user);
    User QueryUser(int UserId);
}
