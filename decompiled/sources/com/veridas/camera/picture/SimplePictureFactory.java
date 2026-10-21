package com.veridas.camera.picture;

import android.graphics.Bitmap;
import com.veridas.camera.resolution.Resolution;
import java.nio.ByteBuffer;
import xi.a;

/* JADX INFO: loaded from: classes9.dex */
public class SimplePictureFactory implements PictureFactory {
    @Override // com.veridas.camera.picture.PictureFactory
    public synchronized Picture create(byte[] bArr, Resolution resolution, int i10, boolean z10) {
        ByteBuffer byteBufferAllocateDirect;
        byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.put(bArr);
        return create(byteBufferAllocateDirect, resolution, i10, z10, false);
    }

    @Override // com.veridas.camera.picture.PictureFactory
    public synchronized Picture create(byte[] bArr, Resolution resolution, int i10, boolean z10, boolean z11) {
        ByteBuffer byteBufferAllocateDirect;
        byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.put(bArr);
        byteBufferAllocateDirect.flip();
        return create(byteBufferAllocateDirect, resolution, i10, z10, z11);
    }

    @Override // com.veridas.camera.picture.PictureFactory
    public synchronized Picture create(int[] iArr, Resolution resolution, int i10, boolean z10, boolean z11) {
        ByteBuffer byteBufferAllocateDirect;
        byteBufferAllocateDirect = ByteBuffer.allocateDirect(iArr.length * 4);
        byteBufferAllocateDirect.asIntBuffer().put(iArr);
        byteBufferAllocateDirect.flip();
        return create(byteBufferAllocateDirect, resolution, i10, z10, z11);
    }

    @Override // com.veridas.camera.picture.PictureFactory
    public synchronized Picture create(Bitmap bitmap, Resolution resolution, int i10, boolean z10, boolean z11) {
        ByteBuffer byteBufferAllocateDirect;
        byteBufferAllocateDirect = ByteBuffer.allocateDirect(resolution.width * resolution.height * 4);
        bitmap.copyPixelsToBuffer(byteBufferAllocateDirect);
        byteBufferAllocateDirect.flip();
        return create(byteBufferAllocateDirect, resolution, i10, z10, z11);
    }

    @Override // com.veridas.camera.picture.PictureFactory
    public synchronized Picture create(ByteBuffer byteBuffer, Resolution resolution, int i10, boolean z10, boolean z11) {
        return new a(byteBuffer, resolution, i10, z10, z11);
    }
}
