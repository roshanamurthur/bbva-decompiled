package com.bbva.component.dm.settings.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0015\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0003J)\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/OperativeParams;", "", "Lcom/bbva/component/dm/settings/domain/model/OperativeParamAction;", "component1", "", "", "component2", "action", "config", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/component/dm/settings/domain/model/OperativeParamAction;", "getAction", "()Lcom/bbva/component/dm/settings/domain/model/OperativeParamAction;", "b", "Ljava/util/Map;", "getConfig", "()Ljava/util/Map;", "<init>", "(Lcom/bbva/component/dm/settings/domain/model/OperativeParamAction;Ljava/util/Map;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class OperativeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OperativeParamAction action;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, Object> config;

    public OperativeParams(@NotNull OperativeParamAction action, @NotNull Map<String, ? extends Object> config) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(config, "config");
        this.action = action;
        this.config = config;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OperativeParams copy$default(OperativeParams operativeParams, OperativeParamAction operativeParamAction, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            operativeParamAction = operativeParams.action;
        }
        if ((i10 & 2) != 0) {
            map = operativeParams.config;
        }
        return operativeParams.copy(operativeParamAction, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OperativeParamAction getAction() {
        return this.action;
    }

    @NotNull
    public final Map<String, Object> component2() {
        return this.config;
    }

    @NotNull
    public final OperativeParams copy(@NotNull OperativeParamAction action, @NotNull Map<String, ? extends Object> config) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(config, "config");
        return new OperativeParams(action, config);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OperativeParams)) {
            return false;
        }
        OperativeParams operativeParams = (OperativeParams) other;
        return this.action == operativeParams.action && Intrinsics.areEqual(this.config, operativeParams.config);
    }

    @NotNull
    public final OperativeParamAction getAction() {
        return this.action;
    }

    @NotNull
    public final Map<String, Object> getConfig() {
        return this.config;
    }

    public int hashCode() {
        return this.config.hashCode() + (this.action.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "OperativeParams(action=" + this.action + ", config=" + this.config + ")";
    }
}
