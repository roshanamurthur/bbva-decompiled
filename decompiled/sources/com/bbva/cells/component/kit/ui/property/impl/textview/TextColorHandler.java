package com.bbva.cells.component.kit.ui.property.impl.textview;

import android.content.Context;
import android.widget.TextView;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.cells.component.kit.ui.property.DynamicPropertyHandler;

/* JADX INFO: loaded from: classes2.dex */
public class TextColorHandler implements DynamicPropertyHandler<TextView> {
    public static final String ID = "text-color";

    @Override // com.bbva.cells.component.kit.ui.property.DynamicPropertyHandler
    public void configure(Context context, TextView textView, PropertiesHelper.Property property) {
        textView.setTextColor(PropertiesHelper.loadColor(context, property));
    }
}
