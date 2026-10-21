package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t\u0018\u00010\u0017\u0012'\u0010%\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001d¢\u0006\u0002\b ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R#\u0010\u001c\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR;\u0010%\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001d¢\u0006\u0002\b 8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectableProperties", "create", "node", "update", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "b", "Ljava/lang/Object;", "getKey1", "()Ljava/lang/Object;", "key1", "c", "getKey2", "key2", "", "d", "[Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", "keys", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "e", "Lkotlin/jvm/functions/Function2;", "getPointerInputHandler", "()Lkotlin/jvm/functions/Function2;", "pointerInputHandler", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class SuspendPointerInputElement extends ModifierNodeElement<SuspendingPointerInputModifierNodeImpl> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object key1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object key2;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object[] keys;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<PointerInputScope, Continuation<? super Unit>, Object> pointerInputHandler;

    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : obj2, (i10 & 4) != 0 ? null : objArr, function2);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) other;
        if (!Intrinsics.areEqual(this.key1, suspendPointerInputElement.key1) || !Intrinsics.areEqual(this.key2, suspendPointerInputElement.key2)) {
            return false;
        }
        Object[] objArr = this.keys;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.keys;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.keys != null) {
            return false;
        }
        return true;
    }

    @Nullable
    public final Object getKey1() {
        return this.key1;
    }

    @Nullable
    public final Object getKey2() {
        return this.key2;
    }

    @Nullable
    public final Object[] getKeys() {
        return this.keys;
    }

    @NotNull
    public final Function2<PointerInputScope, Continuation<? super Unit>, Object> getPointerInputHandler() {
        return this.pointerInputHandler;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        Object obj = this.key1;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.key2;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.keys;
        return iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        androidx.activity.a.c(inspectorInfo, "<this>", "pointerInput").set("key1", this.key1);
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("key2", this.key2);
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("keys", this.keys);
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("pointerInputHandler", this.pointerInputHandler);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuspendPointerInputElement(@Nullable Object obj, @Nullable Object obj2, @Nullable Object[] objArr, @NotNull Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> pointerInputHandler) {
        Intrinsics.checkNotNullParameter(pointerInputHandler, "pointerInputHandler");
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this.pointerInputHandler = pointerInputHandler;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public SuspendingPointerInputModifierNodeImpl create() {
        return new SuspendingPointerInputModifierNodeImpl(this.pointerInputHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@NotNull SuspendingPointerInputModifierNodeImpl node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setPointerInputHandler(this.pointerInputHandler);
    }
}
