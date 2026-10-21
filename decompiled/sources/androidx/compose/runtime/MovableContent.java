package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 2)
@InternalComposeApi
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012&\u0010\r\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\b¢\u0006\u0004\b\u000e\u0010\u000fR7\u0010\r\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/MovableContent;", "P", "", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "parameter", "", "Landroidx/compose/runtime/Composable;", "a", "Lkotlin/jvm/functions/Function3;", "getContent", "()Lkotlin/jvm/functions/Function3;", "content", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class MovableContent<P> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function3<P, Composer, Integer, Unit> content;

    /* JADX WARN: Multi-variable type inference failed */
    public MovableContent(@NotNull Function3<? super P, ? super Composer, ? super Integer, Unit> function3) {
        this.content = function3;
    }

    @NotNull
    public final Function3<P, Composer, Integer, Unit> getContent() {
        return this.content;
    }
}
