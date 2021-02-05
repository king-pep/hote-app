package com.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCompletedPayment is a Querydsl query type for CompletedPayment
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCompletedPayment extends EntityPathBase<CompletedPayment> {

    private static final long serialVersionUID = -1114585209L;

    public static final QCompletedPayment completedPayment = new QCompletedPayment("completedPayment");

    public final ComparablePath<java.time.YearMonth> cardExpiry = createComparable("cardExpiry", java.time.YearMonth.class);

    public final EnumPath<PendingPayment.CreditCardType> creditCardType = createEnum("creditCardType", PendingPayment.CreditCardType.class);

    public final StringPath cvv = createString("cvv");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath last4CreditCardDigits = createString("last4CreditCardDigits");

    public final ComparablePath<java.util.UUID> transactionId = createComparable("transactionId", java.util.UUID.class);

    public QCompletedPayment(String variable) {
        super(CompletedPayment.class, forVariable(variable));
    }

    public QCompletedPayment(Path<? extends CompletedPayment> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCompletedPayment(PathMetadata metadata) {
        super(CompletedPayment.class, metadata);
    }

}

