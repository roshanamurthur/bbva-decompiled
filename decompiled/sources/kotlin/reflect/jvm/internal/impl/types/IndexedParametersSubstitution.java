package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TypeSubstitution.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nTypeSubstitution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/IndexedParametersSubstitution\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,207:1\n37#2,2:208\n*S KotlinDebug\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/IndexedParametersSubstitution\n*L\n127#1:208,2\n*E\n"})
public final class IndexedParametersSubstitution extends TypeSubstitution {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TypeParameterDescriptor[] f81921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TypeProjection[] f81922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f81923c;

    public /* synthetic */ IndexedParametersSubstitution(TypeParameterDescriptor[] typeParameterDescriptorArr, TypeProjection[] typeProjectionArr, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeParameterDescriptorArr, typeProjectionArr, (i10 & 4) != 0 ? false : z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateContravariantCapturedTypes() {
        return this.f81923c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @Nullable
    /* JADX INFO: renamed from: get */
    public TypeProjection mo5782get(@NotNull KotlinType key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = key.getConstructor().mo5778getDeclarationDescriptor();
        TypeParameterDescriptor typeParameterDescriptor = classifierDescriptorMo5778getDeclarationDescriptor instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo5778getDeclarationDescriptor : null;
        if (typeParameterDescriptor == null) {
            return null;
        }
        int index = typeParameterDescriptor.getIndex();
        TypeParameterDescriptor[] typeParameterDescriptorArr = this.f81921a;
        if (index >= typeParameterDescriptorArr.length || !Intrinsics.areEqual(typeParameterDescriptorArr[index].getTypeConstructor(), typeParameterDescriptor.getTypeConstructor())) {
            return null;
        }
        return this.f81922b[index];
    }

    @NotNull
    public final TypeProjection[] getArguments() {
        return this.f81922b;
    }

    @NotNull
    public final TypeParameterDescriptor[] getParameters() {
        return this.f81921a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return this.f81922b.length == 0;
    }

    public IndexedParametersSubstitution(@NotNull TypeParameterDescriptor[] parameters, @NotNull TypeProjection[] arguments, boolean z10) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f81921a = parameters;
        this.f81922b = arguments;
        this.f81923c = z10;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndexedParametersSubstitution(@NotNull List<? extends TypeParameterDescriptor> parameters, @NotNull List<? extends TypeProjection> argumentsList) {
        this((TypeParameterDescriptor[]) parameters.toArray(new TypeParameterDescriptor[0]), (TypeProjection[]) argumentsList.toArray(new TypeProjection[0]), false, 4, null);
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(argumentsList, "argumentsList");
    }
}
