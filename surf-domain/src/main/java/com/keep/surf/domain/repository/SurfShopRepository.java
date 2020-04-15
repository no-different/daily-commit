package com.keep.surf.domain.repository;

import com.keep.surf.domain.entity.SurfShop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurfShopRepository extends JpaRepository<SurfShop, Long> {
    SurfShop findByShopName(String shopName);
}
