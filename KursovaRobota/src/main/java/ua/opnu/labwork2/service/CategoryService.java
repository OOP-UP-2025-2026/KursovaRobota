package ua.opnu.labwork2.service;

import org.hibernate.sql.exec.ExecutionException;
import org.springframework.stereotype.Service;
import ua.opnu.labwork2.entity.Category;
import ua.opnu.labwork2.repository.CategoryRepository;
import ua.opnu.labwork2.entity.Event;
import ua.opnu.labwork2.repository.EventRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final EventRepository eventRepository;

    public CategoryService(CategoryRepository categoryRepository,
                           EventRepository eventRepository) {
        this.categoryRepository = categoryRepository;
        this.eventRepository = eventRepository;
    }

    public void createCategory(Category category) {
        categoryRepository.save(category);
    }

    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    public Optional<Category> getCategoriesById(Long id) {
        return categoryRepository.findById(id);
    }

    public void deleteCategoryById(Long id) {
        categoryRepository.deleteById(id);
    }

    public void createCategoryWithIdByEventId(Long eventId, Long categoryId) {
        Event event = eventRepository.findById(eventId)
                .orElseThrow(() -> new ExecutionException("Event not found with id: " + eventId));
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ExecutionException("Event not found with id: " + categoryId));
        event.addCategory(category);
    }

    public void deleteCategoryWithIdByEventId(Long eventId, Long categoryId) {
        Event event = eventRepository.findById(eventId)
                .orElseThrow(() -> new ExecutionException("Event not found with id: " + eventId));
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ExecutionException("Event not found with id: " + categoryId));
        event.removeCategory(category);
    }
}