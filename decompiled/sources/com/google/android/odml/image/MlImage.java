package com.google.android.odml.image;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;
import re.f;

/* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* JADX INFO: loaded from: classes10.dex */
public class MlImage implements Closeable {
    public static final int IMAGE_FORMAT_ALPHA = 8;
    public static final int IMAGE_FORMAT_JPEG = 9;
    public static final int IMAGE_FORMAT_NV12 = 3;
    public static final int IMAGE_FORMAT_NV21 = 4;
    public static final int IMAGE_FORMAT_RGB = 2;
    public static final int IMAGE_FORMAT_RGBA = 1;
    public static final int IMAGE_FORMAT_UNKNOWN = 0;
    public static final int IMAGE_FORMAT_YUV_420_888 = 7;
    public static final int IMAGE_FORMAT_YV12 = 5;
    public static final int IMAGE_FORMAT_YV21 = 6;
    public static final int STORAGE_TYPE_BITMAP = 1;
    public static final int STORAGE_TYPE_BYTEBUFFER = 2;
    public static final int STORAGE_TYPE_MEDIA_IMAGE = 3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final f f46005p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f46006q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f46007r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f46008s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f46009t0;

    /* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ImageFormat {
    }

    /* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
    public static final class Internal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MlImage f46010a;

        public /* synthetic */ Internal(MlImage mlImage) {
            this.f46010a = mlImage;
        }

        public void acquire() {
            MlImage mlImage = this.f46010a;
            synchronized (mlImage) {
                mlImage.f46009t0++;
            }
        }
    }

    /* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface StorageType {
    }

    public MlImage(f fVar, int i10, Rect rect, int i11, int i12) {
        this.f46005p0 = fVar;
        this.f46006q0 = i10;
        new Rect().set(rect);
        this.f46007r0 = i11;
        this.f46008s0 = i12;
        this.f46009t0 = 1;
    }

    public static void a(int i10) {
        if (i10 == 0 || i10 == 90 || i10 == 180 || i10 == 270) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(68);
        sb2.append("Rotation value ");
        sb2.append(i10);
        sb2.append(" is not valid. Use only 0, 90, 180 or 270.");
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        int i10 = this.f46009t0 - 1;
        this.f46009t0 = i10;
        if (i10 == 0) {
            this.f46005p0.zzc();
        }
    }

    @NonNull
    public List<ImageProperties> getContainedImageProperties() {
        return Collections.singletonList(this.f46005p0.zzb());
    }

    public int getHeight() {
        return this.f46008s0;
    }

    @NonNull
    public Internal getInternal() {
        return new Internal(this);
    }

    public int getRotation() {
        return this.f46006q0;
    }

    public int getWidth() {
        return this.f46007r0;
    }
}
