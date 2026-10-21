package com.bbva.cells.component.kit.ui.property.impl.textview;

import android.content.Context;
import android.widget.TextView;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.cells.component.kit.ui.property.DynamicPropertyHandler;

/* JADX INFO: loaded from: classes2.dex */
public class TextHintColorStateHandler implements DynamicPropertyHandler<TextView> {
    public static final String ID = "text-hint-color-state";

    @Override // com.bbva.cells.component.kit.ui.property.DynamicPropertyHandler
    public void configure(Context context, TextView textView, PropertiesHelper.Property property) {
        textView.setHintTextColor(PropertiesHelper.loadColorStateId(context, property));
    }
}
