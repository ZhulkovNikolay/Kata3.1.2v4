//package ru.kata.spring.boot_security.demo.rest;
//
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.*;
//import ru.kata.spring.boot_security.demo.model.User;
//
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//@RestController
//@RequestMapping("/api/users")
//public class UserRestController {
//
//    private final List<User> USERS = Stream.of(
//            new User(1L, "Ivan", "Ivanov"),
//            new User(2L, "Sergey", "Sergeev"),
//            new User(3L, "Petr", "Petrov")
//    ).collect(Collectors.toList());
//
//    @GetMapping
//    public List<User> getAll() {
//        return USERS;
//    }
//
//    @GetMapping("/{id}")
//    @PreAuthorize("hasAuthority('users:read')")
//    public User getById(@PathVariable Long id) {
//        return USERS.stream().filter(user -> user.getId().equals(id))
//                .findFirst().orElse(null);
//    }
//
//    @PostMapping
//    @PreAuthorize("hasAuthority('users:write')")
//    public User create(@RequestBody User user) {
//        this.USERS.add(user);
//        return user;
//    }
//
//    @DeleteMapping
//    @PreAuthorize("hasAuthority('users:write')")
//    public void deleteById(@PathVariable Long id) {
//        this.USERS.removeIf(user -> user.getId().equals(id));
//    }
//
//}
//
