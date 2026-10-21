package androidx.compose.runtime.collection;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.SetCommand;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScatterSetWrapper.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096\u0002J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/collection/ScatterSetWrapper;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "isEmpty", "", "iterator", "", "elements", "containsAll", "element", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "(Ljava/lang/Object;)Z", "Landroidx/collection/ScatterSet;", "p0", "Landroidx/collection/ScatterSet;", "getSet$runtime_release", "()Landroidx/collection/ScatterSet;", SetCommand.ID, "", "getSize", "()I", "size", "<init>", "(Landroidx/collection/ScatterSet;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScatterSetWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1726#2,3:64\n*S KotlinDebug\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper\n*L\n39#1:64,3\n*E\n"})
public final class ScatterSetWrapper<T> implements Set<T>, KMappedMarker {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ScatterSet<T> set;

    /* JADX INFO: compiled from: ScatterSetWrapper.kt */
    @DebugMetadata(c = "androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1", f = "ScatterSetWrapper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {34}, m = "invokeSuspend", n = {"$this$iterator", "k$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
    @SourceDebugExtension({"SMAP\nScatterSetWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,63:1\n267#2,4:64\n237#2,7:68\n248#2,3:76\n251#2,2:80\n272#2,2:82\n254#2,6:84\n274#2:90\n1810#3:75\n1672#3:79\n*S KotlinDebug\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper$iterator$1\n*L\n33#1:64,4\n33#1:68,7\n33#1:76,3\n33#1:80,2\n33#1:82,2\n33#1:84,6\n33#1:90\n33#1:75\n33#1:79\n*E\n"})
    public static final class a extends RestrictedSuspendLambda implements Function2<SequenceScope<? super T>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object[] f14875p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long[] f14876q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f14877r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f14878s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f14879t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f14880u0;
        public long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f14881w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public /* synthetic */ Object f14882x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ ScatterSetWrapper<T> f14883y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ScatterSetWrapper<T> scatterSetWrapper, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f14883y0 = scatterSetWrapper;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f14883y0, continuation);
            aVar.f14882x0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((a) create((SequenceScope) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x005a  */
        /* JADX WARN: Code duplicated, block: B:23:0x00a2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:24:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:26:0x00ab  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v0 */
        /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.sequences.SequenceScope] */
        /* JADX WARN: Type inference failed for: r14v2 */
        /* JADX WARN: Type inference failed for: r14v3 */
        /* JADX WARN: Type inference failed for: r14v4 */
        /* JADX WARN: Type inference failed for: r14v5 */
        /* JADX WARN: Type inference failed for: r14v6 */
        /* JADX WARN: Type inference failed for: r14v7 */
        /* JADX WARN: Type inference failed for: r14v8 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0058 -> B:25:0x00a9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:14:0x006c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0075 -> B:22:0x009f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0095 -> B:21:0x009a). Please report as a decompilation issue!!! */
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
                int r2 = r0.f14881w0
                r3 = 1
                r4 = 0
                r5 = 8
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                int r2 = r0.f14880u0
                int r6 = r0.f14879t0
                long r7 = r0.v0
                int r9 = r0.f14878s0
                int r10 = r0.f14877r0
                long[] r11 = r0.f14876q0
                java.lang.Object[] r12 = r0.f14875p0
                java.lang.Object r13 = r0.f14882x0
                kotlin.sequences.SequenceScope r13 = (kotlin.sequences.SequenceScope) r13
                kotlin.ResultKt.throwOnFailure(r22)
                r14 = r13
                r13 = r12
                r12 = r0
                goto L9a
            L2a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L32:
                kotlin.ResultKt.throwOnFailure(r22)
                java.lang.Object r2 = r0.f14882x0
                kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
                androidx.compose.runtime.collection.ScatterSetWrapper<T> r6 = r0.f14883y0
                androidx.collection.ScatterSet r6 = r6.getSet$runtime_release()
                java.lang.Object[] r7 = r6.elements
                long[] r6 = r6.metadata
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto Lae
                r10 = r0
                r9 = r4
            L4a:
                r11 = r6[r9]
                long r13 = ~r11
                r15 = 7
                long r13 = r13 << r15
                long r13 = r13 & r11
                r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r13 = r13 & r15
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 == 0) goto La9
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
            L6c:
                if (r2 >= r6) goto La2
                r15 = 255(0xff, double:1.26E-321)
                long r15 = r15 & r7
                r17 = 128(0x80, double:6.3E-322)
                int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                if (r15 >= 0) goto L9f
                int r15 = r9 << 3
                int r15 = r15 + r2
                r15 = r13[r15]
                r11.f14882x0 = r14
                r11.f14875p0 = r13
                r11.f14876q0 = r12
                r11.f14877r0 = r10
                r11.f14878s0 = r9
                r11.v0 = r7
                r11.f14879t0 = r6
                r11.f14880u0 = r2
                r11.f14881w0 = r3
                java.lang.Object r15 = r14.yield(r15, r11)
                if (r15 != r1) goto L95
                return r1
            L95:
                r19 = r12
                r12 = r11
                r11 = r19
            L9a:
                r19 = r12
                r12 = r11
                r11 = r19
            L9f:
                long r7 = r7 >> r5
                int r2 = r2 + r3
                goto L6c
            La2:
                if (r6 != r5) goto Lae
                r8 = r10
                r10 = r11
                r6 = r12
                r7 = r13
                r2 = r14
            La9:
                if (r9 == r8) goto Lae
                int r9 = r9 + 1
                goto L4a
            Lae:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScatterSetWrapper.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ScatterSetWrapper(@NotNull ScatterSet<T> scatterSet) {
        this.set = scatterSet;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return this.set.contains(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Collection<? extends Object> collection = elements;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final ScatterSet<T> getSet$runtime_release() {
        return this.set;
    }

    public int getSize() {
        return this.set.get_size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.set.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return SequencesKt__SequenceBuilderKt.iterator(new a(this, null));
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
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }
}
