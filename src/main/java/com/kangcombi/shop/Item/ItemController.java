package com.kangcombi.shop.Item;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;
    private final ItemService itemService;

    @GetMapping("/list")
    String listpage(Model model) {
        List<Item> result = itemRepository.findAll();
        model.addAttribute("items", result);
        return "list.html";
    }

    @GetMapping("/write")
    String writepage(Model model) {
        return "write.html";
    }

    @GetMapping("/edit/{id}")
    String editpage(@PathVariable Long id, Model model) {
        Optional<Item> result = itemRepository.findById(id);
        if (result.isPresent()) {
            model.addAttribute("item", result.get());
            return "edit.html";
        } else {
            return "redirect:/list";
        }

    }

    @PostMapping("/add")
    String addPost(@RequestParam String title, Integer price) {
        itemService.saveItem(title, price);
        return "redirect:/list";
    }

    @PostMapping("/edit/{id}")
    String editPost(@PathVariable Long id, @RequestParam String title, Integer price) {
        itemService.editItem(id, title, price);
        return "redirect:/list";
    }

    @DeleteMapping("/item")
    ResponseEntity<String> deleteItem(@RequestParam Long id) {
        itemRepository.deleteById(id);
        return ResponseEntity.status(200).body("Delete Success.");
    }

    @GetMapping("/detail/{id}")
    String detailpage(@PathVariable Long id, Model model){
        Optional<Item> result = itemRepository.findById(id);
        if (result.isPresent()) {
            model.addAttribute("item", result.get());
            return "detail.html";
        } else {
            return "redirect:/list";
        }
    }


}
