package com.bbva.cells.component.kit.ui.property.impl.image;

import android.content.Context;
import android.widget.ImageView;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.cells.component.kit.ui.property.DynamicPropertyHandler;

/* JADX INFO: loaded from: classes2.dex */
public class ImageScaleTypeHandler implements DynamicPropertyHandler<ImageView> {
    public static final String ID = "scale";

    @Override // com.bbva.cells.component.kit.ui.property.DynamicPropertyHandler
    public void configure(Context context, ImageView imageView, PropertiesHelper.Property property) {
        String value = property.getValue();
        value.getClass();
        switch (value) {
            case "center":
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                break;
            case "fit-xy":
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                break;
            case "fit-center":
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                break;
            case "center-crop":
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                break;
        }
    }
}
