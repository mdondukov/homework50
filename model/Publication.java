package com.example.homework50.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@Document
public class Publication {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    private static final Random r = new Random();

    private static String generateId() {
        return LocalDateTime.now().format(dtf) + r.nextInt();
    }

    @Id
    private String id = generateId();
    private String title;
    private String imageUri;
    private String description;
    private LocalDate pubDate;

    @DBRef
    private User user;

    public Publication() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getPubDate() {
        return pubDate;
    }

    public void setPubDate(LocalDate pubDate) {
        this.pubDate = pubDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
