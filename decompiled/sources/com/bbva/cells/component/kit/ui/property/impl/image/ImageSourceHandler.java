package com.bbva.cells.component.kit.ui.property.impl.image;

import android.content.Context;
import android.widget.ImageView;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.cells.component.kit.ui.property.DynamicPropertyHandler;

/* JADX INFO: loaded from: classes2.dex */
public class ImageSourceHandler implements DynamicPropertyHandler<ImageView> {
    public static final String ID = "source";

    @Override // com.bbva.cells.component.kit.ui.property.DynamicPropertyHandler
    public void configure(Context context, ImageView imageView, PropertiesHelper.Property property) {
        PropertiesHelper.loadImage(imageView, property);
    }
}
