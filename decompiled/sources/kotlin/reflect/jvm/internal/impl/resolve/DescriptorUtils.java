package kotlin.reflect.jvm.internal.impl.resolve;

import com.noknok.android.client.utils.UIConfigTags;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class DescriptorUtils {
    public static final FqName JVM_NAME = new FqName("kotlin.jvm.JvmName");

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = UIConfigTags.TAG_SECOND;
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean areInSameModule(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            a(16);
            throw null;
        }
        if (declarationDescriptor2 != null) {
            return getContainingModule(declarationDescriptor).equals(getContainingModule(declarationDescriptor2));
        }
        a(17);
        throw null;
    }

    public static void b(@NotNull CallableDescriptor callableDescriptor, @NotNull LinkedHashSet linkedHashSet) {
        if (callableDescriptor == null) {
            a(73);
            throw null;
        }
        if (linkedHashSet.contains(callableDescriptor)) {
            return;
        }
        Iterator<? extends CallableDescriptor> it = callableDescriptor.getOriginal().getOverriddenDescriptors().iterator();
        while (it.hasNext()) {
            CallableDescriptor original = it.next().getOriginal();
            b(original, linkedHashSet);
            linkedHashSet.add(original);
        }
    }

    @Nullable
    public static FqName c(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(5);
            throw null;
        }
        if ((declarationDescriptor instanceof ModuleDescriptor) || ErrorUtils.isError(declarationDescriptor)) {
            return FqName.ROOT;
        }
        if (declarationDescriptor instanceof PackageViewDescriptor) {
            return ((PackageViewDescriptor) declarationDescriptor).getFqName();
        }
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return ((PackageFragmentDescriptor) declarationDescriptor).getFqName();
        }
        return null;
    }

    public static boolean d(@Nullable DeclarationDescriptor declarationDescriptor, @NotNull ClassKind classKind) {
        if (classKind != null) {
            return (declarationDescriptor instanceof ClassDescriptor) && ((ClassDescriptor) declarationDescriptor).getKind() == classKind;
        }
        a(37);
        throw null;
    }

    public static boolean e(@NotNull KotlinType kotlinType, @NotNull DeclarationDescriptor declarationDescriptor) {
        if (kotlinType == null) {
            a(30);
            throw null;
        }
        if (declarationDescriptor == null) {
            a(31);
            throw null;
        }
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = kotlinType.getConstructor().mo5778getDeclarationDescriptor();
        if (classifierDescriptorMo5778getDeclarationDescriptor == null) {
            return false;
        }
        DeclarationDescriptor original = classifierDescriptorMo5778getDeclarationDescriptor.getOriginal();
        return (original instanceof ClassifierDescriptor) && (declarationDescriptor instanceof ClassifierDescriptor) && ((ClassifierDescriptor) declarationDescriptor).getTypeConstructor().equals(((ClassifierDescriptor) original).getTypeConstructor());
    }

    @NotNull
    public static <D extends CallableDescriptor> Set<D> getAllOverriddenDescriptors(@NotNull D d2) {
        if (d2 == null) {
            a(71);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b(d2.getOriginal(), linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    public static ClassDescriptor getClassDescriptorForType(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return getClassDescriptorForTypeConstructor(kotlinType.getConstructor());
        }
        a(45);
        throw null;
    }

    @NotNull
    public static ClassDescriptor getClassDescriptorForTypeConstructor(@NotNull TypeConstructor typeConstructor) {
        if (typeConstructor == null) {
            a(46);
            throw null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) typeConstructor.mo5778getDeclarationDescriptor();
        if (classDescriptor != null) {
            return classDescriptor;
        }
        a(47);
        throw null;
    }

    @NotNull
    public static ModuleDescriptor getContainingModule(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(21);
            throw null;
        }
        ModuleDescriptor containingModuleOrNull = getContainingModuleOrNull(declarationDescriptor);
        if (containingModuleOrNull != null) {
            return containingModuleOrNull;
        }
        a(22);
        throw null;
    }

    @Nullable
    public static ModuleDescriptor getContainingModuleOrNull(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            a(20);
            throw null;
        }
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = kotlinType.getConstructor().mo5778getDeclarationDescriptor();
        if (classifierDescriptorMo5778getDeclarationDescriptor == null) {
            return null;
        }
        return getContainingModuleOrNull(classifierDescriptorMo5778getDeclarationDescriptor);
    }

    @NotNull
    public static SourceFile getContainingSourceFile(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(82);
            throw null;
        }
        if (declarationDescriptor instanceof PropertySetterDescriptor) {
            declarationDescriptor = ((PropertySetterDescriptor) declarationDescriptor).getCorrespondingProperty();
        }
        if (declarationDescriptor instanceof DeclarationDescriptorWithSource) {
            SourceFile containingFile = ((DeclarationDescriptorWithSource) declarationDescriptor).getSource().getContainingFile();
            if (containingFile != null) {
                return containingFile;
            }
            a(83);
            throw null;
        }
        SourceFile sourceFile = SourceFile.NO_SOURCE_FILE;
        if (sourceFile != null) {
            return sourceFile;
        }
        a(84);
        throw null;
    }

    @NotNull
    public static DescriptorVisibility getDefaultConstructorVisibility(@NotNull ClassDescriptor classDescriptor, boolean z10) {
        if (classDescriptor == null) {
            a(48);
            throw null;
        }
        ClassKind kind = classDescriptor.getKind();
        if (kind == ClassKind.ENUM_CLASS || kind.isSingleton()) {
            DescriptorVisibility descriptorVisibility = DescriptorVisibilities.PRIVATE;
            if (descriptorVisibility != null) {
                return descriptorVisibility;
            }
            a(49);
            throw null;
        }
        if (isSealedClass(classDescriptor)) {
            if (z10) {
                DescriptorVisibility descriptorVisibility2 = DescriptorVisibilities.PROTECTED;
                if (descriptorVisibility2 != null) {
                    return descriptorVisibility2;
                }
                a(50);
                throw null;
            }
            DescriptorVisibility descriptorVisibility3 = DescriptorVisibilities.PRIVATE;
            if (descriptorVisibility3 != null) {
                return descriptorVisibility3;
            }
            a(51);
            throw null;
        }
        if (isAnonymousObject(classDescriptor)) {
            DescriptorVisibility descriptorVisibility4 = DescriptorVisibilities.DEFAULT_VISIBILITY;
            if (descriptorVisibility4 != null) {
                return descriptorVisibility4;
            }
            a(52);
            throw null;
        }
        DescriptorVisibility descriptorVisibility5 = DescriptorVisibilities.PUBLIC;
        if (descriptorVisibility5 != null) {
            return descriptorVisibility5;
        }
        a(53);
        throw null;
    }

    @Nullable
    public static ReceiverParameterDescriptor getDispatchReceiverParameterIfNeeded(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(0);
            throw null;
        }
        if (declarationDescriptor instanceof ClassDescriptor) {
            return ((ClassDescriptor) declarationDescriptor).getThisAsReceiverParameter();
        }
        return null;
    }

    @NotNull
    public static FqNameUnsafe getFqName(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(2);
            throw null;
        }
        FqName fqNameC = c(declarationDescriptor);
        if (fqNameC != null) {
            return fqNameC.toUnsafe();
        }
        FqNameUnsafe fqNameUnsafeChild = getFqName(declarationDescriptor.getContainingDeclaration()).child(declarationDescriptor.getName());
        if (fqNameUnsafeChild != null) {
            return fqNameUnsafeChild;
        }
        a(7);
        throw null;
    }

    @NotNull
    public static FqName getFqNameSafe(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(3);
            throw null;
        }
        FqName fqNameC = c(declarationDescriptor);
        if (fqNameC == null) {
            FqNameUnsafe fqNameUnsafeChild = getFqName(declarationDescriptor.getContainingDeclaration()).child(declarationDescriptor.getName());
            if (fqNameUnsafeChild == null) {
                a(7);
                throw null;
            }
            fqNameC = fqNameUnsafeChild.toSafe();
        }
        if (fqNameC != null) {
            return fqNameC;
        }
        a(4);
        throw null;
    }

    @Nullable
    public static <D extends DeclarationDescriptor> D getParentOfType(@Nullable DeclarationDescriptor declarationDescriptor, @NotNull Class<D> cls) {
        if (cls != null) {
            return (D) getParentOfType(declarationDescriptor, cls, true);
        }
        a(18);
        throw null;
    }

    @Nullable
    public static ClassDescriptor getSuperClassDescriptor(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            a(44);
            throw null;
        }
        Iterator<KotlinType> it = classDescriptor.getTypeConstructor().getSupertypes().iterator();
        while (it.hasNext()) {
            ClassDescriptor classDescriptorForType = getClassDescriptorForType(it.next());
            if (classDescriptorForType.getKind() != ClassKind.INTERFACE) {
                return classDescriptorForType;
            }
        }
        return null;
    }

    public static boolean isAnnotationClass(@Nullable DeclarationDescriptor declarationDescriptor) {
        return d(declarationDescriptor, ClassKind.ANNOTATION_CLASS);
    }

    public static boolean isAnonymousObject(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor != null) {
            return isClass(declarationDescriptor) && declarationDescriptor.getName().equals(SpecialNames.NO_NAME_PROVIDED);
        }
        a(34);
        throw null;
    }

    public static boolean isClass(@Nullable DeclarationDescriptor declarationDescriptor) {
        return d(declarationDescriptor, ClassKind.CLASS);
    }

    public static boolean isClassOrEnumClass(@Nullable DeclarationDescriptor declarationDescriptor) {
        return isClass(declarationDescriptor) || isEnumClass(declarationDescriptor);
    }

    public static boolean isCompanionObject(@Nullable DeclarationDescriptor declarationDescriptor) {
        return d(declarationDescriptor, ClassKind.OBJECT) && ((ClassDescriptor) declarationDescriptor).isCompanionObject();
    }

    public static boolean isDescriptorWithLocalVisibility(DeclarationDescriptor declarationDescriptor) {
        return (declarationDescriptor instanceof DeclarationDescriptorWithVisibility) && ((DeclarationDescriptorWithVisibility) declarationDescriptor).getVisibility() == DescriptorVisibilities.LOCAL;
    }

    public static boolean isDirectSubclass(@NotNull ClassDescriptor classDescriptor, @NotNull ClassDescriptor classDescriptor2) {
        if (classDescriptor == null) {
            a(26);
            throw null;
        }
        if (classDescriptor2 == null) {
            a(27);
            throw null;
        }
        Iterator<KotlinType> it = classDescriptor.getTypeConstructor().getSupertypes().iterator();
        while (it.hasNext()) {
            if (e(it.next(), classDescriptor2.getOriginal())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEnumClass(@Nullable DeclarationDescriptor declarationDescriptor) {
        return d(declarationDescriptor, ClassKind.ENUM_CLASS);
    }

    public static boolean isEnumEntry(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor != null) {
            return d(declarationDescriptor, ClassKind.ENUM_ENTRY);
        }
        a(36);
        throw null;
    }

    public static boolean isInterface(@Nullable DeclarationDescriptor declarationDescriptor) {
        return d(declarationDescriptor, ClassKind.INTERFACE);
    }

    public static boolean isLocal(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(1);
            throw null;
        }
        while (declarationDescriptor != null) {
            if (isAnonymousObject(declarationDescriptor) || isDescriptorWithLocalVisibility(declarationDescriptor)) {
                return true;
            }
            declarationDescriptor = declarationDescriptor.getContainingDeclaration();
        }
        return false;
    }

    public static boolean isSealedClass(@Nullable DeclarationDescriptor declarationDescriptor) {
        return (d(declarationDescriptor, ClassKind.CLASS) || d(declarationDescriptor, ClassKind.INTERFACE)) && ((ClassDescriptor) declarationDescriptor).getModality() == Modality.SEALED;
    }

    public static boolean isSubclass(@NotNull ClassDescriptor classDescriptor, @NotNull ClassDescriptor classDescriptor2) {
        if (classDescriptor == null) {
            a(28);
            throw null;
        }
        if (classDescriptor2 != null) {
            return isSubtypeOfClass(classDescriptor.getDefaultType(), classDescriptor2.getOriginal());
        }
        a(29);
        throw null;
    }

    public static boolean isSubtypeOfClass(@NotNull KotlinType kotlinType, @NotNull DeclarationDescriptor declarationDescriptor) {
        if (kotlinType == null) {
            a(32);
            throw null;
        }
        if (declarationDescriptor == null) {
            a(33);
            throw null;
        }
        if (e(kotlinType, declarationDescriptor)) {
            return true;
        }
        Iterator<KotlinType> it = kotlinType.getConstructor().getSupertypes().iterator();
        while (it.hasNext()) {
            if (isSubtypeOfClass(it.next(), declarationDescriptor)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTopLevelDeclaration(@Nullable DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor != null && (declarationDescriptor.getContainingDeclaration() instanceof PackageFragmentDescriptor);
    }

    public static boolean shouldRecordInitializerForProperty(@NotNull VariableDescriptor variableDescriptor, @NotNull KotlinType kotlinType) {
        if (variableDescriptor == null) {
            a(66);
            throw null;
        }
        if (kotlinType == null) {
            a(67);
            throw null;
        }
        if (variableDescriptor.isVar() || KotlinTypeKt.isError(kotlinType)) {
            return false;
        }
        if (TypeUtils.acceptsNullable(kotlinType)) {
            return true;
        }
        KotlinBuiltIns builtIns = DescriptorUtilsKt.getBuiltIns(variableDescriptor);
        if (!KotlinBuiltIns.isPrimitiveType(kotlinType)) {
            KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
            if (!kotlinTypeChecker.equalTypes(builtIns.getStringType(), kotlinType) && !kotlinTypeChecker.equalTypes(builtIns.getNumber().getDefaultType(), kotlinType) && !kotlinTypeChecker.equalTypes(builtIns.getAnyType(), kotlinType) && !UnsignedTypes.isUnsignedType(kotlinType)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static <D extends CallableMemberDescriptor> D unwrapFakeOverride(@NotNull D d2) {
        if (d2 == null) {
            a(59);
            throw null;
        }
        while (d2.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            Collection<? extends CallableMemberDescriptor> overriddenDescriptors = d2.getOverriddenDescriptors();
            if (overriddenDescriptors.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d2);
            }
            d2 = (D) overriddenDescriptors.iterator().next();
        }
        return d2;
    }

    @NotNull
    public static <D extends DeclarationDescriptorWithVisibility> D unwrapFakeOverrideToAnyDeclaration(@NotNull D d2) {
        if (d2 == null) {
            a(64);
            throw null;
        }
        if (d2 instanceof CallableMemberDescriptor) {
            return unwrapFakeOverride((CallableMemberDescriptor) d2);
        }
        if (d2 != null) {
            return d2;
        }
        a(65);
        throw null;
    }

    @Nullable
    public static <D extends DeclarationDescriptor> D getParentOfType(@Nullable DeclarationDescriptor declarationDescriptor, @NotNull Class<D> cls, boolean z10) {
        if (cls == null) {
            a(19);
            throw null;
        }
        if (declarationDescriptor == null) {
            return null;
        }
        if (z10) {
            declarationDescriptor = (D) declarationDescriptor.getContainingDeclaration();
        }
        while (declarationDescriptor != null) {
            if (cls.isInstance(declarationDescriptor)) {
                return (D) declarationDescriptor;
            }
            declarationDescriptor = (D) declarationDescriptor.getContainingDeclaration();
        }
        return null;
    }

    @Nullable
    public static ModuleDescriptor getContainingModuleOrNull(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(23);
            throw null;
        }
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof ModuleDescriptor) {
                return (ModuleDescriptor) declarationDescriptor;
            }
            if (declarationDescriptor instanceof PackageViewDescriptor) {
                return ((PackageViewDescriptor) declarationDescriptor).getModule();
            }
            declarationDescriptor = declarationDescriptor.getContainingDeclaration();
        }
        return null;
    }
}
