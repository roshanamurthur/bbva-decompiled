package kotlin.collections.builders;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SetBuilder.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001%B\u001b\b\u0000\u0012\u0010\u0010\u001f\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u001e¢\u0006\u0004\b \u0010!B\t\b\u0016¢\u0006\u0004\b \u0010\"B\u0011\b\u0016\u0012\u0006\u0010#\u001a\u00020\u001a¢\u0006\u0004\b \u0010$J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002J\u0016\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u0016\u0010\u0018\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u0016\u0010\u0019\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006&"}, d2 = {"Lkotlin/collections/builders/SetBuilder;", ExifInterface.LONGITUDE_EAST, "", "Lkotlin/collections/AbstractMutableSet;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "isEmpty", "element", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "(Ljava/lang/Object;)Z", "", ClearCommand.ID, "add", RemoveCommand.ID, "", "iterator", "", "elements", "addAll", "removeAll", "retainAll", "", "getSize", "()I", "size", "Lkotlin/collections/builders/MapBuilder;", "backing", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "()V", "initialCapacity", "(I)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class SetBuilder<E> extends AbstractMutableSet<E> implements Serializable {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final SetBuilder f79550q0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final MapBuilder<E, ?> f79551p0;

    /* JADX INFO: compiled from: SetBuilder.kt */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
        f79550q0 = new SetBuilder(MapBuilder.INSTANCE.getEmpty$kotlin_stdlib());
    }

    public SetBuilder(@NotNull MapBuilder<E, ?> backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f79551p0 = backing;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f79551p0.getIsReadOnly()) {
            return new SerializedCollection(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E element) {
        return this.f79551p0.addKey$kotlin_stdlib(element) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f79551p0.checkIsMutable$kotlin_stdlib();
        return super.addAll(elements);
    }

    @NotNull
    public final Set<E> build() {
        this.f79551p0.build();
        return size() > 0 ? this : f79550q0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f79551p0.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return this.f79551p0.containsKey(element);
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.f79551p0.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f79551p0.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return this.f79551p0.keysIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        return this.f79551p0.removeKey$kotlin_stdlib(element) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f79551p0.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f79551p0.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }

    public SetBuilder() {
        this(new MapBuilder());
    }

    public SetBuilder(int i10) {
        this(new MapBuilder(i10));
    }
}
