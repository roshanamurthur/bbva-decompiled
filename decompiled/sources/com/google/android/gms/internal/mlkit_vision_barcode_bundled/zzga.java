package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzga extends zzdb {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzdb zzd;
    private final zzdb zze;
    private final int zzf;
    private final int zzg;

    private zzga(zzdb zzdbVar, zzdb zzdbVar2) {
        this.zzd = zzdbVar;
        this.zze = zzdbVar2;
        int iZzd = zzdbVar.zzd();
        this.zzf = iZzd;
        this.zzc = zzdbVar2.zzd() + iZzd;
        this.zzg = Math.max(zzdbVar.zzf(), zzdbVar2.zzf()) + 1;
    }

    public static zzdb zzA(zzdb zzdbVar, zzdb zzdbVar2) {
        if (zzdbVar2.zzd() == 0) {
            return zzdbVar;
        }
        if (zzdbVar.zzd() == 0) {
            return zzdbVar2;
        }
        int iZzd = zzdbVar2.zzd() + zzdbVar.zzd();
        if (iZzd < 128) {
            return zzB(zzdbVar, zzdbVar2);
        }
        if (zzdbVar instanceof zzga) {
            zzga zzgaVar = (zzga) zzdbVar;
            if (zzdbVar2.zzd() + zzgaVar.zze.zzd() < 128) {
                return new zzga(zzgaVar.zzd, zzB(zzgaVar.zze, zzdbVar2));
            }
            if (zzgaVar.zzd.zzf() > zzgaVar.zze.zzf() && zzgaVar.zzg > zzdbVar2.zzf()) {
                return new zzga(zzgaVar.zzd, new zzga(zzgaVar.zze, zzdbVar2));
            }
        }
        return iZzd >= zzc(Math.max(zzdbVar.zzf(), zzdbVar2.zzf()) + 1) ? new zzga(zzdbVar, zzdbVar2) : zzfy.zza(new zzfy(null), zzdbVar, zzdbVar2);
    }

    private static zzdb zzB(zzdb zzdbVar, zzdb zzdbVar2) {
        int iZzd = zzdbVar.zzd();
        int iZzd2 = zzdbVar2.zzd();
        byte[] bArr = new byte[iZzd + iZzd2];
        zzdbVar.zzx(bArr, 0, 0, iZzd);
        zzdbVar2.zzx(bArr, 0, iZzd, iZzd2);
        return new zzcz(bArr);
    }

    public static int zzc(int i10) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdb)) {
            return false;
        }
        zzdb zzdbVar = (zzdb) obj;
        if (this.zzc != zzdbVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int iZzp = zzp();
        int iZzp2 = zzdbVar.zzp();
        if (iZzp != 0 && iZzp2 != 0 && iZzp != iZzp2) {
            return false;
        }
        zzfx zzfxVar = null;
        zzfz zzfzVar = new zzfz(this, zzfxVar);
        zzcy zzcyVarZza = zzfzVar.next();
        zzfz zzfzVar2 = new zzfz(zzdbVar, zzfxVar);
        zzcy zzcyVarZza2 = zzfzVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int iZzd = zzcyVarZza.zzd() - i10;
            int iZzd2 = zzcyVarZza2.zzd() - i11;
            int iMin = Math.min(iZzd, iZzd2);
            if (!(i10 == 0 ? zzcyVarZza.zzg(zzcyVarZza2, i11, iMin) : zzcyVarZza2.zzg(zzcyVarZza, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.zzc;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzd) {
                zzcyVarZza = zzfzVar.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == iZzd2) {
                zzcyVarZza = zzcyVarZza;
                zzcyVarZza2 = zzfzVar2.next();
                i11 = 0;
            } else {
                zzcyVarZza = zzcyVarZza;
                i11 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfx(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final byte zza(int i10) {
        zzdb.zzw(i10, this.zzc);
        return zzb(i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final byte zzb(int i10) {
        int i11 = this.zzf;
        return i10 < i11 ? this.zzd.zzb(i10) : this.zze.zzb(i10 - i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        int i13 = this.zzf;
        if (i10 + i12 <= i13) {
            this.zzd.zze(bArr, i10, i11, i12);
        } else {
            if (i10 >= i13) {
                this.zze.zze(bArr, i10 - i13, i11, i12);
                return;
            }
            int i14 = i13 - i10;
            this.zzd.zze(bArr, i10, i11, i14);
            this.zze.zze(bArr, 0, i11 + i14, i12 - i14);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int zzi(int i10, int i11, int i12) {
        int i13 = this.zzf;
        if (i11 + i12 <= i13) {
            return this.zzd.zzi(i10, i11, i12);
        }
        if (i11 >= i13) {
            return this.zze.zzi(i10, i11 - i13, i12);
        }
        int i14 = i13 - i11;
        return this.zze.zzi(this.zzd.zzi(i10, i11, i14), 0, i12 - i14);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int zzj(int i10, int i11, int i12) {
        int i13 = this.zzf;
        if (i11 + i12 <= i13) {
            return this.zzd.zzj(i10, i11, i12);
        }
        if (i11 >= i13) {
            return this.zze.zzj(i10, i11 - i13, i12);
        }
        int i14 = i13 - i11;
        return this.zze.zzj(this.zzd.zzj(i10, i11, i14), 0, i12 - i14);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final zzdb zzk(int i10, int i11) {
        int iZzo = zzdb.zzo(i10, i11, this.zzc);
        if (iZzo == 0) {
            return zzdb.zzb;
        }
        if (iZzo == this.zzc) {
            return this;
        }
        int i12 = this.zzf;
        if (i11 <= i12) {
            return this.zzd.zzk(i10, i11);
        }
        if (i10 >= i12) {
            return this.zze.zzk(i10 - i12, i11 - i12);
        }
        zzdb zzdbVar = this.zzd;
        return new zzga(zzdbVar.zzk(i10, zzdbVar.zzd()), this.zze.zzk(0, i11 - this.zzf));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final String zzl(Charset charset) {
        return new String(zzy(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final void zzm(zzcr zzcrVar) throws IOException {
        this.zzd.zzm(zzcrVar);
        this.zze.zzm(zzcrVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final boolean zzn() {
        int iZzj = this.zzd.zzj(0, 0, this.zzf);
        zzdb zzdbVar = this.zze;
        return zzdbVar.zzj(iZzj, 0, zzdbVar.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    /* JADX INFO: renamed from: zzq */
    public final zzcx iterator() {
        return new zzfx(this);
    }

    public /* synthetic */ zzga(zzdb zzdbVar, zzdb zzdbVar2, zzfx zzfxVar) {
        this(zzdbVar, zzdbVar2);
    }
}
