package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractTypeParameterDescriptor extends DeclarationDescriptorNonRootImpl implements TypeParameterDescriptor {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Variance f80280t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final boolean f80281u0;
    public final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final NotNullLazyValue<TypeConstructor> f80282w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final NotNullLazyValue<SimpleType> f80283x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final StorageManager f80284y0;

    public class a implements Function0<TypeConstructor> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ StorageManager f80285p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SupertypeLoopChecker f80286q0;

        public a(StorageManager storageManager, SupertypeLoopChecker supertypeLoopChecker) {
            this.f80285p0 = storageManager;
            this.f80286q0 = supertypeLoopChecker;
        }

        @Override // kotlin.jvm.functions.Function0
        public TypeConstructor invoke() {
            return new c(AbstractTypeParameterDescriptor.this, this.f80285p0, this.f80286q0);
        }
    }

    public class b implements Function0<SimpleType> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Name f80288p0;

        public class a implements Function0<MemberScope> {
            public a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public MemberScope invoke() {
                StringBuilder sb2 = new StringBuilder("Scope for type parameter ");
                b bVar = b.this;
                sb2.append(bVar.f80288p0.asString());
                return TypeIntersectionScope.create(sb2.toString(), AbstractTypeParameterDescriptor.this.getUpperBounds());
            }
        }

        public b(Name name) {
            this.f80288p0 = name;
        }

        @Override // kotlin.jvm.functions.Function0
        public SimpleType invoke() {
            return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(TypeAttributes.Companion.getEmpty(), AbstractTypeParameterDescriptor.this.getTypeConstructor(), Collections.emptyList(), false, new LazyScopeAdapter(new a()));
        }
    }

    public class c extends AbstractTypeConstructor {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SupertypeLoopChecker f80291c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AbstractTypeParameterDescriptor f80292d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, StorageManager storageManager, SupertypeLoopChecker supertypeLoopChecker) {
            super(storageManager);
            if (storageManager == null) {
                a(0);
                throw null;
            }
            this.f80292d = abstractTypeParameterDescriptor;
            this.f80291c = supertypeLoopChecker;
        }

        public static /* synthetic */ void a(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i10 == 2) {
                objArr[1] = "getParameters";
            } else if (i10 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i10 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i10 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i10 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        public final Collection<KotlinType> computeSupertypes() {
            List<KotlinType> listResolveUpperBounds = this.f80292d.resolveUpperBounds();
            if (listResolveUpperBounds != null) {
                return listResolveUpperBounds;
            }
            a(1);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @Nullable
        public final KotlinType defaultSupertypeIfEmpty() {
            return ErrorUtils.createErrorType(ErrorTypeKind.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public KotlinBuiltIns getBuiltIns() {
            KotlinBuiltIns builtIns = DescriptorUtilsKt.getBuiltIns(this.f80292d);
            if (builtIns != null) {
                return builtIns;
            }
            a(4);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: getDeclarationDescriptor */
        public ClassifierDescriptor mo5778getDeclarationDescriptor() {
            AbstractTypeParameterDescriptor abstractTypeParameterDescriptor = this.f80292d;
            if (abstractTypeParameterDescriptor != null) {
                return abstractTypeParameterDescriptor;
            }
            a(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            List<TypeParameterDescriptor> listEmptyList = Collections.emptyList();
            if (listEmptyList != null) {
                return listEmptyList;
            }
            a(2);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        public final SupertypeLoopChecker getSupertypeLoopChecker() {
            SupertypeLoopChecker supertypeLoopChecker = this.f80291c;
            if (supertypeLoopChecker != null) {
                return supertypeLoopChecker;
            }
            a(5);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
        public final boolean isSameClassifier(@NotNull ClassifierDescriptor classifierDescriptor) {
            if (classifierDescriptor != null) {
                return (classifierDescriptor instanceof TypeParameterDescriptor) && DescriptorEquivalenceForOverrides.INSTANCE.areTypeParametersEquivalent(this.f80292d, (TypeParameterDescriptor) classifierDescriptor, true);
            }
            a(9);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        public final List<KotlinType> processSupertypesWithoutCycles(@NotNull List<KotlinType> list) {
            if (list == null) {
                a(7);
                throw null;
            }
            List<KotlinType> listProcessBoundsWithoutCycles = this.f80292d.processBoundsWithoutCycles(list);
            if (listProcessBoundsWithoutCycles != null) {
                return listProcessBoundsWithoutCycles;
            }
            a(8);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final void reportSupertypeLoopError(@NotNull KotlinType kotlinType) {
            if (kotlinType != null) {
                this.f80292d.mo5780reportSupertypeLoopError(kotlinType);
            } else {
                a(6);
                throw null;
            }
        }

        public String toString() {
            return this.f80292d.getName().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeParameterDescriptor(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull Variance variance, boolean z10, int i10, @NotNull SourceElement sourceElement, @NotNull SupertypeLoopChecker supertypeLoopChecker) {
        super(declarationDescriptor, annotations, name, sourceElement);
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
        if (supertypeLoopChecker == null) {
            a(6);
            throw null;
        }
        this.f80280t0 = variance;
        this.f80281u0 = z10;
        this.v0 = i10;
        this.f80282w0 = storageManager.createLazyValue(new a(storageManager, supertypeLoopChecker));
        this.f80283x0 = storageManager.createLazyValue(new b(name));
        this.f80284y0 = storageManager;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
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
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d2) {
        return declarationDescriptorVisitor.visitTypeParameterDescriptor(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public SimpleType getDefaultType() {
        SimpleType simpleTypeInvoke = this.f80283x0.invoke();
        if (simpleTypeInvoke != null) {
            return simpleTypeInvoke;
        }
        a(10);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public int getIndex() {
        return this.v0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public StorageManager getStorageManager() {
        StorageManager storageManager = this.f80284y0;
        if (storageManager != null) {
            return storageManager;
        }
        a(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public final TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructorInvoke = this.f80282w0.invoke();
        if (typeConstructorInvoke != null) {
            return typeConstructorInvoke;
        }
        a(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public List<KotlinType> getUpperBounds() {
        List<KotlinType> supertypes = ((c) getTypeConstructor()).getSupertypes();
        if (supertypes != null) {
            return supertypes;
        }
        a(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public Variance getVariance() {
        Variance variance = this.f80280t0;
        if (variance != null) {
            return variance;
        }
        a(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean isCapturedFromOuterDeclaration() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean isReified() {
        return this.f80281u0;
    }

    @NotNull
    public List<KotlinType> processBoundsWithoutCycles(@NotNull List<KotlinType> list) {
        if (list == null) {
            a(12);
            throw null;
        }
        if (list != null) {
            return list;
        }
        a(13);
        throw null;
    }

    /* JADX INFO: renamed from: reportSupertypeLoopError */
    public abstract void mo5780reportSupertypeLoopError(@NotNull KotlinType kotlinType);

    @NotNull
    public abstract List<KotlinType> resolveUpperBounds();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public TypeParameterDescriptor getOriginal() {
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) super.getOriginal();
        if (typeParameterDescriptor != null) {
            return typeParameterDescriptor;
        }
        a(11);
        throw null;
    }
}
