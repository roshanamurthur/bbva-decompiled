package androidx.collection;

import com.bbva.plugin.localstorage.command.RemoveCommand;
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

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1", "", "", "hasNext", "next", "()Ljava/lang/Object;", "", RemoveCommand.ID, "collection"}, k = 1, mv = {1, 8, 0})
public final class MutableScatterMap$MutableMapWrapper$values$1$iterator$1<V> implements Iterator<V>, KMutableIterator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Iterator<Integer> f2453p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f2454q0 = -1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ MutableScatterMap<K, V> f2455r0;

    /* JADX INFO: compiled from: ScatterMap.kt */
    @DebugMetadata(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1495}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"})
    @SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n1810#3:1841\n1672#3:1845\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1\n*L\n1494#1:1835,6\n1494#1:1842,3\n1494#1:1846,9\n1494#1:1841\n1494#1:1845\n*E\n"})
    public static final class a extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public long[] f2456p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f2457q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f2458r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f2459s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f2460t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public long f2461u0;
        public int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public /* synthetic */ Object f2462w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ MutableScatterMap<K, V> f2463x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableScatterMap<K, V> mutableScatterMap, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f2463x0 = mutableScatterMap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f2463x0, continuation);
            aVar.f2462w0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super Integer> sequenceScope, Continuation<? super Unit> continuation) {
            return ((a) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0052  */
        /* JADX WARN: Code duplicated, block: B:23:0x009d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:24:0x009f  */
        /* JADX WARN: Code duplicated, block: B:26:0x00a6  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:25:0x00a4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0067). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0070 -> B:22:0x009a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0090 -> B:21:0x0095). Please report as a decompilation issue!!! */
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
                int r2 = r0.v0
                r3 = 1
                r4 = 0
                r5 = 8
                if (r2 == 0) goto L30
                if (r2 != r3) goto L28
                int r2 = r0.f2460t0
                int r6 = r0.f2459s0
                long r7 = r0.f2461u0
                int r9 = r0.f2458r0
                int r10 = r0.f2457q0
                long[] r11 = r0.f2456p0
                java.lang.Object r12 = r0.f2462w0
                kotlin.sequences.SequenceScope r12 = (kotlin.sequences.SequenceScope) r12
                kotlin.ResultKt.throwOnFailure(r22)
                r13 = r12
                r12 = r11
                r11 = r0
                goto L95
            L28:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L30:
                kotlin.ResultKt.throwOnFailure(r22)
                java.lang.Object r2 = r0.f2462w0
                kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
                androidx.collection.MutableScatterMap<K, V> r6 = r0.f2463x0
                long[] r6 = r6.metadata
                int r7 = r6.length
                int r7 = r7 + (-2)
                if (r7 < 0) goto La9
                r9 = r0
                r8 = r4
            L42:
                r10 = r6[r8]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto La4
                int r12 = r8 - r7
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r2
                r2 = r4
                r18 = r12
                r12 = r6
                r6 = r18
                r19 = r10
                r11 = r7
                r10 = r9
                r9 = r8
                r7 = r19
            L67:
                if (r2 >= r6) goto L9d
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.3E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto L9a
                int r14 = r9 << 3
                int r14 = r14 + r2
                java.lang.Integer r14 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r14)
                r10.f2462w0 = r13
                r10.f2456p0 = r12
                r10.f2457q0 = r11
                r10.f2458r0 = r9
                r10.f2461u0 = r7
                r10.f2459s0 = r6
                r10.f2460t0 = r2
                r10.v0 = r3
                java.lang.Object r14 = r13.yield(r14, r10)
                if (r14 != r1) goto L90
                return r1
            L90:
                r18 = r11
                r11 = r10
                r10 = r18
            L95:
                r18 = r11
                r11 = r10
                r10 = r18
            L9a:
                long r7 = r7 >> r5
                int r2 = r2 + r3
                goto L67
            L9d:
                if (r6 != r5) goto La9
                r8 = r9
                r9 = r10
                r7 = r11
                r6 = r12
                r2 = r13
            La4:
                if (r8 == r7) goto La9
                int r8 = r8 + 1
                goto L42
            La9:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public MutableScatterMap$MutableMapWrapper$values$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.f2455r0 = mutableScatterMap;
        this.f2453p0 = SequencesKt__SequenceBuilderKt.iterator(new a(mutableScatterMap, null));
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2453p0.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        int iIntValue = this.f2453p0.next().intValue();
        this.f2454q0 = iIntValue;
        return (V) this.f2455r0.values[iIntValue];
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.Iterator
    public void remove() {
        int i10 = this.f2454q0;
        if (i10 >= 0) {
            this.f2455r0.removeValueAt(i10);
            this.f2454q0 = -1;
        }
    }
}
