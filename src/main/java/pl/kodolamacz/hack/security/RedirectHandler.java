package pl.kodolamacz.hack.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Collection;

@Component
public class RedirectHandler implements AuthenticationSuccessHandler {

        private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

        @Override
        public void onAuthenticationSuccess(HttpServletRequest request,
                                            HttpServletResponse response, Authentication authentication)
                throws IOException {

            handle(request, response, authentication);
            clearAuthenticationAttributes(request);
        }

        protected void handle(HttpServletRequest request,
                              HttpServletResponse response, Authentication authentication)
                throws IOException {

            String targetUrl = determineTargetUrl(authentication);

            if (response.isCommitted()) {
                return;
            }

            redirectStrategy.sendRedirect(request, response, targetUrl);
        }

        protected String determineTargetUrl(Authentication authentication) {
            boolean isEmployer = false;
            boolean isAdmin = false;
            boolean isCandidate = false;
            Collection<? extends GrantedAuthority> authorities
                    = authentication.getAuthorities();
            for (GrantedAuthority grantedAuthority : authorities) {
                if (grantedAuthority.getAuthority().equals("ROLE_EMPLOYER")) {
                    isEmployer = true;
                    break;
                } else if (grantedAuthority.getAuthority().equals("ROLE_CANDIDATE")) {
                    isCandidate = true;
                    break;
                }else if (grantedAuthority.getAuthority().equals("ROLE_ADMIN")) {
                    isAdmin = true;
                    break;
                }
            }

            if (isEmployer) {
                return "/employer";
            } else if(isCandidate){
                return "/candidate";
            } else if (isAdmin) {
                return "/admin";
            } else {
                throw new IllegalStateException();
            }
        }

        private void clearAuthenticationAttributes(HttpServletRequest request) {
            HttpSession session = request.getSession(false);
            if (session == null) {
                return;
            }
            session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
        }



}
