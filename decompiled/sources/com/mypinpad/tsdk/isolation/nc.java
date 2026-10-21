package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.mypinpad.tsdk.api.errors.TerminalException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nEmvTerminalAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmvTerminalAdapter.kt\ncom/mypinpad/tsdk/internal/emvlib/EmvTerminalAdapterKt\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n7#2,8:93\n7#2,8:101\n288#3,2:109\n*S KotlinDebug\n*F\n+ 1 EmvTerminalAdapter.kt\ncom/mypinpad/tsdk/internal/emvlib/EmvTerminalAdapterKt\n*L\n53#1:93,8\n79#1:101,8\n84#1:109,2\n*E\n"})
public final class nc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f57232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f57233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f57234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f57235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f57236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f57237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f57238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f57239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f57240i = null;

    public static final class setCompoundDrawableTintBlendMode implements rf {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f57241q0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ String f57242p0;

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) objArr[0];
            int i13 = f57241q0 + 73;
            int i14 = i13 % 128;
            int i15 = i13 % 2;
            String str = setcompounddrawabletintblendmode.f57242p0;
            int i16 = i14 & 15;
            int i17 = (i14 | 15) & (~i16);
            int i18 = i16 << 1;
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            f57241q0 = i19 % 128;
            if (i19 % 2 != 0) {
                return str;
            }
            throw null;
        }

        @Override // com.mypinpad.tsdk.isolation.rf
        @NotNull
        public final String setY() {
            return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -1600555711, 1600555711, System.identityHashCode(this));
        }
    }

    public /* synthetic */ class setY {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f57243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f57244b;
        public static final /* synthetic */ int[] setDividerPadding;
        public static final /* synthetic */ int[] setOnFocusChangeListener;
        public static final /* synthetic */ int[] setX;
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[setClipChildren.values().length];
            try {
                iArr[setClipChildren.setOnFocusChangeListener.ordinal()] = 1;
                int i10 = ((1 & 118) + (1 | 118)) - 1;
                f57243a = i10 % 128;
                int i11 = i10 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setClipChildren.setX.ordinal()] = 2;
                int i12 = f57244b + 53;
                f57243a = i12 % 128;
                int i13 = i12 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setClipChildren.setLayoutAnimation.ordinal()] = 3;
                int i14 = f57244b;
                int i15 = i14 & 89;
                int i16 = (i14 | 89) & (~i15);
                int i17 = i15 << 1;
                int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
                f57243a = i18 % 128;
                int i19 = i18 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[setClipChildren.setCompoundDrawableTintBlendMode.ordinal()] = 4;
                int i20 = f57243a;
                int i21 = i20 & 93;
                int i22 = (i20 | 93) & (~i21);
                int i23 = i21 << 1;
                int i24 = (i22 & i23) + (i22 | i23);
                f57244b = i24 % 128;
                int i25 = i24 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[setClipChildren.setOnLongClickListener.ordinal()] = 5;
                int i26 = f57244b;
                int i27 = (i26 & 65) + (i26 | 65);
                f57243a = i27 % 128;
                int i28 = i27 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[setClipChildren.setZ.ordinal()] = 6;
                int i29 = f57244b + 115;
                f57243a = i29 % 128;
                int i30 = i29 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[setClipChildren.getNavBarTitleString.ordinal()] = 7;
                int i31 = f57244b;
                int i32 = (i31 & (-78)) | ((~i31) & 77);
                int i33 = -(-((i31 & 77) << 1));
                int i34 = (i32 & i33) + (i33 | i32);
                f57243a = i34 % 128;
                int i35 = i34 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[setClipChildren.setDividerPadding.ordinal()] = 8;
                int i36 = f57244b;
                int i37 = (i36 & (-120)) | ((~i36) & 119);
                int i38 = (i36 & 119) << 1;
                int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                f57243a = i39 % 128;
                int i40 = i39 % 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[setClipChildren.setNavigationOnClickListener.ordinal()] = 9;
                int i41 = f57243a + 87;
                f57244b = i41 % 128;
                int i42 = i41 % 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[setClipChildren.setTextAlignment.ordinal()] = 10;
                int i43 = f57243a;
                int i44 = ((i43 ^ 97) | (i43 & 97)) << 1;
                int i45 = -(((~i43) & 97) | (i43 & (-98)));
                int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                f57244b = i46 % 128;
                int i47 = i46 % 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[setClipChildren.setIncludeFontPadding.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[setClipChildren.setOnDragListener.ordinal()] = 12;
                int i48 = f57244b;
                int i49 = (((i48 ^ 71) | (i48 & 71)) << 1) - (((~i48) & 71) | (i48 & (-72)));
                f57243a = i49 % 128;
                int i50 = i49 % 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[setClipChildren.setAlwaysDrawnWithCacheEnabled.ordinal()] = 13;
                int i51 = f57243a;
                int i52 = i51 & 105;
                int i53 = ((i51 | 105) & (~i52)) + (i52 << 1);
                f57244b = i53 % 128;
                int i54 = i53 % 2;
            } catch (NoSuchFieldError unused13) {
            }
            setY = iArr;
            int[] iArr2 = new int[setOnItemLongClickListener.values().length];
            try {
                iArr2[setOnItemLongClickListener.setY.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[setOnItemLongClickListener.setOnFocusChangeListener.ordinal()] = 2;
                int i55 = f57244b;
                int i56 = ((i55 & 28) + (i55 | 28)) - 1;
                f57243a = i56 % 128;
                int i57 = i56 % 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[setOnItemLongClickListener.setDividerPadding.ordinal()] = 3;
                int i58 = f57243a;
                int i59 = i58 | 59;
                int i60 = ((i59 << 1) - (~(-((~(i58 & 59)) & i59)))) - 1;
                f57244b = i60 % 128;
                int i61 = i60 % 2;
            } catch (NoSuchFieldError unused16) {
            }
            setOnFocusChangeListener = iArr2;
            int[] iArr3 = new int[so.values().length];
            try {
                iArr3[so.setY.ordinal()] = 1;
                int i62 = f57244b;
                int i63 = ((i62 ^ 30) + ((i62 & 30) << 1)) - 1;
                f57243a = i63 % 128;
                int i64 = i63 % 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[so.setOnFocusChangeListener.ordinal()] = 2;
                int i65 = f57243a;
                int i66 = i65 & 121;
                int i67 = -(-((i65 ^ 121) | i66));
                int i68 = (i66 & i67) + (i67 | i66);
                f57244b = i68 % 128;
                int i69 = i68 % 2;
            } catch (NoSuchFieldError unused18) {
            }
            setDividerPadding = iArr3;
            int[] iArr4 = new int[SessionActivationFailureCause.values().length];
            try {
                iArr4[SessionActivationFailureCause.setLayoutAnimation.ordinal()] = 1;
                int i70 = f57243a;
                int i71 = (i70 ^ 67) + ((i70 & 67) << 1);
                f57244b = i71 % 128;
                int i72 = i71 % 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[SessionActivationFailureCause.getNavBarTitleString.ordinal()] = 2;
                int i73 = f57243a;
                int i74 = (i73 ^ 51) + ((i73 & 51) << 1);
                f57244b = i74 % 128;
                int i75 = i74 % 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[SessionActivationFailureCause.setY.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[SessionActivationFailureCause.setCompoundDrawableTintBlendMode.ordinal()] = 4;
                int i76 = f57243a;
                int i77 = (((i76 & (-108)) | ((~i76) & 107)) - (~((i76 & 107) << 1))) - 1;
                f57244b = i77 % 128;
                int i78 = i77 % 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[SessionActivationFailureCause.setOnFocusChangeListener.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            setX = iArr4;
            int i79 = f57243a;
            int i80 = ((i79 | 37) << 1) - (i79 ^ 37);
            f57244b = i80 % 128;
            int i81 = i80 % 2;
        }
    }

    static {
        c();
        f57238g = 0;
        f57239h = 1;
        f57236e = 0;
        f57237f = 1;
        f57232a = -613298826;
        f57233b = -1454817114;
        f57234c = 1402392155;
        f57235d = new byte[]{82, -82, 7, -6, 84, -43, 31, 51, 0, -41, 32, -36, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, -40, 42, -44, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, -41, -123, 110, 43, -45, 57, -37, 44, -40, Constants.CVR_B2b87_11_RFU, -108, -108};
    }

    public static void a(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
        byte[] bArr;
        int i13;
        boolean z10;
        byte[] bArr2;
        int i14 = f57233b;
        setTextAlignment settextalignment = new setTextAlignment();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i15 = 1;
            Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(i14)};
            int i16 = 0;
            Map map = setTextScaleX.setMaxEms;
            Object method = map.get(-769569468);
            if (method == null) {
                Class cls = (Class) setTextScaleX.setX((char) (MotionEvent.axisFromString("") + 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 49, 435 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                byte b11 = (byte) 0;
                byte b12 = b11;
                Object[] objArr3 = new Object[1];
                b((byte) (b12 + 1), b12, b11, objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                method = cls.getMethod(str, cls2, cls2);
                map.put(-769569468, method);
            }
            int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
            int i17 = iIntValue == -1 ? 1 : 0;
            int i18 = f57232a;
            byte[] bArr3 = f57235d;
            if (i17 != 0) {
                if (bArr3 != null) {
                    int length = bArr3.length;
                    bArr2 = new byte[length];
                    int i19 = 0;
                    while (i19 < length) {
                        Object[] objArr4 = new Object[i15];
                        objArr4[i16] = Integer.valueOf(bArr3[i19]);
                        Map map2 = setTextScaleX.setMaxEms;
                        Object method2 = map2.get(510767826);
                        if (method2 == null) {
                            method2 = ((Class) setTextScaleX.setX((char) (49110 - MotionEvent.axisFromString("")), View.getDefaultSize(i16, i16) + 41, 52 - TextUtils.getOffsetAfter("", i16))).getMethod("s", Integer.TYPE);
                            map2.put(510767826, method2);
                        }
                        bArr2[i19] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                        i19++;
                        length = length;
                        i15 = 1;
                        i16 = 0;
                    }
                } else {
                    bArr2 = bArr3;
                }
                bArr2.getClass();
                int i20 = f57238g + 93;
                f57239h = i20 % 128;
                int i21 = i20 % 2;
                Object[] objArr5 = {Integer.valueOf(i12), Integer.valueOf(i18)};
                Map map3 = setTextScaleX.setMaxEms;
                Object method3 = map3.get(-769569468);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.alpha(0) + 49, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 434);
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b((byte) (b14 + 1), b14, b13, objArr6);
                    String str2 = (String) objArr6[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str2, cls4, cls4);
                    map3.put(-769569468, method3);
                }
                iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) i14) ^ 7616081452308447380L)));
            }
            if (iIntValue > 0) {
                settextalignment.setX = ((i12 + iIntValue) - 2) + ((int) (((long) i18) ^ 7616081452308447380L)) + i17;
                Object[] objArr7 = {settextalignment, Integer.valueOf(i11), Integer.valueOf(f57234c), sb2};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(193260760);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) Gravity.getAbsoluteGravity(0, 0), ExpandableListView.getPackedPositionChild(0L) + 43, TextUtils.indexOf("", "") + 2803);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr8 = new Object[1];
                    b(b16, b16, b15, objArr8);
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
                    for (int i22 = 0; i22 < length2; i22++) {
                        int i23 = f57239h + 109;
                        f57238g = i23 % 128;
                        int i24 = i23 % 2;
                        bArr[i22] = (byte) (((long) bArr3[i22]) ^ 7616081452308447380L);
                    }
                } else {
                    bArr = bArr3;
                }
                if (bArr != null) {
                    int i25 = f57238g + 83;
                    f57239h = i25 % 128;
                    int i26 = i25 % 2;
                    i13 = 1;
                    z10 = true;
                } else {
                    i13 = 1;
                    z10 = false;
                }
                while (true) {
                    settextalignment.setDividerPadding = i13;
                    if (settextalignment.setDividerPadding >= iIntValue) {
                        break;
                    }
                    if (!z10) {
                        settextalignment.setX--;
                        throw null;
                    }
                    int i27 = settextalignment.setX;
                    settextalignment.setX = i27 - 1;
                    char c10 = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr3[i27]) ^ 7616081452308447380L)) + s4)) ^ b10));
                    settextalignment.setCompoundDrawableTintBlendMode = c10;
                    sb2.append(c10);
                    settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                    i13 = settextalignment.setDividerPadding + 1;
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

    public static void b(byte b10, int i10, short s4, Object[] objArr) {
        int i11 = 112 - (b10 * 3);
        int i12 = 4 - (s4 * 3);
        int i13 = i10 * 2;
        byte[] bArr = new byte[1 - i13];
        int i14 = 0 - i13;
        byte[] bArr2 = f57240i;
        int i15 = -1;
        if (bArr2 == null) {
            i11 = (-i11) + i14;
            i14 = i14;
            i12++;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i15 = -1;
        }
        while (true) {
            int i16 = i15 + 1;
            bArr[i16] = (byte) i11;
            if (i16 == i14) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            i11 = (-bArr2[i12]) + i11;
            i14 = i14;
            i12++;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i15 = i16;
        }
    }

    public static void c() {
        f57240i = new byte[]{58, -70, -56, -24};
    }

    @NotNull
    public static final rz setCompoundDrawableTintBlendMode(@NotNull setOnItemLongClickListener setonitemlongclicklistener) {
        int i10 = f57237f + 23;
        f57236e = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(setonitemlongclicklistener, "");
        int i12 = setY.setOnFocusChangeListener[setonitemlongclicklistener.ordinal()];
        if (i12 == 1) {
            return rz.setY;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                return rz.setDividerPadding;
            }
            throw new NoWhenBranchMatchedException();
        }
        rz rzVar = rz.setCompoundDrawableTintBlendMode;
        int i13 = f57237f + 111;
        f57236e = i13 % 128;
        int i14 = i13 % 2;
        return rzVar;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        setClipChildren setclipchildren = (setClipChildren) objArr[0];
        int i13 = f57236e + 65;
        f57237f = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(setclipchildren, "");
        switch (setY.setY[setclipchildren.ordinal()]) {
            case 1:
                return sb.setCompoundDrawableTintBlendMode;
            case 2:
            case 3:
                return sb.setOnLongClickListener;
            case 4:
                return sb.setLayoutAnimation;
            case 5:
                sb sbVar = sb.UiMessageCallbackKtWhenMappings;
                int i15 = f57236e + 61;
                f57237f = i15 % 128;
                if (i15 % 2 != 0) {
                    return sbVar;
                }
                throw null;
            case 6:
                return sb.getNavBarTitleString;
            case 7:
                return sb.setAlwaysDrawnWithCacheEnabled;
            case 8:
                return sb.setDividerPadding;
            case 9:
                sb sbVar2 = sb.setX;
                int i16 = f57237f + 117;
                f57236e = i16 % 128;
                if (i16 % 2 == 0) {
                    return sbVar2;
                }
                throw null;
            case 10:
                return sb.setNavigationOnClickListener;
            case 11:
                return sb.setOnFocusChangeListener;
            case 12:
                return sb.setOnDragListener;
            case 13:
                return sb.setX;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final component12 setX(@NotNull sq sqVar, @NotNull np npVar) throws TerminalException {
        component13 component13Var;
        Intrinsics.checkNotNullParameter(sqVar, "");
        Intrinsics.checkNotNullParameter(npVar, "");
        component14.Companion companion = component14.INSTANCE;
        sl onFocusChangeListener = sqVar.setOnFocusChangeListener();
        int iIntValue = ((Integer) sl.setY(new Object[]{onFocusChangeListener}, -1433045547, 1433045547, System.identityHashCode(onFocusChangeListener))).intValue();
        component14 component14Var = (component14) component14.Companion.setX(new Object[]{Integer.valueOf(iIntValue)}, -700745811, 700745811, iIntValue);
        Intrinsics.checkNotNull(component14Var);
        Long lValueOf = Long.valueOf(sqVar.setCompoundDrawableTintBlendMode());
        Long l6 = (Long) sq.setOnFocusChangeListener(new Object[]{sqVar}, 24211853, -24211853, System.identityHashCode(sqVar));
        so layoutAnimation = sqVar.setLayoutAnimation();
        int i10 = f57237f + 7;
        f57236e = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(layoutAnimation, "");
        int i12 = setY.setDividerPadding[layoutAnimation.ordinal()];
        if (i12 == 1) {
            component13Var = component13.setOnFocusChangeListener;
            int i13 = f57236e + 85;
            f57237f = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            component13Var = component13.setNavigationOnClickListener;
        }
        component13 component13Var2 = component13Var;
        Date dividerPadding = npVar.setDividerPadding();
        Intrinsics.checkNotNullParameter(component14Var, "");
        Integer x4 = component14Var.setX();
        if (x4 == null) {
            TerminalException terminalException = new TerminalException(10014, component14Var.setDividerPadding(), null);
            mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException;
        }
        int i14 = f57237f + 1;
        f57236e = i14 % 128;
        int i15 = i14 % 2;
        byte bIntValue = (byte) x4.intValue();
        int i16 = f57236e + 71;
        f57237f = i16 % 128;
        int i17 = i16 % 2;
        component12 component12Var = new component12(lValueOf, l6, component13Var2, dividerPadding, new setProgressDrawableTiled(component14Var, bIntValue), false, new setImportantForAccessibility(sqVar.setOnDragListener()), null, null, null, null, null, WearableStatusCodes.TARGET_NODE_NOT_CONNECTED, null);
        int i18 = f57237f + 69;
        f57236e = i18 % 128;
        int i19 = i18 % 2;
        return component12Var;
    }

    @NotNull
    public static final sg setY(@NotNull SessionActivationFailureCause sessionActivationFailureCause) throws TerminalException {
        Intrinsics.checkNotNullParameter(sessionActivationFailureCause, "");
        int i10 = setY.setX[sessionActivationFailureCause.ordinal()];
        if (i10 == 1) {
            return sg.setY;
        }
        if (i10 == 2) {
            sg sgVar = sg.setCompoundDrawableTintBlendMode;
            int i11 = f57236e + 125;
            f57237f = i11 % 128;
            int i12 = i11 % 2;
            return sgVar;
        }
        if (i10 == 3) {
            sg sgVar2 = sg.setOnFocusChangeListener;
            int i13 = f57236e + 59;
            f57237f = i13 % 128;
            if (i13 % 2 != 0) {
                return sgVar2;
            }
            throw null;
        }
        if (i10 == 4) {
            return sg.setX;
        }
        if (i10 == 5) {
            return sg.setDividerPadding;
        }
        TerminalException terminalException = new TerminalException(10011, null, null);
        mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
        throw terminalException;
    }

    @Nullable
    public static final rf setY(@NotNull byte[] bArr) throws Throwable {
        Object next;
        Intrinsics.checkNotNullParameter(bArr, "");
        Iterator<T> it = StringsKt___StringsKt.chunked(new String(bArr, Charsets.UTF_8), 2).iterator();
        int i10 = f57236e + 3;
        f57237f = i10 % 128;
        int i11 = i10 % 2;
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String str = (String) next;
            if (str.length() == 2) {
                Object[] objArr = new Object[1];
                a((-43) - MotionEvent.axisFromString(""), (byte) (Color.alpha(0) - 115), (short) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 86012300, (-1916308961) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
                if (new Regex(((String) objArr[0]).intern()).matches(str)) {
                    break;
                }
            }
        }
        String str2 = (String) next;
        if (str2 == null) {
            return null;
        }
        mr mrVar = mr.setZ;
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr2 = new Object[1];
        a((-30) - Process.getGidForName(""), (byte) (65 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (short) ((Process.getThreadPriority(0) + 20) >> 6), 86012285 - Color.red(0), (ViewConfiguration.getWindowTouchSlop() >> 8) - 1916308955, objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append(str2);
        mt.setX(new Object[]{mrVar, sb2.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
        setcompounddrawabletintblendmode.f57242p0 = str2;
        int i12 = f57237f + 23;
        f57236e = i12 % 128;
        int i13 = i12 % 2;
        return setcompounddrawabletintblendmode;
    }

    @NotNull
    public static final sb setDividerPadding(@NotNull setClipChildren setclipchildren) {
        return (sb) setDividerPadding(new Object[]{setclipchildren}, -709068470, 709068470, (int) System.currentTimeMillis());
    }
}
