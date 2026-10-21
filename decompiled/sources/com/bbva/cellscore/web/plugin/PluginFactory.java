package com.bbva.cellscore.web.plugin;

import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PluginProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0011"}, d2 = {"Lcom/bbva/cellscore/web/plugin/PluginFactory;", "", "", "id", "Lkotlin/Function0;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "Lcom/bbva/cellscore/web/plugin/PluginProvider;", "provider", "", "add", "get", "", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "<init>", "()V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public class PluginFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f27200a = new LinkedHashMap();

    public final void add(@NotNull String id, @NotNull Function0<? extends Plugin> provider) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f27200a.put(id, provider);
    }

    public final boolean contains(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.f27200a.containsKey(id);
    }

    @Nullable
    public final Plugin get(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Function0 function0 = (Function0) this.f27200a.get(id);
        if (function0 == null) {
            return null;
        }
        return (Plugin) function0.invoke();
    }

    @NotNull
    public final Set<String> list() {
        return this.f27200a.keySet();
    }
}
