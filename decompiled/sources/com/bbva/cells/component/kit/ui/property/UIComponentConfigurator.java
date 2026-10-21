package com.bbva.cells.component.kit.ui.property;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class UIComponentConfigurator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PropertyFactory f26702a = new PropertyFactory();

    public static void configureImageView(Context context, ImageView imageView, Map<String, Map<String, String>> map) {
        for (Map.Entry<String, Map<String, String>> entry : map.entrySet()) {
            DynamicPropertyHandler<ImageView> imageViewHandler = f26702a.getImageViewHandler(entry.getKey());
            if (imageViewHandler != null) {
                imageViewHandler.configure(context, imageView, PropertiesHelper.Property.from(entry.getValue()));
            }
        }
    }

    public static void configureTextView(Context context, TextView textView, Map<String, Map<String, String>> map) {
        for (Map.Entry<String, Map<String, String>> entry : map.entrySet()) {
            DynamicPropertyHandler<TextView> textViewHandler = f26702a.getTextViewHandler(entry.getKey());
            if (textViewHandler != null) {
                textViewHandler.configure(context, textView, PropertiesHelper.Property.from(entry.getValue()));
            }
        }
    }

    public static void configureView(Context context, View view, Map<String, Map<String, String>> map) {
        if (view instanceof TextView) {
            configureTextView(context, (TextView) view, map);
        } else if (view instanceof ImageView) {
            configureImageView(context, (ImageView) view, map);
        }
        for (Map.Entry<String, Map<String, String>> entry : map.entrySet()) {
            DynamicPropertyHandler<View> viewHandler = f26702a.getViewHandler(entry.getKey());
            if (viewHandler != null) {
                viewHandler.configure(context, view, PropertiesHelper.Property.from(entry.getValue()));
            }
        }
    }
}
