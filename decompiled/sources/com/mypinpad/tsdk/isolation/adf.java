package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class adf extends ady {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final a f52461u0 = new a(adf.class, 1);
    public static final adf v0 = new adf((byte) 0);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final adf f52462w0 = new adf((byte) -1);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f52463x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f52464y0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte f52465t0;

    public static class a extends j0 {
        @Override // com.mypinpad.tsdk.isolation.j0
        public final ady b(aft aftVar) {
            Object[] objArr = {this, aftVar};
            System.identityHashCode(this);
            aft aftVar2 = (aft) objArr[1];
            return (adf) adf.setDividerPadding(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{aftVar2}, -952512304, 952512305, System.identityHashCode(aftVar2))}, -593928223, 593928226, (int) System.currentTimeMillis());
        }
    }

    static {
        int i10 = f52464y0;
        int i11 = i10 & 89;
        int i12 = i11 + ((i10 ^ 89) | i11);
        f52463x0 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public adf(byte b10) {
        this.f52465t0 = b10;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0058  */
    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:45:0x0207  */
    /* JADX WARN: Code duplicated, block: B:79:0x030e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0333  */
    /* JADX WARN: Code duplicated, block: B:83:0x0338  */
    /* JADX WARN: Code duplicated, block: B:86:0x034d  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x023b, code lost:
    
        if ((r9 instanceof com.mypinpad.tsdk.isolation.adf) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0240, code lost:
    
        if ((r9 instanceof com.mypinpad.tsdk.isolation.adf) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x024e, code lost:
    
        throw new java.lang.IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(r9, "illegal object in getInstance: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setDividerPadding(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.adf.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static adf setOnFocusChangeListener(aeh aehVar) {
        return (adf) setDividerPadding(new Object[]{aehVar}, 183106444, -183106435, (int) System.currentTimeMillis());
    }

    public static adf setX(boolean z10) {
        return (adf) setDividerPadding(new Object[]{Boolean.valueOf(z10)}, -678269664, 678269664, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, 1425954596, -1425954589, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setDividerPadding(new Object[]{this, aebVar, Boolean.valueOf(z10)}, -1607873003, 1607873004, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setDividerPadding(new Object[]{this, adyVar}, -608008681, 608008689, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final ady e() {
        return (ady) setDividerPadding(new Object[]{this}, -1725312991, 1725312993, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public int hashCode() {
        int i10 = f52464y0;
        int i11 = (i10 & 9) + (i10 | 9);
        f52463x0 = i11 % 128;
        int i12 = i11 % 2;
        if (((Boolean) setDividerPadding(new Object[]{this}, 1550984628, -1550984623, System.identityHashCode(this))).booleanValue()) {
            int i13 = f52463x0;
            int i14 = (i13 ^ 37) + ((i13 & 37) << 1);
            f52464y0 = i14 % 128;
            int i15 = i14 % 2;
            return 1;
        }
        int iIdentityHashCode = System.identityHashCode(this);
        int i16 = 1861154815 & iIdentityHashCode;
        int i17 = (1861154815 | iIdentityHashCode) & (~i16);
        int i18 = (i17 & i16) | (i17 ^ i16);
        int i19 = ((i18 | (~i18)) & (~i18)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
        int i20 = (-1118395402) & i19;
        int i21 = -(-(i19 | (-1118395402)));
        int i22 = (i20 & i21) + (i21 | i20);
        int i23 = (i22 ^ 564957020) + ((564957020 & i22) << 1);
        int i24 = ~iIdentityHashCode;
        int i25 = (i24 & 1659794254) | (1659794254 ^ i24);
        int i26 = ((-1824827124) & i25) | ((~i25) & 1824827123);
        int i27 = i25 & 1824827123;
        int i28 = ~((i27 & i26) | (i26 ^ i27));
        int i29 = 1623466562 ^ i28;
        int i30 = i28 & 1623466562;
        int i31 = ((i30 & i29) | (i29 ^ i30)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
        int i32 = i23 & i31;
        int i33 = ((i31 | i23) & (~i32)) + (i32 << 1);
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i34 = ~iIdentityHashCode2;
        int i35 = ~(((~i34) & 186490481) | (i34 & (-186490482)) | (186490481 & i34));
        int i36 = ~((1539052138 ^ iIdentityHashCode2) | (1539052138 & iIdentityHashCode2));
        int i37 = ((i35 & i36) | (i35 ^ i36)) * ErrorCodes.ERR_CRY_IO_PROPERTIES;
        int i38 = (-1238539595) & i37;
        int i39 = -(-((i37 ^ (-1238539595)) | i38));
        int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
        int i41 = 1539052138 | i34;
        int i42 = i41 ^ (-186490482);
        int i43 = i41 & (-186490482);
        int i44 = (i43 & i42) | (i42 ^ i43);
        int i45 = (i34 & (-1352663051)) | (1352663050 & iIdentityHashCode2);
        int i46 = iIdentityHashCode2 & (-1352663051);
        if (i33 > ((((i44 | (~i44)) & (~i44)) | (~((i46 & i45) | (i45 ^ i46)))) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + i40) {
            return 0;
        }
        throw null;
    }

    public final boolean setCompoundDrawableTintBlendMode() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 1550984628, -1550984623, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -403330888, 403330894, System.identityHashCode(this))).booleanValue();
    }

    public String toString() {
        int i10 = f52464y0;
        int i11 = (i10 & 12) + (i10 | 12);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f52463x0 = i12 % 128;
        int i13 = i12 % 2;
        if (!((Boolean) setDividerPadding(new Object[]{this}, 1550984628, -1550984623, System.identityHashCode(this))).booleanValue()) {
            int i14 = f52463x0;
            int i15 = i14 & 15;
            int i16 = -(-((i14 ^ 15) | i15));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            f52464y0 = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 83 / 0;
            }
            return "FALSE";
        }
        int i19 = f52464y0;
        int i20 = i19 & 107;
        int i21 = (i19 | 107) & (~i20);
        int i22 = -(-(i20 << 1));
        int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
        f52463x0 = i23 % 128;
        if (i23 % 2 == 0) {
            return "TRUE";
        }
        throw null;
    }

    public static adf setDividerPadding(Object obj) {
        return (adf) setDividerPadding(new Object[]{obj}, 2107756621, -2107756617, (int) System.currentTimeMillis());
    }
}
