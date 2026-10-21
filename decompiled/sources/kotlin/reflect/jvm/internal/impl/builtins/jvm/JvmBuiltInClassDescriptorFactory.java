package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import bk.d;
import bk.v;
import bk.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JvmBuiltInClassDescriptorFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JvmBuiltInClassDescriptorFactory implements ClassDescriptorFactory {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Name f80154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final ClassId f80155g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ModuleDescriptor f80156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<ModuleDescriptor, DeclarationDescriptor> f80157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue f80158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f80152d = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JvmBuiltInClassDescriptorFactory.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final FqName f80153e = StandardNames.BUILT_INS_PACKAGE_FQ_NAME;

    /* JADX INFO: compiled from: JvmBuiltInClassDescriptorFactory.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ClassId getCLONEABLE_CLASS_ID() {
            return JvmBuiltInClassDescriptorFactory.f80155g;
        }
    }

    /* JADX INFO: compiled from: JvmBuiltInClassDescriptorFactory.kt */
    @SourceDebugExtension({"SMAP\nJvmBuiltInClassDescriptorFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmBuiltInClassDescriptorFactory.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInClassDescriptorFactory$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n800#2,11:58\n*S KotlinDebug\n*F\n+ 1 JvmBuiltInClassDescriptorFactory.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInClassDescriptorFactory$1\n*L\n23#1:58,11\n*E\n"})
    public static final class a extends Lambda implements Function1<ModuleDescriptor, BuiltInsPackageFragment> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f80159p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final BuiltInsPackageFragment invoke(@NotNull ModuleDescriptor module) {
            Intrinsics.checkNotNullParameter(module, "module");
            List<PackageFragmentDescriptor> fragments = module.getPackage(JvmBuiltInClassDescriptorFactory.f80153e).getFragments();
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof BuiltInsPackageFragment) {
                    arrayList.add(obj);
                }
            }
            return (BuiltInsPackageFragment) CollectionsKt___CollectionsKt.first((List) arrayList);
        }
    }

    /* JADX INFO: compiled from: JvmBuiltInClassDescriptorFactory.kt */
    public static final class b extends Lambda implements Function0<ClassDescriptorImpl> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ StorageManager f80161q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(StorageManager storageManager) {
            super(0);
            this.f80161q0 = storageManager;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ClassDescriptorImpl invoke() {
            JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory = JvmBuiltInClassDescriptorFactory.this;
            ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl((DeclarationDescriptor) jvmBuiltInClassDescriptorFactory.f80157b.invoke(jvmBuiltInClassDescriptorFactory.f80156a), JvmBuiltInClassDescriptorFactory.f80154f, Modality.ABSTRACT, ClassKind.INTERFACE, d.listOf(jvmBuiltInClassDescriptorFactory.f80156a.getBuiltIns().getAnyType()), SourceElement.NO_SOURCE, false, this.f80161q0);
            classDescriptorImpl.initialize(new CloneableClassScope(this.f80161q0, classDescriptorImpl), w.emptySet(), null);
            return classDescriptorImpl;
        }
    }

    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames.cloneable;
        Name nameShortName = fqNameUnsafe.shortName();
        Intrinsics.checkNotNullExpressionValue(nameShortName, "shortName(...)");
        f80154f = nameShortName;
        ClassId classId = ClassId.topLevel(fqNameUnsafe.toSafe());
        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(...)");
        f80155g = classId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JvmBuiltInClassDescriptorFactory(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull Function1<? super ModuleDescriptor, ? extends DeclarationDescriptor> computeContainingDeclaration) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(computeContainingDeclaration, "computeContainingDeclaration");
        this.f80156a = moduleDescriptor;
        this.f80157b = computeContainingDeclaration;
        this.f80158c = storageManager.createLazyValue(new b(storageManager));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @Nullable
    public ClassDescriptor createClass(@NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        if (!Intrinsics.areEqual(classId, f80155g)) {
            return null;
        }
        return (ClassDescriptorImpl) StorageKt.getValue(this.f80158c, this, (KProperty<?>) f80152d[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @NotNull
    public Collection<ClassDescriptor> getAllContributedClassesIfPossible(@NotNull FqName packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        if (!Intrinsics.areEqual(packageFqName, f80153e)) {
            return w.emptySet();
        }
        return v.setOf((ClassDescriptorImpl) StorageKt.getValue(this.f80158c, this, (KProperty<?>) f80152d[0]));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public boolean shouldCreateClass(@NotNull FqName packageFqName, @NotNull Name name) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.areEqual(name, f80154f) && Intrinsics.areEqual(packageFqName, f80153e);
    }

    public /* synthetic */ JvmBuiltInClassDescriptorFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, (i10 & 4) != 0 ? a.f80159p0 : function1);
    }
}
