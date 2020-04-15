package com.keep.surf.domain.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
public class SurfShopCreate {
    private String shopName;
    private String location;
    private String telNo;
    private String address;

    @Builder
    public SurfShopCreate(String shopName, String location, String telNo, String address) {
        this.shopName = shopName;
        this.location = location;
        this.telNo = telNo;
        this.address = address;
    }
}
