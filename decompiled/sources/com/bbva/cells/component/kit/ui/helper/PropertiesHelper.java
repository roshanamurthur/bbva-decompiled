package com.bbva.cells.component.kit.ui.helper;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.androidtoolkit.utils.ResourceUtils;
import com.noknok.android.client.metrics.Tabulator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class PropertiesHelper {
    public static int loadColor(Context context, Property property) {
        String str = property.f26695p0;
        str.getClass();
        boolean zEquals = str.equals("resource");
        String str2 = property.f26696q0;
        return !zEquals ? Color.parseColor(str2) : ResourceUtils.getColor(context, str2);
    }

    public static void loadColorState(TextView textView, Property property) {
        String str = property.f26695p0;
        str.getClass();
        if (str.equals("resource")) {
            textView.setTextColor(ContextCompat.getColorStateList(textView.getContext(), ResourceUtils.getIdentifier(textView.getContext(), property.f26696q0, "color")));
        }
    }

    public static int loadColorStateId(Context context, Property property) {
        String str = property.f26695p0;
        str.getClass();
        if (str.equals("resource")) {
            return ResourceUtils.getIdentifier(context, property.f26696q0, "color");
        }
        return 0;
    }

    public static float loadDimension(Context context, Property property) {
        int i10;
        String str = property.f26695p0;
        str.getClass();
        boolean zEquals = str.equals("resource");
        String str2 = property.f26696q0;
        if (zEquals) {
            return ResourceUtils.getDimension(context, str2);
        }
        String str3 = property.f26697r0;
        str3.getClass();
        if (str3.equals("dp")) {
            i10 = 1;
        } else {
            i10 = !str3.equals("sp") ? 0 : 2;
        }
        return TypedValue.applyDimension(i10, Float.valueOf(str2).floatValue(), context.getResources().getDisplayMetrics());
    }

    public static int loadDrawableId(Context context, Property property) {
        return ResourceUtils.getDrawable(context, property.f26696q0);
    }

    public static int loadDrawableStateId(Context context, Property property) {
        String str = property.f26695p0;
        str.getClass();
        if (str.equals("resource")) {
            return ResourceUtils.getIdentifier(context, property.f26696q0, PluginUtils.IDENTIFIER_DRAWABLE);
        }
        return 0;
    }

    public static void loadImage(ImageView imageView, Property property) {
        String str = property.f26695p0;
        str.getClass();
        if (str.equals("resource")) {
            imageView.setImageResource(ResourceUtils.getDrawable(imageView.getContext(), property.f26696q0));
        }
    }

    public static String loadString(Context context, Property property) {
        String str = property.f26695p0;
        str.getClass();
        boolean zEquals = str.equals("resource");
        String str2 = property.f26696q0;
        return (zEquals || str.equals("htmlResource")) ? ResourceUtils.getString(context, str2) : str2;
    }

    public static Typeface loadTypeface(Context context, String str) {
        return ResourcesCompat.getFont(context, ResourceUtils.getIdentifier(context, str, "font"));
    }

    public static class Property implements Parcelable {
        public static final Parcelable.Creator<Property> CREATOR = new a();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final String f26695p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final String f26696q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final String f26697r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f26698s0;

        public static class a implements Parcelable.Creator<Property> {
            @Override // android.os.Parcelable.Creator
            public final Property createFromParcel(Parcel parcel) {
                return new Property(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Property[] newArray(int i10) {
                return new Property[i10];
            }
        }

        public Property() {
            this.f26698s0 = true;
        }

        public static Property from(@Nullable Map<String, String> map) {
            if (map == null) {
                return new Property();
            }
            return new Property(map.get("type"), map.get("value"), map.get(Tabulator.KEY_UNIT));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getType() {
            return this.f26695p0;
        }

        public String getUnit() {
            return this.f26697r0;
        }

        public String getValue() {
            return this.f26696q0;
        }

        public boolean isEmpty() {
            return this.f26698s0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f26695p0);
            parcel.writeString(this.f26696q0);
            parcel.writeString(this.f26697r0);
            parcel.writeByte(this.f26698s0 ? (byte) 1 : (byte) 0);
        }

        public Property(String str, String str2, String str3) {
            this.f26695p0 = str;
            this.f26696q0 = str2;
            this.f26697r0 = str3;
        }

        public static Property from(@Nullable Bundle bundle) {
            if (bundle == null) {
                return new Property();
            }
            return new Property(bundle.getString("type", ""), bundle.getString("value"), bundle.getString(Tabulator.KEY_UNIT, ""));
        }

        public Property(Parcel parcel) {
            this.f26695p0 = parcel.readString();
            this.f26696q0 = parcel.readString();
            this.f26697r0 = parcel.readString();
            this.f26698s0 = parcel.readByte() != 0;
        }
    }

    public static void loadString(Context context, TextView textView, Property property) {
        String str = property.f26695p0;
        str.getClass();
        if (str.equals("resource")) {
            textView.setText(loadString(context, property));
        } else if (!str.equals("htmlResource")) {
            textView.setText(property.f26696q0);
        } else {
            textView.setText(Html.fromHtml(loadString(context, property)));
        }
    }
}
