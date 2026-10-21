package com.bbva.component.dm.biometriclogin.domain.usecase;

import com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource;
import com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoFeatureFlagDataSource;
import com.bbva.glomoutils.usecase.UseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetIsBiometricAccessEnabledUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/usecase/GetIsBiometricAccessEnabledUseCase;", "Lcom/bbva/glomoutils/usecase/UseCase;", "", "execute", "()Ljava/lang/Boolean;", "Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/BiometricDatasource;", "biometricDataSource", "Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/FidoFeatureFlagDataSource;", "fidoFeatureFlagDataSource", "<init>", "(Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/BiometricDatasource;Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/FidoFeatureFlagDataSource;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class GetIsBiometricAccessEnabledUseCase implements UseCase<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final BiometricDatasource f27495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FidoFeatureFlagDataSource f27496b;

    public GetIsBiometricAccessEnabledUseCase(@Nullable BiometricDatasource biometricDatasource, @NotNull FidoFeatureFlagDataSource fidoFeatureFlagDataSource) {
        Intrinsics.checkNotNullParameter(fidoFeatureFlagDataSource, "fidoFeatureFlagDataSource");
        this.f27495a = biometricDatasource;
        this.f27496b = fidoFeatureFlagDataSource;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bbva.glomoutils.usecase.UseCase
    @NotNull
    public Boolean execute() {
        boolean z10 = false;
        BiometricDatasource biometricDatasource = this.f27495a;
        boolean zIsBiometricAccessEnabled = biometricDatasource != null ? biometricDatasource.isBiometricAccessEnabled() : false;
        boolean zIsDeviceBiometricsEnabled = biometricDatasource != null ? biometricDatasource.isDeviceBiometricsEnabled() : false;
        boolean zIsFidoFlagEnabled = this.f27496b.isFidoFlagEnabled();
        if (zIsBiometricAccessEnabled && zIsDeviceBiometricsEnabled && zIsFidoFlagEnabled) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
