package com.bbva.glomoconfig.login.configurator;

import bk.d;
import bk.p;
import bk.q;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomoconfig.GlobalConfig;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CustomerDataManagerPropertiesDefault.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0004J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\u0005H\u0004¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomoconfig/login/configurator/CustomerDataManagerPropertiesDefault;", "Lcom/bbva/glomoconfig/login/configurator/CustomerDataManagerProperties;", "Lcom/bbva/glomo/user/domain/model/UserType;", "usertype", "", "", "", "config", "defaultConfig", "host", "configHost", "Lcom/bbva/glomoconfig/GlobalConfig;", CryptoServicesPermission.GLOBAL_CONFIG, "<init>", "(Lcom/bbva/glomoconfig/GlobalConfig;)V", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public class CustomerDataManagerPropertiesDefault implements CustomerDataManagerProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final GlobalConfig f30947a;

    public CustomerDataManagerPropertiesDefault(@NotNull GlobalConfig globalConfig) {
        Intrinsics.checkNotNullParameter(globalConfig, "globalConfig");
        this.f30947a = globalConfig;
    }

    @Override // com.bbva.glomoconfig.login.configurator.CustomerDataManagerProperties
    @NotNull
    public Map<String, Object> config(@NotNull UserType usertype) {
        Intrinsics.checkNotNullParameter(usertype, "usertype");
        return defaultConfig();
    }

    @NotNull
    public final Map<String, Object> configHost(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return p.mapOf(TuplesKt.to("config", q.mapOf(TuplesKt.to("host", host), TuplesKt.to("version", ConfigConstantsKt.CUSTOMERS_API_VERSION), TuplesKt.to("expand", p.mapOf(TuplesKt.to("customer", d.listOf(ConfigConstantsKt.CUSTOMERS_EXPAND)))))));
    }

    @NotNull
    public final Map<String, Object> defaultConfig() {
        GlobalConfig globalConfig = this.f30947a;
        return configHost(globalConfig.getHost() + globalConfig.namedPath("customerSubPath"));
    }
}
