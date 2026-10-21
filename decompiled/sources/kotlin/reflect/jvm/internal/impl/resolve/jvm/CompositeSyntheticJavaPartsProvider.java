package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import bk.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SyntheticJavaPartsProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nSyntheticJavaPartsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyntheticJavaPartsProvider.kt\norg/jetbrains/kotlin/resolve/jvm/CompositeSyntheticJavaPartsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n1360#2:103\n1446#2,5:104\n1855#2,2:109\n1360#2:111\n1446#2,5:112\n1855#2,2:117\n1855#2,2:119\n1360#2:121\n1446#2,5:122\n1855#2,2:127\n1789#2,3:129\n*S KotlinDebug\n*F\n+ 1 SyntheticJavaPartsProvider.kt\norg/jetbrains/kotlin/resolve/jvm/CompositeSyntheticJavaPartsProvider\n*L\n58#1:103\n58#1:104,5\n67#1:109,2\n72#1:111\n72#1:112,5\n76#1:117,2\n81#1:119,2\n86#1:121\n86#1:122,5\n91#1:127,2\n99#1:129,3\n*E\n"})
public final class CompositeSyntheticJavaPartsProvider implements SyntheticJavaPartsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<SyntheticJavaPartsProvider> f81563a;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeSyntheticJavaPartsProvider(@NotNull List<? extends SyntheticJavaPartsProvider> inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f81563a = inner;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateConstructors(@NotNull LazyJavaResolverContext context_receiver_0, @NotNull ClassDescriptor thisDescriptor, @NotNull List<ClassConstructorDescriptor> result) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(result, "result");
        Iterator<T> it = this.f81563a.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).generateConstructors(context_receiver_0, thisDescriptor, result);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateMethods(@NotNull LazyJavaResolverContext context_receiver_0, @NotNull ClassDescriptor thisDescriptor, @NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> result) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Iterator<T> it = this.f81563a.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).generateMethods(context_receiver_0, thisDescriptor, name, result);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateNestedClass(@NotNull LazyJavaResolverContext context_receiver_0, @NotNull ClassDescriptor thisDescriptor, @NotNull Name name, @NotNull List<ClassDescriptor> result) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Iterator<T> it = this.f81563a.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).generateNestedClass(context_receiver_0, thisDescriptor, name, result);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateStaticFunctions(@NotNull LazyJavaResolverContext context_receiver_0, @NotNull ClassDescriptor thisDescriptor, @NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> result) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Iterator<T> it = this.f81563a.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).generateStaticFunctions(context_receiver_0, thisDescriptor, name, result);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    public List<Name> getMethodNames(@NotNull LazyJavaResolverContext context_receiver_0, @NotNull ClassDescriptor thisDescriptor) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        List<SyntheticJavaPartsProvider> list = this.f81563a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            g.addAll(arrayList, ((SyntheticJavaPartsProvider) it.next()).getMethodNames(context_receiver_0, thisDescriptor));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    public List<Name> getNestedClassNames(@NotNull LazyJavaResolverContext context_receiver_0, @NotNull ClassDescriptor thisDescriptor) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        List<SyntheticJavaPartsProvider> list = this.f81563a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            g.addAll(arrayList, ((SyntheticJavaPartsProvider) it.next()).getNestedClassNames(context_receiver_0, thisDescriptor));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    public List<Name> getStaticFunctionNames(@NotNull LazyJavaResolverContext context_receiver_0, @NotNull ClassDescriptor thisDescriptor) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        List<SyntheticJavaPartsProvider> list = this.f81563a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            g.addAll(arrayList, ((SyntheticJavaPartsProvider) it.next()).getStaticFunctionNames(context_receiver_0, thisDescriptor));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    public PropertyDescriptorImpl modifyField(@NotNull LazyJavaResolverContext context_receiver_0, @NotNull ClassDescriptor thisDescriptor, @NotNull PropertyDescriptorImpl propertyDescriptor) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(propertyDescriptor, "propertyDescriptor");
        Iterator<T> it = this.f81563a.iterator();
        while (it.hasNext()) {
            propertyDescriptor = ((SyntheticJavaPartsProvider) it.next()).modifyField(context_receiver_0, thisDescriptor, propertyDescriptor);
        }
        return propertyDescriptor;
    }
}
