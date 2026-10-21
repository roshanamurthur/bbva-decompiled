package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.esotericsoftware.kryo.serializers.d;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0003\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/mypinpad/tsdk/i/setLineSpacing;", "Lcom/mypinpad/tsdk/i/setScrollCaptureCallback;", "Lcom/mypinpad/tsdk/i/setAutoSizeTextTypeUniformWithPresetSizes;", "setX", "()Lcom/mypinpad/tsdk/i/setAutoSizeTextTypeUniformWithPresetSizes;", "Lcom/mypinpad/tsdk/i/getTransactionPortrait;", "c", "Lcom/mypinpad/tsdk/i/getTransactionPortrait;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/getTransactionPortrait;"}, k = 1, mv = {1, 5, 1})
public final class setLineSpacing implements setScrollCaptureCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f59996d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f59997e = 1;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f59998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<Function0<Unit>, Unit> f59999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final getTransactionPortrait setX;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setOnFocusChangeListener", "()V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final int f60001r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final byte[] f60002s0 = null;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CompletableFuture<Boolean> f60004q0;

        static {
            b();
            f60001r0 = 1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CompletableFuture<Boolean> completableFuture) {
            super(0);
            this.f60004q0 = completableFuture;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002c  */
        /* JADX WARN: Code duplicated, block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 4
                int r0 = r7 + 4
                int r6 = r6 * 3
                int r6 = r6 + 4
                int r8 = r8 * 2
                int r8 = r8 + 115
                byte[] r0 = new byte[r0]
                int r7 = r7 + 3
                byte[] r1 = com.mypinpad.tsdk.i.setLineSpacing.a.f60002s0
                r2 = 0
                if (r1 != 0) goto L1a
                r8 = r7
                r4 = r8
                r3 = r2
                r7 = r6
                goto L30
            L1a:
                r3 = r2
                r5 = r7
                r7 = r6
                r6 = r8
                r8 = r5
            L1f:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r8) goto L2c
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L2c:
                int r3 = r3 + 1
                r4 = r1[r7]
            L30:
                int r6 = r6 + r4
                int r6 = r6 + (-6)
                int r7 = r7 + 1
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.setLineSpacing.a.a(int, byte, int, java.lang.Object[]):void");
        }

        public static void b() {
            f60002s0 = new byte[]{75, -103, -4, -79, -8, MessageUtils.MESSAGE_21_NAK, -22};
        }

        public static /* synthetic */ Unit c(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = i13 | i14;
            int i16 = ((~i15) * 497) + (i11 * (-496)) + (i10 * (-496));
            int i17 = ~(i15 | i12);
            int i18 = ~i12;
            int i19 = (((~(i10 | i14 | i12)) | (~(i11 | i13)) | (~(i18 | i13))) * 497) + ((i17 | (~(i14 | i18 | i10))) * 497) + i16;
            int i20 = f60001r0;
            Unit unit = null;
            if (i19 == 1) {
                CompletableFuture completableFutureC = cm.a.c(objArr[0]);
                int iIntValue = ((Number) objArr[1]).intValue();
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int i21 = i20 ^ 65;
                int i22 = -(-((i20 & 65) << 1));
                int i23 = (i21 & i22) + (i22 | i21);
                int i24 = i23 % 128;
                if (i23 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(completableFutureC, "");
                    Companion companion = setLineSpacing.INSTANCE;
                    Companion.setX(new Object[]{completableFutureC, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, 854093853, -854093853, iIntValue);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(completableFutureC, "");
                Companion companion2 = setLineSpacing.INSTANCE;
                Companion.setX(new Object[]{completableFutureC, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, 854093853, -854093853, iIntValue);
            } else if (i19 != 2) {
                a aVar = (a) objArr[0];
                int i25 = ((i20 | 91) << 1) - (i20 ^ 91);
                int i26 = i25 % 128;
                if (i25 % 2 != 0) {
                    c(new Object[]{aVar}, -387487700, 387487702, System.identityHashCode(aVar));
                    Unit unit2 = Unit.INSTANCE;
                    throw null;
                }
                c(new Object[]{aVar}, -387487700, 387487702, System.identityHashCode(aVar));
                unit = Unit.INSTANCE;
                int i27 = i20 & 23;
                int i28 = ((((i20 ^ 23) | i27) << 1) - (~(-((i20 | 23) & (~i27))))) - 1;
                int i29 = i28 % 128;
                if (i28 % 2 != 0) {
                    int i30 = 17 / 0;
                }
            } else {
                a aVar2 = (a) objArr[0];
                int i31 = i20 & 59;
                int i32 = i31 + ((i20 ^ 59) | i31);
                int i33 = i32 % 128;
                try {
                    if (i32 % 2 != 0) {
                        Context context = (Context) setLineSpacing.setY(new Object[]{setLineSpacing.this}, 389776054, -389776053, (int) System.currentTimeMillis());
                        final CompletableFuture<Boolean> completableFuture = aVar2.f60004q0;
                        Object[] objArr2 = {context, 2431, new setScrollerY19005$setX() { // from class: com.mypinpad.tsdk.i.a9
                            @Override // com.mypinpad.tsdk.isolation.setScrollerY19005$setX
                            public final void onRootDetectionResultReceived(int i34, int i35) throws Throwable {
                                int i36 = setLineSpacing.a.f60001r0;
                                setLineSpacing.a.c(new Object[]{completableFuture, Integer.valueOf(i34), Integer.valueOf(i35)}, 1098445933, -1098445932, i34);
                            }
                        }};
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(151372277);
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) (MotionEvent.axisFromString("") + 8126), 37 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 646 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            Object[] objArr3 = new Object[1];
                            a(b10, b11, b11, objArr3);
                            method = cls.getMethod((String) objArr3[0], Context.class, Integer.TYPE, setScrollerY19005$setX.class);
                            map.put(151372277, method);
                        }
                        ((Method) method).invoke(null, objArr2);
                    } else {
                        Context context2 = (Context) setLineSpacing.setY(new Object[]{setLineSpacing.this}, 389776054, -389776053, (int) System.currentTimeMillis());
                        final CompletableFuture<Boolean> completableFuture2 = aVar2.f60004q0;
                        Object[] objArr4 = {context2, 512, new setScrollerY19005$setX() { // from class: com.mypinpad.tsdk.i.a9
                            @Override // com.mypinpad.tsdk.isolation.setScrollerY19005$setX
                            public final void onRootDetectionResultReceived(int i34, int i35) throws Throwable {
                                int i36 = setLineSpacing.a.f60001r0;
                                setLineSpacing.a.c(new Object[]{completableFuture2, Integer.valueOf(i34), Integer.valueOf(i35)}, 1098445933, -1098445932, i34);
                            }
                        }};
                        Map map2 = setTextScaleX.setMaxEms;
                        Object method2 = map2.get(151372277);
                        if (method2 == null) {
                            Class cls2 = (Class) setTextScaleX.setX((char) (TextUtils.getTrimmedLength("") + 8125), 37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 646 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                            byte b12 = (byte) 0;
                            byte b13 = b12;
                            Object[] objArr5 = new Object[1];
                            a(b12, b13, b13, objArr5);
                            method2 = cls2.getMethod((String) objArr5[0], Context.class, Integer.TYPE, setScrollerY19005$setX.class);
                            map2.put(151372277, method2);
                        }
                        ((Method) method2).invoke(null, objArr4);
                    }
                    int i34 = ((i20 & 126) + (i20 | 126)) - 1;
                    int i35 = i34 % 128;
                    int i36 = i34 % 2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            return unit;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return c(new Object[]{this}, 103271474, -103271474, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "p0", "setCompoundDrawableTintBlendMode", "(Lkotlin/jvm/functions/Function0;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends Lambda implements Function1<Function0<? extends Unit>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f60005p0 = new b();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f60006q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60007r0 = 1;

        static {
            int i10 = f60007r0 + 29;
            f60006q0 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 0 / 0;
            }
        }

        public b() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i12;
            int i14 = ~i11;
            int i15 = (((~(i10 | i11 | i12)) | (~(i13 | i14)) | (~((~i10) | i14))) * 757) + ((~(i14 | i10 | i12)) * 1514) + ((i10 | i13) * (-757)) + (i11 * (-756)) + (i10 * 758);
            if (i15 == 1) {
                final Function0 function0 = (Function0) objArr[1];
                Intrinsics.checkNotNullParameter(function0, "");
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.mypinpad.tsdk.i.b9
                    @Override // java.lang.Runnable
                    public final void run() {
                        setLineSpacing.b bVar = setLineSpacing.b.f60005p0;
                        setLineSpacing.b.a(new Object[]{function0}, -1702361136, 1702361136, (int) System.currentTimeMillis());
                    }
                });
                int i16 = f60006q0;
                int i17 = i16 & 9;
                int i18 = ((i16 ^ 9) | i17) << 1;
                int i19 = -((i16 | 9) & (~i17));
                int i20 = (i18 & i19) + (i19 | i18);
                f60007r0 = i20 % 128;
                if (i20 % 2 != 0) {
                    return null;
                }
                int i21 = 9 / 0;
                return null;
            }
            if (i15 != 2) {
                Function0 function1 = (Function0) objArr[0];
                int i22 = f60006q0;
                int i23 = (i22 ^ 5) + ((i22 & 5) << 1);
                f60007r0 = i23 % 128;
                int i24 = i23 % 2;
                Intrinsics.checkNotNullParameter(function1, "");
                function1.invoke();
                int i25 = f60007r0;
                int i26 = (((i25 & (-96)) | ((~i25) & 95)) - (~(-(-((i25 & 95) << 1))))) - 1;
                f60006q0 = i26 % 128;
                int i27 = i26 % 2;
                return null;
            }
            b bVar = (b) objArr[0];
            Object obj = objArr[1];
            int i28 = f60006q0;
            int i29 = i28 & 69;
            int i30 = ((((i28 ^ 69) | i29) << 1) - (~(-((i28 | 69) & (~i29))))) - 1;
            f60007r0 = i30 % 128;
            Function0 function2 = (Function0) obj;
            if (i30 % 2 == 0) {
                a(new Object[]{bVar, function2}, -963654250, 963654251, System.identityHashCode(bVar));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            a(new Object[]{bVar, function2}, -963654250, 963654251, System.identityHashCode(bVar));
            Unit unit2 = Unit.INSTANCE;
            int i31 = f60007r0;
            int i32 = i31 & 85;
            int i33 = (i32 - (~((i31 ^ 85) | i32))) - 1;
            f60006q0 = i33 % 128;
            if (i33 % 2 == 0) {
                return unit2;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
            return a(new Object[]{this, function0}, 1750377266, -1750377264, System.identityHashCode(this));
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.setLineSpacing$setX, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/setLineSpacing$setX;", "", "Ljava/util/concurrent/CompletableFuture;", "", "p0", "", "p1", "p2", "", "setDividerPadding", "(Ljava/util/concurrent/CompletableFuture;II)V", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f60008a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f60009b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static void setDividerPadding(@NotNull CompletableFuture<Boolean> p4, int p10, int p11) {
            setX(new Object[]{p4, Integer.valueOf(p10), Integer.valueOf(p11)}, 854093853, -854093853, p10);
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            boolean z10 = false;
            CompletableFuture completableFutureC = cm.a.c(objArr[0]);
            int iIntValue = ((Number) objArr[1]).intValue();
            int iIntValue2 = ((Number) objArr[2]).intValue();
            int i13 = f60009b;
            int i14 = i13 & 93;
            int i15 = (i13 ^ 93) | i14;
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            f60008a = i16 % 128;
            if (i16 % 2 != 0) {
                Intrinsics.checkNotNullParameter(completableFutureC, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(completableFutureC, "");
            if (iIntValue != iIntValue2) {
                int i17 = f60009b;
                int i18 = ((i17 & 35) - (~(-(-(i17 | 35))))) - 1;
                f60008a = i18 % 128;
                int i19 = i18 % 2;
                int i20 = i17 & 101;
                int i21 = (i20 - (~(-(-((i17 ^ 101) | i20))))) - 1;
                f60008a = i21 % 128;
                int i22 = i21 % 2;
                z10 = true;
            } else {
                int i23 = f60008a;
                int i24 = i23 & 121;
                int i25 = -(-(i23 | 121));
                int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                f60009b = i26 % 128;
                int i27 = i26 % 2;
            }
            completableFutureC.complete(Boolean.valueOf(z10));
            int i28 = f60008a + 22;
            int i29 = (i28 ^ (-1)) + (i28 << 1);
            f60009b = i29 % 128;
            int i30 = i29 % 2;
            return null;
        }
    }

    static {
        int i10 = f59996d;
        int i11 = i10 & 89;
        int i12 = i11 + ((i10 ^ 89) | i11);
        f59997e = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public setLineSpacing() {
        throw null;
    }

    public setLineSpacing(Context context, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        function1 = (i10 & 2) != 0 ? b.f60005p0 : function1;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.f59998a = context;
        this.f59999b = function1;
        this.setX = getTransactionPortrait.setOnDragListener;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws ExecutionException, InterruptedException {
        int i13 = (((~i10) | i11) * 160) + (i11 * (-159)) + (i10 * (-159));
        int i14 = ~i12;
        int i15 = ((i10 | (~((~i11) | i14))) * 160) + (((~(i14 | i10)) | (~(i10 | i11))) * (-160)) + i13;
        if (i15 == 1) {
            setLineSpacing setlinespacing = (setLineSpacing) objArr[0];
            int i16 = f59997e;
            int i17 = i16 & 99;
            int i18 = -(-(i16 | 99));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            int i20 = i19 % 128;
            f59996d = i20;
            int i21 = i19 % 2;
            Context context = setlinespacing.f59998a;
            if (i21 != 0) {
                throw null;
            }
            int i22 = ((i20 | 85) << 1) - (i20 ^ 85);
            f59997e = i22 % 128;
            int i23 = i22 % 2;
            return context;
        }
        if (i15 != 2) {
            setLineSpacing setlinespacing2 = (setLineSpacing) objArr[0];
            int i24 = f59996d;
            int i25 = i24 + 99;
            f59997e = i25 % 128;
            int i26 = i25 % 2;
            getTransactionPortrait gettransactionportrait = setlinespacing2.setX;
            if (i26 == 0) {
                int i27 = 69 / 0;
            }
            int i28 = (i24 ^ 41) + ((i24 & 41) << 1);
            f59997e = i28 % 128;
            if (i28 % 2 != 0) {
                return gettransactionportrait;
            }
            throw null;
        }
        setLineSpacing setlinespacing3 = (setLineSpacing) objArr[0];
        CompletableFuture completableFutureB = d.b();
        setlinespacing3.f59999b.invoke(setlinespacing3.new a(completableFutureB));
        Object obj = completableFutureB.get();
        Intrinsics.checkNotNullExpressionValue(obj, "");
        if (!((Boolean) obj).booleanValue()) {
            setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{setlinespacing3}, -2060556907, 2060556908, (int) System.currentTimeMillis());
            int i29 = f59997e + 27;
            f59996d = i29 % 128;
            int i30 = i29 % 2;
            return setautosizetexttypeuniformwithpresetsizes;
        }
        int i31 = f59997e;
        int i32 = ((i31 | 39) << 1) - (i31 ^ 39);
        f59996d = i32 % 128;
        if (i32 % 2 == 0) {
            return (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{setlinespacing3}, -462901680, 462901680, (int) System.currentTimeMillis());
        }
        int i33 = 72 / 0;
        return (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{setlinespacing3}, -462901680, 462901680, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @JvmName(name = "setDividerPadding")
    @NotNull
    public final getTransactionPortrait setDividerPadding() {
        return (getTransactionPortrait) setY(new Object[]{this}, 48351773, -48351773, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final setAutoSizeTextTypeUniformWithPresetSizes setX() {
        return (setAutoSizeTextTypeUniformWithPresetSizes) setY(new Object[]{this}, -1439339042, 1439339044, System.identityHashCode(this));
    }

    public static final /* synthetic */ Context setY(setLineSpacing setlinespacing) {
        return (Context) setY(new Object[]{setlinespacing}, 389776054, -389776053, (int) System.currentTimeMillis());
    }
}
