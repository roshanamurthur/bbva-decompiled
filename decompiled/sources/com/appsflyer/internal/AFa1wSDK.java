package com.appsflyer.internal;

/* JADX INFO: loaded from: classes2.dex */
public class AFa1wSDK {
    private static Object AppsFlyer2dXConversionCallback = null;
    public static byte[] afWarnLog = null;
    private static Object init = null;
    public static byte[] onAppOpenAttributionNative = null;
    public static final int onAttributionFailureNative = 0;
    public static byte[] onConversionDataSuccess = null;
    private static int onDeepLinking = 1;
    private static int onDeepLinkingNative;
    public static int onInstallConversionDataLoadedNative;
    public static long onInstallConversionFailureNative;
    public static final byte[] onResponseErrorNative = null;
    public static int onResponseNative;

    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0035  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:11:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x003b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(short r7, short r8, int r9) {
        /*
            int r0 = com.appsflyer.internal.AFa1wSDK.onDeepLinkingNative
            int r0 = r0 + 41
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1wSDK.onDeepLinking = r1
            int r0 = r0 % 2
            r0 = r7 | 4
            int r0 = r0 << 1
            r7 = r7 ^ 4
            int r0 = r0 - r7
            int r7 = r8 + 1
            int r9 = -r9
            r2 = r9 ^ 119(0x77, float:1.67E-43)
            r9 = r9 & 119(0x77, float:1.67E-43)
            int r9 = r9 << 1
            int r2 = r2 + r9
            byte[] r9 = com.appsflyer.internal.AFa1wSDK.onResponseErrorNative
            byte[] r7 = new byte[r7]
            r3 = 0
            if (r9 != 0) goto L2d
            int r1 = r1 + 65
            int r4 = r1 % 128
            com.appsflyer.internal.AFa1wSDK.onDeepLinkingNative = r4
            int r1 = r1 % 2
            r1 = r0
            r4 = r3
            goto L42
        L2d:
            r1 = r3
        L2e:
            byte r4 = (byte) r2
            r7[r1] = r4
            int r4 = r1 + 1
            if (r1 != r8) goto L3b
            java.lang.String r8 = new java.lang.String
            r8.<init>(r7, r3)
            return r8
        L3b:
            int r0 = r0 + 1
            r1 = r9[r0]
            r6 = r1
            r1 = r0
            r0 = r6
        L42:
            int r0 = -r0
            int r0 = -r0
            int r0 = ~r0
            int r2 = r2 - r0
            int r2 = r2 + (-1)
            r0 = r2 & (-3)
            r2 = r2 | (-3)
            int r2 = r2 + r0
            int r0 = com.appsflyer.internal.AFa1wSDK.onDeepLinkingNative
            r5 = r0 ^ 83
            r0 = r0 & 83
            int r0 = r0 << 1
            int r5 = r5 + r0
            int r0 = r5 % 128
            com.appsflyer.internal.AFa1wSDK.onDeepLinking = r0
            int r5 = r5 % 2
            r0 = r1
            r1 = r4
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1wSDK.$$c(short, short, int):java.lang.String");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 63961. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    static {
        /*
            Method dump skipped, instruction units count: 6396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1wSDK.<clinit>():void");
    }

    private AFa1wSDK() {
    }

    public static int AFInAppEventParameterName(int i10) throws Throwable {
        int i11 = onDeepLinkingNative + 19;
        int i12 = i11 % 128;
        onDeepLinking = i12;
        if (i11 % 2 == 0) {
            throw null;
        }
        Object obj = init;
        int i13 = i12 + 75;
        onDeepLinkingNative = i13 % 128;
        int i14 = i13 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i10)};
            int i15 = onAttributionFailureNative;
            byte[] bArr = onResponseErrorNative;
            int iIntValue = ((Integer) Class.forName($$c((short) ((i15 ^ 674) | (i15 & 674)), bArr[1], bArr[416]), true, (ClassLoader) AppsFlyer2dXConversionCallback).getMethod($$c((short) (i15 | 390), bArr[18], bArr[25]), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i16 = onDeepLinking;
            int i17 = (i16 ^ 119) + ((i16 & 119) << 1);
            onDeepLinkingNative = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 39 / 0;
            }
            return iIntValue;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static int AFKeystoreWrapper(Object obj) throws Throwable {
        int i10 = onDeepLinking + 57;
        int i11 = i10 % 128;
        onDeepLinkingNative = i11;
        int i12 = i10 % 2;
        Object obj2 = init;
        int i13 = i11 + 113;
        int i14 = i13 % 128;
        onDeepLinking = i14;
        int i15 = i13 % 2;
        int i16 = i14 + 53;
        onDeepLinkingNative = i16 % 128;
        int i17 = i16 % 2;
        try {
            Object[] objArr = {obj};
            int i18 = onAttributionFailureNative;
            byte[] bArr = onResponseErrorNative;
            int iIntValue = ((Integer) Class.forName($$c((short) ((i18 ^ 674) | (i18 & 674)), bArr[1], bArr[416]), true, (ClassLoader) AppsFlyer2dXConversionCallback).getMethod($$c((short) ((i18 & 390) | (i18 ^ 390)), bArr[18], bArr[25]), Object.class).invoke(obj2, objArr)).intValue();
            int i19 = onDeepLinkingNative;
            int i20 = (i19 ^ 95) + ((i19 & 95) << 1);
            onDeepLinking = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 16 / 0;
            }
            return iIntValue;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static void init$0() {
        int i10 = onDeepLinkingNative + 1;
        onDeepLinking = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArr = new byte[1090];
        System.arraycopy("p \u0005à\u000f\u0001\u0006ÿü\u0016ß\u001eÚ)\u0006õ\u0016ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍD\u0007¾%%\u0000÷\u0005\u0011\u0003ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010öÿ\u0006å2ú\u0003\u0010\u0010ù\u0011\u0000ýþÍKöÿ\u0015º+\u0016ÿ\u0015\u0001\u0012Õ&\u0006ü\u0011Ô(\fþú\u000eô\u0001\u0012Ò!\u0005\b\u0000â(\föÿ\u0006\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\b\u0006(Ö2\u0003Ø4ò\f\tã(úø\tøø\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓLÜô\nÜ\u0003î\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸î\tí\u000bî\u0007ï\u000bî\u000bë\u000b\b\u0006(Ö2\u0003Ø4ò\f\tß\u0014\u0014ò\u000fû\u0012ô\u0010ß\u0016\u000fûú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ô6ÿô\u0010ÿö\u000eê$þ\u0006ò\t\u0001â(\fö\u0001\u0014þ\u0006\n7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ6Îú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000f\u0006õ\u0006ã$\u0016ö\u0011ÿ\u0000\ròñ\u0019\u0014îß0ùò$ð\u0016ôú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0010ù\u0011\u0000ýþÍD\u0007¾\u001a,\u000bö\f\u0000\u0002\u0002û\f\t\u0001\u0012Ô*ø\u0012\u0006õ\u0002â0\bâ\u0018\u0007ûû\u0001\n\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u00108\u0000\u0016ðÑ8\u0000\u0016ðÑ\u0004\nü\u0012ô\u0001\u0012Õ\u0001\b\b\u001d\u0017ý\u0004þ\u0006öõ\u001eò\u0012\u0003ø\u0010ô\n\u0017í\b\t\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b\u001eÓLÜô\nÜ\u0003ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\f\u0006\u0007õ7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ5Ïú\u0018îÐ>\tÂIü\u0006÷\b\f\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006ú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0001\u0010ì\u001eú\u000eôú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002ô\u0016÷ç \r\u0004\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓIßô\nÜB\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐ>\tÂ\u001b&\u0006üî\u0006ð\u000b\u0010ù\u0011\u0000ýþÍJ\u0002ø\u0006Å)(úø\u0002õ\u000e\u000e\fó\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006þÖ:þôß4\u0003ò\u001b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010þò\u0012ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000f".getBytes("ISO-8859-1"), 0, bArr, 0, 1090);
        onResponseErrorNative = bArr;
        onAttributionFailureNative = 9;
        int i12 = onDeepLinkingNative;
        int i13 = ((i12 | 37) << 1) - (i12 ^ 37);
        onDeepLinking = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public static Object AFKeystoreWrapper(int i10, int i11, char c10) throws Throwable {
        int i12 = onDeepLinking;
        int i13 = i12 + 85;
        onDeepLinkingNative = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        Object obj = init;
        int i14 = i12 + 31;
        onDeepLinkingNative = i14 % 128;
        int i15 = i14 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i10), Integer.valueOf(i11), Character.valueOf(c10)};
            int i16 = onAttributionFailureNative;
            byte[] bArr = onResponseErrorNative;
            Class<?> cls = Class.forName($$c((short) ((i16 & 674) | (i16 ^ 674)), bArr[1], bArr[416]), true, (ClassLoader) AppsFlyer2dXConversionCallback);
            String str$$c = $$c((short) 661, bArr[29], bArr[25]);
            Class<?> cls2 = Integer.TYPE;
            Object objInvoke = cls.getMethod(str$$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i17 = onDeepLinkingNative + 117;
            onDeepLinking = i17 % 128;
            int i18 = i17 % 2;
            return objInvoke;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}
