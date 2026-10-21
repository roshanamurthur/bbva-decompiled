package com.veridas.bidicode.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BidiCodeUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nJ\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004¨\u0006\u0015"}, d2 = {"Lcom/veridas/bidicode/utils/BidiCodeUtils;", "", "()V", "calculateInSampleSize", "", "options", "Landroid/graphics/BitmapFactory$Options;", "reqWidth", "reqHeight", "decodeSampledBitmapFromResource", "Landroid/graphics/Bitmap;", "res", "Landroid/content/res/Resources;", "resId", "rotateBitmapDegree90", "bitmap", "rotateYUV420Degree90", "", "data", "imageWidth", "imageHeight", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBidiCodeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BidiCodeUtils.kt\ncom/veridas/bidicode/utils/BidiCodeUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
public final class BidiCodeUtils {

    @NotNull
    public static final BidiCodeUtils INSTANCE = new BidiCodeUtils();

    public final int calculateInSampleSize(@NotNull BitmapFactory.Options options, int reqWidth, int reqHeight) {
        Intrinsics.checkNotNullParameter(options, "options");
        Pair pair = TuplesKt.to(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        int i10 = 1;
        if (iIntValue > reqHeight || iIntValue2 > reqWidth) {
            int i11 = iIntValue / 2;
            int i12 = iIntValue2 / 2;
            while (i11 / i10 >= reqHeight && i12 / i10 >= reqWidth) {
                i10 *= 2;
            }
        }
        return i10;
    }

    @NotNull
    public final Bitmap decodeSampledBitmapFromResource(@NotNull Resources res, int resId, int reqWidth, int reqHeight) {
        Intrinsics.checkNotNullParameter(res, "res");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);
        options.inSampleSize = INSTANCE.calculateInSampleSize(options, reqWidth, reqHeight);
        options.inJustDecodeBounds = false;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(res, resId, options);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "run(...)");
        return bitmapDecodeResource;
    }

    @NotNull
    public final Bitmap rotateBitmapDegree90(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Matrix matrix = new Matrix();
        matrix.postRotate(90.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    @NotNull
    public final byte[] rotateYUV420Degree90(@NotNull byte[] data, int imageWidth, int imageHeight) {
        Intrinsics.checkNotNullParameter(data, "data");
        int i10 = imageWidth * imageHeight;
        int i11 = (i10 * 3) / 2;
        byte[] bArr = new byte[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < imageWidth; i13++) {
            for (int i14 = imageHeight - 1; -1 < i14; i14--) {
                bArr[i12] = data[(i14 * imageWidth) + i13];
                i12++;
            }
        }
        int i15 = i11 - 1;
        for (int i16 = imageWidth - 1; i16 > 0; i16 -= 2) {
            int i17 = imageHeight / 2;
            for (int i18 = 0; i18 < i17; i18++) {
                int i19 = (i18 * imageWidth) + i10;
                bArr[i15] = data[i19 + i16];
                bArr[i15 - 1] = data[(i16 - 1) + i19];
                i15 -= 2;
            }
        }
        return bArr;
    }
}
