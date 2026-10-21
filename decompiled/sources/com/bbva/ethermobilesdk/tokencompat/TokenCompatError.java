package com.bbva.ethermobilesdk.tokencompat;

import androidx.annotation.Keep;
import androidx.camera.core.impl.v;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TokenCompatError.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b7\u0018\u00002\u00020\u0001:\u0006\u000e\u000f\u0010\u0011\u0012\u0013B!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatError;", "", "code", "", "message", "", "cause", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "IllegalState", "LegacyTokenBuilderFailure", "PackageNameEmpty", "TokenIsNotActive", "Unknown", "UnknownTokenFormat", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class TokenCompatError extends Throwable {

    @Nullable
    private final Throwable cause;
    private final int code;

    @NotNull
    private final String message;

    /* JADX INFO: compiled from: TokenCompatError.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatError$IllegalState;", "Lcom/bbva/ethermobilesdk/tokencompat/ResultErrorTypeExtension;", "", "component1", "", "component2", "", "component3", "code", "message", "cause", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "q0", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "r0", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "<init>", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class IllegalState extends ResultErrorTypeExtension {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Throwable cause;

        public IllegalState() {
            this(0, null, null, 7, null);
        }

        public static /* synthetic */ IllegalState copy$default(IllegalState illegalState, int i10, String str, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = illegalState.getCode();
            }
            if ((i11 & 2) != 0) {
                str = illegalState.getMessage();
            }
            if ((i11 & 4) != 0) {
                th2 = illegalState.getCause();
            }
            return illegalState.copy(i10, str, th2);
        }

        public final int component1() {
            return getCode();
        }

        @NotNull
        public final String component2() {
            return getMessage();
        }

        @Nullable
        public final Throwable component3() {
            return getCause();
        }

        @NotNull
        public final IllegalState copy(int code, @NotNull String message, @Nullable Throwable cause) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new IllegalState(code, message, cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IllegalState)) {
                return false;
            }
            IllegalState illegalState = (IllegalState) other;
            return getCode() == illegalState.getCode() && Intrinsics.areEqual(getMessage(), illegalState.getMessage()) && Intrinsics.areEqual(getCause(), illegalState.getCause());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.ResultErrorTypeExtension, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.ResultErrorTypeExtension, com.bbva.ethermobile.help.kit.error.ResultErrorType
        public int getCode() {
            return this.code;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.ResultErrorTypeExtension, com.bbva.ethermobile.help.kit.error.ResultErrorType, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return ((getMessage().hashCode() + (getCode() * 31)) * 31) + (getCause() == null ? 0 : getCause().hashCode());
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            int code = getCode();
            String message = getMessage();
            Throwable cause = getCause();
            StringBuilder sbE = v.e("IllegalState(code=", code, ", message=", message, ", cause=");
            sbE.append(cause);
            sbE.append(")");
            return sbE.toString();
        }

        public /* synthetic */ IllegalState(int i10, String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 1003 : i10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? null : th2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IllegalState(int i10, @NotNull String message, @Nullable Throwable th2) {
            super(i10, message, th2);
            Intrinsics.checkNotNullParameter(message, "message");
            this.code = i10;
            this.message = message;
            this.cause = th2;
        }
    }

    /* JADX INFO: compiled from: TokenCompatError.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatError$LegacyTokenBuilderFailure;", "Lcom/bbva/ethermobilesdk/tokencompat/ResultErrorTypeExtension;", "", "component1", "", "component2", "", "component3", "code", "message", "cause", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "q0", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "r0", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "<init>", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class LegacyTokenBuilderFailure extends ResultErrorTypeExtension {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Throwable cause;

        public LegacyTokenBuilderFailure() {
            this(0, null, null, 7, null);
        }

        public static /* synthetic */ LegacyTokenBuilderFailure copy$default(LegacyTokenBuilderFailure legacyTokenBuilderFailure, int i10, String str, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = legacyTokenBuilderFailure.getCode();
            }
            if ((i11 & 2) != 0) {
                str = legacyTokenBuilderFailure.getMessage();
            }
            if ((i11 & 4) != 0) {
                th2 = legacyTokenBuilderFailure.getCause();
            }
            return legacyTokenBuilderFailure.copy(i10, str, th2);
        }

        public final int component1() {
            return getCode();
        }

        @NotNull
        public final String component2() {
            return getMessage();
        }

        @Nullable
        public final Throwable component3() {
            return getCause();
        }

        @NotNull
        public final LegacyTokenBuilderFailure copy(int code, @NotNull String message, @Nullable Throwable cause) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new LegacyTokenBuilderFailure(code, message, cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LegacyTokenBuilderFailure)) {
                return false;
            }
            LegacyTokenBuilderFailure legacyTokenBuilderFailure = (LegacyTokenBuilderFailure) other;
            return getCode() == legacyTokenBuilderFailure.getCode() && Intrinsics.areEqual(getMessage(), legacyTokenBuilderFailure.getMessage()) && Intrinsics.areEqual(getCause(), legacyTokenBuilderFailure.getCause());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.ResultErrorTypeExtension, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.ResultErrorTypeExtension, com.bbva.ethermobile.help.kit.error.ResultErrorType
        public int getCode() {
            return this.code;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.ResultErrorTypeExtension, com.bbva.ethermobile.help.kit.error.ResultErrorType, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return ((getMessage().hashCode() + (getCode() * 31)) * 31) + (getCause() == null ? 0 : getCause().hashCode());
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            int code = getCode();
            String message = getMessage();
            Throwable cause = getCause();
            StringBuilder sbE = v.e("LegacyTokenBuilderFailure(code=", code, ", message=", message, ", cause=");
            sbE.append(cause);
            sbE.append(")");
            return sbE.toString();
        }

        public /* synthetic */ LegacyTokenBuilderFailure(int i10, String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 1001 : i10, (i11 & 2) != 0 ? "Failed to build legacy token" : str, (i11 & 4) != 0 ? null : th2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LegacyTokenBuilderFailure(int i10, @NotNull String message, @Nullable Throwable th2) {
            super(i10, message, th2);
            Intrinsics.checkNotNullParameter(message, "message");
            this.code = i10;
            this.message = message;
            this.cause = th2;
        }
    }

    /* JADX INFO: compiled from: TokenCompatError.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatError$PackageNameEmpty;", "Lcom/bbva/ethermobilesdk/tokencompat/ResultErrorTypeExtension;", "", "component1", "", "component2", "", "component3", "code", "message", "cause", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "q0", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "r0", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "<init>", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class PackageNameEmpty extends ResultErrorTypeExtension {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Throwable cause;

        public PackageNameEmpty() {
            this(0, null, null, 7, null);
        }

        public static /* synthetic */ PackageNameEmpty copy$default(PackageNameEmpty packageNameEmpty, int i10, String str, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = packageNameEmpty.getCode();
            }
            if ((i11 & 2) != 0) {
                str = packageNameEmpty.getMessage();
            }
            if ((i11 & 4) != 0) {
                th2 = packageNameEmpty.getCause();
            }
            return packageNameEmpty.copy(i10, str, th2);
        }

        public final int component1() {
            return getCode();
        }

        @NotNull
        public final String component2() {
            return getMessage();
        }

        @Nullable
        public final Throwable component3() {
            return getCause();
        }

        @NotNull
        public final PackageNameEmpty copy(int code, @NotNull String message, @Nullable Throwable cause) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new PackageNameEmpty(code, message, cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PackageNameEmpty)) {
                return false;
            }
            PackageNameEmpty packageNameEmpty = (PackageNameEmpty) other;
            return getCode() == packageNameEmpty.getCode() && Intrinsics.areEqual(getMessage(), packageNameEmpty.getMessage()) && Intrinsics.areEqual(getCause(), packageNameEmpty.getCause());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.ResultErrorTypeExtension, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.ResultErrorTypeExtension, com.bbva.ethermobile.help.kit.error.ResultErrorType
        public int getCode() {
            return this.code;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.ResultErrorTypeExtension, com.bbva.ethermobile.help.kit.error.ResultErrorType, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return ((getMessage().hashCode() + (getCode() * 31)) * 31) + (getCause() == null ? 0 : getCause().hashCode());
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            int code = getCode();
            String message = getMessage();
            Throwable cause = getCause();
            StringBuilder sbE = v.e("PackageNameEmpty(code=", code, ", message=", message, ", cause=");
            sbE.append(cause);
            sbE.append(")");
            return sbE.toString();
        }

        public /* synthetic */ PackageNameEmpty(int i10, String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 1005 : i10, (i11 & 2) != 0 ? "Package name is empty" : str, (i11 & 4) != 0 ? null : th2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PackageNameEmpty(int i10, @NotNull String message, @Nullable Throwable th2) {
            super(i10, message, th2);
            Intrinsics.checkNotNullParameter(message, "message");
            this.code = i10;
            this.message = message;
            this.cause = th2;
        }
    }

    /* JADX INFO: compiled from: TokenCompatError.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatError$TokenIsNotActive;", "Lcom/bbva/ethermobilesdk/tokencompat/ResultErrorTypeExtension;", "", "component1", "", "component2", "", "component3", "code", "message", "cause", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "q0", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "r0", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "<init>", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class TokenIsNotActive extends ResultErrorTypeExtension {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Throwable cause;

        public TokenIsNotActive() {
            this(0, null, null, 7, null);
        }

        public static /* synthetic */ TokenIsNotActive copy$default(TokenIsNotActive tokenIsNotActive, int i10, String str, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = tokenIsNotActive.getCode();
            }
            if ((i11 & 2) != 0) {
                str = tokenIsNotActive.getMessage();
            }
            if ((i11 & 4) != 0) {
                th2 = tokenIsNotActive.getCause();
            }
            return tokenIsNotActive.copy(i10, str, th2);
        }

        public final int component1() {
            return getCode();
        }

        @NotNull
        public final String component2() {
            return getMessage();
        }

        @Nullable
        public final Throwable component3() {
            return getCause();
        }

        @NotNull
        public final TokenIsNotActive copy(int code, @NotNull String message, @Nullable Throwable cause) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new TokenIsNotActive(code, message, cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TokenIsNotActive)) {
                return false;
            }
            TokenIsNotActive tokenIsNotActive = (TokenIsNotActive) other;
            return getCode() == tokenIsNotActive.getCode() && Intrinsics.areEqual(getMessage(), tokenIsNotActive.getMessage()) && Intrinsics.areEqual(getCause(), tokenIsNotActive.getCause());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.ResultErrorTypeExtension, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.ResultErrorTypeExtension, com.bbva.ethermobile.help.kit.error.ResultErrorType
        public int getCode() {
            return this.code;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.ResultErrorTypeExtension, com.bbva.ethermobile.help.kit.error.ResultErrorType, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return ((getMessage().hashCode() + (getCode() * 31)) * 31) + (getCause() == null ? 0 : getCause().hashCode());
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            int code = getCode();
            String message = getMessage();
            Throwable cause = getCause();
            StringBuilder sbE = v.e("TokenIsNotActive(code=", code, ", message=", message, ", cause=");
            sbE.append(cause);
            sbE.append(")");
            return sbE.toString();
        }

        public /* synthetic */ TokenIsNotActive(int i10, String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 1002 : i10, (i11 & 2) != 0 ? "Token is not active" : str, (i11 & 4) != 0 ? null : th2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TokenIsNotActive(int i10, @NotNull String message, @Nullable Throwable th2) {
            super(i10, message, th2);
            Intrinsics.checkNotNullParameter(message, "message");
            this.code = i10;
            this.message = message;
            this.cause = th2;
        }
    }

    /* JADX INFO: compiled from: TokenCompatError.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatError$Unknown;", "Lcom/bbva/ethermobilesdk/tokencompat/ResultErrorTypeExtension;", "", "component1", "", "component2", "", "component3", "code", "message", "cause", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "q0", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "r0", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "<init>", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Unknown extends ResultErrorTypeExtension {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Throwable cause;

        public Unknown() {
            this(0, null, null, 7, null);
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, int i10, String str, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = unknown.getCode();
            }
            if ((i11 & 2) != 0) {
                str = unknown.getMessage();
            }
            if ((i11 & 4) != 0) {
                th2 = unknown.getCause();
            }
            return unknown.copy(i10, str, th2);
        }

        public final int component1() {
            return getCode();
        }

        @NotNull
        public final String component2() {
            return getMessage();
        }

        @Nullable
        public final Throwable component3() {
            return getCause();
        }

        @NotNull
        public final Unknown copy(int code, @NotNull String message, @Nullable Throwable cause) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Unknown(code, message, cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unknown)) {
                return false;
            }
            Unknown unknown = (Unknown) other;
            return getCode() == unknown.getCode() && Intrinsics.areEqual(getMessage(), unknown.getMessage()) && Intrinsics.areEqual(getCause(), unknown.getCause());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.ResultErrorTypeExtension, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.ResultErrorTypeExtension, com.bbva.ethermobile.help.kit.error.ResultErrorType
        public int getCode() {
            return this.code;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.ResultErrorTypeExtension, com.bbva.ethermobile.help.kit.error.ResultErrorType, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return ((getMessage().hashCode() + (getCode() * 31)) * 31) + (getCause() == null ? 0 : getCause().hashCode());
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            int code = getCode();
            String message = getMessage();
            Throwable cause = getCause();
            StringBuilder sbE = v.e("Unknown(code=", code, ", message=", message, ", cause=");
            sbE.append(cause);
            sbE.append(")");
            return sbE.toString();
        }

        public /* synthetic */ Unknown(int i10, String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 1000 : i10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? null : th2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(int i10, @NotNull String message, @Nullable Throwable th2) {
            super(i10, message, th2);
            Intrinsics.checkNotNullParameter(message, "message");
            this.code = i10;
            this.message = message;
            this.cause = th2;
        }
    }

    /* JADX INFO: compiled from: TokenCompatError.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatError$UnknownTokenFormat;", "Lcom/bbva/ethermobilesdk/tokencompat/ResultErrorTypeExtension;", "", "component1", "", "component2", "", "component3", "code", "message", "cause", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "q0", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "r0", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "<init>", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class UnknownTokenFormat extends ResultErrorTypeExtension {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Throwable cause;

        public UnknownTokenFormat() {
            this(0, null, null, 7, null);
        }

        public static /* synthetic */ UnknownTokenFormat copy$default(UnknownTokenFormat unknownTokenFormat, int i10, String str, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = unknownTokenFormat.getCode();
            }
            if ((i11 & 2) != 0) {
                str = unknownTokenFormat.getMessage();
            }
            if ((i11 & 4) != 0) {
                th2 = unknownTokenFormat.getCause();
            }
            return unknownTokenFormat.copy(i10, str, th2);
        }

        public final int component1() {
            return getCode();
        }

        @NotNull
        public final String component2() {
            return getMessage();
        }

        @Nullable
        public final Throwable component3() {
            return getCause();
        }

        @NotNull
        public final UnknownTokenFormat copy(int code, @NotNull String message, @Nullable Throwable cause) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new UnknownTokenFormat(code, message, cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UnknownTokenFormat)) {
                return false;
            }
            UnknownTokenFormat unknownTokenFormat = (UnknownTokenFormat) other;
            return getCode() == unknownTokenFormat.getCode() && Intrinsics.areEqual(getMessage(), unknownTokenFormat.getMessage()) && Intrinsics.areEqual(getCause(), unknownTokenFormat.getCause());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.ResultErrorTypeExtension, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.ResultErrorTypeExtension, com.bbva.ethermobile.help.kit.error.ResultErrorType
        public int getCode() {
            return this.code;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.ResultErrorTypeExtension, com.bbva.ethermobile.help.kit.error.ResultErrorType, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return ((getMessage().hashCode() + (getCode() * 31)) * 31) + (getCause() == null ? 0 : getCause().hashCode());
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            int code = getCode();
            String message = getMessage();
            Throwable cause = getCause();
            StringBuilder sbE = v.e("UnknownTokenFormat(code=", code, ", message=", message, ", cause=");
            sbE.append(cause);
            sbE.append(")");
            return sbE.toString();
        }

        public /* synthetic */ UnknownTokenFormat(int i10, String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 1004 : i10, (i11 & 2) != 0 ? "Unknown token format" : str, (i11 & 4) != 0 ? null : th2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownTokenFormat(int i10, @NotNull String message, @Nullable Throwable th2) {
            super(i10, message, th2);
            Intrinsics.checkNotNullParameter(message, "message");
            this.code = i10;
            this.message = message;
            this.cause = th2;
        }
    }

    public /* synthetic */ TokenCompatError(int i10, String str, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, th2);
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.cause;
    }

    public int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    private TokenCompatError(int i10, String str, Throwable th2) {
        super(str);
        this.code = i10;
        this.message = str;
        this.cause = th2;
    }
}
