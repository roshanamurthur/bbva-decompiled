package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.PointerIconCompat;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setContentInsetStartWithNavigation {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f59583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final char[] f59584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final char f59585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f59586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f59587j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f59588k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f59589l;
    public static final byte[] m = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setColorFilter f59590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setTouchscreenBlocksFocus f59591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final setCameraDistance f59592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final getHoldTime f59593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public applicationCreated f59594e;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/setAccessibilityTraversalAfter;", "p0", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/setAccessibilityTraversalAfter;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<setAccessibilityTraversalAfter, CharSequence> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f59595p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f59596q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f59597r0 = 1;

        static {
            int i10 = f59596q0;
            int i11 = (i10 & (-36)) | ((~i10) & 35);
            int i12 = (i10 & 35) << 1;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            f59597r0 = i13 % 128;
            int i14 = i13 % 2;
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ CharSequence a(Object[] objArr, int i10, int i11, int i12) {
            CharSequence charSequenceA;
            int i13 = ((i10 | i12) * (-50)) + (i11 * (-49)) + (i10 * 51);
            int i14 = ~i10;
            int i15 = ~i11;
            int i16 = ~(i14 | i15 | i12);
            int i17 = ~i12;
            int i18 = i15 | i17;
            if ((((~(i10 | i17)) | (~(i15 | i10)) | (~i18)) * 50) + ((i16 | (~(i18 | i10))) * 50) + i13 != 1) {
                setAccessibilityTraversalAfter setaccessibilitytraversalafter = (setAccessibilityTraversalAfter) objArr[1];
                int i19 = f59596q0 + 44;
                int i20 = (i19 ^ (-1)) + (i19 << 1);
                f59597r0 = i20 % 128;
                if (i20 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(setaccessibilitytraversalafter, "");
                    setaccessibilitytraversalafter.setDividerPadding();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(setaccessibilitytraversalafter, "");
                charSequenceA = setaccessibilitytraversalafter.setDividerPadding();
                int i21 = f59597r0;
                int i22 = i21 & 93;
                int i23 = -(-((i21 ^ 93) | i22));
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                f59596q0 = i24 % 128;
                if (i24 % 2 != 0) {
                    throw null;
                }
            } else {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i25 = f59596q0;
                int i26 = (i25 ^ 11) + ((i25 & 11) << 1);
                f59597r0 = i26 % 128;
                setAccessibilityTraversalAfter setaccessibilitytraversalafter2 = (setAccessibilityTraversalAfter) obj;
                if (i26 % 2 == 0) {
                    a(new Object[]{aVar, setaccessibilitytraversalafter2}, 840658919, -840658919, System.identityHashCode(aVar));
                    throw null;
                }
                charSequenceA = a(new Object[]{aVar, setaccessibilitytraversalafter2}, 840658919, -840658919, System.identityHashCode(aVar));
            }
            return charSequenceA;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CharSequence invoke(setAccessibilityTraversalAfter setaccessibilitytraversalafter) {
            return a(new Object[]{this, setaccessibilitytraversalafter}, -1617829769, 1617829770, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/setAccessibilityTraversalAfter;", "p0", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/setAccessibilityTraversalAfter;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends Lambda implements Function1<setAccessibilityTraversalAfter, CharSequence> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f59598p0 = new b();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final int f59599q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f59600r0 = 1;

        static {
            int i10 = f59600r0;
            int i11 = ((i10 & 107) - (~(-(-(i10 | 107))))) - 1;
            f59599q0 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }

        public b() {
            super(1);
        }

        public static /* synthetic */ CharSequence a(Object[] objArr, int i10, int i11, int i12) {
            CharSequence charSequenceA;
            int i13 = ~i10;
            int i14 = ~i12;
            int i15 = ~(i13 | i14);
            int i16 = ~(i13 | i11);
            int i17 = (((~(i14 | i11)) | i15 | i16) * (-397)) + (i11 * (-396)) + (i10 * 398);
            int i18 = (((~(i10 | (~i11))) | i12 | i16) * 397) + (i16 * (-397)) + i17;
            int i19 = f59599q0;
            if (i18 != 1) {
                setAccessibilityTraversalAfter setaccessibilitytraversalafter = (setAccessibilityTraversalAfter) objArr[1];
                int i20 = i19 & 79;
                int i21 = -(-(i19 | 79));
                int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
                f59600r0 = i22 % 128;
                if (i22 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(setaccessibilitytraversalafter, "");
                    charSequenceA = setaccessibilitytraversalafter.setDividerPadding();
                    int i23 = 72 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(setaccessibilitytraversalafter, "");
                    charSequenceA = setaccessibilitytraversalafter.setDividerPadding();
                }
            } else {
                b bVar = (b) objArr[0];
                Object obj = objArr[1];
                int i24 = i19 & 97;
                int i25 = ((i19 ^ 97) | i24) << 1;
                int i26 = -((i19 | 97) & (~i24));
                int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                f59600r0 = i27 % 128;
                setAccessibilityTraversalAfter setaccessibilitytraversalafter2 = (setAccessibilityTraversalAfter) obj;
                Object[] objArr2 = new Object[2];
                if (i27 % 2 == 0) {
                    objArr2[0] = bVar;
                    objArr2[1] = setaccessibilitytraversalafter2;
                    a(objArr2, 1326144254, -1326144254, System.identityHashCode(bVar));
                    throw null;
                }
                objArr2[0] = bVar;
                objArr2[1] = setaccessibilitytraversalafter2;
                charSequenceA = a(objArr2, 1326144254, -1326144254, System.identityHashCode(bVar));
            }
            return charSequenceA;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CharSequence invoke(setAccessibilityTraversalAfter setaccessibilitytraversalafter) {
            return a(new Object[]{this, setaccessibilitytraversalafter}, -767105691, 767105692, System.identityHashCode(this));
        }
    }

    static {
        d();
        f59588k = 0;
        f59589l = 1;
        f59586i = 0;
        f59587j = 1;
        f59583f = -7489884354564082386L;
        f59585h = (char) 53956;
        f59584g = new char[]{59158, 59189, 59164, 59157, 59162, 59233, 59194, 59163, 59160, 59196, 59161, 59255, 59198, 59176, 59188, 59177, 59199, 59165, 59167, 59259, 59184, 59182, 59183, 59186, 59178};
    }

    public setContentInsetStartWithNavigation(@NotNull setColorFilter setcolorfilter, @NotNull setTouchscreenBlocksFocus settouchscreenblocksfocus, @NotNull setCameraDistance setcameradistance, @NotNull getHoldTime getholdtime) {
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        Intrinsics.checkNotNullParameter(settouchscreenblocksfocus, "");
        Intrinsics.checkNotNullParameter(setcameradistance, "");
        Intrinsics.checkNotNullParameter(getholdtime, "");
        this.f59590a = setcolorfilter;
        this.f59591b = settouchscreenblocksfocus;
        this.f59592c = setcameradistance;
        this.f59593d = getholdtime;
    }

    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        int i11 = f59588k + 93;
        f59589l = i11 % 128;
        int i12 = i11 % 2;
        char[] charArray = str.toCharArray();
        setOnDragListener setondraglistener = new setOnDragListener();
        long j10 = f59583f;
        char[] y7 = setOnDragListener.setY(2122665171656649951L ^ j10, charArray, i10);
        setondraglistener.setDividerPadding = 4;
        int i13 = f59588k + 117;
        f59589l = i13 % 128;
        int i14 = i13 % 2;
        while (true) {
            int i15 = setondraglistener.setDividerPadding;
            if (i15 >= y7.length) {
                objArr[0] = new String(y7, 4, y7.length - 4);
                return;
            }
            int i16 = i15 - 4;
            setondraglistener.setX = i16;
            try {
                Object[] objArr2 = {Long.valueOf(y7[i15] ^ y7[i15 % 4]), Long.valueOf(i16), Long.valueOf(j10)};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(2144228148);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (TextUtils.getOffsetBefore("", 0) + 9779), TextUtils.getOffsetAfter("", 0) + 43, 3187 - (ViewConfiguration.getScrollBarSize() >> 8));
                    Class<?> cls2 = Long.TYPE;
                    method = cls.getMethod("y", cls2, cls2, cls2);
                    map.put(2144228148, method);
                }
                y7[i15] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setondraglistener, setondraglistener};
                Object method2 = map.get(-62642757);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getScrollBarSize() >> 8), 52 - View.MeasureSpec.getMode(0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3028);
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr4 = new Object[1];
                    c(b11, (byte) (b11 & MessageUtils.MESSAGE_18_DC2), b10, objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-62642757, method2);
                }
                ((Method) method2).invoke(null, objArr3);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    public static void b(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        int length;
        char[] cArr;
        int i12;
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr2 = f59584g;
        char c10 = '0';
        int i13 = 290255894;
        int i14 = 0;
        if (cArr2 != null) {
            int i15 = f59588k + 21;
            f59589l = i15 % 128;
            if (i15 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i12 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i12 = 0;
            }
            while (i12 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i14] = Integer.valueOf(cArr2[i12]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i13));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) Color.red(i14), TextUtils.lastIndexOf("", c10, i14, i14) + 46, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1116);
                        byte b11 = (byte) i14;
                        byte b12 = (byte) (b11 - 1);
                        Object[] objArr3 = new Object[1];
                        c(b12, (byte) (b12 + 1), b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i12++;
                    int i16 = f59588k + 91;
                    f59589l = i16 % 128;
                    int i17 = i16 % 2;
                    c10 = '0';
                    i13 = 290255894;
                    i14 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        Object[] objArr4 = {Integer.valueOf(f59585h)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 45 - TextUtils.indexOf("", "", 0, 0), 1116 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
            byte b13 = (byte) 0;
            byte b14 = (byte) (b13 - 1);
            Object[] objArr5 = new Object[1];
            c(b14, (byte) (b14 + 1), b13, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
            int i18 = f59588k + 31;
            f59589l = i18 % 128;
            int i19 = i18 % 2;
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            int i20 = 0;
            while (true) {
                setincludefontpadding.setDividerPadding = i20;
                int i21 = setincludefontpadding.setDividerPadding;
                if (i21 >= i11) {
                    break;
                }
                char c11 = charArray[i21];
                setincludefontpadding.setY = c11;
                int i22 = i21 + 1;
                char c12 = charArray[i22];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c12;
                if (c11 == c12) {
                    int i23 = f59589l + 81;
                    f59588k = i23 % 128;
                    int i24 = i23 % 2;
                    cArr3[i21] = (char) (c11 - b10);
                    cArr3[i22] = (char) (c12 - b10);
                } else {
                    Object[] objArr6 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), TextUtils.indexOf("", "", 0, 0) + 27, TextUtils.lastIndexOf("", '0', 0) + 2312);
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 - 1);
                        Object[] objArr7 = new Object[1];
                        c(b16, (byte) (b16 + 4), b15, objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i25 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i25) {
                        Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 == null) {
                            Class cls5 = (Class) setTextScaleX.setX((char) (Color.blue(0) + 49103), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 35, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2545);
                            byte b17 = (byte) 0;
                            byte b18 = (byte) (b17 - 1);
                            Object[] objArr9 = new Object[1];
                            c(b18, (byte) (b18 & 7), b17, objArr9);
                            String str3 = (String) objArr9[0];
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod(str3, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i26 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i27 = setincludefontpadding.setDividerPadding;
                        cArr3[i27] = cArr2[iIntValue2];
                        cArr3[i27 + 1] = cArr2[i26];
                    } else {
                        int i28 = setincludefontpadding.setX;
                        int i29 = setincludefontpadding.setOnFocusChangeListener;
                        if (i28 == i29) {
                            int iA = androidx.activity.a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = androidx.activity.a.a(i25, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i30 = (i29 * cCharValue) + iA2;
                            int i31 = setincludefontpadding.setDividerPadding;
                            cArr3[i31] = cArr2[(i28 * cCharValue) + iA];
                            cArr3[i31 + 1] = cArr2[i30];
                        } else {
                            int i32 = (i28 * cCharValue) + i25;
                            int i33 = (i29 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i34 = setincludefontpadding.setDividerPadding;
                            cArr3[i34] = cArr2[i32];
                            cArr3[i34 + 1] = cArr2[i33];
                        }
                    }
                }
                i20 = setincludefontpadding.setDividerPadding + 2;
            }
        }
        for (int i35 = 0; i35 < i10; i35++) {
            cArr3[i35] = (char) (cArr3[i35] ^ 13722);
        }
        String str4 = new String(cArr3);
        int i36 = f59589l + 99;
        f59588k = i36 % 128;
        if (i36 % 2 != 0) {
            throw null;
        }
        objArr[0] = str4;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 4
            int r0 = 1 - r8
            int r7 = r7 + 99
            byte[] r0 = new byte[r0]
            r1 = 0
            int r8 = 0 - r8
            byte[] r2 = com.mypinpad.tsdk.isolation.setContentInsetStartWithNavigation.m
            if (r2 != 0) goto L15
            r4 = r7
            r3 = r1
            r7 = r6
            goto L2c
        L15:
            r3 = r1
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r2[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setContentInsetStartWithNavigation.c(byte, byte, short, java.lang.Object[]):void");
    }

    public static void d() {
        m = new byte[]{120, 57, -32, 115};
    }

    public final applicationCreated e(setChildIndicatorBounds setchildindicatorbounds) throws Throwable {
        int i10 = f59587j + 55;
        f59586i = i10 % 128;
        int i11 = i10 % 2;
        Object[] objArr = new Object[1];
        b(ExpandableListView.getPackedPositionGroup(0L) + 33, "\u0004\r\u0010\t㘭㘭\r\u000e\u0015\u0007\u0017\u0018\u000b\u0004\u0011\u0018\n\u0018\u000b\u0002\u000e\u0010\u0007\u000e㘭㘭\u0015\u0003\u000e\u0018\u000b\u0004㘾", (byte) (ExpandableListView.getPackedPositionGroup(0L) + 63), objArr);
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.f59590a, Integer.valueOf(PointerIconCompat.TYPE_TEXT), null, null, 6}, 1173867142, -1173867141, PointerIconCompat.TYPE_TEXT);
        setMaxHeight onFocusChangeListener = setchildindicatorbounds.setOnFocusChangeListener();
        applicationCreated applicationcreated = (applicationCreated) setMaxHeight.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener}, 303389556, -303389556, System.identityHashCode(onFocusChangeListener));
        if (applicationcreated == null) {
            throw new setTitleMarginBottom();
        }
        int i12 = f59586i + 101;
        f59587j = i12 % 128;
        int i13 = i12 % 2;
        return applicationcreated;
    }

    public final void f(setChildIndicatorBounds setchildindicatorbounds, applicationCreated applicationcreated, Map<setAccessibilityTraversalAfter, setSubtitleTextAppearance> map) throws Throwable {
        int i10 = f59586i + 59;
        f59587j = i10 % 128;
        if (i10 % 2 == 0) {
            setMaxHeight compoundDrawableTintBlendMode = setchildindicatorbounds.setCompoundDrawableTintBlendMode(applicationcreated, CollectionsKt___CollectionsKt.toList(map.values()));
            throw null;
        }
        setMaxHeight compoundDrawableTintBlendMode2 = setchildindicatorbounds.setCompoundDrawableTintBlendMode(applicationcreated, CollectionsKt___CollectionsKt.toList(map.values()));
        applicationCreated applicationcreated2 = (applicationCreated) setMaxHeight.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode2}, 303389556, -303389556, System.identityHashCode(compoundDrawableTintBlendMode2));
        if (applicationcreated2 != null && ((String) applicationCreated.setOnFocusChangeListener(new Object[]{applicationcreated2}, 521662335, -521662332, System.identityHashCode(applicationcreated2))) == null) {
            int i11 = f59586i + 67;
            f59587j = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 48 / 0;
            }
        }
        List list = (List) setMaxHeight.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode2}, -1172660376, 1172660377, System.identityHashCode(compoundDrawableTintBlendMode2));
        if (list != null && (!list.isEmpty())) {
            int i13 = f59586i + 117;
            f59587j = i13 % 128;
            int i14 = i13 % 2;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            b((KeyEvent.getMaxKeyCode() >> 16) + 27, "\u0004\n\u0011\n\u0010\t㘀㘀\r\u000e\u0015\u0007\u0017\u0018\u000b\u0004\u000f\u0010\u000e\u0016\u0016\u0018\u0011\n\u000f\u0006㗌", (byte) (19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr);
            sb2.append(((String) objArr[0]).intern());
            List list2 = (List) applicationCreated.setOnFocusChangeListener(new Object[]{applicationcreated}, 601619422, -601619421, System.identityHashCode(applicationcreated));
            Object[] objArr2 = new Object[1];
            b((ViewConfiguration.getLongPressTimeout() >> 16) + 2, "\u000e\u0010", (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 113), objArr2);
            sb2.append(CollectionsKt___CollectionsKt.joinToString$default(list2, ((String) objArr2[0]).intern(), null, null, 0, null, null, 62, null));
            sb2.append(' ');
            List list3 = (List) setMaxHeight.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode2}, -1172660376, 1172660377, System.identityHashCode(compoundDrawableTintBlendMode2));
            Intrinsics.checkNotNull(list3);
            Object[] objArr3 = new Object[1];
            b((ViewConfiguration.getDoubleTapTimeout() >> 16) + 2, "\u000e\u0010", (byte) (TextUtils.indexOf("", "", 0, 0) + 113), objArr3);
            sb2.append(CollectionsKt___CollectionsKt.joinToString$default(list3, ((String) objArr3[0]).intern(), null, null, 0, null, null, 62, null));
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{sb2.toString()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
        }
        applicationCreated applicationcreated3 = (applicationCreated) setMaxHeight.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode2}, 303389556, -303389556, System.identityHashCode(compoundDrawableTintBlendMode2));
        if (applicationcreated3 == null) {
            applicationcreated3 = null;
        } else {
            this.f59593d.setDividerPadding(applicationcreated3, map);
        }
        if (applicationcreated3 == null) {
            throw new UiMessageId(null, 1, null);
        }
    }

    public final synchronized long setCompoundDrawableTintBlendMode() {
        long jLongValue;
        int i10 = f59587j + 79;
        f59586i = i10 % 128;
        int i11 = i10 % 2;
        setTouchscreenBlocksFocus settouchscreenblocksfocus = this.f59591b;
        jLongValue = ((Long) setTouchscreenBlocksFocus.setY(new Object[]{settouchscreenblocksfocus, this.f59594e, this.f59593d}, -502758861, 502758864, System.identityHashCode(settouchscreenblocksfocus))).longValue();
        int i12 = f59587j + 49;
        f59586i = i12 % 128;
        int i13 = i12 % 2;
        return jLongValue;
    }

    public final synchronized void setY() {
        int i10 = f59587j + 61;
        f59586i = i10 % 128;
        int i11 = i10 % 2;
        this.f59594e = null;
        this.f59593d.setDividerPadding();
        setMin compoundDrawableTintBlendMode = this.f59592c.setCompoundDrawableTintBlendMode();
        setMin.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode}, -1342405781, 1342405781, System.identityHashCode(compoundDrawableTintBlendMode));
        int i12 = f59587j + 15;
        f59586i = i12 % 128;
        int i13 = i12 % 2;
    }

    public final synchronized void setY(@NotNull setChildIndicatorBounds setchildindicatorbounds, long j10, boolean z10) {
        try {
            Intrinsics.checkNotNullParameter(setchildindicatorbounds, "");
            applicationCreated applicationcreatedE = this.f59594e;
            if (applicationcreatedE == null) {
                int i10 = f59586i + 35;
                f59587j = i10 % 128;
                int i11 = i10 % 2;
                applicationcreatedE = e(setchildindicatorbounds);
            }
            int i12 = 3;
            if (!z10) {
                int i13 = f59586i + 31;
                f59587j = i13 % 128;
                int i14 = i13 % 2;
                setTouchscreenBlocksFocus settouchscreenblocksfocus = this.f59591b;
                if (((Boolean) setTouchscreenBlocksFocus.setY(new Object[]{settouchscreenblocksfocus, applicationcreatedE, this.f59593d, Long.valueOf(j10)}, 1846623693, -1846623691, System.identityHashCode(settouchscreenblocksfocus))).booleanValue()) {
                    Object[] objArr = new Object[1];
                    a("ᘯ᙮Ⳓ왚땗\uf5ccጙ\udeaf熘뒖渋⛺\u83841\uf6c8踖ℌ搁麇ᙨ褟谥❊羓႗ᗾ콚쟈磖붲域⼖", Color.red(0) + 1, objArr);
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.f59590a, Integer.valueOf(PointerIconCompat.TYPE_COPY), null, null, 6}, 1173867142, -1173867141, PointerIconCompat.TYPE_COPY);
                    return;
                }
            }
            List list = (List) setSystemUiVisibility.setDividerPadding(new Object[]{applicationcreatedE}, 688141689, -688141689, (int) System.currentTimeMillis());
            if (this.f59594e == null && (!list.isEmpty())) {
                this.f59594e = applicationcreatedE;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                setAccessibilityTraversalAfter setaccessibilitytraversalafter = (setAccessibilityTraversalAfter) obj;
                if (!z10 || !setaccessibilitytraversalafter.setY()) {
                    setTouchscreenBlocksFocus settouchscreenblocksfocus2 = this.f59591b;
                    getHoldTime.setY compoundDrawableTintBlendMode = this.f59593d.setCompoundDrawableTintBlendMode(setaccessibilitytraversalafter);
                    Object[] objArr2 = new Object[i12];
                    objArr2[0] = settouchscreenblocksfocus2;
                    objArr2[1] = compoundDrawableTintBlendMode;
                    objArr2[2] = Long.valueOf(j10);
                    if (!((Boolean) setTouchscreenBlocksFocus.setY(objArr2, 2134189105, -2134189105, System.identityHashCode(settouchscreenblocksfocus2))).booleanValue()) {
                        int i15 = f59587j + 81;
                        f59586i = i15 % 128;
                        int i16 = i15 % 2;
                        arrayList.add(obj);
                        int i17 = f59587j + 95;
                        f59586i = i17 % 128;
                        int i18 = i17 % 2;
                    }
                } else {
                    int i19 = f59587j + 81;
                    f59586i = i19 % 128;
                    int i110 = i19 % 2;
                    arrayList.add(obj);
                    int i111 = f59587j + 95;
                    f59586i = i111 % 128;
                    int i112 = i111 % 2;
                }
                i12 = 3;
            }
            Object[] objArr3 = new Object[1];
            a("\uf6de\uf68b\ue4b9贂紸뺄\ue389⸻酮糨│홿㤢ᐵ붋纡쇦걤헞\ue6ff榡䑗汖輞\uf065\udd96著㝀顪疑Ო\udf8d⃮ങ듟䟅좊ꕀ쳨\ue81d匚", -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, "㗃", (byte) (14 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr4);
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{Intrinsics.stringPlus(strIntern, CollectionsKt___CollectionsKt.joinToString$default(arrayList, ((String) objArr4[0]).intern(), null, null, 0, null, a.f59595p0, 30, null))}, 2065174743, -2065174734, (int) System.currentTimeMillis());
            setColorFilter setcolorfilter = this.f59590a;
            Object[] objArr5 = new Object[1];
            b(1 - TextUtils.indexOf("", "", 0), "㗃", (byte) (13 - TextUtils.getOffsetAfter("", 0)), objArr5);
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, Integer.valueOf(PointerIconCompat.TYPE_ALL_SCROLL), getDisplayExponent.setY(CollectionsKt___CollectionsKt.joinToString$default(arrayList, ((String) objArr5[0]).intern(), null, null, 0, null, b.f59598p0, 30, null)), null, 4}, 1173867142, -1173867141, PointerIconCompat.TYPE_ALL_SCROLL);
            Map<setAccessibilityTraversalAfter, setSubtitleTextAppearance> y7 = this.f59592c.setY(arrayList, (List) applicationCreated.setOnFocusChangeListener(new Object[]{applicationcreatedE}, 2095232536, -2095232534, System.identityHashCode(applicationcreatedE)), setchildindicatorbounds);
            try {
                f(setchildindicatorbounds, applicationcreatedE, y7);
                y7.clear();
                int i20 = f59586i + 47;
                f59587j = i20 % 128;
                int i21 = i20 % 2;
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.f59590a, Integer.valueOf(PointerIconCompat.TYPE_NO_DROP), null, null, 6}, 1173867142, -1173867141, PointerIconCompat.TYPE_NO_DROP);
            } catch (Throwable th2) {
                y7.clear();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
