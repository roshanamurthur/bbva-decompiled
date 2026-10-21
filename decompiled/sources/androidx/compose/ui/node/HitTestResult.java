package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HitTestResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0010\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002./B\u0007¢\u0006\u0004\b,\u0010-J\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003J$\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ,\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ,\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ\u001a\u0010\u0012\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0086\bø\u0001\u0000J\u0011\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\u0017\u001a\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016J\u0011\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0096\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0096\u0002J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0018H\u0016J\u0006\u0010%\u001a\u00020\u0005R$\u0010+\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00188\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00060"}, d2 = {"Landroidx/compose/ui/node/HitTestResult;", "", "Landroidx/compose/ui/Modifier$Node;", "", "hasHit", "", "acceptHits", "", "distanceFromEdge", "isInLayer", "isHitInMinimumTouchTargetBetter", "node", "Lkotlin/Function0;", "childHitTest", "hit", "hitInMinimumTouchTarget", "speculativeHit", "block", "siblingHits", "element", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "elements", "containsAll", "", FirebaseAnalytics.Param.INDEX, "get", "indexOf", "isEmpty", "", "iterator", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", ClearCommand.ID, "<set-?>", "s0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSize", "()I", "size", "<init>", "()V", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,341:1\n1855#2,2:342\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n195#1:342,2\n*E\n"})
public final class HitTestResult implements List<Modifier.Node>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public Object[] f16772p0 = new Object[16];

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public long[] f16773q0 = new long[16];

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f16774r0 = -1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: compiled from: HitTestResult.kt */
    @SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,341:1\n1855#2,2:342\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n*L\n273#1:342,2\n*E\n"})
    public final class b implements List<Modifier.Node>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f16780p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f16781q0;

        public b(int i10, int i11) {
            this.f16780p0 = i10;
            this.f16781q0 = i11;
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ void add(int i10, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i10, Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Modifier.Node)) {
                return false;
            }
            Modifier.Node element = (Modifier.Node) obj;
            Intrinsics.checkNotNullParameter(element, "element");
            return indexOf(element) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains((Modifier.Node) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final Modifier.Node get(int i10) {
            Object obj = HitTestResult.this.f16772p0[i10 + this.f16780p0];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) obj;
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Modifier.Node)) {
                return -1;
            }
            Modifier.Node element = (Modifier.Node) obj;
            Intrinsics.checkNotNullParameter(element, "element");
            int i10 = this.f16780p0;
            int i11 = this.f16781q0;
            if (i10 > i11) {
                return -1;
            }
            int i12 = i10;
            while (!Intrinsics.areEqual(HitTestResult.this.f16772p0[i12], element)) {
                if (i12 == i11) {
                    return -1;
                }
                i12++;
            }
            return i12 - i10;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public final Iterator<Modifier.Node> iterator() {
            int i10 = this.f16780p0;
            return HitTestResult.this.new a(i10, i10, this.f16781q0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Modifier.Node)) {
                return -1;
            }
            Modifier.Node element = (Modifier.Node) obj;
            Intrinsics.checkNotNullParameter(element, "element");
            int i10 = this.f16781q0;
            int i11 = this.f16780p0;
            if (i11 > i10) {
                return -1;
            }
            while (!Intrinsics.areEqual(HitTestResult.this.f16772p0[i10], element)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - i11;
        }

        @Override // java.util.List
        @NotNull
        public final ListIterator<Modifier.Node> listIterator() {
            int i10 = this.f16780p0;
            return HitTestResult.this.new a(i10, i10, this.f16781q0);
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ Modifier.Node remove(int i10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ Modifier.Node set(int i10, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f16781q0 - this.f16780p0;
        }

        @Override // java.util.List
        public final void sort(Comparator<? super Modifier.Node> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        @NotNull
        public final List<Modifier.Node> subList(int i10, int i11) {
            int i12 = this.f16780p0;
            return HitTestResult.this.new b(i10 + i12, i12 + i11);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        @NotNull
        public final ListIterator<Modifier.Node> listIterator(int i10) {
            int i11 = this.f16780p0;
            int i12 = this.f16781q0;
            return HitTestResult.this.new a(i10 + i11, i11, i12);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.toArray(this, array);
        }
    }

    public final long a() {
        long jAccess$DistanceAndInLayer = HitTestResultKt.access$DistanceAndInLayer(Float.POSITIVE_INFINITY, false);
        int i10 = this.f16774r0 + 1;
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this);
        if (i10 <= lastIndex) {
            while (true) {
                long j10 = this.f16773q0[i10];
                if (i1.d.a(j10, jAccess$DistanceAndInLayer) < 0) {
                    jAccess$DistanceAndInLayer = j10;
                }
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                if (Float.intBitsToFloat((int) (jAccess$DistanceAndInLayer >> 32)) < 0.0f && ((int) (4294967295L & jAccess$DistanceAndInLayer)) != 0) {
                    return jAccess$DistanceAndInLayer;
                }
                if (i10 != lastIndex) {
                    i10++;
                }
            }
        }
        return jAccess$DistanceAndInLayer;
    }

    public final void acceptHits() {
        this.f16774r0 = size() - 1;
    }

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i10, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        int i10 = this.f16774r0 + 1;
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this);
        if (i10 <= lastIndex) {
            while (true) {
                this.f16772p0[i10] = null;
                if (i10 == lastIndex) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.size = this.f16774r0 + 1;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f16774r0 = -1;
        b();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Modifier.Node) {
            return contains((Modifier.Node) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.size;
    }

    public final boolean hasHit() {
        long jA = a();
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (jA >> 32)) < 0.0f && ((int) (jA & 4294967295L)) != 0;
    }

    public final void hit(@NotNull Modifier.Node node, boolean isInLayer, @NotNull Function0<Unit> childHitTest) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(childHitTest, "childHitTest");
        hitInMinimumTouchTarget(node, -1.0f, isInLayer, childHitTest);
    }

    public final void hitInMinimumTouchTarget(@NotNull Modifier.Node node, float distanceFromEdge, boolean isInLayer, @NotNull Function0<Unit> childHitTest) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(childHitTest, "childHitTest");
        int i10 = this.f16774r0;
        int i11 = i10 + 1;
        this.f16774r0 = i11;
        Object[] objArr = this.f16772p0;
        if (i11 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f16772p0 = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.f16773q0, length);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.f16773q0 = jArrCopyOf;
        }
        Object[] objArr2 = this.f16772p0;
        int i12 = this.f16774r0;
        objArr2[i12] = node;
        this.f16773q0[i12] = HitTestResultKt.access$DistanceAndInLayer(distanceFromEdge, isInLayer);
        b();
        childHitTest.invoke();
        this.f16774r0 = i10;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return indexOf((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isHitInMinimumTouchTargetBetter(float distanceFromEdge, boolean isInLayer) {
        if (this.f16774r0 == CollectionsKt__CollectionsKt.getLastIndex(this)) {
            return true;
        }
        return i1.d.a(a(), HitTestResultKt.access$DistanceAndInLayer(distanceFromEdge, isInLayer)) > 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<Modifier.Node> iterator() {
        return new a(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return lastIndexOf((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<Modifier.Node> listIterator() {
        return new a(this, 0, 7);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Modifier.Node remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
    public Modifier.Node set2(int i10, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void siblingHits(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int i10 = this.f16774r0;
        block.invoke();
        this.f16774r0 = i10;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super Modifier.Node> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void speculativeHit(@NotNull Modifier.Node node, float distanceFromEdge, boolean isInLayer, @NotNull Function0<Unit> childHitTest) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(childHitTest, "childHitTest");
        if (this.f16774r0 == CollectionsKt__CollectionsKt.getLastIndex(this)) {
            hitInMinimumTouchTarget(node, distanceFromEdge, isInLayer, childHitTest);
            if (this.f16774r0 + 1 == CollectionsKt__CollectionsKt.getLastIndex(this)) {
                b();
                return;
            }
            return;
        }
        long jA = a();
        int i10 = this.f16774r0;
        this.f16774r0 = CollectionsKt__CollectionsKt.getLastIndex(this);
        hitInMinimumTouchTarget(node, distanceFromEdge, isInLayer, childHitTest);
        if (this.f16774r0 + 1 < CollectionsKt__CollectionsKt.getLastIndex(this) && i1.d.a(jA, a()) > 0) {
            int i11 = this.f16774r0 + 1;
            int i12 = i10 + 1;
            Object[] objArr = this.f16772p0;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i12, i11, size());
            long[] jArr = this.f16773q0;
            ArraysKt___ArraysJvmKt.copyInto(jArr, jArr, i12, i11, size());
            this.f16774r0 = ((size() + i10) - this.f16774r0) - 1;
        }
        b();
        this.f16774r0 = i10;
    }

    @Override // java.util.List
    @NotNull
    public List<Modifier.Node> subList(int fromIndex, int toIndex) {
        return new b(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@NotNull Modifier.Node element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf((Object) element) != -1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    @NotNull
    public Modifier.Node get(int index) {
        Object obj = this.f16772p0[index];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (Modifier.Node) obj;
    }

    public int indexOf(@NotNull Modifier.Node element) {
        Intrinsics.checkNotNullParameter(element, "element");
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this);
        if (lastIndex < 0) {
            return -1;
        }
        int i10 = 0;
        while (!Intrinsics.areEqual(this.f16772p0[i10], element)) {
            if (i10 == lastIndex) {
                return -1;
            }
            i10++;
        }
        return i10;
    }

    public int lastIndexOf(@NotNull Modifier.Node element) {
        Intrinsics.checkNotNullParameter(element, "element");
        for (int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this); -1 < lastIndex; lastIndex--) {
            if (Intrinsics.areEqual(this.f16772p0[lastIndex], element)) {
                return lastIndex;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<Modifier.Node> listIterator(int index) {
        return new a(this, index, 6);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node set(int i10, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }

    public boolean add(Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: compiled from: HitTestResult.kt */
    public final class a implements ListIterator<Modifier.Node>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f16776p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f16777q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f16778r0;

        public a(int i10, int i11, int i12) {
            this.f16776p0 = i10;
            this.f16777q0 = i11;
            this.f16778r0 = i12;
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void add(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f16776p0 < this.f16778r0;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f16776p0 > this.f16777q0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            Object[] objArr = HitTestResult.this.f16772p0;
            int i10 = this.f16776p0;
            this.f16776p0 = i10 + 1;
            Object obj = objArr[i10];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) obj;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f16776p0 - this.f16777q0;
        }

        @Override // java.util.ListIterator
        public final Modifier.Node previous() {
            Object[] objArr = HitTestResult.this.f16772p0;
            int i10 = this.f16776p0 - 1;
            this.f16776p0 = i10;
            Object obj = objArr[i10];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) obj;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.f16776p0 - this.f16777q0) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void set(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ a(HitTestResult hitTestResult, int i10, int i11) {
            this((i11 & 1) != 0 ? 0 : i10, 0, (i11 & 4) != 0 ? hitTestResult.size() : 0);
        }
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
