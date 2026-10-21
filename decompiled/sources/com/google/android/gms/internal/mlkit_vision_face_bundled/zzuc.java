package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzuc extends zztm {
    private static final Logger zzb = Logger.getLogger(zzuc.class.getName());
    private static final boolean zzc = zzxc.zzx();
    zzud zza;

    private zzuc() {
        throw null;
    }

    public static int zzA(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzw(int i10, zzvw zzvwVar, zzwh zzwhVar) {
        int iZzz = zzz(i10 << 3);
        return ((zztf) zzvwVar).zzp(zzwhVar) + iZzz + iZzz;
    }

    public static int zzx(zzvw zzvwVar, zzwh zzwhVar) {
        int iZzp = ((zztf) zzvwVar).zzp(zzwhVar);
        return zzz(iZzp) + iZzp;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzxf.zzc(str);
        } catch (zzxe unused) {
            length = str.getBytes(zzvc.zza).length;
        }
        return zzz(length) + length;
    }

    public static int zzz(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public final void zzB() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzC(String str, zzxe zzxeVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzxeVar);
        byte[] bytes = str.getBytes(zzvc.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e5) {
            throw new zzua(e5);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10) throws IOException;

    public abstract void zzd(int i10, boolean z10) throws IOException;

    public abstract void zze(int i10, zztu zztuVar) throws IOException;

    public abstract void zzf(int i10, int i11) throws IOException;

    public abstract void zzg(int i10) throws IOException;

    public abstract void zzh(int i10, long j10) throws IOException;

    public abstract void zzi(long j10) throws IOException;

    public abstract void zzj(int i10, int i11) throws IOException;

    public abstract void zzk(int i10) throws IOException;

    public abstract void zzl(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void zzm(int i10, zzvw zzvwVar, zzwh zzwhVar) throws IOException;

    public abstract void zzn(int i10, zzvw zzvwVar) throws IOException;

    public abstract void zzo(int i10, zztu zztuVar) throws IOException;

    public abstract void zzp(int i10, String str) throws IOException;

    public abstract void zzr(int i10, int i11) throws IOException;

    public abstract void zzs(int i10, int i11) throws IOException;

    public abstract void zzt(int i10) throws IOException;

    public abstract void zzu(int i10, long j10) throws IOException;

    public abstract void zzv(long j10) throws IOException;

    public /* synthetic */ zzuc(zzub zzubVar) {
    }
}
