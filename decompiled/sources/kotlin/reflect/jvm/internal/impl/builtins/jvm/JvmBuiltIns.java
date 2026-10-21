package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JvmBuiltIns.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nJvmBuiltIns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmBuiltIns.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
public final class JvmBuiltIns extends KotlinBuiltIns {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f80162h = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JvmBuiltIns.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Function0<Settings> f80163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue f80164g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: JvmBuiltIns.kt */
    public static final class Kind {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;
        public static final Kind FALLBACK;
        public static final Kind FROM_CLASS_LOADER;
        public static final Kind FROM_DEPENDENCIES;

        static {
            Kind kind = new Kind("FROM_DEPENDENCIES", 0);
            FROM_DEPENDENCIES = kind;
            Kind kind2 = new Kind("FROM_CLASS_LOADER", 1);
            FROM_CLASS_LOADER = kind2;
            Kind kind3 = new Kind("FALLBACK", 2);
            FALLBACK = kind3;
            Kind[] kindArr = {kind, kind2, kind3};
            $VALUES = kindArr;
            $ENTRIES = EnumEntriesKt.enumEntries(kindArr);
        }

        public Kind() {
            throw null;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: JvmBuiltIns.kt */
    public static final class Settings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ModuleDescriptor f80165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f80166b;

        public Settings(@NotNull ModuleDescriptor ownerModuleDescriptor, boolean z10) {
            Intrinsics.checkNotNullParameter(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.f80165a = ownerModuleDescriptor;
            this.f80166b = z10;
        }

        @NotNull
        public final ModuleDescriptor getOwnerModuleDescriptor() {
            return this.f80165a;
        }

        public final boolean isAdditionalBuiltInsFeatureSupported() {
            return this.f80166b;
        }
    }

    /* JADX INFO: compiled from: JvmBuiltIns.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Kind.values().length];
            try {
                iArr[Kind.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Kind.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Kind.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: JvmBuiltIns.kt */
    public static final class a extends Lambda implements Function0<JvmBuiltInsCustomizer> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ StorageManager f80168q0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: JvmBuiltIns.kt */
        @SourceDebugExtension({"SMAP\nJvmBuiltIns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmBuiltIns.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$customizer$2$1\n+ 2 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n*L\n1#1,103:1\n19#2:104\n*S KotlinDebug\n*F\n+ 1 JvmBuiltIns.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$customizer$2$1\n*L\n80#1:104\n*E\n"})
        public static final class C0438a extends Lambda implements Function0<Settings> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ JvmBuiltIns f80169p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0438a(JvmBuiltIns jvmBuiltIns) {
                super(0);
                this.f80169p0 = jvmBuiltIns;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Settings invoke() {
                JvmBuiltIns jvmBuiltIns = this.f80169p0;
                Function0 function0 = jvmBuiltIns.f80163f;
                if (function0 == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                Settings settings = (Settings) function0.invoke();
                jvmBuiltIns.f80163f = null;
                return settings;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StorageManager storageManager) {
            super(0);
            this.f80168q0 = storageManager;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final JvmBuiltInsCustomizer invoke() {
            JvmBuiltIns jvmBuiltIns = JvmBuiltIns.this;
            ModuleDescriptorImpl builtInsModule = jvmBuiltIns.getBuiltInsModule();
            Intrinsics.checkNotNullExpressionValue(builtInsModule, "getBuiltInsModule(...)");
            return new JvmBuiltInsCustomizer(builtInsModule, this.f80168q0, new C0438a(jvmBuiltIns));
        }
    }

    /* JADX INFO: compiled from: JvmBuiltIns.kt */
    public static final class b extends Lambda implements Function0<Settings> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ModuleDescriptor f80170p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f80171q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ModuleDescriptor moduleDescriptor, boolean z10) {
            super(0);
            this.f80170p0 = moduleDescriptor;
            this.f80171q0 = z10;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Settings invoke() {
            return new Settings(this.f80170p0, this.f80171q0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(@NotNull StorageManager storageManager, @NotNull Kind kind) {
        super(storageManager);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f80164g = storageManager.createLazyValue(new a(storageManager));
        int i10 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i10 == 2) {
            createBuiltInsModule(false);
        } else {
            if (i10 != 3) {
                return;
            }
            createBuiltInsModule(true);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    public AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return getCustomizer();
    }

    @NotNull
    public final JvmBuiltInsCustomizer getCustomizer() {
        return (JvmBuiltInsCustomizer) StorageKt.getValue(this.f80164g, this, (KProperty<?>) f80162h[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    public PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return getCustomizer();
    }

    public final void initialize(@NotNull ModuleDescriptor moduleDescriptor, boolean z10) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        setPostponedSettingsComputation(new b(moduleDescriptor, z10));
    }

    public final void setPostponedSettingsComputation(@NotNull Function0<Settings> computation) {
        Intrinsics.checkNotNullParameter(computation, "computation");
        this.f80163f = computation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    public List<ClassDescriptorFactory> getClassDescriptorFactories() {
        Iterable<ClassDescriptorFactory> classDescriptorFactories = super.getClassDescriptorFactories();
        Intrinsics.checkNotNullExpressionValue(classDescriptorFactories, "getClassDescriptorFactories(...)");
        StorageManager storageManager = getStorageManager();
        Intrinsics.checkNotNullExpressionValue(storageManager, "getStorageManager(...)");
        ModuleDescriptorImpl builtInsModule = getBuiltInsModule();
        Intrinsics.checkNotNullExpressionValue(builtInsModule, "getBuiltInsModule(...)");
        return CollectionsKt___CollectionsKt.plus(classDescriptorFactories, new JvmBuiltInClassDescriptorFactory(storageManager, builtInsModule, null, 4, null));
    }
}
