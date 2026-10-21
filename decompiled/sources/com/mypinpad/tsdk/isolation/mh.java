package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/mh;", "", "setCompoundDrawableTintBlendMode", "setX", "setDividerPadding"}, k = 1, mv = {1, 8, 0})
public final class mh {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getNavBarTitleString;
    public static final mh setCompoundDrawableTintBlendMode;
    public static final mh setDividerPadding;
    private static int setLayoutAnimation;
    private static boolean setNavigationOnClickListener;
    private static int setOnDragListener;
    private static final /* synthetic */ mh[] setOnFocusChangeListener;
    private static boolean setOnLongClickListener;
    public static final mh setX;
    private static char[] setY;

    static {
        c();
        $10 = 0;
        $11 = 1;
        setOnDragListener = 0;
        getNavBarTitleString = 1;
        d();
        Object[] objArr = new Object[1];
        a(127 - View.MeasureSpec.getSize(0), "\u0085\u0088\u0087\u0086\u0085\u0084\u0083\u0081\u0082\u0081", objArr);
        mh mhVar = new mh(((String) objArr[0]).intern(), 0);
        setCompoundDrawableTintBlendMode = mhVar;
        Object[] objArr2 = new Object[1];
        a(127 - Color.blue(0), "\u0089\u0089\u008b\u0087\u0087\u008a\u0089\u0084\u0085\u0088\u0087\u0086\u0085", objArr2);
        mh mhVar2 = new mh(((String) objArr2[0]).intern(), 1);
        setX = mhVar2;
        Object[] objArr3 = new Object[1];
        a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, "\u0089\u0089\u008b\u0087\u0087\u008a\u0089\u0084\u008b\u0083\u0086\u008d\u008b\u008c", objArr3);
        mh mhVar3 = new mh(((String) objArr3[0]).intern(), 2);
        setDividerPadding = mhVar3;
        int i10 = setOnDragListener;
        int i11 = i10 + 119;
        getNavBarTitleString = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 91;
        int i14 = i13 % 128;
        getNavBarTitleString = i14;
        int i15 = i13 % 2;
        setOnFocusChangeListener = new mh[]{mhVar, mhVar2, mhVar3};
        int i16 = i14 + 109;
        setOnDragListener = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 59 / 0;
        }
    }

    public mh() {
        throw null;
    }

    public static void a(int i10, String str, Object[] objArr) throws Throwable {
        int i11 = $11 + 107;
        $10 = i11 % 128;
        int i12 = 2;
        int i13 = i11 % 2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        setZ setz = new setZ();
        char[] cArr = setY;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i14 = 0;
            while (i14 < length) {
                int i15 = $10 + 43;
                $11 = i15 % 128;
                if (i15 % i12 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i14])};
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(1129500232);
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 26287), 64 - (ViewConfiguration.getDoubleTapTimeout() >> 16), View.MeasureSpec.getSize(0) + 1595);
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            Object[] objArr3 = new Object[1];
                            b(b11, (byte) (b11 + 2), b10, objArr3);
                            method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                            map.put(1129500232, method);
                        }
                        cArr2[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr[i14])};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method2 = map2.get(1129500232);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (26289 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 64, TextUtils.indexOf("", "", 0) + 1595);
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        b(b13, (byte) (b13 + 2), b12, objArr5);
                        method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                        map2.put(1129500232, method2);
                    }
                    cArr2[i14] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i14++;
                }
                i12 = 2;
            }
            cArr = cArr2;
        }
        Object[] objArr6 = {Integer.valueOf(setLayoutAnimation)};
        Map map3 = setTextScaleX.setMaxEms;
        Object method3 = map3.get(1019674483);
        if (method3 == null) {
            Class cls3 = (Class) setTextScaleX.setX((char) (Color.blue(0) + 10744), 43 - Color.alpha(0), 566 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
            byte b14 = (byte) 0;
            byte b15 = b14;
            Object[] objArr7 = new Object[1];
            b(b15, (byte) (b15 + 1), b14, objArr7);
            method3 = cls3.getMethod((String) objArr7[0], Integer.TYPE);
            map3.put(1019674483, method3);
        }
        int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
        if (!setNavigationOnClickListener) {
            if (!setOnLongClickListener) {
                throw null;
            }
            throw null;
        }
        int length2 = bytes.length;
        setz.setOnFocusChangeListener = length2;
        char[] cArr3 = new char[length2];
        setz.setDividerPadding = 0;
        while (true) {
            int i16 = setz.setDividerPadding;
            int i17 = setz.setOnFocusChangeListener;
            if (i16 >= i17) {
                objArr[0] = new String(cArr3);
                return;
            }
            cArr3[i16] = (char) (cArr[bytes[(i17 - 1) - i16] + i10] - iIntValue);
            Object[] objArr8 = {setz, setz};
            Map map4 = setTextScaleX.setMaxEms;
            Object method4 = map4.get(-1539766653);
            if (method4 == null) {
                Class cls4 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", "", 0), 51 - ExpandableListView.getPackedPositionGroup(0L), 2880 - TextUtils.getTrimmedLength(""));
                byte b16 = (byte) 0;
                byte b17 = b16;
                Object[] objArr9 = new Object[1];
                b(b17, b17, b16, objArr9);
                method4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                map4.put(-1539766653, method4);
            }
            ((Method) method4).invoke(null, objArr8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.mypinpad.tsdk.isolation.mh.$$a
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r7 = r7 * 2
            int r7 = 122 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L31
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
            r5 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L31:
            int r6 = r6 + 1
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.mh.b(int, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        $$a = new byte[]{122, -107, 66, -93};
        $$b = 109;
    }

    public static void d() {
        setOnLongClickListener = true;
        setNavigationOnClickListener = true;
        setLayoutAnimation = 1794962425;
        setY = new char[]{62240, 62247, 62253, 62294, 62245, 62246, 62266, 62264, 62250, 62252, 62268, 62251, 62244};
    }

    public static mh valueOf(String str) {
        int i10 = setOnDragListener + 11;
        getNavBarTitleString = i10 % 128;
        if (i10 % 2 != 0) {
            return (mh) Enum.valueOf(mh.class, str);
        }
        Enum.valueOf(mh.class, str);
        throw null;
    }

    public static mh[] values() {
        int i10 = setOnDragListener + 119;
        getNavBarTitleString = i10 % 128;
        int i11 = i10 % 2;
        mh[] mhVarArr = (mh[]) setOnFocusChangeListener.clone();
        int i12 = getNavBarTitleString + 85;
        setOnDragListener = i12 % 128;
        int i13 = i12 % 2;
        return mhVarArr;
    }
}
