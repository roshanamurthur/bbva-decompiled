package l0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableInteractionSource f83021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableInteractionSource f83022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final State<Float> f83023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final State<Float> f83024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final State<Function2<Boolean, Float, Unit>> f83025e;

    /* JADX WARN: Multi-variable type inference failed */
    public w2(@NotNull MutableInteractionSource startInteractionSource, @NotNull MutableInteractionSource endInteractionSource, @NotNull State<Float> rawOffsetStart, @NotNull State<Float> rawOffsetEnd, @NotNull State<? extends Function2<? super Boolean, ? super Float, Unit>> onDrag) {
        Intrinsics.checkNotNullParameter(startInteractionSource, "startInteractionSource");
        Intrinsics.checkNotNullParameter(endInteractionSource, "endInteractionSource");
        Intrinsics.checkNotNullParameter(rawOffsetStart, "rawOffsetStart");
        Intrinsics.checkNotNullParameter(rawOffsetEnd, "rawOffsetEnd");
        Intrinsics.checkNotNullParameter(onDrag, "onDrag");
        this.f83021a = startInteractionSource;
        this.f83022b = endInteractionSource;
        this.f83023c = rawOffsetStart;
        this.f83024d = rawOffsetEnd;
        this.f83025e = onDrag;
    }
}
