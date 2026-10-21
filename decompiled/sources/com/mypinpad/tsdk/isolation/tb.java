package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.bbva.tohu.android.product.valkyria.sdk.services.intents.DeleteCardIntentService;
import com.bbva.tohu.android.product.valkyria.sdk.services.intents.ReplenishIntentService;
import com.mypinpad.tsdk.api.errors.TerminalException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006Jk\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u000b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u001a"}, d2 = {"Lcom/mypinpad/tsdk/i/tb;", "", "Landroid/content/Context;", "p0", "", "setX", "(Landroid/content/Context;)V", "", "p1", "", "p2", "p3", "p4", "Lcom/mypinpad/tsdk/i/um$setX;", "p5", "Lcom/mypinpad/tsdk/i/nw;", "p6", "Lcom/mypinpad/tsdk/i/nr;", "p7", "Lcom/mypinpad/tsdk/i/sd;", "p8", "Lcom/mypinpad/tsdk/i/st;", "p9", "Lcom/mypinpad/tsdk/i/tf;", "setCompoundDrawableTintBlendMode", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/mypinpad/tsdk/i/um$setX;Lcom/mypinpad/tsdk/i/nw;Lcom/mypinpad/tsdk/i/nr;Lcom/mypinpad/tsdk/i/sd;Lcom/mypinpad/tsdk/i/st;)Lcom/mypinpad/tsdk/i/tf;", "()V", "<init>"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTerminalProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalProvider.kt\ncom/mypinpad/tsdk/internal/terminal/TerminalProvider\n+ 2 DebugFunctions.kt\ncom/mypinpad/common/buildconstants/DebugFunctionsKt\n+ 3 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n*L\n1#1,269:1\n51#2:270\n42#2:271\n7#3,8:272\n*S KotlinDebug\n*F\n+ 1 TerminalProvider.kt\ncom/mypinpad/tsdk/internal/terminal/TerminalProvider\n*L\n53#1:270\n53#1:271\n246#1:272,8\n*E\n"})
public final class tb {

    @NotNull
    public static final tb INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Object f61008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f61009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f61010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static char[] f61011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static char f61012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f61013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f61014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f61015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static byte[] f61016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f61017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f61018k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f61019l;
    public static int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f61020n = null;

    static {
        d();
        f61019l = 0;
        m = 1;
        f61017j = 0;
        f61018k = 1;
        h();
        INSTANCE = new tb();
        f61008a = new Object();
        int i10 = f61017j + 87;
        f61018k = i10 % 128;
        int i11 = i10 % 2;
    }

    public static void a(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        char c10;
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = f61011d;
        int i12 = -1;
        int i13 = 1;
        long j10 = 0;
        int i14 = 290255894;
        int i15 = 0;
        if (cArr != null) {
            int i16 = m + 93;
            f61019l = i16 % 128;
            int i17 = i16 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i18 = 0;
            while (i18 < length) {
                try {
                    Object[] objArr2 = new Object[i13];
                    objArr2[i15] = Integer.valueOf(cArr[i18]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i14));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ExpandableListView.getPackedPositionType(j10), Color.argb(i15, i15, i15, i15) + 45, MotionEvent.axisFromString("") + 1117);
                        byte b11 = (byte) i12;
                        byte b12 = (byte) (b11 + 1);
                        Object[] objArr3 = new Object[1];
                        c(b11, b12, b12, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i18] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i18++;
                    int i19 = m + 51;
                    f61019l = i19 % 128;
                    int i20 = i19 % 2;
                    i12 = -1;
                    i13 = 1;
                    j10 = 0;
                    i14 = 290255894;
                    i15 = 0;
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
        Object[] objArr4 = {Integer.valueOf(f61012e)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        char c11 = '\b';
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getPressedStateDuration() >> 16) + 45, 1116 - View.resolveSizeAndState(0, 0, 0));
            byte b13 = (byte) (-1);
            byte b14 = (byte) (b13 + 1);
            Object[] objArr5 = new Object[1];
            c(b13, b14, b14, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            int i21 = m + 103;
            f61019l = i21 % 128;
            int i22 = i21 % 2;
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            setincludefontpadding.setDividerPadding = 0;
            int i23 = f61019l + 1;
            m = i23 % 128;
            int i24 = 2;
            int i25 = i23 % 2;
            while (true) {
                int i26 = setincludefontpadding.setDividerPadding;
                if (i26 >= i11) {
                    break;
                }
                int i27 = m + 79;
                f61019l = i27 % 128;
                int i28 = i27 % i24;
                char c12 = charArray[i26];
                setincludefontpadding.setY = c12;
                int i29 = i26 + 1;
                char c13 = charArray[i29];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c13;
                if (c12 == c13) {
                    cArr3[i26] = (char) (c12 - b10);
                    cArr3[i29] = (char) (c13 - b10);
                    c10 = c11;
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = setincludefontpadding;
                    objArr6[11] = Integer.valueOf(cCharValue);
                    objArr6[10] = setincludefontpadding;
                    objArr6[9] = setincludefontpadding;
                    objArr6[c11] = Integer.valueOf(cCharValue);
                    objArr6[7] = setincludefontpadding;
                    objArr6[6] = setincludefontpadding;
                    objArr6[5] = Integer.valueOf(cCharValue);
                    objArr6[4] = setincludefontpadding;
                    objArr6[3] = setincludefontpadding;
                    objArr6[2] = Integer.valueOf(cCharValue);
                    objArr6[1] = setincludefontpadding;
                    objArr6[0] = setincludefontpadding;
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 27 - (ViewConfiguration.getScrollBarSize() >> 8), 2311 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                        byte b15 = f61020n[2];
                        Object[] objArr7 = new Object[1];
                        c((byte) (-1), b15, (byte) (b15 - 3), objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i30 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i30) {
                        int i31 = m + 51;
                        f61019l = i31 % 128;
                        int i32 = i31 % 2;
                        Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 != null) {
                            c10 = '\b';
                        } else {
                            Class cls5 = (Class) setTextScaleX.setX((char) (49103 - KeyEvent.normalizeMetaState(0)), 35 - (ViewConfiguration.getTouchSlop() >> 8), 2544 - TextUtils.indexOf((CharSequence) "", '0', 0));
                            byte b16 = (byte) (-1);
                            Object[] objArr9 = new Object[1];
                            c(b16, (byte) (b16 & 7), (byte) 0, objArr9);
                            String str3 = (String) objArr9[0];
                            Class<?> cls6 = Integer.TYPE;
                            c10 = '\b';
                            method4 = cls5.getMethod(str3, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i33 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i34 = setincludefontpadding.setDividerPadding;
                        cArr3[i34] = cArr[iIntValue2];
                        cArr3[i34 + 1] = cArr[i33];
                    } else {
                        c10 = '\b';
                        int i35 = setincludefontpadding.setX;
                        int i36 = setincludefontpadding.setOnFocusChangeListener;
                        if (i35 == i36) {
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i30, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i37 = (i36 * cCharValue) + iA2;
                            int i38 = setincludefontpadding.setDividerPadding;
                            cArr3[i38] = cArr[(i35 * cCharValue) + iA];
                            cArr3[i38 + 1] = cArr[i37];
                        } else {
                            int i39 = (i35 * cCharValue) + i30;
                            int i40 = (i36 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i41 = setincludefontpadding.setDividerPadding;
                            cArr3[i41] = cArr[i39];
                            cArr3[i41 + 1] = cArr[i40];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
                c11 = c10;
                i24 = 2;
            }
        }
        int i42 = 0;
        while (i42 < i10) {
            int i43 = m + 49;
            f61019l = i43 % 128;
            if (i43 % 2 != 0) {
                cArr3[i42] = (char) (cArr3[i42] ^ 27025);
                i42 += 52;
            } else {
                cArr3[i42] = (char) (cArr3[i42] ^ 13722);
                i42++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static void b(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
        setTextAlignment settextalignment = new setTextAlignment();
        StringBuilder sb2 = new StringBuilder();
        int i13 = 2;
        try {
            int i14 = 1;
            Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(f61014g)};
            int i15 = 0;
            Map map = setTextScaleX.setMaxEms;
            Object method = map.get(-769569468);
            if (method == null) {
                Class cls = (Class) setTextScaleX.setX((char) Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 50, ((byte) KeyEvent.getModifierMetaStateMask()) + 435);
                byte b11 = (byte) (-1);
                Object[] objArr3 = new Object[1];
                c(b11, (byte) (b11 & 10), (byte) 0, objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                method = cls.getMethod(str, cls2, cls2);
                map.put(-769569468, method);
            }
            int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
            int i16 = iIntValue == -1 ? 1 : 0;
            if (i16 != 0) {
                int i17 = m + 121;
                f61019l = i17 % 128;
                if (i17 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = f61016i;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i18 = 0;
                    while (i18 < length) {
                        int i19 = m + 103;
                        f61019l = i19 % 128;
                        if (i19 % i13 != 0) {
                            Object[] objArr4 = new Object[i14];
                            objArr4[i15] = Integer.valueOf(bArr[i18]);
                            Map map2 = setTextScaleX.setMaxEms;
                            Object method2 = map2.get(510767826);
                            if (method2 == null) {
                                Class cls3 = (Class) setTextScaleX.setX((char) (49110 - TextUtils.indexOf((CharSequence) "", '0', i15)), 41 - Color.alpha(i15), 52 - (ViewConfiguration.getLongPressTimeout() >> 16));
                                Class<?>[] clsArr = new Class[i14];
                                clsArr[0] = Integer.TYPE;
                                method2 = cls3.getMethod("s", clsArr);
                                map2.put(510767826, method2);
                            }
                            bArr2[i18] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                            i13 = 2;
                        } else {
                            Object[] objArr5 = new Object[i14];
                            objArr5[0] = Integer.valueOf(bArr[i18]);
                            Map map3 = setTextScaleX.setMaxEms;
                            Object method3 = map3.get(510767826);
                            if (method3 == null) {
                                method3 = ((Class) setTextScaleX.setX((char) (49111 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 40 - Process.getGidForName(""), 51 - TextUtils.lastIndexOf("", '0', 0, 0))).getMethod("s", Integer.TYPE);
                                map3.put(510767826, method3);
                            }
                            bArr2[i18] = ((Byte) ((Method) method3).invoke(null, objArr5)).byteValue();
                            i18++;
                            i13 = 2;
                            i14 = 1;
                        }
                        i15 = 0;
                    }
                    bArr = bArr2;
                }
                bArr.getClass();
                byte[] bArr3 = f61016i;
                Object[] objArr6 = {Integer.valueOf(i12), Integer.valueOf(f61013f)};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(-769569468);
                if (method4 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) ExpandableListView.getPackedPositionType(0L), TextUtils.getTrimmedLength("") + 49, 434 - TextUtils.getOffsetBefore("", 0));
                    byte b12 = (byte) (-1);
                    Object[] objArr7 = new Object[1];
                    c(b12, (byte) (b12 & 10), (byte) 0, objArr7);
                    String str2 = (String) objArr7[0];
                    Class<?> cls5 = Integer.TYPE;
                    method4 = cls4.getMethod(str2, cls5, cls5);
                    map4.put(-769569468, method4);
                }
                iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method4).invoke(null, objArr6)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) f61014g) ^ 7616081452308447380L)));
            }
            if (iIntValue > 0) {
                settextalignment.setX = ((i12 + iIntValue) - 2) + ((int) (((long) f61013f) ^ 7616081452308447380L)) + i16;
                Object[] objArr8 = {settextalignment, Integer.valueOf(i11), Integer.valueOf(f61015h), sb2};
                Map map5 = setTextScaleX.setMaxEms;
                Object method5 = map5.get(193260760);
                if (method5 == null) {
                    Class cls6 = (Class) setTextScaleX.setX((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 42 - Color.blue(0), 2803 - TextUtils.indexOf("", ""));
                    byte b13 = (byte) (-1);
                    Object[] objArr9 = new Object[1];
                    c(b13, (byte) (b13 & 13), (byte) 0, objArr9);
                    String str3 = (String) objArr9[0];
                    Class<?> cls7 = Integer.TYPE;
                    method5 = cls6.getMethod(str3, Object.class, cls7, cls7, Object.class);
                    map5.put(193260760, method5);
                }
                ((StringBuilder) ((Method) method5).invoke(null, objArr8)).append(settextalignment.setCompoundDrawableTintBlendMode);
                settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                byte[] bArr4 = f61016i;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i20 = 0; i20 < length2; i20++) {
                        int i21 = f61019l + 43;
                        m = i21 % 128;
                        int i22 = i21 % 2;
                        bArr5[i20] = (byte) (((long) bArr4[i20]) ^ 7616081452308447380L);
                    }
                    bArr4 = bArr5;
                }
                boolean z10 = bArr4 != null;
                int i23 = 1;
                while (true) {
                    settextalignment.setDividerPadding = i23;
                    if (settextalignment.setDividerPadding >= iIntValue) {
                        break;
                    }
                    if (!z10) {
                        settextalignment.setX--;
                        throw null;
                    }
                    byte[] bArr6 = f61016i;
                    int i24 = settextalignment.setX;
                    settextalignment.setX = i24 - 1;
                    char c10 = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr6[i24]) ^ 7616081452308447380L)) + s4)) ^ b10));
                    settextalignment.setCompoundDrawableTintBlendMode = c10;
                    sb2.append(c10);
                    settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                    i23 = settextalignment.setDividerPadding + 1;
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

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(int r8, int r9, int r10, java.lang.Object[] r11) {
        /*
            int r9 = r9 + 99
            int r10 = r10 * 4
            int r10 = 1 - r10
            int r8 = r8 + 4
            byte[] r0 = new byte[r10]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.tb.f61020n
            if (r2 != 0) goto L16
            r9 = r8
            r5 = r1
            r3 = r2
            r2 = r0
            r0 = r11
            r11 = r10
            goto L33
        L16:
            r3 = r1
        L17:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r0[r3] = r4
            if (r5 != r10) goto L26
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0, r1)
            r11[r1] = r8
            return
        L26:
            int r8 = r8 + 1
            r3 = r2[r8]
            r6 = r9
            r9 = r8
            r8 = r6
            r7 = r11
            r11 = r10
            r10 = r3
            r3 = r2
            r2 = r0
            r0 = r7
        L33:
            int r8 = r8 + r10
            r10 = r11
            r11 = r0
            r0 = r2
            r2 = r3
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.tb.c(int, int, int, java.lang.Object[]):void");
    }

    public static void d() {
        f61020n = new byte[]{8, -126, 3, -115};
    }

    public static tf f(ri riVar, Exception exc) {
        mu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(DeleteCardIntentService.JOB_ID), getDisplayExponent.setCompoundDrawableTintBlendMode(riVar), null, 4}, -1968587119, 1968587120, DeleteCardIntentService.JOB_ID);
        tf tfVar = new tf(null, new tc(riVar, rx.setOnFocusChangeListener(exc)));
        int i10 = f61018k + 17;
        f61017j = i10 % 128;
        int i11 = i10 % 2;
        return tfVar;
    }

    public static void g(Context context) {
        synchronized (f61008a) {
            try {
                if (!f61009b) {
                    nf.setX(context);
                    mk mkVar = mk.setOnFocusChangeListener;
                    Boolean bool = mg.setX;
                    Intrinsics.checkNotNullExpressionValue(bool, "");
                    mk.setOnFocusChangeListener(false, bool.booleanValue(), false, 1);
                    mk.setOnFocusChangeListener.setX();
                    f61009b = true;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void h() {
        f61012e = (char) 53956;
        f61011d = new char[]{59192, 59147, 59190, 59186, 59177, 59182, 59194, 59199, 59189, 59233, 59196, 59253, 59195, 59176, 59198, 59197, 59259, 59181, 59193, 59184, 59188, 59154, 59217, 59183, 59191};
        f61013f = -1647730618;
        f61014g = -1454817071;
        f61015h = -1389727243;
        f61016i = new byte[]{66, -112, 110, -106, -112, -106, -112, 92, 102, -122, 104, 109, -109, 103, -47, 105, -108, 104, -112, -108, 107, -112, 98, -99, Constants.DIRECTORY_ENTRY, -97, 105, 81, 107, -110, 98, -107, -103, 123, -36, 47, -112, 86, 99, -100, -107, -105, 105, 109, 91, 102, -122, 104, 109, -109, 103, -47, 105, -108, 104, -112, -108, 107, -112, 98, -99, Constants.DIRECTORY_ENTRY, -97, 105, 65, 109, -111, Constants.FCI_TEMPLATE, 107, -110, 98, -98, 103, -109, 105, -106, -60, 51, -128, 110, -33, 37, Constants.FCI_TEMPLATE, Constants.CVR_B2b87_11_RFU, 40, 107, 109, -105, -100, -113, 73, -106, Constants.DIRECTORY_ENTRY, -103, 121, -107, -111, -111, -35, 32, -97, 103, -111, 104, Constants.FCI_TEMPLATE, -103, 101, Constants.CVR_B2b87_11_RFU, 47, 101, -121, 104, 103, -101, -41, 37, Constants.FCI_TEMPLATE, Constants.CVR_B2b87_11_RFU, 40, 107, 109, -105, -100, -113};
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.VERSION.RELEASE);
        sb2.append('-');
        short s4 = (short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        Object[] objArr2 = new Object[1];
        b((Process.myTid() >> 22) - 70, (byte) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), s4, (ViewConfiguration.getPressedStateDuration() >> 16) - 73609458, (-880861367) - ((Process.getThreadPriority(0) + 20) >> 6), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 70, (byte) (ExpandableListView.getPackedPositionChild(0L) + 1), (short) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (-73609451) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-880861358) - Process.getGidForName(""), objArr3);
        sb2.append(System.getProperty(strIntern, ((String) objArr3[0]).intern()));
        String string = sb2.toString();
        int i13 = f61017j + 75;
        f61018k = i13 % 128;
        int i14 = i13 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001d, code lost:
    
        if (com.mypinpad.tsdk.isolation.tb.f61010c == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001f, code lost:
    
        r0 = new com.mypinpad.tsdk.isolation.sw(r10, r11, r13, r14, r12);
        com.mypinpad.tsdk.isolation.tb.f61010c = true;
        r10 = com.mypinpad.tsdk.isolation.tb.f61017j + 35;
        com.mypinpad.tsdk.isolation.tb.f61018k = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        r10 = new com.mypinpad.tsdk.api.errors.TerminalException(1, null, null);
        com.mypinpad.tsdk.isolation.mt.setX(new java.lang.Object[]{r10}, 1181816825, -1181816816, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (com.mypinpad.tsdk.isolation.tb.f61010c == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.mypinpad.tsdk.isolation.sw e(android.content.Context r10, java.lang.String r11, com.mypinpad.tsdk.isolation.sd r12, com.mypinpad.tsdk.isolation.nw r13, com.mypinpad.tsdk.isolation.nr r14) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = com.mypinpad.tsdk.isolation.tb.f61018k     // Catch: java.lang.Throwable -> L19
            int r0 = r0 + 45
            int r1 = r0 % 128
            com.mypinpad.tsdk.isolation.tb.f61017j = r1     // Catch: java.lang.Throwable -> L19
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1b
            boolean r0 = com.mypinpad.tsdk.isolation.tb.f61010c     // Catch: java.lang.Throwable -> L19
            r3 = 86
            int r3 = r3 / r1
            if (r0 != 0) goto L38
            goto L1f
        L17:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> L19
        L19:
            r10 = move-exception
            goto L51
        L1b:
            boolean r0 = com.mypinpad.tsdk.isolation.tb.f61010c     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L38
        L1f:
            com.mypinpad.tsdk.i.sw r0 = new com.mypinpad.tsdk.i.sw     // Catch: java.lang.Throwable -> L19
            r3 = r0
            r4 = r10
            r5 = r11
            r6 = r13
            r7 = r14
            r8 = r12
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L19
            com.mypinpad.tsdk.isolation.tb.f61010c = r2     // Catch: java.lang.Throwable -> L19
            int r10 = com.mypinpad.tsdk.isolation.tb.f61017j     // Catch: java.lang.Throwable -> L19
            int r10 = r10 + 35
            int r11 = r10 % 128
            com.mypinpad.tsdk.isolation.tb.f61018k = r11     // Catch: java.lang.Throwable -> L19
            int r10 = r10 % 2
            monitor-exit(r9)
            return r0
        L38:
            com.mypinpad.tsdk.api.errors.TerminalException r10 = new com.mypinpad.tsdk.api.errors.TerminalException     // Catch: java.lang.Throwable -> L19
            r11 = 0
            r10.<init>(r2, r11, r11)     // Catch: java.lang.Throwable -> L19
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L19
            r11[r1] = r10     // Catch: java.lang.Throwable -> L19
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            int r12 = (int) r12     // Catch: java.lang.Throwable -> L19
            r13 = 1181816825(0x467117f9, float:15429.993)
            r14 = -1181816816(0xffffffffb98ee810, float:-2.725725E-4)
            com.mypinpad.tsdk.isolation.mt.setX(r11, r13, r14, r12)     // Catch: java.lang.Throwable -> L19
            throw r10     // Catch: java.lang.Throwable -> L19
        L51:
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.tb.e(android.content.Context, java.lang.String, com.mypinpad.tsdk.i.sd, com.mypinpad.tsdk.i.nw, com.mypinpad.tsdk.i.nr):com.mypinpad.tsdk.i.sw");
    }

    @NotNull
    public final tf setCompoundDrawableTintBlendMode(@NotNull Context p4, @NotNull String p10, @NotNull String[] p11, @NotNull String p12, @NotNull String[] p13, @NotNull um.setX p14, @NotNull nw p15, @NotNull nr p16, @NotNull sd p17, @NotNull st p18) {
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p10, "");
        Intrinsics.checkNotNullParameter(p11, "");
        Intrinsics.checkNotNullParameter(p12, "");
        Intrinsics.checkNotNullParameter(p13, "");
        Intrinsics.checkNotNullParameter(p14, "");
        Intrinsics.checkNotNullParameter(p15, "");
        Intrinsics.checkNotNullParameter(p16, "");
        Intrinsics.checkNotNullParameter(p17, "");
        Intrinsics.checkNotNullParameter(p18, "");
        g(p4);
        mu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(ReplenishIntentService.JOB_ID), null, null, 6}, -1968587119, 1968587120, ReplenishIntentService.JOB_ID);
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15, "\u0001\u0000\u000b\t\u0018\r\u0012\u0015\u0013\t\u0003\u0004\t\u0007㘴", (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 62), objArr);
        pc.setY(new po(((String) objArr[0]).intern()));
        mk mkVar = mk.setOnFocusChangeListener;
        mk.setOnFocusChangeListener(((Boolean) sd.setDividerPadding(new Object[]{p17}, -810936633, 810936642, System.identityHashCode(p17))).booleanValue(), false, false, 6);
        hashCode onFocusChangeListener = mk.setOnFocusChangeListener(mk.setOnFocusChangeListener);
        if (onFocusChangeListener instanceof hashCode.setX) {
            hashCode.setX setx = (hashCode.setX) onFocusChangeListener;
            return f((ri) mi.setX(new Object[]{setx}, -585522747, 585522756, (int) System.currentTimeMillis()), new TerminalException(15, (String) hashCode.setX.setX(new Object[]{setx}, 1995127706, -1995127705, System.identityHashCode(setx)), null, 4, null));
        }
        qn qnVar = new qn(p12, p13, p14, ((Integer) sd.setDividerPadding(new Object[]{p17}, -1463940083, 1463940083, System.identityHashCode(p17))).intValue(), (String) st.setCompoundDrawableTintBlendMode(new Object[]{p18}, 1827932406, -1827932405, System.identityHashCode(p18)), (String) sr.setY(new Object[]{p18}, 213627831, -213627831, System.identityHashCode(p18)), (String) st.setCompoundDrawableTintBlendMode(new Object[]{p18}, -1813715722, 1813715722, System.identityHashCode(p18)), p10, p11);
        try {
            ss ssVar = ss.setCompoundDrawableTintBlendMode;
            String str = (String) ss.setX(new Object[0], -299774389, 299774392, (int) System.currentTimeMillis());
            ss.setX(new Object[]{qnVar, str}, 164583551, -164583546, (int) System.currentTimeMillis());
            int i10 = f61017j + 21;
            f61018k = i10 % 128;
            int i11 = i10 % 2;
            mr mrVar = mr.setZ;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getScrollBarSize() >> 8) + 37, "\u0002\u0000\u0016\u000f\b\u0012\u0000\u0017\r\b\u0005\r\u0011\u0006\u0017\u0005\u000b\u0013\u0014\u0000\u0001\u0013\f\b\u0010\u0018\r\u0012\u0015\b\u0005\u0003\u000b\u0018\b\u0005㘉", (byte) ((Process.myTid() >> 22) + 79), objArr2);
            sb2.append(((String) objArr2[0]).intern());
            sb2.append(str);
            mt.setX(new Object[]{mrVar, sb2.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
            try {
                return new tf(e(p4, p10, p17, p15, p16), null);
            } catch (Exception e5) {
                mr mrVar2 = mr.setOnFocusChangeListener;
                Object[] objArr3 = new Object[1];
                b((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 71, (byte) View.MeasureSpec.getMode(0), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 73609500, (-880861304) - (ViewConfiguration.getEdgeSlop() >> 16), objArr3);
                mt.setX(new Object[]{((String) objArr3[0]).intern()}, 1760239564, -1760239563, (int) System.currentTimeMillis());
                return f(ri.setDividerPadding, e5);
            }
        } catch (Exception e7) {
            mr mrVar3 = mr.setOnFocusChangeListener;
            Object[] objArr4 = new Object[1];
            b(TextUtils.lastIndexOf("", '0', 0, 0) - 69, (byte) View.resolveSizeAndState(0, 0, 0), (short) Color.red(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 73609500, 8094 - AndroidCharacter.getMirror('0'), objArr4);
            mt.setX(new Object[]{((String) objArr4[0]).intern()}, 1760239564, -1760239563, (int) System.currentTimeMillis());
            return p16.setOnFocusChangeListener() ? f(ri.setDividerPadding, e7) : f(ri.setX, e7);
        }
    }

    public final void setX(@NotNull Context p4) {
        long j10;
        long longVersionCode;
        Object obj;
        int i10 = f61018k + 111;
        f61017j = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(p4, "");
        Unit unit = Unit.INSTANCE;
        Object[] objArr = new Object[1];
        a(7 - (ViewConfiguration.getScrollBarSize() >> 8), "\t\u0013\u0004\u0013\b\u000b㙫", (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 108), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(5 - (KeyEvent.getMaxKeyCode() >> 16), "\t\f\u000f\b㙋", (byte) (77 - ImageFormat.getBitsPerPixel(0)), objArr2);
        if (Intrinsics.areEqual(strIntern, ((String) objArr2[0]).intern())) {
            int i12 = f61017j + 61;
            f61018k = i12 % 128;
            if (i12 % 2 == 0) {
                up upVar = up.setX;
                up.setOnFocusChangeListener(new Object[0], -803838799, 803838801, (int) System.currentTimeMillis());
                throw null;
            }
            up upVar2 = up.setX;
            up.setOnFocusChangeListener(new Object[0], -803838799, 803838801, (int) System.currentTimeMillis());
        }
        StringBuilder sb2 = new StringBuilder();
        String str = Build.MANUFACTURER;
        sb2.append(str);
        sb2.append(AbstractJsonLexerKt.COMMA);
        String str2 = Build.MODEL;
        sb2.append(str2);
        sb2.append('\n');
        StringBuilder sb3 = new StringBuilder();
        name nameVar = name.INSTANCE;
        sb3.append((String) name.setX(new Object[0], -249713715, 249713715, (int) System.currentTimeMillis()));
        sb3.append('\n');
        name.setX[] setxArr = (name.setX[]) name.setX(new Object[0], 1651376506, -1651376505, (int) System.currentTimeMillis());
        Object[] objArr3 = new Object[1];
        a(1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "㗇", (byte) (54 - TextUtils.indexOf((CharSequence) "", '0')), objArr3);
        sb3.append(ArraysKt___ArraysKt.joinToString$default(setxArr, ((String) objArr3[0]).intern(), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, l9.f56918p0, 30, (Object) null));
        String string = sb3.toString();
        int i13 = f61018k + 111;
        f61017j = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 56 / 0;
        }
        sb2.append(string);
        String string2 = sb2.toString();
        int i15 = f61018k + 125;
        f61017j = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
        mr mrVar = mr.setZ;
        StringBuilder sb4 = new StringBuilder();
        Object[] objArr4 = new Object[1];
        a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, "\b\r\b\u0003\u0001\b\u0017\u0004\u000e\n㗾", (byte) (Process.getGidForName("") + 111), objArr4);
        sb4.append(((String) objArr4[0]).intern());
        sb4.append(string2);
        mt.setX(new Object[]{mrVar, sb4.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
        mu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength), getDisplayExponent.setY(string2), null, 4}, -1968587119, 1968587120, AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength);
        Object[] objArr5 = new Object[1];
        b(KeyEvent.getDeadChar(0, 0) - 70, (byte) Color.green(0), (short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (-73609519) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 880861395, objArr5);
        mu.setCompoundDrawableTintBlendMode(new Object[]{100004, getDisplayExponent.setY(((String) objArr5[0]).intern()), null, 4}, -1968587119, 1968587120, 100004);
        pc.setY(new pb(null, 1, null));
        Intrinsics.checkNotNullExpressionValue(str, "");
        Intrinsics.checkNotNullExpressionValue(str2, "");
        String str3 = (String) setY(new Object[0], -1390181059, 1390181059, (int) System.currentTimeMillis());
        String str4 = Build.VERSION.SECURITY_PATCH;
        Intrinsics.checkNotNullExpressionValue(str4, "");
        int i16 = f61017j + 43;
        f61018k = i16 % 128;
        if (i16 % 2 == 0) {
            try {
                PackageManager packageManager = p4.getPackageManager();
                Object[] objArr6 = new Object[1];
                a(42 - View.MeasureSpec.getMode(1), "\u0005\u0000\u0001\f\u000f\u0000\u0000\u000f\u0004\u0013\u0010\u000b\t\b\u0000\u0018\u0002\b\f\u000b\u0003\f", (byte) ((ViewConfiguration.getKeyRepeatDelay() + 91) * 26), objArr6);
                PackageInfo packageInfo = packageManager.getPackageInfo(((String) objArr6[0]).intern(), 1);
                Intrinsics.checkNotNullExpressionValue(packageInfo, "");
                longVersionCode = packageInfo.getLongVersionCode();
            } catch (PackageManager.NameNotFoundException e5) {
                e = e5;
                j10 = 1;
                pc.setY(new ou(null, null, 10070, mw.setDividerPadding(e), 3, null));
                longVersionCode = j10;
            }
        } else {
            try {
                PackageManager packageManager2 = p4.getPackageManager();
                Object[] objArr7 = new Object[1];
                a(22 - View.MeasureSpec.getMode(0), "\u0005\u0000\u0001\f\u000f\u0000\u0000\u000f\u0004\u0013\u0010\u000b\t\b\u0000\u0018\u0002\b\f\u000b\u0003\f", (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 17), objArr7);
                PackageInfo packageInfo2 = packageManager2.getPackageInfo(((String) objArr7[0]).intern(), 0);
                Intrinsics.checkNotNullExpressionValue(packageInfo2, "");
                longVersionCode = packageInfo2.getLongVersionCode();
            } catch (PackageManager.NameNotFoundException e7) {
                e = e7;
                j10 = 0;
                pc.setY(new ou(null, null, 10070, mw.setDividerPadding(e), 3, null));
                longVersionCode = j10;
            }
        }
        String strValueOf = String.valueOf(longVersionCode);
        int i17 = f61018k;
        int i18 = i17 + 101;
        f61017j = i18 % 128;
        if (i18 % 2 != 0) {
            int i19 = 34 / 0;
        }
        int i20 = i17 + 1;
        f61017j = i20 % 128;
        if (i20 % 2 != 0) {
            Object[] objArr8 = new Object[1];
            b(Process.getGidForName("") + 9, (byte) View.combineMeasuredStates(1, 0), (short) ExpandableListView.getPackedPositionType(1L), (-73609520) << (PointF.length(0.0f, 1.0f) > 0.0f ? 1 : (PointF.length(0.0f, 1.0f) == 0.0f ? 0 : -1)), (-880861350) % Drawable.resolveOpacity(1, 1), objArr8);
            obj = objArr8[0];
        } else {
            Object[] objArr9 = new Object[1];
            b(Process.getGidForName("") - 69, (byte) View.combineMeasuredStates(0, 0), (short) ExpandableListView.getPackedPositionType(0L), (-73609520) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-880861350) - Drawable.resolveOpacity(0, 0), objArr9);
            obj = objArr9[0];
        }
        pc.setY(new ow(str, str2, str3, str4, strValueOf, ((String) obj).intern()));
        g(p4);
    }

    public final synchronized void setCompoundDrawableTintBlendMode() {
        int i10 = f61017j + 105;
        int i11 = i10 % 128;
        f61018k = i11;
        int i12 = i10 % 2;
        f61010c = false;
        int i13 = i11 + 121;
        f61017j = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }
}
