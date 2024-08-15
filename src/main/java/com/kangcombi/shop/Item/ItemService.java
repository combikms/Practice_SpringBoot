package com.kangcombi.shop.Item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public void saveItem(String title, Integer price) {
        Item item = new Item();
        item.title = title;
        item.price = price;
        itemRepository.save(item);
    }

    public void editItem(Long id, String title, Integer price) {
        Item item = new Item();
        item.id = id;
        item.title = title;
        item.price = price;
        itemRepository.save(item);
    }


}