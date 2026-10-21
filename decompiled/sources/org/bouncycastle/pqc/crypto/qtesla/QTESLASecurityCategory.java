package org.bouncycastle.pqc.crypto.qtesla;

import androidx.appcompat.widget.g0;

/* JADX INFO: loaded from: classes13.dex */
public class QTESLASecurityCategory {
    public static final int PROVABLY_SECURE_I = 5;
    public static final int PROVABLY_SECURE_III = 6;

    public static int a(int i10) {
        if (i10 == 5) {
            return 5184;
        }
        if (i10 == 6) {
            return 12352;
        }
        throw new IllegalArgumentException(g0.c("unknown security category: ", i10));
    }

    public static int b(int i10) {
        if (i10 == 5) {
            return 14880;
        }
        if (i10 == 6) {
            return 38432;
        }
        throw new IllegalArgumentException(g0.c("unknown security category: ", i10));
    }

    public static String getName(int i10) {
        if (i10 == 5) {
            return "qTESLA-p-I";
        }
        if (i10 == 6) {
            return "qTESLA-p-III";
        }
        throw new IllegalArgumentException(g0.c("unknown security category: ", i10));
    }
}
