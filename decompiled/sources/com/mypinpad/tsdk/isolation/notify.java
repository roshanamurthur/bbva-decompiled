package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class notify extends initCause {
    public static final int H;
    public static int I;
    public static int J;
    public static int K;
    public static int L;
    public static final byte[] M = null;

    @NotNull
    public final setColorFilter A;

    @NotNull
    public initCause.setCompoundDrawableTintBlendMode B;
    public setFooterDividersEnabled C;
    public setMotionEventSplittingEnabled D;
    public setCollapseIcon[] E;
    public setIndeterminateTintMode F;

    @NotNull
    public final getGatewayId G;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Context f57343u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final onContextItemSelected f57344v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final setPivotX f57345w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final setTextSelectHandleLeft f57346x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final setProgressBackgroundTintBlendMode f57347y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final getScope f57348z;

    public /* synthetic */ class setDividerPadding {
        public static final /* synthetic */ int[] setOnFocusChangeListener;

        static {
            int[] iArr = new int[setCollapseIcon.setY.values().length];
            iArr[setCollapseIcon.setY.setCompoundDrawableTintBlendMode.ordinal()] = 1;
            iArr[setCollapseIcon.setY.setOnFocusChangeListener.ordinal()] = 2;
            iArr[setCollapseIcon.setY.setX.ordinal()] = 3;
            iArr[setCollapseIcon.setY.setY.ordinal()] = 4;
            setOnFocusChangeListener = iArr;
            int i10 = ((1 | 39) << 1) - (1 ^ 39);
            int i11 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }
    }

    static {
        c();
        K = 0;
        L = 1;
        I = 0;
        J = 1;
        H = -443080009;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public notify(@NotNull Context context, @NotNull onContextItemSelected oncontextitemselected, @NotNull setPivotX setpivotx, @NotNull setTextSelectHandleLeft settextselecthandleleft, @NotNull setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode, @NotNull getScope getscope, @NotNull setColorFilter setcolorfilter) {
        super(context, oncontextitemselected, setpivotx, settextselecthandleleft, setprogressbackgroundtintblendmode, getscope, setcolorfilter, null, 128, null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oncontextitemselected, "");
        Intrinsics.checkNotNullParameter(setpivotx, "");
        Intrinsics.checkNotNullParameter(settextselecthandleleft, "");
        Intrinsics.checkNotNullParameter(setprogressbackgroundtintblendmode, "");
        Intrinsics.checkNotNullParameter(getscope, "");
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        this.f57343u = context;
        this.f57344v = oncontextitemselected;
        this.f57345w = setpivotx;
        this.f57346x = settextselecthandleleft;
        this.f57347y = setprogressbackgroundtintblendmode;
        this.f57348z = getscope;
        this.A = setcolorfilter;
        this.B = initCause.setCompoundDrawableTintBlendMode.setX;
        getDiscoveryTimeout.Companion companion = getDiscoveryTimeout.INSTANCE;
        this.G = new getGatewayId((getDiscoveryTimeout) getDiscoveryTimeout.Companion.setCompoundDrawableTintBlendMode(new Object[]{settextselecthandleleft}, 423056054, -423056054, (int) System.currentTimeMillis()), setcolorfilter);
    }

    public static void c() {
        M = new byte[]{65, -110, 43, 49};
    }

    /* JADX WARN: Code duplicated, block: B:34:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x01a6  */
    public static void g(int i10, int i11, int i12, Object[] objArr) throws Throwable {
        Throwable cause;
        int i13 = K + 119;
        L = i13 % 128;
        int i14 = 2;
        int i15 = i13 % 2;
        char[] charArray = "\u0013\u0014\u0019\u0019\u001a\u0007ￅ\u0013\u0014ￅ\u0019\u000e￭ￅ".toCharArray();
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[i10];
        getnavbartitlestring.setY = 0;
        while (true) {
            int i16 = getnavbartitlestring.setY;
            if (i16 >= i10) {
                break;
            }
            int i17 = K + 41;
            L = i17 % 128;
            int i18 = i17 % i14;
            char c10 = charArray[i16];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
            char c11 = (char) (i11 + c10);
            cArr[i16] = c11;
            try {
                Object[] objArr2 = new Object[i14];
                objArr2[1] = Integer.valueOf(H);
                objArr2[0] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getPressedStateDuration() >> 16), 42 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.getTrimmedLength("") + 483);
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    h(b10, b11, b11, objArr3);
                    String str = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (Color.green(0) + 55966), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 43, 2269 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    h(b12, b13, (byte) (b13 + 1), objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i14 = 2;
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
        if (i12 > 0) {
            getnavbartitlestring.setOnFocusChangeListener = i12;
            char[] cArr2 = new char[i10];
            System.arraycopy(cArr, 0, cArr2, 0, i10);
            int i19 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, i10 - i19, i19);
            int i20 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i20, cArr, 0, i10 - i20);
        }
        int i21 = L + 51;
        K = i21 % 128;
        int i22 = i21 % 2;
        char[] cArr3 = new char[i10];
        getnavbartitlestring.setY = 0;
        while (true) {
            int i23 = getnavbartitlestring.setY;
            if (i23 >= i10) {
                String str2 = new String(cArr3);
                int i24 = K + 59;
                L = i24 % 128;
                int i25 = i24 % 2;
                objArr[0] = str2;
                return;
            }
            cArr3[i23] = cArr[(i10 - i23) - 1];
            Object[] objArr6 = {getnavbartitlestring, getnavbartitlestring};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1860518195);
            if (method3 == null) {
                Class cls4 = (Class) setTextScaleX.setX((char) (55965 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getTouchSlop() >> 8) + 43, 2267 - TextUtils.lastIndexOf("", '0', 0, 0));
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                h(b14, b15, (byte) (b15 + 1), objArr7);
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1860518195, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    public static void h(byte b10, byte b11, short s4, Object[] objArr) {
        int i10 = 66 - s4;
        int i11 = b11 * 4;
        int i12 = (b10 * 4) + 4;
        byte[] bArr = new byte[i11 + 1];
        byte[] bArr2 = M;
        int i13 = -1;
        if (bArr2 == null) {
            i12++;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i13 = -1;
            i10 = (-i11) + i10;
            i11 = i11;
        }
        while (true) {
            int i14 = i13 + 1;
            bArr[i14] = (byte) i10;
            if (i14 == i11) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            byte b12 = bArr2[i12];
            i12++;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i13 = i14;
            i10 = (-b12) + i10;
            i11 = i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:163:0x0359  */
    /* JADX WARN: Code duplicated, block: B:168:0x0389  */
    /* JADX WARN: Code duplicated, block: B:174:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:176:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:183:0x04ee A[Catch: all -> 0x04ec, TRY_LEAVE, TryCatch #9 {all -> 0x04ec, blocks: (B:180:0x04e7, B:160:0x0349, B:164:0x035a, B:179:0x0474, B:189:0x051d, B:190:0x0520, B:183:0x04ee, B:211:0x0547, B:212:0x054a, B:208:0x0544, B:166:0x0385, B:169:0x0393, B:172:0x039c, B:177:0x03a9, B:185:0x0519, B:186:0x051a), top: B:233:0x0043, inners: #2, #5, #8 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x055b  */
    /* JADX WARN: Code duplicated, block: B:53:0x018a  */
    public final setSecondaryProgressTintBlendMode i() {
        setColorFilter setcolorfilter;
        Object objM5535constructorimpl;
        Throwable thM5538exceptionOrNullimpl;
        setMotionEventSplittingEnabled.setCompoundDrawableTintBlendMode navigationOnClickListener;
        execute executeVar;
        setSelection setselection;
        setTextIsSelectable settextisselectable;
        setShowDividers setshowdividers;
        getDynamicButtonBackgroundColor getdynamicbuttonbackgroundcolor;
        getTooFewDigitsMessage gettoofewdigitsmessage;
        setPivotX setpivotx;
        getUiMessage getuimessage;
        byte b10;
        onContextItemSelected oncontextitemselected;
        getDynamicButtonBackgroundColor getdynamicbuttonbackgroundcolor2;
        setShowDividers setshowdividers2;
        setSelection setselection2;
        getUiMessage getuimessage2;
        byte[] compoundDrawableTintBlendMode;
        int length;
        setStackFromBottom setstackfrombottom;
        int i10;
        setFooterDividersEnabled setfooterdividersenabled;
        int i11;
        Object setdividerpadding;
        int i12;
        int i13;
        setColorFilter setcolorfilter2 = this.A;
        onContextItemSelected oncontextitemselected2 = this.f57344v;
        try {
            Result.Companion companion = Result.INSTANCE;
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter2, 16, null, null, 6}, 1173867142, -1173867141, 16);
            setMotionEventSplittingEnabled setmotioneventsplittingenabled = this.D;
            if (setmotioneventsplittingenabled == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                setmotioneventsplittingenabled = null;
            }
            try {
                if (setmotioneventsplittingenabled.setOnDragListener()) {
                    setMotionEventSplittingEnabled setmotioneventsplittingenabled2 = this.D;
                    if (setmotioneventsplittingenabled2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        setmotioneventsplittingenabled2 = null;
                    }
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (setmotioneventsplittingenabled2.setX().size() == 0) {
                                                setFooterDividersEnabled setfooterdividersenabled2 = this.C;
                                                if (setfooterdividersenabled2 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                                    setfooterdividersenabled2 = null;
                                                }
                                                if (setfooterdividersenabled2.setDividerPadding()) {
                                                    setdividerpadding = new setSecondaryProgressTintBlendMode.setY();
                                                }
                                                objM5535constructorimpl = Result.m5535constructorimpl(setdividerpadding);
                                                thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                                                if (thM5538exceptionOrNullimpl != null) {
                                                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 12, null, thM5538exceptionOrNullimpl}, -1999045713, 1999045717, 12);
                                                    setY();
                                                    Unit unit = Unit.INSTANCE;
                                                }
                                                ResultKt.throwOnFailure(objM5535constructorimpl);
                                                return (setSecondaryProgressTintBlendMode) objM5535constructorimpl;
                                            }
                                            if (length >= 0) {
                                                int i14 = 0;
                                                while (true) {
                                                    int i15 = i14 + 1;
                                                    compoundDrawableTintBlendMode[i14] = (byte) (compoundDrawableTintBlendMode[i14] ^ ((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{gettoofewdigitsmessage}, -1034568962, 1034568962, System.identityHashCode(gettoofewdigitsmessage)))[i14]);
                                                    if (i15 > length) {
                                                        break;
                                                    }
                                                    i14 = i15;
                                                }
                                                byte[] compoundDrawableTintBlendMode2 = setPivotX.setCompoundDrawableTintBlendMode(setpivotx).setCompoundDrawableTintBlendMode(settextisselectable.setY(), compoundDrawableTintBlendMode);
                                                byte[] y7 = settextisselectable.setY();
                                                Random.Companion companion2 = Random.INSTANCE;
                                                companion2.nextBytes(y7);
                                                companion2.nextBytes(compoundDrawableTintBlendMode);
                                                setstackfrombottom = new setStackFromBottom(compoundDrawableTintBlendMode2);
                                                CloseableKt.closeFinally(settextisselectable, null);
                                                i10 = I + 57;
                                                J = i10 % 128;
                                                if (i10 % 2 != 0) {
                                                    execute.setDividerPadding(new Object[]{executeVar}, -928336311, 928336316, System.identityHashCode(executeVar));
                                                    ((Integer) setMotionEventSplittingEnabled.setCompoundDrawableTintBlendMode.setY(new Object[]{navigationOnClickListener}, 741559397, -741559396, System.identityHashCode(navigationOnClickListener))).intValue();
                                                    throw null;
                                                }
                                                execute.setDividerPadding(new Object[]{executeVar}, -928336311, 928336316, System.identityHashCode(executeVar));
                                                short sIntValue = (short) ((Integer) setMotionEventSplittingEnabled.setCompoundDrawableTintBlendMode.setY(new Object[]{navigationOnClickListener}, 741559397, -741559396, System.identityHashCode(navigationOnClickListener))).intValue();
                                                setfooterdividersenabled = this.C;
                                                if (setfooterdividersenabled == null) {
                                                    int i16 = I + 85;
                                                    J = i16 % 128;
                                                    int i17 = i16 % 2;
                                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                                    setfooterdividersenabled = null;
                                                }
                                                if (setfooterdividersenabled.setY() == setIndeterminate.setDividerPadding) {
                                                    i11 = 1;
                                                } else {
                                                    i11 = 0;
                                                }
                                                ByteBuffer byteBufferPutShort = ByteBuffer.allocate(((Integer) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{getdynamicbuttonbackgroundcolor2}, 652647922, -652647918, System.identityHashCode(getdynamicbuttonbackgroundcolor2))).intValue() + 46).put((byte) ((Integer) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{setstackfrombottom}, 652647922, -652647918, System.identityHashCode(setstackfrombottom))).intValue()).putShort((short) i11);
                                                Intrinsics.checkNotNullExpressionValue(byteBufferPutShort, "");
                                                ByteBuffer byteBufferPut = ((ByteBuffer) TransactionCancelled.setY(new Object[]{byteBufferPutShort, setselection2}, 296674209, -296674209, (int) System.currentTimeMillis())).putShort(sIntValue).put((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{setstackfrombottom}, -1034568962, 1034568962, System.identityHashCode(setstackfrombottom))).put((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{gettoofewdigitsmessage}, -1034568962, 1034568962, System.identityHashCode(gettoofewdigitsmessage)));
                                                Intrinsics.checkNotNullExpressionValue(byteBufferPut, "");
                                                byte[] bArrArray = ((ByteBuffer) TransactionCancelled.setY(new Object[]{(ByteBuffer) TransactionCancelled.setY(new Object[]{byteBufferPut, getdynamicbuttonbackgroundcolor2}, 942844553, -942844552, (int) System.currentTimeMillis()), setshowdividers2}, 296674209, -296674209, (int) System.currentTimeMillis())).array();
                                                Intrinsics.checkNotNullExpressionValue(bArrArray, "");
                                                CloseableKt.closeFinally(setstackfrombottom, null);
                                                onContextItemSelected.setCompoundDrawableTintBlendMode(new Object[]{oncontextitemselected, bArrArray}, -1669177641, 1669177646, System.identityHashCode(oncontextitemselected));
                                                byte[] bArr = (byte[]) onContextItemSelected.setCompoundDrawableTintBlendMode(new Object[]{oncontextitemselected}, 596532494, -596532488, System.identityHashCode(oncontextitemselected));
                                                Intrinsics.checkNotNull(bArr);
                                                setOnItemSelectedListener setonitemselectedlistener = setOnItemSelectedListener.INSTANCE;
                                                new alp();
                                                alp alpVar = new alp();
                                                alm.setY(new Object[]{alpVar, bArr, 0, Integer.valueOf(bArr.length)}, 1533057357, -1533057354, 0);
                                                Unit unit2 = Unit.INSTANCE;
                                                byte[] bArr2 = new byte[alpVar.setY()];
                                                alpVar.setCompoundDrawableTintBlendMode(bArr2, 0);
                                                setdividerpadding = new setSecondaryProgressTintBlendMode.setDividerPadding(new setMeasureWithLargestChildEnabled(bArr2));
                                                objM5535constructorimpl = Result.m5535constructorimpl(setdividerpadding);
                                                thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                                                if (thM5538exceptionOrNullimpl != null) {
                                                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 12, null, thM5538exceptionOrNullimpl}, -1999045713, 1999045717, 12);
                                                    setY();
                                                    Unit unit3 = Unit.INSTANCE;
                                                }
                                                ResultKt.throwOnFailure(objM5535constructorimpl);
                                                return (setSecondaryProgressTintBlendMode) objM5535constructorimpl;
                                            }
                                            if (i10 % 2 != 0) {
                                                execute.setDividerPadding(new Object[]{executeVar}, -928336311, 928336316, System.identityHashCode(executeVar));
                                                ((Integer) setMotionEventSplittingEnabled.setCompoundDrawableTintBlendMode.setY(new Object[]{navigationOnClickListener}, 741559397, -741559396, System.identityHashCode(navigationOnClickListener))).intValue();
                                                throw null;
                                            }
                                            execute.setDividerPadding(new Object[]{executeVar}, -928336311, 928336316, System.identityHashCode(executeVar));
                                            short sIntValue2 = (short) ((Integer) setMotionEventSplittingEnabled.setCompoundDrawableTintBlendMode.setY(new Object[]{navigationOnClickListener}, 741559397, -741559396, System.identityHashCode(navigationOnClickListener))).intValue();
                                            setfooterdividersenabled = this.C;
                                            if (setfooterdividersenabled == null) {
                                                int i18 = I + 85;
                                                J = i18 % 128;
                                                int i19 = i18 % 2;
                                                Intrinsics.throwUninitializedPropertyAccessException("");
                                                setfooterdividersenabled = null;
                                            }
                                            if (setfooterdividersenabled.setY() == setIndeterminate.setDividerPadding) {
                                                i11 = 1;
                                            } else {
                                                i11 = 0;
                                            }
                                            ByteBuffer byteBufferPutShort2 = ByteBuffer.allocate(((Integer) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{getdynamicbuttonbackgroundcolor2}, 652647922, -652647918, System.identityHashCode(getdynamicbuttonbackgroundcolor2))).intValue() + 46).put((byte) ((Integer) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{setstackfrombottom}, 652647922, -652647918, System.identityHashCode(setstackfrombottom))).intValue()).putShort((short) i11);
                                            Intrinsics.checkNotNullExpressionValue(byteBufferPutShort2, "");
                                            ByteBuffer byteBufferPut2 = ((ByteBuffer) TransactionCancelled.setY(new Object[]{byteBufferPutShort2, setselection2}, 296674209, -296674209, (int) System.currentTimeMillis())).putShort(sIntValue2).put((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{setstackfrombottom}, -1034568962, 1034568962, System.identityHashCode(setstackfrombottom))).put((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{gettoofewdigitsmessage}, -1034568962, 1034568962, System.identityHashCode(gettoofewdigitsmessage)));
                                            Intrinsics.checkNotNullExpressionValue(byteBufferPut2, "");
                                            byte[] bArrArray2 = ((ByteBuffer) TransactionCancelled.setY(new Object[]{(ByteBuffer) TransactionCancelled.setY(new Object[]{byteBufferPut2, getdynamicbuttonbackgroundcolor2}, 942844553, -942844552, (int) System.currentTimeMillis()), setshowdividers2}, 296674209, -296674209, (int) System.currentTimeMillis())).array();
                                            Intrinsics.checkNotNullExpressionValue(bArrArray2, "");
                                            CloseableKt.closeFinally(setstackfrombottom, null);
                                            onContextItemSelected.setCompoundDrawableTintBlendMode(new Object[]{oncontextitemselected, bArrArray2}, -1669177641, 1669177646, System.identityHashCode(oncontextitemselected));
                                            byte[] bArr3 = (byte[]) onContextItemSelected.setCompoundDrawableTintBlendMode(new Object[]{oncontextitemselected}, 596532494, -596532488, System.identityHashCode(oncontextitemselected));
                                            Intrinsics.checkNotNull(bArr3);
                                            setOnItemSelectedListener setonitemselectedlistener2 = setOnItemSelectedListener.INSTANCE;
                                            new alp();
                                            alp alpVar2 = new alp();
                                            alm.setY(new Object[]{alpVar2, bArr3, 0, Integer.valueOf(bArr3.length)}, 1533057357, -1533057354, 0);
                                            Unit unit4 = Unit.INSTANCE;
                                            byte[] bArr4 = new byte[alpVar2.setY()];
                                            alpVar2.setCompoundDrawableTintBlendMode(bArr4, 0);
                                            setdividerpadding = new setSecondaryProgressTintBlendMode.setDividerPadding(new setMeasureWithLargestChildEnabled(bArr4));
                                            objM5535constructorimpl = Result.m5535constructorimpl(setdividerpadding);
                                            thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                                            if (thM5538exceptionOrNullimpl != null) {
                                                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 12, null, thM5538exceptionOrNullimpl}, -1999045713, 1999045717, 12);
                                                setY();
                                                Unit unit5 = Unit.INSTANCE;
                                            }
                                            ResultKt.throwOnFailure(objM5535constructorimpl);
                                            return (setSecondaryProgressTintBlendMode) objM5535constructorimpl;
                                        } catch (Throwable th2) {
                                            try {
                                                throw th2;
                                            } catch (Throwable th3) {
                                                CloseableKt.closeFinally(setstackfrombottom, th2);
                                                throw th3;
                                            }
                                        }
                                        byte[] compoundDrawableTintBlendMode3 = setPivotX.setCompoundDrawableTintBlendMode(setpivotx).setCompoundDrawableTintBlendMode(settextisselectable.setY(), compoundDrawableTintBlendMode);
                                        byte[] y10 = settextisselectable.setY();
                                        Random.Companion companion3 = Random.INSTANCE;
                                        companion3.nextBytes(y10);
                                        companion3.nextBytes(compoundDrawableTintBlendMode);
                                        setstackfrombottom = new setStackFromBottom(compoundDrawableTintBlendMode3);
                                        CloseableKt.closeFinally(settextisselectable, null);
                                        i10 = I + 57;
                                        J = i10 % 128;
                                    } catch (Throwable th4) {
                                        byte[] y11 = settextisselectable.setY();
                                        Random.Companion companion4 = Random.INSTANCE;
                                        companion4.nextBytes(y11);
                                        companion4.nextBytes(compoundDrawableTintBlendMode);
                                        throw th4;
                                    }
                                    compoundDrawableTintBlendMode = setPivotX.setCompoundDrawableTintBlendMode(setpivotx).setCompoundDrawableTintBlendMode(settextisselectable.setY(), (byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{getuimessage2}, -1034568962, 1034568962, System.identityHashCode(getuimessage2)));
                                    CloseableKt.closeFinally(getuimessage2, null);
                                    int i20 = J + 41;
                                    I = i20 % 128;
                                    int i21 = i20 % 2;
                                    length = compoundDrawableTintBlendMode.length - 1;
                                } catch (Throwable th5) {
                                    try {
                                        throw th5;
                                    } catch (Throwable th6) {
                                        CloseableKt.closeFinally(getuimessage2, th5);
                                        throw th6;
                                    }
                                }
                                byte length2 = (byte) ((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{getuimessage}, -1034568962, 1034568962, System.identityHashCode(getuimessage))).length;
                                byte[] bArr5 = new byte[16];
                                bArr5[0] = 64;
                                bArr5[0] = (byte) (64 | ((byte) (length2 & 15)));
                                if (length2 < 4) {
                                    int i22 = J + 21;
                                    I = i22 % 128;
                                    int i23 = i22 % 2;
                                    b10 = 4;
                                } else {
                                    b10 = length2;
                                }
                                if (length2 > 0) {
                                    int i24 = 0;
                                    while (true) {
                                        int i25 = i24 + 1;
                                        setshowdividers2 = setshowdividers;
                                        int i26 = (i24 >> 1) + 1;
                                        oncontextitemselected = oncontextitemselected2;
                                        getdynamicbuttonbackgroundcolor2 = getdynamicbuttonbackgroundcolor;
                                        setselection2 = setselection;
                                        char c10 = (char) ((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{getuimessage}, -1034568962, 1034568962, System.identityHashCode(getuimessage)))[i24];
                                        if (c10 == '0') {
                                            i12 = 0;
                                        } else if (c10 == '1') {
                                            i12 = 1;
                                        } else if (c10 == '2') {
                                            i12 = 2;
                                        } else if (c10 == '3') {
                                            i12 = 3;
                                        } else if (c10 == '4') {
                                            i12 = 4;
                                        } else if (c10 == '5') {
                                            int i27 = I + 27;
                                            J = i27 % 128;
                                            if (i27 % 2 == 0) {
                                                i12 = 3;
                                            } else {
                                                i12 = 5;
                                            }
                                        } else if (c10 == '6') {
                                            int i28 = I + 1;
                                            J = i28 % 128;
                                            if (i28 % 2 == 0) {
                                                i13 = 20;
                                                i12 = i13;
                                            } else {
                                                i12 = 6;
                                            }
                                        } else {
                                            i12 = 7;
                                            if (c10 != '7') {
                                                if (c10 == '8') {
                                                    i12 = 8;
                                                } else if (c10 == '9') {
                                                    i13 = 9;
                                                    i12 = i13;
                                                } else if (c10 == 'a') {
                                                    i12 = 10;
                                                } else if (c10 == 'A') {
                                                    int i29 = J + 7;
                                                    I = i29 % 128;
                                                    int i30 = i29 % 2;
                                                    i12 = 10;
                                                } else {
                                                    i12 = 11;
                                                    if (c10 == 'b') {
                                                        int i31 = J + 103;
                                                        I = i31 % 128;
                                                        int i32 = i31 % 2;
                                                    } else if (c10 != 'B') {
                                                        if (c10 == 'c') {
                                                            int i33 = I + 87;
                                                            J = i33 % 128;
                                                            int i34 = i33 % 2;
                                                        } else if (c10 != 'C') {
                                                            i12 = 13;
                                                            if (c10 != 'd' && c10 != 'D') {
                                                                i12 = 14;
                                                                if (c10 != 'e' && c10 != 'E') {
                                                                    if (c10 != 'f') {
                                                                        if (c10 != 'F') {
                                                                            throw new IllegalArgumentException(String.valueOf(c10));
                                                                        }
                                                                        int i35 = J + 79;
                                                                        I = i35 % 128;
                                                                        int i36 = i35 % 2;
                                                                    }
                                                                    i12 = 15;
                                                                }
                                                            }
                                                        }
                                                        i12 = 12;
                                                    }
                                                }
                                            }
                                        }
                                        if (i24 % 2 == 0) {
                                            bArr5[i26] = (byte) (bArr5[i26] | ((byte) ((i12 << 4) & 240)));
                                        } else {
                                            bArr5[i26] = (byte) (bArr5[i26] | ((byte) (i12 & 15)));
                                        }
                                        if (i25 >= length2) {
                                            break;
                                        }
                                        i24 = i25;
                                        setshowdividers = setshowdividers2;
                                        oncontextitemselected2 = oncontextitemselected;
                                        setselection = setselection2;
                                        getdynamicbuttonbackgroundcolor = getdynamicbuttonbackgroundcolor2;
                                    }
                                } else {
                                    oncontextitemselected = oncontextitemselected2;
                                    getdynamicbuttonbackgroundcolor2 = getdynamicbuttonbackgroundcolor;
                                    setshowdividers2 = setshowdividers;
                                    setselection2 = setselection;
                                }
                                getuimessage.close();
                                int i37 = 2;
                                int i38 = b10 + 2;
                                if (i38 < 16) {
                                    while (true) {
                                        int i39 = i38 + 1;
                                        int i40 = i38 >> 1;
                                        if (i38 % i37 == 0) {
                                            bArr5[i40] = (byte) (bArr5[i40] | (-96));
                                        } else {
                                            bArr5[i40] = (byte) (bArr5[i40] | 10);
                                        }
                                        if (i39 >= 16) {
                                            break;
                                        }
                                        i38 = i39;
                                        i37 = 2;
                                    }
                                }
                                int i41 = 8;
                                byte[] x4 = setPivotX.setY(setpivotx).setX(8);
                                do {
                                    int i42 = i41;
                                    i41 = i42 + 1;
                                    bArr5[i42] = x4[i42 - 8];
                                } while (i41 <= 15);
                                getuimessage2 = new getUiMessage(bArr5);
                                CloseableKt.closeFinally(getuimessage, null);
                            } catch (Throwable th7) {
                                try {
                                    throw th7;
                                } catch (Throwable th8) {
                                    CloseableKt.closeFinally(getuimessage, th7);
                                    throw th8;
                                }
                            }
                            getuimessage = new getUiMessage((byte[]) execute.setDividerPadding(new Object[]{executeVar}, -834355004, 834355015, System.identityHashCode(executeVar)));
                        } catch (Throwable th9) {
                            th = th9;
                            Throwable th10 = th;
                            try {
                                throw th10;
                            } catch (Throwable th11) {
                                CloseableKt.closeFinally(settextisselectable, th10);
                                throw th11;
                            }
                        }
                        setpivotx = this.f57345w;
                        setcolorfilter = setcolorfilter2;
                    } catch (Throwable th12) {
                        th = th12;
                        setcolorfilter = setcolorfilter2;
                    }
                    setMotionEventSplittingEnabled setmotioneventsplittingenabled3 = this.D;
                    if (setmotioneventsplittingenabled3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        setmotioneventsplittingenabled3 = null;
                    }
                    navigationOnClickListener = setmotioneventsplittingenabled3.setNavigationOnClickListener();
                    executeVar = (execute) setMotionEventSplittingEnabled.setCompoundDrawableTintBlendMode.setY(new Object[]{navigationOnClickListener}, -212655959, 212655959, System.identityHashCode(navigationOnClickListener));
                    setselection = new setSelection((byte) executeVar.size());
                    settextisselectable = (setTextIsSelectable) onContextItemSelected.setCompoundDrawableTintBlendMode(new Object[]{oncontextitemselected2}, -1094228599, 1094228601, System.identityHashCode(oncontextitemselected2));
                    Intrinsics.checkNotNull(settextisselectable);
                    setshowdividers = (setShowDividers) onContextItemSelected.setCompoundDrawableTintBlendMode(new Object[]{oncontextitemselected2}, 688398571, -688398564, System.identityHashCode(oncontextitemselected2));
                    Intrinsics.checkNotNull(setshowdividers);
                    getdynamicbuttonbackgroundcolor = (getDynamicButtonBackgroundColor) onContextItemSelected.setCompoundDrawableTintBlendMode(new Object[]{oncontextitemselected2}, 1646547801, -1646547801, System.identityHashCode(oncontextitemselected2));
                    Intrinsics.checkNotNull(getdynamicbuttonbackgroundcolor);
                    gettoofewdigitsmessage = new getTooFewDigitsMessage(this.f57346x.setX(16));
                } else {
                    setdividerpadding = new setSecondaryProgressTintBlendMode.setOnFocusChangeListener();
                }
                setcolorfilter = setcolorfilter2;
                objM5535constructorimpl = Result.m5535constructorimpl(setdividerpadding);
            } catch (Throwable th13) {
                th = th13;
                Result.Companion companion5 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th));
                thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                if (thM5538exceptionOrNullimpl != null) {
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 12, null, thM5538exceptionOrNullimpl}, -1999045713, 1999045717, 12);
                    setY();
                    Unit unit6 = Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(objM5535constructorimpl);
                return (setSecondaryProgressTintBlendMode) objM5535constructorimpl;
            }
        } catch (Throwable th14) {
            th = th14;
            setcolorfilter = setcolorfilter2;
        }
        thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 12, null, thM5538exceptionOrNullimpl}, -1999045713, 1999045717, 12);
            setY();
            Unit unit7 = Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM5535constructorimpl);
        return (setSecondaryProgressTintBlendMode) objM5535constructorimpl;
    }

    @Override // com.mypinpad.tsdk.isolation.initCause
    @NotNull
    public final synchronized byte[] setCompoundDrawableTintBlendMode(int i10, int i11) {
        Object objM5535constructorimpl;
        try {
            try {
                Result.Companion companion = Result.INSTANCE;
                if (this.B != initCause.setCompoundDrawableTintBlendMode.setY) {
                    throw new setBackgroundTintBlendMode(this.B);
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                setIndeterminateTintMode setindeterminatetintmode = this.F;
                if (setindeterminatetintmode == null) {
                    int i12 = I + 27;
                    J = i12 % 128;
                    int i13 = i12 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    setindeterminatetintmode = null;
                }
                this.E = setindeterminatetintmode.y_(this.f57343u, i10, i11, canvas);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
                objM5535constructorimpl = Result.m5535constructorimpl((byte[]) setPreferKeepClearRects.setOnFocusChangeListener(new Object[]{bitmapCreateBitmap}, 2127939347, -2127939346, (int) System.currentTimeMillis()));
                if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
                    this.B = initCause.setCompoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode;
                }
                Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                if (thM5538exceptionOrNullimpl != null) {
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.A, 33, null, thM5538exceptionOrNullimpl}, -1999045713, 1999045717, 33);
                    setY();
                    int i14 = I + 77;
                    J = i14 % 128;
                    int i15 = i14 % 2;
                }
                ResultKt.throwOnFailure(objM5535constructorimpl);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return (byte[]) objM5535constructorimpl;
    }

    @Override // com.mypinpad.tsdk.isolation.initCause
    @Nullable
    public final synchronized setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode setDividerPadding() {
        int i10 = J + 83;
        I = i10 % 128;
        int i11 = i10 % 2;
        initCause.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = this.B;
        if (setcompounddrawabletintblendmode != initCause.setCompoundDrawableTintBlendMode.setOnFocusChangeListener) {
            int i12 = I + 119;
            J = i12 % 128;
            int i13 = i12 % 2;
            if (setcompounddrawabletintblendmode != initCause.setCompoundDrawableTintBlendMode.setDividerPadding) {
                setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = new setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode(setElegantTextHeight.setX);
                int i14 = J + 23;
                I = i14 % 128;
                if (i14 % 2 == 0) {
                    return setcompounddrawabletintblendmode2;
                }
                throw null;
            }
        }
        return null;
    }

    @Override // com.mypinpad.tsdk.isolation.initCause
    @NotNull
    public final synchronized setDividerDrawable setOnFocusChangeListener(float f6, float f10) {
        Object objM5535constructorimpl;
        int i10;
        setSecondaryProgressTintBlendMode setsecondaryprogresstintblendmodeI;
        try {
            try {
                Result.Companion companion = Result.INSTANCE;
                if (this.B != initCause.setCompoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode) {
                    throw new setSelectAllOnFocus(this.B);
                }
                setMotionEventSplittingEnabled setmotioneventsplittingenabled = this.D;
                if (setmotioneventsplittingenabled == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    setmotioneventsplittingenabled = null;
                }
                int size = setmotioneventsplittingenabled.setX().size();
                setCollapseIcon[] setcollapseiconArr = this.E;
                if (setcollapseiconArr == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    setcollapseiconArr = null;
                }
                int length = setcollapseiconArr.length;
                int i11 = 0;
                while (true) {
                    i10 = -1;
                    if (i11 >= length) {
                        i11 = -1;
                        break;
                    }
                    if (setcollapseiconArr[i11].setY(f6, f10)) {
                        break;
                    }
                    i11++;
                }
                setCollapseIcon[] setcollapseiconArr2 = this.E;
                if (setcollapseiconArr2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    setcollapseiconArr2 = null;
                }
                setCollapseIcon setcollapseicon = (setCollapseIcon) ArraysKt___ArraysKt.getOrNull(setcollapseiconArr2, i11);
                if (setcollapseicon != null) {
                    Object[] objArr = new Object[1];
                    g(14 - TextUtils.getTrimmedLength(""), 201 - ImageFormat.getBitsPerPixel(0), KeyEvent.keyCodeFromString("") + 13, objArr);
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{Intrinsics.stringPlus(((String) objArr[0]).intern(), setcollapseicon)}, -1689942959, 1689942969, (int) System.currentTimeMillis());
                }
                setCollapseIcon.setY dividerPadding = setcollapseicon == null ? null : setcollapseicon.setDividerPadding();
                if (dividerPadding != null) {
                    i10 = setDividerPadding.setOnFocusChangeListener[dividerPadding.ordinal()];
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        setMotionEventSplittingEnabled setmotioneventsplittingenabled2 = this.D;
                        if (setmotioneventsplittingenabled2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            setmotioneventsplittingenabled2 = null;
                        }
                        setmotioneventsplittingenabled2.setOnFocusChangeListener();
                    } else if (i10 != 3) {
                        if (i10 == 4) {
                            setsecondaryprogresstintblendmodeI = new setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode(setElegantTextHeight.setOnFocusChangeListener);
                        }
                    } else if (size < 12) {
                        setMotionEventSplittingEnabled setmotioneventsplittingenabled3 = this.D;
                        if (setmotioneventsplittingenabled3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            setmotioneventsplittingenabled3 = null;
                        }
                        if (setmotioneventsplittingenabled3.setDividerPadding()) {
                            throw new setRotation(TypedValues.Custom.TYPE_INT);
                        }
                        if (i11 < 0 || i11 > 12) {
                            throw new setRotation(903);
                        }
                        setmotioneventsplittingenabled3.setX().add(Character.valueOf(setmotioneventsplittingenabled3.setCompoundDrawableTintBlendMode()[i11]));
                        setMotionEventSplittingEnabled.setOnFocusChangeListener(new Object[]{setmotioneventsplittingenabled3, setmotioneventsplittingenabled3.getNavBarTitleString()}, 634271129, -634271128, System.identityHashCode(setmotioneventsplittingenabled3));
                    }
                    setsecondaryprogresstintblendmodeI = null;
                } else {
                    setsecondaryprogresstintblendmodeI = i();
                }
                if (setsecondaryprogresstintblendmodeI instanceof setSecondaryProgressTintBlendMode.setDividerPadding) {
                    this.B = initCause.setCompoundDrawableTintBlendMode.setOnFocusChangeListener;
                }
                setMotionEventSplittingEnabled setmotioneventsplittingenabled4 = this.D;
                if (setmotioneventsplittingenabled4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    setmotioneventsplittingenabled4 = null;
                }
                objM5535constructorimpl = Result.m5535constructorimpl(new setDividerDrawable(setmotioneventsplittingenabled4.setX().size(), setsecondaryprogresstintblendmodeI));
                if (Result.m5541isSuccessimpl(objM5535constructorimpl) && (((setDividerDrawable) objM5535constructorimpl).setX() instanceof setSecondaryProgressTintBlendMode.setDividerPadding)) {
                    this.B = initCause.setCompoundDrawableTintBlendMode.setOnFocusChangeListener;
                }
                Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                if (thM5538exceptionOrNullimpl != null) {
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.A, 10, null, thM5538exceptionOrNullimpl}, -1999045713, 1999045717, 10);
                    setY();
                }
                ResultKt.throwOnFailure(objM5535constructorimpl);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return (setDividerDrawable) objM5535constructorimpl;
    }

    @Override // com.mypinpad.tsdk.isolation.initCause
    public final synchronized void setX(@NotNull setFooterDividersEnabled setfooterdividersenabled, @NotNull setLabelFor setlabelfor) {
        Object objM5535constructorimpl;
        try {
            Intrinsics.checkNotNullParameter(setfooterdividersenabled, "");
            Intrinsics.checkNotNullParameter(setlabelfor, "");
            try {
                Result.Companion companion = Result.INSTANCE;
                if (this.B != initCause.setCompoundDrawableTintBlendMode.setX) {
                    throw new setPadViewListener(this.B);
                }
                this.C = setfooterdividersenabled;
                Pair<byte[], byte[]> dividerPadding = this.f57347y.setDividerPadding(this.G.setX(), setlabelfor);
                byte[] bArrComponent1 = dividerPadding.component1();
                byte[] bArrComponent2 = dividerPadding.component2();
                getDynamicButtonBackgroundColor getdynamicbuttonbackgroundcolor = new getDynamicButtonBackgroundColor(bArrComponent1);
                setPivotY setpivoty = new setPivotY(this.G.setCompoundDrawableTintBlendMode(bArrComponent2));
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.A, 8, null, null, 6}, 1173867142, -1173867141, 8);
                try {
                    initialise initialiseVar = new initialise();
                    setRight setright = new setRight(initialiseVar);
                    setNextFocusUpId setnextfocusupid = new setNextFocusUpId((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{setpivoty}, -1034568962, 1034568962, System.identityHashCode(setpivoty)), initialiseVar);
                    getAmountFieldTextSizeSp getamountfieldtextsizesp = new getAmountFieldTextSizeSp((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{getdynamicbuttonbackgroundcolor}, -1034568962, 1034568962, System.identityHashCode(getdynamicbuttonbackgroundcolor)), initialiseVar);
                    setLayoutAnimationListener setlayoutanimationlistener = setLayoutAnimationListener.INSTANCE;
                    setright.setCompoundDrawableTintBlendMode(setnextfocusupid, getamountfieldtextsizesp, new setScaleY((byte[]) setLayoutAnimationListener.setY(new Object[0], -1117967001, 1117967001, (int) System.currentTimeMillis())));
                    Triple triple = new Triple(setright, new setShowDividers(setRight.setY(setright, 4)), new setTextIsSelectable(setRight.setY(setright, 16)));
                    CloseableKt.closeFinally(setpivoty, null);
                    setRight setright2 = (setRight) triple.component1();
                    setShowDividers setshowdividers = (setShowDividers) triple.component2();
                    setTextIsSelectable settextisselectable = (setTextIsSelectable) triple.component3();
                    onContextItemSelected oncontextitemselected = this.f57344v;
                    onContextItemSelected.setCompoundDrawableTintBlendMode(new Object[]{oncontextitemselected, getdynamicbuttonbackgroundcolor}, 1571906280, -1571906272, System.identityHashCode(oncontextitemselected));
                    onContextItemSelected oncontextitemselected2 = this.f57344v;
                    onContextItemSelected.setCompoundDrawableTintBlendMode(new Object[]{oncontextitemselected2, setshowdividers}, 898138497, -898138494, System.identityHashCode(oncontextitemselected2));
                    onContextItemSelected oncontextitemselected3 = this.f57344v;
                    onContextItemSelected.setCompoundDrawableTintBlendMode(new Object[]{oncontextitemselected3, settextisselectable}, 1266596466, -1266596465, System.identityHashCode(oncontextitemselected3));
                    setMotionEventSplittingEnabled setmotioneventsplittingenabled = new setMotionEventSplittingEnabled(setright2, setfooterdividersenabled.setY() == setIndeterminate.setDividerPadding, setfooterdividersenabled.setDividerPadding());
                    this.D = setmotioneventsplittingenabled;
                    char[] cArr = (char[]) setMotionEventSplittingEnabled.setOnFocusChangeListener(new Object[]{setmotioneventsplittingenabled}, -993480851, 993480851, System.identityHashCode(setmotioneventsplittingenabled));
                    setIndeterminateTintMode settransitionname = setfooterdividersenabled.setY() == setIndeterminate.setOnFocusChangeListener ? new setTransitionName(this.f57346x) : new setLineHeight();
                    this.F = settransitionname;
                    settransitionname.setDividerPadding(setfooterdividersenabled.setCompoundDrawableTintBlendMode(), new onOptionsItemSelected(cArr));
                    objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(setpivoty, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th4));
            }
            if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
                this.B = initCause.setCompoundDrawableTintBlendMode.setY;
            }
            Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
            if (thM5538exceptionOrNullimpl != null) {
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.A, 9, null, thM5538exceptionOrNullimpl}, -1999045713, 1999045717, 9);
                setY();
            }
            ResultKt.throwOnFailure(objM5535constructorimpl);
        } catch (Throwable th5) {
            throw th5;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.initCause
    public final synchronized void setY() {
        try {
            initCause.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = this.B;
            initCause.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = initCause.setCompoundDrawableTintBlendMode.setDividerPadding;
            setMotionEventSplittingEnabled setmotioneventsplittingenabled = null;
            if (setcompounddrawabletintblendmode == setcompounddrawabletintblendmode2) {
                int i10 = J + 5;
                I = i10 % 128;
                if (i10 % 2 == 0) {
                    return;
                } else {
                    throw null;
                }
            }
            this.B = setcompounddrawabletintblendmode2;
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.A, 13, null, null, 6}, 1173867142, -1173867141, 13);
            this.f57344v.close();
            setMotionEventSplittingEnabled setmotioneventsplittingenabled2 = this.D;
            if (setmotioneventsplittingenabled2 != null) {
                if (setmotioneventsplittingenabled2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    int i11 = J + 113;
                    I = i11 % 128;
                    int i12 = i11 % 2;
                    setmotioneventsplittingenabled = setmotioneventsplittingenabled2;
                }
                setmotioneventsplittingenabled.close();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.initCause
    @Nullable
    public final synchronized setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode setOnFocusChangeListener() {
        try {
            if (this.B == initCause.setCompoundDrawableTintBlendMode.setDividerPadding) {
                int i10 = I + 3;
                J = i10 % 128;
                if (i10 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            setY();
            setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode(setElegantTextHeight.setDividerPadding);
            int i11 = J + 17;
            I = i11 % 128;
            if (i11 % 2 == 0) {
                return setcompounddrawabletintblendmode;
            }
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    @Override // com.mypinpad.tsdk.isolation.initCause
    @NotNull
    public final synchronized Pair<byte[], byte[]> setX(@NotNull setMeasureWithLargestChildEnabled setmeasurewithlargestchildenabled, @NotNull byte[] bArr) {
        byte[] bArrCopyOf;
        int i10 = I + 21;
        J = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(setmeasurewithlargestchildenabled, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (this.B == initCause.setCompoundDrawableTintBlendMode.setOnFocusChangeListener) {
            try {
                onContextItemSelected oncontextitemselected = this.f57344v;
                byte[] bArr2 = (byte[]) onContextItemSelected.setCompoundDrawableTintBlendMode(new Object[]{oncontextitemselected}, 596532494, -596532488, System.identityHashCode(oncontextitemselected));
                if (bArr2 == null) {
                    int i12 = J + 85;
                    I = i12 % 128;
                    int i13 = i12 % 2;
                    bArrCopyOf = null;
                } else {
                    bArrCopyOf = Arrays.copyOf(bArr2, bArr2.length);
                    Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
                }
                if (bArrCopyOf != null) {
                    onContextItemSelected oncontextitemselected2 = this.f57344v;
                    byte[] bArr3 = (byte[]) onContextItemSelected.setCompoundDrawableTintBlendMode(new Object[]{oncontextitemselected2}, 596532494, -596532488, System.identityHashCode(oncontextitemselected2));
                    if (bArr3 != null) {
                        Random.INSTANCE.nextBytes(bArr3);
                    }
                    onContextItemSelected oncontextitemselected3 = this.f57344v;
                    onContextItemSelected.setCompoundDrawableTintBlendMode(new Object[]{oncontextitemselected3, null}, -1669177641, 1669177646, System.identityHashCode(oncontextitemselected3));
                    int i14 = J + 73;
                    I = i14 % 128;
                    int i15 = i14 % 2;
                    try {
                        setOnItemSelectedListener setonitemselectedlistener = setOnItemSelectedListener.INSTANCE;
                        new alp();
                        alp alpVar = new alp();
                        alm.setY(new Object[]{alpVar, bArrCopyOf, 0, Integer.valueOf(bArrCopyOf.length)}, 1533057357, -1533057354, 0);
                        byte[] bArr4 = new byte[alpVar.setY()];
                        alpVar.setCompoundDrawableTintBlendMode(bArr4, 0);
                        if (Intrinsics.areEqual(new setMeasureWithLargestChildEnabled(bArr4), setmeasurewithlargestchildenabled)) {
                        } else {
                            throw new setBaselineAlignBottom();
                        }
                    } catch (Throwable th2) {
                        Random.INSTANCE.nextBytes(bArrCopyOf);
                        throw th2;
                    }
                } else {
                    throw new setMovementMethod();
                }
            } catch (Throwable th3) {
                onContextItemSelected oncontextitemselected4 = this.f57344v;
                byte[] bArr5 = (byte[]) onContextItemSelected.setCompoundDrawableTintBlendMode(new Object[]{oncontextitemselected4}, 596532494, -596532488, System.identityHashCode(oncontextitemselected4));
                if (bArr5 != null) {
                    Random.INSTANCE.nextBytes(bArr5);
                }
                onContextItemSelected oncontextitemselected5 = this.f57344v;
                onContextItemSelected.setCompoundDrawableTintBlendMode(new Object[]{oncontextitemselected5, null}, -1669177641, 1669177646, System.identityHashCode(oncontextitemselected5));
                throw th3;
            }
            throw th;
        }
        throw new getPinGridButtonTextColor(this.B);
        return new Pair<>(bArrCopyOf, new byte[0]);
    }

    @Override // com.mypinpad.tsdk.isolation.initCause
    @Nullable
    public final synchronized setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode setX() {
        int i10 = I + 125;
        J = i10 % 128;
        int i11 = i10 % 2;
        initCause.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = this.B;
        if (setcompounddrawabletintblendmode != initCause.setCompoundDrawableTintBlendMode.setOnFocusChangeListener && setcompounddrawabletintblendmode != initCause.setCompoundDrawableTintBlendMode.setDividerPadding) {
            return new setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode(setElegantTextHeight.setCompoundDrawableTintBlendMode);
        }
        int i12 = J + 37;
        I = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }
}
