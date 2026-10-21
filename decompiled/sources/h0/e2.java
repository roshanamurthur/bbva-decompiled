package h0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableInteractionSource f68731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableInteractionSource f68732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final State<Float> f68733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final State<Float> f68734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final State<Function2<Boolean, Float, Unit>> f68735e;

    /* JADX WARN: Multi-variable type inference failed */
    public e2(@NotNull MutableInteractionSource startInteractionSource, @NotNull MutableInteractionSource endInteractionSource, @NotNull State<Float> rawOffsetStart, @NotNull State<Float> rawOffsetEnd, @NotNull State<? extends Function2<? super Boolean, ? super Float, Unit>> onDrag) {
        Intrinsics.checkNotNullParameter(startInteractionSource, "startInteractionSource");
        Intrinsics.checkNotNullParameter(endInteractionSource, "endInteractionSource");
        Intrinsics.checkNotNullParameter(rawOffsetStart, "rawOffsetStart");
        Intrinsics.checkNotNullParameter(rawOffsetEnd, "rawOffsetEnd");
        Intrinsics.checkNotNullParameter(onDrag, "onDrag");
        this.f68731a = startInteractionSource;
        this.f68732b = endInteractionSource;
        this.f68733c = rawOffsetStart;
        this.f68734d = rawOffsetEnd;
        this.f68735e = onDrag;
    }
}
