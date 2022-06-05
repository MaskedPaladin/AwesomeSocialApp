package com.example.awesomesocialapp;

import com.google.firebase.auth.FirebaseUser;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Post implements Serializable {
    public String uid;
    public String author;
    public String authorPhotoUrl;
    public String content;
    public Map<String, Object> likes = new HashMap<>();

    // Constructor vacio requerido por Firestore
    public Post() {}

    public Post(String uid, String author, String authorPhotoUrl, String content, Map<String, Object> likes) {
        this.uid = uid;
        this.author = author;
        this.authorPhotoUrl = authorPhotoUrl;
        this.content = content;
        this.likes = likes;
    }
}
