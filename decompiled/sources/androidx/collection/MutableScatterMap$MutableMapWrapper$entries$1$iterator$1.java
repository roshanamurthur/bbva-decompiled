package androidx.collection;

import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R4\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1", "", "", "", "hasNext", "next", "", RemoveCommand.ID, "", "p0", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "setIterator", "(Ljava/util/Iterator;)V", "iterator", "", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCurrent", "()I", "setCurrent", "(I)V", "current", "collection"}, k = 1, mv = {1, 8, 0})
public final class MutableScatterMap$MutableMapWrapper$entries$1$iterator$1<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Iterator<? extends Map.Entry<K, V>> iterator;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public int current = -1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ MutableScatterMap<K, V> f2430r0;

    /* JADX INFO: compiled from: ScatterMap.kt */
    @DebugMetadata(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1312}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
    @SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n1810#3:1841\n1672#3:1845\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1\n*L\n1310#1:1835,6\n1310#1:1842,3\n1310#1:1846,9\n1310#1:1841\n1310#1:1845\n*E\n"})
    public static final class a extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Map.Entry<K, V>>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MutableScatterMap<K, V> E0;
        public final /* synthetic */ MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 f2431p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public MutableScatterMap f2432q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long[] f2433r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f2434s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f2435t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f2436u0;
        public int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public long f2437w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public int f2438x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public /* synthetic */ Object f2439y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableScatterMap mutableScatterMap, MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 mutableScatterMap$MutableMapWrapper$entries$1$iterator$1, Continuation continuation) {
            super(2, continuation);
            this.E0 = mutableScatterMap;
            this.F0 = mutableScatterMap$MutableMapWrapper$entries$1$iterator$1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.E0, this.F0, continuation);
            aVar.f2439y0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((a) create((SequenceScope) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x005c  */
        /* JADX WARN: Code duplicated, block: B:27:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:29:0x00d0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005c -> B:14:0x0070). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ac -> B:21:0x00b0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b7 -> B:23:0x00b9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00cc -> B:28:0x00ce). Please report as a decompilation issue!!! */
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
                Method dump skipped, instruction units count: 219
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public MutableScatterMap$MutableMapWrapper$entries$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.f2430r0 = mutableScatterMap;
        this.iterator = SequencesKt__SequenceBuilderKt.iterator(new a(mutableScatterMap, this, null));
    }

    public final int getCurrent() {
        return this.current;
    }

    @NotNull
    public final Iterator<Map.Entry<K, V>> getIterator() {
        return this.iterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i10 = this.current;
        if (i10 != -1) {
            this.f2430r0.removeValueAt(i10);
            this.current = -1;
        }
    }

    public final void setCurrent(int i10) {
        this.current = i10;
    }

    public final void setIterator(@NotNull Iterator<? extends Map.Entry<K, V>> it) {
        Intrinsics.checkNotNullParameter(it, "<set-?>");
        this.iterator = it;
    }

    @Override // java.util.Iterator
    @NotNull
    public Map.Entry<K, V> next() {
        return this.iterator.next();
    }
}
