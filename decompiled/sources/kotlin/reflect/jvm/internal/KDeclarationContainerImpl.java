package kotlin.reflect.jvm.internal;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.processing.f;
import androidx.exifinterface.media.ExifInterface;
import bk.p;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000 )2\u00020\u0001:\u0003)*+B\u0007¢\u0006\u0004\b'\u0010(J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\tH&J\"\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0004J\u0016\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0016\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012J \u0010\u001b\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019J\u0014\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c2\u0006\u0010\u0016\u001a\u00020\u0012J\u0014\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c2\u0006\u0010\u0016\u001a\u00020\u0012R\u0018\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u001f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006,"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "getProperties", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "getFunctions", "", FirebaseAnalytics.Param.INDEX, "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "scope", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "belonginess", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getMembers", "", "signature", "findPropertyDescriptor", "findFunctionDescriptor", "desc", "Ljava/lang/reflect/Method;", "findMethodBySignature", "", "isMember", "findDefaultMethod", "Ljava/lang/reflect/Constructor;", "findConstructorBySignature", "findDefaultConstructor", "Ljava/lang/Class;", "getMethodOwner", "()Ljava/lang/Class;", "methodOwner", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "constructorDescriptors", "<init>", "()V", "Companion", "Data", "MemberBelonginess", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nKDeclarationContainerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KDeclarationContainerImpl.kt\nkotlin/reflect/jvm/internal/KDeclarationContainerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,314:1\n1603#2,9:315\n1855#2:324\n1856#2:326\n1612#2:327\n766#2:328\n857#2,2:329\n1477#2:331\n1502#2,3:332\n1505#2,3:342\n766#2:345\n857#2,2:346\n766#2:348\n857#2,2:349\n1#3:325\n1#3:351\n372#4,7:335\n1282#5,2:352\n37#6,2:354\n37#6,2:356\n37#6,2:358\n*S KotlinDebug\n*F\n+ 1 KDeclarationContainerImpl.kt\nkotlin/reflect/jvm/internal/KDeclarationContainerImpl\n*L\n58#1:315,9\n58#1:324\n58#1:326\n58#1:327\n83#1:328\n83#1:329,2\n103#1:331\n103#1:332,3\n103#1:342,3\n128#1:345\n128#1:346,2\n142#1:348\n142#1:349,2\n58#1:325\n103#1:335,7\n197#1:352,2\n207#1:354,2\n215#1:356,2\n239#1:358,2\n*E\n"})
public abstract class KDeclarationContainerImpl implements ClassBasedDeclarationContainer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Class<?> f79942p0 = DefaultConstructorMarker.class;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final Regex f79943q0 = new Regex("<v#(\\d+)>");

    /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0005*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;", "", "()V", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/Regex;", "getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection", "()Lkotlin/text/Regex;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Regex getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection() {
            return KDeclarationContainerImpl.f79943q0;
        }
    }

    /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public abstract class Data {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ KProperty<Object>[] f79944b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ReflectProperties.LazySoftVal f79945a;

        /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
        public static final class a extends Lambda implements Function0<RuntimeModuleData> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KDeclarationContainerImpl f79946p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(KDeclarationContainerImpl kDeclarationContainerImpl) {
                super(0);
                this.f79946p0 = kDeclarationContainerImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final RuntimeModuleData invoke() {
                return ModuleByClassLoaderKt.getOrCreateModule(this.f79946p0.getJClass());
            }
        }

        public Data(KDeclarationContainerImpl kDeclarationContainerImpl) {
            this.f79945a = ReflectProperties.lazySoft(new a(kDeclarationContainerImpl));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final RuntimeModuleData getModuleData() {
            T value = this.f79945a.getValue(this, f79944b[0]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (RuntimeModuleData) value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "member", "", "accept", "DECLARED", "INHERITED", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public static final class MemberBelonginess {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MemberBelonginess[] $VALUES;
        public static final MemberBelonginess DECLARED;
        public static final MemberBelonginess INHERITED;

        static {
            MemberBelonginess memberBelonginess = new MemberBelonginess("DECLARED", 0);
            DECLARED = memberBelonginess;
            MemberBelonginess memberBelonginess2 = new MemberBelonginess("INHERITED", 1);
            INHERITED = memberBelonginess2;
            MemberBelonginess[] memberBelonginessArr = {memberBelonginess, memberBelonginess2};
            $VALUES = memberBelonginessArr;
            $ENTRIES = EnumEntriesKt.enumEntries(memberBelonginessArr);
        }

        public MemberBelonginess() {
            throw null;
        }

        public static MemberBelonginess valueOf(String str) {
            return (MemberBelonginess) Enum.valueOf(MemberBelonginess.class, str);
        }

        public static MemberBelonginess[] values() {
            return (MemberBelonginess[]) $VALUES.clone();
        }

        public final boolean accept(@NotNull CallableMemberDescriptor member) {
            Intrinsics.checkNotNullParameter(member, "member");
            return member.getKind().isReal() == (this == DECLARED);
        }
    }

    /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
    public static final class a extends Lambda implements Function1<FunctionDescriptor, CharSequence> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f79947p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final CharSequence invoke(@NotNull FunctionDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return DescriptorRenderer.DEBUG_TEXT.render(descriptor) + " | " + RuntimeTypeMapper.INSTANCE.mapSignature(descriptor).getF79865b();
        }
    }

    /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
    public static final class b extends Lambda implements Function1<PropertyDescriptor, CharSequence> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f79948p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final CharSequence invoke(@NotNull PropertyDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return DescriptorRenderer.DEBUG_TEXT.render(descriptor) + " | " + RuntimeTypeMapper.INSTANCE.mapPropertySignature(descriptor).getF79874f();
        }
    }

    /* JADX INFO: compiled from: KDeclarationContainerImpl.kt */
    public static final class c extends Lambda implements Function2<DescriptorVisibility, DescriptorVisibility, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f79949p0 = new c(2);

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final Integer invoke(DescriptorVisibility descriptorVisibility, DescriptorVisibility descriptorVisibility2) {
            Integer numCompare = DescriptorVisibilities.compare(descriptorVisibility, descriptorVisibility2);
            return Integer.valueOf(numCompare == null ? 0 : numCompare.intValue());
        }
    }

    public static Method c(Class cls, String str, Class[] clsArr, Class cls2, boolean z10) {
        Class<?> clsTryLoadClass;
        Method methodC;
        if (z10) {
            clsArr[0] = cls;
        }
        Method methodF = f(cls, str, clsArr, cls2);
        if (methodF != null) {
            return methodF;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodC = c(superclass, str, clsArr, cls2, z10)) != null) {
            return methodC;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
        for (Class<?> cls3 : interfaces) {
            Intrinsics.checkNotNull(cls3);
            Method methodC2 = c(cls3, str, clsArr, cls2, z10);
            if (methodC2 != null) {
                return methodC2;
            }
            if (z10 && (clsTryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(ReflectClassUtilKt.getSafeClassLoader(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method methodF2 = f(clsTryLoadClass, str, clsArr, cls2);
                if (methodF2 != null) {
                    return methodF2;
                }
            }
        }
        return null;
    }

    public static Constructor e(Class cls, ArrayList arrayList) {
        try {
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method f(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (Intrinsics.areEqual(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (Intrinsics.areEqual(method.getName(), str) && Intrinsics.areEqual(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final void a(ArrayList arrayList, String str, boolean z10) {
        ArrayList arrayListB = b(str);
        arrayList.addAll(arrayListB);
        int size = (arrayListB.size() + 31) / 32;
        for (int i10 = 0; i10 < size; i10++) {
            Class TYPE = Integer.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            arrayList.add(TYPE);
        }
        if (!z10) {
            arrayList.add(Object.class);
            return;
        }
        Class<?> DEFAULT_CONSTRUCTOR_MARKER = f79942p0;
        arrayList.remove(DEFAULT_CONSTRUCTOR_MARKER);
        Intrinsics.checkNotNullExpressionValue(DEFAULT_CONSTRUCTOR_MARKER, "DEFAULT_CONSTRUCTOR_MARKER");
        arrayList.add(DEFAULT_CONSTRUCTOR_MARKER);
    }

    public final ArrayList b(String str) {
        int iIndexOf$default;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        while (str.charAt(i10) != ')') {
            int i11 = i10;
            while (str.charAt(i11) == '[') {
                i11++;
            }
            char cCharAt = str.charAt(i11);
            if (StringsKt__StringsKt.contains$default((CharSequence) "VZCBSIFJD", cCharAt, false, 2, (Object) null)) {
                iIndexOf$default = i11 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(str));
                }
                iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ';', i10, false, 4, (Object) null) + 1;
            }
            arrayList.add(d(i10, iIndexOf$default, str));
            i10 = iIndexOf$default;
        }
        return arrayList;
    }

    public final Class d(int i10, int i11, String str) throws ClassNotFoundException {
        char cCharAt = str.charAt(i10);
        if (cCharAt == 'L') {
            ClassLoader safeClassLoader = ReflectClassUtilKt.getSafeClassLoader(getJClass());
            String strSubstring = str.substring(i10 + 1, i11 - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Class<?> clsLoadClass = safeClassLoader.loadClass(l.replace$default(strSubstring, JsonPointer.SEPARATOR, '.', false, 4, (Object) null));
            Intrinsics.checkNotNullExpressionValue(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == '[') {
            return UtilKt.createArrayType(d(i10 + 1, i11, str));
        }
        if (cCharAt == 'V') {
            Class TYPE = Void.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            return TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == 'C') {
            return Character.TYPE;
        }
        if (cCharAt == 'B') {
            return Byte.TYPE;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'D') {
            return Double.TYPE;
        }
        throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(str));
    }

    @Nullable
    public final Constructor<?> findConstructorBySignature(@NotNull String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        return e(getJClass(), b(desc));
    }

    @Nullable
    public final Constructor<?> findDefaultConstructor(@NotNull String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Class<?> jClass = getJClass();
        ArrayList arrayList = new ArrayList();
        a(arrayList, desc, true);
        Unit unit = Unit.INSTANCE;
        return e(jClass, arrayList);
    }

    @Nullable
    public final Method findDefaultMethod(@NotNull String name, @NotNull String desc, boolean isMember) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        if (Intrinsics.areEqual(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (isMember) {
            arrayList.add(getJClass());
        }
        a(arrayList, desc, false);
        return c(getMethodOwner(), u.f(name, "$default"), (Class[]) arrayList.toArray(new Class[0]), d(StringsKt__StringsKt.indexOf$default((CharSequence) desc, RootService.CLOSE_BRACKET, 0, false, 6, (Object) null) + 1, desc.length(), desc), isMember);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00aa  */
    @NotNull
    public final FunctionDescriptor findFunctionDescriptor(@NotNull String name, @NotNull String signature) {
        List functions;
        ArrayList arrayList;
        String f79865b;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        if (Intrinsics.areEqual(name, "<init>")) {
            functions = CollectionsKt___CollectionsKt.toList(getConstructorDescriptors());
            arrayList = new ArrayList();
            for (Object obj : functions) {
                ConstructorDescriptor constructorDescriptor = (ConstructorDescriptor) obj;
                if (constructorDescriptor.isPrimary()) {
                    ClassifierDescriptorWithTypeParameters containingDeclaration = constructorDescriptor.getContainingDeclaration();
                    Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
                    if (InlineClassesUtilsKt.isMultiFieldValueClass(containingDeclaration)) {
                        String f79865b2 = RuntimeTypeMapper.INSTANCE.mapSignature(constructorDescriptor).getF79865b();
                        if (!l.startsWith$default(f79865b2, "constructor-impl", false, 2, null) || !l.endsWith$default(f79865b2, ")V", false, 2, null)) {
                            throw new IllegalArgumentException(("Invalid signature of " + constructorDescriptor + ": " + f79865b2).toString());
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(StringsKt__StringsKt.removeSuffix(f79865b2, (CharSequence) ExifInterface.GPS_MEASUREMENT_INTERRUPTED));
                        ClassifierDescriptorWithTypeParameters containingDeclaration2 = constructorDescriptor.getContainingDeclaration();
                        Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "getContainingDeclaration(...)");
                        sb2.append(ValueClassAwareCallerKt.toJvmDescriptor(containingDeclaration2));
                        f79865b = sb2.toString();
                    } else {
                        f79865b = RuntimeTypeMapper.INSTANCE.mapSignature(constructorDescriptor).getF79865b();
                    }
                } else {
                    f79865b = RuntimeTypeMapper.INSTANCE.mapSignature(constructorDescriptor).getF79865b();
                }
                if (Intrinsics.areEqual(f79865b, signature)) {
                    arrayList.add(obj);
                }
            }
        } else {
            Name nameIdentifier = Name.identifier(name);
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            functions = getFunctions(nameIdentifier);
            arrayList = new ArrayList();
            for (Object obj2 : functions) {
                if (Intrinsics.areEqual(RuntimeTypeMapper.INSTANCE.mapSignature((FunctionDescriptor) obj2).getF79865b(), signature)) {
                    arrayList.add(obj2);
                }
            }
        }
        if (arrayList.size() == 1) {
            return (FunctionDescriptor) CollectionsKt___CollectionsKt.single((List) arrayList);
        }
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(functions, RootService.LINE_BREAK, null, null, 0, null, a.f79947p0, 30, null);
        StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("Function '", name, "' (JVM signature: ", signature, ") not resolved in ");
        sbC.append(this);
        sbC.append(AbstractJsonLexerKt.COLON);
        sbC.append(strJoinToString$default.length() == 0 ? " no members found" : f.d(RootService.LINE_BREAK, strJoinToString$default));
        throw new KotlinReflectionInternalError(sbC.toString());
    }

    @Nullable
    public final Method findMethodBySignature(@NotNull String name, @NotNull String desc) throws ClassNotFoundException {
        Method methodC;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        if (Intrinsics.areEqual(name, "<init>")) {
            return null;
        }
        Class[] clsArr = (Class[]) b(desc).toArray(new Class[0]);
        Class clsD = d(StringsKt__StringsKt.indexOf$default((CharSequence) desc, RootService.CLOSE_BRACKET, 0, false, 6, (Object) null) + 1, desc.length(), desc);
        Method methodC2 = c(getMethodOwner(), name, clsArr, clsD, false);
        if (methodC2 != null) {
            return methodC2;
        }
        if (!getMethodOwner().isInterface() || (methodC = c(Object.class, name, clsArr, clsD, false)) == null) {
            return null;
        }
        return methodC;
    }

    @NotNull
    public final PropertyDescriptor findPropertyDescriptor(@NotNull String name, @NotNull String signature) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        MatchResult matchResultMatchEntire = f79943q0.matchEntire(signature);
        if (matchResultMatchEntire != null) {
            String str = matchResultMatchEntire.getDestructured().getMatch().getGroupValues().get(1);
            PropertyDescriptor localProperty = getLocalProperty(Integer.parseInt(str));
            if (localProperty != null) {
                return localProperty;
            }
            StringBuilder sbD = ci.a.d("Local property #", str, " not found in ");
            sbD.append(getJClass());
            throw new KotlinReflectionInternalError(sbD.toString());
        }
        Name nameIdentifier = Name.identifier(name);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        Collection<PropertyDescriptor> properties = getProperties(nameIdentifier);
        ArrayList arrayList = new ArrayList();
        for (Object obj : properties) {
            if (Intrinsics.areEqual(RuntimeTypeMapper.INSTANCE.mapPropertySignature((PropertyDescriptor) obj).getF79874f(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
            sbC.append(this);
            throw new KotlinReflectionInternalError(sbC.toString());
        }
        if (arrayList.size() == 1) {
            return (PropertyDescriptor) CollectionsKt___CollectionsKt.single((List) arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            DescriptorVisibility visibility = ((PropertyDescriptor) obj2).getVisibility();
            Object arrayList2 = linkedHashMap.get(visibility);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(visibility, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        Collection collectionValues = p.toSortedMap(linkedHashMap, new rk.b(c.f79949p0)).values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        List list = (List) CollectionsKt___CollectionsKt.last(collectionValues);
        if (list.size() == 1) {
            Intrinsics.checkNotNull(list);
            return (PropertyDescriptor) CollectionsKt___CollectionsKt.first(list);
        }
        Name nameIdentifier2 = Name.identifier(name);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(getProperties(nameIdentifier2), RootService.LINE_BREAK, null, null, 0, null, b.f79948p0, 30, null);
        StringBuilder sbC2 = androidx.constraintlayout.core.parser.a.c("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
        sbC2.append(this);
        sbC2.append(AbstractJsonLexerKt.COLON);
        sbC2.append(strJoinToString$default.length() == 0 ? " no members found" : f.d(RootService.LINE_BREAK, strJoinToString$default));
        throw new KotlinReflectionInternalError(sbC2.toString());
    }

    @NotNull
    public abstract Collection<ConstructorDescriptor> getConstructorDescriptors();

    @NotNull
    public abstract Collection<FunctionDescriptor> getFunctions(@NotNull Name name);

    @Nullable
    public abstract PropertyDescriptor getLocalProperty(int index);

    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    @NotNull
    public final Collection<KCallableImpl<?>> getMembers(@NotNull MemberScope scope, @NotNull MemberBelonginess belonginess) {
        KCallableImpl kCallableImpl;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(belonginess, "belonginess");
        KDeclarationContainerImpl$getMembers$visitor$1 kDeclarationContainerImpl$getMembers$visitor$1 = new KDeclarationContainerImpl$getMembers$visitor$1(this);
        Collection<DeclarationDescriptor> contributedDescriptors$default = ResolutionScope.DefaultImpls.getContributedDescriptors$default(scope, null, null, 3, null);
        ArrayList arrayList = new ArrayList();
        for (DeclarationDescriptor declarationDescriptor : contributedDescriptors$default) {
            if (declarationDescriptor instanceof CallableMemberDescriptor) {
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) declarationDescriptor;
                if (Intrinsics.areEqual(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.INVISIBLE_FAKE) || !belonginess.accept(callableMemberDescriptor)) {
                    kCallableImpl = null;
                } else {
                    kCallableImpl = (KCallableImpl) declarationDescriptor.accept(kDeclarationContainerImpl$getMembers$visitor$1, Unit.INSTANCE);
                }
            } else {
                kCallableImpl = null;
            }
            if (kCallableImpl != null) {
                arrayList.add(kCallableImpl);
            }
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    @NotNull
    public Class<?> getMethodOwner() {
        Class<?> wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(getJClass());
        return wrapperByPrimitive == null ? getJClass() : wrapperByPrimitive;
    }

    @NotNull
    public abstract Collection<PropertyDescriptor> getProperties(@NotNull Name name);
}
