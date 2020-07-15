package com.example.fbuapplication;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Memory")
public class Memory extends ParseObject {

    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";
    public static final String KEY_QUOTE = "quote";
    public static final String KEY_MEMORY_TITLE = "memoryTitle";
    public static final String KEY_CATEGORY = "category";
    public static final String KEY_CREATED_AT = "createdAt";

    public String getDescription(){
        return getString(KEY_DESCRIPTION);
    }

    public void setDescription(String description){
        put(KEY_DESCRIPTION, description);
    }

    public ParseFile getImage(){
        return getParseFile(KEY_IMAGE);
    }

    public void setImage(ParseFile parseFile){
        put(KEY_IMAGE, parseFile);
    }

    public ParseUser getUser(){
        return getParseUser(KEY_USER);
    }

    public void setUser(ParseUser user){
        put(KEY_USER, user);
    }

    public String getQuote(){
        return getString(KEY_QUOTE);
    }

    public void setQuote(String quote){
        put(KEY_QUOTE, quote);
    }

    public String getMemoryTitle(){
        return getString(KEY_MEMORY_TITLE);
    }

    public void setMemoryTitle(String memoryTitle){
        put(KEY_MEMORY_TITLE, memoryTitle);
    }

    public String getCategory(){
        return getString(KEY_CATEGORY);
    }

    public void setCategory(String category){
        put(KEY_CATEGORY, category);
    }
}