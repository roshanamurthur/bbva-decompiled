package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.databinding.c;

/* JADX INFO: loaded from: classes10.dex */
public final class ajm extends adw {
    public static int I0 = 0;
    public static int J0 = 1;
    public ajj E0;
    public acz F0;
    public acz G0;
    public aje H0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public aed f52896r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public adp f52897s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public adp f52898t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public aiw f52899u0;
    public ain v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ajo f52900w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ajo f52901x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ain f52902y0;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.aed.setCompoundDrawableTintBlendMode(r1);
        r2 = new com.mypinpad.tsdk.isolation.ajm();
        r2.f52896r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if ((r1.setX(0) instanceof com.mypinpad.tsdk.isolation.aeh) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        r2.f52897s0 = (com.mypinpad.tsdk.isolation.adp) com.mypinpad.tsdk.isolation.adp.setOnFocusChangeListener(new java.lang.Object[]{(com.mypinpad.tsdk.isolation.aeh) r1.setX(0), java.lang.Boolean.TRUE}, 522248224, -522248221, (int) java.lang.System.currentTimeMillis());
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        r2.f52897s0 = new com.mypinpad.tsdk.isolation.adp(0);
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        r8 = r2.f52897s0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0088, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.adp.setOnFocusChangeListener(new java.lang.Object[]{r8, 0}, 920356441, -920356436, 0)).booleanValue() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008a, code lost:
    
        r8 = false;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a1, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.adp.setOnFocusChangeListener(new java.lang.Object[]{r8, 1}, 920356441, -920356436, 1)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a3, code lost:
    
        r7 = false;
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ba, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.adp.setOnFocusChangeListener(new java.lang.Object[]{r8, 2}, 920356441, -920356436, 2)).booleanValue() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
    
        r7 = false;
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00be, code lost:
    
        r10 = r3 & 2;
        r2.f52898t0 = (com.mypinpad.tsdk.isolation.adp) com.mypinpad.tsdk.isolation.adp.setOnFocusChangeListener(new java.lang.Object[]{r1.setX(((r3 ^ 2) + (r10 << 1)) - 1)}, -837021952, 837021958, (int) java.lang.System.currentTimeMillis());
        r9 = (int) java.lang.System.currentTimeMillis();
        r11 = -(-(r3 * 399));
        r13 = 798 ^ r11;
        r11 = -(-((r11 & 798) << 1));
        r12 = (r13 ^ r11) + ((r11 & r13) << 1);
        r14 = (-3) & r3;
        r13 = ~(((-3) ^ r3) | r14);
        r15 = ~r3;
        r4 = ~r15;
        r16 = (r15 & (-3)) | (r4 & 2);
        r6 = r15 & 2;
        r0 = (r16 ^ r6) | (r16 & r6);
        r11 = ~r0;
        r0 = ((r0 | r11) & r11) | r13;
        r11 = (r15 | r3) & r15;
        r13 = ~(r11 | r9);
        r5 = r0 & r13;
        r19 = r8;
        r0 = (r0 | r13) & (~r5);
        r0 = ((r0 & r5) | (r0 ^ r5)) * 398;
        r5 = r12 & r0;
        r0 = (r0 | r12) & (~r5);
        r5 = r5 << 1;
        r8 = (r0 & r5) + (r0 | r5);
        r0 = r6 | r14;
        r0 = ((r0 & r10) | (r0 ^ r10)) * (-1194);
        r5 = r8 ^ r0;
        r0 = (r0 & r8) << 1;
        r10 = (r5 ^ r0) + ((r0 & r5) << 1);
        r0 = ~r9;
        r4 = (r4 & r0) | ((~r0) & r15);
        r0 = r0 & r15;
        r0 = ~((r0 & r4) | (r4 ^ r0));
        r4 = ((~r14) & ((-3) | r3)) | r14;
        r5 = ~r4;
        r4 = (r4 | r5) & r5;
        r5 = r0 & r4;
        r0 = (r0 | r4) & (~r5);
        r0 = (r0 & r5) | (r0 ^ r5);
        r4 = ((~r6) & (r15 | 2)) | r6;
        r5 = ~r4;
        r4 = (r4 | r5) & r5;
        r2.f52899u0 = (com.mypinpad.tsdk.isolation.aiw) com.mypinpad.tsdk.isolation.aiw.setOnFocusChangeListener(new java.lang.Object[]{r1.setX((((r0 & r4) | (r0 ^ r4)) * 398) + r10)}, 866360717, -866360713, (int) java.lang.System.currentTimeMillis());
        r2.v0 = com.mypinpad.tsdk.isolation.ain.setCompoundDrawableTintBlendMode(r1.setX(r3 + 3));
        r0 = (com.mypinpad.tsdk.isolation.aed) r1.setX(r3 + 4);
        r2.f52900w0 = (com.mypinpad.tsdk.isolation.ajo) com.mypinpad.tsdk.isolation.ajo.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r0.setX(0)}, 149911214, -149911213, (int) java.lang.System.currentTimeMillis());
        r2.f52901x0 = (com.mypinpad.tsdk.isolation.ajo) com.mypinpad.tsdk.isolation.ajo.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r0.setX(1)}, 149911214, -149911213, (int) java.lang.System.currentTimeMillis());
        r0 = (int) java.lang.System.currentTimeMillis();
        r4 = -(~(r3 * 971));
        r4 = (-2) - ((-1) ^ (((-9695) & r4) + (r4 | (-9695))));
        r5 = r15 & 5;
        r6 = (~r5) & (r15 | 5);
        r5 = ~((r5 & r6) | (r6 ^ r5));
        r6 = ~r0;
        r8 = r6 & r3;
        r9 = (~r8) & (r6 | r3);
        r8 = ~((r8 & r9) | (r9 ^ r8));
        r9 = r5 & r8;
        r5 = (r5 | r8) & (~r9);
        r5 = -(-(((r5 & r9) | (r5 ^ r9)) * (-970)));
        r9 = r4 & r5;
        r8 = ((r4 ^ r5) | r9) << 1;
        r4 = -((r4 | r5) & (~r9));
        r5 = (r8 ^ r4) + ((r4 & r8) << 1);
        r8 = (-6) ^ r3;
        r9 = (-6) & r3;
        r8 = (r8 & r9) | (r8 ^ r9);
        r9 = ~r8;
        r8 = -(-(((r8 | r9) & r9) * 1940));
        r9 = r5 & r8;
        r5 = (r5 ^ r8) | r9;
        r8 = (r9 ^ r5) + ((r5 & r9) << 1);
        r4 = ~(((-6) & r15) | ((-6) ^ r15));
        r0 = (r0 | r6) & r6;
        r5 = r0 ^ r3;
        r0 = r0 & r3;
        r0 = ~((r0 & r5) | (r5 ^ r0));
        r0 = -(-(((r0 & r4) | (r4 ^ r0)) * 970));
        r4 = r8 | r0;
        r5 = r4 << 1;
        r0 = -((~(r0 & r8)) & r4);
        r2.f52902y0 = com.mypinpad.tsdk.isolation.ain.setCompoundDrawableTintBlendMode(r1.setX(((r5 | r0) << 1) - (r0 ^ r5)));
        r0 = (int) java.lang.System.currentTimeMillis();
        r4 = (r3 * 46) + 276;
        r5 = ~r0;
        r6 = r11 & r5;
        r8 = (~r6) & (r11 | r5);
        r6 = (r6 & r8) | (r8 ^ r6);
        r8 = ~r6;
        r6 = (r6 | r8) & r8;
        r6 = -(-(((r6 & 6) | (((~r6) & 6) | (r6 & (-7)))) * (-90)));
        r8 = ((~r6) & r4) | ((~r4) & r6);
        r4 = (r4 & r6) << 1;
        r9 = (r8 ^ r4) + ((r4 & r8) << 1);
        r4 = (r15 ^ r0) | (r15 & r0);
        r6 = ~r4;
        r4 = (r4 | r6) & r6;
        r6 = r3 & 6;
        r8 = (~r6) & (r3 | 6);
        r10 = ~((r8 ^ r6) | (r8 & r6));
        r12 = r4 & r10;
        r4 = (((r4 | r10) & (~r12)) | r12) * (-45);
        r10 = r9 & r4;
        r4 = (r4 | r9) & (~r10);
        r10 = -(-(r10 << 1));
        r12 = ((r4 | r10) << 1) - (r4 ^ r10);
        r9 = (-7) & r5;
        r10 = (r0 & 6) | r9;
        r0 = r0 & (-7);
        r0 = (r0 & r10) | (r10 ^ r0);
        r10 = ~r0;
        r0 = (r0 | r10) & r10;
        r0 = (r0 & r11) | (((~r0) & r11) | ((~r11) & r0));
        r5 = ~((r5 & 6) | (r9 | ((~r5) & 6)));
        r0 = -(-(((r0 & r5) | (((~r5) & r0) | ((~r0) & r5))) * 45));
        r5 = r12 & r0;
        r2.E0 = (com.mypinpad.tsdk.isolation.ajj) com.mypinpad.tsdk.isolation.ajj.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1.setX((((r0 | r12) & (~r5)) - (~(-(-(r5 << 1))))) - 1)}, 909154525, -909154522, (int) java.lang.System.currentTimeMillis());
        r0 = r1.setCompoundDrawableTintBlendMode();
        r5 = (int) java.lang.System.currentTimeMillis();
        r9 = r3 * 111;
        r11 = ((-654) & r9) + (r9 | (-654));
        r9 = r3 & r5;
        r10 = (~r9) & (r3 | r5);
        r10 = (r10 & r9) | (r10 ^ r9);
        r12 = ~r10;
        r10 = (r10 | r12) & r12;
        r12 = (-7) & r10;
        r10 = (r10 | (-7)) & (~r12);
        r10 = ((r10 & r12) | (r10 ^ r12)) * (-220);
        r12 = r11 ^ r10;
        r10 = -(-((r10 & r11) << 1));
        r11 = (r12 & r10) + (r10 | r12);
        r10 = (r3 ^ 6) | r6;
        r12 = ~r10;
        r10 = (r10 | r12) & r12;
        r5 = ~((r5 ^ r3) | r9);
        r5 = -(-(((r5 & r10) | (r10 ^ r5)) * 220));
        r9 = r11 & r5;
        r9 = r9 + ((r5 ^ r11) | r9);
        r5 = ((-7) & r15) | r6;
        r3 = r3 & (-7);
        r3 = ~((r3 & r5) | (r5 ^ r3));
        r4 = r15 & 6;
        r5 = (~r4) & (r15 | 6);
        r4 = (r4 & r5) | (r5 ^ r4);
        r5 = ~r4;
        r4 = (r4 | r5) & r5;
        r5 = r3 & r4;
        r3 = (r3 | r4) & (~r5);
        r3 = ((r3 & r5) | (r3 ^ r5)) * 110;
        r3 = -(((r9 | r3) << 1) - (r3 ^ r9));
        r4 = (int) java.lang.System.currentTimeMillis();
        r5 = r3 * 503;
        r9 = -(-(r0 * 503));
        r10 = r5 & r9;
        r5 = (r5 ^ r9) | r10;
        r9 = (r10 ^ r5) + ((r5 & r10) << 1);
        r5 = r3 & r0;
        r10 = (~r5) & (r3 | r0);
        r11 = ~r0;
        r10 = -(-(((r10 & r5) | (r10 ^ r5)) * (-502)));
        r12 = ((r9 ^ r10) | (r9 & r10)) << 1;
        r9 = -(((~r9) & r10) | ((~r10) & r9));
        r10 = ((r12 | r9) << 1) - (r9 ^ r12);
        r9 = ~r3;
        r12 = (r11 | r0) & r11;
        r13 = (~r12) & r9;
        r14 = ~r9;
        r12 = (r12 & r9) | (r13 | (r12 & r14));
        r13 = ~r12;
        r12 = (r12 | r13) & r13;
        r13 = ~r4;
        r12 = r12 | (~((r9 ^ r13) | (r9 & r13)));
        r15 = r3 ^ r0;
        r15 = (r15 ^ r5) | (r15 & r5);
        r15 = ~((r15 ^ r4) | (r15 & r4));
        r16 = r2;
        r17 = r1;
        r1 = ((~r12) & r15) | ((~r15) & r12);
        r2 = r12 & r15;
        r10 = (r10 - (~(((r1 & r2) | (r1 ^ r2)) * (-502)))) - 1;
        r1 = (r13 | r4) & r13;
        r1 = (r1 & r9) | (((~r1) & r9) | (r1 & r14));
        r1 = ~((r1 & r0) | ((r1 & r11) | ((~r1) & r0)));
        r0 = (r0 & r9) | (r3 & r11);
        r0 = (r0 & r5) | (r0 ^ r5);
        r0 = ~((r0 & r4) | (r0 ^ r4));
        r0 = -(~(-(-(((r0 & r1) | (r1 ^ r0)) * 502))));
        r1 = ((r10 | r0) << 1) - (r0 ^ r10);
        r0 = (r1 ^ (-1)) + (r1 << 1);
        r1 = (int) java.lang.System.currentTimeMillis();
        r2 = -(-(r0 * 829));
        r4 = (-829) & r2;
        r2 = (r2 | (-829)) & (~r4);
        r4 = -(-(r4 << 1));
        r5 = ((r2 | r4) << 1) - (r2 ^ r4);
        r2 = ~r0;
        r3 = ~r2;
        r3 = r3 & (r3 | r2);
        r4 = ~r1;
        r9 = r4 ^ (-1);
        r9 = (r9 & r4) | (r9 ^ r4);
        r10 = r9 ^ r0;
        r9 = r9 & r0;
        r9 = ~((r9 & r10) | (r10 ^ r9));
        r10 = ((~r9) & r3) | ((~r3) & r9);
        r3 = r3 & r9;
        r3 = ((r3 & r10) | (r10 ^ r3)) * (-828);
        r9 = ((r5 ^ r3) - (~((r3 & r5) << 1))) - 1;
        r0 = (r0 & r2) | (r2 ^ r0);
        r1 = (r1 | r4) & r4;
        r0 = -(~(((r0 & r1) | (r0 ^ r1)) * (-828)));
        r1 = (r9 ^ r0) + ((r0 & r9) << 1);
        r0 = (r1 ^ (-1)) + (r1 << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0479, code lost:
    
        if (r0 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x047b, code lost:
    
        if (r7 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0485, code lost:
    
        throw new java.lang.IllegalArgumentException("version 1 certificate contains extra data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0486, code lost:
    
        if (r0 <= 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0488, code lost:
    
        r2 = -(-(r6 << 1));
        r3 = ((r8 | r2) << 1) - (r2 ^ r8);
        r2 = ((r3 ^ r0) | (r3 & r0)) << 1;
        r3 = -(((~r3) & r0) | ((~r0) & r3));
        r4 = (r2 ^ r3) + ((r2 & r3) << 1);
        r2 = r17;
        r3 = (com.mypinpad.tsdk.isolation.aeh) r2.setX(r4);
        r4 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.aeh.setOnFocusChangeListener(new java.lang.Object[]{r3}, -1417963191, 1417963201, java.lang.System.identityHashCode(r3))).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x04ca, code lost:
    
        if (r4 == 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x04cd, code lost:
    
        if (r4 == 2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x04d0, code lost:
    
        if (r4 != 3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x04d2, code lost:
    
        if (r19 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x04d4, code lost:
    
        r4 = r16;
        r4.H0 = (com.mypinpad.tsdk.isolation.aje) com.mypinpad.tsdk.isolation.aje.setY(new java.lang.Object[]{(com.mypinpad.tsdk.isolation.aed) com.mypinpad.tsdk.isolation.aed.setY(new java.lang.Object[]{r3, java.lang.Boolean.TRUE}, 113370947, -113370947, (int) java.lang.System.currentTimeMillis())}, -779582673, 779582673, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x050f, code lost:
    
        throw new java.lang.IllegalArgumentException("version 2 certificate cannot contain extensions");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0510, code lost:
    
        r1 = new java.lang.StringBuilder("Unknown tag encountered in structure: ");
        r1.append(r3.setCompoundDrawableTintBlendMode());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0527, code lost:
    
        throw new java.lang.IllegalArgumentException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0528, code lost:
    
        r4 = r16;
        r4.G0 = (com.mypinpad.tsdk.isolation.acz) com.mypinpad.tsdk.isolation.acz.setDividerPadding(new java.lang.Object[]{r3}, -2033199183, 2033199187, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x053d, code lost:
    
        r4 = r16;
        r4.F0 = (com.mypinpad.tsdk.isolation.acz) com.mypinpad.tsdk.isolation.acz.setDividerPadding(new java.lang.Object[]{r3}, -2033199183, 2033199187, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0551, code lost:
    
        r1 = r0 & (-20);
        r0 = -(-((r0 ^ (-20)) | r1));
        r3 = (r1 ^ r0) + ((r0 & r1) << 1);
        r0 = r3 & 19;
        r0 = (r0 - (~((r3 ^ 19) | r0))) - 1;
        r17 = r2;
        r16 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x056c, code lost:
    
        r4 = r16;
        r0 = com.mypinpad.tsdk.isolation.ajm.J0 + 55;
        com.mypinpad.tsdk.isolation.ajm.I0 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0578, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0580, code lost:
    
        throw new java.lang.IllegalArgumentException("version number not recognised");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0581, code lost:
    
        r0 = (r3 & 55) + (r3 | 55);
        com.mypinpad.tsdk.isolation.ajm.I0 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x058d, code lost:
    
        if ((r0 % 2) == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x058f, code lost:
    
        r0 = 40 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0593, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0594, code lost:
    
        r0 = ((r2 ^ 104) + ((r2 & 104) << 1)) - 1;
        com.mypinpad.tsdk.isolation.ajm.J0 = r0 % 128;
        r1 = (com.mypinpad.tsdk.isolation.ajm) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x05a4, code lost:
    
        if ((r0 % 2) != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x05a6, code lost:
    
        r0 = 75 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x05aa, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if ((r1 instanceof com.mypinpad.tsdk.isolation.ajm) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if ((!(r1 instanceof com.mypinpad.tsdk.isolation.ajm)) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r1 == null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.mypinpad.tsdk.isolation.ajm a(java.lang.Object[] r20) {
        /*
            Method dump skipped, instruction units count: 1451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ajm.a(java.lang.Object[]):com.mypinpad.tsdk.i.ajm");
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14 = ~i11;
        int i15 = (i14 * (-629)) + (i11 * (-628)) + (i10 * 630);
        int i16 = ~i10;
        switch (((i16 | i11) * 629) + ((~(i14 | i16)) * (-629)) + i15) {
            case 1:
                ajm ajmVar = (ajm) objArr[0];
                int i17 = I0;
                int i18 = i17 & 115;
                int i19 = i18 + ((i17 ^ 115) | i18);
                J0 = i19 % 128;
                if (i19 % 2 == 0) {
                    throw null;
                }
                if (((String) bet.setCompoundDrawableTintBlendMode(new Object[]{"org.bouncycastle.x509.allow_non-der_tbscert"}, -1392453576, 1392453580, (int) System.currentTimeMillis())) == null) {
                    aed aedVar = ajmVar.f52896r0;
                    int i20 = J0;
                    int i21 = ((i20 | 117) << 1) - (i20 ^ 117);
                    I0 = i21 % 128;
                    if (i21 % 2 == 0) {
                        return aedVar;
                    }
                    throw null;
                }
                if (((Boolean) bet.setCompoundDrawableTintBlendMode(new Object[]{"org.bouncycastle.x509.allow_non-der_tbscert"}, 1196176667, -1196176666, (int) System.currentTimeMillis())).booleanValue()) {
                    int i22 = J0;
                    int i23 = (i22 & 109) + (i22 | 109);
                    int i24 = i23 % 128;
                    I0 = i24;
                    int i25 = i23 % 2;
                    aed aedVar2 = ajmVar.f52896r0;
                    int i26 = i24 ^ 49;
                    int i27 = (i24 & 49) << 1;
                    int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                    J0 = i28 % 128;
                    if (i28 % 2 != 0) {
                        return aedVar2;
                    }
                    int i29 = 62 / 0;
                    return aedVar2;
                }
                adh adhVar = new adh();
                if (!((Boolean) adp.setOnFocusChangeListener(new Object[]{ajmVar.f52897s0, 0}, 920356441, -920356436, 0)).booleanValue()) {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afx(true, 0, ajmVar.f52897s0)}, 240298319, -240298315, System.identityHashCode(adhVar));
                    int i30 = J0;
                    int i31 = i30 & 39;
                    int i32 = i31 + ((39 ^ i30) | i31);
                    I0 = i32 % 128;
                    int i33 = i32 % 2;
                }
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ajmVar.f52898t0}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ajmVar.f52899u0}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ajmVar.v0}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh adhVar2 = new adh(2);
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, ajmVar.f52900w0}, 240298319, -240298315, System.identityHashCode(adhVar2));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, c.a(adhVar2, new Object[]{adhVar2, ajmVar.f52901x0}, 240298319, -240298315, adhVar2)}, 240298319, -240298315, System.identityHashCode(adhVar));
                ain ainVar = ajmVar.f52902y0;
                if (ainVar != null) {
                    int i34 = J0;
                    int i35 = (i34 & (-88)) | ((~i34) & 87);
                    int i36 = (i34 & 87) << 1;
                    int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                    I0 = i37 % 128;
                    Object[] objArr2 = new Object[2];
                    if (i37 % 2 != 0) {
                        objArr2[0] = adhVar;
                        objArr2[1] = ainVar;
                        adh.setCompoundDrawableTintBlendMode(objArr2, 240298319, -240298315, System.identityHashCode(adhVar));
                        int i38 = 92 / 0;
                    } else {
                        objArr2[0] = adhVar;
                        objArr2[1] = ainVar;
                        adh.setCompoundDrawableTintBlendMode(objArr2, 240298319, -240298315, System.identityHashCode(adhVar));
                    }
                    int i39 = I0;
                    i13 = (i39 ^ 89) + ((i39 & 89) << 1);
                    J0 = i13 % 128;
                } else {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afv()}, 240298319, -240298315, System.identityHashCode(adhVar));
                    int i40 = J0;
                    i13 = (i40 ^ 89) + ((i40 & 89) << 1);
                    I0 = i13 % 128;
                }
                int i41 = i13 % 2;
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ajmVar.E0}, 240298319, -240298315, System.identityHashCode(adhVar));
                acz aczVar = ajmVar.F0;
                if (aczVar != null) {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afx(false, 1, aczVar)}, 240298319, -240298315, System.identityHashCode(adhVar));
                    int i42 = J0;
                    int i43 = i42 & 117;
                    int i44 = (i43 - (~((i42 ^ 117) | i43))) - 1;
                    I0 = i44 % 128;
                    int i45 = i44 % 2;
                }
                acz aczVar2 = ajmVar.G0;
                if (aczVar2 != null) {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afx(false, 2, aczVar2)}, 240298319, -240298315, System.identityHashCode(adhVar));
                    int i46 = I0;
                    int i47 = i46 & 65;
                    int i48 = ((((i46 ^ 65) | i47) << 1) - (~(-((i46 | 65) & (~i47))))) - 1;
                    J0 = i48 % 128;
                    int i49 = i48 % 2;
                }
                aje ajeVar = ajmVar.H0;
                if (ajeVar != null) {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afx(true, 3, ajeVar)}, 240298319, -240298315, System.identityHashCode(adhVar));
                    int i50 = J0;
                    int i51 = (-2) - (((i50 ^ 22) + ((i50 & 22) << 1)) ^ (-1));
                    I0 = i51 % 128;
                    int i52 = i51 % 2;
                }
                afv afvVar = new afv(adhVar);
                int i53 = J0;
                int i54 = ((i53 ^ 81) - (~((i53 & 81) << 1))) - 1;
                I0 = i54 % 128;
                if (i54 % 2 == 0) {
                    return afvVar;
                }
                throw null;
            case 2:
                ajm ajmVar2 = (ajm) objArr[0];
                int i55 = J0 + 7;
                I0 = i55 % 128;
                int i56 = i55 % 2;
                ain ainVar2 = ajmVar2.v0;
                if (i56 == 0) {
                    return ainVar2;
                }
                int i57 = 96 / 0;
                return ainVar2;
            case 3:
                return a(objArr);
            case 4:
                ajm ajmVar3 = (ajm) objArr[0];
                int i58 = I0;
                int i59 = (i58 & (-72)) | ((~i58) & 71);
                int i60 = -(-((i58 & 71) << 1));
                int i61 = (i59 & i60) + (i60 | i59);
                int i62 = i61 % 128;
                J0 = i62;
                int i63 = i61 % 2;
                ain ainVar3 = ajmVar3.f52902y0;
                int i64 = i62 & 125;
                int i65 = -(-((i62 ^ 125) | i64));
                int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
                I0 = i66 % 128;
                int i67 = i66 % 2;
                return ainVar3;
            case 5:
                ajm ajmVar4 = (ajm) objArr[0];
                int i68 = I0;
                int i69 = i68 & 95;
                int i70 = ((i68 | 95) & (~i69)) + (i69 << 1);
                int i71 = i70 % 128;
                J0 = i71;
                int i72 = i70 % 2;
                ajo ajoVar = ajmVar4.f52900w0;
                int i73 = (((i71 & (-84)) | ((~i71) & 83)) - (~(-(-((i71 & 83) << 1))))) - 1;
                I0 = i73 % 128;
                int i74 = i73 % 2;
                return ajoVar;
            case 6:
                ajm ajmVar5 = (ajm) objArr[0];
                int i75 = J0 + 123;
                I0 = i75 % 128;
                int i76 = i75 % 2;
                adp adpVar = ajmVar5.f52898t0;
                if (i76 == 0) {
                    return adpVar;
                }
                int i77 = 8 / 0;
                return adpVar;
            case 7:
                ajm ajmVar6 = (ajm) objArr[0];
                int i78 = I0;
                int i79 = i78 & 107;
                int i80 = -(-(i78 | 107));
                int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
                int i82 = i81 % 128;
                J0 = i82;
                int i83 = i81 % 2;
                aje ajeVar2 = ajmVar6.H0;
                if (i83 == 0) {
                    throw null;
                }
                int i84 = (((i82 & (-6)) | ((~i82) & 5)) - (~(-(-((i82 & 5) << 1))))) - 1;
                I0 = i84 % 128;
                if (i84 % 2 == 0) {
                    return ajeVar2;
                }
                int i85 = 18 / 0;
                return ajeVar2;
            case 8:
                ajm ajmVar7 = (ajm) objArr[0];
                int i86 = J0;
                int i87 = i86 & 91;
                int i88 = (i86 ^ 91) | i87;
                int i89 = (i87 & i88) + (i88 | i87);
                I0 = i89 % 128;
                int i90 = i89 % 2;
                ajo ajoVar2 = ajmVar7.f52901x0;
                if (i90 == 0) {
                    return ajoVar2;
                }
                throw null;
            case 9:
                ajm ajmVar8 = (ajm) objArr[0];
                int i91 = J0;
                int i92 = (-2) - ((((i91 | 96) << 1) - (i91 ^ 96)) ^ (-1));
                I0 = i92 % 128;
                int i93 = i92 % 2;
                aiw aiwVar = ajmVar8.f52899u0;
                if (i93 != 0) {
                    throw null;
                }
                int i94 = (i91 & (-48)) | ((~i91) & 47);
                int i95 = (i91 & 47) << 1;
                int i96 = ((i94 | i95) << 1) - (i95 ^ i94);
                I0 = i96 % 128;
                if (i96 % 2 == 0) {
                    return aiwVar;
                }
                throw null;
            case 10:
                ajm ajmVar9 = (ajm) objArr[0];
                int i97 = I0;
                int i98 = ((i97 ^ 75) - (~((i97 & 75) << 1))) - 1;
                J0 = i98 % 128;
                int i99 = i98 % 2;
                adp adpVar2 = ajmVar9.f52897s0;
                int iIntValue = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar2}, -2079758436, 2079758436, System.identityHashCode(adpVar2))).intValue();
                int iIdentityHashCode = System.identityHashCode(ajmVar9);
                int i100 = -(-(iIntValue * 421));
                int i101 = (-419) & i100;
                int i102 = (((((-419) ^ i100) | i101) << 1) - (~(-((i100 | (-419)) & (~i101))))) - 1;
                int i103 = iIntValue & iIdentityHashCode;
                int i104 = -(-((~(i103 | ((~i103) & (iIntValue | iIdentityHashCode)))) * TypedValues.CycleType.TYPE_EASING));
                int i105 = i102 & i104;
                int i106 = -(-((i104 ^ i102) | i105));
                int i107 = ((i105 | i106) << 1) - (i106 ^ i105);
                int i108 = ~iIntValue;
                int i109 = (-2) & i108;
                int i110 = (iIntValue & 1) | i109;
                int i111 = iIntValue & (-2);
                int i112 = ((i110 & i111) | (i110 ^ i111)) * (-420);
                int i113 = i107 & i112;
                int i114 = -(-((i112 ^ i107) | i113));
                int i115 = (i113 ^ i114) + ((i114 & i113) << 1);
                int i116 = (~i109) & (i108 | (-2));
                int i117 = (i116 & i109) | (i116 ^ i109);
                int i118 = ~i117;
                int i119 = (i117 | i118) & i118;
                int i120 = ~iIdentityHashCode;
                int i121 = i120 & iIntValue;
                int i122 = (i120 | iIntValue) & (~i121);
                int i123 = ~((i122 & i121) | (i122 ^ i121));
                int i124 = ((~i123) & i119) | ((~i119) & i123);
                int i125 = i123 & i119;
                int i126 = -(~(-(-(((i125 & i124) | (i124 ^ i125)) * TypedValues.CycleType.TYPE_EASING))));
                int i127 = (-2) - ((((i115 | i126) << 1) - (i126 ^ i115)) ^ (-1));
                int i128 = I0;
                int i129 = i128 & 45;
                int i130 = -(-((i128 ^ 45) | i129));
                int i131 = ((i129 | i130) << 1) - (i130 ^ i129);
                J0 = i131 % 128;
                int i132 = i131 % 2;
                return Integer.valueOf(i127);
            case 11:
                ajm ajmVar10 = (ajm) objArr[0];
                int i133 = J0;
                int i134 = i133 & 21;
                int i135 = (i133 ^ 21) | i134;
                int i136 = (i134 ^ i135) + ((i134 & i135) << 1);
                I0 = i136 % 128;
                int i137 = i136 % 2;
                acz aczVar3 = ajmVar10.F0;
                int i138 = i133 | 39;
                int i139 = (i138 << 1) - ((~(i133 & 39)) & i138);
                I0 = i139 % 128;
                int i140 = i139 % 2;
                return aczVar3;
            case 12:
                ajm ajmVar11 = (ajm) objArr[0];
                int i141 = J0;
                int i142 = i141 ^ 117;
                int i143 = ((i141 & 117) | i142) << 1;
                int i144 = -i142;
                int i145 = ((i143 | i144) << 1) - (i143 ^ i144);
                I0 = i145 % 128;
                int i146 = i145 % 2;
                acz aczVar4 = ajmVar11.G0;
                if (i146 == 0) {
                    return aczVar4;
                }
                throw null;
            default:
                ajm ajmVar12 = (ajm) objArr[0];
                int i147 = J0;
                int i148 = (i147 | 39) << 1;
                int i149 = -(((~i147) & 39) | (i147 & (-40)));
                int i150 = (i148 ^ i149) + ((i149 & i148) << 1);
                I0 = i150 % 128;
                int i151 = i150 % 2;
                ajj ajjVar = ajmVar12.E0;
                if (i151 == 0) {
                    return ajjVar;
                }
                throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setOnFocusChangeListener(new Object[]{this}, -178833350, 178833351, System.identityHashCode(this));
    }

    public final ain getNavBarTitleString() {
        return (ain) setOnFocusChangeListener(new Object[]{this}, -1888906596, 1888906600, System.identityHashCode(this));
    }

    public final adp setCompoundDrawableTintBlendMode() {
        return (adp) setOnFocusChangeListener(new Object[]{this}, 126303901, -126303895, System.identityHashCode(this));
    }

    public final int setDividerPadding() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, 351515074, -351515064, System.identityHashCode(this))).intValue();
    }

    public final acz setLayoutAnimation() {
        return (acz) setOnFocusChangeListener(new Object[]{this}, -163551548, 163551560, System.identityHashCode(this));
    }

    public final ajo setNavigationOnClickListener() {
        return (ajo) setOnFocusChangeListener(new Object[]{this}, 428405520, -428405512, System.identityHashCode(this));
    }

    public final ajj setOnDragListener() {
        return (ajj) setOnFocusChangeListener(new Object[]{this}, -1128225074, 1128225074, System.identityHashCode(this));
    }

    public final acz setOnLongClickListener() {
        return (acz) setOnFocusChangeListener(new Object[]{this}, 122086851, -122086840, System.identityHashCode(this));
    }

    public final ajo setX() {
        return (ajo) setOnFocusChangeListener(new Object[]{this}, -1665781041, 1665781046, System.identityHashCode(this));
    }

    public final ain setY() {
        return (ain) setOnFocusChangeListener(new Object[]{this}, -452619431, 452619433, System.identityHashCode(this));
    }

    public final aje setZ() {
        return (aje) setOnFocusChangeListener(new Object[]{this}, -1752564356, 1752564363, System.identityHashCode(this));
    }

    public static ajm setDividerPadding(Object obj) {
        return (ajm) setOnFocusChangeListener(new Object[]{obj}, -1192293909, 1192293912, (int) System.currentTimeMillis());
    }

    public final aiw setOnFocusChangeListener() {
        return (aiw) setOnFocusChangeListener(new Object[]{this}, 449055468, -449055459, System.identityHashCode(this));
    }
}
