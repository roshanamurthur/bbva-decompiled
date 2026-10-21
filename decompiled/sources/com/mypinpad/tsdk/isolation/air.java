package com.mypinpad.tsdk.isolation;

import java.util.Hashtable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class air implements aiq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f52810a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52811b = 1;

    public static Hashtable setOnFocusChangeListener(Hashtable hashtable) {
        return (Hashtable) setY(new Object[]{hashtable}, -1414989669, 1414989673, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0180  */
    /* JADX WARN: Code restructure failed: missing block: B:158:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:?, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0258, code lost:
    
        if (r0 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x025c, code lost:
    
        if ((!r0) != true) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x025e, code lost:
    
        r0 = r5 & 117;
        r3 = (r5 ^ 117) | r0;
        r4 = ((r0 | r3) << 1) - (r0 ^ r3);
        r0 = r4 % 128;
        com.mypinpad.tsdk.isolation.air.f52810a = r0;
        r4 = r4 % 2;
        r3 = r2.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x026e, code lost:
    
        if (r4 == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0270, code lost:
    
        r4 = ((((r3 ^ (-1)) | r3) << 1) - (~(-(~r3)))) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x027a, code lost:
    
        r4 = ((r3 ^ (-1)) | r3) << 1;
        r3 = -(~r3);
        r4 = (r4 & r3) + (r3 | r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0285, code lost:
    
        r0 = r0 + 123;
        com.mypinpad.tsdk.isolation.air.f52811b = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x028c, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.air.f52811b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x028e, code lost:
    
        if (r4 < 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0290, code lost:
    
        r3 = r0 & 99;
        r0 = -(-((r0 ^ 99) | r3));
        r5 = ((r3 | r0) << 1) - (r0 ^ r3);
        com.mypinpad.tsdk.isolation.air.f52810a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02a1, code lost:
    
        if ((r5 % 2) != 0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02a3, code lost:
    
        r0 = r2[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02a5, code lost:
    
        if (r0 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02bc, code lost:
    
        if (((java.lang.Boolean) setY(new java.lang.Object[]{r1, r0}, 1270753631, -1270753629, (int) java.lang.System.currentTimeMillis())).booleanValue() == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02be, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.air.f52811b;
        r1 = r0 + 63;
        com.mypinpad.tsdk.isolation.air.f52810a = r1 % 128;
        r1 = r1 % 2;
        r2[r4] = null;
        r1 = (((r0 & (-70)) | ((~r0) & 69)) - (~(-(-((r0 & 69) << 1))))) - 1;
        com.mypinpad.tsdk.isolation.air.f52810a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02db, code lost:
    
        if ((r1 % 2) != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02e0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02e1, code lost:
    
        r4 = r4 - 1;
        r0 = com.mypinpad.tsdk.isolation.air.f52810a;
        r3 = r0 & 9;
        r0 = -(-(r0 | 9));
        r5 = ((r3 | r0) << 1) - (r0 ^ r3);
        com.mypinpad.tsdk.isolation.air.f52811b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02f6, code lost:
    
        r0 = r2[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02f9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02fa, code lost:
    
        r1 = (r0 ^ 3) + ((r0 & 3) << 1);
        com.mypinpad.tsdk.isolation.air.f52810a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0306, code lost:
    
        r3 = r3 + 57;
        com.mypinpad.tsdk.isolation.air.f52811b = r3 % 128;
        r3 = r3 % 2;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x030f, code lost:
    
        if (r0 == r2.length) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0311, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.air.f52811b;
        r4 = ((r3 | 85) << 1) - (r3 ^ 85);
        com.mypinpad.tsdk.isolation.air.f52810a = r4 % 128;
        r4 = r4 % 2;
        r4 = r2[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0320, code lost:
    
        if (r4 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0322, code lost:
    
        r5 = (r3 & (-116)) | ((~r3) & 115);
        r3 = (r3 & 115) << 1;
        r10 = ((r5 | r3) << 1) - (r3 ^ r5);
        com.mypinpad.tsdk.isolation.air.f52810a = r10 % 128;
        r3 = new java.lang.Object[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0337, code lost:
    
        if ((r10 % 2) == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0339, code lost:
    
        r3[0] = r1;
        r3[1] = r4;
        r4 = 75 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0350, code lost:
    
        if ((!((java.lang.Boolean) setY(r3, 1270753631, -1270753629, (int) java.lang.System.currentTimeMillis())).booleanValue()) == true) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0353, code lost:
    
        r3[0] = r1;
        r3[1] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0366, code lost:
    
        if (((java.lang.Boolean) setY(r3, 1270753631, -1270753629, (int) java.lang.System.currentTimeMillis())).booleanValue() == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0368, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.air.f52811b;
        r3 = ((r1 | 100) << 1) - (r1 ^ 100);
        r4 = (r3 ^ (-1)) + (r3 << 1);
        com.mypinpad.tsdk.isolation.air.f52810a = r4 % 128;
        r4 = r4 % 2;
        r2[r0] = null;
        r0 = (-2) - ((r1 + 26) ^ (-1));
        com.mypinpad.tsdk.isolation.air.f52810a = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0387, code lost:
    
        if ((r0 % 2) == 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0389, code lost:
    
        r0 = 7 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x038f, code lost:
    
        r0 = (r0 | 1) + (r0 & 1);
        r3 = com.mypinpad.tsdk.isolation.air.f52811b + 33;
        com.mypinpad.tsdk.isolation.air.f52810a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x039f, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.air.f52811b + 65;
        com.mypinpad.tsdk.isolation.air.f52810a = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x03a8, code lost:
    
        if ((r0 % 2) == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x03aa, code lost:
    
        r0 = 55 / 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setY(java.lang.Object[] r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 1734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.air.setY(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.aiq
    public final boolean setY(ain ainVar, ain ainVar2) {
        return ((Boolean) setY(new Object[]{this, ainVar, ainVar2}, 45075628, -45075628, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aiq
    public final int setY(ain ainVar) {
        return ((Integer) setY(new Object[]{this, ainVar}, 933852185, -933852184, System.identityHashCode(this))).intValue();
    }
}
