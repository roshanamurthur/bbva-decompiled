package com.google.android.gms.internal.wearable;

import ad.d;
import androidx.camera.core.imagecapture.a;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class zzk {
    private final byte[] buffer;
    private final int zzgr;
    private final int zzgs;
    private int zzgt;
    private int zzgu;
    private int zzgv;
    private int zzgw;
    private int zzgy;
    private int zzgx = Integer.MAX_VALUE;
    private int zzgz = 64;
    private int zzha = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;

    private zzk(byte[] bArr, int i10, int i11) {
        this.buffer = bArr;
        this.zzgr = i10;
        int i12 = i11 + i10;
        this.zzgt = i12;
        this.zzgs = i12;
        this.zzgv = i10;
    }

    public static zzk zza(byte[] bArr, int i10, int i11) {
        return new zzk(bArr, 0, i11);
    }

    private final void zzh(int i10) throws IOException {
        if (i10 < 0) {
            throw zzs.zzv();
        }
        int i11 = this.zzgv;
        int i12 = i11 + i10;
        int i13 = this.zzgx;
        if (i12 > i13) {
            zzh(i13 - i11);
            throw zzs.zzu();
        }
        if (i10 > this.zzgt - i11) {
            throw zzs.zzu();
        }
        this.zzgv = i11 + i10;
    }

    private final void zzo() {
        int i10 = this.zzgt + this.zzgu;
        this.zzgt = i10;
        int i11 = this.zzgx;
        if (i10 <= i11) {
            this.zzgu = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzgu = i12;
        this.zzgt = i10 - i12;
    }

    private final byte zzq() throws IOException {
        int i10 = this.zzgv;
        if (i10 == this.zzgt) {
            throw zzs.zzu();
        }
        byte[] bArr = this.buffer;
        this.zzgv = i10 + 1;
        return bArr[i10];
    }

    public final int getPosition() {
        return this.zzgv - this.zzgr;
    }

    public final byte[] readBytes() throws IOException {
        int iZzk = zzk();
        if (iZzk < 0) {
            throw zzs.zzv();
        }
        if (iZzk == 0) {
            return zzw.zzhy;
        }
        int i10 = this.zzgt;
        int i11 = this.zzgv;
        if (iZzk > i10 - i11) {
            throw zzs.zzu();
        }
        byte[] bArr = new byte[iZzk];
        System.arraycopy(this.buffer, i11, bArr, 0, iZzk);
        this.zzgv += iZzk;
        return bArr;
    }

    public final String readString() throws IOException {
        int iZzk = zzk();
        if (iZzk < 0) {
            throw zzs.zzv();
        }
        int i10 = this.zzgt;
        int i11 = this.zzgv;
        if (iZzk > i10 - i11) {
            throw zzs.zzu();
        }
        String str = new String(this.buffer, i11, iZzk, zzr.UTF_8);
        this.zzgv += iZzk;
        return str;
    }

    public final byte[] zzb(int i10, int i11) {
        if (i11 == 0) {
            return zzw.zzhy;
        }
        byte[] bArr = new byte[i11];
        System.arraycopy(this.buffer, this.zzgr + i10, bArr, 0, i11);
        return bArr;
    }

    public final void zzc(int i10) throws zzs {
        if (this.zzgw != i10) {
            throw new zzs("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzd(int i10) throws IOException {
        int iZzj;
        int i11 = i10 & 7;
        if (i11 == 0) {
            zzk();
            return true;
        }
        if (i11 == 1) {
            zzn();
            return true;
        }
        if (i11 == 2) {
            zzh(zzk());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw new zzs("Protocol message tag had invalid wire type.");
            }
            zzm();
            return true;
        }
        do {
            iZzj = zzj();
            if (iZzj == 0) {
                break;
            }
        } while (zzd(iZzj));
        zzc(((i10 >>> 3) << 3) | 4);
        return true;
    }

    public final int zze(int i10) throws zzs {
        if (i10 < 0) {
            throw zzs.zzv();
        }
        int i11 = i10 + this.zzgv;
        int i12 = this.zzgx;
        if (i11 > i12) {
            throw zzs.zzu();
        }
        this.zzgx = i11;
        zzo();
        return i12;
    }

    public final void zzf(int i10) {
        this.zzgx = i10;
        zzo();
    }

    public final void zzg(int i10) {
        zzc(i10, this.zzgw);
    }

    public final int zzj() throws IOException {
        if (this.zzgv == this.zzgt) {
            this.zzgw = 0;
            return 0;
        }
        int iZzk = zzk();
        this.zzgw = iZzk;
        if (iZzk != 0) {
            return iZzk;
        }
        throw new zzs("Protocol message contained an invalid tag (zero).");
    }

    public final int zzk() throws IOException {
        int i10;
        byte bZzq = zzq();
        if (bZzq >= 0) {
            return bZzq;
        }
        int i11 = bZzq & 127;
        byte bZzq2 = zzq();
        if (bZzq2 >= 0) {
            i10 = bZzq2 << 7;
        } else {
            i11 |= (bZzq2 & 127) << 7;
            byte bZzq3 = zzq();
            if (bZzq3 >= 0) {
                i10 = bZzq3 << Constants.CVR_B1b41_1110_ONLINE_PIN;
            } else {
                i11 |= (bZzq3 & 127) << 14;
                byte bZzq4 = zzq();
                if (bZzq4 < 0) {
                    int i12 = i11 | ((bZzq4 & 127) << 21);
                    byte bZzq5 = zzq();
                    int i13 = i12 | (bZzq5 << 28);
                    if (bZzq5 >= 0) {
                        return i13;
                    }
                    for (int i14 = 0; i14 < 5; i14++) {
                        if (zzq() >= 0) {
                            return i13;
                        }
                    }
                    throw zzs.zzw();
                }
                i10 = bZzq4 << MessageUtils.MESSAGE_21_NAK;
            }
        }
        return i11 | i10;
    }

    public final long zzl() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bZzq = zzq();
            j10 |= ((long) (bZzq & 127)) << i10;
            if ((bZzq & 128) == 0) {
                return j10;
            }
        }
        throw zzs.zzw();
    }

    public final int zzm() throws IOException {
        return (zzq() & 255) | ((zzq() & 255) << 8) | ((zzq() & 255) << 16) | ((zzq() & 255) << 24);
    }

    public final long zzn() throws IOException {
        byte bZzq = zzq();
        return ((((long) zzq()) & 255) << 8) | (((long) bZzq) & 255) | ((((long) zzq()) & 255) << 16) | ((((long) zzq()) & 255) << 24) | ((((long) zzq()) & 255) << 32) | ((((long) zzq()) & 255) << 40) | ((((long) zzq()) & 255) << 48) | ((((long) zzq()) & 255) << 56);
    }

    public final int zzp() {
        int i10 = this.zzgx;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - this.zzgv;
    }

    public final void zza(zzt zztVar) throws IOException {
        int iZzk = zzk();
        if (this.zzgy >= this.zzgz) {
            throw new zzs("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iZze = zze(iZzk);
        this.zzgy++;
        zztVar.zza(this);
        zzc(0);
        this.zzgy--;
        zzf(iZze);
    }

    public final void zzc(int i10, int i11) {
        int i12 = this.zzgv;
        int i13 = this.zzgr;
        if (i10 > i12 - i13) {
            throw new IllegalArgumentException(d.d(50, "Position ", i10, " is beyond current ", this.zzgv - this.zzgr));
        }
        if (i10 >= 0) {
            this.zzgv = i13 + i10;
            this.zzgw = i11;
            return;
        }
        throw new IllegalArgumentException(a.a(24, "Bad position ", i10));
    }
}
