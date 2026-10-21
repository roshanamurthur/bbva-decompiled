package androidx.collection;

import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.Collection;
import java.util.Iterator;
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

/* JADX INFO: Add missing generic type declarations: [K] */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0002R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"androidx/collection/ScatterMap$MapWrapper$keys$1", "", "size", "", "getSize", "()I", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "isEmpty", "iterator", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$keys$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1834:1\n1726#2,3:1835\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$keys$1\n*L\n731#1:1835,3\n*E\n"})
public final class ScatterMap$MapWrapper$keys$1<K> implements Set<K>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ScatterMap<K, V> f2495p0;

    /* JADX INFO: compiled from: ScatterMap.kt */
    @DebugMetadata(c = "androidx.collection.ScatterMap$MapWrapper$keys$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {726}, m = "invokeSuspend", n = {"$this$iterator", "k$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
    @SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$keys$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n405#2,3:1835\n363#2,6:1838\n373#2,3:1845\n376#2,2:1849\n409#2,2:1851\n379#2,6:1853\n411#2:1859\n1810#3:1844\n1672#3:1848\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$keys$1$iterator$1\n*L\n725#1:1835,3\n725#1:1838,6\n725#1:1845,3\n725#1:1849,2\n725#1:1851,2\n725#1:1853,6\n725#1:1859\n725#1:1844\n725#1:1848\n*E\n"})
    public static final class a extends RestrictedSuspendLambda implements Function2<SequenceScope<? super K>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object[] f2496p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long[] f2497q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f2498r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f2499s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f2500t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f2501u0;
        public long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f2502w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public /* synthetic */ Object f2503x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ ScatterMap<K, V> f2504y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ScatterMap<K, V> scatterMap, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f2504y0 = scatterMap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f2504y0, continuation);
            aVar.f2503x0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((a) create((SequenceScope) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0056  */
        /* JADX WARN: Code duplicated, block: B:23:0x009e A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:24:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:26:0x00a7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0054 -> B:25:0x00a5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0056 -> B:14:0x0068). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0071 -> B:22:0x009b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0091 -> B:21:0x0096). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r22) {
            /*
                r21 = this;
                r0 = r21
                java.lang.Object r1 = ek.a.getCOROUTINE_SUSPENDED()
                int r2 = r0.f2502w0
                r3 = 1
                r4 = 0
                r5 = 8
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                int r2 = r0.f2501u0
                int r6 = r0.f2500t0
                long r7 = r0.v0
                int r9 = r0.f2499s0
                int r10 = r0.f2498r0
                long[] r11 = r0.f2497q0
                java.lang.Object[] r12 = r0.f2496p0
                java.lang.Object r13 = r0.f2503x0
                kotlin.sequences.SequenceScope r13 = (kotlin.sequences.SequenceScope) r13
                kotlin.ResultKt.throwOnFailure(r22)
                r14 = r13
                r13 = r12
                r12 = r0
                goto L96
            L2a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L32:
                kotlin.ResultKt.throwOnFailure(r22)
                java.lang.Object r2 = r0.f2503x0
                kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
                androidx.collection.ScatterMap<K, V> r6 = r0.f2504y0
                java.lang.Object[] r7 = r6.keys
                long[] r6 = r6.metadata
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto Laa
                r10 = r0
                r9 = r4
            L46:
                r11 = r6[r9]
                long r13 = ~r11
                r15 = 7
                long r13 = r13 << r15
                long r13 = r13 & r11
                r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r13 = r13 & r15
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 == 0) goto La5
                int r13 = r9 - r8
                int r13 = ~r13
                int r13 = r13 >>> 31
                int r13 = 8 - r13
                r14 = r2
                r2 = r4
                r19 = r11
                r12 = r6
                r11 = r10
                r6 = r13
                r13 = r7
                r10 = r8
                r7 = r19
            L68:
                if (r2 >= r6) goto L9e
                r15 = 255(0xff, double:1.26E-321)
                long r15 = r15 & r7
                r17 = 128(0x80, double:6.3E-322)
                int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                if (r15 >= 0) goto L9b
                int r15 = r9 << 3
                int r15 = r15 + r2
                r15 = r13[r15]
                r11.f2503x0 = r14
                r11.f2496p0 = r13
                r11.f2497q0 = r12
                r11.f2498r0 = r10
                r11.f2499s0 = r9
                r11.v0 = r7
                r11.f2500t0 = r6
                r11.f2501u0 = r2
                r11.f2502w0 = r3
                java.lang.Object r15 = r14.yield(r15, r11)
                if (r15 != r1) goto L91
                return r1
            L91:
                r19 = r12
                r12 = r11
                r11 = r19
            L96:
                r19 = r12
                r12 = r11
                r11 = r19
            L9b:
                long r7 = r7 >> r5
                int r2 = r2 + r3
                goto L68
            L9e:
                if (r6 != r5) goto Laa
                r8 = r10
                r10 = r11
                r6 = r12
                r7 = r13
                r2 = r14
            La5:
                if (r9 == r8) goto Laa
                int r9 = r9 + 1
                goto L46
            Laa:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap$MapWrapper$keys$1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ScatterMap$MapWrapper$keys$1(ScatterMap<K, V> scatterMap) {
        this.f2495p0 = scatterMap;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(K k10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends K> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return this.f2495p0.containsKey((K) element);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f2495p0.containsKey((K) it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.f2495p0._size;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f2495p0.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<K> iterator() {
        return SequencesKt__SequenceBuilderKt.iterator(new a(this.f2495p0, null));
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

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }
}
