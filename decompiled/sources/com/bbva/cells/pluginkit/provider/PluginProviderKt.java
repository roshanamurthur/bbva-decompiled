package com.bbva.cells.pluginkit.provider;

import com.bbva.cells.pluginkit.XPlugin;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PluginProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u0000\u001a\u00020\u00012>\u0010\u0002\u001a \u0012\u001c\b\u0001\u0012\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u00040\u0003\"\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u0004¢\u0006\u0002\u0010\t*\u0016\u0010\n\"\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\u000b"}, d2 = {"pluginFactoryOf", "Lcom/bbva/cells/pluginkit/provider/XPluginFactory;", "providers", "", "Lkotlin/Pair;", "", "Lkotlin/Function0;", "Lcom/bbva/cells/pluginkit/XPlugin;", "Lcom/bbva/cells/pluginkit/provider/XPluginProvider;", "([Lkotlin/Pair;)Lcom/bbva/cells/pluginkit/provider/XPluginFactory;", "XPluginProvider", "pluginkit_release"}, k = 2, mv = {1, 4, 1})
public final class PluginProviderKt {
    @NotNull
    public static final XPluginFactory pluginFactoryOf(@NotNull Pair<String, ? extends Function0<? extends XPlugin>>... providers) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        XPluginFactory xPluginFactory = new XPluginFactory();
        for (Pair<String, ? extends Function0<? extends XPlugin>> pair : providers) {
            xPluginFactory.add(pair.getFirst(), pair.getSecond());
        }
        return xPluginFactory;
    }
}
