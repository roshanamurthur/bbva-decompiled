package m0;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnapshotFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {148, 152, 174}, m = "invokeSuspend", n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", DeepLinkListenerAdapter.Constants.STATUS_FOUND, "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
@SourceDebugExtension({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,185:1\n138#2,5:186\n138#2,5:191\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n*L\n143#1:186,5\n166#1:191,5\n*E\n"})
public final class p0 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public MutableScatterSet f83296p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Function1 f83297q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Channel f83298r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ObserverHandle f83299s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Object f83300t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f83301u0;
    public /* synthetic */ Object v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ Function0<Object> f83302w0;

    /* JADX INFO: compiled from: SnapshotFlow.kt */
    @SourceDebugExtension({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1\n+ 2 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n*L\n1#1,185:1\n53#2:186\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1\n*L\n120#1:186\n*E\n"})
    public static final class a extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableScatterSet<Object> f83303p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableScatterSet<Object> mutableScatterSet) {
            super(1);
            this.f83303p0 = mutableScatterSet;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            if (obj instanceof StateObjectImpl) {
                ((StateObjectImpl) obj).m2183recordReadInh_f27i8$runtime_release(ReaderKind.m2170constructorimpl(4));
            }
            this.f83303p0.add(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SnapshotFlow.kt */
    @SourceDebugExtension({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1\n+ 2 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n58#2,2:186\n61#2:221\n62#2:225\n296#3,2:188\n267#3,4:190\n237#3,7:194\n248#3,3:202\n251#3,2:206\n272#3:208\n298#3:209\n299#3:211\n273#3:212\n254#3,6:213\n274#3:219\n300#3:220\n1810#4:201\n1672#4:205\n53#5:210\n1747#6,3:222\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1\n*L\n131#1:186,2\n131#1:221\n131#1:225\n131#1:188,2\n131#1:190,4\n131#1:194,7\n131#1:202,3\n131#1:206,2\n131#1:208\n131#1:209\n131#1:211\n131#1:212\n131#1:213,6\n131#1:219\n131#1:220\n131#1:201\n131#1:205\n132#1:210\n131#1:222,3\n*E\n"})
    public static final class b extends Lambda implements Function2<Set<? extends Object>, Snapshot, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Channel<Set<Object>> f83304p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Channel<Set<Object>> channel) {
            super(2);
            this.f83304p0 = channel;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0062 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:21:0x0064 A[LOOP:0: B:7:0x001f->B:21:0x0064, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:42:0x0067 A[SYNTHETIC] */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Set<? extends Object> set, Snapshot snapshot) {
            Set<? extends Object> set2 = set;
            if (set2 instanceof ScatterSetWrapper) {
                ScatterSet set$runtime_release = ((ScatterSetWrapper) set2).getSet$runtime_release();
                Object[] objArr = set$runtime_release.elements;
                long[] jArr = set$runtime_release.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            int i12 = 0;
                            while (true) {
                                if (i12 < i11) {
                                    if ((255 & j10) < 128) {
                                        Object obj = objArr[(i10 << 3) + i12];
                                        if (!(obj instanceof StateObjectImpl) || ((StateObjectImpl) obj).m2182isReadInh_f27i8$runtime_release(ReaderKind.m2170constructorimpl(4))) {
                                            this.f83304p0.mo5953trySendJP2dKIU(set2);
                                        }
                                    }
                                    j10 >>= 8;
                                    i12++;
                                } else if (i11 == 8) {
                                    if (i10 != length) {
                                        i10++;
                                    }
                                }
                            }
                        } else if (i10 != length) {
                            i10++;
                        }
                    }
                }
            } else {
                Set<? extends Object> set3 = set2;
                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                    Iterator<T> it = set3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (!(next instanceof StateObjectImpl) || ((StateObjectImpl) next).m2182isReadInh_f27i8$runtime_release(ReaderKind.m2170constructorimpl(4))) {
                                this.f83304p0.mo5953trySendJP2dKIU(set2);
                            }
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Function0<Object> function0, Continuation<? super p0> continuation) {
        super(2, continuation);
        this.f83302w0 = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        p0 p0Var = new p0(this.f83302w0, continuation);
        p0Var.v0 = obj;
        return p0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<Object> flowCollector, Continuation<? super Unit> continuation) {
        return ((p0) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7 A[Catch: all -> 0x017b, TryCatch #4 {all -> 0x017b, blocks: (B:40:0x00d2, B:42:0x00e7, B:44:0x00f3, B:46:0x00fd, B:61:0x012c, B:64:0x013b, B:68:0x0151, B:70:0x015a, B:49:0x010a, B:54:0x011a), top: B:107:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0116  */
    /* JADX WARN: Code duplicated, block: B:54:0x011a A[Catch: all -> 0x017b, LOOP:1: B:107:0x00d2->B:54:0x011a, LOOP_END, TryCatch #4 {all -> 0x017b, blocks: (B:40:0x00d2, B:42:0x00e7, B:44:0x00f3, B:46:0x00fd, B:61:0x012c, B:64:0x013b, B:68:0x0151, B:70:0x015a, B:49:0x010a, B:54:0x011a), top: B:107:0x00d2 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0172 -> B:76:0x0173). Please report as a decompilation issue!!! */
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
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.p0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
