package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import bk.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryPackageSourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyJavaPackageFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class LazyJavaPackageFragment extends PackageFragmentDescriptorImpl {
    public static final /* synthetic */ KProperty<Object>[] I0 = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaPackageFragment.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaPackageFragment.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    @NotNull
    public final JvmPackageScope E0;

    @NotNull
    public final NotNullLazyValue<List<FqName>> F0;

    @NotNull
    public final Annotations G0;

    @NotNull
    public final NotNullLazyValue H0;

    @NotNull
    public final JavaPackage v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final LazyJavaResolverContext f80699w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final JvmMetadataVersion f80700x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue f80701y0;

    /* JADX INFO: compiled from: LazyJavaPackageFragment.kt */
    @SourceDebugExtension({"SMAP\nLazyJavaPackageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaPackageFragment.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageFragment$binaryClasses$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1603#2,9:98\n1855#2:107\n1856#2:110\n1612#2:111\n1#3:108\n1#3:109\n*S KotlinDebug\n*F\n+ 1 LazyJavaPackageFragment.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageFragment$binaryClasses$2\n*L\n47#1:98,9\n47#1:107\n47#1:110\n47#1:111\n47#1:109\n*E\n"})
    public static final class a extends Lambda implements Function0<Map<String, ? extends KotlinJvmBinaryClass>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<String, ? extends KotlinJvmBinaryClass> invoke() {
            LazyJavaPackageFragment lazyJavaPackageFragment = LazyJavaPackageFragment.this;
            PackagePartProvider packagePartProvider = lazyJavaPackageFragment.f80699w0.getComponents().getPackagePartProvider();
            String strAsString = lazyJavaPackageFragment.getFqName().asString();
            Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
            List<String> listFindPackageParts = packagePartProvider.findPackageParts(strAsString);
            ArrayList arrayList = new ArrayList();
            for (String str : listFindPackageParts) {
                ClassId classId = ClassId.topLevel(JvmClassName.byInternalName(str).getFqNameForTopLevelClassMaybeWithDollars());
                Intrinsics.checkNotNullExpressionValue(classId, "topLevel(...)");
                KotlinJvmBinaryClass kotlinJvmBinaryClassFindKotlinClass = KotlinClassFinderKt.findKotlinClass(lazyJavaPackageFragment.f80699w0.getComponents().getKotlinClassFinder(), classId, lazyJavaPackageFragment.f80700x0);
                Pair pair = kotlinJvmBinaryClassFindKotlinClass != null ? TuplesKt.to(str, kotlinJvmBinaryClassFindKotlinClass) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            return q.toMap(arrayList);
        }
    }

    /* JADX INFO: compiled from: LazyJavaPackageFragment.kt */
    @SourceDebugExtension({"SMAP\nLazyJavaPackageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaPackageFragment.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageFragment$subPackages$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n1549#2:98\n1620#2,3:99\n*S KotlinDebug\n*F\n+ 1 LazyJavaPackageFragment.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageFragment$subPackages$1\n*L\n56#1:98\n56#1:99,3\n*E\n"})
    public static final class b extends Lambda implements Function0<List<? extends FqName>> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends FqName> invoke() {
            Collection<JavaPackage> subPackages = LazyJavaPackageFragment.this.v0.getSubPackages();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(subPackages, 10));
            Iterator<T> it = subPackages.iterator();
            while (it.hasNext()) {
                arrayList.add(((JavaPackage) it.next()).getFqName());
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment(@NotNull LazyJavaResolverContext outerContext, @NotNull JavaPackage jPackage) {
        super(outerContext.getModule(), jPackage.getFqName());
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        this.v0 = jPackage;
        LazyJavaResolverContext lazyJavaResolverContextChildForClassOrPackage$default = ContextKt.childForClassOrPackage$default(outerContext, this, null, 0, 6, null);
        this.f80699w0 = lazyJavaResolverContextChildForClassOrPackage$default;
        this.f80700x0 = DeserializationHelpersKt.jvmMetadataVersionOrDefault(outerContext.getComponents().getDeserializedDescriptorResolver().getComponents().getConfiguration());
        this.f80701y0 = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createLazyValue(new a());
        this.E0 = new JvmPackageScope(lazyJavaResolverContextChildForClassOrPackage$default, jPackage, this);
        this.F0 = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createRecursionTolerantLazyValue(new b(), CollectionsKt__CollectionsKt.emptyList());
        this.G0 = lazyJavaResolverContextChildForClassOrPackage$default.getComponents().getJavaTypeEnhancementState().getDisabledDefaultAnnotations() ? Annotations.Companion.getEMPTY() : LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContextChildForClassOrPackage$default, jPackage);
        this.H0 = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createLazyValue(new Function0<HashMap<JvmClassName, JvmClassName>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$partToFacade$2

            /* JADX INFO: compiled from: LazyJavaPackageFragment.kt */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[KotlinClassHeader.Kind.values().length];
                    try {
                        iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HashMap<JvmClassName, JvmClassName> invoke() {
                HashMap<JvmClassName, JvmClassName> map = new HashMap<>();
                for (Map.Entry<String, KotlinJvmBinaryClass> entry : this.f80704p0.getBinaryClasses$descriptors_jvm().entrySet()) {
                    String key = entry.getKey();
                    KotlinJvmBinaryClass value = entry.getValue();
                    JvmClassName jvmClassNameByInternalName = JvmClassName.byInternalName(key);
                    Intrinsics.checkNotNullExpressionValue(jvmClassNameByInternalName, "byInternalName(...)");
                    KotlinClassHeader classHeader = value.getClassHeader();
                    int i10 = WhenMappings.$EnumSwitchMapping$0[classHeader.getKind().ordinal()];
                    if (i10 == 1) {
                        String multifileClassName = classHeader.getMultifileClassName();
                        if (multifileClassName != null) {
                            JvmClassName jvmClassNameByInternalName2 = JvmClassName.byInternalName(multifileClassName);
                            Intrinsics.checkNotNullExpressionValue(jvmClassNameByInternalName2, "byInternalName(...)");
                            map.put(jvmClassNameByInternalName, jvmClassNameByInternalName2);
                        }
                    } else if (i10 == 2) {
                        map.put(jvmClassNameByInternalName, jvmClassNameByInternalName);
                    }
                }
                return map;
            }
        });
    }

    @Nullable
    public final ClassDescriptor findClassifierByJavaClass$descriptors_jvm(@NotNull JavaClass jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        return this.E0.getJavaScope$descriptors_jvm().findClassifierByJavaClass$descriptors_jvm(jClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.G0;
    }

    @NotNull
    public final Map<String, KotlinJvmBinaryClass> getBinaryClasses$descriptors_jvm() {
        return (Map) StorageKt.getValue(this.f80701y0, this, (KProperty<?>) I0[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        return new KotlinJvmBinaryPackageSourceElement(this);
    }

    @NotNull
    public final List<FqName> getSubPackageFqNames$descriptors_jvm() {
        return this.F0.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        return "Lazy Java package fragment: " + getFqName() + " of module " + this.f80699w0.getComponents().getModule();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    @NotNull
    public JvmPackageScope getMemberScope() {
        return this.E0;
    }
}
