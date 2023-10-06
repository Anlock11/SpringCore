package com.guides.springboot.service.impl;

import com.guides.springboot.service.UserService;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import com.guides.springboot.repository.UserRepository;
import com.guides.springboot.entity.Users;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public Users createUser(Users users) {
        return userRepository.save(users);
    }



    @Override
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Users updateUsers(Users users) {
        Users existingUser = userRepository.findById(users.getId()).get();
        existingUser.setName(users.getName());
        existingUser.setEmail(users.getEmail());
        existingUser.setPhone(users.getPhone());


        Users updateUsers = userRepository.save(existingUser);
        return updateUsers;
        }



    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
