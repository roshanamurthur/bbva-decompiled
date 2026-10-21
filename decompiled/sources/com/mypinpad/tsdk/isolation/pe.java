package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import androidx.camera.camera2.internal.n1;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class pe extends pf {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final char[] f57671o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final char f57672p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f57673q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f57674r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f57675s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f57676t = null;

    @NotNull
    public final UUID m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final String f57677n;

    static {
        b();
        f57675s = 1;
        f57673q = 0;
        f57674r = 1;
        f57672p = (char) 53956;
        f57671o = new char[]{59144, 59188, 59147, 59183, 59181, 59167, 59149, 59243, 59152, 59151, 59198, 59176, 59192, 59153, 59166, 59242, 59186, 59146, 59150, 59189, 59196, 59253, 59177, 59148, 59254};
    }

    public pe(@NotNull UUID uuid, @NotNull String str) throws Throwable {
        int i10;
        char c10;
        String str2 = "";
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(str, "");
        int iMyPid = Process.myPid() >> 22;
        int i11 = 27 - iMyPid;
        char packedPositionType = (byte) (12 - ExpandableListView.getPackedPositionType(0L));
        char[] charArray = "\u0001\u0011\u0011\u0004\u0015\u0002\r\u000b㗵㗵\u0011\u000f\u0018\n\u0000\u000e\u0012\u0004\u0004\u000e\u0005\n\t\u0017\u0010\u0014㖶".toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        int i12 = 1;
        char c11 = 0;
        char[] cArr = f57671o;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr = new Object[i12];
                    objArr[c11] = Integer.valueOf(cArr[i13]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(290255894);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), KeyEvent.normalizeMetaState(0) + 45, 1115 - Process.getGidForName(str2));
                        byte b10 = (byte) (-1);
                        byte b11 = (byte) (b10 + 1);
                        Object[] objArr2 = new Object[1];
                        c(b11, b10, b11, objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i13] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    i13++;
                    length = length;
                    cArr = cArr;
                    str2 = str2;
                    c11 = 0;
                    i12 = 1;
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
        Object[] objArr3 = {Integer.valueOf(f57672p)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        char c12 = '\b';
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 45 - (ViewConfiguration.getScrollBarSize() >> 8), 1116 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
            byte b12 = (byte) (-1);
            byte b13 = (byte) (b12 + 1);
            Object[] objArr4 = new Object[1];
            c(b13, b12, b13, objArr4);
            method2 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i11];
        if (i11 % 2 != 0) {
            i10 = 26 - iMyPid;
            cArr3[i10] = (char) (charArray[i10] - packedPositionType);
        } else {
            i10 = i11;
        }
        char c13 = 2;
        int i14 = f57675s;
        if (i10 > 1) {
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i15 = setincludefontpadding.setDividerPadding;
                if (i15 >= i10) {
                    break;
                }
                char c14 = charArray[i15];
                setincludefontpadding.setY = c14;
                int i16 = i15 + 1;
                char c15 = charArray[i16];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c15;
                if (c14 == c15) {
                    cArr3[i15] = (char) (c14 - packedPositionType);
                    cArr3[i16] = (char) (c15 - packedPositionType);
                    i10 = i10;
                    c10 = c12;
                    packedPositionType = packedPositionType;
                } else {
                    Object[] objArr5 = new Object[13];
                    objArr5[12] = setincludefontpadding;
                    objArr5[11] = Integer.valueOf(cCharValue);
                    objArr5[10] = setincludefontpadding;
                    objArr5[9] = setincludefontpadding;
                    objArr5[c12] = Integer.valueOf(cCharValue);
                    objArr5[7] = setincludefontpadding;
                    objArr5[6] = setincludefontpadding;
                    objArr5[5] = Integer.valueOf(cCharValue);
                    objArr5[4] = setincludefontpadding;
                    objArr5[3] = setincludefontpadding;
                    objArr5[c13] = Integer.valueOf(cCharValue);
                    objArr5[1] = setincludefontpadding;
                    objArr5[0] = setincludefontpadding;
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 27 - Color.blue(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2311);
                        byte b14 = (byte) (-1);
                        byte b15 = (byte) (b14 + 1);
                        Object[] objArr6 = new Object[1];
                        c(b15, b14, (byte) (b15 + 3), objArr6);
                        String str3 = (String) objArr6[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str3, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr5)).intValue();
                    int i17 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i17) {
                        int i18 = i14 + 75;
                        int i19 = i18 % 128;
                        int i20 = i18 % 2;
                        Object[] objArr7 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 != null) {
                            c10 = '\b';
                        } else {
                            Class cls5 = (Class) setTextScaleX.setX((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 49103), 35 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 2545);
                            byte b16 = (byte) (-1);
                            byte b17 = (byte) (b16 + 1);
                            Object[] objArr8 = new Object[1];
                            c(b17, b16, (byte) (b17 | 7), objArr8);
                            String str4 = (String) objArr8[0];
                            Class<?> cls6 = Integer.TYPE;
                            c10 = '\b';
                            method4 = cls5.getMethod(str4, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr7)).intValue();
                        int i21 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i22 = setincludefontpadding.setDividerPadding;
                        cArr3[i22] = cArr[iIntValue2];
                        cArr3[i22 + 1] = cArr[i21];
                    } else {
                        c10 = '\b';
                        int i23 = setincludefontpadding.setX;
                        int i24 = setincludefontpadding.setOnFocusChangeListener;
                        if (i23 == i24) {
                            int i25 = i14 + 59;
                            int i26 = i25 % 128;
                            int i27 = i25 % 2;
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i17, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i28 = (i24 * cCharValue) + iA2;
                            int i29 = setincludefontpadding.setDividerPadding;
                            cArr3[i29] = cArr[(i23 * cCharValue) + iA];
                            cArr3[i29 + 1] = cArr[i28];
                        } else {
                            int i30 = (i23 * cCharValue) + i17;
                            int i31 = (i24 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i32 = setincludefontpadding.setDividerPadding;
                            cArr3[i32] = cArr[i30];
                            cArr3[i32 + 1] = cArr[i31];
                        }
                        setincludefontpadding.setDividerPadding += 2;
                        c12 = c10;
                        i10 = i10;
                        packedPositionType = packedPositionType;
                        c13 = 2;
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
                c12 = c10;
                i10 = i10;
                packedPositionType = packedPositionType;
                c13 = 2;
            }
        }
        int i33 = 0;
        while (i33 < i11) {
            int i34 = i14 + 31;
            int i35 = i34 % 128;
            if (i34 % 2 != 0) {
                cArr3[i33] = (char) (cArr3[i33] ^ 19);
                i33 += 96;
            } else {
                cArr3[i33] = (char) (cArr3[i33] ^ 13722);
                i33++;
            }
        }
        super(null, n1.f(cArr3), null, 0L, 13, null);
        this.m = uuid;
        this.f57677n = str;
    }

    public static void b() {
        f57676t = new byte[]{89, 94, -75, -44};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r8 = r8 + 99
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.pe.f57676t
            if (r2 != 0) goto L16
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L32
        L16:
            r3 = r1
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r2[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L32:
            int r7 = -r7
            int r7 = r7 + r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.pe.c(int, byte, int, java.lang.Object[]):void");
    }

    @NotNull
    public final UUID setDividerPadding() {
        int i10 = f57674r + 37;
        f57673q = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 52 / 0;
        }
        return this.m;
    }

    @NotNull
    public final String setX() {
        int i10 = f57673q;
        int i11 = i10 + 125;
        f57674r = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 13;
        f57674r = i13 % 128;
        if (i13 % 2 != 0) {
            return this.f57677n;
        }
        throw null;
    }
}
