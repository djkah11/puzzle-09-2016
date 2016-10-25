package ru.mail.park.model;

import java.util.List;

public interface UserDao extends Dao<UserProfile> {
    UserProfile getByLogin(String login);
    List<UserProfile> getTopRanked(int limit);
}
