package com.crujava.crud;

import java.util.List;

public interface UserService {
    List<User>listar();
    User listarId(int id);
    User add(User user);
    User edit(User user);
    User delete(int id);
}
