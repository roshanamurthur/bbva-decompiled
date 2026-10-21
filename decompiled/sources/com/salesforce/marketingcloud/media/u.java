package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@VisibleForTesting(otherwise = 3)
public abstract class u {

    public interface a {
        void a(b bVar);

        void onError(Throwable th2);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o.b f64567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bitmap f64568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Drawable f64569c;

        private b(Bitmap bitmap, Drawable drawable, o.b bVar) {
            this.f64568b = bitmap;
            this.f64569c = drawable;
            this.f64567a = bVar;
        }

        public Bitmap a() {
            return this.f64568b;
        }

        public Drawable b() {
            return this.f64569c;
        }

        public o.b c() {
            return this.f64567a;
        }

        public boolean d() {
            return this.f64568b != null;
        }

        public boolean e() {
            return this.f64569c != null;
        }

        public b(Bitmap bitmap, o.b bVar) {
            this(bitmap, null, bVar);
        }

        public b(Drawable drawable, o.b bVar) {
            this(null, drawable, bVar);
        }
    }

    public static Bitmap a(InputStream inputStream, s sVar) throws IOException {
        BitmapFactory.Options optionsB = b(sVar);
        boolean zA = a(optionsB);
        byte[] bArrA = com.salesforce.marketingcloud.util.g.a(inputStream);
        if (zA) {
            BitmapFactory.decodeStream(new ByteArrayInputStream(bArrA), null, optionsB);
            a(sVar.f64541e, sVar.f64542f, optionsB);
        }
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(bArrA), null, optionsB);
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        throw new IOException("Failed to decode bitmap");
    }

    public static BitmapFactory.Options b(s sVar) {
        if (!sVar.d()) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        return options;
    }

    public abstract void a(o oVar, s sVar, a aVar) throws IOException;

    public abstract boolean a(s sVar);

    public static void a(int i10, int i11, int i12, int i13, BitmapFactory.Options options) {
        int iMin;
        double d2;
        if (i13 > i11 || i12 > i10) {
            if (i11 == 0) {
                d2 = i12 / i10;
            } else if (i10 == 0) {
                d2 = i13 / i11;
            } else {
                iMin = Math.min((int) Math.floor(i13 / i11), (int) Math.floor(i12 / i10));
            }
            iMin = (int) Math.floor(d2);
        } else {
            iMin = 1;
        }
        options.inSampleSize = iMin;
        options.inJustDecodeBounds = false;
    }

    private static void a(int i10, int i11, BitmapFactory.Options options) {
        a(i10, i11, options.outWidth, options.outHeight, options);
    }

    public static boolean a(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }
}
