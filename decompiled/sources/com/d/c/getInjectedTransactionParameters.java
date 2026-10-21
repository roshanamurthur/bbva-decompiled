package com.d.c;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class getInjectedTransactionParameters {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    public static final Map<Integer, Object> CurrencyCustomFormattingConfigKt;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f39265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f39266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f39267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f39269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f39270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f39271g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f39272h = 1;

    /* JADX WARN: Code duplicated, block: B:1038:0x17cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1045:0x17bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:0x16fa A[Catch: all -> 0x1576, TryCatch #28 {all -> 0x1576, blocks: (B:642:0x1566, B:649:0x1581, B:651:0x1587, B:652:0x1588, B:654:0x158a, B:656:0x1593, B:657:0x1594, B:659:0x1596, B:661:0x159f, B:662:0x15a0, B:670:0x15ae, B:674:0x15d5, B:677:0x15f1, B:683:0x165d, B:685:0x1663, B:686:0x1664, B:688:0x1666, B:690:0x1671, B:691:0x1672, B:693:0x1674, B:695:0x167f, B:696:0x1680, B:702:0x168d, B:704:0x1693, B:705:0x1694, B:707:0x1696, B:709:0x16a2, B:710:0x16a3, B:714:0x16ab, B:716:0x16b7, B:717:0x16b8, B:719:0x16ba, B:721:0x16c6, B:722:0x16c7, B:724:0x16c9, B:726:0x16d7, B:727:0x16d8, B:739:0x16f4, B:741:0x16fa, B:742:0x16fb, B:756:0x1736, B:758:0x173c, B:759:0x173d, B:765:0x1759, B:767:0x175f, B:768:0x1760, B:770:0x1762, B:772:0x1776, B:773:0x1777, B:775:0x1779, B:777:0x178d, B:778:0x178e, B:679:0x1628, B:680:0x165a, B:267:0x084c, B:575:0x123a, B:572:0x11cf, B:265:0x0809, B:637:0x1504, B:519:0x1050, B:635:0x14b6, B:514:0x1022, B:512:0x0fdd, B:329:0x0a8b), top: B:877:0x1566, inners: #9, #14, #16, #26, #29, #39, #47, #48, #60, #69, #80 }] */
    /* JADX WARN: Code duplicated, block: B:742:0x16fb A[Catch: all -> 0x1576, TryCatch #28 {all -> 0x1576, blocks: (B:642:0x1566, B:649:0x1581, B:651:0x1587, B:652:0x1588, B:654:0x158a, B:656:0x1593, B:657:0x1594, B:659:0x1596, B:661:0x159f, B:662:0x15a0, B:670:0x15ae, B:674:0x15d5, B:677:0x15f1, B:683:0x165d, B:685:0x1663, B:686:0x1664, B:688:0x1666, B:690:0x1671, B:691:0x1672, B:693:0x1674, B:695:0x167f, B:696:0x1680, B:702:0x168d, B:704:0x1693, B:705:0x1694, B:707:0x1696, B:709:0x16a2, B:710:0x16a3, B:714:0x16ab, B:716:0x16b7, B:717:0x16b8, B:719:0x16ba, B:721:0x16c6, B:722:0x16c7, B:724:0x16c9, B:726:0x16d7, B:727:0x16d8, B:739:0x16f4, B:741:0x16fa, B:742:0x16fb, B:756:0x1736, B:758:0x173c, B:759:0x173d, B:765:0x1759, B:767:0x175f, B:768:0x1760, B:770:0x1762, B:772:0x1776, B:773:0x1777, B:775:0x1779, B:777:0x178d, B:778:0x178e, B:679:0x1628, B:680:0x165a, B:267:0x084c, B:575:0x123a, B:572:0x11cf, B:265:0x0809, B:637:0x1504, B:519:0x1050, B:635:0x14b6, B:514:0x1022, B:512:0x0fdd, B:329:0x0a8b), top: B:877:0x1566, inners: #9, #14, #16, #26, #29, #39, #47, #48, #60, #69, #80 }] */
    /* JADX WARN: Code duplicated, block: B:785:0x17b7 A[Catch: Exception -> 0x005f, TRY_ENTER, TryCatch #67 {Exception -> 0x005f, blocks: (B:3:0x002c, B:7:0x0052, B:41:0x017b, B:53:0x01c1, B:803:0x185f, B:805:0x1866, B:806:0x1867, B:808:0x1869, B:810:0x1870, B:811:0x1871, B:60:0x0245, B:66:0x0295, B:68:0x029b, B:69:0x029c, B:70:0x029d, B:72:0x02e6, B:80:0x0335, B:85:0x0348, B:90:0x0353, B:97:0x035f, B:785:0x17b7, B:787:0x17bb, B:800:0x183a, B:788:0x17c6, B:789:0x17cd, B:795:0x1816, B:797:0x181c, B:798:0x181d, B:48:0x0186, B:813:0x1873, B:815:0x187a, B:816:0x187b, B:56:0x0218, B:54:0x01d0, B:49:0x0196, B:62:0x0256, B:791:0x17e1, B:792:0x1813), top: B:950:0x002c, inners: #12, #19, #25, #46, #106 }] */
    /* JADX WARN: Code duplicated, block: B:788:0x17c6 A[Catch: Exception -> 0x005f, LOOP:3: B:784:0x17b5->B:788:0x17c6, LOOP_END, TryCatch #67 {Exception -> 0x005f, blocks: (B:3:0x002c, B:7:0x0052, B:41:0x017b, B:53:0x01c1, B:803:0x185f, B:805:0x1866, B:806:0x1867, B:808:0x1869, B:810:0x1870, B:811:0x1871, B:60:0x0245, B:66:0x0295, B:68:0x029b, B:69:0x029c, B:70:0x029d, B:72:0x02e6, B:80:0x0335, B:85:0x0348, B:90:0x0353, B:97:0x035f, B:785:0x17b7, B:787:0x17bb, B:800:0x183a, B:788:0x17c6, B:789:0x17cd, B:795:0x1816, B:797:0x181c, B:798:0x181d, B:48:0x0186, B:813:0x1873, B:815:0x187a, B:816:0x187b, B:56:0x0218, B:54:0x01d0, B:49:0x0196, B:62:0x0256, B:791:0x17e1, B:792:0x1813), top: B:950:0x002c, inners: #12, #19, #25, #46, #106 }] */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x03b6, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName(a(r6, (byte) (-r5[r15]), r5[24])).getMethod(a((short) 189, r5[135(0x87, float:1.89E-43)], r5[687(0x2af, float:9.63E-43)]), null).invoke(r14, null)).booleanValue() != false) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v75, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v10 */
    /* JADX WARN: Type inference failed for: r44v11 */
    /* JADX WARN: Type inference failed for: r44v13 */
    /* JADX WARN: Type inference failed for: r44v14 */
    /* JADX WARN: Type inference failed for: r44v15 */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r44v24, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r44v25 */
    /* JADX WARN: Type inference failed for: r44v27 */
    /* JADX WARN: Type inference failed for: r44v28 */
    /* JADX WARN: Type inference failed for: r44v29 */
    /* JADX WARN: Type inference failed for: r44v3 */
    /* JADX WARN: Type inference failed for: r44v31 */
    /* JADX WARN: Type inference failed for: r44v38 */
    /* JADX WARN: Type inference failed for: r44v4 */
    /* JADX WARN: Type inference failed for: r44v44 */
    /* JADX WARN: Type inference failed for: r44v45 */
    /* JADX WARN: Type inference failed for: r44v46 */
    /* JADX WARN: Type inference failed for: r44v47 */
    /* JADX WARN: Type inference failed for: r44v48 */
    /* JADX WARN: Type inference failed for: r44v49 */
    /* JADX WARN: Type inference failed for: r44v5 */
    /* JADX WARN: Type inference failed for: r44v50 */
    /* JADX WARN: Type inference failed for: r44v51 */
    /* JADX WARN: Type inference failed for: r44v52 */
    /* JADX WARN: Type inference failed for: r44v53 */
    /* JADX WARN: Type inference failed for: r44v54 */
    /* JADX WARN: Type inference failed for: r44v6 */
    /* JADX WARN: Type inference failed for: r44v7 */
    /* JADX WARN: Type inference failed for: r44v8 */
    /* JADX WARN: Type inference failed for: r4v274, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r8v112 */
    /* JADX WARN: Type inference failed for: r8v113 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v179 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v235 */
    /* JADX WARN: Type inference failed for: r8v236 */
    /* JADX WARN: Type inference failed for: r8v237 */
    /* JADX WARN: Type inference failed for: r8v238 */
    /* JADX WARN: Type inference failed for: r8v89 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    static {
        /*
            Method dump skipped, instruction units count: 6314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.c.getInjectedTransactionParameters.<clinit>():void");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0062 -> B:22:0x006f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.String a(short r8, short r9, short r10) {
        /*
            int r0 = com.d.c.getInjectedTransactionParameters.f39271g
            int r0 = r0 + 5
            int r1 = r0 % 128
            com.d.c.getInjectedTransactionParameters.f39272h = r1
            int r0 = r0 % 2
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L1e
            int r10 = r10 + 83
            int r9 = r9 + 51
            byte[] r0 = com.d.c.getInjectedTransactionParameters.$$a
            int r8 = 16355 - r8
            byte[] r4 = new byte[r10]
            if (r0 != 0) goto L1c
            r5 = r3
            goto L33
        L1c:
            r1 = r3
            goto L42
        L1e:
            int r10 = -r10
            int r10 = ~r10
            int r10 = 41 - r10
            r0 = r9 ^ 41
            r9 = r9 & 41
            int r9 = r9 << r3
            int r9 = r9 + r0
            byte[] r0 = com.d.c.getInjectedTransactionParameters.$$a
            int r8 = -r8
            int r8 = ~r8
            int r8 = 913 - r8
            byte[] r4 = new byte[r10]
            if (r0 != 0) goto L41
            r5 = r2
        L33:
            int r1 = r1 + 21
            int r6 = r1 % 128
            com.d.c.getInjectedTransactionParameters.f39271g = r6
            int r1 = r1 % 2
            if (r1 != 0) goto L3f
            r1 = r8
            goto L6f
        L3f:
            r8 = 0
            throw r8
        L41:
            r1 = r2
        L42:
            byte r5 = (byte) r9
            r4[r1] = r5
            r5 = r1 ^ 127(0x7f, float:1.78E-43)
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r1 = r1 << r3
            int r5 = r5 + r1
            int r5 = r5 + (-126)
            if (r5 != r10) goto L62
            java.lang.String r8 = new java.lang.String
            r8.<init>(r4, r2)
            int r9 = com.d.c.getInjectedTransactionParameters.f39271g
            r10 = r9 & 19
            r9 = r9 | 19
            int r10 = r10 + r9
            int r9 = r10 % 128
            com.d.c.getInjectedTransactionParameters.f39272h = r9
            int r10 = r10 % 2
            return r8
        L62:
            int r8 = r8 + (-118)
            r1 = r8 | 119(0x77, float:1.67E-43)
            int r1 = r1 << r3
            r8 = r8 ^ 119(0x77, float:1.67E-43)
            int r1 = r1 - r8
            r8 = r0[r1]
            r7 = r9
            r9 = r8
            r8 = r7
        L6f:
            int r9 = -r9
            r6 = r8 ^ r9
            r8 = r8 & r9
            int r8 = r8 << r3
            int r6 = r6 + r8
            int r9 = r6 + (-3)
            int r8 = com.d.c.getInjectedTransactionParameters.f39271g
            int r8 = r8 + 79
            int r6 = r8 % 128
            com.d.c.getInjectedTransactionParameters.f39272h = r6
            int r8 = r8 % 2
            r8 = r1
            r1 = r5
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.c.getInjectedTransactionParameters.a(short, short, short):java.lang.String");
    }

    public static void b() {
        int i10;
        int i11 = f39272h;
        int i12 = (i11 ^ 99) + ((i11 & 99) << 1);
        f39271g = i12 % 128;
        if (i12 % 2 != 0) {
            byte[] bArr = new byte[933];
            System.arraycopy("týaÉ\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þ\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþðð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ñ\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüðÿî(Ø\u0001\u0002ÿì\fþ\rß\u000eðø\u000fûì\b÷þ\u001bìì\u000eñ\u0005î\fðü\n\u0001ú\u001bÎ\u0006ýðð\u0007ï\u0000\u0003\u00023µ\n\u0001ëFÕê\u0001ëÿî+Úú\u0004ï,Øô\u0002\u0006ò\fÿî.ßûø\u0000\u001eØô\n\u0001ú\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ñ\bü\u0003ùÿûø\u0000\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüðÿî.Ñ\bü\u001fßûø\u0000\u001eØô÷\b\b\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïH\u0012÷\u0013õ\u0012ù\u0011õ\u0010\bñÿ<µ\n\u0001ð\bÿûò\u0000÷\u0002?¸\fö:·\u0010îù\u0002ü\u0005öþ\u0006\u0012õ\u0015õ\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüðñÿ;È2É1ëËý\u000bî(Ø\u0001\u0002ÿì\b÷þGýð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòö\u000bî\u001fê\u0001ú\u0012Þÿð\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñú\u000bú\u001dÜêÉñÿ;È2É1É3\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ññÿ<Ç3È2êËý\u000bî(Ø\u0001\u0002ÿì\b÷þGý\u0005ÿöÿî.Ô\bëý$Ú\u000búüðÈ\u0000ê\u0010/È\u0000ê\u0010/üö\u0004î\fÿî+ÿ\föé\u0013ø÷\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þôúù\u000bÉñÿ;È2É1È4\u0006è\u00120Â÷>·\u0004ú\tøôÿî!Û\u0000ü\bðûøÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001ú\nï\u0001\u0000ó\u000e\u000fçì\u0012\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñÿð\u0014â\u0006ò\f\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þ\fê\t\u0019àóüÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þ\u0006è\u00120Â÷>åÚú\u0004\u0012ú\u0010õë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú\u0002*Æ\u0002\f!Ìý\u000eåú\u000bú\u001eÔ\bëýñÿ;È2É1Åÿî(Ø\u0001\u0002ÿì\fþ\rß\u000eðø\u000fûì\b÷þ\u001bìì\u000eñ\u0005î\fðüL»\u0002\u000eî\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ".getBytes("ISO-8859-1"), 0, bArr, 0, 933);
            $$a = bArr;
            i10 = 6441;
        } else {
            byte[] bArr2 = new byte[933];
            System.arraycopy("týaÉ\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þ\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþðð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ñ\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüðÿî(Ø\u0001\u0002ÿì\fþ\rß\u000eðø\u000fûì\b÷þ\u001bìì\u000eñ\u0005î\fðü\n\u0001ú\u001bÎ\u0006ýðð\u0007ï\u0000\u0003\u00023µ\n\u0001ëFÕê\u0001ëÿî+Úú\u0004ï,Øô\u0002\u0006ò\fÿî.ßûø\u0000\u001eØô\n\u0001ú\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ñ\bü\u0003ùÿûø\u0000\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüðÿî.Ñ\bü\u001fßûø\u0000\u001eØô÷\b\b\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïH\u0012÷\u0013õ\u0012ù\u0011õ\u0010\bñÿ<µ\n\u0001ð\bÿûò\u0000÷\u0002?¸\fö:·\u0010îù\u0002ü\u0005öþ\u0006\u0012õ\u0015õ\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüðñÿ;È2É1ëËý\u000bî(Ø\u0001\u0002ÿì\b÷þGýð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòö\u000bî\u001fê\u0001ú\u0012Þÿð\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñú\u000bú\u001dÜêÉñÿ;È2É1É3\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ññÿ<Ç3È2êËý\u000bî(Ø\u0001\u0002ÿì\b÷þGý\u0005ÿöÿî.Ô\bëý$Ú\u000búüðÈ\u0000ê\u0010/È\u0000ê\u0010/üö\u0004î\fÿî+ÿ\föé\u0013ø÷\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þôúù\u000bÉñÿ;È2É1È4\u0006è\u00120Â÷>·\u0004ú\tøôÿî!Û\u0000ü\bðûøÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001ú\nï\u0001\u0000ó\u000e\u000fçì\u0012\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñÿð\u0014â\u0006ò\f\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þ\fê\t\u0019àóüÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þ\u0006è\u00120Â÷>åÚú\u0004\u0012ú\u0010õë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú\u0002*Æ\u0002\f!Ìý\u000eåú\u000bú\u001eÔ\bëýñÿ;È2É1Åÿî(Ø\u0001\u0002ÿì\fþ\rß\u000eðø\u000fûì\b÷þ\u001bìì\u000eñ\u0005î\fðüL»\u0002\u000eî\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ".getBytes("ISO-8859-1"), 0, bArr2, 0, 933);
            $$a = bArr2;
            i10 = 220;
        }
        $$b = i10;
        int i13 = f39271g;
        int i14 = ((i13 | 55) << 1) - (i13 ^ 55);
        f39272h = i14 % 128;
        int i15 = i14 % 2;
    }

    public static int inject(Object obj) throws Throwable {
        int i10 = f39271g + 79;
        int i11 = i10 % 128;
        f39272h = i11;
        int i12 = i10 % 2;
        Object obj2 = f39265a;
        int i13 = i11 + 125;
        f39271g = i13 % 128;
        int i14 = i13 % 2;
        try {
            byte[] bArr = $$a;
            int iIntValue = ((Integer) Class.forName(a((short) 386, bArr[135], bArr[6]), true, (ClassLoader) f39266b).getMethod(a((short) 561, (byte) (-bArr[532]), bArr[517]), Object.class).invoke(obj2, obj)).intValue();
            int i15 = f39271g;
            int i16 = ((i15 | 67) << 1) - (i15 ^ 67);
            f39272h = i16 % 128;
            int i17 = i16 % 2;
            return iIntValue;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static int setInjectedTransactionParameters(int i10) throws Throwable {
        int i11 = f39271g;
        int i12 = (i11 ^ 11) + ((i11 & 11) << 1);
        f39272h = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        Object obj = f39265a;
        int i13 = ((i11 | 21) << 1) - (i11 ^ 21);
        f39272h = i13 % 128;
        int i14 = i13 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i10)};
            byte[] bArr = $$a;
            int iIntValue = ((Integer) Class.forName(a((short) 386, bArr[135], bArr[6]), true, (ClassLoader) f39266b).getMethod(a((short) 561, (byte) (-bArr[532]), bArr[517]), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i15 = f39271g + 29;
            f39272h = i15 % 128;
            if (i15 % 2 != 0) {
                return iIntValue;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static Object setInjectedTransactionParameters(char c10, int i10, int i11) throws Throwable {
        Object obj = f39265a;
        int i12 = f39271g;
        int i13 = i12 + 23;
        f39272h = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 94 / 0;
        }
        int i15 = i12 + 121;
        f39272h = i15 % 128;
        int i16 = i15 % 2;
        try {
            Object[] objArr = {Character.valueOf(c10), Integer.valueOf(i10), Integer.valueOf(i11)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName(a((short) 386, bArr[135], bArr[6]), true, (ClassLoader) f39266b);
            String strA = a((short) 750, bArr[10], bArr[17]);
            Class<?> cls2 = Integer.TYPE;
            Object objInvoke = cls.getMethod(strA, Character.TYPE, cls2, cls2).invoke(obj, objArr);
            int i17 = f39271g;
            int i18 = (i17 & 23) + (i17 | 23);
            f39272h = i18 % 128;
            int i19 = i18 % 2;
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
