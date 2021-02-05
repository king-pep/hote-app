package com.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReservation is a Querydsl query type for Reservation
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReservation extends EntityPathBase<Reservation> {

    private static final long serialVersionUID = -1177881088L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReservation reservation = new QReservation("reservation");

    public final QCompletedPayment completedPayment;

    public final DateTimePath<java.time.LocalDateTime> createdTime = createDateTime("createdTime", java.time.LocalDateTime.class);

    public final QReservationDates dates;

    public final SetPath<Extra, QExtra> generalExtras = this.<Extra, QExtra>createSet("generalExtras", Extra.class, QExtra.class, PathInits.DIRECT2);

    public final SetPath<Guest, QGuest> guests = this.<Guest, QGuest>createSet("guests", Guest.class, QGuest.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<MealPlan, QMealPlan> mealPlans = this.<MealPlan, QMealPlan>createList("mealPlans", MealPlan.class, QMealPlan.class, PathInits.DIRECT2);

    public final ComparablePath<java.util.UUID> reservationId = createComparable("reservationId", java.util.UUID.class);

    public final QRoom room;

    public QReservation(String variable) {
        this(Reservation.class, forVariable(variable), INITS);
    }

    public QReservation(Path<? extends Reservation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReservation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReservation(PathMetadata metadata, PathInits inits) {
        this(Reservation.class, metadata, inits);
    }

    public QReservation(Class<? extends Reservation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.completedPayment = inits.isInitialized("completedPayment") ? new QCompletedPayment(forProperty("completedPayment")) : null;
        this.dates = inits.isInitialized("dates") ? new QReservationDates(forProperty("dates")) : null;
        this.room = inits.isInitialized("room") ? new QRoom(forProperty("room"), inits.get("room")) : null;
    }

}

