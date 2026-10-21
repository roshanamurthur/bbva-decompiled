package com.bbva.plugin.push.command.params;

import androidx.annotation.Keep;
import androidx.datastore.preferences.protobuf.e;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SetOptionsParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005HÆ\u0003J/\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/plugin/push/command/params/SetOptionsParams;", "", "serviceId", "", "options", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getOptions", "()Ljava/util/Map;", "getServiceId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "push-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SetOptionsParams {

    @Nullable
    private final Map<String, Object> options;

    @Nullable
    private final String serviceId;

    public SetOptionsParams(@Nullable String str, @Nullable Map<String, ? extends Object> map) {
        this.serviceId = str;
        this.options = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SetOptionsParams copy$default(SetOptionsParams setOptionsParams, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = setOptionsParams.serviceId;
        }
        if ((i10 & 2) != 0) {
            map = setOptionsParams.options;
        }
        return setOptionsParams.copy(str, map);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    @Nullable
    public final Map<String, Object> component2() {
        return this.options;
    }

    @NotNull
    public final SetOptionsParams copy(@Nullable String serviceId, @Nullable Map<String, ? extends Object> options) {
        return new SetOptionsParams(serviceId, options);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetOptionsParams)) {
            return false;
        }
        SetOptionsParams setOptionsParams = (SetOptionsParams) other;
        return Intrinsics.areEqual(this.serviceId, setOptionsParams.serviceId) && Intrinsics.areEqual(this.options, setOptionsParams.options);
    }

    @Nullable
    public final Map<String, Object> getOptions() {
        return this.options;
    }

    @Nullable
    public final String getServiceId() {
        return this.serviceId;
    }

    public int hashCode() {
        String str = this.serviceId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, Object> map = this.options;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SetOptionsParams(serviceId=");
        sb2.append(this.serviceId);
        sb2.append(", options=");
        return e.g(sb2, this.options, RootService.CLOSE_BRACKET);
    }
}
