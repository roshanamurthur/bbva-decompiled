package org.bouncycastle.util;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Vector;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: loaded from: classes13.dex */
public final class Strings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f91642a;

    public static class a implements PrivilegedAction<String> {
        @Override // java.security.PrivilegedAction
        public final String run() {
            return System.getProperty("line.separator");
        }
    }

    public static class b extends ArrayList<String> implements StringList {
        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final void add(int i10, Object obj) {
            super.add(i10, (String) obj);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List, org.bouncycastle.util.StringList
        public final /* bridge */ /* synthetic */ String get(int i10) {
            return get(i10);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final Object set(int i10, Object obj) {
            return (String) super.set(i10, (String) obj);
        }

        @Override // org.bouncycastle.util.StringList
        public final String[] toStringArray() {
            int size = size();
            String[] strArr = new String[size];
            for (int i10 = 0; i10 != size; i10++) {
                strArr[i10] = get(i10);
            }
            return strArr;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(Object obj) {
            return super.add((String) obj);
        }

        @Override // org.bouncycastle.util.StringList
        public final String[] toStringArray(int i10, int i11) {
            String[] strArr = new String[i11 - i10];
            for (int i12 = i10; i12 != size() && i12 != i11; i12++) {
                strArr[i12 - i10] = get(i12);
            }
            return strArr;
        }

        @Override // org.bouncycastle.util.StringList
        public final boolean add(String str) {
            return super.add(str);
        }
    }

    static {
        try {
            try {
                f91642a = (String) AccessController.doPrivileged(new a());
            } catch (Exception unused) {
                f91642a = String.format("%n", new Object[0]);
            }
        } catch (Exception unused2) {
            f91642a = RootService.LINE_BREAK;
        }
    }

    public static char[] asCharArray(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 != length; i10++) {
            cArr[i10] = (char) (bArr[i10] & 255);
        }
        return cArr;
    }

    public static String fromByteArray(byte[] bArr) {
        return new String(asCharArray(bArr));
    }

    public static String fromUTF8ByteArray(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int iTranscodeToUTF16 = UTF8.transcodeToUTF16(bArr, cArr);
        if (iTranscodeToUTF16 >= 0) {
            return new String(cArr, 0, iTranscodeToUTF16);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    public static String lineSeparator() {
        return f91642a;
    }

    public static StringList newList() {
        return new b();
    }

    public static String[] split(String str, char c10) {
        int i10;
        Vector vector = new Vector();
        boolean z10 = true;
        while (true) {
            if (!z10) {
                break;
            }
            int iIndexOf = str.indexOf(c10);
            if (iIndexOf > 0) {
                vector.addElement(str.substring(0, iIndexOf));
                str = str.substring(iIndexOf + 1);
            } else {
                vector.addElement(str);
                z10 = false;
            }
        }
        int size = vector.size();
        String[] strArr = new String[size];
        for (i10 = 0; i10 != size; i10++) {
            strArr[i10] = (String) vector.elementAt(i10);
        }
        return strArr;
    }

    public static int toByteArray(String str, byte[] bArr, int i10) {
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i10 + i11] = (byte) str.charAt(i11);
        }
        return length;
    }

    public static String toLowerCase(String str) {
        char[] charArray = str.toCharArray();
        boolean z10 = false;
        for (int i10 = 0; i10 != charArray.length; i10++) {
            char c10 = charArray[i10];
            if ('A' <= c10 && 'Z' >= c10) {
                charArray[i10] = (char) (c10 + ' ');
                z10 = true;
            }
        }
        return z10 ? new String(charArray) : str;
    }

    public static void toUTF8ByteArray(char[] cArr, OutputStream outputStream) throws IOException {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < cArr.length) {
            char c10 = cArr[i13];
            if (c10 >= 128) {
                if (c10 < 2048) {
                    i10 = c10;
                    i11 = (c10 >> 6) | 192;
                } else {
                    if (c10 < 55296 || c10 > 57343) {
                        i10 = c10;
                        i10 = c10;
                        outputStream.write((c10 >> '\f') | 224);
                        i11 = ((c10 >> 6) & 63) | 128;
                    } else {
                        i13++;
                        if (i13 >= cArr.length) {
                            i10 = c10;
                            throw new IllegalStateException("invalid UTF-16 codepoint");
                        }
                        char c11 = cArr[i13];
                        if (c10 > 56319) {
                            i10 = c10;
                            throw new IllegalStateException("invalid UTF-16 codepoint");
                        }
                        i10 = c10;
                        int i14 = (((c10 & 1023) << 10) | (c11 & 1023)) + 65536;
                        outputStream.write((i14 >> 18) | 240);
                        outputStream.write(((i14 >> 12) & 63) | 128);
                        outputStream.write(((i14 >> 6) & 63) | 128);
                        i12 = i14;
                    }
                    i10 = (i12 & 63) | 128;
                }
                outputStream.write(i11);
                i12 = c10;
                i10 = (i12 & 63) | 128;
            }
            i10 = c10;
            outputStream.write(i10);
            i13++;
        }
    }

    public static String toUpperCase(String str) {
        char[] charArray = str.toCharArray();
        boolean z10 = false;
        for (int i10 = 0; i10 != charArray.length; i10++) {
            char c10 = charArray[i10];
            if ('a' <= c10 && 'z' >= c10) {
                charArray[i10] = (char) (c10 - ' ');
                z10 = true;
            }
        }
        return z10 ? new String(charArray) : str;
    }

    public static byte[] toByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 != length; i10++) {
            bArr[i10] = (byte) str.charAt(i10);
        }
        return bArr;
    }

    public static byte[] toUTF8ByteArray(String str) {
        return toUTF8ByteArray(str.toCharArray());
    }

    public static byte[] toByteArray(char[] cArr) {
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 != length; i10++) {
            bArr[i10] = (byte) cArr[i10];
        }
        return bArr;
    }

    public static byte[] toUTF8ByteArray(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            toUTF8ByteArray(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }
}
