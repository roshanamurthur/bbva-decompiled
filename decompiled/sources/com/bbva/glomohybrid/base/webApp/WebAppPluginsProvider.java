package com.bbva.glomohybrid.base.webApp;

import androidx.camera.core.processing.f;
import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.cellscore.web.plugin.PluginFactory;
import com.bbva.glomohybrid.logs.LoggerKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WebAppPluginsProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B%\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomohybrid/base/webApp/WebAppPluginsProvider;", "", "", "", "pluginIds", "", "Lkotlin/Function0;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "Lcom/bbva/cellscore/web/plugin/PluginProvider;", "get", "Lcom/bbva/cellscore/web/plugin/PluginFactory;", "glomoPluginFactory", "glomoRequiredPlugins", "Lcom/bbva/glomohybrid/base/webApp/WebAppDedicatedPlugins;", "dedicatedPlugins", "<init>", "(Lcom/bbva/cellscore/web/plugin/PluginFactory;Ljava/util/List;Lcom/bbva/glomohybrid/base/webApp/WebAppDedicatedPlugins;)V", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nWebAppPluginsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebAppPluginsProvider.kt\ncom/bbva/glomohybrid/base/webApp/WebAppPluginsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1549#2:33\n1620#2,3:34\n1179#2,2:37\n1253#2,4:39\n*S KotlinDebug\n*F\n+ 1 WebAppPluginsProvider.kt\ncom/bbva/glomohybrid/base/webApp/WebAppPluginsProvider\n*L\n15#1:33\n15#1:34,3\n25#1:37,2\n25#1:39,4\n*E\n"})
public final class WebAppPluginsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PluginFactory f31612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<Plugin> f31613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final WebAppDedicatedPlugins f31614c;

    /* JADX INFO: compiled from: WebAppPluginsProvider.kt */
    public static final class a extends Lambda implements Function0<Plugin> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Plugin f31615p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Plugin plugin) {
            super(0);
            this.f31615p0 = plugin;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return this.f31615p0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebAppPluginsProvider(@NotNull PluginFactory glomoPluginFactory, @NotNull List<? extends Plugin> glomoRequiredPlugins, @NotNull WebAppDedicatedPlugins dedicatedPlugins) {
        Intrinsics.checkNotNullParameter(glomoPluginFactory, "glomoPluginFactory");
        Intrinsics.checkNotNullParameter(glomoRequiredPlugins, "glomoRequiredPlugins");
        Intrinsics.checkNotNullParameter(dedicatedPlugins, "dedicatedPlugins");
        this.f31612a = glomoPluginFactory;
        this.f31613b = glomoRequiredPlugins;
        this.f31614c = dedicatedPlugins;
    }

    @NotNull
    public final Map<String, Function0<Plugin>> get(@NotNull List<String> pluginIds) {
        Intrinsics.checkNotNullParameter(pluginIds, "pluginIds");
        List<String> list = pluginIds;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (String str : list) {
            Plugin plugin = this.f31612a.get(str);
            if (plugin == null) {
                LoggerKt.logError$default(f.d("TAG[WebAppPluginsProvider] Failed finding plugin from pluginFactory with id ", str), null, null, 6, null);
                plugin = null;
            }
            arrayList.add(plugin);
        }
        List<Plugin> listPlus = CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt___CollectionsKt.filterNotNull(arrayList), (Iterable) this.f31613b), (Iterable) this.f31614c.getPlugins());
        LinkedHashMap linkedHashMap = new LinkedHashMap(f.a(listPlus, 10, 16));
        for (Plugin plugin2 : listPlus) {
            Pair pair = TuplesKt.to(plugin2.getId(), new a(plugin2));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
