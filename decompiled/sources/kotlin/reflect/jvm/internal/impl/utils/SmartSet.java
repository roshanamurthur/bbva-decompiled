package kotlin.reflect.jvm.internal.impl.utils;

import bk.w;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SmartSet.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nSmartSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartSet.kt\norg/jetbrains/kotlin/utils/SmartSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
public final class SmartSet<T> extends AbstractSet<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public Object f82114p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f82115q0;

    /* JADX INFO: compiled from: SmartSet.kt */
    @SourceDebugExtension({"SMAP\nSmartSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartSet.kt\norg/jetbrains/kotlin/utils/SmartSet$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final <T> SmartSet<T> create() {
            return new SmartSet<>(null);
        }

        @JvmStatic
        @NotNull
        public final <T> SmartSet<T> create(@NotNull Collection<? extends T> set) {
            Intrinsics.checkNotNullParameter(set, "set");
            SmartSet<T> smartSet = new SmartSet<>(null);
            smartSet.addAll(set);
            return smartSet;
        }
    }

    /* JADX INFO: compiled from: SmartSet.kt */
    public static final class a<T> implements Iterator<T>, KMutableIterator {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final Iterator<T> f82116p0;

        public a(@NotNull T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f82116p0 = ArrayIteratorKt.iterator(array);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f82116p0.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f82116p0.next();
        }

        @Override // java.util.Iterator
        @NotNull
        public Void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: SmartSet.kt */
    public static final class b<T> implements Iterator<T>, KMutableIterator {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T f82117p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f82118q0 = true;

        public b(T t10) {
            this.f82117p0 = t10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f82118q0;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f82118q0) {
                throw new NoSuchElementException();
            }
            this.f82118q0 = false;
            return this.f82117p0;
        }

        @Override // java.util.Iterator
        @NotNull
        public Void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ SmartSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public static final <T> SmartSet<T> create() {
        return Companion.create();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t10) {
        Object obj;
        if (size() == 0) {
            this.f82114p0 = t10;
        } else if (size() == 1) {
            if (Intrinsics.areEqual(this.f82114p0, t10)) {
                return false;
            }
            this.f82114p0 = new Object[]{this.f82114p0, t10};
        } else if (size() < 5) {
            Object obj2 = this.f82114p0;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj2;
            if (ArraysKt___ArraysKt.contains(objArr, t10)) {
                return false;
            }
            if (size() == 4) {
                LinkedHashSet linkedHashSetLinkedSetOf = w.linkedSetOf(Arrays.copyOf(objArr, objArr.length));
                linkedHashSetLinkedSetOf.add(t10);
                obj = linkedHashSetLinkedSetOf;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = t10;
                obj = objArrCopyOf;
            }
            this.f82114p0 = obj;
        } else {
            Object obj3 = this.f82114p0;
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!TypeIntrinsics.asMutableSet(obj3).add(t10)) {
                return false;
            }
        }
        setSize(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f82114p0 = null;
        setSize(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return Intrinsics.areEqual(this.f82114p0, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f82114p0;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return ArraysKt___ArraysKt.contains((Object[]) obj2, obj);
        }
        Object obj3 = this.f82114p0;
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    public int getSize() {
        return this.f82115q0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new b(this.f82114p0);
        }
        if (size() < 5) {
            Object obj = this.f82114p0;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.f82114p0;
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return TypeIntrinsics.asMutableSet(obj2).iterator();
    }

    public void setSize(int i10) {
        this.f82115q0 = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    public SmartSet() {
    }
}
