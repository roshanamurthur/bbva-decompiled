package com.google.firebase.crashlytics.internal.common;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: CLSUUID.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicLong f47782a = new AtomicLong(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f47783b;

    public b(IdManager idManager) {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArrA = a(time % 1000);
        byte[] bArrA2 = a(f47782a.incrementAndGet());
        byte[] bArrA3 = a(Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {bArrArray[0], bArrArray[1], bArrArray[2], bArrArray[3], bArrA[0], bArrA[1], bArrA2[0], bArrA2[1], bArrA3[0], bArrA3[1]};
        String strSha1 = CommonUtils.sha1(idManager.getInstallIds().getCrashlyticsInstallId());
        String strHexify = CommonUtils.hexify(bArr);
        Locale locale = Locale.US;
        f47783b = String.format(locale, "%s%s%s%s", strHexify.substring(0, 12), strHexify.substring(12, 16), strHexify.subSequence(16, 20), strSha1.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j10);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return f47783b;
    }
}
