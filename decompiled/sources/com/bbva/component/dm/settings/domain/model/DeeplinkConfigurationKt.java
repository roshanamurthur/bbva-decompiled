package com.bbva.component.dm.settings.domain.model;

import bk.q;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeeplinkConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0000¨\u0006\u0006"}, d2 = {"asDeeplinkConfigModel", "Lcom/bbva/component/dm/settings/domain/model/DeeplinkConfigModel;", "", "", "", "Lcom/bbva/component/dm/settings/domain/model/Data;", "cmp-dm-appsettings_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeeplinkConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeeplinkConfiguration.kt\ncom/bbva/component/dm/settings/domain/model/DeeplinkConfigurationKt\n+ 2 MapExtensions.kt\ncom/bbva/glomoutils/MapExtensionsKt\n*L\n1#1,19:1\n12#2:20\n12#2:21\n12#2:22\n12#2:23\n*S KotlinDebug\n*F\n+ 1 DeeplinkConfiguration.kt\ncom/bbva/component/dm/settings/domain/model/DeeplinkConfigurationKt\n*L\n13#1:20\n14#1:21\n15#1:22\n16#1:23\n*E\n"})
public final class DeeplinkConfigurationKt {
    @NotNull
    public static final DeeplinkConfigModel asDeeplinkConfigModel(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Object obj = map.get("key");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        Map mapEmptyMap = q.emptyMap();
        Object obj2 = map.get("value");
        if (!(obj2 instanceof Map)) {
            obj2 = null;
        }
        Map map2 = (Map) obj2;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        Object obj3 = mapEmptyMap.get("destination");
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        String str2 = (String) obj3;
        String str3 = str2 != null ? str2 : "";
        Boolean bool = Boolean.FALSE;
        Object obj4 = map.get("public");
        Boolean bool2 = (Boolean) (obj4 instanceof Boolean ? obj4 : null);
        if (bool2 != null) {
            bool = bool2;
        }
        return new DeeplinkConfigModel(str, str3, bool.booleanValue());
    }
}
