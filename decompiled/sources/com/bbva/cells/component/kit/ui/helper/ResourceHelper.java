package com.bbva.cells.component.kit.ui.helper;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.bbva.androidtoolkit.utils.ResourceUtils;
import com.noknok.android.client.metrics.Tabulator;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class ResourceHelper {
    public static int loadColor(Context context, Bundle bundle) {
        String string = bundle.getString("value");
        String string2 = bundle.getString("type", "");
        string2.getClass();
        return !string2.equals("resource") ? Color.parseColor(string) : ResourceUtils.getColor(context, string);
    }

    public static void loadColorState(TextView textView, Bundle bundle) {
        String string = bundle.getString("value");
        String string2 = bundle.getString("type", "");
        string2.getClass();
        if (string2.equals("resource")) {
            textView.setTextColor(ContextCompat.getColorStateList(textView.getContext(), ResourceUtils.getIdentifier(textView.getContext(), string, "color")));
        }
    }

    public static float loadDimension(Context context, Bundle bundle) {
        int i10;
        String string = bundle.getString("value");
        String string2 = bundle.getString("type", "");
        String string3 = bundle.getString(Tabulator.KEY_UNIT, "");
        string2.getClass();
        if (string2.equals("resource")) {
            return ResourceUtils.getDimension(context, string);
        }
        string3.getClass();
        if (string3.equals("dp")) {
            i10 = 1;
        } else {
            i10 = !string3.equals("sp") ? 0 : 2;
        }
        return TypedValue.applyDimension(i10, Float.valueOf(string).floatValue(), context.getResources().getDisplayMetrics());
    }

    public static int loadDrawableId(Context context, Bundle bundle) {
        return ResourceUtils.getDrawable(context, bundle.getString("value"));
    }

    public static void loadImage(ImageView imageView, Bundle bundle) {
        String string = bundle.getString("value");
        String string2 = bundle.getString("type", "");
        string2.getClass();
        if (string2.equals("resource")) {
            imageView.setImageResource(ResourceUtils.getDrawable(imageView.getContext(), string));
        }
    }

    public static String loadString(Context context, Bundle bundle) {
        String string = bundle.getString("value");
        String string2 = bundle.getString("type", "");
        string2.getClass();
        return !string2.equals("resource") ? string : ResourceUtils.getString(context, string);
    }

    public static Typeface loadTypeface(Context context, String str) {
        return ResourcesCompat.getFont(context, ResourceUtils.getIdentifier(context, str, "font"));
    }
}
