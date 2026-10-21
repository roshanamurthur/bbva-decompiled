package com.bbva.component.dm.biometriclogin.data.repository.datasource;

import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BiometricDatasource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\bX¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0004\"\u0004\b\r\u0010\u0006R\u0018\u0010\u000e\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0004\"\u0004\b\u000f\u0010\u0006R\u0018\u0010\u0010\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0004\"\u0004\b\u0012\u0010\u0006R\u0018\u0010\u0013\u001a\u00020\u0014X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/BiometricDatasource;", "", "isBiometricAccessEnabled", "", "()Z", "setBiometricAccessEnabled", "(Z)V", "isBiometricAvailable", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;", "()Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;", "setBiometricAvailable", "(Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;)V", "isDeviceBiometricsEnabled", "setDeviceBiometricsEnabled", "isFidoEnrolled", "setFidoEnrolled", "shouldShowAuthenticator", "getShouldShowAuthenticator", "setShouldShowAuthenticator", "skippedTimes", "", "getSkippedTimes", "()I", "setSkippedTimes", "(I)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface BiometricDatasource {
    boolean getShouldShowAuthenticator();

    int getSkippedTimes();

    boolean isBiometricAccessEnabled();

    @NotNull
    BiometryAuthState isBiometricAvailable();

    boolean isDeviceBiometricsEnabled();

    boolean isFidoEnrolled();

    void setBiometricAccessEnabled(boolean z10);

    void setBiometricAvailable(@NotNull BiometryAuthState biometryAuthState);

    void setDeviceBiometricsEnabled(boolean z10);

    void setFidoEnrolled(boolean z10);

    void setShouldShowAuthenticator(boolean z10);

    void setSkippedTimes(int i10);
}
