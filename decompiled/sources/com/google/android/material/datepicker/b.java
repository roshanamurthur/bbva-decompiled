package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: compiled from: CalendarStyle.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f44557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final a f44558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final a f44559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final a f44560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final a f44561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final a f44562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final a f44563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Paint f44564h;

    public b(@NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.resolveOrThrow(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), R.styleable.MaterialCalendar);
        this.f44557a = a.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayStyle, 0));
        this.f44563g = a.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayInvalidStyle, 0));
        this.f44558b = a.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_daySelectedStyle, 0));
        this.f44559c = a.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.MaterialCalendar_rangeFillColor);
        this.f44560d = a.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearStyle, 0));
        this.f44561e = a.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearSelectedStyle, 0));
        this.f44562f = a.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f44564h = paint;
        paint.setColor(colorStateList.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
