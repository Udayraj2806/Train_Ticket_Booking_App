package trainticketbooking.dto;
import lombok.Data;
import trainticketbooking.model.Role;

import java.util.ArrayList;
import java.util.List;

@Data
public class RegisterDto {
    private String username;
    private String email;

    private String password;
    private Role role;

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "RegisterDto{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }



}
