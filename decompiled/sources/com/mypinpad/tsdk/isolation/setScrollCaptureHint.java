package com.mypinpad.tsdk.isolation;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setScrollCaptureHint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f60492a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60493b = 1;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00eb, code lost:
    
        if (r7.getResources().getConfiguration().smallestScreenWidthDp < 20220) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fd, code lost:
    
        if (r7.getResources().getConfiguration().smallestScreenWidthDp < 600) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ff, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.setExtractedText.setCompoundDrawableTintBlendMode;
        r9 = com.mypinpad.tsdk.isolation.setScrollCaptureHint.f60492a + 9;
        com.mypinpad.tsdk.isolation.setScrollCaptureHint.f60493b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010a, code lost:
    
        if ((r9 % 2) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010c, code lost:
    
        r9 = 10 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011d, code lost:
    
        if (r7.getResources().getConfiguration().screenWidthDp < 840) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011f, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.setScrollCaptureHint.f60492a;
        r8 = (r7 & (-60)) | ((~r7) & 59);
        r7 = (r7 & 59) << 1;
        r9 = (r8 & r7) + (r7 | r8);
        com.mypinpad.tsdk.isolation.setScrollCaptureHint.f60493b = r9 % 128;
        r9 = r9 % 2;
        r7 = com.mypinpad.tsdk.isolation.setExtractedText.setX;
        r8 = (int) java.lang.System.currentTimeMillis();
        r9 = ~r8;
        r1 = r9 & 2112174428;
        r2 = ((~r9) & (-2112174429)) | r1;
        r3 = (-2112174429) & r9;
        r2 = ~((r2 & r3) | (r2 ^ r3));
        r2 = -(-(((r2 & 1025577280) | (((~r2) & 1025577280) | ((-1025577281) & r2))) * (-1188)));
        r5 = 2038145693 & r2;
        r5 = r5 + ((r2 ^ 2038145693) | r5);
        r2 = 2112174428 & r8;
        r3 = (~r2) & (2112174428 | r8);
        r2 = ~((r2 & r3) | (r3 ^ r2));
        r3 = 1025577280 & r2;
        r2 = (r2 | 1025577280) & (~r3);
        r2 = (r2 & r3) | (r2 ^ r3);
        r8 = (r8 | r9) & r9;
        r8 = (r8 & 1059181890) | (r8 ^ 1059181890);
        r4 = ~r8;
        r8 = (r8 | r4) & r4;
        r4 = ((~r8) & r2) | ((~r2) & r8);
        r8 = r8 & r2;
        r8 = -(~(-(-(((r8 & r4) | (r4 ^ r8)) * 594))));
        r2 = (((r5 | r8) << 1) - (r8 ^ r5)) - 1;
        r8 = (~r1) & (2112174428 | r9);
        r8 = ~((r8 & r1) | (r8 ^ r1));
        r8 = (r8 & (-2145779039)) | (r8 ^ (-2145779039));
        r10 = r9 & 1059181890;
        r9 = (r9 | 1059181890) & (~r10);
        r9 = (r9 & r10) | (r9 ^ r10);
        r10 = ~r9;
        r9 = (r9 | r10) & r10;
        r10 = r8 & r9;
        r8 = (r8 | r9) & (~r10);
        r8 = -(-(((r8 & r10) | (r8 ^ r10)) * 594));
        r9 = ((((r2 ^ r8) | (r2 & r8)) << 1) - (~(-((r8 & (~r2)) | ((~r8) & r2))))) - 1;
        r8 = (int) java.lang.System.currentTimeMillis();
        r10 = ~r8;
        r2 = (r10 ^ 283466053) | (r10 & 283466053);
        r4 = (r2 & 778177297) | ((~r2) & (-778177298));
        r2 = r2 & (-778177298);
        r2 = (r2 & r4) | (r4 ^ r2);
        r4 = ~r2;
        r2 = (((r2 | r4) & r4) | 277172292) * 220;
        r5 = 1138591991 & r2;
        r2 = -(-((r2 ^ 1138591991) | r5));
        r4 = (r5 & r2) + (r2 | r5);
        r2 = (r10 & 778177297) | ((~r10) & (-778177298));
        r3 = r10 & (-778177298);
        r2 = ~((r2 & r3) | (r2 ^ r3));
        r3 = 283466053 & r2;
        r1 = (283466053 | r2) & (~r3);
        r1 = -(~(((r1 & r3) | (r1 ^ r3)) * (-440)));
        r2 = ((r4 | r1) << 1) - (r1 ^ r4);
        r1 = (r2 ^ (-1)) + (r2 << 1);
        r10 = (r10 & (-771883537)) | (771883536 & r8);
        r8 = r8 & (-771883537);
        r8 = -(~(((r8 & r10) | (r10 ^ r8)) * 220));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x023f, code lost:
    
        if (r9 > ((((r1 | r8) << 1) - (r8 ^ r1)) - 1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0243, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0244, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.setExtractedText.setDividerPadding;
        r8 = com.mypinpad.tsdk.isolation.setScrollCaptureHint.f60492a;
        r9 = (r8 & 23) + (r8 | 23);
        com.mypinpad.tsdk.isolation.setScrollCaptureHint.f60493b = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0252, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setDividerPadding(java.lang.Object[] r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setScrollCaptureHint.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @NotNull
    public static final setExtractedText setOnFocusChangeListener(@NotNull Context context) {
        return (setExtractedText) setDividerPadding(new Object[]{context}, -273529248, 273529249, (int) System.currentTimeMillis());
    }
}
