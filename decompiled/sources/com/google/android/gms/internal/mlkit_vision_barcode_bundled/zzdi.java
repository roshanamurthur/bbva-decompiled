package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzdi extends zzcr {
    private static final Logger zzb = Logger.getLogger(zzdi.class.getName());
    private static final boolean zzc = zzgz.zzx();
    zzdj zza;

    private zzdi() {
    }

    public static int zzA(zzfl zzflVar, zzgb zzgbVar) {
        zzck zzckVar = (zzck) zzflVar;
        int iZzB = zzckVar.zzB();
        if (iZzB == -1) {
            iZzB = zzgbVar.zza(zzckVar);
            zzckVar.zzD(iZzB);
        }
        return zzD(iZzB) + iZzB;
    }

    public static int zzB(String str) {
        int length;
        try {
            length = zzhe.zze(str);
        } catch (zzhd unused) {
            length = str.getBytes(zzel.zzb).length;
        }
        return zzD(length) + length;
    }

    public static int zzC(int i10) {
        return zzD(i10 << 3);
    }

    public static int zzD(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzE(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static zzdi zzF(byte[] bArr) {
        return new zzdg(bArr, 0, bArr.length);
    }

    public static int zzt(byte[] bArr) {
        int length = bArr.length;
        return zzD(length) + length;
    }

    public static int zzu(zzdb zzdbVar) {
        int iZzd = zzdbVar.zzd();
        return zzD(iZzd) + iZzd;
    }

    @Deprecated
    public static int zzv(int i10, zzfl zzflVar, zzgb zzgbVar) {
        int iZzD = zzD(i10 << 3);
        int i11 = iZzD + iZzD;
        zzck zzckVar = (zzck) zzflVar;
        int iZzB = zzckVar.zzB();
        if (iZzB == -1) {
            iZzB = zzgbVar.zza(zzckVar);
            zzckVar.zzD(iZzB);
        }
        return i11 + iZzB;
    }

    @Deprecated
    public static int zzw(zzfl zzflVar) {
        return zzflVar.zzE();
    }

    public static int zzx(int i10) {
        if (i10 >= 0) {
            return zzD(i10);
        }
        return 10;
    }

    public static int zzy(zzet zzetVar) {
        int iZza = zzetVar.zza();
        return zzD(iZza) + iZza;
    }

    public static int zzz(zzfl zzflVar) {
        int iZzE = zzflVar.zzE();
        return zzD(iZzE) + iZzE;
    }

    public final void zzG() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzH(String str, zzhd zzhdVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhdVar);
        byte[] bytes = str.getBytes(zzel.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (zzdh e5) {
            throw e5;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzdh(e7);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10) throws IOException;

    public abstract void zzd(int i10, boolean z10) throws IOException;

    public abstract void zze(int i10, zzdb zzdbVar) throws IOException;

    public abstract void zzf(int i10, int i11) throws IOException;

    public abstract void zzg(int i10) throws IOException;

    public abstract void zzh(int i10, long j10) throws IOException;

    public abstract void zzi(long j10) throws IOException;

    public abstract void zzj(int i10, int i11) throws IOException;

    public abstract void zzk(int i10) throws IOException;

    public abstract void zzl(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void zzm(int i10, String str) throws IOException;

    public abstract void zzo(int i10, int i11) throws IOException;

    public abstract void zzp(int i10, int i11) throws IOException;

    public abstract void zzq(int i10) throws IOException;

    public abstract void zzr(int i10, long j10) throws IOException;

    public abstract void zzs(long j10) throws IOException;

    public /* synthetic */ zzdi(zzdf zzdfVar) {
    }
}
