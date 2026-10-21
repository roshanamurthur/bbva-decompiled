package com.mypinpad.tsdk.isolation;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e0 {
    public static /* synthetic */ Closeable a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i15;
        int i17 = ~i12;
        int i18 = (((~(i10 | i14 | i12)) | (~(i11 | i13)) | (~(i13 | i17))) * 168) + ((~(i15 | i12)) * 168) + ((i16 | (~(i14 | i17))) * 168) + (i11 * (-167)) + (i10 * (-167));
        if (i18 == 1) {
            acp acpVar = (acp) objArr[0];
            Intrinsics.checkNotNullParameter(acpVar, "");
            return new acm(acpVar);
        }
        if (i18 == 2) {
            return new c0();
        }
        aco acoVar = (aco) objArr[0];
        Intrinsics.checkNotNullParameter(acoVar, "");
        return new acn(acoVar);
    }
}
