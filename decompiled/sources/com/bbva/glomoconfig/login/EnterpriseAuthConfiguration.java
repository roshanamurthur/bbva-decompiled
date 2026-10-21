package com.bbva.glomoconfig.login;

import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.bbva.glomoconfig.login.configurator.Configurator;
import com.bbva.glomoconfig.login.configurator.GlobalSSOConfigurator;
import com.bbva.glomoconfig.login.type.LoginType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EnterpriseAuthConfiguration.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J\u0016\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J\u001e\u0010\b\u001a\u00020\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomoconfig/login/EnterpriseAuthConfiguration;", "Lcom/bbva/glomoconfig/login/AuthConfiguration;", "", "", "", "generateAuthConfig", "generateSSOAuthConfig", "authConfiguration", "configuredHost", "Lcom/bbva/glomoconfig/login/type/LoginType;", "type", "Lcom/bbva/glomoconfig/login/configurator/Configurator;", "configurators", "<init>", "(Lcom/bbva/glomoconfig/login/type/LoginType;Ljava/util/Map;)V", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public class EnterpriseAuthConfiguration extends AuthConfiguration {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LoginType f30940b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterpriseAuthConfiguration(@NotNull LoginType type, @NotNull Map<String, ? extends Configurator> configurators) {
        super(configurators);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(configurators, "configurators");
        this.f30940b = type;
    }

    @Override // com.bbva.glomoconfig.login.AuthConfiguration
    @NotNull
    public String configuredHost(@NotNull Map<String, ? extends Object> authConfiguration) {
        String str;
        Intrinsics.checkNotNullParameter(authConfiguration, "authConfiguration");
        Object obj = authConfiguration.get("gema");
        if (obj != null) {
            Object obj2 = ((Map) obj).get("host");
            if (obj2 != null) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                str = (String) obj2;
            } else {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    @Override // com.bbva.glomoconfig.login.AuthConfiguration
    @NotNull
    public Map<String, Object> generateAuthConfig() {
        return getConfig(getId(this.f30940b), ConfigConstantsKt.DEFAULT_GEMA_CONSUMER_ID);
    }

    @Override // com.bbva.glomoconfig.login.AuthConfiguration
    @NotNull
    public Map<String, Object> generateSSOAuthConfig() {
        return getConfig(GlobalSSOConfigurator.ID, ConfigConstantsKt.DEFAULT_GEMA_CONSUMER_ID);
    }
}
