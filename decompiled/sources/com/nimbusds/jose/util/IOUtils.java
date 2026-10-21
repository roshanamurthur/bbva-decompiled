package com.nimbusds.jose.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes10.dex */
public class IOUtils {
    public static String readFileToString(File file) throws IOException {
        return readInputStreamToString(new FileInputStream(file));
    }

    public static String readInputStreamToString(InputStream inputStream) throws IOException {
        return readInputStreamToString(inputStream, StandardCharset.UTF_8);
    }

    public static String readFileToString(File file, Charset charset) throws IOException {
        return readInputStreamToString(new FileInputStream(file), charset);
    }

    public static String readInputStreamToString(InputStream inputStream, Charset charset) throws IOException {
        char[] cArr = new char[1024];
        StringBuilder sb2 = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        while (true) {
            try {
                int i10 = inputStreamReader.read(cArr, 0, 1024);
                if (i10 < 0) {
                    String string = sb2.toString();
                    inputStreamReader.close();
                    return string;
                }
                sb2.append(cArr, 0, i10);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        }
    }
}
