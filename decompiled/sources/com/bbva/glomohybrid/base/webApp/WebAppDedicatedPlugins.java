package com.bbva.glomohybrid.base.webApp;

import androidx.camera.core.imagecapture.a;
import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WebAppDedicatedPlugins.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/base/webApp/WebAppDedicatedPlugins;", "", "", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "component1", "plugins", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/List;", "getPlugins", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class WebAppDedicatedPlugins {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Plugin> plugins;

    /* JADX WARN: Multi-variable type inference failed */
    public WebAppDedicatedPlugins(@NotNull List<? extends Plugin> plugins) {
        Intrinsics.checkNotNullParameter(plugins, "plugins");
        this.plugins = plugins;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebAppDedicatedPlugins copy$default(WebAppDedicatedPlugins webAppDedicatedPlugins, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = webAppDedicatedPlugins.plugins;
        }
        return webAppDedicatedPlugins.copy(list);
    }

    @NotNull
    public final List<Plugin> component1() {
        return this.plugins;
    }

    @NotNull
    public final WebAppDedicatedPlugins copy(@NotNull List<? extends Plugin> plugins) {
        Intrinsics.checkNotNullParameter(plugins, "plugins");
        return new WebAppDedicatedPlugins(plugins);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WebAppDedicatedPlugins) && Intrinsics.areEqual(this.plugins, ((WebAppDedicatedPlugins) other).plugins);
    }

    @NotNull
    public final List<Plugin> getPlugins() {
        return this.plugins;
    }

    public int hashCode() {
        return this.plugins.hashCode();
    }

    @NotNull
    public String toString() {
        return a.c(new StringBuilder("WebAppDedicatedPlugins(plugins="), this.plugins, ")");
    }
}
