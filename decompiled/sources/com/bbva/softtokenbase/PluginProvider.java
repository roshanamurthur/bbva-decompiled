package com.bbva.softtokenbase;

import com.bbva.softtokenbase.model.PluginData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PluginProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/bbva/softtokenbase/PluginProvider;", "", "provide", "Lcom/bbva/softtokenbase/model/PluginData;", "softtokenbase_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PluginProvider {
    @NotNull
    PluginData provide();
}
