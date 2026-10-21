package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractClassTypeConstructor extends AbstractTypeConstructor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClassTypeConstructor(@NotNull StorageManager storageManager) {
        super(storageManager);
        if (storageManager != null) {
        } else {
            a(0);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i10 == 2) {
            objArr[0] = "classifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i10 != 1) {
            if (i10 == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @Nullable
    public KotlinType defaultSupertypeIfEmpty() {
        if (KotlinBuiltIns.isSpecialClassWithNoSupertypes(mo5778getDeclarationDescriptor())) {
            return null;
        }
        return getBuiltIns().getAnyType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @NotNull
    public Collection<KotlinType> getAdditionalNeighboursInSupertypeGraph(boolean z10) {
        DeclarationDescriptor containingDeclaration = mo5778getDeclarationDescriptor().getContainingDeclaration();
        if (!(containingDeclaration instanceof ClassDescriptor)) {
            List listEmptyList = Collections.emptyList();
            if (listEmptyList != null) {
                return listEmptyList;
            }
            a(3);
            throw null;
        }
        SmartList smartList = new SmartList();
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        smartList.add(classDescriptor.getDefaultType());
        ClassDescriptor classDescriptorMo5771getCompanionObjectDescriptor = classDescriptor.mo5771getCompanionObjectDescriptor();
        if (z10 && classDescriptorMo5771getCompanionObjectDescriptor != null) {
            smartList.add(classDescriptorMo5771getCompanionObjectDescriptor.getDefaultType());
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = DescriptorUtilsKt.getBuiltIns(mo5778getDeclarationDescriptor());
        if (builtIns != null) {
            return builtIns;
        }
        a(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public abstract ClassDescriptor mo5778getDeclarationDescriptor();

    @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
    public boolean isSameClassifier(@NotNull ClassifierDescriptor classifierDescriptor) {
        if (classifierDescriptor != null) {
            return (classifierDescriptor instanceof ClassDescriptor) && areFqNamesEqual(mo5778getDeclarationDescriptor(), classifierDescriptor);
        }
        a(2);
        throw null;
    }
}
