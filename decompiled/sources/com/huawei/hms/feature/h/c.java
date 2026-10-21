package com.huawei.hms.feature.h;

import android.annotation.TargetApi;
import android.util.Pair;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.o1;
import androidx.camera.camera2.internal.compat.u;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.v;
import androidx.camera.core.processing.f;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.huawei.hms.feature.utils.Logger;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class c {
    private static HashMap<Integer, Pair<String, Integer>> A = new HashMap<>();
    private static HashMap<Integer, C0226c> B = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50349a = "feature_verifier";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f50350b = 1048576;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f50351c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f50352d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f50353e = 257;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f50354f = 258;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f50355g = 259;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f50356h = 260;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f50357i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f50358j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f50359k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f50360l = 24;
    private static final int m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f50361n = 513;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f50362o = 514;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f50363p = 769;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f50364q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f50365r = 1024;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f50366s = 32;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f50367t = 1896449818;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f50368u = "r";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f50369v = "X.509";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final long f50370w = 3617552046287187010L;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final long f50371x = 2334950737559900225L;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f50372y = 32;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f50373z = 64;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f50374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteBuffer f50375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f50376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f50377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f50378e;

        private b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, long j10, long j11, long j12) {
            this.f50374a = byteBuffer;
            this.f50377d = j10;
            this.f50378e = j11;
            this.f50376c = j12;
            this.f50375b = byteBuffer2;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.feature.h.c$c, reason: collision with other inner class name */
    public static class C0226c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f50379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f50380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f50381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        PSSParameterSpec f50382d;

        public C0226c(String str, String str2, int i10, PSSParameterSpec pSSParameterSpec) {
            this.f50379a = str;
            this.f50380b = str2;
            this.f50381c = i10;
            this.f50382d = pSSParameterSpec;
        }
    }

    static {
        A.put(1, new Pair<>("SHA-256", 32));
        A.put(2, new Pair<>("SHA-512", 64));
        B.put(257, new C0226c("RSA", "SHA256withRSA/PSS", 1, new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1)));
        B.put(Integer.valueOf(f50354f), new C0226c("RSA", "SHA512withRSA/PSS", 2, new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1)));
        B.put(259, new C0226c("RSA", ConstantKt.ALGORITHM_VERIFY_SIGNATURE, 1, null));
        B.put(Integer.valueOf(f50356h), new C0226c("RSA", "SHA512withRSA", 2, null));
        B.put(513, new C0226c(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC, "SHA256withECDSA", 1, null));
        B.put(Integer.valueOf(f50362o), new C0226c(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC, "SHA512withECDSA", 2, null));
        B.put(Integer.valueOf(f50363p), new C0226c("DSA", "SHA256withDSA", 1, null));
    }

    private static int a(int i10, int i11) {
        int iC = c(i10);
        int iC2 = c(i11);
        if (iC == 2 && iC2 == 1) {
            return 1;
        }
        if (iC == 2 && iC2 == 2) {
            return 0;
        }
        if (iC == 1 && iC2 == 1) {
            return 0;
        }
        if (iC == 1 && iC2 == 2) {
            return -1;
        }
        throw new IllegalArgumentException("digestAlgorithm illegal: ");
    }

    private static int b(int i10) {
        if (A.containsKey(Integer.valueOf(i10))) {
            return ((Integer) A.get(Integer.valueOf(i10)).second).intValue();
        }
        throw new IllegalArgumentException(g0.c("illegal algorithm: ", i10));
    }

    private static int c(int i10) {
        if (B.containsKey(Integer.valueOf(i10))) {
            return B.get(Integer.valueOf(i10)).f50381c;
        }
        throw new IllegalArgumentException(f.d("digestChunk error: 0x", Long.toHexString(i10)));
    }

    private static String d(int i10) {
        if (B.containsKey(Integer.valueOf(i10))) {
            return B.get(Integer.valueOf(i10)).f50379a;
        }
        throw new IllegalArgumentException(f.d("illegal algorithmStr: 0x", Long.toHexString(i10)));
    }

    private static C0226c e(int i10) {
        if (B.containsKey(Integer.valueOf(i10))) {
            return B.get(Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(f.d("illegal algorithm: 0x", Long.toHexString(i10)));
    }

    private static MessageDigest f(int i10) throws DigestException {
        String strA = a(i10);
        try {
            return MessageDigest.getInstance(strA);
        } catch (NoSuchAlgorithmException e5) {
            throw new DigestException(u.f(strA, " digest not supported"), e5);
        }
    }

    private static long a(ByteBuffer byteBuffer, long j10) throws SecurityException {
        long jC = com.huawei.hms.feature.h.b.c(byteBuffer);
        if (jC > j10) {
            throw new SecurityException("centralDirOffset too large: ");
        }
        if (com.huawei.hms.feature.h.b.b(byteBuffer) + jC == j10) {
            return jC;
        }
        throw new SecurityException("ZIP Central Directory not equals eocdOffset");
    }

    private static com.huawei.hms.feature.h.b.a a(RandomAccessFile randomAccessFile, long j10) throws IOException, SecurityException {
        if (j10 < 32) {
            throw new SecurityException("APK too small");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        randomAccessFile.seek(j10 - ((long) byteBufferAllocate.capacity()));
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        if (f50371x != byteBufferAllocate.getLong(8) || f50370w != byteBufferAllocate.getLong(16)) {
            throw new SecurityException("signing block empty");
        }
        long j11 = byteBufferAllocate.getLong(0);
        if (j11 < byteBufferAllocate.capacity() || j11 > 2147483639) {
            throw new SecurityException("signing block size error: ");
        }
        int i10 = (int) (8 + j11);
        long j12 = j10 - ((long) i10);
        if (j12 < 0) {
            throw new SecurityException("signing block offset error");
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i10);
        byteBufferAllocate2.order(byteOrder);
        randomAccessFile.seek(j12);
        randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
        if (j11 == byteBufferAllocate2.getLong(0)) {
            return new com.huawei.hms.feature.h.b.a(byteBufferAllocate2, Long.valueOf(j12));
        }
        throw new SecurityException("signing block sizes not match: ");
    }

    private static b a(RandomAccessFile randomAccessFile) throws IOException, SecurityException {
        com.huawei.hms.feature.h.b.a aVarA = com.huawei.hms.feature.h.b.a(randomAccessFile);
        if (com.huawei.hms.feature.h.b.a(randomAccessFile, aVarA.f50348b.longValue())) {
            throw new SecurityException("not supported ZIP64 ");
        }
        long jA = a(aVarA.f50347a, aVarA.f50348b.longValue());
        com.huawei.hms.feature.h.b.a aVarA2 = a(randomAccessFile, jA);
        return new b(a(aVarA2.f50347a), aVarA.f50347a, aVarA2.f50348b.longValue(), jA, aVarA.f50348b.longValue());
    }

    private static String a(int i10) {
        if (A.containsKey(Integer.valueOf(i10))) {
            return (String) A.get(Integer.valueOf(i10)).first;
        }
        throw new IllegalArgumentException(g0.c("illegal algorithm: ", i10));
    }

    private static ByteBuffer b(ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining < 4) {
            throw new IOException(g0.c("illegal source remaining:", iRemaining));
        }
        int i10 = byteBuffer.getInt();
        if (i10 < 0 || i10 > iRemaining) {
            throw new IllegalArgumentException("illegal source length");
        }
        return com.huawei.hms.feature.h.b.a(byteBuffer, i10);
    }

    private static List<X509Certificate> c(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBufferB = b(byteBuffer);
        ArrayList arrayList = new ArrayList();
        while (byteBufferB.hasRemaining()) {
            byte[] bArrD = d(byteBufferB);
            try {
                arrayList.add(new d.a((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArrD)), bArrD));
            } catch (CertificateException e5) {
                throw new SecurityException("decode certificate failed", e5);
            }
        }
        if (arrayList.isEmpty()) {
            throw new SecurityException("certificates empty");
        }
        return arrayList;
    }

    private static byte[] d(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        int iRemaining = byteBuffer.remaining();
        if (i10 < 0 || i10 > byteBuffer.remaining()) {
            throw new IOException(g0.c("illegal buf ", iRemaining));
        }
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return bArr;
    }

    private static ByteBuffer a(ByteBuffer byteBuffer) throws SecurityException {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("order must little endian");
        }
        ByteBuffer byteBufferA = com.huawei.hms.feature.h.b.a(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i10 = 0;
        while (byteBufferA.hasRemaining()) {
            i10++;
            if (byteBufferA.remaining() < 8) {
                throw new SecurityException("illegal data");
            }
            long j10 = byteBufferA.getLong();
            if (j10 < 4 || j10 > 2147483647L) {
                throw new SecurityException("signing block entry #" + i10 + " size out of range: " + j10);
            }
            int i11 = (int) j10;
            int iPosition = byteBufferA.position() + i11;
            if (i11 > byteBufferA.remaining()) {
                StringBuilder sbC = o1.c("signing block out of range: ", i11, ",available: ");
                sbC.append(byteBufferA.remaining());
                throw new SecurityException(sbC.toString());
            }
            if (byteBufferA.getInt() == f50367t) {
                return com.huawei.hms.feature.h.b.a(byteBufferA, i11 - 4);
            }
            byteBufferA.position(iPosition);
        }
        throw new SecurityException("no signature scheme v2 block");
    }

    private static void a(ByteBuffer byteBuffer, byte[] bArr, int i10, byte[] bArr2) {
        C0226c c0226cE = e(i10);
        try {
            String strD = d(i10);
            Signature signature = Signature.getInstance(c0226cE.f50380b);
            signature.initVerify(KeyFactory.getInstance(strD).generatePublic(new X509EncodedKeySpec(bArr)));
            PSSParameterSpec pSSParameterSpec = c0226cE.f50382d;
            if (pSSParameterSpec != null) {
                signature.setParameter(pSSParameterSpec);
            }
            signature.update(byteBuffer);
            if (!signature.verify(bArr2)) {
                throw new SecurityException(ad.d.f(new StringBuilder(), c0226cE.f50380b, " signature not verify"));
            }
        } catch (InvalidAlgorithmParameterException e5) {
            e = e5;
            throw new SecurityException(ad.d.f(new StringBuilder(), c0226cE.f50380b, " signature verify error"), e);
        } catch (InvalidKeyException e7) {
            e = e7;
            throw new SecurityException(ad.d.f(new StringBuilder(), c0226cE.f50380b, " signature verify error"), e);
        } catch (NoSuchAlgorithmException e10) {
            e = e10;
            throw new SecurityException(ad.d.f(new StringBuilder(), c0226cE.f50380b, " signature verify error"), e);
        } catch (SignatureException e11) {
            e = e11;
            throw new SecurityException(ad.d.f(new StringBuilder(), c0226cE.f50380b, " signature verify error"), e);
        } catch (InvalidKeySpecException e12) {
            e = e12;
            throw new SecurityException(ad.d.f(new StringBuilder(), c0226cE.f50380b, " signature verify error"), e);
        }
    }

    private static void a(Map<Integer, byte[]> map, com.huawei.hms.feature.h.a[] aVarArr) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        int size = map.size();
        int[] iArr = new int[size];
        ArrayList arrayList = new ArrayList(map.keySet());
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        try {
            byte[][] bArrA = a(iArr, aVarArr);
            for (int i11 = 0; i11 < size; i11++) {
                if (!MessageDigest.isEqual(bArrA[i11], map.get(Integer.valueOf(iArr[i11])))) {
                    throw new SecurityException("different digest contents");
                }
            }
        } catch (DigestException e5) {
            throw new SecurityException("compute digest error", e5);
        }
    }

    private static void a(int[] iArr, com.huawei.hms.feature.h.a[] aVarArr, byte[][] bArr) throws DigestException {
        int[] iArr2 = iArr;
        int length = iArr2.length;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i10 = 0;
        for (int i11 = 0; i11 < iArr2.length; i11++) {
            messageDigestArr[i11] = f(iArr2[i11]);
        }
        byte[] bArr2 = new byte[5];
        bArr2[0] = -91;
        int i12 = 0;
        int i13 = 0;
        while (i12 < aVarArr.length) {
            long size = aVarArr[i12].size();
            long j10 = 0;
            long j11 = 0;
            while (size > j10) {
                int iMin = (int) Math.min(size, 1048576L);
                com.huawei.hms.feature.h.b.a(iMin, bArr2, 1);
                for (int i14 = i10; i14 < length; i14++) {
                    messageDigestArr[i14].update(bArr2);
                }
                try {
                    aVarArr[i12].a(messageDigestArr, j11, iMin);
                    int i15 = 0;
                    while (i15 < iArr2.length) {
                        int i16 = iArr2[i15];
                        byte[] bArr3 = bArr[i15];
                        int iB = b(i16);
                        if (messageDigestArr[i15].digest(bArr3, (i13 * iB) + 5, iB) != iB) {
                            throw new DigestException("unexpected digest size");
                        }
                        i15++;
                        iArr2 = iArr;
                    }
                    long j12 = iMin;
                    j11 += j12;
                    size -= j12;
                    i13++;
                    i10 = 0;
                    j10 = 0;
                    iArr2 = iArr;
                    aVarArr = aVarArr;
                } catch (IOException e5) {
                    throw new DigestException(n1.e("digest error chunk ", i13, " of section ", i12), e5);
                }
            }
            i12++;
            i10 = 0;
            iArr2 = iArr;
        }
    }

    private static byte[] a(ByteBuffer byteBuffer, int i10, List<Integer> list) throws IOException {
        ByteBuffer byteBufferB = b(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrD = null;
        while (byteBufferB.hasRemaining()) {
            try {
                ByteBuffer byteBufferB2 = b(byteBufferB);
                if (byteBufferB2.remaining() < 8) {
                    throw new IOException("Record too short");
                }
                int i11 = byteBufferB2.getInt();
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i10) {
                    bArrD = d(byteBufferB2);
                }
            } catch (IOException e5) {
                e = e5;
                throw new IOException("parse digest Failed ", e);
            } catch (BufferUnderflowException e7) {
                e = e7;
                throw new IOException("parse digest Failed ", e);
            }
        }
        if (arrayList.equals(list)) {
            return bArrD;
        }
        throw new SecurityException("failed to match signature algorithms");
    }

    private static X509Certificate[] a(ByteBuffer byteBuffer, int i10, List<Integer> list, Map<Integer, byte[]> map, byte[] bArr) throws IOException, SecurityException {
        byteBuffer.clear();
        byte[] bArrA = a(byteBuffer, i10, list);
        byte[] bArrPut = map.put(Integer.valueOf(c(i10)), bArrA);
        if (bArrPut != null && !MessageDigest.isEqual(bArrPut, bArrA)) {
            throw new SecurityException("digest not match");
        }
        List<X509Certificate> listC = c(byteBuffer);
        if (Arrays.equals(bArr, listC.get(0).getPublicKey().getEncoded())) {
            return (X509Certificate[]) listC.toArray(new X509Certificate[listC.size()]);
        }
        throw new SecurityException("Failed to match Public key");
    }

    private static X509Certificate[] a(ByteBuffer byteBuffer, Map<Integer, byte[]> map) throws IOException, SecurityException {
        ByteBuffer byteBufferB = b(byteBuffer);
        ByteBuffer byteBufferB2 = b(byteBuffer);
        byte[] bArrD = d(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrD2 = null;
        int i10 = -1;
        while (byteBufferB2.hasRemaining()) {
            try {
                ByteBuffer byteBufferB3 = b(byteBufferB2);
                if (byteBufferB3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i11 = byteBufferB3.getInt();
                arrayList.add(Integer.valueOf(i11));
                if (B.containsKey(Integer.valueOf(i11)) && (i10 == -1 || a(i11, i10) > 0)) {
                    bArrD2 = d(byteBufferB3);
                    i10 = i11;
                }
            } catch (IOException e5) {
                e = e5;
                throw new SecurityException("parse signature failed", e);
            } catch (BufferUnderflowException e7) {
                e = e7;
                throw new SecurityException("parse signature failed", e);
            }
        }
        if (i10 == -1) {
            throw new SecurityException("signatures found error");
        }
        a(byteBufferB, bArrD, i10, bArrD2);
        return a(byteBufferB, i10, arrayList, map, bArrD);
    }

    private static byte[][] a(int[] iArr, com.huawei.hms.feature.h.a[] aVarArr) throws DigestException {
        long size = 0;
        for (com.huawei.hms.feature.h.a aVar : aVarArr) {
            size += (aVar.size() + 1048575) / 1048576;
        }
        if (size >= 2097151) {
            throw new DigestException(v.c("chunks too large: ", size));
        }
        int i10 = (int) size;
        int length = iArr.length;
        byte[][] bArr = new byte[length][];
        for (int i11 = 0; i11 < length; i11++) {
            byte[] bArr2 = new byte[(b(iArr[i11]) * i10) + 5];
            bArr2[0] = 90;
            com.huawei.hms.feature.h.b.a(i10, bArr2, 1);
            bArr[i11] = bArr2;
        }
        a(iArr, aVarArr, bArr);
        byte[][] bArr3 = new byte[iArr.length][];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            bArr3[i12] = f(iArr[i12]).digest(bArr[i12]);
        }
        return bArr3;
    }

    @TargetApi(19)
    public static X509Certificate[][] a(String str) throws IOException, SecurityException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, f50368u);
        try {
            X509Certificate[][] x509CertificateArrA = a(randomAccessFile.getChannel(), a(randomAccessFile));
            randomAccessFile.close();
            return x509CertificateArrA;
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static X509Certificate[][] a(FileChannel fileChannel, b bVar) throws SecurityException {
        String str;
        try {
            ByteBuffer byteBufferB = b(bVar.f50374a);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (byteBufferB.hasRemaining()) {
                i10++;
                try {
                    arrayList.add(a(b(byteBufferB), map));
                } catch (IOException | SecurityException | BufferUnderflowException unused) {
                    return null;
                }
            }
            if (i10 >= 1 && !map.isEmpty()) {
                com.huawei.hms.feature.h.a.b bVar2 = new com.huawei.hms.feature.h.a.b(fileChannel, 0L, bVar.f50377d);
                com.huawei.hms.feature.h.a.b bVar3 = new com.huawei.hms.feature.h.a.b(fileChannel, bVar.f50378e, bVar.f50376c - bVar.f50378e);
                ByteBuffer byteBufferDuplicate = bVar.f50375b.duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                com.huawei.hms.feature.h.b.a(byteBufferDuplicate, bVar.f50377d);
                a(map, new com.huawei.hms.feature.h.a[]{bVar2, bVar3, new com.huawei.hms.feature.h.a.C0225a(byteBufferDuplicate)});
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            }
            str = "signer empty ";
            Logger.e(f50349a, str);
            return null;
        } catch (IOException unused2) {
            str = "signers error ";
        }
    }
}
