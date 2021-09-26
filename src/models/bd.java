package models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class User extends Model {
    public String email;
    public String password;
    public String fullname;
    public boolean isAdmin;

    public User(String email, String password, String fullname) {
        this.email = email;
        this.password = password;
        this.fullname = fullname;
    }

}
@Entity
public class Event extends Model {
        public String title;
        public String description;
        public boolean birthday;
        public boolean homework;
        public boolean medicalAppointment;
        public boolean others;

    public Event(String title, String description) {
        this.title = title;
        this.description = description;
    }

}
