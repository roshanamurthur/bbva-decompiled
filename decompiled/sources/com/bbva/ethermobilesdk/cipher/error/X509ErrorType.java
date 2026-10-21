package com.bbva.ethermobilesdk.cipher.error;

import com.bbva.ethermobile.help.kit.error.ResultErrorType;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Error.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b6\u0018\u00002\u00020\u0001:\u0002\u000e\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/error/X509ErrorType;", "", "", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "code", "", "q0", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "InvalidX509Certificate", "X509Empty", "cipher_release"}, k = 1, mv = {1, 8, 0})
public abstract class X509ErrorType extends Throwable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int code;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String message;

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/error/X509ErrorType$InvalidX509Certificate;", "Lcom/bbva/ethermobile/help/kit/error/ResultErrorType;", "", "component1", "", "component2", "code", "message", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "q0", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "cipher_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class InvalidX509Certificate extends ResultErrorType {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public InvalidX509Certificate() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ InvalidX509Certificate copy$default(InvalidX509Certificate invalidX509Certificate, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = invalidX509Certificate.getCode();
            }
            if ((i11 & 2) != 0) {
                str = invalidX509Certificate.getMessage();
            }
            return invalidX509Certificate.copy(i10, str);
        }

        public final int component1() {
            return getCode();
        }

        @NotNull
        public final String component2() {
            return getMessage();
        }

        @NotNull
        public final InvalidX509Certificate copy(int code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new InvalidX509Certificate(code, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InvalidX509Certificate)) {
                return false;
            }
            InvalidX509Certificate invalidX509Certificate = (InvalidX509Certificate) other;
            return getCode() == invalidX509Certificate.getCode() && Intrinsics.areEqual(getMessage(), invalidX509Certificate.getMessage());
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
            return z1.c("InvalidX509Certificate(code=", getCode(), ", message=", getMessage(), ")");
        }

        public /* synthetic */ InvalidX509Certificate(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 3201 : i10, (i11 & 2) != 0 ? "Invalid certificate data." : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidX509Certificate(int i10, @NotNull String message) {
            super(i10, message);
            Intrinsics.checkNotNullParameter(message, "message");
            this.code = i10;
            this.message = message;
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/error/X509ErrorType$X509Empty;", "Lcom/bbva/ethermobile/help/kit/error/ResultErrorType;", "", "component1", "", "component2", "code", "message", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "q0", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "cipher_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class X509Empty extends ResultErrorType {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public X509Empty() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ X509Empty copy$default(X509Empty x509Empty, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = x509Empty.getCode();
            }
            if ((i11 & 2) != 0) {
                str = x509Empty.getMessage();
            }
            return x509Empty.copy(i10, str);
        }

        public final int component1() {
            return getCode();
        }

        @NotNull
        public final String component2() {
            return getMessage();
        }

        @NotNull
        public final X509Empty copy(int code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new X509Empty(code, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof X509Empty)) {
                return false;
            }
            X509Empty x509Empty = (X509Empty) other;
            return getCode() == x509Empty.getCode() && Intrinsics.areEqual(getMessage(), x509Empty.getMessage());
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
            return z1.c("X509Empty(code=", getCode(), ", message=", getMessage(), ")");
        }

        public /* synthetic */ X509Empty(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 3200 : i10, (i11 & 2) != 0 ? "Certificate is empty." : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public X509Empty(int i10, @NotNull String message) {
            super(i10, message);
            Intrinsics.checkNotNullParameter(message, "message");
            this.code = i10;
            this.message = message;
        }
    }

    public X509ErrorType(int i10, String str, DefaultConstructorMarker defaultConstructorMarker) {
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
