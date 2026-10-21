package com.bbva.slidemenuview;

import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import com.bbva.slidemenuview.data.MenuState;
import com.bbva.slidemenuview.extensions.MenuExtensionsKt;
import com.bbva.ui.component.menu.model.MenuItem;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MenuItemOpenWebFlagsConfig.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\u001c\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\"#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/bbva/ui/component/menu/model/MenuItem;", "hideOnlyEnabledStates", "Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;", "", "module", com.huawei.hms.feature.model.c.f50460q, "", "isGlomoFeatureEnabled", "", "Lcom/bbva/slidemenuview/MenuItemOpenWebFlagsConfig;", "a", "Ljava/util/Map;", "getMenuItemsFeatureFlagsConfig", "()Ljava/util/Map;", "menuItemsFeatureFlagsConfig", "slidemenuview_mexicoRelease"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMenuItemOpenWebFlagsConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuItemOpenWebFlagsConfig.kt\ncom/bbva/slidemenuview/MenuItemOpenWebFlagsConfigKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 MapExtensions.kt\ncom/bbva/glomoutils/MapExtensionsKt\n*L\n1#1,34:1\n453#2:35\n403#2:36\n1238#3,4:37\n19#4:41\n19#4:42\n*S KotlinDebug\n*F\n+ 1 MenuItemOpenWebFlagsConfig.kt\ncom/bbva/slidemenuview/MenuItemOpenWebFlagsConfigKt\n*L\n15#1:35\n15#1:36\n15#1:37,4\n25#1:41\n26#1:42\n*E\n"})
public final class MenuItemOpenWebFlagsConfigKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Map<String, MenuItemOpenWebFlagsConfig> f36649a = bk.p.mapOf(TuplesKt.to(MenuItemMap.Emergencies.getIdentifier(), new MenuItemOpenWebFlagsConfig(a.f36650p0, null, 2, null)));

    /* JADX INFO: compiled from: MenuItemOpenWebFlagsConfig.kt */
    public static final class a extends Lambda implements Function1<FeatureFlags, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f36650p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(FeatureFlags featureFlags) {
            FeatureFlags $receiver = featureFlags;
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            return Boolean.valueOf(MenuItemOpenWebFlagsConfigKt.isGlomoFeatureEnabled($receiver, "emergency", "sosEmergency"));
        }
    }

    @NotNull
    public static final Map<String, MenuItemOpenWebFlagsConfig> getMenuItemsFeatureFlagsConfig() {
        return f36649a;
    }

    @NotNull
    public static final MenuItem hideOnlyEnabledStates(@NotNull MenuItem menuItem) {
        LinkedHashMap linkedHashMap;
        MenuState menuState;
        Intrinsics.checkNotNullParameter(menuItem, "<this>");
        Map<String, String> states = menuItem.getStates();
        if (states != null) {
            linkedHashMap = new LinkedHashMap(bk.p.mapCapacity(states.size()));
            Iterator<T> it = states.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                String str = (String) entry.getValue();
                if (Intrinsics.areEqual(str, MenuState.ENABLED.getState())) {
                    menuState = MenuState.HIDDEN;
                } else {
                    MenuState menuState2 = MenuState.HIDDEN;
                    menuState = Intrinsics.areEqual(str, menuState2.getState()) ? menuState2 : MenuState.DISABLED;
                }
                linkedHashMap.put(key, menuState.getState());
            }
        } else {
            linkedHashMap = null;
        }
        return MenuExtensionsKt.copy$default(menuItem, 0, null, 0, null, false, linkedHashMap == null ? bk.q.emptyMap() : linkedHashMap, null, 95, null);
    }

    public static final boolean isGlomoFeatureEnabled(@NotNull FeatureFlags featureFlags, @NotNull String module, @NotNull String feature) {
        Intrinsics.checkNotNullParameter(featureFlags, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(feature, "feature");
        Object obj = featureFlags.getFeatureFlagCollection().get("glomo." + module + Constant.DOT_STRING + feature);
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map = (Map) obj;
        if (map != null) {
            Object obj2 = map.get("value");
            Boolean bool = (Boolean) (obj2 instanceof Boolean ? obj2 : null);
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }
}
