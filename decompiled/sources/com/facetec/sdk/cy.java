package com.facetec.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import java.util.Random;

/* JADX INFO: loaded from: classes9.dex */
class cy extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int[] f41075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f41076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f41077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageView f41078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f41079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41080f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f41081i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RoundedBitmapDrawable[] f41082j;

    public cy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10 = 0;
        this.f41082j = new RoundedBitmapDrawable[0];
        this.f41075a = new int[0];
        this.f41076b = 0;
        this.f41079e = true;
        if (db.aQ().length == 0) {
            return;
        }
        this.f41081i = new Handler(Looper.getMainLooper());
        this.f41078d = new ImageView(context);
        this.f41077c = new ImageView(context);
        this.f41078d.setAlpha(1.0f);
        this.f41077c.setAlpha(0.0f);
        ImageView imageView = this.f41078d;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        imageView.setScaleType(scaleType);
        this.f41078d.setAdjustViewBounds(true);
        this.f41077c.setScaleType(scaleType);
        this.f41077c.setAdjustViewBounds(true);
        this.f41080f = true;
        addView(this.f41078d);
        addView(this.f41077c);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(ay.e((int) (db.z() * db.d())));
        gradientDrawable.setStroke((int) ay.e(Math.max(db.k() == 0 ? 0 : 1, (int) (db.k() * db.d()))), ((Integer) db.c(new Object[]{context}, -188757680, 188757724, (int) System.currentTimeMillis())).intValue());
        gradientDrawable.setColor(0);
        setBackground(gradientDrawable);
        setClipToOutline(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        if (FaceTecSDK.f40106a.f40086i.enableRetryScreenSlideshowShuffle) {
            int[] iArrAQ = db.aQ();
            Random random = new Random();
            for (int i11 = 0; i11 < iArrAQ.length; i11++) {
                int iNextInt = random.nextInt(iArrAQ.length);
                int i12 = iArrAQ[iNextInt];
                iArrAQ[iNextInt] = iArrAQ[i11];
                iArrAQ[i11] = i12;
            }
            this.f41075a = iArrAQ;
        } else {
            this.f41075a = db.aQ();
        }
        Resources resources = getResources();
        this.f41082j = new RoundedBitmapDrawable[this.f41075a.length];
        while (true) {
            int[] iArr = this.f41075a;
            if (i10 >= iArr.length) {
                this.f41078d.setImageDrawable(this.f41082j[this.f41076b]);
                return;
            } else {
                this.f41082j[i10] = RoundedBitmapDrawableFactory.create(resources, BitmapFactory.decodeResource(resources, iArr[i10]));
                i10++;
            }
        }
    }

    private int d() {
        int i10 = this.f41076b;
        if (i10 == this.f41082j.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    public final void c() {
        Handler handler = this.f41081i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f41081i = null;
        }
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void j() {
        int iD = d();
        this.f41076b = iD;
        RoundedBitmapDrawable roundedBitmapDrawable = this.f41082j[iD];
        if (this.f41080f) {
            this.f41077c.setImageDrawable(roundedBitmapDrawable);
        } else {
            this.f41078d.setImageDrawable(roundedBitmapDrawable);
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b() {
        Handler handler;
        if (!this.f41079e) {
            if (this.f41080f) {
                this.f41077c.animate().alpha(1.0f).setDuration(800L).setListener(null).start();
                this.f41078d.animate().alpha(0.0f).setDuration(800L).setListener(null).start();
            } else {
                this.f41077c.animate().alpha(0.0f).setDuration(800L).setListener(null).start();
                this.f41078d.animate().alpha(1.0f).setDuration(800L).setListener(null).start();
            }
            this.f41080f = !this.f41080f;
            Handler handler2 = this.f41081i;
            if (handler2 != null) {
                handler2.postDelayed(new r1(this, 3), 800L);
            }
        }
        int i10 = FaceTecSDK.f40106a.f40086i.retryScreenSlideshowInterval;
        if (this.f41079e) {
            i10 /= 2;
            this.f41079e = false;
        }
        int iMax = Math.max(500, i10);
        if (this.f41075a.length <= 1 || (handler = this.f41081i) == null) {
            return;
        }
        handler.postDelayed(new s1(this, 4), iMax);
    }
}
