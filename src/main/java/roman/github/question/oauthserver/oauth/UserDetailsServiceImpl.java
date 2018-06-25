package roman.github.question.oauthserver.oauth;

import org.springframework.context.annotation.Primary;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import roman.github.question.oauthserver.oauth.user.Authority;
import roman.github.question.oauthserver.oauth.user.CustomUser;

import java.util.Arrays;

@Service
@Primary
public class UserDetailsServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        GrantedAuthority authority = new Authority("USER");
        return new CustomUser(5L, "username", "{noop}password", Arrays.asList(authority));
    }


}
