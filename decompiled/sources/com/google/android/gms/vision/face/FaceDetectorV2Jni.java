package com.google.android.gms.vision.face;

import android.content.res.AssetManager;
import android.os.RemoteException;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzah;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzh;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzuh;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzv;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzve;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzx;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public class FaceDetectorV2Jni {
    private final zzuh zza;

    public FaceDetectorV2Jni() {
        zzuh zzuhVarZza = zzuh.zza();
        this.zza = zzuhVarZza;
        zzuhVarZza.zzc(zzah.zza);
    }

    @Keep
    private native void closeDetectorJni(long j10);

    @Keep
    private native byte[] detectFacesImageByteArrayJni(long j10, byte[] bArr, byte[] bArr2);

    @Keep
    private native byte[] detectFacesImageByteArrayMultiPlanesJni(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, int i11, int i12, int i13, int i14, int i15, byte[] bArr4);

    @Keep
    private native byte[] detectFacesImageByteBufferJni(long j10, ByteBuffer byteBuffer, byte[] bArr);

    @Keep
    private native byte[] detectFacesImageByteBufferMultiPlanesJni(long j10, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10, int i11, int i12, int i13, int i14, int i15, byte[] bArr);

    @Keep
    private native long initDetectorJni(byte[] bArr, AssetManager assetManager);

    public final long zza(zzx zzxVar, AssetManager assetManager) {
        return initDetectorJni(zzxVar.zzr(), assetManager);
    }

    @Nullable
    public final zzv zzb(long j10, byte[] bArr, zzh zzhVar) throws RemoteException {
        try {
            byte[] bArrDetectFacesImageByteArrayJni = detectFacesImageByteArrayJni(j10, bArr, zzhVar.zzr());
            if (bArrDetectFacesImageByteArrayJni == null || bArrDetectFacesImageByteArrayJni.length <= 0) {
                return null;
            }
            return zzv.zzb(bArrDetectFacesImageByteArrayJni, this.zza);
        } catch (zzve e5) {
            "detectFacesImageByteArray failed to parse result: ".concat(String.valueOf(e5.getMessage()));
            return null;
        }
    }

    @Nullable
    public final zzv zzc(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, int i11, int i12, int i13, int i14, int i15, zzh zzhVar) {
        try {
            byte[] bArrDetectFacesImageByteArrayMultiPlanesJni = detectFacesImageByteArrayMultiPlanesJni(j10, bArr, bArr2, bArr3, i10, i11, i12, i13, i14, i15, zzhVar.zzr());
            if (bArrDetectFacesImageByteArrayMultiPlanesJni == null || bArrDetectFacesImageByteArrayMultiPlanesJni.length <= 0) {
                return null;
            }
            try {
                return zzv.zzb(bArrDetectFacesImageByteArrayMultiPlanesJni, this.zza);
            } catch (zzve e5) {
                e = e5;
                "detectFacesImageByteArrayMultiPlanes failed to parse result: ".concat(String.valueOf(e.getMessage()));
                return null;
            }
        } catch (zzve e7) {
            e = e7;
        }
    }

    @Nullable
    public final zzv zzd(long j10, ByteBuffer byteBuffer, zzh zzhVar) throws RemoteException {
        try {
            byte[] bArrDetectFacesImageByteBufferJni = detectFacesImageByteBufferJni(j10, byteBuffer, zzhVar.zzr());
            if (bArrDetectFacesImageByteBufferJni == null || bArrDetectFacesImageByteBufferJni.length <= 0) {
                return null;
            }
            return zzv.zzb(bArrDetectFacesImageByteBufferJni, this.zza);
        } catch (zzve e5) {
            "detectFacesImageByteBuffer failed to parse result: ".concat(String.valueOf(e5.getMessage()));
            return null;
        }
    }

    @Nullable
    public final zzv zze(long j10, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10, int i11, int i12, int i13, int i14, int i15, zzh zzhVar) {
        try {
            byte[] bArrDetectFacesImageByteBufferMultiPlanesJni = detectFacesImageByteBufferMultiPlanesJni(j10, byteBuffer, byteBuffer2, byteBuffer3, i10, i11, i12, i13, i14, i15, zzhVar.zzr());
            if (bArrDetectFacesImageByteBufferMultiPlanesJni == null || bArrDetectFacesImageByteBufferMultiPlanesJni.length <= 0) {
                return null;
            }
            try {
                return zzv.zzb(bArrDetectFacesImageByteBufferMultiPlanesJni, this.zza);
            } catch (zzve e5) {
                e = e5;
                "detectFacesImageByteBufferMultiPlanes failed to parse result: ".concat(String.valueOf(e.getMessage()));
                return null;
            }
        } catch (zzve e7) {
            e = e7;
        }
    }

    public final void zzf(long j10) {
        closeDetectorJni(j10);
    }
}
