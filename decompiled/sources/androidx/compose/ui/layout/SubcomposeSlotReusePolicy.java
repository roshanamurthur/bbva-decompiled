package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import bk.g;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "", "areCompatible", "", "slotId", "reusableSlotId", "getSlotsToRetain", "", "slotIds", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "SlotIdsSet", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SubcomposeSlotReusePolicy {

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\b\u0000\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0003J\u0019\u0010\u0007\u001a\u00020\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0096\u0001J\t\u0010\b\u001a\u00020\u0004H\u0096\u0001J\u0019\u0010\f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\rH\u0096\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\u0011\u001a\u00020\u00042\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u001c\u0010\u0011\u001a\u00020\u00042\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0012J\u0016\u0010\u0014\u001a\u00020\u00042\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u001c\u0010\u0014\u001a\u00020\u00042\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0012J\u0006\u0010\u0016\u001a\u00020\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "", "", "element", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "elements", "containsAll", "isEmpty", "slotId", "add$ui_release", "(Ljava/lang/Object;)Z", "add", "", "iterator", RemoveCommand.ID, "slotIds", "removeAll", "Lkotlin/Function1;", "predicate", "retainAll", "", ClearCommand.ID, "", "getSize", "()I", "size", "", SetCommand.ID, "<init>", "(Ljava/util/Set;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class SlotIdsSet implements Collection<Object>, KMappedMarker {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final Set<Object> f16698p0;

        /* JADX WARN: Multi-variable type inference failed */
        public SlotIdsSet() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // java.util.Collection
        /* JADX INFO: renamed from: add$ui_release, reason: merged with bridge method [inline-methods] */
        public final boolean add(@Nullable Object slotId) {
            return this.f16698p0.add(slotId);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f16698p0.clear();
        }

        @Override // java.util.Collection
        public boolean contains(@Nullable Object element) {
            return this.f16698p0.contains(element);
        }

        @Override // java.util.Collection
        public boolean containsAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f16698p0.containsAll(elements);
        }

        public int getSize() {
            return this.f16698p0.size();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.f16698p0.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<Object> iterator() {
            return this.f16698p0.iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(@Nullable Object slotId) {
            return this.f16698p0.remove(slotId);
        }

        @Override // java.util.Collection
        public final boolean removeAll(@NotNull Collection<? extends Object> slotIds) {
            Intrinsics.checkNotNullParameter(slotIds, "slotIds");
            return this.f16698p0.remove(slotIds);
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(@NotNull Collection<? extends Object> slotIds) {
            Intrinsics.checkNotNullParameter(slotIds, "slotIds");
            return this.f16698p0.retainAll(slotIds);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        public SlotIdsSet(@NotNull Set<Object> set) {
            Intrinsics.checkNotNullParameter(set, "set");
            this.f16698p0 = set;
        }

        public final boolean removeAll(@NotNull Function1<Object, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return g.removeAll(this.f16698p0, predicate);
        }

        public final boolean retainAll(@NotNull Function1<Object, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return g.retainAll(this.f16698p0, predicate);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.toArray(this, array);
        }

        public /* synthetic */ SlotIdsSet(Set set, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new LinkedHashSet() : set);
        }
    }

    boolean areCompatible(@Nullable Object slotId, @Nullable Object reusableSlotId);

    void getSlotsToRetain(@NotNull SlotIdsSet slotIds);
}
