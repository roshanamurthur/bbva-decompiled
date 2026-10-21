package com.bbva.ethermobilesdk.cipher.error;

import ad.d;
import com.bbva.ethermobile.help.kit.error.ResultErrorType;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.extensions.SalesforceDeepLinkModelExtensionsKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Error.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b6\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/error/TrustVerifierErrorType;", "", "", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "code", "", "q0", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "TrustDateAfterValidity", "TrustDateBeforeValidity", "TrustServerHandshakeError", "cipher_release"}, k = 1, mv = {1, 8, 0})
public abstract class TrustVerifierErrorType extends Throwable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int code;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String message;

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J)\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/error/TrustVerifierErrorType$TrustServerHandshakeError;", "Lcom/bbva/ethermobile/help/kit/error/ResultErrorType;", "", "component1", "", "component2", "component3", SalesforceDeepLinkModelExtensionsKt.EXTRA_KEY, "code", "message", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", "Ljava/lang/String;", "getExtra", "()Ljava/lang/String;", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "r0", "getMessage", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "cipher_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class TrustServerHandshakeError extends ResultErrorType {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String extra;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        public /* synthetic */ TrustServerHandshakeError(String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? 3100 : i10, (i11 & 4) != 0 ? str == null ? "Trust server cannot be validated." : str : str2);
        }

        public static /* synthetic */ TrustServerHandshakeError copy$default(TrustServerHandshakeError trustServerHandshakeError, String str, int i10, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = trustServerHandshakeError.extra;
            }
            if ((i11 & 2) != 0) {
                i10 = trustServerHandshakeError.getCode();
            }
            if ((i11 & 4) != 0) {
                str2 = trustServerHandshakeError.getMessage();
            }
            return trustServerHandshakeError.copy(str, i10, str2);
        }

        @Nullable
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
        public final TrustServerHandshakeError copy(@Nullable String extra, int code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new TrustServerHandshakeError(extra, code, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrustServerHandshakeError)) {
                return false;
            }
            TrustServerHandshakeError trustServerHandshakeError = (TrustServerHandshakeError) other;
            return Intrinsics.areEqual(this.extra, trustServerHandshakeError.extra) && getCode() == trustServerHandshakeError.getCode() && Intrinsics.areEqual(getMessage(), trustServerHandshakeError.getMessage());
        }

        @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType
        public int getCode() {
            return this.code;
        }

        @Nullable
        public final String getExtra() {
            return this.extra;
        }

        @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.extra;
            return getMessage().hashCode() + ((getCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            int code = getCode();
            String message = getMessage();
            StringBuilder sb2 = new StringBuilder("TrustServerHandshakeError(extra=");
            sb2.append(this.extra);
            sb2.append(", code=");
            sb2.append(code);
            sb2.append(", message=");
            return d.f(sb2, message, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrustServerHandshakeError(@Nullable String str, int i10, @NotNull String message) {
            super(i10, message);
            Intrinsics.checkNotNullParameter(message, "message");
            this.extra = str;
            this.code = i10;
            this.message = message;
        }
    }

    public TrustVerifierErrorType(int i10, String str, DefaultConstructorMarker defaultConstructorMarker) {
        super(str);
        this.code = i10;
        this.message = str;
    }

    public int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0006HÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/error/TrustVerifierErrorType$TrustDateAfterValidity;", "Lcom/bbva/ethermobile/help/kit/error/ResultErrorType;", "Ljava/util/Date;", "component1", "", "component2", "", "component3", "date", "code", "message", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "r0", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "<init>", "(Ljava/util/Date;ILjava/lang/String;)V", "cipher_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class TrustDateAfterValidity extends ResultErrorType {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Date date;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ TrustDateAfterValidity(Date date, int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            i10 = (i11 & 2) != 0 ? 3101 : i10;
            if ((i11 & 4) != 0) {
                str = "Certificate expired on " + date;
            }
            this(date, i10, str);
        }

        public static /* synthetic */ TrustDateAfterValidity copy$default(TrustDateAfterValidity trustDateAfterValidity, Date date, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                date = trustDateAfterValidity.date;
            }
            if ((i11 & 2) != 0) {
                i10 = trustDateAfterValidity.getCode();
            }
            if ((i11 & 4) != 0) {
                str = trustDateAfterValidity.getMessage();
            }
            return trustDateAfterValidity.copy(date, i10, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Date getDate() {
            return this.date;
        }

        public final int component2() {
            return getCode();
        }

        @NotNull
        public final String component3() {
            return getMessage();
        }

        @NotNull
        public final TrustDateAfterValidity copy(@NotNull Date date, int code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(message, "message");
            return new TrustDateAfterValidity(date, code, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrustDateAfterValidity)) {
                return false;
            }
            TrustDateAfterValidity trustDateAfterValidity = (TrustDateAfterValidity) other;
            return Intrinsics.areEqual(this.date, trustDateAfterValidity.date) && getCode() == trustDateAfterValidity.getCode() && Intrinsics.areEqual(getMessage(), trustDateAfterValidity.getMessage());
        }

        @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType
        public int getCode() {
            return this.code;
        }

        @NotNull
        public final Date getDate() {
            return this.date;
        }

        @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return getMessage().hashCode() + ((getCode() + (this.date.hashCode() * 31)) * 31);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            int code = getCode();
            String message = getMessage();
            StringBuilder sb2 = new StringBuilder("TrustDateAfterValidity(date=");
            sb2.append(this.date);
            sb2.append(", code=");
            sb2.append(code);
            sb2.append(", message=");
            return d.f(sb2, message, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrustDateAfterValidity(@NotNull Date date, int i10, @NotNull String message) {
            super(i10, message);
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(message, "message");
            this.date = date;
            this.code = i10;
            this.message = message;
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0006HÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/error/TrustVerifierErrorType$TrustDateBeforeValidity;", "Lcom/bbva/ethermobile/help/kit/error/ResultErrorType;", "Ljava/util/Date;", "component1", "", "component2", "", "component3", "date", "code", "message", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "r0", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "<init>", "(Ljava/util/Date;ILjava/lang/String;)V", "cipher_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class TrustDateBeforeValidity extends ResultErrorType {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Date date;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ TrustDateBeforeValidity(Date date, int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            i10 = (i11 & 2) != 0 ? 3102 : i10;
            if ((i11 & 4) != 0) {
                str = "Certificate not valid until " + date;
            }
            this(date, i10, str);
        }

        public static /* synthetic */ TrustDateBeforeValidity copy$default(TrustDateBeforeValidity trustDateBeforeValidity, Date date, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                date = trustDateBeforeValidity.date;
            }
            if ((i11 & 2) != 0) {
                i10 = trustDateBeforeValidity.getCode();
            }
            if ((i11 & 4) != 0) {
                str = trustDateBeforeValidity.getMessage();
            }
            return trustDateBeforeValidity.copy(date, i10, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Date getDate() {
            return this.date;
        }

        public final int component2() {
            return getCode();
        }

        @NotNull
        public final String component3() {
            return getMessage();
        }

        @NotNull
        public final TrustDateBeforeValidity copy(@NotNull Date date, int code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(message, "message");
            return new TrustDateBeforeValidity(date, code, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrustDateBeforeValidity)) {
                return false;
            }
            TrustDateBeforeValidity trustDateBeforeValidity = (TrustDateBeforeValidity) other;
            return Intrinsics.areEqual(this.date, trustDateBeforeValidity.date) && getCode() == trustDateBeforeValidity.getCode() && Intrinsics.areEqual(getMessage(), trustDateBeforeValidity.getMessage());
        }

        @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType
        public int getCode() {
            return this.code;
        }

        @NotNull
        public final Date getDate() {
            return this.date;
        }

        @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return getMessage().hashCode() + ((getCode() + (this.date.hashCode() * 31)) * 31);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            int code = getCode();
            String message = getMessage();
            StringBuilder sb2 = new StringBuilder("TrustDateBeforeValidity(date=");
            sb2.append(this.date);
            sb2.append(", code=");
            sb2.append(code);
            sb2.append(", message=");
            return d.f(sb2, message, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrustDateBeforeValidity(@NotNull Date date, int i10, @NotNull String message) {
            super(i10, message);
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(message, "message");
            this.date = date;
            this.code = i10;
            this.message = message;
        }
    }
}
