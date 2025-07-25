package com.blogcraft.tagging.service;

import com.blogcraft.tagging.model.TagCategory;
import com.blogcraft.tagging.repository.TagCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaggingService {

    @Autowired
    private TagCategoryRepository tagCategoryRepository;

    public List<TagCategory> getTagsByContentId(String contentId) {
        return tagCategoryRepository.findByContentId(contentId);
    }

    public TagCategory createTag(TagCategory tagCategory) {
        return tagCategoryRepository.save(tagCategory);
    }
    public List<TagCategory> getAllTags() {
        return tagCategoryRepository.findAll();
}
}