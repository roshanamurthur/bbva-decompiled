package org.bouncycastle.pqc.crypto.xmss;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes13.dex */
public class XMSSUtil {

    public static class a extends ObjectInputStream {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final HashSet f91425r0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Class f91426p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f91427q0;

        static {
            HashSet hashSet = new HashSet();
            f91425r0 = hashSet;
            androidx.constraintlayout.core.parser.a.d(hashSet, "java.util.TreeMap", "java.lang.Integer", "java.lang.Number", "org.bouncycastle.pqc.crypto.xmss.BDS");
            androidx.constraintlayout.core.parser.a.d(hashSet, "java.util.ArrayList", "org.bouncycastle.pqc.crypto.xmss.XMSSNode", "[B", "java.util.LinkedList");
            androidx.constraintlayout.core.parser.a.d(hashSet, "java.util.Stack", "java.util.Vector", "[Ljava.lang.Object;", "org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
        }

        public a(Class cls, ByteArrayInputStream byteArrayInputStream) throws IOException {
            super(byteArrayInputStream);
            this.f91427q0 = false;
            this.f91426p0 = cls;
        }

        @Override // java.io.ObjectInputStream
        public final Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            if (this.f91427q0) {
                if (!f91425r0.contains(objectStreamClass.getName())) {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
            } else {
                if (!objectStreamClass.getName().equals(this.f91426p0.getName())) {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
                this.f91427q0 = true;
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public static boolean areEqual(byte[][] bArr, byte[][] bArr2) {
        if (hasNullPointer(bArr) || hasNullPointer(bArr2)) {
            throw new NullPointerException("a or b == null");
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (!Arrays.areEqual(bArr[i10], bArr2[i10])) {
                return false;
            }
        }
        return true;
    }

    public static long bytesToXBigEndian(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        long j10 = 0;
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            j10 = (j10 << 8) | ((long) (bArr[i12] & 255));
        }
        return j10;
    }

    public static int calculateTau(int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (((i10 >> i12) & 1) == 0) {
                return i12;
            }
        }
        return 0;
    }

    public static byte[] cloneArray(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static void copyBytesAtOffset(byte[] bArr, byte[] bArr2, int i10) {
        if (bArr == null) {
            throw new NullPointerException("dst == null");
        }
        if (bArr2 == null) {
            throw new NullPointerException("src == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (bArr2.length + i10 > bArr.length) {
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            bArr[i10 + i11] = bArr2[i11];
        }
    }

    public static Object deserialize(byte[] bArr, Class cls) throws ClassNotFoundException, IOException {
        a aVar = new a(cls, new ByteArrayInputStream(bArr));
        Object object = aVar.readObject();
        if (aVar.available() != 0) {
            throw new IOException("unexpected data found at end of ObjectInputStream");
        }
        if (cls.isInstance(object)) {
            return object;
        }
        throw new IOException("unexpected class found in ObjectInputStream");
    }

    public static void dumpByteArray(byte[][] bArr) {
        if (hasNullPointer(bArr)) {
            throw new NullPointerException("x has null pointers");
        }
        for (byte[] bArr2 : bArr) {
            System.out.println(Hex.toHexString(bArr2));
        }
    }

    public static byte[] extractBytesAtOffset(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("src == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("length hast to be >= 0");
        }
        if (i10 + i11 > bArr.length) {
            throw new IllegalArgumentException("offset + length must not be greater then size of source array");
        }
        byte[] bArr2 = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr2[i12] = bArr[i10 + i12];
        }
        return bArr2;
    }

    public static int getDigestSize(Digest digest) {
        if (digest == null) {
            throw new NullPointerException("digest == null");
        }
        String algorithmName = digest.getAlgorithmName();
        if (algorithmName.equals("SHAKE128")) {
            return 32;
        }
        if (algorithmName.equals("SHAKE256")) {
            return 64;
        }
        return digest.getDigestSize();
    }

    public static int getLeafIndex(long j10, int i10) {
        return (int) (j10 & ((1 << i10) - 1));
    }

    public static long getTreeIndex(long j10, int i10) {
        return j10 >> i10;
    }

    public static boolean hasNullPointer(byte[][] bArr) {
        if (bArr == null) {
            return true;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean isIndexValid(int i10, long j10) {
        if (j10 >= 0) {
            return j10 < (1 << i10);
        }
        throw new IllegalStateException("index must not be negative");
    }

    public static boolean isNewAuthenticationPathNeeded(long j10, int i10, int i11) {
        return j10 != 0 && (j10 + 1) % ((long) Math.pow((double) (1 << i10), (double) i11)) == 0;
    }

    public static boolean isNewBDSInitNeeded(long j10, int i10, int i11) {
        return j10 != 0 && j10 % ((long) Math.pow((double) (1 << i10), (double) (i11 + 1))) == 0;
    }

    public static int log2(int i10) {
        int i11 = 0;
        while (true) {
            i10 >>= 1;
            if (i10 == 0) {
                return i11;
            }
            i11++;
        }
    }

    public static void longToBigEndian(long j10, byte[] bArr, int i10) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        if (bArr.length - i10 < 8) {
            throw new IllegalArgumentException("not enough space in array");
        }
        bArr[i10] = (byte) ((j10 >> 56) & 255);
        bArr[i10 + 1] = (byte) ((j10 >> 48) & 255);
        bArr[i10 + 2] = (byte) ((j10 >> 40) & 255);
        bArr[i10 + 3] = (byte) ((j10 >> 32) & 255);
        bArr[i10 + 4] = (byte) ((j10 >> 24) & 255);
        bArr[i10 + 5] = (byte) ((j10 >> 16) & 255);
        bArr[i10 + 6] = (byte) ((j10 >> 8) & 255);
        bArr[i10 + 7] = (byte) (j10 & 255);
    }

    public static byte[] serialize(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] toBytesBigEndian(long j10, int i10) {
        byte[] bArr = new byte[i10];
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            bArr[i11] = (byte) j10;
            j10 >>>= 8;
        }
        return bArr;
    }

    public static byte[][] cloneArray(byte[][] bArr) {
        if (hasNullPointer(bArr)) {
            throw new NullPointerException("in has null pointers");
        }
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte[] bArr3 = new byte[bArr[i10].length];
            bArr2[i10] = bArr3;
            byte[] bArr4 = bArr[i10];
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
        }
        return bArr2;
    }
}
