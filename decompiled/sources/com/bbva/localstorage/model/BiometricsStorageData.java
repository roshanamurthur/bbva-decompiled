package com.bbva.localstorage.model;

import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import androidx.camera.camera2.internal.n1;
import androidx.fragment.app.FragmentActivity;
import com.bbva.biometrics.authenticator.Biometrics;
import com.bbva.biometrics.authenticator.data.AuthenticationType;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.base.handler.BiometricsIntentHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BiometricsStorageData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/bbva/localstorage/model/BiometricsStorageData;", "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroidx/fragment/app/FragmentActivity;", BiometricsIntentHandler.ID, "Lcom/bbva/biometrics/authenticator/Biometrics;", Constants.authenticationType, "Lcom/bbva/biometrics/authenticator/data/AuthenticationType;", "aliasSecureKey", "", "invalidateAliasByBiometricEnrollment", "", "(Landroidx/fragment/app/FragmentActivity;Lcom/bbva/biometrics/authenticator/Biometrics;Lcom/bbva/biometrics/authenticator/data/AuthenticationType;Ljava/lang/String;Z)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "getAliasSecureKey", "()Ljava/lang/String;", "getAuthenticationType", "()Lcom/bbva/biometrics/authenticator/data/AuthenticationType;", "getBiometrics", "()Lcom/bbva/biometrics/authenticator/Biometrics;", "getInvalidateAliasByBiometricEnrollment", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BiometricsStorageData {

    @NotNull
    private final FragmentActivity activity;

    @NotNull
    private final String aliasSecureKey;

    @NotNull
    private final AuthenticationType authenticationType;

    @NotNull
    private final Biometrics biometrics;
    private final boolean invalidateAliasByBiometricEnrollment;

    public BiometricsStorageData(@NotNull FragmentActivity activity, @NotNull Biometrics biometrics, @NotNull AuthenticationType authenticationType, @NotNull String aliasSecureKey, boolean z10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(biometrics, "biometrics");
        Intrinsics.checkNotNullParameter(authenticationType, "authenticationType");
        Intrinsics.checkNotNullParameter(aliasSecureKey, "aliasSecureKey");
        this.activity = activity;
        this.biometrics = biometrics;
        this.authenticationType = authenticationType;
        this.aliasSecureKey = aliasSecureKey;
        this.invalidateAliasByBiometricEnrollment = z10;
    }

    public static /* synthetic */ BiometricsStorageData copy$default(BiometricsStorageData biometricsStorageData, FragmentActivity fragmentActivity, Biometrics biometrics, AuthenticationType authenticationType, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fragmentActivity = biometricsStorageData.activity;
        }
        if ((i10 & 2) != 0) {
            biometrics = biometricsStorageData.biometrics;
        }
        Biometrics biometrics2 = biometrics;
        if ((i10 & 4) != 0) {
            authenticationType = biometricsStorageData.authenticationType;
        }
        AuthenticationType authenticationType2 = authenticationType;
        if ((i10 & 8) != 0) {
            str = biometricsStorageData.aliasSecureKey;
        }
        String str2 = str;
        if ((i10 & 16) != 0) {
            z10 = biometricsStorageData.invalidateAliasByBiometricEnrollment;
        }
        return biometricsStorageData.copy(fragmentActivity, biometrics2, authenticationType2, str2, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FragmentActivity getActivity() {
        return this.activity;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Biometrics getBiometrics() {
        return this.biometrics;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAliasSecureKey() {
        return this.aliasSecureKey;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getInvalidateAliasByBiometricEnrollment() {
        return this.invalidateAliasByBiometricEnrollment;
    }

    @NotNull
    public final BiometricsStorageData copy(@NotNull FragmentActivity activity, @NotNull Biometrics biometrics, @NotNull AuthenticationType authenticationType, @NotNull String aliasSecureKey, boolean invalidateAliasByBiometricEnrollment) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(biometrics, "biometrics");
        Intrinsics.checkNotNullParameter(authenticationType, "authenticationType");
        Intrinsics.checkNotNullParameter(aliasSecureKey, "aliasSecureKey");
        return new BiometricsStorageData(activity, biometrics, authenticationType, aliasSecureKey, invalidateAliasByBiometricEnrollment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometricsStorageData)) {
            return false;
        }
        BiometricsStorageData biometricsStorageData = (BiometricsStorageData) other;
        return Intrinsics.areEqual(this.activity, biometricsStorageData.activity) && Intrinsics.areEqual(this.biometrics, biometricsStorageData.biometrics) && this.authenticationType == biometricsStorageData.authenticationType && Intrinsics.areEqual(this.aliasSecureKey, biometricsStorageData.aliasSecureKey) && this.invalidateAliasByBiometricEnrollment == biometricsStorageData.invalidateAliasByBiometricEnrollment;
    }

    @NotNull
    public final FragmentActivity getActivity() {
        return this.activity;
    }

    @NotNull
    public final String getAliasSecureKey() {
        return this.aliasSecureKey;
    }

    @NotNull
    public final AuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    @NotNull
    public final Biometrics getBiometrics() {
        return this.biometrics;
    }

    public final boolean getInvalidateAliasByBiometricEnrollment() {
        return this.invalidateAliasByBiometricEnrollment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iC = n1.c(this.aliasSecureKey, (((this.biometrics.hashCode() + (this.activity.hashCode() * 31)) * 31) + this.authenticationType.hashCode()) * 31, 31);
        boolean z10 = this.invalidateAliasByBiometricEnrollment;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iC + r1;
    }

    @NotNull
    public String toString() {
        FragmentActivity fragmentActivity = this.activity;
        Biometrics biometrics = this.biometrics;
        AuthenticationType authenticationType = this.authenticationType;
        String str = this.aliasSecureKey;
        boolean z10 = this.invalidateAliasByBiometricEnrollment;
        StringBuilder sb2 = new StringBuilder("BiometricsStorageData(activity=");
        sb2.append(fragmentActivity);
        sb2.append(", biometrics=");
        sb2.append(biometrics);
        sb2.append(", authenticationType=");
        sb2.append(authenticationType);
        sb2.append(", aliasSecureKey=");
        sb2.append(str);
        sb2.append(", invalidateAliasByBiometricEnrollment=");
        return i.c(sb2, z10, ")");
    }
}
