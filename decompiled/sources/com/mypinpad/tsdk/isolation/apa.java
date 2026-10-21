package com.mypinpad.tsdk.isolation;

import java.util.HashMap;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: loaded from: classes10.dex */
public final class apa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f53442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53443b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53444c = 1;

    static {
        HashMap map = new HashMap();
        f53442a = map;
        HashMap map2 = new HashMap();
        map.put(ahv.setLayoutAnimation, "MD2");
        map.put(ahv.setOnLongClickListener, "MD4");
        map.put(ahv.setTextAlignment, "MD5");
        adu aduVar = ahr.setCompoundDrawableTintBlendMode;
        map.put(aduVar, McElieceCCA2KeyGenParameterSpec.SHA1);
        adu aduVar2 = ahp.getNavBarTitleString;
        map.put(aduVar2, McElieceCCA2KeyGenParameterSpec.SHA224);
        adu aduVar3 = ahp.setDividerPadding;
        map.put(aduVar3, "SHA-256");
        adu aduVar4 = ahp.setCompoundDrawableTintBlendMode;
        map.put(aduVar4, McElieceCCA2KeyGenParameterSpec.SHA384);
        adu aduVar5 = ahp.setOnFocusChangeListener;
        map.put(aduVar5, "SHA-512");
        map.put(ahp.setOnLongClickListener, "SHA-512(224)");
        map.put(ahp.setLayoutAnimation, "SHA-512(256)");
        map.put(aid.setOnFocusChangeListener, "RIPEMD-128");
        map.put(aid.setY, "RIPEMD-160");
        map.put(aid.setDividerPadding, "RIPEMD-128");
        map.put(ahn.setDividerPadding, "RIPEMD-128");
        map.put(ahn.setOnFocusChangeListener, "RIPEMD-160");
        map.put(aha.setX, "GOST3411");
        map.put(ahf.setX, "Tiger");
        map.put(ahn.setY, "Whirlpool");
        adu aduVar6 = ahp.setOnDragListener;
        map.put(aduVar6, "SHA3-224");
        adu aduVar7 = ahp.setNavigationOnClickListener;
        map.put(aduVar7, "SHA3-256");
        adu aduVar8 = ahp.setTextAlignment;
        map.put(aduVar8, "SHA3-384");
        adu aduVar9 = ahp.UiMessageCallbackKtWhenMappings;
        map.put(aduVar9, "SHA3-512");
        map.put(ahp.setIncludeFontPadding, "SHAKE128");
        map.put(ahp.setZ, "SHAKE256");
        map.put(ahg.setOnFocusChangeListener, "SM3");
        adu aduVar10 = ahm.setLayoutAnimation;
        map.put(aduVar10, "BLAKE3-256");
        map2.put(McElieceCCA2KeyGenParameterSpec.SHA1, new aiw(aduVar, afq.setY));
        map2.put(McElieceCCA2KeyGenParameterSpec.SHA224, new aiw(aduVar2));
        map2.put("SHA224", new aiw(aduVar2));
        map2.put("SHA-256", new aiw(aduVar3));
        map2.put("SHA256", new aiw(aduVar3));
        map2.put(McElieceCCA2KeyGenParameterSpec.SHA384, new aiw(aduVar4));
        map2.put("SHA384", new aiw(aduVar4));
        map2.put("SHA-512", new aiw(aduVar5));
        map2.put("SHA512", new aiw(aduVar5));
        map2.put("SHA3-224", new aiw(aduVar6));
        map2.put("SHA3-256", new aiw(aduVar7));
        map2.put("SHA3-384", new aiw(aduVar8));
        map2.put("SHA3-512", new aiw(aduVar9));
        map2.put("BLAKE3-256", new aiw(aduVar10));
        int i10 = f53443b;
        int i11 = ((i10 ^ 87) | (i10 & 87)) << 1;
        int i12 = -(((~i10) & 87) | (i10 & (-88)));
        int i13 = (i11 & i12) + (i12 | i11);
        f53444c = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        r1 = 28 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        r1 = (java.lang.String) com.mypinpad.tsdk.isolation.adu.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1}, 412071809, -412071801, java.lang.System.identityHashCode(r1));
        r2 = com.mypinpad.tsdk.isolation.apa.f53443b;
        r4 = r2 | 65;
        r0 = r4 << 1;
        r2 = -((~(r2 & 65)) & r4);
        r3 = ((r0 | r2) << 1) - (r2 ^ r0);
        com.mypinpad.tsdk.isolation.apa.f53444c = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        if ((r3 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.apa.f53444c + 73;
        com.mypinpad.tsdk.isolation.apa.f53443b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if ((r1 % 2) == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setY(java.lang.Object[] r1, int r2, int r3, int r4) {
        /*
            r2 = 0
            r1 = r1[r2]
            com.mypinpad.tsdk.i.adu r1 = (com.mypinpad.tsdk.isolation.adu) r1
            int r3 = com.mypinpad.tsdk.isolation.apa.f53443b
            r4 = r3 & 88
            r3 = r3 | 88
            int r4 = r4 + r3
            int r4 = r4 + (-1)
            int r3 = r4 % 128
            com.mypinpad.tsdk.isolation.apa.f53444c = r3
            int r4 = r4 % 2
            java.util.HashMap r3 = com.mypinpad.tsdk.isolation.apa.f53442a
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            if (r4 != 0) goto L24
            r4 = 75
            int r4 = r4 / r2
            if (r3 == 0) goto L36
            goto L26
        L24:
            if (r3 == 0) goto L36
        L26:
            int r1 = com.mypinpad.tsdk.isolation.apa.f53444c
            int r1 = r1 + 73
            int r4 = r1 % 128
            com.mypinpad.tsdk.isolation.apa.f53443b = r4
            int r1 = r1 % 2
            if (r1 == 0) goto L65
            r1 = 28
            int r1 = r1 / r2
            goto L65
        L36:
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r1
            int r1 = java.lang.System.identityHashCode(r1)
            r2 = 412071809(0x188fb781, float:3.7149925E-24)
            r0 = -412071801(0xffffffffe7704887, float:-1.13470585E24)
            java.lang.Object r1 = com.mypinpad.tsdk.isolation.adu.setCompoundDrawableTintBlendMode(r4, r2, r0, r1)
            java.lang.String r1 = (java.lang.String) r1
            int r2 = com.mypinpad.tsdk.isolation.apa.f53443b
            r4 = r2 | 65
            int r0 = r4 << 1
            r2 = r2 & 65
            int r2 = ~r2
            r2 = r2 & r4
            int r2 = -r2
            r4 = r0 | r2
            int r3 = r4 << 1
            r2 = r2 ^ r0
            int r3 = r3 - r2
            int r2 = r3 % 128
            com.mypinpad.tsdk.isolation.apa.f53444c = r2
            int r3 = r3 % 2
            if (r3 == 0) goto L66
            r3 = r1
        L65:
            return r3
        L66:
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.apa.setY(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static String setY(adu aduVar) {
        return (String) setY(new Object[]{aduVar}, 1853690842, -1853690842, (int) System.currentTimeMillis());
    }
}
