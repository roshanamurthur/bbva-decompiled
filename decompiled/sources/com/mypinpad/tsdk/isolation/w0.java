package com.mypinpad.tsdk.isolation;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes10.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f61590a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61591b = 1;

    public static /* synthetic */ Integer a(Object[] objArr) throws IOException {
        int iAvailable;
        long size;
        InputStream inputStream = (InputStream) objArr[0];
        int i10 = f61591b;
        int i11 = i10 & 63;
        int i12 = (~i11) & (i10 | 63);
        int i13 = i11 << 1;
        int i14 = (i12 & i13) + (i13 | i12);
        f61590a = i14 % 128;
        int i15 = i14 % 2;
        if (inputStream instanceof x0) {
            int i16 = i10 ^ 75;
            int i17 = ((i10 & 75) | i16) << 1;
            int i18 = -i16;
            int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
            f61590a = i19 % 128;
            int i20 = i19 % 2;
            x0 x0Var = (x0) inputStream;
            iAvailable = x0.a(new Object[]{x0Var}, -54208317, 54208318, System.identityHashCode(x0Var)).intValue();
            int i21 = f61590a + 61;
            f61591b = i21 % 128;
            if (i21 % 2 == 0) {
                throw null;
            }
        } else if (inputStream instanceof adq) {
            int i22 = i10 & 87;
            int i23 = (((i10 | 87) & (~i22)) - (~(i22 << 1))) - 1;
            f61590a = i23 % 128;
            adq adqVar = (adq) inputStream;
            if (i23 % 2 != 0) {
                ((Integer) adq.setOnFocusChangeListener(new Object[]{adqVar}, 6990960, -6990957, System.identityHashCode(adqVar))).intValue();
                throw null;
            }
            iAvailable = ((Integer) adq.setOnFocusChangeListener(new Object[]{adqVar}, 6990960, -6990957, System.identityHashCode(adqVar))).intValue();
        } else if (inputStream instanceof ByteArrayInputStream) {
            int i24 = i10 & 113;
            int i25 = (i24 - (~((i10 ^ 113) | i24))) - 1;
            f61590a = i25 % 128;
            int i26 = i25 % 2;
            iAvailable = ((ByteArrayInputStream) inputStream).available();
            if (i26 != 0) {
                int i27 = 94 / 0;
            }
        } else {
            if (inputStream instanceof FileInputStream) {
                int i28 = (i10 ^ 105) + ((i10 & 105) << 1);
                f61590a = i28 % 128;
                int i29 = i28 % 2;
                try {
                    FileChannel channel = ((FileInputStream) inputStream).getChannel();
                    if (channel != null) {
                        int i30 = f61590a + 39;
                        f61591b = i30 % 128;
                        if (i30 % 2 == 0) {
                            channel.size();
                            throw null;
                        }
                        size = channel.size();
                        int i31 = f61590a;
                        int i32 = i31 & 75;
                        int i33 = ((i31 ^ 75) | i32) << 1;
                        int i34 = -((i31 | 75) & (~i32));
                        int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                        f61591b = i35 % 128;
                        int i36 = i35 % 2;
                    } else {
                        int i37 = f61591b;
                        int i38 = (i37 & (-26)) | ((~i37) & 25);
                        int i39 = (i37 & 25) << 1;
                        int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                        f61590a = i40 % 128;
                        int i41 = i40 % 2;
                        size = 2147483647L;
                    }
                    if (size < 2147483647L) {
                        int i42 = f61590a;
                        int i43 = i42 & 21;
                        int i44 = -(-((i42 ^ 21) | i43));
                        int i45 = (i43 & i44) + (i43 | i44);
                        f61591b = i45 % 128;
                        int i46 = i45 % 2;
                        int i47 = i42 & 77;
                        int i48 = (i42 ^ 77) | i47;
                        int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                        f61591b = i49 % 128;
                        int i50 = i49 % 2;
                        return Integer.valueOf((int) size);
                    }
                    int i51 = f61590a;
                    int i52 = ((((i51 ^ 43) | (i51 & 43)) << 1) - (~(-(((~i51) & 43) | (i51 & (-44)))))) - 1;
                    f61591b = i52 % 128;
                    int i53 = i52 % 2;
                } catch (IOException unused) {
                }
            }
            long jMaxMemory = Runtime.getRuntime().maxMemory();
            if (jMaxMemory > 2147483647L) {
                int i54 = f61590a;
                int i55 = i54 + 119;
                f61591b = i55 % 128;
                int i56 = i55 % 2;
                int i57 = i54 & 103;
                int i58 = -(-(i54 | 103));
                int i59 = (i57 & i58) + (i58 | i57);
                f61591b = i59 % 128;
                if (i59 % 2 == 0) {
                    throw null;
                }
                iAvailable = Integer.MAX_VALUE;
            } else {
                iAvailable = (int) jMaxMemory;
                int i60 = f61591b;
                int i61 = (i60 | 47) << 1;
                int i62 = -(((~i60) & 47) | (i60 & (-48)));
                int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                f61590a = i63 % 128;
                if (i63 % 2 != 0) {
                    throw null;
                }
            }
        }
        return Integer.valueOf(iAvailable);
    }
}
