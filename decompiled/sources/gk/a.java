package gk;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.SinceKotlin;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesSerializationProxy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EnumEntries.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.8")
public final class a<T extends Enum<T>> extends AbstractList<T> implements EnumEntries<T>, Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final T[] f68618p0;

    public a(@NotNull T[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f68618p0 = entries;
    }

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(this.f68618p0);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return contains((Enum) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f68618p0.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return lastIndexOf((Enum) obj);
        }
        return -1;
    }

    public boolean contains(@NotNull T element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return ((Enum) ArraysKt___ArraysKt.getOrNull(this.f68618p0, element.ordinal())) == element;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    public T get(int i10) {
        AbstractList.Companion companion = AbstractList.INSTANCE;
        T[] tArr = this.f68618p0;
        companion.checkElementIndex$kotlin_stdlib(i10, tArr.length);
        return tArr[i10];
    }

    public int indexOf(@NotNull T element) {
        Intrinsics.checkNotNullParameter(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) ArraysKt___ArraysKt.getOrNull(this.f68618p0, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    public int lastIndexOf(@NotNull T element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf((Object) element);
    }
}
