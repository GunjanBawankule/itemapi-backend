
package com.example.itemapi.service;

import com.example.itemapi.model.Item;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private List<Item> items = new ArrayList<>();
    private Long nextId = 1L;

    // Add new item
    public Item addItem(Item item) {
        item.setId(nextId++);
        items.add(item);
        return item;
    }

    // Get item by ID
    public Item getItemById(Long id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
    // Get all items
    public List<Item> getAllItems() {
        return items;
    }

}
