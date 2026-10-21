package io.card.payment.ui;

import ad.e;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class ViewUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, Integer> f69856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f69857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap<String, Float> f69858c;

    static {
        HashMap map = new HashMap();
        map.put("px", 0);
        map.put("dip", 1);
        map.put("dp", 1);
        map.put("sp", 2);
        e.f(3, map, DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT, 4, "in");
        map.put("mm", 5);
        f69856a = Collections.unmodifiableMap(map);
        f69857b = Pattern.compile("^\\s*(\\d+(\\.\\d+)*)\\s*([a-zA-Z]+)\\s*$");
        f69858c = new HashMap<>();
    }

    @TargetApi(16)
    public static void setBackground(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void setDimensions(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i11;
    }

    public static void setMargins(View view, String str, String str2, String str3, String str4) {
        Context context = view.getContext();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(typedDimensionValueToPixelsInt(str, context), typedDimensionValueToPixelsInt(str2, context), typedDimensionValueToPixelsInt(str3, context), typedDimensionValueToPixelsInt(str4, context));
        }
    }

    public static void setPadding(View view, String str, String str2, String str3, String str4) {
        Context context = view.getContext();
        view.setPadding(typedDimensionValueToPixelsInt(str, context), typedDimensionValueToPixelsInt(str2, context), typedDimensionValueToPixelsInt(str3, context), typedDimensionValueToPixelsInt(str4, context));
    }

    public static void styleAsButton(Button button, boolean z10, Context context, boolean z11) {
        setDimensions(button, -1, -2);
        button.setFocusable(true);
        setPadding(button, "10dip", "0dip", "10dip", "0dip");
        if (z11) {
            return;
        }
        setBackground(button, z10 ? Appearance.buttonBackgroundPrimary(context) : Appearance.buttonBackgroundSecondary(context));
        button.setGravity(17);
        button.setMinimumHeight(typedDimensionValueToPixelsInt("54dip", context));
        button.setTextColor(-1);
        button.setTextSize(20.0f);
        button.setTypeface(Appearance.TYPEFACE_BUTTON);
    }

    @SuppressLint({"DefaultLocale"})
    public static float typedDimensionValueToPixels(String str, Context context) {
        if (str == null) {
            return 0.0f;
        }
        String lowerCase = str.toLowerCase();
        HashMap<String, Float> map = f69858c;
        if (map.containsKey(lowerCase)) {
            return map.get(lowerCase).floatValue();
        }
        Matcher matcher = f69857b.matcher(lowerCase);
        if (!matcher.matches()) {
            throw new NumberFormatException();
        }
        float f6 = Float.parseFloat(matcher.group(1));
        Integer num = f69856a.get(matcher.group(3).toLowerCase());
        if (num == null) {
            num = 1;
        }
        float fApplyDimension = TypedValue.applyDimension(num.intValue(), f6, context.getResources().getDisplayMetrics());
        map.put(lowerCase, Float.valueOf(fApplyDimension));
        return fApplyDimension;
    }

    public static int typedDimensionValueToPixelsInt(String str, Context context) {
        if (str == null) {
            return 0;
        }
        return (int) typedDimensionValueToPixels(str, context);
    }
}
