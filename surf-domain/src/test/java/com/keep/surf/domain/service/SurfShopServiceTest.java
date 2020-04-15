package com.keep.surf.domain.service;

import com.keep.surf.domain.entity.SurfShop;
import com.keep.surf.domain.entity.SurfShopCreate;
import com.keep.surf.domain.repository.SurfShopRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class SurfShopServiceTest {

    @Autowired
    private SurfShopRepository surfShopRepository;

    @Autowired
    private SurfShopService surfShopService;

    @AfterEach
    public void tearDown() throws Exception {
        surfShopRepository.deleteAll();
    }

    @Test
    @DisplayName("surfShop 도메인 생성 테스트")
    void create_test() throws Exception {

        //1.Given
        SurfShopCreate create = SurfShopCreate.builder()
                .shopName("shopName")
                .build();

        //2.When
        Long shopId = surfShopService.create(create);

        //3.Then
        SurfShop shopById = surfShopRepository.findById(shopId).orElseThrow(IllegalStateException::new);
        Assertions.assertThat(shopById.getShopName()).isEqualTo(create.getShopName());
    }

}