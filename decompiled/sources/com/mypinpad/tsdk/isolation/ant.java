package com.mypinpad.tsdk.isolation;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class ant implements akk {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static int f53351p0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f53352q0 = 1;

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~i12;
        if ((((~(i10 | i11)) | (~(i13 | i15))) * 564) + ((~(i12 | i13 | i11)) * 1128) + (((~(i14 | i15)) | i13 | (~(i11 | i12))) * (-564)) + (i11 * 565) + (i10 * (-563)) != 1) {
            ant antVar = (ant) objArr[0];
            int i16 = f53351p0;
            int i17 = (((i16 | 19) << 1) - (~(-(((~i16) & 19) | (i16 & (-20)))))) - 1;
            f53352q0 = i17 % 128;
            int i18 = i17 % 2;
            antVar.getClass();
            if (i18 == 0) {
                throw null;
            }
        } else {
            ant antVar2 = (ant) objArr[0];
            int i19 = f53352q0;
            int i20 = ((((i19 ^ 89) | (i19 & 89)) << 1) - (~(-(((~i19) & 89) | (i19 & (-90)))))) - 1;
            f53351p0 = i20 % 128;
            int i21 = i20 % 2;
            antVar2.getClass();
            if (i21 != 0) {
                int i22 = 61 / 0;
            }
        }
        return null;
    }

    public final akk setCompoundDrawableTintBlendMode() {
        return (akk) setOnFocusChangeListener(new Object[]{this}, -310755770, 310755770, System.identityHashCode(this));
    }

    public final SecureRandom setDividerPadding() {
        return (SecureRandom) setOnFocusChangeListener(new Object[]{this}, 1149346033, -1149346032, System.identityHashCode(this));
    }
}
