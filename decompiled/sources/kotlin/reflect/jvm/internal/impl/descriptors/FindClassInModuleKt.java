package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProviderKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: findClassInModule.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nfindClassInModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 findClassInModule.kt\norg/jetbrains/kotlin/descriptors/FindClassInModuleKt\n*L\n1#1,66:1\n43#1,2:67\n*S KotlinDebug\n*F\n+ 1 findClassInModule.kt\norg/jetbrains/kotlin/descriptors/FindClassInModuleKt\n*L\n23#1:67,2\n*E\n"})
public final class FindClassInModuleKt {

    /* JADX INFO: compiled from: findClassInModule.kt */
    public /* synthetic */ class a extends FunctionReference implements Function1<ClassId, ClassId> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f80202p0 = new a(1);

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        @NotNull
        public final String getName() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ClassId.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final ClassId invoke(@NotNull ClassId p4) {
            Intrinsics.checkNotNullParameter(p4, "p0");
            return p4.getOuterClassId();
        }
    }

    /* JADX INFO: compiled from: findClassInModule.kt */
    public static final class b extends Lambda implements Function1<ClassId, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f80203p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Integer invoke(@NotNull ClassId it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return 0;
        }
    }

    @Nullable
    public static final ClassDescriptor findClassAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (classifierDescriptorFindClassifierAcrossModuleDependencies instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies;
        }
        return null;
    }

    @Nullable
    public static final ClassifierDescriptor findClassifierAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        ClassifierDescriptor classifierDescriptorMo5779getContributedClassifier;
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ModuleDescriptor resolutionAnchorIfAny = ResolutionAnchorProviderKt.getResolutionAnchorIfAny(moduleDescriptor);
        if (resolutionAnchorIfAny == null) {
            FqName packageFqName = classId.getPackageFqName();
            Intrinsics.checkNotNullExpressionValue(packageFqName, "getPackageFqName(...)");
            PackageViewDescriptor packageViewDescriptor = moduleDescriptor.getPackage(packageFqName);
            List<Name> listPathSegments = classId.getRelativeClassName().pathSegments();
            Intrinsics.checkNotNullExpressionValue(listPathSegments, "pathSegments(...)");
            MemberScope memberScope = packageViewDescriptor.getMemberScope();
            Object objFirst = CollectionsKt___CollectionsKt.first((List<? extends Object>) listPathSegments);
            Intrinsics.checkNotNullExpressionValue(objFirst, "first(...)");
            classifierDescriptorMo5779getContributedClassifier = memberScope.mo5779getContributedClassifier((Name) objFirst, NoLookupLocation.FROM_DESERIALIZATION);
            if (classifierDescriptorMo5779getContributedClassifier == null) {
                return null;
            }
            for (Name name : listPathSegments.subList(1, listPathSegments.size())) {
                if (!(classifierDescriptorMo5779getContributedClassifier instanceof ClassDescriptor)) {
                    return null;
                }
                MemberScope unsubstitutedInnerClassesScope = ((ClassDescriptor) classifierDescriptorMo5779getContributedClassifier).getUnsubstitutedInnerClassesScope();
                Intrinsics.checkNotNull(name);
                ClassifierDescriptor classifierDescriptorMo5779getContributedClassifier2 = unsubstitutedInnerClassesScope.mo5779getContributedClassifier(name, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo5779getContributedClassifier = classifierDescriptorMo5779getContributedClassifier2 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo5779getContributedClassifier2 : null;
                if (classifierDescriptorMo5779getContributedClassifier == null) {
                    return null;
                }
            }
        } else {
            FqName packageFqName2 = classId.getPackageFqName();
            Intrinsics.checkNotNullExpressionValue(packageFqName2, "getPackageFqName(...)");
            PackageViewDescriptor packageViewDescriptor2 = resolutionAnchorIfAny.getPackage(packageFqName2);
            List<Name> listPathSegments2 = classId.getRelativeClassName().pathSegments();
            Intrinsics.checkNotNullExpressionValue(listPathSegments2, "pathSegments(...)");
            MemberScope memberScope2 = packageViewDescriptor2.getMemberScope();
            Object objFirst2 = CollectionsKt___CollectionsKt.first((List<? extends Object>) listPathSegments2);
            Intrinsics.checkNotNullExpressionValue(objFirst2, "first(...)");
            ClassifierDescriptor classifierDescriptorMo5779getContributedClassifier3 = memberScope2.mo5779getContributedClassifier((Name) objFirst2, NoLookupLocation.FROM_DESERIALIZATION);
            if (classifierDescriptorMo5779getContributedClassifier3 == null) {
                classifierDescriptorMo5779getContributedClassifier3 = null;
                break;
            }
            for (Name name2 : listPathSegments2.subList(1, listPathSegments2.size())) {
                if (classifierDescriptorMo5779getContributedClassifier3 instanceof ClassDescriptor) {
                    MemberScope unsubstitutedInnerClassesScope2 = ((ClassDescriptor) classifierDescriptorMo5779getContributedClassifier3).getUnsubstitutedInnerClassesScope();
                    Intrinsics.checkNotNull(name2);
                    ClassifierDescriptor classifierDescriptorMo5779getContributedClassifier4 = unsubstitutedInnerClassesScope2.mo5779getContributedClassifier(name2, NoLookupLocation.FROM_DESERIALIZATION);
                    classifierDescriptorMo5779getContributedClassifier3 = classifierDescriptorMo5779getContributedClassifier4 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo5779getContributedClassifier4 : null;
                    if (classifierDescriptorMo5779getContributedClassifier3 != null) {
                    }
                }
                classifierDescriptorMo5779getContributedClassifier3 = null;
            }
            if (classifierDescriptorMo5779getContributedClassifier3 != null) {
                return classifierDescriptorMo5779getContributedClassifier3;
            }
            FqName packageFqName3 = classId.getPackageFqName();
            Intrinsics.checkNotNullExpressionValue(packageFqName3, "getPackageFqName(...)");
            PackageViewDescriptor packageViewDescriptor3 = moduleDescriptor.getPackage(packageFqName3);
            List<Name> listPathSegments3 = classId.getRelativeClassName().pathSegments();
            Intrinsics.checkNotNullExpressionValue(listPathSegments3, "pathSegments(...)");
            MemberScope memberScope3 = packageViewDescriptor3.getMemberScope();
            Object objFirst3 = CollectionsKt___CollectionsKt.first((List<? extends Object>) listPathSegments3);
            Intrinsics.checkNotNullExpressionValue(objFirst3, "first(...)");
            classifierDescriptorMo5779getContributedClassifier = memberScope3.mo5779getContributedClassifier((Name) objFirst3, NoLookupLocation.FROM_DESERIALIZATION);
            if (classifierDescriptorMo5779getContributedClassifier == null) {
                return null;
            }
            for (Name name3 : listPathSegments3.subList(1, listPathSegments3.size())) {
                if (!(classifierDescriptorMo5779getContributedClassifier instanceof ClassDescriptor)) {
                    return null;
                }
                MemberScope unsubstitutedInnerClassesScope3 = ((ClassDescriptor) classifierDescriptorMo5779getContributedClassifier).getUnsubstitutedInnerClassesScope();
                Intrinsics.checkNotNull(name3);
                ClassifierDescriptor classifierDescriptorMo5779getContributedClassifier5 = unsubstitutedInnerClassesScope3.mo5779getContributedClassifier(name3, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo5779getContributedClassifier = classifierDescriptorMo5779getContributedClassifier5 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo5779getContributedClassifier5 : null;
                if (classifierDescriptorMo5779getContributedClassifier == null) {
                    return null;
                }
            }
        }
        return classifierDescriptorMo5779getContributedClassifier;
    }

    @NotNull
    public static final ClassDescriptor findNonGenericClassAcrossDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId, @NotNull NotFoundClasses notFoundClasses) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = findClassAcrossModuleDependencies(moduleDescriptor, classId);
        return classDescriptorFindClassAcrossModuleDependencies != null ? classDescriptorFindClassAcrossModuleDependencies : notFoundClasses.getClass(classId, SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(SequencesKt__SequencesKt.generateSequence(classId, a.f80202p0), b.f80203p0)));
    }

    @Nullable
    public static final TypeAliasDescriptor findTypeAliasAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (classifierDescriptorFindClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor) {
            return (TypeAliasDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies;
        }
        return null;
    }
}
