package h0;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.TextFieldColorsWithIcons;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m3 {
    @Composable
    @NotNull
    public static State a(TextFieldColorsWithIcons textFieldColorsWithIcons, boolean z10, boolean z11, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, 1279189910)) {
            ComposerKt.traceEventStart(1279189910, i10, -1, "androidx.compose.material.TextFieldColorsWithIcons.leadingIconColor (TextFieldDefaults.kt:160)");
        }
        State<Color> stateLeadingIconColor = textFieldColorsWithIcons.leadingIconColor(z10, z11, composer, (i10 & 14) | (i10 & 112) | ((i10 >> 3) & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateLeadingIconColor;
    }

    @Composable
    @NotNull
    public static State b(TextFieldColorsWithIcons textFieldColorsWithIcons, boolean z10, boolean z11, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, -712140408)) {
            ComposerKt.traceEventStart(-712140408, i10, -1, "androidx.compose.material.TextFieldColorsWithIcons.trailingIconColor (TextFieldDefaults.kt:177)");
        }
        State<Color> stateTrailingIconColor = textFieldColorsWithIcons.trailingIconColor(z10, z11, composer, (i10 & 14) | (i10 & 112) | ((i10 >> 3) & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateTrailingIconColor;
    }
}
