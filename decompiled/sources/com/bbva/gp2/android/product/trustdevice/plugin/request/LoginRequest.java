package com.bbva.gp2.android.product.trustdevice.plugin.request;

import ad.d;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bbva/gp2/android/product/trustdevice/plugin/request/LoginRequest;", "", "pkcs7", "", "(Ljava/lang/String;)V", "getPkcs7", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "payments-trustdevice-plugin_release"}, k = 1, mv = {1, 1, 16})
public final /* data */ class LoginRequest {

    @NotNull
    private final String pkcs7;

    public LoginRequest(@NotNull String str) {
        this.pkcs7 = str;
    }

    public static /* synthetic */ LoginRequest copy$default(LoginRequest loginRequest, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = loginRequest.pkcs7;
        }
        return loginRequest.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPkcs7() {
        return this.pkcs7;
    }

    @NotNull
    public final LoginRequest copy(@NotNull String pkcs7) {
        return new LoginRequest(pkcs7);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof LoginRequest) && Intrinsics.areEqual(this.pkcs7, ((LoginRequest) other).pkcs7);
        }
        return true;
    }

    @NotNull
    public final String getPkcs7() {
        return this.pkcs7;
    }

    public int hashCode() {
        String str = this.pkcs7;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return d.f(new StringBuilder("LoginRequest(pkcs7="), this.pkcs7, ")");
    }
}
