package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.Placeholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InlineTextContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/text/InlineTextContent;", "", "Landroidx/compose/ui/text/Placeholder;", "a", "Landroidx/compose/ui/text/Placeholder;", "getPlaceholder", "()Landroidx/compose/ui/text/Placeholder;", "placeholder", "Lkotlin/Function1;", "", "", "Landroidx/compose/runtime/Composable;", "b", "Lkotlin/jvm/functions/Function3;", "getChildren", "()Lkotlin/jvm/functions/Function3;", "children", "<init>", "(Landroidx/compose/ui/text/Placeholder;Lkotlin/jvm/functions/Function3;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class InlineTextContent {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Placeholder placeholder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function3<String, Composer, Integer, Unit> children;

    /* JADX WARN: Multi-variable type inference failed */
    public InlineTextContent(@NotNull Placeholder placeholder, @NotNull Function3<? super String, ? super Composer, ? super Integer, Unit> children) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(children, "children");
        this.placeholder = placeholder;
        this.children = children;
    }

    @NotNull
    public final Function3<String, Composer, Integer, Unit> getChildren() {
        return this.children;
    }

    @NotNull
    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }
}
