package com.bbva.glomoconfig.login.configurator;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Configurator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomoconfig/login/configurator/Configurator;", "", "config", "", "", "consumerId", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Configurator {
    @NotNull
    Map<String, Object> config(@NotNull String consumerId);
}
