package com.example.springbootjpa.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @Author 杨洲
 * @Date 2022/7/27 14:09
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "tb_role")
public class Role implements BaseEntity {

    /**
     * role id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    /**
     * role name.
     */
    private String name;

    /**
     * role key.
     */
    private String roleKey;

    /**
     * description.
     */
    private String description;

    /**
     * create date time.
     */
    private LocalDateTime createTime;

    /**
     * update date time.
     */
    private LocalDateTime updateTime;

}
