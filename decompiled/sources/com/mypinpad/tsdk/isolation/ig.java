package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;

/* JADX INFO: loaded from: classes10.dex */
public class ig {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f56457c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f56458d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f56459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f56460b;

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        long jCurrentTimeMillis;
        int i13 = ~i11;
        int i14 = ~i12;
        if ((((~(i10 | i12)) | (~(i11 | i14))) * 950) + (((~(i14 | i10)) | (~(i11 | i12))) * (-950)) + (((~(i13 | i14)) | (~((~i10) | i12))) * ReturnCode.ERR_REPOSITORY) + (i11 * (-949)) + (i10 * (-949)) != 1) {
            ig igVar = (ig) objArr[0];
            int i15 = f56457c;
            int i16 = (i15 & 123) + (i15 | 123);
            f56458d = i16 % 128;
            if (i16 % 2 == 0) {
                igVar.f56459a = System.currentTimeMillis();
                igVar.f56460b = 1L;
            } else {
                igVar.f56459a = System.currentTimeMillis();
                igVar.f56460b = 0L;
            }
            return null;
        }
        ig igVar2 = (ig) objArr[0];
        int i17 = f56457c;
        int i18 = i17 & 81;
        int i19 = i18 + ((i17 ^ 81) | i18);
        f56458d = i19 % 128;
        if (i19 % 2 != 0 ? igVar2.f56460b != 0 : igVar2.f56460b != 1) {
            long j10 = igVar2.f56460b - igVar2.f56459a;
            int i20 = (i17 ^ 65) + ((i17 & 65) << 1);
            f56458d = i20 % 128;
            int i21 = i20 % 2;
            jCurrentTimeMillis = j10;
        } else {
            int i22 = i17 + 43;
            f56458d = i22 % 128;
            int i23 = i22 % 2;
            jCurrentTimeMillis = System.currentTimeMillis() - igVar2.f56459a;
            int i24 = f56458d + 4;
            int i25 = (i24 ^ (-1)) + (i24 << 1);
            f56457c = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = f56457c;
        int i28 = (((i27 & (-20)) | ((~i27) & 19)) - (~(-(-((i27 & 19) << 1))))) - 1;
        f56458d = i28 % 128;
        int i29 = i28 % 2;
        return Long.valueOf(jCurrentTimeMillis * 1000);
    }

    public final void setOnFocusChangeListener() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, -1285585610, 1285585610, System.identityHashCode(this));
    }

    public void setX() {
        int i10 = f56458d;
        int i11 = ((i10 & (-120)) | ((~i10) & 119)) + ((i10 & 119) << 1);
        f56457c = i11 % 128;
        if (i11 % 2 == 0) {
            this.f56460b = System.currentTimeMillis();
        } else {
            this.f56460b = System.currentTimeMillis();
            throw null;
        }
    }

    public final long setCompoundDrawableTintBlendMode() {
        return ((Long) setCompoundDrawableTintBlendMode(new Object[]{this}, -817117433, 817117434, System.identityHashCode(this))).longValue();
    }
}
