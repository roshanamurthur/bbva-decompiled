package org.bouncycastle.crypto.digests;

import androidx.appcompat.widget.g0;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.SkeinParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes2.dex */
public class SkeinEngine implements Memoable {
    public static final int SKEIN_1024 = 1024;
    public static final int SKEIN_256 = 256;
    public static final int SKEIN_512 = 512;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Hashtable f88176j = new Hashtable();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreefishEngine f88177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f88179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f88180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f88181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Parameter[] f88182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Parameter[] f88183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f88184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f88185i;

    public static class Parameter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f88186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f88187b;

        public Parameter(int i10, byte[] bArr) {
            this.f88186a = i10;
            this.f88187b = bArr;
        }

        public int getType() {
            return this.f88186a;
        }

        public byte[] getValue() {
            return this.f88187b;
        }
    }

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f88188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f88189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f88190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long[] f88191d;

        public a(int i10) {
            b bVar = new b();
            long[] jArr = {0, 0};
            bVar.f88193a = jArr;
            bVar.f88194b = false;
            jArr[1] = 4611686018427387904L;
            this.f88188a = bVar;
            this.f88189b = new byte[i10];
            this.f88191d = new long[i10 / 8];
        }

        public final void a(long[] jArr) {
            int i10 = this.f88190c;
            while (true) {
                byte[] bArr = this.f88189b;
                if (i10 >= bArr.length) {
                    long[] jArr2 = this.f88188a.f88193a;
                    jArr2[1] = jArr2[1] | Long.MIN_VALUE;
                    b(jArr);
                    return;
                }
                bArr[i10] = 0;
                i10++;
            }
        }

        public final void b(long[] jArr) {
            long[] jArr2;
            SkeinEngine skeinEngine = SkeinEngine.this;
            skeinEngine.f88177a.init(true, skeinEngine.f88179c, this.f88188a.f88193a);
            int i10 = 0;
            while (true) {
                jArr2 = this.f88191d;
                if (i10 >= jArr2.length) {
                    break;
                }
                jArr2[i10] = ThreefishEngine.bytesToWord(this.f88189b, i10 * 8);
                i10++;
            }
            skeinEngine.f88177a.processBlock(jArr2, jArr);
            for (int i11 = 0; i11 < jArr.length; i11++) {
                jArr[i11] = jArr[i11] ^ this.f88191d[i11];
            }
        }

        public final void c(long[] jArr, int i10, byte[] bArr, int i11) {
            int i12 = 0;
            while (i11 > i12) {
                int i13 = this.f88190c;
                int length = this.f88189b.length;
                b bVar = this.f88188a;
                if (i13 == length) {
                    b(jArr);
                    long[] jArr2 = bVar.f88193a;
                    jArr2[1] = jArr2[1] & (-4611686018427387905L);
                    this.f88190c = 0;
                }
                int iMin = Math.min(i11 - i12, this.f88189b.length - this.f88190c);
                System.arraycopy(bArr, i10 + i12, this.f88189b, this.f88190c, iMin);
                i12 += iMin;
                this.f88190c += iMin;
                if (bVar.f88194b) {
                    long[] jArr3 = new long[3];
                    long[] jArr4 = bVar.f88193a;
                    jArr3[0] = jArr4[0] & 4294967295L;
                    jArr3[1] = (jArr4[0] >>> 32) & 4294967295L;
                    jArr3[2] = jArr4[1] & 4294967295L;
                    long j10 = iMin;
                    for (int i14 = 0; i14 < 3; i14++) {
                        long j11 = j10 + jArr3[i14];
                        jArr3[i14] = j11;
                        j10 = j11 >>> 32;
                    }
                    long[] jArr5 = bVar.f88193a;
                    jArr5[0] = ((jArr3[1] & 4294967295L) << 32) | (jArr3[0] & 4294967295L);
                    jArr5[1] = (jArr3[2] & 4294967295L) | (jArr5[1] & (-4294967296L));
                } else {
                    long[] jArr6 = bVar.f88193a;
                    long j12 = jArr6[0] + ((long) iMin);
                    jArr6[0] = j12;
                    if (j12 > 9223372034707292160L) {
                        bVar.f88194b = true;
                    }
                }
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long[] f88193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f88194b;

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) ((this.f88193a[1] >>> 56) & 63));
            sb2.append(" first: ");
            sb2.append((this.f88193a[1] & 4611686018427387904L) != 0);
            sb2.append(", final: ");
            sb2.append((this.f88193a[1] & Long.MIN_VALUE) != 0);
            return sb2.toString();
        }
    }

    static {
        b(new long[]{-2228972824489528736L, -8629553674646093540L, 1155188648486244218L, -3677226592081559102L}, 256, 128);
        b(new long[]{1450197650740764312L, 3081844928540042640L, -3136097061834271170L, 3301952811952417661L}, 256, 160);
        b(new long[]{-4176654842910610933L, -8688192972455077604L, -7364642305011795836L, 4056579644589979102L}, 256, 224);
        b(new long[]{-243853671043386295L, 3443677322885453875L, -5531612722399640561L, 7662005193972177513L}, 256, 256);
        b(new long[]{-6288014694233956526L, 2204638249859346602L, 3502419045458743507L, -4829063503441264548L, 983504137758028059L, 1880512238245786339L, -6715892782214108542L, 7602827311880509485L}, 512, 128);
        b(new long[]{2934123928682216849L, -4399710721982728305L, 1684584802963255058L, 5744138295201861711L, 2444857010922934358L, -2807833639722848072L, -5121587834665610502L, 118355523173251694L}, 512, 160);
        b(new long[]{-3688341020067007964L, -3772225436291745297L, -8300862168937575580L, 4146387520469897396L, 1106145742801415120L, 7455425944880474941L, -7351063101234211863L, -7048981346965512457L}, 512, 224);
        b(new long[]{-6631894876634615969L, -5692838220127733084L, -7099962856338682626L, -2911352911530754598L, 2000907093792408677L, 9140007292425499655L, 6093301768906360022L, 2769176472213098488L}, 512, BluetoothState.REQUEST_CONNECT_DEVICE);
        b(new long[]{5261240102383538638L, 978932832955457283L, -8083517948103779378L, -7339365279355032399L, 6752626034097301424L, -1531723821829733388L, -7417126464950782685L, -5901786942805128141L}, 512, 512);
    }

    public SkeinEngine(int i10, int i11) {
        this.f88185i = new byte[1];
        if (i11 % 8 != 0) {
            throw new IllegalArgumentException(g0.c("Output size must be a multiple of 8 bits. :", i11));
        }
        this.f88178b = i11 / 8;
        ThreefishEngine threefishEngine = new ThreefishEngine(i10);
        this.f88177a = threefishEngine;
        this.f88184h = new a(threefishEngine.getBlockSize());
    }

    public static void b(long[] jArr, int i10, int i11) {
        f88176j.put(Integers.valueOf((i10 / 8) | ((i11 / 8) << 16)), jArr);
    }

    public static void c(Parameter[] parameterArr) {
        if (parameterArr == null) {
            return;
        }
        for (int i10 = 1; i10 < parameterArr.length; i10++) {
            Parameter parameter = parameterArr[i10];
            int i11 = i10;
            while (i11 > 0) {
                int i12 = i11 - 1;
                if (parameter.getType() >= parameterArr[i12].getType()) {
                    break;
                }
                parameterArr[i11] = parameterArr[i12];
                i11 = i12;
            }
            parameterArr[i11] = parameter;
        }
    }

    public final void a(SkeinEngine skeinEngine) {
        a aVar = skeinEngine.f88184h;
        a aVar2 = this.f88184h;
        aVar2.getClass();
        aVar2.f88189b = Arrays.clone(aVar.f88189b, aVar2.f88189b);
        aVar2.f88190c = aVar.f88190c;
        aVar2.f88191d = Arrays.clone(aVar.f88191d, aVar2.f88191d);
        b bVar = aVar2.f88188a;
        bVar.getClass();
        b bVar2 = aVar.f88188a;
        bVar.f88193a = Arrays.clone(bVar2.f88193a, bVar.f88193a);
        bVar.f88194b = bVar2.f88194b;
        this.f88179c = Arrays.clone(skeinEngine.f88179c, this.f88179c);
        this.f88180d = Arrays.clone(skeinEngine.f88180d, this.f88180d);
        this.f88181e = Arrays.clone(skeinEngine.f88181e, this.f88181e);
        Parameter[] parameterArr = skeinEngine.f88182f;
        Parameter[] parameterArr2 = this.f88182f;
        Parameter[] parameterArr3 = null;
        if (parameterArr == null) {
            parameterArr2 = null;
        } else {
            if (parameterArr2 == null || parameterArr2.length != parameterArr.length) {
                parameterArr2 = new Parameter[parameterArr.length];
            }
            System.arraycopy(parameterArr, 0, parameterArr2, 0, parameterArr2.length);
        }
        this.f88182f = parameterArr2;
        Parameter[] parameterArr4 = skeinEngine.f88183g;
        Parameter[] parameterArr5 = this.f88183g;
        if (parameterArr4 != null) {
            if (parameterArr5 == null || parameterArr5.length != parameterArr4.length) {
                parameterArr5 = new Parameter[parameterArr4.length];
            }
            parameterArr3 = parameterArr5;
            System.arraycopy(parameterArr4, 0, parameterArr3, 0, parameterArr3.length);
        }
        this.f88183g = parameterArr3;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SkeinEngine(this);
    }

    public final void d(int i10, byte[] bArr) {
        e(i10);
        int length = bArr.length;
        long[] jArr = this.f88179c;
        a aVar = this.f88184h;
        aVar.c(jArr, 0, bArr, length);
        aVar.a(this.f88179c);
    }

    public int doFinal(byte[] bArr, int i10) {
        byte[] bArr2;
        int i11;
        SkeinEngine skeinEngine = this;
        a aVar = skeinEngine.f88184h;
        if (aVar == null) {
            throw new IllegalArgumentException("Skein engine is not initialised.");
        }
        int length = bArr.length;
        int i12 = skeinEngine.f88178b;
        if (length < i10 + i12) {
            throw new OutputLengthException("Output buffer is too short to hold output");
        }
        aVar.a(skeinEngine.f88179c);
        int i13 = 0;
        if (skeinEngine.f88183g != null) {
            int i14 = 0;
            while (true) {
                Parameter[] parameterArr = skeinEngine.f88183g;
                if (i14 >= parameterArr.length) {
                    break;
                }
                Parameter parameter = parameterArr[i14];
                skeinEngine.d(parameter.getType(), parameter.getValue());
                i14++;
            }
        }
        int blockSize = getBlockSize();
        int iA = c2.b.a(i12, blockSize, 1, blockSize);
        int i15 = 0;
        while (i15 < iA) {
            int i16 = i15 * blockSize;
            int iMin = Math.min(blockSize, i12 - i16);
            int i17 = i10 + i16;
            int i18 = 8;
            byte[] bArr3 = new byte[8];
            ThreefishEngine.wordToBytes(i15, bArr3, i13);
            long[] jArr = new long[skeinEngine.f88179c.length];
            skeinEngine.e(63);
            aVar.c(jArr, i13, bArr3, 8);
            aVar.a(jArr);
            int i19 = (iMin + 7) / 8;
            int i20 = i13;
            while (i20 < i19) {
                int i21 = i20 * 8;
                int iMin2 = Math.min(i18, iMin - i21);
                byte[] bArr4 = bArr3;
                if (iMin2 == i18) {
                    ThreefishEngine.wordToBytes(jArr[i20], bArr, i21 + i17);
                    bArr2 = bArr4;
                    i11 = 0;
                } else {
                    bArr2 = bArr4;
                    i11 = 0;
                    ThreefishEngine.wordToBytes(jArr[i20], bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i21 + i17, iMin2);
                }
                i20++;
                i13 = i11;
                bArr3 = bArr2;
                aVar = aVar;
                i18 = 8;
            }
            i15++;
            skeinEngine = this;
        }
        reset();
        return i12;
    }

    public final void e(int i10) {
        a aVar = this.f88184h;
        b bVar = aVar.f88188a;
        long[] jArr = bVar.f88193a;
        jArr[0] = 0;
        jArr[1] = 0;
        bVar.f88194b = false;
        jArr[1] = 4611686018427387904L;
        jArr[1] = (4611686018427387904L & (-274877906944L)) | ((((long) i10) & 63) << 56);
        aVar.f88190c = 0;
    }

    public int getBlockSize() {
        return this.f88177a.getBlockSize();
    }

    public int getOutputSize() {
        return this.f88178b;
    }

    public void init(SkeinParameters skeinParameters) {
        this.f88179c = null;
        this.f88181e = null;
        this.f88182f = null;
        this.f88183g = null;
        if (skeinParameters != null) {
            if (skeinParameters.getKey().length < 16) {
                throw new IllegalArgumentException("Skein key must be at least 128 bits.");
            }
            Hashtable parameters = skeinParameters.getParameters();
            Enumeration enumerationKeys = parameters.keys();
            Vector vector = new Vector();
            Vector vector2 = new Vector();
            while (enumerationKeys.hasMoreElements()) {
                Integer num = (Integer) enumerationKeys.nextElement();
                byte[] bArr = (byte[]) parameters.get(num);
                if (num.intValue() == 0) {
                    this.f88181e = bArr;
                } else if (num.intValue() < 48) {
                    vector.addElement(new Parameter(num.intValue(), bArr));
                } else {
                    vector2.addElement(new Parameter(num.intValue(), bArr));
                }
            }
            Parameter[] parameterArr = new Parameter[vector.size()];
            this.f88182f = parameterArr;
            vector.copyInto(parameterArr);
            c(this.f88182f);
            Parameter[] parameterArr2 = new Parameter[vector2.size()];
            this.f88183g = parameterArr2;
            vector2.copyInto(parameterArr2);
            c(this.f88183g);
        }
        long[] jArr = (long[]) f88176j.get(Integers.valueOf((getOutputSize() << 16) | getBlockSize()));
        int i10 = 0;
        if (this.f88181e != null || jArr == null) {
            this.f88179c = new long[getBlockSize() / 8];
            byte[] bArr2 = this.f88181e;
            if (bArr2 != null) {
                d(0, bArr2);
            }
            long j10 = this.f88178b * 8;
            byte[] bArr3 = new byte[32];
            bArr3[0] = 83;
            bArr3[1] = 72;
            bArr3[2] = 65;
            bArr3[3] = 51;
            bArr3[4] = 1;
            bArr3[5] = 0;
            ThreefishEngine.wordToBytes(j10, bArr3, 8);
            d(4, bArr3);
        } else {
            this.f88179c = Arrays.clone(jArr);
        }
        if (this.f88182f != null) {
            while (true) {
                Parameter[] parameterArr3 = this.f88182f;
                if (i10 >= parameterArr3.length) {
                    break;
                }
                Parameter parameter = parameterArr3[i10];
                d(parameter.getType(), parameter.getValue());
                i10++;
            }
        }
        this.f88180d = Arrays.clone(this.f88179c);
        e(48);
    }

    public void reset() {
        long[] jArr = this.f88180d;
        long[] jArr2 = this.f88179c;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        e(48);
    }

    public void update(byte b10) {
        byte[] bArr = this.f88185i;
        bArr[0] = b10;
        update(bArr, 0, 1);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SkeinEngine skeinEngine = (SkeinEngine) memoable;
        if (getBlockSize() != skeinEngine.getBlockSize() || this.f88178b != skeinEngine.f88178b) {
            throw new IllegalArgumentException("Incompatible parameters in provided SkeinEngine.");
        }
        a(skeinEngine);
    }

    public void update(byte[] bArr, int i10, int i11) {
        a aVar = this.f88184h;
        if (aVar == null) {
            throw new IllegalArgumentException("Skein engine is not initialised.");
        }
        aVar.c(this.f88179c, i10, bArr, i11);
    }

    public SkeinEngine(SkeinEngine skeinEngine) {
        this(skeinEngine.getBlockSize() * 8, skeinEngine.getOutputSize() * 8);
        a(skeinEngine);
    }
}
