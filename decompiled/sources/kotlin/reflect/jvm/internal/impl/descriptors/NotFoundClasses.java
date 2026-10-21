package kotlin.reflect.jvm.internal.impl.descriptors;

import androidx.exifinterface.media.ExifInterface;
import bk.v;
import bk.w;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotFoundClasses.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class NotFoundClasses {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StorageManager f80210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ModuleDescriptor f80211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MemoizedFunctionToNotNull<FqName, PackageFragmentDescriptor> f80212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MemoizedFunctionToNotNull<a, ClassDescriptor> f80213d;

    /* JADX INFO: compiled from: NotFoundClasses.kt */
    @SourceDebugExtension({"SMAP\nNotFoundClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotFoundClasses.kt\norg/jetbrains/kotlin/descriptors/NotFoundClasses$MockClassDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1549#2:101\n1620#2,3:102\n*S KotlinDebug\n*F\n+ 1 NotFoundClasses.kt\norg/jetbrains/kotlin/descriptors/NotFoundClasses$MockClassDescriptor\n*L\n55#1:101\n55#1:102,3\n*E\n"})
    public static final class MockClassDescriptor extends ClassDescriptorBase {
        public final boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        @NotNull
        public final ArrayList f80214w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        @NotNull
        public final ClassTypeConstructorImpl f80215x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MockClassDescriptor(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor container, @NotNull Name name, boolean z10, int i10) {
            super(storageManager, container, name, SourceElement.NO_SOURCE, false);
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(name, "name");
            this.v0 = z10;
            IntRange intRangeUntil = kotlin.ranges.c.until(0, i10);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                arrayList.add(TypeParameterDescriptorImpl.createWithDefaultBound(this, Annotations.Companion.getEMPTY(), false, Variance.INVARIANT, Name.identifier(ExifInterface.GPS_DIRECTION_TRUE + iNextInt), iNextInt, storageManager));
            }
            this.f80214w0 = arrayList;
            this.f80215x0 = new ClassTypeConstructorImpl(this, TypeParameterUtilsKt.computeConstructorTypeParameters(this), v.setOf(DescriptorUtilsKt.getModule(this).getBuiltIns().getAnyType()), storageManager);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
        @NotNull
        public Annotations getAnnotations() {
            return Annotations.Companion.getEMPTY();
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
            return w.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        @NotNull
        public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
            return this.f80214w0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @NotNull
        public ClassKind getKind() {
            return ClassKind.CLASS;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        @NotNull
        public Modality getModality() {
            return Modality.FINAL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @NotNull
        public Collection<ClassDescriptor> getSealedSubclasses() {
            return CollectionsKt__CollectionsKt.emptyList();
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
            DescriptorVisibility PUBLIC = DescriptorVisibilities.PUBLIC;
            Intrinsics.checkNotNullExpressionValue(PUBLIC, "PUBLIC");
            return PUBLIC;
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

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public boolean isExternal() {
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
            return this.v0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public boolean isValue() {
            return false;
        }

        @NotNull
        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @NotNull
        public MemberScope.Empty getStaticScope() {
            return MemberScope.Empty.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
        @NotNull
        public ClassTypeConstructorImpl getTypeConstructor() {
            return this.f80215x0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
        @NotNull
        public MemberScope.Empty getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            return MemberScope.Empty.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NotFoundClasses.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ClassId f80216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<Integer> f80217b;

        public a(@NotNull ClassId classId, @NotNull List<Integer> typeParametersCount) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            Intrinsics.checkNotNullParameter(typeParametersCount, "typeParametersCount");
            this.f80216a = classId;
            this.f80217b = typeParametersCount;
        }

        @NotNull
        public final ClassId component1() {
            return this.f80216a;
        }

        @NotNull
        public final List<Integer> component2() {
            return this.f80217b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f80216a, aVar.f80216a) && Intrinsics.areEqual(this.f80217b, aVar.f80217b);
        }

        public int hashCode() {
            return this.f80217b.hashCode() + (this.f80216a.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ClassRequest(classId=");
            sb2.append(this.f80216a);
            sb2.append(", typeParametersCount=");
            return bc.org.bouncycastle.math.ec.custom.sec.a.c(sb2, this.f80217b, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: NotFoundClasses.kt */
    public static final class b extends Lambda implements Function1<a, ClassDescriptor> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ClassDescriptor invoke(@NotNull a aVar) {
            DeclarationDescriptor declarationDescriptor;
            Intrinsics.checkNotNullParameter(aVar, "<name for destructuring parameter 0>");
            ClassId classIdComponent1 = aVar.component1();
            List<Integer> listComponent2 = aVar.component2();
            if (classIdComponent1.isLocal()) {
                throw new UnsupportedOperationException("Unresolved local class: " + classIdComponent1);
            }
            ClassId outerClassId = classIdComponent1.getOuterClassId();
            NotFoundClasses notFoundClasses = NotFoundClasses.this;
            if (outerClassId == null || (declarationDescriptor = notFoundClasses.getClass(outerClassId, CollectionsKt___CollectionsKt.drop(listComponent2, 1))) == null) {
                MemoizedFunctionToNotNull memoizedFunctionToNotNull = notFoundClasses.f80212c;
                FqName packageFqName = classIdComponent1.getPackageFqName();
                Intrinsics.checkNotNullExpressionValue(packageFqName, "getPackageFqName(...)");
                declarationDescriptor = (ClassOrPackageFragmentDescriptor) memoizedFunctionToNotNull.invoke(packageFqName);
            }
            DeclarationDescriptor declarationDescriptor2 = declarationDescriptor;
            boolean zIsNestedClass = classIdComponent1.isNestedClass();
            StorageManager storageManager = notFoundClasses.f80210a;
            Name shortClassName = classIdComponent1.getShortClassName();
            Intrinsics.checkNotNullExpressionValue(shortClassName, "getShortClassName(...)");
            Integer num = (Integer) CollectionsKt___CollectionsKt.firstOrNull((List) listComponent2);
            return new MockClassDescriptor(storageManager, declarationDescriptor2, shortClassName, zIsNestedClass, num != null ? num.intValue() : 0);
        }
    }

    /* JADX INFO: compiled from: NotFoundClasses.kt */
    public static final class c extends Lambda implements Function1<FqName, PackageFragmentDescriptor> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final PackageFragmentDescriptor invoke(@NotNull FqName fqName) {
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            return new EmptyPackageFragmentDescriptor(NotFoundClasses.this.f80211b, fqName);
        }
    }

    public NotFoundClasses(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.f80210a = storageManager;
        this.f80211b = module;
        this.f80212c = storageManager.createMemoizedFunction(new c());
        this.f80213d = storageManager.createMemoizedFunction(new b());
    }

    @NotNull
    public final ClassDescriptor getClass(@NotNull ClassId classId, @NotNull List<Integer> typeParametersCount) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(typeParametersCount, "typeParametersCount");
        return this.f80213d.invoke(new a(classId, typeParametersCount));
    }
}
