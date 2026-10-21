package t;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Indication.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Indication {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f0 f93376a = new f0();

    /* JADX INFO: compiled from: Indication.kt */
    public static final class a implements IndicationInstance {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public static final a f93377p0 = new a();

        @Override // androidx.compose.foundation.IndicationInstance
        public final void drawIndication(@NotNull ContentDrawScope contentDrawScope) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
            contentDrawScope.drawContent();
        }
    }

    @Override // androidx.compose.foundation.Indication
    @Composable
    @NotNull
    public final IndicationInstance rememberUpdatedInstance(@NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, 285654452)) {
            ComposerKt.traceEventStart(285654452, i10, -1, "androidx.compose.foundation.NoIndication.rememberUpdatedInstance (Indication.kt:140)");
        }
        a aVar = a.f93377p0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return aVar;
    }
}
