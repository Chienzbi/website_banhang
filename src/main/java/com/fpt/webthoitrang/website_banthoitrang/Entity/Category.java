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
@Table(name="Categories")
public class Category implements Serializable {
    @Id
    @UuidGenerator

    @Column(name = "Id", nullable = false)
    private UUID id;

    @NotBlank(message = "Danh mục không được để trống")
    @Column(name = "name")
    String name;

    @NotNull
    @Column(name = "status")
    private Boolean status;

    @OneToMany(mappedBy = "category")
    List<Product> products;
}