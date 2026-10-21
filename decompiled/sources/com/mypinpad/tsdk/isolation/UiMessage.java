package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Debug;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class UiMessage {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f51947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char f51948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f51949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f51950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f51951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f51952g = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f51953a;

    static {
        b();
        f51950e = 0;
        f51951f = 1;
        f51949d = 0;
        f51948c = (char) 53952;
        f51947b = new char[]{59253};
    }

    public UiMessage(@NotNull Context context, @NotNull setColorFilter setcolorfilter) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        this.f51953a = context;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r7 = 106 - r7
            int r6 = r6 * 3
            int r0 = r6 + 1
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.UiMessage.f51952g
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L34
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L34:
            int r9 = r9 + 1
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.UiMessage.a(byte, byte, short, java.lang.Object[]):void");
    }

    public static void b() {
        f51952g = new byte[]{92, -124, 49, 72};
    }

    public final boolean setY() throws Throwable {
        boolean z10;
        Context context;
        boolean z11;
        StringBuilder sb2;
        int i10;
        char c10;
        Context context2 = this.f51953a;
        int i11 = 1;
        if ((context2.getApplicationInfo().flags & 2) != 0) {
            int i12 = f51949d + 99;
            int i13 = i12 % 128;
            int i14 = i12 % 2;
            int i15 = i13 + 77;
            f51949d = i15 % 128;
            int i16 = i15 % 2;
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder sb3 = new StringBuilder();
        String string = Integer.toString(context2.getApplicationInfo().flags, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "");
        sb3.append(string);
        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0);
        int i17 = iLastIndexOf + 4;
        char cIndexOf = (byte) (44 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
        int i18 = f51951f + 37;
        f51950e = i18 % 128;
        int i19 = i18 % 2;
        char[] charArray = "㗡㗡㗡".toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = f51947b;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i20 = 0;
            while (i20 < length) {
                try {
                    Object[] objArr = new Object[i11];
                    objArr[0] = Integer.valueOf(cArr[i20]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(290255894);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getScrollBarSize() >> 8), Color.red(0) + 45, ExpandableListView.getPackedPositionGroup(0L) + 1116);
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr2 = new Object[1];
                        a(b11, (byte) (b11 | 7), b10, objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i20] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    i20++;
                    cArr = cArr;
                    length = length;
                    z10 = z10;
                    context2 = context2;
                    sb3 = sb3;
                    i11 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            context = context2;
            z11 = z10;
            sb2 = sb3;
            int i21 = f51951f + 55;
            f51950e = i21 % 128;
            int i22 = i21 % 2;
            cArr = cArr2;
        } else {
            context = context2;
            z11 = z10;
            sb2 = sb3;
        }
        Object[] objArr3 = {Integer.valueOf(f51948c)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) ('0' - AndroidCharacter.getMirror('0')), 44 - Process.getGidForName(""), TextUtils.indexOf("", "", 0, 0) + 1116);
            byte b12 = (byte) 0;
            byte b13 = b12;
            Object[] objArr4 = new Object[1];
            a(b13, (byte) (b13 | 7), b12, objArr4);
            method2 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i17];
        char c11 = 3;
        if (i17 % 2 != 0) {
            i10 = iLastIndexOf + 3;
            cArr3[i10] = (char) (charArray[i10] - cIndexOf);
        } else {
            i10 = i17;
        }
        if (i10 > 1) {
            int i23 = f51951f + 65;
            f51950e = i23 % 128;
            setincludefontpadding.setDividerPadding = i23 % 2 == 0 ? 0 : 1;
            while (true) {
                int i24 = setincludefontpadding.setDividerPadding;
                if (i24 >= i10) {
                    break;
                }
                char c12 = charArray[i24];
                setincludefontpadding.setY = c12;
                int i25 = i24 + 1;
                char c13 = charArray[i25];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c13;
                if (c12 == c13) {
                    cArr3[i24] = (char) (c12 - cIndexOf);
                    cArr3[i25] = (char) (c13 - cIndexOf);
                    c10 = c11;
                    i10 = i10;
                } else {
                    Object[] objArr5 = new Object[13];
                    objArr5[12] = setincludefontpadding;
                    objArr5[11] = Integer.valueOf(cCharValue);
                    objArr5[10] = setincludefontpadding;
                    objArr5[9] = setincludefontpadding;
                    objArr5[8] = Integer.valueOf(cCharValue);
                    objArr5[7] = setincludefontpadding;
                    objArr5[6] = setincludefontpadding;
                    objArr5[5] = Integer.valueOf(cCharValue);
                    objArr5[4] = setincludefontpadding;
                    objArr5[c11] = setincludefontpadding;
                    objArr5[2] = Integer.valueOf(cCharValue);
                    objArr5[1] = setincludefontpadding;
                    objArr5[0] = setincludefontpadding;
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 27, (Process.myTid() >> 22) + 2311);
                        byte b14 = (byte) 0;
                        Object[] objArr6 = new Object[1];
                        a(b14, (byte) f51952g.length, b14, objArr6);
                        String str = (String) objArr6[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr5)).intValue();
                    int i26 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i26) {
                        int i27 = f51950e + 43;
                        f51951f = i27 % 128;
                        int i28 = i27 % 2;
                        Object[] objArr7 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 != null) {
                            c10 = 3;
                        } else {
                            Class cls5 = (Class) setTextScaleX.setX((char) ((Process.myTid() >> 22) + 49103), 35 - Drawable.resolveOpacity(0, 0), TextUtils.indexOf("", "") + 2545);
                            byte b15 = (byte) 0;
                            byte b16 = b15;
                            Object[] objArr8 = new Object[1];
                            a(b16, b16, b15, objArr8);
                            String str2 = (String) objArr8[0];
                            Class<?> cls6 = Integer.TYPE;
                            c10 = 3;
                            method4 = cls5.getMethod(str2, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr7)).intValue();
                        int i29 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i30 = setincludefontpadding.setDividerPadding;
                        cArr3[i30] = cArr[iIntValue2];
                        cArr3[i30 + 1] = cArr[i29];
                    } else {
                        c10 = 3;
                        int i31 = setincludefontpadding.setX;
                        int i32 = setincludefontpadding.setOnFocusChangeListener;
                        if (i31 == i32) {
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i26, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i33 = (i32 * cCharValue) + iA2;
                            int i34 = setincludefontpadding.setDividerPadding;
                            cArr3[i34] = cArr[(i31 * cCharValue) + iA];
                            cArr3[i34 + 1] = cArr[i33];
                        } else {
                            int i35 = (i31 * cCharValue) + i26;
                            int i36 = (i32 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i37 = setincludefontpadding.setDividerPadding;
                            cArr3[i37] = cArr[i35];
                            cArr3[i37 + 1] = cArr[i36];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
                c11 = c10;
                i10 = i10;
            }
        }
        for (int i38 = 0; i38 < i17; i38++) {
            cArr3[i38] = (char) (cArr3[i38] ^ 13722);
        }
        String strIntern = new String(cArr3).intern();
        StringBuilder sb4 = sb2;
        sb4.append(strIntern);
        sb4.append(context.getApplicationInfo().flags & 2);
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{sb4.toString()}, -1689942959, 1689942969, (int) System.currentTimeMillis());
        return z11 | Debug.isDebuggerConnected();
    }
}
