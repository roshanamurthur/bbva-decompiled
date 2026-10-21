package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Applier.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016R\u0014\u0010\u0016\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/OffsetApplier;", "N", "Landroidx/compose/runtime/Applier;", "node", "", "down", "(Ljava/lang/Object;)V", "up", "", FirebaseAnalytics.Param.INDEX, "instance", "insertTopDown", "(ILjava/lang/Object;)V", "insertBottomUp", "count", RemoveCommand.ID, "from", TypedValues.TransitionType.S_TO, "move", ClearCommand.ID, "getCurrent", "()Ljava/lang/Object;", "current", "applier", TypedValues.CycleType.S_WAVE_OFFSET, "<init>", "(Landroidx/compose/runtime/Applier;I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,289:1\n4553#2,7:290\n4553#2,7:297\n*S KotlinDebug\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n*L\n263#1:290,7\n286#1:297,7\n*E\n"})
public final class OffsetApplier<N> implements Applier<N> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Applier<N> f14619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14621c;

    public OffsetApplier(@NotNull Applier<N> applier, int i10) {
        this.f14619a = applier;
        this.f14620b = i10;
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        ComposerKt.composeImmediateRuntimeError("Clear is not valid on OffsetApplier");
    }

    @Override // androidx.compose.runtime.Applier
    public void down(N node) {
        this.f14621c++;
        this.f14619a.down(node);
    }

    @Override // androidx.compose.runtime.Applier
    public N getCurrent() {
        return this.f14619a.getCurrent();
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int index, N instance) {
        this.f14619a.insertBottomUp(index + (this.f14621c == 0 ? this.f14620b : 0), instance);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int index, N instance) {
        this.f14619a.insertTopDown(index + (this.f14621c == 0 ? this.f14620b : 0), instance);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int from, int to, int count) {
        int i10 = this.f14621c == 0 ? this.f14620b : 0;
        this.f14619a.move(from + i10, to + i10, count);
    }

    @Override // androidx.compose.runtime.Applier
    public final /* synthetic */ void onBeginChanges() {
        m0.b.a(this);
    }

    @Override // androidx.compose.runtime.Applier
    public final /* synthetic */ void onEndChanges() {
        m0.b.b(this);
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int index, int count) {
        this.f14619a.remove(index + (this.f14621c == 0 ? this.f14620b : 0), count);
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        if (!(this.f14621c > 0)) {
            ComposerKt.composeImmediateRuntimeError("OffsetApplier up called with no corresponding down");
        }
        this.f14621c--;
        this.f14619a.up();
    }
}
