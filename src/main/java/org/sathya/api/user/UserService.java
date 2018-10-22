package org.sathya.api.user;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<User> findById(String id);
    Flux<User> findAll();
    Mono<User> save(User user);
    Mono<Void> deleteById(String id);
}
