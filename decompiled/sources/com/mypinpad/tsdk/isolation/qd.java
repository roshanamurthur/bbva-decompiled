package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B!\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/mypinpad/tsdk/i/qd;", "Lcom/mypinpad/tsdk/i/qh;", "Lcom/mypinpad/tsdk/i/qd$setDividerPadding;", "a", "Lcom/mypinpad/tsdk/i/qd$setDividerPadding;", "setY", "()Lcom/mypinpad/tsdk/i/qd$setDividerPadding;", "setX", "Ljava/lang/Exception;", "Lkotlin/Exception;", "b", "Ljava/lang/Exception;", "setOnFocusChangeListener", "()Ljava/lang/Exception;", "setCompoundDrawableTintBlendMode", "p0", "p1", "<init>", "(Lcom/mypinpad/tsdk/i/qd$setDividerPadding;Ljava/lang/Exception;)V", "setDividerPadding"}, k = 1, mv = {1, 8, 0})
public final class qd extends qh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f57846c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setDividerPadding setX;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Exception setCompoundDrawableTintBlendMode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u0005j\u0002\b\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/qd$setDividerPadding;", "", "", "setLayoutAnimation", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setX", "()I", "setCompoundDrawableTintBlendMode", "setY", "setOnFocusChangeListener", "setDividerPadding", "setNavigationOnClickListener"}, k = 1, mv = {1, 8, 0})
    public static final class setDividerPadding {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static int UiMessageCallbackKtWhenMappings;
        private static final /* synthetic */ setDividerPadding[] getNavBarTitleString;
        private static int setAlwaysDrawnWithCacheEnabled;
        public static final setDividerPadding setCompoundDrawableTintBlendMode;
        public static final setDividerPadding setDividerPadding;
        public static final setDividerPadding setNavigationOnClickListener;
        private static long setOnDragListener;
        public static final setDividerPadding setOnFocusChangeListener;
        private static char[] setOnLongClickListener;
        public static final setDividerPadding setX;
        public static final setDividerPadding setY;

        /* JADX INFO: renamed from: setLayoutAnimation, reason: from kotlin metadata */
        private final int setCompoundDrawableTintBlendMode;

        static {
            setDividerPadding[] setdividerpaddingArr;
            c();
            $10 = 0;
            $11 = 1;
            UiMessageCallbackKtWhenMappings = 0;
            setAlwaysDrawnWithCacheEnabled = 1;
            setCompoundDrawableTintBlendMode();
            Object[] objArr = new Object[1];
            a((char) (ViewConfiguration.getWindowTouchSlop() >> 8), ViewConfiguration.getDoubleTapTimeout() >> 16, (ViewConfiguration.getJumpTapTimeout() >> 16) + 24, objArr);
            setDividerPadding setdividerpadding = new setDividerPadding(((String) objArr[0]).intern(), 0, 10030);
            setCompoundDrawableTintBlendMode = setdividerpadding;
            Object[] objArr2 = new Object[1];
            a((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 52664), 24 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 20, objArr2);
            setDividerPadding setdividerpadding2 = new setDividerPadding(((String) objArr2[0]).intern(), 1, 10031);
            setY = setdividerpadding2;
            Object[] objArr3 = new Object[1];
            a((char) (34808 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 43 - TextUtils.indexOf((CharSequence) "", '0'), 23 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr3);
            setDividerPadding setdividerpadding3 = new setDividerPadding(((String) objArr3[0]).intern(), 2, 10032);
            setOnFocusChangeListener = setdividerpadding3;
            Object[] objArr4 = new Object[1];
            a((char) ExpandableListView.getPackedPositionType(0L), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 67, 33 - Color.argb(0, 0, 0, 0), objArr4);
            setDividerPadding setdividerpadding4 = new setDividerPadding(((String) objArr4[0]).intern(), 3, 10032);
            setDividerPadding = setdividerpadding4;
            Object[] objArr5 = new Object[1];
            a((char) (View.combineMeasuredStates(0, 0) + 6451), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 100, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33, objArr5);
            setDividerPadding setdividerpadding5 = new setDividerPadding(((String) objArr5[0]).intern(), 4, 10032);
            setX = setdividerpadding5;
            Object[] objArr6 = new Object[1];
            a((char) View.MeasureSpec.getMode(0), 134 - TextUtils.indexOf("", "", 0), 31 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr6);
            setDividerPadding setdividerpadding6 = new setDividerPadding(((String) objArr6[0]).intern(), 5, 10033);
            setNavigationOnClickListener = setdividerpadding6;
            int i10 = UiMessageCallbackKtWhenMappings + 45;
            int i11 = i10 % 128;
            setAlwaysDrawnWithCacheEnabled = i11;
            if (i10 % 2 == 0) {
                setdividerpaddingArr = new setDividerPadding[96];
                setdividerpaddingArr[1] = setdividerpadding;
                setdividerpaddingArr[1] = setdividerpadding2;
                setdividerpaddingArr[3] = setdividerpadding3;
                setdividerpaddingArr[3] = setdividerpadding4;
                setdividerpaddingArr[3] = setdividerpadding5;
                setdividerpaddingArr[2] = setdividerpadding6;
            } else {
                setdividerpaddingArr = new setDividerPadding[]{setdividerpadding, setdividerpadding2, setdividerpadding3, setdividerpadding4, setdividerpadding5, setdividerpadding6};
            }
            getNavBarTitleString = setdividerpaddingArr;
            int i12 = i11 + 71;
            UiMessageCallbackKtWhenMappings = i12 % 128;
            int i13 = i12 % 2;
        }

        public setDividerPadding(String str, int i10, int i11) {
            super(str, i10);
            this.setCompoundDrawableTintBlendMode = i11;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x01f3  */
        /* JADX WARN: Code duplicated, block: B:39:0x01f4  */
        public static void a(char c10, int i10, int i11, Object[] objArr) throws Throwable {
            Throwable cause;
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
            long[] jArr = new long[i11];
            int i12 = 0;
            setcompounddrawabletintblendmode.setDividerPadding = 0;
            while (true) {
                int i13 = setcompounddrawabletintblendmode.setDividerPadding;
                if (i13 >= i11) {
                    break;
                }
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i12] = Integer.valueOf(setOnLongClickListener[i10 + i13]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1832327647);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) Drawable.resolveOpacity(i12, i12), 44 - Color.red(i12), TextUtils.indexOf("", "") + 728);
                        byte b10 = (byte) i12;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b10, b11, b11, objArr3);
                        String str = (String) objArr3[i12];
                        Class<?>[] clsArr = new Class[1];
                        clsArr[i12] = Integer.TYPE;
                        method = cls.getMethod(str, clsArr);
                        map.put(1832327647, method);
                    }
                    Object[] objArr4 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(setOnDragListener), Integer.valueOf(c10)};
                    Object method2 = map.get(2012362404);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (46115 - Process.getGidForName("")), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 43, Color.red(0) + 1776);
                        byte b12 = (byte) ($$b & 3);
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr5 = new Object[1];
                        b(b12, b13, b13, objArr5);
                        String str2 = (String) objArr5[0];
                        Class<?> cls3 = Long.TYPE;
                        method2 = cls2.getMethod(str2, cls3, cls3, cls3, Integer.TYPE);
                        map.put(2012362404, method2);
                    }
                    jArr[i13] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                    Object[] objArr6 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                    Object method3 = map.get(1606688712);
                    if (method3 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Color.argb(0, 0, 0, 0) + 27, 2311 - (ViewConfiguration.getEdgeSlop() >> 16));
                        byte b14 = (byte) ($$b & 23);
                        byte b15 = (byte) (b14 - 5);
                        Object[] objArr7 = new Object[1];
                        b(b14, b15, b15, objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                        map.put(1606688712, method3);
                    }
                    ((Method) method3).invoke(null, objArr6);
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
            char[] cArr = new char[i11];
            setcompounddrawabletintblendmode.setDividerPadding = 0;
            while (true) {
                int i14 = setcompounddrawabletintblendmode.setDividerPadding;
                if (i14 >= i11) {
                    String str3 = new String(cArr);
                    int i15 = $10 + 99;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    objArr[0] = str3;
                    return;
                }
                int i17 = $11 + 111;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                cArr[i14] = (char) jArr[i14];
                Object[] objArr8 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Map map2 = setTextScaleX.setMaxEms;
                Object method4 = map2.get(1606688712);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 27 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 2311 - TextUtils.getCapsMode("", 0, 0));
                    byte b16 = (byte) ($$b & 23);
                    byte b17 = (byte) (b16 - 5);
                    Object[] objArr9 = new Object[1];
                    b(b16, b17, b17, objArr9);
                    method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                    map2.put(1606688712, method4);
                }
                ((Method) method4).invoke(null, objArr8);
            }
        }

        public static void b(int i10, short s4, int i11, Object[] objArr) {
            byte[] bArr = $$a;
            int i12 = i10 + 67;
            int i13 = s4 * 2;
            int i14 = 3 - (i11 * 3);
            byte[] bArr2 = new byte[i13 + 1];
            int i15 = -1;
            if (bArr == null) {
                int i16 = (-i13) + i14;
                i14 = i14;
                objArr = objArr;
                bArr = bArr;
                bArr2 = bArr2;
                i15 = -1;
                i13 = i13;
                i12 = i16;
            }
            while (true) {
                int i17 = i15 + 1;
                bArr2[i17] = (byte) i12;
                if (i17 == i13) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i18 = i14 + 1;
                byte b10 = bArr[i18];
                int i19 = i12;
                int i20 = i13;
                int i21 = (-b10) + i19;
                i14 = i18;
                objArr = objArr;
                bArr = bArr;
                bArr2 = bArr2;
                i15 = i17;
                i13 = i20;
                i12 = i21;
            }
        }

        public static void c() {
            $$a = new byte[]{83, -24, -71, 98};
            $$b = 173;
        }

        public static void setCompoundDrawableTintBlendMode() {
            setOnDragListener = 6715789881734325607L;
            setOnLongClickListener = new char[]{50781, 58660, 32937, 44072, 19363, 30504, 4769, 15893, 56715, 63748, 42135, 16411, 28551, 2925, 14057, 53885, 61939, 40295, 47336, 25720, 979, 12110, 51904, 63045, 3050, 10387, 19742, 24991, 34324, 47775, 57110, 62370, 4156, 13491, 26912, 36268, 41520, 50897, 64329, 8142, 15442, 20690, 30024, 43470, 16810, 25299, 1886, 11231, 52308, 61663, 38230, 47586, 23164, 32499, 9056, 51180, 59504, 35996, 45317, 21898, 30219, 6815, 16136, 58264, 33829, 43187, 19755, 50781, 58660, 32937, 44072, 19363, 30504, 4769, 15893, 56715, 63748, 42135, 16411, 28551, 2922, 14056, 53887, 61933, 40315, 47347, 25721, 991, 12109, 51911, 63060, 38360, 45403, 23601, 31674, 10029, 49825, 60964, 36278, 43310, 57198, 64535, 39322, 46363, 21136, 28187, 2962, 10022, 50360, 57399, 48548, 22824, 30388, 4697, 12251, 52044, 59614, 33864, 41408, 32074, 6892, 13928, 54268, 61307, 36075, 43107, 17680, 25234, 15876, 56197, 63255, 38040, 45056, 19878, 50781, 58674, 32958, 44069, 19391, 30505, 4791, 15899, 56709, 63771, 42139, 16410, 28566, 2940, 14049, 53883, 61933, 40313, 47342, 25698, 974, 12100, 51930, 63054, 38340, 45389, 23591, 31670, 10029, 49853, 60962};
        }

        public static setDividerPadding valueOf(String str) {
            int i10 = UiMessageCallbackKtWhenMappings + 65;
            setAlwaysDrawnWithCacheEnabled = i10 % 128;
            int i11 = i10 % 2;
            setDividerPadding setdividerpadding = (setDividerPadding) Enum.valueOf(setDividerPadding.class, str);
            if (i11 == 0) {
                int i12 = 27 / 0;
            }
            int i13 = UiMessageCallbackKtWhenMappings + 37;
            setAlwaysDrawnWithCacheEnabled = i13 % 128;
            int i14 = i13 % 2;
            return setdividerpadding;
        }

        public static setDividerPadding[] values() {
            int i10 = UiMessageCallbackKtWhenMappings + 1;
            setAlwaysDrawnWithCacheEnabled = i10 % 128;
            int i11 = i10 % 2;
            setDividerPadding[] setdividerpaddingArr = (setDividerPadding[]) getNavBarTitleString.clone();
            int i12 = UiMessageCallbackKtWhenMappings + 67;
            setAlwaysDrawnWithCacheEnabled = i12 % 128;
            int i13 = i12 % 2;
            return setdividerpaddingArr;
        }

        @JvmName(name = "setX")
        public final int setX() {
            int i10 = setAlwaysDrawnWithCacheEnabled;
            int i11 = i10 + 19;
            UiMessageCallbackKtWhenMappings = i11 % 128;
            int i12 = i11 % 2;
            int i13 = this.setCompoundDrawableTintBlendMode;
            int i14 = i10 + 17;
            UiMessageCallbackKtWhenMappings = i14 % 128;
            int i15 = i14 % 2;
            return i13;
        }
    }

    public /* synthetic */ qd(setDividerPadding setdividerpadding, Exception exc, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(setdividerpadding, (i10 & 2) != 0 ? null : exc);
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-978)) + (i10 * 980);
        int i14 = ~i11;
        int i15 = ~i12;
        if ((((~(i10 | i15)) | (~(i14 | i12))) * 979) + ((i10 | i12) * (-979)) + ((~(i14 | i15)) * 979) + i13 == 1) {
            qd qdVar = (qd) objArr[0];
            int i16 = f57846c + 59;
            int i17 = i16 % 128;
            int i18 = i16 % 2;
            setDividerPadding setdividerpadding = qdVar.setX;
            int i19 = (((i17 | 58) << 1) - (i17 ^ 58)) - 1;
            f57846c = i19 % 128;
            int i20 = i19 % 2;
            return setdividerpadding;
        }
        qd qdVar2 = (qd) objArr[0];
        int i21 = f57846c;
        int i22 = i21 & 39;
        int i23 = i22 + ((i21 ^ 39) | i22);
        int i24 = i23 % 128;
        int i25 = i23 % 2;
        Exception exc = qdVar2.setCompoundDrawableTintBlendMode;
        if (i25 == 0) {
            return exc;
        }
        int i26 = 48 / 0;
        return exc;
    }

    @JvmName(name = "setOnFocusChangeListener")
    @Nullable
    public final Exception setOnFocusChangeListener() {
        return (Exception) setX(new Object[]{this}, -1457478468, 1457478468, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @NotNull
    public final setDividerPadding setY() {
        return (setDividerPadding) setX(new Object[]{this}, 1054978095, -1054978094, System.identityHashCode(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd(@NotNull setDividerPadding setdividerpadding, @Nullable Exception exc) {
        super(null);
        Intrinsics.checkNotNullParameter(setdividerpadding, "");
        this.setX = setdividerpadding;
        this.setCompoundDrawableTintBlendMode = exc;
    }
}
