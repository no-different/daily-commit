package com.keep.surf.domain.service;

import com.keep.surf.domain.entity.SurfShop;
import com.keep.surf.domain.entity.SurfShopCreate;
import com.keep.surf.domain.repository.SurfShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class SurfShopService {

    private final SurfShopRepository surfShopRepository;

    public Long create(SurfShopCreate surfShopCreate) {

        SurfShop surfShop = SurfShop.builder()
                .shopName(surfShopCreate.getShopName())
                .location(surfShopCreate.getLocation())
                .telNo(surfShopCreate.getTelNo())
                .address(surfShopCreate.getAddress())
                .build();

        SurfShop savedShop = surfShopRepository.save(surfShop);
        return savedShop.getId();
    }

    @Transactional(readOnly = true)
    public SurfShop findByShopName(String shopName) {
        SurfShop surfShop = surfShopRepository.findByShopName(shopName);
        if (surfShop == null) {
            throw new IllegalStateException("존재하지 않는 shop입니다.");
        }
        return surfShop;
    }
}
