package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class oz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f57598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f57599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f57600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f57601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f57602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f57603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f57604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f57605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f57606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f57607j = null;

    static {
        d();
        f57605h = 0;
        f57606i = 1;
        f57603f = 0;
        f57604g = 1;
        f57600c = true;
        f57601d = true;
        f57599b = 1794962054;
        f57598a = new char[]{62187, 61975, 61973, 61974, 61972, 62189, 61978, 61969, 61979, 62185, 62193, 62186, 62191, 61980, 61982, 61976, 62198, 61981, 61970, 62155, 62157, 62188, 61953, 62190, 62194, 62204, 61971, 62154};
        f57602e = -4924004571093481836L;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0193  */
    /* JADX WARN: Code duplicated, block: B:34:0x0194  */
    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        Throwable cause;
        char[] charArray = str.toCharArray();
        int i11 = f57606i + 75;
        f57605h = i11 % 128;
        char c10 = 2;
        int i12 = i11 % 2;
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        int i13 = f57606i + 107;
        f57605h = i13 % 128;
        int i14 = i13 % 2;
        while (true) {
            int i15 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i15 >= charArray.length) {
                break;
            }
            char c11 = charArray[i15];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[c10] = setlayoutanimation;
                objArr2[1] = setlayoutanimation;
                objArr2[0] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) ((-1) - ImageFormat.getBitsPerPixel(0)), AndroidCharacter.getMirror('0') - 15, 1195 - TextUtils.getCapsMode("", 0, 0));
                    byte b10 = (byte) (-1);
                    byte b11 = (byte) (b10 + 1);
                    Object[] objArr3 = new Object[1];
                    c(b10, b11, (byte) (b11 | 12), objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i15] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f57602e ^ 1779209353347916695L);
                Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) TextUtils.getCapsMode("", 0, 0), 44 - (ViewConfiguration.getEdgeSlop() >> 16), 728 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    byte b12 = (byte) (-1);
                    byte b13 = (byte) (b12 + 1);
                    Object[] objArr5 = new Object[1];
                    c(b12, b13, (byte) (b13 | 15), objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                c10 = 2;
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = new char[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i16 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i16 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i16] = (char) jArr[i16];
            Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(645183118);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 44 - (ViewConfiguration.getJumpTapTimeout() >> 16), 728 - Color.alpha(0));
                byte b14 = (byte) (-1);
                byte b15 = (byte) (b14 + 1);
                Object[] objArr7 = new Object[1];
                c(b14, b15, (byte) (b15 | 15), objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(645183118, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            int i17 = f57605h + 15;
            f57606i = i17 % 128;
            int i18 = i17 % 2;
        }
    }

    public static void b(int i10, String str, Object[] objArr) throws Throwable {
        int i11 = f57606i + 111;
        f57605h = i11 % 128;
        if (i11 % 2 != 0) {
            str.getBytes("ISO-8859-1");
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        setZ setz = new setZ();
        char[] cArr = f57598a;
        int i12 = -1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i13])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1129500232);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26288), 64 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1595);
                        byte b10 = (byte) i12;
                        Object[] objArr3 = new Object[1];
                        c(b10, (byte) (b10 + 1), (byte) f57607j.length, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1129500232, method);
                    }
                    cArr2[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i13++;
                    i12 = -1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(f57599b)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(1019674483);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) ((Process.myPid() >> 22) + 10744), 43 - TextUtils.indexOf("", "", 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 565);
            byte b11 = (byte) (-1);
            byte b12 = (byte) (b11 + 1);
            Object[] objArr5 = new Object[1];
            c(b11, b12, (byte) (b12 + 2), objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(1019674483, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
        if (!f57601d) {
            if (!f57600c) {
                throw null;
            }
            throw null;
        }
        int i14 = f57606i + 87;
        f57605h = i14 % 128;
        int i15 = i14 % 2;
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
            Object[] objArr6 = {setz, setz};
            Map map3 = setTextScaleX.setMaxEms;
            Object method3 = map3.get(-1539766653);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 51 - View.MeasureSpec.getMode(0), 2880 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                byte b13 = (byte) (-1);
                byte b14 = (byte) (b13 + 1);
                Object[] objArr7 = new Object[1];
                c(b13, b14, b14, objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map3.put(-1539766653, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 122 - r8
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r6 = r6 + 4
            byte[] r0 = new byte[r7]
            byte[] r1 = com.mypinpad.tsdk.isolation.oz.f57607j
            r2 = 0
            if (r1 != 0) goto L14
            r8 = r7
            r4 = r8
            r3 = r2
            r7 = r6
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            int r3 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L2c:
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.oz.c(int, byte, int, java.lang.Object[]):void");
    }

    public static void d() {
        f57607j = new byte[]{107, 63, -59, -33};
    }

    public static final JSONObject setDividerPadding(@NotNull pf pfVar, @NotNull String str) {
        Object obj;
        pe peVar;
        Object obj2;
        String x4;
        Object obj3;
        Object[] objArr = new Object[1];
        a("╷桖뼬수ᇬ꒡\ueb8a㥦䱒錳⛫痧뢓", 19750 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Intrinsics.checkNotNullParameter(pfVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        JSONObject jSONObject = new JSONObject();
        Object[] objArr2 = new Object[1];
        b((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u0087\u0085\u0086\u0085\u0082\u0084\u0083\u0082\u0081", objArr2);
        JSONObject jSONObjectPut = jSONObject.put(((String) objArr2[0]).intern(), pfVar.setNavigationOnClickListener());
        Object[] objArr3 = new Object[1];
        b(127 - ((Process.getThreadPriority(0) + 20) >> 6), "\u008c\u008b\u0086\u0081\u0085\u008a\u0087\u0089\u0085\u0088", objArr3);
        JSONObject jSONObjectPut2 = jSONObjectPut.put(((String) objArr3[0]).intern(), str);
        Object[] objArr4 = new Object[1];
        a("╧᨟宂鬋\ud895ᠷ妥餸\udea4Ḱ", 16249 - Color.blue(0), objArr4);
        JSONObject jSONObjectPut3 = jSONObjectPut2.put(((String) objArr4[0]).intern(), pfVar.getNavBarTitleString());
        Object[] objArr5 = new Object[1];
        b(127 - TextUtils.indexOf("", "", 0), "\u008c\u008b\u0086\u008d\u008a\u0089\u0089\u0086\u0083", objArr5);
        JSONObject jSONObjectPut4 = jSONObjectPut3.put(((String) objArr5[0]).intern(), pfVar.setLayoutAnimation());
        Object[] objArr6 = new Object[1];
        b(127 - TextUtils.indexOf("", "", 0), "\u0084\u0083\u008a\u0087\u0089\u0086\u0083\u0088\u0087", objArr6);
        JSONObject jSONObjectPut5 = jSONObjectPut4.put(((String) objArr6[0]).intern(), pfVar.setOnDragListener());
        Object[] objArr7 = new Object[1];
        b(MotionEvent.axisFromString("") + 128, "\u0087\u0085\u0086\u008e\u0086", objArr7);
        String strIntern2 = ((String) objArr7[0]).intern();
        JSONObject jSONObject2 = new JSONObject();
        if (pfVar instanceof pb) {
            Object[] objArr8 = new Object[1];
            b(127 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u0087\u008f\u0086\u0087", objArr8);
            jSONObject2.put(((String) objArr8[0]).intern(), ((pb) pfVar).getSetDividerPadding());
        } else if (pfVar instanceof po) {
            Object[] objArr9 = new Object[1];
            a("╦︠鏌뒒䠣淾ڄ\uda20ￎ", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 56149, objArr9);
            jSONObject2.put(((String) objArr9[0]).intern(), ((po) pfVar).setY());
        } else if (pfVar instanceof os) {
            int i10 = f57603f + 57;
            f57604g = i10 % 128;
            if (i10 % 2 == 0) {
                Object[] objArr10 = new Object[1];
                a("╦︠鏌뒒䠣淾ڄ\uda20ￎ", 56148 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr10);
                obj3 = objArr10[0];
            } else {
                Object[] objArr11 = new Object[1];
                a("╦︠鏌뒒䠣淾ڄ\uda20ￎ", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 56148, objArr11);
                obj3 = objArr11[0];
            }
            jSONObject2.put(((String) obj3).intern(), ((os) pfVar).setY());
        } else if (!(!(pfVar instanceof pj))) {
            int i11 = f57603f + 21;
            f57604g = i11 % 128;
            int i12 = i11 % 2;
            pj pjVar = (pj) pfVar;
            jSONObject2.put(strIntern, pjVar.setCompoundDrawableTintBlendMode().toString());
            Object[] objArr12 = new Object[1];
            b(127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0089\u0090\u0086\u0087\u0086\u0083\u008a\u0090\u008a\u0091\u0085\u0082\u0088\u0087\u0081\u008a\u0089\u0085\u008a\u0090\u0087", objArr12);
            jSONObject2.put(((String) objArr12[0]).intern(), pjVar.setOnFocusChangeListener());
        } else if (pfVar instanceof pg) {
            jSONObject2.put(strIntern, ((pg) pfVar).setDividerPadding().toString());
        } else if (pfVar instanceof pm) {
            jSONObject2.put(strIntern, ((pm) pfVar).setCompoundDrawableTintBlendMode().toString());
        } else if (pfVar instanceof ox) {
            jSONObject2.put(strIntern, ((ox) pfVar).setY().toString());
        } else if (pfVar instanceof pi) {
            jSONObject2.put(strIntern, ((pi) pfVar).setX().toString());
        } else if (pfVar instanceof ot) {
            ot otVar = (ot) pfVar;
            jSONObject2.put(strIntern, otVar.setX().toString());
            Object[] objArr13 = new Object[1];
            a("╠⨡㯫ࢩᡪ椠绽侳彿갊뷸芃鉔\ue30b\uf0c7", 3907 - TextUtils.getCapsMode("", 0, 0), objArr13);
            jSONObject2.put(((String) objArr13[0]).intern(), otVar.setY());
            Object[] objArr14 = new Object[1];
            a("╱䈽\uebd1፳렌↰䥄\uf61aᾗ蝟⳪單ﴦ\u1ae8莘", TextUtils.indexOf((CharSequence) "", '0', 0) + 26460, objArr14);
            String strIntern3 = ((String) objArr14[0]).intern();
            getDynamicButtonIconTextSpacingDp dividerPadding = otVar.setDividerPadding();
        } else if (!(!(pfVar instanceof ov))) {
            int i13 = f57604g + 23;
            f57603f = i13 % 128;
            int i14 = i13 % 2;
            ov ovVar = (ov) pfVar;
            jSONObject2.put(strIntern, ovVar.setY().toString());
            Object[] objArr15 = new Object[1];
            b(128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0087\u0093\u0092\u0089\u0086\u0090", objArr15);
            jSONObject2.put(((String) objArr15[0]).intern(), ovVar.setCompoundDrawableTintBlendMode());
            Object[] objArr16 = new Object[1];
            a("╱䈽\uebd1፳렌↰䥄\uf61aᾗ蝟⳪單ﴦ\u1ae8莘", 26459 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr16);
            jSONObject2.put(((String) objArr16[0]).intern(), ovVar.setOnFocusChangeListener().setX());
        } else if (pfVar instanceof ou) {
            ou ouVar = (ou) pfVar;
            UUID y7 = ouVar.setY();
            if (y7 == null) {
                y7 = new UUID(0L, 0L);
            }
            jSONObject2.put(strIntern, y7.toString());
            Object[] objArr17 = new Object[1];
            b(Color.green(0) + 127, "\u0086\u008c\u0082\u0094\u0090\u0082\u0090\u0090\u0086", objArr17);
            Object[] objArr18 = new Object[1];
            b(127 - Color.alpha(0), "\u0086\u008c\u0082\u0094\u0090\u0082\u0090\u0090\u0095\u0093\u008a\u0085\u0090\u0086\u0087\u0085\u0088", objArr18);
            jSONObject2.put(((String) objArr18[0]).intern(), String.valueOf(ouVar.setCompoundDrawableTintBlendMode()));
            Object[] objArr19 = new Object[1];
            a("╱䈽\uebd1፳렌↰䥄\uf61aᾗ蝟⳪單ﴦ\u1ae8莘", Color.blue(0) + 26459, objArr19);
            String strIntern4 = ((String) objArr19[0]).intern();
            getDynamicButtonIconTextSpacingDp onFocusChangeListener = ouVar.setOnFocusChangeListener();
            if (onFocusChangeListener != null) {
                x4 = onFocusChangeListener.setX();
            } else {
                int i15 = f57603f + 85;
                f57604g = i15 % 128;
                int i16 = i15 % 2;
                x4 = null;
            }
            Object[] objArr20 = new Object[1];
            b((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, "\u0082\u0096\u0085\u008b\u0086\u0081\u0088\u008e\u0086\u008c", objArr20);
            String strIntern5 = ((String) objArr20[0]).intern();
            pd pdVar = pd.INSTANCE;
        } else if (pfVar instanceof ow) {
            Object[] objArr21 = new Object[1];
            a("╧ꥱ㵛脯ᔼ餕淄\uf1c3䗕즹嶃↟둴㡜谴ဨ\ue416棶", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 35863, objArr21);
            ow owVar = (ow) pfVar;
            jSONObject2.put(((String) objArr21[0]).intern(), (String) ow.setOnFocusChangeListener(new Object[]{owVar}, -670300325, 670300325, System.identityHashCode(owVar)));
            Object[] objArr22 = new Object[1];
            a("╧⭝㤃\u0fdbᶌ扁瀬䛱咿ꕵꬡ", 3643 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr22);
            jSONObject2.put(((String) objArr22[0]).intern(), owVar.setX());
            Object[] objArr23 = new Object[1];
            a("╬䅷\ued1bओ뗭톳綀顽ѕ", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25638, objArr23);
            jSONObject2.put(((String) objArr23[0]).intern(), owVar.setDividerPadding());
            Object[] objArr24 = new Object[1];
            b(TextUtils.getOffsetBefore("", 0) + 127, "\u0093\u0086\u008e\u0086\u0099\u0098\u0081\u0087\u008a\u0091\u0097\u0087\u0088\u0090\u0092\u0081\u0086\u0089", objArr24);
            jSONObject2.put(((String) objArr24[0]).intern(), owVar.setOnFocusChangeListener());
            Object[] objArr25 = new Object[1];
            b(127 - View.MeasureSpec.getSize(0), "\u0085\u0082\u0088\u0089\u0090\u0086\u009a\u0089\u0083\u008d", objArr25);
            jSONObject2.put(((String) objArr25[0]).intern(), owVar.setCompoundDrawableTintBlendMode());
            Object[] objArr26 = new Object[1];
            b((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, "\u0085\u0082\u0088\u0089\u0090\u0086\u009a\u009b\u008c\u0089", objArr26);
            jSONObject2.put(((String) objArr26[0]).intern(), owVar.setOnLongClickListener());
        } else if (pfVar instanceof pa) {
            jSONObject2.put(strIntern, ((pa) pfVar).setDividerPadding());
        } else if (pfVar instanceof ph) {
            ph phVar = (ph) pfVar;
            jSONObject2.put(strIntern, phVar.setY().toString());
            Object[] objArr27 = new Object[1];
            b(127 - TextUtils.indexOf("", "", 0), "\u008c\u0086\u0097\u008a\u0093\u0084\u0089\u0088\u009c\u0087\u0084\u0083\u0082\u0090\u0084", objArr27);
            jSONObject2.put(((String) objArr27[0]).intern(), phVar.setDividerPadding());
            Object[] objArr28 = new Object[1];
            b(126 - TextUtils.lastIndexOf("", '0'), "\u008c\u0086\u0097\u008a\u0093\u0084\u0089\u0088\u009c\u0087\u0085\u0092\u0082\u0083\u008a", objArr28);
            jSONObject2.put(((String) objArr28[0]).intern(), phVar.setX());
            Object[] objArr29 = new Object[1];
            b(ImageFormat.getBitsPerPixel(0) + 128, "\u008c\u0086\u0097\u008a\u0093\u0084\u0089\u0088\u009c\u0097\u0081\u0085\u0086\u0090\u0090\u0092\u0081", objArr29);
            jSONObject2.put(((String) objArr29[0]).intern(), phVar.setCompoundDrawableTintBlendMode());
        } else if (pfVar instanceof pe) {
            int i17 = f57604g + 109;
            f57603f = i17 % 128;
            if (i17 % 2 != 0) {
                peVar = (pe) pfVar;
                jSONObject2.put(strIntern, peVar.setDividerPadding().toString());
                Object[] objArr30 = new Object[1];
                a("╬줟ﶥ\ue05b铈뭣꼐", 60521 / View.resolveSizeAndState(0, 0, 1), objArr30);
                obj2 = objArr30[0];
            } else {
                peVar = (pe) pfVar;
                jSONObject2.put(strIntern, peVar.setDividerPadding().toString());
                Object[] objArr31 = new Object[1];
                a("╬줟ﶥ\ue05b铈뭣꼐", View.resolveSizeAndState(0, 0, 0) + 60521, objArr31);
                obj2 = objArr31[0];
            }
            jSONObject2.put(((String) obj2).intern(), peVar.setX());
        } else if (pfVar instanceof oy) {
            int i18 = f57604g + 123;
            f57603f = i18 % 128;
            if (i18 % 2 != 0) {
                Object[] objArr32 = new Object[1];
                a("╳큺콺敏\uf14a\uec47鬲", ExpandableListView.getPackedPositionType(1L) * 62731, objArr32);
                obj = objArr32[0];
            } else {
                Object[] objArr33 = new Object[1];
                a("╳큺콺敏\uf14a\uec47鬲", 62731 - ExpandableListView.getPackedPositionType(0L), objArr33);
                obj = objArr33[0];
            }
            jSONObject2.put(((String) obj).intern(), String.valueOf(((oy) pfVar).setX()));
        } else if (pfVar instanceof pl) {
            jSONObject2.put(strIntern, ((pl) pfVar).setDividerPadding().toString());
        }
        Unit unit = Unit.INSTANCE;
        return jSONObjectPut5.put(strIntern2, jSONObject2);
    }
}
