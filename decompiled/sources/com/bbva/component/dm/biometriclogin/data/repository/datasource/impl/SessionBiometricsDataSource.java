package com.bbva.component.dm.biometriclogin.data.repository.datasource.impl;

import com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource;
import com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoSettingsAdapter;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthState;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SessionBiometricsDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$R\"\u0010\t\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0018\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR$\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006%"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/impl/SessionBiometricsDataSource;", "Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/BiometricDatasource;", "", "b", "Z", "getShouldShowAuthenticator", "()Z", "setShouldShowAuthenticator", "(Z)V", "shouldShowAuthenticator", "", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSkippedTimes", "()I", "setSkippedTimes", "(I)V", "skippedTimes", "d", "isDeviceBiometricsEnabled", "setDeviceBiometricsEnabled", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;", "e", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;", "isBiometricAvailable", "()Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;", "setBiometricAvailable", "(Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;)V", "value", "isBiometricAccessEnabled", "setBiometricAccessEnabled", "isFidoEnrolled", "setFidoEnrolled", "Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/FidoSettingsAdapter;", "fidoSettingsAdapter", "<init>", "(Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/FidoSettingsAdapter;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class SessionBiometricsDataSource implements BiometricDatasource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FidoSettingsAdapter f27461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean shouldShowAuthenticator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int skippedTimes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isDeviceBiometricsEnabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public BiometryAuthState isBiometricAvailable;

    public SessionBiometricsDataSource(@NotNull FidoSettingsAdapter fidoSettingsAdapter) {
        Intrinsics.checkNotNullParameter(fidoSettingsAdapter, "fidoSettingsAdapter");
        this.f27461a = fidoSettingsAdapter;
        this.shouldShowAuthenticator = true;
        this.isBiometricAvailable = new BiometryAuthState.NotAvailable(null, 1, null);
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource
    public boolean getShouldShowAuthenticator() {
        return this.shouldShowAuthenticator;
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource
    public int getSkippedTimes() {
        return this.skippedTimes;
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource
    public boolean isBiometricAccessEnabled() {
        return this.f27461a.isAccessEnabled();
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource
    @NotNull
    /* JADX INFO: renamed from: isBiometricAvailable, reason: from getter */
    public BiometryAuthState getIsBiometricAvailable() {
        return this.isBiometricAvailable;
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource
    /* JADX INFO: renamed from: isDeviceBiometricsEnabled, reason: from getter */
    public boolean getIsDeviceBiometricsEnabled() {
        return this.isDeviceBiometricsEnabled;
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource
    public boolean isFidoEnrolled() {
        return this.f27461a.isFidoEnrolled();
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource
    public void setBiometricAccessEnabled(boolean z10) {
        this.f27461a.setAccessEnabled(z10);
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource
    public void setBiometricAvailable(@NotNull BiometryAuthState biometryAuthState) {
        Intrinsics.checkNotNullParameter(biometryAuthState, "<set-?>");
        this.isBiometricAvailable = biometryAuthState;
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource
    public void setDeviceBiometricsEnabled(boolean z10) {
        this.isDeviceBiometricsEnabled = z10;
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource
    public void setFidoEnrolled(boolean z10) {
        this.f27461a.setFidoEnrolled(z10);
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource
    public void setShouldShowAuthenticator(boolean z10) {
        this.shouldShowAuthenticator = z10;
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource
    public void setSkippedTimes(int i10) {
        this.skippedTimes = i10;
    }
}
