package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.math.RoundingMode;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* JADX INFO: loaded from: classes9.dex */
class zzbe extends zzbf {
    final zzbb zzb;

    @CheckForNull
    final Character zzc;

    public zzbe(zzbb zzbbVar, @CheckForNull Character ch2) {
        this.zzb = zzbbVar;
        if (ch2 != null) {
            ch2.charValue();
            if (zzbbVar.zzb('=')) {
                throw new IllegalArgumentException(zzan.zza("Padding character %s was already in alphabet", ch2));
            }
        }
        this.zzc = ch2;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.zzb.equals(zzbeVar.zzb)) {
                Character ch2 = this.zzc;
                Character ch3 = zzbeVar.zzc;
                if (ch2 == ch3) {
                    return true;
                }
                if (ch2 != null && ch2.equals(ch3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode();
        Character ch2 = this.zzc;
        return iHashCode ^ (ch2 == null ? 0 : ch2.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzc);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.fido.zzbf
    public void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzam.zze(0, i11, bArr.length);
        while (i12 < i11) {
            zzc(appendable, bArr, i12, Math.min(this.zzb.zzd, i11 - i12));
            i12 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzbf
    public final int zzb(int i10) {
        zzbb zzbbVar = this.zzb;
        return zzbh.zza(i10, zzbbVar.zzd, RoundingMode.CEILING) * zzbbVar.zzc;
    }

    public final void zzc(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzam.zze(i10, i10 + i11, bArr.length);
        int i12 = 0;
        zzam.zzc(i11 <= this.zzb.zzd);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | ((long) (bArr[i10 + i13] & 255))) << 8;
        }
        int i14 = ((i11 + 1) * 8) - this.zzb.zzb;
        while (i12 < i11 * 8) {
            zzbb zzbbVar = this.zzb;
            appendable.append(zzbbVar.zza(zzbbVar.zza & ((int) (j10 >>> (i14 - i12)))));
            i12 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i12 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append('=');
                i12 += this.zzb.zzb;
            }
        }
    }

    public zzbe(String str, String str2, @CheckForNull Character ch2) {
        this(new zzbb(str, str2.toCharArray()), ch2);
    }
}
