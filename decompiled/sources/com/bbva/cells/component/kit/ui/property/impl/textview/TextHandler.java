package com.bbva.cells.component.kit.ui.property.impl.textview;

import android.content.Context;
import android.widget.TextView;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.cells.component.kit.ui.property.DynamicPropertyHandler;

/* JADX INFO: loaded from: classes2.dex */
public class TextHandler implements DynamicPropertyHandler<TextView> {
    public static final String ID = "text";

    @Override // com.bbva.cells.component.kit.ui.property.DynamicPropertyHandler
    public void configure(Context context, TextView textView, PropertiesHelper.Property property) {
        PropertiesHelper.loadString(context, textView, property);
    }
}
