package com.huawei.hms.feature.f.b;

import com.huawei.hms.feature.utils.Logger;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50274a = "SHA256Util";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f50275b = 4096;

    public static byte[] a(File file) throws Throwable {
        if (file == null) {
            return new byte[0];
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    byte[] bArr = new byte[4096];
                    int i10 = 0;
                    while (true) {
                        int i11 = bufferedInputStream2.read(bArr);
                        if (i11 == -1) {
                            break;
                        }
                        i10 += i11;
                        messageDigest.update(bArr, 0, i11);
                    }
                    if (i10 > 0) {
                        byte[] bArrDigest = messageDigest.digest();
                        com.huawei.hms.feature.utils.c.a(bufferedInputStream2);
                        return bArrDigest;
                    }
                    com.huawei.hms.feature.utils.c.a(bufferedInputStream2);
                } catch (IOException | NoSuchAlgorithmException unused) {
                    bufferedInputStream = bufferedInputStream2;
                    Logger.e(f50274a, "An exception occurred while computing file 'SHA-256'.");
                    com.huawei.hms.feature.utils.c.a(bufferedInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    com.huawei.hms.feature.utils.c.a(bufferedInputStream);
                    throw th;
                }
            } catch (IOException | NoSuchAlgorithmException unused2) {
            }
            return new byte[0];
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static byte[] a(byte[] bArr) {
        if (bArr == null) {
            return new byte[0];
        }
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException e5) {
            Logger.e(f50274a, "NoSuchAlgorithmException", e5);
            return new byte[0];
        }
    }
}
