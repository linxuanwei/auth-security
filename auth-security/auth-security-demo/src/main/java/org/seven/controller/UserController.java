package org.seven.controller;

import org.seven.domain.User;
import org.seven.service.UserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Seven.Lin
 * @date 2019/12/30 22:47
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/user/{id:\\d+}")
    public User getInfo(@PathVariable("id") Long uid) {
        return userService.getOne(uid);
    }

    @GetMapping("/user/phone/{phone}")
    public User getOneByPhone(@PathVariable("phone") String phone) {
        return userService.getOneByPhone(phone);
    }

    @GetMapping("/user/nick/{nick}")
    public User getOneByNick(@PathVariable("nick") String nick) {
        return userService.getOneByNick(nick);
    }

    @GetMapping("/user")
    public List<User> queryAll() {
        return userService.findAll();
    }

    @PostMapping("/user")
    public Integer create(@RequestBody User user) {
        return userService.create(user);
    }

    @GetMapping("/currUser")
    public String getLoginUser() {
        String currentUser = "";
        Object principl = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principl instanceof UserDetails) {
            currentUser = ((UserDetails) principl).getUsername();
        } else {
            currentUser = principl.toString();
        }
        return currentUser;
    }
}
