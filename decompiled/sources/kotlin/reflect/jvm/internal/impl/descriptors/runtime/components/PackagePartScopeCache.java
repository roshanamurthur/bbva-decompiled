package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import bk.d;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PackagePartScopeCache.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nPackagePartScopeCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PackagePartScopeCache.kt\norg/jetbrains/kotlin/descriptors/runtime/components/PackagePartScopeCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n72#2,2:43\n1603#3,9:45\n1855#3:54\n1856#3:56\n1612#3:57\n1603#3,9:58\n1855#3:67\n1856#3:69\n1612#3:70\n1#4:55\n1#4:68\n1#4:71\n*S KotlinDebug\n*F\n+ 1 PackagePartScopeCache.kt\norg/jetbrains/kotlin/descriptors/runtime/components/PackagePartScopeCache\n*L\n22#1:43,2\n27#1:45,9\n27#1:54\n27#1:56\n27#1:57\n35#1:58,9\n35#1:67\n35#1:69\n35#1:70\n27#1:55\n35#1:68\n22#1:71\n*E\n"})
public final class PackagePartScopeCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DeserializedDescriptorResolver f80403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ReflectKotlinClassFinder f80404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<ClassId, MemberScope> f80405c;

    public PackagePartScopeCache(@NotNull DeserializedDescriptorResolver resolver, @NotNull ReflectKotlinClassFinder kotlinClassFinder) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f80403a = resolver;
        this.f80404b = kotlinClassFinder;
        this.f80405c = new ConcurrentHashMap<>();
    }

    @NotNull
    public final MemberScope getPackagePartScope(@NotNull ReflectKotlinClass fileClass) {
        Collection collectionListOf;
        Intrinsics.checkNotNullParameter(fileClass, "fileClass");
        ConcurrentHashMap<ClassId, MemberScope> concurrentHashMap = this.f80405c;
        ClassId classId = fileClass.getClassId();
        MemberScope memberScope = concurrentHashMap.get(classId);
        if (memberScope == null) {
            FqName packageFqName = fileClass.getClassId().getPackageFqName();
            Intrinsics.checkNotNullExpressionValue(packageFqName, "getPackageFqName(...)");
            KotlinClassHeader.Kind kind = fileClass.getClassHeader().getKind();
            KotlinClassHeader.Kind kind2 = KotlinClassHeader.Kind.MULTIFILE_CLASS;
            DeserializedDescriptorResolver deserializedDescriptorResolver = this.f80403a;
            if (kind == kind2) {
                List<String> multifilePartNames = fileClass.getClassHeader().getMultifilePartNames();
                collectionListOf = new ArrayList();
                Iterator<T> it = multifilePartNames.iterator();
                while (it.hasNext()) {
                    ClassId classId2 = ClassId.topLevel(JvmClassName.byInternalName((String) it.next()).getFqNameForTopLevelClassMaybeWithDollars());
                    Intrinsics.checkNotNullExpressionValue(classId2, "topLevel(...)");
                    KotlinJvmBinaryClass kotlinJvmBinaryClassFindKotlinClass = KotlinClassFinderKt.findKotlinClass(this.f80404b, classId2, DeserializationHelpersKt.jvmMetadataVersionOrDefault(deserializedDescriptorResolver.getComponents().getConfiguration()));
                    if (kotlinJvmBinaryClassFindKotlinClass != null) {
                        collectionListOf.add(kotlinJvmBinaryClassFindKotlinClass);
                    }
                }
            } else {
                collectionListOf = d.listOf(fileClass);
            }
            EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(deserializedDescriptorResolver.getComponents().getModuleDescriptor(), packageFqName);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = collectionListOf.iterator();
            while (it2.hasNext()) {
                MemberScope memberScopeCreateKotlinPackagePartScope = deserializedDescriptorResolver.createKotlinPackagePartScope(emptyPackageFragmentDescriptor, (KotlinJvmBinaryClass) it2.next());
                if (memberScopeCreateKotlinPackagePartScope != null) {
                    arrayList.add(memberScopeCreateKotlinPackagePartScope);
                }
            }
            List list = CollectionsKt___CollectionsKt.toList(arrayList);
            MemberScope memberScopeCreate = ChainedMemberScope.Companion.create("package " + packageFqName + " (" + fileClass + RootService.CLOSE_BRACKET, list);
            MemberScope memberScopePutIfAbsent = concurrentHashMap.putIfAbsent(classId, memberScopeCreate);
            memberScope = memberScopePutIfAbsent == null ? memberScopeCreate : memberScopePutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(memberScope, "getOrPut(...)");
        return memberScope;
    }
}
