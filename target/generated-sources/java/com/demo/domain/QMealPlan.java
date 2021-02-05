package com.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMealPlan is a Querydsl query type for MealPlan
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMealPlan extends EntityPathBase<MealPlan> {

    private static final long serialVersionUID = -171830312L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMealPlan mealPlan = new QMealPlan("mealPlan");

    public final ListPath<DietaryRequirement, EnumPath<DietaryRequirement>> dietaryRequirements = this.<DietaryRequirement, EnumPath<DietaryRequirement>>createList("dietaryRequirements", DietaryRequirement.class, EnumPath.class, PathInits.DIRECT2);

    public final ListPath<Extra, QExtra> foodExtras = this.<Extra, QExtra>createList("foodExtras", Extra.class, QExtra.class, PathInits.DIRECT2);

    public final QGuest guest;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ComparablePath<java.util.UUID> mealPlanId = createComparable("mealPlanId", java.util.UUID.class);

    public final QReservation reservation;

    public QMealPlan(String variable) {
        this(MealPlan.class, forVariable(variable), INITS);
    }

    public QMealPlan(Path<? extends MealPlan> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMealPlan(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMealPlan(PathMetadata metadata, PathInits inits) {
        this(MealPlan.class, metadata, inits);
    }

    public QMealPlan(Class<? extends MealPlan> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.guest = inits.isInitialized("guest") ? new QGuest(forProperty("guest")) : null;
        this.reservation = inits.isInitialized("reservation") ? new QReservation(forProperty("reservation"), inits.get("reservation")) : null;
    }

}

