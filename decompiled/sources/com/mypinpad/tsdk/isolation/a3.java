package com.mypinpad.tsdk.isolation;

import java.io.Serializable;
import java.util.Stack;

/* JADX INFO: loaded from: classes10.dex */
public final class a3 implements Serializable, Cloneable {
    public static int v0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f51983w0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public baw f51984p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f51985q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f51986r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f51987s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f51988t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f51989u0 = false;

    public a3(int i10) {
        this.f51985q0 = i10;
    }

    public static /* synthetic */ void a(Object[] objArr) {
        int i10;
        baw bawVar;
        int i11 = 0;
        a3 a3Var = (a3) objArr[0];
        int i12 = 1;
        Stack stack = (Stack) objArr[1];
        int i13 = 2;
        c3 c3Var = (c3) objArr[2];
        byte[] bArr = (byte[]) objArr[3];
        byte[] bArr2 = (byte[]) objArr[4];
        ban banVar = (ban) objArr[5];
        int i14 = v0;
        int i15 = ((i14 ^ 71) | (i14 & 71)) << 1;
        int i16 = -(((~i14) & 71) | (i14 & (-72)));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        int i18 = i17 % 128;
        f51983w0 = i18;
        if (i17 % 2 == 0) {
            throw null;
        }
        if (banVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (!a3Var.f51989u0) {
            int i19 = (((i18 | 36) << 1) - (i18 ^ 36)) - 1;
            v0 = i19 % 128;
            if (i19 % 2 != 0) {
                throw null;
            }
            if (a3Var.f51988t0) {
                ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new ban.setCompoundDrawableTintBlendMode();
                int i20 = 322813127;
                int iIntValue = ((Integer) bar.setY(new Object[]{banVar}, -322813125, 322813127, System.identityHashCode(banVar))).intValue();
                ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = (ban.setCompoundDrawableTintBlendMode) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setcompounddrawabletintblendmode, Integer.valueOf(iIntValue)}, 575278009, -575278009, iIntValue));
                ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = (ban.setCompoundDrawableTintBlendMode) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setcompounddrawabletintblendmode2, Long.valueOf(((Long) bar.setY(new Object[]{banVar}, 482931428, -482931427, System.identityHashCode(banVar))).longValue())}, -1011452391, 1011452396, System.identityHashCode(setcompounddrawabletintblendmode2)));
                int i21 = a3Var.f51987s0;
                ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode4 = (ban.setCompoundDrawableTintBlendMode) ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode3, Integer.valueOf(i21)}, 391211609, -391211603, i21);
                int iIntValue2 = ((Integer) ban.a(new Object[]{banVar}, -545166502, 545166504, System.identityHashCode(banVar))).intValue();
                ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode5 = (ban.setCompoundDrawableTintBlendMode) ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode4, Integer.valueOf(iIntValue2)}, 874018780, -874018778, iIntValue2);
                int iIntValue3 = ((Integer) ban.a(new Object[]{banVar}, -484111224, 484111224, System.identityHashCode(banVar))).intValue();
                ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode6 = (ban.setCompoundDrawableTintBlendMode) ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode5, Integer.valueOf(iIntValue3)}, -1717175544, 1717175544, iIntValue3);
                int iIntValue4 = ((Integer) bar.setY(new Object[]{banVar}, -1433420492, 1433420492, System.identityHashCode(banVar))).intValue();
                ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode7 = (ban.setCompoundDrawableTintBlendMode) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setcompounddrawabletintblendmode6, Integer.valueOf(iIntValue4)}, 1127697955, -1127697949, iIntValue4));
                ban banVar2 = (ban) ((bar) ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode7}, 1084061586, -1084061582, System.identityHashCode(setcompounddrawabletintblendmode7)));
                bal.setOnFocusChangeListener setonfocuschangelistener = new bal.setOnFocusChangeListener();
                int iIntValue5 = ((Integer) bar.setY(new Object[]{banVar2}, -322813125, 322813127, System.identityHashCode(banVar2))).intValue();
                bal.setOnFocusChangeListener setonfocuschangelistener2 = (bal.setOnFocusChangeListener) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setonfocuschangelistener, Integer.valueOf(iIntValue5)}, 575278009, -575278009, iIntValue5));
                bal.setOnFocusChangeListener setonfocuschangelistener3 = (bal.setOnFocusChangeListener) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setonfocuschangelistener2, Long.valueOf(((Long) bar.setY(new Object[]{banVar2}, 482931428, -482931427, System.identityHashCode(banVar2))).longValue())}, -1011452391, 1011452396, System.identityHashCode(setonfocuschangelistener2)));
                int i22 = a3Var.f51987s0;
                bal.setOnFocusChangeListener setonfocuschangelistener4 = (bal.setOnFocusChangeListener) bal.setOnFocusChangeListener.setDividerPadding(new Object[]{setonfocuschangelistener3, Integer.valueOf(i22)}, 212799444, -212799438, i22);
                bal balVar = (bal) ((bar) bal.setOnFocusChangeListener.setDividerPadding(new Object[]{setonfocuschangelistener4}, 2125069984, -2125069977, System.identityHashCode(setonfocuschangelistener4)));
                bam.setX setx = new bam.setX();
                int iIntValue6 = ((Integer) bar.setY(new Object[]{banVar2}, -322813125, 322813127, System.identityHashCode(banVar2))).intValue();
                bam.setX setx2 = (bam.setX) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setx, Integer.valueOf(iIntValue6)}, 575278009, -575278009, iIntValue6));
                bam.setX setx3 = (bam.setX) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setx2, Long.valueOf(((Long) bar.setY(new Object[]{banVar2}, 482931428, -482931427, System.identityHashCode(banVar2))).longValue())}, -1011452391, 1011452396, System.identityHashCode(setx2)));
                int i23 = a3Var.f51987s0;
                bam.setX setx4 = (bam.setX) bam.setX.setX(new Object[]{setx3, Integer.valueOf(i23)}, -2130967129, 2130967131, i23);
                bam bamVar = (bam) ((bar) bam.setX.setX(new Object[]{setx4}, -1826442849, 1826442849, System.identityHashCode(setx4)));
                c3.c(new Object[]{c3Var, (byte[]) c3.c(new Object[]{c3Var, bArr2, banVar2}, 2052322641, -2052322634, System.identityHashCode(c3Var)), bArr}, 612316896, -612316893, System.identityHashCode(c3Var));
                baw bawVarA = g3.a(new Object[]{c3Var, (e3) c3.c(new Object[]{c3Var, banVar2}, -754018063, 754018063, System.identityHashCode(c3Var)), balVar}, -1348979818, 1348979819, (int) System.currentTimeMillis());
                int i24 = v0;
                int i25 = ((i24 | 39) << 1) - (i24 ^ 39);
                f51983w0 = i25 % 128;
                int i26 = i25 % 2;
                while (true) {
                    int i27 = (stack.isEmpty() ? 1 : 0) ^ i12;
                    i10 = a3Var.f51985q0;
                    if (i27 == 0) {
                        break;
                    }
                    int i28 = v0;
                    int i29 = i28 ^ 35;
                    int i30 = ((((i28 & 35) | i29) << i12) - (~(-i29))) - i12;
                    f51983w0 = i30 % 128;
                    int i31 = i30 % i13;
                    baw bawVar2 = (baw) stack.peek();
                    Object[] objArr2 = new Object[i12];
                    objArr2[i11] = bawVar2;
                    int iIntValue7 = ((Integer) baw.setCompoundDrawableTintBlendMode(objArr2, 1955195146, -1955195145, System.identityHashCode(bawVar2))).intValue();
                    Object[] objArr3 = new Object[i12];
                    objArr3[i11] = bawVarA;
                    if (iIntValue7 != ((Integer) baw.setCompoundDrawableTintBlendMode(objArr3, 1955195146, -1955195145, System.identityHashCode(bawVarA))).intValue()) {
                        break;
                    }
                    int i32 = f51983w0;
                    int i33 = (i32 & (-60)) | ((~i32) & 59);
                    int i34 = (i32 & 59) << i12;
                    int i35 = (i33 ^ i34) + ((i34 & i33) << i12);
                    v0 = i35 % 128;
                    int i36 = i35 % i13;
                    baw bawVar3 = (baw) stack.peek();
                    Object[] objArr4 = new Object[i12];
                    objArr4[i11] = bawVar3;
                    if (((Integer) baw.setCompoundDrawableTintBlendMode(objArr4, 1955195146, -1955195145, System.identityHashCode(bawVar3))).intValue() == i10) {
                        break;
                    }
                    bam.setX setx5 = new bam.setX();
                    Object[] objArr5 = new Object[i12];
                    objArr5[i11] = bamVar;
                    int iIntValue8 = ((Integer) bar.setY(objArr5, -322813125, i20, System.identityHashCode(bamVar))).intValue();
                    Object[] objArr6 = new Object[i13];
                    objArr6[i11] = setx5;
                    objArr6[i12] = Integer.valueOf(iIntValue8);
                    bam.setX setx6 = (bam.setX) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(objArr6, 575278009, -575278009, iIntValue8));
                    Object[] objArr7 = new Object[i12];
                    objArr7[i11] = bamVar;
                    long jLongValue = ((Long) bar.setY(objArr7, 482931428, -482931427, System.identityHashCode(bamVar))).longValue();
                    Object[] objArr8 = new Object[i13];
                    objArr8[i11] = setx6;
                    objArr8[i12] = Long.valueOf(jLongValue);
                    bam.setX setx7 = (bam.setX) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(objArr8, -1011452391, 1011452396, System.identityHashCode(setx6)));
                    Object[] objArr9 = new Object[i12];
                    objArr9[i11] = bamVar;
                    int iIntValue9 = ((Integer) bam.b(objArr9, -75806786, 75806786, System.identityHashCode(bamVar))).intValue();
                    Object[] objArr10 = new Object[i13];
                    objArr10[i11] = setx7;
                    objArr10[i12] = Integer.valueOf(iIntValue9);
                    bam.setX setx8 = (bam.setX) bam.setX.setX(objArr10, 849744138, -849744134, iIntValue9);
                    Object[] objArr11 = new Object[i12];
                    objArr11[i11] = bamVar;
                    int iIntValue10 = ((Integer) bam.b(objArr11, -844564495, 844564497, System.identityHashCode(bamVar))).intValue();
                    int iIdentityHashCode = System.identityHashCode(a3Var);
                    int i37 = 918 - (~(-(-(iIntValue10 * (-919)))));
                    int i38 = ~iIntValue10;
                    int i39 = i38 & (i38 | iIntValue10);
                    int i40 = ~iIdentityHashCode;
                    int i41 = i39 & i40;
                    int i42 = ~i39;
                    int i43 = i41 | (iIdentityHashCode & i42);
                    int i44 = i39 & iIdentityHashCode;
                    int i45 = (i43 ^ i44) | (i43 & i44);
                    int i46 = ~i45;
                    int i47 = (i46 & (i45 | i46) & (~i11)) * 920;
                    int i48 = i37 & i47;
                    int i49 = (i47 ^ i37) | i48;
                    int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                    int i51 = ~i38;
                    int i52 = ~i40;
                    int i53 = i52 & (i52 | i40);
                    a3 a3Var2 = a3Var;
                    int i54 = ((~i53) & i51) | ((~i51) & i53);
                    int i55 = i53 & i51;
                    int i56 = (((i55 & i54) | (i54 ^ i55)) * 920) + i50;
                    int i57 = ~((i39 & i52) | (i40 & i42) | i41);
                    int i58 = (iIntValue10 & i40) | (iIdentityHashCode & i38);
                    int i59 = iIntValue10 & iIdentityHashCode;
                    int i60 = ~((i58 & i59) | (i58 ^ i59));
                    int i61 = i57 & i60;
                    int i62 = (i57 | i60) & (~i61);
                    int i63 = (i62 & i61) | (i62 ^ i61);
                    int i64 = ~(((-1) ^ iIdentityHashCode) | iIdentityHashCode);
                    int i65 = ((~i64) & i63) | ((~i63) & i64);
                    int i66 = i63 & i64;
                    int i67 = ((-2) - (((i56 - (~(-(~(-(-(((i66 & i65) | (i65 ^ i66)) * 920))))))) - 1) ^ (-1))) / 2;
                    bam.setX setx9 = (bam.setX) bam.setX.setX(new Object[]{setx8, Integer.valueOf(i67)}, -2130967129, 2130967131, i67);
                    int iIntValue11 = ((Integer) bar.setY(new Object[]{bamVar}, -1433420492, 1433420492, System.identityHashCode(bamVar))).intValue();
                    bam.setX setx10 = (bam.setX) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setx9, Integer.valueOf(iIntValue11)}, 1127697955, -1127697949, iIntValue11));
                    bam bamVar2 = (bam) ((bar) bam.setX.setX(new Object[]{setx10}, -1826442849, 1826442849, System.identityHashCode(setx10)));
                    baw bawVarA2 = g3.a(new Object[]{c3Var, (baw) stack.pop(), bawVarA, bamVar2}, 300430928, -300430928, (int) System.currentTimeMillis());
                    int iIntValue12 = ((Integer) baw.setCompoundDrawableTintBlendMode(new Object[]{bawVarA2}, 1955195146, -1955195145, System.identityHashCode(bawVarA2))).intValue();
                    System.identityHashCode(a3Var2);
                    int i68 = iIntValue12 * (-676);
                    int i69 = (678 & i68) + (i68 | 678);
                    int i70 = (i69 & 1353) | ((~i69) & (-1354));
                    int i71 = (i69 & (-1354)) << 1;
                    int i72 = ((i70 | i71) << 1) - (i70 ^ i71);
                    int i73 = ~iIntValue12;
                    int i74 = ((~i73) & (-2)) | (i73 & 1);
                    int i75 = (-2) & i73;
                    int i76 = -(-(((i74 & i75) | (i74 ^ i75)) * (-677)));
                    int i77 = i72 & i76;
                    int i78 = -(-(i76 | i72));
                    int i79 = (i77 ^ i78) + ((i78 & i77) << 1);
                    int i80 = (iIntValue12 | i73) & i73;
                    int i81 = i80 & 1;
                    int i82 = -(-((~(((i80 | 1) & (~i81)) | i81)) * 677));
                    bawVarA = new baw((i79 & i82) + (i82 | i79), (byte[]) baw.setCompoundDrawableTintBlendMode(new Object[]{bawVarA2}, 1592072604, -1592072604, System.identityHashCode(bawVarA2)));
                    bam.setX setx11 = new bam.setX();
                    int iIntValue13 = ((Integer) bar.setY(new Object[]{bamVar2}, -322813125, 322813127, System.identityHashCode(bamVar2))).intValue();
                    bam.setX setx12 = (bam.setX) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setx11, Integer.valueOf(iIntValue13)}, 575278009, -575278009, iIntValue13));
                    bam.setX setx13 = (bam.setX) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setx12, Long.valueOf(((Long) bar.setY(new Object[]{bamVar2}, 482931428, -482931427, System.identityHashCode(bamVar2))).longValue())}, -1011452391, 1011452396, System.identityHashCode(setx12)));
                    int iIntValue14 = ((Integer) bam.b(new Object[]{bamVar2}, -75806786, 75806786, System.identityHashCode(bamVar2))).intValue();
                    int iIdentityHashCode2 = System.identityHashCode(a3Var2);
                    int i83 = -(-(iIntValue14 * (-929)));
                    int i84 = (-464) | i83;
                    int i85 = ((i84 << 1) - (~(-((~(i83 & (-464))) & i84)))) - 1;
                    int i86 = iIntValue14 & iIdentityHashCode2;
                    int i87 = (~i86) & (iIntValue14 | iIdentityHashCode2);
                    int i88 = (i87 & i86) | (i87 ^ i86);
                    int i89 = ~i88;
                    int i90 = (i88 | i89) & i89;
                    int i91 = (-2) & i90;
                    int i92 = (((i90 | (-2)) & (~i91)) | i91) * (-465);
                    int i93 = i85 | i92;
                    int i94 = i93 << 1;
                    int i95 = -((~(i92 & i85)) & i93);
                    int i96 = (i94 ^ i95) + ((i95 & i94) << 1);
                    int i97 = (-2) ^ iIdentityHashCode2;
                    int i98 = (-2) & iIdentityHashCode2;
                    int i99 = ~((i97 ^ i98) | (i97 & i98));
                    int i100 = (i96 - (~(-(~(((i99 & iIntValue14) | (((~i99) & iIntValue14) | ((~iIntValue14) & i99))) * 930))))) - 2;
                    int i101 = (iIntValue14 ^ iIdentityHashCode2) | i86;
                    int i102 = ((i101 & (-2)) | (i101 ^ (-2))) * 465;
                    int i103 = i100 & i102;
                    int i104 = -(-((i102 ^ i100) | i103));
                    int i105 = (i103 ^ i104) + ((i104 & i103) << 1);
                    bam.setX setx14 = (bam.setX) bam.setX.setX(new Object[]{setx13, Integer.valueOf(i105)}, 849744138, -849744134, i105);
                    int iIntValue15 = ((Integer) bam.b(new Object[]{bamVar2}, -844564495, 844564497, System.identityHashCode(bamVar2))).intValue();
                    bam.setX setx15 = (bam.setX) bam.setX.setX(new Object[]{setx14, Integer.valueOf(iIntValue15)}, -2130967129, 2130967131, iIntValue15);
                    int iIntValue16 = ((Integer) bar.setY(new Object[]{bamVar2}, -1433420492, 1433420492, System.identityHashCode(bamVar2))).intValue();
                    bam.setX setx16 = (bam.setX) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setx15, Integer.valueOf(iIntValue16)}, 1127697955, -1127697949, iIntValue16));
                    bamVar = (bam) ((bar) bam.setX.setX(new Object[]{setx16}, -1826442849, 1826442849, System.identityHashCode(setx16)));
                    int i106 = v0;
                    int i107 = (i106 & (-102)) | ((~i106) & 101);
                    int i108 = (i106 & 101) << 1;
                    int i109 = (i107 & i108) + (i108 | i107);
                    f51983w0 = i109 % 128;
                    int i110 = i109 % 2;
                    a3Var = a3Var2;
                    i11 = 0;
                    i12 = 1;
                    i13 = 2;
                    i20 = 322813127;
                }
                baw bawVar4 = bawVarA;
                baw bawVar5 = a3Var.f51984p0;
                if (bawVar5 == null) {
                    int i111 = f51983w0;
                    int i112 = (-2) - ((((i111 | 14) << 1) - (i111 ^ 14)) ^ (-1));
                    v0 = i112 % 128;
                    int i113 = i112 % 2;
                    bawVar = bawVar4;
                    a3Var.f51984p0 = bawVar;
                    int i114 = ((i111 | 9) << 1) - (i111 ^ 9);
                    v0 = i114 % 128;
                    int i115 = i114 % 2;
                } else {
                    bawVar = bawVar4;
                    if (((Integer) baw.setCompoundDrawableTintBlendMode(new Object[]{bawVar5}, 1955195146, -1955195145, System.identityHashCode(bawVar5))).intValue() == ((Integer) baw.setCompoundDrawableTintBlendMode(new Object[]{bawVar}, 1955195146, -1955195145, System.identityHashCode(bawVar))).intValue()) {
                        bam.setX setx17 = new bam.setX();
                        int iIntValue17 = ((Integer) bar.setY(new Object[]{bamVar}, -322813125, 322813127, System.identityHashCode(bamVar))).intValue();
                        bam.setX setx18 = (bam.setX) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setx17, Integer.valueOf(iIntValue17)}, 575278009, -575278009, iIntValue17));
                        bam.setX setx19 = (bam.setX) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setx18, Long.valueOf(((Long) bar.setY(new Object[]{bamVar}, 482931428, -482931427, System.identityHashCode(bamVar))).longValue())}, -1011452391, 1011452396, System.identityHashCode(setx18)));
                        int iIntValue18 = ((Integer) bam.b(new Object[]{bamVar}, -75806786, 75806786, System.identityHashCode(bamVar))).intValue();
                        bam.setX setx20 = (bam.setX) bam.setX.setX(new Object[]{setx19, Integer.valueOf(iIntValue18)}, 849744138, -849744134, iIntValue18);
                        int iIntValue19 = ((Integer) bam.b(new Object[]{bamVar}, -844564495, 844564497, System.identityHashCode(bamVar))).intValue();
                        System.identityHashCode(a3Var);
                        int i116 = iIntValue19 * 825;
                        int i117 = ((((-1649) ^ i116) | ((-1649) & i116)) << 1) - ((i116 & 1648) | ((-1649) & (~i116)));
                        int i118 = ~iIntValue19;
                        int i119 = (-1) ^ i118;
                        int i120 = (i117 - (~(-(~(-(-(((i119 & i118) | (i119 ^ i118)) * (-824)))))))) - 1;
                        int i121 = (i120 ^ (-1)) + (i120 << 1);
                        int i122 = iIntValue19 | i118;
                        int i123 = i122 * (-1648);
                        int i124 = (i121 & i123) + (i123 | i121);
                        int i125 = -(-((i122 & i118) * 824));
                        int i126 = i124 | i125;
                        int i127 = i126 << 1;
                        int i128 = -((~(i125 & i124)) & i126);
                        int i129 = ((i127 & i128) + (i128 | i127)) / 2;
                        bam.setX setx21 = (bam.setX) bam.setX.setX(new Object[]{setx20, Integer.valueOf(i129)}, -2130967129, 2130967131, i129);
                        int iIntValue20 = ((Integer) bar.setY(new Object[]{bamVar}, -1433420492, 1433420492, System.identityHashCode(bamVar))).intValue();
                        bam.setX setx22 = (bam.setX) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setx21, Integer.valueOf(iIntValue20)}, 1127697955, -1127697949, iIntValue20));
                        bam bamVar3 = (bam) ((bar) bam.setX.setX(new Object[]{setx22}, -1826442849, 1826442849, System.identityHashCode(setx22)));
                        baw bawVarA3 = g3.a(new Object[]{c3Var, a3Var.f51984p0, bawVar, bamVar3}, 300430928, -300430928, (int) System.currentTimeMillis());
                        baw bawVar6 = a3Var.f51984p0;
                        int iIntValue21 = ((Integer) baw.setCompoundDrawableTintBlendMode(new Object[]{bawVar6}, 1955195146, -1955195145, System.identityHashCode(bawVar6))).intValue();
                        int iIdentityHashCode3 = System.identityHashCode(a3Var);
                        int i130 = iIntValue21 * 868;
                        int i131 = (868 & i130) + (i130 | 868);
                        int i132 = ~iIdentityHashCode3;
                        int i133 = (i132 | iIdentityHashCode3) & i132;
                        int i134 = ~i133;
                        int i135 = ~(((-2) & i134) | (i133 & 1) | ((-2) & i133));
                        int i136 = ~iIntValue21;
                        int i137 = ~((i136 ^ i133) | (i136 & i133));
                        int i138 = (i131 - (~(-(-(((i135 & i137) | (i135 ^ i137)) * (-867)))))) - 1;
                        int i139 = (-2) & i136;
                        int i140 = (~i139) & ((-2) | i136);
                        int i141 = ~((i140 & i139) | (i140 ^ i139));
                        int i142 = (-2) & iIdentityHashCode3;
                        int i143 = (~i142) & ((-2) | iIdentityHashCode3);
                        int i144 = ~((i143 & i142) | (i143 ^ i142));
                        int i145 = (i144 & i141) | (i141 ^ i144);
                        int i146 = ~(((i136 | iIntValue21) & i136) | iIdentityHashCode3);
                        int i147 = ((~i146) & i145) | ((~i145) & i146);
                        int i148 = i145 & i146;
                        int i149 = -(~(-(-(((i148 & i147) | (i147 ^ i148)) * (-1734)))));
                        int i150 = ((i138 & i149) + (i138 | i149)) - 1;
                        int i151 = i136 & 1;
                        int i152 = ((~i136) & (-2)) | i151;
                        int i153 = (i152 & i139) | (i152 ^ i139);
                        int i154 = (i134 & i153) | ((~i153) & i133);
                        int i155 = i133 & i153;
                        int i156 = ~((i155 & i154) | (i154 ^ i155));
                        int i157 = (iIntValue21 & 1) | i139;
                        int i158 = iIntValue21 & (-2);
                        int i159 = (i158 & i157) | (i157 ^ i158);
                        int i160 = ~((i159 & iIdentityHashCode3) | (i132 & i159) | ((~i159) & iIdentityHashCode3));
                        int i161 = i156 & i160;
                        int i162 = (i160 | i156) & (~i161);
                        int i163 = (i162 & i161) | (i162 ^ i161);
                        int i164 = (~i151) & (i136 | 1);
                        int i165 = (i164 & i151) | (i164 ^ i151);
                        int i166 = ~((iIdentityHashCode3 & i165) | (i165 ^ iIdentityHashCode3));
                        int i167 = i163 ^ i166;
                        int i168 = i163 & i166;
                        int i169 = ((i168 & i167) | (i167 ^ i168)) * 867;
                        bawVar = new baw(((((i150 ^ i169) | (i150 & i169)) << 1) - (~(-((i169 & (~i150)) | ((~i169) & i150))))) - 1, (byte[]) baw.setCompoundDrawableTintBlendMode(new Object[]{bawVarA3}, 1592072604, -1592072604, System.identityHashCode(bawVarA3)));
                        a3Var.f51984p0 = bawVar;
                        bam.setX setx23 = new bam.setX();
                        int iIntValue22 = ((Integer) bar.setY(new Object[]{bamVar3}, -322813125, 322813127, System.identityHashCode(bamVar3))).intValue();
                        bam.setX setx24 = (bam.setX) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setx23, Integer.valueOf(iIntValue22)}, 575278009, -575278009, iIntValue22));
                        bam.setX setx25 = (bam.setX) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setx24, Long.valueOf(((Long) bar.setY(new Object[]{bamVar3}, 482931428, -482931427, System.identityHashCode(bamVar3))).longValue())}, -1011452391, 1011452396, System.identityHashCode(setx24)));
                        int iIntValue23 = ((Integer) bam.b(new Object[]{bamVar3}, -75806786, 75806786, System.identityHashCode(bamVar3))).intValue();
                        int i170 = iIntValue23 & 1;
                        int i171 = ((iIntValue23 | 1) & (~i170)) + (i170 << 1);
                        bam.setX setx26 = (bam.setX) bam.setX.setX(new Object[]{setx25, Integer.valueOf(i171)}, 849744138, -849744134, i171);
                        int iIntValue24 = ((Integer) bam.b(new Object[]{bamVar3}, -844564495, 844564497, System.identityHashCode(bamVar3))).intValue();
                        bam.setX setx27 = (bam.setX) bam.setX.setX(new Object[]{setx26, Integer.valueOf(iIntValue24)}, -2130967129, 2130967131, iIntValue24);
                        int iIntValue25 = ((Integer) bar.setY(new Object[]{bamVar3}, -1433420492, 1433420492, System.identityHashCode(bamVar3))).intValue();
                        bam.setX setx28 = (bam.setX) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setx27, Integer.valueOf(iIntValue25)}, 1127697955, -1127697949, iIntValue25));
                        int i172 = f51983w0;
                        int i173 = i172 ^ 15;
                        int i174 = (i172 & 15) << 1;
                        int i175 = (i173 ^ i174) + ((i174 & i173) << 1);
                        v0 = i175 % 128;
                        int i176 = i175 % 2;
                    } else {
                        stack.push(bawVar);
                        int i177 = f51983w0;
                        int i178 = i177 & 31;
                        int i179 = (i177 | 31) & (~i178);
                        int i180 = i178 << 1;
                        int i181 = (i179 & i180) + (i179 | i180);
                        v0 = i181 % 128;
                        int i182 = i181 % 2;
                    }
                }
                baw bawVar7 = a3Var.f51984p0;
                if (((Integer) baw.setCompoundDrawableTintBlendMode(new Object[]{bawVar7}, 1955195146, -1955195145, System.identityHashCode(bawVar7))).intValue() == i10) {
                    int i183 = v0;
                    int i184 = i183 & 43;
                    int i185 = i183 | 43;
                    int i186 = (i184 ^ i185) + ((i184 & i185) << 1);
                    f51983w0 = i186 % 128;
                    int i187 = i186 % 2;
                    a3Var.f51989u0 = true;
                    int i188 = (i183 ^ 125) + ((i183 & 125) << 1);
                    f51983w0 = i188 % 128;
                    int i189 = i188 % 2;
                    return;
                }
                a3Var.f51986r0 = ((Integer) baw.setCompoundDrawableTintBlendMode(new Object[]{bawVar}, 1955195146, -1955195145, System.identityHashCode(bawVar))).intValue();
                int i190 = a3Var.f51987s0;
                int iIdentityHashCode4 = System.identityHashCode(a3Var);
                int i191 = -(-(i190 * 530));
                int i192 = ((1588 ^ i191) | (1588 & i191)) << 1;
                int i193 = -((i191 & (-1589)) | (1588 & (~i191)));
                int i194 = (i192 ^ i193) + ((i193 & i192) << 1);
                int i195 = ~iIdentityHashCode4;
                int i196 = i195 & (i195 | iIdentityHashCode4);
                int i197 = i196 & 1;
                int i198 = (i196 | 1) & (~i197);
                int i199 = (i198 & i197) | (i198 ^ i197);
                int i200 = ~i199;
                int i201 = (i199 | i200) & i200;
                int i202 = ~((i190 ^ 1) | (i190 & 1));
                int i203 = i201 ^ i202;
                int i204 = i201 & i202;
                int i205 = -(-(((i204 & i203) | (i203 ^ i204)) * 529));
                int i206 = (i194 & i205) + (i205 | i194);
                int i207 = ~i190;
                int i208 = (i190 | i207) & i207;
                int i209 = ~((iIdentityHashCode4 & 1) | (iIdentityHashCode4 ^ 1));
                int i210 = i208 & i209;
                int i211 = -(-((((i208 | i209) & (~i210)) | i210) * 529));
                a3Var.f51987s0 = ((((~i211) & i206) | ((~i206) & i211)) - (~(-(-((i211 & i206) << 1))))) - 1;
                int i212 = v0;
                int i213 = i212 & 13;
                int i214 = -(-((i212 ^ 13) | i213));
                int i215 = (i213 ^ i214) + ((i214 & i213) << 1);
                f51983w0 = i215 % 128;
                int i216 = i215 % 2;
                return;
            }
        }
        throw new IllegalStateException("finished or not initialized");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x019b  */
    /* JADX WARN: Code duplicated, block: B:39:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:41:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:43:0x01bd  */
    public static /* synthetic */ Serializable b(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        int iValueOf;
        int i15 = ~i12;
        int i16 = ~(i15 | i10);
        int i17 = ~((~i10) | i11);
        int i18 = (((~(i10 | (~i11))) | i17 | i16) * 764) + (((~(i15 | i11)) | i17) * (-1528)) + ((i11 | i16) * 764) + (i11 * (-1527)) + (i10 * 765);
        Serializable serializableValueOf = null;
        serializableValueOf = null;
        serializableValueOf = null;
        switch (i18) {
            case 1:
                a3 a3Var = (a3) objArr[0];
                a3 a3Var2 = new a3(a3Var.f51985q0);
                a3Var2.f51984p0 = a3Var.f51984p0;
                a3Var2.f51986r0 = a3Var.f51986r0;
                a3Var2.f51987s0 = a3Var.f51987s0;
                a3Var2.f51988t0 = a3Var.f51988t0;
                a3Var2.f51989u0 = a3Var.f51989u0;
                int i19 = f51983w0 + 38;
                int i20 = (i19 ^ (-1)) + (i19 << 1);
                v0 = i20 % 128;
                serializableValueOf = a3Var2;
                if (i20 % 2 != 0) {
                    int i21 = 36 / 0;
                    serializableValueOf = a3Var2;
                }
                break;
            case 2:
                a3 a3Var3 = (a3) objArr[0];
                int i22 = f51983w0 + 41;
                v0 = i22 % 128;
                int i23 = i22 % 2;
                boolean z10 = a3Var3.f51989u0;
                if (i23 != 0) {
                    throw null;
                }
                serializableValueOf = Boolean.valueOf(z10);
                break;
                break;
            case 3:
                a3 a3Var4 = (a3) objArr[0];
                int i24 = v0;
                int i25 = i24 & 65;
                int i26 = (i24 | 65) & (~i25);
                int i27 = -(-(i25 << 1));
                int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                f51983w0 = i28 % 128;
                int i29 = i28 % 2;
                boolean z11 = a3Var4.f51988t0;
                if (i29 == 0) {
                    throw null;
                }
                serializableValueOf = Boolean.valueOf(z11);
                break;
                break;
            case 4:
                a3 a3Var5 = (a3) objArr[0];
                int i30 = f51983w0;
                int i31 = (i30 & 69) + (i30 | 69);
                v0 = i31 % 128;
                if (i31 % 2 == 0) {
                    if (a3Var5.f51988t0) {
                        if (a3Var5.f51989u0) {
                            i13 = a3Var5.f51986r0;
                            int i32 = i30 & 61;
                            int i33 = -(-((i30 ^ 61) | i32));
                            i14 = (i32 ^ i33) + ((i33 & i32) << 1);
                            v0 = i14 % 128;
                            if (i14 % 2 == 0) {
                                throw null;
                            }
                            iValueOf = Integer.valueOf(i13);
                        }
                    }
                    serializableValueOf = iValueOf;
                } else {
                    int i34 = 37 / 0;
                    if (a3Var5.f51988t0) {
                        if (a3Var5.f51989u0) {
                            i13 = a3Var5.f51986r0;
                            int i35 = i30 & 61;
                            int i36 = -(-((i30 ^ 61) | i35));
                            i14 = (i35 ^ i36) + ((i36 & i35) << 1);
                            v0 = i14 % 128;
                            if (i14 % 2 == 0) {
                                throw null;
                            }
                            iValueOf = Integer.valueOf(i13);
                        }
                    }
                    serializableValueOf = iValueOf;
                }
                int i37 = ((i30 & (-84)) | ((~i30) & 83)) + ((i30 & 83) << 1);
                v0 = i37 % 128;
                if (i37 % 2 != 0) {
                    int i38 = 3 / 0;
                }
                iValueOf = Integer.MAX_VALUE;
                serializableValueOf = iValueOf;
                break;
            case 5:
                a3 a3Var6 = (a3) objArr[0];
                int i39 = v0;
                int i40 = ~i39;
                int i41 = ((i39 & (-72)) | (71 & i40)) + ((i39 & 71) << 1);
                f51983w0 = i41 % 128;
                int i42 = i41 % 2;
                int i43 = a3Var6.f51987s0;
                int i44 = (((i39 & (-64)) | (i40 & 63)) - (~((i39 & 63) << 1))) - 1;
                f51983w0 = i44 % 128;
                if (i44 % 2 == 0) {
                    throw null;
                }
                serializableValueOf = Integer.valueOf(i43);
                break;
                break;
            case 6:
                a3 a3Var7 = (a3) objArr[0];
                int i45 = f51983w0 + 43;
                int i46 = i45 % 128;
                v0 = i46;
                if (i45 % 2 != 0) {
                    baw bawVar = a3Var7.f51984p0;
                    throw null;
                }
                baw bawVar2 = a3Var7.f51984p0;
                int i47 = ((i46 | 13) << 1) - ((i46 & (-14)) | ((~i46) & 13));
                f51983w0 = i47 % 128;
                int i48 = i47 % 2;
                serializableValueOf = bawVar2;
                break;
                break;
            case 7:
                a3 a3Var8 = (a3) objArr[0];
                baw bawVar3 = (baw) objArr[1];
                int i49 = f51983w0;
                int i50 = ((i49 ^ 97) - (~(-(-((i49 & 97) << 1))))) - 1;
                v0 = i50 % 128;
                int i51 = i50 % 2;
                a3Var8.f51984p0 = bawVar3;
                if (i51 != 0) {
                    a3Var8.f51986r0 = ((Integer) baw.setCompoundDrawableTintBlendMode(new Object[]{bawVar3}, 1955195146, -1955195145, System.identityHashCode(bawVar3))).intValue();
                    throw null;
                }
                int iIntValue = ((Integer) baw.setCompoundDrawableTintBlendMode(new Object[]{bawVar3}, 1955195146, -1955195145, System.identityHashCode(bawVar3))).intValue();
                a3Var8.f51986r0 = iIntValue;
                if (iIntValue == a3Var8.f51985q0) {
                    a3Var8.f51989u0 = true;
                    int i52 = f51983w0;
                    int i53 = (((i52 & (-28)) | ((~i52) & 27)) - (~((i52 & 27) << 1))) - 1;
                    v0 = i53 % 128;
                    int i54 = i53 % 2;
                }
                int i55 = f51983w0;
                int i56 = ((i55 ^ 85) | (i55 & 85)) << 1;
                int i57 = -(((~i55) & 85) | (i55 & (-86)));
                int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
                v0 = i58 % 128;
                if (i58 % 2 != 0) {
                    throw null;
                }
                break;
            case 8:
                a3 a3Var9 = (a3) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i59 = v0;
                int i60 = (i59 ^ 95) + ((i59 & 95) << 1);
                f51983w0 = i60 % 128;
                int i61 = i60 % 2;
                a3Var9.f51984p0 = null;
                a3Var9.f51986r0 = a3Var9.f51985q0;
                a3Var9.f51987s0 = iIntValue2;
                a3Var9.f51988t0 = true;
                a3Var9.f51989u0 = false;
                int i62 = i59 & 93;
                int i63 = i62 + ((i59 ^ 93) | i62);
                f51983w0 = i63 % 128;
                int i64 = i63 % 2;
                break;
            case 9:
                a3 a3Var10 = (a3) objArr[0];
                int i65 = f51983w0;
                int i66 = ((i65 ^ 30) + ((i65 & 30) << 1)) - 1;
                v0 = i66 % 128;
                int i67 = i66 % 2;
                a3 a3Var11 = (a3) b(new Object[]{a3Var10}, 23734728, -23734727, System.identityHashCode(a3Var10));
                int i68 = v0;
                int i69 = ((i68 ^ 76) + ((i68 & 76) << 1)) - 1;
                f51983w0 = i69 % 128;
                serializableValueOf = a3Var11;
                if (i69 % 2 == 0) {
                    int i70 = 80 / 0;
                    serializableValueOf = a3Var11;
                }
                break;
            default:
                a(objArr);
                break;
        }
        return serializableValueOf;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return b(new Object[]{this}, 1097407826, -1097407817, System.identityHashCode(this));
    }
}
