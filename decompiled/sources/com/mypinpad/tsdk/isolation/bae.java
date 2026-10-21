package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes10.dex */
public final class bae implements Serializable {
    public static int F0 = 0;
    public static int G0 = 1;
    public transient int E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final transient c3 f54287p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f54288q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ArrayList f54289r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f54290s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ArrayList f54291t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final TreeMap f54292u0;
    public final Stack<baw> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final TreeMap f54293w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f54294x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final boolean f54295y0;

    public bae(bae baeVar, adu aduVar) {
        this.f54287p0 = new c3(new f3(aduVar));
        this.f54288q0 = baeVar.f54288q0;
        this.f54290s0 = baeVar.f54290s0;
        ArrayList arrayList = new ArrayList();
        this.f54291t0 = arrayList;
        arrayList.addAll(baeVar.f54291t0);
        this.f54292u0 = new TreeMap();
        for (Integer num : baeVar.f54292u0.keySet()) {
            this.f54292u0.put(num, (LinkedList) ((LinkedList) baeVar.f54292u0.get(num)).clone());
        }
        Stack<baw> stack = new Stack<>();
        this.v0 = stack;
        stack.addAll(baeVar.v0);
        this.f54289r0 = new ArrayList();
        for (a3 a3Var : baeVar.f54289r0) {
            ArrayList arrayList2 = this.f54289r0;
            arrayList2.add((a3) a3.b(new Object[]{a3Var}, 23734728, -23734727, System.identityHashCode(a3Var)));
        }
        this.f54293w0 = new TreeMap((Map) baeVar.f54293w0);
        this.f54294x0 = baeVar.f54294x0;
        this.E0 = baeVar.E0;
        this.f54295y0 = baeVar.f54295y0;
        setCompoundDrawableTintBlendMode(new Object[]{this}, -545269835, 545269841, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0134, code lost:
    
        if (r8 >= r10) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0136, code lost:
    
        r10 = new com.mypinpad.tsdk.i.ban.setCompoundDrawableTintBlendMode();
        r15 = new java.lang.Object[r2];
        r15[r0] = r7;
        r13 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.bar.setY(r15, r11, r12, java.lang.System.identityHashCode(r7))).intValue();
        r15 = new java.lang.Object[r4];
        r15[r0] = r10;
        r15[r2] = java.lang.Integer.valueOf(r13);
        r13 = (com.mypinpad.tsdk.i.ban.setCompoundDrawableTintBlendMode) ((com.mypinpad.tsdk.i.bar.setOnFocusChangeListener) com.mypinpad.tsdk.i.bar.setOnFocusChangeListener.setY(r15, 575278009, -575278009, r13));
        r10 = new java.lang.Object[r2];
        r10[r0] = r7;
        r10 = ((java.lang.Long) com.mypinpad.tsdk.isolation.bar.setY(r10, 482931428, -482931427, java.lang.System.identityHashCode(r7))).longValue();
        r12 = new java.lang.Object[r4];
        r12[r0] = r13;
        r12[r2] = java.lang.Long.valueOf(r10);
        r11 = new java.lang.Object[r4];
        r11[r0] = (com.mypinpad.tsdk.i.ban.setCompoundDrawableTintBlendMode) ((com.mypinpad.tsdk.i.bar.setOnFocusChangeListener) com.mypinpad.tsdk.i.bar.setOnFocusChangeListener.setY(r12, -1011452391, 1011452396, java.lang.System.identityHashCode(r13)));
        r11[r2] = java.lang.Integer.valueOf(r8);
        r10 = (com.mypinpad.tsdk.i.ban.setCompoundDrawableTintBlendMode) com.mypinpad.tsdk.i.ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(r11, 391211609, -391211603, r8);
        r11 = new java.lang.Object[r2];
        r11[r0] = r7;
        r11 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.ban.a(r11, -545166502, 545166504, java.lang.System.identityHashCode(r7))).intValue();
        r12 = new java.lang.Object[r4];
        r12[r0] = r10;
        r12[r2] = java.lang.Integer.valueOf(r11);
        r10 = (com.mypinpad.tsdk.i.ban.setCompoundDrawableTintBlendMode) com.mypinpad.tsdk.i.ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(r12, 874018780, -874018778, r11);
        r11 = new java.lang.Object[r2];
        r11[r0] = r7;
        r11 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.ban.a(r11, -484111224, 484111224, java.lang.System.identityHashCode(r7))).intValue();
        r12 = new java.lang.Object[r4];
        r12[r0] = r10;
        r12[r2] = java.lang.Integer.valueOf(r11);
        r10 = (com.mypinpad.tsdk.i.ban.setCompoundDrawableTintBlendMode) com.mypinpad.tsdk.i.ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(r12, -1717175544, 1717175544, r11);
        r11 = new java.lang.Object[r2];
        r11[r0] = r7;
        r7 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.bar.setY(r11, -1433420492, 1433420492, java.lang.System.identityHashCode(r7))).intValue();
        r11 = new java.lang.Object[r4];
        r11[r0] = r10;
        r11[r2] = java.lang.Integer.valueOf(r7);
        r7 = (com.mypinpad.tsdk.i.ban.setCompoundDrawableTintBlendMode) ((com.mypinpad.tsdk.i.bar.setOnFocusChangeListener) com.mypinpad.tsdk.i.bar.setOnFocusChangeListener.setY(r11, 1127697955, -1127697949, r7));
        r11 = new java.lang.Object[r2];
        r11[r0] = r7;
        r7 = (com.mypinpad.tsdk.isolation.ban) ((com.mypinpad.tsdk.isolation.bar) com.mypinpad.tsdk.i.ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(r11, 1084061586, -1084061582, java.lang.System.identityHashCode(r7)));
        r11 = new java.lang.Object[3];
        r15 = r1.f54287p0;
        r11[r0] = r15;
        r11[r2] = r5;
        r11[r4] = r7;
        r4 = (byte[]) com.mypinpad.tsdk.isolation.c3.c(r11, 2052322641, -2052322634, java.lang.System.identityHashCode(r15));
        r11 = new java.lang.Object[3];
        r11[r0] = r15;
        r11[r2] = r4;
        r11[2] = r3;
        com.mypinpad.tsdk.isolation.c3.c(r11, 612316896, -612316893, java.lang.System.identityHashCode(r15));
        r10 = new java.lang.Object[2];
        r10[r0] = r15;
        r10[r2] = r7;
        r4 = (com.mypinpad.tsdk.isolation.e3) com.mypinpad.tsdk.isolation.c3.c(r10, -754018063, 754018063, java.lang.System.identityHashCode(r15));
        r10 = new com.mypinpad.tsdk.i.bal.setOnFocusChangeListener();
        r11 = new java.lang.Object[r2];
        r11[r0] = r9;
        r2 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.bar.setY(r11, -322813125, 322813127, java.lang.System.identityHashCode(r9))).intValue();
        r12 = new java.lang.Object[2];
        r12[r0] = r10;
        r12[1] = java.lang.Integer.valueOf(r2);
        r2 = (com.mypinpad.tsdk.i.bal.setOnFocusChangeListener) ((com.mypinpad.tsdk.i.bar.setOnFocusChangeListener) com.mypinpad.tsdk.i.bar.setOnFocusChangeListener.setY(r12, 575278009, -575278009, r2));
        r10 = new java.lang.Object[1];
        r10[r0] = r9;
        r10 = ((java.lang.Long) com.mypinpad.tsdk.isolation.bar.setY(r10, 482931428, -482931427, java.lang.System.identityHashCode(r9))).longValue();
        r13 = new java.lang.Object[2];
        r13[r0] = r2;
        r13[1] = java.lang.Long.valueOf(r10);
        r10 = new java.lang.Object[2];
        r10[r0] = (com.mypinpad.tsdk.i.bal.setOnFocusChangeListener) ((com.mypinpad.tsdk.i.bar.setOnFocusChangeListener) com.mypinpad.tsdk.i.bar.setOnFocusChangeListener.setY(r13, -1011452391, 1011452396, java.lang.System.identityHashCode(r2)));
        r10[1] = java.lang.Integer.valueOf(r8);
        r2 = (com.mypinpad.tsdk.i.bal.setOnFocusChangeListener) com.mypinpad.tsdk.i.bal.setOnFocusChangeListener.setDividerPadding(r10, 212799444, -212799438, r8);
        r10 = new java.lang.Object[1];
        r10[r0] = r9;
        r10 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.bal.b(r10, 153992836, -153992833, java.lang.System.identityHashCode(r9))).intValue();
        r12 = new java.lang.Object[2];
        r12[r0] = r2;
        r12[1] = java.lang.Integer.valueOf(r10);
        r2 = (com.mypinpad.tsdk.i.bal.setOnFocusChangeListener) com.mypinpad.tsdk.i.bal.setOnFocusChangeListener.setDividerPadding(r12, -1728245301, 1728245303, r10);
        r10 = new java.lang.Object[1];
        r10[r0] = r9;
        r10 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.bal.b(r10, -367587425, 367587425, java.lang.System.identityHashCode(r9))).intValue();
        r12 = new java.lang.Object[2];
        r12[r0] = r2;
        r12[1] = java.lang.Integer.valueOf(r10);
        r2 = (com.mypinpad.tsdk.i.bal.setOnFocusChangeListener) com.mypinpad.tsdk.i.bal.setOnFocusChangeListener.setDividerPadding(r12, 1925518320, -1925518319, r10);
        r10 = new java.lang.Object[1];
        r10[r0] = r9;
        r9 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.bar.setY(r10, -1433420492, 1433420492, java.lang.System.identityHashCode(r9))).intValue();
        r12 = new java.lang.Object[2];
        r12[r0] = r2;
        r12[1] = java.lang.Integer.valueOf(r9);
        r9 = (com.mypinpad.tsdk.i.bal.setOnFocusChangeListener) ((com.mypinpad.tsdk.i.bar.setOnFocusChangeListener) com.mypinpad.tsdk.i.bar.setOnFocusChangeListener.setY(r12, 1127697955, -1127697949, r9));
        r2 = new java.lang.Object[1];
        r2[r0] = r9;
        r9 = (com.mypinpad.tsdk.isolation.bal) ((com.mypinpad.tsdk.isolation.bar) com.mypinpad.tsdk.i.bal.setOnFocusChangeListener.setDividerPadding(r2, 2125069984, -2125069977, java.lang.System.identityHashCode(r9)));
        r13 = new java.lang.Object[3];
        r13[r0] = r15;
        r13[1] = r4;
        r13[2] = r9;
        r4 = r1;
        r0 = com.mypinpad.tsdk.isolation.g3.a(r13, -1348979818, 1348979819, (int) java.lang.System.currentTimeMillis());
        r1 = new com.mypinpad.tsdk.i.bam.setX();
        r2 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.bar.setY(new java.lang.Object[]{r6}, -322813125, 322813127, java.lang.System.identityHashCode(r6))).intValue();
        r2 = (com.mypinpad.tsdk.i.bam.setX) ((com.mypinpad.tsdk.i.bar.setOnFocusChangeListener) com.mypinpad.tsdk.i.bar.setOnFocusChangeListener.setY(new java.lang.Object[]{r1, java.lang.Integer.valueOf(r2)}, 575278009, -575278009, r2));
        r2 = (com.mypinpad.tsdk.i.bam.setX) com.mypinpad.tsdk.i.bam.setX.setX(new java.lang.Object[]{(com.mypinpad.tsdk.i.bam.setX) ((com.mypinpad.tsdk.i.bar.setOnFocusChangeListener) com.mypinpad.tsdk.i.bar.setOnFocusChangeListener.setY(new java.lang.Object[]{r2, java.lang.Long.valueOf(((java.lang.Long) com.mypinpad.tsdk.isolation.bar.setY(new java.lang.Object[]{r6}, 482931428, -482931427, java.lang.System.identityHashCode(r6))).longValue())}, -1011452391, 1011452396, java.lang.System.identityHashCode(r2))), java.lang.Integer.valueOf(r8)}, -2130967129, 2130967131, r8);
        r1 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.bar.setY(new java.lang.Object[]{r6}, -1433420492, 1433420492, java.lang.System.identityHashCode(r6))).intValue();
        r1 = (com.mypinpad.tsdk.i.bam.setX) ((com.mypinpad.tsdk.i.bar.setOnFocusChangeListener) com.mypinpad.tsdk.i.bar.setOnFocusChangeListener.setY(new java.lang.Object[]{r2, java.lang.Integer.valueOf(r1)}, 1127697955, -1127697949, r1));
        r1 = (com.mypinpad.tsdk.isolation.bam) ((com.mypinpad.tsdk.isolation.bar) com.mypinpad.tsdk.i.bam.setX.setX(new java.lang.Object[]{r1}, -1826442849, 1826442849, java.lang.System.identityHashCode(r1)));
        r6 = com.mypinpad.tsdk.isolation.bae.G0;
        r10 = ((r6 | 77) << 1) - (r6 ^ 77);
        com.mypinpad.tsdk.isolation.bae.F0 = r10 % 128;
        r10 = r10 % 2;
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x04bd, code lost:
    
        if (r14.isEmpty() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x04bf, code lost:
    
        r1 = (-2) - ((com.mypinpad.tsdk.isolation.bae.F0 + 104) ^ (-1));
        com.mypinpad.tsdk.isolation.bae.G0 = r1 % 128;
        r1 = r1 % 2;
        r1 = r14.peek();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x04ff, code lost:
    
        if (((java.lang.Integer) com.mypinpad.tsdk.isolation.baw.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1}, 1955195146, -1955195145, java.lang.System.identityHashCode(r1))).intValue() != ((java.lang.Integer) com.mypinpad.tsdk.isolation.baw.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r0}, 1955195146, -1955195145, java.lang.System.identityHashCode(r0))).intValue()) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0501, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.bae.F0 + 105;
        com.mypinpad.tsdk.isolation.bae.G0 = r1 % 128;
        r1 = r1 % 2;
        r10 = r8 / (1 << ((java.lang.Integer) com.mypinpad.tsdk.isolation.baw.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r0}, 1955195146, -1955195145, java.lang.System.identityHashCode(r0))).intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0523, code lost:
    
        if (r10 != 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0525, code lost:
    
        r11 = com.mypinpad.tsdk.isolation.bae.G0;
        r1 = (r11 ^ 65) + ((r11 & 65) << 1);
        com.mypinpad.tsdk.isolation.bae.F0 = r1 % 128;
        r1 = r1 % 2;
        r4.f54291t0.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0539, code lost:
    
        if (r1 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x053b, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.bae.G0 + 17;
        com.mypinpad.tsdk.isolation.bae.F0 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0546, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0547, code lost:
    
        r1 = r4.f54290s0;
        r11 = r4.f54288q0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x054c, code lost:
    
        if (r10 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x054e, code lost:
    
        r2 = com.mypinpad.tsdk.isolation.bae.G0;
        r23 = ((r2 ^ 73) | (r2 & 73)) << 1;
        r2 = -((r2 & (-74)) | (73 & (~r2)));
        r2 = ((r23 | r2) << 1) - (r23 ^ r2);
        com.mypinpad.tsdk.isolation.bae.F0 = r2 % 128;
        r2 = r2 % 2;
        r27 = r3;
        r2 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.baw.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r0}, 1955195146, -1955195145, java.lang.System.identityHashCode(r0))).intValue();
        r3 = -r1;
        r12 = java.lang.System.identityHashCode(r4);
        r13 = r3 * (-167);
        r28 = r5;
        r5 = -(-(r11 * (-167)));
        r29 = r7;
        r30 = r9;
        r7 = ((~r5) & r13) | ((~r13) & r5);
        r5 = (r5 & r13) << 1;
        r13 = (r7 ^ r5) + ((r5 & r7) << 1);
        r5 = ~r3;
        r7 = ~r11;
        r9 = (r7 | r11) & r7;
        r31 = r8;
        r8 = (~r9) & r5;
        r32 = r15;
        r15 = ~r5;
        r8 = r8 | (r9 & r15);
        r9 = r9 & r5;
        r8 = ~((r8 ^ r9) | (r8 & r9));
        r9 = ~r12;
        r33 = r7 ^ r9;
        r34 = r7 & r9;
        r35 = r33 ^ r34;
        r33 = r33 & r34;
        r34 = r14;
        r14 = ~(r35 | r33);
        r33 = r6;
        r35 = r1;
        r13 = (r13 - (~(-(-(((((~r8) & r14) | ((~r14) & r8)) | (r8 & r14)) * 168))))) - 1;
        r1 = (r5 | r3) & r5;
        r6 = r1 ^ r7;
        r1 = r1 & r7;
        r1 = (r1 & r6) | (r6 ^ r1);
        r6 = r1 ^ r12;
        r1 = r1 & r12;
        r1 = (~((r1 & r6) | (r6 ^ r1))) * 168;
        r6 = r13 ^ r1;
        r1 = (((r1 & r13) | r6) << 1) - r6;
        r6 = (r9 | r12) & r9;
        r8 = ((~r6) & r5) | (r6 & r15);
        r6 = r6 & r5;
        r6 = ~((r6 & r8) | (r8 ^ r6));
        r8 = r5 & r7;
        r5 = ~((r5 & r11) | ((r11 & r15) | r8));
        r13 = r6 & r5;
        r5 = (r5 | r6) & (~r13);
        r5 = (r5 & r13) | (r5 ^ r13);
        r6 = ((~r7) & r3) | r8;
        r3 = r3 & r7;
        r3 = (r3 & r6) | (r6 ^ r3);
        r6 = (r3 & r9) | ((~r3) & r12);
        r3 = r3 & r12;
        r3 = (r3 & r6) | (r6 ^ r3);
        r6 = ~r3;
        r3 = (r3 | r6) & r6;
        r6 = r5 & r3;
        r3 = (r3 | r5) & (~r6);
        r3 = ((r3 & r6) | (r3 ^ r6)) * 168;
        r5 = r1 & r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0645, code lost:
    
        if (r2 >= (((r1 | r3) & (~r5)) + (r5 << 1))) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0647, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.bae.G0;
        r2 = r1 & 123;
        r1 = (r1 | 123) & (~r2);
        r2 = r2 << 1;
        r5 = ((r1 | r2) << 1) - (r1 ^ r2);
        com.mypinpad.tsdk.isolation.bae.F0 = r5 % 128;
        r5 = r5 % 2;
        r6 = (com.mypinpad.tsdk.isolation.a3) r4.f54289r0.get(((java.lang.Integer) com.mypinpad.tsdk.isolation.baw.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r0}, 1955195146, -1955195145, java.lang.System.identityHashCode(r0))).intValue());
        com.mypinpad.tsdk.isolation.a3.b(new java.lang.Object[]{r6, r0}, -271352903, 271352910, java.lang.System.identityHashCode(r6));
        r1 = com.mypinpad.tsdk.isolation.bae.F0;
        r5 = ((r1 ^ 103) - (~(-(-((r1 & 103) << 1))))) - 1;
        com.mypinpad.tsdk.isolation.bae.G0 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x06a4, code lost:
    
        r35 = r1;
        r27 = r3;
        r28 = r5;
        r33 = r6;
        r29 = r7;
        r31 = r8;
        r30 = r9;
        r34 = r14;
        r32 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x06b7, code lost:
    
        if (r10 < 3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x06b9, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.bae.F0;
        r3 = r1 & 93;
        r3 = (r3 - (~(-(-((r1 ^ 93) | r3))))) - 1;
        r5 = r3 % 128;
        com.mypinpad.tsdk.isolation.bae.G0 = r5;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x06ce, code lost:
    
        if ((r10 & 1) != 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x06d0, code lost:
    
        r3 = (r5 & 33) + (r5 | 33);
        com.mypinpad.tsdk.isolation.bae.F0 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x06db, code lost:
    
        if ((r3 % 2) == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x06f8, code lost:
    
        if (((java.lang.Integer) com.mypinpad.tsdk.isolation.baw.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r0}, 1955195146, -1955195145, java.lang.System.identityHashCode(r0))).intValue() < (r11 % r35)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x06fb, code lost:
    
        r5 = -r35;
        r6 = r11 ^ r5;
        r5 = -(-((r5 & r11) << 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0722, code lost:
    
        if (((java.lang.Integer) com.mypinpad.tsdk.isolation.baw.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r0}, 1955195146, -1955195145, java.lang.System.identityHashCode(r0))).intValue() < (((r6 | r5) << 1) - (r5 ^ r6))) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0724, code lost:
    
        r1 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.baw.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r0}, 1955195146, -1955195145, java.lang.System.identityHashCode(r0))).intValue();
        r3 = java.lang.System.identityHashCode(r4);
        r5 = -(-(r11 * (-495)));
        r7 = ((990 ^ r5) | (990 & r5)) << 1;
        r5 = -((r5 & (-991)) | (990 & (~r5)));
        r6 = ((r7 | r5) << 1) - (r5 ^ r7);
        r5 = ~r11;
        r7 = 1 & r5;
        r9 = (~r7) & (1 | r5);
        r9 = ~((r9 & r7) | (r9 ^ r7));
        r10 = ~r3;
        r12 = (1 & r10) | (r3 & (-2));
        r13 = 1 & r3;
        r12 = ~((r12 & r13) | (r12 ^ r13));
        r9 = ((r9 & r12) | (r9 ^ r12)) * 992;
        r12 = ((r6 | r9) << 1) - (r6 ^ r9);
        r5 = (r5 ^ 1) | r7;
        r6 = ~r5;
        r5 = (r5 | r6) & r6;
        r6 = 1 ^ r3;
        r6 = (r6 & r13) | (r6 ^ r13);
        r7 = ~r6;
        r6 = (r6 | r7) & r7;
        r7 = ((~r6) & r5) | ((~r5) & r6);
        r5 = r5 & r6;
        r5 = (r5 & r7) | (r7 ^ r5);
        r6 = (r10 ^ (-2)) | (r10 & (-2));
        r7 = r6 & r11;
        r6 = (r6 | r11) & (~r7);
        r6 = (r6 & r7) | (r6 ^ r7);
        r7 = ~r6;
        r6 = (r6 | r7) & r7;
        r7 = ((~r6) & r5) | ((~r5) & r6);
        r5 = r5 & r6;
        r5 = ((r5 & r7) | (r7 ^ r5)) * (-496);
        r6 = ((((~r5) & r12) | ((~r12) & r5)) - (~(-(-((r5 & r12) << 1))))) - 1;
        r3 = ((r3 & r11) | (r11 ^ r3)) * 496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x07d4, code lost:
    
        if (r1 > (((((r6 ^ r3) | (r6 & r3)) << 1) - (~(-((r3 & (~r6)) | ((~r3) & r6))))) - 1)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x07d6, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.bae.F0 + 91;
        com.mypinpad.tsdk.isolation.bae.G0 = r1 % 128;
        r1 = r1 % 2;
        r1 = java.lang.Integer.valueOf(((java.lang.Integer) com.mypinpad.tsdk.isolation.baw.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r0}, 1955195146, -1955195145, java.lang.System.identityHashCode(r0))).intValue());
        r3 = r4.f54292u0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0803, code lost:
    
        if (r3.get(r1) != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0805, code lost:
    
        r1 = new java.util.LinkedList();
        r1.add(r0);
        r3.put(java.lang.Integer.valueOf(((java.lang.Integer) com.mypinpad.tsdk.isolation.baw.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r0}, 1955195146, -1955195145, java.lang.System.identityHashCode(r0))).intValue()), r1);
        r1 = com.mypinpad.tsdk.isolation.bae.F0;
        r3 = (((r1 & (-60)) | ((~r1) & 59)) - (~((r1 & 59) << 1))) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x083d, code lost:
    
        com.mypinpad.tsdk.isolation.bae.G0 = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0844, code lost:
    
        ((java.util.LinkedList) r3.get(java.lang.Integer.valueOf(((java.lang.Integer) com.mypinpad.tsdk.isolation.baw.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r0}, 1955195146, -1955195145, java.lang.System.identityHashCode(r0))).intValue()))).add(r0);
        r1 = com.mypinpad.tsdk.isolation.bae.F0;
        r5 = r1 & 51;
        r3 = (((r1 ^ 51) | r5) << 1) - ((r1 | 51) & (~r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x087a, code lost:
    
        r1 = new com.mypinpad.tsdk.i.bam.setX();
        r5 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.bar.setY(new java.lang.Object[]{r33}, -322813125, 322813127, java.lang.System.identityHashCode(r33))).intValue();
        r5 = (com.mypinpad.tsdk.i.bam.setX) ((com.mypinpad.tsdk.i.bar.setOnFocusChangeListener) com.mypinpad.tsdk.i.bar.setOnFocusChangeListener.setY(new java.lang.Object[]{r1, java.lang.Integer.valueOf(r5)}, 575278009, -575278009, r5));
        r1 = (com.mypinpad.tsdk.i.bam.setX) ((com.mypinpad.tsdk.i.bar.setOnFocusChangeListener) com.mypinpad.tsdk.i.bar.setOnFocusChangeListener.setY(new java.lang.Object[]{r5, java.lang.Long.valueOf(((java.lang.Long) com.mypinpad.tsdk.isolation.bar.setY(new java.lang.Object[]{r33}, 482931428, -482931427, java.lang.System.identityHashCode(r33))).longValue())}, -1011452391, 1011452396, java.lang.System.identityHashCode(r5)));
        r5 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.bam.b(new java.lang.Object[]{r33}, -75806786, 75806786, java.lang.System.identityHashCode(r33))).intValue();
        r5 = (com.mypinpad.tsdk.i.bam.setX) com.mypinpad.tsdk.i.bam.setX.setX(new java.lang.Object[]{r1, java.lang.Integer.valueOf(r5)}, 849744138, -849744134, r5);
        r3 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.bam.b(new java.lang.Object[]{r33}, -844564495, 844564497, java.lang.System.identityHashCode(r33))).intValue();
        r9 = java.lang.System.identityHashCode(r4);
        r12 = (-2) - (((-217) - (~(r3 * (-215)))) ^ (-1));
        r13 = ~r9;
        r14 = -(-((~((r13 ^ r9) | (r13 & r9))) * 216));
        r2 = ((~r12) & r14) | ((~r14) & r12);
        r12 = -(-((r12 & r14) << 1));
        r14 = (r2 & r12) + (r2 | r12);
        r2 = ~r3;
        r2 = r2 & (r2 | r3);
        r2 = r2 | ((-1) ^ r2);
        r9 = (r9 | r13) & r13;
        r12 = r2 & r9;
        r2 = (r2 | r9) & (~r12);
        r14 = (r14 - (~(-(-(((r2 & r12) | (r2 ^ r12)) * (-216)))))) - 1;
        r2 = (r9 ^ (-1)) | r9;
        r9 = ~r2;
        r2 = (r2 | r9) & r9;
        r9 = r3 ^ r2;
        r2 = r2 & r3;
        r2 = ((r2 & r9) | (r9 ^ r2)) * 216;
        r3 = ((r14 ^ r2) + ((r2 & r14) << 1)) / 2;
        r3 = (com.mypinpad.tsdk.i.bam.setX) com.mypinpad.tsdk.i.bam.setX.setX(new java.lang.Object[]{r5, java.lang.Integer.valueOf(r3)}, -2130967129, 2130967131, r3);
        r5 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.bar.setY(new java.lang.Object[]{r33}, -1433420492, 1433420492, java.lang.System.identityHashCode(r33))).intValue();
        r5 = (com.mypinpad.tsdk.i.bam.setX) ((com.mypinpad.tsdk.i.bar.setOnFocusChangeListener) com.mypinpad.tsdk.i.bar.setOnFocusChangeListener.setY(new java.lang.Object[]{r3, java.lang.Integer.valueOf(r5)}, 1127697955, -1127697949, r5));
        r3 = (com.mypinpad.tsdk.isolation.bam) ((com.mypinpad.tsdk.isolation.bar) com.mypinpad.tsdk.i.bam.setX.setX(new java.lang.Object[]{r5}, -1826442849, 1826442849, java.lang.System.identityHashCode(r5)));
        r0 = com.mypinpad.tsdk.isolation.g3.a(new java.lang.Object[]{r32, r34.pop(), r0, r3}, 300430928, -300430928, (int) java.lang.System.currentTimeMillis());
        r9 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.baw.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r0}, 1955195146, -1955195145, java.lang.System.identityHashCode(r0))).intValue();
        r13 = java.lang.System.identityHashCode(r4);
        r14 = (-832) - (~(-(~(r9 * 832))));
        r15 = ~r9;
        r2 = ~r13;
        r5 = ~((r15 ^ r2) | (r15 & r2));
        r16 = r9 | 1;
        r10 = r16 & r13;
        r11 = (~r10) & (r16 | r13);
        r10 = ~((r11 ^ r10) | (r10 & r11));
        r1 = ((~r5) & r10) | ((~r10) & r5);
        r5 = r5 & r10;
        r1 = ((r1 & r5) | (r1 ^ r5)) * (-831);
        r5 = (((~r1) & r14) | ((~r14) & r1)) + ((r1 & r14) << 1);
        r1 = r15 | 1;
        r10 = (r1 & r2) | ((~r1) & r13);
        r1 = r1 & r13;
        r1 = (~((r1 & r10) | (r10 ^ r1))) * (-1662);
        r10 = ((r5 | r1) << 1) - (r1 ^ r5);
        r1 = (r2 | r13) & r2;
        r5 = ((-2) & (~r1)) | (r1 & 1);
        r1 = (-2) & r1;
        r1 = (r1 & r5) | (r5 ^ r1);
        r5 = ~r1;
        r1 = (r1 | r5) & r5;
        r5 = (r2 & 1) | (r13 & (-2));
        r11 = r13 & 1;
        r5 = ~((r5 & r11) | (r5 ^ r11));
        r11 = ((~r5) & r1) | ((~r1) & r5);
        r1 = r1 & r5;
        r1 = (r1 & r11) | (r11 ^ r1);
        r2 = (r2 & r9) | (r13 & r15);
        r5 = r9 & r13;
        r2 = (r2 & r5) | (r2 ^ r5);
        r5 = ~r2;
        r2 = (r2 | r5) & r5;
        r1 = -(~(-(-(((r1 & r2) | (r1 ^ r2)) * 831))));
        r2 = (r10 & r1) + (r1 | r10);
        r12 = new com.mypinpad.tsdk.isolation.baw((r2 ^ (-1)) + (r2 << 1), (byte[]) com.mypinpad.tsdk.isolation.baw.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r0}, 1592072604, -1592072604, java.lang.System.identityHashCode(r0)));
        r0 = new com.mypinpad.tsdk.i.bam.setX();
        r1 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.bar.setY(new java.lang.Object[]{r3}, -322813125, 322813127, java.lang.System.identityHashCode(r3))).intValue();
        r0 = (com.mypinpad.tsdk.i.bam.setX) ((com.mypinpad.tsdk.i.bar.setOnFocusChangeListener) com.mypinpad.tsdk.i.bar.setOnFocusChangeListener.setY(new java.lang.Object[]{r0, java.lang.Integer.valueOf(r1)}, 575278009, -575278009, r1));
        r0 = (com.mypinpad.tsdk.i.bam.setX) ((com.mypinpad.tsdk.i.bar.setOnFocusChangeListener) com.mypinpad.tsdk.i.bar.setOnFocusChangeListener.setY(new java.lang.Object[]{r0, java.lang.Long.valueOf(((java.lang.Long) com.mypinpad.tsdk.isolation.bar.setY(new java.lang.Object[]{r3}, 482931428, -482931427, java.lang.System.identityHashCode(r3))).longValue())}, -1011452391, 1011452396, java.lang.System.identityHashCode(r0)));
        r5 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.bam.b(new java.lang.Object[]{r3}, -75806786, 75806786, java.lang.System.identityHashCode(r3))).intValue();
        r7 = java.lang.System.identityHashCode(r4);
        r8 = -(-(r5 * 471));
        r11 = ((236 ^ r8) - (~((r8 & 236) << 1))) - 1;
        r8 = ~r7;
        r9 = (-2) ^ r8;
        r8 = (-2) & r8;
        r8 = (r9 ^ r8) | (r8 & r9);
        r9 = ~r8;
        r8 = (r8 | r9) & r9;
        r9 = r5 ^ r8;
        r8 = r8 & r5;
        r8 = -(~(-(-(((r9 ^ r8) | (r8 & r9)) * (-235)))));
        r9 = ((r11 | r8) << 1) - (r8 ^ r11);
        r8 = (r9 ^ (-1)) + (r9 << 1);
        r9 = (-2) ^ r7;
        r11 = (-2) & r7;
        r9 = ~((r9 ^ r11) | (r9 & r11));
        r9 = -(-(((r9 & r5) | (r5 ^ r9)) * (-470)));
        r1 = ((~r8) & r9) | ((~r9) & r8);
        r8 = -(-((r8 & r9) << 1));
        r11 = ((r1 | r8) << 1) - (r1 ^ r8);
        r1 = ~r5;
        r1 = ~((r1 & 1) | (((~r1) & 1) | (r1 & (-2))));
        r2 = (-2) | r5;
        r5 = r2 & r7;
        r2 = ((r2 | r7) & (~r5)) | r5;
        r5 = ~r2;
        r2 = (r2 | r5) & r5;
        r5 = ((~r2) & r1) | ((~r1) & r2);
        r1 = r1 & r2;
        r11 = (r11 - (~(((r1 & r5) | (r5 ^ r1)) * 235))) - 1;
        r0 = (com.mypinpad.tsdk.i.bam.setX) com.mypinpad.tsdk.i.bam.setX.setX(new java.lang.Object[]{r0, java.lang.Integer.valueOf(r11)}, 849744138, -849744134, r11);
        r5 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.bam.b(new java.lang.Object[]{r3}, -844564495, 844564497, java.lang.System.identityHashCode(r3))).intValue();
        r0 = (com.mypinpad.tsdk.i.bam.setX) com.mypinpad.tsdk.i.bam.setX.setX(new java.lang.Object[]{r0, java.lang.Integer.valueOf(r5)}, -2130967129, 2130967131, r5);
        r3 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.bar.setY(new java.lang.Object[]{r3}, -1433420492, 1433420492, java.lang.System.identityHashCode(r3))).intValue();
        r3 = (com.mypinpad.tsdk.i.bam.setX) ((com.mypinpad.tsdk.i.bar.setOnFocusChangeListener) com.mypinpad.tsdk.i.bar.setOnFocusChangeListener.setY(new java.lang.Object[]{r0, java.lang.Integer.valueOf(r3)}, 1127697955, -1127697949, r3));
        r1 = (com.mypinpad.tsdk.isolation.bam) ((com.mypinpad.tsdk.isolation.bar) com.mypinpad.tsdk.i.bam.setX.setX(new java.lang.Object[]{r3}, -1826442849, 1826442849, java.lang.System.identityHashCode(r3)));
        r11 = com.mypinpad.tsdk.isolation.bae.G0 + 85;
        com.mypinpad.tsdk.isolation.bae.F0 = r11 % 128;
        r11 = r11 % 2;
        r6 = r1;
        r0 = r12;
        r3 = r27;
        r5 = r28;
        r7 = r29;
        r9 = r30;
        r8 = r31;
        r15 = r32;
        r14 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0c6f, code lost:
    
        r33 = r6;
        r31 = r8;
        r14.push(r0);
        r8 = (r31 ^ 1) + ((r31 & 1) << 1);
        r0 = com.mypinpad.tsdk.isolation.bae.G0;
        r1 = r0 & 27;
        r0 = (r0 ^ 27) | r1;
        r6 = (r1 ^ r0) + ((r0 & r1) << 1);
        com.mypinpad.tsdk.isolation.bae.F0 = r6 % 128;
        r6 = r6 % 2;
        r1 = r4;
        r3 = r3;
        r5 = r5;
        r7 = r7;
        r9 = r9;
        r6 = r33;
        r0 = 0;
        r2 = 1;
        r4 = 2;
        r11 = -322813125;
        r12 = 322813127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0cca, code lost:
    
        r0 = r14.pop();
        r0 = com.mypinpad.tsdk.isolation.bae.F0;
        r0 = (-2) - (((r0 ^ 106) + ((r0 & 106) << 1)) ^ (-1));
        com.mypinpad.tsdk.isolation.bae.G0 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0ce4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0cec, code lost:
    
        throw new java.lang.NullPointerException("otsHashAddress == null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if (r7 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if (r7 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        r8 = new com.mypinpad.tsdk.i.bal.setOnFocusChangeListener();
        r11 = -322813125;
        r12 = 322813127;
        r9 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.bar.setY(new java.lang.Object[]{r7}, -322813125, 322813127, java.lang.System.identityHashCode(r7))).intValue();
        r9 = (com.mypinpad.tsdk.i.bal.setOnFocusChangeListener) ((com.mypinpad.tsdk.i.bar.setOnFocusChangeListener) com.mypinpad.tsdk.i.bar.setOnFocusChangeListener.setY(new java.lang.Object[]{r8, java.lang.Integer.valueOf(r9)}, 575278009, -575278009, r9));
        r9 = (com.mypinpad.tsdk.i.bal.setOnFocusChangeListener) ((com.mypinpad.tsdk.i.bar.setOnFocusChangeListener) com.mypinpad.tsdk.i.bar.setOnFocusChangeListener.setY(new java.lang.Object[]{r9, java.lang.Long.valueOf(((java.lang.Long) com.mypinpad.tsdk.isolation.bar.setY(new java.lang.Object[]{r7}, 482931428, -482931427, java.lang.System.identityHashCode(r7))).longValue())}, -1011452391, 1011452396, java.lang.System.identityHashCode(r9)));
        r9 = (com.mypinpad.tsdk.isolation.bal) ((com.mypinpad.tsdk.isolation.bar) com.mypinpad.tsdk.i.bal.setOnFocusChangeListener.setDividerPadding(new java.lang.Object[]{r9}, 2125069984, -2125069977, java.lang.System.identityHashCode(r9)));
        r10 = new com.mypinpad.tsdk.i.bam.setX();
        r6 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.bar.setY(new java.lang.Object[]{r7}, -322813125, 322813127, java.lang.System.identityHashCode(r7))).intValue();
        r6 = (com.mypinpad.tsdk.i.bam.setX) ((com.mypinpad.tsdk.i.bar.setOnFocusChangeListener) com.mypinpad.tsdk.i.bar.setOnFocusChangeListener.setY(new java.lang.Object[]{r10, java.lang.Integer.valueOf(r6)}, 575278009, -575278009, r6));
        r6 = (com.mypinpad.tsdk.i.bam.setX) ((com.mypinpad.tsdk.i.bar.setOnFocusChangeListener) com.mypinpad.tsdk.i.bar.setOnFocusChangeListener.setY(new java.lang.Object[]{r6, java.lang.Long.valueOf(((java.lang.Long) com.mypinpad.tsdk.isolation.bar.setY(new java.lang.Object[]{r7}, 482931428, -482931427, java.lang.System.identityHashCode(r7))).longValue())}, -1011452391, 1011452396, java.lang.System.identityHashCode(r6)));
        r6 = (com.mypinpad.tsdk.isolation.bam) ((com.mypinpad.tsdk.isolation.bar) com.mypinpad.tsdk.i.bam.setX.setX(new java.lang.Object[]{r6}, -1826442849, 1826442849, java.lang.System.identityHashCode(r6)));
        r8 = com.mypinpad.tsdk.isolation.bae.G0;
        r8 = ((r8 | 39) << 1) - (r8 ^ 39);
        com.mypinpad.tsdk.isolation.bae.F0 = r8 % 128;
        r8 = r8 % 2;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x012a, code lost:
    
        r10 = r2 << r1.f54288q0;
        r14 = r1.v0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(java.lang.Object[] r37) {
        /*
            Method dump skipped, instruction units count: 3309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.bae.a(java.lang.Object[]):void");
    }

    public static /* synthetic */ bae b(Object[] objArr) {
        bae baeVar = new bae((bae) objArr[0], (adu) objArr[1]);
        int i10 = G0 + 83;
        F0 = i10 % 128;
        if (i10 % 2 == 0) {
            return baeVar;
        }
        throw null;
    }

    public static /* synthetic */ Integer c(Object[] objArr) {
        bae baeVar = (bae) objArr[0];
        int i10 = G0;
        int i11 = (((i10 | 94) << 1) - (i10 ^ 94)) - 1;
        F0 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = baeVar.f54294x0;
        if (i12 != 0) {
            throw null;
        }
        int i14 = ((i10 ^ 65) | (i10 & 65)) << 1;
        int i15 = -(((~i10) & 65) | (i10 & (-66)));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        F0 = i16 % 128;
        if (i16 % 2 == 0) {
            return Integer.valueOf(i13);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:20:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:26:0x0133  */
    /* JADX WARN: Code duplicated, block: B:28:0x016d  */
    /* JADX WARN: Code duplicated, block: B:39:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ec A[SYNTHETIC] */
    public static /* synthetic */ a3 d(Object[] objArr) {
        int i10;
        bae baeVar = (bae) objArr[0];
        int i11 = G0;
        int i12 = (i11 ^ 77) + ((i11 & 77) << 1);
        F0 = i12 % 128;
        int i13 = i12 % 2;
        Iterator it = baeVar.f54289r0.iterator();
        int i14 = F0;
        int i15 = (((i14 & (-40)) | ((~i14) & 39)) - (~((i14 & 39) << 1))) - 1;
        G0 = i15 % 128;
        int i16 = i15 % 2;
        a3 a3Var = null;
        while (it.hasNext()) {
            int i17 = G0;
            int i18 = i17 & 11;
            int i19 = ((i17 ^ 11) | i18) << 1;
            int i20 = -((i17 | 11) & (~i18));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            F0 = i21 % 128;
            if (i21 % 2 != 0) {
                a3 a3Var2 = (a3) it.next();
                ((Boolean) a3.b(new Object[]{a3Var2}, 1067479838, -1067479836, System.identityHashCode(a3Var2))).booleanValue();
                throw null;
            }
            a3 a3Var3 = (a3) it.next();
            if (!((Boolean) a3.b(new Object[]{a3Var3}, 1067479838, -1067479836, System.identityHashCode(a3Var3))).booleanValue()) {
                int i22 = G0 + 91;
                F0 = i22 % 128;
                if (i22 % 2 != 0) {
                    int i23 = 31 / 0;
                    if (((Boolean) a3.b(new Object[]{a3Var3}, -1386269328, 1386269331, System.identityHashCode(a3Var3))).booleanValue()) {
                        if (a3Var == null) {
                            i10 = F0 + 51;
                            G0 = i10 % 128;
                            if (i10 % 2 == 0) {
                                int i24 = 33 / 0;
                            }
                        } else if (((Integer) a3.b(new Object[]{a3Var3}, 153971824, -153971820, System.identityHashCode(a3Var3))).intValue() < ((Integer) a3.b(new Object[]{a3Var}, 153971824, -153971820, System.identityHashCode(a3Var))).intValue()) {
                            int i25 = F0;
                            int i26 = i25 & 81;
                            int i27 = (i25 ^ 81) | i26;
                            int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                            G0 = i28 % 128;
                            int i29 = i28 % 2;
                            int i30 = ((i25 | 107) << 1) - (i25 ^ 107);
                            G0 = i30 % 128;
                            int i31 = i30 % 2;
                        } else {
                            if (((Integer) a3.b(new Object[]{a3Var3}, 153971824, -153971820, System.identityHashCode(a3Var3))).intValue() == ((Integer) a3.b(new Object[]{a3Var}, 153971824, -153971820, System.identityHashCode(a3Var))).intValue()) {
                                int i32 = F0;
                                int i33 = i32 & 97;
                                int i34 = i33 + ((i32 ^ 97) | i33);
                                G0 = i34 % 128;
                                int i35 = i34 % 2;
                                if (((Integer) a3.b(new Object[]{a3Var3}, 1097119943, -1097119938, System.identityHashCode(a3Var3))).intValue() < ((Integer) a3.b(new Object[]{a3Var}, 1097119943, -1097119938, System.identityHashCode(a3Var))).intValue()) {
                                    int i36 = F0 + 49;
                                    int i37 = i36 % 128;
                                    G0 = i37;
                                    int i38 = i36 % 2;
                                    int i39 = i37 & 29;
                                    int i40 = ((i37 ^ 29) | i39) << 1;
                                    int i41 = -((i37 | 29) & (~i39));
                                    int i42 = ((i40 | i41) << 1) - (i40 ^ i41);
                                    F0 = i42 % 128;
                                    int i43 = i42 % 2;
                                    a3Var = a3Var3;
                                }
                            }
                            int i44 = F0 + 103;
                            G0 = i44 % 128;
                            int i45 = i44 % 2;
                        }
                        a3Var = a3Var3;
                    }
                } else if (((Boolean) a3.b(new Object[]{a3Var3}, -1386269328, 1386269331, System.identityHashCode(a3Var3))).booleanValue()) {
                    if (a3Var == null) {
                        i10 = F0 + 51;
                        G0 = i10 % 128;
                        if (i10 % 2 == 0) {
                            int i210 = 33 / 0;
                        }
                    } else if (((Integer) a3.b(new Object[]{a3Var3}, 153971824, -153971820, System.identityHashCode(a3Var3))).intValue() < ((Integer) a3.b(new Object[]{a3Var}, 153971824, -153971820, System.identityHashCode(a3Var))).intValue()) {
                        int i211 = F0;
                        int i212 = i211 & 81;
                        int i213 = (i211 ^ 81) | i212;
                        int i214 = (i212 ^ i213) + ((i212 & i213) << 1);
                        G0 = i214 % 128;
                        int i215 = i214 % 2;
                        int i310 = ((i211 | 107) << 1) - (i211 ^ 107);
                        G0 = i310 % 128;
                        int i311 = i310 % 2;
                    } else {
                        if (((Integer) a3.b(new Object[]{a3Var3}, 153971824, -153971820, System.identityHashCode(a3Var3))).intValue() == ((Integer) a3.b(new Object[]{a3Var}, 153971824, -153971820, System.identityHashCode(a3Var))).intValue()) {
                            int i312 = F0;
                            int i313 = i312 & 97;
                            int i314 = i313 + ((i312 ^ 97) | i313);
                            G0 = i314 % 128;
                            int i315 = i314 % 2;
                            if (((Integer) a3.b(new Object[]{a3Var3}, 1097119943, -1097119938, System.identityHashCode(a3Var3))).intValue() < ((Integer) a3.b(new Object[]{a3Var}, 1097119943, -1097119938, System.identityHashCode(a3Var))).intValue()) {
                                int i316 = F0 + 49;
                                int i317 = i316 % 128;
                                G0 = i317;
                                int i318 = i316 % 2;
                                int i319 = i317 & 29;
                                int i46 = ((i317 ^ 29) | i319) << 1;
                                int i47 = -((i317 | 29) & (~i319));
                                int i48 = ((i46 | i47) << 1) - (i46 ^ i47);
                                F0 = i48 % 128;
                                int i49 = i48 % 2;
                                a3Var = a3Var3;
                            }
                        }
                        int i410 = F0 + 103;
                        G0 = i410 % 128;
                        int i411 = i410 % 2;
                    }
                    a3Var = a3Var3;
                }
            }
        }
        int i50 = G0;
        int i51 = (i50 & 71) + (i50 | 71);
        F0 = i51 % 128;
        int i52 = i51 % 2;
        return a3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x014f, code lost:
    
        if (r12 == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0152, code lost:
    
        if (r12 == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0154, code lost:
    
        r12 = com.mypinpad.tsdk.isolation.bae.G0;
        r0 = r12 & 77;
        r12 = ((r12 | 77) & (~r0)) + (r0 << 1);
        com.mypinpad.tsdk.isolation.bae.F0 = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0164, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void readObject(java.io.ObjectInputStream r12) throws java.lang.ClassNotFoundException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.bae.readObject(java.io.ObjectInputStream):void");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0843 A[PHI: r12
      0x0843: PHI (r12v52 int) = (r12v51 int), (r12v60 int) binds: [B:43:0x0841, B:40:0x0830] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x085c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0876  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        ban banVar;
        int i13;
        int i14;
        int i15;
        int i16 = ~((~i10) | (~i11));
        int i17 = ~i12;
        int i18 = i10 | i11;
        switch (((~i18) * 828) + ((i18 | i17) * (-828)) + ((i16 | (~(i17 | i10 | i11))) * (-828)) + (i11 * 829) + (i10 * 829)) {
            case 1:
                return d(objArr);
            case 2:
                return b(objArr);
            case 3:
                a(objArr);
                return null;
            case 4:
                return c(objArr);
            case 5:
                bae baeVar = new bae((bae) objArr[0], (byte[]) objArr[1], (byte[]) objArr[2], (ban) objArr[3]);
                int i19 = G0;
                int i20 = i19 ^ 89;
                int i21 = -(-((i19 & 89) << 1));
                int i22 = (i20 & i21) + (i21 | i20);
                F0 = i22 % 128;
                int i23 = i22 % 2;
                return baeVar;
            case 6:
                bae baeVar2 = (bae) objArr[0];
                int i24 = G0;
                int i25 = i24 & 13;
                int i26 = (i24 | 13) & (~i25);
                int i27 = i25 << 1;
                int i28 = (i26 & i27) + (i26 | i27);
                F0 = i28 % 128;
                int i29 = i28 % 2;
                ArrayList arrayList = baeVar2.f54291t0;
                if (i29 != 0) {
                    throw null;
                }
                if (arrayList == null) {
                    throw new IllegalStateException("authenticationPath == null");
                }
                if (baeVar2.f54292u0 == null) {
                    throw new IllegalStateException("retain == null");
                }
                if (baeVar2.v0 == null) {
                    throw new IllegalStateException("stack == null");
                }
                if (baeVar2.f54289r0 == null) {
                    throw new IllegalStateException("treeHashInstances == null");
                }
                if (baeVar2.f54293w0 == null) {
                    throw new IllegalStateException("keep == null");
                }
                long j10 = baeVar2.f54294x0;
                int i30 = baeVar2.f54288q0;
                if (!((Boolean) bbi.setOnFocusChangeListener(new Object[]{Integer.valueOf(i30), Long.valueOf(j10)}, -1829337202, 1829337218, i30)).booleanValue()) {
                    throw new IllegalStateException("index in BDS state out of bounds");
                }
                int i31 = F0;
                int i32 = ((i31 | 1) << 1) - (i31 ^ 1);
                G0 = i32 % 128;
                int i33 = i32 % 2;
                return null;
            case 7:
                bae baeVar3 = (bae) objArr[0];
                int i34 = G0;
                int i35 = i34 & 103;
                int i36 = i34 | 103;
                int i37 = (i35 & i36) + (i36 | i35);
                F0 = i37 % 128;
                int i38 = i37 % 2;
                int i39 = baeVar3.E0;
                if (i38 == 0) {
                    return Integer.valueOf(i39);
                }
                throw null;
            default:
                bae baeVar4 = (bae) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                byte[] bArr3 = (byte[]) objArr[2];
                ban banVar2 = (ban) objArr[3];
                int i40 = G0;
                int i41 = i40 & 117;
                int i42 = ((((i40 ^ 117) | i41) << 1) - (~(-((i40 | 117) & (~i41))))) - 1;
                F0 = i42 % 128;
                int i43 = i42 % 2;
                if (banVar2 == null) {
                    throw new NullPointerException("otsHashAddress == null");
                }
                if (baeVar4.f54295y0) {
                    throw new IllegalStateException("index already used");
                }
                int i44 = baeVar4.f54294x0;
                int i45 = baeVar4.E0;
                int iIdentityHashCode = System.identityHashCode(baeVar4);
                int i46 = (i45 * 370) - 370;
                int i47 = (-1) ^ i45;
                int i48 = ~i45;
                int i49 = (i47 ^ i45) | (i47 & i45);
                int i50 = ~iIdentityHashCode;
                int i51 = ~i50;
                int i52 = -(-(((i49 & i51) | ((~i49) & i50) | (i49 & i50)) * (-369)));
                int i53 = (i46 ^ i52) + ((i52 & i46) << 1);
                int i54 = i45 & i51;
                int i55 = (i51 | i45) & (~i54);
                int i56 = ((i55 & i54) | (i55 ^ i54)) * (-369);
                int i57 = (i53 & i56) + (i56 | i53);
                int i58 = ~i48;
                int i59 = ~((i58 & i48) | (i58 ^ i48));
                int i60 = (-1) ^ iIdentityHashCode;
                int i61 = ~((i60 & iIdentityHashCode) | (i60 ^ iIdentityHashCode));
                int i62 = (i59 & i61) | (i59 ^ i61);
                int i63 = i50 & (iIdentityHashCode | i50);
                int i64 = (i63 & i45) | (i63 ^ i45);
                int i65 = ~i64;
                int i66 = (i64 | i65) & i65;
                int i67 = ((~i66) & i62) | ((~i62) & i66);
                int i68 = i62 & i66;
                int i69 = ((i68 & i67) | (i67 ^ i68)) * 369;
                int i70 = i57 & i69;
                if (i44 > i70 + ((i69 ^ i57) | i70)) {
                    throw new IllegalStateException("index out of bounds");
                }
                int i71 = baeVar4.f54294x0;
                int i72 = baeVar4.f54288q0;
                int iIntValue = ((Integer) bbi.setOnFocusChangeListener(new Object[]{Integer.valueOf(i71), Integer.valueOf(i72)}, -1556004709, 1556004716, i71)).intValue();
                int i73 = ((iIntValue | 2) << 1) - (iIntValue ^ 2);
                int i74 = (baeVar4.f54294x0 >> ((i73 ^ (-1)) + (i73 << 1))) & 1;
                TreeMap treeMap = baeVar4.f54293w0;
                ArrayList arrayList2 = baeVar4.f54291t0;
                if (i74 == 0) {
                    int i75 = F0;
                    int i76 = i75 + 59;
                    G0 = i76 % 128;
                    if (i76 % 2 != 0 ? iIntValue < i72 - 1 : iIntValue < i72 + 1) {
                        int i77 = (((i75 | 60) << 1) - (i75 ^ 60)) - 1;
                        G0 = i77 % 128;
                        int i78 = i77 % 2;
                        treeMap.put(Integer.valueOf(iIntValue), arrayList2.get(iIntValue));
                        int i79 = F0;
                        int i80 = (((i79 | 64) << 1) - (i79 ^ 64)) - 1;
                        G0 = i80 % 128;
                        int i81 = i80 % 2;
                    }
                }
                bal.setOnFocusChangeListener setonfocuschangelistener = new bal.setOnFocusChangeListener();
                int iIntValue2 = ((Integer) bar.setY(new Object[]{banVar2}, -322813125, 322813127, System.identityHashCode(banVar2))).intValue();
                bal.setOnFocusChangeListener setonfocuschangelistener2 = (bal.setOnFocusChangeListener) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setonfocuschangelistener, Integer.valueOf(iIntValue2)}, 575278009, -575278009, iIntValue2));
                bal.setOnFocusChangeListener setonfocuschangelistener3 = (bal.setOnFocusChangeListener) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setonfocuschangelistener2, Long.valueOf(((Long) bar.setY(new Object[]{banVar2}, 482931428, -482931427, System.identityHashCode(banVar2))).longValue())}, -1011452391, 1011452396, System.identityHashCode(setonfocuschangelistener2)));
                bal balVar = (bal) ((bar) bal.setOnFocusChangeListener.setDividerPadding(new Object[]{setonfocuschangelistener3}, 2125069984, -2125069977, System.identityHashCode(setonfocuschangelistener3)));
                bam.setX setx = new bam.setX();
                int iIntValue3 = ((Integer) bar.setY(new Object[]{banVar2}, -322813125, 322813127, System.identityHashCode(banVar2))).intValue();
                bam.setX setx2 = (bam.setX) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setx, Integer.valueOf(iIntValue3)}, 575278009, -575278009, iIntValue3));
                bam.setX setx3 = (bam.setX) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setx2, Long.valueOf(((Long) bar.setY(new Object[]{banVar2}, 482931428, -482931427, System.identityHashCode(banVar2))).longValue())}, -1011452391, 1011452396, System.identityHashCode(setx2)));
                bam bamVar = (bam) ((bar) bam.setX.setX(new Object[]{setx3}, -1826442849, 1826442849, System.identityHashCode(setx3)));
                int i82 = baeVar4.f54290s0;
                c3 c3Var = baeVar4.f54287p0;
                if (iIntValue == 0) {
                    ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new ban.setCompoundDrawableTintBlendMode();
                    int iIntValue4 = ((Integer) bar.setY(new Object[]{banVar2}, -322813125, 322813127, System.identityHashCode(banVar2))).intValue();
                    ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = (ban.setCompoundDrawableTintBlendMode) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setcompounddrawabletintblendmode, Integer.valueOf(iIntValue4)}, 575278009, -575278009, iIntValue4));
                    ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = (ban.setCompoundDrawableTintBlendMode) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setcompounddrawabletintblendmode2, Long.valueOf(((Long) bar.setY(new Object[]{banVar2}, 482931428, -482931427, System.identityHashCode(banVar2))).longValue())}, -1011452391, 1011452396, System.identityHashCode(setcompounddrawabletintblendmode2)));
                    int i83 = baeVar4.f54294x0;
                    ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode4 = (ban.setCompoundDrawableTintBlendMode) ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode3, Integer.valueOf(i83)}, 391211609, -391211603, i83);
                    int iIntValue5 = ((Integer) ban.a(new Object[]{banVar2}, -545166502, 545166504, System.identityHashCode(banVar2))).intValue();
                    ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode5 = (ban.setCompoundDrawableTintBlendMode) ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode4, Integer.valueOf(iIntValue5)}, 874018780, -874018778, iIntValue5);
                    int iIntValue6 = ((Integer) ban.a(new Object[]{banVar2}, -484111224, 484111224, System.identityHashCode(banVar2))).intValue();
                    ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode6 = (ban.setCompoundDrawableTintBlendMode) ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode5, Integer.valueOf(iIntValue6)}, -1717175544, 1717175544, iIntValue6);
                    int iIntValue7 = ((Integer) bar.setY(new Object[]{banVar2}, -1433420492, 1433420492, System.identityHashCode(banVar2))).intValue();
                    ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode7 = (ban.setCompoundDrawableTintBlendMode) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setcompounddrawabletintblendmode6, Integer.valueOf(iIntValue7)}, 1127697955, -1127697949, iIntValue7));
                    banVar = (ban) ((bar) ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode7}, 1084061586, -1084061582, System.identityHashCode(setcompounddrawabletintblendmode7)));
                    c3.c(new Object[]{c3Var, (byte[]) c3.c(new Object[]{c3Var, bArr3, banVar}, 2052322641, -2052322634, System.identityHashCode(c3Var)), bArr2}, 612316896, -612316893, System.identityHashCode(c3Var));
                    e3 e3Var = (e3) c3.c(new Object[]{c3Var, banVar}, -754018063, 754018063, System.identityHashCode(c3Var));
                    bal.setOnFocusChangeListener setonfocuschangelistener4 = new bal.setOnFocusChangeListener();
                    int iIntValue8 = ((Integer) bar.setY(new Object[]{balVar}, -322813125, 322813127, System.identityHashCode(balVar))).intValue();
                    bal.setOnFocusChangeListener setonfocuschangelistener5 = (bal.setOnFocusChangeListener) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setonfocuschangelistener4, Integer.valueOf(iIntValue8)}, 575278009, -575278009, iIntValue8));
                    bal.setOnFocusChangeListener setonfocuschangelistener6 = (bal.setOnFocusChangeListener) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setonfocuschangelistener5, Long.valueOf(((Long) bar.setY(new Object[]{balVar}, 482931428, -482931427, System.identityHashCode(balVar))).longValue())}, -1011452391, 1011452396, System.identityHashCode(setonfocuschangelistener5)));
                    int i84 = baeVar4.f54294x0;
                    bal.setOnFocusChangeListener setonfocuschangelistener7 = (bal.setOnFocusChangeListener) bal.setOnFocusChangeListener.setDividerPadding(new Object[]{setonfocuschangelistener6, Integer.valueOf(i84)}, 212799444, -212799438, i84);
                    int iIntValue9 = ((Integer) bal.b(new Object[]{balVar}, 153992836, -153992833, System.identityHashCode(balVar))).intValue();
                    bal.setOnFocusChangeListener setonfocuschangelistener8 = (bal.setOnFocusChangeListener) bal.setOnFocusChangeListener.setDividerPadding(new Object[]{setonfocuschangelistener7, Integer.valueOf(iIntValue9)}, -1728245301, 1728245303, iIntValue9);
                    int iIntValue10 = ((Integer) bal.b(new Object[]{balVar}, -367587425, 367587425, System.identityHashCode(balVar))).intValue();
                    bal.setOnFocusChangeListener setonfocuschangelistener9 = (bal.setOnFocusChangeListener) bal.setOnFocusChangeListener.setDividerPadding(new Object[]{setonfocuschangelistener8, Integer.valueOf(iIntValue10)}, 1925518320, -1925518319, iIntValue10);
                    int iIntValue11 = ((Integer) bar.setY(new Object[]{balVar}, -1433420492, 1433420492, System.identityHashCode(balVar))).intValue();
                    bal.setOnFocusChangeListener setonfocuschangelistener10 = (bal.setOnFocusChangeListener) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setonfocuschangelistener9, Integer.valueOf(iIntValue11)}, 1127697955, -1127697949, iIntValue11));
                    arrayList2.set(0, g3.a(new Object[]{c3Var, e3Var, (bal) ((bar) bal.setOnFocusChangeListener.setDividerPadding(new Object[]{setonfocuschangelistener10}, 2125069984, -2125069977, System.identityHashCode(setonfocuschangelistener10)))}, -1348979818, 1348979819, (int) System.currentTimeMillis()));
                    int i85 = F0;
                    int i86 = i85 & 7;
                    int i87 = ((i85 ^ 7) | i86) << 1;
                    int i88 = -((i85 | 7) & (~i86));
                    int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
                    G0 = i89 % 128;
                    int i90 = i89 % 2;
                    bArr = bArr3;
                } else {
                    bam.setX setx4 = new bam.setX();
                    int iIntValue12 = ((Integer) bar.setY(new Object[]{bamVar}, -322813125, 322813127, System.identityHashCode(bamVar))).intValue();
                    bam.setX setx5 = (bam.setX) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setx4, Integer.valueOf(iIntValue12)}, 575278009, -575278009, iIntValue12));
                    int i91 = (iIntValue ^ (-1)) + (iIntValue << 1);
                    bam.setX setx6 = (bam.setX) bam.setX.setX(new Object[]{(bam.setX) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setx5, Long.valueOf(((Long) bar.setY(new Object[]{bamVar}, 482931428, -482931427, System.identityHashCode(bamVar))).longValue())}, -1011452391, 1011452396, System.identityHashCode(setx5))), Integer.valueOf(i91)}, 849744138, -849744134, i91);
                    int i92 = baeVar4.f54294x0 >> iIntValue;
                    bam.setX setx7 = (bam.setX) bam.setX.setX(new Object[]{setx6, Integer.valueOf(i92)}, -2130967129, 2130967131, i92);
                    int iIntValue13 = ((Integer) bar.setY(new Object[]{bamVar}, -1433420492, 1433420492, System.identityHashCode(bamVar))).intValue();
                    bam.setX setx8 = (bam.setX) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setx7, Integer.valueOf(iIntValue13)}, 1127697955, -1127697949, iIntValue13));
                    bam bamVar2 = (bam) ((bar) bam.setX.setX(new Object[]{setx8}, -1826442849, 1826442849, System.identityHashCode(setx8)));
                    c3.c(new Object[]{c3Var, (byte[]) c3.c(new Object[]{c3Var, bArr3, banVar2}, 2052322641, -2052322634, System.identityHashCode(c3Var)), bArr2}, 612316896, -612316893, System.identityHashCode(c3Var));
                    int i93 = iIntValue - 1;
                    baw bawVarA = g3.a(new Object[]{c3Var, (baw) arrayList2.get(i91), (baw) treeMap.get(Integer.valueOf(i93)), bamVar2}, 300430928, -300430928, (int) System.currentTimeMillis());
                    int iIntValue14 = ((Integer) baw.setCompoundDrawableTintBlendMode(new Object[]{bawVarA}, 1955195146, -1955195145, System.identityHashCode(bawVarA))).intValue();
                    int i94 = iIntValue14 & 1;
                    int i95 = iIntValue14 | 1;
                    arrayList2.set(iIntValue, new baw((i94 & i95) + (i95 | i94), (byte[]) baw.setCompoundDrawableTintBlendMode(new Object[]{bawVarA}, 1592072604, -1592072604, System.identityHashCode(bawVarA))));
                    treeMap.remove(Integer.valueOf(i93));
                    int i96 = G0;
                    int i97 = ((i96 ^ 25) | (i96 & 25)) << 1;
                    int i98 = -(((~i96) & 25) | (i96 & (-26)));
                    int i99 = (i97 ^ i98) + ((i98 & i97) << 1);
                    F0 = i99 % 128;
                    int i100 = i99 % 2;
                    int i101 = 0;
                    while (true) {
                        ArrayList arrayList3 = baeVar4.f54289r0;
                        if (i101 < iIntValue) {
                            int i102 = G0;
                            int i103 = i102 & 7;
                            int i104 = -(-(i102 | 7));
                            int i105 = (i103 ^ i104) + ((i104 & i103) << 1);
                            F0 = i105 % 128;
                            int i106 = i105 % 2;
                            int i107 = -i82;
                            int iIdentityHashCode2 = System.identityHashCode(baeVar4);
                            int i108 = -(-(i107 * (-963)));
                            int i109 = i108 & (-964);
                            int i110 = (((i109 - (~(-(-((i108 ^ (-964)) | i109))))) - 1) - (~(i72 * 965))) - 1;
                            int i111 = ~i107;
                            int i112 = ~i72;
                            int i113 = i112 & iIdentityHashCode2;
                            byte[] bArr4 = bArr3;
                            int i114 = (~i113) & (i112 | iIdentityHashCode2);
                            int i115 = ~iIdentityHashCode2;
                            int i116 = ~((i114 ^ i113) | (i114 & i113));
                            int i117 = -(~(((i116 & i111) | (i111 ^ i116)) * (-964)));
                            int i118 = ((i110 & i117) + (i117 | i110)) - 1;
                            int i119 = (~i115) & i112;
                            int i120 = ~i112;
                            int i121 = ~(i119 | (i115 & i120) | (i115 & i112));
                            int i122 = (i112 & i111) | (i107 & i120);
                            int i123 = i107 & i112;
                            int i124 = ~((i123 & i122) | (i122 ^ i123));
                            int i125 = ((i121 & i124) | (i121 ^ i124)) * (-964);
                            if (i101 < (((~i125) & i118) | ((~i118) & i125)) + ((i125 & i118) << 1)) {
                                int i126 = G0;
                                int i127 = (i126 & (-12)) | ((~i126) & 11);
                                int i128 = (i126 & 11) << 1;
                                int i129 = ((i127 | i128) << 1) - (i128 ^ i127);
                                F0 = i129 % 128;
                                if (i129 % 2 != 0) {
                                    a3 a3Var = (a3) arrayList3.get(i101);
                                    arrayList2.set(i101, (baw) a3.b(new Object[]{a3Var}, 1732436620, -1732436614, System.identityHashCode(a3Var)));
                                    int i130 = 34 / 0;
                                } else {
                                    a3 a3Var2 = (a3) arrayList3.get(i101);
                                    arrayList2.set(i101, (baw) a3.b(new Object[]{a3Var2}, 1732436620, -1732436614, System.identityHashCode(a3Var2)));
                                }
                                int i131 = G0;
                                int i132 = i131 & 75;
                                int i133 = (i131 | 75) & (~i132);
                                int i134 = -(-(i132 << 1));
                                int i135 = (i133 & i134) + (i133 | i134);
                                F0 = i135 % 128;
                                int i136 = i135 % 2;
                            } else {
                                arrayList2.set(i101, ((LinkedList) baeVar4.f54292u0.get(Integer.valueOf(i101))).removeFirst());
                                System.identityHashCode(baeVar4);
                                System.identityHashCode(baeVar4);
                            }
                            int i137 = i101 ^ 1;
                            i101 = (((i101 & 1) | i137) << 1) - i137;
                            int i138 = F0;
                            int i139 = (i138 & (-100)) | ((~i138) & 99);
                            int i140 = -(-((i138 & 99) << 1));
                            int i141 = (i139 & i140) + (i140 | i139);
                            G0 = i141 % 128;
                            int i142 = i141 % 2;
                            bArr3 = bArr4;
                        } else {
                            bArr = bArr3;
                            int i143 = i72 - (~(-i82));
                            int iMin = Math.min(iIntValue, (i143 ^ (-1)) + (i143 << 1));
                            int i144 = F0 + 59;
                            G0 = i144 % 128;
                            int i145 = i144 % 2;
                            int i146 = 0;
                            while (i146 < iMin) {
                                int i147 = F0;
                                int i148 = ((i147 ^ 67) | (i147 & 67)) << 1;
                                int i149 = -((i147 & (-68)) | ((~i147) & 67));
                                int i150 = ((i148 | i149) << 1) - (i148 ^ i149);
                                G0 = i150 % 128;
                                int i151 = i150 % 2;
                                int i152 = baeVar4.f54294x0;
                                if (i151 == 0) {
                                    int i153 = ~i152;
                                    int i154 = -(-(i152 << 1));
                                    i13 = (((i153 | i154) << 1) - (i154 ^ i153)) % (4 << (1 << i146));
                                    if (i13 < 0) {
                                        int i155 = i147 & 31;
                                        i14 = (i155 - (~(-(-((i147 ^ 31) | i155))))) - 1;
                                        G0 = i14 % 128;
                                        if (i14 % 2 == 0) {
                                            a3.b(new Object[]{(a3) arrayList3.get(i146), Integer.valueOf(i13)}, 1356717676, -1356717668, i13);
                                            int i156 = 90 / 0;
                                            i15 = 1;
                                        } else {
                                            i15 = 1;
                                            a3.b(new Object[]{(a3) arrayList3.get(i146), Integer.valueOf(i13)}, 1356717676, -1356717668, i13);
                                        }
                                        int i157 = F0;
                                        int i158 = (i157 | 27) << i15;
                                        int i159 = -(((~i157) & 27) | (i157 & (-28)));
                                        int i160 = (i158 ^ i159) + ((i159 & i158) << i15);
                                        G0 = i160 % 128;
                                        int i161 = i160 % 2;
                                    }
                                } else {
                                    int i162 = i152 - (-1);
                                    int i163 = (1 << i146) * 3;
                                    int i164 = i162 & i163;
                                    i13 = i164 + ((i162 ^ i163) | i164);
                                    if (i13 < (1 << i72)) {
                                        int i1510 = i147 & 31;
                                        i14 = (i1510 - (~(-(-((i147 ^ 31) | i1510))))) - 1;
                                        G0 = i14 % 128;
                                        if (i14 % 2 == 0) {
                                            a3.b(new Object[]{(a3) arrayList3.get(i146), Integer.valueOf(i13)}, 1356717676, -1356717668, i13);
                                            int i1511 = 90 / 0;
                                            i15 = 1;
                                        } else {
                                            i15 = 1;
                                            a3.b(new Object[]{(a3) arrayList3.get(i146), Integer.valueOf(i13)}, 1356717676, -1356717668, i13);
                                        }
                                        int i1512 = F0;
                                        int i1513 = (i1512 | 27) << i15;
                                        int i1514 = -(((~i1512) & 27) | (i1512 & (-28)));
                                        int i165 = (i1513 ^ i1514) + ((i1514 & i1513) << i15);
                                        G0 = i165 % 128;
                                        int i166 = i165 % 2;
                                    }
                                }
                                int i167 = i146 & 1;
                                int i168 = (i146 | 1) & (~i167);
                                int i169 = -(-(i167 << 1));
                                i146 = ((i168 | i169) << 1) - (i168 ^ i169);
                                int i170 = G0;
                                int i171 = i170 & 115;
                                int i172 = i171 + ((i170 ^ 115) | i171);
                                F0 = i172 % 128;
                                int i173 = i172 % 2;
                            }
                            banVar = banVar2;
                        }
                    }
                }
                int i174 = G0;
                int i175 = ((i174 ^ 48) + ((i174 & 48) << 1)) - 1;
                F0 = i175 % 128;
                int i176 = i175 % 2;
                int i177 = 0;
                while (true) {
                    int i178 = -i82;
                    int iIdentityHashCode3 = System.identityHashCode(baeVar4);
                    int i179 = i178 * (-958);
                    int i180 = -(-(i72 * (-958)));
                    int i181 = (i179 | i180) << 1;
                    int i182 = -(i179 ^ i180);
                    int i183 = (i181 & i182) + (i182 | i181);
                    int i184 = ~i72;
                    int i185 = ~iIdentityHashCode3;
                    int i186 = ((~i185) & i184) | ((~i184) & i185);
                    int i187 = i184 & i185;
                    int i188 = ~((i186 & i187) | (i186 ^ i187));
                    int i189 = ~i178;
                    int i190 = i189 & (i189 | i178);
                    int i191 = i190 | iIdentityHashCode3;
                    int i192 = ~i191;
                    int i193 = (i191 | i192) & i192;
                    int i194 = (i188 & i193) | (i188 ^ i193);
                    int i195 = (i185 | iIdentityHashCode3) & i185;
                    int i196 = i195 ^ i178;
                    int i197 = i195 & i178;
                    int i198 = ~((i196 ^ i197) | (i197 & i196));
                    int i199 = -(-(((i194 & i198) | (i194 ^ i198)) * 959));
                    int i200 = ((~i199) & i183) | ((~i183) & i199);
                    int i201 = -(-((i183 & i199) << 1));
                    int i202 = (i200 ^ i201) + ((i201 & i200) << 1);
                    int i203 = -(~(-(-((~(i178 | i72)) * (-959)))));
                    int i204 = (((i202 | i203) << 1) - (i203 ^ i202)) - 1;
                    int i205 = (i190 ^ i185) | (i185 & i190);
                    int i206 = ~i205;
                    int i207 = (i205 | i206) & i206;
                    int i208 = i184 & iIdentityHashCode3;
                    int i209 = (i184 | iIdentityHashCode3) & (~i208);
                    int i210 = (i209 & i208) | (i209 ^ i208);
                    int i211 = ~i210;
                    int i212 = (i210 | i211) & i211;
                    int i213 = i207 & i212;
                    int i214 = ((i212 | i207) & (~i213)) | i213;
                    int i215 = (i178 & iIdentityHashCode3) | (i178 ^ iIdentityHashCode3);
                    int i216 = ~i215;
                    int i217 = (i215 | i216) & i216;
                    int i218 = i214 ^ i217;
                    int i219 = i217 & i214;
                    int i220 = -(-(((i219 & i218) | (i218 ^ i219)) * 959));
                    int i221 = ((~i220) & i204) | ((~i204) & i220);
                    int i222 = (i220 & i204) << 1;
                    if (i177 < ((((i221 | i222) << 1) - (i222 ^ i221)) >> 1)) {
                        int i223 = F0 + 117;
                        G0 = i223 % 128;
                        if (i223 % 2 == 0) {
                            throw null;
                        }
                        a3 a3Var3 = (a3) setCompoundDrawableTintBlendMode(new Object[]{baeVar4}, 1716081851, -1716081850, System.identityHashCode(baeVar4));
                        if (a3Var3 != null) {
                            int i224 = F0;
                            int i225 = i224 | 39;
                            int i226 = i225 << 1;
                            int i227 = -((~(i224 & 39)) & i225);
                            int i228 = (i226 ^ i227) + ((i227 & i226) << 1);
                            G0 = i228 % 128;
                            int i229 = i228 % 2;
                            a3.b(new Object[]{a3Var3, baeVar4.v0, c3Var, bArr2, bArr, banVar}, 1328206146, -1328206146, System.identityHashCode(a3Var3));
                            int i230 = G0;
                            int i231 = (i230 & (-84)) | ((~i230) & 83);
                            int i232 = (i230 & 83) << 1;
                            int i233 = (i231 & i232) + (i232 | i231);
                            F0 = i233 % 128;
                            int i234 = i233 % 2;
                        }
                        i177 = ((i177 ^ 2) + ((i177 & 2) << 1)) - 1;
                        int i235 = G0;
                        int i236 = (i235 & (-52)) | ((~i235) & 51);
                        int i237 = (i235 & 51) << 1;
                        int i238 = (i236 & i237) + (i237 | i236);
                        F0 = i238 % 128;
                        int i239 = i238 % 2;
                    } else {
                        baeVar4.f54294x0++;
                        int i240 = G0;
                        int i241 = i240 & 51;
                        int i242 = -(-((i240 ^ 51) | i241));
                        int i243 = (i241 ^ i242) + ((i242 & i241) << 1);
                        F0 = i243 % 128;
                        int i244 = i243 % 2;
                    }
                }
                return null;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = F0;
        int i11 = i10 & 69;
        int i12 = (i11 - (~(-(-((i10 ^ 69) | i11))))) - 1;
        G0 = i12 % 128;
        int i13 = i12 % 2;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.E0);
        if (i13 == 0) {
            throw null;
        }
    }

    public final int setDividerPadding() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -1508955254, 1508955258, System.identityHashCode(this))).intValue();
    }

    public final int setX() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 1914682748, -1914682741, System.identityHashCode(this))).intValue();
    }

    public bae(bae baeVar, byte[] bArr, byte[] bArr2, ban banVar) {
        c3 c3Var = baeVar.f54287p0;
        this.f54287p0 = new c3((f3) c3.c(new Object[]{c3Var}, -591446058, 591446059, System.identityHashCode(c3Var)));
        this.f54288q0 = baeVar.f54288q0;
        this.f54290s0 = baeVar.f54290s0;
        ArrayList arrayList = new ArrayList();
        this.f54291t0 = arrayList;
        arrayList.addAll(baeVar.f54291t0);
        this.f54292u0 = new TreeMap();
        for (Integer num : baeVar.f54292u0.keySet()) {
            this.f54292u0.put(num, (LinkedList) ((LinkedList) baeVar.f54292u0.get(num)).clone());
        }
        Stack<baw> stack = new Stack<>();
        this.v0 = stack;
        stack.addAll(baeVar.v0);
        this.f54289r0 = new ArrayList();
        for (a3 a3Var : baeVar.f54289r0) {
            ArrayList arrayList2 = this.f54289r0;
            arrayList2.add((a3) a3.b(new Object[]{a3Var}, 23734728, -23734727, System.identityHashCode(a3Var)));
        }
        this.f54293w0 = new TreeMap((Map) baeVar.f54293w0);
        this.f54294x0 = baeVar.f54294x0;
        this.E0 = baeVar.E0;
        this.f54295y0 = false;
        setCompoundDrawableTintBlendMode(new Object[]{this, bArr, bArr2, banVar}, -98680158, 98680158, System.identityHashCode(this));
    }

    public final bae setX(byte[] bArr, byte[] bArr2, ban banVar) {
        return (bae) setCompoundDrawableTintBlendMode(new Object[]{this, bArr, bArr2, banVar}, -538498371, 538498376, System.identityHashCode(this));
    }

    public bae(bae baeVar) {
        c3 c3Var = baeVar.f54287p0;
        this.f54287p0 = new c3((f3) c3.c(new Object[]{c3Var}, -591446058, 591446059, System.identityHashCode(c3Var)));
        this.f54288q0 = baeVar.f54288q0;
        this.f54290s0 = baeVar.f54290s0;
        ArrayList arrayList = new ArrayList();
        this.f54291t0 = arrayList;
        arrayList.addAll(baeVar.f54291t0);
        this.f54292u0 = new TreeMap();
        for (Integer num : baeVar.f54292u0.keySet()) {
            this.f54292u0.put(num, (LinkedList) ((LinkedList) baeVar.f54292u0.get(num)).clone());
        }
        Stack<baw> stack = new Stack<>();
        this.v0 = stack;
        stack.addAll(baeVar.v0);
        this.f54289r0 = new ArrayList();
        for (a3 a3Var : baeVar.f54289r0) {
            ArrayList arrayList2 = this.f54289r0;
            arrayList2.add((a3) a3.b(new Object[]{a3Var}, 23734728, -23734727, System.identityHashCode(a3Var)));
        }
        this.f54293w0 = new TreeMap((Map) baeVar.f54293w0);
        this.f54294x0 = baeVar.f54294x0;
        this.E0 = baeVar.E0;
        this.f54295y0 = baeVar.f54295y0;
    }

    public bae(c3 c3Var, int i10, int i11, int i12) {
        this.f54287p0 = c3Var;
        this.f54288q0 = i10;
        this.E0 = i12;
        this.f54290s0 = i11;
        if (i11 <= i10 && i11 >= 2) {
            int i13 = -i11;
            int i14 = ~i13;
            if (((i10 - i14) - 1) % 2 == 0) {
                this.f54291t0 = new ArrayList();
                this.f54292u0 = new TreeMap();
                this.v0 = new Stack<>();
                this.f54289r0 = new ArrayList();
                int i15 = 0;
                while (true) {
                    int i16 = i13 * 367;
                    int i17 = i10 * 367;
                    int i18 = i16 & i17;
                    int i19 = (((i16 | i17) & (~i18)) - (~(i18 << 1))) - 1;
                    int i20 = i13 ^ i10;
                    int i21 = ~i10;
                    int i22 = i13 & i10;
                    int i23 = ((i20 & i22) | (i20 ^ i22)) * (-366);
                    int i24 = (i19 ^ i23) + ((i19 & i23) << 1);
                    int i25 = ~((i21 ^ i10) | (i21 & i10));
                    int i26 = i13 & i25;
                    int i27 = (i25 | i13) & (~i26);
                    int i28 = -(-(((i27 & i26) | (i27 ^ i26)) * (-366)));
                    int i29 = i24 & i28;
                    int i30 = i29 + ((i28 ^ i24) | i29);
                    int i31 = (i14 & i21) | ((~i14) & i10) | (i14 & i10);
                    int i32 = ~i31;
                    int i33 = (i31 | i32) & i32;
                    int i34 = i21 & i13;
                    int i35 = ((i21 | i13) & (~i34)) | i34;
                    int i36 = i35 & i10;
                    int i37 = (i35 | i10) & (~i36);
                    int i38 = (i37 & i36) | (i37 ^ i36);
                    int i39 = ~i38;
                    int i40 = (i38 | i39) & i39;
                    int i41 = -(-(((i33 & i40) | (i33 ^ i40)) * 366));
                    int i42 = ((~i41) & i30) | ((~i30) & i41);
                    int i43 = -(-((i41 & i30) << 1));
                    if (i15 >= (i42 & i43) + (i43 | i42)) {
                        this.f54293w0 = new TreeMap();
                        this.f54294x0 = 0;
                        this.f54295y0 = false;
                        return;
                    }
                    this.f54289r0.add(new a3(i15));
                    i15 = ((i15 | 1) << 1) - (i15 ^ 1);
                }
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public bae(bbb bbbVar, byte[] bArr, byte[] bArr2, ban banVar, int i10) {
        c3 c3Var = (c3) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar}, 122256615, -122256609, System.identityHashCode(bbbVar));
        int iIntValue = ((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar}, 1335966603, -1335966598, System.identityHashCode(bbbVar))).intValue();
        int iIntValue2 = ((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar}, 1331480093, -1331480090, System.identityHashCode(bbbVar))).intValue();
        int iIntValue3 = 1 << ((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar}, 1335966603, -1335966598, System.identityHashCode(bbbVar))).intValue();
        this(c3Var, iIntValue, iIntValue2, (iIntValue3 ^ (-1)) + (iIntValue3 << 1));
        setCompoundDrawableTintBlendMode(new Object[]{this, bArr, bArr2, banVar}, -1778040450, 1778040453, System.identityHashCode(this));
        while (this.f54294x0 < i10) {
            setCompoundDrawableTintBlendMode(new Object[]{this, bArr, bArr2, banVar}, -98680158, 98680158, System.identityHashCode(this));
            this.f54295y0 = false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public bae(bbb bbbVar, byte[] bArr, byte[] bArr2, ban banVar) {
        c3 c3Var = (c3) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar}, 122256615, -122256609, System.identityHashCode(bbbVar));
        int iIntValue = ((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar}, 1335966603, -1335966598, System.identityHashCode(bbbVar))).intValue();
        int iIntValue2 = ((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar}, 1331480093, -1331480090, System.identityHashCode(bbbVar))).intValue();
        int iIntValue3 = 1 << ((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar}, 1335966603, -1335966598, System.identityHashCode(bbbVar))).intValue();
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = ~iIntValue3;
        int i11 = ~iCurrentTimeMillis;
        int i12 = ~iCurrentTimeMillis;
        int i13 = i12 | iCurrentTimeMillis;
        int i14 = i11 & i13;
        int i15 = ((~i14) & i10) | ((~i10) & i14);
        int i16 = i14 & i10;
        int i17 = (i16 & i15) | (i15 ^ i16);
        int i18 = (i17 | (~i17)) & (~i17);
        int i19 = ~iCurrentTimeMillis;
        int i20 = ((~i19) & i18) | ((~i18) & i19);
        int i21 = i18 & i19;
        int i22 = (i21 & i20) | (i20 ^ i21);
        int i23 = ~iCurrentTimeMillis;
        int i24 = ~i23;
        int i25 = (((iIntValue3 * (-958)) + 958) - (~((i22 | (~((i24 & i23) | (i24 ^ i23)))) * 959))) - 1;
        int i26 = -(-((~((iIntValue3 & i10) | (i10 ^ iIntValue3))) * (-959)));
        int i27 = i25 & i26;
        int i28 = (i27 - (~(-(-((i26 ^ i25) | i27))))) - 1;
        int i29 = ~(i23 & i13);
        int i30 = (i10 & i12) | ((~i10) & iCurrentTimeMillis);
        int i31 = i10 & iCurrentTimeMillis;
        int i32 = (i30 & i31) | (i30 ^ i31);
        int i33 = (i32 | (~i32)) & (~i32);
        int i34 = ((i29 & i33) | (i29 ^ i33) | (~((iCurrentTimeMillis & i12) | (i12 ^ iCurrentTimeMillis)))) * 959;
        int i35 = i28 & i34;
        int i36 = (i34 ^ i28) | i35;
        this(c3Var, iIntValue, iIntValue2, (i35 & i36) + (i36 | i35));
        setCompoundDrawableTintBlendMode(new Object[]{this, bArr, bArr2, banVar}, -1778040450, 1778040453, System.identityHashCode(this));
    }

    public final bae setCompoundDrawableTintBlendMode(adu aduVar) {
        return (bae) setCompoundDrawableTintBlendMode(new Object[]{this, aduVar}, 1636934983, -1636934981, System.identityHashCode(this));
    }

    public bae(bbb bbbVar, int i10, int i11) {
        this((c3) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar}, 122256615, -122256609, System.identityHashCode(bbbVar)), ((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar}, 1335966603, -1335966598, System.identityHashCode(bbbVar))).intValue(), ((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar}, 1331480093, -1331480090, System.identityHashCode(bbbVar))).intValue(), i11);
        this.E0 = i10;
        this.f54294x0 = i11;
        this.f54295y0 = true;
    }
}
