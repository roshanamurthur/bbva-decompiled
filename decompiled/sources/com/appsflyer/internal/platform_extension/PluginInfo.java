package com.appsflyer.internal.platform_extension;

import bk.q;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u001bB/\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0013\u001a\u00020\bHÇ\u0003¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001HÇ\u0003¢\u0006\u0004\b\u0015\u0010\u0006J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00022\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\"\u0010\u0011R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/platform_extension/PluginInfo;", "", "", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "Ljava/util/Map;", "getAdditionalParams", "()Ljava/util/Map;", "additionalParams", "Lcom/appsflyer/internal/platform_extension/Plugin;", "AFInAppEventType", "Lcom/appsflyer/internal/platform_extension/Plugin;", "getPlugin", "()Lcom/appsflyer/internal/platform_extension/Plugin;", "plugin", "values", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "version", "component1", "component2", "component3", "p0", "p1", "p2", "copy", "(Lcom/appsflyer/internal/platform_extension/Plugin;Ljava/lang/String;Ljava/util/Map;)Lcom/appsflyer/internal/platform_extension/PluginInfo;", "", "", "equals", "(Ljava/lang/Object;)Z", "", GenerateActivationFormCommand.HASH_CODE, "()I", "toString", "<init>", "(Lcom/appsflyer/internal/platform_extension/Plugin;Ljava/lang/String;Ljava/util/Map;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class PluginInfo {

    /* JADX INFO: renamed from: AFInAppEventType, reason: from kotlin metadata */
    @NotNull
    private final Plugin plugin;

    /* JADX INFO: renamed from: valueOf, reason: from kotlin metadata */
    @NotNull
    private final Map<String, String> additionalParams;

    /* JADX INFO: renamed from: values, reason: from kotlin metadata */
    @NotNull
    private final String version;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PluginInfo(@NotNull Plugin plugin, @NotNull String str) {
        this(plugin, str, null, 4, null);
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PluginInfo copy$default(PluginInfo pluginInfo, Plugin plugin, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            plugin = pluginInfo.plugin;
        }
        if ((i10 & 2) != 0) {
            str = pluginInfo.version;
        }
        if ((i10 & 4) != 0) {
            map = pluginInfo.additionalParams;
        }
        return pluginInfo.copy(plugin, str, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Plugin getPlugin() {
        return this.plugin;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.additionalParams;
    }

    @NotNull
    public final PluginInfo copy(@NotNull Plugin p4, @NotNull String p10, @NotNull Map<String, String> p11) {
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p10, "");
        Intrinsics.checkNotNullParameter(p11, "");
        return new PluginInfo(p4, p10, p11);
    }

    public final boolean equals(@Nullable Object p4) {
        if (this == p4) {
            return true;
        }
        if (!(p4 instanceof PluginInfo)) {
            return false;
        }
        PluginInfo pluginInfo = (PluginInfo) p4;
        return this.plugin == pluginInfo.plugin && Intrinsics.areEqual(this.version, pluginInfo.version) && Intrinsics.areEqual(this.additionalParams, pluginInfo.additionalParams);
    }

    @JvmName(name = "getAdditionalParams")
    @NotNull
    public final Map<String, String> getAdditionalParams() {
        return this.additionalParams;
    }

    @JvmName(name = "getPlugin")
    @NotNull
    public final Plugin getPlugin() {
        return this.plugin;
    }

    @JvmName(name = "getVersion")
    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public final int hashCode() {
        return this.additionalParams.hashCode() + ((this.version.hashCode() + (this.plugin.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PluginInfo(plugin=");
        sb2.append(this.plugin);
        sb2.append(", version=");
        sb2.append(this.version);
        sb2.append(", additionalParams=");
        sb2.append(this.additionalParams);
        sb2.append(RootService.CLOSE_BRACKET);
        return sb2.toString();
    }

    @JvmOverloads
    public PluginInfo(@NotNull Plugin plugin, @NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.plugin = plugin;
        this.version = str;
        this.additionalParams = map;
    }

    public /* synthetic */ PluginInfo(Plugin plugin, String str, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(plugin, str, (i10 & 4) != 0 ? q.emptyMap() : map);
    }
}
