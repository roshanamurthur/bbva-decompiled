package kotlin.reflect.jvm.internal.impl.types;

import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class DescriptorSubstitutor {
    public static /* synthetic */ void a(int i10) {
        String str = i10 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 4 ? 3 : 2];
        switch (i10) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i10 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    @NotNull
    public static TypeSubstitutor substituteTypeParameters(@NotNull List<TypeParameterDescriptor> list, @NotNull TypeSubstitution typeSubstitution, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull List<TypeParameterDescriptor> list2) {
        if (list == null) {
            a(0);
            throw null;
        }
        if (typeSubstitution == null) {
            a(1);
            throw null;
        }
        if (declarationDescriptor == null) {
            a(2);
            throw null;
        }
        if (list2 == null) {
            a(3);
            throw null;
        }
        TypeSubstitutor typeSubstitutorSubstituteTypeParameters = substituteTypeParameters(list, typeSubstitution, declarationDescriptor, list2, null);
        if (typeSubstitutorSubstituteTypeParameters != null) {
            return typeSubstitutorSubstituteTypeParameters;
        }
        throw new AssertionError("Substitution failed");
    }

    @Nullable
    public static TypeSubstitutor substituteTypeParameters(@NotNull List<TypeParameterDescriptor> list, @NotNull TypeSubstitution typeSubstitution, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull List<TypeParameterDescriptor> list2, @Nullable boolean[] zArr) {
        if (list == null) {
            a(5);
            throw null;
        }
        if (typeSubstitution == null) {
            a(6);
            throw null;
        }
        if (declarationDescriptor == null) {
            a(7);
            throw null;
        }
        if (list2 != null) {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            int i10 = 0;
            for (TypeParameterDescriptor typeParameterDescriptor : list) {
                TypeParameterDescriptorImpl typeParameterDescriptorImplCreateForFurtherModification = TypeParameterDescriptorImpl.createForFurtherModification(declarationDescriptor, typeParameterDescriptor.getAnnotations(), typeParameterDescriptor.isReified(), typeParameterDescriptor.getVariance(), typeParameterDescriptor.getName(), i10, SourceElement.NO_SOURCE, typeParameterDescriptor.getStorageManager());
                map.put(typeParameterDescriptor.getTypeConstructor(), new TypeProjectionImpl(typeParameterDescriptorImplCreateForFurtherModification.getDefaultType()));
                map2.put(typeParameterDescriptor, typeParameterDescriptorImplCreateForFurtherModification);
                list2.add(typeParameterDescriptorImplCreateForFurtherModification);
                i10++;
            }
            TypeConstructorSubstitution typeConstructorSubstitutionCreateByConstructorsMap = TypeConstructorSubstitution.createByConstructorsMap(map);
            TypeSubstitutor typeSubstitutorCreateChainedSubstitutor = TypeSubstitutor.createChainedSubstitutor(typeSubstitution, typeConstructorSubstitutionCreateByConstructorsMap);
            TypeSubstitutor typeSubstitutorCreateChainedSubstitutor2 = TypeSubstitutor.createChainedSubstitutor(typeSubstitution.replaceWithNonApproximating(), typeConstructorSubstitutionCreateByConstructorsMap);
            for (TypeParameterDescriptor typeParameterDescriptor2 : list) {
                TypeParameterDescriptorImpl typeParameterDescriptorImpl = (TypeParameterDescriptorImpl) map2.get(typeParameterDescriptor2);
                for (KotlinType kotlinType : typeParameterDescriptor2.getUpperBounds()) {
                    ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = kotlinType.getConstructor().mo5778getDeclarationDescriptor();
                    KotlinType kotlinTypeSubstitute = (((classifierDescriptorMo5778getDeclarationDescriptor instanceof TypeParameterDescriptor) && TypeUtilsKt.hasTypeParameterRecursiveBounds((TypeParameterDescriptor) classifierDescriptorMo5778getDeclarationDescriptor)) ? typeSubstitutorCreateChainedSubstitutor : typeSubstitutorCreateChainedSubstitutor2).substitute(kotlinType, Variance.OUT_VARIANCE);
                    if (kotlinTypeSubstitute == null) {
                        return null;
                    }
                    if (kotlinTypeSubstitute != kotlinType && zArr != null) {
                        zArr[0] = true;
                    }
                    typeParameterDescriptorImpl.addUpperBound(kotlinTypeSubstitute);
                }
                typeParameterDescriptorImpl.setInitialized();
            }
            return typeSubstitutorCreateChainedSubstitutor;
        }
        a(8);
        throw null;
    }
}
