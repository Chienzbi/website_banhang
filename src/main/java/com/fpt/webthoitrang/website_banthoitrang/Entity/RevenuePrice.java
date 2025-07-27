package com.fpt.webthoitrang.website_banthoitrang.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RevenuePrice {
    @Id
    Double sum;
}