package com.fpt.webthoitrang.website_banthoitrang.Repository;

import com.fpt.webthoitrang.website_banthoitrang.Entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
    Category findById(long id);
    Page<Category> findByNameLike(String keywords, Pageable pageable);
    Category deleteById(long id);

}