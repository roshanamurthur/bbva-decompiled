package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyLayoutAnimateItemModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LazyLayoutAnimateItemModifierNodeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final SpringSpec<IntOffset> f4959a = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4498boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
}
