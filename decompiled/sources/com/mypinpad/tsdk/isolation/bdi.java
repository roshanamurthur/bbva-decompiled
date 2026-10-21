package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes10.dex */
public final class bdi implements PublicKey {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54560r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54561s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient bba f54562p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient adu f54563q0;

    public bdi(ajj ajjVar) throws IOException {
        setY(new Object[]{this, ajjVar}, -871068798, 871068802, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = f54560r0;
        int i11 = ((i10 | 29) << 1) - (i10 ^ 29);
        f54561s0 = i11 % 128;
        int i12 = i11 % 2;
        objectInputStream.defaultReadObject();
        setY(new Object[]{this, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{(byte[]) objectInputStream.readObject()}, 909154525, -909154522, (int) System.currentTimeMillis())}, -871068798, 871068802, System.identityHashCode(this));
        int i13 = f54561s0;
        int i14 = i13 ^ 99;
        int i15 = (((i13 & 99) | i14) << 1) - i14;
        f54560r0 = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13 = ~i11;
        int i14 = ~(i13 | i10);
        int i15 = ~i12;
        int i16 = (((~(i10 | i11 | i12)) | (~((~i10) | i13)) | (~(i13 | i15))) * 676) + ((i14 | (~(i15 | i10))) * 676) + ((i10 | i12 | i13) * (-676)) + (i11 * (-675)) + (i10 * 677);
        if (i16 == 1) {
            int i17 = f54560r0;
            int i18 = ((i17 | 69) << 1) - (i17 ^ 69);
            int i19 = i18 % 128;
            f54561s0 = i19;
            if (i18 % 2 == 0) {
                throw null;
            }
            int i20 = i19 ^ 21;
            int i21 = (i19 & 21) << 1;
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f54560r0 = i22 % 128;
            int i23 = i22 % 2;
            return ConstantKt.CERTIFICATE_TYPE_X509;
        }
        if (i16 == 2) {
            bdi bdiVar = (bdi) objArr[0];
            int i24 = f54560r0;
            int i25 = i24 & 53;
            int i26 = (i24 ^ 53) | i25;
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            f54561s0 = i27 % 128;
            int i28 = i27 % 2;
            try {
                int iHashCode = bdiVar.f54563q0.hashCode();
                bba bbaVar = bdiVar.f54562p0;
                int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) bba.setX(new Object[]{bbaVar}, -1381274718, 1381274720, System.identityHashCode(bbaVar))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                int i29 = iIntValue * 37;
                int iIdentityHashCode = System.identityHashCode(bdiVar);
                int i30 = iIntValue * (-21238);
                int i31 = iHashCode * (-574);
                int i32 = i30 ^ i31;
                int i33 = ((i30 & i31) | i32) << 1;
                int i34 = -i32;
                int i35 = (i33 & i34) + (i33 | i34);
                int i36 = ~i29;
                int i37 = ~iIdentityHashCode;
                int i38 = ((~i37) & i36) | ((~i36) & i37);
                int i39 = i36 & i37;
                int i40 = ~((i38 & i39) | (i38 ^ i39));
                int i41 = ~iHashCode;
                int i42 = i41 & iIdentityHashCode;
                int i43 = (~i42) & (i41 | iIdentityHashCode);
                int i44 = ~((i42 & i43) | (i43 ^ i42));
                int i45 = i40 & i44;
                int i46 = (i40 | i44) & (~i45);
                int i47 = -(-(((i46 & i45) | (i46 ^ i45)) * 1150));
                int i48 = ((i35 | i47) << 1) - (i35 ^ i47);
                int i49 = (i41 | iHashCode) & i41;
                int i50 = i49 & iIdentityHashCode;
                int i51 = (i49 | iIdentityHashCode) & (~i50);
                int i52 = (i51 & i50) | (i51 ^ i50);
                int i53 = ~i52;
                int i54 = (i52 | i53) & i53;
                int i55 = i37 & (i37 | iIdentityHashCode);
                int i56 = (iHashCode & i55) | (i55 ^ iHashCode);
                int i57 = ~i56;
                int i58 = (i56 | i57) & i57;
                int i59 = ((i58 & i54) | (i54 ^ i58)) * (-575);
                int i60 = (i48 ^ i59) + ((i59 & i48) << 1);
                int i61 = i36 & iIdentityHashCode;
                int i62 = (iIdentityHashCode | i36) & (~i61);
                int i63 = (i62 & i61) | (i62 ^ i61);
                int i64 = ~i63;
                int i65 = (i63 | i64) & i64;
                int i66 = (i55 ^ i29) | (i55 & i29);
                int i67 = ~i66;
                int i68 = (i66 | i67) & i67;
                int i69 = ((~i68) & i65) | ((~i65) & i68);
                int i70 = i65 & i68;
                int i71 = ((i70 & i69) | (i69 ^ i70)) * 575;
                int i72 = i60 & i71;
                int i73 = i72 + ((i71 ^ i60) | i72);
                int i74 = f54560r0;
                int i75 = i74 & 105;
                int i76 = -(-((i74 ^ 105) | i75));
                int i77 = (i75 & i76) + (i76 | i75);
                f54561s0 = i77 % 128;
                int i78 = i77 % 2;
                objValueOf = Integer.valueOf(i73);
            } catch (IOException unused) {
                objValueOf = Integer.valueOf(bdiVar.f54563q0.hashCode());
            }
        } else if (i16 == 3) {
            bdi bdiVar2 = (bdi) objArr[0];
            Object obj = objArr[1];
            int i79 = f54561s0;
            int i80 = (i79 ^ 113) + ((i79 & 113) << 1);
            int i81 = i80 % 128;
            f54560r0 = i81;
            int i82 = i80 % 2;
            if (obj == bdiVar2) {
                int i83 = i79 & 95;
                int i84 = i83 + ((i79 ^ 95) | i83);
                f54560r0 = i84 % 128;
                int i85 = i84 % 2;
            } else {
                if (obj instanceof bdi) {
                    int i86 = (i79 & 35) + (i79 | 35);
                    f54560r0 = i86 % 128;
                    int i87 = i86 % 2;
                    bdi bdiVar3 = (bdi) obj;
                    try {
                        adu aduVar = bdiVar2.f54563q0;
                        if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, bdiVar3.f54563q0}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                            int i88 = f54561s0;
                            int i89 = ((i88 | 61) << 1) - (i88 ^ 61);
                            f54560r0 = i89 % 128;
                            if (i89 % 2 != 0) {
                                bba bbaVar2 = bdiVar2.f54562p0;
                                byte[] bArr = (byte[]) bba.setX(new Object[]{bbaVar2}, -1381274718, 1381274720, System.identityHashCode(bbaVar2));
                                bba bbaVar3 = bdiVar3.f54562p0;
                                ((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr, (byte[]) bba.setX(new Object[]{bbaVar3}, -1381274718, 1381274720, System.identityHashCode(bbaVar3))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                                throw null;
                            }
                            bba bbaVar4 = bdiVar2.f54562p0;
                            byte[] bArr2 = (byte[]) bba.setX(new Object[]{bbaVar4}, -1381274718, 1381274720, System.identityHashCode(bbaVar4));
                            bba bbaVar5 = bdiVar3.f54562p0;
                            if (((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr2, (byte[]) bba.setX(new Object[]{bbaVar5}, -1381274718, 1381274720, System.identityHashCode(bbaVar5))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue()) {
                                int i90 = f54561s0;
                                int i91 = ((((i90 ^ 45) | (i90 & 45)) << 1) - (~(-(((~i90) & 45) | (i90 & (-46)))))) - 1;
                                f54560r0 = i91 % 128;
                                int i92 = i91 % 2;
                            }
                        }
                        int i93 = f54561s0 + 27;
                        f54560r0 = i93 % 128;
                        int i94 = i93 % 2;
                    } catch (IOException unused2) {
                    }
                } else {
                    int i95 = ((i81 ^ 45) | (i81 & 45)) << 1;
                    int i96 = -((i81 & (-46)) | ((~i81) & 45));
                    int i97 = ((i95 | i96) << 1) - (i95 ^ i96);
                    f54561s0 = i97 % 128;
                    if (i97 % 2 == 0) {
                        throw null;
                    }
                }
                objValueOf = Boolean.FALSE;
            }
            objValueOf = Boolean.TRUE;
        } else {
            if (i16 == 4) {
                bdi bdiVar4 = (bdi) objArr[0];
                ajj ajjVar = (ajj) objArr[1];
                int i98 = f54560r0;
                int i99 = (((i98 | 44) << 1) - (i98 ^ 44)) - 1;
                f54561s0 = i99 % 128;
                int i100 = i99 % 2;
                bba bbaVar6 = (bba) ((amw) baf.setY(new Object[]{ajjVar}, -1408872677, 1408872678, (int) System.currentTimeMillis()));
                bdiVar4.f54562p0 = bbaVar6;
                Object[] objArr2 = {(String) baq.setDividerPadding(new Object[]{bbaVar6}, 1182771546, -1182771546, System.identityHashCode(bbaVar6))};
                System.currentTimeMillis();
                bdiVar4.f54563q0 = i3.a(objArr2);
                int i101 = f54560r0 + 1;
                f54561s0 = i101 % 128;
                int i102 = i101 % 2;
                return null;
            }
            if (i16 == 5) {
                int i103 = f54561s0;
                int i104 = ~i103;
                int i105 = (i103 & (-82)) | (81 & i104);
                int i106 = (i103 & 81) << 1;
                int i107 = (i105 ^ i106) + ((i105 & i106) << 1);
                f54560r0 = i107 % 128;
                if (i107 % 2 != 0) {
                    int i108 = 31 / 0;
                }
                int i109 = (i103 & (-104)) | (i104 & 103);
                int i110 = -(-((i103 & 103) << 1));
                int i111 = ((i109 | i110) << 1) - (i110 ^ i109);
                f54560r0 = i111 % 128;
                if (i111 % 2 == 0) {
                    return "XMSS";
                }
                throw null;
            }
            bdi bdiVar5 = (bdi) objArr[0];
            int i112 = f54560r0 + 109;
            f54561s0 = i112 % 128;
            try {
                if (i112 % 2 == 0) {
                    objValueOf = ((ajj) bac.setDividerPadding(new Object[]{bdiVar5.f54562p0}, 629434876, -629434876, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                    int i113 = 9 / 0;
                } else {
                    objValueOf = ((ajj) bac.setDividerPadding(new Object[]{bdiVar5.f54562p0}, 629434876, -629434876, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                }
            } catch (IOException unused3) {
                return null;
            }
        }
        return objValueOf;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54561s0;
        int i11 = (i10 & 59) + (i10 | 59);
        f54560r0 = i11 % 128;
        int i12 = i11 % 2;
        objectOutputStream.defaultWriteObject();
        if (i12 == 0) {
            objectOutputStream.writeObject((byte[]) setY(new Object[]{this}, 374670541, -374670541, System.identityHashCode(this)));
        } else {
            objectOutputStream.writeObject((byte[]) setY(new Object[]{this}, 374670541, -374670541, System.identityHashCode(this)));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setY(new Object[]{this, obj}, 600804811, -600804808, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setY(new Object[]{this}, -797578395, 797578400, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setY(new Object[]{this}, 374670541, -374670541, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setY(new Object[]{this}, 621043797, -621043796, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setY(new Object[]{this}, -1252771591, 1252771593, System.identityHashCode(this))).intValue();
    }
}
