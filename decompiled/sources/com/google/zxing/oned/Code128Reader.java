package com.google.zxing.oned;

/* JADX INFO: loaded from: classes10.dex */
public final class Code128Reader extends OneDReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[][] f49916a = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x018a  */
    /* JADX WARN: Code duplicated, block: B:102:0x018f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0196  */
    /* JADX WARN: Code duplicated, block: B:104:0x0198 A[PHI: r6 r20
      0x0198: PHI (r6v12 char) = (r6v11 char), (r6v14 char) binds: [B:121:0x01c3, B:103:0x0196] A[DONT_GENERATE, DONT_INLINE]
      0x0198: PHI (r20v6 boolean) = (r20v4 boolean), (r20v7 boolean) binds: [B:121:0x01c3, B:103:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:105:0x019c  */
    /* JADX WARN: Code duplicated, block: B:106:0x019e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x01a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:114:0x01af  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:118:0x01bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:128:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:129:0x01df  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:180:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00da  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e5 A[LOOP:4: B:49:0x00e3->B:50:0x00e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x010b A[PHI: r3 r19 r20
      0x010b: PHI (r3v13 ??) = 
      (r3v6 ??)
      (r3v6 ??)
      (r3v6 ??)
      (r3v6 ??)
      (r3v6 ??)
      (r3v6 ??)
      (r3v18 ??)
      (r3v23 ??)
      (r3v6 ??)
      (r3v6 ??)
      (r3v6 ??)
      (r3v6 ??)
     binds: [B:53:0x00f3, B:96:0x017e, B:98:0x0182, B:102:0x018f, B:101:0x018a, B:88:0x0163, B:83:0x0150, B:60:0x010a, B:70:0x0128, B:72:0x012c, B:76:0x0138, B:75:0x0134] A[DONT_GENERATE, DONT_INLINE]
      0x010b: PHI (r19v2 boolean) = 
      (r19v1 boolean)
      (r19v1 boolean)
      (r19v1 boolean)
      (r19v1 boolean)
      (r19v1 boolean)
      (r19v4 boolean)
      (r19v1 boolean)
      (r19v1 boolean)
      (r19v1 boolean)
      (r19v1 boolean)
      (r19v1 boolean)
      (r19v1 boolean)
     binds: [B:53:0x00f3, B:96:0x017e, B:98:0x0182, B:102:0x018f, B:101:0x018a, B:88:0x0163, B:83:0x0150, B:60:0x010a, B:70:0x0128, B:72:0x012c, B:76:0x0138, B:75:0x0134] A[DONT_GENERATE, DONT_INLINE]
      0x010b: PHI (r20v3 boolean) = 
      (r20v2 boolean)
      (r20v7 boolean)
      (r20v7 boolean)
      (r20v7 boolean)
      (r20v7 boolean)
      (r20v9 boolean)
      (r20v12 boolean)
      (r20v2 boolean)
      (r20v17 boolean)
      (r20v17 boolean)
      (r20v17 boolean)
      (r20v17 boolean)
     binds: [B:53:0x00f3, B:96:0x017e, B:98:0x0182, B:102:0x018f, B:101:0x018a, B:88:0x0163, B:83:0x0150, B:60:0x010a, B:70:0x0128, B:72:0x012c, B:76:0x0138, B:75:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0114  */
    /* JADX WARN: Code duplicated, block: B:66:0x011b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0124  */
    /* JADX WARN: Code duplicated, block: B:70:0x0128  */
    /* JADX WARN: Code duplicated, block: B:72:0x012c  */
    /* JADX WARN: Code duplicated, block: B:73:0x012e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0134  */
    /* JADX WARN: Code duplicated, block: B:76:0x0138  */
    /* JADX WARN: Code duplicated, block: B:77:0x013e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0140 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x0142 A[PHI: r20
      0x0142: PHI (r20v16 boolean) = (r20v7 boolean), (r20v17 boolean) binds: [B:106:0x019e, B:78:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x014b A[PHI: r20
      0x014b: PHI (r20v13 boolean) = (r20v7 boolean), (r20v17 boolean) binds: [B:109:0x01a3, B:81:0x0149] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0150 A[PHI: r20
      0x0150: PHI (r20v12 boolean) = (r20v7 boolean), (r20v7 boolean), (r20v17 boolean), (r20v17 boolean) binds: [B:108:0x01a1, B:109:0x01a3, B:80:0x0147, B:81:0x0149] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0152  */
    /* JADX WARN: Code duplicated, block: B:85:0x0157 A[PHI: r20
      0x0157: PHI (r20v11 boolean) = (r20v7 boolean), (r20v17 boolean) binds: [B:96:0x017e, B:70:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x015c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0163 A[PHI: r20
      0x0163: PHI (r20v9 boolean) = (r20v7 boolean), (r20v17 boolean) binds: [B:95:0x017c, B:69:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x016a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0171  */
    /* JADX WARN: Code duplicated, block: B:93:0x0178 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x017a  */
    /* JADX WARN: Code duplicated, block: B:96:0x017e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0182  */
    /* JADX WARN: Code duplicated, block: B:99:0x0184  */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x0128. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:96:0x017e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.google.zxing.common.BitArray] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.google.zxing.oned.OneDReader
    public com.google.zxing.Result decodeRow(int r28, com.google.zxing.common.BitArray r29, java.util.Map<com.google.zxing.DecodeHintType, ?> r30) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.Code128Reader.decodeRow(int, com.google.zxing.common.BitArray, java.util.Map):com.google.zxing.Result");
    }
}
