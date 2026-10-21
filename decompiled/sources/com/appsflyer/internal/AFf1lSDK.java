package com.appsflyer.internal;

import bk.q;
import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1lSDK implements AFf1mSDK {

    @NotNull
    private PluginInfo AFInAppEventParameterName = new PluginInfo(Plugin.NATIVE, "6.12.1", null, 4, null);

    @Override // com.appsflyer.internal.AFf1mSDK
    @NotNull
    public final Map<String, Object> AFInAppEventParameterName() {
        Map<String, Object> mapMutableMapOf = q.mutableMapOf(TuplesKt.to(k.a.f65035b, this.AFInAppEventParameterName.getPlugin().getPluginName()), TuplesKt.to("version", this.AFInAppEventParameterName.getVersion()));
        if (!this.AFInAppEventParameterName.getAdditionalParams().isEmpty()) {
            mapMutableMapOf.put("extras", this.AFInAppEventParameterName.getAdditionalParams());
        }
        return mapMutableMapOf;
    }

    @Override // com.appsflyer.internal.AFf1mSDK
    public final void values(@NotNull PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.AFInAppEventParameterName = pluginInfo;
    }
}
