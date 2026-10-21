package com.bbva.component.ic.security.utils;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SecurityVerification.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/bbva/component/ic/security/utils/SecurityVerification;", "", "<init>", "()V", "HeaderSecurityTypes", "SecondFactor", "WrongSecurityHeaders", "Lcom/bbva/component/ic/security/utils/SecurityVerification$HeaderSecurityTypes;", "Lcom/bbva/component/ic/security/utils/SecurityVerification$SecondFactor;", "Lcom/bbva/component/ic/security/utils/SecurityVerification$WrongSecurityHeaders;", "component-ic-security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SecurityVerification {

    /* JADX INFO: compiled from: SecurityVerification.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/bbva/component/ic/security/utils/SecurityVerification$HeaderSecurityTypes;", "Lcom/bbva/component/ic/security/utils/SecurityVerification;", "", "Lcom/bbva/component/ic/security/utils/SecurityType;", "a", "Ljava/util/List;", "getSecurityTypeList", "()Ljava/util/List;", "securityTypeList", "", "", "b", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "headers", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "component-ic-security_release"}, k = 1, mv = {2, 0, 0})
    public static final class HeaderSecurityTypes extends SecurityVerification {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<SecurityType> securityTypeList;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<String, String> headers;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public HeaderSecurityTypes(@NotNull List<? extends SecurityType> securityTypeList, @NotNull Map<String, String> headers) {
            super(null);
            Intrinsics.checkNotNullParameter(securityTypeList, "securityTypeList");
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.securityTypeList = securityTypeList;
            this.headers = headers;
        }

        @NotNull
        public final Map<String, String> getHeaders() {
            return this.headers;
        }

        @NotNull
        public final List<SecurityType> getSecurityTypeList() {
            return this.securityTypeList;
        }
    }

    /* JADX INFO: compiled from: SecurityVerification.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/component/ic/security/utils/SecurityVerification$SecondFactor;", "Lcom/bbva/component/ic/security/utils/SecurityVerification;", "", "a", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "token", "<init>", "(Ljava/lang/String;)V", "component-ic-security_release"}, k = 1, mv = {2, 0, 0})
    public static final class SecondFactor extends SecurityVerification {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SecondFactor(@NotNull String token) {
            super(null);
            Intrinsics.checkNotNullParameter(token, "token");
            this.token = token;
        }

        @NotNull
        public final String getToken() {
            return this.token;
        }
    }

    /* JADX INFO: compiled from: SecurityVerification.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/component/ic/security/utils/SecurityVerification$WrongSecurityHeaders;", "Lcom/bbva/component/ic/security/utils/SecurityVerification;", "<init>", "()V", "component-ic-security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WrongSecurityHeaders extends SecurityVerification {

        @NotNull
        public static final WrongSecurityHeaders INSTANCE = new WrongSecurityHeaders();

        public WrongSecurityHeaders() {
            super(null);
        }
    }

    public SecurityVerification() {
    }

    public /* synthetic */ SecurityVerification(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
