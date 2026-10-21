package com.mypinpad.tsdk.isolation;

import java.util.HashMap;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: loaded from: classes10.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f56884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final afq f56885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f56886c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f56887d = 1;

    static {
        HashMap map = new HashMap();
        f56884a = map;
        map.put(ahe.setOnFocusChangeListener, EdDSAParameterSpec.Ed25519);
        map.put(ahe.setX, EdDSAParameterSpec.Ed448);
        map.put(ahr.setY, "SHA1withDSA");
        map.put(akf.setSelectedChildViewEnabled, "SHA1withDSA");
        f56885b = afq.setY;
        int i10 = f56886c;
        int i11 = i10 & 15;
        int i12 = -(-((i10 ^ 15) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f56887d = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x070c  */
    /* JADX WARN: Code duplicated, block: B:137:0x0724  */
    /* JADX WARN: Code duplicated, block: B:139:0x0733  */
    /* JADX WARN: Code duplicated, block: B:141:0x0739  */
    /* JADX WARN: Code duplicated, block: B:52:0x02fb A[PHI: r0
      0x02fb: PHI (r0v102 java.lang.String) = (r0v97 java.lang.String), (r0v98 java.lang.String), (r0v105 java.lang.String) binds: [B:47:0x02bb, B:49:0x02cc, B:44:0x02a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0370  */
    /* JADX WARN: Code duplicated, block: B:64:0x0388  */
    /* JADX WARN: Code duplicated, block: B:68:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:76:0x0402  */
    /* JADX WARN: Code duplicated, block: B:84:0x043c  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x04bf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x04c1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0482, code lost:
    
        if (r4 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0496, code lost:
    
        if (r4 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0498, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.l1.f56886c;
        r1 = ((r0 & (-70)) | ((~r0) & 69)) + ((r0 & 69) << 1);
        com.mypinpad.tsdk.isolation.l1.f56887d = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x04a9, code lost:
    
        if ((r1 % 2) == 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x04ab, code lost:
    
        r1 = (r0 & 80) + (r0 | 80);
        r0 = (r1 ^ (-1)) + (r1 << 1);
        com.mypinpad.tsdk.isolation.l1.f56887d = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x04b9, code lost:
    
        if ((r0 % 2) == 0) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(java.lang.Object[] r18, int r19, int r20, int r21) throws java.security.NoSuchAlgorithmException, java.security.SignatureException {
        /*
            Method dump skipped, instruction units count: 2010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.l1.a(java.lang.Object[], int, int, int):java.lang.Object");
    }
}
