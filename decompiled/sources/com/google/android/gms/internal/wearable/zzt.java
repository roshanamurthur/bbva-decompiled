package com.google.android.gms.internal.wearable;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class zzt {
    protected volatile int zzhl = -1;

    public static final byte[] zzb(zzt zztVar) {
        int iZzx = zztVar.zzx();
        byte[] bArr = new byte[iZzx];
        try {
            zzl zzlVarZzb = zzl.zzb(bArr, 0, iZzx);
            zztVar.zza(zzlVarZzb);
            zzlVarZzb.zzr();
            return bArr;
        } catch (IOException e5) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e5);
        }
    }

    public String toString() {
        return zzu.zzc(this);
    }

    public abstract zzt zza(zzk zzkVar) throws IOException;

    public void zza(zzl zzlVar) throws IOException {
    }

    public int zzg() {
        return 0;
    }

    @Override // 
    /* JADX INFO: renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public zzt clone() throws CloneNotSupportedException {
        return (zzt) super.clone();
    }

    public final int zzx() {
        int iZzg = zzg();
        this.zzhl = iZzg;
        return iZzg;
    }

    public static final <T extends zzt> T zza(T t10, byte[] bArr, int i10, int i11) throws zzs {
        try {
            zzk zzkVarZza = zzk.zza(bArr, 0, i11);
            t10.zza(zzkVarZza);
            zzkVarZza.zzc(0);
            return t10;
        } catch (zzs e5) {
            throw e5;
        } catch (IOException e7) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e7);
        }
    }
}
