package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzje extends zzin {
    private static final Logger zzb = Logger.getLogger(zzje.class.getName());
    private static final boolean zzc = zzml.zzx();
    zzjf zza;

    private zzje() {
    }

    public static int zzA(int i10) {
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

    public static int zzB(long j10) {
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

    public static zzje zzC(byte[] bArr) {
        return new zzjc(bArr, 0, bArr.length);
    }

    public static int zzt(zzix zzixVar) {
        int iZzd = zzixVar.zzd();
        return zzA(iZzd) + iZzd;
    }

    @Deprecated
    public static int zzu(int i10, zzlc zzlcVar, zzln zzlnVar) {
        int iZzA = zzA(i10 << 3);
        int i11 = iZzA + iZzA;
        zzih zzihVar = (zzih) zzlcVar;
        int iZzbm = zzihVar.zzbm();
        if (iZzbm == -1) {
            iZzbm = zzlnVar.zza(zzihVar);
            zzihVar.zzbp(iZzbm);
        }
        return i11 + iZzbm;
    }

    public static int zzv(int i10) {
        if (i10 >= 0) {
            return zzA(i10);
        }
        return 10;
    }

    public static int zzw(zzkk zzkkVar) {
        int iZza = zzkkVar.zza();
        return zzA(iZza) + iZza;
    }

    public static int zzx(zzlc zzlcVar, zzln zzlnVar) {
        zzih zzihVar = (zzih) zzlcVar;
        int iZzbm = zzihVar.zzbm();
        if (iZzbm == -1) {
            iZzbm = zzlnVar.zza(zzihVar);
            zzihVar.zzbp(iZzbm);
        }
        return zzA(iZzbm) + iZzbm;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzmq.zzc(str);
        } catch (zzmp unused) {
            length = str.getBytes(zzkf.zzb).length;
        }
        return zzA(length) + length;
    }

    public static int zzz(int i10) {
        return zzA(i10 << 3);
    }

    public final void zzD() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzE(String str, zzmp zzmpVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmpVar);
        byte[] bytes = str.getBytes(zzkf.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (zzjd e5) {
            throw e5;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzjd(e7);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10) throws IOException;

    public abstract void zzd(int i10, boolean z10) throws IOException;

    public abstract void zze(int i10, zzix zzixVar) throws IOException;

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

    public /* synthetic */ zzje(zzjb zzjbVar) {
    }
}
