package com.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QReservationDates is a Querydsl query type for ReservationDates
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QReservationDates extends BeanPath<ReservationDates> {

    private static final long serialVersionUID = -1601511323L;

    public static final QReservationDates reservationDates = new QReservationDates("reservationDates");

    public final DatePath<java.time.LocalDate> checkInDate = createDate("checkInDate", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> checkOutDate = createDate("checkOutDate", java.time.LocalDate.class);

    public final TimePath<java.time.LocalTime> estimatedCheckInTime = createTime("estimatedCheckInTime", java.time.LocalTime.class);

    public final BooleanPath lateCheckout = createBoolean("lateCheckout");

    public final BooleanPath policyAcknowledged = createBoolean("policyAcknowledged");

    public QReservationDates(String variable) {
        super(ReservationDates.class, forVariable(variable));
    }

    public QReservationDates(Path<? extends ReservationDates> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReservationDates(PathMetadata metadata) {
        super(ReservationDates.class, metadata);
    }

}

