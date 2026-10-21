package com.google.mlkit.vision.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzlg;
import com.google.android.gms.internal.mlkit_vision_common.zzli;
import com.google.mlkit.common.sdkinternal.MLTaskInput;
import com.google.mlkit.vision.common.internal.ImageConvertUtils;
import com.google.mlkit.vision.common.internal.ImageUtils;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import javax.annotation.concurrent.Immutable;
import tg.b;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes10.dex */
@Immutable
public class InputImage implements MLTaskInput {

    @KeepForSdk
    public static final int IMAGE_FORMAT_BITMAP = -1;
    public static final int IMAGE_FORMAT_NV21 = 17;
    public static final int IMAGE_FORMAT_YUV_420_888 = 35;
    public static final int IMAGE_FORMAT_YV12 = 842094169;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public volatile Bitmap f49573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public volatile ByteBuffer f49574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public volatile b f49575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f49576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f49577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f49578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @ImageFormat
    public final int f49579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Matrix f49580h;

    /* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
    @Retention(RetentionPolicy.CLASS)
    public @interface ImageFormat {
    }

    public InputImage(@NonNull Bitmap bitmap, int i10) {
        this.f49573a = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.f49576d = bitmap.getWidth();
        this.f49577e = bitmap.getHeight();
        this.f49578f = i10;
        this.f49579g = -1;
        this.f49580h = null;
    }

    public static InputImage a(@NonNull Image image, int i10, @Nullable Matrix matrix) {
        boolean z10;
        InputImage inputImage;
        int iLimit;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Preconditions.checkNotNull(image, "Please provide a valid image");
        boolean z11 = true;
        if (i10 == 0 || i10 == 90 || i10 == 180) {
            z10 = true;
        } else if (i10 == 270) {
            i10 = 270;
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            iLimit = image.getPlanes()[0].getBuffer().limit();
            inputImage = new InputImage(ImageConvertUtils.getInstance().convertJpegToUpRightBitmap(image, i10), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            inputImage = new InputImage(image, image.getWidth(), image.getHeight(), i10, matrix);
            iLimit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        int i11 = iLimit;
        InputImage inputImage2 = inputImage;
        zzli.zza(zzlg.zzb("vision-common"), image.getFormat(), 5, jElapsedRealtime, image.getHeight(), image.getWidth(), i11, i10);
        return inputImage2;
    }

    @NonNull
    public static InputImage fromBitmap(@NonNull Bitmap bitmap, int i10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(bitmap, i10);
        zzli.zza(zzlg.zzb("vision-common"), -1, 1, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i10);
        return inputImage;
    }

    @NonNull
    public static InputImage fromByteArray(@NonNull byte[] bArr, int i10, int i11, int i12, @ImageFormat int i13) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(ByteBuffer.wrap((byte[]) Preconditions.checkNotNull(bArr)), i10, i11, i12, i13);
        zzli.zza(zzlg.zzb("vision-common"), i13, 2, jElapsedRealtime, i11, i10, bArr.length, i12);
        return inputImage;
    }

    @NonNull
    public static InputImage fromByteBuffer(@NonNull ByteBuffer byteBuffer, int i10, int i11, int i12, @ImageFormat int i13) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(byteBuffer, i10, i11, i12, i13);
        zzli.zza(zzlg.zzb("vision-common"), i13, 3, jElapsedRealtime, i11, i10, byteBuffer.limit(), i12);
        return inputImage;
    }

    @NonNull
    public static InputImage fromFilePath(@NonNull Context context, @NonNull Uri uri) throws IOException {
        Preconditions.checkNotNull(context, "Please provide a valid Context");
        Preconditions.checkNotNull(uri, "Please provide a valid imageUri");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmapZza = ImageUtils.getInstance().zza(context.getContentResolver(), uri);
        InputImage inputImage = new InputImage(bitmapZza, 0);
        zzli.zza(zzlg.zzb("vision-common"), -1, 4, jElapsedRealtime, bitmapZza.getHeight(), bitmapZza.getWidth(), bitmapZza.getAllocationByteCount(), 0);
        return inputImage;
    }

    @NonNull
    public static InputImage fromMediaImage(@NonNull Image image, int i10) {
        return a(image, i10, null);
    }

    @Nullable
    @KeepForSdk
    public Bitmap getBitmapInternal() {
        return this.f49573a;
    }

    @Nullable
    @KeepForSdk
    public ByteBuffer getByteBuffer() {
        return this.f49574b;
    }

    @Nullable
    @KeepForSdk
    public Matrix getCoordinatesMatrix() {
        return this.f49580h;
    }

    @KeepForSdk
    @ImageFormat
    public int getFormat() {
        return this.f49579g;
    }

    @KeepForSdk
    public int getHeight() {
        return this.f49577e;
    }

    @Nullable
    @KeepForSdk
    public Image getMediaImage() {
        if (this.f49575c == null) {
            return null;
        }
        return this.f49575c.f93599a;
    }

    @Nullable
    @KeepForSdk
    public Image.Plane[] getPlanes() {
        if (this.f49575c == null) {
            return null;
        }
        return this.f49575c.f93599a.getPlanes();
    }

    @KeepForSdk
    public int getRotationDegrees() {
        return this.f49578f;
    }

    @KeepForSdk
    public int getWidth() {
        return this.f49576d;
    }

    @NonNull
    @KeepForSdk
    public static InputImage fromMediaImage(@NonNull Image image, int i10, @NonNull Matrix matrix) {
        Preconditions.checkArgument(image.getFormat() == 35, "Only YUV_420_888 is supported now");
        return a(image, i10, matrix);
    }

    public InputImage(@NonNull Image image, int i10, int i11, int i12, @Nullable Matrix matrix) {
        Preconditions.checkNotNull(image);
        this.f49575c = new b(image);
        this.f49576d = i10;
        this.f49577e = i11;
        this.f49578f = i12;
        this.f49579g = 35;
        this.f49580h = matrix;
    }

    public InputImage(@NonNull ByteBuffer byteBuffer, int i10, int i11, int i12, @ImageFormat int i13) {
        boolean z10;
        if (i13 == 842094169) {
            z10 = true;
        } else if (i13 == 17) {
            i13 = 17;
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10);
        this.f49574b = (ByteBuffer) Preconditions.checkNotNull(byteBuffer);
        Preconditions.checkArgument(byteBuffer.limit() > i10 * i11, "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.");
        byteBuffer.rewind();
        this.f49576d = i10;
        this.f49577e = i11;
        this.f49578f = i12;
        this.f49579g = i13;
        this.f49580h = null;
    }
}
