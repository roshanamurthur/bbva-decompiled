package com.bbva.cells.component.kit.ui.property.impl.view;

import android.content.Context;
import android.view.View;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.cells.component.kit.ui.property.DynamicPropertyHandler;

/* JADX INFO: loaded from: classes2.dex */
public class EnableHandler implements DynamicPropertyHandler<View> {
    public static final String ID = "enable";

    @Override // com.bbva.cells.component.kit.ui.property.DynamicPropertyHandler
    public void configure(Context context, View view, PropertiesHelper.Property property) {
        view.setEnabled(Boolean.parseBoolean(property.getValue()));
    }
}
