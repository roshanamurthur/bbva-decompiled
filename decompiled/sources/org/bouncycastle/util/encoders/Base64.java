package org.bouncycastle.util.encoders;

import ci.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes13.dex */
public class Base64 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Base64Encoder f91643a = new Base64Encoder();

    public static int decode(String str, OutputStream outputStream) throws IOException {
        return f91643a.decode(str, outputStream);
    }

    public static int encode(byte[] bArr, int i10, int i11, OutputStream outputStream) throws IOException {
        return f91643a.encode(bArr, i10, i11, outputStream);
    }

    public static String toBase64String(byte[] bArr) {
        return toBase64String(bArr, 0, bArr.length);
    }

    public static int decode(byte[] bArr, int i10, int i11, OutputStream outputStream) {
        try {
            return f91643a.decode(bArr, i10, i11, outputStream);
        } catch (Exception e5) {
            throw new DecoderException(a.b(e5, new StringBuilder("unable to decode base64 data: ")), e5);
        }
    }

    public static int encode(byte[] bArr, OutputStream outputStream) throws IOException {
        return f91643a.encode(bArr, 0, bArr.length, outputStream);
    }

    public static String toBase64String(byte[] bArr, int i10, int i11) {
        return Strings.fromByteArray(encode(bArr, i10, i11));
    }

    public static byte[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public static byte[] encode(byte[] bArr, int i10, int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((i11 + 2) / 3) * 4);
        try {
            f91643a.encode(bArr, i10, i11, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e5) {
            throw new EncoderException(a.b(e5, new StringBuilder("exception encoding base64 string: ")), e5);
        }
    }

    public static byte[] decode(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            f91643a.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e5) {
            throw new DecoderException(a.b(e5, new StringBuilder("unable to decode base64 string: ")), e5);
        }
    }

    public static byte[] decode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((bArr.length / 4) * 3);
        try {
            f91643a.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e5) {
            throw new DecoderException(a.b(e5, new StringBuilder("unable to decode base64 data: ")), e5);
        }
    }
}
