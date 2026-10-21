package com.bbva.softtokenbase.model;

import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PluginData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/softtokenbase/model/PluginData;", "", "", "component1", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "component2", "id", "instance", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "getInstance", "()Lcom/bbva/androidtoolkit/plugin/Plugin;", "<init>", "(Ljava/lang/String;Lcom/bbva/androidtoolkit/plugin/Plugin;)V", "softtokenbase_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class PluginData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Plugin instance;

    public PluginData(@NotNull String id, @NotNull Plugin instance) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.id = id;
        this.instance = instance;
    }

    public static /* synthetic */ PluginData copy$default(PluginData pluginData, String str, Plugin plugin, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pluginData.id;
        }
        if ((i10 & 2) != 0) {
            plugin = pluginData.instance;
        }
        return pluginData.copy(str, plugin);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Plugin getInstance() {
        return this.instance;
    }

    @NotNull
    public final PluginData copy(@NotNull String id, @NotNull Plugin instance) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(instance, "instance");
        return new PluginData(id, instance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PluginData)) {
            return false;
        }
        PluginData pluginData = (PluginData) other;
        return Intrinsics.areEqual(this.id, pluginData.id) && Intrinsics.areEqual(this.instance, pluginData.instance);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Plugin getInstance() {
        return this.instance;
    }

    public int hashCode() {
        return this.instance.hashCode() + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PluginData(id=" + this.id + ", instance=" + this.instance + ")";
    }
}
