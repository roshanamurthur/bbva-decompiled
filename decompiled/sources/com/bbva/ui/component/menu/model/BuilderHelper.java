package com.bbva.ui.component.menu.model;

import android.content.Context;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BuilderHelper.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\b\tJ\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/bbva/ui/component/menu/model/BuilderHelper;", "", "()V", "loadDrawableId", "", "context", "Landroid/content/Context;", "property", "Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;", "loadDrawableId$component_ui_menu_release", "loadString", "", "loadString$component_ui_menu_release", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BuilderHelper {

    @NotNull
    public static final BuilderHelper INSTANCE = new BuilderHelper();

    public final int loadDrawableId$component_ui_menu_release(@NotNull Context context, @Nullable PropertiesHelper.Property property) {
        Intrinsics.checkNotNullParameter(context, "context");
        if ((property != null ? property.getValue() : null) == null) {
            return 0;
        }
        return PropertiesHelper.loadDrawableId(context, property);
    }

    @NotNull
    public final String loadString$component_ui_menu_release(@NotNull Context context, @Nullable PropertiesHelper.Property property) {
        Intrinsics.checkNotNullParameter(context, "context");
        if ((property != null ? property.getValue() : null) == null) {
            return "";
        }
        String strLoadString = PropertiesHelper.loadString(context, property);
        Intrinsics.checkNotNullExpressionValue(strLoadString, "loadString(context, property)");
        return strLoadString;
    }
}
