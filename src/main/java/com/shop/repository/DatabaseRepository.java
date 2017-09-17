package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.Map;

/**
 * Created by Равиль on 17.09.2017.
 */
//можно отнаследоваться от постгрес репозитори
//там уже есть методы CRUD
//пока запилю на Collections
@Repository
public class DatabaseRepository {

    private Map<Long, Item> items;

    public DatabaseRepository() {
        items = Collections.EMPTY_MAP;
    }

    public DatabaseRepository(Map items) {
        this.items = items;
    }

    public void addItem(Item item) {
        items.put(item.getId(), item);
    }

    public Item getItem(long id) {
        return items.get(id);
    }

    public void deleteItem(long id) {
        items.remove(id);
    }
}
