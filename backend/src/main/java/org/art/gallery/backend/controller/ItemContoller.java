package org.art.gallery.backend.controller;

import org.art.gallery.backend.entity.Item;
import org.art.gallery.backend.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemContoller {

    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/api/items")
    public List<Item> getItems(){

        List<Item> items = itemRepository.findAll();

        return items;
    }
}
