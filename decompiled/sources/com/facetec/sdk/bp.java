package com.facetec.sdk;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class bp {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static long A;
    private static long B;
    private static long C;
    private static byte D;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Map f40690t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static byte[] f40691u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static Object f40692v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static byte[] f40693w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Map f40694x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static Object f40695y;

    /* JADX WARN: Code duplicated, block: B:12:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:14:0x00c6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00c6 -> B:15:0x00cf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(short r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bp.$$c(short, int, int):java.lang.String");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 79401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    static {
        /*
            Method dump skipped, instruction units count: 7940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bp.<clinit>():void");
    }

    private bp() {
    }

    public static int a(Object obj) throws Throwable {
        int i10 = $11;
        int i11 = (i10 & 83) + (i10 | 83);
        $10 = i11 % 128;
        int i12 = i11 % 2;
        Object obj2 = f40692v;
        int i13 = i10 + 105;
        $10 = i13 % 128;
        int i14 = i13 % 2;
        int i15 = ((i10 | 29) << 1) - (i10 ^ 29);
        $10 = i15 % 128;
        int i16 = i15 % 2;
        try {
            Object[] objArr = {obj};
            byte[] bArr = $$a;
            byte b10 = (byte) (-bArr[6]);
            byte b11 = bArr[271];
            int iIntValue = ((Integer) Class.forName($$c(b10, b11, (short) ((b11 ^ 482) | (b11 & 482))), true, (ClassLoader) f40695y).getMethod($$c(bArr[79], bArr[271], bArr[28]), Object.class).invoke(obj2, objArr)).intValue();
            int i17 = $10 + 37;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            return iIntValue;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static int c(int i10) throws Throwable {
        int i11 = $10;
        int i12 = ((i11 | 67) << 1) - (i11 ^ 67);
        $11 = i12 % 128;
        int i13 = i12 % 2;
        Object obj = f40692v;
        int i14 = ((i11 | 23) << 1) - (i11 ^ 23);
        $11 = i14 % 128;
        int i15 = i14 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i10)};
            byte[] bArr = $$a;
            byte b10 = (byte) (-bArr[6]);
            byte b11 = bArr[271];
            int iIntValue = ((Integer) Class.forName($$c(b10, b11, (short) ((b11 ^ 482) | (b11 & 482))), true, (ClassLoader) f40695y).getMethod($$c(bArr[79], bArr[565], bArr[28]), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i16 = $11 + 27;
            $10 = i16 % 128;
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

    public static void init$0() {
        System.currentTimeMillis();
        System.currentTimeMillis();
        byte[] bArr = new byte[1030];
        System.arraycopy("\u0013øK\u0018ñ\bð\u0001\u0004\u00034Åó\u000fï\u0006ý\u0004îCéÒ\u0001ûû\t\u0003ò\u0000<Ç\u0003üüï\r\u00002º\r÷:Ëë þò\u0000=Æ\u0003üüï\r\u00003¹\r÷ñ\bð\u0001\u0004\u00034Ëïþ@ëÜí\tñ\u000bóù#êô\u000b\u0002ûì\u0001þ\u000bõø1Ïþ\u0002\u0001\u0004\u0000ë\tøÿñ\bð\u0001\u0004\u00034Ëïþ@ëÏþ'Ùû\u000bÿó÷\u0000ï)Ù\u0003ó\t\u0006ó)Ïþ\u0002\u0001\u0004\u0000ë\tøÿ\u0000ï,Ûû\u0005ð-Ùõ\u0000ï/Ò\tý àüù\u0001\u001fÙõ\u0000ï/àüù\u0001\u001fÙõÉ\u0001ë\u00110É\u0001ë\u00110\u0007é\u00131Ãø?æÛû\u0005\u0007é\u00131Ãø?¸\u0005û\nùõ\u0007é\u00131À\tñ\u00057ÙØ\u0004ý\rö\u0000ï\"Ü\u0001ý\tñüùò\tý\u0004ú\u0000üù\u0001ñ\bð\u0001\u0004\u00034½úCêË\nû\u0006>Ì\u000fñý\bøÿ\r÷ê\u0014ùø\u0000ñ\u0015ã\u0007ó\r\u0013ø\u0014ö\u0007é\u00131Ãø?ãø\bË\u0013üóú\tøÿì\u0001þ\u000bõø\u001eéú\u0006\u0016âûþ\u0001ô\u0007é\u00131Ãø?æÛû\u0005\u0014Øÿ\u0002ùÿ\u001fÝ\u0000\u000b\u0002òõûú\f\u0013û\u0011öÌìþ\fïÿBÊò\u0000<Ç\u0003üüï\r\u00002º\r÷:Ì2\u0000ï ëð\u0002ø\u0001\rü\u0007é\u00131¾\u0007ïD×\u0001\u0004\u0000ï\"íë\n\u0007é\u00131Ãø?êË\rþÿñ\u000bÿ\u0019Ùüùÿ\u001fÝ\u0000\u000b\u0002ò\u0007é\u00131Ãø?ãÙüùÿ\u001fÝ\u0000\u000b\u0002ò\u0007é\u00131Ãø?èáë\u0011\u0016Ùüùÿ\u001fÝ\u0000\u000b\u0002ò\u000b\u0002û\u001cÏ\u0007þñ\u0007é\u00131Ãø?êÇ\u0003\r\"Íþ\u000fæ.Ùüùÿ\u001fÝ\u0000\u000b\u0002òíþ\u000fæ\u0014òýõò\u0000=Æ\u0003üüï\r\u00003¹\r÷;Åôò\u0000=Æ\u0003üüï\r\u00003¹\r÷;Êë þ\u0006\u0000÷\u000b\u0002û\fï ë\u0002û\u0013ß\u0000ñ\u0013ú\u0012ö\u0003\u0007ó\r\u0000ï,\u0000\u0007é\u00131Ãø?æÛû\u0005\u001fÝð\u000eï\u0007÷ú\u0003ûø\t\t\u0001óô\u000bü;¹ø\u0004ý\rö=èÝë0Ûû\u0005û\fû\u001eÝë\u0000ï1Ýí\u0002\u0001õÿ\r\u0013íë\ný÷\u0005ï\r\u0000ï/Õ\tìþ%Û\fûýñ\u0007é\u00131·ÿ\tû<²\u000f÷@Òï÷%Ùüùÿ\u001fÝ\u0000\u000b\u0002ò\u0000ï$çë\u0002-Õø\u0000÷\u0007é\u00131·ÿ\tû<²\u000f÷@Òï÷)Õø\u0000÷\u0000ï\u001fèí\u0013\u0007é\u00131Ãø?êÇ\u0003\r\"Íþ\u000fæ(Øÿ\u0002ùÿ\u001fÝ\u0000\u000b\u0002ò\u0003+Ç\u0003\r\"Íþ\u000fæ\u0007é\u00131Ãø?éÕûú\f\u0002ýô\u0005\u0001óô\u000bü;¹ø\u0004ý\rö=ãÙ\u001fæöüû÷3Ýë3Õ\tìþ%Û\fûýñ\u0007é\u00131¾\u0003ø?êÇ\u0003\r!Ë\rþÿñ\u0007é\u00131À\tñ\u00057éÕ\tìþ%Û\fûýñ\u0003\u000fï\u0001óô\u000bü;¹ø\u0004ý\rö=êßì\f\u001fÝë3Õ\tìþ%Û\fûýñ\rë\n\u001aáôý\u000bë\tñ\u000f\u0017á\u0005î\u000fí÷3Ùõ\u000b\u0000í\u0003û\u0007\u0002ð\u000bë\tñ\u000f\u0017á\u0005î\u000fí÷'íë\n!×\u0005ö\u0006õøÿ\u0000ï/Ò\u0000ûÿÿ\u0007õø\u001eÙ\u0007\t\u0013ö\u0016öû\fû\u001fÕ\tìþò\u0000<Ç\u0003üüï\r\u00002º\r÷:ËðJ¯Ììþ\fïÿBÊò\u0000<Ç\u0003üüï\r\u00002º\r÷:Ë3\u0013÷\u0015ö¸ýM¸\u0003óþ\bÿüööQ²\u0005ýðI".getBytes("ISO-8859-1"), 0, bArr, 0, 1030);
        $$a = bArr;
        $$b = 25;
        int i10 = $11;
        int i11 = (i10 & 115) + (i10 | 115);
        $10 = i11 % 128;
        int i12 = i11 % 2;
    }

    public static Object a(int i10, int i11, char c10) throws Throwable {
        int i12 = $11 + 65;
        int i13 = i12 % 128;
        $10 = i13;
        if (i12 % 2 != 0) {
            throw null;
        }
        Object obj = f40692v;
        int i14 = (i13 ^ 125) + ((i13 & 125) << 1);
        $11 = i14 % 128;
        int i15 = i14 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i10), Integer.valueOf(i11), Character.valueOf(c10)};
            byte[] bArr = $$a;
            byte b10 = (byte) (-bArr[6]);
            byte b11 = bArr[271];
            Class<?> cls = Class.forName($$c(b10, b11, (short) ((b11 ^ 482) | (b11 & 482))), true, (ClassLoader) f40695y);
            String str$$c = $$c(bArr[79], bArr[0], bArr[28]);
            Class<?> cls2 = Integer.TYPE;
            Object objInvoke = cls.getMethod(str$$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i16 = $10 + 35;
            $11 = i16 % 128;
            int i17 = i16 % 2;
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
