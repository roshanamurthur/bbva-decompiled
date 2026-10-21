package com.facetec.sdk;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.animation.core.AnimationKt;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Map;
import javax.annotation.Nullable;
import kotlin.text.Typography;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes9.dex */
public final class nb implements nh, ni, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f42662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f42663d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    nt f42664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f42665b;

    static {
        r();
        f42662c = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, Constants.DIRECTORY_ENTRY, 98, 99, 100, 101, 102};
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0154  */
    /* JADX WARN: Code duplicated, block: B:37:0x0155  */
    private static void q(String str, int i10, Object[] objArr) throws Throwable {
        long j10;
        Throwable cause;
        char[] charArray = str != null ? str.toCharArray() : str;
        gw gwVar = new gw();
        gwVar.f41836e = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        gwVar.f41835a = 0;
        while (true) {
            int i11 = gwVar.f41835a;
            if (i11 >= charArray.length) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(charArray[i11]), gwVar, gwVar};
                Map map = bp.f40694x;
                Object method = map.get(346539884);
                if (method == null) {
                    method = ((Class) bp.a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23, 245 - ExpandableListView.getPackedPositionType(0L), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1))).getMethod("r", Integer.TYPE, Object.class, Object.class);
                    map.put(346539884, method);
                }
                jArr[i11] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f42663d ^ (-4932774504156859221L));
                Object[] objArr3 = {gwVar, gwVar};
                Object method2 = map.get(593077425);
                if (method2 == null) {
                    method2 = ((Class) bp.a(TextUtils.getOffsetAfter("", 0) + 23, 198 - AndroidCharacter.getMirror('0'), (char) View.combineMeasuredStates(0, 0))).getMethod("q", Object.class, Object.class);
                    map.put(593077425, method2);
                }
                ((Method) method2).invoke(null, objArr3);
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = new char[length];
        gwVar.f41835a = 0;
        while (true) {
            int i12 = gwVar.f41835a;
            if (i12 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i12] = (char) jArr[i12];
            Object[] objArr4 = {gwVar, gwVar};
            Map map2 = bp.f40694x;
            Object method3 = map2.get(593077425);
            if (method3 != null) {
                j10 = 0;
            } else {
                j10 = 0;
                method3 = ((Class) bp.a((ViewConfiguration.getLongPressTimeout() >> 16) + 23, 150 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1))).getMethod("q", Object.class, Object.class);
                map2.put(593077425, method3);
            }
            ((Method) method3).invoke(null, objArr4);
        }
    }

    public static void r() {
        f42663d = -5353545679063878033L;
    }

    public final long b() {
        return this.f42665b;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        nb nbVar = new nb();
        if (this.f42665b == 0) {
            return nbVar;
        }
        nt ntVarD = this.f42664a.d();
        nbVar.f42664a = ntVarD;
        ntVarD.f42724f = ntVarD;
        ntVarD.f42725g = ntVarD;
        nt ntVar = this.f42664a;
        while (true) {
            ntVar = ntVar.f42725g;
            if (ntVar == this.f42664a) {
                nbVar.f42665b = this.f42665b;
                return nbVar;
            }
            nbVar.f42664a.f42724f.c(ntVar.d());
        }
    }

    @Override // com.facetec.sdk.nh, com.facetec.sdk.ni
    public final nb d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb)) {
            return false;
        }
        nb nbVar = (nb) obj;
        long j10 = this.f42665b;
        if (j10 != nbVar.f42665b) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        nt ntVar = this.f42664a;
        nt ntVar2 = nbVar.f42664a;
        int i10 = ntVar.f42719a;
        int i11 = ntVar2.f42719a;
        while (j11 < this.f42665b) {
            long jMin = Math.min(ntVar.f42722d - i10, ntVar2.f42722d - i11);
            int i12 = 0;
            while (i12 < jMin) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (ntVar.f42721c[i10] != ntVar2.f42721c[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == ntVar.f42722d) {
                ntVar = ntVar.f42725g;
                i10 = ntVar.f42719a;
            }
            if (i11 == ntVar2.f42722d) {
                ntVar2 = ntVar2.f42725g;
                i11 = ntVar2.f42719a;
            }
            j11 += jMin;
        }
        return true;
    }

    @Override // com.facetec.sdk.nh
    public final short g() {
        return nv.a(j());
    }

    public final int hashCode() {
        nt ntVar = this.f42664a;
        if (ntVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = ntVar.f42722d;
            for (int i12 = ntVar.f42719a; i12 < i11; i12++) {
                i10 = (i10 * 31) + ntVar.f42721c[i12];
            }
            ntVar = ntVar.f42725g;
        } while (ntVar != this.f42664a);
        return i10;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // com.facetec.sdk.nh
    public final String k() throws EOFException {
        return c(Long.MAX_VALUE);
    }

    public final byte[] l() {
        try {
            return h(this.f42665b);
        } catch (EOFException e5) {
            throw new AssertionError(e5);
        }
    }

    @Override // com.facetec.sdk.nh
    public final long n() {
        int i10;
        if (this.f42665b == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            nt ntVar = this.f42664a;
            byte[] bArr = ntVar.f42721c;
            int i12 = ntVar.f42719a;
            int i13 = ntVar.f42722d;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else {
                    if (b10 < 65 || b10 > 70) {
                        if (i11 != 0) {
                            z10 = true;
                            break;
                        }
                        StringBuilder sb2 = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
                        sb2.append(Integer.toHexString(b10));
                        throw new NumberFormatException(sb2.toString());
                    }
                    i10 = b10 - 55;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    nb nbVarH = new nb().f(j10).h((int) b10);
                    StringBuilder sb3 = new StringBuilder("Number too large: ");
                    sb3.append(nbVarH.m());
                    throw new NumberFormatException(sb3.toString());
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.f42664a = ntVar.c();
                nr.e(ntVar);
            } else {
                ntVar.f42719a = i12;
            }
            if (z10) {
                break;
            }
        } while (this.f42664a != null);
        this.f42665b -= (long) i11;
        return j10;
    }

    public final nj o() {
        return new nj(l());
    }

    public final void p() {
        try {
            j(this.f42665b);
        } catch (EOFException e5) {
            throw new AssertionError(e5);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        nt ntVar = this.f42664a;
        if (ntVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), ntVar.f42722d - ntVar.f42719a);
        byteBuffer.put(ntVar.f42721c, ntVar.f42719a, iMin);
        int i10 = ntVar.f42719a + iMin;
        ntVar.f42719a = i10;
        this.f42665b -= (long) iMin;
        if (i10 == ntVar.f42722d) {
            this.f42664a = ntVar.c();
            nr.e(ntVar);
        }
        return iMin;
    }

    @Override // com.facetec.sdk.nh
    public final long s() {
        return e((byte) 0, 0L, Long.MAX_VALUE);
    }

    public final String toString() {
        long j10 = this.f42665b;
        if (j10 <= 2147483647L) {
            int i10 = (int) j10;
            return (i10 == 0 ? nj.f42686e : new nu(this, i10)).toString();
        }
        StringBuilder sb2 = new StringBuilder("size > Integer.MAX_VALUE: ");
        sb2.append(this.f42665b);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            nt ntVarB = b(1);
            int iMin = Math.min(i10, 8192 - ntVarB.f42722d);
            byteBuffer.get(ntVarB.f42721c, ntVarB.f42722d, iMin);
            i10 -= iMin;
            ntVarB.f42722d += iMin;
        }
        this.f42665b += (long) iRemaining;
        return iRemaining;
    }

    private String o(long j10) throws EOFException {
        return a(j10, nv.f42731c);
    }

    @Override // com.facetec.sdk.nh
    public final nj a(long j10) throws EOFException {
        return new nj(h(j10));
    }

    @Override // com.facetec.sdk.nh
    public final void b(long j10) throws EOFException {
        if (this.f42665b < j10) {
            throw new EOFException();
        }
    }

    @Override // com.facetec.sdk.nh
    public final boolean c() {
        return this.f42665b == 0;
    }

    public final nb d(nb nbVar, long j10, long j11) {
        if (nbVar == null) {
            throw new IllegalArgumentException("out == null");
        }
        nv.a(this.f42665b, j10, j11);
        if (j11 == 0) {
            return this;
        }
        nbVar.f42665b += j11;
        nt ntVar = this.f42664a;
        while (true) {
            int i10 = ntVar.f42722d;
            int i11 = ntVar.f42719a;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            ntVar = ntVar.f42725g;
        }
        while (j11 > 0) {
            nt ntVarD = ntVar.d();
            int i12 = (int) (((long) ntVarD.f42719a) + j10);
            ntVarD.f42719a = i12;
            ntVarD.f42722d = Math.min(i12 + ((int) j11), ntVarD.f42722d);
            nt ntVar2 = nbVar.f42664a;
            if (ntVar2 == null) {
                ntVarD.f42724f = ntVarD;
                ntVarD.f42725g = ntVarD;
                nbVar.f42664a = ntVarD;
            } else {
                ntVar2.f42724f.c(ntVarD);
            }
            j11 -= (long) (ntVarD.f42722d - ntVarD.f42719a);
            ntVar = ntVar.f42725g;
            j10 = 0;
        }
        return this;
    }

    public final long e() {
        long j10 = this.f42665b;
        if (j10 == 0) {
            return 0L;
        }
        nt ntVar = this.f42664a.f42724f;
        int i10 = ntVar.f42722d;
        return (i10 >= 8192 || !ntVar.f42720b) ? j10 : j10 - ((long) (i10 - ntVar.f42719a));
    }

    @Override // com.facetec.sdk.nh
    public final byte f() {
        long j10 = this.f42665b;
        if (j10 == 0) {
            throw new IllegalStateException("size == 0");
        }
        nt ntVar = this.f42664a;
        int i10 = ntVar.f42719a;
        int i11 = ntVar.f42722d;
        int i12 = i10 + 1;
        byte b10 = ntVar.f42721c[i10];
        this.f42665b = j10 - 1;
        if (i12 == i11) {
            this.f42664a = ntVar.c();
            nr.e(ntVar);
        } else {
            ntVar.f42719a = i12;
        }
        return b10;
    }

    @Override // com.facetec.sdk.ni
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final nb m(long j10) {
        boolean z10;
        if (j10 == 0) {
            return h(48);
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return e("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 < 100000000) {
            if (j10 < 10000) {
                if (j10 >= 100) {
                    i10 = j10 < 1000 ? 3 : 4;
                } else if (j10 >= 10) {
                    i10 = 2;
                }
            } else if (j10 < AnimationKt.MillisToNanos) {
                i10 = j10 < 100000 ? 5 : 6;
            } else {
                i10 = j10 < 10000000 ? 7 : 8;
            }
        } else if (j10 < 1000000000000L) {
            if (j10 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                i10 = j10 < 1000000000 ? 9 : 10;
            } else {
                i10 = j10 < 100000000000L ? 11 : 12;
            }
        } else if (j10 < 1000000000000000L) {
            if (j10 < 10000000000000L) {
                i10 = 13;
            } else {
                i10 = j10 < 100000000000000L ? 14 : 15;
            }
        } else if (j10 < 100000000000000000L) {
            i10 = j10 < 10000000000000000L ? 16 : 17;
        } else {
            i10 = j10 < 1000000000000000000L ? 18 : 19;
        }
        if (z10) {
            i10++;
        }
        nt ntVarB = b(i10);
        byte[] bArr = ntVarB.f42721c;
        int i11 = ntVarB.f42722d + i10;
        while (j10 != 0) {
            i11--;
            bArr[i11] = f42662c[(int) (j10 % 10)];
            j10 /= 10;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        ntVarB.f42722d += i10;
        this.f42665b += (long) i10;
        return this;
    }

    @Override // com.facetec.sdk.nh
    public final int h() {
        long j10 = this.f42665b;
        if (j10 < 4) {
            StringBuilder sb2 = new StringBuilder("size < 4: ");
            sb2.append(this.f42665b);
            throw new IllegalStateException(sb2.toString());
        }
        nt ntVar = this.f42664a;
        int i10 = ntVar.f42719a;
        int i11 = ntVar.f42722d;
        if (i11 - i10 < 4) {
            return ((f() & 255) << 24) | ((f() & 255) << 16) | ((f() & 255) << 8) | (f() & 255);
        }
        byte[] bArr = ntVar.f42721c;
        int i12 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24);
        int i13 = i10 + 3;
        int i14 = i12 | ((bArr[i10 + 2] & 255) << 8);
        int i15 = i10 + 4;
        int i16 = (bArr[i13] & 255) | i14;
        this.f42665b = j10 - 4;
        if (i15 == i11) {
            this.f42664a = ntVar.c();
            nr.e(ntVar);
        } else {
            ntVar.f42719a = i15;
        }
        return i16;
    }

    @Override // com.facetec.sdk.nh
    public final int i() {
        return nv.d(h());
    }

    @Override // com.facetec.sdk.nh
    public final short j() {
        long j10 = this.f42665b;
        if (j10 < 2) {
            StringBuilder sb2 = new StringBuilder("size < 2: ");
            sb2.append(this.f42665b);
            throw new IllegalStateException(sb2.toString());
        }
        nt ntVar = this.f42664a;
        int i10 = ntVar.f42719a;
        int i11 = ntVar.f42722d;
        if (i11 - i10 < 2) {
            return (short) (((f() & 255) << 8) | (f() & 255));
        }
        byte[] bArr = ntVar.f42721c;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        this.f42665b = j10 - 2;
        if (i14 == i11) {
            this.f42664a = ntVar.c();
            nr.e(ntVar);
        } else {
            ntVar.f42719a = i14;
        }
        return (short) i15;
    }

    public final String m() {
        try {
            return a(this.f42665b, nv.f42731c);
        } catch (EOFException e5) {
            throw new AssertionError(e5);
        }
    }

    private String a(long j10, Charset charset) throws EOFException {
        nv.a(this.f42665b, 0L, j10);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j10 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j10)));
        }
        if (j10 == 0) {
            return "";
        }
        nt ntVar = this.f42664a;
        int i10 = ntVar.f42719a;
        if (((long) i10) + j10 > ntVar.f42722d) {
            return new String(h(j10), charset);
        }
        String str = new String(ntVar.f42721c, i10, (int) j10, charset);
        int i11 = (int) (((long) ntVar.f42719a) + j10);
        ntVar.f42719a = i11;
        this.f42665b -= j10;
        if (i11 == ntVar.f42722d) {
            this.f42664a = ntVar.c();
            nr.e(ntVar);
        }
        return str;
    }

    @Override // com.facetec.sdk.nh
    public final void b(byte[] bArr) throws Throwable {
        int i10 = 0;
        while (i10 < bArr.length) {
            int iD = d(bArr, i10, bArr.length - i10);
            if (iD == -1) {
                throw new EOFException();
            }
            i10 += iD;
        }
    }

    @Override // com.facetec.sdk.nh
    public final String c(long j10) throws EOFException {
        if (j10 >= 0) {
            long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
            long jE = e((byte) 10, 0L, j11);
            if (jE != -1) {
                return d(jE);
            }
            if (j11 < b() && e(j11 - 1) == 13 && e(j11) == 10) {
                return d(j11);
            }
            nb nbVar = new nb();
            d(nbVar, 0L, Math.min(32L, b()));
            StringBuilder sb2 = new StringBuilder("\\n not found: limit=");
            sb2.append(Math.min(b(), j10));
            sb2.append(" content=");
            sb2.append(nbVar.o().d());
            sb2.append(Typography.ellipsis);
            throw new EOFException(sb2.toString());
        }
        throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j10)));
    }

    @Override // com.facetec.sdk.ni
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final nb f(long j10) {
        if (j10 == 0) {
            return h(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        nt ntVarB = b(iNumberOfTrailingZeros);
        byte[] bArr = ntVarB.f42721c;
        int i10 = ntVarB.f42722d;
        for (int i11 = (i10 + iNumberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = f42662c[(int) (15 & j10)];
            j10 >>>= 4;
        }
        ntVarB.f42722d += iNumberOfTrailingZeros;
        this.f42665b += (long) iNumberOfTrailingZeros;
        return this;
    }

    public final nb b(String str, int i10, int i11) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i10)));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                StringBuilder sbC = androidx.appcompat.widget.o1.c("endIndex > string.length: ", i11, " > ");
                sbC.append(str.length());
                throw new IllegalArgumentException(sbC.toString());
            }
            while (i10 < i11) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 < 128) {
                    nt ntVarB = b(1);
                    byte[] bArr = ntVarB.f42721c;
                    int i12 = ntVarB.f42722d - i10;
                    int iMin = Math.min(i11, 8192 - i12);
                    int i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt2;
                    while (true) {
                        i10 = i13;
                        if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= 128) {
                            break;
                        }
                        i13 = i10 + 1;
                        bArr[i10 + i12] = (byte) cCharAt;
                    }
                    int i14 = ntVarB.f42722d;
                    int i15 = (i12 + i10) - i14;
                    ntVarB.f42722d = i14 + i15;
                    this.f42665b += (long) i15;
                } else {
                    if (cCharAt2 < 2048) {
                        h((cCharAt2 >> 6) | 192);
                        h((cCharAt2 & '?') | 128);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i16 = i10 + 1;
                        char cCharAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i17 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                            h((i17 >> 18) | 240);
                            h(((i17 >> 12) & 63) | 128);
                            h(((i17 >> 6) & 63) | 128);
                            h((i17 & 63) | 128);
                            i10 += 2;
                        } else {
                            h(63);
                            i10 = i16;
                        }
                    } else {
                        h((cCharAt2 >> '\f') | 224);
                        h(((cCharAt2 >> 6) & 63) | 128);
                        h((cCharAt2 & '?') | 128);
                    }
                    i10++;
                }
            }
            return this;
        }
        StringBuilder sb2 = new StringBuilder("endIndex < beginIndex: ");
        sb2.append(i11);
        sb2.append(" < ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final byte e(long j10) {
        int i10;
        nv.a(this.f42665b, j10, 1L);
        long j11 = this.f42665b;
        if (j11 - j10 > j10) {
            nt ntVar = this.f42664a;
            while (true) {
                int i11 = ntVar.f42722d;
                int i12 = ntVar.f42719a;
                long j12 = i11 - i12;
                if (j10 < j12) {
                    return ntVar.f42721c[i12 + ((int) j10)];
                }
                j10 -= j12;
                ntVar = ntVar.f42725g;
            }
        } else {
            long j13 = j10 - j11;
            nt ntVar2 = this.f42664a;
            do {
                ntVar2 = ntVar2.f42724f;
                int i13 = ntVar2.f42722d;
                i10 = ntVar2.f42719a;
                j13 += (long) (i13 - i10);
            } while (j13 < 0);
            return ntVar2.f42721c[i10 + ((int) j13)];
        }
    }

    @Override // com.facetec.sdk.ni
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final nb i(int i10) {
        nt ntVarB = b(4);
        byte[] bArr = ntVarB.f42721c;
        int i11 = ntVarB.f42722d;
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
        ntVarB.f42722d = i11 + 4;
        this.f42665b += 4;
        return this;
    }

    @Override // com.facetec.sdk.ni
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nb j(int i10) {
        nt ntVarB = b(2);
        byte[] bArr = ntVarB.f42721c;
        int i11 = ntVarB.f42722d;
        bArr[i11] = (byte) (i10 >>> 8);
        bArr[i11 + 1] = (byte) i10;
        ntVarB.f42722d = i11 + 2;
        this.f42665b += 2;
        return this;
    }

    public final String d(long j10) throws EOFException {
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (e(j11) == 13) {
                String strO = o(j11);
                j(2L);
                return strO;
            }
        }
        String strO2 = o(j10);
        j(1L);
        return strO2;
    }

    @Override // com.facetec.sdk.nh
    public final String e(Charset charset) {
        try {
            return a(this.f42665b, charset);
        } catch (EOFException e5) {
            throw new AssertionError(e5);
        }
    }

    @Override // com.facetec.sdk.nh
    public final void j(long j10) throws EOFException {
        while (j10 > 0) {
            nt ntVar = this.f42664a;
            if (ntVar != null) {
                int iMin = (int) Math.min(j10, ntVar.f42722d - ntVar.f42719a);
                long j11 = iMin;
                this.f42665b -= j11;
                j10 -= j11;
                nt ntVar2 = this.f42664a;
                int i10 = ntVar2.f42719a + iMin;
                ntVar2.f42719a = i10;
                if (i10 == ntVar2.f42722d) {
                    this.f42664a = ntVar2.c();
                    nr.e(ntVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // com.facetec.sdk.ni
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final nb h(int i10) {
        nt ntVarB = b(1);
        byte[] bArr = ntVarB.f42721c;
        int i11 = ntVarB.f42722d;
        ntVarB.f42722d = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f42665b++;
        return this;
    }

    @Override // com.facetec.sdk.nh
    public final byte[] h(long j10) throws Throwable {
        nv.a(this.f42665b, 0L, j10);
        if (j10 <= 2147483647L) {
            byte[] bArr = new byte[(int) j10];
            b(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j10)));
    }

    @Override // com.facetec.sdk.nz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.facetec.sdk.ni, com.facetec.sdk.ns, java.io.Flushable
    public final void flush() {
    }

    @Override // com.facetec.sdk.ni
    public final /* bridge */ /* synthetic */ ni t() throws IOException {
        return this;
    }

    public final int d(byte[] bArr, int i10, int i11) throws Throwable {
        nv.a(bArr.length, i10, i11);
        nt ntVar = this.f42664a;
        if (ntVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, ntVar.f42722d - ntVar.f42719a);
        try {
            Object[] objArr = {ntVar.f42721c, Integer.valueOf(ntVar.f42719a), bArr, Integer.valueOf(i10), Integer.valueOf(iMin)};
            Object[] objArr2 = new Object[1];
            q("芮䚺ઌ컸銖嘳᨟\ude73ꉛ柽⮡\uefe8돃眣㬓ｸ", Color.red(0) + 50207, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            q("芥ꞇ죔\ued36ᙹ㭒嶍蛣ꬵ", TextUtils.lastIndexOf("", '0', 0, 0) + 9522, objArr3);
            String str = (String) objArr3[0];
            Class<?> cls2 = Integer.TYPE;
            cls.getMethod(str, Object.class, cls2, Object.class, cls2, cls2).invoke(null, objArr);
            int i12 = ntVar.f42719a + iMin;
            ntVar.f42719a = i12;
            this.f42665b -= (long) iMin;
            if (i12 == ntVar.f42722d) {
                this.f42664a = ntVar.c();
                nr.e(ntVar);
            }
            return iMin;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public final long e(byte b10, long j10, long j11) {
        nt ntVar;
        long j12 = 0;
        if (j10 >= 0 && j11 >= j10) {
            long j13 = this.f42665b;
            long j14 = j11 > j13 ? j13 : j11;
            if (j10 == j14 || (ntVar = this.f42664a) == null) {
                return -1L;
            }
            if (j13 - j10 < j10) {
                while (j13 > j10) {
                    ntVar = ntVar.f42724f;
                    j13 -= (long) (ntVar.f42722d - ntVar.f42719a);
                }
            } else {
                while (true) {
                    long j15 = ((long) (ntVar.f42722d - ntVar.f42719a)) + j12;
                    if (j15 >= j10) {
                        break;
                    }
                    ntVar = ntVar.f42725g;
                    j12 = j15;
                }
                j13 = j12;
            }
            long j16 = j10;
            while (j13 < j14) {
                byte[] bArr = ntVar.f42721c;
                int iMin = (int) Math.min(ntVar.f42722d, (((long) ntVar.f42719a) + j14) - j13);
                for (int i10 = (int) ((((long) ntVar.f42719a) + j16) - j13); i10 < iMin; i10++) {
                    if (bArr[i10] == b10) {
                        return ((long) (i10 - ntVar.f42719a)) + j13;
                    }
                }
                j13 += (long) (ntVar.f42722d - ntVar.f42719a);
                ntVar = ntVar.f42725g;
                j16 = j13;
            }
            return -1L;
        }
        throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f42665b), Long.valueOf(j10), Long.valueOf(j11)));
    }

    @Override // com.facetec.sdk.nz
    public final ny a() {
        return ny.f42733d;
    }

    @Override // com.facetec.sdk.ns
    public final void c(nb nbVar, long j10) throws Throwable {
        nt ntVarA;
        if (nbVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (nbVar != this) {
            nv.a(nbVar.f42665b, 0L, j10);
            long j11 = j10;
            while (j11 > 0) {
                nt ntVar = nbVar.f42664a;
                int i10 = ntVar.f42722d;
                int i11 = ntVar.f42719a;
                if (j11 < i10 - i11) {
                    nt ntVar2 = this.f42664a;
                    nt ntVar3 = ntVar2 != null ? ntVar2.f42724f : null;
                    if (ntVar3 != null && ntVar3.f42720b) {
                        if ((((long) ntVar3.f42722d) + j11) - ((long) (ntVar3.f42723e ? 0 : ntVar3.f42719a)) <= SvgConstantsKt.SPECIFIED_FONT_FAMILY) {
                            ntVar.d(ntVar3, (int) j11);
                            nbVar.f42665b -= j11;
                            this.f42665b += j11;
                            return;
                        }
                    }
                    int i12 = (int) j11;
                    if (i12 > 0 && i12 <= i10 - i11) {
                        if (i12 >= 1024) {
                            ntVarA = ntVar.d();
                        } else {
                            ntVarA = nr.a();
                            try {
                                Object[] objArr = {ntVar.f42721c, Integer.valueOf(ntVar.f42719a), ntVarA.f42721c, 0, Integer.valueOf(i12)};
                                Object[] objArr2 = new Object[1];
                                q("芮䚺ઌ컸銖嘳᨟\ude73ꉛ柽⮡\uefe8돃眣㬓ｸ", 50206 - TextUtils.indexOf((CharSequence) "", '0'), objArr2);
                                Class<?> cls = Class.forName((String) objArr2[0]);
                                Object[] objArr3 = new Object[1];
                                q("芥ꞇ죔\ued36ᙹ㭒嶍蛣ꬵ", (KeyEvent.getMaxKeyCode() >> 16) + 9521, objArr3);
                                String str = (String) objArr3[0];
                                Class<?> cls2 = Integer.TYPE;
                                cls.getMethod(str, Object.class, cls2, Object.class, cls2, cls2).invoke(null, objArr);
                            } catch (Throwable th2) {
                                Throwable cause = th2.getCause();
                                if (cause == null) {
                                    throw th2;
                                }
                                throw cause;
                            }
                        }
                        ntVarA.f42722d = ntVarA.f42719a + i12;
                        ntVar.f42719a += i12;
                        ntVar.f42724f.c(ntVarA);
                        nbVar.f42664a = ntVarA;
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                nt ntVar4 = nbVar.f42664a;
                long j12 = ntVar4.f42722d - ntVar4.f42719a;
                nbVar.f42664a = ntVar4.c();
                nt ntVar5 = this.f42664a;
                if (ntVar5 == null) {
                    this.f42664a = ntVar4;
                    ntVar4.f42724f = ntVar4;
                    ntVar4.f42725g = ntVar4;
                } else {
                    nt ntVarC = ntVar5.f42724f.c(ntVar4);
                    nt ntVar6 = ntVarC.f42724f;
                    if (ntVar6 != ntVarC) {
                        if (ntVar6.f42720b) {
                            int i13 = ntVarC.f42722d - ntVarC.f42719a;
                            if (i13 <= (8192 - ntVar6.f42722d) + (ntVar6.f42723e ? 0 : ntVar6.f42719a)) {
                                ntVarC.d(ntVar6, i13);
                                ntVarC.c();
                                nr.e(ntVarC);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                nbVar.f42665b -= j12;
                this.f42665b += j12;
                j11 -= j12;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public final nb d(nj njVar) {
        if (njVar != null) {
            njVar.d(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // com.facetec.sdk.ni
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final nb e(String str) {
        return b(str, 0, str.length());
    }

    public final nb d(int i10) {
        if (i10 < 128) {
            h(i10);
        } else if (i10 < 2048) {
            h((i10 >> 6) | 192);
            h((i10 & 63) | 128);
        } else if (i10 < 65536) {
            if (i10 >= 55296 && i10 <= 57343) {
                h(63);
            } else {
                h((i10 >> 12) | 224);
                h(((i10 >> 6) & 63) | 128);
                h((i10 & 63) | 128);
            }
        } else if (i10 <= 1114111) {
            h((i10 >> 18) | 240);
            h(((i10 >> 12) & 63) | 128);
            h(((i10 >> 6) & 63) | 128);
            h((i10 & 63) | 128);
        } else {
            StringBuilder sb2 = new StringBuilder("Unexpected code point: ");
            sb2.append(Integer.toHexString(i10));
            throw new IllegalArgumentException(sb2.toString());
        }
        return this;
    }

    @Override // com.facetec.sdk.ni
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final nb a(byte[] bArr) {
        if (bArr != null) {
            return c(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    public final long d(nz nzVar) throws IOException {
        if (nzVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j10 = 0;
        while (true) {
            long jD = nzVar.d(this, SvgConstantsKt.SPECIFIED_FONT_FAMILY);
            if (jD == -1) {
                return j10;
            }
            j10 += jD;
        }
    }

    @Override // com.facetec.sdk.nz
    public final long d(nb nbVar, long j10) throws Throwable {
        if (nbVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j10 >= 0) {
            long j11 = this.f42665b;
            if (j11 == 0) {
                return -1L;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            nbVar.c(this, j10);
            return j10;
        }
        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j10)));
    }

    @Override // com.facetec.sdk.ni
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final nb c(byte[] bArr, int i10, int i11) throws Throwable {
        int i12 = i10;
        if (bArr != null) {
            long j10 = i11;
            nv.a(bArr.length, i12, j10);
            int i13 = i11 + i12;
            while (i12 < i13) {
                nt ntVarB = b(1);
                int iMin = Math.min(i13 - i12, 8192 - ntVarB.f42722d);
                try {
                    Object[] objArr = {bArr, Integer.valueOf(i12), ntVarB.f42721c, Integer.valueOf(ntVarB.f42722d), Integer.valueOf(iMin)};
                    Object[] objArr2 = new Object[1];
                    q("芮䚺ઌ컸銖嘳᨟\ude73ꉛ柽⮡\uefe8돃眣㬓ｸ", View.combineMeasuredStates(0, 0) + 50207, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    Object[] objArr3 = new Object[1];
                    q("芥ꞇ죔\ued36ᙹ㭒嶍蛣ꬵ", Gravity.getAbsoluteGravity(0, 0) + 9521, objArr3);
                    String str = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    cls.getMethod(str, Object.class, cls2, Object.class, cls2, cls2).invoke(null, objArr);
                    i12 += iMin;
                    ntVarB.f42722d += iMin;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            this.f42665b += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.facetec.sdk.nh
    public final boolean c(nj njVar) {
        return b(njVar, njVar.g());
    }

    public final nt b(int i10) {
        if (i10 > 0 && i10 <= 8192) {
            nt ntVar = this.f42664a;
            if (ntVar == null) {
                nt ntVarA = nr.a();
                this.f42664a = ntVarA;
                ntVarA.f42724f = ntVarA;
                ntVarA.f42725g = ntVarA;
                return ntVarA;
            }
            nt ntVar2 = ntVar.f42724f;
            return (ntVar2.f42722d + i10 > 8192 || !ntVar2.f42720b) ? ntVar2.c(nr.a()) : ntVar2;
        }
        throw new IllegalArgumentException();
    }

    private boolean b(nj njVar, int i10) {
        if (i10 < 0 || this.f42665b < i10 || njVar.g() < i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (e(i11) != njVar.c(i11)) {
                return false;
            }
        }
        return true;
    }
}
