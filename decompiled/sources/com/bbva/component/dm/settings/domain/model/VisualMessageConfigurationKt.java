package com.bbva.component.dm.settings.domain.model;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VisualMessageConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¨\u0006\u0004"}, d2 = {"asVisualMessageConfiguration", "Lcom/bbva/component/dm/settings/domain/model/VisualMessageConfiguration;", "", "", "cmp-dm-appsettings_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVisualMessageConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisualMessageConfiguration.kt\ncom/bbva/component/dm/settings/domain/model/VisualMessageConfigurationKt\n+ 2 MapExtensions.kt\ncom/bbva/glomoutils/MapExtensionsKt\n*L\n1#1,19:1\n19#2:20\n19#2:21\n19#2:22\n19#2:23\n*S KotlinDebug\n*F\n+ 1 VisualMessageConfiguration.kt\ncom/bbva/component/dm/settings/domain/model/VisualMessageConfigurationKt\n*L\n13#1:20\n14#1:21\n15#1:22\n16#1:23\n*E\n"})
public final class VisualMessageConfigurationKt {
    @NotNull
    public static final VisualMessageConfiguration asVisualMessageConfiguration(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        String str = map.get("icon");
        if (!(str instanceof String)) {
            str = null;
        }
        String str2 = str;
        String str3 = map.get("title");
        if (!(str3 instanceof String)) {
            str3 = null;
        }
        String str4 = str3;
        String str5 = map.get("description");
        if (!(str5 instanceof String)) {
            str5 = null;
        }
        String str6 = str5;
        String str7 = map.get("buttonLabel");
        return new VisualMessageConfiguration(str2, str4, str6, str7 instanceof String ? str7 : null);
    }
}
