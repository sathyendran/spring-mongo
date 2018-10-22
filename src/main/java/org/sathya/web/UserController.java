package org.sathya.web;

import org.sathya.api.user.User;
import org.sathya.api.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Mono<User> findById(@PathVariable("id") String id){
        return userService.findById(id);
    }

    @GetMapping
    public Flux<User> findAll(){
        return userService.findAll();
    }

    @PostMapping
    public Mono<User> save(@RequestBody User user){
        return userService.save(user);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteById(@PathVariable String id){
        return userService.deleteById(id);
    }
}
