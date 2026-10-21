package com.bbva.ethermobilesdk.tokencompat;

import ad.d;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.h0;
import androidx.camera.core.processing.f;
import com.bbva.ethermobile.help.kit.error.ResultErrorType;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.extensions.SalesforceDeepLinkModelExtensionsKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TokenCompatError.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b7\u0018\u00002\u00020\u0001:\u0007\u000b\f\r\u000e\u000f\u0010\u0011B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatStorageError;", "", "code", "", "message", "", "(ILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "AddedToken", "CrcDeviceInfo", "CrcPin", "DecryptToken", "EmptyOrNullPin", "ManualPin", "NotFoundToken", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class TokenCompatStorageError extends Throwable {
    private final int code;

    @NotNull
    private final String message;

    /* JADX INFO: compiled from: TokenCompatError.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatStorageError$CrcDeviceInfo;", "Lcom/bbva/ethermobile/help/kit/error/ResultErrorType;", "", "component1", "", "component2", "code", "message", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "q0", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class CrcDeviceInfo extends ResultErrorType {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public CrcDeviceInfo() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ CrcDeviceInfo copy$default(CrcDeviceInfo crcDeviceInfo, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = crcDeviceInfo.getCode();
            }
            if ((i11 & 2) != 0) {
                str = crcDeviceInfo.getMessage();
            }
            return crcDeviceInfo.copy(i10, str);
        }

        public final int component1() {
            return getCode();
        }

        @NotNull
        public final String component2() {
            return getMessage();
        }

        @NotNull
        public final CrcDeviceInfo copy(int code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new CrcDeviceInfo(code, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CrcDeviceInfo)) {
                return false;
            }
            CrcDeviceInfo crcDeviceInfo = (CrcDeviceInfo) other;
            return getCode() == crcDeviceInfo.getCode() && Intrinsics.areEqual(getMessage(), crcDeviceInfo.getMessage());
        }

        @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType
        public int getCode() {
            return this.code;
        }

        @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return getMessage().hashCode() + (getCode() * 31);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return z1.c("CrcDeviceInfo(code=", getCode(), ", message=", getMessage(), ")");
        }

        public /* synthetic */ CrcDeviceInfo(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 2004 : i10, (i11 & 2) != 0 ? "Device UUID CRC does not match" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CrcDeviceInfo(int i10, @NotNull String message) {
            super(i10, message);
            Intrinsics.checkNotNullParameter(message, "message");
            this.code = i10;
            this.message = message;
        }
    }

    /* JADX INFO: compiled from: TokenCompatError.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatStorageError$CrcPin;", "Lcom/bbva/ethermobile/help/kit/error/ResultErrorType;", "", "component1", "", "component2", "component3", SalesforceDeepLinkModelExtensionsKt.EXTRA_KEY, "code", "message", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", "Ljava/lang/String;", "getExtra", "()Ljava/lang/String;", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "r0", "getMessage", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class CrcPin extends ResultErrorType {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String extra;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        public /* synthetic */ CrcPin(String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? 2003 : i10, (i11 & 4) != 0 ? "Token pin CRC does not match" : str2);
        }

        public static /* synthetic */ CrcPin copy$default(CrcPin crcPin, String str, int i10, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = crcPin.extra;
            }
            if ((i11 & 2) != 0) {
                i10 = crcPin.getCode();
            }
            if ((i11 & 4) != 0) {
                str2 = crcPin.getMessage();
            }
            return crcPin.copy(str, i10, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getExtra() {
            return this.extra;
        }

        public final int component2() {
            return getCode();
        }

        @NotNull
        public final String component3() {
            return getMessage();
        }

        @NotNull
        public final CrcPin copy(@NotNull String extra, int code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(extra, "extra");
            Intrinsics.checkNotNullParameter(message, "message");
            return new CrcPin(extra, code, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CrcPin)) {
                return false;
            }
            CrcPin crcPin = (CrcPin) other;
            return Intrinsics.areEqual(this.extra, crcPin.extra) && getCode() == crcPin.getCode() && Intrinsics.areEqual(getMessage(), crcPin.getMessage());
        }

        @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType
        public int getCode() {
            return this.code;
        }

        @NotNull
        public final String getExtra() {
            return this.extra;
        }

        @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return getMessage().hashCode() + ((getCode() + (this.extra.hashCode() * 31)) * 31);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            int code = getCode();
            String message = getMessage();
            StringBuilder sb2 = new StringBuilder("CrcPin(extra=");
            sb2.append(this.extra);
            sb2.append(", code=");
            sb2.append(code);
            sb2.append(", message=");
            return d.f(sb2, message, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CrcPin(@NotNull String extra, int i10, @NotNull String message) {
            super(i10, message);
            Intrinsics.checkNotNullParameter(extra, "extra");
            Intrinsics.checkNotNullParameter(message, "message");
            this.extra = extra;
            this.code = i10;
            this.message = message;
        }
    }

    public /* synthetic */ TokenCompatStorageError(int i10, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str);
    }

    public int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    private TokenCompatStorageError(int i10, String str) {
        super(str);
        this.code = i10;
        this.message = str;
    }

    /* JADX INFO: compiled from: TokenCompatError.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatStorageError$AddedToken;", "Lcom/bbva/ethermobile/help/kit/error/ResultErrorType;", "", "component1", "", "component2", "component3", SalesforceDeepLinkModelExtensionsKt.EXTRA_KEY, "code", "message", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", "Ljava/lang/String;", "getExtra", "()Ljava/lang/String;", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "r0", "getMessage", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class AddedToken extends ResultErrorType {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String extra;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        public /* synthetic */ AddedToken(String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? 2007 : i10, (i11 & 4) != 0 ? f.d("Failed to add token ", str) : str2);
        }

        public static /* synthetic */ AddedToken copy$default(AddedToken addedToken, String str, int i10, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = addedToken.extra;
            }
            if ((i11 & 2) != 0) {
                i10 = addedToken.getCode();
            }
            if ((i11 & 4) != 0) {
                str2 = addedToken.getMessage();
            }
            return addedToken.copy(str, i10, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getExtra() {
            return this.extra;
        }

        public final int component2() {
            return getCode();
        }

        @NotNull
        public final String component3() {
            return getMessage();
        }

        @NotNull
        public final AddedToken copy(@NotNull String extra, int code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(extra, "extra");
            Intrinsics.checkNotNullParameter(message, "message");
            return new AddedToken(extra, code, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddedToken)) {
                return false;
            }
            AddedToken addedToken = (AddedToken) other;
            return Intrinsics.areEqual(this.extra, addedToken.extra) && getCode() == addedToken.getCode() && Intrinsics.areEqual(getMessage(), addedToken.getMessage());
        }

        @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType
        public int getCode() {
            return this.code;
        }

        @NotNull
        public final String getExtra() {
            return this.extra;
        }

        @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return getMessage().hashCode() + ((getCode() + (this.extra.hashCode() * 31)) * 31);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            int code = getCode();
            String message = getMessage();
            StringBuilder sb2 = new StringBuilder("AddedToken(extra=");
            sb2.append(this.extra);
            sb2.append(", code=");
            sb2.append(code);
            sb2.append(", message=");
            return d.f(sb2, message, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddedToken(@NotNull String extra, int i10, @NotNull String message) {
            super(i10, message);
            Intrinsics.checkNotNullParameter(extra, "extra");
            Intrinsics.checkNotNullParameter(message, "message");
            this.extra = extra;
            this.code = i10;
            this.message = message;
        }
    }

    /* JADX INFO: compiled from: TokenCompatError.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatStorageError$DecryptToken;", "Lcom/bbva/ethermobile/help/kit/error/ResultErrorType;", "", "component1", "", "component2", "component3", SalesforceDeepLinkModelExtensionsKt.EXTRA_KEY, "code", "message", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", "Ljava/lang/String;", "getExtra", "()Ljava/lang/String;", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "r0", "getMessage", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class DecryptToken extends ResultErrorType {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String extra;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        public /* synthetic */ DecryptToken(String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? 2005 : i10, (i11 & 4) != 0 ? f.d("Failed to decrypt token ", str) : str2);
        }

        public static /* synthetic */ DecryptToken copy$default(DecryptToken decryptToken, String str, int i10, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = decryptToken.extra;
            }
            if ((i11 & 2) != 0) {
                i10 = decryptToken.getCode();
            }
            if ((i11 & 4) != 0) {
                str2 = decryptToken.getMessage();
            }
            return decryptToken.copy(str, i10, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getExtra() {
            return this.extra;
        }

        public final int component2() {
            return getCode();
        }

        @NotNull
        public final String component3() {
            return getMessage();
        }

        @NotNull
        public final DecryptToken copy(@NotNull String extra, int code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(extra, "extra");
            Intrinsics.checkNotNullParameter(message, "message");
            return new DecryptToken(extra, code, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DecryptToken)) {
                return false;
            }
            DecryptToken decryptToken = (DecryptToken) other;
            return Intrinsics.areEqual(this.extra, decryptToken.extra) && getCode() == decryptToken.getCode() && Intrinsics.areEqual(getMessage(), decryptToken.getMessage());
        }

        @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType
        public int getCode() {
            return this.code;
        }

        @NotNull
        public final String getExtra() {
            return this.extra;
        }

        @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return getMessage().hashCode() + ((getCode() + (this.extra.hashCode() * 31)) * 31);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            int code = getCode();
            String message = getMessage();
            StringBuilder sb2 = new StringBuilder("DecryptToken(extra=");
            sb2.append(this.extra);
            sb2.append(", code=");
            sb2.append(code);
            sb2.append(", message=");
            return d.f(sb2, message, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DecryptToken(@NotNull String extra, int i10, @NotNull String message) {
            super(i10, message);
            Intrinsics.checkNotNullParameter(extra, "extra");
            Intrinsics.checkNotNullParameter(message, "message");
            this.extra = extra;
            this.code = i10;
            this.message = message;
        }
    }

    /* JADX INFO: compiled from: TokenCompatError.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatStorageError$EmptyOrNullPin;", "Lcom/bbva/ethermobile/help/kit/error/ResultErrorType;", "", "component1", "", "component2", "component3", SalesforceDeepLinkModelExtensionsKt.EXTRA_KEY, "code", "message", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", "Ljava/lang/String;", "getExtra", "()Ljava/lang/String;", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "r0", "getMessage", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class EmptyOrNullPin extends ResultErrorType {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String extra;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        public /* synthetic */ EmptyOrNullPin(String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? 2001 : i10, (i11 & 4) != 0 ? h0.b("Token ", str, " pin not found") : str2);
        }

        public static /* synthetic */ EmptyOrNullPin copy$default(EmptyOrNullPin emptyOrNullPin, String str, int i10, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = emptyOrNullPin.extra;
            }
            if ((i11 & 2) != 0) {
                i10 = emptyOrNullPin.getCode();
            }
            if ((i11 & 4) != 0) {
                str2 = emptyOrNullPin.getMessage();
            }
            return emptyOrNullPin.copy(str, i10, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getExtra() {
            return this.extra;
        }

        public final int component2() {
            return getCode();
        }

        @NotNull
        public final String component3() {
            return getMessage();
        }

        @NotNull
        public final EmptyOrNullPin copy(@NotNull String extra, int code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(extra, "extra");
            Intrinsics.checkNotNullParameter(message, "message");
            return new EmptyOrNullPin(extra, code, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmptyOrNullPin)) {
                return false;
            }
            EmptyOrNullPin emptyOrNullPin = (EmptyOrNullPin) other;
            return Intrinsics.areEqual(this.extra, emptyOrNullPin.extra) && getCode() == emptyOrNullPin.getCode() && Intrinsics.areEqual(getMessage(), emptyOrNullPin.getMessage());
        }

        @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType
        public int getCode() {
            return this.code;
        }

        @NotNull
        public final String getExtra() {
            return this.extra;
        }

        @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return getMessage().hashCode() + ((getCode() + (this.extra.hashCode() * 31)) * 31);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            int code = getCode();
            String message = getMessage();
            StringBuilder sb2 = new StringBuilder("EmptyOrNullPin(extra=");
            sb2.append(this.extra);
            sb2.append(", code=");
            sb2.append(code);
            sb2.append(", message=");
            return d.f(sb2, message, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmptyOrNullPin(@NotNull String extra, int i10, @NotNull String message) {
            super(i10, message);
            Intrinsics.checkNotNullParameter(extra, "extra");
            Intrinsics.checkNotNullParameter(message, "message");
            this.extra = extra;
            this.code = i10;
            this.message = message;
        }
    }

    /* JADX INFO: compiled from: TokenCompatError.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatStorageError$ManualPin;", "Lcom/bbva/ethermobile/help/kit/error/ResultErrorType;", "", "component1", "", "component2", "component3", SalesforceDeepLinkModelExtensionsKt.EXTRA_KEY, "code", "message", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", "Ljava/lang/String;", "getExtra", "()Ljava/lang/String;", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "r0", "getMessage", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class ManualPin extends ResultErrorType {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String extra;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        public /* synthetic */ ManualPin(String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? 2002 : i10, (i11 & 4) != 0 ? h0.b("Unsupported token ", str, " with manual pin") : str2);
        }

        public static /* synthetic */ ManualPin copy$default(ManualPin manualPin, String str, int i10, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = manualPin.extra;
            }
            if ((i11 & 2) != 0) {
                i10 = manualPin.getCode();
            }
            if ((i11 & 4) != 0) {
                str2 = manualPin.getMessage();
            }
            return manualPin.copy(str, i10, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getExtra() {
            return this.extra;
        }

        public final int component2() {
            return getCode();
        }

        @NotNull
        public final String component3() {
            return getMessage();
        }

        @NotNull
        public final ManualPin copy(@NotNull String extra, int code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(extra, "extra");
            Intrinsics.checkNotNullParameter(message, "message");
            return new ManualPin(extra, code, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ManualPin)) {
                return false;
            }
            ManualPin manualPin = (ManualPin) other;
            return Intrinsics.areEqual(this.extra, manualPin.extra) && getCode() == manualPin.getCode() && Intrinsics.areEqual(getMessage(), manualPin.getMessage());
        }

        @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType
        public int getCode() {
            return this.code;
        }

        @NotNull
        public final String getExtra() {
            return this.extra;
        }

        @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return getMessage().hashCode() + ((getCode() + (this.extra.hashCode() * 31)) * 31);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            int code = getCode();
            String message = getMessage();
            StringBuilder sb2 = new StringBuilder("ManualPin(extra=");
            sb2.append(this.extra);
            sb2.append(", code=");
            sb2.append(code);
            sb2.append(", message=");
            return d.f(sb2, message, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ManualPin(@NotNull String extra, int i10, @NotNull String message) {
            super(i10, message);
            Intrinsics.checkNotNullParameter(extra, "extra");
            Intrinsics.checkNotNullParameter(message, "message");
            this.extra = extra;
            this.code = i10;
            this.message = message;
        }
    }

    /* JADX INFO: compiled from: TokenCompatError.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatStorageError$NotFoundToken;", "Lcom/bbva/ethermobile/help/kit/error/ResultErrorType;", "", "component1", "", "component2", "component3", SalesforceDeepLinkModelExtensionsKt.EXTRA_KEY, "code", "message", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", "Ljava/lang/String;", "getExtra", "()Ljava/lang/String;", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "r0", "getMessage", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class NotFoundToken extends ResultErrorType {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String extra;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        public /* synthetic */ NotFoundToken(String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? 2006 : i10, (i11 & 4) != 0 ? h0.b("Token ", str, " not found") : str2);
        }

        public static /* synthetic */ NotFoundToken copy$default(NotFoundToken notFoundToken, String str, int i10, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = notFoundToken.extra;
            }
            if ((i11 & 2) != 0) {
                i10 = notFoundToken.getCode();
            }
            if ((i11 & 4) != 0) {
                str2 = notFoundToken.getMessage();
            }
            return notFoundToken.copy(str, i10, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getExtra() {
            return this.extra;
        }

        public final int component2() {
            return getCode();
        }

        @NotNull
        public final String component3() {
            return getMessage();
        }

        @NotNull
        public final NotFoundToken copy(@NotNull String extra, int code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(extra, "extra");
            Intrinsics.checkNotNullParameter(message, "message");
            return new NotFoundToken(extra, code, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotFoundToken)) {
                return false;
            }
            NotFoundToken notFoundToken = (NotFoundToken) other;
            return Intrinsics.areEqual(this.extra, notFoundToken.extra) && getCode() == notFoundToken.getCode() && Intrinsics.areEqual(getMessage(), notFoundToken.getMessage());
        }

        @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType
        public int getCode() {
            return this.code;
        }

        @NotNull
        public final String getExtra() {
            return this.extra;
        }

        @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return getMessage().hashCode() + ((getCode() + (this.extra.hashCode() * 31)) * 31);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            int code = getCode();
            String message = getMessage();
            StringBuilder sb2 = new StringBuilder("NotFoundToken(extra=");
            sb2.append(this.extra);
            sb2.append(", code=");
            sb2.append(code);
            sb2.append(", message=");
            return d.f(sb2, message, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotFoundToken(@NotNull String extra, int i10, @NotNull String message) {
            super(i10, message);
            Intrinsics.checkNotNullParameter(extra, "extra");
            Intrinsics.checkNotNullParameter(message, "message");
            this.extra = extra;
            this.code = i10;
            this.message = message;
        }
    }
}
