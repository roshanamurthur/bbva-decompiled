package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.camera.camera2.internal.h0;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzte;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zztf;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zztf<MessageType extends zztf<MessageType, BuilderType>, BuilderType extends zzte<MessageType, BuilderType>> implements zzvw {
    protected int zza = 0;

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvw
    public final zztu zzM() {
        try {
            int iZzu = zzu();
            zztu zztuVar = zztu.zzb;
            byte[] bArr = new byte[iZzu];
            zztz zztzVar = new zztz(bArr, 0, iZzu);
            zzL(zztzVar);
            zztzVar.zzB();
            return new zztt(bArr);
        } catch (IOException e5) {
            throw new RuntimeException(h0.b("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e5);
        }
    }

    public int zzp(zzwh zzwhVar) {
        throw null;
    }

    public final byte[] zzr() {
        try {
            int iZzu = zzu();
            byte[] bArr = new byte[iZzu];
            zztz zztzVar = new zztz(bArr, 0, iZzu);
            zzL(zztzVar);
            zztzVar.zzB();
            return bArr;
        } catch (IOException e5) {
            throw new RuntimeException(h0.b("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e5);
        }
    }
}
