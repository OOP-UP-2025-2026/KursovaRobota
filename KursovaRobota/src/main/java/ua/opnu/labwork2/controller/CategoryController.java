package ua.opnu.labwork2.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.opnu.labwork2.entity.Category;
import ua.opnu.labwork2.dto.CategoryCreateRequest;
import ua.opnu.labwork2.service.CategoryService;
import ua.opnu.labwork2.entity.Event;

import java.time.LocalDate;

@RestController
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/categories")
    public ResponseEntity<Category> createCategory(@Valid @RequestBody CategoryCreateRequest request) {

        Category category = new Category(1L, "name", "description");

        return ResponseEntity.status(HttpStatus.CREATED).body(category);
    }

    @GetMapping("/categories")
    public ResponseEntity<Category> getCategories() {

        Category category = new Category(2L, "name", "description");

        return ResponseEntity.ok(category);
    }

    @GetMapping("/categories/{id}")
    public ResponseEntity<Category> getCategoryById(
            @PathVariable Long id) {

        Category category = new Category(3L, "name", "description");

        return ResponseEntity.ok(category);
    }

    @DeleteMapping("/categories/{id}")
    public ResponseEntity<Category> deleteCategoryById(
            @PathVariable Long id) {

        Category category = new Category(4L, "name", "description");

        return ResponseEntity.ok(category);
    }

    @PostMapping("/events/{eventId}/categories/{categoryId}")
    public ResponseEntity<Event> createCategoryWithIdByEventId(
            @PathVariable Long eventId,
            @PathVariable Long categoryId) {

        Event event = new Event(5L, "title", "description", LocalDate.now(), "location");

        return ResponseEntity.ok(event);
    }

    @DeleteMapping("/events/{eventId}/categories/{categoryId}")
    public ResponseEntity<Event> deleteCategoryWithIdByEventId(
            @PathVariable Long eventId,
            @PathVariable Long categoryId) {

        Event event = new Event(6L, "title", "description", LocalDate.now(), "location");

        return ResponseEntity.ok(event);
    }
}
