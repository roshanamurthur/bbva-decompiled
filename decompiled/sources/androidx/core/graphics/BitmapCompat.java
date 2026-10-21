package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public final class BitmapCompat {

    @RequiresApi(17)
    public static class a {
        @DoNotInline
        public static boolean a(Bitmap bitmap) {
            return bitmap.hasMipMap();
        }

        @DoNotInline
        public static void b(Bitmap bitmap, boolean z10) {
            bitmap.setHasMipMap(z10);
        }
    }

    @RequiresApi(19)
    public static class b {
        @DoNotInline
        public static int a(Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    }

    @RequiresApi(27)
    public static class c {
        @DoNotInline
        public static Bitmap a(Bitmap bitmap) {
            if (bitmap.getConfig() != Bitmap.Config.HARDWARE) {
                return bitmap;
            }
            Bitmap.Config configA = Bitmap.Config.ARGB_8888;
            if (Build.VERSION.SDK_INT >= 31) {
                configA = e.a(bitmap);
            }
            return bitmap.copy(configA, true);
        }

        @DoNotInline
        public static Bitmap b(int i10, int i11, Bitmap bitmap, boolean z10) {
            Bitmap.Config config = bitmap.getConfig();
            ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z10 && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = e.a(bitmap);
                }
            }
            return Bitmap.createBitmap(i10, i11, config, bitmap.hasAlpha(), colorSpace);
        }

        @DoNotInline
        public static boolean c(Bitmap bitmap) {
            return bitmap.getConfig() == Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB));
        }
    }

    @RequiresApi(29)
    public static class d {
        @DoNotInline
        public static void a(Paint paint) {
            paint.setBlendMode(BlendMode.SRC);
        }
    }

    @RequiresApi(31)
    public static class e {
        @DoNotInline
        public static Bitmap.Config a(Bitmap bitmap) {
            return bitmap.getHardwareBuffer().getFormat() == 22 ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
        }
    }

    @VisibleForTesting
    public static int a(int i10, int i11, int i12, int i13) {
        if (i12 == 0) {
            return i11;
        }
        return i12 > 0 ? i10 * (1 << (i13 - i12)) : i11 << ((-i12) - 1);
    }

    @NonNull
    public static Bitmap createScaledBitmap(@NonNull Bitmap bitmap, int i10, int i11, @Nullable Rect rect, boolean z10) {
        Paint paint;
        Bitmap bitmap2;
        int i12;
        Rect rect2;
        Bitmap bitmapCreateBitmap;
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("dstW and dstH must be > 0!");
        }
        if (rect != null && (rect.isEmpty() || rect.left < 0 || rect.right > bitmap.getWidth() || rect.top < 0 || rect.bottom > bitmap.getHeight())) {
            throw new IllegalArgumentException("srcRect must be contained by srcBm!");
        }
        int i13 = Build.VERSION.SDK_INT;
        Bitmap bitmapA = i13 >= 27 ? c.a(bitmap) : bitmap;
        int iWidth = rect != null ? rect.width() : bitmap.getWidth();
        int iHeight = rect != null ? rect.height() : bitmap.getHeight();
        float f6 = i10 / iWidth;
        float f10 = i11 / iHeight;
        int i14 = rect != null ? rect.left : 0;
        int i15 = rect != null ? rect.top : 0;
        if (i14 == 0 && i15 == 0 && i10 == bitmap.getWidth() && i11 == bitmap.getHeight()) {
            return (bitmap.isMutable() && bitmap == bitmapA) ? bitmap.copy(bitmap.getConfig(), true) : bitmapA;
        }
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        if (i13 >= 29) {
            d.a(paint2);
        } else {
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        }
        if (iWidth == i10 && iHeight == i11) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i10, i11, bitmapA.getConfig());
            new Canvas(bitmapCreateBitmap2).drawBitmap(bitmapA, -i14, -i15, paint2);
            return bitmapCreateBitmap2;
        }
        double dLog = Math.log(2.0d);
        int iCeil = (int) (f6 > 1.0f ? Math.ceil(Math.log(f6) / dLog) : Math.floor(Math.log(f6) / dLog));
        int iCeil2 = (int) (f10 > 1.0f ? Math.ceil(Math.log(f10) / dLog) : Math.floor(Math.log(f10) / dLog));
        if (!z10 || i13 < 27 || c.c(bitmap)) {
            paint = paint2;
            bitmap2 = null;
            i12 = 0;
        } else {
            Bitmap bitmapB = c.b(iCeil > 0 ? a(iWidth, i10, 1, iCeil) : iWidth, iCeil2 > 0 ? a(iHeight, i11, 1, iCeil2) : iHeight, bitmap, true);
            paint = paint2;
            new Canvas(bitmapB).drawBitmap(bitmapA, -i14, -i15, paint);
            i12 = 1;
            i15 = 0;
            i14 = 0;
            bitmap2 = bitmapA;
            bitmapA = bitmapB;
        }
        Rect rect3 = new Rect(i14, i15, iWidth, iHeight);
        Rect rect4 = new Rect();
        int i16 = iCeil;
        int i17 = iCeil2;
        while (true) {
            if (i16 == 0 && i17 == 0) {
                break;
            }
            if (i16 < 0) {
                i16++;
            } else if (i16 > 0) {
                i16--;
            }
            if (i17 < 0) {
                i17++;
            } else if (i17 > 0) {
                i17--;
            }
            int i18 = i17;
            Paint paint3 = paint;
            Rect rect5 = rect3;
            rect4.set(0, 0, a(iWidth, i10, i16, iCeil), a(iHeight, i11, i18, iCeil2));
            boolean z11 = i16 == 0 && i18 == 0;
            boolean z12 = bitmap2 != null && bitmap2.getWidth() == i10 && bitmap2.getHeight() == i11;
            if (bitmap2 == null || bitmap2 == bitmap) {
                rect2 = rect4;
            } else {
                if (z10) {
                    rect2 = rect4;
                    if (Build.VERSION.SDK_INT < 27 || c.c(bitmap2)) {
                    }
                    Rect rect6 = rect2;
                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapA, rect5, rect6, paint3);
                    rect5.set(rect6);
                    i17 = i18;
                    Bitmap bitmap3 = bitmapA;
                    bitmapA = bitmapCreateBitmap;
                    rect4 = rect6;
                    rect3 = rect5;
                    paint = paint3;
                    bitmap2 = bitmap3;
                } else {
                    rect2 = rect4;
                }
                if (!z11 || (z12 && i12 == 0)) {
                    bitmapCreateBitmap = bitmap2;
                }
                Rect rect7 = rect2;
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapA, rect5, rect7, paint3);
                rect5.set(rect7);
                i17 = i18;
                Bitmap bitmap4 = bitmapA;
                bitmapA = bitmapCreateBitmap;
                rect4 = rect7;
                rect3 = rect5;
                paint = paint3;
                bitmap2 = bitmap4;
            }
            if (bitmap2 != bitmap && bitmap2 != null) {
                bitmap2.recycle();
            }
            int iA = a(iWidth, i10, i16 > 0 ? i12 : i16, iCeil);
            int iA2 = a(iHeight, i11, i18 > 0 ? i12 : i18, iCeil2);
            if (Build.VERSION.SDK_INT >= 27) {
                bitmapCreateBitmap = c.b(iA, iA2, bitmap, z10 && !z11);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(iA, iA2, bitmapA.getConfig());
            }
            Rect rect8 = rect2;
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapA, rect5, rect8, paint3);
            rect5.set(rect8);
            i17 = i18;
            Bitmap bitmap5 = bitmapA;
            bitmapA = bitmapCreateBitmap;
            rect4 = rect8;
            rect3 = rect5;
            paint = paint3;
            bitmap2 = bitmap5;
        }
        if (bitmap2 != bitmap && bitmap2 != null) {
            bitmap2.recycle();
        }
        return bitmapA;
    }

    public static int getAllocationByteCount(@NonNull Bitmap bitmap) {
        return b.a(bitmap);
    }

    public static boolean hasMipMap(@NonNull Bitmap bitmap) {
        return a.a(bitmap);
    }

    public static void setHasMipMap(@NonNull Bitmap bitmap, boolean z10) {
        a.b(bitmap, z10);
    }
}
