package com.mypinpad.tsdk.isolation;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/setExtractedText;", "", "setCompoundDrawableTintBlendMode", "setDividerPadding", "setX"}, k = 1, mv = {1, 8, 0})
public final class setExtractedText {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getNavBarTitleString;
    public static final setExtractedText setCompoundDrawableTintBlendMode;
    public static final setExtractedText setDividerPadding;
    private static char setLayoutAnimation;
    private static char setNavigationOnClickListener;
    private static char setOnDragListener;
    private static final /* synthetic */ setExtractedText[] setOnFocusChangeListener;
    private static int setOnLongClickListener;
    public static final setExtractedText setX;
    private static char setY;

    static {
        c();
        $10 = 0;
        $11 = 1;
        getNavBarTitleString = 0;
        setOnLongClickListener = 1;
        d();
        Object[] objArr = new Object[1];
        a("対ᔖ狰盝걻꼸\uf5d3뺦", (ViewConfiguration.getTapTimeout() >> 16) + 7, objArr);
        setExtractedText setextractedtext = new setExtractedText(((String) objArr[0]).intern(), 0);
        setCompoundDrawableTintBlendMode = setextractedtext;
        Object[] objArr2 = new Object[1];
        a("ѝ蛘譿⍬꺭穑", 6 - View.MeasureSpec.getSize(0), objArr2);
        setExtractedText setextractedtext2 = new setExtractedText(((String) objArr2[0]).intern(), 1);
        setDividerPadding = setextractedtext2;
        Object[] objArr3 = new Object[1];
        a("㰿猤컿俸拮ﾖປ燸", View.combineMeasuredStates(0, 0) + 8, objArr3);
        setExtractedText setextractedtext3 = new setExtractedText(((String) objArr3[0]).intern(), 2);
        setX = setextractedtext3;
        int i10 = getNavBarTitleString;
        int i11 = i10 + 71;
        setOnLongClickListener = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 35;
        int i14 = i13 % 128;
        setOnLongClickListener = i14;
        int i15 = i13 % 2;
        setOnFocusChangeListener = new setExtractedText[]{setextractedtext, setextractedtext2, setextractedtext3};
        int i16 = i14 + 77;
        getNavBarTitleString = i16 % 128;
        int i17 = i16 % 2;
    }

    public setExtractedText() {
        throw null;
    }

    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        char[] charArray = str.toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        int i11 = 2;
        char[] cArr2 = new char[2];
        while (true) {
            int i12 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i12 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            int i13 = $11 + 51;
            $10 = i13 % 128;
            int i14 = i13 % i11;
            cArr2[0] = charArray[i12];
            cArr2[1] = charArray[i12 + 1];
            int i15 = 58224;
            int i16 = 0;
            while (i16 < 16) {
                char c10 = cArr2[1];
                char c11 = cArr2[0];
                int i17 = (c11 + i15) ^ ((c11 << 4) + ((char) (((long) setNavigationOnClickListener) ^ 4333817592127744003L)));
                int i18 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(setLayoutAnimation);
                    objArr2[i11] = Integer.valueOf(i18);
                    objArr2[1] = Integer.valueOf(i17);
                    objArr2[0] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (48535 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 47 - (ViewConfiguration.getJumpTapTimeout() >> 16), 2672 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 - 1);
                        Object[] objArr3 = new Object[1];
                        b(b10, b11, (byte) (b11 + 1), objArr3);
                        String str2 = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr2[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i15) ^ ((cCharValue << 4) + ((char) (((long) setY) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(setOnDragListener)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 48534), 47 - (ViewConfiguration.getPressedStateDuration() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2671);
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr5 = new Object[1];
                        b(b12, b13, (byte) (b13 + 1), objArr5);
                        String str3 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i15 -= 40503;
                    i16++;
                    i11 = 2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i19 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i19] = cArr2[0];
            cArr[i19 + 1] = cArr2[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 == null) {
                Class cls5 = (Class) setTextScaleX.setX((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0', 0, 0) + 38, KeyEvent.normalizeMetaState(0) + 2145);
                byte b14 = (byte) 0;
                byte b15 = (byte) (b14 - 1);
                Object[] objArr7 = new Object[1];
                b(b14, b15, (byte) (-b15), objArr7);
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            int i20 = $10 + 47;
            $11 = i20 % 128;
            int i21 = i20 % 2;
            i11 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.mypinpad.tsdk.isolation.setExtractedText.$$a
            int r9 = r9 * 2
            int r9 = r9 + 103
            int r7 = r7 * 4
            int r7 = r7 + 1
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L19
            r9 = r8
            r3 = r1
            r4 = r2
            r8 = r7
            r1 = r0
            r0 = r10
            r10 = r9
            goto L34
        L19:
            r3 = r2
        L1a:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L2b
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2b:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L34:
            int r7 = -r7
            int r9 = r9 + r7
            r7 = r8
            r8 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setExtractedText.b(int, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        $$a = new byte[]{16, -115, -100, 77};
        $$b = 224;
    }

    public static void d() {
        setLayoutAnimation = (char) 29516;
        setNavigationOnClickListener = (char) 12374;
        setY = (char) 26500;
        setOnDragListener = (char) 3119;
    }

    public static setExtractedText valueOf(String str) {
        int i10 = setOnLongClickListener + 119;
        getNavBarTitleString = i10 % 128;
        if (i10 % 2 != 0) {
            Enum.valueOf(setExtractedText.class, str);
            throw null;
        }
        setExtractedText setextractedtext = (setExtractedText) Enum.valueOf(setExtractedText.class, str);
        int i11 = setOnLongClickListener + 33;
        getNavBarTitleString = i11 % 128;
        if (i11 % 2 == 0) {
            return setextractedtext;
        }
        throw null;
    }

    public static setExtractedText[] values() {
        int i10 = getNavBarTitleString + 51;
        setOnLongClickListener = i10 % 128;
        int i11 = i10 % 2;
        setExtractedText[] setextractedtextArr = (setExtractedText[]) setOnFocusChangeListener.clone();
        int i12 = setOnLongClickListener + 121;
        getNavBarTitleString = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 18 / 0;
        }
        return setextractedtextArr;
    }
}
