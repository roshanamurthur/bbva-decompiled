package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MutableVectorWithMutationTracking.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0004\u001a\u00020\u0003J\u001d\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\fH\u0086\bø\u0001\u0000J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u0018\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u000bR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010 \u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/node/MutableVectorWithMutationTracking;", ExifInterface.GPS_DIRECTION_TRUE, "", "", ClearCommand.ID, "", FirebaseAnalytics.Param.INDEX, "element", "add", "(ILjava/lang/Object;)V", "removeAt", "(I)Ljava/lang/Object;", "Lkotlin/Function1;", "block", "forEach", "", "asList", "get", "Landroidx/compose/runtime/collection/MutableVector;", "a", "Landroidx/compose/runtime/collection/MutableVector;", "getVector", "()Landroidx/compose/runtime/collection/MutableVector;", "vector", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "getOnVectorMutated", "()Lkotlin/jvm/functions/Function0;", "onVectorMutated", "getSize", "()I", "size", "<init>", "(Landroidx/compose/runtime/collection/MutableVector;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMutableVectorWithMutationTracking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,53:1\n460#2,11:54\n523#2:65\n*S KotlinDebug\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n*L\n48#1:54,11\n52#1:65\n*E\n"})
public final class MutableVectorWithMutationTracking<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableVector<T> vector;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> onVectorMutated;

    public MutableVectorWithMutationTracking(@NotNull MutableVector<T> vector, @NotNull Function0<Unit> onVectorMutated) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        Intrinsics.checkNotNullParameter(onVectorMutated, "onVectorMutated");
        this.vector = vector;
        this.onVectorMutated = onVectorMutated;
    }

    public final void add(int index, T element) {
        this.vector.add(index, element);
        this.onVectorMutated.invoke();
    }

    @NotNull
    public final List<T> asList() {
        return this.vector.asMutableList();
    }

    public final void clear() {
        this.vector.clear();
        this.onVectorMutated.invoke();
    }

    public final void forEach(@NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MutableVector<T> vector = getVector();
        int size = vector.getSize();
        if (size > 0) {
            T[] content = vector.getContent();
            int i10 = 0;
            do {
                block.invoke(content[i10]);
                i10++;
            } while (i10 < size);
        }
    }

    public final T get(int index) {
        return this.vector.getContent()[index];
    }

    @NotNull
    public final Function0<Unit> getOnVectorMutated() {
        return this.onVectorMutated;
    }

    public final int getSize() {
        return this.vector.getSize();
    }

    @NotNull
    public final MutableVector<T> getVector() {
        return this.vector;
    }

    public final T removeAt(int index) {
        T tRemoveAt = this.vector.removeAt(index);
        this.onVectorMutated.invoke();
        return tRemoveAt;
    }
}
