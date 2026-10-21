package com.bbva.glomoconfig.login.configurator;

import bk.q;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.bbva.glomoconfig.login.AuthConfiguration;
import com.bbva.glomoconfig.login.type.LoginType;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagRepositoryExtensionKt;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CountryAuthConfiguration.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J\u0016\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J\u001e\u0010\b\u001a\u00020\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomoconfig/login/configurator/CountryAuthConfiguration;", "Lcom/bbva/glomoconfig/login/AuthConfiguration;", "", "", "", "generateAuthConfig", "generateSSOAuthConfig", "authConfiguration", "configuredHost", "Lcom/bbva/glomoconfig/login/type/LoginType;", "type", "Lcom/bbva/glomoconfig/login/configurator/Configurator;", "configurators", "Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;", "featureFlagsRepository", "<init>", "(Lcom/bbva/glomoconfig/login/type/LoginType;Ljava/util/Map;Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;)V", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class CountryAuthConfiguration extends AuthConfiguration {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LoginType f30942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f30944d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryAuthConfiguration(@NotNull LoginType type, @NotNull Map<String, ? extends Configurator> configurators, @NotNull FeatureFlagsRepository featureFlagsRepository) {
        super(configurators);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(configurators, "configurators");
        Intrinsics.checkNotNullParameter(featureFlagsRepository, "featureFlagsRepository");
        this.f30942b = type;
        this.f30943c = FeatureFlagRepositoryExtensionKt.isStandInEnabled(featureFlagsRepository);
        this.f30944d = FeatureFlagRepositoryExtensionKt.isLowCostDisabled(featureFlagsRepository);
    }

    @Override // com.bbva.glomoconfig.login.AuthConfiguration
    @NotNull
    public String configuredHost(@NotNull Map<String, ? extends Object> authConfiguration) {
        Intrinsics.checkNotNullParameter(authConfiguration, "authConfiguration");
        Object obj = authConfiguration.get("config");
        Map map = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map != null ? map.get("host") : null;
        String str = obj2 instanceof String ? (String) obj2 : null;
        return str == null ? "" : str;
    }

    @Override // com.bbva.glomoconfig.login.AuthConfiguration
    @NotNull
    public Map<String, Object> generateAuthConfig() {
        String str;
        if (this.f30943c) {
            str = ConfigConstantsKt.GLOMO_CONSUMER_ID_STAND_IN;
        } else {
            str = this.f30944d ? ConfigConstantsKt.GLOMO_CONSUMER_ID_LOWCOST_DISABLED : ConfigConstantsKt.GLOMO_CONSUMER_ID;
        }
        return getConfig(getId(this.f30942b), str);
    }

    @Override // com.bbva.glomoconfig.login.AuthConfiguration
    @NotNull
    public Map<String, Object> generateSSOAuthConfig() {
        return q.emptyMap();
    }
}
