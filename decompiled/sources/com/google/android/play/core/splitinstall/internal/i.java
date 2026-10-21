package com.google.android.play.core.splitinstall.internal;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzef;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class i implements zzax, zzef {
    public static void a(byte[] bArr, int i10, int i11, byte[] bArr2) {
        for (int i12 = 0; i12 != 2144; i12++) {
            bArr[i12 + i10] = 0;
        }
        org.bouncycastle.pqc.crypto.sphincs.a.b(bArr, i10, 2144L, bArr2, i11);
    }

    public static void b(xm.a aVar, byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12, int i13) {
        for (int i14 = 0; i14 < 32; i14++) {
            bArr[i14 + i10] = bArr2[i14 + i11];
        }
        for (int i15 = 0; i15 < i13 && i15 < 16; i15++) {
            int i16 = (i15 * 32) + i12;
            byte[] bArr4 = new byte[32];
            for (int i17 = 0; i17 < 32; i17++) {
                bArr4[i17] = (byte) (bArr[i10 + i17] ^ bArr3[i16 + i17]);
            }
            aVar.b(bArr, i10, 0, bArr4);
        }
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzax
    public final Object[] zza(Object obj, List list, File file, List list2) {
        return (Object[]) zzbk.zzd(obj, "makePathElements", Object[].class, List.class, list);
    }
}
