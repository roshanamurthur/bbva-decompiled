package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import mf.b;

/* JADX INFO: loaded from: classes10.dex */
public final class Ed25519Sign implements PublicKeySign {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    public static final int SECRET_KEY_LEN = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f47454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f47455b;

    public static final class KeyPair {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f47456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f47457b;

        public KeyPair(byte[] bArr, byte[] bArr2) {
            this.f47456a = bArr;
            this.f47457b = bArr2;
        }

        public static KeyPair newKeyPair() throws GeneralSecurityException {
            return newKeyPairFromSeed(Random.randBytes(32));
        }

        public static KeyPair newKeyPairFromSeed(byte[] bArr) throws GeneralSecurityException {
            if (bArr.length == 32) {
                return new KeyPair(b.i(b.e(bArr)).b(), bArr);
            }
            throw new IllegalArgumentException(String.format("Given secret seed length is not %s", 32));
        }

        public byte[] getPrivateKey() {
            byte[] bArr = this.f47457b;
            return Arrays.copyOf(bArr, bArr.length);
        }

        public byte[] getPublicKey() {
            byte[] bArr = this.f47456a;
            return Arrays.copyOf(bArr, bArr.length);
        }
    }

    public Ed25519Sign(byte[] bArr) throws GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        byte[] bArrE = b.e(bArr);
        this.f47454a = bArrE;
        this.f47455b = b.i(bArrE).b();
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public byte[] sign(byte[] bArr) throws GeneralSecurityException {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        byte[] bArr2 = this.f47454a;
        engineFactory.update(bArr2, 32, 32);
        engineFactory.update(bArrCopyOfRange);
        byte[] bArrDigest = engineFactory.digest();
        b.h(bArrDigest);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(b.i(bArrDigest).b(), 0, 32);
        engineFactory.reset();
        engineFactory.update(bArrCopyOfRange2);
        engineFactory.update(this.f47455b);
        engineFactory.update(bArrCopyOfRange);
        byte[] bArrDigest2 = engineFactory.digest();
        b.h(bArrDigest2);
        long jF = b.f(0, bArrDigest2) & 2097151;
        long jG = (b.g(2, bArrDigest2) >> 5) & 2097151;
        long jF2 = (b.f(5, bArrDigest2) >> 2) & 2097151;
        long jG2 = (b.g(7, bArrDigest2) >> 7) & 2097151;
        long jG3 = (b.g(10, bArrDigest2) >> 4) & 2097151;
        long jF3 = (b.f(13, bArrDigest2) >> 1) & 2097151;
        long jG4 = (b.g(15, bArrDigest2) >> 6) & 2097151;
        long jF4 = (b.f(18, bArrDigest2) >> 3) & 2097151;
        long jF5 = b.f(21, bArrDigest2) & 2097151;
        long jG5 = (b.g(23, bArrDigest2) >> 5) & 2097151;
        long jF6 = (b.f(26, bArrDigest2) >> 2) & 2097151;
        long jG6 = b.g(28, bArrDigest2) >> 7;
        long jF7 = b.f(0, bArr2) & 2097151;
        long jG7 = (b.g(2, bArr2) >> 5) & 2097151;
        long jF8 = (b.f(5, bArr2) >> 2) & 2097151;
        long jG8 = (b.g(7, bArr2) >> 7) & 2097151;
        long jG9 = (b.g(10, bArr2) >> 4) & 2097151;
        long jF9 = (b.f(13, bArr2) >> 1) & 2097151;
        long jG10 = (b.g(15, bArr2) >> 6) & 2097151;
        long jF10 = (b.f(18, bArr2) >> 3) & 2097151;
        long jF11 = b.f(21, bArr2) & 2097151;
        long jG11 = (b.g(23, bArr2) >> 5) & 2097151;
        long jF12 = (b.f(26, bArr2) >> 2) & 2097151;
        long jG12 = b.g(28, bArr2) >> 7;
        long jF13 = b.f(0, bArrDigest) & 2097151;
        long jG13 = (b.g(2, bArrDigest) >> 5) & 2097151;
        long jF14 = (b.f(5, bArrDigest) >> 2) & 2097151;
        long jG14 = (b.g(7, bArrDigest) >> 7) & 2097151;
        long jG15 = (b.g(10, bArrDigest) >> 4) & 2097151;
        long jF15 = (b.f(13, bArrDigest) >> 1) & 2097151;
        long jG16 = (b.g(15, bArrDigest) >> 6) & 2097151;
        long jF16 = (b.f(18, bArrDigest) >> 3) & 2097151;
        long j10 = (jF * jF7) + jF13;
        long j11 = (jG * jF7) + (jF * jG7) + jG13;
        long j12 = (jF2 * jF7) + (jG * jG7) + (jF * jF8) + jF14;
        long j13 = (jG2 * jF7) + (jF2 * jG7) + (jG * jF8) + (jF * jG8) + jG14;
        long j14 = (jG3 * jF7) + (jG2 * jG7) + (jF2 * jF8) + (jG * jG8) + (jF * jG9) + jG15;
        long j15 = (jF3 * jF7) + (jG3 * jG7) + (jG2 * jF8) + (jF2 * jG8) + (jG * jG9) + (jF * jF9) + jF15;
        long j16 = (jG4 * jF7) + (jF3 * jG7) + (jG3 * jF8) + (jG2 * jG8) + (jF2 * jG9) + (jG * jF9) + (jF * jG10) + jG16;
        long j17 = (jF4 * jF7) + (jG4 * jG7) + (jF3 * jF8) + (jG3 * jG8) + (jG2 * jG9) + (jF2 * jF9) + (jG * jG10) + (jF * jF10) + jF16;
        long jF17 = (jF5 * jF7) + (jF4 * jG7) + (jG4 * jF8) + (jF3 * jG8) + (jG3 * jG9) + (jG2 * jF9) + (jF2 * jG10) + (jG * jF10) + (jF * jF11) + (b.f(21, bArrDigest) & 2097151);
        long jG17 = (jG5 * jF7) + (jF5 * jG7) + (jF4 * jF8) + (jG4 * jG8) + (jF3 * jG9) + (jG3 * jF9) + (jG2 * jG10) + (jF2 * jF10) + (jG * jF11) + (jF * jG11) + ((b.g(23, bArrDigest) >> 5) & 2097151);
        long jF18 = (jF6 * jF7) + (jG5 * jG7) + (jF5 * jF8) + (jF4 * jG8) + (jG4 * jG9) + (jF3 * jF9) + (jG3 * jG10) + (jG2 * jF10) + (jF2 * jF11) + (jG * jG11) + (jF * jF12) + ((b.f(26, bArrDigest) >> 2) & 2097151);
        long jG18 = (jF7 * jG6) + (jF6 * jG7) + (jG5 * jF8) + (jF5 * jG8) + (jF4 * jG9) + (jG4 * jF9) + (jF3 * jG10) + (jG3 * jF10) + (jG2 * jF11) + (jF2 * jG11) + (jG * jF12) + (jF * jG12) + (b.g(28, bArrDigest) >> 7);
        long j18 = (jG7 * jG6) + (jF6 * jF8) + (jG5 * jG8) + (jF5 * jG9) + (jF4 * jF9) + (jG4 * jG10) + (jF3 * jF10) + (jG3 * jF11) + (jG2 * jG11) + (jF2 * jF12) + (jG * jG12);
        long j19 = (jF8 * jG6) + (jF6 * jG8) + (jG5 * jG9) + (jF5 * jF9) + (jF4 * jG10) + (jG4 * jF10) + (jF3 * jF11) + (jG3 * jG11) + (jG2 * jF12) + (jF2 * jG12);
        long j20 = (jG8 * jG6) + (jF6 * jG9) + (jG5 * jF9) + (jF5 * jG10) + (jF4 * jF10) + (jG4 * jF11) + (jF3 * jG11) + (jG3 * jF12) + (jG2 * jG12);
        long j21 = (jG9 * jG6) + (jF6 * jF9) + (jG5 * jG10) + (jF5 * jF10) + (jF4 * jF11) + (jG4 * jG11) + (jF3 * jF12) + (jG3 * jG12);
        long j22 = (jF9 * jG6) + (jF6 * jG10) + (jG5 * jF10) + (jF5 * jF11) + (jF4 * jG11) + (jG4 * jF12) + (jF3 * jG12);
        long j23 = (jG10 * jG6) + (jF6 * jF10) + (jG5 * jF11) + (jF5 * jG11) + (jF4 * jF12) + (jG4 * jG12);
        long j24 = (jF10 * jG6) + (jF6 * jF11) + (jG5 * jG11) + (jF5 * jF12) + (jF4 * jG12);
        long j25 = (jF11 * jG6) + (jF6 * jG11) + (jG5 * jF12) + (jF5 * jG12);
        long j26 = (jG11 * jG6) + (jF6 * jF12) + (jG5 * jG12);
        long j27 = jF12 * jG6;
        long j28 = jG6 * jG12;
        long j29 = (j10 + 1048576) >> 21;
        long j30 = j11 + j29;
        long j31 = j10 - (j29 << 21);
        long j32 = (j12 + 1048576) >> 21;
        long j33 = j13 + j32;
        long j34 = j12 - (j32 << 21);
        long j35 = (j14 + 1048576) >> 21;
        long j36 = j15 + j35;
        long j37 = j14 - (j35 << 21);
        long j38 = (j16 + 1048576) >> 21;
        long j39 = j17 + j38;
        long j40 = j16 - (j38 << 21);
        long j41 = (jF17 + 1048576) >> 21;
        long j42 = jG17 + j41;
        long j43 = jF17 - (j41 << 21);
        long j44 = (jF18 + 1048576) >> 21;
        long j45 = jG18 + j44;
        long j46 = jF18 - (j44 << 21);
        long j47 = (j18 + 1048576) >> 21;
        long j48 = j19 + j47;
        long j49 = j18 - (j47 << 21);
        long j50 = (j20 + 1048576) >> 21;
        long j51 = j21 + j50;
        long j52 = j20 - (j50 << 21);
        long j53 = (j22 + 1048576) >> 21;
        long j54 = j23 + j53;
        long j55 = j22 - (j53 << 21);
        long j56 = (j24 + 1048576) >> 21;
        long j57 = j25 + j56;
        long j58 = j24 - (j56 << 21);
        long j59 = (j26 + 1048576) >> 21;
        long j60 = j27 + (jF6 * jG12) + j59;
        long j61 = j26 - (j59 << 21);
        long j62 = (j28 + 1048576) >> 21;
        long j63 = (j30 + 1048576) >> 21;
        long j64 = j34 + j63;
        long j65 = j30 - (j63 << 21);
        long j66 = (j33 + 1048576) >> 21;
        long j67 = j37 + j66;
        long j68 = j33 - (j66 << 21);
        long j69 = (j36 + 1048576) >> 21;
        long j70 = j40 + j69;
        long j71 = j36 - (j69 << 21);
        long j72 = (j39 + 1048576) >> 21;
        long j73 = j43 + j72;
        long j74 = j39 - (j72 << 21);
        long j75 = (j42 + 1048576) >> 21;
        long j76 = j46 + j75;
        long j77 = j42 - (j75 << 21);
        long j78 = (j45 + 1048576) >> 21;
        long j79 = j49 + j78;
        long j80 = j45 - (j78 << 21);
        long j81 = (j48 + 1048576) >> 21;
        long j82 = j52 + j81;
        long j83 = j48 - (j81 << 21);
        long j84 = (j51 + 1048576) >> 21;
        long j85 = j55 + j84;
        long j86 = j51 - (j84 << 21);
        long j87 = (j54 + 1048576) >> 21;
        long j88 = j58 + j87;
        long j89 = j54 - (j87 << 21);
        long j90 = (j57 + 1048576) >> 21;
        long j91 = j61 + j90;
        long j92 = j57 - (j90 << 21);
        long j93 = (j60 + 1048576) >> 21;
        long j94 = (j28 - (j62 << 21)) + j93;
        long j95 = j60 - (j93 << 21);
        long j96 = (j62 * 654183) + j83;
        long j97 = j82 - (j62 * 997805);
        long j98 = j85 - (j62 * 683901);
        long j99 = (j94 * 470296) + (j62 * 666643) + j80;
        long j100 = (j94 * 654183) + (j62 * 470296) + j79;
        long j101 = ((j62 * 136657) + j86) - (j94 * 683901);
        long j102 = (j95 * 654183) + j99;
        long j103 = (j95 * 136657) + (j96 - (j94 * 997805));
        long j104 = ((j94 * 136657) + j97) - (j95 * 683901);
        long j105 = (j91 * 654183) + (j95 * 470296) + (j94 * 666643) + j76;
        long j106 = (j92 * 136657) + (j102 - (j91 * 997805));
        long j107 = ((j91 * 136657) + (j100 - (j95 * 997805))) - (j92 * 683901);
        long j108 = (j88 * 666643) + j70;
        long j109 = (j88 * 654183) + (j92 * 470296) + (j91 * 666643) + j73;
        long j110 = (j88 * 136657) + (j105 - (j92 * 997805));
        long j111 = (j108 + 1048576) >> 21;
        long j112 = (j88 * 470296) + (j92 * 666643) + j74 + j111;
        long j113 = j108 - (j111 << 21);
        long j114 = (j109 + 1048576) >> 21;
        long j115 = (((j92 * 654183) + ((j91 * 470296) + ((j95 * 666643) + j77))) - (j88 * 997805)) + j114;
        long j116 = j109 - (j114 << 21);
        long j117 = (j110 + 1048576) >> 21;
        long j118 = (j106 - (j88 * 683901)) + j117;
        long j119 = j110 - (j117 << 21);
        long j120 = (j107 + 1048576) >> 21;
        long j121 = (j103 - (j91 * 683901)) + j120;
        long j122 = j107 - (j120 << 21);
        long j123 = (j104 + 1048576) >> 21;
        long j124 = j101 + j123;
        long j125 = j104 - (j123 << 21);
        long j126 = (j98 + 1048576) >> 21;
        long j127 = j89 + j126;
        long j128 = j98 - (j126 << 21);
        long j129 = (j112 + 1048576) >> 21;
        long j130 = j116 + j129;
        long j131 = j112 - (j129 << 21);
        long j132 = (j115 + 1048576) >> 21;
        long j133 = j119 + j132;
        long j134 = j115 - (j132 << 21);
        long j135 = (j118 + 1048576) >> 21;
        long j136 = j122 + j135;
        long j137 = j118 - (j135 << 21);
        long j138 = (j121 + 1048576) >> 21;
        long j139 = j125 + j138;
        long j140 = j121 - (j138 << 21);
        long j141 = (j124 + 1048576) >> 21;
        long j142 = j128 + j141;
        long j143 = j124 - (j141 << 21);
        long j144 = (j127 * 470296) + j113;
        long j145 = (j127 * 654183) + j131;
        long j146 = j130 - (j127 * 997805);
        long j147 = (j127 * 136657) + j134;
        long j148 = j133 - (j127 * 683901);
        long j149 = (j142 * 470296) + (j127 * 666643) + j71;
        long j150 = (j142 * 654183) + j144;
        long j151 = j145 - (j142 * 997805);
        long j152 = (j142 * 136657) + j146;
        long j153 = j147 - (j142 * 683901);
        long j154 = (j143 * 654183) + j149;
        long j155 = j152 - (j143 * 683901);
        long j156 = (j139 * 654183) + (j143 * 470296) + (j142 * 666643) + j67;
        long j157 = (j139 * 136657) + (j150 - (j143 * 997805));
        long j158 = ((j143 * 136657) + j151) - (j139 * 683901);
        long j159 = (j140 * 654183) + (j139 * 470296) + (j143 * 666643) + j68;
        long j160 = (j140 * 136657) + (j154 - (j139 * 997805));
        long j161 = j157 - (j140 * 683901);
        long j162 = (j136 * 666643) + j31;
        long j163 = (j136 * 654183) + (j140 * 470296) + (j139 * 666643) + j64;
        long j164 = (j136 * 136657) + (j156 - (j140 * 997805));
        long j165 = (j162 + 1048576) >> 21;
        long j166 = (j136 * 470296) + (j140 * 666643) + j65 + j165;
        long j167 = j162 - (j165 << 21);
        long j168 = (j163 + 1048576) >> 21;
        long j169 = (j159 - (j136 * 997805)) + j168;
        long j170 = j163 - (j168 << 21);
        long j171 = (j164 + 1048576) >> 21;
        long j172 = (j160 - (j136 * 683901)) + j171;
        long j173 = j164 - (j171 << 21);
        long j174 = (j161 + 1048576) >> 21;
        long j175 = j158 + j174;
        long j176 = j161 - (j174 << 21);
        long j177 = (j155 + 1048576) >> 21;
        long j178 = j153 + j177;
        long j179 = j155 - (j177 << 21);
        long j180 = (j148 + 1048576) >> 21;
        long j181 = j137 + j180;
        long j182 = j148 - (j180 << 21);
        long j183 = (j166 + 1048576) >> 21;
        long j184 = j170 + j183;
        long j185 = j166 - (j183 << 21);
        long j186 = (j169 + 1048576) >> 21;
        long j187 = j173 + j186;
        long j188 = j169 - (j186 << 21);
        long j189 = (j172 + 1048576) >> 21;
        long j190 = j176 + j189;
        long j191 = j172 - (j189 << 21);
        long j192 = (j175 + 1048576) >> 21;
        long j193 = j179 + j192;
        long j194 = j175 - (j192 << 21);
        long j195 = (j178 + 1048576) >> 21;
        long j196 = j182 + j195;
        long j197 = j178 - (j195 << 21);
        long j198 = (j181 + 1048576) >> 21;
        long j199 = j181 - (j198 << 21);
        long j200 = (j198 * 666643) + j167;
        long j201 = (j198 * 470296) + j185;
        long j202 = (j198 * 654183) + j184;
        long j203 = j188 - (j198 * 997805);
        long j204 = (j198 * 136657) + j187;
        long j205 = j191 - (j198 * 683901);
        long j206 = j200 >> 21;
        long j207 = j201 + j206;
        long j208 = j200 - (j206 << 21);
        long j209 = j207 >> 21;
        long j210 = j202 + j209;
        long j211 = j207 - (j209 << 21);
        long j212 = j210 >> 21;
        long j213 = j203 + j212;
        long j214 = j210 - (j212 << 21);
        long j215 = j213 >> 21;
        long j216 = j204 + j215;
        long j217 = j213 - (j215 << 21);
        long j218 = j216 >> 21;
        long j219 = j205 + j218;
        long j220 = j216 - (j218 << 21);
        long j221 = j219 >> 21;
        long j222 = j190 + j221;
        long j223 = j219 - (j221 << 21);
        long j224 = j222 >> 21;
        long j225 = j194 + j224;
        long j226 = j222 - (j224 << 21);
        long j227 = j225 >> 21;
        long j228 = j193 + j227;
        long j229 = j225 - (j227 << 21);
        long j230 = j228 >> 21;
        long j231 = j197 + j230;
        long j232 = j228 - (j230 << 21);
        long j233 = j231 >> 21;
        long j234 = j196 + j233;
        long j235 = j231 - (j233 << 21);
        long j236 = j234 >> 21;
        long j237 = j199 + j236;
        long j238 = j234 - (j236 << 21);
        long j239 = j237 >> 21;
        long j240 = j237 - (j239 << 21);
        long j241 = (666643 * j239) + j208;
        long j242 = (470296 * j239) + j211;
        long j243 = (654183 * j239) + j214;
        long j244 = j217 - (997805 * j239);
        long j245 = (136657 * j239) + j220;
        long j246 = j223 - (j239 * 683901);
        long j247 = j241 >> 21;
        long j248 = j242 + j247;
        long j249 = j241 - (j247 << 21);
        long j250 = j248 >> 21;
        long j251 = j243 + j250;
        long j252 = j248 - (j250 << 21);
        long j253 = j251 >> 21;
        long j254 = j244 + j253;
        long j255 = j251 - (j253 << 21);
        long j256 = j254 >> 21;
        long j257 = j245 + j256;
        long j258 = j254 - (j256 << 21);
        long j259 = j257 >> 21;
        long j260 = j246 + j259;
        long j261 = j257 - (j259 << 21);
        long j262 = j260 >> 21;
        long j263 = j226 + j262;
        long j264 = j260 - (j262 << 21);
        long j265 = j263 >> 21;
        long j266 = j229 + j265;
        long j267 = j263 - (j265 << 21);
        long j268 = j266 >> 21;
        long j269 = j232 + j268;
        long j270 = j266 - (j268 << 21);
        long j271 = j269 >> 21;
        long j272 = j235 + j271;
        long j273 = j269 - (j271 << 21);
        long j274 = j272 >> 21;
        long j275 = j238 + j274;
        long j276 = j272 - (j274 << 21);
        long j277 = j275 >> 21;
        long j278 = j240 + j277;
        long j279 = j275 - (j277 << 21);
        return Bytes.concat(bArrCopyOfRange2, new byte[]{(byte) j249, (byte) (j249 >> 8), (byte) ((j249 >> 16) | (j252 << 5)), (byte) (j252 >> 3), (byte) (j252 >> 11), (byte) ((j252 >> 19) | (j255 << 2)), (byte) (j255 >> 6), (byte) ((j255 >> 14) | (j258 << 7)), (byte) (j258 >> 1), (byte) (j258 >> 9), (byte) ((j258 >> 17) | (j261 << 4)), (byte) (j261 >> 4), (byte) (j261 >> 12), (byte) ((j261 >> 20) | (j264 << 1)), (byte) (j264 >> 7), (byte) ((j264 >> 15) | (j267 << 6)), (byte) (j267 >> 2), (byte) (j267 >> 10), (byte) ((j267 >> 18) | (j270 << 3)), (byte) (j270 >> 5), (byte) (j270 >> 13), (byte) j273, (byte) (j273 >> 8), (byte) ((j273 >> 16) | (j276 << 5)), (byte) (j276 >> 3), (byte) (j276 >> 11), (byte) ((j276 >> 19) | (j279 << 2)), (byte) (j279 >> 6), (byte) ((j279 >> 14) | (j278 << 7)), (byte) (j278 >> 1), (byte) (j278 >> 9), (byte) (j278 >> 17)});
    }
}
