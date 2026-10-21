package com.bbva.plugin.localstorage.params;

import androidx.annotation.Keep;
import com.bbva.biometrics.authenticator.data.AuthenticationType;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.plugin.localstorage.extension.StringKt;
import com.bbva.plugin.localstorage.util.ConstantKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetSetSecureParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0011\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\b\u0010\u0018\u001a\u00020\u0006H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/bbva/plugin/localstorage/params/GetSetSecureParams;", "Lcom/bbva/plugin/localstorage/params/MalformedParams;", "key", "", Constants.authenticationType, "invalidateAliasByBiometricEnrollment", "", "biometricTitle", "biometricSubtitle", "biometricDescription", "biometricNegativeButton", "biometricConfirmation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAuthenticationType", "()Ljava/lang/String;", "getBiometricConfirmation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBiometricDescription", "getBiometricNegativeButton", "getBiometricSubtitle", "getBiometricTitle", "getInvalidateAliasByBiometricEnrollment", "getKey", "isMalformed", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class GetSetSecureParams implements MalformedParams {

    @Nullable
    private final String authenticationType;

    @Nullable
    private final Boolean biometricConfirmation;

    @Nullable
    private final String biometricDescription;

    @Nullable
    private final String biometricNegativeButton;

    @Nullable
    private final String biometricSubtitle;

    @Nullable
    private final String biometricTitle;

    @Nullable
    private final Boolean invalidateAliasByBiometricEnrollment;

    @Nullable
    private final String key;

    public GetSetSecureParams() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Nullable
    public final String getAuthenticationType() {
        return this.authenticationType;
    }

    @Nullable
    public final Boolean getBiometricConfirmation() {
        return this.biometricConfirmation;
    }

    @Nullable
    public final String getBiometricDescription() {
        return this.biometricDescription;
    }

    @Nullable
    public final String getBiometricNegativeButton() {
        return this.biometricNegativeButton;
    }

    @Nullable
    public final String getBiometricSubtitle() {
        return this.biometricSubtitle;
    }

    @Nullable
    public final String getBiometricTitle() {
        return this.biometricTitle;
    }

    @Nullable
    public final Boolean getInvalidateAliasByBiometricEnrollment() {
        return this.invalidateAliasByBiometricEnrollment;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Override // com.bbva.plugin.localstorage.params.MalformedParams
    public boolean isMalformed() {
        String str;
        String str2;
        String str3 = this.key;
        return str3 == null || str3.length() == 0 || StringKt.isAuthenticationTypeMalformed(this.authenticationType) || (str = this.biometricTitle) == null || str.length() == 0 || (str2 = this.biometricNegativeButton) == null || str2.length() == 0 || this.invalidateAliasByBiometricEnrollment == null;
    }

    public GetSetSecureParams(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool2) {
        this.key = str;
        this.authenticationType = str2;
        this.invalidateAliasByBiometricEnrollment = bool;
        this.biometricTitle = str3;
        this.biometricSubtitle = str4;
        this.biometricDescription = str5;
        this.biometricNegativeButton = str6;
        this.biometricConfirmation = bool2;
    }

    public /* synthetic */ GetSetSecureParams(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, Boolean bool2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? AuthenticationType.STRONG.name() : str2, (i10 & 4) != 0 ? Boolean.FALSE : bool, (i10 & 8) != 0 ? ConstantKt.BIOMETRIC_TITLE : str3, (i10 & 16) != 0 ? "" : str4, (i10 & 32) == 0 ? str5 : "", (i10 & 64) != 0 ? ConstantKt.BIOMETRIC_NEGATIVE_BUTTON : str6, (i10 & 128) != 0 ? Boolean.FALSE : bool2);
    }
}
