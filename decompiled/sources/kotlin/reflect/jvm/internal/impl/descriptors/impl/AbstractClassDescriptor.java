package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractClassDescriptor extends ModuleAwareClassDescriptor {
    protected final NotNullLazyValue<SimpleType> defaultType;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Name f80264p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final NotNullLazyValue<MemberScope> f80265q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final NotNullLazyValue<ReceiverParameterDescriptor> f80266r0;

    public class a implements Function0<SimpleType> {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor$a$a, reason: collision with other inner class name */
        public class C0439a implements Function1<KotlinTypeRefiner, SimpleType> {
            public C0439a() {
            }

            @Override // kotlin.jvm.functions.Function1
            public SimpleType invoke(KotlinTypeRefiner kotlinTypeRefiner) {
                a aVar = a.this;
                ClassifierDescriptor classifierDescriptorRefineDescriptor = kotlinTypeRefiner.refineDescriptor(AbstractClassDescriptor.this);
                if (classifierDescriptorRefineDescriptor == null) {
                    return AbstractClassDescriptor.this.defaultType.invoke();
                }
                if (classifierDescriptorRefineDescriptor instanceof TypeAliasDescriptor) {
                    return KotlinTypeFactory.computeExpandedType((TypeAliasDescriptor) classifierDescriptorRefineDescriptor, TypeUtils.getDefaultTypeProjections(classifierDescriptorRefineDescriptor.getTypeConstructor().getParameters()));
                }
                return classifierDescriptorRefineDescriptor instanceof ModuleAwareClassDescriptor ? TypeUtils.makeUnsubstitutedType(classifierDescriptorRefineDescriptor.getTypeConstructor().refine(kotlinTypeRefiner), ((ModuleAwareClassDescriptor) classifierDescriptorRefineDescriptor).getUnsubstitutedMemberScope(kotlinTypeRefiner), this) : classifierDescriptorRefineDescriptor.getDefaultType();
            }
        }

        public a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public SimpleType invoke() {
            AbstractClassDescriptor abstractClassDescriptor = AbstractClassDescriptor.this;
            return TypeUtils.makeUnsubstitutedType(abstractClassDescriptor, abstractClassDescriptor.getUnsubstitutedMemberScope(), new C0439a());
        }
    }

    public class b implements Function0<MemberScope> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        public MemberScope invoke() {
            return new InnerClassesScopeWrapper(AbstractClassDescriptor.this.getUnsubstitutedMemberScope());
        }
    }

    public class c implements Function0<ReceiverParameterDescriptor> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function0
        public ReceiverParameterDescriptor invoke() {
            return new LazyClassReceiverParameterDescriptor(AbstractClassDescriptor.this);
        }
    }

    public AbstractClassDescriptor(@NotNull StorageManager storageManager, @NotNull Name name) {
        if (storageManager == null) {
            a(0);
            throw null;
        }
        if (name == null) {
            a(1);
            throw null;
        }
        this.f80264p0 = name;
        this.defaultType = storageManager.createLazyValue(new a());
        this.f80265q0 = storageManager.createLazyValue(new b());
        this.f80266r0 = storageManager.createLazyValue(new c());
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i10 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i10 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i10 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i10 == 19) {
            objArr[1] = "substitute";
        } else if (i10 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 12 && i10 != 14 && i10 != 16 && i10 != 17 && i10 != 19 && i10 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d2) {
        return declarationDescriptorVisitor.visitClassDescriptor(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public List<ReceiverParameterDescriptor> getContextReceivers() {
        List<ReceiverParameterDescriptor> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        a(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public SimpleType getDefaultType() {
        SimpleType simpleTypeInvoke = this.defaultType.invoke();
        if (simpleTypeInvoke != null) {
            return simpleTypeInvoke;
        }
        a(20);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public MemberScope getMemberScope(@NotNull TypeSubstitution typeSubstitution, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (typeSubstitution == null) {
            a(10);
            throw null;
        }
        if (kotlinTypeRefiner == null) {
            a(11);
            throw null;
        }
        if (!typeSubstitution.isEmpty()) {
            return new SubstitutingScope(getUnsubstitutedMemberScope(kotlinTypeRefiner), TypeSubstitutor.create(typeSubstitution));
        }
        MemberScope unsubstitutedMemberScope = getUnsubstitutedMemberScope(kotlinTypeRefiner);
        if (unsubstitutedMemberScope != null) {
            return unsubstitutedMemberScope;
        }
        a(12);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        Name name = this.f80264p0;
        if (name != null) {
            return name;
        }
        a(2);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public ClassDescriptor getOriginal() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ReceiverParameterDescriptor getThisAsReceiverParameter() {
        ReceiverParameterDescriptor receiverParameterDescriptorInvoke = this.f80266r0.invoke();
        if (receiverParameterDescriptorInvoke != null) {
            return receiverParameterDescriptorInvoke;
        }
        a(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedInnerClassesScope() {
        MemberScope memberScopeInvoke = this.f80265q0.invoke();
        if (memberScopeInvoke != null) {
            return memberScopeInvoke;
        }
        a(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedMemberScope() {
        MemberScope unsubstitutedMemberScope = getUnsubstitutedMemberScope(DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtils.getContainingModule(this)));
        if (unsubstitutedMemberScope != null) {
            return unsubstitutedMemberScope;
        }
        a(17);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @NotNull
    public ClassDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return typeSubstitutor.isEmpty() ? this : new LazySubstitutingClassDescriptor(this, typeSubstitutor);
        }
        a(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getMemberScope(@NotNull TypeSubstitution typeSubstitution) {
        if (typeSubstitution != null) {
            MemberScope memberScope = getMemberScope(typeSubstitution, DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtils.getContainingModule(this)));
            if (memberScope != null) {
                return memberScope;
            }
            a(16);
            throw null;
        }
        a(15);
        throw null;
    }
}
