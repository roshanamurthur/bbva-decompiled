package com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public class c extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ShapeDrawable f65886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ShapeDrawable f65887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f65888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f65889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f65890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f65891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f65892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f65893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f65894i;

    public c(Context context, int i10) {
        super(context);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        this.f65886a = shapeDrawable;
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        shapeDrawable.getPaint().setStrokeWidth(8.0f);
        shapeDrawable.getPaint().setAntiAlias(true);
        shapeDrawable.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RectShape());
        this.f65887b = shapeDrawable2;
        shapeDrawable2.getPaint().setColor(i10);
        setFilterTouchesWhenObscured(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f65888c = ((View) getParent()).getWidth();
        int height = ((View) getParent()).getHeight();
        this.f65889d = height;
        int iMax = Math.max(this.f65888c, height);
        int iMin = Math.min(this.f65888c, this.f65889d);
        if (iMax / 2 > iMin) {
            iMax = (iMin * 2) - 2;
        }
        int i10 = iMax / 2;
        this.f65890e = i10;
        int i11 = (this.f65888c - i10) / 2;
        this.f65891f = i11;
        int i12 = (this.f65889d - i10) / 2;
        this.f65893h = i12;
        int i13 = i11 + i10;
        this.f65892g = i13;
        int i14 = i10 + i12;
        this.f65894i = i14;
        this.f65886a.setBounds(i11, i12, i13, i14);
        this.f65887b.setBounds(0, 0, this.f65888c, this.f65889d);
        this.f65887b.draw(canvas);
        this.f65886a.draw(canvas);
    }
}
