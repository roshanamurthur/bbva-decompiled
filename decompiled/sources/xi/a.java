package xi;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.veridas.camera.picture.Picture;
import com.veridas.camera.resolution.Resolution;
import com.veridas.graphics.Dimension;
import com.veridas.graphics.Frame;
import com.veridas.graphics.ImageEncoding;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* JADX INFO: compiled from: SimplePicture.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements Picture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f94667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f94668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f94669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ByteBuffer f94670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resolution f94671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Bitmap f94672f;

    public a(ByteBuffer byteBuffer, Resolution resolution, int i10, boolean z10, boolean z11) {
        this.f94670d = byteBuffer;
        this.f94667a = z11;
        this.f94671e = resolution;
        this.f94669c = i10;
        this.f94668b = z10;
    }

    @Override // com.veridas.camera.picture.Picture
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized Bitmap getBitmap() {
        try {
            if (this.f94672f == null) {
                byte[] rawDataAsBytes = getRawDataAsBytes();
                this.f94672f = BitmapFactory.decodeByteArray(rawDataAsBytes, 0, rawDataAsBytes.length);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f94672f;
    }

    @Override // com.veridas.camera.picture.Picture
    public final ByteBuffer getBuffer() {
        return this.f94670d;
    }

    @Override // com.veridas.camera.picture.Picture
    public final Object getRawData() {
        ByteBuffer byteBuffer = this.f94670d;
        byte[] bArr = new byte[byteBuffer.capacity()];
        byteBuffer.get(bArr);
        return bArr;
    }

    @Override // com.veridas.camera.picture.Picture
    public final byte[] getRawDataAsBytes() {
        ByteBuffer byteBuffer = this.f94670d;
        if (byteBuffer == null) {
            return null;
        }
        int iCapacity = byteBuffer.capacity();
        byteBuffer.rewind();
        byte[] bArr = new byte[iCapacity];
        byteBuffer.get(bArr);
        return bArr;
    }

    @Override // com.veridas.camera.picture.Picture
    public final int[] getRawDataAsIntArray() {
        ByteBuffer byteBuffer = this.f94670d;
        if (byteBuffer == null) {
            return null;
        }
        IntBuffer intBufferAsIntBuffer = byteBuffer.asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.capacity()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    @Override // com.veridas.camera.picture.Picture
    public final Resolution getResolution() {
        return this.f94671e;
    }

    @Override // com.veridas.camera.picture.Picture
    public final int getRotation() {
        return this.f94669c;
    }

    @Override // com.veridas.camera.picture.Picture
    public final boolean isEmpty() {
        ByteBuffer byteBuffer = this.f94670d;
        return byteBuffer == null || byteBuffer.capacity() == 0;
    }

    @Override // com.veridas.camera.picture.Picture
    public final boolean isMirrored() {
        return this.f94667a;
    }

    @Override // com.veridas.camera.picture.Picture
    public final Frame toFrame() {
        boolean z10 = this.f94668b;
        int i10 = this.f94669c;
        Resolution resolution = this.f94671e;
        ByteBuffer byteBuffer = this.f94670d;
        return z10 ? new Frame(byteBuffer, new Dimension(resolution.width, resolution.height), ImageEncoding.YUV, i10) : new Frame(byteBuffer, new Dimension(resolution.width, resolution.height), ImageEncoding.RGB, i10);
    }
}
