package m0;

import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DerivedState.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,400:1\n1188#2:401\n460#3,11:402\n460#3,11:413\n48#3:424\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n*L\n367#1:401\n373#1:402,11\n377#1:413,11\n397#1:424\n*E\n"})
public final /* synthetic */ class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final SnapshotThreadLocal<IntRef> f83258a = new SnapshotThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SnapshotThreadLocal<MutableVector<DerivedStateObserver>> f83259b = new SnapshotThreadLocal<>();
}
