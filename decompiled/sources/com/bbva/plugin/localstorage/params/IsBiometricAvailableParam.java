package com.bbva.plugin.localstorage.params;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.h0;
import com.bbva.biometrics.authenticator.data.AuthenticationType;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.plugin.localstorage.extension.StringKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IsBiometricAvailableParam.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\nH\u0016J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/bbva/plugin/localstorage/params/IsBiometricAvailableParam;", "Lcom/bbva/plugin/localstorage/params/MalformedParams;", Constants.authenticationType, "", "(Ljava/lang/String;)V", "getAuthenticationType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "isMalformed", "toString", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class IsBiometricAvailableParam implements MalformedParams {

    @Nullable
    private final String authenticationType;

    /* JADX WARN: Multi-variable type inference failed */
    public IsBiometricAvailableParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ IsBiometricAvailableParam copy$default(IsBiometricAvailableParam isBiometricAvailableParam, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = isBiometricAvailableParam.authenticationType;
        }
        return isBiometricAvailableParam.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthenticationType() {
        return this.authenticationType;
    }

    @NotNull
    public final IsBiometricAvailableParam copy(@Nullable String authenticationType) {
        return new IsBiometricAvailableParam(authenticationType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IsBiometricAvailableParam) && Intrinsics.areEqual(this.authenticationType, ((IsBiometricAvailableParam) other).authenticationType);
    }

    @Nullable
    public final String getAuthenticationType() {
        return this.authenticationType;
    }

    public int hashCode() {
        String str = this.authenticationType;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.bbva.plugin.localstorage.params.MalformedParams
    public boolean isMalformed() {
        return StringKt.isAuthenticationTypeMalformed(this.authenticationType);
    }

    @NotNull
    public String toString() {
        return h0.b("IsBiometricAvailableParam(authenticationType=", this.authenticationType, ")");
    }

    public IsBiometricAvailableParam(@Nullable String str) {
        this.authenticationType = str;
    }

    public /* synthetic */ IsBiometricAvailableParam(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AuthenticationType.STRONG.name() : str);
    }
}
