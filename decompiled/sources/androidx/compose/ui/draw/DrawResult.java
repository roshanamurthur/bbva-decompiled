package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\"\b\u0000\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\r\u0010\u000bR3\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/draw/DrawResult;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "Lkotlin/ExtensionFunctionType;", "a", "Lkotlin/jvm/functions/Function1;", "getBlock$ui_release", "()Lkotlin/jvm/functions/Function1;", "setBlock$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "block", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class DrawResult {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function1<? super ContentDrawScope, Unit> block;

    public DrawResult(@NotNull Function1<? super ContentDrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.block = block;
    }

    @NotNull
    public final Function1<ContentDrawScope, Unit> getBlock$ui_release() {
        return this.block;
    }

    public final void setBlock$ui_release(@NotNull Function1<? super ContentDrawScope, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.block = function1;
    }
}
