package com.bbva.glomoconfig.login;

import bk.q;
import com.bbva.glomoconfig.login.configurator.Configurator;
import com.bbva.glomoconfig.login.configurator.GlobalConfigurator;
import com.bbva.glomoconfig.login.configurator.JWTConfigurator;
import com.bbva.glomoconfig.login.type.LoginType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AuthConfiguration.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H&J\u0016\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H&J\u001e\u0010\u0007\u001a\u00020\u00032\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H&J&\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0004J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u000bH\u0004¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomoconfig/login/AuthConfiguration;", "", "", "", "generateAuthConfig", "generateSSOAuthConfig", "authConfiguration", "configuredHost", "type", "consumerId", "getConfig", "Lcom/bbva/glomoconfig/login/type/LoginType;", "getId", "Lcom/bbva/glomoconfig/login/configurator/Configurator;", "configurators", "<init>", "(Ljava/util/Map;)V", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public abstract class AuthConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<String, Configurator> f30937a;

    /* JADX INFO: compiled from: AuthConfiguration.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoginType.values().length];
            try {
                iArr[LoginType.JWT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoginType.GLOBAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthConfiguration(@NotNull Map<String, ? extends Configurator> configurators) {
        Intrinsics.checkNotNullParameter(configurators, "configurators");
        this.f30937a = configurators;
    }

    @NotNull
    public abstract String configuredHost(@NotNull Map<String, ? extends Object> authConfiguration);

    @NotNull
    public abstract Map<String, Object> generateAuthConfig();

    @NotNull
    public abstract Map<String, Object> generateSSOAuthConfig();

    @NotNull
    public final Map<String, Object> getConfig(@NotNull String type, @NotNull String consumerId) {
        Map<String, Object> mapConfig;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(consumerId, "consumerId");
        Configurator configurator = this.f30937a.get(type);
        return (configurator == null || (mapConfig = configurator.config(consumerId)) == null) ? q.emptyMap() : mapConfig;
    }

    @NotNull
    public final String getId(@NotNull LoginType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i10 == 1) {
            return JWTConfigurator.ID;
        }
        if (i10 == 2) {
            return GlobalConfigurator.ID;
        }
        throw new NoWhenBranchMatchedException();
    }
}
