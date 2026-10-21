package com.bbva.glomohybrid.login.data.repository;

import com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoFeatureFlagDataSource;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagRepositoryExtensionKt;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CountryFidoFeatureFlagDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/login/data/repository/CountryFidoFeatureFlagDataSource;", "Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/FidoFeatureFlagDataSource;", "", "isFidoFlagEnabled", "Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;", "featureFlagsRepository", "<init>", "(Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class CountryFidoFeatureFlagDataSource implements FidoFeatureFlagDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FeatureFlagsRepository f33354a;

    public CountryFidoFeatureFlagDataSource(@NotNull FeatureFlagsRepository featureFlagsRepository) {
        Intrinsics.checkNotNullParameter(featureFlagsRepository, "featureFlagsRepository");
        this.f33354a = featureFlagsRepository;
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoFeatureFlagDataSource
    public boolean isFidoFlagEnabled() {
        return FeatureFlagRepositoryExtensionKt.isFidoFlagEnabled(this.f33354a);
    }
}
