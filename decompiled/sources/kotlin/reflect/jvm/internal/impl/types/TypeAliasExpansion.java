package kotlin.reflect.jvm.internal.impl.types;

import bk.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TypeAliasExpansion.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class TypeAliasExpansion {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final TypeAliasExpansion f81960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TypeAliasDescriptor f81961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<TypeProjection> f81962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<TypeParameterDescriptor, TypeProjection> f81963d;

    /* JADX INFO: compiled from: TypeAliasExpansion.kt */
    @SourceDebugExtension({"SMAP\nTypeAliasExpansion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasExpansion.kt\norg/jetbrains/kotlin/types/TypeAliasExpansion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1549#2:44\n1620#2,3:45\n*S KotlinDebug\n*F\n+ 1 TypeAliasExpansion.kt\norg/jetbrains/kotlin/types/TypeAliasExpansion$Companion\n*L\n34#1:44\n34#1:45,3\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TypeAliasExpansion create(@Nullable TypeAliasExpansion typeAliasExpansion, @NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull List<? extends TypeProjection> arguments) {
            Intrinsics.checkNotNullParameter(typeAliasDescriptor, "typeAliasDescriptor");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            List<TypeParameterDescriptor> parameters = typeAliasDescriptor.getTypeConstructor().getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            List<TypeParameterDescriptor> list = parameters;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).getOriginal());
            }
            return new TypeAliasExpansion(typeAliasExpansion, typeAliasDescriptor, arguments, q.toMap(CollectionsKt___CollectionsKt.zip(arrayList, arguments)), null);
        }
    }

    public TypeAliasExpansion() {
        throw null;
    }

    public TypeAliasExpansion(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this.f81960a = typeAliasExpansion;
        this.f81961b = typeAliasDescriptor;
        this.f81962c = list;
        this.f81963d = map;
    }

    @NotNull
    public final List<TypeProjection> getArguments() {
        return this.f81962c;
    }

    @NotNull
    public final TypeAliasDescriptor getDescriptor() {
        return this.f81961b;
    }

    @Nullable
    public final TypeProjection getReplacement(@NotNull TypeConstructor constructor) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = constructor.mo5778getDeclarationDescriptor();
        if (classifierDescriptorMo5778getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return this.f81963d.get(classifierDescriptorMo5778getDeclarationDescriptor);
        }
        return null;
    }

    public final boolean isRecursion(@NotNull TypeAliasDescriptor descriptor) {
        TypeAliasExpansion typeAliasExpansion;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Intrinsics.areEqual(this.f81961b, descriptor) || ((typeAliasExpansion = this.f81960a) != null && typeAliasExpansion.isRecursion(descriptor));
    }
}
