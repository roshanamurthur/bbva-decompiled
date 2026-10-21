package t;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Indication.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/DefaultDebugIndication\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,186:1\n36#2:187\n1097#3,6:188\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/DefaultDebugIndication\n*L\n171#1:187\n171#1:188,6\n*E\n"})
public final class o implements Indication {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o f93424a = new o();

    /* JADX INFO: compiled from: Indication.kt */
    public static final class a implements IndicationInstance {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final State<Boolean> f93425p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NotNull
        public final State<Boolean> f93426q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @NotNull
        public final State<Boolean> f93427r0;

        public a(@NotNull State<Boolean> isPressed, @NotNull State<Boolean> isHovered, @NotNull State<Boolean> isFocused) {
            Intrinsics.checkNotNullParameter(isPressed, "isPressed");
            Intrinsics.checkNotNullParameter(isHovered, "isHovered");
            Intrinsics.checkNotNullParameter(isFocused, "isFocused");
            this.f93425p0 = isPressed;
            this.f93426q0 = isHovered;
            this.f93427r0 = isFocused;
        }

        @Override // androidx.compose.foundation.IndicationInstance
        public final void drawIndication(@NotNull ContentDrawScope contentDrawScope) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
            contentDrawScope.drawContent();
            if (this.f93425p0.getValue().booleanValue()) {
                a1.b.K(contentDrawScope, Color.m2507copywmQWz5c$default(Color.INSTANCE.m2534getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.mo2909getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            } else if (this.f93426q0.getValue().booleanValue() || this.f93427r0.getValue().booleanValue()) {
                a1.b.K(contentDrawScope, Color.m2507copywmQWz5c$default(Color.INSTANCE.m2534getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.mo2909getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            }
        }
    }

    @Override // androidx.compose.foundation.Indication
    @Composable
    @NotNull
    public final IndicationInstance rememberUpdatedInstance(@NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, 1683566979)) {
            ComposerKt.traceEventStart(1683566979, i10, -1, "androidx.compose.foundation.DefaultDebugIndication.rememberUpdatedInstance (Indication.kt:166)");
        }
        int i11 = i10 & 14;
        State<Boolean> stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(interactionSource, composer, i11);
        State<Boolean> stateCollectIsHoveredAsState = HoverInteractionKt.collectIsHoveredAsState(interactionSource, composer, i11);
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, i11);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(interactionSource);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new a(stateCollectIsPressedAsState, stateCollectIsHoveredAsState, stateCollectIsFocusedAsState);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        a aVar = (a) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return aVar;
    }
}
