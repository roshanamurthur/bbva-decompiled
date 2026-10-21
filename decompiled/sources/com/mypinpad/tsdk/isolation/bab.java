package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class bab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54283a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54284b = 1;

    public static /* synthetic */ ahw a(Object[] objArr) throws IOException {
        amw amwVar = (amw) objArr[0];
        aee aeeVar = (aee) objArr[1];
        System.currentTimeMillis();
        System.currentTimeMillis();
        if (amwVar instanceof bdo) {
            bdo bdoVar = (bdo) amwVar;
            int iIntValue = ((Integer) bdo.setX(new Object[]{bdoVar}, -1672456908, 1672456909, System.identityHashCode(bdoVar))).intValue();
            ahw ahwVar = new ahw((aiw) x2.k(new Object[]{Integer.valueOf(iIntValue)}, -1863881361, 1863881378, iIntValue), new aft((byte[]) bdo.setX(new Object[]{bdoVar}, 1545400458, -1545400458, System.identityHashCode(bdoVar))), aeeVar);
            int i10 = f54283a;
            int i11 = i10 & 15;
            int i12 = ((i10 ^ 15) | i11) << 1;
            int i13 = -((i10 | 15) & (~i11));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            f54284b = i14 % 128;
            int i15 = i14 % 2;
            return ahwVar;
        }
        if (amwVar instanceof azr) {
            azr azrVar = (azr) amwVar;
            ahw ahwVar2 = new ahw(new aiw(avq.setX, new avr((aiw) x2.k(new Object[]{azrVar.setCompoundDrawableTintBlendMode()}, 1422545332, -1422545298, (int) System.currentTimeMillis()))), new aft(azrVar.setY()));
            int i16 = f54283a;
            int i17 = i16 & 23;
            int i18 = ((i16 ^ 23) | i17) << 1;
            int i19 = -((i16 | 23) & (~i17));
            int i20 = (i18 & i19) + (i19 | i18);
            f54284b = i20 % 128;
            int i21 = i20 % 2;
            return ahwVar2;
        }
        if (amwVar instanceof aye) {
            aye ayeVar = (aye) amwVar;
            aiw aiwVar = new aiw(avq.setDividerPadding);
            short[] sArr = (short[]) aye.setCompoundDrawableTintBlendMode(new Object[]{ayeVar}, 2124642337, -2124642337, System.identityHashCode(ayeVar));
            byte[] bArr = new byte[sArr.length << 1];
            int i22 = f54283a;
            int i23 = i22 & 29;
            int i24 = i23 + ((i22 ^ 29) | i23);
            f54284b = i24 % 128;
            int i25 = i24 % 2;
            int i26 = 0;
            while (i26 != sArr.length) {
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i27 = 1328517426 & iCurrentTimeMillis;
                int i28 = (~i27) & (1328517426 | iCurrentTimeMillis);
                int i29 = ~iCurrentTimeMillis;
                int i30 = ~(i27 | i28);
                int i31 = -(-(((i30 & 1012191394) | (1012191394 ^ i30)) * 398));
                int i32 = (-1748926332) & i31;
                int i33 = (i31 | (-1748926332)) & (~i32);
                int i34 = i32 << 1;
                int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
                int i36 = ((i35 & 1184037194) - (~(1184037194 | i35))) - 1;
                int i37 = 1328517426 ^ i29;
                int i38 = i29 & 1328517426;
                int i39 = ~((i38 & i37) | (i37 ^ i38));
                int i40 = i39 & 201625634;
                int i41 = (i39 | 201625634) & (~i40);
                int i42 = (i41 & i40) | (i41 ^ i40);
                int i43 = i42 ^ 810565760;
                int i44 = i42 & 810565760;
                int i45 = ((i44 & i43) | (i43 ^ i44)) * 398;
                int i46 = (((i36 ^ i45) | (i36 & i45)) << 1) - ((i45 & (~i36)) | ((~i45) & i36));
                int i47 = ~((int) System.currentTimeMillis());
                int i48 = (-1263204840) & i47;
                int i49 = ((-1263204840) | i47) & (~i48);
                int i50 = (i49 & i48) | (i49 ^ i48);
                int i51 = ~i50;
                int i52 = (i50 | i51) & i51;
                int i53 = (((i52 & (-2085589106)) | ((-2085589106) ^ i52)) * (-983)) - 1293703382;
                int i54 = ((~i47) & (-2085589106)) | (2085589105 & i47);
                int i55 = i47 & (-2085589106);
                int i56 = (i55 & i54) | (i54 ^ i55);
                int i57 = ~i56;
                int i58 = (i56 | i57) & i57;
                int i59 = i58 & 872742928;
                int i60 = (i58 | 872742928) & (~i59);
                int i61 = ((i60 & i59) | (i60 ^ i59)) * 983;
                int i62 = i53 & i61;
                if (i46 <= ((((i53 ^ i61) | i62) << 1) - (~(-((i61 | i53) & (~i62))))) - 1) {
                    ber.setDividerPadding(new Object[]{Short.valueOf(sArr[i26]), bArr, Integer.valueOf(i26)}, 1856223175, -1856223174, i26);
                    int i63 = i26 ^ (-13);
                    int i64 = (i26 & (-13)) << 1;
                    int i65 = (i63 & i64) + (i64 | i63);
                    i26 = (i65 & 35) + (i65 | 35);
                } else {
                    int i66 = i26 << 1;
                    ber.setDividerPadding(new Object[]{Short.valueOf(sArr[i26]), bArr, Integer.valueOf(i66)}, 1856223175, -1856223174, i66);
                    int i67 = ((i26 ^ 1) | (i26 & 1)) << 1;
                    int i68 = -(((~i26) & 1) | (i26 & (-2)));
                    i26 = ((i67 | i68) << 1) - (i68 ^ i67);
                }
                System.currentTimeMillis();
                System.currentTimeMillis();
            }
            return new ahw(aiwVar, new aft(bArr));
        }
        if (amwVar instanceof ayb) {
            ayb aybVar = (ayb) amwVar;
            axr axrVar = (axr) axr.setDividerPadding(new Object[]{(axr) axr.setDividerPadding(new Object[0], -776185694, 776185694, (int) System.currentTimeMillis()), 1}, 1810000667, -1810000665, 1);
            axr axrVar2 = (axr) axr.setDividerPadding(new Object[]{axrVar, aybVar}, -1986608045, 1986608051, System.identityHashCode(axrVar));
            byte[] bArr2 = (byte[]) axr.setDividerPadding(new Object[]{axrVar2}, 1746305515, -1746305507, System.identityHashCode(axrVar2));
            axr axrVar3 = (axr) axr.setDividerPadding(new Object[]{(axr) axr.setDividerPadding(new Object[0], -776185694, 776185694, (int) System.currentTimeMillis()), 1}, 1810000667, -1810000665, 1);
            axr axrVar4 = (axr) axr.setDividerPadding(new Object[]{axrVar3, (aya) ayb.setCompoundDrawableTintBlendMode(new Object[]{aybVar}, 1007144611, -1007144607, System.identityHashCode(aybVar))}, -1986608045, 1986608051, System.identityHashCode(axrVar3));
            ahw ahwVar3 = new ahw(new aiw(ahv.setMinHeight), new aft(bArr2), aeeVar, (byte[]) axr.setDividerPadding(new Object[]{axrVar4}, 1746305515, -1746305507, System.identityHashCode(axrVar4)));
            int i69 = f54283a;
            int i70 = (((i69 | 65) << 1) - (~(-(((~i69) & 65) | (i69 & (-66)))))) - 1;
            f54284b = i70 % 128;
            if (i70 % 2 != 0) {
                return ahwVar3;
            }
            throw null;
        }
        if (amwVar instanceof axv) {
            axv axvVar = (axv) amwVar;
            axr axrVar5 = (axr) axr.setDividerPadding(new Object[0], -776185694, 776185694, (int) System.currentTimeMillis());
            int iIntValue2 = ((Integer) axv.setDividerPadding(new Object[]{axvVar}, 220120912, -220120907, System.identityHashCode(axvVar))).intValue();
            axr axrVar6 = (axr) axr.setDividerPadding(new Object[]{axrVar5, Integer.valueOf(iIntValue2)}, 1810000667, -1810000665, iIntValue2);
            axr axrVar7 = (axr) axr.setDividerPadding(new Object[]{axrVar6, axvVar}, -1986608045, 1986608051, System.identityHashCode(axrVar6));
            byte[] bArr3 = (byte[]) axr.setDividerPadding(new Object[]{axrVar7}, 1746305515, -1746305507, System.identityHashCode(axrVar7));
            axr axrVar8 = (axr) axr.setDividerPadding(new Object[0], -776185694, 776185694, (int) System.currentTimeMillis());
            int iIntValue3 = ((Integer) axv.setDividerPadding(new Object[]{axvVar}, 220120912, -220120907, System.identityHashCode(axvVar))).intValue();
            axr axrVar9 = (axr) axr.setDividerPadding(new Object[]{axrVar8, Integer.valueOf(iIntValue3)}, 1810000667, -1810000665, iIntValue3);
            axu onFocusChangeListener = axvVar.setOnFocusChangeListener();
            axr axrVar10 = (axr) axr.setDividerPadding(new Object[]{axrVar9, (aya) axu.setX(new Object[]{onFocusChangeListener}, -1779413624, 1779413624, System.identityHashCode(onFocusChangeListener))}, -1986608045, 1986608051, System.identityHashCode(axrVar9));
            ahw ahwVar4 = new ahw(new aiw(ahv.setMinHeight), new aft(bArr3), aeeVar, (byte[]) axr.setDividerPadding(new Object[]{axrVar10}, 1746305515, -1746305507, System.identityHashCode(axrVar10)));
            int i71 = f54284b;
            int i72 = ((((i71 ^ 53) | (i71 & 53)) << 1) - (~(-(((~i71) & 53) | (i71 & (-54)))))) - 1;
            f54283a = i72 % 128;
            int i73 = i72 % 2;
            return ahwVar4;
        }
        if (amwVar instanceof azy) {
            azy azyVar = (azy) amwVar;
            ahw ahwVar5 = new ahw(new aiw((adu) x2.k(new Object[]{(azz) azw.setDividerPadding(new Object[]{azyVar}, 2097715784, -2097715784, System.identityHashCode(azyVar))}, 371077561, -371077539, (int) System.currentTimeMillis())), new avt(azyVar.setOnFocusChangeListener(), azyVar.setCompoundDrawableTintBlendMode(), new avs(azyVar.setY(), azyVar.getNavBarTitleString())), aeeVar);
            int i74 = f54283a;
            int i75 = (i74 & 43) + (i74 | 43);
            f54284b = i75 % 128;
            int i76 = i75 % 2;
            return ahwVar5;
        }
        if (amwVar instanceof ays) {
            ays aysVar = (ays) amwVar;
            ahw ahwVar6 = new ahw(new aiw((adu) x2.k(new Object[]{(ayu) ayt.setCompoundDrawableTintBlendMode(new Object[]{aysVar}, -1360106660, 1360106660, System.identityHashCode(aysVar))}, 349826736, -349826716, (int) System.currentTimeMillis())), new aft((byte[]) ays.setDividerPadding(new Object[]{aysVar}, -1890867872, 1890867872, System.identityHashCode(aysVar))), aeeVar);
            int i77 = f54283a;
            int i78 = (((i77 | 62) << 1) - (i77 ^ 62)) - 1;
            f54284b = i78 % 128;
            int i79 = i78 % 2;
            return ahwVar6;
        }
        if (amwVar instanceof awk) {
            awk awkVar = (awk) amwVar;
            ahw ahwVar7 = new ahw(new aiw((adu) x2.k(new Object[]{(awn) awm.setCompoundDrawableTintBlendMode(new Object[]{awkVar}, -1026820981, 1026820981, System.identityHashCode(awkVar))}, -1286227992, 1286228022, (int) System.currentTimeMillis())), new avk(awkVar.setDividerPadding(), awkVar.setCompoundDrawableTintBlendMode(), awkVar.setNavigationOnClickListener(), awkVar.setOnDragListener(), awkVar.setLayoutAnimation(), new avj(awkVar.setOnFocusChangeListener())), aeeVar);
            int i80 = f54283a;
            int i81 = (i80 & 71) + (i80 | 71);
            f54284b = i81 % 128;
            if (i81 % 2 != 0) {
                return ahwVar7;
            }
            throw null;
        }
        if (amwVar instanceof bbc) {
            bbc bbcVar = (bbc) amwVar;
            adu aduVar = avq.setLayoutAnimation;
            bbb bbbVar = (bbb) bbc.setX(new Object[]{bbcVar}, 73833213, -73833211, System.identityHashCode(bbcVar));
            ahw ahwVar8 = new ahw(new aiw(aduVar, new avu(((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar}, 1335966603, -1335966598, System.identityHashCode(bbbVar))).intValue(), (aiw) x2.k(new Object[]{(String) baq.setDividerPadding(new Object[]{bbcVar}, 1182771546, -1182771546, System.identityHashCode(bbcVar))}, -641264387, 641264395, (int) System.currentTimeMillis()))), (avw) setY(new Object[]{bbcVar}, 414840389, -414840389, (int) System.currentTimeMillis()), aeeVar);
            int i82 = f54283a + 79;
            f54284b = i82 % 128;
            int i83 = i82 % 2;
            return ahwVar8;
        }
        if (amwVar instanceof baz) {
            baz bazVar = (baz) amwVar;
            adu aduVar2 = avq.setNavigationOnClickListener;
            bax baxVar = (bax) baz.setCompoundDrawableTintBlendMode(new Object[]{bazVar}, 211369596, -211369595, System.identityHashCode(bazVar));
            int iIntValue4 = ((Integer) bax.setOnFocusChangeListener(new Object[]{baxVar}, -1235800220, 1235800228, System.identityHashCode(baxVar))).intValue();
            bax baxVar2 = (bax) baz.setCompoundDrawableTintBlendMode(new Object[]{bazVar}, 211369596, -211369595, System.identityHashCode(bazVar));
            ahw ahwVar9 = new ahw(new aiw(aduVar2, new avz(iIntValue4, ((Integer) bax.setOnFocusChangeListener(new Object[]{baxVar2}, -1153829548, 1153829554, System.identityHashCode(baxVar2))).intValue(), (aiw) x2.k(new Object[]{(String) bav.setDividerPadding(new Object[]{bazVar}, -1543034834, 1543034834, System.identityHashCode(bazVar))}, -641264387, 641264395, (int) System.currentTimeMillis()))), (avv) setY(new Object[]{bazVar}, -224879963, 224879965, (int) System.currentTimeMillis()), aeeVar);
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i84 = ~iCurrentTimeMillis2;
            int i85 = (-388054906) & i84;
            int i86 = (~i85) & ((-388054906) | i84);
            int i87 = ~((i85 & i86) | (i86 ^ i85));
            int i88 = 663444401 ^ iCurrentTimeMillis2;
            int i89 = 663444401 & iCurrentTimeMillis2;
            int i90 = ~((i88 & i89) | (i88 ^ i89));
            int i91 = i87 & i90;
            int i92 = (i87 | i90) & (~i91);
            int i93 = -(-(((i92 & i91) | (i92 ^ i91)) * 959));
            int i94 = ((379554475 ^ i93) | (379554475 & i93)) << 1;
            int i95 = -((i93 & (-379554476)) | (379554475 & (~i93)));
            int i96 = (i94 & i95) + (i95 | i94);
            int i97 = i96 ^ (-1517499898);
            int i98 = ((-1517499898) & i96) << 1;
            int i99 = ((i97 | i98) << 1) - (i98 ^ i97);
            int i100 = ((-388054906) & iCurrentTimeMillis2) | ((-388054906) ^ iCurrentTimeMillis2);
            int i101 = ~i100;
            int i102 = (i100 | i101) & i101;
            int i103 = (iCurrentTimeMillis2 | i84) & i84;
            int i104 = ((-663444402) & i103) | ((~i103) & 663444401);
            int i105 = i103 & 663444401;
            int i106 = ~((i105 & i104) | (i104 ^ i105));
            int i107 = i102 & i106;
            int i108 = (i106 | i102) & (~i107);
            int i109 = ((i108 & i107) | (i108 ^ i107)) * 959;
            int i110 = ((i99 | i109) << 1) - (i109 ^ i99);
            int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
            int i111 = ~iCurrentTimeMillis3;
            int i112 = 1932921544 & i111;
            int i113 = (iCurrentTimeMillis3 & (-1932921545)) | i112;
            int i114 = 1932921544 & iCurrentTimeMillis3;
            int i115 = ~((i113 & i114) | (i113 ^ i114));
            int i116 = ((-1662255809) & i115) | ((~i115) & 1662255808);
            int i117 = i115 & 1662255808;
            int i118 = -(~(-(-(((i117 & i116) | (i116 ^ i117)) * (-502)))));
            int i119 = (i111 & (-1932921545)) | ((~i111) & 1932921544);
            int i120 = (i119 & i112) | (i119 ^ i112);
            int i121 = (((((-38561002) & i118) + (i118 | (-38561002))) - 1) - (~((~((i120 & 271218735) | (i120 ^ 271218735))) * (-502)))) - 1;
            int i122 = (-271218736) ^ iCurrentTimeMillis3;
            int i123 = iCurrentTimeMillis3 & (-271218736);
            int i124 = ~((i123 & i122) | (i122 ^ i123));
            if (i110 <= (i121 - (~(((i124 & 1932921544) | (1932921544 ^ i124)) * 502))) - 1) {
                int i125 = 74 / 0;
            }
            return ahwVar9;
        }
        if (amwVar instanceof bdr) {
            bdr bdrVar = (bdr) amwVar;
            ahw ahwVar10 = new ahw(new aiw(avq.setOnFocusChangeListener), new avp(((Integer) bdr.setX(new Object[]{bdrVar}, 680320946, -680320943, System.identityHashCode(bdrVar))).intValue(), ((Integer) bdr.setX(new Object[]{bdrVar}, 964740926, -964740926, System.identityHashCode(bdrVar))).intValue(), (bdt) bdr.setX(new Object[]{bdrVar}, 1067166877, -1067166875, System.identityHashCode(bdrVar)), (bdz) bdr.setX(new Object[]{bdrVar}, 71521224, -71521220, System.identityHashCode(bdrVar)), (bdx) bdr.setX(new Object[]{bdrVar}, 35400633, -35400632, System.identityHashCode(bdrVar)), (aiw) x2.k(new Object[]{(String) bdn.setY(new Object[]{bdrVar}, -11270140, 11270140, System.identityHashCode(bdrVar))}, -548307951, 548307965, (int) System.currentTimeMillis())));
            int i126 = f54283a + 31;
            f54284b = i126 % 128;
            int i127 = i126 % 2;
            return ahwVar10;
        }
        if (amwVar instanceof axn) {
            axn axnVar = (axn) amwVar;
            ahw ahwVar11 = new ahw(new aiw((adu) x2.k(new Object[]{(axi) axg.setDividerPadding(new Object[]{axnVar}, -1434115185, 1434115185, System.identityHashCode(axnVar))}, 1696989310, -1696989277, (int) System.currentTimeMillis())), new aft((byte[]) axn.setY(new Object[]{axnVar}, 2136256723, -2136256723, System.identityHashCode(axnVar))), aeeVar);
            int i128 = f54283a;
            int i129 = (i128 & (-80)) | ((~i128) & 79);
            int i130 = -(-((i128 & 79) << 1));
            int i131 = ((i129 | i130) << 1) - (i130 ^ i129);
            f54284b = i131 % 128;
            int i132 = i131 % 2;
            return ahwVar11;
        }
        if (amwVar instanceof azm) {
            azm azmVar = (azm) amwVar;
            ahw ahwVar12 = new ahw(new aiw((adu) x2.k(new Object[]{(azk) azl.setY(new Object[]{azmVar}, -1124566291, 1124566291, System.identityHashCode(azmVar))}, -831223162, 831223171, (int) System.currentTimeMillis())), new aft((byte[]) azm.setCompoundDrawableTintBlendMode(new Object[]{azmVar}, -1945720051, 1945720051, System.identityHashCode(azmVar))), aeeVar);
            int i133 = f54284b + 81;
            f54283a = i133 % 128;
            if (i133 % 2 == 0) {
                return ahwVar12;
            }
            throw null;
        }
        if (amwVar instanceof aym) {
            aym aymVar = (aym) amwVar;
            return new ahw(new aiw((adu) x2.k(new Object[]{(ayk) ayl.setY(new Object[]{aymVar}, -1691811461, 1691811461, System.identityHashCode(aymVar))}, 975685469, -975685445, (int) System.currentTimeMillis())), new aft((byte[]) aym.setX(new Object[]{aymVar}, 204982284, -204982283, System.identityHashCode(aymVar))), aeeVar);
        }
        if (amwVar instanceof axb) {
            axb axbVar = (axb) amwVar;
            ahw ahwVar13 = new ahw(new aiw((adu) x2.k(new Object[]{(axd) axc.setY(new Object[]{axbVar}, -1152451803, 1152451803, System.identityHashCode(axbVar))}, 1911286735, -1911286717, (int) System.currentTimeMillis())), new avg(axbVar.setCompoundDrawableTintBlendMode(), axbVar.setOnFocusChangeListener(), axbVar.setOnLongClickListener(), new avo(axbVar.setDividerPadding())), aeeVar);
            int i134 = f54284b;
            int i135 = (((i134 | 83) << 1) - (~(-(i134 ^ 83)))) - 1;
            f54283a = i135 % 128;
            int i136 = i135 % 2;
            return ahwVar13;
        }
        if (amwVar instanceof awz) {
            awz awzVar = (awz) amwVar;
            ahw ahwVar14 = new ahw(new aiw((adu) x2.k(new Object[]{awzVar.setY()}, -1510973090, 1510973116, (int) System.currentTimeMillis())), new avm(awzVar.getNavBarTitleString(), awzVar.setOnFocusChangeListener(), awzVar.setDividerPadding(), new avn(awzVar.setOnLongClickListener(), awzVar.setCompoundDrawableTintBlendMode())), aeeVar);
            int i137 = f54284b;
            int i138 = i137 & 77;
            int i139 = (i138 - (~(-(-((i137 ^ 77) | i138))))) - 1;
            f54283a = i139 % 128;
            int i140 = i139 % 2;
            return ahwVar14;
        }
        if (amwVar instanceof ayp) {
            ayp aypVar = (ayp) amwVar;
            adh adhVar = new adh();
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(aypVar.setOnFocusChangeListener())}, 240298319, -240298315, System.identityHashCode(adhVar));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(aypVar.setDividerPadding())}, 240298319, -240298315, System.identityHashCode(adhVar));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(aypVar.setCompoundDrawableTintBlendMode())}, 240298319, -240298315, System.identityHashCode(adhVar));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(aypVar.setOnLongClickListener())}, 240298319, -240298315, System.identityHashCode(adhVar));
            ahw ahwVar15 = new ahw(new aiw((adu) x2.k(new Object[]{(ayn) ayj.setCompoundDrawableTintBlendMode(new Object[]{aypVar}, 1993333691, -1993333691, System.identityHashCode(aypVar))}, -206554024, 206554025, (int) System.currentTimeMillis())), new afv(adhVar), aeeVar);
            int i141 = f54284b;
            int i142 = (i141 ^ 65) + ((i141 & 65) << 1);
            f54283a = i142 % 128;
            if (i142 % 2 == 0) {
                return ahwVar15;
            }
            throw null;
        }
        if (amwVar instanceof ayw) {
            ayw aywVar = (ayw) amwVar;
            adh adhVar2 = new adh();
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, new aft((byte[]) ayw.setCompoundDrawableTintBlendMode(new Object[]{aywVar}, -1881081668, 1881081668, System.identityHashCode(aywVar)))}, 240298319, -240298315, System.identityHashCode(adhVar2));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, new aft((byte[]) ayw.setCompoundDrawableTintBlendMode(new Object[]{aywVar}, -921823355, 921823356, System.identityHashCode(aywVar)))}, 240298319, -240298315, System.identityHashCode(adhVar2));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, new aft((byte[]) ayw.setCompoundDrawableTintBlendMode(new Object[]{aywVar}, 2019837567, -2019837563, System.identityHashCode(aywVar)))}, 240298319, -240298315, System.identityHashCode(adhVar2));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, new aft((byte[]) ayw.setCompoundDrawableTintBlendMode(new Object[]{aywVar}, 1881669751, -1881669749, System.identityHashCode(aywVar)))}, 240298319, -240298315, System.identityHashCode(adhVar2));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, new aft((byte[]) ayw.setCompoundDrawableTintBlendMode(new Object[]{aywVar}, 1788803735, -1788803732, System.identityHashCode(aywVar)))}, 240298319, -240298315, System.identityHashCode(adhVar2));
            return new ahw(new aiw((adu) x2.k(new Object[]{aywVar.setOnFocusChangeListener()}, -107474057, 107474057, (int) System.currentTimeMillis())), new afv(adhVar2), aeeVar);
        }
        if (amwVar instanceof awv) {
            awv awvVar = (awv) amwVar;
            adh adhVar3 = new adh();
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar3, new adp(0L)}, 240298319, -240298315, System.identityHashCode(adhVar3));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar3, new afk(awvVar.setY())}, 240298319, -240298315, System.identityHashCode(adhVar3));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar3, new afk(awvVar.setOnFocusChangeListener())}, 240298319, -240298315, System.identityHashCode(adhVar3));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar3, new afk(awvVar.setNavigationOnClickListener())}, 240298319, -240298315, System.identityHashCode(adhVar3));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar3, new afk(awvVar.getNavBarTitleString())}, 240298319, -240298315, System.identityHashCode(adhVar3));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar3, new afk(awvVar.setOnDragListener())}, 240298319, -240298315, System.identityHashCode(adhVar3));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar3, new afk(awvVar.setOnLongClickListener())}, 240298319, -240298315, System.identityHashCode(adhVar3));
            return new ahw(new aiw((adu) x2.k(new Object[]{(awu) awp.setY(new Object[]{awvVar}, 1056854071, -1056854071, System.identityHashCode(awvVar))}, 1801190979, -1801190973, (int) System.currentTimeMillis())), new afv(adhVar3), aeeVar, ((awy) awv.setCompoundDrawableTintBlendMode(new Object[]{awvVar}, 116775842, -116775841, System.identityHashCode(awvVar))).setY());
        }
        if (amwVar instanceof awb) {
            awb awbVar = (awb) amwVar;
            ahw ahwVar16 = new ahw(new aiw((adu) x2.k(new Object[]{(awa) awc.setY(new Object[]{awbVar}, -450809005, 450809005, System.identityHashCode(awbVar))}, -501873972, 501874000, (int) System.currentTimeMillis())), new aft((byte[]) awb.setCompoundDrawableTintBlendMode(new Object[]{awbVar}, -42266507, 42266507, System.identityHashCode(awbVar))), aeeVar);
            int i143 = f54283a;
            int i144 = i143 & 117;
            int i145 = (i144 - (~((i143 ^ 117) | i144))) - 1;
            f54284b = i145 % 128;
            int i146 = i145 % 2;
            return ahwVar16;
        }
        if (!(amwVar instanceof axs)) {
            if (!(amwVar instanceof azd)) {
                throw new IOException("key parameters not recognized");
            }
            azd azdVar = (azd) amwVar;
            return new ahw(new aiw((adu) x2.k(new Object[]{(aze) azg.setCompoundDrawableTintBlendMode(new Object[]{azdVar}, -740684830, 740684830, System.identityHashCode(azdVar))}, -298213798, 298213801, (int) System.currentTimeMillis())), new aft((byte[]) azd.setDividerPadding(new Object[]{azdVar}, -318319228, 318319229, System.identityHashCode(azdVar))), aeeVar);
        }
        axs axsVar = (axs) amwVar;
        ahw ahwVar17 = new ahw(new aiw((adu) x2.k(new Object[]{(axp) axm.setY(new Object[]{axsVar}, 2001032758, -2001032758, System.identityHashCode(axsVar))}, -1475313358, 1475313377, (int) System.currentTimeMillis())), new aft((byte[]) axs.setX(new Object[]{axsVar}, 1657399956, -1657399956, System.identityHashCode(axsVar))), aeeVar);
        int i147 = f54283a;
        int i148 = ((i147 & 40) + (i147 | 40)) - 1;
        f54284b = i148 % 128;
        int i149 = i148 % 2;
        return ahwVar17;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws IOException {
        avv avvVar;
        int i13 = ~i10;
        int i14 = ((~(i13 | i11)) * (-1182)) + (i11 * (-590)) + (i10 * 592);
        int i15 = ~i11;
        int i16 = ((i12 | i13 | i15) * 591) + (((~(i10 | i11)) | (~(i13 | i15 | (~i12)))) * (-591)) + i14;
        if (i16 == 1) {
            return a(objArr);
        }
        if (i16 == 2) {
            baz bazVar = (baz) objArr[0];
            int i17 = f54284b;
            int i18 = ((i17 & 83) - (~(-(-(i17 | 83))))) - 1;
            f54283a = i18 % 128;
            int i19 = i18 % 2;
            byte[] bArr = (byte[]) baz.setCompoundDrawableTintBlendMode(new Object[]{bazVar}, -93418388, 93418388, System.identityHashCode(bazVar));
            bax baxVar = (bax) baz.setCompoundDrawableTintBlendMode(new Object[]{bazVar}, 211369596, -211369595, System.identityHashCode(bazVar));
            int iIntValue = ((Integer) bax.setOnFocusChangeListener(new Object[]{baxVar}, -1645560145, 1645560148, System.identityHashCode(baxVar))).intValue();
            bax baxVar2 = (bax) baz.setCompoundDrawableTintBlendMode(new Object[]{bazVar}, 211369596, -211369595, System.identityHashCode(bazVar));
            int iIntValue2 = ((Integer) bax.setOnFocusChangeListener(new Object[]{baxVar2}, -1235800220, 1235800228, System.identityHashCode(baxVar2))).intValue();
            int i20 = ((-2) - ((iIntValue2 + 8) ^ (-1))) / 8;
            long jLongValue = (int) ((Long) bbi.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i20)}, 1947653658, -1947653646, i20)).longValue();
            if (!((Boolean) bbi.setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue2), Long.valueOf(jLongValue)}, -1829337202, 1829337218, iIntValue2)).booleanValue()) {
                throw new IllegalArgumentException("index out of bounds");
            }
            byte[] bArr2 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i20), Integer.valueOf(iIntValue)}, 427617211, -427617208, i20);
            int i21 = -(-iIntValue);
            int i22 = i20 ^ i21;
            int i23 = (i20 & i21) << 1;
            int i24 = (i22 & i23) + (i23 | i22);
            byte[] bArr3 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i24), Integer.valueOf(iIntValue)}, 427617211, -427617208, i24);
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i25 = iIntValue * (-559);
            int i26 = i24 * 561;
            int i27 = (i25 & i26) + (i25 | i26);
            int i28 = ~iCurrentTimeMillis;
            int i29 = i28 & iIntValue;
            int i30 = (~i29) & (i28 | iIntValue);
            int i31 = ~iIntValue;
            int i32 = -(~((~((i29 & i30) | (i30 ^ i29))) * (-560)));
            int i33 = (((i27 | i32) << 1) - (i32 ^ i27)) - 1;
            int i34 = ~i24;
            int i35 = i34 & (i34 | i24);
            int i36 = i35 & iIntValue;
            int i37 = ((i35 | iIntValue) & (~i36)) | i36;
            int i38 = (i37 & i28) | ((~i37) & iCurrentTimeMillis);
            int i39 = i37 & iCurrentTimeMillis;
            int i40 = -(~((~((i39 & i38) | (i38 ^ i39))) * (-560)));
            int i41 = ~((i31 ^ i24) | (i31 & i24));
            int i42 = (iCurrentTimeMillis | i28) & i28;
            int i43 = i42 ^ i24;
            int i44 = i42 & i24;
            int i45 = (i44 & i43) | (i43 ^ i44);
            int i46 = ~i45;
            int i47 = (i45 | i46) & i46;
            int i48 = (((-2) - (((i33 ^ i40) + ((i40 & i33) << 1)) ^ (-1))) - (~(-(-(((i47 & i41) | (((~i47) & i41) | ((~i41) & i47))) * 560))))) - 1;
            byte[] bArr4 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i48), Integer.valueOf(iIntValue)}, 427617211, -427617208, i48);
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i49 = iIntValue * (-103);
            int i50 = -(-(i48 * (-103)));
            int i51 = ((~i50) & i49) | ((~i49) & i50);
            int i52 = -(-((i49 & i50) << 1));
            int i53 = (i51 & i52) + (i52 | i51);
            int i54 = ~i48;
            int i55 = i31 ^ i54;
            int i56 = i31 & i54;
            int i57 = ~((i55 & i56) | (i55 ^ i56));
            int i58 = ~iCurrentTimeMillis2;
            int i59 = (i54 & i58) | ((~i54) & iCurrentTimeMillis2);
            int i60 = i54 & iCurrentTimeMillis2;
            int i61 = -(-(((~((i60 & i59) | (i59 ^ i60))) | i57) * 104));
            int i62 = ((i53 | i61) << 1) - (i61 ^ i53);
            int i63 = i58 & iIntValue;
            int i64 = (~i63) & (i58 | iIntValue);
            int i65 = (i63 & i64) | (i64 ^ i63);
            int i66 = i65 & i48;
            int i67 = (~(((i65 | i48) & (~i66)) | i66)) * (-104);
            int i68 = i62 & i67;
            int i69 = (i67 | i62) & (~i68);
            int i70 = -(-(i68 << 1));
            int i71 = ((i69 | i70) << 1) - (i69 ^ i70);
            int i72 = ((iCurrentTimeMillis2 & iIntValue) | (iIntValue ^ iCurrentTimeMillis2)) * 104;
            int i73 = ((~i72) & i71) | ((~i71) & i72);
            int i74 = -(-((i72 & i71) << 1));
            int i75 = (i73 & i74) + (i74 | i73);
            byte[] bArr5 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i75), Integer.valueOf(iIntValue)}, 427617211, -427617208, i75);
            int i76 = (i75 | iIntValue) << 1;
            int i77 = -((i75 & i31) | ((~i75) & iIntValue));
            int i78 = (i76 & i77) + (i76 | i77);
            int length = bArr.length;
            int i79 = -i78;
            int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
            int i80 = ((i79 * 567) - (~(-(~(length * (-565)))))) - 1;
            int i81 = (i80 ^ (-1)) + (i80 << 1);
            int i82 = ~i79;
            int i83 = ~length;
            int i84 = i82 & i83;
            int i85 = ~i82;
            int i86 = ~((length & i82) | (length & i85) | i84);
            int i87 = ~((i82 ^ iCurrentTimeMillis3) | (i82 & iCurrentTimeMillis3));
            int i88 = i86 & i87;
            int i89 = -(-((((i86 | i87) & (~i88)) | i88) * (-566)));
            int i90 = (i81 ^ i89) + ((i89 & i81) << 1);
            int i91 = ~i83;
            int i92 = (~((i79 & i83) | (i79 & i91) | i84)) * 566;
            int i93 = i90 | i92;
            int i94 = i93 << 1;
            int i95 = -((~(i92 & i90)) & i93);
            int i96 = ((i94 | i95) << 1) - (i95 ^ i94);
            int i97 = (i91 & i82) | (i83 & i85);
            int i98 = (i97 & i84) | (i97 ^ i84);
            int i99 = ((~iCurrentTimeMillis3) & i98) | ((~i98) & iCurrentTimeMillis3);
            int i100 = i98 & iCurrentTimeMillis3;
            int i101 = (~((i100 & i99) | (i99 ^ i100))) * 566;
            int i102 = i96 & i101;
            byte[] bArr6 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i78), Integer.valueOf((i102 - (~(-(-((i101 ^ i96) | i102))))) - 1)}, 427617211, -427617208, i78);
            try {
                bai baiVar = (bai) bbi.setOnFocusChangeListener(new Object[]{bArr6, bai.class}, -145577911, 145577915, (int) System.currentTimeMillis());
                int i103 = f54284b;
                int i104 = ((i103 & 124) + (i103 | 124)) - 1;
                int i105 = i104 % 128;
                f54283a = i105;
                int i106 = i104 % 2;
                int i107 = i105 + 79;
                f54284b = i107 % 128;
                if (i107 % 2 != 0 ? ((Long) bai.setOnFocusChangeListener(new Object[]{baiVar}, -1728564895, 1728564895, System.identityHashCode(baiVar))).longValue() == (1 << iIntValue2) - 1 : ((Long) bai.setOnFocusChangeListener(new Object[]{baiVar}, -1728564895, 1728564895, System.identityHashCode(baiVar))).longValue() == 0 / 0) {
                    avvVar = new avv(jLongValue, bArr2, bArr3, bArr4, bArr5, bArr6);
                    int i108 = f54283a;
                    int i109 = ((i108 & (-112)) | ((~i108) & 111)) + ((i108 & 111) << 1);
                    f54284b = i109 % 128;
                    int i110 = i109 % 2;
                } else {
                    avvVar = new avv(jLongValue, bArr2, bArr3, bArr4, bArr5, bArr6, ((Long) bai.setOnFocusChangeListener(new Object[]{baiVar}, -1728564895, 1728564895, System.identityHashCode(baiVar))).longValue());
                    int i111 = f54284b;
                    int i112 = (i111 ^ 74) + ((i111 & 74) << 1);
                    int i113 = (i112 ^ (-1)) + (i112 << 1);
                    f54283a = i113 % 128;
                    int i114 = i113 % 2;
                }
                return avvVar;
            } catch (ClassNotFoundException e5) {
                StringBuilder sb2 = new StringBuilder("cannot parse BDSStateMap: ");
                sb2.append(e5.getMessage());
                throw new IOException(sb2.toString());
            }
        }
        bbc bbcVar = (bbc) objArr[0];
        int i115 = f54284b + 47;
        f54283a = i115 % 128;
        int i116 = i115 % 2;
        byte[] bArr7 = (byte[]) bbc.setX(new Object[]{bbcVar}, 143938088, -143938088, System.identityHashCode(bbcVar));
        bbb bbbVar = (bbb) bbc.setX(new Object[]{bbcVar}, 73833213, -73833211, System.identityHashCode(bbcVar));
        int iIntValue3 = ((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar}, 862961959, -862961952, System.identityHashCode(bbbVar))).intValue();
        bbb bbbVar2 = (bbb) bbc.setX(new Object[]{bbcVar}, 73833213, -73833211, System.identityHashCode(bbcVar));
        int iIntValue4 = ((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar2}, 1335966603, -1335966598, System.identityHashCode(bbbVar2))).intValue();
        int iLongValue = (int) ((Long) bbi.setOnFocusChangeListener(new Object[]{bArr7, 4}, 1947653658, -1947653646, 4)).longValue();
        if (!((Boolean) bbi.setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue4), Long.valueOf(iLongValue)}, -1829337202, 1829337218, iIntValue4)).booleanValue()) {
            throw new IllegalArgumentException("index out of bounds");
        }
        byte[] bArr8 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr7, 4, Integer.valueOf(iIntValue3)}, 427617211, -427617208, 4);
        int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
        int i117 = -(~(iIntValue3 * (-68)));
        int i118 = ((280 ^ i117) + ((i117 & 280) << 1)) - 1;
        int i119 = ~iIntValue3;
        int i120 = ~i119;
        int i121 = i119 & 4;
        int i122 = ((-5) & i120) | i121 | ((-5) & i119);
        int i123 = ~((i122 & iCurrentTimeMillis4) | (i122 ^ iCurrentTimeMillis4));
        int i124 = iIntValue3 & 4;
        int i125 = (~i124) & (iIntValue3 | 4);
        int i126 = (i125 ^ i124) | (i124 & i125) | iCurrentTimeMillis4;
        int i127 = ~i126;
        int i128 = (i126 | i127) & i127;
        int i129 = -(-(((i123 & i128) | (i123 ^ i128)) * 69));
        int i130 = i118 ^ i129;
        int i131 = ((i118 & i129) | i130) << 1;
        int i132 = -i130;
        int i133 = (i131 ^ i132) + ((i131 & i132) << 1);
        int i134 = ~(((-5) ^ iIntValue3) | ((-5) & iIntValue3));
        int i135 = (-5) ^ iCurrentTimeMillis4;
        int i136 = (-5) & iCurrentTimeMillis4;
        int i137 = ~((i136 & i135) | (i135 ^ i136));
        int i138 = ((~i137) & i134) | ((~i134) & i137);
        int i139 = i134 & i137;
        int i140 = (i139 & i138) | (i138 ^ i139);
        int i141 = iIntValue3 & iCurrentTimeMillis4;
        int i142 = (iCurrentTimeMillis4 | iIntValue3) & (~i141);
        int i143 = (i142 & i141) | (i142 ^ i141);
        int i144 = ~i143;
        int i145 = (i143 | i144) & i144;
        int i146 = i140 & i145;
        int i147 = (i145 | i140) & (~i146);
        int i148 = ((i147 & i146) | (i147 ^ i146)) * (-69);
        int i149 = i133 & i148;
        int i150 = (((i148 | i133) & (~i149)) - (~(-(-(i149 << 1))))) - 1;
        int i151 = (i119 ^ 4) | i121;
        int i152 = ~i151;
        int i153 = ((i151 | i152) & i152) * 69;
        int i154 = i150 & i153;
        int i155 = (i150 | i153) & (~i154);
        int i156 = i154 << 1;
        int i157 = (i155 & i156) + (i155 | i156);
        byte[] bArr9 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr7, Integer.valueOf(i157), Integer.valueOf(iIntValue3)}, 427617211, -427617208, i157);
        int iCurrentTimeMillis5 = (int) System.currentTimeMillis();
        int i158 = iIntValue3 * (-55);
        int i159 = -(-(i157 * (-55)));
        int i160 = (i158 ^ i159) + ((i158 & i159) << 1);
        int i161 = ~iCurrentTimeMillis5;
        int i162 = (iIntValue3 & i161) | (iCurrentTimeMillis5 & i119);
        int i163 = iIntValue3 & iCurrentTimeMillis5;
        int i164 = ~((i162 & i163) | (i162 ^ i163));
        int i165 = (~i164) & i157;
        int i166 = ~i157;
        int i167 = i165 | (i164 & i166);
        int i168 = i164 & i157;
        int i169 = ((i167 ^ i168) | (i168 & i167)) * 56;
        int i170 = (i160 & i169) + (i169 | i160);
        int i171 = (iIntValue3 & i166) | (i157 & i119);
        int i172 = iIntValue3 & i157;
        int i173 = -(-((~((i171 ^ i172) | (i171 & i172))) * (-56)));
        int i174 = ((i170 | i173) << 1) - (i173 ^ i170);
        int i175 = (iCurrentTimeMillis5 | i161) & i161;
        int i176 = ~((i175 & i157) | (i175 & i166) | ((~i175) & i157));
        int i177 = iIntValue3 & i176;
        int i178 = (i176 | iIntValue3) & (~i177);
        int i179 = ((i178 & i177) | (i178 ^ i177)) * 56;
        int i180 = i174 ^ i179;
        int i181 = (i179 & i174) << 1;
        int i182 = (i180 ^ i181) + ((i181 & i180) << 1);
        byte[] bArr10 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr7, Integer.valueOf(i182), Integer.valueOf(iIntValue3)}, 427617211, -427617208, i182);
        int iCurrentTimeMillis6 = (int) System.currentTimeMillis();
        int i183 = iIntValue3 * (-919);
        int i184 = -(-(i182 * (-919)));
        int i185 = i183 & i184;
        int i186 = i183 | i184;
        int i187 = (i185 ^ i186) + ((i186 & i185) << 1);
        int i188 = (i119 | iIntValue3) & i119;
        int i189 = ~i182;
        int i190 = (i188 & i189) | (i188 ^ i189);
        int i191 = ~iCurrentTimeMillis6;
        int i192 = ((~i190) & iCurrentTimeMillis6) | (i190 & i191);
        int i193 = i190 & iCurrentTimeMillis6;
        int i194 = ~((i193 & i192) | (i192 ^ i193));
        int i195 = (i189 | i182) & i189;
        int i196 = i195 & i191;
        int i197 = (~i196) & (i195 | i191);
        int i198 = (i197 & i196) | (i197 ^ i196);
        int i199 = (i198 & iIntValue3) | (i198 ^ iIntValue3);
        int i200 = ~i199;
        int i201 = (i199 | i200) & i200;
        int i202 = i194 & i201;
        int i203 = (i194 | i201) & (~i202);
        int i204 = ((i203 & i202) | (i203 ^ i202)) * 920;
        int i205 = (i187 | i204) << 1;
        int i206 = -(i204 ^ i187);
        int i207 = (i205 ^ i206) + ((i206 & i205) << 1);
        int i208 = i119 & i189;
        int i209 = (~i208) & (i119 | i189);
        int i210 = ~((i209 ^ i208) | (i209 & i208));
        int i211 = (i120 & i191) | ((~i191) & i119);
        int i212 = i119 & i191;
        int i213 = ~((i211 ^ i212) | (i211 & i212));
        int i214 = i210 & i213;
        int i215 = (((~i214) & (i213 | i210)) | i214) * 920;
        int i216 = i207 & i215;
        int i217 = i215 | i207;
        int i218 = (i216 & i217) + (i217 | i216);
        int i219 = i209 | i208 | i191;
        int i220 = ~i219;
        int i221 = (i219 | i220) & i220;
        int i222 = (i119 & i182) | (i119 ^ i182);
        int i223 = (i222 & i191) | ((~i222) & iCurrentTimeMillis6);
        int i224 = i222 & iCurrentTimeMillis6;
        int i225 = (i224 & i223) | (i223 ^ i224);
        int i226 = ~i225;
        int i227 = (i225 | i226) & i226;
        int i228 = ((~i227) & i221) | ((~i221) & i227);
        int i229 = i221 & i227;
        int i230 = (i229 & i228) | (i228 ^ i229);
        int i231 = i189 & iIntValue3;
        int i232 = (~i231) & (i189 | iIntValue3);
        int i233 = (i231 & i232) | (i232 ^ i231);
        int i234 = i233 & iCurrentTimeMillis6;
        int i235 = ~(((iCurrentTimeMillis6 | i233) & (~i234)) | i234);
        int i236 = i230 ^ i235;
        int i237 = i230 & i235;
        int i238 = ((i237 & i236) | (i236 ^ i237)) * 920;
        int i239 = i218 | i238;
        int i240 = (i239 << 1) - ((~(i238 & i218)) & i239);
        byte[] bArr11 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr7, Integer.valueOf(i240), Integer.valueOf(iIntValue3)}, 427617211, -427617208, i240);
        int i241 = -(-iIntValue3);
        int i242 = ((~i241) & i240) | ((~i240) & i241);
        int i243 = (i241 & i240) << 1;
        int i244 = (i242 & i243) + (i243 | i242);
        int length2 = bArr7.length;
        int i245 = -i244;
        int iCurrentTimeMillis7 = (int) System.currentTimeMillis();
        int i246 = i245 * 450;
        int i247 = -(~(-(-(length2 * (-448)))));
        int i248 = ((i246 & i247) + (i246 | i247)) - 1;
        int i249 = ~i245;
        int i250 = ~length2;
        int i251 = i249 & i250;
        int i252 = ((~i249) & length2) | i251;
        int i253 = i249 & length2;
        int i254 = ~((i252 & i253) | (i252 ^ i253));
        int i255 = i251 | ((~i250) & i245);
        int i256 = i250 & i245;
        int i257 = (i255 & i256) | (i255 ^ i256);
        int i258 = ~iCurrentTimeMillis7;
        int i259 = (i257 & i258) | ((~i257) & iCurrentTimeMillis7);
        int i260 = iCurrentTimeMillis7 & i257;
        int i261 = (i260 & i259) | (i259 ^ i260);
        int i262 = ~i261;
        int i263 = (i261 | i262) & i262;
        int i264 = ((~i263) & i254) | ((~i254) & i263);
        int i265 = i263 & i254;
        int i266 = -(-(((i265 & i264) | (i264 ^ i265)) * 449));
        int i267 = ((i248 | i266) << 1) - (i266 ^ i248);
        int i268 = (~i253) & (i249 | length2);
        int i269 = -(-((~((i268 & i253) | (i268 ^ i253))) * (-1347)));
        int i270 = i267 ^ i269;
        int i271 = (i269 & i267) << 1;
        int i272 = (i270 ^ i271) + ((i271 & i270) << 1);
        int i273 = i249 ^ length2;
        int i274 = ~((i273 & i253) | (i273 ^ i253));
        int i275 = ((length2 | i250) & i250) | i258;
        int i276 = i275 & i245;
        int i277 = ((i275 | i245) & (~i276)) | i276;
        int i278 = ~i277;
        int i279 = (i277 | i278) & i278;
        int i280 = ((~i279) & i274) | ((~i274) & i279);
        int i281 = i279 & i274;
        byte[] bArr12 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr7, Integer.valueOf(i244), Integer.valueOf((-2) - (((i272 - (~(-(~(((i281 & i280) | (i280 ^ i281)) * 449))))) - 1) ^ (-1)))}, 427617211, -427617208, i244);
        try {
            bae baeVar = (bae) bbi.setOnFocusChangeListener(new Object[]{bArr12, bae.class}, -145577911, 145577915, (int) System.currentTimeMillis());
            int i282 = f54284b;
            int i283 = (-2) - ((((i282 | 102) << 1) - (i282 ^ 102)) ^ (-1));
            f54283a = i283 % 128;
            int i284 = i283 % 2;
            int iIntValue5 = ((Integer) bae.setCompoundDrawableTintBlendMode(new Object[]{baeVar}, 1914682748, -1914682741, System.identityHashCode(baeVar))).intValue();
            int i285 = 1 << iIntValue4;
            int iCurrentTimeMillis8 = (int) System.currentTimeMillis();
            int i286 = -(-(i285 * 192));
            int i287 = 381 & i286;
            int i288 = -(-((i286 ^ 381) | i287));
            int i289 = ((i287 | i288) << 1) - (i288 ^ i287);
            int i290 = (i289 << 1) - i289;
            int i291 = (i285 ^ iCurrentTimeMillis8) | (i285 & iCurrentTimeMillis8);
            int i292 = ~i291;
            int i293 = (i291 | i292) & i292;
            int i294 = ~i293;
            int i295 = ((i293 & i294) | (i294 ^ i293)) * Opcodes.ATHROW;
            int i296 = ((i290 | i295) << 1) - (i290 ^ i295);
            int i297 = ~i285;
            int i298 = ~iCurrentTimeMillis8;
            int i299 = i298 & i285;
            int i300 = (i285 | i298) & (~i299);
            int i301 = ~((i300 & i299) | (i300 ^ i299));
            if (iIntValue5 != (((i301 & i297) | (i297 ^ i301)) * Opcodes.ATHROW) + i296) {
                avw avwVar = new avw(iLongValue, bArr8, bArr9, bArr10, bArr11, bArr12, ((Integer) bae.setCompoundDrawableTintBlendMode(new Object[]{baeVar}, 1914682748, -1914682741, System.identityHashCode(baeVar))).intValue());
                int i302 = f54284b;
                int i303 = (i302 ^ 62) + ((i302 & 62) << 1);
                int i304 = (i303 ^ (-1)) + (i303 << 1);
                f54283a = i304 % 128;
                if (i304 % 2 == 0) {
                    return avwVar;
                }
                throw null;
            }
            avw avwVar2 = new avw(iLongValue, bArr8, bArr9, bArr10, bArr11, bArr12);
            int i305 = f54284b;
            int i306 = i305 & 39;
            int i307 = (i305 ^ 39) | i306;
            int i308 = ((i306 | i307) << 1) - (i307 ^ i306);
            f54283a = i308 % 128;
            int i309 = i308 % 2;
            return avwVar2;
        } catch (ClassNotFoundException e7) {
            StringBuilder sb3 = new StringBuilder("cannot parse BDS: ");
            sb3.append(e7.getMessage());
            throw new IOException(sb3.toString());
        }
    }

    public static ahw setY(amw amwVar, aee aeeVar) throws IOException {
        return (ahw) setY(new Object[]{amwVar, aeeVar}, 491760219, -491760218, (int) System.currentTimeMillis());
    }
}
