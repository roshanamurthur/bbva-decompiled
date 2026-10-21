package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.graphics.Bitmap;
import androidx.camera.camera2.internal.compat.u;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzd {
    public static ByteBuffer zza(Bitmap bitmap, boolean z10) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = width * height;
        int[] iArr = new int[i10];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(((double) height) / 2.0d);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((iCeil + iCeil) * ((int) Math.ceil(((double) width) / 2.0d))) + i10);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < height; i13++) {
            int i14 = 0;
            while (i14 < width) {
                int i15 = iArr[i12];
                int i16 = i15 >> 16;
                int i17 = i15 >> 8;
                int i18 = i15 & 255;
                int i19 = i11 + 1;
                int i20 = i16 & 255;
                int i21 = i17 & 255;
                byteBufferAllocateDirect.put(i11, (byte) Math.min(255, (u.b(i18, 25, (i21 * 129) + (i20 * 66), 128) >> 8) + 16));
                if (i13 % 2 == 0 && i12 % 2 == 0) {
                    int i22 = i20 * 112;
                    int i23 = (((i22 - (i21 * 94)) - (i18 * 18)) + 128) >> 8;
                    int i24 = (((((i20 * (-38)) - (i21 * 74)) + (i18 * 112)) + 128) >> 8) + 128;
                    int i25 = i10 + 1;
                    byteBufferAllocateDirect.put(i10, (byte) Math.min(255, i23 + 128));
                    i10 += 2;
                    byteBufferAllocateDirect.put(i25, (byte) Math.min(255, i24));
                }
                i12++;
                i14++;
                i11 = i19;
            }
        }
        return byteBufferAllocateDirect;
    }
}
