package com.google.android.play.core.splitinstall.internal;

import android.util.Pair;
import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.h0;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.v;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
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
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzi {
    public static int a(int i10) {
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(g0.c("Unknown content digest algorthm: ", i10));
    }

    public static int b(int i10) {
        if (i10 == 513) {
            return 1;
        }
        if (i10 == 514) {
            return 2;
        }
        if (i10 == 769) {
            return 1;
        }
        switch (i10) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
        }
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "SHA-256";
        }
        if (i10 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(g0.c("Unknown content digest algorthm: ", i10));
    }

    public static ByteBuffer d(int i10, ByteBuffer byteBuffer) throws BufferUnderflowException {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (i11 < iPosition || i11 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i11);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i11);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static ByteBuffer e(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(g0.c("Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
        }
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            return d(i10, byteBuffer);
        }
        throw new IOException(n1.e("Length-prefixed field longer than remaining buffer. Field length: ", i10, ", remaining: ", byteBuffer.remaining()));
    }

    public static void f(int i10, byte[] bArr) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >>> 8) & 255);
        bArr[3] = (byte) ((i10 >>> 16) & 255);
        bArr[4] = (byte) (i10 >> 24);
    }

    public static byte[] g(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IOException("Negative length");
        }
        if (i10 > byteBuffer.remaining()) {
            throw new IOException(n1.e("Underflow while reading length-prefixed value. Length: ", i10, ", available: ", byteBuffer.remaining()));
        }
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static X509Certificate[] h(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws IOException, SecurityException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferE = e(byteBuffer);
        ByteBuffer byteBufferE2 = e(byteBuffer);
        byte[] bArrG = g(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrG2 = null;
        byte[] bArrG3 = null;
        int i10 = -1;
        int i11 = 0;
        while (byteBufferE2.hasRemaining()) {
            i11++;
            try {
                ByteBuffer byteBufferE3 = e(byteBufferE2);
                if (byteBufferE3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i12 = byteBufferE3.getInt();
                arrayList.add(Integer.valueOf(i12));
                if (i12 != 513 && i12 != 514 && i12 != 769) {
                    switch (i12) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i10 != -1) {
                    int iB = b(i12);
                    int iB2 = b(i10);
                    if (iB != 1 && iB2 == 1) {
                    }
                }
                bArrG3 = g(byteBufferE3);
                i10 = i12;
            } catch (IOException e5) {
                e = e5;
                throw new SecurityException(g0.c("Failed to parse signature record #", i11), e);
            } catch (BufferUnderflowException e7) {
                e = e7;
                throw new SecurityException(g0.c("Failed to parse signature record #", i11), e);
            }
        }
        if (i10 == -1) {
            if (i11 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i10 == 513 || i10 == 514) {
            str = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        } else if (i10 != 769) {
            switch (i10) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
            }
        } else {
            str = "DSA";
        }
        if (i10 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i10 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i10 != 769) {
            switch (i10) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create(ConstantKt.ALGORITHM_VERIFY_SIGNATURE, null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrG));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferE);
            if (!signature.verify(bArrG3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferE.clear();
            ByteBuffer byteBufferE4 = e(byteBufferE);
            ArrayList arrayList2 = new ArrayList();
            int i13 = 0;
            while (byteBufferE4.hasRemaining()) {
                i13++;
                try {
                    ByteBuffer byteBufferE5 = e(byteBufferE4);
                    if (byteBufferE5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i14 = byteBufferE5.getInt();
                    arrayList2.add(Integer.valueOf(i14));
                    if (i14 == i10) {
                        bArrG2 = g(byteBufferE5);
                    }
                } catch (IOException e10) {
                    e = e10;
                    throw new IOException(g0.c("Failed to parse digest record #", i13), e);
                } catch (BufferUnderflowException e11) {
                    e = e11;
                    throw new IOException(g0.c("Failed to parse digest record #", i13), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iB3 = b(i10);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iB3), bArrG2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrG2)) {
                throw new SecurityException(c(iB3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferE6 = e(byteBufferE);
            ArrayList arrayList3 = new ArrayList();
            int i15 = 0;
            while (byteBufferE6.hasRemaining()) {
                i15++;
                byte[] bArrG4 = g(byteBufferE6);
                try {
                    arrayList3.add(new p((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrG4)), bArrG4));
                } catch (CertificateException e12) {
                    throw new SecurityException(g0.c("Failed to decode certificate #", i15), e12);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrG, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e13) {
            e = e13;
            throw new SecurityException(h0.b("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e14) {
            e = e14;
            throw new SecurityException(h0.b("Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e15) {
            e = e15;
            throw new SecurityException(h0.b("Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e16) {
            e = e16;
            throw new SecurityException(h0.b("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e17) {
            e = e17;
            throw new SecurityException(h0.b("Failed to verify ", str2, " signature"), e);
        }
    }

    public static byte[][] i(int[] iArr, g[] gVarArr) throws DigestException {
        long j10;
        int i10;
        int length;
        long j11 = 0;
        int i11 = 0;
        long jZza = 0;
        while (true) {
            j10 = 1048576;
            if (i11 >= 3) {
                break;
            }
            jZza += (gVarArr[i11].zza() + 1048575) / 1048576;
            i11++;
        }
        if (jZza >= 2097151) {
            throw new DigestException(v.c("Too many chunks: ", jZza));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i12 = 0;
        while (true) {
            length = iArr.length;
            if (i12 >= length) {
                break;
            }
            int i13 = (int) jZza;
            byte[] bArr2 = new byte[(a(iArr[i12]) * i13) + 5];
            bArr2[0] = 90;
            f(i13, bArr2);
            bArr[i12] = bArr2;
            i12++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            String strC = c(iArr[i14]);
            try {
                messageDigestArr[i14] = MessageDigest.getInstance(strC);
            } catch (NoSuchAlgorithmException e5) {
                throw new RuntimeException(strC.concat(" digest not supported"), e5);
            }
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (i10 = 3; i15 < i10; i10 = 3) {
            g gVar = gVarArr[i15];
            int i18 = i16;
            long j12 = j11;
            int i19 = i15;
            long jZza2 = gVar.zza();
            while (jZza2 > j11) {
                int iMin = (int) Math.min(jZza2, j10);
                f(iMin, bArr3);
                for (int i20 = 0; i20 < length; i20++) {
                    messageDigestArr[i20].update(bArr3);
                }
                try {
                    gVar.a(messageDigestArr, j12, iMin);
                    int i21 = 0;
                    while (i21 < iArr.length) {
                        int i22 = iArr[i21];
                        byte[] bArr4 = bArr[i21];
                        int iA = a(i22);
                        g gVar2 = gVar;
                        MessageDigest messageDigest = messageDigestArr[i21];
                        byte[] bArr5 = bArr3;
                        int iDigest = messageDigest.digest(bArr4, (i18 * iA) + 5, iA);
                        if (iDigest != iA) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i21++;
                        gVar = gVar2;
                        bArr3 = bArr5;
                    }
                    g gVar3 = gVar;
                    long j13 = iMin;
                    j12 += j13;
                    jZza2 -= j13;
                    i18++;
                    gVar = gVar3;
                    j11 = 0;
                    j10 = 1048576;
                } catch (IOException e7) {
                    throw new DigestException(n1.e("Failed to digest chunk #", i18, " of section #", i17), e7);
                }
            }
            i16 = i18;
            i17++;
            i15 = i19 + 1;
            j11 = 0;
            j10 = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i23 = 0; i23 < iArr.length; i23++) {
            int i24 = iArr[i23];
            byte[] bArr7 = bArr[i23];
            String strC2 = c(i24);
            try {
                bArr6[i23] = MessageDigest.getInstance(strC2).digest(bArr7);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(strC2.concat(" digest not supported"), e10);
            }
        }
        return bArr6;
    }

    public static X509Certificate[][] j(FileChannel fileChannel, o oVar) throws SecurityException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(ConstantKt.CERTIFICATE_TYPE_X509);
            try {
                ByteBuffer byteBufferE = e(oVar.f46271a);
                int i10 = 0;
                while (byteBufferE.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(h(e(byteBufferE), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e5) {
                        throw new SecurityException(androidx.camera.core.impl.utils.b.a("Failed to parse/verify signer #", i10, " block"), e5);
                    }
                }
                if (i10 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j10 = oVar.f46272b;
                long j11 = oVar.f46273c;
                if (map.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                n nVar = new n(fileChannel, 0L, j10);
                n nVar2 = new n(fileChannel, j11, oVar.f46274d - j11);
                ByteBuffer byteBufferDuplicate = oVar.f46275e.duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                zzj.zzd(byteBufferDuplicate, j10);
                a aVar = new a(byteBufferDuplicate);
                int size = map.size();
                int[] iArr = new int[size];
                Iterator it = map.keySet().iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    iArr[i11] = ((Integer) it.next()).intValue();
                    i11++;
                }
                try {
                    byte[][] bArrI = i(iArr, new g[]{nVar, nVar2, aVar});
                    for (int i12 = 0; i12 < size; i12++) {
                        int i13 = iArr[i12];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i13)), bArrI[i12])) {
                            throw new SecurityException(c(i13).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e7) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e7);
                }
            } catch (IOException e10) {
                throw new SecurityException("Failed to read list of signers", e10);
            }
        } catch (CertificateException e11) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v8, types: [android.util.Pair] */
    public static X509Certificate[][] zza(String str) throws zzf, SecurityException, IOException {
        ?? A;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() < 22) {
                A = 0;
            } else {
                Pair pairA = zzj.a(randomAccessFile, 0);
                A = pairA != null ? pairA : zzj.a(randomAccessFile, 65535);
            }
            try {
                if (A == 0) {
                    throw new zzf("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
                }
                ByteBuffer byteBuffer = (ByteBuffer) ((Pair) A).first;
                long jLongValue = ((Long) ((Pair) A).second).longValue();
                long j10 = (-20) + jLongValue;
                if (j10 >= 0) {
                    randomAccessFile.seek(j10);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new zzf("ZIP64 APK not supported");
                    }
                }
                long jZza = zzj.zza(byteBuffer);
                if (jZza >= jLongValue) {
                    throw new zzf("ZIP Central Directory offset out of range: " + jZza + ". ZIP End of Central Directory offset: " + jLongValue);
                }
                if (jZza + zzj.zzb(byteBuffer) != jLongValue) {
                    throw new zzf("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (jZza < 32) {
                    throw new zzf("APK too small for APK Signing Block. ZIP Central Directory offset: " + jZza);
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                long j11 = jLongValue;
                randomAccessFile.seek(jZza - ((long) byteBufferAllocate.capacity()));
                randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                    throw new zzf("No APK Signing Block before ZIP Central Directory");
                }
                long j12 = byteBufferAllocate.getLong(0);
                if (j12 < byteBufferAllocate.capacity() || j12 > 2147483639) {
                    throw new zzf("APK Signing Block size out of range: " + j12);
                }
                int i10 = (int) (8 + j12);
                long j13 = jZza - ((long) i10);
                if (j13 < 0) {
                    throw new zzf("APK Signing Block offset out of range: " + j13);
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i10);
                byteBufferAllocate2.order(byteOrder);
                randomAccessFile.seek(j13);
                randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                long j14 = jZza;
                long j15 = byteBufferAllocate2.getLong(0);
                if (j15 != j12) {
                    throw new zzf("APK Signing Block sizes in header and footer do not match: " + j15 + " vs " + j12);
                }
                Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j13));
                ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
                long jLongValue2 = ((Long) pairCreate.second).longValue();
                if (byteBuffer2.order() != byteOrder) {
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                int iCapacity = byteBuffer2.capacity() - 24;
                if (iCapacity < 8) {
                    throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
                }
                int iCapacity2 = byteBuffer2.capacity();
                if (iCapacity > byteBuffer2.capacity()) {
                    throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
                }
                int iLimit = byteBuffer2.limit();
                int iPosition = byteBuffer2.position();
                int i11 = 0;
                try {
                    byteBuffer2.position(0);
                    try {
                        byteBuffer2.limit(iCapacity);
                        byteBuffer2.position(8);
                        ByteBuffer byteBufferSlice = byteBuffer2.slice();
                        byteBufferSlice.order(byteBuffer2.order());
                        byteBuffer2.position(0);
                        byteBuffer2.limit(iLimit);
                        byteBuffer2.position(iPosition);
                        int i12 = 0;
                        while (byteBufferSlice.hasRemaining()) {
                            i12++;
                            if (byteBufferSlice.remaining() < 8) {
                                throw new zzf("Insufficient data to read size of APK Signing Block entry #" + i12);
                            }
                            long j16 = byteBufferSlice.getLong();
                            if (j16 < 4 || j16 > 2147483647L) {
                                throw new zzf("APK Signing Block entry #" + i12 + " size out of range: " + j16);
                            }
                            int i13 = (int) j16;
                            int iPosition2 = byteBufferSlice.position() + i13;
                            if (i13 > byteBufferSlice.remaining()) {
                                throw new zzf("APK Signing Block entry #" + i12 + " size out of range: " + i13 + ", available: " + byteBufferSlice.remaining());
                            }
                            if (byteBufferSlice.getInt() == 1896449818) {
                                X509Certificate[][] x509CertificateArrJ = j(randomAccessFile.getChannel(), new o(d(i13 - 4, byteBufferSlice), jLongValue2, j14, j11, byteBuffer));
                                randomAccessFile.close();
                                try {
                                    randomAccessFile.close();
                                } catch (IOException unused) {
                                }
                                return x509CertificateArrJ;
                            }
                            long j17 = j11;
                            long j18 = j14;
                            byteBufferSlice.position(iPosition2);
                            j14 = j18;
                            j11 = j17;
                        }
                        throw new zzf("No APK Signature Scheme v2 block in APK Signing Block");
                    } catch (Throwable th2) {
                        th = th2;
                        i11 = 0;
                        byteBuffer2.position(i11);
                        byteBuffer2.limit(iLimit);
                        byteBuffer2.position(iPosition);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            A = randomAccessFile;
        }
        try {
            A.close();
        } catch (IOException unused2) {
        }
        throw th;
    }
}
