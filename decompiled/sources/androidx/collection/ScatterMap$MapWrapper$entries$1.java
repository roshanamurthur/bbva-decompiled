package androidx.collection;

import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0010\"\n\u0002\u0010&\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002J\"\u0010\n\u001a\u00020\b2\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\u001b\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u000fH\u0096\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"androidx/collection/ScatterMap$MapWrapper$entries$1", "", "", "size", "", "getSize", "()I", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "element", "containsAll", "elements", "", "isEmpty", "iterator", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1834:1\n1726#2,3:1835\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1\n*L\n712#1:1835,3\n*E\n"})
public final class ScatterMap$MapWrapper$entries$1<K, V> implements Set<Map.Entry<? extends K, ? extends V>>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ScatterMap<K, V> f2485p0;

    /* JADX INFO: compiled from: ScatterMap.kt */
    @DebugMetadata(c = "androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {701}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
    @SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n1810#3:1841\n1672#3:1845\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1\n*L\n699#1:1835,6\n699#1:1842,3\n699#1:1846,9\n699#1:1841\n699#1:1845\n*E\n"})
    public static final class a extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Map.Entry<? extends K, ? extends V>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ScatterMap f2486p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long[] f2487q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f2488r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f2489s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f2490t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f2491u0;
        public long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f2492w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public /* synthetic */ Object f2493x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ ScatterMap<K, V> f2494y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ScatterMap<K, V> scatterMap, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f2494y0 = scatterMap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f2494y0, continuation);
            aVar.f2493x0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((a) create((SequenceScope) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0051  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:29:0x00b7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0066). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009b -> B:21:0x009f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00a6 -> B:23:0x00a7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b4 -> B:28:0x00b5). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r23) {
            /*
                r22 = this;
                r0 = r22
                java.lang.Object r1 = ek.a.getCOROUTINE_SUSPENDED()
                int r2 = r0.f2492w0
                r3 = 1
                r5 = 8
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                int r2 = r0.f2491u0
                int r6 = r0.f2490t0
                long r7 = r0.v0
                int r9 = r0.f2489s0
                int r10 = r0.f2488r0
                long[] r11 = r0.f2487q0
                androidx.collection.ScatterMap r12 = r0.f2486p0
                java.lang.Object r13 = r0.f2493x0
                kotlin.sequences.SequenceScope r13 = (kotlin.sequences.SequenceScope) r13
                kotlin.ResultKt.throwOnFailure(r23)
                r4 = r0
                goto L9f
            L27:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L2f:
                kotlin.ResultKt.throwOnFailure(r23)
                java.lang.Object r2 = r0.f2493x0
                kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
                androidx.collection.ScatterMap<K, V> r6 = r0.f2494y0
                long[] r7 = r6.metadata
                int r8 = r7.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto Lbb
                r10 = r0
                r9 = 0
            L41:
                r11 = r7[r9]
                long r13 = ~r11
                r15 = 7
                long r13 = r13 << r15
                long r13 = r13 & r11
                r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r13 = r13 & r15
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 == 0) goto Lb4
                int r13 = r9 - r8
                int r13 = ~r13
                int r13 = r13 >>> 31
                int r13 = 8 - r13
                r14 = r2
                r2 = 0
                r19 = r13
                r13 = r6
                r6 = r19
                r20 = r11
                r12 = r7
                r11 = r10
                r10 = r8
                r7 = r20
            L66:
                if (r2 >= r6) goto Lab
                r15 = 255(0xff, double:1.26E-321)
                long r15 = r15 & r7
                r17 = 128(0x80, double:6.3E-322)
                int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                if (r15 >= 0) goto La6
                int r15 = r9 << 3
                int r15 = r15 + r2
                androidx.collection.e r4 = new androidx.collection.e
                java.lang.Object[] r5 = r13.keys
                r5 = r5[r15]
                java.lang.Object[] r3 = r13.values
                r3 = r3[r15]
                r4.<init>(r5, r3)
                r11.f2493x0 = r14
                r11.f2486p0 = r13
                r11.f2487q0 = r12
                r11.f2488r0 = r10
                r11.f2489s0 = r9
                r11.v0 = r7
                r11.f2490t0 = r6
                r11.f2491u0 = r2
                r3 = 1
                r11.f2492w0 = r3
                java.lang.Object r4 = r14.yield(r4, r11)
                if (r4 != r1) goto L9b
                return r1
            L9b:
                r4 = r11
                r11 = r12
                r12 = r13
                r13 = r14
            L9f:
                r14 = r13
                r13 = r12
                r12 = r11
                r11 = r4
                r4 = 8
                goto La7
            La6:
                r4 = r5
            La7:
                long r7 = r7 >> r4
                int r2 = r2 + r3
                r5 = r4
                goto L66
            Lab:
                r4 = r5
                if (r6 != r4) goto Lbb
                r8 = r10
                r10 = r11
                r7 = r12
                r6 = r13
                r2 = r14
                goto Lb5
            Lb4:
                r4 = r5
            Lb5:
                if (r9 == r8) goto Lbb
                int r9 = r9 + 1
                r5 = r4
                goto L41
            Lbb:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap$MapWrapper$entries$1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ScatterMap$MapWrapper$entries$1(ScatterMap<K, V> scatterMap) {
        this.f2485p0 = scatterMap;
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!Intrinsics.areEqual(this.f2485p0.get((K) entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.f2485p0._size;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f2485p0.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return SequencesKt__SequenceBuilderKt.iterator(new a(this.f2485p0, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public boolean add(Map.Entry<? extends K, ? extends V> entry) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@NotNull Map.Entry<? extends K, ? extends V> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return Intrinsics.areEqual(this.f2485p0.get(element.getKey()), element.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }
}
