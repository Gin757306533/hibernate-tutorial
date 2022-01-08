package com.example.hibernatetutorial.chapter7.chapter7_1;


import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Item {

    public Set<String> getImages() {
        return images;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    protected String name;

    @ElementCollection  // 主要用于映射非实体（可嵌入或基本），
                        // 而@OneToMany仅用于映射实体
    @CollectionTable(
            name = "IMAGE",    // 指定表名
            joinColumns = @JoinColumn(name = "ITEM_ID")
    )
    @Column(name = "FILENAME")
    protected Set<String> images = new HashSet<>();
}
