package models;

import java.util.Date;

public class Event {

    private Integer id;
    private String user;
    private String name;
    private String address;
    private Date date;
    private String description;
    private EventType category;

    public Event() {
    }

    public Event(Integer id, String user, String name, String address, Date date, String description, EventType category) {
        this.id = id;
        this.user = user;
        this.name = name;
        this.address = address;
        this.date = date;
        this.description = description;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventType getCategory() {
        return category;
    }

    public void setCategory(EventType category) {
        this.category = category;
    }
}
