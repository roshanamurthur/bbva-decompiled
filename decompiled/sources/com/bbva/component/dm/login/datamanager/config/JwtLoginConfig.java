package com.bbva.component.dm.login.datamanager.config;

import androidx.datastore.preferences.protobuf.e;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JwtLoginConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0006\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0003HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004HÖ\u0003¨\u0006\u000f"}, d2 = {"Lcom/bbva/component/dm/login/datamanager/config/JwtLoginConfig;", "Lcom/bbva/component/dm/login/datamanager/config/Config;", "", "", "", "map", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "<init>", "(Ljava/util/Map;)V", "component-dm-login_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class JwtLoginConfig extends Config {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f27736d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JwtLoginConfig(@NotNull Map<String, ? extends Object> map) {
        super(map);
        Intrinsics.checkNotNullParameter(map, "map");
        this.f27736d = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JwtLoginConfig copy$default(JwtLoginConfig jwtLoginConfig, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = jwtLoginConfig.f27736d;
        }
        return jwtLoginConfig.copy(map);
    }

    @NotNull
    public final JwtLoginConfig copy(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new JwtLoginConfig(map);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof JwtLoginConfig) && Intrinsics.areEqual(this.f27736d, ((JwtLoginConfig) other).f27736d);
    }

    public int hashCode() {
        return this.f27736d.hashCode();
    }

    @NotNull
    public String toString() {
        return e.g(new StringBuilder("JwtLoginConfig(map="), this.f27736d, RootService.CLOSE_BRACKET);
    }
}
