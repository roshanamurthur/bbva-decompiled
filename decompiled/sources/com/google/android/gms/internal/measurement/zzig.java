package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzig;
import com.google.android.gms.internal.measurement.zzih;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzig<MessageType extends zzih<MessageType, BuilderType>, BuilderType extends zzig<MessageType, BuilderType>> implements zzlb {
    @Override // 
    public abstract zzig zzao();

    public abstract zzig zzap(zzih zzihVar);

    public zzig zzaq(byte[] bArr, int i10, int i11) throws zzkh {
        throw null;
    }

    public zzig zzar(byte[] bArr, int i10, int i11, zzjj zzjjVar) throws zzkh {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final /* bridge */ /* synthetic */ zzlb zzas(zzlc zzlcVar) {
        if (zzbJ().getClass().isInstance(zzlcVar)) {
            return zzap((zzih) zzlcVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final /* synthetic */ zzlb zzat(byte[] bArr) throws zzkh {
        return zzaq(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final /* synthetic */ zzlb zzau(byte[] bArr, zzjj zzjjVar) throws zzkh {
        return zzar(bArr, 0, bArr.length, zzjjVar);
    }
}
