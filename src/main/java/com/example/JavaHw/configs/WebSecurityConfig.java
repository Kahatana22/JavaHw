package com.example.JavaHw.configs;

//@Configuration
//@EnableWebSecurity
public class WebSecurityConfig {

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests((authorise) -> authorise
//                        .requestMatchers("/login").permitAll()
//                        .anyRequest().authenticated()
//                )
//                        .formLogin((form) -> form
//                        .loginPage("/login")
//                        .permitAll()
//                 )
//                        .logout((logout) -> logout.permitAll());
//
//        return http.build();
//    }
//@Bean
//public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//    http
//            .csrf(AbstractHttpConfigurer::disable)
//            .formLogin(login -> {
//                login.loginPage("/login");
//                login.defaultSuccessUrl("/note/list");
//            })
//            .logout(logout -> {
//                logout.logoutSuccessUrl("/login");
//                logout.deleteCookies();
//            }).authorizeHttpRequests(authorise -> {
//                authorise.requestMatchers("/login").permitAll();
//                authorise.anyRequest().authenticated();
//            });
//    return http.build();
//}


















}