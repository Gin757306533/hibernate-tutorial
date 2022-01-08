package com.example.hibernatetutorial.chapter7.chapter7_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;

@RestController
@RequestMapping
public class ItemController {
    @Autowired
    private EntityManager entityManager;

    @GetMapping("/save-item")
    @Transactional
    public void saveItem() {
        var item1 = new Item();
        item1.setName("Foo");
        item1.getImages().add("foo.jpg");
        item1.getImages().add("bar.jpg");
        item1.getImages().add("baz.jpg");
        entityManager.persist(item1);

        var item2 = new Item();
        item2.setName("B");
        item2.getImages().add("b.jpg");
        entityManager.persist(item2);

        var item3 = new Item();
        item3.setName("C");
        entityManager.persist(item3);
    }
}
