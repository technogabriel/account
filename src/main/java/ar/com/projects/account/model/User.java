package ar.com.projects.account.model;

import org.springframework.stereotype.Component;

@Component
public class User {

    private String userName;
    private String document;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", document='" + document + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
