package org.bouncycastle.util.encoders;

import ci.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes13.dex */
public class Hex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HexEncoder f91646a = new HexEncoder();

    public static int decode(String str, OutputStream outputStream) throws IOException {
        return f91646a.decode(str, outputStream);
    }

    public static byte[] decodeStrict(String str) {
        try {
            return f91646a.a(str, 0, str.length());
        } catch (Exception e5) {
            throw new DecoderException(a.b(e5, new StringBuilder("exception decoding Hex string: ")), e5);
        }
    }

    public static int encode(byte[] bArr, int i10, int i11, OutputStream outputStream) throws IOException {
        return f91646a.encode(bArr, i10, i11, outputStream);
    }

    public static String toHexString(byte[] bArr) {
        return toHexString(bArr, 0, bArr.length);
    }

    public static byte[] decode(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f91646a.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e5) {
            throw new DecoderException(a.b(e5, new StringBuilder("exception decoding Hex string: ")), e5);
        }
    }

    public static int encode(byte[] bArr, OutputStream outputStream) throws IOException {
        return f91646a.encode(bArr, 0, bArr.length, outputStream);
    }

    public static String toHexString(byte[] bArr, int i10, int i11) {
        return Strings.fromByteArray(encode(bArr, i10, i11));
    }

    public static byte[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public static byte[] encode(byte[] bArr, int i10, int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f91646a.encode(bArr, i10, i11, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e5) {
            throw new EncoderException(a.b(e5, new StringBuilder("exception encoding Hex string: ")), e5);
        }
    }

    public static byte[] decodeStrict(String str, int i10, int i11) {
        try {
            return f91646a.a(str, i10, i11);
        } catch (Exception e5) {
            throw new DecoderException(a.b(e5, new StringBuilder("exception decoding Hex string: ")), e5);
        }
    }

    public static byte[] decode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f91646a.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e5) {
            throw new DecoderException(a.b(e5, new StringBuilder("exception decoding Hex data: ")), e5);
        }
    }
}
