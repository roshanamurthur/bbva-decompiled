package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class bcf implements bbl {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54462s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54463t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient axe f54464p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient String f54465q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient byte[] f54466r0;

    public bcf(ajj ajjVar) throws IOException {
        setX(new Object[]{this, ajjVar}, -1747586639, 1747586645, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = f54463t0 + 53;
        f54462s0 = i10 % 128;
        int i11 = i10 % 2;
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        if (i11 != 0) {
            setX(new Object[]{this, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{bArr}, 909154525, -909154522, (int) System.currentTimeMillis())}, -1747586639, 1747586645, System.identityHashCode(this));
            throw null;
        }
        setX(new Object[]{this, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{bArr}, 909154525, -909154522, (int) System.currentTimeMillis())}, -1747586639, 1747586645, System.identityHashCode(this));
        int i12 = f54462s0;
        int i13 = i12 & 105;
        int i14 = ((((i12 ^ 105) | i13) << 1) - (~(-((i12 | 105) & (~i13))))) - 1;
        f54463t0 = i14 % 128;
        int i15 = i14 % 2;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int iIntValue;
        Boolean boolValueOf;
        int i13 = (i11 * (-344)) + (i10 * (-344));
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = i14 | i15;
        switch (((~(i16 | i12)) * 345) + (((~(i10 | i15)) | (~(i14 | (~i12)))) * 345) + (((~i16) | (~(i14 | i12))) * 345) + i13) {
            case 1:
                bcf bcfVar = (bcf) objArr[0];
                int i17 = f54463t0;
                int i18 = i17 ^ 35;
                int i19 = -(-((i17 & 35) << 1));
                int i20 = (i18 & i19) + (i19 | i18);
                int i21 = i20 % 128;
                f54462s0 = i21;
                int i22 = i20 % 2;
                String str = bcfVar.f54465q0;
                int i23 = (((i21 | 120) << 1) - (i21 ^ 120)) - 1;
                f54463t0 = i23 % 128;
                int i24 = i23 % 2;
                return str;
            case 2:
                bcf bcfVar2 = (bcf) objArr[0];
                int i25 = f54462s0;
                int i26 = i25 & 105;
                int i27 = i26 + ((i25 ^ 105) | i26);
                f54463t0 = i27 % 128;
                if (i27 % 2 == 0) {
                    iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) setX(new Object[]{bcfVar2}, 2045690358, -2045690358, System.identityHashCode(bcfVar2))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                    int i28 = 63 / 0;
                } else {
                    iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) setX(new Object[]{bcfVar2}, 2045690358, -2045690358, System.identityHashCode(bcfVar2))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                }
                int i29 = f54463t0;
                int i30 = ((i29 & 74) + (i29 | 74)) - 1;
                f54462s0 = i30 % 128;
                int i31 = i30 % 2;
                return Integer.valueOf(iIntValue);
            case 3:
                int i32 = f54462s0;
                int i33 = (((i32 | 108) << 1) - (i32 ^ 108)) - 1;
                int i34 = i33 % 128;
                f54463t0 = i34;
                if (i33 % 2 == 0) {
                    throw null;
                }
                int i35 = i34 & 7;
                int i36 = (((i34 ^ 7) | i35) << 1) - ((i34 | 7) & (~i35));
                f54462s0 = i36 % 128;
                if (i36 % 2 == 0) {
                    return ConstantKt.CERTIFICATE_TYPE_X509;
                }
                throw null;
            case 4:
                bcf bcfVar3 = (bcf) objArr[0];
                axe axeVar = (axe) objArr[1];
                int i37 = f54462s0;
                int i38 = (((i37 | 100) << 1) - (i37 ^ 100)) - 1;
                f54463t0 = i38 % 128;
                int i39 = i38 % 2;
                bcfVar3.f54464p0 = axeVar;
                if (i39 == 0) {
                    axd axdVar = (axd) axc.setY(new Object[]{axeVar}, -1152451803, 1152451803, System.identityHashCode(axeVar));
                    bcfVar3.f54465q0 = (String) bez.setX(new Object[]{(String) axd.setOnFocusChangeListener(new Object[]{axdVar}, -722872963, 722872964, System.identityHashCode(axdVar))}, -925397906, 925397910, (int) System.currentTimeMillis());
                    throw null;
                }
                axd axdVar2 = (axd) axc.setY(new Object[]{axeVar}, -1152451803, 1152451803, System.identityHashCode(axeVar));
                bcfVar3.f54465q0 = (String) bez.setX(new Object[]{(String) axd.setOnFocusChangeListener(new Object[]{axdVar2}, -722872963, 722872964, System.identityHashCode(axdVar2))}, -925397906, 925397910, (int) System.currentTimeMillis());
                int i40 = f54463t0;
                int i41 = ((i40 ^ 107) - (~((i40 & 107) << 1))) - 1;
                f54462s0 = i41 % 128;
                if (i41 % 2 == 0) {
                    return null;
                }
                throw null;
            case 5:
                bcf bcfVar4 = (bcf) objArr[0];
                Object obj = objArr[1];
                int i42 = f54462s0;
                int i43 = ~i42;
                int i44 = (i42 & (-60)) | (59 & i43);
                int i45 = (i42 & 59) << 1;
                int i46 = (i44 & i45) + (i44 | i45);
                int i47 = i46 % 128;
                f54463t0 = i47;
                int i48 = i46 % 2;
                if (obj == bcfVar4) {
                    int i49 = (i47 & 125) + (i47 | 125);
                    int i50 = i49 % 128;
                    f54462s0 = i50;
                    boolean z10 = i49 % 2 == 0;
                    int i51 = ((i50 ^ 77) | (i50 & 77)) << 1;
                    int i52 = -(((~i50) & 77) | (i50 & (-78)));
                    int i53 = ((i51 | i52) << 1) - (i51 ^ i52);
                    f54463t0 = i53 % 128;
                    int i54 = i53 % 2;
                    boolValueOf = Boolean.valueOf(z10);
                } else if (obj instanceof bcf) {
                    int i55 = i42 + 65;
                    f54463t0 = i55 % 128;
                    int i56 = i55 % 2;
                    bcf bcfVar5 = (bcf) obj;
                    boolean zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{(byte[]) setX(new Object[]{bcfVar4}, 2045690358, -2045690358, System.identityHashCode(bcfVar4)), (byte[]) setX(new Object[]{bcfVar5}, 2045690358, -2045690358, System.identityHashCode(bcfVar5))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    int i57 = f54462s0;
                    int i58 = (i57 & 5) + (i57 | 5);
                    f54463t0 = i58 % 128;
                    int i59 = i58 % 2;
                    boolValueOf = Boolean.valueOf(zBooleanValue);
                } else {
                    int i60 = (((i42 & (-108)) | (i43 & 107)) - (~((i42 & 107) << 1))) - 1;
                    f54463t0 = i60 % 128;
                    if (i60 % 2 == 0) {
                        int i61 = 80 / 0;
                    }
                    boolValueOf = Boolean.FALSE;
                }
                return boolValueOf;
            case 6:
                bcf bcfVar6 = (bcf) objArr[0];
                ajj ajjVar = (ajj) objArr[1];
                int i62 = f54463t0 + 72;
                int i63 = (i62 ^ (-1)) + (i62 << 1);
                f54462s0 = i63 % 128;
                if (i63 % 2 == 0) {
                    setX(new Object[]{bcfVar6, (axe) ((amw) baf.setY(new Object[]{ajjVar}, -1408872677, 1408872678, (int) System.currentTimeMillis()))}, 858303988, -858303984, System.identityHashCode(bcfVar6));
                    return null;
                }
                setX(new Object[]{bcfVar6, (axe) ((amw) baf.setY(new Object[]{ajjVar}, -1408872677, 1408872678, (int) System.currentTimeMillis()))}, 858303988, -858303984, System.identityHashCode(bcfVar6));
                throw null;
            default:
                bcf bcfVar7 = (bcf) objArr[0];
                int i64 = f54463t0;
                int i65 = (i64 & (-30)) | ((~i64) & 29);
                int i66 = -(-((i64 & 29) << 1));
                int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                int i68 = i67 % 128;
                f54462s0 = i68;
                int i69 = i67 % 2;
                if (bcfVar7.f54466r0 == null) {
                    int i70 = i68 & 83;
                    int i71 = (((i68 ^ 83) | i70) << 1) - ((i68 | 83) & (~i70));
                    f54463t0 = i71 % 128;
                    int i72 = i71 % 2;
                    bcfVar7.f54466r0 = (byte[]) bdd.setOnFocusChangeListener(new Object[]{bcfVar7.f54464p0}, 777503361, -777503360, (int) System.currentTimeMillis());
                    int i73 = f54462s0;
                    int i74 = ((i73 | 69) << 1) - (i73 ^ 69);
                    f54463t0 = i74 % 128;
                    int i75 = i74 % 2;
                }
                byte[] bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{bcfVar7.f54466r0}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i76 = f54463t0 + 115;
                f54462s0 = i76 % 128;
                int i77 = i76 % 2;
                return bArr;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54463t0;
        int i11 = i10 & 59;
        int i12 = i11 + ((i10 ^ 59) | i11);
        f54462s0 = i12 % 128;
        int i13 = i12 % 2;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject((byte[]) setX(new Object[]{this}, 2045690358, -2045690358, System.identityHashCode(this)));
        int i14 = f54462s0;
        int i15 = i14 & 23;
        int i16 = ((((i14 ^ 23) | i15) << 1) - (~(-((i14 | 23) & (~i15))))) - 1;
        f54463t0 = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, -1045641718, 1045641723, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setX(new Object[]{this}, -2020691245, 2020691246, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setX(new Object[]{this}, 2045690358, -2045690358, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setX(new Object[]{this}, 122829080, -122829077, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, 1689561095, -1689561093, System.identityHashCode(this))).intValue();
    }
}
