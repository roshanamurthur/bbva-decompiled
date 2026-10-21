package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzwa implements zzwh {
    private final zzvw zza;
    private final zzwv zzb;
    private final boolean zzc;
    private final zzui zzd;

    private zzwa(zzwv zzwvVar, zzui zzuiVar, zzvw zzvwVar) {
        this.zzb = zzwvVar;
        this.zzc = zzvwVar instanceof zzus;
        this.zzd = zzuiVar;
        this.zza = zzvwVar;
    }

    public static zzwa zzc(zzwv zzwvVar, zzui zzuiVar, zzvw zzvwVar) {
        return new zzwa(zzwvVar, zzuiVar, zzvwVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final int zza(Object obj) {
        int iZzb = ((zzuw) obj).zzc.zzb();
        return this.zzc ? iZzb + ((zzus) obj).zzb.zzb() : iZzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final int zzb(Object obj) {
        int iHashCode = ((zzuw) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzus) obj).zzb.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final Object zze() {
        zzvw zzvwVar = this.zza;
        return zzvwVar instanceof zzuw ? ((zzuw) zzvwVar).zzy() : zzvwVar.zzK().zzp();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final void zzf(Object obj) {
        this.zzb.zza(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final void zzg(Object obj, Object obj2) {
        zzwj.zzp(this.zzb, obj, obj2);
        if (this.zzc) {
            zzwj.zzo(this.zzd, obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5 A[EDGE_INSN: B:57:0x00b5->B:33:0x00b5 BREAK  A[LOOP:1: B:18:0x0062->B:60:0x0062], SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zztj zztjVar) throws IOException {
        zzuw zzuwVar = (zzuw) obj;
        zzww zzwwVarZzf = zzuwVar.zzc;
        if (zzwwVarZzf == zzww.zzc()) {
            zzwwVarZzf = zzww.zzf();
            zzuwVar.zzc = zzwwVarZzf;
        }
        zzum zzumVarZzb = ((zzus) obj).zzb();
        zzuu zzuuVarZzb = null;
        while (i10 < i11) {
            int iZzj = zztk.zzj(bArr, i10, zztjVar);
            int i12 = zztjVar.zza;
            if (i12 == 11) {
                int i13 = 0;
                zztu zztuVar = null;
                while (iZzj < i11) {
                    iZzj = zztk.zzj(bArr, iZzj, zztjVar);
                    int i14 = zztjVar.zza;
                    int i15 = i14 >>> 3;
                    int i16 = i14 & 7;
                    if (i15 == 2) {
                        if (i16 != 0) {
                            if (i14 != 12) {
                                break;
                                break;
                            }
                            iZzj = zztk.zzp(i14, bArr, iZzj, i11, zztjVar);
                        } else {
                            iZzj = zztk.zzj(bArr, iZzj, zztjVar);
                            i13 = zztjVar.zza;
                            zzuuVarZzb = zztjVar.zzd.zzb(this.zza, i13);
                        }
                    } else {
                        if (i15 == 3) {
                            if (zzuuVarZzb != null) {
                                iZzj = zztk.zze(zzwe.zza().zzb(zzuuVarZzb.zzc.getClass()), bArr, iZzj, i11, zztjVar);
                                zzumVarZzb.zzj(zzuuVarZzb.zzd, zztjVar.zzc);
                            } else if (i16 == 2) {
                                iZzj = zztk.zza(bArr, iZzj, zztjVar);
                                zztuVar = (zztu) zztjVar.zzc;
                            }
                        }
                        if (i14 != 12) {
                            break;
                        } else {
                            iZzj = zztk.zzp(i14, bArr, iZzj, i11, zztjVar);
                        }
                    }
                }
                if (zztuVar != null) {
                    zzwwVarZzf.zzj((i13 << 3) | 2, zztuVar);
                }
                i10 = iZzj;
            } else if ((i12 & 7) == 2) {
                zzuu zzuuVarZzb2 = zztjVar.zzd.zzb(this.zza, i12 >>> 3);
                if (zzuuVarZzb2 != null) {
                    i10 = zztk.zze(zzwe.zza().zzb(zzuuVarZzb2.zzc.getClass()), bArr, iZzj, i11, zztjVar);
                    zzumVarZzb.zzj(zzuuVarZzb2.zzd, zztjVar.zzc);
                } else {
                    i10 = zztk.zzi(i12, bArr, iZzj, i11, zzwwVarZzf, zztjVar);
                }
                zzuuVarZzb = zzuuVarZzb2;
            } else {
                i10 = zztk.zzp(i12, bArr, iZzj, i11, zztjVar);
            }
        }
        if (i10 != i11) {
            throw new zzve("Failed to parse the message.");
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final void zzi(Object obj, zzxi zzxiVar) throws IOException {
        Iterator itZzf = ((zzus) obj).zzb.zzf();
        if (!itZzf.hasNext()) {
            ((zzuw) obj).zzc.zzk(zzxiVar);
            return;
        }
        zzul zzulVar = (zzul) ((Map.Entry) itZzf.next()).getKey();
        if (zzulVar.zzc() == zzxh.MESSAGE) {
            zzulVar.zze();
        }
        throw new IllegalStateException("Found invalid MessageSet item.");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final boolean zzj(Object obj, Object obj2) {
        if (!((zzuw) obj).zzc.equals(((zzuw) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzus) obj).zzb.equals(((zzus) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final boolean zzk(Object obj) {
        return ((zzus) obj).zzb.zzl();
    }
}
