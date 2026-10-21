package com.bbva.component.dm.login.datamanager.config;

import androidx.datastore.preferences.protobuf.e;
import bk.o;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GlobalLoginConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b'\u0010(J!\u0010\u0006\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0003HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004HÖ\u0003R\u001b\u0010\u000f\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0013R\u001b\u0010\u001d\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0013R\u001b\u0010 \u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001f\u0010\u0013R\u001b\u0010#\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b\"\u0010\u0013R\u001b\u0010&\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u000e\u001a\u0004\b%\u0010\u0013¨\u0006)"}, d2 = {"Lcom/bbva/component/dm/login/datamanager/config/GlobalLoginConfig;", "Lcom/bbva/component/dm/login/datamanager/config/Config;", "", "", "", "map", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "e", "Ljava/util/Map;", "isBackendUserRequired", "()Z", "f", "getConsumerId", "()Ljava/lang/String;", "consumerId", "g", "getAuthenticationType", Constants.authenticationType, "h", "getIdAuthenticationData", Constants.idAuthenticationData, "i", "getUsernameBehaviour", "usernameBehaviour", "j", "getUsernameCode", "usernameCode", "k", "getAnonymousConsumerId", "anonymousConsumerId", "l", "getAnonymousAuthenticationType", "anonymousAuthenticationType", "<init>", "(Ljava/util/Map;)V", "component-dm-login_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GlobalLoginConfig extends Config {
    public static final /* synthetic */ KProperty<Object>[] m = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GlobalLoginConfig.class), "isBackendUserRequired", "isBackendUserRequired()Z")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GlobalLoginConfig.class), "consumerId", "getConsumerId()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GlobalLoginConfig.class), Constants.authenticationType, "getAuthenticationType()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GlobalLoginConfig.class), Constants.idAuthenticationData, "getIdAuthenticationData()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GlobalLoginConfig.class), "usernameBehaviour", "getUsernameBehaviour()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GlobalLoginConfig.class), "usernameCode", "getUsernameCode()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GlobalLoginConfig.class), "anonymousConsumerId", "getAnonymousConsumerId()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GlobalLoginConfig.class), "anonymousAuthenticationType", "getAnonymousAuthenticationType()Ljava/lang/String;"))};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f27727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map isBackendUserRequired;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map consumerId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map authenticationType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map idAuthenticationData;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map usernameBehaviour;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map usernameCode;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map anonymousConsumerId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map anonymousAuthenticationType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalLoginConfig(@NotNull Map<String, ? extends Object> map) {
        super(map);
        Intrinsics.checkNotNullParameter(map, "map");
        this.f27727d = map;
        this.isBackendUserRequired = map;
        this.consumerId = map;
        this.authenticationType = map;
        this.idAuthenticationData = map;
        this.usernameBehaviour = map;
        this.usernameCode = map;
        this.anonymousConsumerId = map;
        this.anonymousAuthenticationType = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GlobalLoginConfig copy$default(GlobalLoginConfig globalLoginConfig, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = globalLoginConfig.f27727d;
        }
        return globalLoginConfig.copy(map);
    }

    @NotNull
    public final GlobalLoginConfig copy(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new GlobalLoginConfig(map);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GlobalLoginConfig) && Intrinsics.areEqual(this.f27727d, ((GlobalLoginConfig) other).f27727d);
    }

    @NotNull
    public final String getAnonymousAuthenticationType() {
        return (String) o.getOrImplicitDefaultNullable(this.anonymousAuthenticationType, m[7].getName());
    }

    @NotNull
    public final String getAnonymousConsumerId() {
        return (String) o.getOrImplicitDefaultNullable(this.anonymousConsumerId, m[6].getName());
    }

    @NotNull
    public final String getAuthenticationType() {
        return (String) o.getOrImplicitDefaultNullable(this.authenticationType, m[2].getName());
    }

    @NotNull
    public final String getConsumerId() {
        return (String) o.getOrImplicitDefaultNullable(this.consumerId, m[1].getName());
    }

    @NotNull
    public final String getIdAuthenticationData() {
        return (String) o.getOrImplicitDefaultNullable(this.idAuthenticationData, m[3].getName());
    }

    @NotNull
    public final String getUsernameBehaviour() {
        return (String) o.getOrImplicitDefaultNullable(this.usernameBehaviour, m[4].getName());
    }

    @NotNull
    public final String getUsernameCode() {
        return (String) o.getOrImplicitDefaultNullable(this.usernameCode, m[5].getName());
    }

    public int hashCode() {
        return this.f27727d.hashCode();
    }

    public final boolean isBackendUserRequired() {
        return ((Boolean) o.getOrImplicitDefaultNullable(this.isBackendUserRequired, m[0].getName())).booleanValue();
    }

    @NotNull
    public String toString() {
        return e.g(new StringBuilder("GlobalLoginConfig(map="), this.f27727d, RootService.CLOSE_BRACKET);
    }
}
