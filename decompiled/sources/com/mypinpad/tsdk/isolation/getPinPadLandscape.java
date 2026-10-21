package com.mypinpad.tsdk.isolation;

import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class getPinPadLandscape {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Regex f55942a = new Regex("[\\dA-F]*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55943b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55944c = 1;

    static {
        int i10 = f55944c + 95;
        f55943b = i10 % 128;
        int i11 = i10 % 2;
    }

    public static final void setCompoundDrawableTintBlendMode(@Nullable String str) {
        setY(new Object[]{str}, -145706512, 145706513, (int) System.currentTimeMillis());
    }

    public static final void setDividerPadding(@NotNull String str) {
        setY(new Object[]{str}, -1901136937, 1901136939, (int) System.currentTimeMillis());
    }

    public static final void setX(@NotNull String str) {
        setY(new Object[]{str}, 165764303, -165764303, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        if (((((r11 | (-3)) << 1) - (r11 ^ (-3))) - 1) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if ((r7.length() % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        if (com.mypinpad.tsdk.isolation.getPinPadLandscape.f55942a.matches(r7) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        r11 = com.mypinpad.tsdk.isolation.getPinPadLandscape.f55944c;
        r12 = r11 ^ 15;
        r11 = -(-((r11 & 15) << 1));
        r13 = (r12 ^ r11) + ((r11 & r12) << 1);
        com.mypinpad.tsdk.isolation.getPinPadLandscape.f55943b = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0097, code lost:
    
        throw new com.mypinpad.tsdk.isolation.setIndeterminateDrawable(1002, r7, null, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:
    
        throw new com.mypinpad.tsdk.isolation.setIndeterminateDrawable(1002, r7, null, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d9, code lost:
    
        if (r11 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01dc, code lost:
    
        if (r11 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01de, code lost:
    
        r11 = r13 & 1;
        r12 = (r13 ^ 1) | r11;
        r13 = ((r11 | r12) << 1) - (r11 ^ r12);
        com.mypinpad.tsdk.isolation.getPinPadLandscape.f55943b = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ed, code lost:
    
        if ((r13 % 2) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ef, code lost:
    
        r11 = 96 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01f3, code lost:
    
        setY(new java.lang.Object[]{r11}, 165764303, -165764303, (int) java.lang.System.currentTimeMillis());
        r11 = com.mypinpad.tsdk.isolation.getPinPadLandscape.f55943b + 28;
        r12 = (r11 ^ (-1)) + (r11 << 1);
        com.mypinpad.tsdk.isolation.getPinPadLandscape.f55944c = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x020c, code lost:
    
        if ((r12 % 2) == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x020e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x020f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setY(java.lang.Object[] r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.getPinPadLandscape.setY(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @NotNull
    public static final String setX(byte b10) {
        return (String) setY(new Object[]{Byte.valueOf(b10)}, 1862949367, -1862949363, (int) System.currentTimeMillis());
    }
}
