package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
public final class j implements SubcomposeSlotReusePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyLayoutItemContentFactory f5097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f5098b;

    public j(@NotNull LazyLayoutItemContentFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f5097a = factory;
        this.f5098b = new LinkedHashMap();
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final boolean areCompatible(@Nullable Object obj, @Nullable Object obj2) {
        LazyLayoutItemContentFactory lazyLayoutItemContentFactory = this.f5097a;
        return Intrinsics.areEqual(lazyLayoutItemContentFactory.getContentType(obj), lazyLayoutItemContentFactory.getContentType(obj2));
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final void getSlotsToRetain(@NotNull SubcomposeSlotReusePolicy.SlotIdsSet slotIds) {
        Intrinsics.checkNotNullParameter(slotIds, "slotIds");
        LinkedHashMap linkedHashMap = this.f5098b;
        linkedHashMap.clear();
        Iterator<Object> it = slotIds.iterator();
        while (it.hasNext()) {
            Object contentType = this.f5097a.getContentType(it.next());
            Integer num = (Integer) linkedHashMap.get(contentType);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue == 7) {
                it.remove();
            } else {
                linkedHashMap.put(contentType, Integer.valueOf(iIntValue + 1));
            }
        }
    }
}
