//package trainticketbooking.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//import org.springframework.security.web.util.matcher.RegexRequestMatcher;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    private JwtAuthEntryPoint authEntryPoint;
//    private CustomUserDetailsService userDetailsService;
//    @Autowired
//    public CustomUserDetailsService getUserDetailsService() {
//        return userDetailsService;
//    }
//
//    public void SecurityConfig(CustomUserDetailsService userDetailsService, JwtAuthEntryPoint authEntryPoint) {
//        this.userDetailsService = userDetailsService;
//        this.authEntryPoint = authEntryPoint;
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        return http
//                .csrf(csrf -> csrf.disable()) // Disable CSRF for simplicity. Enable it in a real-world application
//                .authorizeRequests(authorize -> authorize
//                        .requestMatchers(
//                                new AntPathRequestMatcher("/auth/register"),
//                                new AntPathRequestMatcher("/auth/login"),
//                                new RegexRequestMatcher("/api/admin/.*", null),
//                                new RegexRequestMatcher("/api/user/.*", null)
//                        )
//                        .permitAll() // Allow access to specified endpoints
//                        .anyRequest().authenticated() // All other requests require authentication
//                )
//                .httpBasic(Customizer.withDefaults()) // Enable HTTP Basic authentication
//                .addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class) // Add JWT authentication filter
//                .build();
//    }
//
//
//    @Bean
//    public AuthenticationManager authenticationManager(
//            AuthenticationConfiguration authenticationConfiguration) throws Exception{
//        return authenticationConfiguration.getAuthenticationManager();
//    }
//
//    @Bean
//    PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public JWTAuthenticationFilter jwtAuthenticationFilter(){
//        System.out.println("Landed on JWT");
//        return new JWTAuthenticationFilter();
//    }
//}
