package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: loaded from: classes10.dex */
public final class aje extends adw {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52867t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52868u0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Hashtable f52869r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Vector f52870s0;

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        aje ajeVar;
        int i13;
        int i14;
        int i15 = ~i11;
        int i16 = (((~((~i10) | i12)) | i15) * (-318)) + (i11 * (-317)) + (i10 * 319);
        int i17 = ~(i15 | i12);
        int i18 = ~i12;
        int i19 = (((~(i10 | i11 | i12)) | (~(i15 | i18 | i10))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + ((i17 | (~(i18 | i10 | i11))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + i16;
        if (i19 == 1) {
            aje ajeVar2 = (aje) objArr[0];
            adu aduVar = (adu) objArr[1];
            int i20 = f52868u0;
            int i21 = i20 & 9;
            int i22 = (i20 | 9) & (~i21);
            int i23 = -(-(i21 << 1));
            int i24 = (i22 & i23) + (i22 | i23);
            f52867t0 = i24 % 128;
            int i25 = i24 % 2;
            Object obj = ajeVar2.f52869r0.get(aduVar);
            if (i25 == 0) {
                return (ajc) obj;
            }
            throw null;
        }
        if (i19 == 2) {
            aje ajeVar3 = (aje) objArr[0];
            int i26 = f52867t0;
            int i27 = i26 & 69;
            int i28 = (i27 - (~((i26 ^ 69) | i27))) - 1;
            f52868u0 = i28 % 128;
            int i29 = i28 % 2;
            Vector vector = ajeVar3.f52870s0;
            if (i29 == 0) {
                vector.elements();
                throw null;
            }
            Enumeration enumerationElements = vector.elements();
            int i30 = f52868u0;
            int i31 = i30 & 105;
            int i32 = i31 + ((i30 ^ 105) | i31);
            f52867t0 = i32 % 128;
            int i33 = i32 % 2;
            return enumerationElements;
        }
        if (i19 == 3) {
            aje ajeVar4 = (aje) objArr[0];
            adh adhVar = new adh(ajeVar4.f52870s0.size());
            Enumeration enumerationElements2 = ajeVar4.f52870s0.elements();
            int i34 = f52867t0;
            int i35 = ((i34 | 69) << 1) - (i34 ^ 69);
            f52868u0 = i35 % 128;
            int i36 = i35 % 2;
            while (enumerationElements2.hasMoreElements()) {
                int i37 = f52868u0;
                int i38 = (i37 & (-56)) | ((~i37) & 55);
                int i39 = -(-((i37 & 55) << 1));
                int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                f52867t0 = i40 % 128;
                int i41 = i40 % 2;
                Hashtable hashtable = ajeVar4.f52869r0;
                if (i41 != 0) {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, (ajc) hashtable.get((adu) enumerationElements2.nextElement())}, 240298319, -240298315, System.identityHashCode(adhVar));
                    int i42 = 40 / 0;
                } else {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, (ajc) hashtable.get((adu) enumerationElements2.nextElement())}, 240298319, -240298315, System.identityHashCode(adhVar));
                }
            }
            afv afvVar = new afv(adhVar);
            int i43 = f52867t0;
            int i44 = (i43 & (-80)) | ((~i43) & 79);
            int i45 = -(-((i43 & 79) << 1));
            int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
            f52868u0 = i46 % 128;
            if (i46 % 2 != 0) {
                return afvVar;
            }
            int i47 = 30 / 0;
            return afvVar;
        }
        Object obj2 = objArr[0];
        int i48 = f52868u0 + 121;
        int i49 = i48 % 128;
        f52867t0 = i49;
        if (i48 % 2 != 0) {
            boolean z10 = obj2 instanceof aje;
            throw null;
        }
        if (obj2 instanceof aje) {
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i50 = ~iCurrentTimeMillis;
            int i51 = ((326103064 & i50) | (iCurrentTimeMillis & (-326103065)) | (326103064 & iCurrentTimeMillis)) * (-859);
            int i52 = (-1980009928) & i51;
            int i53 = -(-((i51 ^ (-1980009928)) | i52));
            int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
            int i55 = (i50 | iCurrentTimeMillis) & i50;
            int i56 = ((-326103065) & i55) | ((~i55) & 326103064);
            int i57 = 326103064 & i55;
            int i58 = (i57 & i56) | (i56 ^ i57);
            int i59 = ~i58;
            int i60 = (i58 | i59) & i59;
            int i61 = ((-40611841) & i50) | (40611840 & iCurrentTimeMillis);
            int i62 = iCurrentTimeMillis & (-40611841);
            int i63 = (i62 & i61) | (i61 ^ i62);
            int i64 = ~i63;
            int i65 = (i63 | i64) & i64;
            int i66 = ((~i65) & i60) | ((~i60) & i65);
            int i67 = i65 & i60;
            int i68 = -(-(((i67 & i66) | (i66 ^ i67)) * 859));
            int i69 = ((~i68) & i54) | ((~i54) & i68);
            int i70 = -(-((i68 & i54) << 1));
            int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
            int i72 = ~((286541179 & i50) | (286541179 ^ i50));
            int i73 = i72 & (-327153020);
            int i74 = (i72 | (-327153020)) & (~i73);
            int i75 = -(-(((i74 & i73) | (i74 ^ i73)) * 859));
            int i76 = ((i71 ^ i75) | (i71 & i75)) << 1;
            int i77 = -((i75 & (~i71)) | ((~i75) & i71));
            int i78 = (i76 & i77) + (i77 | i76);
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i79 = (-258666487) & iCurrentTimeMillis2;
            int i80 = (~(i79 | ((~i79) & ((-258666487) | iCurrentTimeMillis2)))) * TypedValues.CycleType.TYPE_EASING;
            int i81 = ((1753579043 ^ i80) + ((i80 & 1753579043) << 1)) - 1780023172;
            int i82 = ~iCurrentTimeMillis2;
            int i83 = i82 & (-258666487);
            int i84 = ~(((i82 | (-258666487)) & (~i83)) | i83);
            int i85 = ((~i84) & 1083506696) | ((-1083506697) & i84);
            int i86 = i84 & 1083506696;
            int i87 = -(-(((i86 & i85) | (i85 ^ i86)) * TypedValues.CycleType.TYPE_EASING));
            int i88 = ((i81 ^ i87) | (i81 & i87)) << 1;
            int i89 = -((i87 & (~i81)) | ((~i87) & i81));
            if (i78 > (i88 & i89) + (i89 | i88)) {
                throw null;
            }
            ajeVar = (aje) obj2;
            int i90 = f52867t0;
            int i91 = ((i90 ^ 11) | (i90 & 11)) << 1;
            int i92 = -(((~i90) & 11) | (i90 & (-12)));
            i13 = i91 & i92;
            i14 = i92 | i91;
        } else {
            if (obj2 == null) {
                int i93 = (((i49 | 116) << 1) - (i49 ^ 116)) - 1;
                f52868u0 = i93 % 128;
                if (i93 % 2 != 0) {
                    return null;
                }
                int i94 = 50 / 0;
                return null;
            }
            aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj2);
            ajeVar = new aje();
            ajeVar.f52869r0 = new Hashtable();
            ajeVar.f52870s0 = new Vector();
            Enumeration dividerPadding = compoundDrawableTintBlendMode.setDividerPadding();
            while (dividerPadding.hasMoreElements()) {
                ajc ajcVar = (ajc) ajc.setX(new Object[]{dividerPadding.nextElement()}, -1028322806, 1028322811, (int) System.currentTimeMillis());
                Hashtable hashtable2 = ajeVar.f52869r0;
                if (hashtable2.containsKey((adu) ajc.setX(new Object[]{ajcVar}, 1269530012, -1269530006, System.identityHashCode(ajcVar)))) {
                    StringBuilder sb2 = new StringBuilder("repeated extension found: ");
                    sb2.append(ajcVar.setX());
                    throw new IllegalArgumentException(sb2.toString());
                }
                hashtable2.put((adu) ajc.setX(new Object[]{ajcVar}, 1269530012, -1269530006, System.identityHashCode(ajcVar)), ajcVar);
                ajeVar.f52870s0.addElement((adu) ajc.setX(new Object[]{ajcVar}, 1269530012, -1269530006, System.identityHashCode(ajcVar)));
            }
            int i95 = f52867t0;
            int i96 = i95 & 71;
            int i97 = ((i95 ^ 71) | i96) << 1;
            int i98 = -((i95 | 71) & (~i96));
            i13 = i97 ^ i98;
            i14 = (i98 & i97) << 1;
        }
        int i99 = i13 + i14;
        f52868u0 = i99 % 128;
        int i100 = i99 % 2;
        return ajeVar;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setY(new Object[]{this}, -1037969230, 1037969233, System.identityHashCode(this));
    }

    public final Enumeration setCompoundDrawableTintBlendMode() {
        return (Enumeration) setY(new Object[]{this}, -851154266, 851154268, System.identityHashCode(this));
    }

    public final ajc setX(adu aduVar) {
        return (ajc) setY(new Object[]{this, aduVar}, -814074534, 814074535, System.identityHashCode(this));
    }

    public static aje setY(Object obj) {
        return (aje) setY(new Object[]{obj}, -779582673, 779582673, (int) System.currentTimeMillis());
    }
}
