package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "a", "Landroidx/compose/ui/semantics/SemanticsNode;", "getSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "Landroid/graphics/Rect;", "b", "Landroid/graphics/Rect;", "getAdjustedBounds", "()Landroid/graphics/Rect;", "adjustedBounds", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroid/graphics/Rect;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class SemanticsNodeWithAdjustedBounds {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SemanticsNode semanticsNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Rect adjustedBounds;

    public SemanticsNodeWithAdjustedBounds(@NotNull SemanticsNode semanticsNode, @NotNull Rect adjustedBounds) {
        Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
        Intrinsics.checkNotNullParameter(adjustedBounds, "adjustedBounds");
        this.semanticsNode = semanticsNode;
        this.adjustedBounds = adjustedBounds;
    }

    @NotNull
    public final Rect getAdjustedBounds() {
        return this.adjustedBounds;
    }

    @NotNull
    public final SemanticsNode getSemanticsNode() {
        return this.semanticsNode;
    }
}
