package com.google.mlkit.vision.common.internal;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.g0;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class ImageUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GmsLogger f49586a = new GmsLogger("MLKitImageUtils", "");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ImageUtils f49587b = new ImageUtils();

    @NonNull
    @KeepForSdk
    public static ImageUtils getInstance() {
        return f49587b;
    }

    @NonNull
    @KeepForSdk
    public IObjectWrapper getImageDataWrapper(@NonNull InputImage inputImage) throws MlKitException {
        int format = inputImage.getFormat();
        if (format == -1) {
            return ObjectWrapper.wrap((Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal()));
        }
        if (format != 17) {
            if (format == 35) {
                return ObjectWrapper.wrap(inputImage.getMediaImage());
            }
            if (format != 842094169) {
                throw new MlKitException(g0.c("Unsupported image format: ", inputImage.getFormat()), 3);
            }
        }
        return ObjectWrapper.wrap((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()));
    }

    @KeepForSdk
    public int getMobileVisionImageFormat(@NonNull InputImage inputImage) {
        return inputImage.getFormat();
    }

    @KeepForSdk
    public int getMobileVisionImageSize(@NonNull InputImage inputImage) {
        if (inputImage.getFormat() == -1) {
            return ((Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal())).getAllocationByteCount();
        }
        if (inputImage.getFormat() == 17 || inputImage.getFormat() == 842094169) {
            return ((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer())).limit();
        }
        if (inputImage.getFormat() != 35) {
            return 0;
        }
        return (((Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes()))[0].getBuffer().limit() * 3) / 2;
    }

    @Nullable
    @KeepForSdk
    public Matrix getUprightRotationMatrix(int i10, int i11, int i12) {
        if (i12 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i10) / 2.0f, (-i11) / 2.0f);
        matrix.postRotate(i12 * 90);
        int i13 = i12 % 2;
        int i14 = i13 != 0 ? i11 : i10;
        if (i13 == 0) {
            i10 = i11;
        }
        matrix.postTranslate(i14 / 2.0f, i10 / 2.0f);
        return matrix;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b A[Catch: FileNotFoundException -> 0x0027, TryCatch #4 {FileNotFoundException -> 0x0027, blocks: (B:3:0x0006, B:5:0x000c, B:7:0x001a, B:36:0x0071, B:37:0x0086, B:48:0x00b7, B:50:0x00c1, B:39:0x008b, B:40:0x008f, B:41:0x0096, B:42:0x009a, B:43:0x00a1, B:44:0x00a5, B:46:0x00ac, B:35:0x006b, B:32:0x005b, B:52:0x00c6, B:53:0x00cd), top: B:65:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b A[Catch: FileNotFoundException -> 0x0027, TryCatch #4 {FileNotFoundException -> 0x0027, blocks: (B:3:0x0006, B:5:0x000c, B:7:0x001a, B:36:0x0071, B:37:0x0086, B:48:0x00b7, B:50:0x00c1, B:39:0x008b, B:40:0x008f, B:41:0x0096, B:42:0x009a, B:43:0x00a1, B:44:0x00a5, B:46:0x00ac, B:35:0x006b, B:32:0x005b, B:52:0x00c6, B:53:0x00cd), top: B:65:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x008f A[Catch: FileNotFoundException -> 0x0027, TryCatch #4 {FileNotFoundException -> 0x0027, blocks: (B:3:0x0006, B:5:0x000c, B:7:0x001a, B:36:0x0071, B:37:0x0086, B:48:0x00b7, B:50:0x00c1, B:39:0x008b, B:40:0x008f, B:41:0x0096, B:42:0x009a, B:43:0x00a1, B:44:0x00a5, B:46:0x00ac, B:35:0x006b, B:32:0x005b, B:52:0x00c6, B:53:0x00cd), top: B:65:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0096 A[Catch: FileNotFoundException -> 0x0027, TryCatch #4 {FileNotFoundException -> 0x0027, blocks: (B:3:0x0006, B:5:0x000c, B:7:0x001a, B:36:0x0071, B:37:0x0086, B:48:0x00b7, B:50:0x00c1, B:39:0x008b, B:40:0x008f, B:41:0x0096, B:42:0x009a, B:43:0x00a1, B:44:0x00a5, B:46:0x00ac, B:35:0x006b, B:32:0x005b, B:52:0x00c6, B:53:0x00cd), top: B:65:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009a A[Catch: FileNotFoundException -> 0x0027, TryCatch #4 {FileNotFoundException -> 0x0027, blocks: (B:3:0x0006, B:5:0x000c, B:7:0x001a, B:36:0x0071, B:37:0x0086, B:48:0x00b7, B:50:0x00c1, B:39:0x008b, B:40:0x008f, B:41:0x0096, B:42:0x009a, B:43:0x00a1, B:44:0x00a5, B:46:0x00ac, B:35:0x006b, B:32:0x005b, B:52:0x00c6, B:53:0x00cd), top: B:65:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a1 A[Catch: FileNotFoundException -> 0x0027, TryCatch #4 {FileNotFoundException -> 0x0027, blocks: (B:3:0x0006, B:5:0x000c, B:7:0x001a, B:36:0x0071, B:37:0x0086, B:48:0x00b7, B:50:0x00c1, B:39:0x008b, B:40:0x008f, B:41:0x0096, B:42:0x009a, B:43:0x00a1, B:44:0x00a5, B:46:0x00ac, B:35:0x006b, B:32:0x005b, B:52:0x00c6, B:53:0x00cd), top: B:65:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5 A[Catch: FileNotFoundException -> 0x0027, TryCatch #4 {FileNotFoundException -> 0x0027, blocks: (B:3:0x0006, B:5:0x000c, B:7:0x001a, B:36:0x0071, B:37:0x0086, B:48:0x00b7, B:50:0x00c1, B:39:0x008b, B:40:0x008f, B:41:0x0096, B:42:0x009a, B:43:0x00a1, B:44:0x00a5, B:46:0x00ac, B:35:0x006b, B:32:0x005b, B:52:0x00c6, B:53:0x00cd), top: B:65:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac A[Catch: FileNotFoundException -> 0x0027, TryCatch #4 {FileNotFoundException -> 0x0027, blocks: (B:3:0x0006, B:5:0x000c, B:7:0x001a, B:36:0x0071, B:37:0x0086, B:48:0x00b7, B:50:0x00c1, B:39:0x008b, B:40:0x008f, B:41:0x0096, B:42:0x009a, B:43:0x00a1, B:44:0x00a5, B:46:0x00ac, B:35:0x006b, B:32:0x005b, B:52:0x00c6, B:53:0x00cd), top: B:65:0x0006 }] */
    @NonNull
    public final Bitmap zza(@NonNull ContentResolver contentResolver, @NonNull Uri uri) throws IOException {
        ExifInterface exifInterface;
        Matrix matrix;
        Matrix matrix2;
        Bitmap bitmapCreateBitmap;
        GmsLogger gmsLogger = f49586a;
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri);
            if (bitmap == null) {
                throw new IOException("The image Uri could not be resolved.");
            }
            int attributeInt = 0;
            if ("content".equals(uri.getScheme()) || "file".equals(uri.getScheme())) {
                try {
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            exifInterface = new ExifInterface(inputStreamOpenInputStream);
                        } catch (Throwable th2) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (Throwable th3) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                } catch (Exception unused) {
                                }
                            }
                            throw th2;
                        }
                    } else {
                        exifInterface = null;
                    }
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException e5) {
                            e = e5;
                            gmsLogger.e("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(uri)), e);
                        }
                    }
                } catch (IOException e7) {
                    e = e7;
                    exifInterface = null;
                    gmsLogger.e("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(uri)), e);
                    if (exifInterface == null) {
                        attributeInt = exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
                    }
                    matrix = new Matrix();
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    switch (attributeInt) {
                        case 2:
                            matrix = new Matrix();
                            matrix.postScale(-1.0f, 1.0f);
                            matrix2 = matrix;
                            break;
                        case 3:
                            matrix.postRotate(180.0f);
                            matrix2 = matrix;
                            break;
                        case 4:
                            matrix.postScale(1.0f, -1.0f);
                            matrix2 = matrix;
                            break;
                        case 5:
                            matrix.postRotate(90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            matrix2 = matrix;
                            break;
                        case 6:
                            matrix.postRotate(90.0f);
                            matrix2 = matrix;
                            break;
                        case 7:
                            matrix.postRotate(-90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            matrix2 = matrix;
                            break;
                        case 8:
                            matrix.postRotate(-90.0f);
                            matrix2 = matrix;
                            break;
                        default:
                            matrix2 = null;
                            break;
                    }
                    return matrix2 == null ? bitmap : bitmap;
                }
                if (exifInterface == null) {
                    attributeInt = exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
                }
            }
            matrix = new Matrix();
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            switch (attributeInt) {
                case 2:
                    matrix = new Matrix();
                    matrix.postScale(-1.0f, 1.0f);
                    matrix2 = matrix;
                    break;
                case 3:
                    matrix.postRotate(180.0f);
                    matrix2 = matrix;
                    break;
                case 4:
                    matrix.postScale(1.0f, -1.0f);
                    matrix2 = matrix;
                    break;
                case 5:
                    matrix.postRotate(90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    matrix2 = matrix;
                    break;
                case 6:
                    matrix.postRotate(90.0f);
                    matrix2 = matrix;
                    break;
                case 7:
                    matrix.postRotate(-90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    matrix2 = matrix;
                    break;
                case 8:
                    matrix.postRotate(-90.0f);
                    matrix2 = matrix;
                    break;
                default:
                    matrix2 = null;
                    break;
            }
            if (matrix2 == null && bitmap != (bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width2, height2, matrix2, true))) {
                bitmap.recycle();
                return bitmapCreateBitmap;
            }
        } catch (FileNotFoundException e10) {
            gmsLogger.e("MLKitImageUtils", "Could not open file: ".concat(String.valueOf(uri)), e10);
            throw e10;
        }
    }
}
