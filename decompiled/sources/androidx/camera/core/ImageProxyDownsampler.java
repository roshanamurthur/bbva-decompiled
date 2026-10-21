package androidx.camera.core;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
final class ImageProxyDownsampler {

    /* JADX INFO: renamed from: androidx.camera.core.ImageProxyDownsampler$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$ImageProxyDownsampler$DownsamplingMethod;

        static {
            int[] iArr = new int[DownsamplingMethod.values().length];
            $SwitchMap$androidx$camera$core$ImageProxyDownsampler$DownsamplingMethod = iArr;
            try {
                iArr[DownsamplingMethod.NEAREST_NEIGHBOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$ImageProxyDownsampler$DownsamplingMethod[DownsamplingMethod.AVERAGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum DownsamplingMethod {
        NEAREST_NEIGHBOR,
        AVERAGING
    }

    public static final class ForwardingImageProxyImpl extends ForwardingImageProxy {
        private final int mDownsampledHeight;
        private final ImageProxy.PlaneProxy[] mDownsampledPlanes;
        private final int mDownsampledWidth;

        public ForwardingImageProxyImpl(ImageProxy imageProxy, ImageProxy.PlaneProxy[] planeProxyArr, int i10, int i11) {
            super(imageProxy);
            this.mDownsampledPlanes = planeProxyArr;
            this.mDownsampledWidth = i10;
            this.mDownsampledHeight = i11;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public int getHeight() {
            return this.mDownsampledHeight;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        @NonNull
        public ImageProxy.PlaneProxy[] getPlanes() {
            return this.mDownsampledPlanes;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public int getWidth() {
            return this.mDownsampledWidth;
        }
    }

    private ImageProxyDownsampler() {
    }

    private static ImageProxy.PlaneProxy createPlaneProxy(int i10, int i11, byte[] bArr) {
        return new ImageProxy.PlaneProxy(bArr, i10, i11) { // from class: androidx.camera.core.ImageProxyDownsampler.1
            final ByteBuffer mBuffer;
            final /* synthetic */ byte[] val$data;
            final /* synthetic */ int val$pixelStride;
            final /* synthetic */ int val$rowStride;

            {
                this.val$data = bArr;
                this.val$rowStride = i10;
                this.val$pixelStride = i11;
                this.mBuffer = ByteBuffer.wrap(bArr);
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            @NonNull
            public ByteBuffer getBuffer() {
                return this.mBuffer;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getPixelStride() {
                return this.val$pixelStride;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getRowStride() {
                return this.val$rowStride;
            }
        };
    }

    public static ForwardingImageProxy downsample(ImageProxy imageProxy, int i10, int i11, DownsamplingMethod downsamplingMethod) {
        byte[] bArr;
        if (imageProxy.getFormat() != 35) {
            throw new UnsupportedOperationException("Only YUV_420_888 format is currently supported.");
        }
        if (imageProxy.getWidth() < i10 || imageProxy.getHeight() < i11) {
            throw new IllegalArgumentException("Downsampled dimension " + new Size(i10, i11) + " is not <= original dimension " + new Size(imageProxy.getWidth(), imageProxy.getHeight()) + Constant.DOT_STRING);
        }
        if (imageProxy.getWidth() == i10 && imageProxy.getHeight() == i11) {
            return new ForwardingImageProxyImpl(imageProxy, imageProxy.getPlanes(), i10, i11);
        }
        int i12 = 2;
        int[] iArr = {imageProxy.getWidth(), imageProxy.getWidth() / 2, imageProxy.getWidth() / 2};
        int[] iArr2 = {imageProxy.getHeight(), imageProxy.getHeight() / 2, imageProxy.getHeight() / 2};
        int i13 = i10 / 2;
        int[] iArr3 = {i10, i13, i13};
        int i14 = i11 / 2;
        int[] iArr4 = {i11, i14, i14};
        ImageProxy.PlaneProxy[] planeProxyArr = new ImageProxy.PlaneProxy[3];
        int i15 = 0;
        while (i15 < 3) {
            ImageProxy.PlaneProxy planeProxy = imageProxy.getPlanes()[i15];
            ByteBuffer buffer = planeProxy.getBuffer();
            byte[] bArr2 = new byte[iArr3[i15] * iArr4[i15]];
            int i16 = AnonymousClass2.$SwitchMap$androidx$camera$core$ImageProxyDownsampler$DownsamplingMethod[downsamplingMethod.ordinal()];
            if (i16 == 1) {
                bArr = bArr2;
                resizeNearestNeighbor(buffer, iArr[i15], planeProxy.getPixelStride(), planeProxy.getRowStride(), iArr2[i15], bArr, iArr3[i15], iArr4[i15]);
            } else if (i16 != i12) {
                bArr = bArr2;
            } else {
                bArr = bArr2;
                resizeAveraging(buffer, iArr[i15], planeProxy.getPixelStride(), planeProxy.getRowStride(), iArr2[i15], bArr, iArr3[i15], iArr4[i15]);
            }
            planeProxyArr[i15] = createPlaneProxy(iArr3[i15], 1, bArr);
            i15++;
            i12 = 2;
        }
        return new ForwardingImageProxyImpl(imageProxy, planeProxyArr, i10, i11);
    }

    private static void resizeAveraging(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, byte[] bArr, int i14, int i15) {
        float f6 = i10 / i14;
        float f10 = i13 / i15;
        byte[] bArr2 = new byte[i12];
        byte[] bArr3 = new byte[i12];
        int[] iArr = new int[i14];
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            iArr[i17] = ((int) (i17 * f6)) * i11;
        }
        synchronized (byteBuffer) {
            try {
                byteBuffer.rewind();
                int i18 = 0;
                while (i18 < i15) {
                    int i19 = (int) (i18 * f10);
                    int i20 = i13 - 1;
                    int iMin = Math.min(i19, i20) * i12;
                    int iMin2 = Math.min(i19 + 1, i20) * i12;
                    int i21 = i18 * i14;
                    byteBuffer.position(iMin);
                    byteBuffer.get(bArr2, i16, Math.min(i12, byteBuffer.remaining()));
                    byteBuffer.position(iMin2);
                    byteBuffer.get(bArr3, i16, Math.min(i12, byteBuffer.remaining()));
                    for (int i22 = i16; i22 < i14; i22++) {
                        int i23 = iArr[i22];
                        bArr[i21 + i22] = (byte) ((((((bArr2[i23] & 255) + (bArr2[i23 + i11] & 255)) + (bArr3[i23] & 255)) + (bArr3[i23 + i11] & 255)) / 4) & 255);
                    }
                    i18++;
                    i16 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void resizeNearestNeighbor(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, byte[] bArr, int i14, int i15) {
        float f6 = i10 / i14;
        float f10 = i13 / i15;
        byte[] bArr2 = new byte[i12];
        int[] iArr = new int[i14];
        for (int i16 = 0; i16 < i14; i16++) {
            iArr[i16] = ((int) (i16 * f6)) * i11;
        }
        synchronized (byteBuffer) {
            try {
                byteBuffer.rewind();
                for (int i17 = 0; i17 < i15; i17++) {
                    int i18 = i17 * i14;
                    byteBuffer.position(Math.min((int) (i17 * f10), i13 - 1) * i12);
                    byteBuffer.get(bArr2, 0, Math.min(i12, byteBuffer.remaining()));
                    for (int i19 = 0; i19 < i14; i19++) {
                        bArr[i18 + i19] = bArr2[iArr[i19]];
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
