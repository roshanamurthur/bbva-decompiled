package androidx.collection;

import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"androidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1", "", "", "hasNext", "next", "()Ljava/lang/Object;", "", RemoveCommand.ID, "", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCurrent", "()I", "setCurrent", "(I)V", "current", "", "q0", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "collection"}, k = 1, mv = {1, 8, 0})
public final class MutableScatterSet$MutableSetWrapper$iterator$1<E> implements Iterator<E>, KMutableIterator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public int current = -1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Iterator<E> iterator;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ MutableScatterSet<E> f2468r0;

    /* JADX INFO: compiled from: ScatterSet.kt */
    @DebugMetadata(c = "androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1044}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
    @SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1084:1\n237#2,7:1085\n248#2,3:1093\n251#2,9:1097\n1810#3:1092\n1672#3:1096\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1\n*L\n1041#1:1085,7\n1041#1:1093,3\n1041#1:1097,9\n1041#1:1092\n1041#1:1096\n*E\n"})
    public static final class a extends RestrictedSuspendLambda implements Function2<SequenceScope<? super E>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MutableScatterSet<E> E0;
        public final /* synthetic */ MutableScatterSet$MutableSetWrapper$iterator$1 F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public MutableScatterSet$MutableSetWrapper$iterator$1 f2469p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public MutableScatterSet f2470q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long[] f2471r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f2472s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f2473t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f2474u0;
        public int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public long f2475w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public int f2476x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public /* synthetic */ Object f2477y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableScatterSet mutableScatterSet, MutableScatterSet$MutableSetWrapper$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1, Continuation continuation) {
            super(2, continuation);
            this.E0 = mutableScatterSet;
            this.F0 = mutableScatterSet$MutableSetWrapper$iterator$1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.E0, this.F0, continuation);
            aVar.f2477y0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((a) create((SequenceScope) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0058  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:29:0x00bc  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0058 -> B:14:0x006c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009e -> B:21:0x00a2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00a9 -> B:23:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b9 -> B:28:0x00ba). Please report as a decompilation issue!!! */
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
                int r2 = r0.f2476x0
                r3 = 1
                r5 = 8
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                int r2 = r0.v0
                int r6 = r0.f2474u0
                long r7 = r0.f2475w0
                int r9 = r0.f2473t0
                int r10 = r0.f2472s0
                long[] r11 = r0.f2471r0
                androidx.collection.MutableScatterSet r12 = r0.f2470q0
                androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1 r13 = r0.f2469p0
                java.lang.Object r14 = r0.f2477y0
                kotlin.sequences.SequenceScope r14 = (kotlin.sequences.SequenceScope) r14
                kotlin.ResultKt.throwOnFailure(r23)
                r4 = r0
                goto La2
            L29:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L31:
                kotlin.ResultKt.throwOnFailure(r23)
                java.lang.Object r2 = r0.f2477y0
                kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
                androidx.collection.MutableScatterSet<E> r6 = r0.E0
                long[] r7 = r6.metadata
                int r8 = r7.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto Lc0
                androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1 r9 = r0.F0
                r11 = r0
                r10 = 0
            L45:
                r12 = r7[r10]
                long r14 = ~r12
                r16 = 7
                long r14 = r14 << r16
                long r14 = r14 & r12
                r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r14 = r14 & r16
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 == 0) goto Lb9
                int r14 = r10 - r8
                int r14 = ~r14
                int r14 = r14 >>> 31
                int r14 = 8 - r14
                r15 = r2
                r2 = 0
                r20 = r12
                r13 = r6
                r12 = r11
                r6 = r14
                r11 = r7
                r14 = r9
                r9 = r10
                r10 = r8
                r7 = r20
            L6c:
                if (r2 >= r6) goto Lae
                r16 = 255(0xff, double:1.26E-321)
                long r16 = r7 & r16
                r18 = 128(0x80, double:6.3E-322)
                int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
                if (r16 >= 0) goto La9
                int r16 = r9 << 3
                int r4 = r16 + r2
                r14.setCurrent(r4)
                java.lang.Object[] r5 = r13.elements
                r4 = r5[r4]
                r12.f2477y0 = r15
                r12.f2469p0 = r14
                r12.f2470q0 = r13
                r12.f2471r0 = r11
                r12.f2472s0 = r10
                r12.f2473t0 = r9
                r12.f2475w0 = r7
                r12.f2474u0 = r6
                r12.v0 = r2
                r12.f2476x0 = r3
                java.lang.Object r4 = r15.yield(r4, r12)
                if (r4 != r1) goto L9e
                return r1
            L9e:
                r4 = r12
                r12 = r13
                r13 = r14
                r14 = r15
            La2:
                r15 = r14
                r14 = r13
                r13 = r12
                r12 = r4
                r4 = 8
                goto Laa
            La9:
                r4 = r5
            Laa:
                long r7 = r7 >> r4
                int r2 = r2 + r3
                r5 = r4
                goto L6c
            Lae:
                r4 = r5
                if (r6 != r4) goto Lc0
                r8 = r10
                r7 = r11
                r11 = r12
                r6 = r13
                r2 = r15
                r10 = r9
                r9 = r14
                goto Lba
            Lb9:
                r4 = r5
            Lba:
                if (r10 == r8) goto Lc0
                int r10 = r10 + 1
                r5 = r4
                goto L45
            Lc0:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public MutableScatterSet$MutableSetWrapper$iterator$1(MutableScatterSet<E> mutableScatterSet) {
        this.f2468r0 = mutableScatterSet;
        this.iterator = SequencesKt__SequenceBuilderKt.iterator(new a(mutableScatterSet, this, null));
    }

    public final int getCurrent() {
        return this.current;
    }

    @NotNull
    public final Iterator<E> getIterator() {
        return this.iterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        return this.iterator.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i10 = this.current;
        if (i10 != -1) {
            this.f2468r0.removeElementAt(i10);
            this.current = -1;
        }
    }

    public final void setCurrent(int i10) {
        this.current = i10;
    }
}
