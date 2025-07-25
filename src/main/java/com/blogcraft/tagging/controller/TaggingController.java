package com.blogcraft.tagging.controller;

import com.blogcraft.tagging.model.TagCategory;
import com.blogcraft.tagging.repository.TagCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tags")
@CrossOrigin(origins = "*") // Required for frontend requests from index.html
public class TaggingController {

    @Autowired
    private TagCategoryRepository tagCategoryRepository;

    @PostMapping
    public TagCategory saveTag(@RequestBody TagCategory tagCategory) {
        return tagCategoryRepository.save(tagCategory);
    }

    @GetMapping
    public List<TagCategory> getAllTags() {
        return tagCategoryRepository.findAll();
    }
}
