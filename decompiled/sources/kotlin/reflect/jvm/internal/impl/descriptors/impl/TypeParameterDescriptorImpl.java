package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class TypeParameterDescriptorImpl extends AbstractTypeParameterDescriptor {

    @Nullable
    public final Function1<KotlinType, Void> E0;
    public final ArrayList F0;
    public boolean G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeParameterDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, boolean z10, @NotNull Variance variance, @NotNull Name name, int i10, @NotNull SourceElement sourceElement, @Nullable Function1<KotlinType, Void> function1, @NotNull SupertypeLoopChecker supertypeLoopChecker, @NotNull StorageManager storageManager) {
        super(storageManager, declarationDescriptor, annotations, name, variance, z10, i10, sourceElement, supertypeLoopChecker);
        if (declarationDescriptor == null) {
            a(19);
            throw null;
        }
        if (annotations == null) {
            a(20);
            throw null;
        }
        if (variance == null) {
            a(21);
            throw null;
        }
        if (name == null) {
            a(22);
            throw null;
        }
        if (sourceElement == null) {
            a(23);
            throw null;
        }
        if (supertypeLoopChecker == null) {
            a(24);
            throw null;
        }
        if (storageManager == null) {
            a(25);
            throw null;
        }
        this.F0 = new ArrayList(1);
        this.G0 = false;
        this.E0 = function1;
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 5 || i10 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 28) ? 2 : 3];
        switch (i10) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i10 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i10 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i10) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static TypeParameterDescriptorImpl createForFurtherModification(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, boolean z10, @NotNull Variance variance, @NotNull Name name, int i10, @NotNull SourceElement sourceElement, @NotNull StorageManager storageManager) {
        if (declarationDescriptor == null) {
            a(6);
            throw null;
        }
        if (annotations == null) {
            a(7);
            throw null;
        }
        if (variance == null) {
            a(8);
            throw null;
        }
        if (name == null) {
            a(9);
            throw null;
        }
        if (sourceElement == null) {
            a(10);
            throw null;
        }
        if (storageManager != null) {
            return createForFurtherModification(declarationDescriptor, annotations, z10, variance, name, i10, sourceElement, null, SupertypeLoopChecker.EMPTY.INSTANCE, storageManager);
        }
        a(11);
        throw null;
    }

    @NotNull
    public static TypeParameterDescriptor createWithDefaultBound(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, boolean z10, @NotNull Variance variance, @NotNull Name name, int i10, @NotNull StorageManager storageManager) {
        if (declarationDescriptor == null) {
            a(0);
            throw null;
        }
        if (annotations == null) {
            a(1);
            throw null;
        }
        if (variance == null) {
            a(2);
            throw null;
        }
        if (name == null) {
            a(3);
            throw null;
        }
        if (storageManager == null) {
            a(4);
            throw null;
        }
        TypeParameterDescriptorImpl typeParameterDescriptorImplCreateForFurtherModification = createForFurtherModification(declarationDescriptor, annotations, z10, variance, name, i10, SourceElement.NO_SOURCE, storageManager);
        typeParameterDescriptorImplCreateForFurtherModification.addUpperBound(DescriptorUtilsKt.getBuiltIns(declarationDescriptor).getDefaultBound());
        typeParameterDescriptorImplCreateForFurtherModification.setInitialized();
        return typeParameterDescriptorImplCreateForFurtherModification;
    }

    public void addUpperBound(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            a(26);
            throw null;
        }
        if (this.G0) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + b());
        }
        if (KotlinTypeKt.isError(kotlinType)) {
            return;
        }
        this.F0.add(kotlinType);
    }

    public final String b() {
        return getName() + " declared in " + DescriptorUtils.getFqName(getContainingDeclaration());
    }

    public boolean isInitialized() {
        return this.G0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* JADX INFO: renamed from: reportSupertypeLoopError */
    public void mo5780reportSupertypeLoopError(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            a(27);
            throw null;
        }
        Function1<KotlinType, Void> function1 = this.E0;
        if (function1 == null) {
            return;
        }
        function1.invoke(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    public List<KotlinType> resolveUpperBounds() {
        if (!this.G0) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + b());
        }
        ArrayList arrayList = this.F0;
        if (arrayList != null) {
            return arrayList;
        }
        a(28);
        throw null;
    }

    public void setInitialized() {
        if (!this.G0) {
            this.G0 = true;
        } else {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + b());
        }
    }

    public static TypeParameterDescriptorImpl createForFurtherModification(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, boolean z10, @NotNull Variance variance, @NotNull Name name, int i10, @NotNull SourceElement sourceElement, @Nullable Function1<KotlinType, Void> function1, @NotNull SupertypeLoopChecker supertypeLoopChecker, @NotNull StorageManager storageManager) {
        if (declarationDescriptor == null) {
            a(12);
            throw null;
        }
        if (annotations == null) {
            a(13);
            throw null;
        }
        if (variance == null) {
            a(14);
            throw null;
        }
        if (name == null) {
            a(15);
            throw null;
        }
        if (sourceElement == null) {
            a(16);
            throw null;
        }
        if (supertypeLoopChecker == null) {
            a(17);
            throw null;
        }
        if (storageManager != null) {
            return new TypeParameterDescriptorImpl(declarationDescriptor, annotations, z10, variance, name, i10, sourceElement, function1, supertypeLoopChecker, storageManager);
        }
        a(18);
        throw null;
    }
}
