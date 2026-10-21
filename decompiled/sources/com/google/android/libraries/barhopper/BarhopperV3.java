package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.collection.f;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen;
import com.google.barhopper.deeplearning.BarhopperV3Options;
import com.google.photos.vision.barhopper.BarhopperProto$BarhopperResponse;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public class BarhopperV3 implements Closeable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long f43898p0;

    public BarhopperV3() {
        System.loadLibrary("barhopper_v3");
    }

    public static BarhopperProto$BarhopperResponse c(byte[] bArr) {
        try {
            return BarhopperProto$BarhopperResponse.zzb(bArr, zzdn.zza());
        } catch (zzen e5) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}".concat(e5.toString()));
        }
    }

    private native void closeNative(long j10);

    private native long createNative();

    private native long createNativeWithClientOptions(byte[] bArr);

    private native byte[] recognizeBitmapNative(long j10, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j10, int i10, int i11, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j10, int i10, int i11, byte[] bArr, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedBufferNative(long j10, int i10, int i11, int i12, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedNative(long j10, int i10, int i11, int i12, byte[] bArr, RecognitionOptions recognitionOptions);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.f43898p0;
        if (j10 != 0) {
            closeNative(j10);
            this.f43898p0 = 0L;
        }
    }

    public void create() {
        if (this.f43898p0 != 0) {
            Log.w("BarhopperV3", "Native context already exists.");
            return;
        }
        long jCreateNative = createNative();
        this.f43898p0 = jCreateNative;
        if (jCreateNative == 0) {
            throw new IllegalStateException("Failed to create native context.");
        }
    }

    public void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @NonNull
    public BarhopperProto$BarhopperResponse recognize(int i10, int i11, int i12, @NonNull ByteBuffer byteBuffer, @NonNull RecognitionOptions recognitionOptions) {
        long j10 = this.f43898p0;
        if (j10 != 0) {
            return c(recognizeStridedBufferNative(j10, i10, i11, i12, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    public void create(@NonNull BarhopperV3Options barhopperV3Options) {
        if (this.f43898p0 == 0) {
            try {
                byte[] bArr = new byte[barhopperV3Options.zzE()];
                zzdi zzdiVarZzF = zzdi.zzF(bArr);
                barhopperV3Options.zzW(zzdiVarZzF);
                zzdiVarZzF.zzG();
                long jCreateNativeWithClientOptions = createNativeWithClientOptions(bArr);
                this.f43898p0 = jCreateNativeWithClientOptions;
                if (jCreateNativeWithClientOptions == 0) {
                    throw new IllegalArgumentException("Failed to create native context with client options.");
                }
                return;
            } catch (IOException e5) {
                String name = barhopperV3Options.getClass().getName();
                throw new RuntimeException(f.c(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e5);
            }
        }
        Log.w("BarhopperV3", "Native context already exists.");
    }

    @NonNull
    public BarhopperProto$BarhopperResponse recognize(int i10, int i11, int i12, @NonNull byte[] bArr, @NonNull RecognitionOptions recognitionOptions) {
        long j10 = this.f43898p0;
        if (j10 != 0) {
            return c(recognizeStridedNative(j10, i10, i11, i12, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    @NonNull
    public BarhopperProto$BarhopperResponse recognize(int i10, int i11, @NonNull ByteBuffer byteBuffer, @NonNull RecognitionOptions recognitionOptions) {
        long j10 = this.f43898p0;
        if (j10 != 0) {
            return c(recognizeBufferNative(j10, i10, i11, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    @NonNull
    public BarhopperProto$BarhopperResponse recognize(int i10, int i11, @NonNull byte[] bArr, @NonNull RecognitionOptions recognitionOptions) {
        long j10 = this.f43898p0;
        if (j10 != 0) {
            return c(recognizeNative(j10, i10, i11, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    @NonNull
    public BarhopperProto$BarhopperResponse recognize(@NonNull Bitmap bitmap, @NonNull RecognitionOptions recognitionOptions) {
        long j10 = this.f43898p0;
        if (j10 != 0) {
            return c(recognizeBitmapNative(j10, bitmap, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }
}
