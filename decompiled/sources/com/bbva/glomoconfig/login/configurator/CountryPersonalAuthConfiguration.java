package com.bbva.glomoconfig.login.configurator;

import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.bbva.glomoconfig.login.PersonalAuthConfiguration;
import com.bbva.glomoconfig.login.type.LoginType;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagRepositoryExtensionKt;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CountryPersonalAuthConfiguration.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomoconfig/login/configurator/CountryPersonalAuthConfiguration;", "Lcom/bbva/glomoconfig/login/PersonalAuthConfiguration;", "", "", "", "generateAuthConfig", "Lcom/bbva/glomoconfig/login/type/LoginType;", "type", "Lcom/bbva/glomoconfig/login/configurator/Configurator;", "configurators", "Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;", "featureFlagsRepository", "<init>", "(Lcom/bbva/glomoconfig/login/type/LoginType;Ljava/util/Map;Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;)V", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class CountryPersonalAuthConfiguration extends PersonalAuthConfiguration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LoginType f30945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f30946d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryPersonalAuthConfiguration(@NotNull LoginType type, @NotNull Map<String, ? extends Configurator> configurators, @NotNull FeatureFlagsRepository featureFlagsRepository) {
        super(type, configurators);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(configurators, "configurators");
        Intrinsics.checkNotNullParameter(featureFlagsRepository, "featureFlagsRepository");
        this.f30945c = type;
        this.f30946d = FeatureFlagRepositoryExtensionKt.isStandInEnabled(featureFlagsRepository);
    }

    @Override // com.bbva.glomoconfig.login.PersonalAuthConfiguration, com.bbva.glomoconfig.login.AuthConfiguration
    @NotNull
    public Map<String, Object> generateAuthConfig() {
        return getConfig(getId(this.f30945c), this.f30946d ? ConfigConstantsKt.GLOMO_CONSUMER_ID_STAND_IN : ConfigConstantsKt.GLOMO_CONSUMER_ID);
    }
}
