package roman.github.question.oauthserver.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/user")
public class UserRestController {

    @GetMapping("/auth")
    public Principal getPrincipal(Principal principal) {
        return principal;
    }
}
