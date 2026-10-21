package org.bouncycastle.util.encoders;

import ci.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes13.dex */
public class UrlBase64 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UrlBase64Encoder f91650a = new UrlBase64Encoder();

    public static int decode(String str, OutputStream outputStream) throws IOException {
        return f91650a.decode(str, outputStream);
    }

    public static int encode(byte[] bArr, OutputStream outputStream) throws IOException {
        return f91650a.encode(bArr, 0, bArr.length, outputStream);
    }

    public static int decode(byte[] bArr, OutputStream outputStream) throws IOException {
        return f91650a.decode(bArr, 0, bArr.length, outputStream);
    }

    public static byte[] encode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f91650a.encode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e5) {
            throw new EncoderException(a.b(e5, new StringBuilder("exception encoding URL safe base64 data: ")), e5);
        }
    }

    public static byte[] decode(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f91650a.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e5) {
            throw new DecoderException(a.b(e5, new StringBuilder("exception decoding URL safe base64 string: ")), e5);
        }
    }

    public static byte[] decode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f91650a.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e5) {
            throw new DecoderException(a.b(e5, new StringBuilder("exception decoding URL safe base64 string: ")), e5);
        }
    }
}
