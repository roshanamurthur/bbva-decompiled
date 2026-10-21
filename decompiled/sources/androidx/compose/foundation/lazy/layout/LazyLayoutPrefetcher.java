package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayoutPrefetcher.android.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001f2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u001f B'\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J%\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$Prefetcher;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "", "run", "", "frameTimeNanos", "doFrame", "", FirebaseAnalytics.Param.INDEX, "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePrefetch-0kLqBqw", "(IJ)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePrefetch", "onRemembered", "onForgotten", "onAbandoned", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "subcomposeLayoutState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "itemContentFactory", "Landroid/view/View;", "view", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroid/view/View;)V", "Companion", "a", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyLayoutPrefetcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n*L\n1#1,312:1\n1182#2:313\n1161#2,2:314\n523#3:316\n26#4,5:317\n26#4,5:322\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n*L\n122#1:313\n122#1:314,2\n159#1:316\n164#1:317,5\n183#1:322,5\n*E\n"})
public final class LazyLayoutPrefetcher implements RememberObserver, LazyLayoutPrefetchState.Prefetcher, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static long E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final LazyLayoutPrefetchState f5017p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final SubcomposeLayoutState f5018q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final LazyLayoutItemContentFactory f5019r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final View f5020s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final MutableVector<a> f5021t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long f5022u0;
    public long v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f5023w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Choreographer f5024x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f5025y0;

    /* JADX INFO: compiled from: LazyLayoutPrefetcher.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$Companion;", "", "", "frameIntervalNs", "J", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        public static final void access$calculateFrameIntervalIfNeeded(Companion companion, View view) {
            float refreshRate;
            companion.getClass();
            if (LazyLayoutPrefetcher.E0 == 0) {
                Display display = view.getDisplay();
                if (view.isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                LazyLayoutPrefetcher.E0 = (long) (1000000000 / refreshRate);
            }
        }
    }

    /* JADX INFO: compiled from: LazyLayoutPrefetcher.android.kt */
    public static final class a implements LazyLayoutPrefetchState.PrefetchHandle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f5027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public SubcomposeLayoutState.PrecomposedSlotHandle f5028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f5029d;

        public a(long j10, int i10) {
            this.f5026a = i10;
            this.f5027b = j10;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public final void cancel() {
            if (this.f5029d) {
                return;
            }
            this.f5029d = true;
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.f5028c;
            if (precomposedSlotHandle != null) {
                precomposedSlotHandle.dispose();
            }
            this.f5028c = null;
        }
    }

    public LazyLayoutPrefetcher(@NotNull LazyLayoutPrefetchState prefetchState, @NotNull SubcomposeLayoutState subcomposeLayoutState, @NotNull LazyLayoutItemContentFactory itemContentFactory, @NotNull View view) {
        Intrinsics.checkNotNullParameter(prefetchState, "prefetchState");
        Intrinsics.checkNotNullParameter(subcomposeLayoutState, "subcomposeLayoutState");
        Intrinsics.checkNotNullParameter(itemContentFactory, "itemContentFactory");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f5017p0 = prefetchState;
        this.f5018q0 = subcomposeLayoutState;
        this.f5019r0 = itemContentFactory;
        this.f5020s0 = view;
        this.f5021t0 = new MutableVector<>(new a[16], 0);
        this.f5024x0 = Choreographer.getInstance();
        Companion.access$calculateFrameIntervalIfNeeded(INSTANCE, view);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        if (this.f5025y0) {
            this.f5020s0.post(this);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.f5025y0 = false;
        this.f5017p0.setPrefetcher$foundation_release(null);
        this.f5020s0.removeCallbacks(this);
        this.f5024x0.removeFrameCallback(this);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.f5017p0.setPrefetcher$foundation_release(this);
        this.f5025y0 = true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public void run() {
        long j10;
        MutableVector<a> mutableVector = this.f5021t0;
        boolean z10 = false;
        if (!mutableVector.isEmpty() && this.f5023w0 && this.f5025y0) {
            View view = this.f5020s0;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime()) + E0;
                boolean z11 = false;
                while (mutableVector.isNotEmpty() && !z11) {
                    a aVar = mutableVector.getContent()[z10 ? 1 : 0];
                    LazyLayoutItemContentFactory lazyLayoutItemContentFactory = this.f5019r0;
                    LazyLayoutItemProvider lazyLayoutItemProviderInvoke = lazyLayoutItemContentFactory.getItemProvider().invoke();
                    if (!aVar.f5029d) {
                        int itemCount = lazyLayoutItemProviderInvoke.getItemCount();
                        int i10 = aVar.f5026a;
                        if (i10 < 0 || i10 >= itemCount) {
                            z10 = false;
                        } else if (aVar.f5028c == null) {
                            Trace.beginSection("compose:lazylist:prefetch:compose");
                            try {
                                long jNanoTime = System.nanoTime();
                                long j11 = this.f5022u0;
                                if (jNanoTime > nanos || jNanoTime + j11 < nanos) {
                                    Object key = lazyLayoutItemProviderInvoke.getKey(i10);
                                    aVar.f5028c = this.f5018q0.precompose(key, lazyLayoutItemContentFactory.getContent(i10, key, lazyLayoutItemProviderInvoke.getContentType(i10)));
                                    long jNanoTime2 = System.nanoTime() - jNanoTime;
                                    long j12 = this.f5022u0;
                                    if (j12 != 0) {
                                        long j13 = 4;
                                        jNanoTime2 = (jNanoTime2 / j13) + ((j12 / j13) * ((long) 3));
                                    }
                                    this.f5022u0 = jNanoTime2;
                                    z11 = z11;
                                } else {
                                    z11 = true;
                                }
                                Unit unit = Unit.INSTANCE;
                                Trace.endSection();
                            } catch (Throwable th2) {
                                Trace.endSection();
                                throw th2;
                            }
                        } else {
                            Trace.beginSection("compose:lazylist:prefetch:measure");
                            try {
                                long jNanoTime3 = System.nanoTime();
                                long j14 = this.v0;
                                if (jNanoTime3 > nanos || j14 + jNanoTime3 < nanos) {
                                    SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = aVar.f5028c;
                                    Intrinsics.checkNotNull(precomposedSlotHandle);
                                    int placeablesCount = precomposedSlotHandle.getPlaceablesCount();
                                    int i11 = z10 ? 1 : 0;
                                    while (i11 < placeablesCount) {
                                        precomposedSlotHandle.mo3590premeasure0kLqBqw(i11, aVar.f5027b);
                                        i11++;
                                        nanos = nanos;
                                    }
                                    j10 = nanos;
                                    long jNanoTime4 = System.nanoTime() - jNanoTime3;
                                    long j15 = this.v0;
                                    if (j15 != 0) {
                                        long j16 = 4;
                                        jNanoTime4 = (jNanoTime4 / j16) + ((j15 / j16) * ((long) 3));
                                    }
                                    this.v0 = jNanoTime4;
                                    mutableVector.removeAt(0);
                                    z11 = z11;
                                } else {
                                    Unit unit2 = Unit.INSTANCE;
                                    j10 = nanos;
                                    z11 = true;
                                }
                                Trace.endSection();
                                nanos = j10;
                                z10 = false;
                            } catch (Throwable th3) {
                                Trace.endSection();
                                throw th3;
                            }
                        }
                    }
                    mutableVector.removeAt(z10 ? 1 : 0);
                    nanos = nanos;
                }
                if (z11) {
                    this.f5024x0.postFrameCallback(this);
                    return;
                } else {
                    this.f5023w0 = z10;
                    return;
                }
            }
        }
        this.f5023w0 = false;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.Prefetcher
    @NotNull
    /* JADX INFO: renamed from: schedulePrefetch-0kLqBqw */
    public LazyLayoutPrefetchState.PrefetchHandle mo417schedulePrefetch0kLqBqw(int index, long constraints) {
        a aVar = new a(constraints, index);
        this.f5021t0.add(aVar);
        if (!this.f5023w0) {
            this.f5023w0 = true;
            this.f5020s0.post(this);
        }
        return aVar;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }
}
