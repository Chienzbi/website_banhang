package com.fpt.webthoitrang.website_banthoitrang.Repository;

import com.fpt.webthoitrang.website_banthoitrang.Entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail,Long> {
    List<OrderDetail> findAllByOrder_Id(long id);
}