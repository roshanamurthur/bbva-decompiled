package com.bbva.glomoconfig.login.configurator;

import bk.q;
import com.bbva.component.dm.headers.interceptor.AccessToken;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JWTConfigurator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/glomoconfig/login/configurator/JWTConfigurator;", "Lcom/bbva/glomoconfig/login/configurator/Configurator;", "", "consumerId", "", "", "config", "host", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class JWTConfigurator implements Configurator {

    @NotNull
    public static final String ID = "jwtConfigurator";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f30952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f30953b;

    public JWTConfigurator(@NotNull String host, @NotNull String path) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        this.f30952a = host;
        this.f30953b = path;
    }

    @Override // com.bbva.glomoconfig.login.configurator.Configurator
    @NotNull
    public Map<String, Object> config(@NotNull String consumerId) {
        Intrinsics.checkNotNullParameter(consumerId, "consumerId");
        return q.mapOf(TuplesKt.to("type", AccessToken.TYPE_JWT), TuplesKt.to("config", q.mapOf(TuplesKt.to("host", this.f30952a), TuplesKt.to("path", this.f30953b))));
    }
}
