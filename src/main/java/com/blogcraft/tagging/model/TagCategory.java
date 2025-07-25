package com.blogcraft.tagging.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tag_category")
public class TagCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contentId;
    private String tag;
    private String category;

    // Constructors
    public TagCategory() {}

    public TagCategory(String contentId, String tag, String category) {
        this.contentId = contentId;
        this.tag = tag;
        this.category = category;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public String getContentId() { return contentId; }
    public void setContentId(String contentId) { this.contentId = contentId; }

    public String getTag() { return tag; }
    public void setTag(String tag) { this.tag = tag; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}
