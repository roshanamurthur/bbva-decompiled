package com.bbva.component.ic.security.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OtpErrors.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/bbva/component/ic/security/model/OtpErrors;", "", "<init>", "()V", "Unauthorized", "Forbidden", "Unknown", "Lcom/bbva/component/ic/security/model/OtpErrors$Forbidden;", "Lcom/bbva/component/ic/security/model/OtpErrors$Unauthorized;", "Lcom/bbva/component/ic/security/model/OtpErrors$Unknown;", "component-ic-security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class OtpErrors {

    /* JADX INFO: compiled from: OtpErrors.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/component/ic/security/model/OtpErrors$Forbidden;", "Lcom/bbva/component/ic/security/model/OtpErrors;", "<init>", "()V", "component-ic-security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Forbidden extends OtpErrors {

        @NotNull
        public static final Forbidden INSTANCE = new Forbidden();

        public Forbidden() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: OtpErrors.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/component/ic/security/model/OtpErrors$Unauthorized;", "Lcom/bbva/component/ic/security/model/OtpErrors;", "<init>", "()V", "component-ic-security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unauthorized extends OtpErrors {

        @NotNull
        public static final Unauthorized INSTANCE = new Unauthorized();

        public Unauthorized() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: OtpErrors.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/component/ic/security/model/OtpErrors$Unknown;", "Lcom/bbva/component/ic/security/model/OtpErrors;", "<init>", "()V", "component-ic-security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unknown extends OtpErrors {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        public Unknown() {
            super(null);
        }
    }

    public OtpErrors() {
    }

    public /* synthetic */ OtpErrors(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
