package com.bbva.cells.component.kit.ui.property;

import android.content.Context;
import android.view.View;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;

/* JADX INFO: loaded from: classes2.dex */
public interface DynamicPropertyHandler<T extends View> {
    void configure(Context context, T t10, PropertiesHelper.Property property);
}
