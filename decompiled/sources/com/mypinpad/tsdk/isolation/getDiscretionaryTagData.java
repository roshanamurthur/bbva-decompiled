package com.mypinpad.tsdk.isolation;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import androidx.appcompat.widget.x1;
import androidx.camera.core.b0;
import androidx.room.h;
import androidx.room.i;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class getDiscretionaryTagData implements setBackgroundDrawable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55775d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f55776e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public WeakReference<setLastBaselineToBottomHeight> f55777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Application.ActivityLifecycleCallbacks f55778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f55779c = new AtomicBoolean(false);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/app/Activity;", "p0", "", "j_", "(Landroid/app/Activity;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<Activity, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55780q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55781r0 = 1;

        public a() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0051  */
        /* JADX WARN: Code duplicated, block: B:15:0x006f  */
        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            Unit unit;
            int i13 = ~i10;
            int i14 = ~i11;
            if (((i10 | i12) * 104) + ((~(i11 | (~i12) | i10)) * (-104)) + (((~(i13 | i14)) | (~(i14 | i12))) * 104) + (i11 * (-103)) + (i10 * (-103)) != 1) {
                a aVar = (a) objArr[0];
                Activity activity = (Activity) objArr[1];
                int i15 = f55780q0;
                int i16 = i15 ^ 63;
                int i17 = ((((i15 & 63) | i16) << 1) - (~(-i16))) - 1;
                f55781r0 = i17 % 128;
                if (i17 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(activity, "");
                    int i18 = 23 / 0;
                    if (!(!(activity instanceof setLastBaselineToBottomHeight))) {
                        if (((AtomicBoolean) getDiscretionaryTagData.setY(new Object[]{getDiscretionaryTagData.this}, 185428053, -185428051, (int) System.currentTimeMillis())).get()) {
                            int i19 = f55781r0;
                            int i20 = ((i19 ^ 95) | (i19 & 95)) << 1;
                            int i21 = -(((~i19) & 95) | (i19 & (-96)));
                            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                            f55780q0 = i22 % 128;
                            int i23 = i22 % 2;
                            getDiscretionaryTagData.setY(new Object[]{getDiscretionaryTagData.this, (setLastBaselineToBottomHeight) activity}, 364883674, -364883673, (int) System.currentTimeMillis());
                            int i24 = f55781r0;
                            int i25 = i24 & 31;
                            int i26 = i25 + ((i24 ^ 31) | i25);
                            f55780q0 = i26 % 128;
                            int i27 = i26 % 2;
                        }
                    }
                } else {
                    Intrinsics.checkNotNullParameter(activity, "");
                    if (!(!(activity instanceof setLastBaselineToBottomHeight))) {
                        if (((AtomicBoolean) getDiscretionaryTagData.setY(new Object[]{getDiscretionaryTagData.this}, 185428053, -185428051, (int) System.currentTimeMillis())).get()) {
                            int i110 = f55781r0;
                            int i28 = ((i110 ^ 95) | (i110 & 95)) << 1;
                            int i29 = -(((~i110) & 95) | (i110 & (-96)));
                            int i210 = ((i28 | i29) << 1) - (i29 ^ i28);
                            f55780q0 = i210 % 128;
                            int i211 = i210 % 2;
                            getDiscretionaryTagData.setY(new Object[]{getDiscretionaryTagData.this, (setLastBaselineToBottomHeight) activity}, 364883674, -364883673, (int) System.currentTimeMillis());
                            int i212 = f55781r0;
                            int i213 = i212 & 31;
                            int i214 = i213 + ((i212 ^ 31) | i213);
                            f55780q0 = i214 % 128;
                            int i215 = i214 % 2;
                        }
                    }
                }
                int i30 = f55781r0 + 113;
                f55780q0 = i30 % 128;
                unit = null;
                if (i30 % 2 != 0) {
                    throw null;
                }
            } else {
                a aVar2 = (a) objArr[0];
                Object obj = objArr[1];
                int i31 = f55781r0;
                int i32 = i31 & 115;
                int i33 = (i31 ^ 115) | i32;
                int i34 = (i32 & i33) + (i33 | i32);
                f55780q0 = i34 % 128;
                int i35 = i34 % 2;
                a(new Object[]{aVar2, (Activity) obj}, -93494483, 93494483, System.identityHashCode(aVar2));
                unit = Unit.INSTANCE;
                int i36 = f55780q0;
                int i37 = i36 & 25;
                int i38 = (i36 | 25) & (~i37);
                int i39 = -(-(i37 << 1));
                int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
                f55781r0 = i40 % 128;
                if (i40 % 2 == 0) {
                    int i41 = 21 / 0;
                }
            }
            return unit;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Activity activity) {
            return a(new Object[]{this, activity}, 81650353, -81650352, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/app/Activity;", "p0", "Landroid/os/Bundle;", "p1", "", "i_", "(Landroid/app/Activity;Landroid/os/Bundle;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends Lambda implements Function2<Activity, Bundle, Unit> {

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static int f55783w0 = 0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static int f55784x0 = 1;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Integer, Integer, Unit> f55786q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Float, Float, Unit> f55787r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55788s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55789t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Context f55790u0;
        public final /* synthetic */ component28 v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super Integer, ? super Integer, Unit> function2, Function2<? super Float, ? super Float, Unit> function3, Function0<Unit> function0, Function0<Unit> function1, Context context, component28 component28Var) {
            super(2);
            this.f55786q0 = function2;
            this.f55787r0 = function3;
            this.f55788s0 = function0;
            this.f55789t0 = function1;
            this.f55790u0 = context;
            this.v0 = component28Var;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            int i13 = ~i12;
            int i14 = i13 | i10;
            int i15 = ((~(i14 | i11)) * 52) + (i11 * 53) + (i10 * (-51));
            int i16 = ~i11;
            int i17 = (((~i14) | (~(i16 | i10)) | (~(i16 | i13))) * (-52)) + i15;
            int i18 = ~i10;
            if ((((~(i18 | i11)) | (~(i13 | i18))) * 52) + i17 != 1) {
                b bVar = (b) objArr[0];
                Object obj = objArr[1];
                Object obj2 = objArr[2];
                int i19 = f55783w0;
                int i20 = i19 & 101;
                int i21 = (i19 ^ 101) | i20;
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                f55784x0 = i22 % 128;
                Activity activity = (Activity) obj;
                Bundle bundle = (Bundle) obj2;
                if (i22 % 2 == 0) {
                    a(new Object[]{bVar, activity, bundle}, -509823524, 509823525, System.identityHashCode(bVar));
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                a(new Object[]{bVar, activity, bundle}, -509823524, 509823525, System.identityHashCode(bVar));
                Unit unit2 = Unit.INSTANCE;
                int i23 = f55784x0 + 41;
                f55783w0 = i23 % 128;
                int i24 = i23 % 2;
                return unit2;
            }
            b bVar2 = (b) objArr[0];
            Activity activity2 = (Activity) objArr[1];
            int i25 = f55783w0 + 93;
            f55784x0 = i25 % 128;
            int i26 = i25 % 2;
            Intrinsics.checkNotNullParameter(activity2, "");
            if (activity2 instanceof setLastBaselineToBottomHeight) {
                int i27 = f55784x0 + 23;
                f55783w0 = i27 % 128;
                if (i27 % 2 != 0) {
                    ((AtomicBoolean) getDiscretionaryTagData.setY(new Object[]{getDiscretionaryTagData.this}, 185428053, -185428051, (int) System.currentTimeMillis())).get();
                    throw null;
                }
                boolean z10 = !((AtomicBoolean) getDiscretionaryTagData.setY(new Object[]{getDiscretionaryTagData.this}, 185428053, -185428051, (int) System.currentTimeMillis())).get();
                getDiscretionaryTagData getdiscretionarytagdata = getDiscretionaryTagData.this;
                if (!z10) {
                    int i28 = f55784x0;
                    int i29 = ((i28 & (-96)) | ((~i28) & 95)) + ((i28 & 95) << 1);
                    f55783w0 = i29 % 128;
                    if (i29 % 2 == 0) {
                        getDiscretionaryTagData.setY(new Object[]{getdiscretionarytagdata, (setLastBaselineToBottomHeight) activity2}, 364883674, -364883673, (int) System.currentTimeMillis());
                        return null;
                    }
                    getDiscretionaryTagData.setY(new Object[]{getdiscretionarytagdata, (setLastBaselineToBottomHeight) activity2}, 364883674, -364883673, (int) System.currentTimeMillis());
                    throw null;
                }
                getDiscretionaryTagData.setY(new Object[]{getdiscretionarytagdata, new WeakReference(activity2)}, 2114772183, -2114772172, (int) System.currentTimeMillis());
                setLastBaselineToBottomHeight setlastbaselinetobottomheight = (setLastBaselineToBottomHeight) activity2;
                setlastbaselinetobottomheight.setY(bVar2.f55786q0);
                setlastbaselinetobottomheight.setDividerPadding(bVar2.f55787r0);
                setLastBaselineToBottomHeight.setDividerPadding(new Object[]{setlastbaselinetobottomheight, bVar2.f55788s0}, 941984570, -941984570, System.identityHashCode(setlastbaselinetobottomheight));
                setlastbaselinetobottomheight.setOnFocusChangeListener(bVar2.f55789t0);
                setlastbaselinetobottomheight.setDividerPadding(new component34(((Boolean) setScrollCaptureHint.setDividerPadding(new Object[]{bVar2.f55790u0}, 876804243, -876804241, (int) System.currentTimeMillis())).booleanValue(), bVar2.v0).setY());
                int i30 = f55784x0;
                int i31 = i30 & 17;
                int i32 = i30 | 17;
                int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                f55783w0 = i33 % 128;
                int i34 = i33 % 2;
            }
            int i35 = f55784x0;
            int i36 = i35 & 31;
            int i37 = (i35 | 31) & (~i36);
            int i38 = -(-(i36 << 1));
            int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
            f55783w0 = i39 % 128;
            if (i39 % 2 == 0) {
                return null;
            }
            int i40 = 96 / 0;
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Activity activity, Bundle bundle) {
            return a(new Object[]{this, activity, bundle}, 2122546182, -2122546182, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/app/Activity;", "p0", "", "k_", "(Landroid/app/Activity;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c extends Lambda implements Function1<Activity, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55791q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55792r0 = 1;

        public c() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            int i13 = ~i10;
            if ((((~(i10 | i12)) | i11) * 272) + (((~(i13 | i12)) | (~(i13 | i11))) * (-272)) + (((~((~i11) | i13 | (~i12))) | (~(i10 | i11 | i12))) * (-272)) + (i11 * (-271)) + (i10 * 273) == 1) {
                c cVar = (c) objArr[0];
                Object obj = objArr[1];
                int i14 = f55791q0 + 83;
                f55792r0 = i14 % 128;
                Activity activity = (Activity) obj;
                Object[] objArr2 = new Object[2];
                if (i14 % 2 != 0) {
                    objArr2[0] = cVar;
                    objArr2[1] = activity;
                    a(objArr2, -686310224, 686310224, System.identityHashCode(cVar));
                    return Unit.INSTANCE;
                }
                objArr2[0] = cVar;
                objArr2[1] = activity;
                a(objArr2, -686310224, 686310224, System.identityHashCode(cVar));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            c cVar2 = (c) objArr[0];
            Activity activity2 = (Activity) objArr[1];
            int i15 = f55792r0;
            int i16 = (i15 ^ 75) + ((i15 & 75) << 1);
            f55791q0 = i16 % 128;
            int i17 = i16 % 2;
            Intrinsics.checkNotNullParameter(activity2, "");
            if (activity2 instanceof setLastBaselineToBottomHeight) {
                int i18 = f55791q0;
                int i19 = i18 ^ 121;
                int i20 = ((((i18 & 121) | i19) << 1) - (~(-i19))) - 1;
                f55792r0 = i20 % 128;
                int i21 = i20 % 2;
                if (((AtomicBoolean) getDiscretionaryTagData.setY(new Object[]{getDiscretionaryTagData.this}, 185428053, -185428051, (int) System.currentTimeMillis())).get()) {
                    int i22 = f55791q0;
                    int i23 = i22 & 117;
                    int i24 = ((((i22 ^ 117) | i23) << 1) - (~(-((i22 | 117) & (~i23))))) - 1;
                    f55792r0 = i24 % 128;
                    int i25 = i24 % 2;
                    getDiscretionaryTagData getdiscretionarytagdata = getDiscretionaryTagData.this;
                    if (i25 == 0) {
                        getDiscretionaryTagData.setY(new Object[]{getdiscretionarytagdata, (setLastBaselineToBottomHeight) activity2}, 364883674, -364883673, (int) System.currentTimeMillis());
                        throw null;
                    }
                    getDiscretionaryTagData.setY(new Object[]{getdiscretionarytagdata, (setLastBaselineToBottomHeight) activity2}, 364883674, -364883673, (int) System.currentTimeMillis());
                }
            }
            int i26 = f55792r0;
            int i27 = ((i26 ^ 19) | (i26 & 19)) << 1;
            int i28 = -(((~i26) & 19) | (i26 & (-20)));
            int i29 = (i27 & i28) + (i28 | i27);
            f55791q0 = i29 % 128;
            if (i29 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Activity activity) {
            return a(new Object[]{this, activity}, -547985360, 547985361, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/app/Activity;", "p0", "", "l_", "(Landroid/app/Activity;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class d extends Lambda implements Function1<Activity, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55794q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55795r0 = 1;

        public d() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            int i13 = ~i10;
            int i14 = (((~(i13 | i11)) | (~(i13 | i12))) * (-566)) + (i11 * (-565)) + (i10 * 567);
            int i15 = ~i11;
            if (((~(i15 | i13 | i12)) * 566) + ((~(i10 | i15)) * 566) + i14 == 1) {
                d dVar = (d) objArr[0];
                Object obj = objArr[1];
                int i16 = f55795r0;
                int i17 = i16 & 109;
                int i18 = i17 + ((i16 ^ 109) | i17);
                f55794q0 = i18 % 128;
                int i19 = i18 % 2;
                a(new Object[]{dVar, (Activity) obj}, 1708631396, -1708631396, System.identityHashCode(dVar));
                Unit unit = Unit.INSTANCE;
                int i20 = f55795r0;
                int i21 = (((i20 | 86) << 1) - (i20 ^ 86)) - 1;
                f55794q0 = i21 % 128;
                int i22 = i21 % 2;
                return unit;
            }
            d dVar2 = (d) objArr[0];
            Activity activity = (Activity) objArr[1];
            int i23 = f55795r0;
            int i24 = i23 ^ 57;
            int i25 = -(-((i23 & 57) << 1));
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            f55794q0 = i26 % 128;
            int i27 = i26 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            if (activity instanceof setLastBaselineToBottomHeight) {
                int i28 = f55795r0;
                int i29 = i28 & 17;
                int i30 = (i28 ^ 17) | i29;
                int i31 = (i29 & i30) + (i30 | i29);
                f55794q0 = i31 % 128;
                int i32 = i31 % 2;
                getDiscretionaryTagData.setY(new Object[]{getDiscretionaryTagData.this, null}, 2114772183, -2114772172, (int) System.currentTimeMillis());
                ((setLastBaselineToBottomHeight) activity).getApplication().unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) getDiscretionaryTagData.setY(new Object[]{getDiscretionaryTagData.this}, -485567309, 485567318, (int) System.currentTimeMillis()));
                int i33 = f55794q0;
                int i34 = (i33 & (-88)) | ((~i33) & 87);
                int i35 = (i33 & 87) << 1;
                int i36 = (i34 & i35) + (i35 | i34);
                f55795r0 = i36 % 128;
                int i37 = i36 % 2;
            }
            int i38 = f55794q0;
            int i39 = i38 | 55;
            int i40 = i39 << 1;
            int i41 = -((~(i38 & 55)) & i39);
            int i42 = (i40 & i41) + (i41 | i40);
            f55795r0 = i42 % 128;
            if (i42 % 2 != 0) {
                return null;
            }
            int i43 = 30 / 0;
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Activity activity) {
            return a(new Object[]{this, activity}, -672680907, 672680908, System.identityHashCode(this));
        }
    }

    public static final /* synthetic */ Application.ActivityLifecycleCallbacks h_(getDiscretionaryTagData getdiscretionarytagdata) {
        return (Application.ActivityLifecycleCallbacks) setY(new Object[]{getdiscretionarytagdata}, -485567309, 485567318, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ AtomicBoolean setOnFocusChangeListener(getDiscretionaryTagData getdiscretionarytagdata) {
        return (AtomicBoolean) setY(new Object[]{getdiscretionarytagdata}, 185428053, -185428051, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0300 A[PHI: r1
      0x0300: PHI (r1v62 com.mypinpad.tsdk.i.setLastBaselineToBottomHeight) = (r1v61 com.mypinpad.tsdk.i.setLastBaselineToBottomHeight), (r1v70 com.mypinpad.tsdk.i.setLastBaselineToBottomHeight) binds: [B:64:0x02fe, B:61:0x02f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0332  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        int i13;
        setLastBaselineToBottomHeight setlastbaselinetobottomheight;
        int i14;
        int i15 = ~i11;
        int i16 = 6;
        int i17 = 3;
        int i18 = 4;
        int i19 = 1;
        setLastBaselineToBottomHeight setlastbaselinetobottomheight2 = null;
        switch ((((~((~i10) | i12)) | i15) * 502) + ((~((~i12) | i15 | i10)) * (-502)) + (((~(i11 | i10)) | (~(i15 | i12))) * (-502)) + (i11 * 503) + (i10 * (-501))) {
            case 1:
                getDiscretionaryTagData getdiscretionarytagdata = (getDiscretionaryTagData) objArr[0];
                setLastBaselineToBottomHeight setlastbaselinetobottomheight3 = (setLastBaselineToBottomHeight) objArr[1];
                int i20 = f55776e;
                int i21 = i20 & 69;
                int i22 = ((i20 ^ 69) | i21) << 1;
                int i23 = -((i20 | 69) & (~i21));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                f55775d = i24 % 128;
                int i25 = i24 % 2;
                setY(new Object[]{getdiscretionarytagdata, setlastbaselinetobottomheight3}, 1625438684, -1625438679, System.identityHashCode(getdiscretionarytagdata));
                int i26 = f55776e;
                int i27 = (i26 & 90) + (i26 | 90);
                int i28 = (i27 ^ (-1)) + (i27 << 1);
                f55775d = i28 % 128;
                int i29 = i28 % 2;
                return null;
            case 2:
                getDiscretionaryTagData getdiscretionarytagdata2 = (getDiscretionaryTagData) objArr[0];
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i30 = ((-746175065) ^ iCurrentTimeMillis) | ((-746175065) & iCurrentTimeMillis);
                int i31 = ((i30 & 1846384256) | (i30 ^ 1846384256)) * (-627);
                int i32 = (((-334649032) | i31) << 1) - (i31 ^ (-334649032));
                int i33 = 746175064 & iCurrentTimeMillis;
                int i34 = -(~(((~(((746175064 | iCurrentTimeMillis) & (~i33)) | i33)) | (-1846384257)) * (-627)));
                int i35 = (i32 & i34) + (i34 | i32);
                int i36 = (i35 ^ (-1)) + (i35 << 1);
                int i37 = ~iCurrentTimeMillis;
                int i38 = i37 & (-746175065);
                int i39 = ((-746175065) | i37) & (~i38);
                int i40 = ~((i39 & i38) | (i39 ^ i38));
                int i41 = (1846384256 & iCurrentTimeMillis) | (i37 & (-1846384257));
                int i42 = iCurrentTimeMillis & (-1846384257);
                int i43 = ~((i42 & i41) | (i41 ^ i42));
                int i44 = i40 ^ i43;
                int i45 = i43 & i40;
                int i46 = ((i45 & i44) | (i44 ^ i45)) * 627;
                int i47 = i36 & i46;
                int i48 = (((i46 | i36) & (~i47)) - (~(-(-(i47 << 1))))) - 1;
                System.currentTimeMillis();
                if (i48 > -382486247) {
                    return getdiscretionarytagdata2.f55779c;
                }
                AtomicBoolean atomicBoolean = getdiscretionarytagdata2.f55779c;
                throw null;
            case 3:
                getDiscretionaryTagData getdiscretionarytagdata3 = (getDiscretionaryTagData) objArr[0];
                final int iIntValue = ((Number) objArr[1]).intValue();
                int i49 = f55776e;
                int i50 = ((i49 | 55) << 1) - (i49 ^ 55);
                f55775d = i50 % 128;
                if (i50 % 2 != 0) {
                    throw null;
                }
                final setLastBaselineToBottomHeight setlastbaselinetobottomheight4 = (setLastBaselineToBottomHeight) setY(new Object[]{getdiscretionarytagdata3}, 1323581614, -1323581602, System.identityHashCode(getdiscretionarytagdata3));
                if (setlastbaselinetobottomheight4 == null) {
                    int i51 = f55775d;
                    int i52 = (i51 & 67) + (i51 | 67);
                    f55776e = i52 % 128;
                    int i53 = i52 % 2;
                    return null;
                }
                int i54 = f55776e;
                int i55 = i54 & 31;
                int i56 = i54 | 31;
                int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                f55775d = i57 % 128;
                if (i57 % 2 != 0) {
                    setlastbaselinetobottomheight4.runOnUiThread(new Runnable() { // from class: com.mypinpad.tsdk.i.m4
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            int i58 = iIntValue;
                            getDiscretionaryTagData.setY(new Object[]{setlastbaselinetobottomheight4, Integer.valueOf(i58)}, -419522597, 419522607, i58);
                        }
                    });
                    int i58 = 98 / 0;
                } else {
                    setlastbaselinetobottomheight4.runOnUiThread(new com.dasnano.vddocumentcapture.fragments.d(setlastbaselinetobottomheight4, iIntValue, i19));
                }
                int i59 = f55775d;
                int i60 = ((i59 & 74) + (i59 | 74)) - 1;
                f55776e = i60 % 128;
                int i61 = i60 % 2;
                return null;
            case 4:
                getDiscretionaryTagData getdiscretionarytagdata4 = (getDiscretionaryTagData) objArr[0];
                int i62 = f55775d;
                int i63 = ((i62 | 11) << 1) - (((~i62) & 11) | (i62 & (-12)));
                f55776e = i63 % 128;
                int i64 = i63 % 2;
                setLastBaselineToBottomHeight setlastbaselinetobottomheight5 = (setLastBaselineToBottomHeight) setY(new Object[]{getdiscretionarytagdata4}, 1323581614, -1323581602, System.identityHashCode(getdiscretionarytagdata4));
                if (setlastbaselinetobottomheight5 == null) {
                    int i65 = f55776e;
                    int i66 = ((i65 & 18) + (i65 | 18)) - 1;
                    f55775d = i66 % 128;
                    int i67 = i66 % 2;
                    return null;
                }
                int i68 = f55775d;
                int i69 = (-2) - (((i68 ^ 16) + ((i68 & 16) << 1)) ^ (-1));
                f55776e = i69 % 128;
                if (i69 % 2 == 0) {
                    setlastbaselinetobottomheight5.runOnUiThread(new h(setlastbaselinetobottomheight5, i16));
                    int i70 = 61 / 0;
                } else {
                    setlastbaselinetobottomheight5.runOnUiThread(new x1(setlastbaselinetobottomheight5, i18));
                }
                int i71 = f55775d;
                int i72 = (i71 ^ 22) + ((i71 & 22) << 1);
                int i73 = (i72 ^ (-1)) + (i72 << 1);
                f55776e = i73 % 128;
                int i74 = i73 % 2;
                return null;
            case 5:
                getDiscretionaryTagData getdiscretionarytagdata5 = (getDiscretionaryTagData) objArr[0];
                setLastBaselineToBottomHeight setlastbaselinetobottomheight6 = (setLastBaselineToBottomHeight) objArr[1];
                int i75 = f55776e;
                int i76 = (i75 ^ 51) + ((i75 & 51) << 1);
                f55775d = i76 % 128;
                if (i76 % 2 != 0) {
                    setlastbaselinetobottomheight6.setOnFocusChangeListener();
                    setlastbaselinetobottomheight6.getApplication().unregisterActivityLifecycleCallbacks(getdiscretionarytagdata5.f55778b);
                    int i77 = 63 / 0;
                } else {
                    setlastbaselinetobottomheight6.setOnFocusChangeListener();
                    setlastbaselinetobottomheight6.getApplication().unregisterActivityLifecycleCallbacks(getdiscretionarytagdata5.f55778b);
                }
                int i78 = f55776e + 43;
                f55775d = i78 % 128;
                if (i78 % 2 == 0) {
                    return null;
                }
                throw null;
            case 6:
                getDiscretionaryTagData getdiscretionarytagdata6 = (getDiscretionaryTagData) objArr[0];
                System.identityHashCode(getdiscretionarytagdata6);
                System.identityHashCode(getdiscretionarytagdata6);
                getdiscretionarytagdata6.f55779c.set(true);
                WeakReference<setLastBaselineToBottomHeight> weakReference = getdiscretionarytagdata6.f55777a;
                if (weakReference != null) {
                    int i79 = f55776e + 38;
                    int i80 = (i79 ^ (-1)) + (i79 << 1);
                    f55775d = i80 % 128;
                    if (i80 % 2 != 0) {
                        setlastbaselinetobottomheight = weakReference.get();
                        int i81 = 38 / 0;
                        if (setlastbaselinetobottomheight != null) {
                            int i82 = f55775d;
                            int i83 = i82 & 33;
                            int i84 = ((i82 | 33) & (~i83)) + (i83 << 1);
                            f55776e = i84 % 128;
                            int i85 = i84 % 2;
                            setY(new Object[]{getdiscretionarytagdata6, setlastbaselinetobottomheight}, 1625438684, -1625438679, System.identityHashCode(getdiscretionarytagdata6));
                            int i86 = f55775d;
                            i13 = ((i86 & 1) - (~(-(-(i86 | 1))))) - 1;
                        } else {
                            int i87 = f55775d;
                            i13 = ((i87 | 117) << 1) - (i87 ^ 117);
                        }
                    } else {
                        setlastbaselinetobottomheight = weakReference.get();
                        if (setlastbaselinetobottomheight != null) {
                            int i88 = f55775d;
                            int i89 = i88 & 33;
                            int i810 = ((i88 | 33) & (~i89)) + (i89 << 1);
                            f55776e = i810 % 128;
                            int i811 = i810 % 2;
                            setY(new Object[]{getdiscretionarytagdata6, setlastbaselinetobottomheight}, 1625438684, -1625438679, System.identityHashCode(getdiscretionarytagdata6));
                            int i812 = f55775d;
                            i13 = ((i812 & 1) - (~(-(-(i812 | 1))))) - 1;
                        } else {
                            int i813 = f55775d;
                            i13 = ((i813 | 117) << 1) - (i813 ^ 117);
                        }
                    }
                } else {
                    int i814 = f55775d;
                    i13 = ((i814 | 117) << 1) - (i814 ^ 117);
                }
                f55776e = i13 % 128;
                int i90 = i13 % 2;
                getdiscretionarytagdata6.f55777a = null;
                int i91 = f55775d + 7;
                f55776e = i91 % 128;
                int i92 = i91 % 2;
                return null;
            case 7:
                getDiscretionaryTagData getdiscretionarytagdata7 = (getDiscretionaryTagData) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int i93 = f55776e;
                int i94 = (i93 ^ 39) + ((i93 & 39) << 1);
                f55775d = i94 % 128;
                int i95 = i94 % 2;
                Intrinsics.checkNotNullParameter(bArr, "");
                setLastBaselineToBottomHeight setlastbaselinetobottomheight7 = (setLastBaselineToBottomHeight) setY(new Object[]{getdiscretionarytagdata7}, 1323581614, -1323581602, System.identityHashCode(getdiscretionarytagdata7));
                if (setlastbaselinetobottomheight7 == null) {
                    int i96 = f55775d + 107;
                    f55776e = i96 % 128;
                    int i97 = i96 % 2;
                    return null;
                }
                int i98 = f55775d;
                int i99 = i98 & 15;
                int i100 = i99 + ((i98 ^ 15) | i99);
                f55776e = i100 % 128;
                if (i100 % 2 == 0) {
                    setlastbaselinetobottomheight7.runOnUiThread(new b0(setlastbaselinetobottomheight7, bArr, i18));
                    throw null;
                }
                setlastbaselinetobottomheight7.runOnUiThread(new i(setlastbaselinetobottomheight7, bArr, i17));
                int i101 = f55775d;
                int i102 = ((i101 ^ 39) | (i101 & 39)) << 1;
                int i103 = -(((~i101) & 39) | (i101 & (-40)));
                int i104 = ((i102 | i103) << 1) - (i103 ^ i102);
                f55776e = i104 % 128;
                if (i104 % 2 != 0) {
                    return null;
                }
                throw null;
            case 8:
                setLastBaselineToBottomHeight setlastbaselinetobottomheight8 = (setLastBaselineToBottomHeight) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                Intrinsics.checkNotNullParameter(bArr2, "");
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(bArr2));
                Intrinsics.checkNotNullExpressionValue(bitmapDecodeStream, "");
                setlastbaselinetobottomheight8.p_(bitmapDecodeStream);
                int i105 = f55776e + 5;
                f55775d = i105 % 128;
                int i106 = i105 % 2;
                return null;
            case 9:
                getDiscretionaryTagData getdiscretionarytagdata8 = (getDiscretionaryTagData) objArr[0];
                int i107 = f55775d;
                int i108 = i107 & 53;
                int i109 = ((((i107 ^ 53) | i108) << 1) - (~(-((i107 | 53) & (~i108))))) - 1;
                f55776e = i109 % 128;
                if (i109 % 2 != 0) {
                    return getdiscretionarytagdata8.f55778b;
                }
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = getdiscretionarytagdata8.f55778b;
                throw null;
            case 10:
                setLastBaselineToBottomHeight setlastbaselinetobottomheight9 = (setLastBaselineToBottomHeight) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i110 = f55776e;
                int i111 = i110 & 47;
                int i112 = -(-((i110 ^ 47) | i111));
                int i113 = (i111 & i112) + (i112 | i111);
                f55775d = i113 % 128;
                if (i113 % 2 != 0) {
                    setlastbaselinetobottomheight9.setOnFocusChangeListener(iIntValue2);
                    throw null;
                }
                setlastbaselinetobottomheight9.setOnFocusChangeListener(iIntValue2);
                int i114 = f55775d;
                int i115 = (-2) - (((i114 & 2) + (i114 | 2)) ^ (-1));
                f55776e = i115 % 128;
                if (i115 % 2 != 0) {
                    return null;
                }
                throw null;
            case 11:
                getDiscretionaryTagData getdiscretionarytagdata9 = (getDiscretionaryTagData) objArr[0];
                WeakReference<setLastBaselineToBottomHeight> weakReference2 = (WeakReference) objArr[1];
                int i116 = f55775d + 109;
                f55776e = i116 % 128;
                int i117 = i116 % 2;
                getdiscretionarytagdata9.f55777a = weakReference2;
                if (i117 != 0) {
                    return null;
                }
                throw null;
            case 12:
                getDiscretionaryTagData getdiscretionarytagdata10 = (getDiscretionaryTagData) objArr[0];
                System.identityHashCode(getdiscretionarytagdata10);
                System.identityHashCode(getdiscretionarytagdata10);
                if (getdiscretionarytagdata10.f55779c.get()) {
                    int i118 = f55775d;
                    int i119 = ((i118 ^ 76) + ((i118 & 76) << 1)) - 1;
                    int i120 = i119 % 128;
                    f55776e = i120;
                    int i121 = i119 % 2;
                    int i122 = i120 ^ 73;
                    int i123 = -(-((i120 & 73) << 1));
                    int i124 = (i122 & i123) + (i123 | i122);
                    f55775d = i124 % 128;
                    if (i124 % 2 == 0) {
                        return null;
                    }
                    int i125 = 58 / 0;
                    return null;
                }
                WeakReference<setLastBaselineToBottomHeight> weakReference3 = getdiscretionarytagdata10.f55777a;
                if (weakReference3 != null) {
                    int i126 = f55775d;
                    int i127 = ((i126 & 82) + (i126 | 82)) - 1;
                    f55776e = i127 % 128;
                    int i128 = i127 % 2;
                    setlastbaselinetobottomheight2 = weakReference3.get();
                    int i129 = f55776e;
                    int i130 = i129 & 107;
                    i14 = (i130 - (~((i129 ^ 107) | i130))) - 1;
                } else {
                    int i131 = f55776e;
                    i14 = (i131 & 23) + (i131 | 23);
                }
                f55775d = i14 % 128;
                int i132 = i14 % 2;
                return setlastbaselinetobottomheight2;
            case 13:
                setLastBaselineToBottomHeight setlastbaselinetobottomheight10 = (setLastBaselineToBottomHeight) objArr[0];
                int i133 = f55776e;
                int i134 = i133 & 125;
                int i135 = (i133 ^ 125) | i134;
                int i136 = (i134 ^ i135) + ((i135 & i134) << 1);
                f55775d = i136 % 128;
                int i137 = i136 % 2;
                setlastbaselinetobottomheight10.setOnLongClickListener();
                int i138 = f55776e;
                int i139 = (((i138 | 38) << 1) - (i138 ^ 38)) - 1;
                f55775d = i139 % 128;
                if (i139 % 2 == 0) {
                    return null;
                }
                throw null;
            case 14:
                Context context = (Context) objArr[1];
                int i140 = f55776e;
                int i141 = (i140 & 48) + (i140 | 48);
                int i142 = (i141 ^ (-1)) + (i141 << 1);
                f55775d = i142 % 128;
                if (i142 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(context, "");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(context, "");
                setExtractedText setextractedtext = (setExtractedText) setScrollCaptureHint.setDividerPadding(new Object[]{context}, -273529248, 273529249, (int) System.currentTimeMillis());
                int i143 = f55776e + 101;
                f55775d = i143 % 128;
                int i144 = i143 % 2;
                return setextractedtext;
            default:
                getDiscretionaryTagData getdiscretionarytagdata11 = (getDiscretionaryTagData) objArr[0];
                Context context2 = (Context) objArr[1];
                component28 component28Var = (component28) objArr[2];
                Function2 function2 = (Function2) objArr[3];
                Function2 function3 = (Function2) objArr[4];
                Function0 function0 = (Function0) objArr[5];
                Function0 function1 = (Function0) objArr[6];
                Intrinsics.checkNotNullParameter(context2, "");
                Intrinsics.checkNotNullParameter(component28Var, "");
                Intrinsics.checkNotNullParameter(function2, "");
                Intrinsics.checkNotNullParameter(function3, "");
                Intrinsics.checkNotNullParameter(function0, "");
                Intrinsics.checkNotNullParameter(function1, "");
                getdiscretionarytagdata11.f55779c.set(false);
                getdiscretionarytagdata11.f55778b = new e(getdiscretionarytagdata11.new b(function2, function3, function1, function0, context2, component28Var), getdiscretionarytagdata11.new a(), getdiscretionarytagdata11.new c(), null, null, null, getdiscretionarytagdata11.new d(), 56, null);
                Context applicationContext = context2.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext, "");
                Application application = (Application) applicationContext;
                application.registerActivityLifecycleCallbacks(getdiscretionarytagdata11.f55778b);
                Intent intent = new Intent(context2, (Class<?>) setLastBaselineToBottomHeight.class);
                intent.setFlags(1342177280);
                application.startActivity(intent);
                int i145 = f55776e;
                int i146 = i145 & 87;
                int i147 = ((((i145 ^ 87) | i146) << 1) - (~(-((i145 | 87) & (~i146))))) - 1;
                f55775d = i147 % 128;
                if (i147 % 2 == 0) {
                    return null;
                }
                throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.setBackgroundDrawable
    public final void setDividerPadding(int i10) throws Throwable {
        setY(new Object[]{this, Integer.valueOf(i10)}, -1202100002, 1202100005, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.setBackgroundDrawable
    @NotNull
    public final setExtractedText setX(@NotNull Context context) {
        return (setExtractedText) setY(new Object[]{this, context}, -106982190, 106982204, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setBackgroundDrawable
    public final void setX() throws Throwable {
        setY(new Object[]{this}, -750818230, 750818236, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setBackgroundDrawable
    public final void setX(@NotNull Context context, @NotNull component28 component28Var, @NotNull Function2<? super Integer, ? super Integer, Unit> function2, @NotNull Function2<? super Float, ? super Float, Unit> function3, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function1) throws Throwable {
        setY(new Object[]{this, context, component28Var, function2, function3, function0, function1}, 1168321288, -1168321288, System.identityHashCode(this));
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/mypinpad/tsdk/i/getDiscretionaryTagData$e;", "Landroid/app/Application$ActivityLifecycleCallbacks;"}, k = 1, mv = {1, 8, 0})
    public static final class e implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static int f55797w0 = 0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static int f55798x0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @Nullable
        public final Function2<Activity, Bundle, Unit> f55799p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @Nullable
        public final Function1<Activity, Unit> f55800q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @Nullable
        public final Function1<Activity, Unit> f55801r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        @Nullable
        public final Function1<Activity, Unit> f55802s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        @Nullable
        public final Function1<Activity, Unit> f55803t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        @Nullable
        public final Function2<Activity, Bundle, Unit> f55804u0;

        @Nullable
        public final Function1<Activity, Unit> v0;

        public e(Function2 function2, Function1 function1, Function1 function3, Function1 function4, Function1 function5, Function2 function6, Function1 function7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            function2 = (i10 & 1) != 0 ? null : function2;
            function1 = (i10 & 2) != 0 ? null : function1;
            function3 = (i10 & 4) != 0 ? null : function3;
            function4 = (i10 & 8) != 0 ? null : function4;
            function5 = (i10 & 16) != 0 ? null : function5;
            function6 = (i10 & 32) != 0 ? null : function6;
            function7 = (i10 & 64) != 0 ? null : function7;
            this.f55799p0 = function2;
            this.f55800q0 = function1;
            this.f55801r0 = function3;
            this.f55802s0 = function4;
            this.f55803t0 = function5;
            this.f55804u0 = function6;
            this.v0 = function7;
        }

        /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0113, code lost:
        
            if (r9 != null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x011b, code lost:
        
            if (r9 != null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x011d, code lost:
        
            r1 = com.mypinpad.tsdk.i.getDiscretionaryTagData.e.f55798x0;
            r4 = r1 & 13;
            r11 = (13 ^ r1) | r4;
            r1 = (r4 & r11) + (r11 | r4);
            com.mypinpad.tsdk.i.getDiscretionaryTagData.e.f55797w0 = r1 % 128;
            r1 = r1 % 2;
            r9.invoke(r8);
            r8 = com.mypinpad.tsdk.i.getDiscretionaryTagData.e.f55797w0;
            r9 = ((r8 | 59) << 1) - (r8 ^ 59);
            com.mypinpad.tsdk.i.getDiscretionaryTagData.e.f55798x0 = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x013b, code lost:
        
            if ((r9 % 2) == 0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x013f, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0140, code lost:
        
            r8 = com.mypinpad.tsdk.i.getDiscretionaryTagData.e.f55797w0 + 24;
            r9 = (r8 ^ (-1)) + (r8 << 1);
            com.mypinpad.tsdk.i.getDiscretionaryTagData.e.f55798x0 = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x014d, code lost:
        
            if ((r9 % 2) != 0) goto L91;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x014f, code lost:
        
            r8 = 46 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ void a(java.lang.Object[] r8, int r9, int r10, int r11) {
            /*
                Method dump skipped, instruction units count: 700
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.getDiscretionaryTagData.e.a(java.lang.Object[], int, int, int):void");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            a(new Object[]{this, activity, bundle}, 1312993315, -1312993311, System.identityHashCode(this));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@NotNull Activity activity) {
            a(new Object[]{this, activity}, -1882192397, 1882192397, System.identityHashCode(this));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@NotNull Activity activity) {
            a(new Object[]{this, activity}, -1725070048, 1725070051, System.identityHashCode(this));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@NotNull Activity activity) {
            a(new Object[]{this, activity}, -1443677398, 1443677404, System.identityHashCode(this));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
            a(new Object[]{this, activity, bundle}, -832665608, 832665609, System.identityHashCode(this));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@NotNull Activity activity) {
            a(new Object[]{this, activity}, 759657401, -759657399, System.identityHashCode(this));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@NotNull Activity activity) {
            a(new Object[]{this, activity}, -1115971479, 1115971484, System.identityHashCode(this));
        }

        public e() {
            this(null, null, null, null, null, null, null, 127, null);
        }
    }

    @Override // com.mypinpad.tsdk.isolation.setBackgroundDrawable
    public final void setY() throws Throwable {
        setY(new Object[]{this}, -1263460124, 1263460128, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setBackgroundDrawable
    public final void setY(@NotNull byte[] bArr) throws Throwable {
        setY(new Object[]{this, bArr}, 1846287797, -1846287790, System.identityHashCode(this));
    }
}
