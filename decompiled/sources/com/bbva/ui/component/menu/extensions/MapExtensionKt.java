package com.bbva.ui.component.menu.extensions;

import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MapExtension.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0000¨\u0006\u0004"}, d2 = {"toProperty", "Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;", "", "", "component-ui-menu_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMapExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapExtension.kt\ncom/bbva/ui/component/menu/extensions/MapExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,6:1\n1#2:7\n*E\n"})
public final class MapExtensionKt {
    @Nullable
    public static final PropertiesHelper.Property toProperty(@Nullable Map<String, String> map) {
        if (map != null) {
            return PropertiesHelper.Property.from(map);
        }
        return null;
    }
}
