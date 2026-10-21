package tk;

import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements DFS.Neighbors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f93618a = new a();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        KProperty<Object>[] kPropertyArr = JvmBuiltInsCustomizer.f80172i;
        return ((CallableMemberDescriptor) obj).getOriginal().getOverriddenDescriptors();
    }
}
