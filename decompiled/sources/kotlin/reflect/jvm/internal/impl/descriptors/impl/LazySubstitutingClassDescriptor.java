package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class LazySubstitutingClassDescriptor extends ModuleAwareClassDescriptor {
    public static final /* synthetic */ int v0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ModuleAwareClassDescriptor f80340p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TypeSubstitutor f80341q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public TypeSubstitutor f80342r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ArrayList f80343s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public List<TypeParameterDescriptor> f80344t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ClassTypeConstructorImpl f80345u0;

    public class a implements Function1<TypeParameterDescriptor, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public Boolean invoke(TypeParameterDescriptor typeParameterDescriptor) {
            return Boolean.valueOf(!typeParameterDescriptor.isCapturedFromOuterDeclaration());
        }
    }

    public class b implements Function1<SimpleType, SimpleType> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function1
        public SimpleType invoke(SimpleType simpleType) {
            LazySubstitutingClassDescriptor lazySubstitutingClassDescriptor = LazySubstitutingClassDescriptor.this;
            if (simpleType != null) {
                return lazySubstitutingClassDescriptor.f80341q0.isEmpty() ? simpleType : (SimpleType) lazySubstitutingClassDescriptor.b().substitute(simpleType, Variance.INVARIANT);
            }
            int i10 = LazySubstitutingClassDescriptor.v0;
            lazySubstitutingClassDescriptor.getClass();
            return simpleType;
        }
    }

    public LazySubstitutingClassDescriptor(ModuleAwareClassDescriptor moduleAwareClassDescriptor, TypeSubstitutor typeSubstitutor) {
        this.f80340p0 = moduleAwareClassDescriptor;
        this.f80341q0 = typeSubstitutor;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 13 || i10 == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 13 || i10 == 23) ? 3 : 2];
        if (i10 == 2) {
            objArr[0] = "typeArguments";
        } else if (i10 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i10 == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i10 == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i10 == 8) {
            objArr[0] = "typeArguments";
        } else if (i10 == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i10 == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i10 != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10) {
            objArr[2] = "getMemberScope";
        } else if (i10 == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i10 == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 8 && i10 != 10 && i10 != 13 && i10 != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d2) {
        return declarationDescriptorVisitor.visitClassDescriptor(this, d2);
    }

    public final TypeSubstitutor b() {
        if (this.f80342r0 == null) {
            TypeSubstitutor typeSubstitutor = this.f80341q0;
            if (typeSubstitutor.isEmpty()) {
                this.f80342r0 = typeSubstitutor;
            } else {
                List<TypeParameterDescriptor> parameters = this.f80340p0.getTypeConstructor().getParameters();
                this.f80343s0 = new ArrayList(parameters.size());
                this.f80342r0 = DescriptorSubstitutor.substituteTypeParameters(parameters, typeSubstitutor.getSubstitution(), this, this.f80343s0);
                this.f80344t0 = CollectionsKt___CollectionsKt.filter(this.f80343s0, new a());
            }
        }
        return this.f80342r0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        Annotations annotations = this.f80340p0.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        a(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getCompanionObjectDescriptor */
    public ClassDescriptor mo5771getCompanionObjectDescriptor() {
        return this.f80340p0.mo5771getCompanionObjectDescriptor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection<ClassConstructorDescriptor> getConstructors() {
        Collection<ClassConstructorDescriptor> constructors = this.f80340p0.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.size());
        for (ClassConstructorDescriptor classConstructorDescriptor : constructors) {
            arrayList.add(((ClassConstructorDescriptor) classConstructorDescriptor.newCopyBuilder().setOriginal(classConstructorDescriptor.getOriginal()).setModality(classConstructorDescriptor.getModality()).setVisibility(classConstructorDescriptor.getVisibility()).setKind(classConstructorDescriptor.getKind()).setCopyOverrides(false).build()).substitute(b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getContainingDeclaration() {
        DeclarationDescriptor containingDeclaration = this.f80340p0.getContainingDeclaration();
        if (containingDeclaration != null) {
            return containingDeclaration;
        }
        a(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public List<ReceiverParameterDescriptor> getContextReceivers() {
        List<ReceiverParameterDescriptor> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        a(17);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        b();
        List<TypeParameterDescriptor> list = this.f80344t0;
        if (list != null) {
            return list;
        }
        a(30);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public SimpleType getDefaultType() {
        SimpleType simpleTypeSimpleTypeWithNonTrivialMemberScope = KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(DefaultTypeAttributeTranslator.INSTANCE.toAttributes(getAnnotations(), null, null), getTypeConstructor(), TypeUtils.getDefaultTypeProjections(getTypeConstructor().getParameters()), false, getUnsubstitutedMemberScope());
        if (simpleTypeSimpleTypeWithNonTrivialMemberScope != null) {
            return simpleTypeSimpleTypeWithNonTrivialMemberScope;
        }
        a(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        ClassKind kind = this.f80340p0.getKind();
        if (kind != null) {
            return kind;
        }
        a(25);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public MemberScope getMemberScope(@NotNull TypeSubstitution typeSubstitution, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (typeSubstitution == null) {
            a(5);
            throw null;
        }
        if (kotlinTypeRefiner == null) {
            a(6);
            throw null;
        }
        MemberScope memberScope = this.f80340p0.getMemberScope(typeSubstitution, kotlinTypeRefiner);
        if (!this.f80341q0.isEmpty()) {
            return new SubstitutingScope(memberScope, b());
        }
        if (memberScope != null) {
            return memberScope;
        }
        a(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Modality getModality() {
        Modality modality = this.f80340p0.getModality();
        if (modality != null) {
            return modality;
        }
        a(26);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        Name name = this.f80340p0.getName();
        if (name != null) {
            return name;
        }
        a(20);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection<ClassDescriptor> getSealedSubclasses() {
        Collection<ClassDescriptor> sealedSubclasses = this.f80340p0.getSealedSubclasses();
        if (sealedSubclasses != null) {
            return sealedSubclasses;
        }
        a(31);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        if (sourceElement != null) {
            return sourceElement;
        }
        a(29);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getStaticScope() {
        MemberScope staticScope = this.f80340p0.getStaticScope();
        if (staticScope != null) {
            return staticScope;
        }
        a(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ReceiverParameterDescriptor getThisAsReceiverParameter() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor = this.f80340p0.getTypeConstructor();
        if (this.f80341q0.isEmpty()) {
            if (typeConstructor != null) {
                return typeConstructor;
            }
            a(0);
            throw null;
        }
        if (this.f80345u0 == null) {
            TypeSubstitutor typeSubstitutorB = b();
            Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
            ArrayList arrayList = new ArrayList(supertypes.size());
            Iterator<KotlinType> it = supertypes.iterator();
            while (it.hasNext()) {
                arrayList.add(typeSubstitutorB.substitute(it.next(), Variance.INVARIANT));
            }
            this.f80345u0 = new ClassTypeConstructorImpl(this, this.f80343s0, arrayList, LockBasedStorageManager.NO_LOCKS);
        }
        ClassTypeConstructorImpl classTypeConstructorImpl = this.f80345u0;
        if (classTypeConstructorImpl != null) {
            return classTypeConstructorImpl;
        }
        a(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedInnerClassesScope() {
        MemberScope unsubstitutedInnerClassesScope = this.f80340p0.getUnsubstitutedInnerClassesScope();
        if (unsubstitutedInnerClassesScope != null) {
            return unsubstitutedInnerClassesScope;
        }
        a(28);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedMemberScope() {
        MemberScope unsubstitutedMemberScope = getUnsubstitutedMemberScope(DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtils.getContainingModule(this.f80340p0)));
        if (unsubstitutedMemberScope != null) {
            return unsubstitutedMemberScope;
        }
        a(12);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
    public ClassConstructorDescriptor mo5772getUnsubstitutedPrimaryConstructor() {
        return this.f80340p0.mo5772getUnsubstitutedPrimaryConstructor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        ValueClassRepresentation<SimpleType> valueClassRepresentation = this.f80340p0.getValueClassRepresentation();
        if (valueClassRepresentation == null) {
            return null;
        }
        return valueClassRepresentation.mapUnderlyingType(new b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility visibility = this.f80340p0.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        a(27);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.f80340p0.isActual();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return this.f80340p0.isCompanionObject();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return this.f80340p0.isData();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.f80340p0.isExpect();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.f80340p0.isExternal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        return this.f80340p0.isFun();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return this.f80340p0.isInline();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return this.f80340p0.isInner();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return this.f80340p0.isValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            a(13);
            throw null;
        }
        MemberScope unsubstitutedMemberScope = this.f80340p0.getUnsubstitutedMemberScope(kotlinTypeRefiner);
        if (!this.f80341q0.isEmpty()) {
            return new SubstitutingScope(unsubstitutedMemberScope, b());
        }
        if (unsubstitutedMemberScope != null) {
            return unsubstitutedMemberScope;
        }
        a(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @NotNull
    public ClassDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return typeSubstitutor.isEmpty() ? this : new LazySubstitutingClassDescriptor(this, TypeSubstitutor.createChainedSubstitutor(typeSubstitutor.getSubstitution(), b().getSubstitution()));
        }
        a(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public ClassDescriptor getOriginal() {
        ClassDescriptor original = this.f80340p0.getOriginal();
        if (original != null) {
            return original;
        }
        a(21);
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
            a(11);
            throw null;
        }
        a(10);
        throw null;
    }
}
