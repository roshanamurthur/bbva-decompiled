package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.processing.f;
import androidx.room.d;
import bk.p;
import bk.q;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0013\u0012\u0006\u0010\u0006\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/mypinpad/tsdk/i/TerminalErrorCodes;", "", "Ljava/time/Duration;", "p0", "", "Lcom/mypinpad/tsdk/i/getTransactionPortrait;", "p1", "", "setCompoundDrawableTintBlendMode", "(Ljava/time/Duration;Ljava/util/List;)V", "()V", "", "setY", "()Z", "", "Ljava/util/concurrent/Future;", "Lcom/mypinpad/tsdk/i/setAutoSizeTextTypeUniformWithPresetSizes;", "setOnFocusChangeListener", "(Ljava/util/List;)Ljava/util/Map;", "Lcom/mypinpad/tsdk/i/setColorFilter;", "Lcom/mypinpad/tsdk/i/setTransformationMethod;", "Lcom/mypinpad/tsdk/i/TerminalCallbackKt;", "p2", "<init>", "(Lcom/mypinpad/tsdk/i/setColorFilter;Lcom/mypinpad/tsdk/i/setTransformationMethod;Lcom/mypinpad/tsdk/i/TerminalCallbackKt;)V", "setDividerPadding"}, k = 1, mv = {1, 5, 1})
public final class TerminalErrorCodes {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final setSupportImageTintMode f51814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static char[] f51815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f51816k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f51817l;
    public static boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f51818n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f51819o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f51820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f51821q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f51822r = null;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setColorFilter f51823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setTransformationMethod f51824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TerminalCallbackKt f51825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public setSupportImageTintMode f51826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f51827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f51828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ScheduledExecutorService f51829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final ReentrantLock f51830h;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/mypinpad/tsdk/i/setAutoSizeTextTypeUniformWithPresetSizes;", "c", "()Lcom/mypinpad/tsdk/i/setAutoSizeTextTypeUniformWithPresetSizes;"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<setAutoSizeTextTypeUniformWithPresetSizes> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final int f51831r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f51832s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f51833t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f51834u0;
        public static int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static final byte[] f51835w0 = null;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ getTransactionPortrait f51837q0;

        static {
            b();
            f51834u0 = 0;
            v0 = 1;
            f51832s0 = 0;
            f51833t0 = 1;
            f51831r0 = -443080068;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(getTransactionPortrait gettransactionportrait) {
            super(0);
            this.f51837q0 = gettransactionportrait;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void a(short r7, short r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 + 4
                int r8 = r8 + 65
                int r7 = r7 * 2
                int r7 = r7 + 1
                byte[] r0 = new byte[r7]
                r1 = 0
                byte[] r2 = com.mypinpad.tsdk.i.TerminalErrorCodes.a.f51835w0
                if (r2 != 0) goto L13
                r3 = r8
                r4 = r1
                r8 = r7
                goto L2a
            L13:
                r3 = r1
            L14:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r0[r3] = r5
                if (r4 != r7) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r0, r1)
                r10[r1] = r7
                return
            L23:
                int r9 = r9 + 1
                r3 = r2[r9]
                r6 = r8
                r8 = r7
                r7 = r6
            L2a:
                int r7 = r7 + r3
                r3 = r4
                r6 = r8
                r8 = r7
                r7 = r6
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.TerminalErrorCodes.a.a(short, short, short, java.lang.Object[]):void");
        }

        public static void b() {
            f51835w0 = new byte[]{59, -77, 103, 16};
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0273  */
        /* JADX WARN: Code duplicated, block: B:42:0x0274  */
        @Nullable
        public final setAutoSizeTextTypeUniformWithPresetSizes c() throws Throwable {
            setAutoSizeTextTypeUniformWithPresetSizes dividerPadding;
            setColorFilter y7;
            int size;
            int minimumFlingVelocity;
            char[] charArray;
            getNavBarTitleString getnavbartitlestring;
            char[] cArr;
            int i10;
            char[] cArr2;
            Object method;
            Throwable cause;
            getTransactionPortrait gettransactionportrait = this.f51837q0;
            TerminalErrorCodes terminalErrorCodes = TerminalErrorCodes.this;
            int i11 = f51833t0 + 1;
            f51832s0 = i11 % 128;
            int i12 = 2;
            int i13 = i11 % 2;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{TerminalErrorCodes.setY(terminalErrorCodes), 7, setTextDirection.setOnFocusChangeListener(gettransactionportrait), null, 4}, 1173867142, -1173867141, 7);
                dividerPadding = TerminalErrorCodes.setCompoundDrawableTintBlendMode(terminalErrorCodes).setOnFocusChangeListener(gettransactionportrait).setX();
                while (true) {
                    int i14 = getnavbartitlestring.setY;
                    if (i14 >= size) {
                        break;
                    }
                    char c10 = charArray[i14];
                    getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
                    char c11 = (char) (c10 + minimumFlingVelocity);
                    cArr[i14] = c11;
                    try {
                        Object[] objArr = new Object[i12];
                        objArr[1] = Integer.valueOf(f51831r0);
                        objArr[0] = Integer.valueOf(c11);
                        Map map = setTextScaleX.setMaxEms;
                        Object method2 = map.get(133002375);
                        if (method2 == null) {
                            Class cls = (Class) setTextScaleX.setX((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 41, 531 - AndroidCharacter.getMirror('0'));
                            byte b10 = (byte) 0;
                            byte b11 = (byte) (b10 + 1);
                            Object[] objArr2 = new Object[1];
                            a(b10, b11, (byte) (-b11), objArr2);
                            String str = (String) objArr2[0];
                            Class<?> cls2 = Integer.TYPE;
                            method2 = cls.getMethod(str, cls2, cls2);
                            map.put(133002375, method2);
                        }
                        cArr[i14] = ((Character) ((Method) method2).invoke(null, objArr)).charValue();
                        Object[] objArr3 = {getnavbartitlestring, getnavbartitlestring};
                        Object method3 = map.get(1860518195);
                        if (method3 == null) {
                            Class cls3 = (Class) setTextScaleX.setX((char) (55966 - TextUtils.indexOf("", "", 0)), 42 - TextUtils.lastIndexOf("", '0', 0, 0), 2268 - TextUtils.indexOf("", "", 0, 0));
                            byte b12 = (byte) 0;
                            byte b13 = b12;
                            Object[] objArr4 = new Object[1];
                            a(b12, b13, (byte) (b13 - 1), objArr4);
                            method3 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                            map.put(1860518195, method3);
                        }
                        ((Method) method3).invoke(null, objArr3);
                        int i15 = v0 + 19;
                        f51834u0 = i15 % 128;
                        int i16 = i15 % 2;
                        minimumFlingVelocity = minimumFlingVelocity;
                        charArray = charArray;
                        y7 = y7;
                        dividerPadding = dividerPadding;
                        i12 = 2;
                    } catch (Throwable th2) {
                        cause = th2.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th2;
                    }
                    cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
                while (true) {
                    int i17 = getnavbartitlestring.setY;
                    if (i17 >= size) {
                        break;
                    }
                    cArr2[i17] = cArr[(size - i17) - 1];
                    Object[] objArr5 = {getnavbartitlestring, getnavbartitlestring};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object obj = map2.get(1860518195);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls4 = (Class) setTextScaleX.setX((char) (56014 - AndroidCharacter.getMirror('0')), 43 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2267);
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr6 = new Object[1];
                        a(b14, b15, (byte) (b15 - 1), objArr6);
                        method = cls4.getMethod((String) objArr6[0], Object.class, Object.class);
                        map2.put(1860518195, method);
                    }
                    ((Method) method).invoke(null, objArr5);
                }
            } catch (Exception e5) {
                dividerPadding = setTextDirection.setDividerPadding(gettransactionportrait, e5);
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            y7 = TerminalErrorCodes.setY(terminalErrorCodes);
            setAutoSizeTextTypeUniformWithPresetSizes.Companion companion = setAutoSizeTextTypeUniformWithPresetSizes.INSTANCE;
            getDynamicButtonIconTextSpacingDp[] getdynamicbuttonicontextspacingdpArr = {getDisplayExponent.setY((String) setAutoSizeTextTypeUniformWithPresetSizes.Companion.setCompoundDrawableTintBlendMode(new Object[]{dividerPadding}, 682845536, -682845535, (int) System.currentTimeMillis())), getDisplayExponent.setY(String.valueOf(jElapsedRealtime2))};
            size = 1 - View.MeasureSpec.getSize(0);
            minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 196;
            int i18 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1;
            int i19 = v0;
            int i20 = i19 + 103;
            f51834u0 = i20 % 128;
            int i21 = i20 % 2;
            int i22 = i19 + 71;
            f51834u0 = i22 % 128;
            int i23 = i22 % 2;
            charArray = "\u0000".toCharArray();
            getnavbartitlestring = new getNavBarTitleString();
            cArr = new char[size];
            getnavbartitlestring.setY = 0;
            setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = dividerPadding;
            setColorFilter setcolorfilter = y7;
            if (i18 > 0) {
                int i24 = f51834u0 + 121;
                v0 = i24 % 128;
                int i25 = i24 % 2;
                getnavbartitlestring.setOnFocusChangeListener = i18;
                char[] cArr3 = new char[size];
                i10 = 0;
                System.arraycopy(cArr, 0, cArr3, 0, size);
                int i26 = getnavbartitlestring.setOnFocusChangeListener;
                System.arraycopy(cArr3, 0, cArr, size - i26, i26);
                int i27 = getnavbartitlestring.setOnFocusChangeListener;
                System.arraycopy(cArr3, i27, cArr, 0, size - i27);
            } else {
                i10 = 0;
            }
            cArr2 = new char[size];
            getnavbartitlestring.setY = i10;
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 8, new setIndicatorBounds(getdynamicbuttonicontextspacingdpArr, n1.f(cArr2)), null, 4}, 1173867142, -1173867141, 8);
            int i28 = f51833t0 + 125;
            f51832s0 = i28 % 128;
            if (i28 % 2 == 0) {
                return setautosizetexttypeuniformwithpresetsizes;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ setAutoSizeTextTypeUniformWithPresetSizes invoke() throws Throwable {
            setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizesC;
            int i10 = f51833t0 + 21;
            f51832s0 = i10 % 128;
            if (i10 % 2 != 0) {
                setautosizetexttypeuniformwithpresetsizesC = c();
                int i11 = 6 / 0;
            } else {
                setautosizetexttypeuniformwithpresetsizesC = c();
            }
            int i12 = f51832s0 + 85;
            f51833t0 = i12 % 128;
            int i13 = i12 % 2;
            return setautosizetexttypeuniformwithpresetsizesC;
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.TerminalErrorCodes$setDividerPadding, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/TerminalErrorCodes$setDividerPadding;", "", "Lcom/mypinpad/tsdk/i/setSupportImageTintMode;", "setLayoutAnimation", "Lcom/mypinpad/tsdk/i/setSupportImageTintMode;", "setY", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        c();
        f51820p = 0;
        f51821q = 1;
        f51818n = 0;
        f51819o = 1;
        e();
        INSTANCE = new Companion(null);
        getTransactionPortrait gettransactionportrait = getTransactionPortrait.setCompoundDrawableTintBlendMode;
        getClearButtonText.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getClearButtonText.setCompoundDrawableTintBlendMode.INSTANCE;
        getTransactionPortrait gettransactionportrait2 = getTransactionPortrait.setOnFocusChangeListener;
        getClearButtonText.setX setx = getClearButtonText.setX.INSTANCE;
        getTransactionPortrait gettransactionportrait3 = getTransactionPortrait.getNavBarTitleString;
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new getAmountOther[]{new getAmountOther(gettransactionportrait, setcompounddrawabletintblendmode), new getAmountOther(gettransactionportrait2, setx), new getAmountOther(getTransactionPortrait.setY, setcompounddrawabletintblendmode), new getAmountOther(getTransactionPortrait.setDividerPadding, setcompounddrawabletintblendmode), new getAmountOther(getTransactionPortrait.setOnLongClickListener, setcompounddrawabletintblendmode), new getAmountOther(getTransactionPortrait.setNavigationOnClickListener, setcompounddrawabletintblendmode), new getAmountOther(getTransactionPortrait.setLayoutAnimation, setx), new getAmountOther(getTransactionPortrait.setOnDragListener, setx), new getAmountOther(gettransactionportrait3, setcompounddrawabletintblendmode), new getAmountOther(getTransactionPortrait.setTextAlignment, setx), new getAmountOther(getTransactionPortrait.setZ, setx), new getAmountOther(getTransactionPortrait.setAlwaysDrawnWithCacheEnabled, setcompounddrawabletintblendmode), new getAmountOther(getTransactionPortrait.setIncludeFontPadding, setcompounddrawabletintblendmode), new getAmountOther(getTransactionPortrait.UiMessageCallbackKtWhenMappings, setcompounddrawabletintblendmode), new getAmountOther(getTransactionPortrait.getAmountFieldTextColor, getClearButtonText.setY.INSTANCE)});
        Duration durationOfHours = Duration.ofHours(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfHours, "");
        f51814i = new setSupportImageTintMode(listListOf, durationOfHours, CollectionsKt__CollectionsKt.listOf((Object[]) new getTransactionPortrait[]{gettransactionportrait, gettransactionportrait3}));
        int i10 = f51818n + 39;
        f51819o = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 53 / 0;
        }
    }

    public TerminalErrorCodes(@NotNull setColorFilter setcolorfilter, @NotNull setTransformationMethod settransformationmethod, @NotNull TerminalCallbackKt terminalCallbackKt) {
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        Intrinsics.checkNotNullParameter(settransformationmethod, "");
        Intrinsics.checkNotNullParameter(terminalCallbackKt, "");
        this.f51823a = setcolorfilter;
        this.f51824b = settransformationmethod;
        this.f51825c = terminalCallbackKt;
        this.f51826d = f51814i;
        this.f51827e = new LinkedHashMap();
        this.f51828f = new LinkedHashMap();
        this.f51830h = new ReentrantLock();
    }

    public static void a(int i10, Object[] objArr) throws Throwable {
        int i11 = f51821q + 125;
        f51820p = i11 % 128;
        int i12 = i11 % 2;
        byte[] bytes = "\u0086\u008c\u0091\u0090\u0086\u008f\u008e\u008d\u0082\u008a\u008c\u0086\u008b\u008a\u0089\u0087\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081".getBytes("ISO-8859-1");
        setZ setz = new setZ();
        char[] cArr = f51815j;
        long j10 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i13])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1129500232);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (26288 - Gravity.getAbsoluteGravity(0, 0)), 65 - (ViewConfiguration.getGlobalActionKeyTimeout() > j10 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j10 ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1595);
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b11, (byte) (b11 + 2), b10, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1129500232, method);
                    }
                    cArr2[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i13++;
                    j10 = 0;
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
        Object[] objArr4 = {Integer.valueOf(f51816k)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(1019674483);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (Color.argb(0, 0, 0, 0) + 10744), (ViewConfiguration.getWindowTouchSlop() >> 8) + 43, TextUtils.getOffsetBefore("", 0) + 566);
            byte b12 = (byte) 0;
            byte b13 = b12;
            Object[] objArr5 = new Object[1];
            b(b13, (byte) (b13 + 1), b12, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(1019674483, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
        if (!m) {
            if (!f51817l) {
                throw null;
            }
            throw null;
        }
        int length2 = bytes.length;
        setz.setOnFocusChangeListener = length2;
        char[] cArr3 = new char[length2];
        setz.setDividerPadding = 0;
        while (true) {
            int i14 = setz.setDividerPadding;
            int i15 = setz.setOnFocusChangeListener;
            if (i14 >= i15) {
                String str = new String(cArr3);
                int i16 = f51820p + 85;
                f51821q = i16 % 128;
                int i17 = i16 % 2;
                objArr[0] = str;
                return;
            }
            int i18 = f51821q + 117;
            f51820p = i18 % 128;
            int i19 = i18 % 2;
            cArr3[i14] = (char) (cArr[bytes[(i15 - 1) - i14] + i10] - iIntValue);
            Object[] objArr6 = {setz, setz};
            Map map3 = setTextScaleX.setMaxEms;
            Object method3 = map3.get(-1539766653);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 51 - TextUtils.indexOf("", "", 0, 0), 2880 - TextUtils.getOffsetBefore("", 0));
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b15, b15, b14, objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map3.put(-1539766653, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002f -> B:11:0x0039). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r7 = r7 * 2
            int r7 = 122 - r7
            int r6 = r6 * 2
            int r0 = r6 + 1
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.TerminalErrorCodes.f51822r
            if (r2 != 0) goto L1a
            r7 = r6
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L39
        L1a:
            r3 = r1
            r5 = r8
            r8 = r7
        L1d:
            r7 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L2f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2f:
            r3 = r2[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L39:
            int r6 = r6 + r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.TerminalErrorCodes.b(byte, byte, int, java.lang.Object[]):void");
    }

    public static void c() {
        f51822r = new byte[]{94, Constants.CVR_B2b8765_1111_APP_DISABLED, 73, 34};
    }

    public static void e() {
        f51817l = true;
        m = true;
        f51816k = 1794962193;
        f51815j = new char[]{62276, 62306, 62328, 62335, 62326, 62257, 62322, 62320, 62329, 62324, 62325, 62307, 62308, 62333, 62309, 62327, 62334};
    }

    public static final /* synthetic */ setTransformationMethod setCompoundDrawableTintBlendMode(TerminalErrorCodes terminalErrorCodes) {
        int i10 = f51819o + 29;
        int i11 = i10 % 128;
        f51818n = i11;
        int i12 = i10 % 2;
        setTransformationMethod settransformationmethod = terminalErrorCodes.f51824b;
        if (i12 != 0) {
            int i13 = 44 / 0;
        }
        int i14 = i11 + 85;
        f51819o = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 91 / 0;
        }
        return settransformationmethod;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        TerminalErrorCodes terminalErrorCodes = (TerminalErrorCodes) objArr[0];
        int i13 = f51819o + 87;
        f51818n = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(terminalErrorCodes, "");
        terminalErrorCodes.setOnFocusChangeListener(terminalErrorCodes.f51826d.setX());
        int i15 = f51819o + 115;
        f51818n = i15 % 128;
        if (i15 % 2 == 0) {
            return null;
        }
        int i16 = 83 / 0;
        return null;
    }

    public final synchronized Future<setAutoSizeTextTypeUniformWithPresetSizes> d(getTransactionPortrait gettransactionportrait) {
        try {
            setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = (setAutoSizeTextTypeUniformWithPresetSizes) this.f51827e.get(gettransactionportrait);
            if (setautosizetexttypeuniformwithpresetsizes != null) {
                int i10 = f51818n + 5;
                f51819o = i10 % 128;
                int i11 = i10 % 2;
                if (f(setautosizetexttypeuniformwithpresetsizes)) {
                    Object[] objArr = new Object[1];
                    a(126 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{Intrinsics.stringPlus(((String) objArr[0]).intern(), gettransactionportrait)}, 2065174743, -2065174734, (int) System.currentTimeMillis());
                    CompletableFuture completableFutureCompletedFuture = CompletableFuture.completedFuture(setautosizetexttypeuniformwithpresetsizes);
                    Intrinsics.checkNotNullExpressionValue(completableFutureCompletedFuture, "");
                    int i12 = f51819o + 79;
                    f51818n = i12 % 128;
                    if (i12 % 2 == 0) {
                        return completableFutureCompletedFuture;
                    }
                    throw null;
                }
                throw th;
            }
            LinkedHashMap linkedHashMap = this.f51828f;
            Object onFocusChangeListener = linkedHashMap.get(gettransactionportrait);
            if (onFocusChangeListener == null) {
                onFocusChangeListener = this.f51825c.setOnFocusChangeListener(new a(gettransactionportrait));
                linkedHashMap.put(gettransactionportrait, onFocusChangeListener);
            }
            Future<setAutoSizeTextTypeUniformWithPresetSizes> future = (Future) onFocusChangeListener;
            int i13 = f51818n + 109;
            f51819o = i13 % 128;
            if (i13 % 2 != 0) {
                return future;
            }
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean f(setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes) {
        Object next;
        Iterator<T> it = this.f51826d.setY().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            getAmountOther getamountother = (getAmountOther) next;
            if (((getTransactionPortrait) getAmountOther.setX(new Object[]{getamountother}, 1463202478, -1463202478, System.identityHashCode(getamountother))) == ((getTransactionPortrait) setAutoSizeTextTypeUniformWithPresetSizes.setCompoundDrawableTintBlendMode(new Object[]{setautosizetexttypeuniformwithpresetsizes}, -2144215474, 2144215475, System.identityHashCode(setautosizetexttypeuniformwithpresetsizes)))) {
                int i10 = f51819o + 119;
                f51818n = i10 % 128;
                int i11 = i10 % 2;
                break;
            }
            int i12 = f51818n + 29;
            f51819o = i12 % 128;
            int i13 = i12 % 2;
        }
        getAmountOther getamountother2 = (getAmountOther) next;
        getClearButtonText getclearbuttontext = getamountother2 != null ? (getClearButtonText) getAmountOther.setX(new Object[]{getamountother2}, 883808993, -883808992, System.identityHashCode(getamountother2)) : null;
        if (Intrinsics.areEqual(getclearbuttontext, getClearButtonText.setX.INSTANCE)) {
            return true;
        }
        if (Intrinsics.areEqual(getclearbuttontext, getClearButtonText.setCompoundDrawableTintBlendMode.INSTANCE)) {
            return !((Boolean) setAutoSizeTextTypeUniformWithPresetSizes.setCompoundDrawableTintBlendMode(new Object[]{setautosizetexttypeuniformwithpresetsizes}, -418746983, 418746985, System.identityHashCode(setautosizetexttypeuniformwithpresetsizes))).booleanValue();
        }
        if (Intrinsics.areEqual(getclearbuttontext, getClearButtonText.setY.INSTANCE)) {
            return false;
        }
        if (getclearbuttontext != null) {
            throw new NoWhenBranchMatchedException();
        }
        int i14 = f51819o + 1;
        f51818n = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    @NotNull
    public final Map<getTransactionPortrait, Future<setAutoSizeTextTypeUniformWithPresetSizes>> setOnFocusChangeListener(@NotNull List<? extends getTransactionPortrait> p4) {
        Intrinsics.checkNotNullParameter(p4, "");
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap = this.f51828f;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    int i10 = f51818n + 119;
                    f51819o = i10 % 128;
                    int i11 = i10 % 2;
                    if (((Future) entry.getValue()).isDone()) {
                        int i12 = f51818n + 95;
                        f51819o = i12 % 128;
                        int i13 = i12 % 2;
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                    int i14 = f51818n + 31;
                    f51819o = i14 % 128;
                    int i15 = i14 % 2;
                }
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    getTransactionPortrait gettransactionportrait = (getTransactionPortrait) entry2.getKey();
                    this.f51827e.put(gettransactionportrait, setTextDirection.setX((Future) entry2.getValue(), gettransactionportrait));
                    this.f51828f.remove(gettransactionportrait);
                    int i16 = f51818n + 79;
                    f51819o = i16 % 128;
                    int i17 = i16 % 2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Collection collectionValues = this.f51827e.values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        int i18 = f51818n + 35;
        f51819o = i18 % 128;
        int i19 = i18 % 2;
        while (true) {
            boolean z10 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = (setAutoSizeTextTypeUniformWithPresetSizes) next;
            if (!((Boolean) setAutoSizeTextTypeUniformWithPresetSizes.setCompoundDrawableTintBlendMode(new Object[]{setautosizetexttypeuniformwithpresetsizes}, -418746983, 418746985, System.identityHashCode(setautosizetexttypeuniformwithpresetsizes))).booleanValue()) {
                int i20 = f51819o + 63;
                f51818n = i20 % 128;
                int i21 = i20 % 2;
                z10 = true;
            }
            if (!(!z10)) {
                int i22 = f51818n + 41;
                f51819o = i22 % 128;
                int i23 = i22 % 2;
                arrayList.add(next);
            }
        }
        int i24 = f51819o + 29;
        f51818n = i24 % 128;
        int i25 = i24 % 2;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes2 = (setAutoSizeTextTypeUniformWithPresetSizes) obj;
            if (!p4.contains((getTransactionPortrait) setAutoSizeTextTypeUniformWithPresetSizes.setCompoundDrawableTintBlendMode(new Object[]{setautosizetexttypeuniformwithpresetsizes2}, -2144215474, 2144215475, System.identityHashCode(setautosizetexttypeuniformwithpresetsizes2)))) {
                int i26 = f51819o + 111;
                f51818n = i26 % 128;
                int i27 = i26 % 2;
                arrayList2.add(obj);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(c.coerceAtLeast(p.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int i28 = f51819o + 113;
            f51818n = i28 % 128;
            if (i28 % 2 != 0) {
                setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes3 = (setAutoSizeTextTypeUniformWithPresetSizes) it2.next();
                Pair pair = TuplesKt.to((getTransactionPortrait) setAutoSizeTextTypeUniformWithPresetSizes.setCompoundDrawableTintBlendMode(new Object[]{setautosizetexttypeuniformwithpresetsizes3}, -2144215474, 2144215475, System.identityHashCode(setautosizetexttypeuniformwithpresetsizes3)), CompletableFuture.completedFuture(setautosizetexttypeuniformwithpresetsizes3));
                linkedHashMap3.put(pair.getFirst(), pair.getSecond());
                throw null;
            }
            setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes4 = (setAutoSizeTextTypeUniformWithPresetSizes) it2.next();
            Pair pair2 = TuplesKt.to((getTransactionPortrait) setAutoSizeTextTypeUniformWithPresetSizes.setCompoundDrawableTintBlendMode(new Object[]{setautosizetexttypeuniformwithpresetsizes4}, -2144215474, 2144215475, System.identityHashCode(setautosizetexttypeuniformwithpresetsizes4)), CompletableFuture.completedFuture(setautosizetexttypeuniformwithpresetsizes4));
            linkedHashMap3.put(pair2.getFirst(), pair2.getSecond());
        }
        List<? extends getTransactionPortrait> list = p4;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(f.a(list, 10, 16));
        for (Object obj2 : list) {
            linkedHashMap4.put(obj2, d((getTransactionPortrait) obj2));
        }
        Map<getTransactionPortrait, Future<setAutoSizeTextTypeUniformWithPresetSizes>> mapPlus = q.plus(linkedHashMap4, linkedHashMap3);
        int i29 = f51818n + 5;
        f51819o = i29 % 128;
        if (i29 % 2 == 0) {
            int i30 = 94 / 0;
        }
        return mapPlus;
    }

    public final synchronized void setCompoundDrawableTintBlendMode(@NotNull Duration p4, @NotNull List<? extends getTransactionPortrait> p10) {
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p10, "");
        ReentrantLock reentrantLock = this.f51830h;
        reentrantLock.lock();
        try {
            boolean y7 = setY();
            this.f51826d = setSupportImageTintMode.setOnFocusChangeListener(this.f51826d, p4, p10);
            if (y7) {
                int i10 = f51819o + 3;
                f51818n = i10 % 128;
                int i11 = i10 % 2;
                setCompoundDrawableTintBlendMode();
                int i12 = f51818n + 25;
                f51819o = i12 % 128;
                int i13 = i12 % 2;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final /* synthetic */ setColorFilter setY(TerminalErrorCodes terminalErrorCodes) {
        int i10 = f51818n + 99;
        f51819o = i10 % 128;
        int i11 = i10 % 2;
        setColorFilter setcolorfilter = terminalErrorCodes.f51823a;
        if (i11 == 0) {
            int i12 = 35 / 0;
        }
        return setcolorfilter;
    }

    public final boolean setY() {
        int i10 = f51818n + 75;
        f51819o = i10 % 128;
        int i11 = i10 % 2;
        ReentrantLock reentrantLock = this.f51830h;
        reentrantLock.lock();
        try {
            boolean z10 = this.f51829g != null;
            if (z10) {
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.f51823a, 10, null, null, 6}, 1173867142, -1173867141, 10);
            }
            ScheduledExecutorService scheduledExecutorService = this.f51829g;
            if (scheduledExecutorService != null) {
                int i12 = f51818n + 105;
                f51819o = i12 % 128;
                int i13 = i12 % 2;
                scheduledExecutorService.shutdownNow();
            }
            this.f51829g = null;
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setCompoundDrawableTintBlendMode() {
        ScheduledExecutorService scheduledExecutorService;
        int i10 = f51819o + 87;
        f51818n = i10 % 128;
        int i11 = i10 % 2;
        setColorFilter setcolorfilter = this.f51823a;
        ReentrantLock reentrantLock = this.f51830h;
        int i12 = 3;
        reentrantLock.lock();
        try {
            if (i11 != 0) {
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 1, getDisplayExponent.setY(String.valueOf(this.f51826d.setOnFocusChangeListener().toMillis())), null, 4}, 1173867142, -1173867141, 1);
                scheduledExecutorService = this.f51829g;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
            } else {
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 9, getDisplayExponent.setY(String.valueOf(this.f51826d.setOnFocusChangeListener().toMillis())), null, 4}, 1173867142, -1173867141, 9);
                scheduledExecutorService = this.f51829g;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
            scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new d(this, i12), this.f51826d.setOnFocusChangeListener().toMillis(), this.f51826d.setOnFocusChangeListener().toMillis(), TimeUnit.MILLISECONDS);
            Unit unit = Unit.INSTANCE;
            this.f51829g = scheduledExecutorServiceNewScheduledThreadPool;
            reentrantLock.unlock();
            int i13 = f51818n + 25;
            f51819o = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
