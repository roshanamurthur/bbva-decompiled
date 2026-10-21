package fl;

import java.util.Collection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements DFS.Neighbors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68455a;

    public b(boolean z10) {
        this.f68455a = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        CallableMemberDescriptor original = (CallableMemberDescriptor) obj;
        int i10 = DescriptorUtilsKt.f81558a;
        if (this.f68455a) {
            original = original != null ? original.getOriginal() : null;
        }
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = original != null ? original.getOverriddenDescriptors() : null;
        return overriddenDescriptors == null ? CollectionsKt__CollectionsKt.emptyList() : overriddenDescriptors;
    }
}
