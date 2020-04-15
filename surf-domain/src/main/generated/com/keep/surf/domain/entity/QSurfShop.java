package com.keep.surf.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSurfShop is a Querydsl query type for SurfShop
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSurfShop extends EntityPathBase<SurfShop> {

    private static final long serialVersionUID = 2121884041L;

    public static final QSurfShop surfShop = new QSurfShop("surfShop");

    public final StringPath address = createString("address");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath location = createString("location");

    public final StringPath shopName = createString("shopName");

    public final StringPath telNo = createString("telNo");

    public QSurfShop(String variable) {
        super(SurfShop.class, forVariable(variable));
    }

    public QSurfShop(Path<? extends SurfShop> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSurfShop(PathMetadata metadata) {
        super(SurfShop.class, metadata);
    }

}

