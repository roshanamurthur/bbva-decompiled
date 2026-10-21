package com.facetec.sdk;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
final class bf {
    public static byte[] b(Context context, String str) throws Exception {
        FileInputStream fileInputStreamOpenFileInput = context.openFileInput(str);
        try {
            byte[] bArrB = b(fileInputStreamOpenFileInput);
            if (fileInputStreamOpenFileInput != null) {
                fileInputStreamOpenFileInput.close();
            }
            return bArrB;
        } catch (Throwable th2) {
            if (fileInputStreamOpenFileInput != null) {
                try {
                    fileInputStreamOpenFileInput.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private static byte[] c(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return b(fileInputStream);
        } finally {
            fileInputStream.close();
        }
    }

    public static void d(Context context, String str, byte[] bArr, byte[] bArr2) throws Exception {
        b(context, str, new ab(bArr).b(bArr2));
    }

    private static void e(File file, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (IOException e5) {
                throw e5;
            }
        } catch (Throwable th2) {
            fileOutputStream.close();
            throw th2;
        }
    }

    public static byte[] d(File file, byte[] bArr) throws Exception {
        return new ab(bArr).e(c(file));
    }

    private static byte[] b(FileInputStream fileInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[(int) fileInputStream.getChannel().size()];
        while (fileInputStream.available() > 0) {
            byteArrayOutputStream.write(bArr, 0, fileInputStream.read(bArr));
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte c(Context context, String str) throws Exception {
        return (byte) context.openFileInput(str).read();
    }

    public static void c(File file, byte[] bArr, byte[] bArr2) throws Exception {
        e(file, new ab(bArr).b(bArr2));
    }

    public static byte[] d(Context context, String str, byte[] bArr) throws Exception {
        return new ab(bArr).e(b(context, str));
    }

    public static void b(Context context, String str, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(str, 0);
        fileOutputStreamOpenFileOutput.write(bArr);
        fileOutputStreamOpenFileOutput.close();
    }
}
