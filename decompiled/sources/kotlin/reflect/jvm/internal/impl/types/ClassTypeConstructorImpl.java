package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class ClassTypeConstructorImpl extends AbstractClassTypeConstructor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ClassDescriptor f81902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<TypeParameterDescriptor> f81903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Collection<KotlinType> f81904e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassTypeConstructorImpl(@NotNull ClassDescriptor classDescriptor, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull Collection<KotlinType> collection, @NotNull StorageManager storageManager) {
        super(storageManager);
        if (classDescriptor == null) {
            a(0);
            throw null;
        }
        if (list == null) {
            a(1);
            throw null;
        }
        if (collection == null) {
            a(2);
            throw null;
        }
        if (storageManager == null) {
            a(3);
            throw null;
        }
        this.f81902c = classDescriptor;
        this.f81903d = Collections.unmodifiableList(new ArrayList(list));
        this.f81904e = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getParameters";
        } else if (i10 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i10 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @NotNull
    public Collection<KotlinType> computeSupertypes() {
        Collection<KotlinType> collection = this.f81904e;
        if (collection != null) {
            return collection;
        }
        a(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        List<TypeParameterDescriptor> list = this.f81903d;
        if (list != null) {
            return list;
        }
        a(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @NotNull
    public SupertypeLoopChecker getSupertypeLoopChecker() {
        SupertypeLoopChecker.EMPTY empty = SupertypeLoopChecker.EMPTY.INSTANCE;
        if (empty != null) {
            return empty;
        }
        a(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return true;
    }

    public String toString() {
        return DescriptorUtils.getFqName(this.f81902c).asString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public ClassDescriptor mo5778getDeclarationDescriptor() {
        ClassDescriptor classDescriptor = this.f81902c;
        if (classDescriptor != null) {
            return classDescriptor;
        }
        a(5);
        throw null;
    }
}
