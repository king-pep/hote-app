package com.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QExtra is a Querydsl query type for Extra
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QExtra extends EntityPathBase<Extra> {

    private static final long serialVersionUID = 715914564L;

    public static final QExtra extra = new QExtra("extra");

    public final EnumPath<Extra.Category> category = createEnum("category", Extra.Category.class);

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<java.math.BigDecimal> perNightPrice = createNumber("perNightPrice", java.math.BigDecimal.class);

    public final EnumPath<Extra.Type> type = createEnum("type", Extra.Type.class);

    public QExtra(String variable) {
        super(Extra.class, forVariable(variable));
    }

    public QExtra(Path<? extends Extra> path) {
        super(path.getType(), path.getMetadata());
    }

    public QExtra(PathMetadata metadata) {
        super(Extra.class, metadata);
    }

}

