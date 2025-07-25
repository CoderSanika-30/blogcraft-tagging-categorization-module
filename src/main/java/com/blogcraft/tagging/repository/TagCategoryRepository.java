package com.blogcraft.tagging.repository;

import com.blogcraft.tagging.model.TagCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TagCategoryRepository extends JpaRepository<TagCategory, Long> {
    List<TagCategory> findByContentId(String contentId);
}
