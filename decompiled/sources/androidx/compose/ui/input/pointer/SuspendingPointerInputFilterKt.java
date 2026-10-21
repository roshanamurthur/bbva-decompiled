package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\b\u001a\u00020\u0000*\u00020\u00002'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aG\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00052'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000b\u001aQ\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\r\u001aU\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u000e\"\u0004\u0018\u00010\u00052'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0010\u001a9\u0010\u0013\u001a\u00020\u00122'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "pointerInput", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "key1", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "key2", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "", "keys", "(Landroidx/compose/ui/Modifier;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "pointerInputHandler", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "SuspendingPointerInputModifierNode", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class SuspendingPointerInputFilterKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final PointerEvent f16467a = new PointerEvent(CollectionsKt__CollectionsKt.emptyList());

    @NotNull
    public static final SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode(@NotNull Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> pointerInputHandler) {
        Intrinsics.checkNotNullParameter(pointerInputHandler, "pointerInputHandler");
        return new SuspendingPointerInputModifierNodeImpl(pointerInputHandler);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.")
    @NotNull
    public static final Modifier pointerInput(@NotNull Modifier modifier, @NotNull Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        throw new IllegalStateException("Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.".toString());
    }

    @NotNull
    public static final Modifier pointerInput(@NotNull Modifier modifier, @Nullable Object obj, @NotNull Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return modifier.then(new SuspendPointerInputElement(obj, null, null, block, 6, null));
    }

    @NotNull
    public static final Modifier pointerInput(@NotNull Modifier modifier, @Nullable Object obj, @Nullable Object obj2, @NotNull Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return modifier.then(new SuspendPointerInputElement(obj, obj2, null, block, 4, null));
    }

    @NotNull
    public static final Modifier pointerInput(@NotNull Modifier modifier, @NotNull Object[] keys, @NotNull Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(block, "block");
        return modifier.then(new SuspendPointerInputElement(null, null, keys, block, 3, null));
    }
}
