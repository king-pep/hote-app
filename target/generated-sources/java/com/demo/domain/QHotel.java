package com.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHotel is a Querydsl query type for Hotel
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QHotel extends EntityPathBase<Hotel> {

    private static final long serialVersionUID = 718416616L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHotel hotel = new QHotel("hotel");

    public final com.demo.domain.location.QAddress address;

    public final TimePath<java.time.LocalTime> earliestCheckInTime = createTime("earliestCheckInTime", java.time.LocalTime.class);

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<java.math.BigDecimal> lateCheckoutFee = createNumber("lateCheckoutFee", java.math.BigDecimal.class);

    public final TimePath<java.time.LocalTime> latestCheckInTime = createTime("latestCheckInTime", java.time.LocalTime.class);

    public final TimePath<java.time.LocalTime> latestCheckOutTime = createTime("latestCheckOutTime", java.time.LocalTime.class);

    public final StringPath name = createString("name");

    public final SetPath<Room, QRoom> rooms = this.<Room, QRoom>createSet("rooms", Room.class, QRoom.class, PathInits.DIRECT2);

    public final TimePath<java.time.LocalTime> standardCheckOutTime = createTime("standardCheckOutTime", java.time.LocalTime.class);

    public final NumberPath<Integer> stars = createNumber("stars", Integer.class);

    public QHotel(String variable) {
        this(Hotel.class, forVariable(variable), INITS);
    }

    public QHotel(Path<? extends Hotel> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHotel(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHotel(PathMetadata metadata, PathInits inits) {
        this(Hotel.class, metadata, inits);
    }

    public QHotel(Class<? extends Hotel> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new com.demo.domain.location.QAddress(forProperty("address"), inits.get("address")) : null;
    }

}

