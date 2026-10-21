package com.bbva.component.dm.customer.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CustomerServiceType.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/component/dm/customer/domain/model/CustomerServiceType;", "", "()V", "Default", "Logins", "Lcom/bbva/component/dm/customer/domain/model/CustomerServiceType$Default;", "Lcom/bbva/component/dm/customer/domain/model/CustomerServiceType$Logins;", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class CustomerServiceType {

    /* JADX INFO: compiled from: CustomerServiceType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/dm/customer/domain/model/CustomerServiceType$Default;", "Lcom/bbva/component/dm/customer/domain/model/CustomerServiceType;", "()V", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Default extends CustomerServiceType {

        @NotNull
        public static final Default INSTANCE = new Default();

        public Default() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: CustomerServiceType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/dm/customer/domain/model/CustomerServiceType$Logins;", "Lcom/bbva/component/dm/customer/domain/model/CustomerServiceType;", "()V", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Logins extends CustomerServiceType {

        @NotNull
        public static final Logins INSTANCE = new Logins();

        public Logins() {
            super(null);
        }
    }

    public CustomerServiceType() {
    }

    public /* synthetic */ CustomerServiceType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
