package kotlin.reflect.jvm.internal.impl.renderer;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.camera2.internal.h0;
import bk.d;
import bk.x;
import cl.c;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.mail.Part;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbbreviatedType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.WrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.Typography;
import kotlin.text.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DescriptorRendererImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nDescriptorRendererImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorRendererImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1207:1\n2624#2,3:1208\n766#2:1211\n857#2,2:1212\n1549#2:1214\n1620#2,3:1215\n766#2:1218\n857#2,2:1219\n1549#2:1221\n1620#2,3:1222\n1549#2:1225\n1620#2,3:1226\n1603#2,9:1230\n1855#2:1239\n1856#2:1241\n1612#2:1242\n2624#2,3:1243\n2624#2,3:1246\n766#2:1249\n857#2,2:1250\n1620#2,3:1252\n1#3:1229\n1#3:1240\n*S KotlinDebug\n*F\n+ 1 DescriptorRendererImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererImpl\n*L\n183#1:1208,3\n483#1:1211\n483#1:1212,2\n484#1:1214\n484#1:1215,3\n486#1:1218\n486#1:1219,2\n486#1:1221\n486#1:1222,3\n488#1:1225\n488#1:1226,3\n497#1:1230,9\n497#1:1239\n497#1:1241\n497#1:1242\n588#1:1243,3\n590#1:1246,3\n806#1:1249\n806#1:1250,2\n829#1:1252,3\n497#1:1240\n*E\n"})
public final class DescriptorRendererImpl extends DescriptorRenderer implements DescriptorRendererOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DescriptorRendererOptionsImpl f81470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f81471b;

    /* JADX INFO: compiled from: DescriptorRendererImpl.kt */
    public final class RenderDeclarationDescriptorVisitor implements DeclarationDescriptorVisitor<Unit, StringBuilder> {

        /* JADX INFO: compiled from: DescriptorRendererImpl.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
                try {
                    iArr[PropertyAccessorRenderingPolicy.PRETTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public RenderDeclarationDescriptorVisitor() {
        }

        public final void a(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb2, String str) throws IOException {
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            int i10 = WhenMappings.$EnumSwitchMapping$0[descriptorRendererImpl.getPropertyAccessorRenderingPolicy().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                visitFunctionDescriptor2((FunctionDescriptor) propertyAccessorDescriptor, sb2);
            } else {
                descriptorRendererImpl.m(propertyAccessorDescriptor, sb2);
                sb2.append(str.concat(" for "));
                PropertyDescriptor correspondingProperty = propertyAccessorDescriptor.getCorrespondingProperty();
                Intrinsics.checkNotNullExpressionValue(correspondingProperty, "getCorrespondingProperty(...)");
                DescriptorRendererImpl.access$renderProperty(descriptorRendererImpl, correspondingProperty, sb2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitClassDescriptor(ClassDescriptor classDescriptor, StringBuilder sb2) throws IOException {
            visitClassDescriptor2(classDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, StringBuilder sb2) throws IOException {
            visitConstructorDescriptor2(constructorDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitFunctionDescriptor(FunctionDescriptor functionDescriptor, StringBuilder sb2) throws IOException {
            visitFunctionDescriptor2(functionDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitModuleDeclaration(ModuleDescriptor moduleDescriptor, StringBuilder sb2) {
            visitModuleDeclaration2(moduleDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPackageFragmentDescriptor(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb2) {
            visitPackageFragmentDescriptor2(packageFragmentDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPackageViewDescriptor(PackageViewDescriptor packageViewDescriptor, StringBuilder sb2) {
            visitPackageViewDescriptor2(packageViewDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPropertyDescriptor(PropertyDescriptor propertyDescriptor, StringBuilder sb2) throws IOException {
            visitPropertyDescriptor2(propertyDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPropertyGetterDescriptor(PropertyGetterDescriptor propertyGetterDescriptor, StringBuilder sb2) throws IOException {
            visitPropertyGetterDescriptor2(propertyGetterDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPropertySetterDescriptor(PropertySetterDescriptor propertySetterDescriptor, StringBuilder sb2) throws IOException {
            visitPropertySetterDescriptor2(propertySetterDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitReceiverParameterDescriptor(ReceiverParameterDescriptor receiverParameterDescriptor, StringBuilder sb2) {
            visitReceiverParameterDescriptor2(receiverParameterDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitTypeAliasDescriptor(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb2) {
            visitTypeAliasDescriptor2(typeAliasDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb2) {
            visitTypeParameterDescriptor2(typeParameterDescriptor, sb2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitValueParameterDescriptor(ValueParameterDescriptor valueParameterDescriptor, StringBuilder sb2) {
            visitValueParameterDescriptor2(valueParameterDescriptor, sb2);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: visitClassDescriptor, reason: avoid collision after fix types in other method */
        public void visitClassDescriptor2(@NotNull ClassDescriptor descriptor, @NotNull StringBuilder builder) throws IOException {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.access$renderClass(DescriptorRendererImpl.this, descriptor, builder);
        }

        /* JADX INFO: renamed from: visitConstructorDescriptor, reason: avoid collision after fix types in other method */
        public void visitConstructorDescriptor2(@NotNull ConstructorDescriptor constructorDescriptor, @NotNull StringBuilder builder) throws IOException {
            Intrinsics.checkNotNullParameter(constructorDescriptor, "constructorDescriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.access$renderConstructor(DescriptorRendererImpl.this, constructorDescriptor, builder);
        }

        /* JADX INFO: renamed from: visitFunctionDescriptor, reason: avoid collision after fix types in other method */
        public void visitFunctionDescriptor2(@NotNull FunctionDescriptor descriptor, @NotNull StringBuilder builder) throws IOException {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.access$renderFunction(DescriptorRendererImpl.this, descriptor, builder);
        }

        /* JADX INFO: renamed from: visitModuleDeclaration, reason: avoid collision after fix types in other method */
        public void visitModuleDeclaration2(@NotNull ModuleDescriptor descriptor, @NotNull StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.p(descriptor, builder, true);
        }

        /* JADX INFO: renamed from: visitPackageFragmentDescriptor, reason: avoid collision after fix types in other method */
        public void visitPackageFragmentDescriptor2(@NotNull PackageFragmentDescriptor descriptor, @NotNull StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.access$renderPackageFragment(DescriptorRendererImpl.this, descriptor, builder);
        }

        /* JADX INFO: renamed from: visitPackageViewDescriptor, reason: avoid collision after fix types in other method */
        public void visitPackageViewDescriptor2(@NotNull PackageViewDescriptor descriptor, @NotNull StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.access$renderPackageView(DescriptorRendererImpl.this, descriptor, builder);
        }

        /* JADX INFO: renamed from: visitPropertyDescriptor, reason: avoid collision after fix types in other method */
        public void visitPropertyDescriptor2(@NotNull PropertyDescriptor descriptor, @NotNull StringBuilder builder) throws IOException {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.access$renderProperty(DescriptorRendererImpl.this, descriptor, builder);
        }

        /* JADX INFO: renamed from: visitPropertyGetterDescriptor, reason: avoid collision after fix types in other method */
        public void visitPropertyGetterDescriptor2(@NotNull PropertyGetterDescriptor descriptor, @NotNull StringBuilder builder) throws IOException {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            a(descriptor, builder, "getter");
        }

        /* JADX INFO: renamed from: visitPropertySetterDescriptor, reason: avoid collision after fix types in other method */
        public void visitPropertySetterDescriptor2(@NotNull PropertySetterDescriptor descriptor, @NotNull StringBuilder builder) throws IOException {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            a(descriptor, builder, "setter");
        }

        /* JADX INFO: renamed from: visitReceiverParameterDescriptor, reason: avoid collision after fix types in other method */
        public void visitReceiverParameterDescriptor2(@NotNull ReceiverParameterDescriptor descriptor, @NotNull StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            builder.append(descriptor.getName());
        }

        /* JADX INFO: renamed from: visitTypeAliasDescriptor, reason: avoid collision after fix types in other method */
        public void visitTypeAliasDescriptor2(@NotNull TypeAliasDescriptor descriptor, @NotNull StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.access$renderTypeAlias(DescriptorRendererImpl.this, descriptor, builder);
        }

        /* JADX INFO: renamed from: visitTypeParameterDescriptor, reason: avoid collision after fix types in other method */
        public void visitTypeParameterDescriptor2(@NotNull TypeParameterDescriptor descriptor, @NotNull StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.y(descriptor, builder, true);
        }

        /* JADX INFO: renamed from: visitValueParameterDescriptor, reason: avoid collision after fix types in other method */
        public void visitValueParameterDescriptor2(@NotNull ValueParameterDescriptor descriptor, @NotNull StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.C(descriptor, true, builder, true);
        }
    }

    /* JADX INFO: compiled from: DescriptorRendererImpl.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RenderingFormat.values().length];
            try {
                iArr[RenderingFormat.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenderingFormat.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
            try {
                iArr2[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: compiled from: DescriptorRendererImpl.kt */
    public static final class a extends Lambda implements Function0<DescriptorRendererImpl> {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DescriptorRendererImpl.kt */
        public static final class C0446a extends Lambda implements Function1<DescriptorRendererOptions, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final C0446a f81474p0 = new C0446a(1);

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
                invoke2(descriptorRendererOptions);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DescriptorRendererOptions withOptions) {
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.setExcludedTypeAnnotationClasses(x.plus((Set) withOptions.getExcludedTypeAnnotationClasses(), (Iterable) CollectionsKt__CollectionsKt.listOf((Object[]) new FqName[]{StandardNames.FqNames.extensionFunctionType, StandardNames.FqNames.contextFunctionTypeParams})));
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final DescriptorRendererImpl invoke() {
            DescriptorRenderer descriptorRendererWithOptions = DescriptorRendererImpl.this.withOptions(C0446a.f81474p0);
            Intrinsics.checkNotNull(descriptorRendererWithOptions, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
            return (DescriptorRendererImpl) descriptorRendererWithOptions;
        }
    }

    /* JADX INFO: compiled from: DescriptorRendererImpl.kt */
    public static final class b extends Lambda implements Function1<KotlinType, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f81475p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Object invoke(@NotNull KotlinType it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it instanceof StubTypeForBuilderInference ? ((StubTypeForBuilderInference) it).getOriginalTypeVariable() : it;
        }
    }

    public DescriptorRendererImpl(@NotNull DescriptorRendererOptionsImpl options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f81470a = options;
        options.isLocked();
        this.f81471b = LazyKt__LazyJVMKt.lazy(new a());
    }

    public static boolean G(KotlinType kotlinType) {
        if (FunctionTypesKt.isBuiltinFunctionalType(kotlinType)) {
            List<TypeProjection> arguments = kotlinType.getArguments();
            if (!(arguments instanceof Collection) || !arguments.isEmpty()) {
                Iterator<T> it = arguments.iterator();
                while (it.hasNext()) {
                    if (((TypeProjection) it.next()).isStarProjection()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final void access$renderClass(DescriptorRendererImpl descriptorRendererImpl, ClassDescriptor classDescriptor, StringBuilder sb2) throws IOException {
        ClassConstructorDescriptor classConstructorDescriptorMo5772getUnsubstitutedPrimaryConstructor;
        descriptorRendererImpl.getClass();
        boolean z10 = classDescriptor.getKind() == ClassKind.ENUM_ENTRY;
        if (!descriptorRendererImpl.getStartFromName()) {
            descriptorRendererImpl.d(sb2, classDescriptor, null);
            List<ReceiverParameterDescriptor> contextReceivers = classDescriptor.getContextReceivers();
            Intrinsics.checkNotNullExpressionValue(contextReceivers, "getContextReceivers(...)");
            descriptorRendererImpl.g(sb2, contextReceivers);
            if (!z10) {
                DescriptorVisibility visibility = classDescriptor.getVisibility();
                Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
                descriptorRendererImpl.E(visibility, sb2);
            }
            if ((classDescriptor.getKind() != ClassKind.INTERFACE || classDescriptor.getModality() != Modality.ABSTRACT) && (!classDescriptor.getKind().isSingleton() || classDescriptor.getModality() != Modality.FINAL)) {
                Modality modality = classDescriptor.getModality();
                Intrinsics.checkNotNullExpressionValue(modality, "getModality(...)");
                Modality modalityB = b(classDescriptor);
                if (descriptorRendererImpl.getRenderDefaultModality() || modality != modalityB) {
                    descriptorRendererImpl.o(sb2, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.MODALITY), CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(modality.name()));
                }
            }
            descriptorRendererImpl.m(classDescriptor, sb2);
            descriptorRendererImpl.o(sb2, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.INNER) && classDescriptor.isInner(), "inner");
            descriptorRendererImpl.o(sb2, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.DATA) && classDescriptor.isData(), "data");
            descriptorRendererImpl.o(sb2, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.INLINE) && classDescriptor.isInline(), Part.INLINE);
            descriptorRendererImpl.o(sb2, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.VALUE) && classDescriptor.isValue(), "value");
            descriptorRendererImpl.o(sb2, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.FUN) && classDescriptor.isFun(), "fun");
            sb2.append(descriptorRendererImpl.k(DescriptorRenderer.Companion.getClassifierKindPrefix(classDescriptor)));
        }
        if (DescriptorUtils.isCompanionObject(classDescriptor)) {
            if (descriptorRendererImpl.getRenderCompanionObjectName()) {
                if (descriptorRendererImpl.getStartFromName()) {
                    sb2.append("companion object");
                }
                x(sb2);
                DeclarationDescriptor containingDeclaration = classDescriptor.getContainingDeclaration();
                if (containingDeclaration != null) {
                    sb2.append("of ");
                    Name name = containingDeclaration.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    sb2.append(descriptorRendererImpl.renderName(name, false));
                }
            }
            if (descriptorRendererImpl.getVerbose() || !Intrinsics.areEqual(classDescriptor.getName(), SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT)) {
                if (!descriptorRendererImpl.getStartFromName()) {
                    x(sb2);
                }
                Name name2 = classDescriptor.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                sb2.append(descriptorRendererImpl.renderName(name2, true));
            }
        } else {
            if (!descriptorRendererImpl.getStartFromName()) {
                x(sb2);
            }
            descriptorRendererImpl.p(classDescriptor, sb2, true);
        }
        if (z10) {
            return;
        }
        List<TypeParameterDescriptor> declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "getDeclaredTypeParameters(...)");
        descriptorRendererImpl.A(declaredTypeParameters, sb2, false);
        descriptorRendererImpl.e(classDescriptor, sb2);
        if (!classDescriptor.getKind().isSingleton() && descriptorRendererImpl.getClassWithPrimaryConstructor() && (classConstructorDescriptorMo5772getUnsubstitutedPrimaryConstructor = classDescriptor.mo5772getUnsubstitutedPrimaryConstructor()) != null) {
            sb2.append(" ");
            descriptorRendererImpl.d(sb2, classConstructorDescriptorMo5772getUnsubstitutedPrimaryConstructor, null);
            DescriptorVisibility visibility2 = classConstructorDescriptorMo5772getUnsubstitutedPrimaryConstructor.getVisibility();
            Intrinsics.checkNotNullExpressionValue(visibility2, "getVisibility(...)");
            descriptorRendererImpl.E(visibility2, sb2);
            sb2.append(descriptorRendererImpl.k("constructor"));
            List<ValueParameterDescriptor> valueParameters = classConstructorDescriptorMo5772getUnsubstitutedPrimaryConstructor.getValueParameters();
            Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
            descriptorRendererImpl.D(valueParameters, classConstructorDescriptorMo5772getUnsubstitutedPrimaryConstructor.hasSynthesizedParameterNames(), sb2);
        }
        if (!descriptorRendererImpl.getWithoutSuperTypes() && !KotlinBuiltIns.isNothing(classDescriptor.getDefaultType())) {
            Collection<KotlinType> supertypes = classDescriptor.getTypeConstructor().getSupertypes();
            Intrinsics.checkNotNullExpressionValue(supertypes, "getSupertypes(...)");
            if (!supertypes.isEmpty() && (supertypes.size() != 1 || !KotlinBuiltIns.isAnyOrNullableAny(supertypes.iterator().next()))) {
                x(sb2);
                sb2.append(": ");
                CollectionsKt___CollectionsKt.joinTo(supertypes, sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : new c(descriptorRendererImpl));
            }
        }
        descriptorRendererImpl.F(sb2, declaredTypeParameters);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    public static final void access$renderConstructor(DescriptorRendererImpl descriptorRendererImpl, ConstructorDescriptor constructorDescriptor, StringBuilder sb2) throws IOException {
        boolean z10;
        ClassConstructorDescriptor classConstructorDescriptorMo5772getUnsubstitutedPrimaryConstructor;
        descriptorRendererImpl.getClass();
        descriptorRendererImpl.d(sb2, constructorDescriptor, null);
        if (descriptorRendererImpl.f81470a.getRenderDefaultVisibility() || constructorDescriptor.getConstructedClass().getModality() != Modality.SEALED) {
            DescriptorVisibility visibility = constructorDescriptor.getVisibility();
            Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
            if (descriptorRendererImpl.E(visibility, sb2)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        descriptorRendererImpl.l(constructorDescriptor, sb2);
        boolean z11 = descriptorRendererImpl.getRenderConstructorKeyword() || !constructorDescriptor.isPrimary() || z10;
        if (z11) {
            sb2.append(descriptorRendererImpl.k("constructor"));
        }
        ClassifierDescriptorWithTypeParameters containingDeclaration = constructorDescriptor.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
        if (descriptorRendererImpl.getSecondaryConstructorsAsPrimary()) {
            if (z11) {
                sb2.append(" ");
            }
            descriptorRendererImpl.p(containingDeclaration, sb2, true);
            List<TypeParameterDescriptor> typeParameters = constructorDescriptor.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            descriptorRendererImpl.A(typeParameters, sb2, false);
        }
        List<ValueParameterDescriptor> valueParameters = constructorDescriptor.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        descriptorRendererImpl.D(valueParameters, constructorDescriptor.hasSynthesizedParameterNames(), sb2);
        if (descriptorRendererImpl.getRenderConstructorDelegation() && !constructorDescriptor.isPrimary() && (containingDeclaration instanceof ClassDescriptor) && (classConstructorDescriptorMo5772getUnsubstitutedPrimaryConstructor = ((ClassDescriptor) containingDeclaration).mo5772getUnsubstitutedPrimaryConstructor()) != null) {
            List<ValueParameterDescriptor> valueParameters2 = classConstructorDescriptorMo5772getUnsubstitutedPrimaryConstructor.getValueParameters();
            Intrinsics.checkNotNullExpressionValue(valueParameters2, "getValueParameters(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : valueParameters2) {
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) obj;
                if (!valueParameterDescriptor.declaresDefaultValue() && valueParameterDescriptor.getVarargElementType() == null) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                sb2.append(" : ");
                sb2.append(descriptorRendererImpl.k("this"));
                sb2.append(CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", "(", ")", 0, null, cl.b.f25451p0, 24, null));
            }
        }
        if (descriptorRendererImpl.getSecondaryConstructorsAsPrimary()) {
            List<TypeParameterDescriptor> typeParameters2 = constructorDescriptor.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters2, "getTypeParameters(...)");
            descriptorRendererImpl.F(sb2, typeParameters2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    public static final void access$renderFunction(DescriptorRendererImpl descriptorRendererImpl, FunctionDescriptor functionDescriptor, StringBuilder sb2) throws IOException {
        boolean z10;
        if (!descriptorRendererImpl.getStartFromName()) {
            if (!descriptorRendererImpl.getStartFromDeclarationKeyword()) {
                descriptorRendererImpl.d(sb2, functionDescriptor, null);
                List<ReceiverParameterDescriptor> contextReceiverParameters = functionDescriptor.getContextReceiverParameters();
                Intrinsics.checkNotNullExpressionValue(contextReceiverParameters, "getContextReceiverParameters(...)");
                descriptorRendererImpl.g(sb2, contextReceiverParameters);
                DescriptorVisibility visibility = functionDescriptor.getVisibility();
                Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
                descriptorRendererImpl.E(visibility, sb2);
                descriptorRendererImpl.n(functionDescriptor, sb2);
                if (descriptorRendererImpl.getIncludeAdditionalModifiers()) {
                    descriptorRendererImpl.m(functionDescriptor, sb2);
                }
                descriptorRendererImpl.s(functionDescriptor, sb2);
                if (descriptorRendererImpl.getIncludeAdditionalModifiers()) {
                    boolean z11 = false;
                    if (functionDescriptor.isOperator()) {
                        Collection<? extends FunctionDescriptor> overriddenDescriptors = functionDescriptor.getOverriddenDescriptors();
                        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
                        Collection<? extends FunctionDescriptor> collection = overriddenDescriptors;
                        if (!collection.isEmpty()) {
                            Iterator<T> it = collection.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((FunctionDescriptor) it.next()).isOperator()) {
                                        if (!descriptorRendererImpl.getAlwaysRenderModifiers()) {
                                            z10 = false;
                                        }
                                    }
                                }
                            }
                        }
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (functionDescriptor.isInfix()) {
                        Collection<? extends FunctionDescriptor> overriddenDescriptors2 = functionDescriptor.getOverriddenDescriptors();
                        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors2, "getOverriddenDescriptors(...)");
                        Collection<? extends FunctionDescriptor> collection2 = overriddenDescriptors2;
                        if (!collection2.isEmpty()) {
                            Iterator<T> it2 = collection2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((FunctionDescriptor) it2.next()).isInfix()) {
                                        if (!descriptorRendererImpl.getAlwaysRenderModifiers()) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                z11 = true;
                                break;
                            }
                        }
                        z11 = true;
                        break;
                    }
                    descriptorRendererImpl.o(sb2, functionDescriptor.isTailrec(), "tailrec");
                    descriptorRendererImpl.o(sb2, functionDescriptor.isSuspend(), "suspend");
                    descriptorRendererImpl.o(sb2, functionDescriptor.isInline(), Part.INLINE);
                    descriptorRendererImpl.o(sb2, z11, "infix");
                    descriptorRendererImpl.o(sb2, z10, "operator");
                } else {
                    descriptorRendererImpl.o(sb2, functionDescriptor.isSuspend(), "suspend");
                }
                descriptorRendererImpl.l(functionDescriptor, sb2);
                if (descriptorRendererImpl.getVerbose()) {
                    if (functionDescriptor.isHiddenToOvercomeSignatureClash()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (functionDescriptor.isHiddenForResolutionEverywhereBesideSupercalls()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(descriptorRendererImpl.k("fun"));
            sb2.append(" ");
            List<TypeParameterDescriptor> typeParameters = functionDescriptor.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            descriptorRendererImpl.A(typeParameters, sb2, true);
            descriptorRendererImpl.v(sb2, functionDescriptor);
        }
        descriptorRendererImpl.p(functionDescriptor, sb2, true);
        List<ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        descriptorRendererImpl.D(valueParameters, functionDescriptor.hasSynthesizedParameterNames(), sb2);
        descriptorRendererImpl.w(sb2, functionDescriptor);
        KotlinType returnType = functionDescriptor.getReturnType();
        if (!descriptorRendererImpl.getWithoutReturnType() && (descriptorRendererImpl.getUnitReturnType() || returnType == null || !KotlinBuiltIns.isUnit(returnType))) {
            sb2.append(": ");
            sb2.append(returnType == null ? "[NULL]" : descriptorRendererImpl.renderType(returnType));
        }
        List<TypeParameterDescriptor> typeParameters2 = functionDescriptor.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters2, "getTypeParameters(...)");
        descriptorRendererImpl.F(sb2, typeParameters2);
    }

    public static final void access$renderPackageFragment(DescriptorRendererImpl descriptorRendererImpl, PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb2) {
        descriptorRendererImpl.getClass();
        descriptorRendererImpl.t(packageFragmentDescriptor.getFqName(), "package-fragment", sb2);
        if (descriptorRendererImpl.getDebugMode()) {
            sb2.append(" in ");
            descriptorRendererImpl.p(packageFragmentDescriptor.getContainingDeclaration(), sb2, false);
        }
    }

    public static final void access$renderPackageView(DescriptorRendererImpl descriptorRendererImpl, PackageViewDescriptor packageViewDescriptor, StringBuilder sb2) {
        descriptorRendererImpl.getClass();
        descriptorRendererImpl.t(packageViewDescriptor.getFqName(), "package", sb2);
        if (descriptorRendererImpl.getDebugMode()) {
            sb2.append(" in context of ");
            descriptorRendererImpl.p(packageViewDescriptor.getModule(), sb2, false);
        }
    }

    public static final void access$renderProperty(DescriptorRendererImpl descriptorRendererImpl, PropertyDescriptor propertyDescriptor, StringBuilder sb2) throws IOException {
        ConstantValue<?> constantValueMo5774getCompileTimeInitializer;
        String strF;
        if (!descriptorRendererImpl.getStartFromName()) {
            if (!descriptorRendererImpl.getStartFromDeclarationKeyword()) {
                if (descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
                    descriptorRendererImpl.d(sb2, propertyDescriptor, null);
                    FieldDescriptor backingField = propertyDescriptor.getBackingField();
                    if (backingField != null) {
                        descriptorRendererImpl.d(sb2, backingField, AnnotationUseSiteTarget.FIELD);
                    }
                    FieldDescriptor delegateField = propertyDescriptor.getDelegateField();
                    if (delegateField != null) {
                        descriptorRendererImpl.d(sb2, delegateField, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
                    }
                    if (descriptorRendererImpl.getPropertyAccessorRenderingPolicy() == PropertyAccessorRenderingPolicy.NONE) {
                        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
                        if (getter != null) {
                            descriptorRendererImpl.d(sb2, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                        }
                        PropertySetterDescriptor setter = propertyDescriptor.getSetter();
                        if (setter != null) {
                            descriptorRendererImpl.d(sb2, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                            List<ValueParameterDescriptor> valueParameters = setter.getValueParameters();
                            Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt___CollectionsKt.single((List) valueParameters);
                            Intrinsics.checkNotNull(valueParameterDescriptor);
                            descriptorRendererImpl.d(sb2, valueParameterDescriptor, AnnotationUseSiteTarget.SETTER_PARAMETER);
                        }
                    }
                }
                List<ReceiverParameterDescriptor> contextReceiverParameters = propertyDescriptor.getContextReceiverParameters();
                Intrinsics.checkNotNullExpressionValue(contextReceiverParameters, "getContextReceiverParameters(...)");
                descriptorRendererImpl.g(sb2, contextReceiverParameters);
                DescriptorVisibility visibility = propertyDescriptor.getVisibility();
                Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
                descriptorRendererImpl.E(visibility, sb2);
                descriptorRendererImpl.o(sb2, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.CONST) && propertyDescriptor.isConst(), "const");
                descriptorRendererImpl.m(propertyDescriptor, sb2);
                descriptorRendererImpl.n(propertyDescriptor, sb2);
                descriptorRendererImpl.s(propertyDescriptor, sb2);
                descriptorRendererImpl.o(sb2, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.LATEINIT) && propertyDescriptor.isLateInit(), "lateinit");
                descriptorRendererImpl.l(propertyDescriptor, sb2);
            }
            descriptorRendererImpl.B(propertyDescriptor, sb2, false);
            List<TypeParameterDescriptor> typeParameters = propertyDescriptor.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            descriptorRendererImpl.A(typeParameters, sb2, true);
            descriptorRendererImpl.v(sb2, propertyDescriptor);
        }
        descriptorRendererImpl.p(propertyDescriptor, sb2, true);
        sb2.append(": ");
        KotlinType type = propertyDescriptor.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        sb2.append(descriptorRendererImpl.renderType(type));
        descriptorRendererImpl.w(sb2, propertyDescriptor);
        if (descriptorRendererImpl.getIncludePropertyConstant() && (constantValueMo5774getCompileTimeInitializer = propertyDescriptor.mo5774getCompileTimeInitializer()) != null && (strF = descriptorRendererImpl.f(constantValueMo5774getCompileTimeInitializer)) != null) {
            sb2.append(" = ");
            sb2.append(descriptorRendererImpl.a(strF));
        }
        List<TypeParameterDescriptor> typeParameters2 = propertyDescriptor.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters2, "getTypeParameters(...)");
        descriptorRendererImpl.F(sb2, typeParameters2);
    }

    public static final void access$renderTypeAlias(DescriptorRendererImpl descriptorRendererImpl, TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb2) {
        descriptorRendererImpl.getClass();
        descriptorRendererImpl.d(sb2, typeAliasDescriptor, null);
        DescriptorVisibility visibility = typeAliasDescriptor.getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
        descriptorRendererImpl.E(visibility, sb2);
        descriptorRendererImpl.m(typeAliasDescriptor, sb2);
        sb2.append(descriptorRendererImpl.k("typealias"));
        sb2.append(" ");
        descriptorRendererImpl.p(typeAliasDescriptor, sb2, true);
        List<TypeParameterDescriptor> declaredTypeParameters = typeAliasDescriptor.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "getDeclaredTypeParameters(...)");
        descriptorRendererImpl.A(declaredTypeParameters, sb2, false);
        descriptorRendererImpl.e(typeAliasDescriptor, sb2);
        sb2.append(" = ");
        sb2.append(descriptorRendererImpl.renderType(typeAliasDescriptor.getUnderlyingType()));
    }

    public static Modality b(MemberDescriptor memberDescriptor) {
        if (memberDescriptor instanceof ClassDescriptor) {
            return ((ClassDescriptor) memberDescriptor).getKind() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        DeclarationDescriptor containingDeclaration = memberDescriptor.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor == null) {
            return Modality.FINAL;
        }
        if (!(memberDescriptor instanceof CallableMemberDescriptor)) {
            return Modality.FINAL;
        }
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) memberDescriptor;
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
        if ((!overriddenDescriptors.isEmpty()) && classDescriptor.getModality() != Modality.FINAL) {
            return Modality.OPEN;
        }
        if (classDescriptor.getKind() != ClassKind.INTERFACE || Intrinsics.areEqual(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.PRIVATE)) {
            return Modality.FINAL;
        }
        Modality modality = callableMemberDescriptor.getModality();
        Modality modality2 = Modality.ABSTRACT;
        return modality == modality2 ? modality2 : Modality.OPEN;
    }

    public static void x(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    public final void A(List<? extends TypeParameterDescriptor> list, StringBuilder sb2, boolean z10) {
        if (!getWithoutTypeParameters() && (!list.isEmpty())) {
            sb2.append(a("<"));
            z(sb2, list);
            sb2.append(a(">"));
            if (z10) {
                sb2.append(" ");
            }
        }
    }

    public final void B(VariableDescriptor variableDescriptor, StringBuilder sb2, boolean z10) {
        if (z10 || !(variableDescriptor instanceof ValueParameterDescriptor)) {
            sb2.append(k(variableDescriptor.isVar() ? "var" : "val"));
            sb2.append(" ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    public final void C(ValueParameterDescriptor valueParameterDescriptor, boolean z10, StringBuilder sb2, boolean z11) {
        boolean z12;
        ConstantValue<?> constantValueMo5774getCompileTimeInitializer;
        String strF;
        if (z11) {
            sb2.append(k("value-parameter"));
            sb2.append(" ");
        }
        if (getVerbose()) {
            sb2.append("/*");
            sb2.append(valueParameterDescriptor.getIndex());
            sb2.append("*/ ");
        }
        d(sb2, valueParameterDescriptor, null);
        o(sb2, valueParameterDescriptor.isCrossinline(), "crossinline");
        o(sb2, valueParameterDescriptor.isNoinline(), "noinline");
        if (getRenderPrimaryConstructorParametersAsProperties()) {
            CallableDescriptor containingDeclaration = valueParameterDescriptor.getContainingDeclaration();
            ClassConstructorDescriptor classConstructorDescriptor = containingDeclaration instanceof ClassConstructorDescriptor ? (ClassConstructorDescriptor) containingDeclaration : null;
            if (classConstructorDescriptor == null || !classConstructorDescriptor.isPrimary()) {
                z12 = false;
            } else {
                z12 = true;
            }
        } else {
            z12 = false;
        }
        if (z12) {
            o(sb2, getActualPropertiesInPrimaryConstructor(), "actual");
        }
        KotlinType type = valueParameterDescriptor.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        KotlinType varargElementType = valueParameterDescriptor.getVarargElementType();
        KotlinType kotlinType = varargElementType == null ? type : varargElementType;
        o(sb2, varargElementType != null, "vararg");
        if (z12 || (z11 && !getStartFromName())) {
            B(valueParameterDescriptor, sb2, z12);
        }
        if (z10) {
            p(valueParameterDescriptor, sb2, z11);
            sb2.append(": ");
        }
        sb2.append(renderType(kotlinType));
        if (getIncludePropertyConstant() && (constantValueMo5774getCompileTimeInitializer = valueParameterDescriptor.mo5774getCompileTimeInitializer()) != null && (strF = f(constantValueMo5774getCompileTimeInitializer)) != null) {
            sb2.append(" = ");
            sb2.append(a(strF));
        }
        if (getVerbose() && varargElementType != null) {
            sb2.append(" /*");
            sb2.append(renderType(type));
            sb2.append("*/");
        }
        if (getDefaultParameterValueRenderer() != null) {
            if (getDebugMode() ? valueParameterDescriptor.declaresDefaultValue() : DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor)) {
                StringBuilder sb3 = new StringBuilder(" = ");
                Function1<ValueParameterDescriptor, String> defaultParameterValueRenderer = getDefaultParameterValueRenderer();
                Intrinsics.checkNotNull(defaultParameterValueRenderer);
                sb3.append(defaultParameterValueRenderer.invoke(valueParameterDescriptor));
                sb2.append(sb3.toString());
            }
        }
    }

    public final void D(Collection<? extends ValueParameterDescriptor> collection, boolean z10, StringBuilder sb2) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[getParameterNameRenderingPolicy().ordinal()];
        boolean z11 = true;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (z10) {
            }
            z11 = false;
        }
        int size = collection.size();
        getValueParametersHandler().appendBeforeValueParameters(size, sb2);
        int i11 = 0;
        for (ValueParameterDescriptor valueParameterDescriptor : collection) {
            getValueParametersHandler().appendBeforeValueParameter(valueParameterDescriptor, i11, size, sb2);
            C(valueParameterDescriptor, z11, sb2, false);
            getValueParametersHandler().appendAfterValueParameter(valueParameterDescriptor, i11, size, sb2);
            i11++;
        }
        getValueParametersHandler().appendAfterValueParameters(size, sb2);
    }

    public final boolean E(DescriptorVisibility descriptorVisibility, StringBuilder sb2) {
        if (!getModifiers().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        if (getNormalizedVisibilities()) {
            descriptorVisibility = descriptorVisibility.normalize();
        }
        if (!getRenderDefaultVisibility() && Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.DEFAULT_VISIBILITY)) {
            return false;
        }
        sb2.append(k(descriptorVisibility.getInternalDisplayName()));
        sb2.append(" ");
        return true;
    }

    public final void F(StringBuilder sb2, List list) throws IOException {
        if (getWithoutTypeParameters()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it.next();
            List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            for (KotlinType kotlinType : CollectionsKt___CollectionsKt.drop(upperBounds, 1)) {
                StringBuilder sb3 = new StringBuilder();
                Name name = typeParameterDescriptor.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                sb3.append(renderName(name, false));
                sb3.append(" : ");
                Intrinsics.checkNotNull(kotlinType);
                sb3.append(renderType(kotlinType));
                arrayList.add(sb3.toString());
            }
        }
        if (!arrayList.isEmpty()) {
            sb2.append(" ");
            sb2.append(k("where"));
            sb2.append(" ");
            CollectionsKt___CollectionsKt.joinTo(arrayList, sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null);
        }
    }

    public final String a(String str) {
        return getTextFormat().escape(str);
    }

    public final void c(StringBuilder sb2, AbbreviatedType abbreviatedType) {
        RenderingFormat textFormat = getTextFormat();
        RenderingFormat renderingFormat = RenderingFormat.HTML;
        if (textFormat == renderingFormat) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* = ");
        r(sb2, abbreviatedType.getExpandedType());
        sb2.append(" */");
        if (getTextFormat() == renderingFormat) {
            sb2.append("</i></font>");
        }
    }

    public final void d(StringBuilder sb2, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget) {
        if (getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            Set<FqName> excludedTypeAnnotationClasses = annotated instanceof KotlinType ? getExcludedTypeAnnotationClasses() : getExcludedAnnotationClasses();
            Function1<AnnotationDescriptor, Boolean> annotationFilter = getAnnotationFilter();
            for (AnnotationDescriptor annotationDescriptor : annotated.getAnnotations()) {
                if (!CollectionsKt___CollectionsKt.contains(excludedTypeAnnotationClasses, annotationDescriptor.getFqName()) && !Intrinsics.areEqual(annotationDescriptor.getFqName(), StandardNames.FqNames.parameterName) && (annotationFilter == null || annotationFilter.invoke(annotationDescriptor).booleanValue())) {
                    sb2.append(renderAnnotation(annotationDescriptor, annotationUseSiteTarget));
                    if (getEachAnnotationOnNewLine()) {
                        sb2.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
                    } else {
                        sb2.append(" ");
                    }
                }
            }
        }
    }

    public final void e(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, StringBuilder sb2) {
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "getDeclaredTypeParameters(...)");
        List<TypeParameterDescriptor> parameters = classifierDescriptorWithTypeParameters.getTypeConstructor().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        if (getVerbose() && classifierDescriptorWithTypeParameters.isInner() && parameters.size() > declaredTypeParameters.size()) {
            sb2.append(" /*captured type parameters: ");
            z(sb2, parameters.subList(declaredTypeParameters.size(), parameters.size()));
            sb2.append("*/");
        }
    }

    public final String f(ConstantValue<?> constantValue) {
        Function1<ConstantValue<?>, String> propertyConstantRenderer = this.f81470a.getPropertyConstantRenderer();
        if (propertyConstantRenderer != null) {
            return propertyConstantRenderer.invoke(constantValue);
        }
        if (constantValue instanceof ArrayValue) {
            List<? extends ConstantValue<?>> value = ((ArrayValue) constantValue).getValue();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                String strF = f((ConstantValue) it.next());
                if (strF != null) {
                    arrayList.add(strF);
                }
            }
            return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", "{", "}", 0, null, null, 56, null);
        }
        if (constantValue instanceof AnnotationValue) {
            return StringsKt__StringsKt.removePrefix(DescriptorRenderer.renderAnnotation$default(this, ((AnnotationValue) constantValue).getValue(), null, 2, null), (CharSequence) "@");
        }
        if (!(constantValue instanceof KClassValue)) {
            return constantValue.toString();
        }
        KClassValue.Value value2 = ((KClassValue) constantValue).getValue();
        if (value2 instanceof KClassValue.Value.LocalClass) {
            return ((KClassValue.Value.LocalClass) value2).getType() + "::class";
        }
        if (!(value2 instanceof KClassValue.Value.NormalClass)) {
            throw new NoWhenBranchMatchedException();
        }
        KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) value2;
        String strAsString = normalClass.getClassId().asSingleFqName().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        int arrayDimensions = normalClass.getArrayDimensions();
        for (int i10 = 0; i10 < arrayDimensions; i10++) {
            strAsString = androidx.camera.core.impl.utils.a.a("kotlin.Array<", strAsString, Typography.greater);
        }
        return u.f(strAsString, "::class");
    }

    public final void g(StringBuilder sb2, List list) {
        if (!list.isEmpty()) {
            sb2.append("context(");
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int i11 = i10 + 1;
                ReceiverParameterDescriptor receiverParameterDescriptor = (ReceiverParameterDescriptor) it.next();
                d(sb2, receiverParameterDescriptor, AnnotationUseSiteTarget.RECEIVER);
                KotlinType type = receiverParameterDescriptor.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                sb2.append(j(type));
                if (i10 == CollectionsKt__CollectionsKt.getLastIndex(list)) {
                    sb2.append(") ");
                } else {
                    sb2.append(", ");
                }
                i10 = i11;
            }
        }
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return this.f81470a.getActualPropertiesInPrimaryConstructor();
    }

    public boolean getAlwaysRenderModifiers() {
        return this.f81470a.getAlwaysRenderModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return this.f81470a.getAnnotationArgumentsRenderingPolicy();
    }

    @Nullable
    public Function1<AnnotationDescriptor, Boolean> getAnnotationFilter() {
        return this.f81470a.getAnnotationFilter();
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return this.f81470a.getBoldOnlyForNamesInHtml();
    }

    public boolean getClassWithPrimaryConstructor() {
        return this.f81470a.getClassWithPrimaryConstructor();
    }

    @NotNull
    public ClassifierNamePolicy getClassifierNamePolicy() {
        return this.f81470a.getClassifierNamePolicy();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getDebugMode() {
        return this.f81470a.getDebugMode();
    }

    @Nullable
    public Function1<ValueParameterDescriptor, String> getDefaultParameterValueRenderer() {
        return this.f81470a.getDefaultParameterValueRenderer();
    }

    public boolean getEachAnnotationOnNewLine() {
        return this.f81470a.getEachAnnotationOnNewLine();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getEnhancedTypes() {
        return this.f81470a.getEnhancedTypes();
    }

    @NotNull
    public Set<FqName> getExcludedAnnotationClasses() {
        return this.f81470a.getExcludedAnnotationClasses();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public Set<FqName> getExcludedTypeAnnotationClasses() {
        return this.f81470a.getExcludedTypeAnnotationClasses();
    }

    public boolean getIncludeAdditionalModifiers() {
        return this.f81470a.getIncludeAdditionalModifiers();
    }

    public boolean getIncludeAnnotationArguments() {
        return this.f81470a.getIncludeAnnotationArguments();
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return this.f81470a.getIncludeEmptyAnnotationArguments();
    }

    public boolean getIncludePropertyConstant() {
        return this.f81470a.getIncludePropertyConstant();
    }

    public boolean getInformativeErrorType() {
        return this.f81470a.getInformativeErrorType();
    }

    @NotNull
    public Set<DescriptorRendererModifier> getModifiers() {
        return this.f81470a.getModifiers();
    }

    public boolean getNormalizedVisibilities() {
        return this.f81470a.getNormalizedVisibilities();
    }

    @NotNull
    public final DescriptorRendererOptionsImpl getOptions() {
        return this.f81470a;
    }

    @NotNull
    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return this.f81470a.getOverrideRenderingPolicy();
    }

    @NotNull
    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return this.f81470a.getParameterNameRenderingPolicy();
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return this.f81470a.getParameterNamesInFunctionalTypes();
    }

    public boolean getPresentableUnresolvedTypes() {
        return this.f81470a.getPresentableUnresolvedTypes();
    }

    @NotNull
    public PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return this.f81470a.getPropertyAccessorRenderingPolicy();
    }

    public boolean getReceiverAfterName() {
        return this.f81470a.getReceiverAfterName();
    }

    public boolean getRenderCompanionObjectName() {
        return this.f81470a.getRenderCompanionObjectName();
    }

    public boolean getRenderConstructorDelegation() {
        return this.f81470a.getRenderConstructorDelegation();
    }

    public boolean getRenderConstructorKeyword() {
        return this.f81470a.getRenderConstructorKeyword();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return this.f81470a.getRenderDefaultAnnotationArguments();
    }

    public boolean getRenderDefaultModality() {
        return this.f81470a.getRenderDefaultModality();
    }

    public boolean getRenderDefaultVisibility() {
        return this.f81470a.getRenderDefaultVisibility();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return this.f81470a.getRenderPrimaryConstructorParametersAsProperties();
    }

    public boolean getRenderTypeExpansions() {
        return this.f81470a.getRenderTypeExpansions();
    }

    public boolean getRenderUnabbreviatedType() {
        return this.f81470a.getRenderUnabbreviatedType();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return this.f81470a.getSecondaryConstructorsAsPrimary();
    }

    public boolean getStartFromDeclarationKeyword() {
        return this.f81470a.getStartFromDeclarationKeyword();
    }

    public boolean getStartFromName() {
        return this.f81470a.getStartFromName();
    }

    @NotNull
    public RenderingFormat getTextFormat() {
        return this.f81470a.getTextFormat();
    }

    @NotNull
    public Function1<KotlinType, KotlinType> getTypeNormalizer() {
        return this.f81470a.getTypeNormalizer();
    }

    public boolean getUninferredTypeParameterAsName() {
        return this.f81470a.getUninferredTypeParameterAsName();
    }

    public boolean getUnitReturnType() {
        return this.f81470a.getUnitReturnType();
    }

    @NotNull
    public DescriptorRenderer.ValueParametersHandler getValueParametersHandler() {
        return this.f81470a.getValueParametersHandler();
    }

    public boolean getVerbose() {
        return this.f81470a.getVerbose();
    }

    public boolean getWithDefinedIn() {
        return this.f81470a.getWithDefinedIn();
    }

    public boolean getWithSourceFileForTopLevel() {
        return this.f81470a.getWithSourceFileForTopLevel();
    }

    public boolean getWithoutReturnType() {
        return this.f81470a.getWithoutReturnType();
    }

    public boolean getWithoutSuperTypes() {
        return this.f81470a.getWithoutSuperTypes();
    }

    public boolean getWithoutTypeParameters() {
        return this.f81470a.getWithoutTypeParameters();
    }

    public final void h(StringBuilder sb2, SimpleType simpleType) {
        d(sb2, simpleType, null);
        DefinitelyNotNullType definitelyNotNullType = simpleType instanceof DefinitelyNotNullType ? (DefinitelyNotNullType) simpleType : null;
        SimpleType original = definitelyNotNullType != null ? definitelyNotNullType.getOriginal() : null;
        if (KotlinTypeKt.isError(simpleType)) {
            if (TypeUtilsKt.isUnresolvedType(simpleType) && getPresentableUnresolvedTypes()) {
                sb2.append(i(ErrorUtils.INSTANCE.unresolvedTypeAsItIs(simpleType)));
            } else {
                if (!(simpleType instanceof ErrorType) || getInformativeErrorType()) {
                    sb2.append(simpleType.getConstructor().toString());
                } else {
                    sb2.append(((ErrorType) simpleType).getDebugMessage());
                }
                sb2.append(renderTypeArguments(simpleType.getArguments()));
            }
        } else if (simpleType instanceof StubTypeForBuilderInference) {
            sb2.append(((StubTypeForBuilderInference) simpleType).getOriginalTypeVariable().toString());
        } else if (original instanceof StubTypeForBuilderInference) {
            sb2.append(((StubTypeForBuilderInference) original).getOriginalTypeVariable().toString());
        } else {
            TypeConstructor constructor = simpleType.getConstructor();
            PossiblyInnerType possiblyInnerTypeBuildPossiblyInnerType = TypeParameterUtilsKt.buildPossiblyInnerType(simpleType);
            if (possiblyInnerTypeBuildPossiblyInnerType == null) {
                sb2.append(renderTypeConstructor(constructor));
                sb2.append(renderTypeArguments(simpleType.getArguments()));
            } else {
                u(sb2, possiblyInnerTypeBuildPossiblyInnerType);
            }
        }
        if (simpleType.isMarkedNullable()) {
            sb2.append("?");
        }
        if (SpecialTypesKt.isDefinitelyNotNullType(simpleType)) {
            sb2.append(" & Any");
        }
    }

    public final String i(String str) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 == 2) {
            return h0.b("<font color=red><b>", str, "</b></font>");
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String j(KotlinType kotlinType) {
        String strRenderType = renderType(kotlinType);
        return ((!G(kotlinType) || TypeUtils.isNullableType(kotlinType)) && !(kotlinType instanceof DefinitelyNotNullType)) ? strRenderType : androidx.camera.core.impl.utils.a.a("(", strRenderType, RootService.CLOSE_BRACKET);
    }

    public final String k(String str) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 == 2) {
            return getBoldOnlyForNamesInHtml() ? str : h0.b("<b>", str, "</b>");
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void l(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (getModifiers().contains(DescriptorRendererModifier.MEMBER_KIND) && getVerbose() && callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb2.append("/*");
            sb2.append(CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(callableMemberDescriptor.getKind().name()));
            sb2.append("*/ ");
        }
    }

    public final void m(MemberDescriptor memberDescriptor, StringBuilder sb2) {
        o(sb2, memberDescriptor.isExternal(), "external");
        boolean z10 = false;
        o(sb2, getModifiers().contains(DescriptorRendererModifier.EXPECT) && memberDescriptor.isExpect(), "expect");
        if (getModifiers().contains(DescriptorRendererModifier.ACTUAL) && memberDescriptor.isActual()) {
            z10 = true;
        }
        o(sb2, z10, "actual");
    }

    public final void n(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (DescriptorUtils.isTopLevelDeclaration(callableMemberDescriptor) && callableMemberDescriptor.getModality() == Modality.FINAL) {
            return;
        }
        if (getOverrideRenderingPolicy() == OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor.getModality() == Modality.OPEN && (!callableMemberDescriptor.getOverriddenDescriptors().isEmpty())) {
            return;
        }
        Modality modality = callableMemberDescriptor.getModality();
        Intrinsics.checkNotNullExpressionValue(modality, "getModality(...)");
        Modality modalityB = b(callableMemberDescriptor);
        if (getRenderDefaultModality() || modality != modalityB) {
            o(sb2, getModifiers().contains(DescriptorRendererModifier.MODALITY), CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(modality.name()));
        }
    }

    public final void o(StringBuilder sb2, boolean z10, String str) {
        if (z10) {
            sb2.append(k(str));
            sb2.append(" ");
        }
    }

    public final void p(DeclarationDescriptor declarationDescriptor, StringBuilder sb2, boolean z10) {
        Name name = declarationDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb2.append(renderName(name, z10));
    }

    public final void q(StringBuilder sb2, KotlinType kotlinType) {
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        AbbreviatedType abbreviatedType = unwrappedTypeUnwrap instanceof AbbreviatedType ? (AbbreviatedType) unwrappedTypeUnwrap : null;
        if (abbreviatedType == null) {
            r(sb2, kotlinType);
            return;
        }
        if (getRenderTypeExpansions()) {
            r(sb2, abbreviatedType.getExpandedType());
            return;
        }
        r(sb2, abbreviatedType.getAbbreviation());
        if (getRenderUnabbreviatedType()) {
            c(sb2, abbreviatedType);
        }
    }

    public final void r(StringBuilder sb2, KotlinType kotlinType) {
        Name nameExtractParameterNameFromFunctionTypeArgument;
        String strA;
        if ((kotlinType instanceof WrappedType) && getDebugMode() && !((WrappedType) kotlinType).isComputed()) {
            sb2.append("<Not computed yet>");
            return;
        }
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof FlexibleType) {
            sb2.append(((FlexibleType) unwrappedTypeUnwrap).render(this, this));
            return;
        }
        if (unwrappedTypeUnwrap instanceof SimpleType) {
            SimpleType simpleType = (SimpleType) unwrappedTypeUnwrap;
            if (Intrinsics.areEqual(simpleType, TypeUtils.CANNOT_INFER_FUNCTION_PARAM_TYPE) || TypeUtils.isDontCarePlaceholder(simpleType)) {
                sb2.append("???");
                return;
            }
            if (ErrorUtils.isUninferredTypeVariable(simpleType)) {
                if (!getUninferredTypeParameterAsName()) {
                    sb2.append("???");
                    return;
                }
                TypeConstructor constructor = simpleType.getConstructor();
                Intrinsics.checkNotNull(constructor, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb2.append(i(((ErrorTypeConstructor) constructor).getParam(0)));
                return;
            }
            if (KotlinTypeKt.isError(simpleType)) {
                h(sb2, simpleType);
                return;
            }
            if (!G(simpleType)) {
                h(sb2, simpleType);
                return;
            }
            int length = sb2.length();
            ((DescriptorRendererImpl) this.f81471b.getValue()).d(sb2, simpleType, null);
            boolean z10 = sb2.length() != length;
            KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(simpleType);
            List<KotlinType> contextReceiverTypesFromFunctionType = FunctionTypesKt.getContextReceiverTypesFromFunctionType(simpleType);
            if (!contextReceiverTypesFromFunctionType.isEmpty()) {
                sb2.append("context(");
                Iterator<KotlinType> it = contextReceiverTypesFromFunctionType.subList(0, CollectionsKt__CollectionsKt.getLastIndex(contextReceiverTypesFromFunctionType)).iterator();
                while (it.hasNext()) {
                    q(sb2, it.next());
                    sb2.append(", ");
                }
                q(sb2, (KotlinType) CollectionsKt___CollectionsKt.last((List) contextReceiverTypesFromFunctionType));
                sb2.append(") ");
            }
            boolean zIsSuspendFunctionType = FunctionTypesKt.isSuspendFunctionType(simpleType);
            boolean zIsMarkedNullable = simpleType.isMarkedNullable();
            boolean z11 = zIsMarkedNullable || (z10 && receiverTypeFromFunctionType != null);
            if (z11) {
                if (zIsSuspendFunctionType) {
                    sb2.insert(length, RootService.OPEN_BRACKET);
                } else {
                    if (z10) {
                        CharsKt.isWhitespace(StringsKt___StringsKt.last(sb2));
                        if (sb2.charAt(StringsKt__StringsKt.getLastIndex(sb2) - 1) != ')') {
                            sb2.insert(StringsKt__StringsKt.getLastIndex(sb2), "()");
                        }
                    }
                    sb2.append("(");
                }
            }
            o(sb2, zIsSuspendFunctionType, "suspend");
            if (receiverTypeFromFunctionType != null) {
                boolean z12 = (G(receiverTypeFromFunctionType) && !receiverTypeFromFunctionType.isMarkedNullable()) || FunctionTypesKt.isSuspendFunctionType(receiverTypeFromFunctionType) || !receiverTypeFromFunctionType.getAnnotations().isEmpty() || (receiverTypeFromFunctionType instanceof DefinitelyNotNullType);
                if (z12) {
                    sb2.append("(");
                }
                q(sb2, receiverTypeFromFunctionType);
                if (z12) {
                    sb2.append(")");
                }
                sb2.append(Constant.DOT_STRING);
            }
            sb2.append("(");
            if (!FunctionTypesKt.isBuiltinExtensionFunctionalType(simpleType) || simpleType.getArguments().size() > 1) {
                int i10 = 0;
                for (TypeProjection typeProjection : FunctionTypesKt.getValueParameterTypesFromFunctionType(simpleType)) {
                    int i11 = i10 + 1;
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    if (getParameterNamesInFunctionalTypes()) {
                        KotlinType type = typeProjection.getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        nameExtractParameterNameFromFunctionTypeArgument = FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type);
                    } else {
                        nameExtractParameterNameFromFunctionTypeArgument = null;
                    }
                    if (nameExtractParameterNameFromFunctionTypeArgument != null) {
                        sb2.append(renderName(nameExtractParameterNameFromFunctionTypeArgument, false));
                        sb2.append(": ");
                    }
                    sb2.append(renderTypeProjection(typeProjection));
                    i10 = i11;
                }
            } else {
                sb2.append("???");
            }
            sb2.append(") ");
            int i12 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
            if (i12 == 1) {
                strA = a("->");
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                strA = "&rarr;";
            }
            sb2.append(strA);
            sb2.append(" ");
            q(sb2, FunctionTypesKt.getReturnTypeFromFunctionType(simpleType));
            if (z11) {
                sb2.append(")");
            }
            if (zIsMarkedNullable) {
                sb2.append("?");
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String render(@NotNull DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptor containingDeclaration;
        String name;
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.accept(new RenderDeclarationDescriptorVisitor(), sb2);
        if (getWithDefinedIn() && !(declarationDescriptor instanceof PackageFragmentDescriptor) && !(declarationDescriptor instanceof PackageViewDescriptor) && (containingDeclaration = declarationDescriptor.getContainingDeclaration()) != null && !(containingDeclaration instanceof ModuleDescriptor)) {
            sb2.append(" ");
            sb2.append(renderMessage("defined in"));
            sb2.append(" ");
            FqNameUnsafe fqName = DescriptorUtils.getFqName(containingDeclaration);
            Intrinsics.checkNotNullExpressionValue(fqName, "getFqName(...)");
            sb2.append(fqName.isRoot() ? "root package" : renderFqName(fqName));
            if (getWithSourceFileForTopLevel() && (containingDeclaration instanceof PackageFragmentDescriptor) && (declarationDescriptor instanceof DeclarationDescriptorWithSource) && (name = ((DeclarationDescriptorWithSource) declarationDescriptor).getSource().getContainingFile().getName()) != null) {
                sb2.append(" ");
                sb2.append(renderMessage("in file"));
                sb2.append(" ");
                sb2.append(name);
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderAnnotation(@NotNull AnnotationDescriptor annotation, @Nullable AnnotationUseSiteTarget annotationUseSiteTarget) throws IOException {
        ClassConstructorDescriptor classConstructorDescriptorMo5772getUnsubstitutedPrimaryConstructor;
        List<ValueParameterDescriptor> valueParameters;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (annotationUseSiteTarget != null) {
            sb2.append(annotationUseSiteTarget.getRenderName() + AbstractJsonLexerKt.COLON);
        }
        KotlinType type = annotation.getType();
        sb2.append(renderType(type));
        if (getIncludeAnnotationArguments()) {
            Map<Name, ConstantValue<?>> allValueArguments = annotation.getAllValueArguments();
            List listEmptyList = null;
            ClassDescriptor annotationClass = getRenderDefaultAnnotationArguments() ? DescriptorUtilsKt.getAnnotationClass(annotation) : null;
            if (annotationClass != null && (classConstructorDescriptorMo5772getUnsubstitutedPrimaryConstructor = annotationClass.mo5772getUnsubstitutedPrimaryConstructor()) != null && (valueParameters = classConstructorDescriptorMo5772getUnsubstitutedPrimaryConstructor.getValueParameters()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : valueParameters) {
                    if (((ValueParameterDescriptor) obj).declaresDefaultValue()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ValueParameterDescriptor) it.next()).getName());
                }
                listEmptyList = arrayList2;
            }
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : listEmptyList) {
                Name name = (Name) obj2;
                Intrinsics.checkNotNull(name);
                if (!allValueArguments.containsKey(name)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((Name) it2.next()).asString() + " = ...");
            }
            Set<Map.Entry<Name, ConstantValue<?>>> setEntrySet = allValueArguments.entrySet();
            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setEntrySet, 10));
            Iterator<T> it3 = setEntrySet.iterator();
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                Name name2 = (Name) entry.getKey();
                ConstantValue<?> constantValue = (ConstantValue) entry.getValue();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(name2.asString());
                sb3.append(" = ");
                sb3.append(!listEmptyList.contains(name2) ? f(constantValue) : "...");
                arrayList5.add(sb3.toString());
            }
            List listSorted = CollectionsKt___CollectionsKt.sorted(CollectionsKt___CollectionsKt.plus((Collection) arrayList4, (Iterable) arrayList5));
            if (getIncludeEmptyAnnotationArguments() || (!listSorted.isEmpty())) {
                CollectionsKt___CollectionsKt.joinTo(listSorted, sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "(", (112 & 8) == 0 ? ")" : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null);
            }
        }
        if (getVerbose() && (KotlinTypeKt.isError(type) || (type.getConstructor().mo5778getDeclarationDescriptor() instanceof NotFoundClasses.MockClassDescriptor))) {
            sb2.append(" /* annotation class not found */");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public String renderClassifierName(@NotNull ClassifierDescriptor klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        return ErrorUtils.isError(klass) ? klass.getTypeConstructor().toString() : getClassifierNamePolicy().renderClassifier(klass, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderFlexibleType(@NotNull String lowerRendered, @NotNull String upperRendered, @NotNull KotlinBuiltIns builtIns) {
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        if (RenderingUtilsKt.typeStringsDifferOnlyInNullability(lowerRendered, upperRendered)) {
            if (l.startsWith$default(upperRendered, "(", false, 2, null)) {
                return h0.b("(", lowerRendered, ")!");
            }
            return lowerRendered + '!';
        }
        ClassifierNamePolicy classifierNamePolicy = getClassifierNamePolicy();
        ClassDescriptor collection = builtIns.getCollection();
        Intrinsics.checkNotNullExpressionValue(collection, "getCollection(...)");
        String strSubstringBefore$default = StringsKt__StringsKt.substringBefore$default(classifierNamePolicy.renderClassifier(collection, this), "Collection", (String) null, 2, (Object) null);
        String strReplacePrefixesInTypeRepresentations = RenderingUtilsKt.replacePrefixesInTypeRepresentations(lowerRendered, u.f(strSubstringBefore$default, "Mutable"), upperRendered, strSubstringBefore$default, u.f(strSubstringBefore$default, "(Mutable)"));
        if (strReplacePrefixesInTypeRepresentations != null) {
            return strReplacePrefixesInTypeRepresentations;
        }
        String strReplacePrefixesInTypeRepresentations2 = RenderingUtilsKt.replacePrefixesInTypeRepresentations(lowerRendered, u.f(strSubstringBefore$default, "MutableMap.MutableEntry"), upperRendered, u.f(strSubstringBefore$default, "Map.Entry"), u.f(strSubstringBefore$default, "(Mutable)Map.(Mutable)Entry"));
        if (strReplacePrefixesInTypeRepresentations2 != null) {
            return strReplacePrefixesInTypeRepresentations2;
        }
        ClassifierNamePolicy classifierNamePolicy2 = getClassifierNamePolicy();
        ClassDescriptor array = builtIns.getArray();
        Intrinsics.checkNotNullExpressionValue(array, "getArray(...)");
        String strSubstringBefore$default2 = StringsKt__StringsKt.substringBefore$default(classifierNamePolicy2.renderClassifier(array, this), "Array", (String) null, 2, (Object) null);
        StringBuilder sbD = androidx.camera.core.impl.utils.c.d(strSubstringBefore$default2);
        sbD.append(a("Array<"));
        String string = sbD.toString();
        StringBuilder sbD2 = androidx.camera.core.impl.utils.c.d(strSubstringBefore$default2);
        sbD2.append(a("Array<out "));
        String string2 = sbD2.toString();
        StringBuilder sbD3 = androidx.camera.core.impl.utils.c.d(strSubstringBefore$default2);
        sbD3.append(a("Array<(out) "));
        String strReplacePrefixesInTypeRepresentations3 = RenderingUtilsKt.replacePrefixesInTypeRepresentations(lowerRendered, string, upperRendered, string2, sbD3.toString());
        if (strReplacePrefixesInTypeRepresentations3 != null) {
            return strReplacePrefixesInTypeRepresentations3;
        }
        return "(" + lowerRendered + ".." + upperRendered + RootService.CLOSE_BRACKET;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderFqName(@NotNull FqNameUnsafe fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        List<Name> listPathSegments = fqName.pathSegments();
        Intrinsics.checkNotNullExpressionValue(listPathSegments, "pathSegments(...)");
        return a(RenderingUtilsKt.renderFqName(listPathSegments));
    }

    @NotNull
    public String renderMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        int i10 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i10 == 1) {
            return message;
        }
        if (i10 == 2) {
            return h0.b("<i>", message, "</i>");
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderName(@NotNull Name name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strA = a(RenderingUtilsKt.render(name));
        return (getBoldOnlyForNamesInHtml() && getTextFormat() == RenderingFormat.HTML && z10) ? h0.b("<b>", strA, "</b>") : strA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderType(@NotNull KotlinType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        StringBuilder sb2 = new StringBuilder();
        q(sb2, getTypeNormalizer().invoke(type));
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public String renderTypeArguments(@NotNull List<? extends TypeProjection> typeArguments) throws IOException {
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a("<"));
        CollectionsKt___CollectionsKt.joinTo(typeArguments, sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : new cl.a(this));
        sb2.append(a(">"));
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public String renderTypeConstructor(@NotNull TypeConstructor typeConstructor) {
        Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = typeConstructor.mo5778getDeclarationDescriptor();
        if ((classifierDescriptorMo5778getDeclarationDescriptor instanceof TypeParameterDescriptor) || (classifierDescriptorMo5778getDeclarationDescriptor instanceof ClassDescriptor) || (classifierDescriptorMo5778getDeclarationDescriptor instanceof TypeAliasDescriptor)) {
            return renderClassifierName(classifierDescriptorMo5778getDeclarationDescriptor);
        }
        if (classifierDescriptorMo5778getDeclarationDescriptor == null) {
            return typeConstructor instanceof IntersectionTypeConstructor ? ((IntersectionTypeConstructor) typeConstructor).makeDebugNameForIntersectionType(b.f81475p0) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + classifierDescriptorMo5778getDeclarationDescriptor.getClass()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderTypeProjection(@NotNull TypeProjection typeProjection) throws IOException {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        CollectionsKt___CollectionsKt.joinTo(d.listOf(typeProjection), sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : new cl.a(this));
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void s(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (getModifiers().contains(DescriptorRendererModifier.OVERRIDE) && (!callableMemberDescriptor.getOverriddenDescriptors().isEmpty()) && getOverrideRenderingPolicy() != OverrideRenderingPolicy.RENDER_OPEN) {
            o(sb2, true, "override");
            if (getVerbose()) {
                sb2.append("/*");
                sb2.append(callableMemberDescriptor.getOverriddenDescriptors().size());
                sb2.append("*/ ");
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setAnnotationArgumentsRenderingPolicy(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        Intrinsics.checkNotNullParameter(annotationArgumentsRenderingPolicy, "<set-?>");
        this.f81470a.setAnnotationArgumentsRenderingPolicy(annotationArgumentsRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setClassifierNamePolicy(@NotNull ClassifierNamePolicy classifierNamePolicy) {
        Intrinsics.checkNotNullParameter(classifierNamePolicy, "<set-?>");
        this.f81470a.setClassifierNamePolicy(classifierNamePolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z10) {
        this.f81470a.setDebugMode(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setExcludedTypeAnnotationClasses(@NotNull Set<FqName> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f81470a.setExcludedTypeAnnotationClasses(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setModifiers(@NotNull Set<? extends DescriptorRendererModifier> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f81470a.setModifiers(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setParameterNameRenderingPolicy(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        Intrinsics.checkNotNullParameter(parameterNameRenderingPolicy, "<set-?>");
        this.f81470a.setParameterNameRenderingPolicy(parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setReceiverAfterName(boolean z10) {
        this.f81470a.setReceiverAfterName(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setRenderCompanionObjectName(boolean z10) {
        this.f81470a.setRenderCompanionObjectName(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setStartFromName(boolean z10) {
        this.f81470a.setStartFromName(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setTextFormat(@NotNull RenderingFormat renderingFormat) {
        Intrinsics.checkNotNullParameter(renderingFormat, "<set-?>");
        this.f81470a.setTextFormat(renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setVerbose(boolean z10) {
        this.f81470a.setVerbose(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithDefinedIn(boolean z10) {
        this.f81470a.setWithDefinedIn(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutSuperTypes(boolean z10) {
        this.f81470a.setWithoutSuperTypes(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutTypeParameters(boolean z10) {
        this.f81470a.setWithoutTypeParameters(z10);
    }

    public final void t(FqName fqName, String str, StringBuilder sb2) {
        sb2.append(k(str));
        FqNameUnsafe unsafe = fqName.toUnsafe();
        Intrinsics.checkNotNullExpressionValue(unsafe, "toUnsafe(...)");
        String strRenderFqName = renderFqName(unsafe);
        if (strRenderFqName.length() > 0) {
            sb2.append(" ");
            sb2.append(strRenderFqName);
        }
    }

    public final void u(StringBuilder sb2, PossiblyInnerType possiblyInnerType) {
        PossiblyInnerType outerType = possiblyInnerType.getOuterType();
        if (outerType != null) {
            u(sb2, outerType);
            sb2.append('.');
            Name name = possiblyInnerType.getClassifierDescriptor().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            sb2.append(renderName(name, false));
        } else {
            TypeConstructor typeConstructor = possiblyInnerType.getClassifierDescriptor().getTypeConstructor();
            Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
            sb2.append(renderTypeConstructor(typeConstructor));
        }
        sb2.append(renderTypeArguments(possiblyInnerType.getArguments()));
    }

    public final void v(StringBuilder sb2, CallableDescriptor callableDescriptor) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            d(sb2, extensionReceiverParameter, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type = extensionReceiverParameter.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(j(type));
            sb2.append(Constant.DOT_STRING);
        }
    }

    public final void w(StringBuilder sb2, CallableDescriptor callableDescriptor) {
        ReceiverParameterDescriptor extensionReceiverParameter;
        if (getReceiverAfterName() && (extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter()) != null) {
            sb2.append(" on ");
            KotlinType type = extensionReceiverParameter.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(renderType(type));
        }
    }

    public final void y(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb2, boolean z10) {
        if (z10) {
            sb2.append(a("<"));
        }
        if (getVerbose()) {
            sb2.append("/*");
            sb2.append(typeParameterDescriptor.getIndex());
            sb2.append("*/ ");
        }
        o(sb2, typeParameterDescriptor.isReified(), "reified");
        String label = typeParameterDescriptor.getVariance().getLabel();
        boolean z11 = true;
        o(sb2, label.length() > 0, label);
        d(sb2, typeParameterDescriptor, null);
        p(typeParameterDescriptor, sb2, z10);
        int size = typeParameterDescriptor.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            KotlinType next = typeParameterDescriptor.getUpperBounds().iterator().next();
            if (!KotlinBuiltIns.isDefaultBound(next)) {
                sb2.append(" : ");
                Intrinsics.checkNotNull(next);
                sb2.append(renderType(next));
            }
        } else if (z10) {
            for (KotlinType kotlinType : typeParameterDescriptor.getUpperBounds()) {
                if (!KotlinBuiltIns.isDefaultBound(kotlinType)) {
                    if (z11) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    Intrinsics.checkNotNull(kotlinType);
                    sb2.append(renderType(kotlinType));
                    z11 = false;
                }
            }
        }
        if (z10) {
            sb2.append(a(">"));
        }
    }

    public final void z(StringBuilder sb2, List<? extends TypeParameterDescriptor> list) {
        Iterator<? extends TypeParameterDescriptor> it = list.iterator();
        while (it.hasNext()) {
            y(it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}
