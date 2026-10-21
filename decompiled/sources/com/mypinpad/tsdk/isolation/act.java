package com.mypinpad.tsdk.isolation;

import java.io.EOFException;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class act {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final byte[] f52422a = (byte[]) acw.setDividerPadding(new Object[]{"0123456789abcdef"}, 211431428, -211431427, (int) System.currentTimeMillis());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52423b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f52424c = 1;

    static {
        int i10 = f52423b + 119;
        f52424c = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x08b0, code lost:
    
        if (r25 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x08b2, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.act.f52423b;
        r1 = r0 & 77;
        r0 = (r0 ^ 77) | r1;
        r2 = (r1 ^ r0) + ((r0 & r1) << 1);
        r0 = r2 % 128;
        com.mypinpad.tsdk.isolation.act.f52424c = r0;
        r2 = r2 % 2;
        r2 = r0 & 17;
        r1 = ((r0 ^ 17) | r2) << 1;
        r0 = -((r0 | 17) & (~r2));
        r2 = ((r1 | r0) << 1) - (r0 ^ r1);
        com.mypinpad.tsdk.isolation.act.f52423b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x08dc, code lost:
    
        if ((r2 % 2) != 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x08e3, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x08e5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x08e6, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.act.f52423b;
        r1 = (r0 ^ 121) + ((r0 & 121) << 1);
        com.mypinpad.tsdk.isolation.act.f52424c = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x08f9, code lost:
    
        return java.lang.Integer.valueOf(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.act.f52424c;
        r1 = r0 ^ 119;
        r3 = ((r0 & 119) | r1) << 1;
        r1 = -r1;
        r5 = (r3 ^ r1) + ((r1 & r3) << 1);
        com.mypinpad.tsdk.isolation.act.f52423b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        if ((r5 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        r8 = 51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        r8 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        r1 = ((r0 | 87) << 1) - (r0 ^ 87);
        com.mypinpad.tsdk.isolation.act.f52423b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        return java.lang.Integer.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r0 = (int) java.lang.System.currentTimeMillis();
        r3 = (-23457211) ^ r0;
        r4 = (-23457211) & r0;
        r3 = (r3 & r4) | (r3 ^ r4);
        r4 = ~r3;
        r3 = (r3 | r4) & r4;
        r5 = 2485546 & r3;
        r3 = (r3 | 2485546) & (~r5);
        r4 = (-675497407) - (~(((r3 & r5) | (r3 ^ r5)) * 336));
        r3 = (r4 ^ (-1)) + (r4 << 1);
        r4 = ~r0;
        r7 = (1420816239 & r4) | (r0 & (-1420816240));
        r9 = 1420816239 & r0;
        r7 = (r7 & r9) | (r7 ^ r9);
        r9 = ~r7;
        r7 = (r7 | r9) & r9;
        r9 = ((~r7) & (-1441787904)) | (1441787903 & r7);
        r7 = r7 & (-1441787904);
        r3 = (r3 - (~(-(-(((r7 & r9) | (r9 ^ r7)) * (-168)))))) - 1;
        r0 = (r0 | r4) & r4;
        r4 = (r0 & (-1420816240)) | ((~r0) & 1420816239);
        r0 = r0 & 1420816239;
        r0 = ~((r0 & r4) | (r4 ^ r0));
        r0 = ((r0 & (-23457211)) | ((-23457211) ^ r0)) * 168;
        r1 = (r3 ^ r0) + ((r0 & r3) << 1);
        r0 = (int) java.lang.System.currentTimeMillis();
        r3 = ~r0;
        r5 = (-817954155) & r3;
        r4 = ((-817954155) | r3) & (~r5);
        r4 = ~((r4 & r5) | (r4 ^ r5));
        r4 = -(-(((r4 & 272636256) | (272636256 ^ r4)) * 168));
        r7 = (1789706670 & r4) + (r4 | 1789706670);
        r4 = -(-((~(((-272636257) & r0) | ((-272636257) ^ r0))) * 168));
        r5 = (r7 ^ r4) + ((r4 & r7) << 1);
        r7 = 1805968907 & r3;
        r3 = (r3 | 1805968907) & (~r7);
        r3 = ~((r3 & r7) | (r3 ^ r7));
        r3 = (r3 & (-2078605164)) | ((2078605163 & r3) | ((~r3) & (-2078605164)));
        r7 = (-545317899) ^ r0;
        r0 = r0 & (-545317899);
        r0 = ~((r0 & r7) | (r7 ^ r0));
        r0 = -(~(((r0 & r3) | (r3 ^ r0)) * 168));
        r3 = (r5 ^ r0) + ((r0 & r5) << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0144, code lost:
    
        if (r1 <= ((r3 ^ (-1)) + (r3 << 1))) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x014a, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x014b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x014c, code lost:
    
        r7 = r1.setY;
        r10 = r1.setCompoundDrawableTintBlendMode;
        r12 = r1.setDividerPadding;
        r3 = (int[]) com.mypinpad.tsdk.isolation.aci.setOnFocusChangeListener(new java.lang.Object[]{r3}, -852072050, 852072058, java.lang.System.identityHashCode(r3));
        r13 = com.mypinpad.tsdk.isolation.act.f52423b;
        r14 = (r13 ^ 73) + ((r13 & 73) << 1);
        com.mypinpad.tsdk.isolation.act.f52424c = r14 % 128;
        r14 = r14 % 2;
        r13 = 0;
        r14 = r1;
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0176, code lost:
    
        r11 = (r13 & 1) + (r13 | 1);
        r13 = r3[r13];
        r17 = r1;
        r0 = (int) java.lang.System.currentTimeMillis();
        r1 = r11 * (-753);
        r19 = ((755 & r1) - (~(-(-(755 | r1))))) - 1;
        r1 = r9 & r11;
        r20 = r9 | r11;
        r8 = (~r1) & r20;
        r1 = (r8 ^ r1) | (r1 & r8);
        r8 = ~r1;
        r1 = (r1 | r8) & r8;
        r8 = ~((r9 ^ r0) | (r9 & r0));
        r21 = r1 ^ r8;
        r1 = r1 & r8;
        r1 = (r21 & r1) | (r21 ^ r1);
        r8 = r11 & r0;
        r4 = (~r8) & (r11 | r0);
        r2 = ~r0;
        r4 = ~(r4 | r8);
        r8 = r1 & r4;
        r1 = (r1 | r4) & (~r8);
        r1 = -(~(((r1 & r8) | (r1 ^ r8)) * (-754)));
        r9 = (-2) - (((r19 & r1) + (r19 | r1)) ^ (-1));
        r1 = r20 & r0;
        r1 = r1 | ((~r1) & (r20 | r0));
        r4 = ~r1;
        r1 = (r1 | r4) & r4;
        r0 = (r0 | r2) & r2;
        r2 = r0 ^ 1;
        r4 = r0 & 1;
        r2 = (r2 & r4) | (r2 ^ r4);
        r2 = ~((r2 & r11) | (r2 ^ r11));
        r4 = r1 ^ r2;
        r1 = r1 & r2;
        r1 = ((r1 & r4) | (r4 ^ r1)) * (-754);
        r2 = (r9 | r1) << 1;
        r1 = -(r1 ^ r9);
        r4 = (r2 & r1) + (r1 | r2);
        r2 = (-2) & r0;
        r0 = (r0 | (-2)) & (~r2);
        r0 = -(-(((r0 & r2) | (r0 ^ r2)) * 754));
        r1 = r4 | r0;
        r2 = (r1 << 1) - ((~(r0 & r4)) & r1);
        r0 = r3[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0217, code lost:
    
        if (r0 == r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0219, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.act.f52423b;
        r4 = (r1 & 55) + (r1 | 55);
        com.mypinpad.tsdk.isolation.act.f52424c = r4 % 128;
        r4 = r4 % 2;
        r4 = r1 & 25;
        r1 = (r1 ^ 25) | r4;
        r8 = (r4 ^ r1) + ((r1 & r4) << 1);
        com.mypinpad.tsdk.isolation.act.f52424c = r8 % 128;
        r8 = r8 % 2;
        r15 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0238, code lost:
    
        if (r14 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x023a, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.act.f52424c;
        r1 = (r0 & 69) + (r0 | 69);
        com.mypinpad.tsdk.isolation.act.f52423b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0247, code lost:
    
        if ((r1 % 2) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0249, code lost:
    
        r1 = 15 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x024d, code lost:
    
        if (r13 >= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0250, code lost:
    
        r25 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0258, code lost:
    
        if (r13 >= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x025a, code lost:
    
        r1 = (((r0 | 58) << 1) - (r0 ^ 58)) + r6;
        r0 = r1 % 128;
        com.mypinpad.tsdk.isolation.act.f52423b = r0;
        r1 = r1 % 2;
        r1 = -(-(r13 * (-1)));
        r8 = r2 & r1;
        r8 = r8 + ((r1 ^ r2) | r8);
        r1 = (r0 & (-8)) | ((~r0) & 7);
        r0 = -(-((r0 & 7) << 1));
        r11 = (r1 ^ r0) + ((r0 & r1) << 1);
        com.mypinpad.tsdk.isolation.act.f52424c = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0288, code lost:
    
        r0 = (int) java.lang.System.currentTimeMillis();
        r1 = -(~(-(-(r10 * 370))));
        r1 = (-2) - ((((370 | r1) << 1) - (r1 ^ 370)) ^ (-1));
        r9 = r10 & 1;
        r11 = (~r9) & (r10 | 1);
        r13 = ~r10;
        r9 = (r11 ^ r9) | (r9 & r11);
        r11 = ~r0;
        r19 = r9 ^ r11;
        r9 = r9 & r11;
        r9 = -(-(((r19 ^ r9) | (r19 & r9)) * (-369)));
        r4 = ((~r9) & r1) | ((~r1) & r9);
        r1 = -(-((r1 & r9) << 1));
        r9 = ((r4 | r1) << 1) - (r1 ^ r4);
        r1 = ((~r11) & (-2)) | (r11 & 1);
        r6 = (-2) & r11;
        r1 = (r1 & r6) | (r1 ^ r6);
        r4 = ~r1;
        r6 = r10 ^ r4;
        r4 = r4 & r10;
        r6 = ((r6 & r4) | (r6 ^ r4)) * (-369);
        r11 = ((r9 ^ r6) - (~((r6 & r9) << 1))) - 1;
        r6 = r13 & 1;
        r6 = ~(r6 | ((~r6) & (r13 | 1)));
        r9 = r0 ^ 1;
        r0 = r0 & 1;
        r0 = ~((r9 ^ r0) | (r0 & r9));
        r0 = (r0 & r6) | (r6 ^ r0);
        r4 = r4 | (r1 & r13);
        r1 = r1 & r10;
        r1 = ~((r1 & r4) | (r4 ^ r1));
        r4 = r0 & r1;
        r0 = (r0 | r1) & (~r4);
        r0 = ((r0 & r4) | (r0 ^ r4)) * 369;
        r1 = (((~r0) & r11) | ((~r11) & r0)) + ((r0 & r11) << 1);
        r0 = r7[r10] & 255;
        r4 = (int) java.lang.System.currentTimeMillis();
        r6 = r2 * (-68);
        r10 = 70 & r6;
        r6 = ((r6 | 70) & (~r10)) + (r10 << 1);
        r9 = ~r2;
        r10 = (r9 | r2) & r9;
        r11 = ((~r10) & (-2)) | (r10 & 1);
        r10 = r10 & (-2);
        r10 = (r10 & r11) | (r11 ^ r10);
        r11 = r10 & r4;
        r10 = ~(((r10 | r4) & (~r11)) | r11);
        r11 = r2 ^ 1;
        r13 = r2 & 1;
        r11 = (r11 ^ r13) | (r11 & r13);
        r24 = r7;
        r25 = r5;
        r5 = ((~r11) & r4) | ((~r4) & r11);
        r7 = r11 & r4;
        r5 = ~((r5 & r7) | (r5 ^ r7));
        r5 = -(~(-(-(((r5 & r10) | (r10 ^ r5)) * 69))));
        r7 = ((r6 | r5) << 1) - (r5 ^ r6);
        r5 = (r7 ^ (-1)) + (r7 << 1);
        r7 = ((-2) & r9) | r13;
        r10 = (-2) & r2;
        r7 = (r7 & r10) | (r7 ^ r10);
        r10 = ~r7;
        r7 = (r7 | r10) & r10;
        r6 = ~(((-2) ^ r4) | ((-2) & r4));
        r6 = (r6 & r7) | (r7 ^ r6);
        r7 = r2 & r4;
        r4 = (r4 | r2) & (~r7);
        r4 = ~((r4 & r7) | (r4 ^ r7));
        r7 = ((~r4) & r6) | ((~r6) & r4);
        r4 = r4 & r6;
        r4 = ((r4 & r7) | (r7 ^ r4)) * (-69);
        r6 = r5 ^ r4;
        r4 = -(-((r4 & r5) << 1));
        r7 = (r6 ^ r4) + ((r4 & r6) << 1);
        r4 = -(-((~(r9 | 1)) * 69));
        r6 = r7 ^ r4;
        r4 = -(-((r4 & r7) << 1));
        r4 = (r4 | r6) + (r6 & r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x03c4, code lost:
    
        if (r0 == r3[r2]) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x03c6, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.act.f52423b + 41;
        com.mypinpad.tsdk.isolation.act.f52424c = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x03d0, code lost:
    
        if ((r0 % 2) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x03d2, code lost:
    
        r0 = 31 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x03da, code lost:
    
        return java.lang.Integer.valueOf(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x03db, code lost:
    
        if (r4 != r8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x03dd, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.act.f52424c;
        r2 = r0 & 1;
        r2 = (r2 - (~(-(-((r0 ^ 1) | r2))))) - 1;
        com.mypinpad.tsdk.isolation.act.f52423b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x03f0, code lost:
    
        if ((r2 % 2) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x03f2, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x03f4, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x03f5, code lost:
    
        r9 = (-2) - ((r0 + 68) ^ (-1));
        com.mypinpad.tsdk.isolation.act.f52423b = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0402, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.act.f52424c + 125;
        com.mypinpad.tsdk.isolation.act.f52423b = r0 % 128;
        r0 = r0 % 2;
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x040d, code lost:
    
        if (r1 != r12) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x040f, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.act.f52424c;
        r1 = r0 & 39;
        r0 = r0 | 39;
        r5 = (r1 ^ r0) + ((r0 & r1) << 1);
        com.mypinpad.tsdk.isolation.act.f52423b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0421, code lost:
    
        if ((r5 % 2) != 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0423, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r14);
        r0 = r14.setNavigationOnClickListener;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
        r1 = r0.setCompoundDrawableTintBlendMode;
        r5 = r0.setY;
        r6 = r0.setDividerPadding;
        r9 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0433, code lost:
    
        if (r0 != r9) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0435, code lost:
    
        if (r2 == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0437, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.act.f52424c;
        r7 = r0 & 51;
        r7 = r7 + ((r0 ^ 51) | r7);
        com.mypinpad.tsdk.isolation.act.f52423b = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0446, code lost:
    
        if ((r7 % 2) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0448, code lost:
    
        r0 = 81 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x044c, code lost:
    
        r10 = r1;
        r7 = r5;
        r12 = r6;
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0451, code lost:
    
        r19 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0455, code lost:
    
        r14 = r0;
        r10 = r1;
        r7 = r5;
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x045c, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r14);
        r0 = r14.setNavigationOnClickListener;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
        r0 = r0.setCompoundDrawableTintBlendMode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0467, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0468, code lost:
    
        r9 = r17;
        r10 = r1;
        r7 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x046f, code lost:
    
        if (r2 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0471, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.act.f52424c;
        r1 = (r0 & (-118)) | ((~r0) & 117);
        r0 = -(-((r0 & 117) << 1));
        r5 = ((r1 | r0) << 1) - (r0 ^ r1);
        com.mypinpad.tsdk.isolation.act.f52423b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x048a, code lost:
    
        if ((r5 % 2) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x048c, code lost:
    
        r0 = r3[r4];
        r1 = 78 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0493, code lost:
    
        r0 = r3[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0495, code lost:
    
        r8 = r9;
        r19 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x049a, code lost:
    
        r2 = r4;
        r17 = r9;
        r5 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x04a2, code lost:
    
        r0 = (int) java.lang.System.currentTimeMillis();
        r1 = -(-(r10 * (-565)));
        r5 = (567 & r1) + (r1 | 567);
        r4 = (-2) ^ r10;
        r6 = ~r10;
        r8 = (-2) & r10;
        r4 = (r4 ^ r8) | (r4 & r8);
        r8 = ~r4;
        r4 = (r4 | r8) & r8;
        r8 = ((~r0) & (-2)) | (r0 & 1);
        r17 = (-2) & r0;
        r1 = ~((r8 ^ r17) | (r8 & r17));
        r8 = r4 & r1;
        r1 = (r1 | r4) & (~r8);
        r1 = -(-(((r1 & r8) | (r1 ^ r8)) * (-566)));
        r4 = r5 & r1;
        r1 = (r1 | r5) & (~r4);
        r4 = -(-(r4 << 1));
        r8 = (r1 & r4) + (r1 | r4);
        r1 = r6 & (-2);
        r4 = ((~r6) & 1) | r1;
        r5 = r6 & 1;
        r4 = (r4 & r5) | (r4 ^ r5);
        r5 = ~r4;
        r4 = -(~(-(-(((r4 | r5) & r5) * 566))));
        r5 = (r8 ^ r4) + ((r4 & r8) << 1);
        r4 = (r5 ^ (-1)) + (r5 << 1);
        r1 = r1 | (r6 ^ (-2));
        r5 = r1 ^ r0;
        r0 = r0 & r1;
        r0 = (r0 & r5) | (r5 ^ r0);
        r1 = ~r0;
        r1 = (-2) - ((r4 - (~(-(-(((r0 | r1) & r1) * 566))))) ^ (-1));
        r4 = r7[r10] & 255;
        r5 = (int) java.lang.System.currentTimeMillis();
        r6 = r13 * 758;
        r8 = -(-(r2 * (-756)));
        r10 = r6 ^ r8;
        r6 = (r6 & r8) << 1;
        r11 = ((r10 | r6) << 1) - (r6 ^ r10);
        r6 = ~r5;
        r8 = r13 & r6;
        r10 = (~r8) & (r13 | r6);
        r8 = -(-(((r10 ^ r8) | (r8 & r10)) * (-757)));
        r10 = r11 ^ r8;
        r8 = ((r8 & r11) | r10) << 1;
        r10 = -r10;
        r17 = (r8 ^ r10) + ((r8 & r10) << 1);
        r8 = ~r2;
        r11 = r8 & r13;
        r10 = (r8 ^ r13) | r11;
        r10 = -(~((~((r10 ^ r5) | (r10 & r5))) * 1514));
        r10 = (((r17 | r10) << 1) - (r17 ^ r10)) - 1;
        r0 = ~r13;
        r8 = r8 & (r8 | r2);
        r17 = r7;
        r24 = r17;
        r7 = ((~r8) & r0) | ((~r0) & r8);
        r9 = r0 & r8;
        r7 = ~((r7 ^ r9) | (r7 & r9));
        r6 = ~(r6 | r8);
        r8 = ((~r6) & r7) | ((~r7) & r6);
        r6 = r6 & r7;
        r6 = (r6 & r8) | (r8 ^ r6);
        r7 = (r2 & r0) | r11;
        r8 = r13 & r2;
        r7 = (r7 & r8) | (r7 ^ r8);
        r8 = r7 & r5;
        r5 = (r5 | r7) & (~r8);
        r5 = ~((r5 & r8) | (r5 ^ r8));
        r5 = ((r5 & r6) | (r6 ^ r5)) * 757;
        r6 = ((((r10 ^ r5) | (r10 & r5)) << 1) - (~(-((r5 & (~r10)) | ((~r5) & r10))))) - 1;
        r5 = com.mypinpad.tsdk.isolation.act.f52423b;
        r7 = (r5 & 3) + (r5 | 3);
        com.mypinpad.tsdk.isolation.act.f52424c = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x05c9, code lost:
    
        if (r2 != r6) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x05cb, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.act.f52423b;
        r1 = r0 & 75;
        r0 = (r0 ^ 75) | r1;
        r2 = (r1 ^ r0) + ((r0 & r1) << 1);
        r0 = r2 % 128;
        com.mypinpad.tsdk.isolation.act.f52424c = r0;
        r2 = r2 % 2;
        r1 = r0 | 117;
        r2 = r1 << 1;
        r0 = -((~(r0 & 117)) & r1);
        r1 = (r2 ^ r0) + ((r0 & r2) << 1);
        com.mypinpad.tsdk.isolation.act.f52423b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x05f8, code lost:
    
        return java.lang.Integer.valueOf(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x05fd, code lost:
    
        if (r4 != r3[r2]) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x05ff, code lost:
    
        r4 = com.mypinpad.tsdk.isolation.act.f52423b;
        r5 = (r4 ^ 90) + ((r4 & 90) << 1);
        r4 = (r5 ^ (-1)) + (r5 << 1);
        com.mypinpad.tsdk.isolation.act.f52424c = r4 % 128;
        r4 = r4 % 2;
        r4 = (int) java.lang.System.currentTimeMillis();
        r5 = r13 * com.esotericsoftware.asm.Opcodes.INSTANCEOF;
        r6 = -(-(r2 * com.esotericsoftware.asm.Opcodes.INSTANCEOF));
        r7 = ((r5 ^ r6) | (r5 & r6)) << 1;
        r5 = -(((~r5) & r6) | ((~r6) & r5));
        r6 = (r7 ^ r5) + ((r5 & r7) << 1);
        r5 = ~r4;
        r7 = (r5 | r4) & r5;
        r8 = r0 | r2;
        r9 = ~r8;
        r8 = (r8 | r9) & r9;
        r7 = -(-(((r7 & r8) | (r7 ^ r8)) * (-192)));
        r8 = ((r6 ^ r7) | (r6 & r7)) << 1;
        r6 = -(((~r6) & r7) | ((~r7) & r6));
        r7 = ((r8 | r6) << 1) - (r6 ^ r8);
        r6 = (r0 | r13) & r0;
        r8 = ~r2;
        r9 = ~r8;
        r10 = r6 & r8;
        r6 = (r6 | r8) & (~r10);
        r6 = ~((r6 & r10) | (r6 ^ r10));
        r10 = r8 & r5;
        r11 = (~r10) & (r8 | r5);
        r11 = ~((r11 ^ r10) | (r11 & r10));
        r19 = r15;
        r26 = r14;
        r14 = ((~r6) & r11) | ((~r11) & r6);
        r6 = r6 & r11;
        r6 = -(-(((r6 & r14) | (r14 ^ r6)) * (-384)));
        r11 = r7 & r6;
        r11 = r11 + ((r6 ^ r7) | r11);
        r6 = r0 & r8;
        r7 = (~r6) & (r0 | r8);
        r6 = (r6 & r7) | (r7 ^ r6);
        r7 = r6 & r4;
        r6 = (r6 | r4) & (~r7);
        r6 = ~((r6 & r7) | (r6 ^ r7));
        r5 = (r5 & r9) | ((~r5) & r8);
        r5 = (r5 & r10) | (r5 ^ r10);
        r0 = (r0 & r5) | ((~r5) & r13);
        r5 = r5 & r13;
        r0 = (r0 & r5) | (r0 ^ r5);
        r5 = ~r0;
        r0 = (r0 | r5) & r5;
        r5 = r6 & r0;
        r0 = (r0 | r6) & (~r5);
        r0 = (r0 & r5) | (r0 ^ r5);
        r5 = r13 ^ r2;
        r2 = r2 & r13;
        r2 = (r2 & r5) | (r5 ^ r2);
        r5 = r2 ^ r4;
        r2 = r2 & r4;
        r2 = ~((r2 & r5) | (r5 ^ r2));
        r4 = ((~r2) & r0) | ((~r0) & r2);
        r0 = r0 & r2;
        r0 = ((r0 & r4) | (r4 ^ r0)) * 192;
        r0 = r3[((((r11 ^ r0) | (r11 & r0)) << 1) - (~(-((r0 & (~r11)) | ((~r0) & r11))))) - 1];
        r2 = com.mypinpad.tsdk.isolation.act.f52424c;
        r6 = r2 & 43;
        r5 = ((r2 ^ 43) | r6) << 1;
        r2 = -((r2 | 43) & (~r6));
        r4 = (r5 & r2) + (r2 | r5);
        r2 = r4 % 128;
        com.mypinpad.tsdk.isolation.act.f52423b = r2;
        r4 = r4 % 2;
        r4 = ((r2 ^ 121) | (r2 & 121)) << 1;
        r2 = -(((~r2) & 121) | (r2 & (-122)));
        r6 = ((r4 | r2) << 1) - (r2 ^ r4);
        com.mypinpad.tsdk.isolation.act.f52424c = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0713, code lost:
    
        if ((r6 % 2) == 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0715, code lost:
    
        if (r1 != r12) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0717, code lost:
    
        r14 = r26.setNavigationOnClickListener;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r14);
        r1 = r14.setCompoundDrawableTintBlendMode;
        r2 = r14.setY;
        r4 = r14.setDividerPadding;
        r8 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0726, code lost:
    
        if (r14 != r8) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0728, code lost:
    
        r5 = (int) java.lang.System.currentTimeMillis();
        r7 = r5 ^ 67239936;
        r6 = 67239936 & r5;
        r6 = -(-(((r6 & r7) | (r7 ^ r6)) * 988));
        r9 = (-2056026559) & r6;
        r6 = (r6 | (-2056026559)) & (~r9);
        r9 = r9 << 1;
        r10 = ((r6 | r9) << 1) - (r6 ^ r9);
        r6 = ~r5;
        r7 = (r6 | r5) & r6;
        r11 = r7 ^ 204603606;
        r7 = r7 & 204603606;
        r7 = (r7 & r11) | (r11 ^ r7);
        r9 = ~r7;
        r7 = (r7 | r9) & r9;
        r7 = ((r7 & (-1337668831)) | ((-1337668831) ^ r7)) * (-1976);
        r9 = r10 & r7;
        r7 = (((r7 | r10) & (~r9)) - (~(r9 << 1))) - 1;
        r5 = (r5 & 1200305160) | (1200305160 ^ r5);
        r9 = ~r5;
        r5 = (r5 | r9) & r9;
        r10 = 67239936 ^ r5;
        r5 = r5 & 67239936;
        r5 = (r5 & r10) | (r10 ^ r5);
        r6 = ~((r6 & (-1200305161)) | (r6 ^ (-1200305161)));
        r9 = ((~r6) & r5) | ((~r5) & r6);
        r5 = r5 & r6;
        r5 = ((r5 & r9) | (r9 ^ r5)) * 988;
        r6 = r7 & r5;
        r5 = (((r5 | r7) & (~r6)) - (~(-(-(r6 << 1))))) - 1;
        r6 = (int) java.lang.System.currentTimeMillis();
        r9 = 24794935 & r6;
        r10 = (~r9) & (24794935 | r6);
        r11 = ~r6;
        r10 = ~(r10 | r9);
        r13 = 981827720 & r10;
        r10 = ((r10 | 981827720) & (~r13)) | r13;
        r12 = ~(((-999786414) & r6) | (((-999786414) & r11) | (999786413 & r6)));
        r10 = ((r10 & r12) | (r10 ^ r12)) * (-880);
        r13 = ((-25967963) ^ r10) + ((r10 & (-25967963)) << 1);
        r10 = 24794935 & r11;
        r7 = ~(((24794935 | r11) & (~r10)) | r10);
        r7 = (r7 & 999786413) | (999786413 ^ r7);
        r12 = (-24794936) ^ r6;
        r6 = r6 & (-24794936);
        r12 = ~(r12 | r6);
        r7 = -(-(((r7 & r12) | (r7 ^ r12)) * (-880)));
        r12 = r13 & r7;
        r7 = (r7 ^ r13) | r12;
        r13 = ((r12 | r7) << 1) - (r7 ^ r12);
        r6 = (~(r6 | (((-24794936) & r11) | r9))) * 880;
        r7 = r13 & r6;
        r6 = (r6 ^ r13) | r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x080f, code lost:
    
        if (r5 > ((r7 ^ r6) + ((r6 & r7) << 1))) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0811, code lost:
    
        r5 = com.mypinpad.tsdk.isolation.act.f52423b;
        r6 = r5 & 59;
        r5 = (r5 | 59) & (~r6);
        r6 = r6 << 1;
        r9 = ((r5 | r6) << 1) - (r5 ^ r6);
        com.mypinpad.tsdk.isolation.act.f52424c = r9 % 128;
        r9 = r9 % 2;
        r10 = r1;
        r7 = r2;
        r12 = r4;
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x082b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x082c, code lost:
    
        r10 = r1;
        r7 = r2;
        r12 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0830, code lost:
    
        r8 = r24;
        r10 = r1;
        r14 = r26;
        r7 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0838, code lost:
    
        if (r0 < 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x083a, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.act.f52424c;
        r3 = r1 & 85;
        r2 = ((r1 ^ 85) | r3) << 1;
        r3 = -((~r3) & (r1 | 85));
        r4 = (r2 & r3) + (r2 | r3);
        com.mypinpad.tsdk.isolation.act.f52423b = r4 % 128;
        r4 = r4 % 2;
        r2 = ((r1 ^ 102) + ((r1 & 102) << 1)) - 1;
        com.mypinpad.tsdk.isolation.act.f52423b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0860, code lost:
    
        if ((r2 % 2) == 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0862, code lost:
    
        r1 = 38 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x086a, code lost:
    
        return java.lang.Integer.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x086f, code lost:
    
        return java.lang.Integer.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0870, code lost:
    
        r13 = -r0;
        r0 = com.mypinpad.tsdk.isolation.act.f52423b;
        r1 = ((r0 & 61) - (~(-(-(r0 | 61))))) - 1;
        com.mypinpad.tsdk.isolation.act.f52424c = r1 % 128;
        r1 = r1 % 2;
        r1 = r8;
        r15 = r19;
        r5 = r25;
        r6 = -1;
        r9 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0892, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0893, code lost:
    
        r2 = r2 + 1;
        r10 = com.mypinpad.tsdk.isolation.act.f52423b + 29;
        com.mypinpad.tsdk.isolation.act.f52424c = r10 % 128;
        r10 = r10 % 2;
        r14 = r14;
        r24 = r24;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x08ac, code lost:
    
        r25 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        if (r5 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Integer a(java.lang.Object[] r27) {
        /*
            Method dump skipped, instruction units count: 2298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.act.a(java.lang.Object[]):java.lang.Integer");
    }

    public static final int setCompoundDrawableTintBlendMode(@NotNull abx abxVar, @NotNull aci aciVar, boolean z10) {
        return ((Integer) setDividerPadding(new Object[]{abxVar, aciVar, Boolean.valueOf(z10)}, -657714353, 657714356, (int) System.currentTimeMillis())).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x018e  */
    /* JADX WARN: Code duplicated, block: B:34:0x01c4  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, EOFException {
        String str;
        int i13;
        int i14;
        Object dividerPadding;
        int i15 = ~i12;
        int i16 = (~i10) | i15;
        int i17 = (((~(i10 | i12)) | (~((~i11) | i10)) | (~(i11 | i16))) * 369) + (((~i16) | i11) * (-369)) + ((i10 | i11 | i15) * (-369)) + (i11 * 370) + (i10 * 370);
        if (i17 == 1) {
            int i18 = f52423b;
            int i19 = i18 + 23;
            f52424c = i19 % 128;
            int i20 = i19 % 2;
            int i21 = ((i18 ^ 115) | (i18 & 115)) << 1;
            int i22 = -(((~i18) & 115) | (i18 & (-116)));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            f52424c = i23 % 128;
            int i24 = i23 % 2;
            return f52422a;
        }
        if (i17 != 2) {
            if (i17 == 3) {
                return a(objArr);
            }
            abx abxVar = (abx) objArr[0];
            aci aciVar = (aci) objArr[1];
            int i25 = f52424c;
            int i26 = i25 & 21;
            int i27 = -(-((i25 ^ 21) | i26));
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            f52423b = i28 % 128;
            Object[] objArr2 = new Object[3];
            if (i28 % 2 != 0) {
                objArr2[0] = abxVar;
                objArr2[1] = aciVar;
                objArr2[2] = Boolean.FALSE;
                dividerPadding = setDividerPadding(objArr2, -657714353, 657714356, (int) System.currentTimeMillis());
            } else {
                objArr2[0] = abxVar;
                objArr2[1] = aciVar;
                objArr2[2] = Boolean.FALSE;
                dividerPadding = setDividerPadding(objArr2, -657714353, 657714356, (int) System.currentTimeMillis());
            }
            int iIntValue = ((Integer) dividerPadding).intValue();
            int i29 = f52423b;
            int i30 = (i29 | 111) << 1;
            int i31 = -(((~i29) & 111) | (i29 & (-112)));
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            f52424c = i32 % 128;
            if (i32 % 2 != 0) {
                return Integer.valueOf(iIntValue);
            }
            throw null;
        }
        abx abxVar2 = (abx) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i33 = f52423b;
        int i34 = i33 & 51;
        int i35 = (i34 - (~(-(-((i33 ^ 51) | i34))))) - 1;
        f52424c = i35 % 128;
        int i36 = i35 % 2;
        Intrinsics.checkNotNullParameter(abxVar2, "");
        if (jLongValue > 0) {
            int i37 = f52424c;
            int i38 = (((i37 | 118) << 1) - (i37 ^ 118)) - 1;
            f52423b = i38 % 128;
            int i39 = i38 % 2;
            long j10 = jLongValue - 1;
            if (((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar2, Long.valueOf(j10)}, 630256048, -630256030, System.identityHashCode(abxVar2))).byteValue() == 13) {
                int i40 = f52424c;
                int i41 = ((i40 ^ 33) | (i40 & 33)) << 1;
                int i42 = -(((~i40) & 33) | (i40 & (-34)));
                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                f52423b = i43 % 128;
                if (i43 % 2 != 0) {
                    str = (String) abx.setOnFocusChangeListener(new Object[]{abxVar2, Long.valueOf(jLongValue)}, -1247282902, 1247282923, System.identityHashCode(abxVar2));
                    abx.setOnFocusChangeListener(new Object[]{abxVar2, 2L}, -1525846840, 1525846865, System.identityHashCode(abxVar2));
                } else {
                    str = (String) abx.setOnFocusChangeListener(new Object[]{abxVar2, Long.valueOf(j10)}, -1247282902, 1247282923, System.identityHashCode(abxVar2));
                    abx.setOnFocusChangeListener(new Object[]{abxVar2, 2L}, -1525846840, 1525846865, System.identityHashCode(abxVar2));
                }
                int i44 = f52423b;
                int i45 = i44 & 53;
                int i46 = -(-(i44 | 53));
                int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                f52424c = i47 % 128;
                if (i47 % 2 == 0) {
                    i14 = 39;
                    int i48 = i14 / 0;
                }
            } else {
                str = (String) abx.setOnFocusChangeListener(new Object[]{abxVar2, Long.valueOf(jLongValue)}, -1247282902, 1247282923, System.identityHashCode(abxVar2));
                abx.setOnFocusChangeListener(new Object[]{abxVar2, 1L}, -1525846840, 1525846865, System.identityHashCode(abxVar2));
                int i49 = f52424c;
                i13 = (i49 ^ 113) + ((i49 & 113) << 1);
                f52423b = i13 % 128;
                if (i13 % 2 != 0) {
                    i14 = 15;
                    int i410 = i14 / 0;
                }
            }
        } else {
            str = (String) abx.setOnFocusChangeListener(new Object[]{abxVar2, Long.valueOf(jLongValue)}, -1247282902, 1247282923, System.identityHashCode(abxVar2));
            abx.setOnFocusChangeListener(new Object[]{abxVar2, 1L}, -1525846840, 1525846865, System.identityHashCode(abxVar2));
            int i411 = f52424c;
            i13 = (i411 ^ 113) + ((i411 & 113) << 1);
            f52423b = i13 % 128;
            if (i13 % 2 != 0) {
                i14 = 15;
                int i412 = i14 / 0;
            }
        }
        return str;
    }

    @NotNull
    public static final String setDividerPadding(@NotNull abx abxVar, long j10) {
        return (String) setDividerPadding(new Object[]{abxVar, Long.valueOf(j10)}, -854819362, 854819364, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final byte[] setDividerPadding() {
        return (byte[]) setDividerPadding(new Object[0], 1872722051, -1872722050, (int) System.currentTimeMillis());
    }
}
