package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class CharsToNameCanonicalizer {
    public static final int HASH_MULT = 33;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharsToNameCanonicalizer f43113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<b> f43114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f43118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a[] f43119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f43120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f43121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f43122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f43123k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f43124l;
    public BitSet m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f43125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f43126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f43127c;

        public a(String str, a aVar) {
            this.f43125a = str;
            this.f43126b = aVar;
            this.f43127c = aVar != null ? 1 + aVar.f43127c : 1;
        }
    }

    public CharsToNameCanonicalizer(int i10) {
        this.f43113a = null;
        this.f43115c = i10;
        this.f43117e = true;
        this.f43116d = -1;
        this.f43124l = false;
        this.f43123k = 0;
        this.f43114b = new AtomicReference<>(new b(new String[64], new a[32]));
    }

    public static CharsToNameCanonicalizer createRoot() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    public int _hashToIndex(int i10) {
        int i11 = i10 + (i10 >>> 15);
        int i12 = i11 ^ (i11 << 7);
        return (i12 + (i12 >>> 3)) & this.f43122j;
    }

    public int bucketCount() {
        return this.f43118f.length;
    }

    public int calcHash(char[] cArr, int i10, int i11) {
        int i12 = i11 + i10;
        int i13 = this.f43115c;
        while (i10 < i12) {
            i13 = (i13 * 33) + cArr[i10];
            i10++;
        }
        if (i13 == 0) {
            return 1;
        }
        return i13;
    }

    public int collisionCount() {
        int i10 = 0;
        for (a aVar : this.f43119g) {
            if (aVar != null) {
                i10 += aVar.f43127c;
            }
        }
        return i10;
    }

    public String findSymbol(char[] cArr, int i10, int i11, int i12) {
        String str;
        if (i11 < 1) {
            return "";
        }
        if (!this.f43117e) {
            return new String(cArr, i10, i11);
        }
        int i_hashToIndex = _hashToIndex(i12);
        String str2 = this.f43118f[i_hashToIndex];
        if (str2 != null) {
            if (str2.length() == i11) {
                int i13 = 0;
                while (str2.charAt(i13) == cArr[i10 + i13]) {
                    i13++;
                    if (i13 == i11) {
                        return str2;
                    }
                }
            }
            a aVar = this.f43119g[i_hashToIndex >> 1];
            if (aVar != null) {
                String str3 = aVar.f43125a;
                if (str3.length() != i11) {
                    str3 = null;
                    break;
                }
                int i14 = 0;
                do {
                    if (str3.charAt(i14) != cArr[i10 + i14]) {
                        str3 = null;
                        break;
                    }
                    i14++;
                } while (i14 < i11);
                if (str3 != null) {
                    return str3;
                }
                a aVar2 = aVar.f43126b;
                while (true) {
                    if (aVar2 == null) {
                        str = null;
                        break;
                    }
                    str = aVar2.f43125a;
                    if (str.length() != i11) {
                        str = null;
                        break;
                    }
                    int i15 = 0;
                    do {
                        if (str.charAt(i15) != cArr[i10 + i15]) {
                            str = null;
                            break;
                        }
                        i15++;
                    } while (i15 < i11);
                    if (str != null) {
                        break;
                    }
                    aVar2 = aVar2.f43126b;
                }
                if (str != null) {
                    return str;
                }
            }
        }
        if (this.f43124l) {
            String[] strArr = this.f43118f;
            this.f43118f = (String[]) Arrays.copyOf(strArr, strArr.length);
            a[] aVarArr = this.f43119g;
            this.f43119g = (a[]) Arrays.copyOf(aVarArr, aVarArr.length);
            this.f43124l = false;
        } else if (this.f43120h >= this.f43121i) {
            String[] strArr2 = this.f43118f;
            int length = strArr2.length;
            int i16 = length + length;
            if (i16 > 65536) {
                this.f43120h = 0;
                this.f43117e = false;
                this.f43118f = new String[64];
                this.f43119g = new a[32];
                this.f43122j = 63;
                this.f43124l = false;
            } else {
                a[] aVarArr2 = this.f43119g;
                this.f43118f = new String[i16];
                this.f43119g = new a[i16 >> 1];
                this.f43122j = i16 - 1;
                this.f43121i = i16 - (i16 >> 2);
                int i17 = 0;
                int iMax = 0;
                for (String str4 : strArr2) {
                    if (str4 != null) {
                        i17++;
                        int i_hashToIndex2 = _hashToIndex(calcHash(str4));
                        String[] strArr3 = this.f43118f;
                        if (strArr3[i_hashToIndex2] == null) {
                            strArr3[i_hashToIndex2] = str4;
                        } else {
                            int i18 = i_hashToIndex2 >> 1;
                            a[] aVarArr3 = this.f43119g;
                            a aVar3 = new a(str4, aVarArr3[i18]);
                            aVarArr3[i18] = aVar3;
                            iMax = Math.max(iMax, aVar3.f43127c);
                        }
                    }
                }
                int i19 = length >> 1;
                for (int i20 = 0; i20 < i19; i20++) {
                    for (a aVar4 = aVarArr2[i20]; aVar4 != null; aVar4 = aVar4.f43126b) {
                        i17++;
                        String str5 = aVar4.f43125a;
                        int i_hashToIndex3 = _hashToIndex(calcHash(str5));
                        String[] strArr4 = this.f43118f;
                        if (strArr4[i_hashToIndex3] == null) {
                            strArr4[i_hashToIndex3] = str5;
                        } else {
                            int i21 = i_hashToIndex3 >> 1;
                            a[] aVarArr4 = this.f43119g;
                            a aVar5 = new a(str5, aVarArr4[i21]);
                            aVarArr4[i21] = aVar5;
                            iMax = Math.max(iMax, aVar5.f43127c);
                        }
                    }
                }
                this.f43123k = iMax;
                this.m = null;
                if (i17 != this.f43120h) {
                    throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(this.f43120h), Integer.valueOf(i17)));
                }
            }
            i_hashToIndex = _hashToIndex(calcHash(cArr, i10, i11));
        }
        String str6 = new String(cArr, i10, i11);
        JsonFactory.Feature feature = JsonFactory.Feature.INTERN_FIELD_NAMES;
        int i22 = this.f43116d;
        if (feature.enabledIn(i22)) {
            str6 = InternCache.instance.intern(str6);
        }
        this.f43120h++;
        String[] strArr5 = this.f43118f;
        if (strArr5[i_hashToIndex] == null) {
            strArr5[i_hashToIndex] = str6;
        } else {
            int i23 = i_hashToIndex >> 1;
            a[] aVarArr5 = this.f43119g;
            a aVar6 = new a(str6, aVarArr5[i23]);
            int i24 = aVar6.f43127c;
            if (i24 > 100) {
                BitSet bitSet = this.m;
                if (bitSet == null) {
                    BitSet bitSet2 = new BitSet();
                    this.m = bitSet2;
                    bitSet2.set(i23);
                } else if (bitSet.get(i23)) {
                    if (JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i22)) {
                        reportTooManyCollisions(100);
                    }
                    this.f43117e = false;
                } else {
                    this.m.set(i23);
                }
                this.f43118f[i23 + i23] = str6;
                this.f43119g[i23] = null;
                this.f43120h -= i24;
                this.f43123k = -1;
            } else {
                aVarArr5[i23] = aVar6;
                this.f43123k = Math.max(i24, this.f43123k);
            }
        }
        return str6;
    }

    public int hashSeed() {
        return this.f43115c;
    }

    public CharsToNameCanonicalizer makeChild(int i10) {
        return new CharsToNameCanonicalizer(this, i10, this.f43115c, this.f43114b.get());
    }

    public int maxCollisionLength() {
        return this.f43123k;
    }

    public boolean maybeDirty() {
        return !this.f43124l;
    }

    public void release() {
        CharsToNameCanonicalizer charsToNameCanonicalizer;
        if (maybeDirty() && (charsToNameCanonicalizer = this.f43113a) != null && this.f43117e) {
            b bVar = new b(this);
            AtomicReference<b> atomicReference = charsToNameCanonicalizer.f43114b;
            b bVar2 = atomicReference.get();
            int i10 = bVar2.f43128a;
            int i11 = bVar.f43128a;
            if (i11 != i10) {
                if (i11 > 12000) {
                    bVar = new b(new String[64], new a[32]);
                }
                while (!atomicReference.compareAndSet(bVar2, bVar) && atomicReference.get() == bVar2) {
                }
            }
            this.f43124l = true;
        }
    }

    public void reportTooManyCollisions(int i10) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this.f43120h + ") now exceeds maximum, " + i10 + " -- suspect a DoS attack based on hash collisions");
    }

    public int size() {
        AtomicReference<b> atomicReference = this.f43114b;
        return atomicReference != null ? atomicReference.get().f43128a : this.f43120h;
    }

    public static CharsToNameCanonicalizer createRoot(int i10) {
        return new CharsToNameCanonicalizer(i10);
    }

    public int calcHash(String str) {
        int length = str.length();
        int iCharAt = this.f43115c;
        for (int i10 = 0; i10 < length; i10++) {
            iCharAt = (iCharAt * 33) + str.charAt(i10);
        }
        if (iCharAt == 0) {
            return 1;
        }
        return iCharAt;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f43128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f43129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String[] f43130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a[] f43131d;

        public b(String[] strArr, a[] aVarArr) {
            this.f43128a = 0;
            this.f43129b = 0;
            this.f43130c = strArr;
            this.f43131d = aVarArr;
        }

        public b(CharsToNameCanonicalizer charsToNameCanonicalizer) {
            this.f43128a = charsToNameCanonicalizer.f43120h;
            this.f43129b = charsToNameCanonicalizer.f43123k;
            this.f43130c = charsToNameCanonicalizer.f43118f;
            this.f43131d = charsToNameCanonicalizer.f43119g;
        }
    }

    public CharsToNameCanonicalizer(CharsToNameCanonicalizer charsToNameCanonicalizer, int i10, int i11, b bVar) {
        this.f43113a = charsToNameCanonicalizer;
        this.f43115c = i11;
        this.f43114b = null;
        this.f43116d = i10;
        this.f43117e = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i10);
        String[] strArr = bVar.f43130c;
        this.f43118f = strArr;
        this.f43119g = bVar.f43131d;
        this.f43120h = bVar.f43128a;
        this.f43123k = bVar.f43129b;
        int length = strArr.length;
        this.f43121i = length - (length >> 2);
        this.f43122j = length - 1;
        this.f43124l = true;
    }
}
