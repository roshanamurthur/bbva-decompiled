package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TextFieldPressGestureFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextFieldPressGestureFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,85:1\n63#2,5:86\n*S KotlinDebug\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1\n*L\n45#1:86,5\n*E\n"})
public final class b0 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MutableState<PressInteraction.Press> f6086p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f6087q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource) {
        super(1);
        this.f6086p0 = mutableState;
        this.f6087q0 = mutableInteractionSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        DisposableEffectScope DisposableEffect = disposableEffectScope;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final MutableState<PressInteraction.Press> mutableState = this.f6086p0;
        final MutableInteractionSource mutableInteractionSource = this.f6087q0;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MutableState mutableState2 = mutableState;
                PressInteraction.Press press = (PressInteraction.Press) mutableState2.getValue();
                if (press != null) {
                    PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
                    MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                    if (mutableInteractionSource2 != null) {
                        mutableInteractionSource2.tryEmit(cancel);
                    }
                    mutableState2.setValue(null);
                }
            }
        };
    }
}
