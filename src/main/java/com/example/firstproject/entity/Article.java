package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Article {
    @Id // 대표값을 지정 (주민등록번호처럼)
    @GeneratedValue //자동 생성 어노테이션 1,2,3 ...
    private Long id;

    @Column
    private String title;
    @Column
    private String content;

}
