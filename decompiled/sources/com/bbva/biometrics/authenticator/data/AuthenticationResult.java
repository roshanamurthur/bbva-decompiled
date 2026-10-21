package com.bbva.biometrics.authenticator.data;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mypinpad.tsdk.isolation.y2;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AuthenticationResult.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/bbva/biometrics/authenticator/data/AuthenticationResult;", "", "()V", "Error", "Failed", "Success", "Lcom/bbva/biometrics/authenticator/data/AuthenticationResult$Success;", "Lcom/bbva/biometrics/authenticator/data/AuthenticationResult$Error;", "Lcom/bbva/biometrics/authenticator/data/AuthenticationResult$Failed;", "biometrics_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class AuthenticationResult {

    /* JADX INFO: compiled from: AuthenticationResult.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/biometrics/authenticator/data/AuthenticationResult$Error;", "Lcom/bbva/biometrics/authenticator/data/AuthenticationResult;", "", "component1", "", "component2", "code", "message", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "biometrics_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Error extends AuthenticationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(int i10, @NotNull String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.code = i10;
            this.message = message;
        }

        public static /* synthetic */ Error copy$default(Error error, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = error.code;
            }
            if ((i11 & 2) != 0) {
                str = error.message;
            }
            return error.copy(i10, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final Error copy(int code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Error(code, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return this.code == error.code && Intrinsics.areEqual(this.message, error.message);
        }

        public final int getCode() {
            return this.code;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode() + (this.code * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Error(code=");
            sb2.append(this.code);
            sb2.append(", message=");
            return y2.b(sb2, this.message, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: AuthenticationResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/biometrics/authenticator/data/AuthenticationResult$Failed;", "Lcom/bbva/biometrics/authenticator/data/AuthenticationResult;", "()V", "biometrics_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Failed extends AuthenticationResult {

        @NotNull
        public static final Failed INSTANCE = new Failed();

        public Failed() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: AuthenticationResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/biometrics/authenticator/data/AuthenticationResult$Success;", "Lcom/bbva/biometrics/authenticator/data/AuthenticationResult;", "Ljavax/crypto/Cipher;", "a", "Ljavax/crypto/Cipher;", "getCipher", "()Ljavax/crypto/Cipher;", "cipher", "<init>", "(Ljavax/crypto/Cipher;)V", "biometrics_release"}, k = 1, mv = {1, 5, 1})
    public static final class Success extends AuthenticationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Cipher cipher;

        public Success(@Nullable Cipher cipher) {
            super(null);
            this.cipher = cipher;
        }

        @Nullable
        public final Cipher getCipher() {
            return this.cipher;
        }
    }

    public AuthenticationResult() {
    }

    public /* synthetic */ AuthenticationResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
