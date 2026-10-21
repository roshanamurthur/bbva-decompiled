package com.bbva.cellswidgets;

import android.content.Context;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PropertyLoader.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\n"}, d2 = {"Lcom/bbva/cellswidgets/PropertyLoader;", "", "Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;", "property", "", "getString", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
public final class PropertyLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f27275a;

    public PropertyLoader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27275a = context;
    }

    @NotNull
    public final String getString(@Nullable PropertiesHelper.Property property) {
        if (property == null || property.getValue() == null) {
            return "";
        }
        String strLoadString = PropertiesHelper.loadString(this.f27275a, property);
        Intrinsics.checkNotNullExpressionValue(strLoadString, "loadString(...)");
        return strLoadString;
    }
}
