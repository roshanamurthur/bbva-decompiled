package org.bouncycastle.pqc.math.linearalgebra;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.c;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.math.BigInteger;
import java.security.SecureRandom;
import kotlin.time.DurationKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class GF2nONBElement extends GF2nElement {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f91591d = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, SvgConstantsKt.SPECIFIED_OPACITY, SvgConstantsKt.SPECIFIED_COLOR, SvgConstantsKt.SPECIFIED_FONT_FAMILY, 16384, SvgConstantsKt.SPECIFIED_FONT_WEIGHT, SvgConstantsKt.SPECIFIED_FONT_STYLE, SvgConstantsKt.SPECIFIED_TEXT_DECORATION, SvgConstantsKt.SPECIFIED_TEXT_ANCHOR, SvgConstantsKt.SPECIFIED_OVERFLOW, 1048576, SvgConstantsKt.SPECIFIED_MARKER_START, SvgConstantsKt.SPECIFIED_MARKER_MID, SvgConstantsKt.SPECIFIED_MARKER_END, SvgConstantsKt.SPECIFIED_DISPLAY, SvgConstantsKt.SPECIFIED_VISIBILITY, SvgConstantsKt.SPECIFIED_STOP_COLOR, SvgConstantsKt.SPECIFIED_STOP_OPACITY, SvgConstantsKt.SPECIFIED_CLIP_PATH, SvgConstantsKt.SPECIFIED_CLIP_RULE, SvgConstantsKt.SPECIFIED_MASK, SvgConstantsKt.SPECIFIED_SOLID_COLOR, SvgConstantsKt.SPECIFIED_SOLID_OPACITY, SvgConstantsKt.SPECIFIED_VIEWPORT_FILL, SvgConstantsKt.SPECIFIED_VIEWPORT_FILL_OPACITY, SvgConstantsKt.SPECIFIED_VECTOR_EFFECT, SvgConstantsKt.SPECIFIED_DIRECTION, SvgConstantsKt.SPECIFIED_IMAGE_RENDERING, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L, LockFreeTaskQueueCore.FROZEN_MASK, LockFreeTaskQueueCore.CLOSED_MASK, 4611686018427387904L, Long.MIN_VALUE};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f91592e = {1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, WebSocketProtocol.PAYLOAD_SHORT_MAX, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, LockFreeTaskQueueCore.HEAD_MASK, 2147483647L, 4294967295L, 8589934591L, 17179869183L, 34359738367L, 68719476735L, 137438953471L, 274877906943L, 549755813887L, 1099511627775L, 2199023255551L, 4398046511103L, 8796093022207L, 17592186044415L, 35184372088831L, 70368744177663L, 140737488355327L, 281474976710655L, 562949953421311L, 1125899906842623L, 2251799813685247L, 4503599627370495L, 9007199254740991L, 18014398509481983L, 36028797018963967L, 72057594037927935L, 144115188075855871L, 288230376151711743L, 576460752303423487L, 1152921504606846975L, 2305843009213693951L, DurationKt.MAX_MILLIS, Long.MAX_VALUE, -1};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f91593f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f91596c;

    public GF2nONBElement(GF2nONBElement gF2nONBElement) {
        GF2nField gF2nField = gF2nONBElement.mField;
        this.mField = gF2nField;
        this.mDegree = gF2nField.getDegree();
        GF2nONBField gF2nONBField = (GF2nONBField) this.mField;
        int i10 = gF2nONBField.f91597a;
        this.f91594a = i10;
        this.f91595b = gF2nONBField.f91598b;
        this.f91596c = new long[i10];
        long[] jArr = gF2nONBElement.f91596c;
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        System.arraycopy(jArr2, 0, this.f91596c, 0, this.f91594a);
    }

    public static GF2nONBElement ONE(GF2nONBField gF2nONBField) {
        int i10 = gF2nONBField.f91597a;
        long[] jArr = new long[i10];
        int i11 = 0;
        while (true) {
            int i12 = i10 - 1;
            if (i11 >= i12) {
                jArr[i12] = f91592e[gF2nONBField.f91598b - 1];
                return new GF2nONBElement(gF2nONBField, jArr);
            }
            jArr[i11] = -1;
            i11++;
        }
    }

    public static GF2nONBElement ZERO(GF2nONBField gF2nONBField) {
        return new GF2nONBElement(gF2nONBField, new long[gF2nONBField.f91597a]);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public final void a() {
        this.f91596c = new long[this.f91594a];
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public GFElement add(GFElement gFElement) throws RuntimeException {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.addToThis(gFElement);
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public void addToThis(GFElement gFElement) throws RuntimeException {
        if (!(gFElement instanceof GF2nONBElement)) {
            throw new RuntimeException();
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) gFElement;
        if (!this.mField.equals(gF2nONBElement.mField)) {
            throw new RuntimeException();
        }
        for (int i10 = 0; i10 < this.f91594a; i10++) {
            long[] jArr = this.f91596c;
            jArr[i10] = jArr[i10] ^ gF2nONBElement.f91596c[i10];
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public final boolean b(int i10) {
        return i10 >= 0 && i10 <= this.mDegree && (this.f91596c[i10 >>> 6] & f91591d[i10 & 63]) != 0;
    }

    public final void c(byte[] bArr) {
        this.f91596c = new long[this.f91594a];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            long[] jArr = this.f91596c;
            int i11 = i10 >>> 3;
            jArr[i11] = jArr[i11] | ((((long) bArr[(bArr.length - 1) - i10]) & 255) << ((i10 & 7) << 3));
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement, org.bouncycastle.pqc.math.linearalgebra.GFElement
    public Object clone() {
        return new GF2nONBElement(this);
    }

    public final void d() {
        long[] jArr = new long[this.f91596c.length];
        int i10 = 0;
        while (true) {
            int i11 = this.mDegree;
            if (i10 >= i11) {
                this.f91596c = jArr;
                return;
            }
            if (b((i11 - i10) - 1)) {
                int i12 = i10 >>> 6;
                jArr[i12] = jArr[i12] | f91591d[i10 & 63];
            }
            i10++;
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2nONBElement)) {
            return false;
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) obj;
        for (int i10 = 0; i10 < this.f91594a; i10++) {
            if (this.f91596c[i10] != gF2nONBElement.f91596c[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public int hashCode() {
        return Arrays.hashCode(this.f91596c);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement increase() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.increaseThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void increaseThis() {
        addToThis(ONE((GF2nONBField) this.mField));
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public GFElement invert() throws ArithmeticException {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.invertThis();
        return gF2nONBElement;
    }

    public void invertThis() throws ArithmeticException {
        long[] jArr;
        if (isZero()) {
            throw new ArithmeticException();
        }
        int i10 = 31;
        boolean z10 = false;
        while (true) {
            jArr = f91591d;
            if (z10 || i10 < 0) {
                break;
            }
            if ((((long) (this.mDegree - 1)) & jArr[i10]) != 0) {
                z10 = true;
            }
            i10--;
        }
        ZERO((GF2nONBField) this.mField);
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        int i11 = 1;
        while (i10 >= 0) {
            GF2nElement gF2nElement = (GF2nElement) gF2nONBElement.clone();
            for (int i12 = 1; i12 <= i11; i12++) {
                gF2nElement.squareThis();
            }
            gF2nONBElement.multiplyThisBy(gF2nElement);
            i11 <<= 1;
            if ((((long) (this.mDegree - 1)) & jArr[i10]) != 0) {
                gF2nONBElement.squareThis();
                gF2nONBElement.multiplyThisBy(this);
                i11++;
            }
            i10--;
        }
        gF2nONBElement.squareThis();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public boolean isOne() {
        int i10;
        boolean z10;
        boolean z11 = true;
        int i11 = 0;
        while (true) {
            i10 = this.f91594a;
            if (i11 >= i10 - 1 || !z11) {
                break;
            }
            z11 = z11 && this.f91596c[i11] == -1;
            i11++;
        }
        if (!z11) {
            return z11;
        }
        if (z11) {
            long j10 = this.f91596c[i10 - 1];
            long[] jArr = f91592e;
            int i12 = this.f91595b;
            z10 = (j10 & jArr[i12 + (-1)]) == jArr[i12 - 1];
        }
        return z10;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public boolean isZero() {
        boolean z10 = true;
        for (int i10 = 0; i10 < this.f91594a && z10; i10++) {
            z10 = z10 && this.f91596c[i10] == 0;
        }
        return z10;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public GFElement multiply(GFElement gFElement) throws RuntimeException {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.multiplyThisBy(gFElement);
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public void multiplyThisBy(GFElement gFElement) throws RuntimeException {
        int[] iArr;
        int i10;
        if (!(gFElement instanceof GF2nONBElement)) {
            throw new RuntimeException("The elements have different representation: not yet implemented");
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) gFElement;
        if (!this.mField.equals(gF2nONBElement.mField)) {
            throw new RuntimeException();
        }
        if (equals(gFElement)) {
            squareThis();
            return;
        }
        long[] jArr = this.f91596c;
        long[] jArr2 = gF2nONBElement.f91596c;
        int i11 = this.f91594a;
        long[] jArr3 = new long[i11];
        int[][] iArr2 = ((GF2nONBField) this.mField).f91600d;
        int i12 = i11 - 1;
        int i13 = this.f91595b - 1;
        long[] jArr4 = f91591d;
        long j10 = jArr4[63];
        long j11 = jArr4[i13];
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.mDegree) {
            int i16 = i14;
            int i17 = i16;
            while (true) {
                int i18 = this.mDegree;
                iArr = f91593f;
                if (i16 >= i18) {
                    break;
                }
                int i19 = iArr[i16];
                int[] iArr3 = iArr2[i16];
                int i20 = iArr3[i14];
                int i21 = iArr[i20];
                int i22 = i20 & 63;
                if ((jArr[i19] & jArr4[i16 & 63]) != 0) {
                    if ((jArr2[i21] & jArr4[i22]) != 0) {
                        i17 ^= 1;
                    }
                    int i23 = iArr3[1];
                    if (i23 != -1) {
                        if ((jArr2[iArr[i23]] & jArr4[i23 & 63]) != 0) {
                            i17 ^= 1;
                        }
                    }
                }
                i16++;
                i14 = 0;
            }
            int i24 = iArr[i15];
            int i25 = i15 & 63;
            if (i17 != 0) {
                jArr3[i24] = jArr3[i24] ^ jArr4[i25];
            }
            if (i11 > 1) {
                boolean z10 = (jArr[i12] & 1) == 1;
                int i26 = i11 - 2;
                int i27 = i26;
                while (i27 >= 0) {
                    long j12 = jArr[i27];
                    boolean z11 = (j12 & 1) != 0;
                    long j13 = j12 >>> 1;
                    jArr[i27] = j13;
                    if (z10) {
                        jArr[i27] = j13 ^ j10;
                    }
                    i27--;
                    z10 = z11;
                }
                long j14 = jArr[i12] >>> 1;
                jArr[i12] = j14;
                if (z10) {
                    jArr[i12] = j14 ^ j11;
                }
                boolean z12 = (jArr2[i12] & 1) == 1;
                while (i26 >= 0) {
                    long j15 = jArr2[i26];
                    boolean z13 = (j15 & 1) != 0;
                    long j16 = j15 >>> 1;
                    jArr2[i26] = j16;
                    if (z12) {
                        jArr2[i26] = j16 ^ j10;
                    }
                    i26--;
                    z12 = z13;
                }
                long j17 = jArr2[i12] >>> 1;
                jArr2[i12] = j17;
                if (z12) {
                    jArr2[i12] = j17 ^ j11;
                }
                i10 = 0;
            } else {
                i10 = 0;
                long j18 = jArr[0];
                boolean z14 = (j18 & 1) == 1;
                long j19 = j18 >>> 1;
                jArr[0] = j19;
                if (z14) {
                    jArr[0] = j19 ^ j11;
                }
                long j20 = jArr2[0];
                boolean z15 = (j20 & 1) == 1;
                long j21 = j20 >>> 1;
                jArr2[0] = j21;
                if (z15) {
                    jArr2[0] = j21 ^ j11;
                }
            }
            i15++;
            i14 = i10;
        }
        int i28 = i14;
        System.arraycopy(jArr3, i28, this.f91596c, i28, this.f91594a);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement solveQuadraticEquation() throws RuntimeException {
        int i10 = 1;
        if (trace() == 1) {
            throw new RuntimeException();
        }
        long[] jArr = f91591d;
        long j10 = jArr[63];
        int i11 = this.f91594a;
        long[] jArr2 = new long[i11];
        int i12 = 0;
        long j11 = 0;
        while (i12 < i11 - 1) {
            for (int i13 = i10; i13 < 64; i13++) {
                long j12 = jArr[i13];
                long j13 = this.f91596c[i12];
                if (((j12 & j13) == 0 || (j11 & jArr[i13 - 1]) == 0) && ((j13 & j12) != 0 || (j11 & jArr[i13 - 1]) != 0)) {
                    j11 ^= j12;
                }
            }
            jArr2[i12] = j11;
            long j14 = j11 & j10;
            j11 = 1;
            if ((j14 != 0 && (1 & this.f91596c[i12 + 1]) == 1) || (j14 == 0 && (this.f91596c[i12 + 1] & 1) == 0)) {
                j11 = 0;
            }
            i12++;
            i10 = 1;
        }
        int i14 = this.mDegree & 63;
        long j15 = this.f91596c[i11 - 1];
        for (int i15 = 1; i15 < i14; i15++) {
            long j16 = jArr[i15];
            if (((j16 & j15) == 0 || (jArr[i15 - 1] & j11) == 0) && ((j16 & j15) != 0 || (jArr[i15 - 1] & j11) != 0)) {
                j11 ^= j16;
            }
        }
        jArr2[i11 - 1] = j11;
        return new GF2nONBElement((GF2nONBField) this.mField, jArr2);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement square() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement squareRoot() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareRootThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void squareRootThis() {
        long[] jArr = this.f91596c;
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        int i10 = this.f91594a - 1;
        int i11 = this.f91595b - 1;
        long[] jArr3 = f91591d;
        long j10 = jArr3[63];
        boolean z10 = (jArr2[0] & 1) != 0;
        int i12 = i10;
        while (i12 >= 0) {
            long j11 = jArr2[i12];
            boolean z11 = (j11 & 1) != 0;
            long j12 = j11 >>> 1;
            jArr2[i12] = j12;
            if (z10) {
                if (i12 == i10) {
                    jArr2[i12] = j12 ^ jArr3[i11];
                } else {
                    jArr2[i12] = j12 ^ j10;
                }
            }
            i12--;
            z10 = z11;
        }
        System.arraycopy(jArr2, 0, this.f91596c, 0, this.f91594a);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void squareThis() {
        long[] jArr = this.f91596c;
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        int i10 = this.f91594a - 1;
        int i11 = this.f91595b;
        int i12 = i11 - 1;
        long[] jArr3 = f91591d;
        long j10 = jArr3[63];
        boolean z10 = (jArr2[i10] & jArr3[i12]) != 0;
        int i13 = 0;
        while (i13 < i10) {
            long j11 = jArr2[i13];
            boolean z11 = (j11 & j10) != 0;
            long j12 = j11 << 1;
            jArr2[i13] = j12;
            if (z10) {
                jArr2[i13] = j12 ^ 1;
            }
            i13++;
            z10 = z11;
        }
        long j13 = jArr2[i10];
        boolean z12 = (j13 & jArr3[i12]) != 0;
        long j14 = j13 << 1;
        jArr2[i10] = j14;
        if (z10) {
            jArr2[i10] = j14 ^ 1;
        }
        if (z12) {
            jArr2[i10] = jArr3[i11] ^ jArr2[i10];
        }
        System.arraycopy(jArr2, 0, this.f91596c, 0, this.f91594a);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public boolean testRightmostBit() {
        return (this.f91596c[this.f91594a - 1] & f91591d[this.f91595b - 1]) != 0;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public byte[] toByteArray() {
        int i10 = ((this.mDegree - 1) >> 3) + 1;
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = (i11 & 7) << 3;
            bArr[(i10 - i11) - 1] = (byte) ((this.f91596c[i11 >>> 3] & (255 << i12)) >>> i12);
        }
        return bArr;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public BigInteger toFlexiBigInt() {
        return new BigInteger(1, toByteArray());
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public String toString() {
        return toString(16);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public int trace() {
        long[] jArr;
        int i10 = this.f91594a - 1;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            jArr = f91591d;
            if (i11 >= i10) {
                break;
            }
            for (int i13 = 0; i13 < 64; i13++) {
                if ((this.f91596c[i11] & jArr[i13]) != 0) {
                    i12 ^= 1;
                }
            }
            i11++;
        }
        for (int i14 = 0; i14 < this.f91595b; i14++) {
            if ((this.f91596c[i10] & jArr[i14]) != 0) {
                i12 ^= 1;
            }
        }
        return i12;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public String toString(int i10) {
        long[] jArr = this.f91596c;
        int length = jArr.length;
        long[] jArr2 = new long[length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        String strF = "";
        if (i10 == 2) {
            int i11 = this.f91595b;
            while (true) {
                i11--;
                if (i11 < 0) {
                    break;
                }
                strF = (jArr2[length + (-1)] & (1 << i11)) == 0 ? u.f(strF, "0") : u.f(strF, "1");
            }
            for (int i12 = length - 2; i12 >= 0; i12--) {
                for (int i13 = 63; i13 >= 0; i13--) {
                    strF = (jArr2[i12] & f91591d[i13]) == 0 ? u.f(strF, "0") : u.f(strF, "1");
                }
            }
        } else if (i10 == 16) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            for (int i14 = length - 1; i14 >= 0; i14--) {
                StringBuilder sbD = c.d(strF);
                sbD.append(cArr[((int) (jArr2[i14] >>> 60)) & 15]);
                StringBuilder sbD2 = c.d(sbD.toString());
                sbD2.append(cArr[((int) (jArr2[i14] >>> 56)) & 15]);
                StringBuilder sbD3 = c.d(sbD2.toString());
                sbD3.append(cArr[((int) (jArr2[i14] >>> 52)) & 15]);
                StringBuilder sbD4 = c.d(sbD3.toString());
                sbD4.append(cArr[((int) (jArr2[i14] >>> 48)) & 15]);
                StringBuilder sbD5 = c.d(sbD4.toString());
                sbD5.append(cArr[((int) (jArr2[i14] >>> 44)) & 15]);
                StringBuilder sbD6 = c.d(sbD5.toString());
                sbD6.append(cArr[((int) (jArr2[i14] >>> 40)) & 15]);
                StringBuilder sbD7 = c.d(sbD6.toString());
                sbD7.append(cArr[((int) (jArr2[i14] >>> 36)) & 15]);
                StringBuilder sbD8 = c.d(sbD7.toString());
                sbD8.append(cArr[((int) (jArr2[i14] >>> 32)) & 15]);
                StringBuilder sbD9 = c.d(sbD8.toString());
                sbD9.append(cArr[((int) (jArr2[i14] >>> 28)) & 15]);
                StringBuilder sbD10 = c.d(sbD9.toString());
                sbD10.append(cArr[((int) (jArr2[i14] >>> 24)) & 15]);
                StringBuilder sbD11 = c.d(sbD10.toString());
                sbD11.append(cArr[((int) (jArr2[i14] >>> 20)) & 15]);
                StringBuilder sbD12 = c.d(sbD11.toString());
                sbD12.append(cArr[((int) (jArr2[i14] >>> 16)) & 15]);
                StringBuilder sbD13 = c.d(sbD12.toString());
                sbD13.append(cArr[((int) (jArr2[i14] >>> 12)) & 15]);
                StringBuilder sbD14 = c.d(sbD13.toString());
                sbD14.append(cArr[((int) (jArr2[i14] >>> 8)) & 15]);
                StringBuilder sbD15 = c.d(sbD14.toString());
                sbD15.append(cArr[((int) (jArr2[i14] >>> 4)) & 15]);
                StringBuilder sbD16 = c.d(sbD15.toString());
                sbD16.append(cArr[((int) jArr2[i14]) & 15]);
                strF = u.f(sbD16.toString(), " ");
            }
        }
        return strF;
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, BigInteger bigInteger) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        int i10 = gF2nONBField.f91597a;
        this.f91594a = i10;
        this.f91595b = gF2nONBField.f91598b;
        this.f91596c = new long[i10];
        c(bigInteger.toByteArray());
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, SecureRandom secureRandom) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        int i10 = gF2nONBField.f91597a;
        this.f91594a = i10;
        int i11 = gF2nONBField.f91598b;
        this.f91595b = i11;
        long[] jArr = new long[i10];
        this.f91596c = jArr;
        if (i10 <= 1) {
            jArr[0] = secureRandom.nextLong();
            long[] jArr2 = this.f91596c;
            jArr2[0] = jArr2[0] >>> (64 - i11);
        } else {
            for (int i12 = 0; i12 < this.f91594a - 1; i12++) {
                this.f91596c[i12] = secureRandom.nextLong();
            }
            this.f91596c[this.f91594a - 1] = secureRandom.nextLong() >>> (64 - this.f91595b);
        }
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, byte[] bArr) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        int i10 = gF2nONBField.f91597a;
        this.f91594a = i10;
        this.f91595b = gF2nONBField.f91598b;
        this.f91596c = new long[i10];
        c(bArr);
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, long[] jArr) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.f91594a = gF2nONBField.f91597a;
        this.f91595b = gF2nONBField.f91598b;
        this.f91596c = jArr;
    }
}
