package com.fasterxml.jackson.core.sym;

import androidx.camera.camera2.internal.n1;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class ByteQuadsCanonicalizer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteQuadsCanonicalizer f43091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<a> f43092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f43094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f43095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f43096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f43097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f43098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f43099i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f43100j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f43101k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String[] f43102l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f43103n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient boolean f43104o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f43105p;

    public ByteQuadsCanonicalizer(int i10) {
        this.f43091a = null;
        this.f43093c = i10;
        this.f43094d = true;
        this.f43095e = true;
        this.f43092b = new AtomicReference<>(new a(64, 4, new int[512], new String[128], 448, 512));
    }

    public static ByteQuadsCanonicalizer createRoot() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    public void _reportTooManyCollisions() {
        if (this.f43097g <= 1024) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Spill-over slots in symbol table with ");
        sb2.append(this.f43101k);
        sb2.append(" entries, hash area of ");
        sb2.append(this.f43097g);
        sb2.append(" slots is now full (all ");
        throw new IllegalStateException(androidx.appcompat.widget.a.c(sb2, this.f43097g >> 3, " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`"));
    }

    public final int a(int i10) {
        return (i10 & (this.f43097g - 1)) << 2;
    }

    public String addName(String str, int i10) {
        f();
        if (this.f43094d) {
            str = InternCache.instance.intern(str);
        }
        int iB = b(calcHash(i10));
        int[] iArr = this.f43096f;
        iArr[iB] = i10;
        iArr[iB + 3] = 1;
        this.f43102l[iB >> 2] = str;
        this.f43101k++;
        e();
        return str;
    }

    public final int b(int i10) {
        int iA = a(i10);
        int[] iArr = this.f43096f;
        if (iArr[iA + 3] == 0) {
            return iA;
        }
        int i11 = this.f43098h + ((iA >> 3) << 2);
        if (iArr[i11 + 3] == 0) {
            return i11;
        }
        int i12 = this.f43099i;
        int i13 = this.f43100j;
        int i14 = i12 + ((iA >> (i13 + 2)) << i13);
        int i15 = (1 << i13) + i14;
        while (i14 < i15) {
            if (iArr[i14 + 3] == 0) {
                return i14;
            }
            i14 += 4;
        }
        int i16 = this.m;
        int i17 = i16 + 4;
        this.m = i17;
        if (i17 >= (this.f43097g << 3)) {
            if (this.f43095e) {
                _reportTooManyCollisions();
            }
            this.f43104o = true;
        }
        return i16;
    }

    public int bucketCount() {
        return this.f43097g;
    }

    public final int c() {
        int i10 = this.f43097g;
        return (i10 << 3) - i10;
    }

    public int calcHash(int i10) {
        int i11 = i10 ^ this.f43093c;
        int i12 = i11 + (i11 >>> 16);
        int i13 = i12 ^ (i12 << 3);
        return i13 + (i13 >>> 12);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0033 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    public final boolean d(int i10, int i11, int[] iArr) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int[] iArr2 = this.f43096f;
        switch (i10) {
            case 4:
                i12 = 0;
                i16 = i12 + 1;
                i17 = i11 + 1;
                if (iArr[i12] != iArr2[i11]) {
                    return false;
                }
                i18 = i12 + 2;
                i19 = i11 + 2;
                if (iArr[i16] != iArr2[i17]) {
                    return false;
                }
                return iArr[i18] != iArr2[i19] && iArr[i12 + 3] == iArr2[i11 + 3];
            case 5:
                i13 = 0;
                i12 = i13 + 1;
                i20 = i11 + 1;
                if (iArr[i13] != iArr2[i11]) {
                    return false;
                }
                i11 = i20;
                i16 = i12 + 1;
                i17 = i11 + 1;
                if (iArr[i12] != iArr2[i11]) {
                    return false;
                }
                i18 = i12 + 2;
                i19 = i11 + 2;
                if (iArr[i16] != iArr2[i17]) {
                    return false;
                }
                if (iArr[i18] != iArr2[i19]) {
                    return false;
                }
            case 6:
                i14 = 0;
                i13 = i14 + 1;
                i21 = i11 + 1;
                if (iArr[i14] != iArr2[i11]) {
                    return false;
                }
                i11 = i21;
                i12 = i13 + 1;
                i20 = i11 + 1;
                if (iArr[i13] != iArr2[i11]) {
                    return false;
                }
                i11 = i20;
                i16 = i12 + 1;
                i17 = i11 + 1;
                if (iArr[i12] != iArr2[i11]) {
                    return false;
                }
                i18 = i12 + 2;
                i19 = i11 + 2;
                if (iArr[i16] != iArr2[i17]) {
                    return false;
                }
                if (iArr[i18] != iArr2[i19]) {
                    return false;
                }
            case 7:
                i15 = 0;
                i14 = i15 + 1;
                i22 = i11 + 1;
                if (iArr[i15] != iArr2[i11]) {
                    return false;
                }
                i11 = i22;
                i13 = i14 + 1;
                i21 = i11 + 1;
                if (iArr[i14] != iArr2[i11]) {
                    return false;
                }
                i11 = i21;
                i12 = i13 + 1;
                i20 = i11 + 1;
                if (iArr[i13] != iArr2[i11]) {
                    return false;
                }
                i11 = i20;
                i16 = i12 + 1;
                i17 = i11 + 1;
                if (iArr[i12] != iArr2[i11]) {
                    return false;
                }
                i18 = i12 + 2;
                i19 = i11 + 2;
                if (iArr[i16] != iArr2[i17]) {
                    return false;
                }
                if (iArr[i18] != iArr2[i19]) {
                    return false;
                }
            case 8:
                int i23 = i11 + 1;
                if (iArr[0] != iArr2[i11]) {
                    return false;
                }
                i15 = 1;
                i11 = i23;
                i14 = i15 + 1;
                i22 = i11 + 1;
                if (iArr[i15] != iArr2[i11]) {
                    return false;
                }
                i11 = i22;
                i13 = i14 + 1;
                i21 = i11 + 1;
                if (iArr[i14] != iArr2[i11]) {
                    return false;
                }
                i11 = i21;
                i12 = i13 + 1;
                i20 = i11 + 1;
                if (iArr[i13] != iArr2[i11]) {
                    return false;
                }
                i11 = i20;
                i16 = i12 + 1;
                i17 = i11 + 1;
                if (iArr[i12] != iArr2[i11]) {
                    return false;
                }
                i18 = i12 + 2;
                i19 = i11 + 2;
                if (iArr[i16] != iArr2[i17]) {
                    return false;
                }
                if (iArr[i18] != iArr2[i19]) {
                    return false;
                }
            default:
                int i24 = 0;
                while (true) {
                    int i25 = i24 + 1;
                    int i26 = i11 + 1;
                    if (iArr[i24] != this.f43096f[i11]) {
                        return false;
                    }
                    if (i25 >= i10) {
                        return true;
                    }
                    i24 = i25;
                    i11 = i26;
                }
                break;
        }
    }

    public final void e() {
        if (this.f43101k > (this.f43097g >> 1)) {
            int iC = (this.m - c()) >> 2;
            int i10 = this.f43101k;
            if (iC > ((i10 + 1) >> 7) || i10 > ((double) this.f43097g) * 0.8d) {
                this.f43104o = true;
            }
        }
    }

    public final void f() {
        int i10;
        if (this.f43105p) {
            int[] iArr = this.f43096f;
            this.f43096f = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this.f43102l;
            this.f43102l = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.f43105p = false;
            e();
        }
        if (this.f43104o) {
            this.f43104o = false;
            this.f43105p = false;
            int[] iArr2 = this.f43096f;
            String[] strArr2 = this.f43102l;
            int i11 = this.f43097g;
            int i12 = this.f43101k;
            int i13 = i11 + i11;
            int i14 = this.m;
            if (i13 > 65536) {
                g(true);
                return;
            }
            this.f43096f = new int[iArr2.length + (i11 << 3)];
            this.f43097g = i13;
            int i15 = i13 << 2;
            this.f43098h = i15;
            this.f43099i = i15 + (i15 >> 1);
            int i16 = i13 >> 2;
            if (i16 < 64) {
                i10 = 4;
            } else if (i16 <= 256) {
                i10 = 5;
            } else {
                i10 = i16 <= 1024 ? 6 : 7;
            }
            this.f43100j = i10;
            this.f43102l = new String[strArr2.length << 1];
            g(false);
            int[] iArr3 = new int[16];
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18 += 4) {
                int i19 = iArr2[i18 + 3];
                if (i19 != 0) {
                    i17++;
                    String str = strArr2[i18 >> 2];
                    if (i19 == 1) {
                        iArr3[0] = iArr2[i18];
                        addName(str, iArr3, 1);
                    } else if (i19 == 2) {
                        iArr3[0] = iArr2[i18];
                        iArr3[1] = iArr2[i18 + 1];
                        addName(str, iArr3, 2);
                    } else if (i19 != 3) {
                        if (i19 > iArr3.length) {
                            iArr3 = new int[i19];
                        }
                        System.arraycopy(iArr2, iArr2[i18 + 1], iArr3, 0, i19);
                        addName(str, iArr3, i19);
                    } else {
                        iArr3[0] = iArr2[i18];
                        iArr3[1] = iArr2[i18 + 1];
                        iArr3[2] = iArr2[i18 + 2];
                        addName(str, iArr3, 3);
                    }
                }
            }
            if (i17 != i12) {
                throw new IllegalStateException(n1.e("Failed rehash(): old count=", i12, ", copyCount=", i17));
            }
        }
    }

    public String findName(int i10) {
        int iA = a(calcHash(i10));
        int[] iArr = this.f43096f;
        int i11 = iArr[iA + 3];
        if (i11 == 1) {
            if (iArr[iA] == i10) {
                return this.f43102l[iA >> 2];
            }
        } else if (i11 == 0) {
            return null;
        }
        int i12 = this.f43098h + ((iA >> 3) << 2);
        int i13 = iArr[i12 + 3];
        if (i13 == 1) {
            if (iArr[i12] == i10) {
                return this.f43102l[i12 >> 2];
            }
        } else if (i13 == 0) {
            return null;
        }
        int i14 = this.f43099i;
        int i15 = this.f43100j;
        int i16 = i14 + ((iA >> (i15 + 2)) << i15);
        int i17 = (1 << i15) + i16;
        while (i16 < i17) {
            int i18 = iArr[i16 + 3];
            if (i10 == iArr[i16] && 1 == i18) {
                return this.f43102l[i16 >> 2];
            }
            if (i18 == 0) {
                return null;
            }
            i16 += 4;
        }
        for (int iC = c(); iC < this.m; iC += 4) {
            if (i10 == iArr[iC] && 1 == iArr[iC + 3]) {
                return this.f43102l[iC >> 2];
            }
        }
        return null;
    }

    public final void g(boolean z10) {
        this.f43101k = 0;
        this.m = c();
        this.f43103n = this.f43097g << 3;
        if (z10) {
            Arrays.fill(this.f43096f, 0);
            Arrays.fill(this.f43102l, (Object) null);
        }
    }

    public int hashSeed() {
        return this.f43093c;
    }

    public ByteQuadsCanonicalizer makeChild(int i10) {
        return new ByteQuadsCanonicalizer(this, JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i10), this.f43093c, JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i10), this.f43092b.get());
    }

    public boolean maybeDirty() {
        return !this.f43105p;
    }

    public int primaryCount() {
        int i10 = this.f43098h;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this.f43096f[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public void release() {
        ByteQuadsCanonicalizer byteQuadsCanonicalizer = this.f43091a;
        if (byteQuadsCanonicalizer == null || !maybeDirty()) {
            return;
        }
        a aVar = new a(this);
        AtomicReference<a> atomicReference = byteQuadsCanonicalizer.f43092b;
        a aVar2 = atomicReference.get();
        int i10 = aVar2.f43107b;
        int i11 = aVar.f43107b;
        if (i11 != i10) {
            if (i11 > 6000) {
                aVar = new a(64, 4, new int[512], new String[128], 448, 512);
            }
            while (!atomicReference.compareAndSet(aVar2, aVar) && atomicReference.get() == aVar2) {
            }
        }
        this.f43105p = true;
    }

    public int secondaryCount() {
        int i10 = this.f43099i;
        int i11 = 0;
        for (int i12 = this.f43098h + 3; i12 < i10; i12 += 4) {
            if (this.f43096f[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public int size() {
        AtomicReference<a> atomicReference = this.f43092b;
        return atomicReference != null ? atomicReference.get().f43107b : this.f43101k;
    }

    public int spilloverCount() {
        return (this.m - c()) >> 2;
    }

    public int tertiaryCount() {
        int i10 = this.f43099i + 3;
        int i11 = this.f43097g + i10;
        int i12 = 0;
        while (i10 < i11) {
            if (this.f43096f[i10] != 0) {
                i12++;
            }
            i10 += 4;
        }
        return i12;
    }

    public String toString() {
        int iPrimaryCount = primaryCount();
        int iSecondaryCount = secondaryCount();
        int iTertiaryCount = tertiaryCount();
        int iSpilloverCount = spilloverCount();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", ByteQuadsCanonicalizer.class.getName(), Integer.valueOf(this.f43101k), Integer.valueOf(this.f43097g), Integer.valueOf(iPrimaryCount), Integer.valueOf(iSecondaryCount), Integer.valueOf(iTertiaryCount), Integer.valueOf(iSpilloverCount), Integer.valueOf(iPrimaryCount + iSecondaryCount + iTertiaryCount + iSpilloverCount), Integer.valueOf(totalCount()));
    }

    public int totalCount() {
        int i10 = this.f43097g << 3;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this.f43096f[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public int calcHash(int i10, int i11) {
        int i12 = i10 + (i10 >>> 15);
        int i13 = this.f43093c ^ ((i11 * 33) + (i12 ^ (i12 >>> 9)));
        int i14 = i13 + (i13 >>> 16);
        int i15 = i14 ^ (i14 >>> 4);
        return i15 + (i15 << 3);
    }

    public static ByteQuadsCanonicalizer createRoot(int i10) {
        return new ByteQuadsCanonicalizer(i10);
    }

    public int calcHash(int i10, int i11, int i12) {
        int i13 = i10 ^ this.f43093c;
        int i14 = (((i13 + (i13 >>> 9)) * 31) + i11) * 33;
        int i15 = (i14 + (i14 >>> 15)) ^ i12;
        int i16 = i15 + (i15 >>> 4);
        int i17 = i16 + (i16 >>> 15);
        return i17 ^ (i17 << 9);
    }

    public int calcHash(int[] iArr, int i10) {
        if (i10 >= 4) {
            int i11 = iArr[0] ^ this.f43093c;
            int i12 = i11 + (i11 >>> 9) + iArr[1];
            int i13 = ((i12 + (i12 >>> 15)) * 33) ^ iArr[2];
            int i14 = i13 + (i13 >>> 4);
            for (int i15 = 3; i15 < i10; i15++) {
                int i16 = iArr[i15];
                i14 += i16 ^ (i16 >> 21);
            }
            int i17 = i14 * 65599;
            int i18 = i17 + (i17 >>> 19);
            return (i18 << 5) ^ i18;
        }
        throw new IllegalArgumentException();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f43106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f43107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f43108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f43109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String[] f43110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f43111f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f43112g;

        public a(int i10, int i11, int[] iArr, String[] strArr, int i12, int i13) {
            this.f43106a = i10;
            this.f43107b = 0;
            this.f43108c = i11;
            this.f43109d = iArr;
            this.f43110e = strArr;
            this.f43111f = i12;
            this.f43112g = i13;
        }

        public a(ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
            this.f43106a = byteQuadsCanonicalizer.f43097g;
            this.f43107b = byteQuadsCanonicalizer.f43101k;
            this.f43108c = byteQuadsCanonicalizer.f43100j;
            this.f43109d = byteQuadsCanonicalizer.f43096f;
            this.f43110e = byteQuadsCanonicalizer.f43102l;
            this.f43111f = byteQuadsCanonicalizer.m;
            this.f43112g = byteQuadsCanonicalizer.f43103n;
        }
    }

    public ByteQuadsCanonicalizer(ByteQuadsCanonicalizer byteQuadsCanonicalizer, boolean z10, int i10, boolean z11, a aVar) {
        this.f43091a = byteQuadsCanonicalizer;
        this.f43093c = i10;
        this.f43094d = z10;
        this.f43095e = z11;
        this.f43092b = null;
        this.f43101k = aVar.f43107b;
        int i11 = aVar.f43106a;
        this.f43097g = i11;
        int i12 = i11 << 2;
        this.f43098h = i12;
        this.f43099i = i12 + (i12 >> 1);
        this.f43100j = aVar.f43108c;
        this.f43096f = aVar.f43109d;
        this.f43102l = aVar.f43110e;
        this.m = aVar.f43111f;
        this.f43103n = aVar.f43112g;
        this.f43104o = false;
        this.f43105p = true;
    }

    public String addName(String str, int i10, int i11) {
        f();
        if (this.f43094d) {
            str = InternCache.instance.intern(str);
        }
        int iB = b(i11 == 0 ? calcHash(i10) : calcHash(i10, i11));
        int[] iArr = this.f43096f;
        iArr[iB] = i10;
        iArr[iB + 1] = i11;
        iArr[iB + 3] = 2;
        this.f43102l[iB >> 2] = str;
        this.f43101k++;
        e();
        return str;
    }

    public String findName(int i10, int i11) {
        int iA = a(calcHash(i10, i11));
        int[] iArr = this.f43096f;
        int i12 = iArr[iA + 3];
        if (i12 == 2) {
            if (i10 == iArr[iA] && i11 == iArr[iA + 1]) {
                return this.f43102l[iA >> 2];
            }
        } else if (i12 == 0) {
            return null;
        }
        int i13 = this.f43098h + ((iA >> 3) << 2);
        int i14 = iArr[i13 + 3];
        if (i14 == 2) {
            if (i10 == iArr[i13] && i11 == iArr[i13 + 1]) {
                return this.f43102l[i13 >> 2];
            }
        } else if (i14 == 0) {
            return null;
        }
        int i15 = this.f43099i;
        int i16 = this.f43100j;
        int i17 = i15 + ((iA >> (i16 + 2)) << i16);
        int i18 = (1 << i16) + i17;
        while (i17 < i18) {
            int i19 = iArr[i17 + 3];
            if (i10 == iArr[i17] && i11 == iArr[i17 + 1] && 2 == i19) {
                return this.f43102l[i17 >> 2];
            }
            if (i19 == 0) {
                return null;
            }
            i17 += 4;
        }
        for (int iC = c(); iC < this.m; iC += 4) {
            if (i10 == iArr[iC] && i11 == iArr[iC + 1] && 2 == iArr[iC + 3]) {
                return this.f43102l[iC >> 2];
            }
        }
        return null;
    }

    public String addName(String str, int i10, int i11, int i12) {
        f();
        if (this.f43094d) {
            str = InternCache.instance.intern(str);
        }
        int iB = b(calcHash(i10, i11, i12));
        int[] iArr = this.f43096f;
        iArr[iB] = i10;
        iArr[iB + 1] = i11;
        iArr[iB + 2] = i12;
        iArr[iB + 3] = 3;
        this.f43102l[iB >> 2] = str;
        this.f43101k++;
        e();
        return str;
    }

    public String addName(String str, int[] iArr, int i10) {
        int iB;
        f();
        if (this.f43094d) {
            str = InternCache.instance.intern(str);
        }
        if (i10 == 1) {
            iB = b(calcHash(iArr[0]));
            int[] iArr2 = this.f43096f;
            iArr2[iB] = iArr[0];
            iArr2[iB + 3] = 1;
        } else if (i10 == 2) {
            iB = b(calcHash(iArr[0], iArr[1]));
            int[] iArr3 = this.f43096f;
            iArr3[iB] = iArr[0];
            iArr3[iB + 1] = iArr[1];
            iArr3[iB + 3] = 2;
        } else if (i10 != 3) {
            int iCalcHash = calcHash(iArr, i10);
            iB = b(iCalcHash);
            int[] iArr4 = this.f43096f;
            iArr4[iB] = iCalcHash;
            int i11 = this.f43103n;
            int i12 = i11 + i10;
            if (i12 > iArr4.length) {
                this.f43096f = Arrays.copyOf(this.f43096f, Math.max(i12 - iArr4.length, Math.min(4096, this.f43097g)) + this.f43096f.length);
            }
            System.arraycopy(iArr, 0, this.f43096f, i11, i10);
            this.f43103n += i10;
            int[] iArr5 = this.f43096f;
            iArr5[iB + 1] = i11;
            iArr5[iB + 3] = i10;
        } else {
            iB = b(calcHash(iArr[0], iArr[1], iArr[2]));
            int[] iArr6 = this.f43096f;
            iArr6[iB] = iArr[0];
            iArr6[iB + 1] = iArr[1];
            iArr6[iB + 2] = iArr[2];
            iArr6[iB + 3] = 3;
        }
        this.f43102l[iB >> 2] = str;
        this.f43101k++;
        e();
        return str;
    }

    public String findName(int i10, int i11, int i12) {
        int iA = a(calcHash(i10, i11, i12));
        int[] iArr = this.f43096f;
        int i13 = iArr[iA + 3];
        if (i13 == 3) {
            if (i10 == iArr[iA] && iArr[iA + 1] == i11 && iArr[iA + 2] == i12) {
                return this.f43102l[iA >> 2];
            }
        } else if (i13 == 0) {
            return null;
        }
        int i14 = this.f43098h + ((iA >> 3) << 2);
        int i15 = iArr[i14 + 3];
        if (i15 == 3) {
            if (i10 == iArr[i14] && iArr[i14 + 1] == i11 && iArr[i14 + 2] == i12) {
                return this.f43102l[i14 >> 2];
            }
        } else if (i15 == 0) {
            return null;
        }
        int i16 = this.f43099i;
        int i17 = this.f43100j;
        int i18 = i16 + ((iA >> (i17 + 2)) << i17);
        int i19 = (1 << i17) + i18;
        while (i18 < i19) {
            int i20 = iArr[i18 + 3];
            if (i10 == iArr[i18] && i11 == iArr[i18 + 1] && i12 == iArr[i18 + 2] && 3 == i20) {
                return this.f43102l[i18 >> 2];
            }
            if (i20 == 0) {
                return null;
            }
            i18 += 4;
        }
        for (int iC = c(); iC < this.m; iC += 4) {
            if (i10 == iArr[iC] && i11 == iArr[iC + 1] && i12 == iArr[iC + 2] && 3 == iArr[iC + 3]) {
                return this.f43102l[iC >> 2];
            }
        }
        return null;
    }

    public String findName(int[] iArr, int i10) {
        if (i10 < 4) {
            if (i10 == 1) {
                return findName(iArr[0]);
            }
            if (i10 != 2) {
                return i10 != 3 ? "" : findName(iArr[0], iArr[1], iArr[2]);
            }
            return findName(iArr[0], iArr[1]);
        }
        int iCalcHash = calcHash(iArr, i10);
        int iA = a(iCalcHash);
        int[] iArr2 = this.f43096f;
        int i11 = iArr2[iA + 3];
        if (iCalcHash == iArr2[iA] && i11 == i10 && d(i10, iArr2[iA + 1], iArr)) {
            return this.f43102l[iA >> 2];
        }
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f43098h + ((iA >> 3) << 2);
        int i13 = iArr2[i12 + 3];
        if (iCalcHash == iArr2[i12] && i13 == i10 && d(i10, iArr2[i12 + 1], iArr)) {
            return this.f43102l[i12 >> 2];
        }
        int i14 = this.f43099i;
        int i15 = this.f43100j;
        int i16 = i14 + ((iA >> (i15 + 2)) << i15);
        int[] iArr3 = this.f43096f;
        int i17 = (1 << i15) + i16;
        while (i16 < i17) {
            int i18 = iArr3[i16 + 3];
            if (iCalcHash == iArr3[i16] && i10 == i18 && d(i10, iArr3[i16 + 1], iArr)) {
                return this.f43102l[i16 >> 2];
            }
            if (i18 == 0) {
                return null;
            }
            i16 += 4;
        }
        for (int iC = c(); iC < this.m; iC += 4) {
            if (iCalcHash == iArr3[iC] && i10 == iArr3[iC + 3] && d(i10, iArr3[iC + 1], iArr)) {
                return this.f43102l[iC >> 2];
            }
        }
        return null;
    }
}
