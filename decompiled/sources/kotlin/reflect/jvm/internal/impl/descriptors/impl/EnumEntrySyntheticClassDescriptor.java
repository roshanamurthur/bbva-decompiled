package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class EnumEntrySyntheticClassDescriptor extends ClassDescriptorBase {
    public final ClassTypeConstructorImpl v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final a f80304w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final NotNullLazyValue<Set<Name>> f80305x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final Annotations f80306y0;

    public class a extends MemberScopeImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MemoizedFunctionToNotNull<Name, Collection<? extends SimpleFunctionDescriptor>> f80307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MemoizedFunctionToNotNull<Name, Collection<? extends PropertyDescriptor>> f80308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NotNullLazyValue<Collection<DeclarationDescriptor>> f80309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ EnumEntrySyntheticClassDescriptor f80310d;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor$a$a, reason: collision with other inner class name */
        public class C0440a implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
            public C0440a() {
            }

            @Override // kotlin.jvm.functions.Function1
            public Collection<? extends SimpleFunctionDescriptor> invoke(Name name) {
                a aVar = a.this;
                if (name == null) {
                    aVar.getClass();
                    a.a(8);
                    throw null;
                }
                MemberScope memberScope = aVar.f80310d.getTypeConstructor().getSupertypes().iterator().next().getMemberScope();
                if (memberScope != null) {
                    return aVar.b(name, memberScope.getContributedFunctions(name, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                }
                a.a(9);
                throw null;
            }
        }

        public class b implements Function1<Name, Collection<? extends PropertyDescriptor>> {
            public b() {
            }

            @Override // kotlin.jvm.functions.Function1
            public Collection<? extends PropertyDescriptor> invoke(Name name) {
                a aVar = a.this;
                if (name == null) {
                    aVar.getClass();
                    a.a(4);
                    throw null;
                }
                MemberScope memberScope = aVar.f80310d.getTypeConstructor().getSupertypes().iterator().next().getMemberScope();
                if (memberScope != null) {
                    return aVar.b(name, memberScope.getContributedVariables(name, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                }
                a.a(9);
                throw null;
            }
        }

        public class c implements Function0<Collection<DeclarationDescriptor>> {
            public c() {
            }

            @Override // kotlin.jvm.functions.Function0
            public Collection<DeclarationDescriptor> invoke() {
                a aVar = a.this;
                aVar.getClass();
                HashSet hashSet = new HashSet();
                for (Name name : aVar.f80310d.f80305x0.invoke()) {
                    NoLookupLocation noLookupLocation = NoLookupLocation.FOR_NON_TRACKED_SCOPE;
                    hashSet.addAll(aVar.getContributedFunctions(name, noLookupLocation));
                    hashSet.addAll(aVar.getContributedVariables(name, noLookupLocation));
                }
                return hashSet;
            }
        }

        public a(@NotNull EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor, StorageManager storageManager) {
            if (storageManager == null) {
                a(0);
                throw null;
            }
            this.f80310d = enumEntrySyntheticClassDescriptor;
            this.f80307a = storageManager.createMemoizedFunction(new C0440a());
            this.f80308b = storageManager.createMemoizedFunction(new b());
            this.f80309c = storageManager.createLazyValue(new c());
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0014  */
        public static /* synthetic */ void a(int i10) {
            String str;
            int i11;
            if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
                switch (i10) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        str = "@NotNull method %s.%s must not return null";
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
                switch (i10) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        i11 = 2;
                        break;
                    default:
                        i11 = 3;
                        break;
                }
            } else {
                i11 = 2;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                case 4:
                case 5:
                case 8:
                case 10:
                    objArr[0] = "name";
                    break;
                case 2:
                case 6:
                    objArr[0] = "location";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i10 == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i10 == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i10 != 12) {
                switch (i10) {
                    case 15:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i10) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case 14:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
                switch (i10) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        throw new IllegalArgumentException(str2);
                }
            }
            throw new IllegalStateException(str2);
        }

        @NotNull
        public final LinkedHashSet b(@NotNull Name name, @NotNull Collection collection) {
            if (name == null) {
                a(10);
                throw null;
            }
            if (collection == null) {
                a(11);
                throw null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            OverridingUtil.DEFAULT.generateOverridesInFunctionGroup(name, collection, Collections.emptySet(), this.f80310d, new kotlin.reflect.jvm.internal.impl.descriptors.impl.a(linkedHashSet));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        public Set<Name> getClassifierNames() {
            Set<Name> setEmptySet = Collections.emptySet();
            if (setEmptySet != null) {
                return setEmptySet;
            }
            a(18);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @NotNull
        public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
            if (descriptorKindFilter == null) {
                a(13);
                throw null;
            }
            if (function1 == null) {
                a(14);
                throw null;
            }
            Collection<DeclarationDescriptor> collectionInvoke = this.f80309c.invoke();
            if (collectionInvoke != null) {
                return collectionInvoke;
            }
            a(15);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @NotNull
        public Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            if (name == null) {
                a(5);
                throw null;
            }
            if (lookupLocation == null) {
                a(6);
                throw null;
            }
            Collection<? extends SimpleFunctionDescriptor> collectionInvoke = this.f80307a.invoke(name);
            if (collectionInvoke != null) {
                return collectionInvoke;
            }
            a(7);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        public Collection<? extends PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            if (name == null) {
                a(1);
                throw null;
            }
            if (lookupLocation == null) {
                a(2);
                throw null;
            }
            Collection<? extends PropertyDescriptor> collectionInvoke = this.f80308b.invoke(name);
            if (collectionInvoke != null) {
                return collectionInvoke;
            }
            a(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        public Set<Name> getFunctionNames() {
            Set<Name> setInvoke = this.f80310d.f80305x0.invoke();
            if (setInvoke != null) {
                return setInvoke;
            }
            a(17);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        public Set<Name> getVariableNames() {
            Set<Name> setInvoke = this.f80310d.f80305x0.invoke();
            if (setInvoke != null) {
                return setInvoke;
            }
            a(19);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumEntrySyntheticClassDescriptor(@NotNull StorageManager storageManager, @NotNull ClassDescriptor classDescriptor, @NotNull SimpleType simpleType, @NotNull Name name, @NotNull NotNullLazyValue notNullLazyValue, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        super(storageManager, classDescriptor, name, sourceElement, false);
        if (storageManager == null) {
            a(6);
            throw null;
        }
        if (classDescriptor == null) {
            a(7);
            throw null;
        }
        if (simpleType == null) {
            a(8);
            throw null;
        }
        if (name == null) {
            a(9);
            throw null;
        }
        if (notNullLazyValue == null) {
            a(10);
            throw null;
        }
        if (annotations == null) {
            a(11);
            throw null;
        }
        if (sourceElement == null) {
            a(12);
            throw null;
        }
        this.f80306y0 = annotations;
        this.v0 = new ClassTypeConstructorImpl(this, Collections.emptyList(), Collections.singleton(simpleType), storageManager);
        this.f80304w0 = new a(this, storageManager);
        this.f80305x0 = notNullLazyValue;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @NotNull
    public static EnumEntrySyntheticClassDescriptor create(@NotNull StorageManager storageManager, @NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull NotNullLazyValue<Set<Name>> notNullLazyValue, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        if (storageManager == null) {
            a(0);
            throw null;
        }
        if (classDescriptor == null) {
            a(1);
            throw null;
        }
        if (name == null) {
            a(2);
            throw null;
        }
        if (notNullLazyValue == null) {
            a(3);
            throw null;
        }
        if (annotations == null) {
            a(4);
            throw null;
        }
        if (sourceElement != null) {
            return new EnumEntrySyntheticClassDescriptor(storageManager, classDescriptor, classDescriptor.getDefaultType(), name, notNullLazyValue, annotations, sourceElement);
        }
        a(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        Annotations annotations = this.f80306y0;
        if (annotations != null) {
            return annotations;
        }
        a(21);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: getCompanionObjectDescriptor */
    public ClassDescriptor mo5771getCompanionObjectDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection<ClassConstructorDescriptor> getConstructors() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        a(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        List<TypeParameterDescriptor> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        a(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        ClassKind classKind = ClassKind.ENUM_ENTRY;
        if (classKind != null) {
            return classKind;
        }
        a(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Modality getModality() {
        Modality modality = Modality.FINAL;
        if (modality != null) {
            return modality;
        }
        a(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection<ClassDescriptor> getSealedSubclasses() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        a(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getStaticScope() {
        MemberScope.Empty empty = MemberScope.Empty.INSTANCE;
        if (empty != null) {
            return empty;
        }
        a(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public TypeConstructor getTypeConstructor() {
        ClassTypeConstructorImpl classTypeConstructorImpl = this.v0;
        if (classTypeConstructorImpl != null) {
            return classTypeConstructorImpl;
        }
        a(17);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            a(13);
            throw null;
        }
        a aVar = this.f80304w0;
        if (aVar != null) {
            return aVar;
        }
        a(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
    public ClassConstructorDescriptor mo5772getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.PUBLIC;
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        a(20);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return false;
    }

    public String toString() {
        return "enum entry " + getName();
    }
}
