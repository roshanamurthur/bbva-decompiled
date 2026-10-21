package com.bbva.cells.component.kit.ui.property;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageSourceHandler;
import com.bbva.cells.component.kit.ui.property.impl.textview.InputTypeHandler;
import com.bbva.cells.component.kit.ui.property.impl.textview.TextColorHandler;
import com.bbva.cells.component.kit.ui.property.impl.textview.TextColorStateHandler;
import com.bbva.cells.component.kit.ui.property.impl.textview.TextFontHandler;
import com.bbva.cells.component.kit.ui.property.impl.textview.TextHandler;
import com.bbva.cells.component.kit.ui.property.impl.textview.TextHintColorHandler;
import com.bbva.cells.component.kit.ui.property.impl.textview.TextHintColorStateHandler;
import com.bbva.cells.component.kit.ui.property.impl.textview.TextHintHandler;
import com.bbva.cells.component.kit.ui.property.impl.textview.TextSizeHandler;
import com.bbva.cells.component.kit.ui.property.impl.view.BackgroundColorHandler;
import com.bbva.cells.component.kit.ui.property.impl.view.BackgroundColorStateHandler;
import com.bbva.cells.component.kit.ui.property.impl.view.EnableHandler;
import com.bbva.cells.component.kit.ui.property.impl.view.VisibilityHandler;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class PropertyFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f26699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f26700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f26701c;

    public PropertyFactory() {
        HashMap map = new HashMap();
        this.f26700b = map;
        map.put(InputTypeHandler.ID, new InputTypeHandler());
        map.put(TextColorHandler.ID, new TextColorHandler());
        map.put(TextColorStateHandler.ID, new TextColorStateHandler());
        map.put(TextFontHandler.ID, new TextFontHandler());
        map.put("text", new TextHandler());
        map.put(TextHintColorHandler.ID, new TextHintColorHandler());
        map.put(TextHintColorStateHandler.ID, new TextHintColorStateHandler());
        map.put(TextHintHandler.ID, new TextHintHandler());
        map.put(TextSizeHandler.ID, new TextSizeHandler());
        HashMap map2 = new HashMap();
        this.f26701c = map2;
        map2.put(ImageScaleTypeHandler.ID, new ImageScaleTypeHandler());
        map2.put("source", new ImageSourceHandler());
        HashMap map3 = new HashMap();
        this.f26699a = map3;
        map3.put(BackgroundColorHandler.ID, new BackgroundColorHandler());
        map3.put(BackgroundColorStateHandler.ID, new BackgroundColorStateHandler());
        map3.put(EnableHandler.ID, new EnableHandler());
        map3.put("visibility", new VisibilityHandler());
    }

    public DynamicPropertyHandler<ImageView> getImageViewHandler(String str) {
        return (DynamicPropertyHandler) this.f26701c.get(str);
    }

    public DynamicPropertyHandler<TextView> getTextViewHandler(String str) {
        return (DynamicPropertyHandler) this.f26700b.get(str);
    }

    public DynamicPropertyHandler<View> getViewHandler(String str) {
        return (DynamicPropertyHandler) this.f26699a.get(str);
    }
}
