package org.example.article.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Article {

    private long id;

    private String title;

    private String content;

    private String userId;


    public Article(long id, String title, String content) {

        this.id = id;

        this.title = title;

        this.content = content;

    }




    public long getId() {

        return this.id;

    }




    public String getTitle() {

        return this.title;

    }




    public String getContent() {

        return this.content;

    }




    public void setId(long id) {

        this.id = id;

    }




    public void setTitle(String title) {

        this.title = title;

    }




    public void setContent (String content) {

        this.content = content;

    }

}