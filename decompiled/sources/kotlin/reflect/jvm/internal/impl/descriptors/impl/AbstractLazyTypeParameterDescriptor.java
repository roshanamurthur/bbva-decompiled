package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractLazyTypeParameterDescriptor extends AbstractTypeParameterDescriptor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractLazyTypeParameterDescriptor(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull Variance variance, boolean z10, int i10, @NotNull SourceElement sourceElement, @NotNull SupertypeLoopChecker supertypeLoopChecker) {
        super(storageManager, declarationDescriptor, annotations, name, variance, z10, i10, sourceElement, supertypeLoopChecker);
        if (storageManager == null) {
            a(0);
            throw null;
        }
        if (declarationDescriptor == null) {
            a(1);
            throw null;
        }
        if (annotations == null) {
            a(2);
            throw null;
        }
        if (name == null) {
            a(3);
            throw null;
        }
        if (variance == null) {
            a(4);
            throw null;
        }
        if (sourceElement == null) {
            a(5);
            throw null;
        }
        if (supertypeLoopChecker != null) {
        } else {
            a(6);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        Object[] objArr = new Object[3];
        String str = "";
        objArr[0] = isReified() ? "reified " : "";
        if (getVariance() != Variance.INVARIANT) {
            str = getVariance() + " ";
        }
        objArr[1] = str;
        objArr[2] = getName();
        return String.format("%s%s%s", objArr);
    }
}
