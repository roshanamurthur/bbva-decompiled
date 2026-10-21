package com.bbva.component.dm.login.datamanager.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginException.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u0000 \u001d2\u00060\u0001j\u0002`\u0002:\u0002\u001d\u001eB;\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bB+\b\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/bbva/component/dm/login/datamanager/model/LoginException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "p0", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "", "q0", "Ljava/lang/Integer;", "getStatusCode", "()Ljava/lang/Integer;", "statusCode", "r0", "getDetailMessage", "detailMessage", "Lcom/bbva/component/dm/login/datamanager/model/LoginException$ErrorCategory;", "s0", "Lcom/bbva/component/dm/login/datamanager/model/LoginException$ErrorCategory;", "getCategory", "()Lcom/bbva/component/dm/login/datamanager/model/LoginException$ErrorCategory;", "category", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Throwable;Ljava/lang/String;Lcom/bbva/component/dm/login/datamanager/model/LoginException$ErrorCategory;)V", "(Ljava/lang/Throwable;Ljava/lang/String;Lcom/bbva/component/dm/login/datamanager/model/LoginException$ErrorCategory;)V", "Companion", "ErrorCategory", "component-dm-login_release"}, k = 1, mv = {1, 5, 1})
public final class LoginException extends Exception {

    @NotNull
    public static final String UNKNOWN_ERROR = "unknown-error-exception";

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String code;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer statusCode;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String detailMessage;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ErrorCategory category;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: LoginException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/component/dm/login/datamanager/model/LoginException$ErrorCategory;", "", "INVALID_CREDENTIALS", "BLOCKED_USER", "EXPIRED_CREDENTIALS", "UNAUTHORIZED_ACCESS", "NOT_ALLOWED_CREDENTIALS", "UNKNOWN", "component-dm-login_release"}, k = 1, mv = {1, 5, 1})
    public static final class ErrorCategory {
        private static final /* synthetic */ ErrorCategory[] $VALUES;
        public static final ErrorCategory BLOCKED_USER;
        public static final ErrorCategory EXPIRED_CREDENTIALS;
        public static final ErrorCategory INVALID_CREDENTIALS;
        public static final ErrorCategory NOT_ALLOWED_CREDENTIALS;
        public static final ErrorCategory UNAUTHORIZED_ACCESS;
        public static final ErrorCategory UNKNOWN;

        static {
            ErrorCategory errorCategory = new ErrorCategory("INVALID_CREDENTIALS", 0);
            INVALID_CREDENTIALS = errorCategory;
            ErrorCategory errorCategory2 = new ErrorCategory("BLOCKED_USER", 1);
            BLOCKED_USER = errorCategory2;
            ErrorCategory errorCategory3 = new ErrorCategory("EXPIRED_CREDENTIALS", 2);
            EXPIRED_CREDENTIALS = errorCategory3;
            ErrorCategory errorCategory4 = new ErrorCategory("UNAUTHORIZED_ACCESS", 3);
            UNAUTHORIZED_ACCESS = errorCategory4;
            ErrorCategory errorCategory5 = new ErrorCategory("NOT_ALLOWED_CREDENTIALS", 4);
            NOT_ALLOWED_CREDENTIALS = errorCategory5;
            ErrorCategory errorCategory6 = new ErrorCategory("UNKNOWN", 5);
            UNKNOWN = errorCategory6;
            $VALUES = new ErrorCategory[]{errorCategory, errorCategory2, errorCategory3, errorCategory4, errorCategory5, errorCategory6};
        }

        public ErrorCategory() {
            throw null;
        }

        public static ErrorCategory valueOf(String str) {
            return (ErrorCategory) Enum.valueOf(ErrorCategory.class, str);
        }

        public static ErrorCategory[] values() {
            return (ErrorCategory[]) $VALUES.clone();
        }
    }

    public /* synthetic */ LoginException(String str, Integer num, Throwable th2, String str2, ErrorCategory errorCategory, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, (i10 & 4) != 0 ? null : th2, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? ErrorCategory.UNKNOWN : errorCategory);
    }

    @NotNull
    public final ErrorCategory getCategory() {
        return this.category;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getDetailMessage() {
        return this.detailMessage;
    }

    @Nullable
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginException(@NotNull String code, @Nullable Integer num, @Nullable Throwable th2, @Nullable String str, @NotNull ErrorCategory category) {
        super(th2);
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(category, "category");
        this.code = code;
        this.statusCode = num;
        this.detailMessage = str;
        this.category = category;
    }

    public /* synthetic */ LoginException(Throwable th2, String str, ErrorCategory errorCategory, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : th2, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? ErrorCategory.UNKNOWN : errorCategory);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginException(@Nullable Throwable th2, @Nullable String str, @NotNull ErrorCategory category) {
        this("unknown-error-exception", (Integer) (-1), th2, str, category);
        Intrinsics.checkNotNullParameter(category, "category");
    }
}
