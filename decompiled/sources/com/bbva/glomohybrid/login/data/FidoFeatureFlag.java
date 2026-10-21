package com.bbva.glomohybrid.login.data;

import com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoFeatureFlagDataSource;
import com.bbva.glomohybrid.featureflags.domain.flags.LoginNativeFlags;
import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import com.bbva.glomohybrid.featureflags.domain.model.StorePolicy;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FidoFeatureFlag.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/login/data/FidoFeatureFlag;", "Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/FidoFeatureFlagDataSource;", "", "isFidoFlagEnabled", "Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;", "featureFlagsRepository", "", "version", "<init>", "(Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;Ljava/lang/String;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class FidoFeatureFlag implements FidoFeatureFlagDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FeatureFlagsRepository f33322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f33323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f33324c;

    /* JADX INFO: compiled from: FidoFeatureFlag.kt */
    public static final class a extends Lambda implements Function0<Map<String, ? extends List<? extends String>>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends List<? extends String>> invoke() {
            FeatureFlags featureFlags = FidoFeatureFlag.this.f33322a.get(StorePolicy.Local);
            if (featureFlags != null) {
                return featureFlags.getDisabledFeatureFlags();
            }
            return null;
        }
    }

    public FidoFeatureFlag(@NotNull FeatureFlagsRepository featureFlagsRepository, @NotNull String version) {
        Intrinsics.checkNotNullParameter(featureFlagsRepository, "featureFlagsRepository");
        Intrinsics.checkNotNullParameter(version, "version");
        this.f33322a = featureFlagsRepository;
        this.f33323b = version;
        this.f33324c = LazyKt__LazyJVMKt.lazy(new a());
    }

    @Override // com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoFeatureFlagDataSource
    public boolean isFidoFlagEnabled() {
        Map map = (Map) this.f33324c.getValue();
        List list = map != null ? (List) map.get(LoginNativeFlags.LOGIN_FIDO_STATE.getValue()) : null;
        return (list == null || list.contains(this.f33323b)) ? false : true;
    }
}
