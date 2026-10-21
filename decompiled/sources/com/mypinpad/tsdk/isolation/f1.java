package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes10.dex */
public final class f1 extends X509CRLEntry {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f55463t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f55464u0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ajn.setDividerPadding f55465p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ain f55466q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public volatile boolean f55467r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public volatile int f55468s0;

    public f1(ajn.setDividerPadding setdividerpadding, boolean z10, ain ainVar) {
        this.f55465p0 = setdividerpadding;
        this.f55466q0 = (ain) c(new Object[]{this, Boolean.valueOf(z10), ainVar}, -1291702024, 1291702026, System.identityHashCode(this));
    }

    public static /* synthetic */ ajc a(Object[] objArr) {
        f1 f1Var = (f1) objArr[0];
        adu aduVar = (adu) objArr[1];
        int i10 = f55464u0 + 33;
        f55463t0 = i10 % 128;
        if (i10 % 2 != 0) {
            ajn.setDividerPadding setdividerpadding = f1Var.f55465p0;
            throw null;
        }
        ajn.setDividerPadding setdividerpadding2 = f1Var.f55465p0;
        aje ajeVar = (aje) ajn.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding2}, 654586412, -654586409, System.identityHashCode(setdividerpadding2));
        if (ajeVar == null) {
            int i11 = f55464u0;
            int i12 = i11 | 29;
            int i13 = i12 << 1;
            int i14 = -((~(i11 & 29)) & i12);
            int i15 = (i13 & i14) + (i14 | i13);
            f55463t0 = i15 % 128;
            if (i15 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i16 = f55464u0;
        int i17 = (((i16 | 14) << 1) - (i16 ^ 14)) - 1;
        f55463t0 = i17 % 128;
        int i18 = i17 % 2;
        ajc ajcVar = (ajc) aje.setY(new Object[]{ajeVar, aduVar}, -814074534, 814074535, System.identityHashCode(ajeVar));
        int i19 = f55463t0;
        int i20 = ((i19 ^ 65) | (i19 & 65)) << 1;
        int i21 = -(((~i19) & 65) | (i19 & (-66)));
        int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
        f55464u0 = i22 % 128;
        int i23 = i22 % 2;
        return ajcVar;
    }

    public static /* synthetic */ ain b(Object[] objArr) {
        f1 f1Var = (f1) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        ain ainVar = (ain) objArr[2];
        int i10 = f55464u0;
        int i11 = i10 & 87;
        int i12 = (i10 ^ 87) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        f55463t0 = i14;
        if (i13 % 2 != 0) {
            throw null;
        }
        if (!zBooleanValue) {
            int i15 = i14 + 115;
            f55464u0 = i15 % 128;
            int i16 = i15 % 2;
            return null;
        }
        ajc ajcVar = (ajc) c(new Object[]{f1Var, ajc.getNavBarTitleString}, -2084474750, 2084474751, System.identityHashCode(f1Var));
        if (ajcVar == null) {
            int i17 = f55464u0;
            int i18 = i17 & 123;
            int i19 = -(-((i17 ^ 123) | i18));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            f55463t0 = i20 % 128;
            if (i20 % 2 == 0) {
                return ainVar;
            }
            throw null;
        }
        try {
            ajh ajhVar = (ajh) ajh.setDividerPadding(new Object[]{(add) ajc.setX(new Object[]{ajcVar}, -663497588, 663497591, System.identityHashCode(ajcVar))}, 1669444485, -1669444480, (int) System.currentTimeMillis());
            ajg[] ajgVarArr = (ajg[]) ajh.setDividerPadding(new Object[]{ajhVar}, -1505918645, 1505918645, System.identityHashCode(ajhVar));
            int i21 = f55463t0 + 80;
            int i22 = (i21 ^ (-1)) + (i21 << 1);
            f55464u0 = i22 % 128;
            int i23 = i22 % 2;
            int i24 = 0;
            while (i24 < ajgVarArr.length) {
                int i25 = f55463t0;
                int i26 = i25 & 71;
                int i27 = (((i25 | 71) & (~i26)) - (~(i26 << 1))) - 1;
                f55464u0 = i27 % 128;
                int i28 = i27 % 2;
                ajg ajgVar = ajgVarArr[i24];
                if (((Integer) ajg.setY(new Object[]{ajgVar}, -1465077207, 1465077209, System.identityHashCode(ajgVar))).intValue() == 4) {
                    int i29 = f55464u0;
                    int i30 = (i29 & 32) + (i29 | 32);
                    int i31 = (i30 ^ (-1)) + (i30 << 1);
                    f55463t0 = i31 % 128;
                    int i32 = i31 % 2;
                    ajg ajgVar2 = ajgVarArr[i24];
                    ain compoundDrawableTintBlendMode = ain.setCompoundDrawableTintBlendMode((add) ajg.setY(new Object[]{ajgVar2}, -1317152162, 1317152162, System.identityHashCode(ajgVar2)));
                    int i33 = f55464u0;
                    int i34 = (i33 & 101) + (i33 | 101);
                    f55463t0 = i34 % 128;
                    int i35 = i34 % 2;
                    return compoundDrawableTintBlendMode;
                }
                int i36 = ((i24 ^ (-101)) - (~((i24 & (-101)) << 1))) - 1;
                int i37 = ((i36 | 103) << 1) - (i36 ^ 103);
                i24 = (i37 << 1) + (i37 ^ (-1));
                int i38 = f55463t0;
                int i39 = i38 | 97;
                int i40 = i39 << 1;
                int i41 = -((~(i38 & 97)) & i39);
                int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                f55464u0 = i42 % 128;
                int i43 = i42 % 2;
            }
            int i44 = f55463t0;
            int i45 = i44 & 123;
            int i46 = (i44 | 123) & (~i45);
            int i47 = i45 << 1;
            int i48 = ((i46 | i47) << 1) - (i46 ^ i47);
            f55464u0 = i48 % 128;
            int i49 = i48 % 2;
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0251, code lost:
    
        if ((!r1) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0254, code lost:
    
        if (r1 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0256, code lost:
    
        java.lang.System.identityHashCode(r0);
        java.lang.System.identityHashCode(r0);
        r0 = com.mypinpad.tsdk.isolation.f1.f55463t0;
        r1 = (((r0 | 64) << 1) - (r0 ^ 64)) - 1;
        com.mypinpad.tsdk.isolation.f1.f55464u0 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x026a, code lost:
    
        if ((r1 % 2) != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x026c, code lost:
    
        r0 = 83 / 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object c(java.lang.Object[] r16, int r17, int r18, int r19) throws java.security.cert.CRLException {
        /*
            Method dump skipped, instruction units count: 1824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.f1.c(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static /* synthetic */ HashSet d(Object[] objArr) {
        f1 f1Var = (f1) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i10 = f55464u0;
        int i11 = (-2) - (((i10 & 18) + (i10 | 18)) ^ (-1));
        f55463t0 = i11 % 128;
        if (i11 % 2 != 0) {
            ajn.setDividerPadding setdividerpadding = f1Var.f55465p0;
            throw null;
        }
        ajn.setDividerPadding setdividerpadding2 = f1Var.f55465p0;
        aje ajeVar = (aje) ajn.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding2}, 654586412, -654586409, System.identityHashCode(setdividerpadding2));
        if (ajeVar == null) {
            int i12 = f55464u0;
            int i13 = i12 & 15;
            int i14 = i13 + ((i12 ^ 15) | i13);
            f55463t0 = i14 % 128;
            if (i14 % 2 == 0) {
                return null;
            }
            throw null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumeration = (Enumeration) aje.setY(new Object[]{ajeVar}, -851154266, 851154268, System.identityHashCode(ajeVar));
        int i15 = f55464u0;
        int i16 = (((i15 & (-56)) | ((~i15) & 55)) - (~(-(-((i15 & 55) << 1))))) - 1;
        f55463t0 = i16 % 128;
        int i17 = i16 % 2;
        while (!(!enumeration.hasMoreElements())) {
            int i18 = f55463t0;
            int i19 = i18 & 113;
            int i20 = (i18 | 113) & (~i19);
            int i21 = -(-(i19 << 1));
            int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
            f55464u0 = i22 % 128;
            if (i22 % 2 == 0) {
                ajc ajcVar = (ajc) aje.setY(new Object[]{ajeVar, (adu) enumeration.nextElement()}, -814074534, 814074535, System.identityHashCode(ajeVar));
                ((Boolean) ajc.setX(new Object[]{ajcVar}, -1985615408, 1985615412, System.identityHashCode(ajcVar))).booleanValue();
                throw null;
            }
            adu aduVar = (adu) enumeration.nextElement();
            ajc ajcVar2 = (ajc) aje.setY(new Object[]{ajeVar, aduVar}, -814074534, 814074535, System.identityHashCode(ajeVar));
            if (zBooleanValue == ((Boolean) ajc.setX(new Object[]{ajcVar2}, -1985615408, 1985615412, System.identityHashCode(ajcVar2))).booleanValue()) {
                int i23 = f55463t0 + 119;
                f55464u0 = i23 % 128;
                int i24 = i23 % 2;
                hashSet.add((String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar)));
                int i25 = f55463t0;
                int i26 = i25 & 101;
                int i27 = (i25 ^ 101) | i26;
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                f55464u0 = i28 % 128;
                int i29 = i28 % 2;
            }
            int i30 = f55464u0;
            int i31 = i30 & 101;
            int i32 = -(-(i30 | 101));
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            f55463t0 = i33 % 128;
            int i34 = i33 % 2;
        }
        int i35 = f55464u0;
        int i36 = i35 & 115;
        int i37 = ((i35 ^ 115) | i36) << 1;
        int i38 = -((i35 | 115) & (~i36));
        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
        f55463t0 = i39 % 128;
        if (i39 % 2 != 0) {
            int i40 = 96 / 0;
        }
        return hashSet;
    }

    public static /* synthetic */ Object e(Object[] objArr) {
        f1 f1Var = (f1) objArr[0];
        ajc ajcVar = (ajc) c(new Object[]{f1Var, new adu((String) objArr[1])}, -2084474750, 2084474751, System.identityHashCode(f1Var));
        if (ajcVar == null) {
            int i10 = f55464u0;
            int i11 = i10 & 77;
            int i12 = -(-((i10 ^ 77) | i11));
            int i13 = (i11 & i12) + (i12 | i11);
            f55463t0 = i13 % 128;
            int i14 = i13 % 2;
            return null;
        }
        int i15 = f55463t0;
        int i16 = i15 ^ 89;
        int i17 = (i15 & 89) << 1;
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        f55464u0 = i18 % 128;
        try {
            if (i18 % 2 == 0) {
                ((ads) ajc.setX(new Object[]{ajcVar}, -1225763701, 1225763708, System.identityHashCode(ajcVar))).setAlwaysDrawnWithCacheEnabled();
                throw null;
            }
            byte[] alwaysDrawnWithCacheEnabled = ((ads) ajc.setX(new Object[]{ajcVar}, -1225763701, 1225763708, System.identityHashCode(ajcVar))).setAlwaysDrawnWithCacheEnabled();
            int i19 = f55464u0;
            int i20 = i19 & 97;
            int i21 = -(-((i19 ^ 97) | i20));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f55463t0 = i22 % 128;
            if (i22 % 2 == 0) {
                return alwaysDrawnWithCacheEnabled;
            }
            throw null;
        } catch (Exception e5) {
            StringBuilder sb2 = new StringBuilder("Exception encoding: ");
            sb2.append(e5.toString());
            throw new IllegalStateException(sb2.toString());
        }
    }

    @Override // java.security.cert.X509CRLEntry
    public final boolean equals(Object obj) {
        return ((Boolean) c(new Object[]{this, obj}, -509567917, 509567925, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.cert.X509CRLEntry
    public final X500Principal getCertificateIssuer() {
        return (X500Principal) c(new Object[]{this}, -2006828008, 2006828018, System.identityHashCode(this));
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        return (Set) c(new Object[]{this}, -1931277912, 1931277924, System.identityHashCode(this));
    }

    @Override // java.security.cert.X509CRLEntry
    public final byte[] getEncoded() throws CRLException {
        return (byte[]) c(new Object[]{this}, -1332244222, 1332244222, System.identityHashCode(this));
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        return (byte[]) c(new Object[]{this, str}, -1492926462, 1492926465, System.identityHashCode(this));
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        return (Set) c(new Object[]{this}, 906524238, -906524224, System.identityHashCode(this));
    }

    @Override // java.security.cert.X509CRLEntry
    public final Date getRevocationDate() {
        return (Date) c(new Object[]{this}, 1692741581, -1692741576, System.identityHashCode(this));
    }

    @Override // java.security.cert.X509CRLEntry
    public final BigInteger getSerialNumber() {
        return (BigInteger) c(new Object[]{this}, -881858741, 881858752, System.identityHashCode(this));
    }

    @Override // java.security.cert.X509CRLEntry
    public final boolean hasExtensions() {
        return ((Boolean) c(new Object[]{this}, 1446200232, -1446200225, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        return ((Boolean) c(new Object[]{this}, 809198802, -809198793, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.cert.X509CRLEntry
    public final int hashCode() {
        return ((Integer) c(new Object[]{this}, -377191769, 377191782, System.identityHashCode(this))).intValue();
    }

    @Override // java.security.cert.X509CRLEntry
    public final String toString() {
        return (String) c(new Object[]{this}, -1780722, 1780728, System.identityHashCode(this));
    }
}
