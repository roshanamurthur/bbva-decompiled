package com.mypinpad.tsdk.isolation;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public abstract class adw implements add, ben {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static int f52518p0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f52519q0 = 1;

    public static /* synthetic */ Object setOnLongClickListener(Object[] objArr, int i10, int i11, int i12) throws IOException {
        adw adwVar = (adw) objArr[0];
        String str = (String) objArr[1];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        adwVar.UiMessageCallbackKtWhenMappings().setDividerPadding(byteArrayOutputStream, str);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int i13 = f52519q0 + 63;
        f52518p0 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 35 / 0;
        }
        return byteArray;
    }

    @Override // com.mypinpad.tsdk.isolation.add
    public abstract ady UiMessageCallbackKtWhenMappings();

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if ((!(r7 instanceof com.mypinpad.tsdk.isolation.add)) == true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        r0 = UiMessageCallbackKtWhenMappings();
        r7 = ((java.lang.Boolean) com.mypinpad.tsdk.isolation.ady.setNavigationOnClickListener(new java.lang.Object[]{r0, ((com.mypinpad.tsdk.isolation.add) r7).UiMessageCallbackKtWhenMappings()}, -109201153, 109201153, java.lang.System.identityHashCode(r0))).booleanValue();
        r0 = com.mypinpad.tsdk.isolation.adw.f52519q0;
        r1 = (r0 | 115) << 1;
        r0 = -(((~r0) & 115) | (r0 & (-116)));
        r2 = ((r1 | r0) << 1) - (r0 ^ r1);
        com.mypinpad.tsdk.isolation.adw.f52518p0 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        r1 = r1 + 115;
        r7 = r1 % 128;
        com.mypinpad.tsdk.isolation.adw.f52518p0 = r7;
        r1 = r1 % 2;
        r0 = (r7 ^ 48) + ((r7 & 48) << 1);
        r7 = (r0 ^ (-1)) + (r0 << 1);
        com.mypinpad.tsdk.isolation.adw.f52519q0 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
    
        if ((r7 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        r7 = 99 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        r7 = (r0 & 51) + (r0 | 51);
        com.mypinpad.tsdk.isolation.adw.f52519q0 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if ((r7 % 2) != 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = com.mypinpad.tsdk.isolation.adw.f52518p0
            r1 = r0 & 37
            int r2 = ~r1
            r3 = r0 | 37
            r2 = r2 & r3
            r3 = 1
            int r1 = r1 << r3
            int r1 = ~r1
            int r2 = r2 - r1
            int r2 = r2 - r3
            int r1 = r2 % 128
            com.mypinpad.tsdk.isolation.adw.f52519q0 = r1
            r4 = 2
            int r2 = r2 % r4
            r5 = 0
            if (r2 != 0) goto L1b
            r2 = 6
            int r2 = r2 / r5
            if (r6 != r7) goto L2b
            goto L1d
        L1b:
            if (r6 != r7) goto L2b
        L1d:
            r7 = r0 & 51
            r0 = r0 | 51
            int r7 = r7 + r0
            int r0 = r7 % 128
            com.mypinpad.tsdk.isolation.adw.f52519q0 = r0
            int r7 = r7 % r4
            if (r7 != 0) goto L2a
            r3 = r5
        L2a:
            return r3
        L2b:
            boolean r0 = r7 instanceof com.mypinpad.tsdk.isolation.add
            r0 = r0 ^ r3
            r2 = 115(0x73, float:1.61E-43)
            if (r0 == r3) goto L6c
            com.mypinpad.tsdk.i.add r7 = (com.mypinpad.tsdk.isolation.add) r7
            com.mypinpad.tsdk.i.ady r0 = r6.UiMessageCallbackKtWhenMappings()
            com.mypinpad.tsdk.i.ady r7 = r7.UiMessageCallbackKtWhenMappings()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r0
            r1[r3] = r7
            int r7 = java.lang.System.identityHashCode(r0)
            r0 = -109201153(0xfffffffff97db8ff, float:-8.2337704E34)
            r5 = 109201153(0x6824701, float:4.9004896E-35)
            java.lang.Object r7 = com.mypinpad.tsdk.isolation.ady.setNavigationOnClickListener(r1, r0, r5, r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            int r0 = com.mypinpad.tsdk.isolation.adw.f52519q0
            r1 = r0 | 115(0x73, float:1.61E-43)
            int r1 = r1 << r3
            r5 = r0 & (-116(0xffffffffffffff8c, float:NaN))
            int r0 = ~r0
            r0 = r0 & r2
            r0 = r0 | r5
            int r0 = -r0
            r2 = r1 | r0
            int r2 = r2 << r3
            r0 = r0 ^ r1
            int r2 = r2 - r0
            int r0 = r2 % 128
            com.mypinpad.tsdk.isolation.adw.f52518p0 = r0
            int r2 = r2 % r4
            return r7
        L6c:
            int r1 = r1 + r2
            int r7 = r1 % 128
            com.mypinpad.tsdk.isolation.adw.f52518p0 = r7
            int r1 = r1 % r4
            r0 = r7 ^ 48
            r7 = r7 & 48
            int r7 = r7 << r3
            int r0 = r0 + r7
            r7 = r0 ^ (-1)
            int r0 = r0 << r3
            int r7 = r7 + r0
            int r0 = r7 % 128
            com.mypinpad.tsdk.isolation.adw.f52519q0 = r0
            int r7 = r7 % r4
            if (r7 != 0) goto L86
            r7 = 99
            int r7 = r7 / r5
        L86:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.adw.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i10 = f52519q0;
        int i11 = (((i10 | 66) << 1) - (i10 ^ 66)) - 1;
        f52518p0 = i11 % 128;
        int i12 = i11 % 2;
        int iHashCode = UiMessageCallbackKtWhenMappings().hashCode();
        System.identityHashCode(this);
        System.identityHashCode(this);
        return iHashCode;
    }

    @Override // com.mypinpad.tsdk.isolation.ben
    public byte[] setAlwaysDrawnWithCacheEnabled() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        UiMessageCallbackKtWhenMappings().setDividerPadding(byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int i10 = f52519q0;
        int i11 = i10 & 21;
        int i12 = (i10 | 21) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        f52518p0 = i14 % 128;
        if (i14 % 2 == 0) {
            return byteArray;
        }
        throw null;
    }

    public void setDividerPadding(OutputStream outputStream, String str) throws IOException {
        int i10 = f52518p0 + 27;
        f52519q0 = i10 % 128;
        int i11 = i10 % 2;
        UiMessageCallbackKtWhenMappings().setDividerPadding(outputStream, str);
        int i12 = f52519q0 + 45;
        f52518p0 = i12 % 128;
        int i13 = i12 % 2;
    }

    public final byte[] setX(String str) throws IOException {
        return (byte[]) setOnLongClickListener(new Object[]{this, str}, -2049344731, 2049344731, System.identityHashCode(this));
    }

    public void setDividerPadding(OutputStream outputStream) throws IOException {
        int i10 = f52518p0;
        int i11 = (i10 & (-36)) | ((~i10) & 35);
        int i12 = (i10 & 35) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f52519q0 = i13 % 128;
        int i14 = i13 % 2;
        UiMessageCallbackKtWhenMappings().setDividerPadding(outputStream);
        if (i14 == 0) {
            throw null;
        }
        int i15 = f52519q0 + 40;
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        f52518p0 = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }
}
