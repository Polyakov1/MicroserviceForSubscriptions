package Alexey.Polyakov.example.service;



import Alexey.Polyakov.example.dto.UserDTO;
import Alexey.Polyakov.example.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    User createUser(UserDTO userDTO);
    User getUserById(Long id);
    User updateUser(Long id, UserDTO userDTO);
    void deleteUser(Long id);
    List<User> getAllUsers();
}