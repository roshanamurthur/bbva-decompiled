package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.u;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class ImageConvertUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ImageConvertUtils f49585a = new ImageConvertUtils();

    public static Bitmap a(Bitmap bitmap, int i10, int i11, int i12) {
        if (i10 == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i11, i12);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        return Bitmap.createBitmap(bitmap, 0, 0, i11, i12, matrix, true);
    }

    public static byte[] b(int i10, int i11, @NonNull byte[] bArr) throws MlKitException {
        YuvImage yuvImage = new YuvImage(bArr, 17, i10, i11, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, i10, i11), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    } catch (Exception unused) {
                    }
                }
                throw th2;
            }
        } catch (IOException unused2) {
            Log.w("ImageConvertUtils", "Error closing ByteArrayOutputStream");
            throw new MlKitException("Image conversion error from NV21 format", 13);
        }
    }

    @NonNull
    @KeepForSdk
    public static ByteBuffer bufferWithBackingArray(@NonNull ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    public static final void c(Image.Plane plane, int i10, int i11, byte[] bArr, int i12, int i13) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i14 = i10 / (i11 / rowStride);
        int rowStride2 = 0;
        for (int i15 = 0; i15 < rowStride; i15++) {
            int pixelStride = rowStride2;
            for (int i16 = 0; i16 < i14; i16++) {
                bArr[i12] = buffer.get(pixelStride);
                i12 += i13;
                pixelStride += plane.getPixelStride();
            }
            rowStride2 += plane.getRowStride();
        }
    }

    @NonNull
    @KeepForSdk
    public static ImageConvertUtils getInstance() {
        return f49585a;
    }

    @NonNull
    @KeepForSdk
    public static Bitmap yv12ToBitmap(@NonNull ByteBuffer byteBuffer, int i10, int i11, int i12) throws MlKitException {
        byte[] bArrB = b(i10, i11, yv12ToNv21Buffer(byteBuffer, true).array());
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrB, 0, bArrB.length);
        return a(bitmapDecodeByteArray, i12, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    @NonNull
    @VisibleForTesting
    @KeepForSdk
    public static ByteBuffer yv12ToNv21Buffer(@NonNull ByteBuffer byteBuffer, boolean z10) {
        int i10;
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit / 6;
        ByteBuffer byteBufferAllocate = z10 ? ByteBuffer.allocate(iLimit) : ByteBuffer.allocateDirect(iLimit);
        int i12 = 0;
        while (true) {
            i10 = i11 * 4;
            if (i12 >= i10) {
                break;
            }
            byteBufferAllocate.put(i12, byteBuffer.get(i12));
            i12++;
        }
        for (int i13 = 0; i13 < i11 + i11; i13++) {
            byteBufferAllocate.put(i10 + i13, byteBuffer.get((i13 / 2) + ((i13 % 2) * i11) + i10));
        }
        return byteBufferAllocate;
    }

    @NonNull
    @KeepForSdk
    public byte[] byteBufferToByteArray(@NonNull ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return byteBuffer.array();
        }
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        byte[] bArr = new byte[iLimit];
        byteBuffer.get(bArr, 0, iLimit);
        return bArr;
    }

    @NonNull
    @KeepForSdk
    public ByteBuffer cloneByteBuffer(@NonNull ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer);
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        ByteBuffer byteBufferAllocateDirect = byteBuffer.isDirect() ? ByteBuffer.allocateDirect(iCapacity) : ByteBuffer.allocate(iCapacity);
        byteBufferAllocateDirect.limit(byteBuffer.limit());
        byteBufferAllocateDirect.put((ByteBuffer) byteBuffer.rewind());
        byteBufferAllocateDirect.position(iPosition);
        byteBuffer.position(iPosition);
        return byteBufferAllocateDirect;
    }

    @NonNull
    @KeepForSdk
    public Bitmap convertJpegToUpRightBitmap(@NonNull Image image, int i10) {
        Preconditions.checkArgument(image.getFormat() == 256, "Only JPEG is supported now");
        Image.Plane[] planes = image.getPlanes();
        if (planes == null || planes.length != 1) {
            throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
        }
        ByteBuffer buffer = planes[0].getBuffer();
        buffer.rewind();
        int iRemaining = buffer.remaining();
        byte[] bArr = new byte[iRemaining];
        buffer.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
        return a(bitmapDecodeByteArray, i10, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    @NonNull
    @KeepForSdk
    public ByteBuffer convertToNv21Buffer(@NonNull InputImage inputImage, boolean z10) throws MlKitException {
        int format = inputImage.getFormat();
        if (format != -1) {
            if (format == 17) {
                return z10 ? bufferWithBackingArray((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer())) : (ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer());
            }
            if (format == 35) {
                return yuv420ThreePlanesToNV21((Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes()), inputImage.getWidth(), inputImage.getHeight());
            }
            if (format == 842094169) {
                return yv12ToNv21Buffer((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()), z10);
            }
            throw new MlKitException("Unsupported image format", 13);
        }
        Bitmap bitmapCopy = (Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal());
        if (Build.VERSION.SDK_INT >= 26 && bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
        }
        Bitmap bitmap = bitmapCopy;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = width * height;
        int[] iArr = new int[i10];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(((double) height) / 2.0d);
        int iCeil2 = ((iCeil + iCeil) * ((int) Math.ceil(((double) width) / 2.0d))) + i10;
        ByteBuffer byteBufferAllocate = z10 ? ByteBuffer.allocate(iCeil2) : ByteBuffer.allocateDirect(iCeil2);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < height; i13++) {
            int i14 = 0;
            while (i14 < width) {
                int i15 = iArr[i11];
                int i16 = (i15 >> 16) & 255;
                int i17 = (i15 >> 8) & 255;
                int i18 = i15 & 255;
                int iB = (u.b(i18, 112, (i16 * (-38)) - (i17 * 74), 128) >> 8) + 128;
                int i19 = (((((i16 * 112) - (i17 * 94)) - (i18 * 18)) + 128) >> 8) + 128;
                int i20 = i12 + 1;
                byteBufferAllocate.put(i12, (byte) Math.min(255, (u.b(i18, 25, (i17 * 129) + (i16 * 66), 128) >> 8) + 16));
                if (i13 % 2 == 0 && i11 % 2 == 0) {
                    int i21 = i10 + 1;
                    byteBufferAllocate.put(i10, (byte) Math.min(255, i19));
                    i10 += 2;
                    byteBufferAllocate.put(i21, (byte) Math.min(255, iB));
                }
                i11++;
                i14++;
                i12 = i20;
            }
        }
        return byteBufferAllocate;
    }

    @NonNull
    @KeepForSdk
    public Bitmap convertToUpRightBitmap(@NonNull InputImage inputImage) throws MlKitException {
        int format = inputImage.getFormat();
        if (format == -1) {
            return a((Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal()), inputImage.getRotationDegrees(), inputImage.getWidth(), inputImage.getHeight());
        }
        if (format == 17) {
            return nv21ToBitmap((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees());
        }
        if (format == 35) {
            return nv21ToBitmap(yuv420ThreePlanesToNV21((Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes()), inputImage.getWidth(), inputImage.getHeight()), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees());
        }
        if (format == 842094169) {
            return yv12ToBitmap((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees());
        }
        throw new MlKitException("Unsupported image format", 13);
    }

    @NonNull
    @KeepForSdk
    public Bitmap getUpRightBitmap(@NonNull InputImage inputImage) throws MlKitException {
        Bitmap bitmapInternal = inputImage.getBitmapInternal();
        return bitmapInternal != null ? a(bitmapInternal, inputImage.getRotationDegrees(), inputImage.getWidth(), inputImage.getHeight()) : convertToUpRightBitmap(inputImage);
    }

    @NonNull
    @KeepForSdk
    public Bitmap nv21ToBitmap(@NonNull ByteBuffer byteBuffer, int i10, int i11, int i12) throws MlKitException {
        byte[] bArrB = b(i10, i11, byteBufferToByteArray(byteBuffer));
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrB, 0, bArrB.length);
        return a(bitmapDecodeByteArray, i12, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    @NonNull
    @KeepForSdk
    public ByteBuffer yuv420ThreePlanesToNV21(@NonNull Image.Plane[] planeArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = i12 / 4;
        byte[] bArr = new byte[i13 + i13 + i12];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        int i14 = (i12 + i12) / 4;
        boolean z10 = buffer2.remaining() == i14 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        if (z10) {
            planeArr[0].getBuffer().get(bArr, 0, i12);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i12, 1);
            buffer3.get(bArr, i12 + 1, i14 - 1);
        } else {
            c(planeArr[0], i10, i11, bArr, 0, 1);
            c(planeArr[1], i10, i11, bArr, i12 + 1, 2);
            c(planeArr[2], i10, i11, bArr, i12, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
