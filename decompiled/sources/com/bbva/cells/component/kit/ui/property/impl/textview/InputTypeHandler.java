package com.bbva.cells.component.kit.ui.property.impl.textview;

import android.content.Context;
import android.widget.TextView;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.cells.component.kit.ui.property.DynamicPropertyHandler;

/* JADX INFO: loaded from: classes2.dex */
public class InputTypeHandler implements DynamicPropertyHandler<TextView> {
    public static final String ID = "input-type";

    @Override // com.bbva.cells.component.kit.ui.property.DynamicPropertyHandler
    public void configure(Context context, TextView textView, PropertiesHelper.Property property) {
        String value = property.getValue();
        value.getClass();
        if (value.equals("numbers")) {
            textView.setInputType(2);
        } else {
            textView.setInputType(1);
        }
    }
}
