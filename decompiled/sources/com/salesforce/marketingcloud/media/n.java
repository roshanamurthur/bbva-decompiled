package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
public class n implements Runnable {
    private static final String m = "ImageHandler-";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f64494n = "ImageHandler-Idle";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f64495o = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final u f64496p = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final o f64497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final h f64498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f64499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final u f64500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final com.salesforce.marketingcloud.media.c f64501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    s f64502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    com.salesforce.marketingcloud.media.a f64503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    List<com.salesforce.marketingcloud.media.a> f64504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    u.b f64505i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Future<?> f64506j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Exception f64507k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    o.c f64508l;

    public class a extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder(n.m);
        }
    }

    public class b extends u {
        @Override // com.salesforce.marketingcloud.media.u
        public void a(o oVar, s sVar, u.a aVar) throws IOException {
            aVar.onError(new k(sVar));
        }

        @Override // com.salesforce.marketingcloud.media.u
        public boolean a(s sVar) {
            return true;
        }
    }

    public class c implements u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f64509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f64510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicReference f64511c;

        public c(AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
            this.f64509a = atomicReference;
            this.f64510b = countDownLatch;
            this.f64511c = atomicReference2;
        }

        @Override // com.salesforce.marketingcloud.media.u.a
        public void a(u.b bVar) {
            this.f64509a.set(bVar);
            this.f64510b.countDown();
        }

        @Override // com.salesforce.marketingcloud.media.u.a
        public void onError(Throwable th2) {
            this.f64511c.set(th2);
            this.f64510b.countDown();
        }
    }

    public n(o oVar, h hVar, com.salesforce.marketingcloud.media.c cVar, com.salesforce.marketingcloud.media.a aVar, u uVar) {
        this.f64497a = oVar;
        this.f64498b = hVar;
        this.f64501e = cVar;
        this.f64503g = aVar;
        this.f64499c = aVar.c();
        this.f64502f = aVar.e();
        this.f64500d = uVar;
        this.f64508l = aVar.d();
    }

    public static Bitmap a(s sVar, Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f6 = sVar.f64545i;
        float f10 = sVar.f64546j;
        float f11 = width;
        float f12 = height;
        RectF rectF = new RectF(0.0f, 0.0f, f11, f12);
        RectF rectF2 = new RectF(0.0f, 0.0f, f11, f12);
        Paint paint = new Paint();
        Paint paint2 = new Paint();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        if (f10 > 0.0f) {
            paint2.setStrokeWidth(f10);
            paint2.setColor(sVar.f64547k);
            float f13 = f10 / 2.0f;
            rectF2.inset(f13, f13);
            float fFloor = (float) Math.floor(f13);
            rectF.inset(fFloor, fFloor);
        }
        if (f6 > 0.0f) {
            canvas.drawRoundRect(rectF, f6, f6, paint);
            if (f10 > 0.0f) {
                canvas.drawRoundRect(rectF2, f6, f6, paint2);
            }
        } else {
            canvas.drawRect(rectF, paint);
            if (f10 > 0.0f) {
                canvas.drawRect(rectF2, paint2);
            }
        }
        if (bitmap == bitmapCreateBitmap) {
            return bitmap;
        }
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static Bitmap b(s sVar, Bitmap bitmap) {
        int i10;
        int i11;
        int i12;
        float f6;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        int i13;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        int i14 = 0;
        if (sVar.d()) {
            int i15 = sVar.f64541e;
            int i16 = sVar.f64542f;
            if (sVar.f64543g) {
                if (i15 != 0) {
                    f17 = i15;
                    f18 = width;
                } else {
                    f17 = i16;
                    f18 = height;
                }
                float f21 = f17 / f18;
                if (i16 != 0) {
                    f19 = i16;
                    f20 = height;
                } else {
                    f19 = i15;
                    f20 = width;
                }
                float f22 = f19 / f20;
                if (f21 > f22) {
                    int iCeil = (int) Math.ceil((f22 / f21) * height);
                    f22 = i16 / iCeil;
                    i13 = (height - iCeil) / 2;
                    height = iCeil;
                } else if (f21 < f22) {
                    int iCeil2 = (int) Math.ceil((f21 / f22) * width);
                    int i17 = (width - iCeil2) / 2;
                    width = iCeil2;
                    f21 = i15 / iCeil2;
                    i13 = 0;
                    i14 = i17;
                } else {
                    i13 = 0;
                    f21 = f22;
                }
                matrix.preScale(f21, f22);
                i10 = width;
                i11 = height;
                i12 = i13;
            } else {
                if (sVar.f64544h) {
                    if (i15 != 0) {
                        f13 = i15;
                        f14 = width;
                    } else {
                        f13 = i16;
                        f14 = height;
                    }
                    float f23 = f13 / f14;
                    if (i16 != 0) {
                        f15 = i16;
                        f16 = height;
                    } else {
                        f15 = i15;
                        f16 = width;
                    }
                    float f24 = f15 / f16;
                    if (f23 >= f24) {
                        f23 = f24;
                    }
                    matrix.preScale(f23, f23);
                } else if ((i15 != 0 || i16 != 0) && (i15 != width || i16 != height)) {
                    if (i15 != 0) {
                        f6 = i15;
                        f10 = width;
                    } else {
                        f6 = i16;
                        f10 = height;
                    }
                    float f25 = f6 / f10;
                    if (i16 != 0) {
                        f11 = i16;
                        f12 = height;
                    } else {
                        f11 = i15;
                        f12 = width;
                    }
                    matrix.preScale(f25, f11 / f12);
                }
                i10 = width;
                i11 = height;
                i12 = 0;
            }
        } else {
            i10 = width;
            i11 = height;
            i12 = 0;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i14, i12, i10, i11, matrix, true);
        if (bitmapCreateBitmap == bitmap) {
            return bitmap;
        }
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public com.salesforce.marketingcloud.media.a c() {
        return this.f64503g;
    }

    public List<com.salesforce.marketingcloud.media.a> d() {
        return this.f64504h;
    }

    public s e() {
        return this.f64502f;
    }

    public Exception f() {
        return this.f64507k;
    }

    public o g() {
        return this.f64497a;
    }

    public String h() {
        return this.f64499c;
    }

    public u.b i() {
        return this.f64505i;
    }

    public boolean j() {
        Future<?> future = this.f64506j;
        return future != null && future.isCancelled();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                a(this.f64502f);
                u.b bVarB = b();
                this.f64505i = bVarB;
                if (bVarB.d()) {
                    com.salesforce.marketingcloud.g.a("IMAGE", "onSuccess - Loaded from: %s", this.f64505i.c());
                    this.f64498b.b(this);
                } else {
                    this.f64498b.c(this);
                }
            } catch (Exception e5) {
                this.f64507k = e5;
                this.f64498b.c(this);
            }
        } finally {
            Thread.currentThread().setName(f64494n);
        }
    }

    public static n a(o oVar, h hVar, com.salesforce.marketingcloud.media.c cVar, com.salesforce.marketingcloud.media.a aVar) {
        s sVarE = aVar.e();
        List<u> listA = oVar.a();
        int size = listA.size();
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = listA.get(i10);
            if (uVar.a(sVarE)) {
                return new n(oVar, hVar, cVar, aVar, uVar);
            }
        }
        return new n(oVar, hVar, cVar, aVar, f64496p);
    }

    public u.b b() throws IOException {
        Bitmap bitmapA;
        if (s.b.a(this.f64502f.f64540d) && (bitmapA = this.f64501e.a(this.f64499c)) != null) {
            return new u.b(bitmapA, o.b.MEMORY);
        }
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            this.f64500d.a(this.f64497a, this.f64502f, new c(atomicReference, countDownLatch, atomicReference2));
            countDownLatch.await();
            Throwable th2 = (Throwable) atomicReference2.get();
            if (th2 != null) {
                throw new RuntimeException(th2);
            }
            u.b bVar = (u.b) atomicReference.get();
            if (!bVar.d()) {
                return bVar;
            }
            Bitmap bitmapA2 = bVar.a();
            if (!this.f64502f.e()) {
                return bVar;
            }
            if (this.f64502f.d()) {
                bitmapA2 = b(this.f64502f, bitmapA2);
            }
            if (this.f64502f.c()) {
                bitmapA2 = a(this.f64502f, bitmapA2);
            }
            return new u.b(bitmapA2, bVar.c());
        } catch (InterruptedException e5) {
            throw new InterruptedIOException(e5.getMessage());
        }
    }

    public void a(com.salesforce.marketingcloud.media.a aVar) {
        if (this.f64503g == null) {
            this.f64503g = aVar;
            return;
        }
        if (this.f64504h == null) {
            this.f64504h = new ArrayList();
        }
        this.f64504h.add(aVar);
        o.c cVarD = aVar.d();
        if (cVarD.ordinal() > this.f64508l.ordinal()) {
            this.f64508l = cVarD;
        }
    }

    public void b(com.salesforce.marketingcloud.media.a aVar) {
        if (this.f64503g == aVar) {
            this.f64503g = null;
            return;
        }
        List<com.salesforce.marketingcloud.media.a> list = this.f64504h;
        if (list != null) {
            list.remove(aVar);
        }
    }

    public static void a(s sVar) {
        String strB = sVar.b();
        StringBuilder sb2 = f64495o.get();
        sb2.ensureCapacity(strB.length() + 13);
        sb2.replace(13, sb2.length(), strB);
        Thread.currentThread().setName(sb2.toString());
    }

    public boolean a() {
        Future<?> future;
        if (this.f64503g != null) {
            return false;
        }
        List<com.salesforce.marketingcloud.media.a> list = this.f64504h;
        return (list == null || list.isEmpty()) && (future = this.f64506j) != null && future.cancel(false);
    }
}
