package com.bbva.component.dm.customer.data.repository.response.exception;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.model.response.NetworkResponse;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomerException.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fBA\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/bbva/component/dm/customer/data/repository/response/exception/CustomerException;", "Lcom/bbva/network/exceptions/ConnectionException;", "", "code", "", "other", "", "equals", GenerateActivationFormCommand.HASH_CODE, "", "r0", "Ljava/lang/String;", "getErrorCode", "()Ljava/lang/String;", "errorCode", "s0", "getDetailMessage", "detailMessage", "Lcom/bbva/component/dm/customer/data/repository/response/exception/CustomerException$ErrorCategory;", "t0", "Lcom/bbva/component/dm/customer/data/repository/response/exception/CustomerException$ErrorCategory;", "getCategory", "()Lcom/bbva/component/dm/customer/data/repository/response/exception/CustomerException$ErrorCategory;", "category", "Lcom/bbva/network/model/response/NetworkResponse;", DigipassManagerConstants.KEY_RESPONSE, "Ljava/lang/Exception;", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/component/dm/customer/data/repository/response/exception/CustomerException$ErrorCategory;Lcom/bbva/network/model/response/NetworkResponse;Ljava/lang/Exception;)V", "Companion", "ErrorCategory", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0})
public final class CustomerException extends ConnectionException {

    @NotNull
    public static final String UNKNOWN_ERROR = "unknown-error-exception";

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String errorCode;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String detailMessage;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ErrorCategory category;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: CustomerException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/component/dm/customer/data/repository/response/exception/CustomerException$ErrorCategory;", "", "UNKNOWN", "DEVICE_NOT_REGISTER", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0})
    public static final class ErrorCategory {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorCategory[] $VALUES;
        public static final ErrorCategory DEVICE_NOT_REGISTER;
        public static final ErrorCategory UNKNOWN;

        static {
            ErrorCategory errorCategory = new ErrorCategory("UNKNOWN", 0);
            UNKNOWN = errorCategory;
            ErrorCategory errorCategory2 = new ErrorCategory("DEVICE_NOT_REGISTER", 1);
            DEVICE_NOT_REGISTER = errorCategory2;
            ErrorCategory[] errorCategoryArr = {errorCategory, errorCategory2};
            $VALUES = errorCategoryArr;
            $ENTRIES = EnumEntriesKt.enumEntries(errorCategoryArr);
        }

        public ErrorCategory() {
            throw null;
        }

        @NotNull
        public static EnumEntries<ErrorCategory> getEntries() {
            return $ENTRIES;
        }

        public static ErrorCategory valueOf(String str) {
            return (ErrorCategory) Enum.valueOf(ErrorCategory.class, str);
        }

        public static ErrorCategory[] values() {
            return (ErrorCategory[]) $VALUES.clone();
        }
    }

    public CustomerException() {
        this(null, null, null, null, null, 31, null);
    }

    public final int code() {
        NetworkResponse networkResponse = getCom.bbva.library.digipassmanager.constants.DigipassManagerConstants.KEY_RESPONSE java.lang.String();
        if (networkResponse != null) {
            return networkResponse.getCode();
        }
        return -1;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(CustomerException.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.bbva.component.dm.customer.data.repository.response.exception.CustomerException");
        CustomerException customerException = (CustomerException) other;
        return Intrinsics.areEqual(this.errorCode, customerException.errorCode) && Intrinsics.areEqual(this.detailMessage, customerException.detailMessage) && this.category == customerException.category && Intrinsics.areEqual(getCom.bbva.library.digipassmanager.constants.DigipassManagerConstants.KEY_RESPONSE java.lang.String(), customerException.getCom.bbva.library.digipassmanager.constants.DigipassManagerConstants.KEY_RESPONSE java.lang.String()) && Intrinsics.areEqual(getCause(), customerException.getCause());
    }

    @NotNull
    public final ErrorCategory getCategory() {
        return this.category;
    }

    @Nullable
    public final String getDetailMessage() {
        return this.detailMessage;
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    public int hashCode() {
        return Objects.hash(this.errorCode, this.detailMessage, this.category, getCom.bbva.library.digipassmanager.constants.DigipassManagerConstants.KEY_RESPONSE java.lang.String(), getCause());
    }

    public /* synthetic */ CustomerException(String str, String str2, ErrorCategory errorCategory, NetworkResponse networkResponse, Exception exc, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "unknown-error-exception" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? ErrorCategory.UNKNOWN : errorCategory, (i10 & 8) != 0 ? null : networkResponse, (i10 & 16) == 0 ? exc : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerException(@Nullable String str, @Nullable String str2, @NotNull ErrorCategory category, @Nullable NetworkResponse networkResponse, @Nullable Exception exc) {
        super(str2, networkResponse, exc);
        Intrinsics.checkNotNullParameter(category, "category");
        this.errorCode = str;
        this.detailMessage = str2;
        this.category = category;
    }
}
