package net.javaguides.springboot.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Userdetail {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Id
    @Column(name = "password")
    private String password;

    public Userdetail() {

    }

    public Userdetail(String username, String email, String password) {


        super();
        this.username = username;
        this.email = email;
        this.password = password;

    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
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


}
