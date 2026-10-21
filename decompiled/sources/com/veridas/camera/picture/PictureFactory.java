package com.veridas.camera.picture;

import android.graphics.Bitmap;
import com.veridas.camera.resolution.Resolution;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public interface PictureFactory {
    Picture create(Bitmap bitmap, Resolution resolution, int i10, boolean z10, boolean z11);

    Picture create(ByteBuffer byteBuffer, Resolution resolution, int i10, boolean z10, boolean z11);

    Picture create(byte[] bArr, Resolution resolution, int i10, boolean z10);

    Picture create(byte[] bArr, Resolution resolution, int i10, boolean z10, boolean z11);

    Picture create(int[] iArr, Resolution resolution, int i10, boolean z10, boolean z11);
}
