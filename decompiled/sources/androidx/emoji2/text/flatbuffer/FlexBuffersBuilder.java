package androidx.emoji2.text.flatbuffer;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class FlexBuffersBuilder {
    public static final int BUILDER_FLAG_NONE = 0;
    public static final int BUILDER_FLAG_SHARE_ALL = 7;
    public static final int BUILDER_FLAG_SHARE_KEYS = 1;
    public static final int BUILDER_FLAG_SHARE_KEYS_AND_STRINGS = 3;
    public static final int BUILDER_FLAG_SHARE_KEY_VECTORS = 4;
    public static final int BUILDER_FLAG_SHARE_STRINGS = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f21371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f21372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, Integer> f21373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<String, Integer> f21374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f21376f;

    public class a implements Comparator<b> {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(b bVar, b bVar2) {
            byte b10;
            byte b11;
            int i10 = bVar.f21382e;
            int i11 = bVar2.f21382e;
            do {
                FlexBuffersBuilder flexBuffersBuilder = FlexBuffersBuilder.this;
                b10 = flexBuffersBuilder.f21371a.get(i10);
                b11 = flexBuffersBuilder.f21371a.get(i11);
                if (b10 == 0) {
                    break;
                }
                i10++;
                i11++;
            } while (b10 == b11);
            return b10 - b11;
        }
    }

    public FlexBuffersBuilder(int i10) {
        this(new ArrayReadWriteBuf(i10), 1);
    }

    public static int e(long j10) {
        if (j10 <= 255) {
            return 0;
        }
        if (j10 <= 65535) {
            return 1;
        }
        return j10 <= (((long) (-1)) & 4294967295L) ? 2 : 3;
    }

    public final int a(int i10) {
        int i11 = 1 << i10;
        c cVar = this.f21371a;
        int i12 = (i11 - 1) & ((~cVar.writePosition()) + 1);
        while (true) {
            int i13 = i12 - 1;
            if (i12 == 0) {
                return i11;
            }
            cVar.put((byte) 0);
            i12 = i13;
        }
    }

    public final b b(int i10, int i11, int i12, boolean z10, boolean z11, b bVar) {
        int i13;
        int iE;
        int i14 = i12;
        long j10 = i14;
        int iMax = Math.max(0, e(j10));
        c cVar = this.f21371a;
        if (bVar != null) {
            iMax = Math.max(iMax, b.a(bVar.f21378a, bVar.f21379b, cVar.writePosition(), 0, bVar.f21381d));
            i13 = 3;
        } else {
            i13 = 1;
        }
        int iMax2 = iMax;
        int i15 = 4;
        int i16 = i11;
        while (true) {
            ArrayList<b> arrayList = this.f21372b;
            if (i16 >= arrayList.size()) {
                int i17 = i15;
                int iA = a(iMax2);
                if (bVar != null) {
                    h(iA, (int) (((long) cVar.writePosition()) - bVar.f21381d));
                    h(iA, 1 << bVar.f21379b);
                }
                if (!z11) {
                    h(iA, j10);
                }
                int iWritePosition = cVar.writePosition();
                for (int i18 = i11; i18 < arrayList.size(); i18++) {
                    f(arrayList.get(i18), iA);
                }
                if (!z10) {
                    for (int i19 = i11; i19 < arrayList.size(); i19++) {
                        b bVar2 = arrayList.get(i19);
                        bVar2.getClass();
                        int i20 = FlexBuffers.FBT_NULL;
                        int i21 = bVar2.f21378a;
                        boolean z12 = i21 <= 3 || i21 == 26;
                        int iMax3 = bVar2.f21379b;
                        if (z12) {
                            iMax3 = Math.max(iMax3, iMax2);
                        }
                        cVar.put((byte) (iMax3 | (i21 << 2)));
                    }
                }
                if (bVar != null) {
                    iE = 9;
                } else if (z10) {
                    if (!z11) {
                        i14 = 0;
                    }
                    iE = FlexBuffers.e(i17, i14);
                } else {
                    iE = 10;
                }
                return new b(i10, iE, iMax2, iWritePosition);
            }
            b bVar3 = arrayList.get(i16);
            int i22 = i15;
            iMax2 = Math.max(iMax2, b.a(bVar3.f21378a, bVar3.f21379b, cVar.writePosition(), i16 + i13, bVar3.f21381d));
            if (z10 && i16 == i11) {
                i15 = arrayList.get(i16).f21378a;
                if ((i15 < 1 || i15 > 4) && i15 != 26) {
                    throw new FlexBuffers.FlexBufferException("TypedVector does not support this element type");
                }
            } else {
                i15 = i22;
            }
            i16++;
        }
    }

    public final int c(String str) {
        if (str == null) {
            return -1;
        }
        c cVar = this.f21371a;
        int iWritePosition = cVar.writePosition();
        int i10 = this.f21375e & 1;
        HashMap<String, Integer> map = this.f21373c;
        if (i10 == 0) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            cVar.put(bytes, 0, bytes.length);
            cVar.put((byte) 0);
            map.put(str, Integer.valueOf(iWritePosition));
            return iWritePosition;
        }
        Integer num = map.get(str);
        if (num != null) {
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        cVar.put(bytes2, 0, bytes2.length);
        cVar.put((byte) 0);
        map.put(str, Integer.valueOf(iWritePosition));
        return iWritePosition;
    }

    public final void d(long j10) {
        b bVar;
        int iC = c(null);
        int iE = e(j10);
        if (iE == 0) {
            bVar = new b(iC, 2, 0, (int) j10);
        } else if (iE == 1) {
            bVar = new b(iC, 2, 1, (int) j10);
        } else {
            bVar = iE == 2 ? new b(iC, 2, 2, (int) j10) : new b(iC, 2, 3, j10);
        }
        this.f21372b.add(bVar);
    }

    public int endMap(String str, int i10) {
        c cVar;
        int iC = c(str);
        ArrayList<b> arrayList = this.f21372b;
        Collections.sort(arrayList.subList(i10, arrayList.size()), this.f21376f);
        long size = arrayList.size() - i10;
        int iMax = Math.max(0, e(size));
        int i11 = i10;
        while (true) {
            int size2 = arrayList.size();
            cVar = this.f21371a;
            if (i11 >= size2) {
                break;
            }
            long j10 = arrayList.get(i11).f21382e;
            i11++;
            iMax = Math.max(iMax, b.a(4, 0, cVar.writePosition(), i11, j10));
        }
        int iA = a(iMax);
        h(iA, size);
        int iWritePosition = cVar.writePosition();
        for (int i12 = i10; i12 < arrayList.size(); i12++) {
            int i13 = arrayList.get(i12).f21382e;
            h(iA, (int) (((long) cVar.writePosition()) - ((long) arrayList.get(i12).f21382e)));
        }
        b bVarB = b(iC, i10, arrayList.size() - i10, false, false, new b(-1, FlexBuffers.e(4, 0), iMax, iWritePosition));
        while (arrayList.size() > i10) {
            arrayList.remove(arrayList.size() - 1);
        }
        arrayList.add(bVarB);
        return (int) bVarB.f21381d;
    }

    public int endVector(String str, int i10, boolean z10, boolean z11) {
        int iC = c(str);
        ArrayList<b> arrayList = this.f21372b;
        b bVarB = b(iC, i10, arrayList.size() - i10, z10, z11, null);
        while (arrayList.size() > i10) {
            arrayList.remove(arrayList.size() - 1);
        }
        arrayList.add(bVarB);
        return (int) bVarB.f21381d;
    }

    public final void f(b bVar, int i10) {
        int i11 = bVar.f21378a;
        long j10 = bVar.f21381d;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            c cVar = this.f21371a;
            if (i11 == 3) {
                double d2 = bVar.f21380c;
                if (i10 == 4) {
                    cVar.putFloat((float) d2);
                    return;
                } else {
                    if (i10 == 8) {
                        cVar.putDouble(d2);
                        return;
                    }
                    return;
                }
            }
            if (i11 != 26) {
                h(i10, (int) (((long) cVar.writePosition()) - j10));
                return;
            }
        }
        h(i10, j10);
    }

    public ByteBuffer finish() {
        ArrayList<b> arrayList = this.f21372b;
        b bVar = arrayList.get(0);
        c cVar = this.f21371a;
        int iA = a(b.a(bVar.f21378a, bVar.f21379b, cVar.writePosition(), 0, bVar.f21381d));
        f(arrayList.get(0), iA);
        b bVar2 = arrayList.get(0);
        bVar2.getClass();
        int i10 = FlexBuffers.FBT_NULL;
        int i11 = bVar2.f21378a;
        boolean z10 = i11 <= 3 || i11 == 26;
        int iMax = bVar2.f21379b;
        if (z10) {
            iMax = Math.max(iMax, 0);
        }
        cVar.put((byte) (iMax | (i11 << 2)));
        cVar.put((byte) iA);
        return ByteBuffer.wrap(cVar.data(), 0, cVar.writePosition());
    }

    public final b g(byte[] bArr, int i10, int i11, boolean z10) {
        int iE = e(bArr.length);
        h(a(iE), bArr.length);
        c cVar = this.f21371a;
        int iWritePosition = cVar.writePosition();
        cVar.put(bArr, 0, bArr.length);
        if (z10) {
            cVar.put((byte) 0);
        }
        return new b(i10, i11, iE, iWritePosition);
    }

    public c getBuffer() {
        return this.f21371a;
    }

    public final void h(int i10, long j10) {
        c cVar = this.f21371a;
        if (i10 == 1) {
            cVar.put((byte) j10);
            return;
        }
        if (i10 == 2) {
            cVar.putShort((short) j10);
        } else if (i10 == 4) {
            cVar.putInt((int) j10);
        } else {
            if (i10 != 8) {
                return;
            }
            cVar.putLong(j10);
        }
    }

    public int putBlob(byte[] bArr) {
        return putBlob(null, bArr);
    }

    public void putBoolean(boolean z10) {
        putBoolean(null, z10);
    }

    public void putFloat(float f6) {
        putFloat((String) null, f6);
    }

    public void putInt(int i10) {
        putInt((String) null, i10);
    }

    public int putString(String str) {
        return putString(null, str);
    }

    public void putUInt(int i10) {
        d(i10);
    }

    public void putUInt64(BigInteger bigInteger) {
        this.f21372b.add(new b(c(null), 2, 3, bigInteger.longValue()));
    }

    public int startMap() {
        return this.f21372b.size();
    }

    public int startVector() {
        return this.f21372b.size();
    }

    public FlexBuffersBuilder() {
        this(256);
    }

    public int putBlob(String str, byte[] bArr) {
        b bVarG = g(bArr, c(str), 25, false);
        this.f21372b.add(bVarG);
        return (int) bVarG.f21381d;
    }

    public void putBoolean(String str, boolean z10) {
        this.f21372b.add(new b(c(str), 26, 0, z10 ? 1L : 0L));
    }

    public void putFloat(String str, float f6) {
        this.f21372b.add(new b(c(str), 2, f6));
    }

    public void putInt(String str, int i10) {
        putInt(str, i10);
    }

    public int putString(String str, String str2) {
        int iC = c(str);
        int i10 = this.f21375e & 2;
        ArrayList<b> arrayList = this.f21372b;
        if (i10 == 0) {
            b bVarG = g(str2.getBytes(StandardCharsets.UTF_8), iC, 5, true);
            arrayList.add(bVarG);
            return (int) bVarG.f21381d;
        }
        HashMap<String, Integer> map = this.f21374d;
        Integer num = map.get(str2);
        if (num != null) {
            arrayList.add(new b(iC, 5, e(str2.length()), num.intValue()));
            return num.intValue();
        }
        b bVarG2 = g(str2.getBytes(StandardCharsets.UTF_8), iC, 5, true);
        int i11 = (int) bVarG2.f21381d;
        map.put(str2, Integer.valueOf(i11));
        arrayList.add(bVarG2);
        return i11;
    }

    public void putUInt(long j10) {
        d(j10);
    }

    @Deprecated
    public FlexBuffersBuilder(ByteBuffer byteBuffer, int i10) {
        this(new ArrayReadWriteBuf(byteBuffer.array()), i10);
    }

    public void putInt(String str, long j10) {
        int iC = c(str);
        ArrayList<b> arrayList = this.f21372b;
        if (-128 <= j10 && j10 <= 127) {
            arrayList.add(new b(iC, 1, 0, (int) j10));
            return;
        }
        if (-32768 <= j10 && j10 <= 32767) {
            arrayList.add(new b(iC, 1, 1, (int) j10));
        } else if (-2147483648L <= j10 && j10 <= 2147483647L) {
            arrayList.add(new b(iC, 1, 2, (int) j10));
        } else {
            arrayList.add(new b(iC, 1, 3, j10));
        }
    }

    public FlexBuffersBuilder(c cVar, int i10) {
        this.f21372b = new ArrayList<>();
        this.f21373c = new HashMap<>();
        this.f21374d = new HashMap<>();
        this.f21376f = new a();
        this.f21371a = cVar;
        this.f21375e = i10;
    }

    public void putFloat(double d2) {
        putFloat((String) null, d2);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f21380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f21381d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f21382e;

        public b(int i10, int i11, int i12, long j10) {
            this.f21382e = i10;
            this.f21378a = i11;
            this.f21379b = i12;
            this.f21381d = j10;
            this.f21380c = Double.MIN_VALUE;
        }

        public static int a(int i10, int i11, int i12, int i13, long j10) {
            int i14 = FlexBuffers.FBT_NULL;
            if (i10 <= 3 || i10 == 26) {
                return i11;
            }
            for (int i15 = 1; i15 <= 32; i15 *= 2) {
                int iE = FlexBuffersBuilder.e((int) (((long) ((i13 * i15) + ((((~i12) + 1) & (i15 - 1)) + i12))) - j10));
                if ((1 << iE) == i15) {
                    return iE;
                }
            }
            return 3;
        }

        public b(int i10, int i11, double d2) {
            this.f21382e = i10;
            this.f21378a = 3;
            this.f21379b = i11;
            this.f21380c = d2;
            this.f21381d = Long.MIN_VALUE;
        }
    }

    public void putFloat(String str, double d2) {
        this.f21372b.add(new b(c(str), 3, d2));
    }

    public FlexBuffersBuilder(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }

    public void putInt(long j10) {
        putInt((String) null, j10);
    }
}
