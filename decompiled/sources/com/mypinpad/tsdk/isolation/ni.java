package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nProcessing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Processing.kt\ncom/mypinpad/tsdk/internal/emvlib/Processing\n*L\n1#1,246:1\n225#1,6:247\n233#1,6:253\n233#1,6:259\n225#1,6:265\n225#1,6:271\n*S KotlinDebug\n*F\n+ 1 Processing.kt\ncom/mypinpad/tsdk/internal/emvlib/Processing\n*L\n78#1:247,6\n119#1:253,6\n169#1:259,6\n199#1:265,6\n210#1:271,6\n*E\n"})
public abstract class ni {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f57311j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f57312k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char f57313l;
    public static final long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f57314n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f57315o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f57316p = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final component24 f57317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setAccessibilityDelegate f57318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final component12 f57319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final UUID f57320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Function1<Boolean, Unit> f57321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final AtomicReference<ng> f57322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f57323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Lazy f57324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ne f57325i;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/mypinpad/tsdk/i/ni$2$2;", "setX", "()Lcom/mypinpad/tsdk/i/ni$2$2;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Lambda implements Function0<ni$2$2> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<sa, Unit> f57329q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super sa, Unit> function1) {
            super(0);
            this.f57329q0 = function1;
        }

        public static ni$2$2 a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * 517) + (i10 * (-515));
            int i14 = ~i11;
            int i15 = ~(i14 | i12);
            int i16 = ~i12;
            int i17 = i15 | (~(i16 | i10));
            int i18 = ~(i16 | i11);
            int i19 = ~i10;
            if ((((~(i19 | i11)) | i18) * LibMCryptConstants.IND_HEX_SEGMENTO2) + (((~(i12 | i14 | i19)) | (~(i19 | i16 | i11))) * LibMCryptConstants.IND_HEX_SEGMENTO2) + ((i17 | i18) * (-516)) + i13 != 1) {
                a aVar = (a) objArr[0];
                ni$2$2 ni_2_2A = a(new Object[]{aVar}, -1682396470, 1682396471, System.identityHashCode(aVar));
                System.identityHashCode(aVar);
                System.identityHashCode(aVar);
                return ni_2_2A;
            }
            a aVar2 = (a) objArr[0];
            ni niVar = ni.this;
            ni$2$2 ni_2_2 = new ni$2$2();
            ni_2_2.f57326a = niVar;
            ni_2_2.f57327b = aVar2.f57329q0;
            return ni_2_2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ ni$2$2 invoke() {
            return a(new Object[]{this}, -1804402096, 1804402096, System.identityHashCode(this));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<setAccessibilityDelegate.setX, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final long f57330p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final int f57331q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f57332r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final byte[] f57333s0 = null;

        static {
            c();
            f57332r0 = 0;
            f57331q0 = 1;
            f57330p0 = -2795175668610907205L;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(ni niVar) throws Throwable {
            Object[] objArr = new Object[1];
            a("⁄첐笠\ue6df錴耘굑婂䚪玚惡ഡ㨥❦푛삸\ued99", 60637 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("⁄롢လ\ue8c5䃼\ud8a2녥ऀ\ue13a秸톕\uaa5bɍ騼狟쪊ꊹ㬛錮欲쏯定㐉豸搽ﳋ咃ⲷ蕸ᴞ\uf5ca䶲▭빗ᙦ\uee24䛃\ude93뚷ཱ\ue71d翄ퟴ꿦ࡑ\ue001砪탨ꢛ¡饣焅짉ꇸ㦨鈚樷숾嫤㊊譇捭\ufb0a变⮘莦᱑\uf415䰿⓵볒ᕶ\ued71䔥\uddc9떆ඪ\ue65b縇훝껹ۈ鼋睇", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 38958, objArr2);
            super(1, niVar, ni.class, strIntern, ((String) objArr2[0]).intern(), 0);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x018e  */
        /* JADX WARN: Code duplicated, block: B:35:0x018f  */
        public static void a(String str, int i10, Object[] objArr) throws Throwable {
            byte[] bArr;
            Throwable cause;
            int i11 = f57332r0 + 87;
            int i12 = i11 % 128;
            char c10 = 2;
            int i13 = i11 % 2;
            int i14 = i12 + 69;
            f57332r0 = i14 % 128;
            if (i14 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            char[] charArray = str.toCharArray();
            setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
            setlayoutanimation.setOnFocusChangeListener = i10;
            int length = charArray.length;
            long[] jArr = new long[length];
            int i15 = 0;
            setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
            while (true) {
                int i16 = setlayoutanimation.setCompoundDrawableTintBlendMode;
                int length2 = charArray.length;
                bArr = f57333s0;
                if (i16 >= length2) {
                    break;
                }
                char c11 = charArray[i16];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[c10] = setlayoutanimation;
                    objArr2[1] = setlayoutanimation;
                    objArr2[i15] = Integer.valueOf(c11);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-764403778);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) Gravity.getAbsoluteGravity(i15, i15), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32, (KeyEvent.getMaxKeyCode() >> 16) + 1195);
                        byte b10 = (byte) (-bArr[1]);
                        byte b11 = (byte) (b10 + 1);
                        Object[] objArr3 = new Object[1];
                        b(b11, b10, b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                        map.put(-764403778, method);
                    }
                    jArr[i16] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f57330p0 ^ 1779209353347916695L);
                    Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                    Object method2 = map.get(645183118);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 44 - TextUtils.getTrimmedLength(""), 728 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        byte b12 = bArr[1];
                        byte b13 = (byte) (-b12);
                        byte b14 = b12;
                        Object[] objArr5 = new Object[1];
                        b((byte) (b14 - 1), b13, b14, objArr5);
                        method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                        map.put(645183118, method2);
                    }
                    ((Method) method2).invoke(null, objArr4);
                    c10 = 2;
                    i15 = 0;
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
                int i17 = setlayoutanimation.setCompoundDrawableTintBlendMode;
                if (i17 >= charArray.length) {
                    String str2 = new String(cArr);
                    int i18 = f57332r0 + 99;
                    int i19 = i18 % 128;
                    int i20 = i18 % 2;
                    objArr[0] = str2;
                    return;
                }
                cArr[i17] = (char) jArr[i17];
                Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(645183118);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", ""), TextUtils.indexOf("", "", 0, 0) + 44, (ViewConfiguration.getJumpTapTimeout() >> 16) + 728);
                    byte b15 = bArr[1];
                    byte b16 = (byte) (-b15);
                    byte b17 = b15;
                    Object[] objArr7 = new Object[1];
                    b((byte) (b17 - 1), b16, b17, objArr7);
                    method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(645183118, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 + 4
                int r6 = r6 * 4
                int r0 = 1 - r6
                int r8 = r8 * 3
                int r8 = 110 - r8
                byte[] r0 = new byte[r0]
                r1 = 0
                int r6 = 0 - r6
                byte[] r2 = com.mypinpad.tsdk.i.ni.b.f57333s0
                if (r2 != 0) goto L18
                r8 = r7
                r4 = r8
                r3 = r1
                r7 = r6
                goto L30
            L18:
                r3 = r1
            L19:
                byte r4 = (byte) r8
                r0[r3] = r4
                int r7 = r7 + 1
                if (r3 != r6) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r1)
                r9[r1] = r6
                return
            L28:
                int r3 = r3 + 1
                r4 = r2[r7]
                r5 = r7
                r7 = r6
                r6 = r8
                r8 = r5
            L30:
                int r4 = -r4
                int r6 = r6 + r4
                r5 = r8
                r8 = r6
                r6 = r7
                r7 = r5
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.ni.b.b(byte, int, short, java.lang.Object[]):void");
        }

        public static void c() {
            f57333s0 = new byte[]{82, 1, 85, -74};
        }

        public final void d(@NotNull setAccessibilityDelegate.setX setx) {
            int i10 = f57331q0;
            int i11 = i10 + 109;
            int i12 = i11 % 128;
            if (i11 % 2 != 0) {
                Intrinsics.checkNotNullParameter(setx, "");
                ni.setY((ni) this.receiver, setx);
                int i13 = 31 / 0;
            } else {
                Intrinsics.checkNotNullParameter(setx, "");
                ni.setY((ni) this.receiver, setx);
            }
            int i14 = i10 + 37;
            int i15 = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(setAccessibilityDelegate.setX setx) {
            int i10 = f57331q0;
            int i11 = i10 + 53;
            int i12 = i11 % 128;
            int i13 = i11 % 2;
            d(setx);
            int i14 = i10 + 29;
            int i15 = i14 % 128;
            int i16 = i14 % 2;
            return Unit.INSTANCE;
        }
    }

    static {
        d();
        f57314n = 0;
        f57315o = 1;
        f57313l = (char) 30296;
        f57311j = -7315748101329691475L;
        f57312k = -461867432;
        m = 384567839817663148L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ni(@NotNull component24 component24Var, @NotNull setAccessibilityDelegate setaccessibilitydelegate, @NotNull component12 component12Var, @NotNull UUID uuid, @NotNull Function1<? super sa, Unit> function1, @NotNull Function1<? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(component24Var, "");
        Intrinsics.checkNotNullParameter(setaccessibilitydelegate, "");
        Intrinsics.checkNotNullParameter(component12Var, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.f57317a = component24Var;
        this.f57318b = setaccessibilitydelegate;
        this.f57319c = component12Var;
        this.f57320d = uuid;
        this.f57321e = function2;
        this.f57322f = new AtomicReference<>(ng.setDividerPadding);
        this.f57323g = new AtomicBoolean(false);
        Lazy lazy = LazyKt__LazyJVMKt.lazy(new a(function1));
        this.f57324h = lazy;
        int i10 = f57315o + 63;
        f57314n = i10 % 128;
        int i11 = i10 % 2;
        ni$2$2 ni_2_2 = (ni$2$2) lazy.getValue();
        int i12 = f57314n + 69;
        f57315o = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        this.f57325i = new ne(ni_2_2);
    }

    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        char[] charArray = str.toCharArray();
        setOnDragListener setondraglistener = new setOnDragListener();
        long j10 = m;
        char[] y7 = setOnDragListener.setY(2122665171656649951L ^ j10, charArray, i10);
        setondraglistener.setDividerPadding = 4;
        while (true) {
            int i11 = setondraglistener.setDividerPadding;
            if (i11 >= y7.length) {
                objArr[0] = new String(y7, 4, y7.length - 4);
                return;
            }
            int i12 = i11 - 4;
            setondraglistener.setX = i12;
            try {
                Object[] objArr2 = {Long.valueOf(y7[i11] ^ y7[i11 % 4]), Long.valueOf(i12), Long.valueOf(j10)};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(2144228148);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (9779 - (ViewConfiguration.getJumpTapTimeout() >> 16)), View.MeasureSpec.getSize(0) + 43, 3187 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    Class<?> cls2 = Long.TYPE;
                    method = cls.getMethod("y", cls2, cls2, cls2);
                    map.put(2144228148, method);
                }
                y7[i11] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setondraglistener, setondraglistener};
                Object method2 = map.get(-62642757);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", "", 0), (Process.myTid() >> 22) + 52, 3029 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr4 = new Object[1];
                    c(b11, (byte) (b11 + 2), b10, objArr4);
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

    public static void b(char c10, String str, int i10, String str2, Object[] objArr) throws Throwable {
        char c11;
        char[] charArray = str2.toCharArray();
        char[] charArray2 = "⫵♹埘䑮".toCharArray();
        char[] charArray3 = str.toCharArray();
        UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        int i11 = 0;
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c10);
        cArr2[2] = (char) (cArr2[2] + ((char) i10));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        uiMessageCallbackKtWhenMappings.setX = 0;
        while (uiMessageCallbackKtWhenMappings.setX < length3) {
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i11] = uiMessageCallbackKtWhenMappings;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (Color.alpha(i11) + 50678), 39 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1737);
                    byte b10 = (byte) i11;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    c(b11, (byte) (b11 | 6), b10, objArr3);
                    String str3 = (String) objArr3[i11];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i11] = Object.class;
                    method = cls.getMethod(str3, clsArr);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = new Object[1];
                objArr4[i11] = uiMessageCallbackKtWhenMappings;
                Object method2 = map.get(-68974155);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (8125 - View.getDefaultSize(i11, i11)), 37 - TextUtils.indexOf("", "", i11), 646 - Gravity.getAbsoluteGravity(i11, i11));
                    byte b12 = (byte) i11;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    c(b13, (byte) (b13 + 3), b12, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                Object[] objArr6 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (Process.getGidForName("") + 1), 48 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 433);
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    c(b15, (byte) (b15 + 5), b14, objArr7);
                    String str4 = (String) objArr7[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str4, Object.class, cls4, cls4);
                    map.put(-1108711559, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                Object[] objArr8 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(533021397);
                if (method4 != null) {
                    c11 = 2;
                } else {
                    Class cls5 = (Class) setTextScaleX.setX((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4448), ExpandableListView.getPackedPositionChild(0L) + 43, 1022 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr9 = new Object[1];
                    c(b17, b17, b16, objArr9);
                    String str5 = (String) objArr9[0];
                    c11 = 2;
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str5, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                char c12 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c12;
                int i12 = uiMessageCallbackKtWhenMappings.setX;
                cArr3[i12] = (char) (((((long) (c12 ^ charArray[i12])) ^ (f57311j ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) f57312k) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) f57313l) ^ (-2443367703579691432L)))));
                uiMessageCallbackKtWhenMappings.setX = i12 + 1;
                length3 = length3;
                i11 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 2
            int r9 = r9 + 1
            int r8 = 119 - r8
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r0 = new byte[r9]
            byte[] r1 = com.mypinpad.tsdk.isolation.ni.f57316p
            r2 = 0
            if (r1 != 0) goto L18
            r8 = r7
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L34
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r3 = r3 + 1
            if (r3 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r2)
            r10[r2] = r7
            return
        L28:
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r10
            r10 = r9
            r9 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L34:
            int r7 = r7 + r9
            int r8 = r8 + 1
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ni.c(byte, byte, int, java.lang.Object[]):void");
    }

    public static void d() {
        f57316p = new byte[]{25, 121, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, -73};
    }

    public static /* synthetic */ void e(Object[] objArr) {
        ni niVar = (ni) objArr[0];
        setAccessibilityDelegate.setX setx = (setAccessibilityDelegate.setX) objArr[1];
        ng ngVar = ng.setY;
        if (setOnFocusChangeListener(niVar).get() == ngVar || ngVar == null) {
            synchronized (setOnFocusChangeListener(niVar)) {
                mr mrVar = mr.setCompoundDrawablePadding;
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr2 = new Object[1];
                a("腕徹脆熯嘁囇ઉ\udded㣶럴䂓᎗\uf2be\ufdd3蘘ꡓ갑Њ\udc2e\uee0e昀䩹ባ\u242b⇍郬ꯃ", View.combineMeasuredStates(0, 0) + 1, objArr2);
                sb2.append(((String) objArr2[0]).intern());
                sb2.append(setx);
                mt.setX(new Object[]{mrVar, sb2.toString()}, -225944049, 225944051, (int) System.currentTimeMillis());
                mu.setCompoundDrawableTintBlendMode(new Object[]{130021, getDisplayExponent.setCompoundDrawableTintBlendMode(setx), null, 4}, -1968587119, 1968587120, 130021);
                niVar.f57318b.setOnFocusChangeListener();
                niVar.setCompoundDrawableTintBlendMode(setx);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((~(i11 | i12)) * TypedValues.CycleType.TYPE_EASING) + (i11 * 421) + (i10 * (-419));
        int i14 = ~i10;
        if ((((~(i14 | (~i11))) | (~(i11 | (~i12)))) * TypedValues.CycleType.TYPE_EASING) + ((i11 | i14) * (-420)) + i13 != 1) {
            ni niVar = (ni) objArr[0];
            ng ngVar = ng.setDividerPadding;
            if (setOnFocusChangeListener(niVar).get() == ngVar || ngVar == null) {
                synchronized (setOnFocusChangeListener(niVar)) {
                    try {
                        niVar.f57322f.set(ng.setY);
                        mr mrVar = mr.setCompoundDrawablePadding;
                        Object[] objArr2 = new Object[1];
                        b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "騶᥆\udb03\uf540", ((Process.getThreadPriority(0) + 20) >> 6) + 51988122, "\ue666뷤央쐔贁\u2e70胈磙⯋䠥㳽", objArr2);
                        mt.setX(new Object[]{mrVar, ((String) objArr2[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
                        mu.setCompoundDrawableTintBlendMode(new Object[]{130018, null, null, 6}, -1968587119, 1968587120, 130018);
                        if (niVar.setLayoutAnimation()) {
                            setAccessibilityDelegate.setX compoundDrawableTintBlendMode = niVar.f57318b.setCompoundDrawableTintBlendMode(new b(niVar));
                            if (compoundDrawableTintBlendMode != null) {
                                setCompoundDrawableTintBlendMode(new Object[]{niVar, compoundDrawableTintBlendMode}, 1164782526, -1164782525, System.identityHashCode(niVar));
                            } else {
                                Object[] objArr3 = new Object[1];
                                a("Ṏ訮ḽꐩ簬侹₫쒒ꟶ", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1, objArr3);
                                mt.setX(new Object[]{mrVar, ((String) objArr3[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
                                mu.setCompoundDrawableTintBlendMode(new Object[]{130002, null, null, 6}, -1968587119, 1968587120, 130002);
                                ue<sz> dividerPadding = niVar.setDividerPadding();
                                if (dividerPadding != null) {
                                    dividerPadding.setOnFocusChangeListener(sz.setX);
                                }
                                try {
                                    niVar.f();
                                    niVar.f57317a.setX(niVar.setX(), niVar.f57325i, niVar.f57319c);
                                } catch (Exception e5) {
                                    niVar.setCompoundDrawableTintBlendMode(e5);
                                }
                                Unit unit = Unit.INSTANCE;
                            }
                        } else {
                            mu.setCompoundDrawableTintBlendMode(new Object[]{130019, null, null, 6}, -1968587119, 1968587120, 130019);
                            Object[] objArr4 = new Object[1];
                            a("䛩捄䚙䵅皱飰⨲Ꮩｄ謉恢\udda1㔘선ꚡ昡毫㣲ﲒ‡ꆼ皃", 1 - Color.red(0), objArr4);
                            mt.setX(new Object[]{mrVar, ((String) objArr4[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            e(objArr);
        }
        return null;
    }

    public static final /* synthetic */ AtomicReference setOnFocusChangeListener(ni niVar) {
        int i10 = f57315o + 15;
        int i11 = i10 % 128;
        f57314n = i11;
        int i12 = i10 % 2;
        AtomicReference<ng> atomicReference = niVar.f57322f;
        int i13 = i11 + 87;
        f57315o = i13 % 128;
        int i14 = i13 % 2;
        return atomicReference;
    }

    public static final /* synthetic */ void setY(ni niVar, setAccessibilityDelegate.setX setx) {
        int i10 = f57314n + 31;
        f57315o = i10 % 128;
        int i11 = i10 % 2;
        setCompoundDrawableTintBlendMode(new Object[]{niVar, setx}, 1164782526, -1164782525, System.identityHashCode(niVar));
        int i12 = f57314n + 87;
        f57315o = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public abstract void UiMessageCallbackKtWhenMappings();

    public final void f() {
        if (!this.f57323g.getAndSet(true)) {
            int i10 = f57315o + 43;
            f57314n = i10 % 128;
            int i11 = i10 % 2;
            Function1<Boolean, Unit> function1 = this.f57321e;
            if (i11 != 0) {
                function1.invoke(Boolean.TRUE);
                throw null;
            }
            function1.invoke(Boolean.TRUE);
        }
        int i12 = f57314n + 67;
        f57315o = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 21 / 0;
        }
    }

    public final void getNavBarTitleString() {
        int i10 = f57315o + 91;
        f57314n = i10 % 128;
        if (i10 % 2 != 0) {
            setDividerPadding();
            throw null;
        }
        ue<sz> dividerPadding = setDividerPadding();
        if (dividerPadding != null) {
            int i11 = f57314n + 29;
            f57315o = i11 % 128;
            if (i11 % 2 != 0) {
                dividerPadding.setOnFocusChangeListener(sz.setCompoundDrawableTintBlendMode);
            } else {
                dividerPadding.setOnFocusChangeListener(sz.setCompoundDrawableTintBlendMode);
                throw null;
            }
        }
    }

    public abstract void setCompoundDrawableTintBlendMode(@NotNull setAccessibilityDelegate.setX setx);

    public abstract void setCompoundDrawableTintBlendMode(@NotNull Throwable th2);

    @Nullable
    public abstract ue<sz> setDividerPadding();

    public abstract boolean setLayoutAnimation();

    public final void setNavigationOnClickListener() {
        int i10 = f57314n + 7;
        f57315o = i10 % 128;
        if (i10 % 2 == 0) {
            setDividerPadding();
            throw null;
        }
        ue<sz> dividerPadding = setDividerPadding();
        if (dividerPadding != null) {
            dividerPadding.setOnFocusChangeListener(sz.setDividerPadding);
            int i11 = f57314n + 87;
            f57315o = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }
    }

    public final void setOnDragListener() {
        if (this.f57322f.get() != ng.setCompoundDrawableTintBlendMode) {
            synchronized (this.f57322f) {
                this.f57322f.set(ng.setOnFocusChangeListener);
                mr mrVar = mr.setCompoundDrawablePadding;
                Object[] objArr = new Object[1];
                a("妓㴷姰ጥ툷儥躿\uda1f\ue03a핤", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, objArr);
                mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
                mu.setCompoundDrawableTintBlendMode(new Object[]{130003, null, null, 6}, -1968587119, 1968587120, 130003);
                UUID uuid = this.f57320d;
                String strValueOf = String.valueOf(rq.setCompoundDrawableTintBlendMode.ordinal());
                Object[] objArr2 = new Object[1];
                b((char) (TextUtils.indexOf("", "", 0) + 17344), "縄\ua957쁉䁃", ExpandableListView.getPackedPositionGroup(0L), "䲢쭧婖굸ᗷ쑚", objArr2);
                pc.setY(new ot(uuid, strValueOf, getDisplayExponent.setY(((String) objArr2[0]).intern())));
                this.f57317a.setY();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @NotNull
    public abstract ue<ug> setOnFocusChangeListener();

    public final void setOnLongClickListener() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, 1060895242, -1060895242, System.identityHashCode(this));
    }

    public final void setTextAlignment() {
        ng ngVar = ng.setCompoundDrawableTintBlendMode;
        if (this.f57322f.get() != ngVar) {
            synchronized (this.f57322f) {
                try {
                    this.f57322f.set(ngVar);
                    mr mrVar = mr.setCompoundDrawablePadding;
                    Object[] objArr = new Object[1];
                    a("羿⚪翛ࢰ㫟ᇁ晊髨옜컦Ⰸ", -TextUtils.indexOf((CharSequence) "", '0'), objArr);
                    mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
                    mu.setCompoundDrawableTintBlendMode(new Object[]{140000, null, null, 6}, -1968587119, 1968587120, 140000);
                    this.f57317a.setCompoundDrawableTintBlendMode();
                    this.f57318b.setOnFocusChangeListener();
                    setX().setDividerPadding();
                    this.f57321e.invoke(Boolean.FALSE);
                    UiMessageCallbackKtWhenMappings();
                    setOnFocusChangeListener().setOnFocusChangeListener(ug.setOnLongClickListener);
                    ue<sz> dividerPadding = setDividerPadding();
                    if (dividerPadding != null) {
                        dividerPadding.setOnFocusChangeListener(sz.setY);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @NotNull
    public abstract nh setX();

    public final void setX(@NotNull ns nsVar) {
        Intrinsics.checkNotNullParameter(nsVar, "");
        ng ngVar = ng.setY;
        if (setOnFocusChangeListener(this).get() == ngVar || ngVar == null) {
            synchronized (setOnFocusChangeListener(this)) {
                if (!this.f57323g.get()) {
                    mr mrVar = mr.setY;
                    Object[] objArr = new Object[1];
                    b((char) (32449 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), "裼쌂쇡╾", (-507313528) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "៹眽坜⣒\ue9e5昈靃嶠ᢣ蚣㍭뙾\ud814륓풵낾\ued50秴儋煊還呮䴝沱ࠖﶞ蒠", objArr);
                    mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, -225944049, 225944051, (int) System.currentTimeMillis());
                    return;
                }
                mr mrVar2 = mr.setCompoundDrawablePadding;
                Object[] objArr2 = new Object[1];
                a("\ue633汃\ue65b䉑㫝퍻晕塆従萙ⱏ阪闊츯\uea83ⷮ쬾㟧냴殩ŵ禅纹ꆋ", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
                mt.setX(new Object[]{mrVar2, ((String) objArr2[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
                this.f57325i.setX(nsVar);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @NotNull
    public final component24 setY() {
        int i10 = f57315o;
        int i11 = i10 + 3;
        f57314n = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 63;
        f57314n = i13 % 128;
        int i14 = i13 % 2;
        component24 component24Var = this.f57317a;
        if (i14 != 0) {
            int i15 = 50 / 0;
        }
        return component24Var;
    }

    @NotNull
    public final AtomicReference<ng> setCompoundDrawableTintBlendMode() {
        int i10 = f57315o;
        int i11 = i10 + 61;
        f57314n = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        AtomicReference<ng> atomicReference = this.f57322f;
        int i12 = i10 + 61;
        f57314n = i12 % 128;
        if (i12 % 2 == 0) {
            return atomicReference;
        }
        throw null;
    }
}
