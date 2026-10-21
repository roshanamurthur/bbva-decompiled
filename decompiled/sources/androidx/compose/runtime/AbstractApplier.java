package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Applier.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0012\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u001c\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0006\u0010\b\u001a\u00020\u0004J\b\u0010\t\u001a\u00020\u0004H$J\"\u0010\u000e\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0004J*\u0010\u0011\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0004R\u0017\u0010\u0016\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R*\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00008\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0006¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/AbstractApplier;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/Applier;", "node", "", "down", "(Ljava/lang/Object;)V", "up", ClearCommand.ID, "onClear", "", "", FirebaseAnalytics.Param.INDEX, "count", RemoveCommand.ID, "from", TypedValues.TransitionType.S_TO, "move", "a", "Ljava/lang/Object;", "getRoot", "()Ljava/lang/Object;", "root", "<set-?>", "c", "getCurrent", "setCurrent", "current", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/AbstractApplier\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,289:1\n50#2,7:290\n*S KotlinDebug\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/AbstractApplier\n*L\n206#1:290,7\n*E\n"})
public abstract class AbstractApplier<T> implements Applier<T> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final T root;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayList f14425b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public T current;

    public AbstractApplier(T t10) {
        this.root = t10;
        this.current = t10;
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        this.f14425b.clear();
        setCurrent(this.root);
        onClear();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(T node) {
        this.f14425b.add(getCurrent());
        setCurrent(node);
    }

    @Override // androidx.compose.runtime.Applier
    public T getCurrent() {
        return this.current;
    }

    public final T getRoot() {
        return this.root;
    }

    public final void move(@NotNull List<T> list, int i10, int i11, int i12) {
        int i13 = i10 > i11 ? i11 : i11 - i12;
        if (i12 != 1) {
            List<T> listSubList = list.subList(i10, i12 + i10);
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listSubList);
            listSubList.clear();
            list.addAll(i13, mutableList);
            return;
        }
        if (i10 == i11 + 1 || i10 == i11 - 1) {
            list.set(i10, list.set(i11, list.get(i10)));
        } else {
            list.add(i13, list.remove(i10));
        }
    }

    @Override // androidx.compose.runtime.Applier
    public final /* synthetic */ void onBeginChanges() {
        m0.b.a(this);
    }

    public abstract void onClear();

    @Override // androidx.compose.runtime.Applier
    public /* synthetic */ void onEndChanges() {
        m0.b.b(this);
    }

    public final void remove(@NotNull List<T> list, int i10, int i11) {
        if (i11 == 1) {
            list.remove(i10);
        } else {
            list.subList(i10, i11 + i10).clear();
        }
    }

    public void setCurrent(T t10) {
        this.current = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.Applier
    public void up() {
        ArrayList arrayList = this.f14425b;
        if (!(!arrayList.isEmpty())) {
            PreconditionsKt.throwIllegalStateException("empty stack");
        }
        setCurrent(arrayList.remove(arrayList.size() - 1));
    }
}
