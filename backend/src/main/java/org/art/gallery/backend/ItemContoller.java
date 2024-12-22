package org.art.gallery.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemContoller {

    @GetMapping("/api/items")
    public List<String> getItems(){
        System.out.println("get api");
        List<String> items = new ArrayList<>();
        items.add("a");
        items.add("b");
        items.add("c");

        return items;
    }
}
