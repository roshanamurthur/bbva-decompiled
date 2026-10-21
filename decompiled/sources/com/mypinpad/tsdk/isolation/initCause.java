package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u000bBK\u0012\u0006\u0010\u0003\u001a\u00020\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\nH\u0011¢\u0006\u0004\b\u0007\u0010\u0015J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b\u0007\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0017J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b\u000f\u0010\u0017"}, d2 = {"Lcom/mypinpad/tsdk/i/initCause;", "", "Lcom/mypinpad/tsdk/i/setFooterDividersEnabled;", "p0", "Lcom/mypinpad/tsdk/i/setLabelFor;", "p1", "", "setX", "(Lcom/mypinpad/tsdk/i/setFooterDividersEnabled;Lcom/mypinpad/tsdk/i/setLabelFor;)V", "", "", "setCompoundDrawableTintBlendMode", "(II)[B", "", "Lcom/mypinpad/tsdk/i/setDividerDrawable;", "setOnFocusChangeListener", "(FF)Lcom/mypinpad/tsdk/i/setDividerDrawable;", "setY", "()V", "Lcom/mypinpad/tsdk/i/setMeasureWithLargestChildEnabled;", "Lkotlin/Pair;", "(Lcom/mypinpad/tsdk/i/setMeasureWithLargestChildEnabled;[B)Lkotlin/Pair;", "Lcom/mypinpad/tsdk/i/setSecondaryProgressTintBlendMode$setCompoundDrawableTintBlendMode;", "()Lcom/mypinpad/tsdk/i/setSecondaryProgressTintBlendMode$setCompoundDrawableTintBlendMode;", "setDividerPadding", "Landroid/content/Context;", "Lcom/mypinpad/tsdk/i/getException;", "Lcom/mypinpad/tsdk/i/setPivotX;", "p2", "Lcom/mypinpad/tsdk/i/setTextSelectHandleLeft;", "p3", "Lcom/mypinpad/tsdk/i/setProgressBackgroundTintBlendMode;", "p4", "Lcom/mypinpad/tsdk/i/getScope;", "p5", "Lcom/mypinpad/tsdk/i/setColorFilter;", "p6", "Lcom/mypinpad/tsdk/i/getClientSecret;", "p7", "<init>", "(Landroid/content/Context;Lcom/mypinpad/tsdk/i/getException;Lcom/mypinpad/tsdk/i/setPivotX;Lcom/mypinpad/tsdk/i/setTextSelectHandleLeft;Lcom/mypinpad/tsdk/i/setProgressBackgroundTintBlendMode;Lcom/mypinpad/tsdk/i/getScope;Lcom/mypinpad/tsdk/i/setColorFilter;Lcom/mypinpad/tsdk/i/getClientSecret;)V"}, k = 1, mv = {1, 5, 1})
public class initCause {
    public static char[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static char f56480n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static char[] f56481o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f56482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f56483q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f56484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f56485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f56486t = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f56487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final getException f56488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final setPivotX f56489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final setTextSelectHandleLeft f56490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final getScope f56491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final setColorFilter f56492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final getClientSecret f56493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public setCompoundDrawableTintBlendMode f56494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public setFooterDividersEnabled f56495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public setHeaderDividersEnabled f56496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public setCollapseIcon[] f56497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public setIndeterminateTintMode f56498l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/initCause$setCompoundDrawableTintBlendMode;", "", "setX", "setY", "setCompoundDrawableTintBlendMode", "setOnFocusChangeListener", "setDividerPadding"}, k = 1, mv = {1, 5, 1})
    public static final class setCompoundDrawableTintBlendMode {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static final /* synthetic */ setCompoundDrawableTintBlendMode[] getNavBarTitleString;
        public static final setCompoundDrawableTintBlendMode setCompoundDrawableTintBlendMode;
        public static final setCompoundDrawableTintBlendMode setDividerPadding;
        private static long setNavigationOnClickListener;
        private static int setOnDragListener;
        public static final setCompoundDrawableTintBlendMode setOnFocusChangeListener;
        private static int setOnLongClickListener;
        public static final setCompoundDrawableTintBlendMode setX;
        public static final setCompoundDrawableTintBlendMode setY;

        static {
            c();
            $10 = 0;
            $11 = 1;
            setOnDragListener = 0;
            setOnLongClickListener = 1;
            d();
            Object[] objArr = new Object[1];
            a("ᒿ\uf08c\udcc8렣葢恔䶀⧬㔮ᄗ﵉\udabd꛰苗清", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 58417, objArr);
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode(((String) objArr[0]).intern(), 0);
            setX = setcompounddrawabletintblendmode;
            Object[] objArr2 = new Object[1];
            a("ᒦ틠頤䙸ජ쯫넥罡⚴\uece3ꨡ", 50753 - TextUtils.indexOf("", "", 0), objArr2);
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = new setCompoundDrawableTintBlendMode(((String) objArr2[0]).intern(), 1);
            setY = setcompounddrawabletintblendmode2;
            Object[] objArr3 = new Object[1];
            a("ᒫ庠肔쫯㳕", 18972 - MotionEvent.axisFromString(""), objArr3);
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = new setCompoundDrawableTintBlendMode(((String) objArr3[0]).intern(), 2);
            setCompoundDrawableTintBlendMode = setcompounddrawabletintblendmode3;
            Object[] objArr4 = new Object[1];
            a("ᒿ栅\uede7慙\ue620箁ｭ糎\uf1a2甆쫴侪", 31907 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr4);
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode4 = new setCompoundDrawableTintBlendMode(((String) objArr4[0]).intern(), 3);
            setOnFocusChangeListener = setcompounddrawabletintblendmode4;
            Object[] objArr5 = new Object[1];
            a("ᒬ걮攺㻛\uf79e袪", 47308 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr5);
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode5 = new setCompoundDrawableTintBlendMode(((String) objArr5[0]).intern(), 4);
            setDividerPadding = setcompounddrawabletintblendmode5;
            int i10 = setOnLongClickListener;
            int i11 = i10 + 125;
            setOnDragListener = i11 % 128;
            int i12 = i11 % 2;
            setCompoundDrawableTintBlendMode[] setcompounddrawabletintblendmodeArr = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode2, setcompounddrawabletintblendmode3, setcompounddrawabletintblendmode4, setcompounddrawabletintblendmode5};
            int i13 = i10 + 17;
            int i14 = i13 % 128;
            setOnDragListener = i14;
            if (i13 % 2 != 0) {
                throw null;
            }
            getNavBarTitleString = setcompounddrawabletintblendmodeArr;
            int i15 = i14 + 19;
            setOnLongClickListener = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 80 / 0;
            }
        }

        public setCompoundDrawableTintBlendMode() {
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:50:0x0257  */
        /* JADX WARN: Code duplicated, block: B:51:0x0258  */
        public static void a(String str, int i10, Object[] objArr) throws Throwable {
            Throwable cause;
            int i11 = $10 + 89;
            $11 = i11 % 128;
            int i12 = 2;
            if (i11 % 2 == 0) {
                int i13 = 93 / 0;
            }
            char[] charArray = str.toCharArray();
            setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
            setlayoutanimation.setOnFocusChangeListener = i10;
            int length = charArray.length;
            long[] jArr = new long[length];
            setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
            while (true) {
                int i14 = setlayoutanimation.setCompoundDrawableTintBlendMode;
                if (i14 >= charArray.length) {
                    break;
                }
                int i15 = $11 + 43;
                $10 = i15 % 128;
                if (i15 % i12 != 0) {
                    char c10 = charArray[i14];
                    try {
                        Object[] objArr2 = new Object[3];
                        objArr2[i12] = setlayoutanimation;
                        objArr2[1] = setlayoutanimation;
                        objArr2[0] = Integer.valueOf(c10);
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(-764403778);
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 33 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1195);
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            Object[] objArr3 = new Object[1];
                            b(b10, b11, b11, objArr3);
                            method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                            map.put(-764403778, method);
                        }
                        jArr[i14] = (setNavigationOnClickListener - 1779209353347916695L) + ((Long) ((Method) method).invoke(null, objArr2)).longValue();
                        Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                        Object method2 = map.get(645183118);
                        if (method2 == null) {
                            Class cls2 = (Class) setTextScaleX.setX((char) ((-1) - Process.getGidForName("")), 44 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 728);
                            byte b12 = (byte) 1;
                            byte b13 = (byte) (b12 - 1);
                            Object[] objArr5 = new Object[1];
                            b(b12, b13, b13, objArr5);
                            method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                            map.put(645183118, method2);
                        }
                        ((Method) method2).invoke(null, objArr4);
                    } catch (Throwable th2) {
                        cause = th2.getCause();
                        if (cause != null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr6 = {Integer.valueOf(charArray[i14]), setlayoutanimation, setlayoutanimation};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method3 = map2.get(-764403778);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), Color.alpha(0) + 33, 1194 - TextUtils.indexOf((CharSequence) "", '0', 0));
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr7 = new Object[1];
                        b(b14, b15, b15, objArr7);
                        method3 = cls3.getMethod((String) objArr7[0], Integer.TYPE, Object.class, Object.class);
                        map2.put(-764403778, method3);
                    }
                    jArr[i14] = ((Long) ((Method) method3).invoke(null, objArr6)).longValue() ^ (setNavigationOnClickListener ^ 1779209353347916695L);
                    Object[] objArr8 = {setlayoutanimation, setlayoutanimation};
                    Object method4 = map2.get(645183118);
                    if (method4 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", ""), 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 728 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        byte b16 = (byte) 1;
                        byte b17 = (byte) (b16 - 1);
                        Object[] objArr9 = new Object[1];
                        b(b16, b17, b17, objArr9);
                        method4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                        map2.put(645183118, method4);
                    }
                    ((Method) method4).invoke(null, objArr8);
                }
                i12 = 2;
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
                    objArr[0] = new String(cArr);
                    return;
                }
                cArr[i16] = (char) jArr[i16];
                Object[] objArr10 = {setlayoutanimation, setlayoutanimation};
                Map map3 = setTextScaleX.setMaxEms;
                Object method5 = map3.get(645183118);
                if (method5 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getTapTimeout() >> 16) + 44, 727 - TextUtils.indexOf((CharSequence) "", '0', 0));
                    byte b18 = (byte) 1;
                    byte b19 = (byte) (b18 - 1);
                    Object[] objArr11 = new Object[1];
                    b(b18, b19, b19, objArr11);
                    method5 = cls5.getMethod((String) objArr11[0], Object.class, Object.class);
                    map3.put(645183118, method5);
                }
                ((Method) method5).invoke(null, objArr10);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0036). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(int r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 3
                int r6 = 110 - r6
                int r7 = r7 * 2
                int r0 = 1 - r7
                byte[] r1 = com.mypinpad.tsdk.i.initCause.setCompoundDrawableTintBlendMode.$$a
                int r8 = r8 * 3
                int r8 = 3 - r8
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L1b
                r3 = r1
                r4 = r2
                r1 = r0
                r0 = r9
                r9 = r8
                goto L36
            L1b:
                r3 = r2
            L1c:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L29:
                int r3 = r3 + 1
                int r8 = r8 + 1
                r4 = r1[r8]
                r5 = r9
                r9 = r8
                r8 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r5
            L36:
                int r8 = -r8
                int r6 = r6 + r8
                r8 = r9
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.initCause.setCompoundDrawableTintBlendMode.b(int, short, short, java.lang.Object[]):void");
        }

        public static void c() {
            $$a = new byte[]{82, -15, 113, 17};
            $$b = 86;
        }

        public static void d() {
            setNavigationOnClickListener = 6251291428834637688L;
        }

        public static setCompoundDrawableTintBlendMode valueOf(String str) {
            int i10 = setOnLongClickListener + 21;
            setOnDragListener = i10 % 128;
            int i11 = i10 % 2;
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) Enum.valueOf(setCompoundDrawableTintBlendMode.class, str);
            int i12 = setOnLongClickListener + 15;
            setOnDragListener = i12 % 128;
            if (i12 % 2 == 0) {
                return setcompounddrawabletintblendmode;
            }
            throw null;
        }

        public static setCompoundDrawableTintBlendMode[] values() {
            int i10 = setOnLongClickListener + 49;
            setOnDragListener = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            setCompoundDrawableTintBlendMode[] setcompounddrawabletintblendmodeArr = (setCompoundDrawableTintBlendMode[]) getNavBarTitleString.clone();
            int i11 = setOnLongClickListener + 61;
            setOnDragListener = i11 % 128;
            int i12 = i11 % 2;
            return setcompounddrawabletintblendmodeArr;
        }
    }

    public /* synthetic */ class setX {
        public static final /* synthetic */ int[] setOnFocusChangeListener;

        static {
            int[] iArr = new int[setCollapseIcon.setY.values().length];
            iArr[setCollapseIcon.setY.setCompoundDrawableTintBlendMode.ordinal()] = 1;
            iArr[setCollapseIcon.setY.setOnFocusChangeListener.ordinal()] = 2;
            iArr[setCollapseIcon.setY.setX.ordinal()] = 3;
            iArr[setCollapseIcon.setY.setY.ordinal()] = 4;
            setOnFocusChangeListener = iArr;
            int i10 = (47 << 1) - (47 & (~0));
            int i11 = i10 % 128;
            if (i10 % 2 == 0) {
                int i12 = 16 / 0;
            }
        }
    }

    static {
        c();
        f56484r = 0;
        f56485s = 1;
        f56482p = 0;
        f56483q = 1;
        d();
        INSTANCE = new Companion(null);
        int i10 = f56482p + 71;
        f56483q = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 12 / 0;
        }
    }

    public initCause(@NotNull Context context, @NotNull getException getexception, @NotNull setPivotX setpivotx, @NotNull setTextSelectHandleLeft settextselecthandleleft, @NotNull setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode, @NotNull getScope getscope, @NotNull setColorFilter setcolorfilter, @Nullable getClientSecret getclientsecret) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(getexception, "");
        Intrinsics.checkNotNullParameter(setpivotx, "");
        Intrinsics.checkNotNullParameter(settextselecthandleleft, "");
        Intrinsics.checkNotNullParameter(setprogressbackgroundtintblendmode, "");
        Intrinsics.checkNotNullParameter(getscope, "");
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        this.f56487a = context;
        this.f56488b = getexception;
        this.f56489c = setpivotx;
        this.f56490d = settextselecthandleleft;
        this.f56491e = getscope;
        this.f56492f = setcolorfilter;
        this.f56493g = getclientsecret;
        this.f56494h = setCompoundDrawableTintBlendMode.setX;
    }

    public static void a(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        char[] charArray;
        int i11;
        char c10;
        int i12 = f56485s + 85;
        f56484r = i12 % 128;
        int i13 = 2;
        int i14 = 0;
        if (i12 % 2 != 0) {
            charArray = str.toCharArray();
            int i15 = 86 / 0;
        } else {
            charArray = str.toCharArray();
        }
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = m;
        int i16 = 290255894;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i17 = 0;
            while (i17 < length) {
                int i18 = f56484r + 65;
                f56485s = i18 % 128;
                if (i18 % i13 == 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i14] = Integer.valueOf(cArr[i17]);
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(Integer.valueOf(i16));
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTapTimeout() >> 16), 45 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1116 - ((Process.getThreadPriority(i14) + 20) >> 6));
                            byte b11 = (byte) i14;
                            byte b12 = (byte) (b11 - 1);
                            Object[] objArr3 = new Object[1];
                            b(b12, (byte) (b12 & 7), b11, objArr3);
                            method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                            map.put(290255894, method);
                        }
                        cArr2[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr[i17])};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method2 = map2.get(290255894);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", "", 0), 45 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1116 - KeyEvent.normalizeMetaState(0));
                        byte b13 = (byte) 0;
                        byte b14 = (byte) (b13 - 1);
                        Object[] objArr5 = new Object[1];
                        b(b14, (byte) (b14 & 7), b13, objArr5);
                        method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                        map2.put(290255894, method2);
                    }
                    cArr2[i17] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i17++;
                }
                i13 = 2;
                i14 = 0;
                i16 = 290255894;
            }
            cArr = cArr2;
        }
        Object[] objArr6 = {Integer.valueOf(f56480n)};
        Map map3 = setTextScaleX.setMaxEms;
        Object method3 = map3.get(290255894);
        char c11 = '\b';
        if (method3 == null) {
            Class cls3 = (Class) setTextScaleX.setX((char) Color.blue(0), 45 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getTouchSlop() >> 8) + 1116);
            byte b15 = (byte) 0;
            byte b16 = (byte) (b15 - 1);
            Object[] objArr7 = new Object[1];
            b(b16, (byte) (b16 & 7), b15, objArr7);
            method3 = cls3.getMethod((String) objArr7[0], Integer.TYPE);
            map3.put(290255894, method3);
        }
        char cCharValue = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            int i19 = f56484r + 123;
            f56485s = i19 % 128;
            int i20 = i19 % 2;
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i21 = setincludefontpadding.setDividerPadding;
                if (i21 >= i11) {
                    break;
                }
                int i22 = f56484r + 111;
                f56485s = i22 % 128;
                int i23 = i22 % 2;
                char c12 = charArray[i21];
                setincludefontpadding.setY = c12;
                int i24 = i21 + 1;
                char c13 = charArray[i24];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c13;
                if (c12 == c13) {
                    cArr3[i21] = (char) (c12 - b10);
                    cArr3[i24] = (char) (c13 - b10);
                    c10 = c11;
                } else {
                    Object[] objArr8 = new Object[13];
                    objArr8[12] = setincludefontpadding;
                    objArr8[11] = Integer.valueOf(cCharValue);
                    objArr8[10] = setincludefontpadding;
                    objArr8[9] = setincludefontpadding;
                    objArr8[c11] = Integer.valueOf(cCharValue);
                    objArr8[7] = setincludefontpadding;
                    objArr8[6] = setincludefontpadding;
                    objArr8[5] = Integer.valueOf(cCharValue);
                    objArr8[4] = setincludefontpadding;
                    objArr8[3] = setincludefontpadding;
                    objArr8[2] = Integer.valueOf(cCharValue);
                    objArr8[1] = setincludefontpadding;
                    objArr8[0] = setincludefontpadding;
                    Map map4 = setTextScaleX.setMaxEms;
                    Object method4 = map4.get(180437302);
                    if (method4 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) (Process.myTid() >> 22), 27 - TextUtils.getTrimmedLength(""), 2310 - MotionEvent.axisFromString(""));
                        byte b17 = (byte) 0;
                        Object[] objArr9 = new Object[1];
                        b((byte) (b17 - 1), (byte) f56486t.length, b17, objArr9);
                        String str2 = (String) objArr9[0];
                        Class<?> cls5 = Integer.TYPE;
                        method4 = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                        map4.put(180437302, method4);
                    }
                    int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                    int i25 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i25) {
                        int i26 = f56485s + 81;
                        f56484r = i26 % 128;
                        int i27 = i26 % 2;
                        Object[] objArr10 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method5 = map4.get(1989802713);
                        if (method5 != null) {
                            c10 = '\b';
                        } else {
                            Class cls6 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getTouchSlop() >> 8) + 49103), View.resolveSize(0, 0) + 35, 2545 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                            byte b18 = (byte) 0;
                            byte b19 = (byte) (b18 - 1);
                            Object[] objArr11 = new Object[1];
                            b(b19, (byte) (b19 + 1), b18, objArr11);
                            String str3 = (String) objArr11[0];
                            Class<?> cls7 = Integer.TYPE;
                            c10 = '\b';
                            method5 = cls6.getMethod(str3, Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                            map4.put(1989802713, method5);
                        }
                        int iIntValue2 = ((Integer) ((Method) method5).invoke(null, objArr10)).intValue();
                        int i28 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i29 = setincludefontpadding.setDividerPadding;
                        cArr3[i29] = cArr[iIntValue2];
                        cArr3[i29 + 1] = cArr[i28];
                    } else {
                        c10 = '\b';
                        int i30 = setincludefontpadding.setX;
                        int i31 = setincludefontpadding.setOnFocusChangeListener;
                        if (i30 == i31) {
                            int i32 = f56485s + 59;
                            f56484r = i32 % 128;
                            int i33 = i32 % 2;
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i25, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i34 = (i31 * cCharValue) + iA2;
                            int i35 = setincludefontpadding.setDividerPadding;
                            cArr3[i35] = cArr[(i30 * cCharValue) + iA];
                            cArr3[i35 + 1] = cArr[i34];
                        } else {
                            int i36 = (i30 * cCharValue) + i25;
                            int i37 = (i31 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i38 = setincludefontpadding.setDividerPadding;
                            cArr3[i38] = cArr[i36];
                            cArr3[i38 + 1] = cArr[i37];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
                c11 = c10;
            }
        }
        int i39 = f56485s + 75;
        f56484r = i39 % 128;
        int i40 = i39 % 2;
        for (int i41 = 0; i41 < i10; i41++) {
            cArr3[i41] = (char) (cArr3[i41] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    public static void b(byte b10, int i10, short s4, Object[] objArr) {
        int i11 = b10 + 4;
        int i12 = 106 - i10;
        int i13 = s4 * 3;
        byte[] bArr = new byte[i13 + 1];
        byte[] bArr2 = f56486t;
        int i14 = -1;
        if (bArr2 == null) {
            int i15 = (-i11) + i13;
            i13 = i13;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i14 = -1;
            i12 = i15;
            i11 = i11;
        }
        while (true) {
            int i16 = i14 + 1;
            bArr[i16] = (byte) i12;
            int i17 = i11 + 1;
            if (i16 == i13) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            byte b11 = bArr2[i17];
            i13 = i13;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i14 = i16;
            i12 = (-b11) + i12;
            i11 = i17;
        }
    }

    public static void c() {
        f56486t = new byte[]{16, -115, -100, 77};
    }

    public static void d() {
        f56480n = (char) 53956;
        m = new char[]{53952, 53955, 53954, 59198, 59253, 59193, 59233, 59255, 59166, 59190, 59147, 59177, 59155, 59191, 59186, 59165, 59259, 59182, 59152, 59178, 59188, 59183, 59199, 59194, 59189};
        f56481o = new char[]{59013, 59064, 59095, 59101, 59103, 59053, 59095, 59121, 59129, 59111, 59105, 59104, 59135, 59133, 59084};
    }

    public static final /* synthetic */ setPivotX setX(initCause initcause) {
        int i10 = f56482p + 115;
        f56483q = i10 % 128;
        int i11 = i10 % 2;
        setPivotX setpivotx = initcause.f56489c;
        if (i11 != 0) {
            return setpivotx;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:214:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:216:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:220:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:221:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:222:0x05df  */
    /* JADX WARN: Code duplicated, block: B:223:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:224:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:225:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:226:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:227:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:228:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:229:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:230:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:231:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:232:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:233:0x0600  */
    /* JADX WARN: Code duplicated, block: B:234:0x0603  */
    /* JADX WARN: Code duplicated, block: B:235:0x0606  */
    /* JADX WARN: Code duplicated, block: B:240:0x061c  */
    /* JADX WARN: Code duplicated, block: B:241:0x061f  */
    /* JADX WARN: Code duplicated, block: B:242:0x0622  */
    /* JADX WARN: Code duplicated, block: B:243:0x0625  */
    /* JADX WARN: Code duplicated, block: B:244:0x0628  */
    /* JADX WARN: Code duplicated, block: B:245:0x062b  */
    /* JADX WARN: Code duplicated, block: B:246:0x062e  */
    /* JADX WARN: Code duplicated, block: B:247:0x0631  */
    /* JADX WARN: Code duplicated, block: B:248:0x0634  */
    /* JADX WARN: Code duplicated, block: B:249:0x0637  */
    /* JADX WARN: Code duplicated, block: B:250:0x063a  */
    /* JADX WARN: Code duplicated, block: B:251:0x063d  */
    /* JADX WARN: Code duplicated, block: B:252:0x0640  */
    /* JADX WARN: Code duplicated, block: B:253:0x0643  */
    /* JADX WARN: Code duplicated, block: B:254:0x0646  */
    /* JADX WARN: Code duplicated, block: B:255:0x0649  */
    /* JADX WARN: Code duplicated, block: B:295:0x05cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x0612 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
    public final byte[] e(byte[] bArr) throws Throwable {
        byte[] bArr2;
        int i10;
        StringBuilder sb2;
        int i11;
        int[] iArr;
        byte[] bArr3;
        int i12;
        char[] cArr;
        int i13;
        int i14;
        byte b10;
        char c10;
        byte b11;
        char c11;
        byte b12;
        int i15;
        String str = "";
        String strReplace = setNetworkAvailable.setY().replace(this.f56491e.getNavBarTitleString(), "");
        byte b13 = 2;
        if (strReplace.length() % 2 != 0) {
            Object[] objArr = new Object[1];
            a(View.resolveSizeAndState(0, 0, 0) + 19, "\u0012\u0014\n\u000e\u0002\u0017\u0015\u0010\u0004\u0012\u0013\f\r\u0001\b\u0004\u0014\u0016㗠", (byte) (44 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr);
            throw new IllegalArgumentException(((String) objArr[0]).intern().toString());
        }
        int length = strReplace.length() / 2;
        byte[] bArr4 = new byte[length];
        int i16 = 0;
        while (i16 < strReplace.length()) {
            int i17 = i16 / 2;
            Pair pair = TuplesKt.to(Character.valueOf(strReplace.charAt(i16)), Character.valueOf(strReplace.charAt(i16 + 1)));
            char cCharValue = ((Character) pair.getFirst()).charValue();
            if (cCharValue == '0') {
                b12 = 0;
            } else if (cCharValue == '1') {
                b12 = 1;
            } else if (cCharValue == '2') {
                b12 = b13;
            } else if (cCharValue == '3') {
                b12 = 3;
            } else if (cCharValue == '4') {
                int i18 = f56483q + 51;
                f56482p = i18 % 128;
                b12 = i18 % b13 != 0 ? (byte) 5 : (byte) 4;
            } else if (cCharValue == '5') {
                int i19 = f56482p + 9;
                f56483q = i19 % 128;
                int i20 = i19 % b13;
            } else if (cCharValue == '6') {
                b12 = 6;
            } else if (cCharValue == '7') {
                int i21 = f56483q + 119;
                f56482p = i21 % 128;
                int i22 = i21 % b13;
                b12 = 7;
            } else if (cCharValue == '8') {
                b12 = 8;
            } else if (cCharValue == '9') {
                b12 = 9;
            } else if (cCharValue == 'a' || cCharValue == 'A') {
                b12 = 10;
            } else if (cCharValue == 'b' || cCharValue == 'B') {
                b12 = 11;
            } else if (cCharValue == 'c' || cCharValue == 'C') {
                b12 = 12;
            } else if (cCharValue == 'd') {
                b12 = 13;
            } else if (cCharValue == 'D') {
                int i23 = f56482p + 61;
                f56483q = i23 % 128;
                int i24 = i23 % b13;
                b12 = 13;
            } else if (cCharValue == 'e') {
                b12 = Constants.CVR_B1b41_1110_ONLINE_PIN;
            } else if (cCharValue == 'E') {
                int i25 = f56482p + 27;
                f56483q = i25 % 128;
                if (i25 % b13 == 0) {
                    b12 = 113;
                } else {
                    b12 = Constants.CVR_B1b41_1110_ONLINE_PIN;
                }
            } else {
                if (cCharValue == 'f') {
                    int i26 = f56483q + 19;
                    f56482p = i26 % 128;
                    if (i26 % b13 != 0) {
                        b12 = Constants.CVR_B1b85_0110_TERMINAL;
                    }
                } else if (cCharValue != 'F') {
                    throw new IllegalArgumentException(String.valueOf(cCharValue));
                }
                b12 = 15;
            }
            int iM5570constructorimpl = UInt.m5570constructorimpl(UInt.m5570constructorimpl(UByte.m5545constructorimpl((byte) 16) & 255) * UInt.m5570constructorimpl(UByte.m5545constructorimpl(b12) & 255));
            char cCharValue2 = ((Character) pair.getSecond()).charValue();
            if (cCharValue2 == '0') {
                i15 = 0;
            } else if (cCharValue2 == '1') {
                i15 = 1;
            } else if (cCharValue2 == '2') {
                i15 = 2;
            } else if (cCharValue2 == '3') {
                i15 = 3;
            } else if (cCharValue2 == '4') {
                i15 = 4;
            } else if (cCharValue2 == '5') {
                i15 = 5;
            } else if (cCharValue2 == '6') {
                i15 = 6;
            } else if (cCharValue2 == '7') {
                int i27 = f56483q + 53;
                f56482p = i27 % 128;
                int i28 = i27 % 2;
                i15 = 7;
            } else if (cCharValue2 == '8') {
                i15 = 8;
            } else if (cCharValue2 == '9') {
                i15 = 9;
            } else {
                if (cCharValue2 == 'a') {
                    int i29 = f56483q + 1;
                    f56482p = i29 % 128;
                    int i30 = i29 % 2;
                } else if (cCharValue2 != 'A') {
                    if (cCharValue2 == 'b' || cCharValue2 == 'B') {
                        i15 = 11;
                    } else if (cCharValue2 == 'c' || cCharValue2 == 'C') {
                        i15 = 12;
                    } else {
                        if (cCharValue2 == 'd') {
                            int i31 = f56483q + 47;
                            f56482p = i31 % 128;
                            int i32 = i31 % 2;
                        } else if (cCharValue2 != 'D') {
                            if (cCharValue2 == 'e' || cCharValue2 == 'E') {
                                i15 = 14;
                            } else {
                                if (cCharValue2 != 'f' && cCharValue2 != 'F') {
                                    throw new IllegalArgumentException(String.valueOf(cCharValue2));
                                }
                                i15 = 15;
                            }
                        }
                        i15 = 13;
                    }
                }
                i15 = 10;
            }
            bArr4[i17] = (byte) UInt.m5570constructorimpl(UInt.m5570constructorimpl(i15) + iM5570constructorimpl);
            i16 += 2;
            b13 = 2;
        }
        ahx ahxVar = (ahx) ahx.setCompoundDrawableTintBlendMode(new Object[]{bArr4}, 1906174166, -1906174164, (int) System.currentTimeMillis());
        anw anwVar = new anw((BigInteger) ahx.setCompoundDrawableTintBlendMode(new Object[]{ahxVar}, 397751114, -397751113, System.identityHashCode(ahxVar)), (BigInteger) ahx.setCompoundDrawableTintBlendMode(new Object[]{ahxVar}, 389614071, -389614068, System.identityHashCode(ahxVar)));
        alz alzVar = new alz(new amf(), (aky) any.setX(new Object[0], -2105153225, 2105153234, (int) System.currentTimeMillis()));
        alzVar.setX(true, anwVar);
        byte[] onFocusChangeListener = alzVar.setOnFocusChangeListener(bArr, 0, bArr.length);
        StringBuilder sb3 = new StringBuilder();
        int[] iArr2 = {0, 15, 0, 0};
        byte[] bytes = "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001".getBytes("ISO-8859-1");
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
        int i33 = iArr2[0];
        int i34 = iArr2[1];
        int i35 = iArr2[2];
        int i36 = iArr2[3];
        char[] cArr2 = f56481o;
        if (cArr2 != null) {
            int length2 = cArr2.length;
            char[] cArr3 = new char[length2];
            int i37 = 0;
            while (i37 < length2) {
                char[] cArr4 = cArr2;
                int i38 = length2;
                try {
                    byte[] bArr5 = bArr4;
                    Object[] objArr2 = {Integer.valueOf(cArr2[i37])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-637734149);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 38 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + TypedValues.MotionType.TYPE_POLAR_RELATIVETO);
                        byte b14 = (byte) 0;
                        byte b15 = (byte) (b14 - 1);
                        Object[] objArr3 = new Object[1];
                        b(b15, (byte) (b15 & 8), b14, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(-637734149, method);
                    }
                    cArr3[i37] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i37++;
                    bArr4 = bArr5;
                    cArr2 = cArr4;
                    length2 = i38;
                    length = length;
                    sb3 = sb3;
                    onFocusChangeListener = onFocusChangeListener;
                    iArr2 = iArr2;
                    i36 = i36;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            bArr2 = onFocusChangeListener;
            i10 = length;
            sb2 = sb3;
            i11 = i36;
            iArr = iArr2;
            bArr3 = bArr4;
            cArr2 = cArr3;
        } else {
            bArr2 = onFocusChangeListener;
            i10 = length;
            sb2 = sb3;
            i11 = i36;
            iArr = iArr2;
            bArr3 = bArr4;
        }
        char[] cArr5 = new char[i34];
        System.arraycopy(cArr2, i33, cArr5, 0, i34);
        if (bytes != null) {
            char[] cArr6 = new char[i34];
            setnavigationonclicklistener.setX = 0;
            char c12 = 0;
            while (true) {
                int i39 = setnavigationonclicklistener.setX;
                if (i39 >= i34) {
                    break;
                }
                if (bytes[i39] == 1) {
                    Object[] objArr4 = {Integer.valueOf(cArr5[i39]), Integer.valueOf(c12)};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method2 = map2.get(1737824323);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (TextUtils.indexOf((CharSequence) "", '0') + 4450), KeyEvent.normalizeMetaState(0) + 42, 1021 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        byte b16 = (byte) 0;
                        byte b17 = (byte) (b16 - 1);
                        Object[] objArr5 = new Object[1];
                        b(b17, (byte) (b17 & 5), b16, objArr5);
                        String str2 = (String) objArr5[0];
                        Class<?> cls3 = Integer.TYPE;
                        method2 = cls2.getMethod(str2, cls3, cls3);
                        map2.put(1737824323, method2);
                    }
                    cArr6[i39] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    Object[] objArr6 = {Integer.valueOf(cArr5[i39]), Integer.valueOf(c12)};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(-504758789);
                    if (method3 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 44 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.lastIndexOf("", '0', 0, 0) + 2628);
                        byte b18 = (byte) 0;
                        byte b19 = (byte) (b18 - 1);
                        Object[] objArr7 = new Object[1];
                        b(b19, (byte) (b19 & 9), b18, objArr7);
                        String str3 = (String) objArr7[0];
                        Class<?> cls5 = Integer.TYPE;
                        method3 = cls4.getMethod(str3, cls5, cls5);
                        map3.put(-504758789, method3);
                    }
                    cArr6[i39] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                }
                c12 = cArr6[setnavigationonclicklistener.setX];
                Object[] objArr8 = {setnavigationonclicklistener, setnavigationonclicklistener};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(-265085633);
                if (method4 == null) {
                    Class cls6 = (Class) setTextScaleX.setX((char) (31346 - MotionEvent.axisFromString("")), ExpandableListView.getPackedPositionType(0L) + 48, 839 - TextUtils.indexOf((CharSequence) "", '0'));
                    byte b20 = (byte) 0;
                    byte b21 = (byte) (b20 - 1);
                    Object[] objArr9 = new Object[1];
                    b(b21, (byte) (b21 & 6), b20, objArr9);
                    method4 = cls6.getMethod((String) objArr9[0], Object.class, Object.class);
                    map4.put(-265085633, method4);
                }
                ((Method) method4).invoke(null, objArr8);
            }
            cArr5 = cArr6;
        }
        if (i11 > 0) {
            char[] cArr7 = new char[i34];
            i12 = 0;
            System.arraycopy(cArr5, 0, cArr7, 0, i34);
            int i40 = i34 - i11;
            int i41 = i11;
            System.arraycopy(cArr7, 0, cArr5, i40, i41);
            System.arraycopy(cArr7, i41, cArr5, 0, i40);
        } else {
            i12 = 0;
        }
        char[] cArr8 = new char[i34];
        setnavigationonclicklistener.setX = i12;
        while (true) {
            int i42 = setnavigationonclicklistener.setX;
            if (i42 >= i34) {
                break;
            }
            int i43 = f56484r;
            int i44 = i43 + 85;
            f56485s = i44 % 128;
            int i45 = i44 % 2;
            cArr8[i42] = cArr5[(i34 - i42) - 1];
            setnavigationonclicklistener.setX = i42 + 1;
            int i46 = i43 + 3;
            f56485s = i46 % 128;
            int i47 = i46 % 2;
        }
        if (i35 > 0) {
            int i48 = 0;
            while (true) {
                setnavigationonclicklistener.setX = i48;
                i48 = setnavigationonclicklistener.setX;
                if (i48 >= i34) {
                    break;
                }
                int i49 = f56485s + 111;
                f56484r = i49 % 128;
                if (i49 % 2 != 0) {
                    cArr8[i48] = (char) (cArr8[i48] - iArr[3]);
                } else {
                    cArr8[i48] = (char) (cArr8[i48] - iArr[2]);
                    i48++;
                }
            }
        }
        String str4 = new String(cArr8);
        int i50 = f56485s + 91;
        f56484r = i50 % 128;
        int i51 = i50 % 2;
        StringBuilder sb4 = sb2;
        sb4.append(str4.intern());
        byte[] bArr6 = bArr2;
        Intrinsics.checkNotNullExpressionValue(bArr6, "");
        sb4.append(setScrollIndicators.setX(bArr6));
        Object[] objArr10 = new Object[1];
        a(9 - (ViewConfiguration.getPressedStateDuration() >> 16), "\u0006\u0011\r\u0005\u000f\r\u0010\b㘧", (byte) ((-16777107) - Color.rgb(0, 0, 0)), objArr10);
        sb4.append(((String) objArr10[0]).intern());
        if (i10 == 0) {
            int i52 = f56482p + 71;
            f56483q = i52 % 128;
            if (i52 % 2 == 0) {
                cArr = new char[i10 << 1];
                i13 = i10;
                for (i14 = 0; i14 < i13; i14++) {
                    byte b22 = bArr3[i14];
                    int i53 = i14 << 1;
                    b10 = (byte) ((b22 >>> 4) & 15);
                    switch (b10) {
                        case 0:
                            c10 = '0';
                            break;
                        case 1:
                            c10 = '1';
                            break;
                        case 2:
                            c10 = '2';
                            break;
                        case 3:
                            c10 = '3';
                            break;
                        case 4:
                            c10 = '4';
                            break;
                        case 5:
                            c10 = '5';
                            break;
                        case 6:
                            c10 = '6';
                            break;
                        case 7:
                            c10 = '7';
                            break;
                        case 8:
                            c10 = '8';
                            break;
                        case 9:
                            c10 = '9';
                            break;
                        case 10:
                            c10 = 'a';
                            break;
                        case 11:
                            c10 = 'b';
                            break;
                        case 12:
                            c10 = 'c';
                            break;
                        case 13:
                            c10 = 'd';
                            break;
                        case 14:
                            c10 = 'e';
                            break;
                        case 15:
                            c10 = 'f';
                            break;
                        default:
                            throw new IllegalArgumentException(String.valueOf((int) b10));
                    }
                    cArr[i53] = c10;
                    int i54 = i53 + 1;
                    b11 = (byte) (b22 & 15);
                    switch (b11) {
                        case 0:
                            c11 = '0';
                            break;
                        case 1:
                            c11 = '1';
                            break;
                        case 2:
                            c11 = '2';
                            break;
                        case 3:
                            c11 = '3';
                            break;
                        case 4:
                            c11 = '4';
                            break;
                        case 5:
                            c11 = '5';
                            break;
                        case 6:
                            c11 = '6';
                            break;
                        case 7:
                            c11 = '7';
                            break;
                        case 8:
                            c11 = '8';
                            break;
                        case 9:
                            c11 = '9';
                            break;
                        case 10:
                            c11 = 'a';
                            break;
                        case 11:
                            c11 = 'b';
                            break;
                        case 12:
                            c11 = 'c';
                            break;
                        case 13:
                            c11 = 'd';
                            break;
                        case 14:
                            c11 = 'e';
                            break;
                        case 15:
                            c11 = 'f';
                            break;
                        default:
                            throw new IllegalArgumentException(String.valueOf((int) b11));
                    }
                    cArr[i54] = c11;
                }
                str = new String(cArr);
            }
        } else {
            cArr = new char[i10 << 1];
            i13 = i10;
            while (i14 < i13) {
                byte b23 = bArr3[i14];
                int i55 = i14 << 1;
                b10 = (byte) ((b23 >>> 4) & 15);
                switch (b10) {
                    case 0:
                        c10 = '0';
                        break;
                    case 1:
                        c10 = '1';
                        break;
                    case 2:
                        c10 = '2';
                        break;
                    case 3:
                        c10 = '3';
                        break;
                    case 4:
                        c10 = '4';
                        break;
                    case 5:
                        c10 = '5';
                        break;
                    case 6:
                        c10 = '6';
                        break;
                    case 7:
                        c10 = '7';
                        break;
                    case 8:
                        c10 = '8';
                        break;
                    case 9:
                        c10 = '9';
                        break;
                    case 10:
                        c10 = 'a';
                        break;
                    case 11:
                        c10 = 'b';
                        break;
                    case 12:
                        c10 = 'c';
                        break;
                    case 13:
                        c10 = 'd';
                        break;
                    case 14:
                        c10 = 'e';
                        break;
                    case 15:
                        c10 = 'f';
                        break;
                    default:
                        throw new IllegalArgumentException(String.valueOf((int) b10));
                }
                cArr[i55] = c10;
                int i56 = i55 + 1;
                b11 = (byte) (b23 & 15);
                switch (b11) {
                    case 0:
                        c11 = '0';
                        break;
                    case 1:
                        c11 = '1';
                        break;
                    case 2:
                        c11 = '2';
                        break;
                    case 3:
                        c11 = '3';
                        break;
                    case 4:
                        c11 = '4';
                        break;
                    case 5:
                        c11 = '5';
                        break;
                    case 6:
                        c11 = '6';
                        break;
                    case 7:
                        c11 = '7';
                        break;
                    case 8:
                        c11 = '8';
                        break;
                    case 9:
                        c11 = '9';
                        break;
                    case 10:
                        c11 = 'a';
                        break;
                    case 11:
                        c11 = 'b';
                        break;
                    case 12:
                        c11 = 'c';
                        break;
                    case 13:
                        c11 = 'd';
                        break;
                    case 14:
                        c11 = 'e';
                        break;
                    case 15:
                        c11 = 'f';
                        break;
                    default:
                        throw new IllegalArgumentException(String.valueOf((int) b11));
                }
                cArr[i56] = c11;
            }
            str = new String(cArr);
        }
        sb4.append(str);
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{sb4.toString()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
        Random.Companion companion = Random.INSTANCE;
        companion.nextBytes(bArr);
        companion.nextBytes(bArr3);
        return bArr6;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:102:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:126:0x0229 A[Catch: all -> 0x0235, TryCatch #4 {all -> 0x0235, blocks: (B:40:0x0108, B:47:0x0137, B:124:0x0225, B:126:0x0229, B:129:0x0239, B:133:0x024f, B:134:0x0258, B:135:0x0259, B:137:0x0261, B:139:0x0268, B:141:0x0272, B:145:0x027f, B:146:0x0289, B:148:0x0295), top: B:210:0x0108, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0239 A[Catch: all -> 0x0235, TryCatch #4 {all -> 0x0235, blocks: (B:40:0x0108, B:47:0x0137, B:124:0x0225, B:126:0x0229, B:129:0x0239, B:133:0x024f, B:134:0x0258, B:135:0x0259, B:137:0x0261, B:139:0x0268, B:141:0x0272, B:145:0x027f, B:146:0x0289, B:148:0x0295), top: B:210:0x0108, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0245 A[LOOP:0: B:47:0x0137->B:132:0x0245, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:137:0x0261 A[Catch: all -> 0x0235, LOOP:1: B:137:0x0261->B:144:0x027d, LOOP_START, PHI: r6
      0x0261: PHI (r6v17 int) = (r6v9 int), (r6v22 int) binds: [B:136:0x025f, B:144:0x027d] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {all -> 0x0235, blocks: (B:40:0x0108, B:47:0x0137, B:124:0x0225, B:126:0x0229, B:129:0x0239, B:133:0x024f, B:134:0x0258, B:135:0x0259, B:137:0x0261, B:139:0x0268, B:141:0x0272, B:145:0x027f, B:146:0x0289, B:148:0x0295), top: B:210:0x0108, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0268 A[Catch: all -> 0x0235, TryCatch #4 {all -> 0x0235, blocks: (B:40:0x0108, B:47:0x0137, B:124:0x0225, B:126:0x0229, B:129:0x0239, B:133:0x024f, B:134:0x0258, B:135:0x0259, B:137:0x0261, B:139:0x0268, B:141:0x0272, B:145:0x027f, B:146:0x0289, B:148:0x0295), top: B:210:0x0108, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0272 A[Catch: all -> 0x0235, TryCatch #4 {all -> 0x0235, blocks: (B:40:0x0108, B:47:0x0137, B:124:0x0225, B:126:0x0229, B:129:0x0239, B:133:0x024f, B:134:0x0258, B:135:0x0259, B:137:0x0261, B:139:0x0268, B:141:0x0272, B:145:0x027f, B:146:0x0289, B:148:0x0295), top: B:210:0x0108, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x027d A[LOOP:1: B:137:0x0261->B:144:0x027d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x0367 A[LOOP:2: B:146:0x0289->B:175:0x0367, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x0378 A[Catch: all -> 0x003a, TryCatch #6 {all -> 0x003a, blocks: (B:3:0x000c, B:6:0x0035, B:9:0x003d, B:11:0x0043, B:187:0x03c4, B:13:0x0053, B:15:0x0057, B:16:0x005b, B:20:0x0070, B:24:0x007d, B:25:0x0082, B:26:0x0085, B:27:0x0086, B:29:0x008c, B:30:0x0093, B:31:0x0094, B:33:0x0098, B:34:0x009c, B:36:0x00dd, B:38:0x00e4, B:154:0x02c5, B:157:0x02e1, B:164:0x0357, B:165:0x035a, B:184:0x0374, B:185:0x0377, B:186:0x0378, B:194:0x03ce, B:195:0x03d1, B:181:0x0371, B:155:0x02c8, B:161:0x0354, B:35:0x00c4, B:39:0x0106, B:150:0x029b, B:153:0x02bd, B:173:0x0363, B:174:0x0366, B:179:0x036d, B:180:0x0370, B:191:0x03cb), top: B:213:0x000c, inners: #1, #2, #3, #5, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:221:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x027c A[EDGE_INSN: B:223:0x027c->B:143:0x027c BREAK  A[LOOP:1: B:137:0x0261->B:144:0x027d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0295 A[EDGE_INSN: B:224:0x0295->B:148:0x0295 BREAK  A[LOOP:2: B:146:0x0289->B:175:0x0367], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0094 A[Catch: all -> 0x003a, TryCatch #6 {all -> 0x003a, blocks: (B:3:0x000c, B:6:0x0035, B:9:0x003d, B:11:0x0043, B:187:0x03c4, B:13:0x0053, B:15:0x0057, B:16:0x005b, B:20:0x0070, B:24:0x007d, B:25:0x0082, B:26:0x0085, B:27:0x0086, B:29:0x008c, B:30:0x0093, B:31:0x0094, B:33:0x0098, B:34:0x009c, B:36:0x00dd, B:38:0x00e4, B:154:0x02c5, B:157:0x02e1, B:164:0x0357, B:165:0x035a, B:184:0x0374, B:185:0x0377, B:186:0x0378, B:194:0x03ce, B:195:0x03d1, B:181:0x0371, B:155:0x02c8, B:161:0x0354, B:35:0x00c4, B:39:0x0106, B:150:0x029b, B:153:0x02bd, B:173:0x0363, B:174:0x0366, B:179:0x036d, B:180:0x0370, B:191:0x03cb), top: B:213:0x000c, inners: #1, #2, #3, #5, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0098 A[Catch: all -> 0x003a, TryCatch #6 {all -> 0x003a, blocks: (B:3:0x000c, B:6:0x0035, B:9:0x003d, B:11:0x0043, B:187:0x03c4, B:13:0x0053, B:15:0x0057, B:16:0x005b, B:20:0x0070, B:24:0x007d, B:25:0x0082, B:26:0x0085, B:27:0x0086, B:29:0x008c, B:30:0x0093, B:31:0x0094, B:33:0x0098, B:34:0x009c, B:36:0x00dd, B:38:0x00e4, B:154:0x02c5, B:157:0x02e1, B:164:0x0357, B:165:0x035a, B:184:0x0374, B:185:0x0377, B:186:0x0378, B:194:0x03ce, B:195:0x03d1, B:181:0x0371, B:155:0x02c8, B:161:0x0354, B:35:0x00c4, B:39:0x0106, B:150:0x029b, B:153:0x02bd, B:173:0x0363, B:174:0x0366, B:179:0x036d, B:180:0x0370, B:191:0x03cb), top: B:213:0x000c, inners: #1, #2, #3, #5, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e4 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #6 {all -> 0x003a, blocks: (B:3:0x000c, B:6:0x0035, B:9:0x003d, B:11:0x0043, B:187:0x03c4, B:13:0x0053, B:15:0x0057, B:16:0x005b, B:20:0x0070, B:24:0x007d, B:25:0x0082, B:26:0x0085, B:27:0x0086, B:29:0x008c, B:30:0x0093, B:31:0x0094, B:33:0x0098, B:34:0x009c, B:36:0x00dd, B:38:0x00e4, B:154:0x02c5, B:157:0x02e1, B:164:0x0357, B:165:0x035a, B:184:0x0374, B:185:0x0377, B:186:0x0378, B:194:0x03ce, B:195:0x03d1, B:181:0x0371, B:155:0x02c8, B:161:0x0354, B:35:0x00c4, B:39:0x0106, B:150:0x029b, B:153:0x02bd, B:173:0x0363, B:174:0x0366, B:179:0x036d, B:180:0x0370, B:191:0x03cb), top: B:213:0x000c, inners: #1, #2, #3, #5, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x012e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0130  */
    /* JADX WARN: Code duplicated, block: B:46:0x0135  */
    /* JADX WARN: Code duplicated, block: B:50:0x0152  */
    /* JADX WARN: Code duplicated, block: B:51:0x015e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0162  */
    /* JADX WARN: Code duplicated, block: B:54:0x0165  */
    /* JADX WARN: Code duplicated, block: B:56:0x0169  */
    /* JADX WARN: Code duplicated, block: B:57:0x016c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0170  */
    /* JADX WARN: Code duplicated, block: B:60:0x0173  */
    /* JADX WARN: Code duplicated, block: B:62:0x0177  */
    /* JADX WARN: Code duplicated, block: B:63:0x017a  */
    /* JADX WARN: Code duplicated, block: B:65:0x017e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0181  */
    /* JADX WARN: Code duplicated, block: B:68:0x0185  */
    /* JADX WARN: Code duplicated, block: B:70:0x018f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0193  */
    /* JADX WARN: Code duplicated, block: B:72:0x0196  */
    /* JADX WARN: Code duplicated, block: B:74:0x019a  */
    /* JADX WARN: Code duplicated, block: B:75:0x019d  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01db  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f2  */
    public final setSecondaryProgressTintBlendMode f() {
        Object objM5535constructorimpl;
        Throwable thM5538exceptionOrNullimpl;
        setHeaderDividersEnabled setheaderdividersenabled;
        execute executeVar;
        getUiMessage getuimessage;
        Object setdividerpadding;
        setTextIsSelectable settextisselectable;
        int i10;
        byte length;
        byte[] bArr;
        byte b10;
        int i11;
        int i12;
        byte[] x4;
        int i13;
        getUiMessage getuimessage2;
        setStackFromBottom setstackfrombottom;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        char c10;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        setColorFilter setcolorfilter = this.f56492f;
        getException getexception = this.f56488b;
        char c11 = 0;
        try {
            Result.Companion companion = Result.INSTANCE;
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 16, null, null, 6}, 1173867142, -1173867141, 16);
            setHeaderDividersEnabled setheaderdividersenabled2 = this.f56496j;
            if (setheaderdividersenabled2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                setheaderdividersenabled2 = null;
            }
            if (setheaderdividersenabled2.setLayoutAnimation()) {
                setHeaderDividersEnabled setheaderdividersenabled3 = this.f56496j;
                if (setheaderdividersenabled3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    setheaderdividersenabled3 = null;
                }
                if (setheaderdividersenabled3.setOnFocusChangeListener().size() == 0) {
                    int i24 = f56482p;
                    int i25 = i24 + 29;
                    f56483q = i25 % 128;
                    if (i25 % 2 == 0) {
                        throw null;
                    }
                    setFooterDividersEnabled setfooterdividersenabled = this.f56495i;
                    if (setfooterdividersenabled == null) {
                        int i26 = i24 + 93;
                        f56483q = i26 % 128;
                        if (i26 % 2 == 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            throw null;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        setfooterdividersenabled = null;
                    }
                    if (setfooterdividersenabled.setDividerPadding()) {
                        setdividerpadding = new setSecondaryProgressTintBlendMode.setY();
                    } else {
                        setheaderdividersenabled = this.f56496j;
                        if (setheaderdividersenabled == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            setheaderdividersenabled = null;
                        }
                        setHeaderDividersEnabled.setOnFocusChangeListener setonfocuschangelistener = (setHeaderDividersEnabled.setOnFocusChangeListener) setHeaderDividersEnabled.setOnFocusChangeListener(new Object[]{setheaderdividersenabled}, -1627665820, 1627665820, System.identityHashCode(setheaderdividersenabled));
                        executeVar = (execute) setHeaderDividersEnabled.setOnFocusChangeListener.setY(new Object[]{setonfocuschangelistener}, -1617459082, 1617459082, System.identityHashCode(setonfocuschangelistener));
                        try {
                            getuimessage = new getUiMessage((byte[]) execute.setDividerPadding(new Object[]{executeVar}, -834355004, 834355015, System.identityHashCode(executeVar)));
                            CloseableKt.closeFinally(executeVar, null);
                            if (this.f56493g == null) {
                                byte[] bArr2 = (byte[]) getException.setOnFocusChangeListener(new Object[]{getexception}, 1066057972, -1066057969, System.identityHashCode(getexception));
                                Intrinsics.checkNotNull(bArr2);
                                settextisselectable = new setTextIsSelectable((byte[]) bArr2.clone());
                                try {
                                    setPivotX setpivotx = this.f56489c;
                                    try {
                                        i10 = 1034568962;
                                        length = (byte) ((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{getuimessage}, -1034568962, 1034568962, System.identityHashCode(getuimessage))).length;
                                        bArr = new byte[16];
                                        bArr[0] = 64;
                                        bArr[0] = (byte) (64 | ((byte) (length & 15)));
                                        if (length < 4) {
                                            b10 = 4;
                                        } else {
                                            b10 = length;
                                        }
                                        if (length > 0) {
                                            i16 = 0;
                                            while (true) {
                                                i17 = i16 + 1;
                                                i18 = (i16 >> 1) + 1;
                                                Object[] objArr = new Object[1];
                                                objArr[c11] = getuimessage;
                                                c10 = (char) ((byte[]) setLayerType.setCompoundDrawableTintBlendMode(objArr, -1034568962, i10, System.identityHashCode(getuimessage)))[i16];
                                                if (c10 == '0') {
                                                    int i27 = f56483q + 71;
                                                    f56482p = i27 % 128;
                                                    int i28 = i27 % 2;
                                                    i20 = 0;
                                                } else if (c10 == '1') {
                                                    i20 = 1;
                                                } else if (c10 == '2') {
                                                    i20 = 2;
                                                } else if (c10 == '3') {
                                                    i20 = 3;
                                                } else if (c10 == '4') {
                                                    i20 = 4;
                                                } else if (c10 == '5') {
                                                    i20 = 5;
                                                } else if (c10 == '6') {
                                                    i23 = f56483q + 49;
                                                    f56482p = i23 % 128;
                                                    if (i23 % 2 != 0) {
                                                        i20 = 35;
                                                    } else {
                                                        i20 = 6;
                                                    }
                                                } else if (c10 == '7') {
                                                    i20 = 7;
                                                } else if (c10 == '8') {
                                                    int i29 = f56483q + 17;
                                                    f56482p = i29 % 128;
                                                    int i30 = i29 % 2;
                                                    i20 = 8;
                                                } else if (c10 == '9') {
                                                    i22 = f56483q + 21;
                                                    f56482p = i22 % 128;
                                                    if (i22 % 2 != 0) {
                                                        i20 = 101;
                                                    } else {
                                                        i20 = 9;
                                                    }
                                                } else if (c10 == 'a') {
                                                    i21 = f56483q + 59;
                                                    f56482p = i21 % 128;
                                                    if (i21 % 2 != 0) {
                                                        i20 = 82;
                                                    } else {
                                                        i20 = 10;
                                                    }
                                                } else if (c10 == 'A') {
                                                    i20 = 10;
                                                } else {
                                                    i19 = 11;
                                                    if (c10 == 'b') {
                                                        int i31 = f56483q + 73;
                                                        f56482p = i31 % 128;
                                                        int i32 = i31 % 2;
                                                    } else if (c10 != 'B') {
                                                        if (c10 == 'c' && c10 != 'C') {
                                                            i19 = 13;
                                                            if (c10 != 'd' && c10 != 'D') {
                                                                i20 = 14;
                                                                if (c10 != 'e' && c10 != 'E') {
                                                                    if (c10 != 'f' && c10 != 'F') {
                                                                        throw new IllegalArgumentException(String.valueOf(c10));
                                                                    }
                                                                    i20 = 15;
                                                                }
                                                            }
                                                        } else {
                                                            i20 = 12;
                                                        }
                                                    }
                                                    i20 = i19;
                                                }
                                                if (i16 % 2 == 0) {
                                                    bArr[i18] = (byte) (((byte) ((i20 << 4) & 240)) | bArr[i18]);
                                                } else {
                                                    bArr[i18] = (byte) (((byte) (i20 & 15)) | bArr[i18]);
                                                }
                                                if (i17 >= length) {
                                                    break;
                                                }
                                                i16 = i17;
                                                i10 = 1034568962;
                                                c11 = 0;
                                            }
                                        }
                                        getuimessage.close();
                                        i11 = b10 + 2;
                                        if (i11 < 16) {
                                            while (true) {
                                                i14 = i11 + 1;
                                                i15 = i11 >> 1;
                                                if (i11 % 2 == 0) {
                                                    bArr[i15] = (byte) (bArr[i15] | (-96));
                                                } else {
                                                    bArr[i15] = (byte) (bArr[i15] | 10);
                                                }
                                                if (i14 >= 16) {
                                                    break;
                                                }
                                                i11 = i14;
                                            }
                                        }
                                        i12 = 8;
                                        x4 = setPivotX.setY(setpivotx).setX(8);
                                        while (true) {
                                            i13 = i12 + 1;
                                            bArr[i12] = x4[i12 - 8];
                                            if (i13 > 15) {
                                                break;
                                            }
                                            i12 = i13;
                                            Result.Companion companion2 = Result.INSTANCE;
                                            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th));
                                        }
                                        getuimessage2 = new getUiMessage(bArr);
                                        CloseableKt.closeFinally(getuimessage, null);
                                        try {
                                            byte[] compoundDrawableTintBlendMode = setPivotX.setCompoundDrawableTintBlendMode(setpivotx).setCompoundDrawableTintBlendMode(settextisselectable.setY(), (byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{getuimessage2}, -1034568962, 1034568962, System.identityHashCode(getuimessage2)));
                                            CloseableKt.closeFinally(getuimessage2, null);
                                            setstackfrombottom = new setStackFromBottom(compoundDrawableTintBlendMode);
                                            CloseableKt.closeFinally(settextisselectable, null);
                                            try {
                                                byte[] bArr3 = (byte[]) ((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{setstackfrombottom}, -1034568962, 1034568962, System.identityHashCode(setstackfrombottom))).clone();
                                                CloseableKt.closeFinally(setstackfrombottom, null);
                                                getException.setOnFocusChangeListener(new Object[]{getexception, bArr3}, -1064812153, 1064812154, System.identityHashCode(getexception));
                                                byte[] bArr4 = (byte[]) getException.setOnFocusChangeListener(new Object[]{getexception}, 885016662, -885016662, System.identityHashCode(getexception));
                                                Intrinsics.checkNotNull(bArr4);
                                                setOnItemSelectedListener setonitemselectedlistener = setOnItemSelectedListener.INSTANCE;
                                                new alp();
                                                alp alpVar = new alp();
                                                alm.setY(new Object[]{alpVar, bArr4, 0, Integer.valueOf(bArr4.length)}, 1533057357, -1533057354, 0);
                                                Unit unit = Unit.INSTANCE;
                                                byte[] bArr5 = new byte[alpVar.setY()];
                                                alpVar.setCompoundDrawableTintBlendMode(bArr5, 0);
                                                setdividerpadding = new setSecondaryProgressTintBlendMode.setDividerPadding(new setMeasureWithLargestChildEnabled(bArr5));
                                            } catch (Throwable th2) {
                                                try {
                                                    throw th2;
                                                } catch (Throwable th3) {
                                                    CloseableKt.closeFinally(setstackfrombottom, th2);
                                                    throw th3;
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            try {
                                                throw th4;
                                            } catch (Throwable th5) {
                                                CloseableKt.closeFinally(getuimessage2, th4);
                                                throw th5;
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        try {
                                            throw th6;
                                        } catch (Throwable th7) {
                                            CloseableKt.closeFinally(getuimessage, th6);
                                            throw th7;
                                        }
                                    }
                                } catch (Throwable th8) {
                                    try {
                                        throw th8;
                                    } catch (Throwable th9) {
                                        CloseableKt.closeFinally(settextisselectable, th8);
                                        throw th9;
                                    }
                                }
                            } else {
                                new o5(this, getuimessage);
                                getuimessage.close();
                                setOnItemSelectedListener setonitemselectedlistener2 = setOnItemSelectedListener.INSTANCE;
                                new alp();
                                alp alpVar2 = new alp();
                                alm.setY(new Object[]{alpVar2, new byte[]{0}, 0, 1}, 1533057357, -1533057354, 0);
                                Unit unit2 = Unit.INSTANCE;
                                byte[] bArr6 = new byte[alpVar2.setY()];
                                alpVar2.setCompoundDrawableTintBlendMode(bArr6, 0);
                                setdividerpadding = new setSecondaryProgressTintBlendMode.setDividerPadding(new setMeasureWithLargestChildEnabled(bArr6));
                            }
                        } catch (Throwable th10) {
                            try {
                                throw th10;
                            } catch (Throwable th11) {
                                CloseableKt.closeFinally(executeVar, th10);
                                throw th11;
                            }
                        }
                    }
                } else {
                    setheaderdividersenabled = this.f56496j;
                    if (setheaderdividersenabled == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        setheaderdividersenabled = null;
                    }
                    setHeaderDividersEnabled.setOnFocusChangeListener setonfocuschangelistener2 = (setHeaderDividersEnabled.setOnFocusChangeListener) setHeaderDividersEnabled.setOnFocusChangeListener(new Object[]{setheaderdividersenabled}, -1627665820, 1627665820, System.identityHashCode(setheaderdividersenabled));
                    executeVar = (execute) setHeaderDividersEnabled.setOnFocusChangeListener.setY(new Object[]{setonfocuschangelistener2}, -1617459082, 1617459082, System.identityHashCode(setonfocuschangelistener2));
                    getuimessage = new getUiMessage((byte[]) execute.setDividerPadding(new Object[]{executeVar}, -834355004, 834355015, System.identityHashCode(executeVar)));
                    CloseableKt.closeFinally(executeVar, null);
                    if (this.f56493g == null) {
                        byte[] bArr7 = (byte[]) getException.setOnFocusChangeListener(new Object[]{getexception}, 1066057972, -1066057969, System.identityHashCode(getexception));
                        Intrinsics.checkNotNull(bArr7);
                        settextisselectable = new setTextIsSelectable((byte[]) bArr7.clone());
                        setPivotX setpivotx2 = this.f56489c;
                        i10 = 1034568962;
                        length = (byte) ((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{getuimessage}, -1034568962, 1034568962, System.identityHashCode(getuimessage))).length;
                        bArr = new byte[16];
                        bArr[0] = 64;
                        bArr[0] = (byte) (64 | ((byte) (length & 15)));
                        if (length < 4) {
                            b10 = 4;
                        } else {
                            b10 = length;
                        }
                        if (length > 0) {
                            i16 = 0;
                            while (true) {
                                i17 = i16 + 1;
                                i18 = (i16 >> 1) + 1;
                                Object[] objArr2 = new Object[1];
                                objArr2[c11] = getuimessage;
                                c10 = (char) ((byte[]) setLayerType.setCompoundDrawableTintBlendMode(objArr2, -1034568962, i10, System.identityHashCode(getuimessage)))[i16];
                                if (c10 == '0') {
                                    int i210 = f56483q + 71;
                                    f56482p = i210 % 128;
                                    int i211 = i210 % 2;
                                    i20 = 0;
                                } else if (c10 == '1') {
                                    i20 = 1;
                                } else if (c10 == '2') {
                                    i20 = 2;
                                } else if (c10 == '3') {
                                    i20 = 3;
                                } else if (c10 == '4') {
                                    i20 = 4;
                                } else if (c10 == '5') {
                                    i20 = 5;
                                } else if (c10 == '6') {
                                    i23 = f56483q + 49;
                                    f56482p = i23 % 128;
                                    if (i23 % 2 != 0) {
                                        i20 = 35;
                                    } else {
                                        i20 = 6;
                                    }
                                } else if (c10 == '7') {
                                    i20 = 7;
                                } else if (c10 == '8') {
                                    int i212 = f56483q + 17;
                                    f56482p = i212 % 128;
                                    int i33 = i212 % 2;
                                    i20 = 8;
                                } else if (c10 == '9') {
                                    i22 = f56483q + 21;
                                    f56482p = i22 % 128;
                                    if (i22 % 2 != 0) {
                                        i20 = 101;
                                    } else {
                                        i20 = 9;
                                    }
                                } else if (c10 == 'a') {
                                    i21 = f56483q + 59;
                                    f56482p = i21 % 128;
                                    if (i21 % 2 != 0) {
                                        i20 = 82;
                                    } else {
                                        i20 = 10;
                                    }
                                } else if (c10 == 'A') {
                                    i20 = 10;
                                } else {
                                    i19 = 11;
                                    if (c10 == 'b') {
                                        int i34 = f56483q + 73;
                                        f56482p = i34 % 128;
                                        int i35 = i34 % 2;
                                    } else if (c10 != 'B') {
                                        if (c10 == 'c') {
                                            i20 = 12;
                                        } else {
                                            i19 = 13;
                                            if (c10 != 'd') {
                                                i20 = 14;
                                                if (c10 != 'e') {
                                                    if (c10 != 'f') {
                                                        throw new IllegalArgumentException(String.valueOf(c10));
                                                    }
                                                    i20 = 15;
                                                }
                                            }
                                        }
                                    }
                                    i20 = i19;
                                }
                                if (i16 % 2 == 0) {
                                    bArr[i18] = (byte) (((byte) ((i20 << 4) & 240)) | bArr[i18]);
                                } else {
                                    bArr[i18] = (byte) (((byte) (i20 & 15)) | bArr[i18]);
                                }
                                if (i17 >= length) {
                                    break;
                                    break;
                                }
                                i16 = i17;
                                i10 = 1034568962;
                                c11 = 0;
                            }
                        }
                        getuimessage.close();
                        i11 = b10 + 2;
                        if (i11 < 16) {
                            while (true) {
                                i14 = i11 + 1;
                                i15 = i11 >> 1;
                                if (i11 % 2 == 0) {
                                    bArr[i15] = (byte) (bArr[i15] | (-96));
                                } else {
                                    bArr[i15] = (byte) (bArr[i15] | 10);
                                }
                                if (i14 >= 16) {
                                    break;
                                    break;
                                }
                                i11 = i14;
                            }
                        }
                        i12 = 8;
                        x4 = setPivotX.setY(setpivotx2).setX(8);
                        while (true) {
                            i13 = i12 + 1;
                            bArr[i12] = x4[i12 - 8];
                            if (i13 > 15) {
                                break;
                                break;
                            }
                            i12 = i13;
                            Result.Companion companion3 = Result.INSTANCE;
                            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th));
                        }
                        getuimessage2 = new getUiMessage(bArr);
                        CloseableKt.closeFinally(getuimessage, null);
                        byte[] compoundDrawableTintBlendMode2 = setPivotX.setCompoundDrawableTintBlendMode(setpivotx2).setCompoundDrawableTintBlendMode(settextisselectable.setY(), (byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{getuimessage2}, -1034568962, 1034568962, System.identityHashCode(getuimessage2)));
                        CloseableKt.closeFinally(getuimessage2, null);
                        setstackfrombottom = new setStackFromBottom(compoundDrawableTintBlendMode2);
                        CloseableKt.closeFinally(settextisselectable, null);
                        byte[] bArr8 = (byte[]) ((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{setstackfrombottom}, -1034568962, 1034568962, System.identityHashCode(setstackfrombottom))).clone();
                        CloseableKt.closeFinally(setstackfrombottom, null);
                        getException.setOnFocusChangeListener(new Object[]{getexception, bArr8}, -1064812153, 1064812154, System.identityHashCode(getexception));
                        byte[] bArr9 = (byte[]) getException.setOnFocusChangeListener(new Object[]{getexception}, 885016662, -885016662, System.identityHashCode(getexception));
                        Intrinsics.checkNotNull(bArr9);
                        setOnItemSelectedListener setonitemselectedlistener3 = setOnItemSelectedListener.INSTANCE;
                        new alp();
                        alp alpVar3 = new alp();
                        alm.setY(new Object[]{alpVar3, bArr9, 0, Integer.valueOf(bArr9.length)}, 1533057357, -1533057354, 0);
                        Unit unit3 = Unit.INSTANCE;
                        byte[] bArr10 = new byte[alpVar3.setY()];
                        alpVar3.setCompoundDrawableTintBlendMode(bArr10, 0);
                        setdividerpadding = new setSecondaryProgressTintBlendMode.setDividerPadding(new setMeasureWithLargestChildEnabled(bArr10));
                    } else {
                        new o5(this, getuimessage);
                        getuimessage.close();
                        setOnItemSelectedListener setonitemselectedlistener4 = setOnItemSelectedListener.INSTANCE;
                        new alp();
                        alp alpVar4 = new alp();
                        alm.setY(new Object[]{alpVar4, new byte[]{0}, 0, 1}, 1533057357, -1533057354, 0);
                        Unit unit4 = Unit.INSTANCE;
                        byte[] bArr11 = new byte[alpVar4.setY()];
                        alpVar4.setCompoundDrawableTintBlendMode(bArr11, 0);
                        setdividerpadding = new setSecondaryProgressTintBlendMode.setDividerPadding(new setMeasureWithLargestChildEnabled(bArr11));
                    }
                }
                thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                if (thM5538exceptionOrNullimpl != null) {
                    int i36 = f56482p + 103;
                    f56483q = i36 % 128;
                    int i37 = i36 % 2;
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 12, null, thM5538exceptionOrNullimpl}, -1999045713, 1999045717, 12);
                    setY();
                    Unit unit5 = Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(objM5535constructorimpl);
                return (setSecondaryProgressTintBlendMode) objM5535constructorimpl;
            }
            setdividerpadding = new setSecondaryProgressTintBlendMode.setOnFocusChangeListener();
            int i38 = f56483q + 117;
            f56482p = i38 % 128;
            int i39 = i38 % 2;
            objM5535constructorimpl = Result.m5535constructorimpl(setdividerpadding);
        } catch (Throwable th12) {
            Result.Companion companion4 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th12));
        }
        thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            int i310 = f56482p + 103;
            f56483q = i310 % 128;
            int i311 = i310 % 2;
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 12, null, thM5538exceptionOrNullimpl}, -1999045713, 1999045717, 12);
            setY();
            Unit unit6 = Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM5535constructorimpl);
        return (setSecondaryProgressTintBlendMode) objM5535constructorimpl;
    }

    @NotNull
    public synchronized byte[] setCompoundDrawableTintBlendMode(int p4, int p10) {
        Object objM5535constructorimpl;
        try {
            try {
                Result.Companion companion = Result.INSTANCE;
                if (this.f56494h != setCompoundDrawableTintBlendMode.setY) {
                    throw new setBackgroundTintBlendMode(this.f56494h);
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(p4, p10, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                setIndeterminateTintMode setindeterminatetintmode = this.f56498l;
                if (setindeterminatetintmode == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    setindeterminatetintmode = null;
                }
                this.f56497k = setindeterminatetintmode.y_(this.f56487a, p4, p10, canvas);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
                objM5535constructorimpl = Result.m5535constructorimpl((byte[]) setPreferKeepClearRects.setOnFocusChangeListener(new Object[]{bitmapCreateBitmap}, 2127939347, -2127939346, (int) System.currentTimeMillis()));
                if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
                    this.f56494h = setCompoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode;
                    int i10 = f56482p + 121;
                    f56483q = i10 % 128;
                    int i11 = i10 % 2;
                }
                Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                if (thM5538exceptionOrNullimpl != null) {
                    int i12 = f56482p + 45;
                    f56483q = i12 % 128;
                    int i13 = i12 % 2;
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.f56492f, 33, null, thM5538exceptionOrNullimpl}, -1999045713, 1999045717, 33);
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
        return (byte[]) objM5535constructorimpl;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0035 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:31:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x0035, please report this as an issue */
    @Nullable
    public synchronized setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode setDividerPadding() {
        int i10;
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = this.f56494h;
        if (setcompounddrawabletintblendmode == setCompoundDrawableTintBlendMode.setOnFocusChangeListener) {
            i10 = f56482p + 73;
            f56483q = i10 % 128;
            if (i10 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i11 = f56483q + 123;
        f56482p = i11 % 128;
        if (i11 % 2 != 0) {
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = setCompoundDrawableTintBlendMode.setX;
            throw null;
        }
        if (setcompounddrawabletintblendmode != setCompoundDrawableTintBlendMode.setDividerPadding) {
            return new setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode(setElegantTextHeight.setX);
        }
        i10 = f56482p + 73;
        f56483q = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
        throw th;
    }

    @NotNull
    public synchronized setDividerDrawable setOnFocusChangeListener(float p4, float p10) {
        Object objM5535constructorimpl;
        int i10;
        setSecondaryProgressTintBlendMode setsecondaryprogresstintblendmodeF;
        try {
            try {
                Result.Companion companion = Result.INSTANCE;
                if (this.f56494h != setCompoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode) {
                    throw new setSelectAllOnFocus(this.f56494h);
                }
                setHeaderDividersEnabled setheaderdividersenabled = this.f56496j;
                if (setheaderdividersenabled == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    setheaderdividersenabled = null;
                }
                int size = setheaderdividersenabled.setOnFocusChangeListener().size();
                setCollapseIcon[] setcollapseiconArr = this.f56497k;
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
                    if (setcollapseiconArr[i11].setY(p4, p10)) {
                        break;
                    }
                    i11++;
                }
                setCollapseIcon[] setcollapseiconArr2 = this.f56497k;
                if (setcollapseiconArr2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    setcollapseiconArr2 = null;
                }
                setCollapseIcon setcollapseicon = (setCollapseIcon) ArraysKt___ArraysKt.getOrNull(setcollapseiconArr2, i11);
                if (setcollapseicon != null) {
                    Object[] objArr = new Object[1];
                    a(14 - ExpandableListView.getPackedPositionGroup(0L), "\r\n\u0001\u0015\u0015\u0014\u000f\u0006\u0010\u0016\u0016\u0015\u0015\u0013", (byte) (View.MeasureSpec.getMode(0) + 86), objArr);
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{Intrinsics.stringPlus(((String) objArr[0]).intern(), setcollapseicon)}, -1689942959, 1689942969, (int) System.currentTimeMillis());
                }
                setCollapseIcon.setY dividerPadding = setcollapseicon == null ? null : setcollapseicon.setDividerPadding();
                if (dividerPadding != null) {
                    i10 = setX.setOnFocusChangeListener[dividerPadding.ordinal()];
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        setHeaderDividersEnabled setheaderdividersenabled2 = this.f56496j;
                        if (setheaderdividersenabled2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            setheaderdividersenabled2 = null;
                        }
                        setheaderdividersenabled2.setOnDragListener();
                    } else if (i10 != 3) {
                        if (i10 == 4) {
                            setsecondaryprogresstintblendmodeF = new setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode(setElegantTextHeight.setOnFocusChangeListener);
                        }
                    } else if (size < 12) {
                        setHeaderDividersEnabled setheaderdividersenabled3 = this.f56496j;
                        if (setheaderdividersenabled3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            setheaderdividersenabled3 = null;
                        }
                        if (((Boolean) setHeaderDividersEnabled.setOnFocusChangeListener(new Object[]{setheaderdividersenabled3}, 125080965, -125080964, System.identityHashCode(setheaderdividersenabled3))).booleanValue()) {
                            throw new setRotation(TypedValues.Custom.TYPE_INT);
                        }
                        if (i11 < 0 || i11 > 12) {
                            throw new setRotation(903);
                        }
                        setheaderdividersenabled3.setOnFocusChangeListener().add(Character.valueOf(setheaderdividersenabled3.setCompoundDrawableTintBlendMode()[i11]));
                        setheaderdividersenabled3.setOnFocusChangeListener(setheaderdividersenabled3.setNavigationOnClickListener());
                        setCompoundDrawablesRelativeWithIntrinsicBounds y7 = setheaderdividersenabled3.setY();
                        setCompoundDrawablesRelativeWithIntrinsicBounds.setY(new Object[]{y7, setheaderdividersenabled3.setCompoundDrawableTintBlendMode()}, 671563438, -671563436, System.identityHashCode(y7));
                    }
                    setsecondaryprogresstintblendmodeF = null;
                } else {
                    setsecondaryprogresstintblendmodeF = f();
                }
                if (setsecondaryprogresstintblendmodeF instanceof setSecondaryProgressTintBlendMode.setDividerPadding) {
                    this.f56494h = setCompoundDrawableTintBlendMode.setOnFocusChangeListener;
                }
                setHeaderDividersEnabled setheaderdividersenabled4 = this.f56496j;
                if (setheaderdividersenabled4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    setheaderdividersenabled4 = null;
                }
                objM5535constructorimpl = Result.m5535constructorimpl(new setDividerDrawable(setheaderdividersenabled4.setOnFocusChangeListener().size(), setsecondaryprogresstintblendmodeF));
                if (Result.m5541isSuccessimpl(objM5535constructorimpl) && (((setDividerDrawable) objM5535constructorimpl).setX() instanceof setSecondaryProgressTintBlendMode.setDividerPadding)) {
                    this.f56494h = setCompoundDrawableTintBlendMode.setOnFocusChangeListener;
                }
                Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                if (thM5538exceptionOrNullimpl != null) {
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.f56492f, 10, null, thM5538exceptionOrNullimpl}, -1999045713, 1999045717, 10);
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

    public synchronized void setY() {
        try {
            int i10 = f56482p + 21;
            f56483q = i10 % 128;
            int i11 = i10 % 2;
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = this.f56494h;
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = setCompoundDrawableTintBlendMode.setDividerPadding;
            if (setcompounddrawabletintblendmode == setcompounddrawabletintblendmode2) {
                return;
            }
            this.f56494h = setcompounddrawabletintblendmode2;
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.f56492f, 13, null, null, 6}, 1173867142, -1173867141, 13);
            this.f56488b.close();
            setHeaderDividersEnabled setheaderdividersenabled = this.f56496j;
            if (setheaderdividersenabled != null) {
                if (setheaderdividersenabled == null) {
                    int i12 = f56482p + 77;
                    f56483q = i12 % 128;
                    int i13 = i12 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    setheaderdividersenabled = null;
                }
                setheaderdividersenabled.close();
            }
            int i14 = f56483q + 13;
            f56482p = i14 % 128;
            if (i14 % 2 == 0) {
            } else {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void setX(@NotNull setFooterDividersEnabled p4, @NotNull setLabelFor p10) {
        Object objM5535constructorimpl;
        try {
            Intrinsics.checkNotNullParameter(p4, "");
            Intrinsics.checkNotNullParameter(p10, "");
            try {
                Result.Companion companion = Result.INSTANCE;
                if (this.f56494h != setCompoundDrawableTintBlendMode.setX) {
                    throw new setPadViewListener(this.f56494h);
                }
                this.f56495i = p4;
                getException getexception = this.f56488b;
                getException.setOnFocusChangeListener(new Object[]{getexception, this.f56490d.setX(16)}, 261874175, -261874173, System.identityHashCode(getexception));
                getDynamicButtonBackgroundColor getdynamicbuttonbackgroundcolor = new getDynamicButtonBackgroundColor(this.f56490d.setX(16));
                setPivotY setpivoty = new setPivotY(this.f56490d.setX(32));
                initialise initialiseVar = new initialise();
                setRight setright = new setRight(initialiseVar);
                setNextFocusUpId setnextfocusupid = new setNextFocusUpId((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{setpivoty}, -1034568962, 1034568962, System.identityHashCode(setpivoty)), initialiseVar);
                getAmountFieldTextSizeSp getamountfieldtextsizesp = new getAmountFieldTextSizeSp((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{getdynamicbuttonbackgroundcolor}, -1034568962, 1034568962, System.identityHashCode(getdynamicbuttonbackgroundcolor)), initialiseVar);
                setLayoutAnimationListener setlayoutanimationlistener = setLayoutAnimationListener.INSTANCE;
                setright.setCompoundDrawableTintBlendMode(setnextfocusupid, getamountfieldtextsizesp, new setScaleY((byte[]) setLayoutAnimationListener.setY(new Object[0], -1117967001, 1117967001, (int) System.currentTimeMillis())));
                setpivoty.close();
                getdynamicbuttonbackgroundcolor.close();
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.f56492f, 42, null, null, 6}, 1173867142, -1173867141, 42);
                setHeaderDividersEnabled setheaderdividersenabled = new setHeaderDividersEnabled(setright, p4.setY() == setIndeterminate.setDividerPadding, p4.setDividerPadding());
                this.f56496j = setheaderdividersenabled;
                char[] x4 = setheaderdividersenabled.setX();
                setIndeterminateTintMode settransitionname = p4.setY() == setIndeterminate.setOnFocusChangeListener ? new setTransitionName(this.f56490d) : new setLineHeight();
                this.f56498l = settransitionname;
                settransitionname.setDividerPadding(p4.setCompoundDrawableTintBlendMode(), new onOptionsItemSelected(x4));
                objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
                if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
                    this.f56494h = setCompoundDrawableTintBlendMode.setY;
                }
                Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                if (thM5538exceptionOrNullimpl != null) {
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.f56492f, 9, null, thM5538exceptionOrNullimpl}, -1999045713, 1999045717, 9);
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
    }

    public /* synthetic */ initCause(Context context, getException getexception, setPivotX setpivotx, setTextSelectHandleLeft settextselecthandleleft, setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode, getScope getscope, setColorFilter setcolorfilter, getClientSecret getclientsecret, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, getexception, setpivotx, settextselecthandleleft, setprogressbackgroundtintblendmode, getscope, setcolorfilter, (i10 & 128) != 0 ? null : getclientsecret);
    }

    @Nullable
    public synchronized setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode setOnFocusChangeListener() {
        int i10 = f56482p + 3;
        f56483q = i10 % 128;
        int i11 = i10 % 2;
        if (this.f56494h == setCompoundDrawableTintBlendMode.setDividerPadding) {
            int i12 = f56483q + 19;
            f56482p = i12 % 128;
            int i13 = i12 % 2;
            return null;
        }
        setY();
        setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode(setElegantTextHeight.setDividerPadding);
        int i14 = f56483q + 113;
        f56482p = i14 % 128;
        int i15 = i14 % 2;
        return setcompounddrawabletintblendmode;
    }

    @NotNull
    public synchronized Pair<byte[], byte[]> setX(@NotNull setMeasureWithLargestChildEnabled p4, @NotNull byte[] p10) {
        Object objM5535constructorimpl;
        Pair<byte[], byte[]> pair;
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p10, "");
        if (this.f56494h == setCompoundDrawableTintBlendMode.setOnFocusChangeListener) {
            getException getexception = this.f56488b;
            char c10 = 0;
            byte[] bArr = (byte[]) getException.setOnFocusChangeListener(new Object[]{getexception}, 885016662, -885016662, System.identityHashCode(getexception));
            if (bArr == null) {
                pair = null;
            } else {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    setOnItemSelectedListener setonitemselectedlistener = setOnItemSelectedListener.INSTANCE;
                    new alp();
                    alp alpVar = new alp();
                    alm.setY(new Object[]{alpVar, bArr, 0, Integer.valueOf(bArr.length)}, 1533057357, -1533057354, 0);
                    byte[] bArr2 = new byte[alpVar.setY()];
                    alpVar.setCompoundDrawableTintBlendMode(bArr2, 0);
                    if (Intrinsics.areEqual(p4, new setMeasureWithLargestChildEnabled(bArr2))) {
                        getTooFewDigitsMessage y7 = setPivotX.setY(p10);
                        Random.INSTANCE.nextBytes(p10);
                        getException getexception2 = this.f56488b;
                        byte[] bArr3 = (byte[]) getException.setOnFocusChangeListener(new Object[]{getexception2}, 1066057972, -1066057969, System.identityHashCode(getexception2));
                        Intrinsics.checkNotNull(bArr3);
                        setTextIsSelectable settextisselectable = new setTextIsSelectable((byte[]) bArr3.clone());
                        try {
                            setPivotX setpivotx = this.f56489c;
                            setStackFromBottom setstackfrombottom = new setStackFromBottom(bArr);
                            setStackFromBottom setstackfrombottom2 = new setStackFromBottom(new byte[((Integer) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{setstackfrombottom}, 652647922, -652647918, System.identityHashCode(setstackfrombottom))).intValue()]);
                            int length = ((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{setstackfrombottom}, -1034568962, 1034568962, System.identityHashCode(setstackfrombottom))).length - 1;
                            if (length >= 0) {
                                int i10 = 0;
                                while (true) {
                                    int i11 = i10 + 1;
                                    Object[] objArr = new Object[1];
                                    objArr[c10] = setstackfrombottom2;
                                    byte[] bArr4 = (byte[]) setLayerType.setCompoundDrawableTintBlendMode(objArr, -1034568962, 1034568962, System.identityHashCode(setstackfrombottom2));
                                    Object[] objArr2 = new Object[1];
                                    objArr2[c10] = setstackfrombottom;
                                    byte b10 = ((byte[]) setLayerType.setCompoundDrawableTintBlendMode(objArr2, -1034568962, 1034568962, System.identityHashCode(setstackfrombottom)))[i10];
                                    Object[] objArr3 = new Object[1];
                                    objArr3[c10] = y7;
                                    bArr4[i10] = (byte) (((byte[]) setLayerType.setCompoundDrawableTintBlendMode(objArr3, -1034568962, 1034568962, System.identityHashCode(y7)))[i10] ^ b10);
                                    if (i11 > length) {
                                        break;
                                    }
                                    i10 = i11;
                                    c10 = 0;
                                }
                            }
                            setstackfrombottom.close();
                            y7.close();
                            try {
                                byte[] compoundDrawableTintBlendMode = setPivotX.setCompoundDrawableTintBlendMode(setpivotx).setCompoundDrawableTintBlendMode(settextisselectable.setY(), (byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{setstackfrombottom2}, -1034568962, 1034568962, System.identityHashCode(setstackfrombottom2)));
                                settextisselectable.close();
                                setstackfrombottom2.close();
                                setStackFromBottom setstackfrombottom3 = new setStackFromBottom(compoundDrawableTintBlendMode);
                                try {
                                    Object objClone = ((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{setstackfrombottom3}, -1034568962, 1034568962, System.identityHashCode(setstackfrombottom3))).clone();
                                    getException getexception3 = this.f56488b;
                                    byte[] bArr5 = (byte[]) getException.setOnFocusChangeListener(new Object[]{getexception3}, 1066057972, -1066057969, System.identityHashCode(getexception3));
                                    Intrinsics.checkNotNull(bArr5);
                                    Pair pair2 = new Pair(objClone, e(bArr5));
                                    CloseableKt.closeFinally(setstackfrombottom3, null);
                                    int i12 = f56483q + 43;
                                    f56482p = i12 % 128;
                                    int i13 = i12 % 2;
                                    CloseableKt.closeFinally(settextisselectable, null);
                                    objM5535constructorimpl = Result.m5535constructorimpl(pair2);
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        CloseableKt.closeFinally(setstackfrombottom3, th2);
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th4) {
                                settextisselectable.close();
                                setstackfrombottom2.close();
                                throw th4;
                            }
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                CloseableKt.closeFinally(settextisselectable, th5);
                                throw th6;
                            }
                        }
                    } else {
                        throw new setBaselineAlignBottom();
                    }
                } catch (Throwable th7) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th7));
                }
                Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                if (thM5538exceptionOrNullimpl != null) {
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.f56492f, 43, null, thM5538exceptionOrNullimpl}, -1999045713, 1999045717, 43);
                    setY();
                } else {
                    int i14 = f56482p + 43;
                    f56483q = i14 % 128;
                    int i15 = i14 % 2;
                }
                ResultKt.throwOnFailure(objM5535constructorimpl);
                pair = (Pair) objM5535constructorimpl;
            }
            if (pair == null) {
                throw new setMovementMethod();
            }
        } else {
            throw new getPinGridButtonTextColor(this.f56494h);
        }
        return pair;
    }

    @Nullable
    public synchronized setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode setX() {
        int i10 = f56482p + 63;
        f56483q = i10 % 128;
        if (i10 % 2 == 0) {
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = setCompoundDrawableTintBlendMode.setX;
            throw null;
        }
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = this.f56494h;
        if (setcompounddrawabletintblendmode2 != setCompoundDrawableTintBlendMode.setOnFocusChangeListener && setcompounddrawabletintblendmode2 != setCompoundDrawableTintBlendMode.setDividerPadding) {
            return new setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode(setElegantTextHeight.setCompoundDrawableTintBlendMode);
        }
        int i11 = f56482p + 23;
        f56483q = i11 % 128;
        if (i11 % 2 != 0) {
            return null;
        }
        throw null;
        throw th;
    }
}
