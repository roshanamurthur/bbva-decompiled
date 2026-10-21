package kotlin.reflect.jvm.internal;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KCallable;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KPackageImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001(B\u0013\u0012\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0013¢\u0006\u0004\b&\u0010'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u001e\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u001e\u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001dR\u0014\u0010%\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "getProperties", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "getFunctions", "", FirebaseAnalytics.Param.INDEX, "getLocalProperty", "", "other", "", "equals", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Ljava/lang/Class;", "r0", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "jClass", "getMethodOwner", "methodOwner", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "members", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "constructorDescriptors", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "<init>", "(Ljava/lang/Class;)V", "a", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nKPackageImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KPackageImpl.kt\nkotlin/reflect/jvm/internal/KPackageImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
public final class KPackageImpl extends KDeclarationContainerImpl {

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Class<?> jClass;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Lazy<a> f79964s0;

    /* JADX INFO: compiled from: KPackageImpl.kt */
    public final class a extends KDeclarationContainerImpl.Data {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ KProperty<Object>[] f79965h = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "members", "getMembers()Ljava/util/Collection;"))};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ReflectProperties.LazySoftVal f79966c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final ReflectProperties.LazySoftVal f79967d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Lazy f79968e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final Lazy f79969f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final ReflectProperties.LazySoftVal f79970g;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KPackageImpl$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: KPackageImpl.kt */
        public static final class C0437a extends Lambda implements Function0<ReflectKotlinClass> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KPackageImpl f79971p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0437a(KPackageImpl kPackageImpl) {
                super(0);
                this.f79971p0 = kPackageImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final ReflectKotlinClass invoke() {
                return ReflectKotlinClass.Factory.create(this.f79971p0.getJClass());
            }
        }

        /* JADX INFO: compiled from: KPackageImpl.kt */
        public static final class b extends Lambda implements Function0<Collection<? extends KCallableImpl<?>>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KPackageImpl f79972p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ a f79973q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, KPackageImpl kPackageImpl) {
                super(0);
                this.f79972p0 = kPackageImpl;
                this.f79973q0 = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Collection<? extends KCallableImpl<?>> invoke() {
                return this.f79972p0.getMembers(this.f79973q0.getScope(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
            }
        }

        /* JADX INFO: compiled from: KPackageImpl.kt */
        public static final class c extends Lambda implements Function0<Triple<? extends JvmNameResolver, ? extends ProtoBuf.Package, ? extends JvmMetadataVersion>> {
            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Triple<? extends JvmNameResolver, ? extends ProtoBuf.Package, ? extends JvmMetadataVersion> invoke() {
                KotlinClassHeader classHeader;
                ReflectKotlinClass reflectKotlinClassAccess$getKotlinClass = a.access$getKotlinClass(a.this);
                if (reflectKotlinClassAccess$getKotlinClass == null || (classHeader = reflectKotlinClassAccess$getKotlinClass.getClassHeader()) == null) {
                    return null;
                }
                String[] data = classHeader.getData();
                String[] strings = classHeader.getStrings();
                if (data == null || strings == null) {
                    return null;
                }
                Pair<JvmNameResolver, ProtoBuf.Package> packageDataFrom = JvmProtoBufUtil.readPackageDataFrom(data, strings);
                return new Triple<>(packageDataFrom.component1(), packageDataFrom.component2(), classHeader.getMetadataVersion());
            }
        }

        /* JADX INFO: compiled from: KPackageImpl.kt */
        public static final class d extends Lambda implements Function0<Class<?>> {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ KPackageImpl f79976q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(KPackageImpl kPackageImpl) {
                super(0);
                this.f79976q0 = kPackageImpl;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Class<?> invoke() {
                KotlinClassHeader classHeader;
                ReflectKotlinClass reflectKotlinClassAccess$getKotlinClass = a.access$getKotlinClass(a.this);
                String multifileClassName = (reflectKotlinClassAccess$getKotlinClass == null || (classHeader = reflectKotlinClassAccess$getKotlinClass.getClassHeader()) == null) ? null : classHeader.getMultifileClassName();
                if (multifileClassName == null || multifileClassName.length() <= 0) {
                    return null;
                }
                return this.f79976q0.getJClass().getClassLoader().loadClass(l.replace$default(multifileClassName, JsonPointer.SEPARATOR, '.', false, 4, (Object) null));
            }
        }

        /* JADX INFO: compiled from: KPackageImpl.kt */
        public static final class e extends Lambda implements Function0<MemberScope> {
            public e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final MemberScope invoke() {
                a aVar = a.this;
                ReflectKotlinClass reflectKotlinClassAccess$getKotlinClass = a.access$getKotlinClass(aVar);
                return reflectKotlinClassAccess$getKotlinClass != null ? aVar.getModuleData().getPackagePartScopeCache().getPackagePartScope(reflectKotlinClassAccess$getKotlinClass) : MemberScope.Empty.INSTANCE;
            }
        }

        public a(KPackageImpl kPackageImpl) {
            super(kPackageImpl);
            this.f79966c = ReflectProperties.lazySoft(new C0437a(kPackageImpl));
            this.f79967d = ReflectProperties.lazySoft(new e());
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            this.f79968e = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new d(kPackageImpl));
            this.f79969f = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new c());
            this.f79970g = ReflectProperties.lazySoft(new b(this, kPackageImpl));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final ReflectKotlinClass access$getKotlinClass(a aVar) {
            aVar.getClass();
            return (ReflectKotlinClass) aVar.f79966c.getValue(aVar, f79965h[0]);
        }

        @NotNull
        public final Collection<KCallableImpl<?>> getMembers() {
            T value = this.f79970g.getValue(this, f79965h[2]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (Collection) value;
        }

        @Nullable
        public final Triple<JvmNameResolver, ProtoBuf.Package, JvmMetadataVersion> getMetadata() {
            return (Triple) this.f79969f.getValue();
        }

        @Nullable
        public final Class<?> getMultifileFacade() {
            return (Class) this.f79968e.getValue();
        }

        @NotNull
        public final MemberScope getScope() {
            T value = this.f79967d.getValue(this, f79965h[1]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (MemberScope) value;
        }
    }

    /* JADX INFO: compiled from: KPackageImpl.kt */
    public static final class b extends Lambda implements Function0<a> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final a invoke() {
            return new a(KPackageImpl.this);
        }
    }

    /* JADX INFO: compiled from: KPackageImpl.kt */
    public /* synthetic */ class c extends FunctionReference implements Function2<MemberDeserializer, ProtoBuf.Property, PropertyDescriptor> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f79979p0 = new c(2);

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        @NotNull
        public final String getName() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(MemberDeserializer.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final PropertyDescriptor invoke(@NotNull MemberDeserializer p4, @NotNull ProtoBuf.Property p10) {
            Intrinsics.checkNotNullParameter(p4, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            return p4.loadProperty(p10);
        }
    }

    public KPackageImpl(@NotNull Class<?> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.jClass = jClass;
        this.f79964s0 = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new b());
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof KPackageImpl) && Intrinsics.areEqual(getJClass(), ((KPackageImpl) other).getJClass());
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection<ConstructorDescriptor> getConstructorDescriptors() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection<FunctionDescriptor> getFunctions(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f79964s0.getValue().getScope().getContributedFunctions(name, NoLookupLocation.FROM_REFLECTION);
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    public Class<?> getJClass() {
        return this.jClass;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Nullable
    public PropertyDescriptor getLocalProperty(int index) {
        Triple<JvmNameResolver, ProtoBuf.Package, JvmMetadataVersion> metadata = this.f79964s0.getValue().getMetadata();
        if (metadata == null) {
            return null;
        }
        JvmNameResolver jvmNameResolverComponent1 = metadata.component1();
        ProtoBuf.Package packageComponent2 = metadata.component2();
        JvmMetadataVersion jvmMetadataVersionComponent3 = metadata.component3();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, List<ProtoBuf.Property>> packageLocalVariable = JvmProtoBuf.packageLocalVariable;
        Intrinsics.checkNotNullExpressionValue(packageLocalVariable, "packageLocalVariable");
        ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.getExtensionOrNull(packageComponent2, packageLocalVariable, index);
        if (property == null) {
            return null;
        }
        Class<?> jClass = getJClass();
        ProtoBuf.TypeTable typeTable = packageComponent2.getTypeTable();
        Intrinsics.checkNotNullExpressionValue(typeTable, "getTypeTable(...)");
        return (PropertyDescriptor) UtilKt.deserializeToDescriptor(jClass, property, jvmNameResolverComponent1, new TypeTable(typeTable), jvmMetadataVersionComponent3, c.f79979p0);
    }

    @Override // kotlin.reflect.KDeclarationContainer
    @NotNull
    public Collection<KCallable<?>> getMembers() {
        return this.f79964s0.getValue().getMembers();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Class<?> getMethodOwner() {
        Class<?> multifileFacade = this.f79964s0.getValue().getMultifileFacade();
        return multifileFacade == null ? getJClass() : multifileFacade;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection<PropertyDescriptor> getProperties(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f79964s0.getValue().getScope().getContributedVariables(name, NoLookupLocation.FROM_REFLECTION);
    }

    public int hashCode() {
        return getJClass().hashCode();
    }

    @NotNull
    public String toString() {
        return "file class " + ReflectClassUtilKt.getClassId(getJClass()).asSingleFqName();
    }
}
