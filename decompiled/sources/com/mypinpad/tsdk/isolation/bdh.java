package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes10.dex */
public final class bdh implements PublicKey {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54556r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54557s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient adu f54558p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient bay f54559q0;

    public bdh(ajj ajjVar) throws IOException {
        setDividerPadding(new Object[]{this, ajjVar}, 1442932202, -1442932202, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = f54557s0;
        int i11 = (i10 & 115) + (i10 | 115);
        f54556r0 = i11 % 128;
        int i12 = i11 % 2;
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        if (i12 != 0) {
            setDividerPadding(new Object[]{this, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{bArr}, 909154525, -909154522, (int) System.currentTimeMillis())}, 1442932202, -1442932202, System.identityHashCode(this));
            throw null;
        }
        setDividerPadding(new Object[]{this, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{bArr}, 909154525, -909154522, (int) System.currentTimeMillis())}, 1442932202, -1442932202, System.identityHashCode(this));
        int i13 = f54557s0;
        int i14 = (i13 & 93) + (i13 | 93);
        f54556r0 = i14 % 128;
        int i15 = i14 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0198  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:50:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ee  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Boolean bool;
        int i13;
        bay bayVar;
        byte[] bArr;
        bay bayVar2;
        int i14;
        byte[] alwaysDrawnWithCacheEnabled;
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = ((i10 | i12) * 104) + ((~(i11 | (~i12) | i10)) * (-104)) + (((~(i15 | i16)) | (~(i16 | i12))) * 104) + (i11 * (-103)) + (i10 * (-103));
        if (i17 == 1) {
            bdh bdhVar = (bdh) objArr[0];
            int i18 = f54556r0;
            int i19 = i18 ^ 107;
            int i20 = ((i18 & 107) | i19) << 1;
            int i21 = -i19;
            int i22 = (i20 & i21) + (i20 | i21);
            f54557s0 = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = 37 / 0;
            }
            System.identityHashCode(bdhVar);
            System.identityHashCode(bdhVar);
            return "XMSSMT";
        }
        byte[] bArr2 = null;
        if (i17 == 2) {
            bdh bdhVar2 = (bdh) objArr[0];
            int i24 = f54557s0;
            int i25 = ((i24 & 35) - (~(-(-(i24 | 35))))) - 1;
            f54556r0 = i25 % 128;
            int i26 = i25 % 2;
            int iHashCode = bdhVar2.f54558p0.hashCode();
            bay bayVar3 = bdhVar2.f54559q0;
            int i27 = -(-(((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) bay.setX(new Object[]{bayVar3}, -678559952, 678559953, System.identityHashCode(bayVar3))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue() * 37));
            int i28 = ((iHashCode ^ i27) | (iHashCode & i27)) << 1;
            int i29 = -((i27 & (~iHashCode)) | ((~i27) & iHashCode));
            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
            int i31 = f54556r0;
            int i32 = i31 & 5;
            int i33 = (i32 - (~(-(-((i31 ^ 5) | i32))))) - 1;
            f54557s0 = i33 % 128;
            if (i33 % 2 != 0) {
                return Integer.valueOf(i30);
            }
            throw null;
        }
        if (i17 != 3) {
            if (i17 == 4) {
                bdh bdhVar3 = (bdh) objArr[0];
                int i34 = f54556r0;
                int i35 = i34 ^ 117;
                int i36 = (i34 & 117) << 1;
                int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                f54557s0 = i37 % 128;
                try {
                    if (i37 % 2 == 0) {
                        alwaysDrawnWithCacheEnabled = ((ajj) bac.setDividerPadding(new Object[]{bdhVar3.f54559q0}, 629434876, -629434876, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                        int i38 = 5 / 0;
                    } else {
                        alwaysDrawnWithCacheEnabled = ((ajj) bac.setDividerPadding(new Object[]{bdhVar3.f54559q0}, 629434876, -629434876, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                    }
                    bArr2 = alwaysDrawnWithCacheEnabled;
                    System.identityHashCode(bdhVar3);
                    System.identityHashCode(bdhVar3);
                    return bArr2;
                } catch (IOException unused) {
                    return bArr2;
                }
            }
            if (i17 == 5) {
                int i39 = f54556r0;
                int i40 = (i39 & (-108)) | ((~i39) & 107);
                int i41 = (i39 & 107) << 1;
                int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                f54557s0 = i42 % 128;
                if (i42 % 2 != 0) {
                    return ConstantKt.CERTIFICATE_TYPE_X509;
                }
                throw null;
            }
            bdh bdhVar4 = (bdh) objArr[0];
            ajj ajjVar = (ajj) objArr[1];
            int i43 = f54556r0;
            int i44 = i43 & 89;
            int i45 = (i43 ^ 89) | i44;
            int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
            f54557s0 = i46 % 128;
            int i47 = i46 % 2;
            bay bayVar4 = (bay) ((amw) baf.setY(new Object[]{ajjVar}, -1408872677, 1408872678, (int) System.currentTimeMillis()));
            bdhVar4.f54559q0 = bayVar4;
            Object[] objArr2 = {(String) bav.setDividerPadding(new Object[]{bayVar4}, -1543034834, 1543034834, System.identityHashCode(bayVar4))};
            System.currentTimeMillis();
            bdhVar4.f54558p0 = i3.a(objArr2);
            int i48 = f54557s0;
            int i49 = i48 & 125;
            int i50 = -(-((i48 ^ 125) | i49));
            int i51 = (i49 & i50) + (i50 | i49);
            f54556r0 = i51 % 128;
            int i52 = i51 % 2;
            return null;
        }
        bdh bdhVar5 = (bdh) objArr[0];
        Object obj = objArr[1];
        int i53 = f54556r0;
        int i54 = i53 ^ 65;
        int i55 = -(-((i53 & 65) << 1));
        int i56 = (i54 ^ i55) + ((i54 & i55) << 1);
        int i57 = i56 % 128;
        f54557s0 = i57;
        if (i56 % 2 == 0) {
            throw null;
        }
        if (obj != bdhVar5) {
            if (obj instanceof bdh) {
                int i58 = i53 & 19;
                int i59 = i53 | 19;
                int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                f54557s0 = i60 % 128;
                bdh bdhVar6 = (bdh) obj;
                if (i60 % 2 == 0) {
                    adu aduVar = bdhVar5.f54558p0;
                    int i61 = 69 / 0;
                    if (!(!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, bdhVar6.f54558p0}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue())) {
                        int i62 = f54557s0 + 101;
                        f54556r0 = i62 % 128;
                        i13 = i62 % 2;
                        bayVar = bdhVar5.f54559q0;
                        if (i13 == 0) {
                            byte[] bArr3 = (byte[]) bay.setX(new Object[]{bayVar}, -678559952, 678559953, System.identityHashCode(bayVar));
                            bay bayVar5 = bdhVar6.f54559q0;
                            ((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr3, (byte[]) bay.setX(new Object[]{bayVar5}, -678559952, 678559953, System.identityHashCode(bayVar5))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                            throw null;
                        }
                        bArr = (byte[]) bay.setX(new Object[]{bayVar}, -678559952, 678559953, System.identityHashCode(bayVar));
                        bayVar2 = bdhVar6.f54559q0;
                        if (((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr, (byte[]) bay.setX(new Object[]{bayVar2}, -678559952, 678559953, System.identityHashCode(bayVar2))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue()) {
                            i14 = f54556r0 + 123;
                            f54557s0 = i14 % 128;
                            if (i14 % 2 == 0) {
                                throw null;
                            }
                        }
                    }
                } else {
                    adu aduVar2 = bdhVar5.f54558p0;
                    if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, bdhVar6.f54558p0}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue()) {
                        int i63 = f54557s0 + 101;
                        f54556r0 = i63 % 128;
                        i13 = i63 % 2;
                        bayVar = bdhVar5.f54559q0;
                        if (i13 == 0) {
                            byte[] bArr4 = (byte[]) bay.setX(new Object[]{bayVar}, -678559952, 678559953, System.identityHashCode(bayVar));
                            bay bayVar6 = bdhVar6.f54559q0;
                            ((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr4, (byte[]) bay.setX(new Object[]{bayVar6}, -678559952, 678559953, System.identityHashCode(bayVar6))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                            throw null;
                        }
                        bArr = (byte[]) bay.setX(new Object[]{bayVar}, -678559952, 678559953, System.identityHashCode(bayVar));
                        bayVar2 = bdhVar6.f54559q0;
                        if (((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr, (byte[]) bay.setX(new Object[]{bayVar2}, -678559952, 678559953, System.identityHashCode(bayVar2))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue()) {
                            i14 = f54556r0 + 123;
                            f54557s0 = i14 % 128;
                            if (i14 % 2 == 0) {
                                throw null;
                            }
                        }
                    }
                }
                int i64 = f54556r0;
                int i65 = (i64 & 13) + (i64 | 13);
                f54557s0 = i65 % 128;
                if (i65 % 2 == 0) {
                    throw null;
                }
            } else {
                int i66 = i57 ^ 83;
                int i67 = ((i57 & 83) | i66) << 1;
                int i68 = -i66;
                int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
                f54556r0 = i69 % 128;
                if (i69 % 2 != 0) {
                    int i70 = 30 / 0;
                }
            }
            bool = Boolean.FALSE;
            return bool;
        }
        int i71 = i53 ^ 99;
        int i72 = (i53 & 99) << 1;
        int i73 = (i71 ^ i72) + ((i71 & i72) << 1);
        f54557s0 = i73 % 128;
        if (i73 % 2 == 0) {
            throw null;
        }
        bool = Boolean.TRUE;
        return bool;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54556r0;
        int i11 = i10 & 33;
        int i12 = (i10 | 33) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f54557s0 = i14 % 128;
        int i15 = i14 % 2;
        objectOutputStream.defaultWriteObject();
        Object[] objArr = new Object[1];
        if (i15 != 0) {
            objArr[0] = this;
            objectOutputStream.writeObject((byte[]) setDividerPadding(objArr, -170552375, 170552379, System.identityHashCode(this)));
        } else {
            objArr[0] = this;
            objectOutputStream.writeObject((byte[]) setDividerPadding(objArr, -170552375, 170552379, System.identityHashCode(this)));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, -1325580955, 1325580958, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setDividerPadding(new Object[]{this}, -1907152760, 1907152761, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setDividerPadding(new Object[]{this}, -170552375, 170552379, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setDividerPadding(new Object[]{this}, 919361908, -919361903, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -1977541521, 1977541523, System.identityHashCode(this))).intValue();
    }
}
