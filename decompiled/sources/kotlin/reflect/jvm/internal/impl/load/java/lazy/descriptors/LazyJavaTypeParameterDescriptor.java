package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import bk.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyJavaTypeParameterDescriptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nLazyJavaTypeParameterDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaTypeParameterDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaTypeParameterDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1549#2:76\n1620#2,3:77\n*S KotlinDebug\n*F\n+ 1 LazyJavaTypeParameterDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaTypeParameterDescriptor\n*L\n62#1:76\n62#1:77,3\n*E\n"})
public final class LazyJavaTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {

    @NotNull
    public final LazyJavaResolverContext E0;

    @NotNull
    public final JavaTypeParameter F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaTypeParameterDescriptor(@NotNull LazyJavaResolverContext c10, @NotNull JavaTypeParameter javaTypeParameter, int i10, @NotNull DeclarationDescriptor containingDeclaration) {
        super(c10.getStorageManager(), containingDeclaration, new LazyJavaAnnotations(c10, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), Variance.INVARIANT, false, i10, SourceElement.NO_SOURCE, c10.getComponents().getSupertypeLoopChecker());
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        this.E0 = c10;
        this.F0 = javaTypeParameter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    public List<KotlinType> processBoundsWithoutCycles(@NotNull List<? extends KotlinType> bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        LazyJavaResolverContext lazyJavaResolverContext = this.E0;
        return lazyJavaResolverContext.getComponents().getSignatureEnhancement().enhanceTypeParameterBounds(this, bounds, lazyJavaResolverContext);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* JADX INFO: renamed from: reportSupertypeLoopError */
    public void mo5780reportSupertypeLoopError(@NotNull KotlinType type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    public List<KotlinType> resolveUpperBounds() {
        Collection<JavaClassifierType> upperBounds = this.F0.getUpperBounds();
        boolean zIsEmpty = upperBounds.isEmpty();
        LazyJavaResolverContext lazyJavaResolverContext = this.E0;
        if (zIsEmpty) {
            SimpleType anyType = lazyJavaResolverContext.getModule().getBuiltIns().getAnyType();
            Intrinsics.checkNotNullExpressionValue(anyType, "getAnyType(...)");
            SimpleType nullableAnyType = lazyJavaResolverContext.getModule().getBuiltIns().getNullableAnyType();
            Intrinsics.checkNotNullExpressionValue(nullableAnyType, "getNullableAnyType(...)");
            return d.listOf(KotlinTypeFactory.flexibleType(anyType, nullableAnyType));
        }
        Collection<JavaClassifierType> collection = upperBounds;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(lazyJavaResolverContext.getTypeResolver().transformJavaType((JavaClassifierType) it.next(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, this, 3, null)));
        }
        return arrayList;
    }
}
