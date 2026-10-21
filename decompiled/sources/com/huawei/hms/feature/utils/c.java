package com.huawei.hms.feature.utils;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50587a = "c";

    public static String a(int i10) {
        Random random = new Random();
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(random.nextInt(62)));
        }
        return sb2.toString();
    }

    public static File b(File file) throws IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                return file;
            }
            throw new IllegalArgumentException("File input must be dir when it exists.");
        }
        file.mkdirs();
        if (file.isDirectory()) {
            return file;
        }
        String canonicalPath = file.getCanonicalPath();
        throw new IOException(canonicalPath.length() != 0 ? "Unable to create directory: ".concat(canonicalPath) : "Unable to create directory: ");
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e5) {
                Logger.e(f50587a, e5);
            }
        }
    }

    public static void a(File file) throws IOException {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                a(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format(Locale.ENGLISH, "Failed to delete '%s'", file.getCanonicalPath()));
        }
    }
}
