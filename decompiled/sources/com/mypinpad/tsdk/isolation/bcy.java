package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes10.dex */
public final class bcy implements bbu, PublicKey {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54526r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54527s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient adu f54528p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient azs f54529q0;

    public bcy(ajj ajjVar) throws IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this, ajjVar}, -1754055323, 1754055326, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = f54526r0;
        int i11 = ((i10 | 124) << 1) - (i10 ^ 124);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f54527s0 = i12 % 128;
        int i13 = i12 % 2;
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        if (i13 != 0) {
            setCompoundDrawableTintBlendMode(new Object[]{this, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{bArr}, 909154525, -909154522, (int) System.currentTimeMillis())}, -1754055323, 1754055326, System.identityHashCode(this));
        } else {
            setCompoundDrawableTintBlendMode(new Object[]{this, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{bArr}, 909154525, -909154522, (int) System.currentTimeMillis())}, -1754055323, 1754055326, System.identityHashCode(this));
            throw null;
        }
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Object alwaysDrawnWithCacheEnabled;
        ajj ajjVar;
        int i13 = ~i10;
        int i14 = ~i12;
        int i15 = (~(i13 | i11)) | (~(i13 | i14));
        int i16 = ~i11;
        int i17 = ~(i10 | i16 | i12);
        int i18 = ((~(i16 | i14)) * 713) + (i17 * 1426) + ((i15 | i17) * (-713)) + (i11 * (-712)) + (i10 * 714);
        if (i18 == 1) {
            bcy bcyVar = (bcy) objArr[0];
            int i19 = f54526r0;
            int i20 = ((i19 | 126) << 1) - (i19 ^ 126);
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            f54527s0 = i21 % 128;
            int i22 = i21 % 2;
            try {
                azs azsVar = bcyVar.f54529q0;
                if (((String) azo.setY(new Object[]{azsVar}, 1834578482, -1834578482, System.identityHashCode(azsVar))) != null) {
                    int i23 = f54527s0;
                    int i24 = i23 & 87;
                    int i25 = (i23 | 87) & (~i24);
                    int i26 = -(-(i24 << 1));
                    int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                    f54526r0 = i27 % 128;
                    int i28 = i27 % 2;
                    ajjVar = (ajj) bac.setDividerPadding(new Object[]{bcyVar.f54529q0}, 629434876, -629434876, (int) System.currentTimeMillis());
                    int i29 = f54526r0;
                    int i30 = (i29 ^ 48) + ((i29 & 48) << 1);
                    int i31 = (i30 ^ (-1)) + (i30 << 1);
                    f54527s0 = i31 % 128;
                    int i32 = i31 % 2;
                } else {
                    aiw aiwVar = new aiw(avq.setX, new avr(new aiw(bcyVar.f54528p0)));
                    azs azsVar2 = bcyVar.f54529q0;
                    ajj ajjVar2 = new ajj(aiwVar, (byte[]) azs.setX(new Object[]{azsVar2}, -34095331, 34095331, System.identityHashCode(azsVar2)));
                    int i33 = f54526r0;
                    int i34 = ((i33 | 17) << 1) - (i33 ^ 17);
                    f54527s0 = i34 % 128;
                    int i35 = i34 % 2;
                    ajjVar = ajjVar2;
                }
                alwaysDrawnWithCacheEnabled = ajjVar.setAlwaysDrawnWithCacheEnabled();
                int i36 = f54527s0;
                int i37 = (i36 | 91) << 1;
                int i38 = -(i36 ^ 91);
                int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
                f54526r0 = i39 % 128;
                if (i39 % 2 != 0) {
                    throw null;
                }
            } catch (IOException unused) {
                alwaysDrawnWithCacheEnabled = null;
            }
        } else {
            if (i18 != 2) {
                if (i18 == 3) {
                    bcy bcyVar2 = (bcy) objArr[0];
                    ajj ajjVar3 = (ajj) objArr[1];
                    int i40 = f54526r0;
                    int i41 = i40 & 65;
                    int i42 = (i41 - (~(-(-((i40 ^ 65) | i41))))) - 1;
                    f54527s0 = i42 % 128;
                    if (i42 % 2 != 0) {
                        aiw aiwVar2 = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar3}, 912478577, -912478575, System.identityHashCode(ajjVar3));
                        avr avrVar = (avr) avr.setX(new Object[]{(add) aiw.setOnFocusChangeListener(new Object[]{aiwVar2}, -513456911, 513456913, System.identityHashCode(aiwVar2))}, -19534878, 19534879, (int) System.currentTimeMillis());
                        aiw aiwVar3 = (aiw) avr.setX(new Object[]{avrVar}, -656659519, 656659521, System.identityHashCode(avrVar));
                        bcyVar2.f54528p0 = (adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar3}, -661220858, 661220861, System.identityHashCode(aiwVar3));
                        bcyVar2.f54529q0 = (azs) ((amw) baf.setY(new Object[]{ajjVar3}, -1408872677, 1408872678, (int) System.currentTimeMillis()));
                        return null;
                    }
                    aiw aiwVar4 = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar3}, 912478577, -912478575, System.identityHashCode(ajjVar3));
                    avr avrVar2 = (avr) avr.setX(new Object[]{(add) aiw.setOnFocusChangeListener(new Object[]{aiwVar4}, -513456911, 513456913, System.identityHashCode(aiwVar4))}, -19534878, 19534879, (int) System.currentTimeMillis());
                    aiw aiwVar5 = (aiw) avr.setX(new Object[]{avrVar2}, -656659519, 656659521, System.identityHashCode(avrVar2));
                    bcyVar2.f54528p0 = (adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar5}, -661220858, 661220861, System.identityHashCode(aiwVar5));
                    bcyVar2.f54529q0 = (azs) ((amw) baf.setY(new Object[]{ajjVar3}, -1408872677, 1408872678, (int) System.currentTimeMillis()));
                    throw null;
                }
                if (i18 == 4) {
                    int i43 = f54526r0;
                    int i44 = i43 & 39;
                    int i45 = -(-(i43 | 39));
                    int i46 = ((i44 | i45) << 1) - (i44 ^ i45);
                    f54527s0 = i46 % 128;
                    int i47 = i46 % 2;
                    int i48 = (i43 & 53) + (i43 | 53);
                    f54527s0 = i48 % 128;
                    int i49 = i48 % 2;
                    return "SPHINCS-256";
                }
                if (i18 == 5) {
                    int i50 = f54526r0;
                    int i51 = ((i50 | 25) << 1) - (i50 ^ 25);
                    int i52 = i51 % 128;
                    f54527s0 = i52;
                    int i53 = i51 % 2;
                    int i54 = ((i52 | 113) << 1) - (i52 ^ 113);
                    f54526r0 = i54 % 128;
                    if (i54 % 2 == 0) {
                        return ConstantKt.CERTIFICATE_TYPE_X509;
                    }
                    throw null;
                }
                bcy bcyVar3 = (bcy) objArr[0];
                int i55 = f54527s0;
                int i56 = (((i55 | 24) << 1) - (i55 ^ 24)) - 1;
                f54526r0 = i56 % 128;
                int i57 = i56 % 2;
                int iHashCode = bcyVar3.f54528p0.hashCode();
                azs azsVar3 = bcyVar3.f54529q0;
                int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) azs.setX(new Object[]{azsVar3}, -34095331, 34095331, System.identityHashCode(azsVar3))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue() * 37;
                int i58 = iHashCode & iIntValue;
                int i59 = ((iHashCode ^ iIntValue) | i58) << 1;
                int i60 = -((iIntValue | iHashCode) & (~i58));
                int i61 = (i59 & i60) + (i60 | i59);
                int i62 = f54526r0;
                int i63 = i62 ^ 81;
                int i64 = ((i62 & 81) | i63) << 1;
                int i65 = -i63;
                int i66 = (i64 & i65) + (i64 | i65);
                f54527s0 = i66 % 128;
                int i67 = i66 % 2;
                return Integer.valueOf(i61);
            }
            bcy bcyVar4 = (bcy) objArr[0];
            Object obj = objArr[1];
            int i68 = f54526r0;
            int i69 = (-2) - ((i68 + 110) ^ (-1));
            int i70 = i69 % 128;
            f54527s0 = i70;
            if (i69 % 2 == 0) {
                throw null;
            }
            if (obj == bcyVar4) {
                int i71 = ((i70 | 105) << 1) - (i70 ^ 105);
                int i72 = i71 % 128;
                f54526r0 = i72;
                int i73 = i71 % 2;
                int i74 = (i72 ^ 121) + ((i72 & 121) << 1);
                f54527s0 = i74 % 128;
                int i75 = i74 % 2;
            } else {
                if (obj instanceof bcy) {
                    int i76 = i70 & 15;
                    int i77 = (i70 ^ 15) | i76;
                    int i78 = (i76 ^ i77) + ((i76 & i77) << 1);
                    f54526r0 = i78 % 128;
                    int i79 = i78 % 2;
                    bcy bcyVar5 = (bcy) obj;
                    adu aduVar = bcyVar4.f54528p0;
                    if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, bcyVar5.f54528p0}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                        int i80 = f54526r0;
                        int i81 = ((i80 ^ 67) | (i80 & 67)) << 1;
                        int i82 = -(((~i80) & 67) | (i80 & (-68)));
                        int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
                        f54527s0 = i83 % 128;
                        int i84 = i83 % 2;
                        azs azsVar4 = bcyVar4.f54529q0;
                        byte[] bArr = (byte[]) azs.setX(new Object[]{azsVar4}, -34095331, 34095331, System.identityHashCode(azsVar4));
                        azs azsVar5 = bcyVar5.f54529q0;
                        if (((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr, (byte[]) azs.setX(new Object[]{azsVar5}, -34095331, 34095331, System.identityHashCode(azsVar5))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue()) {
                            int i85 = f54527s0;
                            int i86 = i85 & 9;
                            int i87 = ((((i85 ^ 9) | i86) << 1) - (~(-((i85 | 9) & (~i86))))) - 1;
                            int i88 = i87 % 128;
                            f54526r0 = i88;
                            int i89 = i87 % 2;
                            int i90 = (-2) - ((i88 + 64) ^ (-1));
                            f54527s0 = i90 % 128;
                            if (i90 % 2 == 0) {
                                int i91 = 49 / 0;
                            }
                        }
                    }
                    int i92 = f54527s0 + 111;
                    f54526r0 = i92 % 128;
                    if (i92 % 2 != 0) {
                        throw null;
                    }
                } else {
                    int i93 = i68 & 125;
                    int i94 = ((~i93) & (i68 | 125)) + (i93 << 1);
                    f54527s0 = i94 % 128;
                    int i95 = i94 % 2;
                }
                alwaysDrawnWithCacheEnabled = Boolean.FALSE;
            }
            alwaysDrawnWithCacheEnabled = Boolean.TRUE;
        }
        return alwaysDrawnWithCacheEnabled;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54526r0;
        int i11 = i10 & 41;
        int i12 = (i10 | 41) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        f54527s0 = i14 % 128;
        int i15 = i14 % 2;
        objectOutputStream.defaultWriteObject();
        Object[] objArr = new Object[1];
        if (i15 == 0) {
            objArr[0] = this;
            objectOutputStream.writeObject((byte[]) setCompoundDrawableTintBlendMode(objArr, 492760267, -492760266, System.identityHashCode(this)));
            int i16 = 84 / 0;
        } else {
            objArr[0] = this;
            objectOutputStream.writeObject((byte[]) setCompoundDrawableTintBlendMode(objArr, 492760267, -492760266, System.identityHashCode(this)));
        }
        int i17 = f54526r0 + 69;
        f54527s0 = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 28 / 0;
        }
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, obj}, 885552921, -885552919, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -1141468197, 1141468201, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 492760267, -492760266, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -906506603, 906506608, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 1898534383, -1898534383, System.identityHashCode(this))).intValue();
    }
}
