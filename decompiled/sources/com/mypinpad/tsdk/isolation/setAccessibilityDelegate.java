package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public interface setAccessibilityDelegate {

    public static final class setCompoundDrawableTintBlendMode extends Exception {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/setAccessibilityDelegate$setX;", "", "setCompoundDrawableTintBlendMode", "setOnFocusChangeListener", "setY"}, k = 1, mv = {1, 5, 1})
    public static final class setX {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static int getNavBarTitleString;
        private static int setAlwaysDrawnWithCacheEnabled;
        public static final setX setCompoundDrawableTintBlendMode;
        private static int setDividerPadding;
        private static short[] setLayoutAnimation;
        private static int setNavigationOnClickListener;
        private static byte[] setOnDragListener;
        public static final setX setOnFocusChangeListener;
        private static int setOnLongClickListener;
        private static final /* synthetic */ setX[] setX;
        public static final setX setY;

        static {
            c();
            $10 = 0;
            $11 = 1;
            setOnLongClickListener = 0;
            setAlwaysDrawnWithCacheEnabled = 1;
            d();
            Object[] objArr = new Object[1];
            a((-60) - TextUtils.getCapsMode("", 0, 0), (byte) (12 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (-207426998) - TextUtils.lastIndexOf("", '0'), KeyEvent.keyCodeFromString("") + 698249502, objArr);
            setX setx = new setX(((String) objArr[0]).intern(), 0);
            setCompoundDrawableTintBlendMode = setx;
            Object[] objArr2 = new Object[1];
            a(TextUtils.indexOf("", "", 0, 0) - 60, (byte) (117 - (ViewConfiguration.getTouchSlop() >> 8)), (short) (ExpandableListView.getPackedPositionChild(0L) + 1), (-207427007) - KeyEvent.normalizeMetaState(0), ((Process.getThreadPriority(0) + 20) >> 6) + 698249512, objArr2);
            setX setx2 = new setX(((String) objArr2[0]).intern(), 1);
            setOnFocusChangeListener = setx2;
            Object[] objArr3 = new Object[1];
            a((-60) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (58 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (short) ((Process.getThreadPriority(0) + 20) >> 6), (-207427006) - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 698249517, objArr3);
            setX setx3 = new setX(((String) objArr3[0]).intern(), 2);
            setY = setx3;
            int i10 = setAlwaysDrawnWithCacheEnabled;
            int i11 = i10 + 45;
            setOnLongClickListener = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i10 + 89;
            int i14 = i13 % 128;
            setOnLongClickListener = i14;
            int i15 = i13 % 2;
            setX = new setX[]{setx, setx2, setx3};
            int i16 = i14 + 23;
            setAlwaysDrawnWithCacheEnabled = i16 % 128;
            int i17 = i16 % 2;
        }

        public setX() {
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:72:0x0300  */
        /* JADX WARN: Code duplicated, block: B:73:0x0324  */
        public static void a(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
            long j10;
            int i13;
            setTextAlignment settextalignment = new setTextAlignment();
            StringBuilder sb2 = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(setNavigationOnClickListener)};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-769569468);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) ((-1) - TextUtils.lastIndexOf("", '0')), TextUtils.indexOf("", "") + 49, 433 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    String str = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str, cls2, cls2);
                    map.put(-769569468, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                int i14 = iIntValue == -1 ? 1 : 0;
                if (i14 == 0) {
                    j10 = 7616081452308447380L;
                } else {
                    byte[] bArr = setOnDragListener;
                    if (bArr != null) {
                        int i15 = $10 + 45;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        for (int i17 = 0; i17 < length; i17++) {
                            Object[] objArr4 = {Integer.valueOf(bArr[i17])};
                            Map map2 = setTextScaleX.setMaxEms;
                            Object method2 = map2.get(510767826);
                            if (method2 == null) {
                                method2 = ((Class) setTextScaleX.setX((char) (49111 - (ViewConfiguration.getWindowTouchSlop() >> 8)), Color.green(0) + 41, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 52)).getMethod("s", Integer.TYPE);
                                map2.put(510767826, method2);
                            }
                            bArr2[i17] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i18 = $10 + 103;
                        $11 = i18 % 128;
                        if (i18 % 2 == 0) {
                            byte[] bArr3 = setOnDragListener;
                            Object[] objArr5 = {Integer.valueOf(i12), Integer.valueOf(setDividerPadding)};
                            Map map3 = setTextScaleX.setMaxEms;
                            Object method3 = map3.get(-769569468);
                            if (method3 == null) {
                                Class cls3 = (Class) setTextScaleX.setX((char) (Process.myTid() >> 22), ((Process.getThreadPriority(0) + 20) >> 6) + 49, (ViewConfiguration.getScrollBarSize() >> 8) + 434);
                                byte b13 = (byte) 0;
                                byte b14 = b13;
                                Object[] objArr6 = new Object[1];
                                b(b13, b14, b14, objArr6);
                                String str2 = (String) objArr6[0];
                                Class<?> cls4 = Integer.TYPE;
                                method3 = cls3.getMethod(str2, cls4, cls4);
                                map3.put(-769569468, method3);
                            }
                            i13 = ((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) % 7616081452308447380L)) * ((int) (((long) setNavigationOnClickListener) + 7616081452308447380L));
                        } else {
                            byte[] bArr4 = setOnDragListener;
                            Object[] objArr7 = {Integer.valueOf(i12), Integer.valueOf(setDividerPadding)};
                            Map map4 = setTextScaleX.setMaxEms;
                            Object method4 = map4.get(-769569468);
                            if (method4 == null) {
                                Class cls5 = (Class) setTextScaleX.setX((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 48 - TextUtils.indexOf((CharSequence) "", '0', 0), 434 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                byte b15 = (byte) 0;
                                byte b16 = b15;
                                Object[] objArr8 = new Object[1];
                                b(b15, b16, b16, objArr8);
                                String str3 = (String) objArr8[0];
                                Class<?> cls6 = Integer.TYPE;
                                method4 = cls5.getMethod(str3, cls6, cls6);
                                map4.put(-769569468, method4);
                            }
                            i13 = ((byte) (((long) bArr4[((Integer) ((Method) method4).invoke(null, objArr7)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) setNavigationOnClickListener) ^ 7616081452308447380L));
                        }
                        iIntValue = (byte) i13;
                        j10 = 7616081452308447380L;
                    } else {
                        j10 = 7616081452308447380L;
                        iIntValue = (short) (((short) (((long) setLayoutAnimation[i12 + ((int) (((long) setDividerPadding) ^ 7616081452308447380L))]) ^ 7616081452308447380L)) + ((int) (((long) setNavigationOnClickListener) ^ 7616081452308447380L)));
                    }
                }
                if (iIntValue > 0) {
                    settextalignment.setX = ((i12 + iIntValue) - 2) + ((int) (((long) setDividerPadding) ^ j10)) + i14;
                    Object[] objArr9 = {settextalignment, Integer.valueOf(i11), Integer.valueOf(getNavBarTitleString), sb2};
                    Map map5 = setTextScaleX.setMaxEms;
                    Object method5 = map5.get(193260760);
                    if (method5 == null) {
                        Class cls7 = (Class) setTextScaleX.setX((char) Color.alpha(0), (KeyEvent.getMaxKeyCode() >> 16) + 42, 2802 - TextUtils.lastIndexOf("", '0', 0, 0));
                        byte b17 = (byte) 1;
                        byte b18 = (byte) (b17 - 1);
                        Object[] objArr10 = new Object[1];
                        b(b17, b18, b18, objArr10);
                        String str4 = (String) objArr10[0];
                        Class<?> cls8 = Integer.TYPE;
                        method5 = cls7.getMethod(str4, Object.class, cls8, cls8, Object.class);
                        map5.put(193260760, method5);
                    }
                    ((StringBuilder) ((Method) method5).invoke(null, objArr9)).append(settextalignment.setCompoundDrawableTintBlendMode);
                    settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                    byte[] bArr5 = setOnDragListener;
                    if (bArr5 != null) {
                        int i19 = $11 + 51;
                        $10 = i19 % 128;
                        int i20 = i19 % 2;
                        int length2 = bArr5.length;
                        byte[] bArr6 = new byte[length2];
                        for (int i21 = 0; i21 < length2; i21++) {
                            bArr6[i21] = (byte) (((long) bArr5[i21]) ^ 7616081452308447380L);
                        }
                        bArr5 = bArr6;
                    }
                    boolean z10 = bArr5 != null;
                    settextalignment.setDividerPadding = 1;
                    while (settextalignment.setDividerPadding < iIntValue) {
                        int i22 = $10 + 95;
                        $11 = i22 % 128;
                        if (i22 % 2 == 0) {
                            int i23 = 45 / 0;
                            if (z10) {
                                byte[] bArr7 = setOnDragListener;
                                int i24 = settextalignment.setX;
                                settextalignment.setX = i24 - 1;
                                settextalignment.setCompoundDrawableTintBlendMode = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr7[i24]) ^ 7616081452308447380L)) + s4)) ^ b10));
                            } else {
                                short[] sArr = setLayoutAnimation;
                                int i25 = settextalignment.setX;
                                settextalignment.setX = i25 - 1;
                                settextalignment.setCompoundDrawableTintBlendMode = (char) (settextalignment.setY + (((short) (((short) (((long) sArr[i25]) ^ 7616081452308447380L)) + s4)) ^ b10));
                            }
                        } else if (z10) {
                            byte[] bArr8 = setOnDragListener;
                            int i26 = settextalignment.setX;
                            settextalignment.setX = i26 - 1;
                            settextalignment.setCompoundDrawableTintBlendMode = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr8[i26]) ^ 7616081452308447380L)) + s4)) ^ b10));
                        } else {
                            short[] sArr2 = setLayoutAnimation;
                            int i27 = settextalignment.setX;
                            settextalignment.setX = i27 - 1;
                            settextalignment.setCompoundDrawableTintBlendMode = (char) (settextalignment.setY + (((short) (((short) (((long) sArr2[i27]) ^ 7616081452308447380L)) + s4)) ^ b10));
                        }
                        sb2.append(settextalignment.setCompoundDrawableTintBlendMode);
                        settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                        settextalignment.setDividerPadding++;
                    }
                }
                objArr[0] = sb2.toString();
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0034). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(int r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 3
                int r6 = r6 + 109
                byte[] r0 = com.mypinpad.tsdk.i.setAccessibilityDelegate.setX.$$a
                int r8 = r8 * 2
                int r8 = r8 + 4
                int r7 = r7 * 2
                int r7 = 1 - r7
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L1a
                r6 = r7
                r3 = r1
                r4 = r2
                r1 = r0
                r0 = r9
                r9 = r8
                goto L34
            L1a:
                r3 = r2
            L1b:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2a:
                r4 = r0[r8]
                r5 = r9
                r9 = r6
                r6 = r7
                r7 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r5
            L34:
                int r8 = r8 + 1
                int r7 = r7 + r9
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.setAccessibilityDelegate.setX.b(int, short, short, java.lang.Object[]):void");
        }

        public static void c() {
            $$a = new byte[]{107, -84, 8, 70};
            $$b = 32;
        }

        public static void d() {
            setDividerPadding = 2133380726;
            setNavigationOnClickListener = -1454817105;
            getNavBarTitleString = -1525393770;
            setOnDragListener = new byte[]{91, 104, Constants.CVR_B1b85_0110_TERMINAL, -104, 103, -98, 98, -112, 101, 99, Constants.STATE_ERROR, Constants.CVR_B1b41_1110_ONLINE_PIN, -20, 25, -19, 31, 64, 65, -93, 86, -94, Constants.CVR_B1b85_0101_MOBILE_APP, 74, -67, -91, 93, 82, -93, Constants.STATE_ERROR, 82, -67};
        }

        public static setX valueOf(String str) {
            int i10 = setAlwaysDrawnWithCacheEnabled + 93;
            setOnLongClickListener = i10 % 128;
            int i11 = i10 % 2;
            setX setx = (setX) Enum.valueOf(setX.class, str);
            int i12 = setOnLongClickListener + 69;
            setAlwaysDrawnWithCacheEnabled = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 83 / 0;
            }
            return setx;
        }

        public static setX[] values() {
            int i10 = setAlwaysDrawnWithCacheEnabled + 59;
            setOnLongClickListener = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            setX[] setxArr = (setX[]) setX.clone();
            int i11 = setAlwaysDrawnWithCacheEnabled + 19;
            setOnLongClickListener = i11 % 128;
            int i12 = i11 % 2;
            return setxArr;
        }
    }

    @Nullable
    setX setCompoundDrawableTintBlendMode(@NotNull Function1<? super setX, Unit> function1);

    void setOnFocusChangeListener();
}
