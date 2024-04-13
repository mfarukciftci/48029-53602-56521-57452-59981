package Reminder.reminder.business.abstracts;

import Reminder.reminder.entites.concretes.Category;

import java.util.List;

public interface ICategoryService {
    Category saveCategory(Category category);
    void deleteCategory(Long categoryId);
    List<Category> findAllCategories();
    Category findCategoryById(Long id);
}