package com.mypinpad.tsdk.isolation;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class pc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f57654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f57656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f57657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f57658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f57659f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f57660g = 0;

    static {
        c();
        f57657d = 0;
        f57658e = 1;
        f57655b = 0;
        f57656c = 1;
        f57654a = 5889738033585004892L;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x018d  */
    /* JADX WARN: Code duplicated, block: B:33:0x018e  */
    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        int i11;
        Throwable cause;
        char[] charArray = str.toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        int i12 = 0;
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i13 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            int length2 = charArray.length;
            i11 = f57660g;
            if (i13 >= length2) {
                break;
            }
            int i14 = f57658e + 33;
            f57657d = i14 % 128;
            int i15 = i14 % 2;
            char c10 = charArray[i13];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[2] = setlayoutanimation;
                objArr2[1] = setlayoutanimation;
                objArr2[i12] = Integer.valueOf(c10);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) View.MeasureSpec.getMode(i12), View.MeasureSpec.getMode(i12) + 33, 1194 - TextUtils.lastIndexOf("", '0', i12, i12));
                    byte b10 = (byte) i12;
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr3 = new Object[1];
                    b(b10, b11, (byte) (b11 + 1), objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i13] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f57654a ^ 1779209353347916695L);
                Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 44 - (ViewConfiguration.getTouchSlop() >> 8), 728 - TextUtils.getCapsMode("", 0, 0));
                    byte b12 = (byte) (i11 & 3);
                    byte b13 = (byte) (-b12);
                    Object[] objArr5 = new Object[1];
                    b(b12, b13, (byte) (b13 + 1), objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i12 = 0;
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
                String str2 = new String(cArr);
                int i17 = f57657d + 29;
                f57658e = i17 % 128;
                int i18 = i17 % 2;
                objArr[0] = str2;
                return;
            }
            cArr[i16] = (char) jArr[i16];
            Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(645183118);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (Process.getGidForName("") + 1), 43 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 728);
                byte b14 = (byte) (i11 & 3);
                byte b15 = (byte) (-b14);
                Object[] objArr7 = new Object[1];
                b(b14, b15, (byte) (b15 + 1), objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(645183118, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            int i19 = f57658e + 51;
            f57657d = i19 % 128;
            int i20 = i19 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r0 = r8 + 1
            int r6 = r6 * 3
            int r6 = 110 - r6
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.pc.f57659f
            if (r2 != 0) goto L17
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L36
        L17:
            r3 = r1
        L18:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r2[r7]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L36:
            int r6 = r6 + r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.pc.b(byte, byte, int, java.lang.Object[]):void");
    }

    public static void c() {
        f57659f = new byte[]{83, -24, -71, 98};
        f57660g = 221;
    }

    public static final void setY(@NotNull pf pfVar) throws Throwable {
        int i10 = f57656c + 3;
        f57655b = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(pfVar, "");
        if (pfVar instanceof ow) {
            pd pdVar = pd.INSTANCE;
            JSONObject jSONObject = new JSONObject();
            Object[] objArr = new Object[1];
            a("슯泏鹿즁第ꕋ퓀؍놭\ue3d7൧벁\uee24ᡒ䯰\uf516Ⓘ囈", 44641 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
            ow owVar = (ow) pfVar;
            jSONObject.put(((String) objArr[0]).intern(), (String) ow.setOnFocusChangeListener(new Object[]{owVar}, -670300325, 670300325, System.identityHashCode(owVar)));
            Object[] objArr2 = new Object[1];
            a("슯\udcafﺿ颡몬咫皀Ⴃ㊧첧\ueead", 7680 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
            jSONObject.put(((String) objArr2[0]).intern(), owVar.setX());
            Object[] objArr3 = new Object[1];
            a("스\uda9f\uf293誻ꊥ몛劈檕ʝ", (ViewConfiguration.getTapTimeout() >> 16) + 6151, objArr3);
            jSONObject.put(((String) objArr3[0]).intern(), owVar.setDividerPadding());
            Object[] objArr4 = new Object[1];
            a("슸ꁻ܂\ueac1䧭ⲋ鉁煡퐳믗ửﶏ损왖ꔈࣆ\ueffe劂", TextUtils.indexOf("", "") + 25301, objArr4);
            jSONObject.put(((String) objArr4[0]).intern(), owVar.setOnFocusChangeListener());
            Object[] objArr5 = new Object[1];
            a("슬駁瑶킨꼲\u0bba\ue6d2뵳ᦜ\uf43a", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23399, objArr5);
            jSONObject.put(((String) objArr5[0]).intern(), owVar.setCompoundDrawableTintBlendMode());
            Object[] objArr6 = new Object[1];
            a("슸蘒뎾欰ₒ\ud872釢䥋ۜ㾢", 14479 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr6);
            pd.setOnFocusChangeListener(new Object[]{jSONObject.put(((String) objArr6[0]).intern(), owVar.setOnLongClickListener())}, 34418482, -34418481, (int) System.currentTimeMillis());
        }
        mr mrVar = mr.setX;
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr7 = new Object[1];
        a("승䐏쿨兗\ud83a掷\ue563氭\uf78d祲肙", ExpandableListView.getPackedPositionType(0L) + 34469, objArr7);
        sb2.append(((String) objArr7[0]).intern());
        sb2.append(pfVar.getNavBarTitleString());
        mt.setX(new Object[]{mrVar, sb2.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
        nf.setX().setDividerPadding(pfVar);
        int i12 = f57655b + 67;
        f57656c = i12 % 128;
        int i13 = i12 % 2;
    }
}
