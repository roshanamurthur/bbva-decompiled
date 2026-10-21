package com.bbva.cellscore.web.plugin;

import com.bbva.androidtoolkit.plugin.Plugin;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PluginProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u0000\u001a\u00020\u00012>\u0010\u0002\u001a \u0012\u001c\b\u0001\u0012\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u00040\u0003\"\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u0004¢\u0006\u0002\u0010\t*\u0016\u0010\n\"\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\u000b"}, d2 = {"pluginFactoryOf", "Lcom/bbva/cellscore/web/plugin/PluginFactory;", "providers", "", "Lkotlin/Pair;", "", "Lkotlin/Function0;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "Lcom/bbva/cellscore/web/plugin/PluginProvider;", "([Lkotlin/Pair;)Lcom/bbva/cellscore/web/plugin/PluginFactory;", "PluginProvider", "cells-core_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class PluginProviderKt {
    @NotNull
    public static final PluginFactory pluginFactoryOf(@NotNull Pair<String, ? extends Function0<? extends Plugin>>... providers) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        PluginFactory pluginFactory = new PluginFactory();
        for (Pair<String, ? extends Function0<? extends Plugin>> pair : providers) {
            pluginFactory.add(pair.getFirst(), pair.getSecond());
        }
        return pluginFactory;
    }
}
