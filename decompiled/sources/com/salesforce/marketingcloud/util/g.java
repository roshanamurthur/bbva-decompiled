package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.veridas.Veridas;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness"})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f65181a = Charset.forName(Veridas.US_ASCII);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f65182b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f65183c = Charset.forName("UTF-8");

    private g() {
    }

    public static String a(Reader reader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int i10 = reader.read(cArr);
                if (i10 == -1) {
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, i10);
            }
        } finally {
            reader.close();
        }
    }

    public static void b(@NonNull File file) {
        try {
            file.delete();
        } catch (Exception unused) {
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }

    public static void a(File file, OutputStream outputStream) throws IOException {
        a(new FileInputStream(file), outputStream);
    }

    public static void a(InputStream inputStream, File file) throws IOException {
        a(inputStream, new FileOutputStream(file));
    }

    public static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (-1 == i10) {
                    outputStream.flush();
                    return;
                }
                outputStream.write(bArr, 0, i10);
            }
        } finally {
            a((Closeable) inputStream);
            a(outputStream);
        }
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        a(byteArrayOutputStream);
        return byteArray;
    }
}
