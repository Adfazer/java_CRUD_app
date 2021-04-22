package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "aalbum2")
public class Album {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ1")
    @SequenceGenerator(name="SEQ1", sequenceName="SEQ1", allocationSize=1)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "music_group")
    private String musicGroup;
    @Column(name = "date_begin")
    private String dateBegin;
}
