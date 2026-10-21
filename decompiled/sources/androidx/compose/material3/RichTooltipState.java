package androidx.compose.material3;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.s5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004R+\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/RichTooltipState;", "Landroidx/compose/material3/TooltipState;", "", "show", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismiss", "", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "isVisible", "()Z", "setVisible$material3_release", "(Z)V", "b", "isPersistent$material3_release", "setPersistent$material3_release", "isPersistent", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/RichTooltipState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,770:1\n76#2:771\n102#2,2:772\n76#2:774\n102#2,2:775\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/RichTooltipState\n*L\n449#1:771\n449#1:772,2\n459#1:774\n459#1:775,2\n*E\n"})
public final class RichTooltipState implements TooltipState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState isVisible;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState isPersistent;

    public RichTooltipState() {
        Boolean bool = Boolean.FALSE;
        this.isVisible = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isPersistent = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    @Override // androidx.compose.material3.TooltipState
    @Nullable
    public Object dismiss(@NotNull Continuation<? super Unit> continuation) {
        Object objA = s5.a(this, continuation);
        return objA == ek.a.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isPersistent$material3_release() {
        return ((Boolean) this.isPersistent.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material3.TooltipState
    public boolean isVisible() {
        return ((Boolean) this.isVisible.getValue()).booleanValue();
    }

    public final void setPersistent$material3_release(boolean z10) {
        this.isPersistent.setValue(Boolean.valueOf(z10));
    }

    public void setVisible$material3_release(boolean z10) {
        this.isVisible.setValue(Boolean.valueOf(z10));
    }

    @Override // androidx.compose.material3.TooltipState
    @Nullable
    public Object show(@NotNull Continuation<? super Unit> continuation) {
        MutatorMutex mutatorMutex = s5.f82921a;
        Object objB = s5.b(this, continuation, isPersistent$material3_release());
        return objB == ek.a.getCOROUTINE_SUSPENDED() ? objB : Unit.INSTANCE;
    }
}
