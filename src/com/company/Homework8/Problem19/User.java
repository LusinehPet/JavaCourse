package com.company.Homework8.Problem19;

public class User {

    private String username;
    private String password;
    private Role role;

    public User(String username, String password, Role role) {
        this.username = username;
        this.role = role;
        if (isPasswordValid(password)) {
            this.password = password;
        }
    }

    private boolean isPasswordValid(String password) {
        return containsUppercaseCharacter(password)
                && containsAtLeastThreeNumbers(password)
                && containsSpecialCharacter(password);
    }

    private boolean containsUppercaseCharacter(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean containsAtLeastThreeNumbers(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                count++;
            }
        }
        return count >= 3;
    }

    private boolean containsSpecialCharacter(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (isSpecialCharacter(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean isSpecialCharacter(char symbol) {
        return symbol == '%' || symbol == '#' || symbol == '!';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
