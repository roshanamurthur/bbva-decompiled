package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class o0 extends q0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f57378f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f57379g = 1;

    public static /* synthetic */ void e(Object[] objArr) throws IOException {
        o0 o0Var = (o0) objArr[0];
        ady adyVar = (ady) objArr[1];
        int i10 = f57378f;
        int i11 = (i10 ^ 85) + ((i10 & 85) << 1);
        f57379g = i11 % 128;
        int i12 = i11 % 2;
        adyVar.e().c(o0Var, true);
        int i13 = f57379g;
        int i14 = i13 & 113;
        int i15 = ((i13 ^ 113) | i14) << 1;
        int i16 = -((i13 | 113) & (~i14));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        f57378f = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 2 / 0;
        }
    }

    public static /* synthetic */ o0 o(Object[] objArr, int i10, int i11, int i12) throws IOException {
        int i13 = ~i11;
        int i14 = ((i10 | i13) * 983) + (i11 * 984) + (i10 * (-1965));
        int i15 = ~i10;
        int i16 = ~i12;
        int i17 = (((~(i15 | i11)) | (~(i16 | i15))) * 983) + (((~(i13 | i16)) | i15) * (-983)) + i14;
        if (i17 == 1) {
            e(objArr);
            return null;
        }
        int i18 = 0;
        if (i17 != 2) {
            if (i17 != 3) {
                o0 o0Var = (o0) objArr[0];
                int i19 = f57378f;
                int i20 = ((i19 ^ 95) - (~((i19 & 95) << 1))) - 1;
                int i21 = i20 % 128;
                f57379g = i21;
                int i22 = i20 % 2;
                int i23 = ((i21 & (-66)) | ((~i21) & 65)) + ((i21 & 65) << 1);
                f57378f = i23 % 128;
                int i24 = i23 % 2;
                return o0Var;
            }
            o0 o0Var2 = (o0) objArr[0];
            add[] addVarArr = (add[]) objArr[1];
            int i25 = f57379g;
            int i26 = i25 & 25;
            int i27 = (i25 | 25) & (~i26);
            int i28 = -(-(i26 << 1));
            int i29 = (i27 & i28) + (i27 | i28);
            f57378f = i29 % 128;
            int i30 = i29 % 2;
            int length = addVarArr.length;
            while (i18 < length) {
                int i31 = f57379g;
                int i32 = i31 & 105;
                int i33 = -(-(i31 | 105));
                int i34 = (i32 & i33) + (i33 | i32);
                f57378f = i34 % 128;
                int i35 = i34 % 2;
                addVarArr[i18].UiMessageCallbackKtWhenMappings().e().c(o0Var2, true);
                i18++;
                System.identityHashCode(o0Var2);
                System.identityHashCode(o0Var2);
            }
            int i36 = f57378f;
            int i37 = i36 | 21;
            int i38 = (i37 << 1) - ((~(i36 & 21)) & i37);
            f57379g = i38 % 128;
            int i39 = i38 % 2;
            return null;
        }
        o0 o0Var3 = (o0) objArr[0];
        ady[] adyVarArr = (ady[]) objArr[1];
        int iIdentityHashCode = System.identityHashCode(o0Var3);
        int i40 = ~iIdentityHashCode;
        int i41 = ((-1537794569) & i40) | ((~i40) & 1537794568);
        int i42 = i40 & 1537794568;
        int i43 = ((~((i41 & i42) | (i41 ^ i42))) | (-1609098222)) * (-712);
        int i44 = ((~i43) & 1868340202) | ((-1868340203) & i43);
        int i45 = (i43 & 1868340202) << 1;
        int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
        int i47 = 518013421 & i40;
        int i48 = (~i47) & (518013421 | i40);
        int i49 = (i47 & i48) | (i48 ^ i47);
        int i50 = i49 & 1537794568;
        int i51 = (i49 | 1537794568) & (~i50);
        int i52 = ~((i51 & i50) | (i51 ^ i50));
        int i53 = (-71303654) ^ iIdentityHashCode;
        int i54 = iIdentityHashCode & (-71303654);
        int i55 = (i54 & i53) | (i53 ^ i54);
        int i56 = ~i55;
        int i57 = (i55 | i56) & i56;
        int i58 = ((~i57) & i52) | ((~i52) & i57);
        int i59 = i57 & i52;
        int i60 = -(-(((i59 & i58) | (i58 ^ i59)) * (-712)));
        int i61 = i46 & i60;
        int i62 = -(-((i60 ^ i46) | i61));
        int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
        int i64 = (~i42) & (i40 | 1537794568);
        int i65 = ~((i64 & i42) | (i64 ^ i42));
        int i66 = 518013421 & i65;
        int i67 = (((i65 | 518013421) & (~i66)) | i66) * 712;
        int i68 = i63 & i67;
        int i69 = i67 | i63;
        int i70 = (i68 & i69) + (i69 | i68);
        int iIdentityHashCode2 = System.identityHashCode(o0Var3);
        int i71 = ~iIdentityHashCode2;
        int i72 = (i71 | iIdentityHashCode2) & i71;
        int i73 = ((~i72) & (-1146487718)) | (i72 & 1146487717);
        int i74 = i72 & (-1146487718);
        int i75 = ~((i74 & i73) | (i73 ^ i74));
        int i76 = (-1526704092) & i75;
        int i77 = (i75 | (-1526704092)) & (~i76);
        int i78 = (i77 & i76) | (i77 ^ i76);
        int i79 = ~((1146487717 ^ iIdentityHashCode2) | (1146487717 & iIdentityHashCode2));
        int i80 = i78 ^ i79;
        int i81 = i78 & i79;
        int i82 = (-1315445625) - (~(((i81 & i80) | (i80 ^ i81)) * (-564)));
        int i83 = (-447325275) & iIdentityHashCode2;
        int i84 = (iIdentityHashCode2 | (-447325275)) & (~i83);
        int i85 = (~((i84 & i83) | (i84 ^ i83))) * 1128;
        int i86 = i82 & i85;
        int i87 = (((i85 | i82) & (~i86)) - (~(-(-(i86 << 1))))) - 1;
        int i88 = (-1526704092) & i71;
        int i89 = (i71 | (-1526704092)) & (~i88);
        int i90 = ~((i89 & i88) | (i89 ^ i88));
        int i91 = i90 & (-1593812992);
        int i92 = (i90 | (-1593812992)) & (~i91);
        int i93 = -(-(((i92 & i91) | (i92 ^ i91)) * 564));
        int i94 = ((~i93) & i87) | ((~i87) & i93);
        int i95 = -(-((i87 & i93) << 1));
        int i96 = (i94 ^ i95) + ((i95 & i94) << 1);
        int length2 = adyVarArr.length;
        int i97 = f57379g + 109;
        f57378f = i97 % 128;
        int i98 = i97 % 2;
        int i99 = 0;
        while (i99 < length2) {
            int i100 = f57378f;
            int i101 = (i100 ^ 5) + ((i100 & 5) << 1);
            f57379g = i101 % 128;
            if (i101 % 2 == 0) {
                adyVarArr[i99].e().c(o0Var3, false);
                i99 += 45;
            } else {
                adyVarArr[i99].e().c(o0Var3, true);
                int i102 = ((i99 ^ 1) | (i99 & 1)) << 1;
                int i103 = -(((~i99) & 1) | (i99 & (-2)));
                i99 = (i102 & i103) + (i103 | i102);
            }
        }
        System.identityHashCode(o0Var3);
        System.identityHashCode(o0Var3);
        return null;
    }

    @Override // com.mypinpad.tsdk.isolation.q0, com.mypinpad.tsdk.isolation.aeb
    public final void d(ady[] adyVarArr) throws IOException {
        o(new Object[]{this, adyVarArr}, -850931809, 850931811, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.q0, com.mypinpad.tsdk.isolation.aeb
    public final void i(add[] addVarArr) throws IOException {
        o(new Object[]{this, addVarArr}, 1732408599, -1732408596, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aeb
    public final o0 l() {
        return o(new Object[]{this}, -940541136, 940541136, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.q0, com.mypinpad.tsdk.isolation.aeb
    public final void m(ady adyVar) throws IOException {
        o(new Object[]{this, adyVar}, 1759826433, -1759826432, System.identityHashCode(this));
    }
}
