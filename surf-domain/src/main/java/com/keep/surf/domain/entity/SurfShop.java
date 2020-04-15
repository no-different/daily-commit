package com.keep.surf.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@Table
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SurfShop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String shopName;
    private String location;
    private String telNo;
    private String address;

    @Builder
    public SurfShop(String shopName, String location, String telNo, String address) {
        this.shopName = shopName;
        this.location = location;
        this.telNo = telNo;
        this.address = address;
    }
}
