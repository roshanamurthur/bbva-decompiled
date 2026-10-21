package androidx.collection;

import androidx.annotation.IntRange;
import androidx.appcompat.widget.o1;
import androidx.exifinterface.media.ExifInterface;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ObjectList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003567B\u0011\u0012\b\b\u0002\u00102\u001a\u00020\u0007¢\u0006\u0004\b3\u00104J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\nJ%\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u001e\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010J\u001b\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u0011J\u0014\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u0014\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013J\u0014\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\u0017\u0010\u0015\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010\u0015\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\u0002J\u001e\u0010\u0015\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0002J\u0017\u0010\u0015\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\u0002J\u0017\u0010\u0015\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002J\u0006\u0010\u0017\u001a\u00020\tJ\u0010\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0007J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u0015\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u0006J/\u0010#\u001a\u00020\t2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u001fH\u0086\bø\u0001\u0000J\u001b\u0010$\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b$\u0010\u0011J\u0014\u0010$\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010$\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010J\u0014\u0010$\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u0014\u0010$\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013J\u0014\u0010$\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\u001e\u0010\u001d\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u0016J\u0017\u0010\u001d\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010\u001d\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\u0002J\u0017\u0010\u001d\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0002J\u0017\u0010\u001d\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\u0002J\u0017\u0010\u001d\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002J\u0017\u0010%\u001a\u00028\u00002\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\t2\b\b\u0001\u0010'\u001a\u00020\u00072\b\b\u0001\u0010(\u001a\u00020\u0007J\u001b\u0010*\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b*\u0010\u0011J\u0014\u0010*\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010*\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u0014\u0010*\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013J\u0014\u0010*\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\"\u0010+\u001a\u00028\u00002\b\b\u0001\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b+\u0010,J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016J\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.R\u0012\u0010\u001a\u001a\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00068"}, d2 = {"Landroidx/collection/MutableObjectList;", ExifInterface.LONGITUDE_EAST, "Landroidx/collection/ObjectList;", "element", "", "add", "(Ljava/lang/Object;)Z", "", FirebaseAnalytics.Param.INDEX, "", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(I[Ljava/lang/Object;)Z", "", "Landroidx/collection/ScatterSet;", "([Ljava/lang/Object;)Z", "", "", "Lkotlin/sequences/Sequence;", "plusAssign", "([Ljava/lang/Object;)V", ClearCommand.ID, "minCapacity", "trim", "capacity", "ensureCapacity", "(Ljava/lang/Object;)V", "minusAssign", RemoveCommand.ID, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "predicate", "removeIf", "removeAll", "removeAt", "(I)Ljava/lang/Object;", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "removeRange", "retainAll", SetCommand.ID, "(ILjava/lang/Object;)Ljava/lang/Object;", "asList", "", "asMutableList", "getCapacity", "()I", "initialCapacity", "<init>", "(I)V", "a", "b", "c", "collection"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 ObjectList.kt\nandroidx/collection/ObjectList\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1618:1\n948#1,2:1641\n948#1,2:1652\n948#1,2:1656\n652#1:1659\n955#1,2:1662\n955#1,2:1669\n955#1,2:1691\n955#1,2:1701\n955#1,2:1704\n955#1,2:1708\n1864#2,3:1619\n1855#2:1651\n1856#2:1654\n1855#2:1703\n1856#2:1706\n267#3,4:1622\n237#3,7:1626\n248#3,3:1634\n251#3,2:1638\n272#3:1640\n273#3:1643\n254#3,6:1644\n274#3:1650\n267#3,4:1672\n237#3,7:1676\n248#3,3:1684\n251#3,2:1688\n272#3:1690\n273#3:1693\n254#3,6:1694\n274#3:1700\n1810#4:1633\n1672#4:1637\n1810#4:1683\n1672#4:1687\n1295#5:1655\n1296#5:1658\n1295#5:1707\n1296#5:1710\n80#6:1660\n305#6,4:1665\n310#6:1671\n75#6:1711\n75#6:1712\n75#6:1713\n75#6:1714\n75#6:1715\n75#6:1716\n75#6:1717\n75#6:1718\n13579#7:1661\n13580#7:1664\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n864#1:1641,2\n898#1:1652,2\n907#1:1656,2\n927#1:1659\n1050#1:1662,2\n1059#1:1669,2\n1068#1:1691,2\n1077#1:1701,2\n1086#1:1704,2\n1095#1:1708,2\n740#1:1619,3\n897#1:1651\n897#1:1654\n1085#1:1703\n1085#1:1706\n863#1:1622,4\n863#1:1626,7\n863#1:1634,3\n863#1:1638,2\n863#1:1640\n863#1:1643\n863#1:1644,6\n863#1:1650\n1067#1:1672,4\n1067#1:1676,7\n1067#1:1684,3\n1067#1:1688,2\n1067#1:1690\n1067#1:1693\n1067#1:1694,6\n1067#1:1700\n863#1:1633\n863#1:1637\n1067#1:1683\n1067#1:1687\n906#1:1655\n906#1:1658\n1094#1:1707\n1094#1:1710\n979#1:1660\n1058#1:1665,4\n1058#1:1671\n1105#1:1711\n1109#1:1712\n1159#1:1713\n1175#1:1714\n1191#1:1715\n1207#1:1716\n1223#1:1717\n1242#1:1718\n1049#1:1661\n1049#1:1664\n*E\n"})
public final class MutableObjectList<E> extends ObjectList<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public b<E> f2417a;

    /* JADX INFO: compiled from: ObjectList.kt */
    public static final class a<T> implements ListIterator<T>, KMutableListIterator {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final List<T> f2418p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f2419q0;

        public a(@NotNull List<T> list, int i10) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f2418p0 = list;
            this.f2419q0 = i10 - 1;
        }

        @Override // java.util.ListIterator
        public final void add(T t10) {
            int i10 = this.f2419q0 + 1;
            this.f2419q0 = i10;
            this.f2418p0.add(i10, t10);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f2419q0 < this.f2418p0.size() - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f2419q0 >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            int i10 = this.f2419q0 + 1;
            this.f2419q0 = i10;
            return this.f2418p0.get(i10);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f2419q0 + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            int i10 = this.f2419q0;
            this.f2419q0 = i10 - 1;
            return this.f2418p0.get(i10);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f2419q0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.f2418p0.remove(this.f2419q0);
            this.f2419q0--;
        }

        @Override // java.util.ListIterator
        public final void set(T t10) {
            this.f2418p0.set(this.f2419q0, t10);
        }
    }

    /* JADX INFO: compiled from: ObjectList.kt */
    public static final class b<T> implements List<T>, KMutableList {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final MutableObjectList<T> f2420p0;

        public b(@NotNull MutableObjectList<T> objectList) {
            Intrinsics.checkNotNullParameter(objectList, "objectList");
            this.f2420p0 = objectList;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t10) {
            return this.f2420p0.add(t10);
        }

        @Override // java.util.List
        public final boolean addAll(int i10, @NotNull Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f2420p0.addAll(i10, elements);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.f2420p0.clear();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f2420p0.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f2420p0.containsAll(elements);
        }

        @Override // java.util.List
        public final T get(int i10) {
            ObjectListKt.access$checkIndex(this, i10);
            return this.f2420p0.get(i10);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.f2420p0.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f2420p0.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public final Iterator<T> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            return this.f2420p0.lastIndexOf(obj);
        }

        @Override // java.util.List
        @NotNull
        public final ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.f2420p0.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f2420p0.removeAll(elements);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f2420p0.retainAll((Collection<? extends T>) elements);
        }

        @Override // java.util.List
        public final T set(int i10, T t10) {
            ObjectListKt.access$checkIndex(this, i10);
            return this.f2420p0.set(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f2420p0.getSize();
        }

        @Override // java.util.List
        @NotNull
        public final List<T> subList(int i10, int i11) {
            ObjectListKt.access$checkSubIndex(this, i10, i11);
            return new c(i10, i11, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List
        public final void add(int i10, T t10) {
            this.f2420p0.add(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(@NotNull Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f2420p0.addAll(elements);
        }

        @Override // java.util.List
        @NotNull
        public final ListIterator<T> listIterator(int i10) {
            return new a(this, i10);
        }

        @Override // java.util.List
        public final T remove(int i10) {
            ObjectListKt.access$checkIndex(this, i10);
            return this.f2420p0.removeAt(i10);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.toArray(this, array);
        }
    }

    /* JADX INFO: compiled from: ObjectList.kt */
    @SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1618:1\n1855#2,2:1619\n1855#2,2:1621\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n*L\n1395#1:1619,2\n1477#1:1621,2\n*E\n"})
    public static final class c<T> implements List<T>, KMutableList {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final List<T> f2421p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f2422q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f2423r0;

        public c(int i10, int i11, @NotNull List list) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f2421p0 = list;
            this.f2422q0 = i10;
            this.f2423r0 = i11;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t10) {
            int i10 = this.f2423r0;
            this.f2423r0 = i10 + 1;
            this.f2421p0.add(i10, t10);
            return true;
        }

        @Override // java.util.List
        public final boolean addAll(int i10, @NotNull Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.f2421p0.addAll(i10 + this.f2422q0, elements);
            this.f2423r0 = elements.size() + this.f2423r0;
            return elements.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i10 = this.f2423r0 - 1;
            int i11 = this.f2422q0;
            if (i11 <= i10) {
                while (true) {
                    this.f2421p0.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f2423r0 = i11;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i10 = this.f2423r0;
            for (int i11 = this.f2422q0; i11 < i10; i11++) {
                if (Intrinsics.areEqual(this.f2421p0.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i10) {
            ObjectListKt.access$checkIndex(this, i10);
            return this.f2421p0.get(i10 + this.f2422q0);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i10 = this.f2423r0;
            int i11 = this.f2422q0;
            for (int i12 = i11; i12 < i10; i12++) {
                if (Intrinsics.areEqual(this.f2421p0.get(i12), obj)) {
                    return i12 - i11;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f2423r0 == this.f2422q0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public final Iterator<T> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i10 = this.f2423r0 - 1;
            int i11 = this.f2422q0;
            if (i11 > i10) {
                return -1;
            }
            while (!Intrinsics.areEqual(this.f2421p0.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - i11;
        }

        @Override // java.util.List
        @NotNull
        public final ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i10 = this.f2423r0;
            for (int i11 = this.f2422q0; i11 < i10; i11++) {
                List<T> list = this.f2421p0;
                if (Intrinsics.areEqual(list.get(i11), obj)) {
                    list.remove(i11);
                    this.f2423r0--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i10 = this.f2423r0;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f2423r0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i10 = this.f2423r0;
            int i11 = i10 - 1;
            int i12 = this.f2422q0;
            if (i12 <= i11) {
                while (true) {
                    List<T> list = this.f2421p0;
                    if (!elements.contains(list.get(i11))) {
                        list.remove(i11);
                        this.f2423r0--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f2423r0;
        }

        @Override // java.util.List
        public final T set(int i10, T t10) {
            ObjectListKt.access$checkIndex(this, i10);
            return this.f2421p0.set(i10 + this.f2422q0, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f2423r0 - this.f2422q0;
        }

        @Override // java.util.List
        @NotNull
        public final List<T> subList(int i10, int i11) {
            ObjectListKt.access$checkSubIndex(this, i10, i11);
            return new c(i10, i11, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List
        public final void add(int i10, T t10) {
            this.f2421p0.add(i10 + this.f2422q0, t10);
            this.f2423r0++;
        }

        @Override // java.util.List
        @NotNull
        public final ListIterator<T> listIterator(int i10) {
            return new a(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.toArray(this, array);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(@NotNull Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.f2421p0.addAll(this.f2423r0, elements);
            this.f2423r0 = elements.size() + this.f2423r0;
            return elements.size() > 0;
        }

        @Override // java.util.List
        public final T remove(int i10) {
            ObjectListKt.access$checkIndex(this, i10);
            T tRemove = this.f2421p0.remove(i10 + this.f2422q0);
            this.f2423r0--;
            return tRemove;
        }
    }

    public MutableObjectList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableObjectList mutableObjectList, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = mutableObjectList._size;
        }
        mutableObjectList.trim(i10);
    }

    public final boolean add(E element) {
        ensureCapacity(this._size + 1);
        Object[] objArr = this.content;
        int i10 = this._size;
        objArr[i10] = element;
        this._size = i10 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int index, @NotNull E[] elements) {
        int i10;
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index < 0 || index > (i10 = this._size)) {
            StringBuilder sbC = o1.c("Index ", index, " must be in 0..");
            sbC.append(this._size);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(i10 + elements.length);
        Object[] objArr = this.content;
        int i11 = this._size;
        if (index != i11) {
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, elements.length + index, index, i11);
        }
        ArraysKt___ArraysJvmKt.copyInto$default(elements, objArr, index, 0, 0, 12, (Object) null);
        this._size += elements.length;
        return true;
    }

    @Override // androidx.collection.ObjectList
    @NotNull
    public List<E> asList() {
        return asMutableList();
    }

    @NotNull
    public final List<E> asMutableList() {
        b<E> bVar = this.f2417a;
        if (bVar != null) {
            return bVar;
        }
        b<E> bVar2 = new b<>(this);
        this.f2417a = bVar2;
        return bVar2;
    }

    public final void clear() {
        ArraysKt___ArraysJvmKt.fill(this.content, (Object) null, 0, this._size);
        this._size = 0;
    }

    public final void ensureCapacity(int capacity) {
        Object[] objArr = this.content;
        if (objArr.length < capacity) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(capacity, (objArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.content = objArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(E element) {
        remove(element);
    }

    public final void plusAssign(@NotNull ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        ensureCapacity(this._size + elements._size);
        ArraysKt___ArraysJvmKt.copyInto(elements.content, this.content, this._size, 0, elements._size);
        this._size += elements._size;
    }

    public final boolean remove(E element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        for (E e5 : elements) {
            remove(e5);
        }
        return i10 != this._size;
    }

    public final E removeAt(@IntRange(from = 0) int index) {
        int i10;
        if (index < 0 || index >= (i10 = this._size)) {
            StringBuilder sbC = o1.c("Index ", index, " must be in 0..");
            sbC.append(this._size - 1);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        Object[] objArr = this.content;
        E e5 = (E) objArr[index];
        if (index != i10 - 1) {
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, index, index + 1, i10);
        }
        int i11 = this._size - 1;
        this._size = i11;
        objArr[i11] = null;
        return e5;
    }

    public final void removeIf(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = this._size;
        Object[] objArr = this.content;
        int i11 = 0;
        kotlin.ranges.IntRange intRangeUntil = kotlin.ranges.c.until(0, i10);
        int first = intRangeUntil.getFirst();
        int last = intRangeUntil.getLast();
        if (first <= last) {
            while (true) {
                objArr[first - i11] = objArr[first];
                if (predicate.invoke(objArr[first]).booleanValue()) {
                    i11++;
                }
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, i10 - i11, i10);
        this._size -= i11;
    }

    public final void removeRange(@IntRange(from = 0) int start, @IntRange(from = 0) int end) {
        int i10;
        if (start < 0 || start > (i10 = this._size) || end < 0 || end > i10) {
            StringBuilder sbE = h.e("Start (", start, ") and end (", end, ") must be in 0..");
            sbE.append(this._size);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
        if (end < start) {
            throw new IllegalArgumentException(g.b("Start (", start, ") is more than end (", end, RootService.CLOSE_BRACKET));
        }
        if (end != start) {
            if (end < i10) {
                Object[] objArr = this.content;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, start, end, i10);
            }
            int i11 = this._size;
            int i12 = i11 - (end - start);
            ArraysKt___ArraysJvmKt.fill(this.content, (Object) null, i12, i11);
            this._size = i12;
        }
    }

    public final boolean retainAll(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        Object[] objArr = this.content;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (ArraysKt___ArraysKt.indexOf(elements, objArr[i11]) < 0) {
                removeAt(i11);
            }
        }
        return i10 != this._size;
    }

    public final E set(@IntRange(from = 0) int index, E element) {
        if (index < 0 || index >= this._size) {
            StringBuilder sbC = o1.c("set index ", index, " must be between 0 .. ");
            sbC.append(this._size - 1);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        Object[] objArr = this.content;
        E e5 = (E) objArr[index];
        objArr[index] = element;
        return e5;
    }

    public final void trim(int minCapacity) {
        int iMax = Math.max(minCapacity, this._size);
        Object[] objArr = this.content;
        if (objArr.length > iMax) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, iMax);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.content = objArrCopyOf;
        }
    }

    public /* synthetic */ MutableObjectList(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final void minusAssign(@NotNull List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size();
        for (int i10 = 0; i10 < size; i10++) {
            remove(elements.get(i10));
        }
    }

    public MutableObjectList(int i10) {
        super(i10, null);
    }

    public final void add(@IntRange(from = 0) int index, E element) {
        int i10;
        if (index >= 0 && index <= (i10 = this._size)) {
            ensureCapacity(i10 + 1);
            Object[] objArr = this.content;
            int i11 = this._size;
            if (index != i11) {
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, index + 1, index, i11);
            }
            objArr[index] = element;
            this._size++;
            return;
        }
        StringBuilder sbC = o1.c("Index ", index, " must be in 0..");
        sbC.append(this._size);
        throw new IndexOutOfBoundsException(sbC.toString());
    }

    public final void minusAssign(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (E e5 : elements) {
            remove(e5);
        }
    }

    public final boolean removeAll(@NotNull ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        minusAssign((ObjectList) elements);
        return i10 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.content;
        int i10 = elements._size;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(objArr[i11]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(@NotNull ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        Object[] objArr = this.content;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.contains(objArr[i11])) {
                removeAt(i11);
            }
        }
        return i10 != this._size;
    }

    public final boolean removeAll(@NotNull ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        minusAssign((ScatterSet) elements);
        return i10 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(@NotNull ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        ensureCapacity(elements.get_size() + this._size);
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        add(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        remove(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final boolean removeAll(@NotNull List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        minusAssign((List) elements);
        return i10 != this._size;
    }

    public final boolean retainAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        Object[] objArr = this.content;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.contains(objArr[i11])) {
                removeAt(i11);
            }
        }
        return i10 != this._size;
    }

    public final boolean removeAll(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        minusAssign((Iterable) elements);
        return i10 != this._size;
    }

    public final void minusAssign(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return;
        }
        ensureCapacity(this._size + elements.length);
        ArraysKt___ArraysJvmKt.copyInto$default(elements, this.content, this._size, 0, 0, 12, (Object) null);
        this._size += elements.length;
    }

    public final boolean removeAll(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        minusAssign((Sequence) elements);
        return i10 != this._size;
    }

    public final void minusAssign(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final boolean retainAll(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        Object[] objArr = this.content;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!CollectionsKt___CollectionsKt.contains(elements, objArr[i11])) {
                removeAt(i11);
            }
        }
        return i10 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int index, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index >= 0 && index <= this._size) {
            int i10 = 0;
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(elements.size() + this._size);
            Object[] objArr = this.content;
            if (index != this._size) {
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, elements.size() + index, index, this._size);
            }
            for (Object obj : elements) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                objArr[i10 + index] = obj;
                i10 = i11;
            }
            this._size = elements.size() + this._size;
            return true;
        }
        StringBuilder sbC = o1.c("Index ", index, " must be in 0..");
        sbC.append(this._size);
        throw new IndexOutOfBoundsException(sbC.toString());
    }

    public final void plusAssign(@NotNull List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i10 = this._size;
        ensureCapacity(elements.size() + i10);
        Object[] objArr = this.content;
        int size = elements.size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11 + i10] = elements.get(i11);
        }
        this._size = elements.size() + this._size;
    }

    public final boolean retainAll(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        Object[] objArr = this.content;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!SequencesKt___SequencesKt.contains(elements, objArr[i11])) {
                removeAt(i11);
            }
        }
        return i10 != this._size;
    }

    public final void plusAssign(E element) {
        add(element);
    }

    public final void plusAssign(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final void plusAssign(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final boolean addAll(@IntRange(from = 0) int index, @NotNull ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index >= 0 && index <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            Object[] objArr = this.content;
            int i10 = this._size;
            if (index != i10) {
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, elements._size + index, index, i10);
            }
            ArraysKt___ArraysJvmKt.copyInto(elements.content, objArr, index, 0, elements._size);
            this._size += elements._size;
            return true;
        }
        StringBuilder sbC = o1.c("Index ", index, " must be in 0..");
        sbC.append(this._size);
        throw new IndexOutOfBoundsException(sbC.toString());
    }

    public final boolean addAll(@NotNull ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        plusAssign((ObjectList) elements);
        return i10 != this._size;
    }

    public final boolean addAll(@NotNull ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        plusAssign((ScatterSet) elements);
        return i10 != this._size;
    }

    public final boolean addAll(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        plusAssign((Object[]) elements);
        return i10 != this._size;
    }

    public final boolean addAll(@NotNull List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        plusAssign((List) elements);
        return i10 != this._size;
    }

    public final boolean addAll(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        plusAssign((Iterable) elements);
        return i10 != this._size;
    }

    public final boolean addAll(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        plusAssign((Sequence) elements);
        return i10 != this._size;
    }
}
