package com.bbva.glomoconfig.login.configurator;

import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.bbva.glomoconfig.login.EnterpriseAuthConfiguration;
import com.bbva.glomoconfig.login.type.LoginType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CountryEnterpriseAuthConfiguration.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomoconfig/login/configurator/CountryEnterpriseAuthConfiguration;", "Lcom/bbva/glomoconfig/login/EnterpriseAuthConfiguration;", "type", "Lcom/bbva/glomoconfig/login/type/LoginType;", "configurators", "", "", "Lcom/bbva/glomoconfig/login/configurator/Configurator;", "(Lcom/bbva/glomoconfig/login/type/LoginType;Ljava/util/Map;)V", "generateSSOAuthConfig", "", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CountryEnterpriseAuthConfiguration extends EnterpriseAuthConfiguration {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryEnterpriseAuthConfiguration(@NotNull LoginType type, @NotNull Map<String, ? extends Configurator> configurators) {
        super(type, configurators);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(configurators, "configurators");
    }

    @Override // com.bbva.glomoconfig.login.EnterpriseAuthConfiguration, com.bbva.glomoconfig.login.AuthConfiguration
    @NotNull
    public Map<String, Object> generateSSOAuthConfig() {
        return getConfig(SsoConfigurator.ID, ConfigConstantsKt.DEFAULT_GEMA_CONSUMER_ID);
    }
}
