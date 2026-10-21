package androidx.compose.material.pullrefresh;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.image.transform.MonochromeImageTransformer;
import j0.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PullRefreshState.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B5\b\u0000\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\"0!\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0019\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0014\u0010\u0010\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018¨\u0006&"}, d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshState;", "", "", "pullDelta", "onPull$material_release", "(F)F", "onPull", "velocity", "onRelease$material_release", "onRelease", "", "refreshing", "", "setRefreshing$material_release", "(Z)V", "setRefreshing", MonochromeImageTransformer.THRESHOLD, "setThreshold$material_release", "(F)V", "setThreshold", "refreshingOffset", "setRefreshingOffset$material_release", "setRefreshingOffset", "getProgress", "()F", "progress", "getRefreshing$material_release", "()Z", "getPosition$material_release", "position", "getThreshold$material_release", "Lkotlinx/coroutines/CoroutineScope;", "animationScope", "Landroidx/compose/runtime/State;", "Lkotlin/Function0;", "onRefreshState", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/State;FF)V", "material_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,234:1\n81#2:235\n81#2:236\n107#2,2:237\n75#3:239\n108#3,2:240\n75#3:242\n108#3,2:243\n75#3:245\n108#3,2:246\n75#3:248\n108#3,2:249\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n*L\n122#1:235\n124#1:236\n124#1:237,2\n125#1:239\n125#1:240,2\n126#1:242\n126#1:243,2\n127#1:245\n127#1:246,2\n128#1:248\n128#1:249,2\n*E\n"})
public final class PullRefreshState {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f8895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final State<Function0<Unit>> f8896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final State f8897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableState f8898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableFloatState f8899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableFloatState f8900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableFloatState f8901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final MutableFloatState f8902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutatorMutex f8903i;

    /* JADX INFO: compiled from: PullRefreshState.kt */
    public static final class a extends Lambda implements Function0<Float> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(PullRefreshState.access$getDistancePulled(PullRefreshState.this) * 0.5f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PullRefreshState(@NotNull CoroutineScope animationScope, @NotNull State<? extends Function0<Unit>> onRefreshState, float f6, float f10) {
        Intrinsics.checkNotNullParameter(animationScope, "animationScope");
        Intrinsics.checkNotNullParameter(onRefreshState, "onRefreshState");
        this.f8895a = animationScope;
        this.f8896b = onRefreshState;
        this.f8897c = SnapshotStateKt.derivedStateOf(new a());
        this.f8898d = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f8899e = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.f8900f = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.f8901g = PrimitiveSnapshotStateKt.mutableFloatStateOf(f10);
        this.f8902h = PrimitiveSnapshotStateKt.mutableFloatStateOf(f6);
        this.f8903i = new MutatorMutex();
    }

    public static final float access$getDistancePulled(PullRefreshState pullRefreshState) {
        return pullRefreshState.f8900f.getFloatValue();
    }

    public final float getPosition$material_release() {
        return this.f8899e.getFloatValue();
    }

    public final float getProgress() {
        return ((Number) this.f8897c.getValue()).floatValue() / getThreshold$material_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getRefreshing$material_release() {
        return ((Boolean) this.f8898d.getValue()).booleanValue();
    }

    public final float getThreshold$material_release() {
        return this.f8901g.getFloatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float onPull$material_release(float pullDelta) {
        float threshold$material_release;
        if (((Boolean) this.f8898d.getValue()).booleanValue()) {
            return 0.0f;
        }
        MutableFloatState mutableFloatState = this.f8900f;
        float fCoerceAtLeast = c.coerceAtLeast(mutableFloatState.getFloatValue() + pullDelta, 0.0f);
        float floatValue = fCoerceAtLeast - mutableFloatState.getFloatValue();
        mutableFloatState.setFloatValue(fCoerceAtLeast);
        State state = this.f8897c;
        if (((Number) state.getValue()).floatValue() <= getThreshold$material_release()) {
            threshold$material_release = ((Number) state.getValue()).floatValue();
        } else {
            float fCoerceIn = c.coerceIn(Math.abs(getProgress()) - 1.0f, 0.0f, 2.0f);
            threshold$material_release = getThreshold$material_release() + (getThreshold$material_release() * (fCoerceIn - (((float) Math.pow(fCoerceIn, 2)) / 4)));
        }
        this.f8899e.setFloatValue(threshold$material_release);
        return floatValue;
    }

    public final float onRelease$material_release(float velocity) {
        if (getRefreshing$material_release()) {
            return 0.0f;
        }
        if (((Number) this.f8897c.getValue()).floatValue() > getThreshold$material_release()) {
            this.f8896b.getValue().invoke();
        }
        BuildersKt__Builders_commonKt.launch$default(this.f8895a, null, null, new g(this, 0.0f, null), 3, null);
        MutableFloatState mutableFloatState = this.f8900f;
        if (mutableFloatState.getFloatValue() == 0.0f || velocity < 0.0f) {
            velocity = 0.0f;
        }
        mutableFloatState.setFloatValue(0.0f);
        return velocity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setRefreshing$material_release(boolean refreshing) {
        MutableState mutableState = this.f8898d;
        if (((Boolean) mutableState.getValue()).booleanValue() != refreshing) {
            mutableState.setValue(Boolean.valueOf(refreshing));
            this.f8900f.setFloatValue(0.0f);
            BuildersKt__Builders_commonKt.launch$default(this.f8895a, null, null, new g(this, refreshing ? this.f8902h.getFloatValue() : 0.0f, null), 3, null);
        }
    }

    public final void setRefreshingOffset$material_release(float refreshingOffset) {
        MutableFloatState mutableFloatState = this.f8902h;
        if (mutableFloatState.getFloatValue() == refreshingOffset) {
            return;
        }
        mutableFloatState.setFloatValue(refreshingOffset);
        if (getRefreshing$material_release()) {
            BuildersKt__Builders_commonKt.launch$default(this.f8895a, null, null, new g(this, refreshingOffset, null), 3, null);
        }
    }

    public final void setThreshold$material_release(float threshold) {
        this.f8901g.setFloatValue(threshold);
    }
}
