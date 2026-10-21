package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.layout.PinnableContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayoutPinnableItem.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n75#2:163\n108#2,2:164\n75#2:166\n108#2,2:167\n81#3:169\n107#3,2:170\n81#3:172\n107#3,2:173\n495#4,4:175\n500#4:184\n129#5,5:179\n1#6:185\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem\n*L\n105#1:163\n105#1:164,2\n111#1:166\n111#1:167,2\n116#1:169\n116#1:170,2\n122#1:172\n122#1:173,2\n125#1:175,4\n125#1:184\n125#1:179,5\n*E\n"})
public final class n implements PinnableContainer, PinnableContainer.PinnedHandle, LazyLayoutPinnedItemList.PinnedItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Object f5102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LazyLayoutPinnedItemList f5103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableIntState f5104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableIntState f5105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableState f5106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableState f5107f;

    public n(@Nullable Object obj, @NotNull LazyLayoutPinnedItemList pinnedItemList) {
        Intrinsics.checkNotNullParameter(pinnedItemList, "pinnedItemList");
        this.f5102a = obj;
        this.f5103b = pinnedItemList;
        this.f5104c = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.f5105d = SnapshotIntStateKt.mutableIntStateOf(0);
        this.f5106e = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f5107f = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    public final int getIndex() {
        return this.f5104c.getIntValue();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    @Nullable
    public final Object getKey() {
        return this.f5102a;
    }

    @Override // androidx.compose.ui.layout.PinnableContainer
    @NotNull
    public final PinnableContainer.PinnedHandle pin() {
        MutableIntState mutableIntState = this.f5105d;
        if (mutableIntState.getIntValue() == 0) {
            this.f5103b.pin$foundation_release(this);
            PinnableContainer pinnableContainer = (PinnableContainer) this.f5107f.getValue();
            this.f5106e.setValue(pinnableContainer != null ? pinnableContainer.pin() : null);
        }
        mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
        return this;
    }

    @Override // androidx.compose.ui.layout.PinnableContainer.PinnedHandle
    public final void release() {
        MutableIntState mutableIntState = this.f5105d;
        if (mutableIntState.getIntValue() <= 0) {
            throw new IllegalStateException("Release should only be called once".toString());
        }
        mutableIntState.setIntValue(mutableIntState.getIntValue() - 1);
        if (mutableIntState.getIntValue() == 0) {
            this.f5103b.release$foundation_release(this);
            MutableState mutableState = this.f5106e;
            PinnableContainer.PinnedHandle pinnedHandle = (PinnableContainer.PinnedHandle) mutableState.getValue();
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            mutableState.setValue(null);
        }
    }
}
