package com.bbva.cells.component.kit.ui.property.impl.view;

import android.content.Context;
import android.view.View;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.cells.component.kit.ui.property.DynamicPropertyHandler;

/* JADX INFO: loaded from: classes2.dex */
public class VisibilityHandler implements DynamicPropertyHandler<View> {
    public static final String ID = "visibility";

    @Override // com.bbva.cells.component.kit.ui.property.DynamicPropertyHandler
    public void configure(Context context, View view, PropertiesHelper.Property property) {
        if (property.isEmpty()) {
            return;
        }
        String value = property.getValue();
        value.getClass();
        if (value.equals("gone")) {
            view.setVisibility(8);
        } else if (value.equals("visible")) {
            view.setVisibility(0);
        } else {
            view.setVisibility(4);
        }
    }
}
