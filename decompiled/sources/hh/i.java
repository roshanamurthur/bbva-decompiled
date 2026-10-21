package hh;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* JADX INFO: compiled from: AI01weightDecoder.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class i extends h {
    public abstract void c(int i10, StringBuilder sb2);

    public abstract int d(int i10);

    public final void e(StringBuilder sb2, int i10, int i11) {
        int iC = r.c(i10, i11, getGeneralDecoder().f69462a);
        c(iC, sb2);
        int iD = d(iC);
        int i12 = AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
        for (int i13 = 0; i13 < 5; i13++) {
            if (iD / i12 == 0) {
                sb2.append('0');
            }
            i12 /= 10;
        }
        sb2.append(iD);
    }
}
