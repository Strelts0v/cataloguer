package com.gv.cataloguer.authenthication.dao;

import com.gv.cataloguer.models.User;
import java.sql.SQLException;

public interface UserDao {

    User getUser(String login, String password) throws SQLException, ClassNotFoundException;
}
