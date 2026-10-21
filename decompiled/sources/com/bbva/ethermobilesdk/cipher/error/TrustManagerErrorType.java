package com.bbva.ethermobilesdk.cipher.error;

import ad.d;
import com.bbva.ethermobile.help.kit.error.ResultErrorType;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.extensions.SalesforceDeepLinkModelExtensionsKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Error.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b6\u0018\u00002\u00020\u0001:\u0002\u000e\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/error/TrustManagerErrorType;", "", "", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "code", "", "q0", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "TrustMangerNotAvailable", "TrustVerifierInitError", "cipher_release"}, k = 1, mv = {1, 8, 0})
public abstract class TrustManagerErrorType extends Throwable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int code;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String message;

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/error/TrustManagerErrorType$TrustMangerNotAvailable;", "Lcom/bbva/ethermobile/help/kit/error/ResultErrorType;", "", "component1", "", "component2", "code", "message", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "q0", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "cipher_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class TrustMangerNotAvailable extends ResultErrorType {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public TrustMangerNotAvailable() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ TrustMangerNotAvailable copy$default(TrustMangerNotAvailable trustMangerNotAvailable, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = trustMangerNotAvailable.getCode();
            }
            if ((i11 & 2) != 0) {
                str = trustMangerNotAvailable.getMessage();
            }
            return trustMangerNotAvailable.copy(i10, str);
        }

        public final int component1() {
            return getCode();
        }

        @NotNull
        public final String component2() {
            return getMessage();
        }

        @NotNull
        public final TrustMangerNotAvailable copy(int code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new TrustMangerNotAvailable(code, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrustMangerNotAvailable)) {
                return false;
            }
            TrustMangerNotAvailable trustMangerNotAvailable = (TrustMangerNotAvailable) other;
            return getCode() == trustMangerNotAvailable.getCode() && Intrinsics.areEqual(getMessage(), trustMangerNotAvailable.getMessage());
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
            return z1.c("TrustMangerNotAvailable(code=", getCode(), ", message=", getMessage(), ")");
        }

        public /* synthetic */ TrustMangerNotAvailable(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 3000 : i10, (i11 & 2) != 0 ? "Error initialising verifier. No X509TrustManager implementations available." : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrustMangerNotAvailable(int i10, @NotNull String message) {
            super(i10, message);
            Intrinsics.checkNotNullParameter(message, "message");
            this.code = i10;
            this.message = message;
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J)\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/error/TrustManagerErrorType$TrustVerifierInitError;", "Lcom/bbva/ethermobile/help/kit/error/ResultErrorType;", "", "component1", "", "component2", "component3", SalesforceDeepLinkModelExtensionsKt.EXTRA_KEY, "code", "message", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", "Ljava/lang/String;", "getExtra", "()Ljava/lang/String;", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "r0", "getMessage", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "cipher_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class TrustVerifierInitError extends ResultErrorType {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String extra;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        public /* synthetic */ TrustVerifierInitError(String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN : i10, (i11 & 4) != 0 ? str == null ? "Trust verifier is not available" : str : str2);
        }

        public static /* synthetic */ TrustVerifierInitError copy$default(TrustVerifierInitError trustVerifierInitError, String str, int i10, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = trustVerifierInitError.extra;
            }
            if ((i11 & 2) != 0) {
                i10 = trustVerifierInitError.getCode();
            }
            if ((i11 & 4) != 0) {
                str2 = trustVerifierInitError.getMessage();
            }
            return trustVerifierInitError.copy(str, i10, str2);
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
        public final TrustVerifierInitError copy(@Nullable String extra, int code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new TrustVerifierInitError(extra, code, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrustVerifierInitError)) {
                return false;
            }
            TrustVerifierInitError trustVerifierInitError = (TrustVerifierInitError) other;
            return Intrinsics.areEqual(this.extra, trustVerifierInitError.extra) && getCode() == trustVerifierInitError.getCode() && Intrinsics.areEqual(getMessage(), trustVerifierInitError.getMessage());
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
            StringBuilder sb2 = new StringBuilder("TrustVerifierInitError(extra=");
            sb2.append(this.extra);
            sb2.append(", code=");
            sb2.append(code);
            sb2.append(", message=");
            return d.f(sb2, message, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrustVerifierInitError(@Nullable String str, int i10, @NotNull String message) {
            super(i10, message);
            Intrinsics.checkNotNullParameter(message, "message");
            this.extra = str;
            this.code = i10;
            this.message = message;
        }
    }

    public TrustManagerErrorType(int i10, String str, DefaultConstructorMarker defaultConstructorMarker) {
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
}
