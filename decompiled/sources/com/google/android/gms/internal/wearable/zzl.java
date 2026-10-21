package com.google.android.gms.internal.wearable;

import androidx.camera.core.imagecapture.a;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* JADX INFO: loaded from: classes9.dex */
public final class zzl {
    private final ByteBuffer zzhb;

    private zzl(byte[] bArr, int i10, int i11) {
        this(ByteBuffer.wrap(bArr, i10, i11));
    }

    public static zzl zzb(byte[] bArr) {
        return zzb(bArr, 0, bArr.length);
    }

    public static int zze(int i10, int i11) {
        return zzi(i11) + zzk(i10);
    }

    public static int zzg(String str) {
        int iZza = zza(str);
        return zzm(iZza) + iZza;
    }

    public static int zzi(int i10) {
        if (i10 >= 0) {
            return zzm(i10);
        }
        return 10;
    }

    private final void zzj(int i10) throws IOException {
        byte b10 = (byte) i10;
        if (!this.zzhb.hasRemaining()) {
            throw new zzm(this.zzhb.position(), this.zzhb.limit());
        }
        this.zzhb.put(b10);
    }

    public static int zzk(int i10) {
        return zzm(i10 << 3);
    }

    public static int zzm(int i10) {
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

    public static int zzn(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public final void zza(int i10, float f6) throws IOException {
        zzf(i10, 5);
        int iFloatToIntBits = Float.floatToIntBits(f6);
        if (this.zzhb.remaining() < 4) {
            throw new zzm(this.zzhb.position(), this.zzhb.limit());
        }
        this.zzhb.putInt(iFloatToIntBits);
    }

    public final void zzc(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.zzhb.remaining() < length) {
            throw new zzm(this.zzhb.position(), this.zzhb.limit());
        }
        this.zzhb.put(bArr, 0, length);
    }

    public final void zzd(int i10, int i11) throws IOException {
        zzf(i10, 0);
        if (i11 >= 0) {
            zzl(i11);
        } else {
            zza(i11);
        }
    }

    public final void zzf(int i10, int i11) throws IOException {
        zzl((i10 << 3) | i11);
    }

    public final void zzl(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            zzj((i10 & 127) | 128);
            i10 >>>= 7;
        }
        zzj(i10);
    }

    public final void zzr() {
        if (this.zzhb.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(this.zzhb.remaining())));
        }
    }

    private zzl(ByteBuffer byteBuffer) {
        this.zzhb = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static zzl zzb(byte[] bArr, int i10, int i11) {
        return new zzl(bArr, 0, i11);
    }

    public static int zzb(int i10, long j10) {
        int i11;
        int iZzk = zzk(i10);
        if (((-128) & j10) == 0) {
            i11 = 1;
        } else if (((-16384) & j10) == 0) {
            i11 = 2;
        } else if (((-2097152) & j10) == 0) {
            i11 = 3;
        } else if (((-268435456) & j10) == 0) {
            i11 = 4;
        } else if (((-34359738368L) & j10) == 0) {
            i11 = 5;
        } else if (((-4398046511104L) & j10) == 0) {
            i11 = 6;
        } else if (((-562949953421312L) & j10) == 0) {
            i11 = 7;
        } else if (((-72057594037927936L) & j10) == 0) {
            i11 = 8;
        } else {
            i11 = (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
        }
        return iZzk + i11;
    }

    public static int zzb(int i10, String str) {
        return zzg(str) + zzk(i10);
    }

    public static int zzb(int i10, zzt zztVar) {
        int iZzk = zzk(i10);
        int iZzx = zztVar.zzx();
        return zzm(iZzx) + iZzx + iZzk;
    }

    public final void zza(int i10, long j10) throws IOException {
        zzf(i10, 0);
        zza(j10);
    }

    public final void zza(int i10, String str) throws IOException {
        zzf(i10, 2);
        try {
            int iZzm = zzm(str.length());
            if (iZzm == zzm(str.length() * 3)) {
                int iPosition = this.zzhb.position();
                if (this.zzhb.remaining() >= iZzm) {
                    this.zzhb.position(iPosition + iZzm);
                    zza(str, this.zzhb);
                    int iPosition2 = this.zzhb.position();
                    this.zzhb.position(iPosition);
                    zzl((iPosition2 - iPosition) - iZzm);
                    this.zzhb.position(iPosition2);
                    return;
                }
                throw new zzm(iPosition + iZzm, this.zzhb.limit());
            }
            zzl(zza(str));
            zza(str, this.zzhb);
        } catch (BufferOverflowException e5) {
            zzm zzmVar = new zzm(this.zzhb.position(), this.zzhb.limit());
            zzmVar.initCause(e5);
            throw zzmVar;
        }
    }

    public final void zzb(long j10) throws IOException {
        if (this.zzhb.remaining() >= 8) {
            this.zzhb.putLong(j10);
            return;
        }
        throw new zzm(this.zzhb.position(), this.zzhb.limit());
    }

    public final void zza(int i10, zzt zztVar) throws IOException {
        zzf(i10, 2);
        if (zztVar.zzhl < 0) {
            zztVar.zzx();
        }
        zzl(zztVar.zzhl);
        zztVar.zza(this);
    }

    private static int zza(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char cCharAt2 = charSequence.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                throw new IllegalArgumentException(a.a(39, "Unpaired surrogate at index ", i11));
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
                break;
            }
            i12 += (127 - cCharAt) >>> 31;
            i11++;
        }
        if (i12 >= length) {
            return i12;
        }
        long j10 = ((long) i12) + SvgConstantsKt.SPECIFIED_SOLID_OPACITY;
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j10);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static void zza(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        char cCharAt;
        if (!byteBuffer.isReadOnly()) {
            char c10 = 57343;
            int i11 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] bArrArray = byteBuffer.array();
                    int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int iRemaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i12 = iRemaining + iArrayOffset;
                    while (i11 < length) {
                        int i13 = i11 + iArrayOffset;
                        if (i13 >= i12 || (cCharAt = charSequence.charAt(i11)) >= 128) {
                            break;
                        }
                        bArrArray[i13] = (byte) cCharAt;
                        i11++;
                    }
                    if (i11 == length) {
                        i10 = iArrayOffset + length;
                    } else {
                        i10 = iArrayOffset + i11;
                        while (i11 < length) {
                            char cCharAt2 = charSequence.charAt(i11);
                            if (cCharAt2 < 128 && i10 < i12) {
                                bArrArray[i10] = (byte) cCharAt2;
                                i10++;
                            } else if (cCharAt2 < 2048 && i10 <= i12 - 2) {
                                int i14 = i10 + 1;
                                bArrArray[i10] = (byte) ((cCharAt2 >>> 6) | 960);
                                i10 += 2;
                                bArrArray[i14] = (byte) ((cCharAt2 & '?') | 128);
                            } else {
                                if ((cCharAt2 >= 55296 && c10 >= cCharAt2) || i10 > i12 - 3) {
                                    if (i10 <= i12 - 4) {
                                        int i15 = i11 + 1;
                                        if (i15 != charSequence.length()) {
                                            char cCharAt3 = charSequence.charAt(i15);
                                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                                bArrArray[i10] = (byte) ((codePoint >>> 18) | 240);
                                                bArrArray[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                                int i16 = i10 + 3;
                                                bArrArray[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                                i10 += 4;
                                                bArrArray[i16] = (byte) ((codePoint & 63) | 128);
                                                i11 = i15;
                                            } else {
                                                i11 = i15;
                                            }
                                        }
                                        StringBuilder sb2 = new StringBuilder(39);
                                        sb2.append("Unpaired surrogate at index ");
                                        sb2.append(i11 - 1);
                                        throw new IllegalArgumentException(sb2.toString());
                                    }
                                    StringBuilder sb3 = new StringBuilder(37);
                                    sb3.append("Failed writing ");
                                    sb3.append(cCharAt2);
                                    sb3.append(" at index ");
                                    sb3.append(i10);
                                    throw new ArrayIndexOutOfBoundsException(sb3.toString());
                                }
                                bArrArray[i10] = (byte) ((cCharAt2 >>> '\f') | 480);
                                int i17 = i10 + 2;
                                bArrArray[i10 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                                i10 += 3;
                                bArrArray[i17] = (byte) ((cCharAt2 & '?') | 128);
                            }
                            i11++;
                            c10 = 57343;
                        }
                    }
                    byteBuffer.position(i10 - byteBuffer.arrayOffset());
                    return;
                } catch (ArrayIndexOutOfBoundsException e5) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e5);
                    throw bufferOverflowException;
                }
            }
            int length2 = charSequence.length();
            while (i11 < length2) {
                char cCharAt4 = charSequence.charAt(i11);
                if (cCharAt4 < 128) {
                    byteBuffer.put((byte) cCharAt4);
                } else {
                    if (cCharAt4 < 2048) {
                        byteBuffer.put((byte) ((cCharAt4 >>> 6) | 960));
                        byteBuffer.put((byte) ((cCharAt4 & '?') | 128));
                    } else {
                        if (cCharAt4 >= 55296 && 57343 >= cCharAt4) {
                            int i18 = i11 + 1;
                            if (i18 != charSequence.length()) {
                                char cCharAt5 = charSequence.charAt(i18);
                                if (Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt4, cCharAt5);
                                    byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                    i11 = i18;
                                } else {
                                    i11 = i18;
                                }
                            }
                            throw new IllegalArgumentException(a.a(39, "Unpaired surrogate at index ", i11 - 1));
                        }
                        byteBuffer.put((byte) ((cCharAt4 >>> '\f') | 480));
                        byteBuffer.put((byte) (((cCharAt4 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((cCharAt4 & '?') | 128));
                    }
                    i11++;
                }
                i11++;
            }
            return;
        }
        throw new ReadOnlyBufferException();
    }

    public final void zza(byte b10) throws IOException {
        if (this.zzhb.hasRemaining()) {
            this.zzhb.put(b10);
            return;
        }
        throw new zzm(this.zzhb.position(), this.zzhb.limit());
    }

    private final void zza(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            zzj((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        zzj((int) j10);
    }
}
