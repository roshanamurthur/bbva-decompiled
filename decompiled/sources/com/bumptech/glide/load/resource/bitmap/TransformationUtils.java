package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import com.budiyev.android.codescanner.BarcodeUtils;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes9.dex */
public final class TransformationUtils {
    public static final int PAINT_FLAGS = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Paint f38604a = new Paint(6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Paint f38605b = new Paint(7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Paint f38606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Lock f38607d;

    public class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f38608a;

        public a(int i10) {
            this.f38608a = i10;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.TransformationUtils.c
        public final void a(Canvas canvas, RectF rectF, Paint paint) {
            float f6 = this.f38608a;
            canvas.drawRoundRect(rectF, f6, f6, paint);
        }
    }

    public class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f38609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f38610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f38611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f38612d;

        public b(float f6, float f10, float f11, float f12) {
            this.f38609a = f6;
            this.f38610b = f10;
            this.f38611c = f11;
            this.f38612d = f12;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.TransformationUtils.c
        public final void a(Canvas canvas, RectF rectF, Paint paint) {
            Path path = new Path();
            float f6 = this.f38609a;
            float f10 = this.f38610b;
            float f11 = this.f38611c;
            float f12 = this.f38612d;
            path.addRoundRect(rectF, new float[]{f6, f6, f10, f10, f11, f11, f12, f12}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    public interface c {
        void a(Canvas canvas, RectF rectF, Paint paint);
    }

    public static final class d implements Lock {
        @Override // java.util.concurrent.locks.Lock
        @NonNull
        public final Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock(long j10, @NonNull TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public final void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public final void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public final void unlock() {
        }
    }

    static {
        f38607d = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(Build.MODEL) ? new ReentrantLock() : new d();
        Paint paint = new Paint(7);
        f38606c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void a(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2, Matrix matrix) {
        Lock lock = f38607d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f38604a);
            canvas.setBitmap(null);
        } finally {
            lock.unlock();
        }
    }

    public static Bitmap b(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap) {
        Bitmap.Config configC = c(bitmap);
        if (configC.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmap2 = bitmapPool.get(bitmap.getWidth(), bitmap.getHeight(), configC);
        new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmap2;
    }

    @NonNull
    public static Bitmap.Config c(@NonNull Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    public static Bitmap centerCrop(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i10, int i11) {
        float width;
        float fA;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float fA2 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            width = i11 / bitmap.getHeight();
            fA2 = androidx.core.graphics.b.a(bitmap.getWidth(), width, i10, 0.5f);
            fA = 0.0f;
        } else {
            width = i10 / bitmap.getWidth();
            fA = androidx.core.graphics.b.a(bitmap.getHeight(), width, i11, 0.5f);
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (fA2 + 0.5f), (int) (fA + 0.5f));
        Bitmap bitmap2 = bitmapPool.get(i10, i11, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        setAlpha(bitmap, bitmap2);
        a(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    public static Bitmap centerInside(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i10, int i11) {
        return (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) ? fitCenter(bitmapPool, bitmap, i10, i11) : bitmap;
    }

    public static Bitmap circleCrop(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i10, int i11) {
        int iMin = Math.min(i10, i11);
        float f6 = iMin;
        float f10 = f6 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f6 / width, f6 / height);
        float f11 = width * fMax;
        float f12 = fMax * height;
        float f13 = (f6 - f11) / 2.0f;
        float f14 = (f6 - f12) / 2.0f;
        RectF rectF = new RectF(f13, f14, f11 + f13, f12 + f14);
        Bitmap bitmapB = b(bitmapPool, bitmap);
        Bitmap bitmap2 = bitmapPool.get(iMin, iMin, c(bitmap));
        bitmap2.setHasAlpha(true);
        Lock lock = f38607d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawCircle(f10, f10, f10, f38605b);
            canvas.drawBitmap(bitmapB, (Rect) null, rectF, f38606c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapB.equals(bitmap)) {
                bitmapPool.put(bitmapB);
            }
            return bitmap2;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    public static Bitmap d(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, c cVar) {
        Bitmap.Config configC = c(bitmap);
        Bitmap bitmapB = b(bitmapPool, bitmap);
        Bitmap bitmap2 = bitmapPool.get(bitmapB.getWidth(), bitmapB.getHeight(), configC);
        bitmap2.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapB, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight());
        Lock lock = f38607d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            cVar.a(canvas, rectF, paint);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapB.equals(bitmap)) {
                bitmapPool.put(bitmapB);
            }
            return bitmap2;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    public static Bitmap fitCenter(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        float fMin = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            return bitmap;
        }
        Bitmap bitmap2 = bitmapPool.get((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        setAlpha(bitmap, bitmap2);
        if (Log.isLoggable("TransformationUtils", 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            bitmap2.getWidth();
            bitmap2.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        a(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    public static Lock getBitmapDrawableLock() {
        return f38607d;
    }

    public static int getExifOrientationDegrees(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return BarcodeUtils.ROTATION_270;
            default:
                return 0;
        }
    }

    public static boolean isExifOrientationRequired(int i10) {
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap rotateImage(@NonNull Bitmap bitmap, int i10) {
        if (i10 == 0) {
            return bitmap;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.setRotate(i10);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception unused) {
            return bitmap;
        }
    }

    public static Bitmap rotateImageExif(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i10) {
        if (!isExifOrientationRequired(i10)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        switch (i10) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmap2 = bitmapPool.get(Math.round(rectF.width()), Math.round(rectF.height()), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmap2.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    @Deprecated
    public static Bitmap roundedCorners(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i10, int i11, int i12) {
        return roundedCorners(bitmapPool, bitmap, i12);
    }

    public static void setAlpha(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    public static Bitmap roundedCorners(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i10) {
        Preconditions.checkArgument(i10 > 0, "roundingRadius must be greater than 0.");
        return d(bitmapPool, bitmap, new a(i10));
    }

    public static Bitmap roundedCorners(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, float f6, float f10, float f11, float f12) {
        return d(bitmapPool, bitmap, new b(f6, f10, f11, f12));
    }
}
