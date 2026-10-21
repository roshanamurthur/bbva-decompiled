package mf;

import com.google.crypto.tink.subtle.Bytes;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: Ed25519.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f83399a = new a(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f83400b = new c(new d(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f83401c = {-19, -45, -11, 92, MessageUtils.MESSAGE_26_SUB, 99, MessageUtils.MESSAGE_18_DC2, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    /* JADX INFO: compiled from: Ed25519.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f83402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f83403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long[] f83404c;

        public a() {
            this(new long[10], new long[10], new long[10]);
        }

        public final void a(a aVar, int i10) {
            mf.a.a(i10, this.f83402a, aVar.f83402a);
            mf.a.a(i10, this.f83403b, aVar.f83403b);
            mf.a.a(i10, this.f83404c, aVar.f83404c);
        }

        public void b(long[] jArr, long[] jArr2) {
            System.arraycopy(jArr2, 0, jArr, 0, 10);
        }

        public a(long[] jArr, long[] jArr2, long[] jArr3) {
            this.f83402a = jArr;
            this.f83403b = jArr2;
            this.f83404c = jArr3;
        }

        public a(int i10) {
            a aVar = b.f83399a;
            this.f83402a = Arrays.copyOf(aVar.f83402a, 10);
            this.f83403b = Arrays.copyOf(aVar.f83403b, 10);
            this.f83404c = Arrays.copyOf(aVar.f83404c, 10);
        }
    }

    /* JADX INFO: compiled from: Ed25519.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f83408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f83409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long[] f83410c;

        public d() {
            this(new long[10], new long[10], new long[10]);
        }

        @CanIgnoreReturnValue
        public static void a(c cVar, d dVar) {
            long[] jArr = dVar.f83408a;
            d dVar2 = cVar.f83406a;
            long[] jArr2 = dVar2.f83408a;
            long[] jArr3 = cVar.f83407b;
            mf.d.d(jArr, jArr2, jArr3);
            long[] jArr4 = dVar2.f83409b;
            long[] jArr5 = dVar.f83409b;
            long[] jArr6 = dVar2.f83410c;
            mf.d.d(jArr5, jArr4, jArr6);
            mf.d.d(dVar.f83410c, jArr6, jArr3);
        }

        public final byte[] b() {
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            long[] jArr3 = new long[10];
            mf.d.c(jArr, this.f83410c);
            mf.d.d(jArr2, this.f83408a, jArr);
            mf.d.d(jArr3, this.f83409b, jArr);
            byte[] bArrA = mf.d.a(jArr3);
            bArrA[31] = (byte) (((mf.d.a(jArr2)[0] & 1) << 7) ^ bArrA[31]);
            return bArrA;
        }

        public d(long[] jArr, long[] jArr2, long[] jArr3) {
            this.f83408a = jArr;
            this.f83409b = jArr2;
            this.f83410c = jArr3;
        }

        public d(d dVar) {
            this.f83408a = Arrays.copyOf(dVar.f83408a, 10);
            this.f83409b = Arrays.copyOf(dVar.f83409b, 10);
            this.f83410c = Arrays.copyOf(dVar.f83410c, 10);
        }

        public d(c cVar) {
            this();
            a(cVar, this);
        }
    }

    /* JADX INFO: compiled from: Ed25519.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f83411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f83412b;

        public e() {
            this(new d(), new long[10]);
        }

        @CanIgnoreReturnValue
        public static void a(c cVar, e eVar) {
            long[] jArr = eVar.f83411a.f83408a;
            d dVar = cVar.f83406a;
            long[] jArr2 = dVar.f83408a;
            long[] jArr3 = cVar.f83407b;
            mf.d.d(jArr, jArr2, jArr3);
            d dVar2 = eVar.f83411a;
            long[] jArr4 = dVar2.f83409b;
            long[] jArr5 = dVar.f83409b;
            long[] jArr6 = dVar.f83410c;
            mf.d.d(jArr4, jArr5, jArr6);
            mf.d.d(dVar2.f83410c, jArr6, jArr3);
            mf.d.d(eVar.f83412b, dVar.f83408a, dVar.f83409b);
        }

        public e(d dVar, long[] jArr) {
            this.f83411a = dVar;
            this.f83412b = jArr;
        }

        public e(c cVar) {
            this();
            a(cVar, this);
        }
    }

    public static boolean a(long[] jArr) {
        long[] jArr2 = new long[jArr.length + 1];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        mf.d.g(jArr2);
        byte[] bArrA = mf.d.a(jArr2);
        for (int i10 = 0; i10 < 32; i10++) {
            if (bArrA[i10] != 0) {
                return true;
            }
        }
        return false;
    }

    public static void b(c cVar, e eVar, a aVar) {
        long[] jArr = new long[10];
        d dVar = cVar.f83406a;
        long[] jArr2 = dVar.f83408a;
        d dVar2 = eVar.f83411a;
        mf.d.k(jArr2, dVar2.f83409b, dVar2.f83408a);
        mf.d.j(dVar.f83409b, dVar2.f83409b, dVar2.f83408a);
        long[] jArr3 = aVar.f83403b;
        long[] jArr4 = dVar.f83409b;
        mf.d.d(jArr4, jArr4, jArr3);
        long[] jArr5 = aVar.f83402a;
        long[] jArr6 = dVar.f83410c;
        long[] jArr7 = dVar.f83408a;
        mf.d.d(jArr6, jArr7, jArr5);
        long[] jArr8 = cVar.f83407b;
        mf.d.d(jArr8, eVar.f83412b, aVar.f83404c);
        aVar.b(jArr7, dVar2.f83410c);
        mf.d.k(jArr, jArr7, jArr7);
        mf.d.j(jArr7, jArr6, jArr4);
        mf.d.k(jArr4, jArr6, jArr4);
        mf.d.k(jArr6, jArr, jArr8);
        mf.d.j(jArr8, jArr, jArr8);
    }

    public static void c(c cVar, d dVar) {
        long[] jArr = new long[10];
        d dVar2 = cVar.f83406a;
        mf.d.i(dVar2.f83408a, dVar.f83408a);
        long[] jArr2 = dVar2.f83410c;
        long[] jArr3 = dVar.f83409b;
        mf.d.i(jArr2, jArr3);
        long[] jArr4 = cVar.f83407b;
        mf.d.i(jArr4, dVar.f83410c);
        mf.d.k(jArr4, jArr4, jArr4);
        long[] jArr5 = dVar.f83408a;
        long[] jArr6 = dVar2.f83409b;
        mf.d.k(jArr6, jArr5, jArr3);
        mf.d.i(jArr, jArr6);
        long[] jArr7 = dVar2.f83410c;
        long[] jArr8 = dVar2.f83408a;
        mf.d.k(jArr6, jArr7, jArr8);
        mf.d.j(jArr7, jArr7, jArr8);
        mf.d.j(jArr8, jArr, jArr6);
        mf.d.j(jArr4, jArr4, jArr7);
    }

    public static int d(int i10, int i11) {
        int i12 = (~(i10 ^ i11)) & 255;
        int i13 = i12 & (i12 << 4);
        int i14 = i13 & (i13 << 2);
        return ((i14 & (i14 << 1)) >> 7) & 1;
    }

    public static byte[] e(byte[] bArr) throws GeneralSecurityException {
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        engineFactory.update(bArr, 0, 32);
        byte[] bArrDigest = engineFactory.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        byte b10 = (byte) (bArrDigest[31] & 127);
        bArrDigest[31] = b10;
        bArrDigest[31] = (byte) (b10 | 64);
        return bArrDigest;
    }

    public static long f(int i10, byte[] bArr) {
        return (((long) (bArr[i10 + 2] & 255)) << 16) | (((long) bArr[i10]) & 255) | (((long) (bArr[i10 + 1] & 255)) << 8);
    }

    public static long g(int i10, byte[] bArr) {
        return (((long) (bArr[i10 + 3] & 255)) << 24) | f(i10, bArr);
    }

    public static void h(byte[] bArr) {
        long jF = f(0, bArr) & 2097151;
        long jG = (g(2, bArr) >> 5) & 2097151;
        long jF2 = (f(5, bArr) >> 2) & 2097151;
        long jG2 = (g(7, bArr) >> 7) & 2097151;
        long jG3 = (g(10, bArr) >> 4) & 2097151;
        long jF3 = (f(13, bArr) >> 1) & 2097151;
        long jG4 = (g(15, bArr) >> 6) & 2097151;
        long jF4 = (f(18, bArr) >> 3) & 2097151;
        long jF5 = f(21, bArr) & 2097151;
        long jG5 = (g(23, bArr) >> 5) & 2097151;
        long jF6 = (f(26, bArr) >> 2) & 2097151;
        long jG6 = (g(28, bArr) >> 7) & 2097151;
        long jG7 = (g(31, bArr) >> 4) & 2097151;
        long jF7 = (f(34, bArr) >> 1) & 2097151;
        long jG8 = (g(36, bArr) >> 6) & 2097151;
        long jF8 = (f(39, bArr) >> 3) & 2097151;
        long jF9 = f(42, bArr) & 2097151;
        long jG9 = (g(44, bArr) >> 5) & 2097151;
        long jF10 = (f(47, bArr) >> 2) & 2097151;
        long jG10 = (g(49, bArr) >> 7) & 2097151;
        long jG11 = (g(52, bArr) >> 4) & 2097151;
        long jF11 = (f(55, bArr) >> 1) & 2097151;
        long jG12 = (g(57, bArr) >> 6) & 2097151;
        long jG13 = g(60, bArr) >> 3;
        long j10 = (jG13 * 666643) + jG6;
        long j11 = (jG13 * 470296) + jG7;
        long j12 = (jG13 * 654183) + jF7;
        long j13 = jG8 - (jG13 * 997805);
        long j14 = (jG13 * 136657) + jF8;
        long j15 = jF9 - (jG13 * 683901);
        long j16 = (jG12 * 666643) + jF6;
        long j17 = (jG12 * 470296) + j10;
        long j18 = (jG12 * 654183) + j11;
        long j19 = j12 - (jG12 * 997805);
        long j20 = (jG12 * 136657) + j13;
        long j21 = j14 - (jG12 * 683901);
        long j22 = (jF11 * 666643) + jG5;
        long j23 = (jF11 * 470296) + j16;
        long j24 = (jF11 * 654183) + j17;
        long j25 = j18 - (jF11 * 997805);
        long j26 = (jF11 * 136657) + j19;
        long j27 = j20 - (jF11 * 683901);
        long j28 = (jG11 * 666643) + jF5;
        long j29 = (jG11 * 470296) + j22;
        long j30 = (jG11 * 654183) + j23;
        long j31 = j24 - (jG11 * 997805);
        long j32 = (jG11 * 136657) + j25;
        long j33 = j26 - (jG11 * 683901);
        long j34 = (jG10 * 666643) + jF4;
        long j35 = (jG10 * 470296) + j28;
        long j36 = (jG10 * 654183) + j29;
        long j37 = j30 - (jG10 * 997805);
        long j38 = (jG10 * 136657) + j31;
        long j39 = j32 - (jG10 * 683901);
        long j40 = (jF10 * 666643) + jG4;
        long j41 = (jF10 * 470296) + j34;
        long j42 = (jF10 * 654183) + j35;
        long j43 = j36 - (jF10 * 997805);
        long j44 = (jF10 * 136657) + j37;
        long j45 = j38 - (jF10 * 683901);
        long j46 = (j40 + 1048576) >> 21;
        long j47 = j41 + j46;
        long j48 = j40 - (j46 << 21);
        long j49 = (j42 + 1048576) >> 21;
        long j50 = j43 + j49;
        long j51 = j42 - (j49 << 21);
        long j52 = (j44 + 1048576) >> 21;
        long j53 = j45 + j52;
        long j54 = j44 - (j52 << 21);
        long j55 = (j39 + 1048576) >> 21;
        long j56 = j33 + j55;
        long j57 = j39 - (j55 << 21);
        long j58 = (j27 + 1048576) >> 21;
        long j59 = j21 + j58;
        long j60 = j27 - (j58 << 21);
        long j61 = (j15 + 1048576) >> 21;
        long j62 = jG9 + j61;
        long j63 = j15 - (j61 << 21);
        long j64 = (j47 + 1048576) >> 21;
        long j65 = j51 + j64;
        long j66 = j47 - (j64 << 21);
        long j67 = (j50 + 1048576) >> 21;
        long j68 = j54 + j67;
        long j69 = j50 - (j67 << 21);
        long j70 = (j53 + 1048576) >> 21;
        long j71 = j57 + j70;
        long j72 = j53 - (j70 << 21);
        long j73 = (j56 + 1048576) >> 21;
        long j74 = j60 + j73;
        long j75 = j56 - (j73 << 21);
        long j76 = (j59 + 1048576) >> 21;
        long j77 = j63 + j76;
        long j78 = j59 - (j76 << 21);
        long j79 = (j62 * 666643) + jF3;
        long j80 = (j62 * 470296) + j48;
        long j81 = (j62 * 654183) + j66;
        long j82 = j65 - (j62 * 997805);
        long j83 = (j62 * 136657) + j69;
        long j84 = j68 - (j62 * 683901);
        long j85 = (j77 * 666643) + jG3;
        long j86 = (j77 * 470296) + j79;
        long j87 = (j77 * 654183) + j80;
        long j88 = j81 - (j77 * 997805);
        long j89 = (j77 * 136657) + j82;
        long j90 = j83 - (j77 * 683901);
        long j91 = (j78 * 666643) + jG2;
        long j92 = (j78 * 470296) + j85;
        long j93 = (j78 * 654183) + j86;
        long j94 = (j78 * 136657) + j88;
        long j95 = j89 - (j78 * 683901);
        long j96 = (j74 * 666643) + jF2;
        long j97 = (j74 * 470296) + j91;
        long j98 = (j74 * 654183) + j92;
        long j99 = (j74 * 136657) + (j87 - (j78 * 997805));
        long j100 = (j75 * 666643) + jG;
        long j101 = (j75 * 470296) + j96;
        long j102 = (j75 * 654183) + j97;
        long j103 = j98 - (j75 * 997805);
        long j104 = (j75 * 136657) + (j93 - (j74 * 997805));
        long j105 = j99 - (j75 * 683901);
        long j106 = (j71 * 666643) + jF;
        long j107 = (j71 * 654183) + j101;
        long j108 = (j71 * 136657) + j103;
        long j109 = (j106 + 1048576) >> 21;
        long j110 = (j71 * 470296) + j100 + j109;
        long j111 = j106 - (j109 << 21);
        long j112 = (j107 + 1048576) >> 21;
        long j113 = (j102 - (j71 * 997805)) + j112;
        long j114 = j107 - (j112 << 21);
        long j115 = (j108 + 1048576) >> 21;
        long j116 = (j104 - (j71 * 683901)) + j115;
        long j117 = j108 - (j115 << 21);
        long j118 = (j105 + 1048576) >> 21;
        long j119 = (j94 - (j74 * 683901)) + j118;
        long j120 = j105 - (j118 << 21);
        long j121 = (j95 + 1048576) >> 21;
        long j122 = j90 + j121;
        long j123 = j95 - (j121 << 21);
        long j124 = (j84 + 1048576) >> 21;
        long j125 = j72 + j124;
        long j126 = j84 - (j124 << 21);
        long j127 = (j110 + 1048576) >> 21;
        long j128 = j114 + j127;
        long j129 = j110 - (j127 << 21);
        long j130 = (j113 + 1048576) >> 21;
        long j131 = j117 + j130;
        long j132 = j113 - (j130 << 21);
        long j133 = (j116 + 1048576) >> 21;
        long j134 = j120 + j133;
        long j135 = j116 - (j133 << 21);
        long j136 = (j119 + 1048576) >> 21;
        long j137 = j123 + j136;
        long j138 = j119 - (j136 << 21);
        long j139 = (j122 + 1048576) >> 21;
        long j140 = (j125 + 1048576) >> 21;
        long j141 = (j140 * 666643) + j111;
        long j142 = (j140 * 136657) + j131;
        long j143 = j141 >> 21;
        long j144 = (j140 * 470296) + j129 + j143;
        long j145 = j141 - (j143 << 21);
        long j146 = j144 >> 21;
        long j147 = (j140 * 654183) + j128 + j146;
        long j148 = j144 - (j146 << 21);
        long j149 = j147 >> 21;
        long j150 = (j132 - (j140 * 997805)) + j149;
        long j151 = j147 - (j149 << 21);
        long j152 = j150 >> 21;
        long j153 = j142 + j152;
        long j154 = j150 - (j152 << 21);
        long j155 = j153 >> 21;
        long j156 = (j135 - (j140 * 683901)) + j155;
        long j157 = j153 - (j155 << 21);
        long j158 = j156 >> 21;
        long j159 = j134 + j158;
        long j160 = j156 - (j158 << 21);
        long j161 = j159 >> 21;
        long j162 = j138 + j161;
        long j163 = j159 - (j161 << 21);
        long j164 = j162 >> 21;
        long j165 = j137 + j164;
        long j166 = j162 - (j164 << 21);
        long j167 = j165 >> 21;
        long j168 = (j122 - (j139 << 21)) + j167;
        long j169 = j165 - (j167 << 21);
        long j170 = j168 >> 21;
        long j171 = j126 + j139 + j170;
        long j172 = j168 - (j170 << 21);
        long j173 = j171 >> 21;
        long j174 = (j125 - (j140 << 21)) + j173;
        long j175 = j171 - (j173 << 21);
        long j176 = j174 >> 21;
        long j177 = j174 - (j176 << 21);
        long j178 = (666643 * j176) + j145;
        long j179 = (654183 * j176) + j151;
        long j180 = j154 - (997805 * j176);
        long j181 = (136657 * j176) + j157;
        long j182 = j160 - (j176 * 683901);
        long j183 = j178 >> 21;
        long j184 = (470296 * j176) + j148 + j183;
        long j185 = j178 - (j183 << 21);
        long j186 = j184 >> 21;
        long j187 = j179 + j186;
        long j188 = j184 - (j186 << 21);
        long j189 = j187 >> 21;
        long j190 = j180 + j189;
        long j191 = j187 - (j189 << 21);
        long j192 = j190 >> 21;
        long j193 = j181 + j192;
        long j194 = j190 - (j192 << 21);
        long j195 = j193 >> 21;
        long j196 = j182 + j195;
        long j197 = j193 - (j195 << 21);
        long j198 = j196 >> 21;
        long j199 = j163 + j198;
        long j200 = j196 - (j198 << 21);
        long j201 = j199 >> 21;
        long j202 = j166 + j201;
        long j203 = j199 - (j201 << 21);
        long j204 = j202 >> 21;
        long j205 = j169 + j204;
        long j206 = j202 - (j204 << 21);
        long j207 = j205 >> 21;
        long j208 = j172 + j207;
        long j209 = j205 - (j207 << 21);
        long j210 = j208 >> 21;
        long j211 = j175 + j210;
        long j212 = j208 - (j210 << 21);
        long j213 = j211 >> 21;
        long j214 = j177 + j213;
        long j215 = j211 - (j213 << 21);
        bArr[0] = (byte) j185;
        bArr[1] = (byte) (j185 >> 8);
        bArr[2] = (byte) ((j185 >> 16) | (j188 << 5));
        bArr[3] = (byte) (j188 >> 3);
        bArr[4] = (byte) (j188 >> 11);
        bArr[5] = (byte) ((j188 >> 19) | (j191 << 2));
        bArr[6] = (byte) (j191 >> 6);
        bArr[7] = (byte) ((j191 >> 14) | (j194 << 7));
        bArr[8] = (byte) (j194 >> 1);
        bArr[9] = (byte) (j194 >> 9);
        bArr[10] = (byte) ((j194 >> 17) | (j197 << 4));
        bArr[11] = (byte) (j197 >> 4);
        bArr[12] = (byte) (j197 >> 12);
        bArr[13] = (byte) ((j197 >> 20) | (j200 << 1));
        bArr[14] = (byte) (j200 >> 7);
        bArr[15] = (byte) ((j200 >> 15) | (j203 << 6));
        bArr[16] = (byte) (j203 >> 2);
        bArr[17] = (byte) (j203 >> 10);
        bArr[18] = (byte) ((j203 >> 18) | (j206 << 3));
        bArr[19] = (byte) (j206 >> 5);
        bArr[20] = (byte) (j206 >> 13);
        bArr[21] = (byte) j209;
        bArr[22] = (byte) (j209 >> 8);
        bArr[23] = (byte) ((j209 >> 16) | (j212 << 5));
        bArr[24] = (byte) (j212 >> 3);
        bArr[25] = (byte) (j212 >> 11);
        bArr[26] = (byte) ((j212 >> 19) | (j215 << 2));
        bArr[27] = (byte) (j215 >> 6);
        bArr[28] = (byte) ((j215 >> 14) | (j214 << 7));
        bArr[29] = (byte) (j214 >> 1);
        bArr[30] = (byte) (j214 >> 9);
        bArr[31] = (byte) (j214 >> 17);
    }

    public static d i(byte[] bArr) {
        int i10;
        byte[] bArr2 = new byte[64];
        int i11 = 0;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = i11 * 2;
            bArr2[i12] = (byte) (bArr[i11] & 15);
            bArr2[i12 + 1] = (byte) (((bArr[i11] & 255) >> 4) & 15);
            i11++;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < 63) {
            byte b10 = (byte) (bArr2[i13] + i14);
            bArr2[i13] = b10;
            int i15 = (b10 + 8) >> 4;
            bArr2[i13] = (byte) (b10 - (i15 << 4));
            i13++;
            i14 = i15;
        }
        bArr2[63] = (byte) (bArr2[63] + i14);
        c cVar = new c();
        e eVar = new e();
        for (i10 = 1; i10 < 64; i10 += 2) {
            a aVar = new a(0);
            j(aVar, i10 / 2, bArr2[i10]);
            e.a(cVar, eVar);
            b(cVar, eVar, aVar);
        }
        d dVar = new d();
        d.a(cVar, dVar);
        c(cVar, dVar);
        d.a(cVar, dVar);
        c(cVar, dVar);
        d.a(cVar, dVar);
        c(cVar, dVar);
        d.a(cVar, dVar);
        c(cVar, dVar);
        for (int i16 = 0; i16 < 64; i16 += 2) {
            a aVar2 = new a(0);
            j(aVar2, i16 / 2, bArr2[i16]);
            e.a(cVar, eVar);
            b(cVar, eVar, aVar2);
        }
        d dVar2 = new d(cVar);
        long[] jArr = new long[10];
        mf.d.i(jArr, dVar2.f83408a);
        long[] jArr2 = new long[10];
        mf.d.i(jArr2, dVar2.f83409b);
        long[] jArr3 = new long[10];
        mf.d.i(jArr3, dVar2.f83410c);
        long[] jArr4 = new long[10];
        mf.d.i(jArr4, jArr3);
        long[] jArr5 = new long[10];
        mf.d.j(jArr5, jArr2, jArr);
        mf.d.d(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        mf.d.d(jArr6, jArr, jArr2);
        mf.d.d(jArr6, jArr6, mf.c.f83413a);
        mf.d.k(jArr6, jArr6, jArr4);
        mf.d.f(jArr6, jArr6);
        if (Bytes.equal(mf.d.a(jArr5), mf.d.a(jArr6))) {
            return dVar2;
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static void j(a aVar, int i10, byte b10) {
        int i11 = (b10 & 255) >> 7;
        int i12 = b10 - (((-i11) & b10) << 1);
        a[][] aVarArr = mf.c.f83416d;
        aVar.a(aVarArr[i10][0], d(i12, 1));
        aVar.a(aVarArr[i10][1], d(i12, 2));
        aVar.a(aVarArr[i10][2], d(i12, 3));
        aVar.a(aVarArr[i10][3], d(i12, 4));
        aVar.a(aVarArr[i10][4], d(i12, 5));
        aVar.a(aVarArr[i10][5], d(i12, 6));
        aVar.a(aVarArr[i10][6], d(i12, 7));
        aVar.a(aVarArr[i10][7], d(i12, 8));
        long[] jArr = aVar.f83403b;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        long[] jArr2 = aVar.f83402a;
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArr3 = aVar.f83404c;
        long[] jArrCopyOf3 = Arrays.copyOf(jArr3, 10);
        for (int i13 = 0; i13 < jArrCopyOf3.length; i13++) {
            jArrCopyOf3[i13] = -jArrCopyOf3[i13];
        }
        mf.a.a(i11, jArr2, jArrCopyOf);
        mf.a.a(i11, jArr, jArrCopyOf2);
        mf.a.a(i11, jArr3, jArrCopyOf3);
    }

    public static byte[] k(byte[] bArr) {
        int i10;
        byte[] bArr2 = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            bArr2[i11] = (byte) (1 & ((bArr[i11 >> 3] & 255) >> (i11 & 7)));
        }
        for (int i12 = 0; i12 < 256; i12++) {
            if (bArr2[i12] != 0) {
                for (int i13 = 1; i13 <= 6 && (i10 = i12 + i13) < 256; i13++) {
                    byte b10 = bArr2[i10];
                    if (b10 != 0) {
                        byte b11 = bArr2[i12];
                        if ((b10 << i13) + b11 > 15) {
                            if (b11 - (b10 << i13) < -15) {
                                break;
                            }
                            bArr2[i12] = (byte) (b11 - (b10 << i13));
                            while (i10 < 256) {
                                if (bArr2[i10] == 0) {
                                    bArr2[i10] = 1;
                                    break;
                                }
                                bArr2[i10] = 0;
                                i10++;
                            }
                        } else {
                            bArr2[i12] = (byte) (b11 + (b10 << i13));
                            bArr2[i10] = 0;
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static void l(c cVar, e eVar, a aVar) {
        long[] jArr = new long[10];
        d dVar = cVar.f83406a;
        long[] jArr2 = dVar.f83408a;
        d dVar2 = eVar.f83411a;
        mf.d.k(jArr2, dVar2.f83409b, dVar2.f83408a);
        mf.d.j(dVar.f83409b, dVar2.f83409b, dVar2.f83408a);
        long[] jArr3 = aVar.f83402a;
        long[] jArr4 = dVar.f83409b;
        mf.d.d(jArr4, jArr4, jArr3);
        long[] jArr5 = aVar.f83403b;
        long[] jArr6 = dVar.f83410c;
        long[] jArr7 = dVar.f83408a;
        mf.d.d(jArr6, jArr7, jArr5);
        long[] jArr8 = cVar.f83407b;
        mf.d.d(jArr8, eVar.f83412b, aVar.f83404c);
        aVar.b(jArr7, dVar2.f83410c);
        mf.d.k(jArr, jArr7, jArr7);
        mf.d.j(jArr7, jArr6, jArr4);
        mf.d.k(jArr4, jArr6, jArr4);
        mf.d.j(jArr6, jArr, jArr8);
        mf.d.k(jArr8, jArr, jArr8);
    }

    /* JADX INFO: compiled from: Ed25519.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f83406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f83407b;

        public c(d dVar, long[] jArr) {
            this.f83406a = dVar;
            this.f83407b = jArr;
        }

        public c() {
            c cVar = b.f83400b;
            this.f83406a = new d(cVar.f83406a);
            this.f83407b = Arrays.copyOf(cVar.f83407b, 10);
        }
    }

    /* JADX INFO: renamed from: mf.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Ed25519.java */
    public static class C0466b extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long[] f83405d;

        public C0466b(e eVar) {
            this();
            long[] jArr = this.f83402a;
            d dVar = eVar.f83411a;
            mf.d.k(jArr, dVar.f83409b, dVar.f83408a);
            mf.d.j(this.f83403b, dVar.f83409b, dVar.f83408a);
            System.arraycopy(dVar.f83410c, 0, this.f83405d, 0, 10);
            mf.d.d(this.f83404c, eVar.f83412b, mf.c.f83414b);
        }

        @Override // mf.b.a
        public final void b(long[] jArr, long[] jArr2) {
            mf.d.d(jArr, jArr2, this.f83405d);
        }

        public C0466b() {
            super(new long[10], new long[10], new long[10]);
            this.f83405d = new long[10];
        }
    }
}
