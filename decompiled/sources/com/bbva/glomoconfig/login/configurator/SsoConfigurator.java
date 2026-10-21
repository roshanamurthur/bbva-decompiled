package com.bbva.glomoconfig.login.configurator;

import bk.p;
import bk.q;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.glomohybrid.cellsweb.presentation.usecase.CountryConfigureWebPrivateProfileUseCase;
import com.bbva.glomoutils.mappable.MappableEngineKt;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SsoConfigurator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/glomoconfig/login/configurator/SsoConfigurator;", "Lcom/bbva/glomoconfig/login/configurator/Configurator;", "", "consumerId", "", "", "config", "Lcom/bbva/glomoconfig/login/configurator/GlobalConfigurator;", GlobalConfigurator.ID, "<init>", "(Lcom/bbva/glomoconfig/login/configurator/GlobalConfigurator;)V", "Companion", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class SsoConfigurator implements Configurator {

    @NotNull
    public static final String ID = "ssoConfiguratorMx";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final GlobalConfigurator f30954a;

    public SsoConfigurator(@NotNull GlobalConfigurator globalConfigurator) {
        Intrinsics.checkNotNullParameter(globalConfigurator, "globalConfigurator");
        this.f30954a = globalConfigurator;
    }

    @Override // com.bbva.glomoconfig.login.configurator.Configurator
    @NotNull
    public Map<String, Object> config(@NotNull String consumerId) {
        Map mapEmptyMap;
        Intrinsics.checkNotNullParameter(consumerId, "consumerId");
        Object obj = this.f30954a.config(consumerId).get("config");
        Map<String, Object> map = obj != null ? MappableEngineKt.toMap(obj) : null;
        if (map == null || (mapEmptyMap = q.plus(map, q.mapOf(TuplesKt.to(Constants.idAuthenticationData, "firma-pkcs7"), TuplesKt.to(Constants.authenticationType, "53"), TuplesKt.to("usernameCode", CountryConfigureWebPrivateProfileUseCase.SUBSTRING_REMOVE), TuplesKt.to("usernameBehaviour", DynamicLink.Builder.KEY_SUFFIX)))) == null) {
            mapEmptyMap = q.emptyMap();
        }
        return p.mapOf(TuplesKt.to("config", mapEmptyMap));
    }
}
