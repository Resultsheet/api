package com.resultsheet.api.ResultSheetapi.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUser(){
        return userRepository.findAll();
    }


    public void saveUser(User user) {
        Optional<User> userEmail = userRepository.findUserByEmail(user.getEmail());
        if(userEmail.isPresent()){
            throw new IllegalStateException("email already taken.");
        }

        userRepository.save(user);
    }

    public void deleteUser(long id) {
        boolean exists = userRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("user with" + id + "does not exists");
        }
        userRepository.deleteById(id);
    }

    @Transactional
    public void updateUser(Long id, String firstName, String lastName, String email) {
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalStateException("user does not exists."));

        if(firstName != null && firstName.length() > 0 && !Objects.equals(user.getFirstName(), firstName)) {
            user.setFirstName(firstName);
        }

        if(lastName != null && lastName.length() > 0 && !Objects.equals(user.getLastName(), lastName)) {
            user.setLastName(lastName);
        }

        if(email != null && email.length() > 0 && !Objects.equals(user.getEmail(), email)) {
            Optional<User> userEmail = userRepository.findUserByEmail(user.getEmail());
            if(userEmail.isPresent()){
                throw new IllegalStateException("email already taken.");
            }
            user.setLastName(email);
        }
    }

    public User getUserById(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new IllegalStateException("user does not exists."));
        return user;
    }
}
