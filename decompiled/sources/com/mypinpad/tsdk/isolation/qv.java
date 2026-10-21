package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import java.lang.reflect.Method;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class qv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f58012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f58013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f58014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f58015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f58016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f58017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f58018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f58019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f58020i = null;

    public /* synthetic */ class setX {
        public static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[um.setX.values().length];
            try {
                iArr[um.setX.setX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[um.setX.setCompoundDrawableTintBlendMode.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            setX = iArr;
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i10 = ~iCurrentTimeMillis;
            int i11 = (i10 | iCurrentTimeMillis) & i10;
            int i12 = ((~i11) & (-675547172)) | (i11 & 675547171);
            int i13 = i11 & (-675547172);
            int i14 = (i13 & i12) | (i12 ^ i13);
            int i15 = ~i14;
            int i16 = (i14 | i15) & i15;
            int i17 = 675282945 & i16;
            int i18 = (i16 | 675282945) & (~i17);
            int i19 = (i18 & i17) | (i18 ^ i17);
            int i20 = 1013262395 & iCurrentTimeMillis;
            int i21 = (iCurrentTimeMillis | 1013262395) & (~i20);
            int i22 = ~((i21 & i20) | (i21 ^ i20));
            int i23 = ((~i22) & i19) | ((~i19) & i22);
            int i24 = i19 & i22;
            int i25 = ((i24 & i23) | (i23 ^ i24)) * (-502);
            int i26 = 1378167346 & i25;
            int i27 = (i25 | 1378167346) & (~i26);
            int i28 = i26 << 1;
            int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
            int i30 = ((~i10) & (-675547172)) | (i10 & 675547171);
            int i31 = i10 & (-675547172);
            int i32 = (i31 & i30) | (i30 ^ i31);
            int i33 = (i32 & 1012998169) | (i32 ^ 1012998169);
            int i34 = ~i33;
            int i35 = (i33 | i34) & i34;
            int i36 = i35 & i22;
            int i37 = (i22 | i35) & (~i36);
            int i38 = ((i37 & i36) | (i37 ^ i36)) * 502;
            int i39 = ((i29 | i38) << 1) - (i38 ^ i29);
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i40 = ~iCurrentTimeMillis2;
            int i41 = ~((-1752830241) | i40);
            int i42 = (-1700297896) & i41;
            int i43 = (i41 | (-1700297896)) & (~i42);
            int i44 = -(~(((i43 & i42) | (i43 ^ i42)) * (-235)));
            int i45 = (((-625315736) ^ i44) + ((i44 & (-625315736)) << 1)) - 1;
            int i46 = ~(((-1752830241) & iCurrentTimeMillis2) | ((-1752830241) ^ iCurrentTimeMillis2));
            int i47 = ((i46 & (-1700297896)) | ((~i46) & (-1700297896)) | (1700297895 & i46)) * (-470);
            int i48 = (i45 ^ i47) + ((i47 & i45) << 1);
            int i49 = (i40 & (-1616384033)) | (1616384032 & iCurrentTimeMillis2);
            int i50 = iCurrentTimeMillis2 & (-1616384033);
            int i51 = (i50 & i49) | (i49 ^ i50);
            int i52 = ~i51;
            int i53 = (i51 | i52) & i52;
            int i54 = (-1836744104) & i53;
            int i55 = (i53 | (-1836744104)) & (~i54);
            if (i39 <= (i48 - (~(((i55 & i54) | (i55 ^ i54)) * 235))) - 1) {
                throw null;
            }
        }
    }

    static {
        c();
        f58018g = 0;
        f58019h = 1;
        f58016e = 0;
        f58017f = 1;
        f58012a = -523796912;
        f58013b = -1454817047;
        f58014c = -1886212503;
        f58015d = new byte[]{-121, 108, 108, -121, Constants.FCI_TEMPLATE, 110, -102, 109, 105, 105, -105, Constants.FCI_TEMPLATE, -110, 105, -97, -108, -108, -108, -108, -108, -108};
    }

    public static void a(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
        int i13;
        byte[] bArr;
        byte[] bArr2;
        int length;
        int i14 = f58013b;
        setTextAlignment settextalignment = new setTextAlignment();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i15 = 1;
            Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(i14)};
            int i16 = 0;
            Map map = setTextScaleX.setMaxEms;
            Object method = map.get(-769569468);
            if (method == null) {
                Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 50, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 433);
                byte b11 = (byte) 0;
                byte b12 = b11;
                Object[] objArr3 = new Object[1];
                b(b12, b12, b11, objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                method = cls.getMethod(str, cls2, cls2);
                map.put(-769569468, method);
            }
            int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                i13 = 1;
            } else {
                int i17 = f58018g + 67;
                f58019h = i17 % 128;
                int i18 = i17 % 2;
                i13 = 0;
            }
            int i19 = f58012a;
            byte[] bArr3 = f58015d;
            if (i13 != 0) {
                if (bArr3 != null) {
                    int i20 = f58019h + 73;
                    f58018g = i20 % 128;
                    if (i20 % 2 != 0) {
                        length = bArr3.length;
                        bArr2 = new byte[length];
                    } else {
                        length = bArr3.length;
                        bArr2 = new byte[length];
                    }
                    int i21 = 0;
                    while (i21 < length) {
                        Object[] objArr4 = new Object[i15];
                        objArr4[i16] = Integer.valueOf(bArr3[i21]);
                        Map map2 = setTextScaleX.setMaxEms;
                        Object method2 = map2.get(510767826);
                        if (method2 == null) {
                            method2 = ((Class) setTextScaleX.setX((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 49111), (KeyEvent.getMaxKeyCode() >> 16) + 41, 52 - Color.argb(i16, i16, i16, i16))).getMethod("s", Integer.TYPE);
                            map2.put(510767826, method2);
                        }
                        bArr2[i21] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                        i21++;
                        length = length;
                        i15 = 1;
                        i16 = 0;
                    }
                } else {
                    bArr2 = bArr3;
                }
                bArr2.getClass();
                int i22 = f58018g + 75;
                f58019h = i22 % 128;
                int i23 = i22 % 2;
                Object[] objArr5 = {Integer.valueOf(i12), Integer.valueOf(i19)};
                Map map3 = setTextScaleX.setMaxEms;
                Object method3 = map3.get(-769569468);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (Process.myPid() >> 22), (ViewConfiguration.getEdgeSlop() >> 16) + 49, 433 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b14, b14, b13, objArr6);
                    String str2 = (String) objArr6[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str2, cls4, cls4);
                    map3.put(-769569468, method3);
                }
                iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) i14) ^ 7616081452308447380L)));
            }
            if (iIntValue > 0) {
                settextalignment.setX = ((i12 + iIntValue) - 2) + ((int) (((long) i19) ^ 7616081452308447380L)) + i13;
                Object[] objArr7 = {settextalignment, Integer.valueOf(i11), Integer.valueOf(f58014c), sb2};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(193260760);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 41, 2802 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    byte b15 = (byte) 0;
                    byte b16 = (byte) (b15 + 1);
                    Object[] objArr8 = new Object[1];
                    b((byte) (b16 - 1), b16, b15, objArr8);
                    String str3 = (String) objArr8[0];
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str3, Object.class, cls6, cls6, Object.class);
                    map4.put(193260760, method4);
                }
                ((StringBuilder) ((Method) method4).invoke(null, objArr7)).append(settextalignment.setCompoundDrawableTintBlendMode);
                settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    bArr = new byte[length2];
                    for (int i24 = 0; i24 < length2; i24++) {
                        int i25 = f58018g + 63;
                        f58019h = i25 % 128;
                        int i26 = i25 % 2;
                        bArr[i24] = (byte) (((long) bArr3[i24]) ^ 7616081452308447380L);
                    }
                    int i27 = f58018g + 63;
                    f58019h = i27 % 128;
                    int i28 = i27 % 2;
                } else {
                    bArr = bArr3;
                }
                int i29 = 1;
                boolean z10 = bArr != null;
                while (true) {
                    settextalignment.setDividerPadding = i29;
                    if (settextalignment.setDividerPadding >= iIntValue) {
                        break;
                    }
                    if (!z10) {
                        settextalignment.setX--;
                        throw null;
                    }
                    int i30 = settextalignment.setX;
                    settextalignment.setX = i30 - 1;
                    char c10 = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr3[i30]) ^ 7616081452308447380L)) + s4)) ^ b10));
                    settextalignment.setCompoundDrawableTintBlendMode = c10;
                    sb2.append(c10);
                    settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                    i29 = settextalignment.setDividerPadding + 1;
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

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002f -> B:11:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r8 = r8 * 3
            int r8 = r8 + 109
            int r9 = r9 * 3
            int r9 = 1 - r9
            byte[] r0 = new byte[r9]
            byte[] r1 = com.mypinpad.tsdk.isolation.qv.f58020i
            r2 = 0
            if (r1 != 0) goto L1a
            r3 = r1
            r5 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r7
            goto L38
        L1a:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L1e:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r0[r3] = r4
            int r8 = r8 + 1
            if (r5 != r9) goto L2f
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r2)
            r10[r2] = r7
            return
        L2f:
            r3 = r1[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L38:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.qv.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f58020i = new byte[]{33, 87, ComputeCcCommandApdu.EXPECTED_P1, -82};
    }

    public static final qt d(JSONObject jSONObject) throws Throwable {
        Object[] objArr = new Object[1];
        a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 122, (byte) View.MeasureSpec.getMode(0), (short) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (-651947669) - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) - 1234058947, objArr);
        long j10 = jSONObject.getLong(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a((-122) - TextUtils.getTrimmedLength(""), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 651947673, (-1234058947) - TextUtils.lastIndexOf("", '0', 0), objArr2);
        long j11 = jSONObject.getLong(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(ExpandableListView.getPackedPositionChild(0L) - 121, (byte) (ViewConfiguration.getTapTimeout() >> 16), (short) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (-651947661) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1234058944, objArr3);
        String y7 = mp.setY(jSONObject, ((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        a((-120) - ExpandableListView.getPackedPositionType(0L), (byte) (Process.myTid() >> 22), (short) View.resolveSizeAndState(0, 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 651947660, (-1234058943) - MotionEvent.axisFromString(""), objArr4);
        List<String> compoundDrawableTintBlendMode = mp.setCompoundDrawableTintBlendMode(jSONObject, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 119, (byte) View.combineMeasuredStates(0, 0), (short) KeyEvent.keyCodeFromString(""), (-651947670) - KeyEvent.normalizeMetaState(0), (-1234058938) - Color.red(0), objArr5);
        qt qtVar = new qt(j10, j11, y7, compoundDrawableTintBlendMode, mp.setCompoundDrawableTintBlendMode(jSONObject, ((String) objArr5[0]).intern()));
        int i10 = f58016e + 97;
        f58017f = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 49 / 0;
        }
        return qtVar;
    }

    public static final /* synthetic */ qt setDividerPadding(JSONObject jSONObject) throws Throwable {
        int i10 = f58017f + 73;
        f58016e = i10 % 128;
        int i11 = i10 % 2;
        qt qtVarD = d(jSONObject);
        int i12 = f58017f + 27;
        f58016e = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 57 / 0;
        }
        return qtVarD;
    }

    @Nullable
    public static final String setOnFocusChangeListener(@NotNull qx qxVar) throws Throwable {
        Intrinsics.checkNotNullParameter(qxVar, "");
        try {
            Base64.Decoder urlDecoder = Base64.getUrlDecoder();
            String dividerPadding = qxVar.setDividerPadding();
            Object[] objArr = new Object[1];
            a((-124) - Gravity.getAbsoluteGravity(0, 0), (byte) (ViewConfiguration.getLongPressTimeout() >> 16), (short) ('0' - AndroidCharacter.getMirror('0')), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 651947726, (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 1234058933, objArr);
            byte[] bArrDecode = urlDecoder.decode((String) StringsKt__StringsKt.split$default((CharSequence) dividerPadding, new String[]{((String) objArr[0]).intern()}, false, 0, 6, (Object) null).get(1));
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
            qt qtVarD = d(new JSONObject(new String(bArrDecode, Charsets.UTF_8)));
            int i10 = setX.setX[qxVar.setCompoundDrawableTintBlendMode().ordinal()];
            if (i10 == 1) {
                return (String) ((List) qt.setCompoundDrawableTintBlendMode(new Object[]{qtVarD}, 893873829, -893873827, System.identityHashCode(qtVarD))).get(0);
            }
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String str = (String) ((List) qt.setCompoundDrawableTintBlendMode(new Object[]{qtVarD}, 615385835, -615385835, System.identityHashCode(qtVarD))).get(0);
            int i11 = f58016e + 61;
            f58017f = i11 % 128;
            if (i11 % 2 != 0) {
                return str;
            }
            throw null;
        } catch (Exception e5) {
            mu.setCompoundDrawableTintBlendMode(new Object[]{170005, null, e5, 2}, -1968587119, 1968587120, 170005);
            return null;
        }
    }
}
