package tk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements DFS.Neighbors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JvmBuiltInsCustomizer f93619a;

    public b(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f93619a = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        KProperty<Object>[] kPropertyArr = JvmBuiltInsCustomizer.f80172i;
        JvmBuiltInsCustomizer this$0 = this.f93619a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Collection<KotlinType> supertypes = ((ClassDescriptor) obj).getTypeConstructor().getSupertypes();
        Intrinsics.checkNotNullExpressionValue(supertypes, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = ((KotlinType) it.next()).getConstructor().mo5778getDeclarationDescriptor();
            ClassDescriptor classDescriptorA = null;
            ClassifierDescriptor original = classifierDescriptorMo5778getDeclarationDescriptor != null ? classifierDescriptorMo5778getDeclarationDescriptor.getOriginal() : null;
            ClassDescriptor classDescriptor = original instanceof ClassDescriptor ? (ClassDescriptor) original : null;
            if (classDescriptor != null && (classDescriptorA = this$0.a(classDescriptor)) == null) {
                classDescriptorA = classDescriptor;
            }
            if (classDescriptorA != null) {
                arrayList.add(classDescriptorA);
            }
        }
        return arrayList;
    }
}
