package w;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Stable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InteractionSource.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
public final class a implements MutableInteractionSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Interaction> f94107a = SharedFlowKt.MutableSharedFlow$default(0, 16, BufferOverflow.DROP_OLDEST, 1, null);

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    @Nullable
    public final Object emit(@NotNull Interaction interaction, @NotNull Continuation<? super Unit> continuation) {
        Object objEmit = this.f94107a.emit(interaction, continuation);
        return objEmit == ek.a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public final Flow getInteractions() {
        return this.f94107a;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public final boolean tryEmit(@NotNull Interaction interaction) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        return this.f94107a.tryEmit(interaction);
    }
}
