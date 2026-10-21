package io.card.payment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;

/* JADX INFO: compiled from: Logo.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f69774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f69775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f69776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f69777d;

    public e(Context context) {
        Paint paint = new Paint();
        this.f69774a = paint;
        paint.setAntiAlias(true);
        paint.setAlpha(100);
        this.f69775b = null;
        this.f69777d = context;
    }

    public final void a(boolean z10) {
        if (this.f69775b == null || z10 != this.f69776c) {
            this.f69776c = z10;
            Context context = this.f69777d;
            if (z10) {
                this.f69775b = BitmapFactory.decodeResource(context.getResources(), R.drawable.cio_card_io_logo);
            } else {
                this.f69775b = BitmapFactory.decodeResource(context.getResources(), R.drawable.cio_paypal_logo);
            }
        }
    }
}
