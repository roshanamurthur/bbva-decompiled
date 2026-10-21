package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.h;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public final class Downsampler {
    public static final Option<Boolean> ALLOW_HARDWARE_CONFIG;
    public static final Option<Boolean> FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set<String> f38552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f38553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set<ImageHeaderParser.ImageType> f38554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Queue<BitmapFactory.Options> f38555i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapPool f38556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f38557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayPool f38558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<ImageHeaderParser> f38559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HardwareConfigState f38560e = HardwareConfigState.getInstance();
    public static final Option<DecodeFormat> DECODE_FORMAT = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);
    public static final Option<PreferredColorSpace> PREFERRED_COLOR_SPACE = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    @Deprecated
    public static final Option<DownsampleStrategy> DOWNSAMPLE_STRATEGY = DownsampleStrategy.OPTION;

    public interface DecodeCallbacks {
        void onDecodeComplete(BitmapPool bitmapPool, Bitmap bitmap) throws IOException;

        void onObtainBounds();
    }

    static {
        Boolean bool = Boolean.FALSE;
        FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        ALLOW_HARDWARE_CONFIG = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f38552f = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f38553g = new a();
        f38554h = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f38555i = Util.createQueue(0);
    }

    public Downsampler(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, BitmapPool bitmapPool, ArrayPool arrayPool) {
        this.f38559d = list;
        this.f38557b = (DisplayMetrics) Preconditions.checkNotNull(displayMetrics);
        this.f38556a = (BitmapPool) Preconditions.checkNotNull(bitmapPool);
        this.f38558c = (ArrayPool) Preconditions.checkNotNull(arrayPool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(com.bumptech.glide.load.resource.bitmap.ImageReader r4, android.graphics.BitmapFactory.Options r5, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks r6, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r7) throws java.io.IOException {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto La
            r6.onObtainBounds()
            r4.stopGrowingBuffers()
        La:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getBitmapDrawableLock()
            r3.lock()
            android.graphics.Bitmap r4 = r4.decodeBitmap(r5)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalArgumentException -> L25
            java.util.concurrent.locks.Lock r5 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getBitmapDrawableLock()
            r5.unlock()
            return r4
        L23:
            r4 = move-exception
            goto L42
        L25:
            r3 = move-exception
            java.io.IOException r0 = e(r3, r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L23
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L41
            r7.put(r1)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L40
            r1 = 0
            r5.inBitmap = r1     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L40
            android.graphics.Bitmap r4 = c(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L40
            java.util.concurrent.locks.Lock r5 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getBitmapDrawableLock()
            r5.unlock()
            return r4
        L40:
            throw r0     // Catch: java.lang.Throwable -> L23
        L41:
            throw r0     // Catch: java.lang.Throwable -> L23
        L42:
            java.util.concurrent.locks.Lock r5 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getBitmapDrawableLock()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.Downsampler.c(com.bumptech.glide.load.resource.bitmap.ImageReader, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool):android.graphics.Bitmap");
    }

    @Nullable
    @TargetApi(19)
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return Constant.BRACKET_OPEN + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        StringBuilder sbE = h.e("Exception decoding bitmap, outWidth: ", i10, ", outHeight: ", i11, ", outMimeType: ");
        sbE.append(str);
        sbE.append(", inBitmap: ");
        sbE.append(d(options.inBitmap));
        return new IOException(sbE.toString(), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        g(options);
        Queue<BitmapFactory.Options> queue = f38555i;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    public static void g(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final BitmapResource a(ImageReader imageReader, int i10, int i11, Options options, DecodeCallbacks decodeCallbacks) throws IOException {
        BitmapFactory.Options optionsPoll;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f38558c.get(65536, byte[].class);
        synchronized (Downsampler.class) {
            Queue<BitmapFactory.Options> queue = f38555i;
            synchronized (queue) {
                optionsPoll = queue.poll();
            }
            if (optionsPoll == null) {
                optionsPoll = new BitmapFactory.Options();
                g(optionsPoll);
            }
            options2 = optionsPoll;
        }
        options2.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) options.get(DECODE_FORMAT);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) options.get(PREFERRED_COLOR_SPACE);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) options.get(DownsampleStrategy.OPTION);
        boolean zBooleanValue = ((Boolean) options.get(FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS)).booleanValue();
        Option<Boolean> option = ALLOW_HARDWARE_CONFIG;
        try {
            return BitmapResource.obtain(b(imageReader, options2, downsampleStrategy, decodeFormat, preferredColorSpace, options.get(option) != null && ((Boolean) options.get(option)).booleanValue(), i10, i11, zBooleanValue, decodeCallbacks), this.f38556a);
        } finally {
            f(options2);
            this.f38558c.put(bArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x018f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cd  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Bitmap b(ImageReader imageReader, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z10, int i10, int i11, boolean z11, DecodeCallbacks decodeCallbacks) throws IOException {
        int i12;
        Bitmap.Config config;
        Bitmap.Config config2;
        int i13;
        int i14;
        int iMax;
        int iFloor;
        double dFloor;
        int iRound;
        double scaleFactor;
        double d2;
        int i15;
        long logTime = LogTime.getLogTime();
        options.inJustDecodeBounds = true;
        BitmapPool bitmapPool = this.f38556a;
        c(imageReader, options, decodeCallbacks, bitmapPool);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i16 = iArr[0];
        int i17 = iArr[1];
        boolean z12 = (i16 == -1 || i17 == -1) ? false : z10;
        int imageOrientation = imageReader.getImageOrientation();
        int exifOrientationDegrees = TransformationUtils.getExifOrientationDegrees(imageOrientation);
        TransformationUtils.isExifOrientationRequired(imageOrientation);
        int i18 = i10;
        if (i18 == Integer.MIN_VALUE) {
            i18 = (exifOrientationDegrees == 90 || exifOrientationDegrees == 270) ? i17 : i16;
        }
        if (i11 == -2147483648) {
            i11 = (exifOrientationDegrees == 90 || exifOrientationDegrees == 270) ? i16 : i17;
        }
        ImageHeaderParser.ImageType imageType = imageReader.getImageType();
        float f6 = 1.0f;
        String str = "Downsampler";
        if (i16 <= 0 || i17 <= 0) {
            int i19 = 3;
            if (Log.isLoggable(str, i19)) {
                Objects.toString(imageType);
            }
        } else {
            if (exifOrientationDegrees == 90 || exifOrientationDegrees == 270) {
                i13 = i17;
                i14 = i16;
            } else {
                i14 = i17;
                i13 = i16;
            }
            float scaleFactor2 = downsampleStrategy.getScaleFactor(i13, i14, i18, i11);
            if (scaleFactor2 <= 0.0f) {
                throw new IllegalArgumentException("Cannot scale with factor: " + scaleFactor2 + " from: " + downsampleStrategy + ", source: [" + i16 + "x" + i17 + "], target: [" + i18 + "x" + i11 + Constant.BRACKET_CLOSE);
            }
            z12 = z12;
            DownsampleStrategy.SampleSizeRounding sampleSizeRounding = downsampleStrategy.getSampleSizeRounding(i13, i14, i18, i11);
            if (sampleSizeRounding == null) {
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            float f10 = i13;
            float f11 = i14;
            i18 = i18;
            i11 = i11;
            int i20 = i13 / ((int) (((double) (scaleFactor2 * f10)) + 0.5d));
            int i21 = i14 / ((int) (((double) (scaleFactor2 * f11)) + 0.5d));
            DownsampleStrategy.SampleSizeRounding sampleSizeRounding2 = DownsampleStrategy.SampleSizeRounding.MEMORY;
            int iMax2 = sampleSizeRounding == sampleSizeRounding2 ? Math.max(i20, i21) : Math.min(i20, i21);
            int i22 = Build.VERSION.SDK_INT;
            if (i22 > 23 || !f38552f.contains(options.outMimeType)) {
                iMax = Math.max(1, Integer.highestOneBit(iMax2));
                if (sampleSizeRounding == sampleSizeRounding2 && iMax < 1.0f / scaleFactor2) {
                    iMax <<= 1;
                }
            } else {
                iMax = 1;
            }
            options.inSampleSize = iMax;
            if (imageType == ImageHeaderParser.ImageType.JPEG) {
                float fMin = Math.min(iMax, 8);
                iFloor = (int) Math.ceil(f10 / fMin);
                iRound = (int) Math.ceil(f11 / fMin);
                int i23 = iMax / 8;
                if (i23 > 0) {
                    iFloor /= i23;
                    iRound /= i23;
                }
            } else {
                if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                    float f12 = iMax;
                    iFloor = (int) Math.floor(f10 / f12);
                    dFloor = Math.floor(f11 / f12);
                } else if (!imageType.isWebp()) {
                    if (i13 % iMax == 0 && i14 % iMax == 0) {
                        iFloor = i13 / iMax;
                        iRound = i14 / iMax;
                    } else {
                        options.inJustDecodeBounds = true;
                        c(imageReader, options, decodeCallbacks, bitmapPool);
                        options.inJustDecodeBounds = false;
                        int[] iArr2 = {options.outWidth, options.outHeight};
                        iFloor = iArr2[0];
                        iRound = iArr2[1];
                    }
                    scaleFactor = downsampleStrategy.getScaleFactor(iFloor, iRound, i18, i11);
                    if (scaleFactor <= 1.0d) {
                        d2 = scaleFactor;
                    } else {
                        d2 = 1.0d / scaleFactor;
                    }
                    int iRound2 = (int) Math.round(d2 * 2.147483647E9d);
                    int i24 = (int) ((((double) iRound2) * scaleFactor) + 0.5d);
                    options.inTargetDensity = (int) (((scaleFactor / ((double) (i24 / iRound2))) * ((double) i24)) + 0.5d);
                    if (scaleFactor > 1.0d) {
                        scaleFactor = 1.0d / scaleFactor;
                    }
                    int iRound3 = (int) Math.round(scaleFactor * 2.147483647E9d);
                    options.inDensity = iRound3;
                    i15 = options.inTargetDensity;
                    if (i15 > 0 || iRound3 <= 0 || i15 == iRound3) {
                        options.inTargetDensity = 0;
                        options.inDensity = 0;
                    } else {
                        options.inScaled = true;
                    }
                    str = "Downsampler";
                    i16 = i16;
                    i17 = i17;
                } else if (i22 >= 24) {
                    float f13 = iMax;
                    iFloor = Math.round(f10 / f13);
                    iRound = Math.round(f11 / f13);
                } else {
                    float f14 = iMax;
                    iFloor = (int) Math.floor(f10 / f14);
                    dFloor = Math.floor(f11 / f14);
                }
                iRound = (int) dFloor;
            }
            scaleFactor = downsampleStrategy.getScaleFactor(iFloor, iRound, i18, i11);
            if (scaleFactor <= 1.0d) {
                d2 = scaleFactor;
            } else {
                d2 = 1.0d / scaleFactor;
            }
            int iRound4 = (int) Math.round(d2 * 2.147483647E9d);
            int i25 = (int) ((((double) iRound4) * scaleFactor) + 0.5d);
            options.inTargetDensity = (int) (((scaleFactor / ((double) (i25 / iRound4))) * ((double) i25)) + 0.5d);
            if (scaleFactor > 1.0d) {
                scaleFactor = 1.0d / scaleFactor;
            }
            int iRound5 = (int) Math.round(scaleFactor * 2.147483647E9d);
            options.inDensity = iRound5;
            i15 = options.inTargetDensity;
            if (i15 > 0) {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            } else {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            }
            str = "Downsampler";
            i16 = i16;
            i17 = i17;
        }
        boolean zIsHardwareConfigAllowed = this.f38560e.isHardwareConfigAllowed(i18, i11, z12, r10);
        if (zIsHardwareConfigAllowed) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        if (!zIsHardwareConfigAllowed) {
            if (decodeFormat != DecodeFormat.PREFER_ARGB_8888) {
                try {
                    config2 = imageReader.getImageType().hasAlpha() ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                } catch (IOException unused) {
                    if (Log.isLoggable(str, 3)) {
                        Objects.toString(decodeFormat);
                    }
                }
                options.inPreferredConfig = config2;
                if (config2 == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                }
            } else {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
        }
        int i26 = Build.VERSION.SDK_INT;
        if (i16 < 0 || i17 < 0 || !z11) {
            int i27 = options.inTargetDensity;
            if (i27 > 0 && (i12 = options.inDensity) > 0 && i27 != i12) {
                f6 = i27 / i12;
            }
            float f15 = options.inSampleSize;
            int iCeil = (int) Math.ceil(i16 / f15);
            int iCeil2 = (int) Math.ceil(i17 / f15);
            int iRound6 = Math.round(iCeil * f6);
            i11 = Math.round(iCeil2 * f6);
            i18 = iRound6;
        }
        Bitmap bitmapRotateImageExif = null;
        if (i18 > 0 && i11 > 0) {
            if (i26 < 26) {
                config = null;
            } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
                config = options.outConfig;
            }
            if (config == null) {
                config = options.inPreferredConfig;
            }
            options.inBitmap = bitmapPool.getDirty(i18, i11, config);
        }
        if (preferredColorSpace != null) {
            if (i26 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i26 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapC = c(imageReader, options, decodeCallbacks, bitmapPool);
        decodeCallbacks.onDecodeComplete(bitmapPool, bitmapC);
        if (Log.isLoggable(str, 2)) {
            d(bitmapC);
            d(options.inBitmap);
            Thread.currentThread().getName();
            LogTime.getElapsedMillis(logTime);
        }
        if (bitmapC != null) {
            bitmapC.setDensity(this.f38557b.densityDpi);
            bitmapRotateImageExif = TransformationUtils.rotateImageExif(bitmapPool, bitmapC, imageOrientation);
            if (!bitmapC.equals(bitmapRotateImageExif)) {
                bitmapPool.put(bitmapC);
            }
        }
        return bitmapRotateImageExif;
    }

    public Resource<Bitmap> decode(InputStream inputStream, int i10, int i11, Options options) throws IOException {
        return decode(inputStream, i10, i11, options, f38553g);
    }

    public boolean handles(InputStream inputStream) {
        return true;
    }

    public Resource<Bitmap> decode(ByteBuffer byteBuffer, int i10, int i11, Options options) throws IOException {
        return a(new ImageReader.ByteBufferReader(this.f38559d, byteBuffer, this.f38558c), i10, i11, options, f38553g);
    }

    public boolean handles(ByteBuffer byteBuffer) {
        return true;
    }

    public Resource<Bitmap> decode(InputStream inputStream, int i10, int i11, Options options, DecodeCallbacks decodeCallbacks) throws IOException {
        return a(new ImageReader.InputStreamImageReader(this.f38559d, inputStream, this.f38558c), i10, i11, options, decodeCallbacks);
    }

    public boolean handles(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.isSupported();
    }

    @RequiresApi(21)
    public Resource<Bitmap> decode(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, Options options) throws IOException {
        return a(new ImageReader.ParcelFileDescriptorImageReader(parcelFileDescriptor, this.f38559d, this.f38558c), i10, i11, options, f38553g);
    }

    public class a implements DecodeCallbacks {
        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        public final void onObtainBounds() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        public final void onDecodeComplete(BitmapPool bitmapPool, Bitmap bitmap) {
        }
    }
}
