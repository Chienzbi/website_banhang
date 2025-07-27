package com.fpt.webthoitrang.website_banthoitrang.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "Accounts")

public class Account implements Serializable {
    @Id
    @UuidGenerator
    @Column(name = "Id", nullable = false)
    private UUID id;

    @NotBlank(message = "Tài khoản không được để trống")
    @Column(name = "username")
    String username;

    @NotBlank(message = "Mật khẩu khộng được để trống")
    @Column(name = "password")
    private String passWord;

    @Column(name = "fullname")
    private String fullName;

    @NotEmpty(message = "Email không được để trống")
    @Email(message = "Email đúng định dạng")
    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private Integer phone;

    @Column(name = "photo")
    private String photo;

    @Column(name = "activated")
    private boolean activated;

    @Column(name = "admin")
    private boolean admin;

    @OneToMany(mappedBy = "account")
    List<Order> orders;
}