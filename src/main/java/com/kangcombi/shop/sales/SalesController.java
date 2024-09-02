package com.kangcombi.shop.sales;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class SalesController {

    private final SalesRepository salesRepository;

    @PostMapping("/order")
    String postOrder(@RequestParam String title, Integer price, Integer count, Authentication auth) {
        Sales sales = new Sales();
        sales.count = count;
        sales.price = price;
        sales.itemName = title;
        //sales.memberId = 3L; // ID가 다 다르게 수정 필요
        salesRepository.save(sales);

        return "redirect:/list/page/1";
    }

    @GetMapping("/order/all")
    String getOrderAll() {
        List<Sales> result = salesRepository.findAll();
        System.out.println(result.get(0));
        return "list.html";
    }
}
