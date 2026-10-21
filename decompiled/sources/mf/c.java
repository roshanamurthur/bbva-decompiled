package mf;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: compiled from: Ed25519Constants.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f83413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f83414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long[] f83415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b.a[][] f83416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b.a[] f83417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final BigInteger f83418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f83419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final BigInteger f83420h;

    /* JADX INFO: compiled from: Ed25519Constants.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BigInteger f83421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public BigInteger f83422b;
    }

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f83418f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        f83419g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        f83420h = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        a aVar = new a();
        BigInteger bigIntegerMod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        aVar.f83422b = bigIntegerMod3;
        BigInteger bigIntegerMultiply = bigIntegerMod3.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerMod3.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        aVar.f83421a = bigIntegerModPow2;
        f83413a = d.b(c(bigIntegerMod));
        f83414b = d.b(c(bigIntegerMod2));
        f83415c = d.b(c(bigIntegerModPow));
        f83416d = (b.a[][]) Array.newInstance((Class<?>) b.a.class, 32, 8);
        a aVarA = aVar;
        for (int i10 = 0; i10 < 32; i10++) {
            a aVarA2 = aVarA;
            for (int i11 = 0; i11 < 8; i11++) {
                f83416d[i10][i11] = b(aVarA2);
                aVarA2 = a(aVarA2, aVarA);
            }
            for (int i12 = 0; i12 < 8; i12++) {
                aVarA = a(aVarA, aVarA);
            }
        }
        a aVarA3 = a(aVar, aVar);
        f83417e = new b.a[8];
        for (int i13 = 0; i13 < 8; i13++) {
            f83417e[i13] = b(aVar);
            aVar = a(aVar, aVarA3);
        }
    }

    public static a a(a aVar, a aVar2) {
        a aVar3 = new a();
        BigInteger bigIntegerMultiply = f83419g.multiply(aVar.f83421a.multiply(aVar2.f83421a).multiply(aVar.f83422b).multiply(aVar2.f83422b));
        BigInteger bigInteger = f83418f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = aVar.f83421a.multiply(aVar2.f83422b).add(aVar2.f83421a.multiply(aVar.f83422b));
        BigInteger bigInteger2 = BigInteger.ONE;
        aVar3.f83421a = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        aVar3.f83422b = aVar.f83422b.multiply(aVar2.f83422b).add(aVar.f83421a.multiply(aVar2.f83421a)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return aVar3;
    }

    public static b.a b(a aVar) {
        BigInteger bigIntegerAdd = aVar.f83422b.add(aVar.f83421a);
        BigInteger bigInteger = f83418f;
        return new b.a(d.b(c(bigIntegerAdd.mod(bigInteger))), d.b(c(aVar.f83422b.subtract(aVar.f83421a).mod(bigInteger))), d.b(c(f83420h.multiply(aVar.f83421a).multiply(aVar.f83422b).mod(bigInteger))));
    }

    public static byte[] c(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i10 = 0; i10 < 16; i10++) {
            byte b10 = bArr[i10];
            int i11 = 31 - i10;
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }
        return bArr;
    }
}
