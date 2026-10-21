package com.bbva.plugin.localstorage.params;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.plugin.localstorage.extension.StringKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SetSecureParam.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\nH\u0016J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/bbva/plugin/localstorage/params/SetSecureParam;", "Lcom/bbva/plugin/localstorage/params/GetSetSecureParams;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "isMalformed", "toString", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SetSecureParam extends GetSetSecureParams {

    @Nullable
    private final String value;

    /* JADX WARN: Multi-variable type inference failed */
    public SetSecureParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SetSecureParam copy$default(SetSecureParam setSecureParam, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = setSecureParam.value;
        }
        return setSecureParam.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final SetSecureParam copy(@Nullable String value) {
        return new SetSecureParam(value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SetSecureParam) && Intrinsics.areEqual(this.value, ((SetSecureParam) other).value);
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.bbva.plugin.localstorage.params.GetSetSecureParams, com.bbva.plugin.localstorage.params.MalformedParams
    public boolean isMalformed() {
        String biometricTitle;
        String biometricNegativeButton;
        String str;
        String key = getKey();
        return key == null || key.length() == 0 || StringKt.isAuthenticationTypeMalformed(getAuthenticationType()) || (biometricTitle = getBiometricTitle()) == null || biometricTitle.length() == 0 || (biometricNegativeButton = getBiometricNegativeButton()) == null || biometricNegativeButton.length() == 0 || getInvalidateAliasByBiometricEnrollment() == null || (str = this.value) == null || str.length() == 0;
    }

    @NotNull
    public String toString() {
        return h0.b("SetSecureParam(value=", this.value, ")");
    }

    public /* synthetic */ SetSecureParam(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }

    public SetSecureParam(@Nullable String str) {
        super(null, null, null, null, null, null, null, null, 255, null);
        this.value = str;
    }
}
