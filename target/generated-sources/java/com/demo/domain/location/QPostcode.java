package com.demo.domain.location;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPostcode is a Querydsl query type for Postcode
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QPostcode extends BeanPath<Postcode> {

    private static final long serialVersionUID = -160136166L;

    public static final QPostcode postcode = new QPostcode("postcode");

    public final StringPath value = createString("value");

    public QPostcode(String variable) {
        super(Postcode.class, forVariable(variable));
    }

    public QPostcode(Path<? extends Postcode> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPostcode(PathMetadata metadata) {
        super(Postcode.class, metadata);
    }

}

