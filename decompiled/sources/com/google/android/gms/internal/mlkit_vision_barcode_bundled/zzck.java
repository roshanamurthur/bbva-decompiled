package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.collection.f;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcj;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzck;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzck<MessageType extends zzck<MessageType, BuilderType>, BuilderType extends zzcj<MessageType, BuilderType>> implements zzfl {
    protected int zzb = 0;

    public int zzB() {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl
    public final zzdb zzC() {
        try {
            int iZzE = zzE();
            zzdb zzdbVar = zzdb.zzb;
            byte[] bArr = new byte[iZzE];
            zzdi zzdiVarZzF = zzdi.zzF(bArr);
            zzW(zzdiVarZzF);
            zzdiVarZzF.zzG();
            return new zzcz(bArr);
        } catch (IOException e5) {
            String name = getClass().getName();
            throw new RuntimeException(f.c(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e5);
        }
    }

    public void zzD(int i10) {
        throw null;
    }
}
