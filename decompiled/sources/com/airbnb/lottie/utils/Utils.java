package com.airbnb.lottie.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.L;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.content.TrimPathContent;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes2.dex */
public final class Utils {
    public static final int SECOND_IN_NANOS = 1000000000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f26215a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f26216b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f26217c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f26218d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f26219e = (float) (Math.sqrt(2.0d) / 2.0d);

    public class a extends ThreadLocal<PathMeasure> {
        @Override // java.lang.ThreadLocal
        public final PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    public class b extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    }

    public class c extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    }

    public class d extends ThreadLocal<float[]> {
        @Override // java.lang.ThreadLocal
        public final float[] initialValue() {
            return new float[4];
        }
    }

    public static void applyTrimPathIfNeeded(Path path, @Nullable TrimPathContent trimPathContent) {
        if (trimPathContent == null || trimPathContent.isHidden()) {
            return;
        }
        applyTrimPathIfNeeded(path, ((FloatKeyframeAnimation) trimPathContent.getStart()).getFloatValue() / 100.0f, ((FloatKeyframeAnimation) trimPathContent.getEnd()).getFloatValue() / 100.0f, ((FloatKeyframeAnimation) trimPathContent.getOffset()).getFloatValue() / 360.0f);
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e5) {
                throw e5;
            } catch (Exception unused) {
            }
        }
    }

    public static Path createPath(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f6 = pointF3.x + pointF.x;
            float f10 = pointF.y + pointF3.y;
            float f11 = pointF2.x;
            float f12 = f11 + pointF4.x;
            float f13 = pointF2.y;
            path.cubicTo(f6, f10, f12, f13 + pointF4.y, f11, f13);
        }
        return path;
    }

    public static float dpScale() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float getAnimationScale(@NonNull Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static float getScale(Matrix matrix) {
        float[] fArr = f26218d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f6 = f26219e;
        fArr[2] = f6;
        fArr[3] = f6;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean hasZeroScaleAxis(Matrix matrix) {
        float[] fArr = f26218d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static int hashFor(float f6, float f10, float f11, float f12) {
        int i10 = f6 != 0.0f ? (int) (527 * f6) : 17;
        if (f10 != 0.0f) {
            i10 = (int) (i10 * 31 * f10);
        }
        if (f11 != 0.0f) {
            i10 = (int) (i10 * 31 * f11);
        }
        return f12 != 0.0f ? (int) (i10 * 31 * f12) : i10;
    }

    public static boolean isAtLeastVersion(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i10 < i13) {
            return false;
        }
        if (i10 > i13) {
            return true;
        }
        if (i11 < i14) {
            return false;
        }
        return i11 > i14 || i12 >= i15;
    }

    public static boolean isNetworkException(Throwable th2) {
        return (th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException);
    }

    public static int mixOpacities(int i10, int i11) {
        return (int) ((((i10 / 255.0f) * i11) / 255.0f) * 255.0f);
    }

    public static Bitmap renderPath(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) rectF.right, (int) rectF.bottom, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        LPaint lPaint = new LPaint();
        lPaint.setAntiAlias(true);
        lPaint.setColor(-16776961);
        canvas.drawPath(path, lPaint);
        return bitmapCreateBitmap;
    }

    public static Bitmap resizeBitmapIfNeeded(Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static void saveLayerCompat(Canvas canvas, RectF rectF, Paint paint) {
        saveLayerCompat(canvas, rectF, paint, 31);
    }

    public static void saveLayerCompat(Canvas canvas, RectF rectF, Paint paint, int i10) {
        if (L.isTraceEnabled()) {
            L.beginSection("Utils#saveLayer");
        }
        canvas.saveLayer(rectF, paint);
        if (L.isTraceEnabled()) {
            L.endSection("Utils#saveLayer");
        }
    }

    public static void applyTrimPathIfNeeded(Path path, float f6, float f10, float f11) {
        if (L.isTraceEnabled()) {
            L.beginSection("applyTrimPathIfNeeded");
        }
        PathMeasure pathMeasure = f26215a.get();
        Path path2 = f26216b.get();
        Path path3 = f26217c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f6 == 1.0f && f10 == 0.0f) {
            if (L.isTraceEnabled()) {
                L.endSection("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (length >= 1.0f && Math.abs((f10 - f6) - 1.0f) >= 0.01d) {
            float f12 = f6 * length;
            float f13 = f10 * length;
            float f14 = f11 * length;
            float fMin = Math.min(f12, f13) + f14;
            float fMax = Math.max(f12, f13) + f14;
            if (fMin >= length && fMax >= length) {
                fMin = MiscUtils.a(fMin, length);
                fMax = MiscUtils.a(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = MiscUtils.a(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = MiscUtils.a(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                if (L.isTraceEnabled()) {
                    L.endSection("applyTrimPathIfNeeded");
                    return;
                }
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            if (L.isTraceEnabled()) {
                L.endSection("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (L.isTraceEnabled()) {
            L.endSection("applyTrimPathIfNeeded");
        }
    }
}
