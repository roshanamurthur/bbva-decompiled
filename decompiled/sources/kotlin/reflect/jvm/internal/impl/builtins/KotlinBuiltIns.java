package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class KotlinBuiltIns {
    public static final Name BUILTINS_MODULE_NAME = Name.special("<built-ins module>");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ModuleDescriptorImpl f80090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotNullLazyValue<e> f80091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotNullLazyValue<Collection<PackageViewDescriptor>> f80092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MemoizedFunctionToNotNull<Name, ClassDescriptor> f80093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StorageManager f80094e;

    public class a implements Function0<Collection<PackageViewDescriptor>> {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public Collection<PackageViewDescriptor> invoke() {
            KotlinBuiltIns kotlinBuiltIns = KotlinBuiltIns.this;
            return Arrays.asList(kotlinBuiltIns.getBuiltInsModule().getPackage(StandardNames.BUILT_INS_PACKAGE_FQ_NAME), kotlinBuiltIns.getBuiltInsModule().getPackage(StandardNames.COLLECTIONS_PACKAGE_FQ_NAME), kotlinBuiltIns.getBuiltInsModule().getPackage(StandardNames.RANGES_PACKAGE_FQ_NAME), kotlinBuiltIns.getBuiltInsModule().getPackage(StandardNames.ANNOTATION_PACKAGE_FQ_NAME));
        }
    }

    public class b implements Function0<e> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        public e invoke() {
            EnumMap enumMap = new EnumMap(PrimitiveType.class);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                String strAsString = primitiveType.getTypeName().asString();
                Name name = KotlinBuiltIns.BUILTINS_MODULE_NAME;
                KotlinBuiltIns kotlinBuiltIns = KotlinBuiltIns.this;
                if (strAsString == null) {
                    kotlinBuiltIns.getClass();
                    KotlinBuiltIns.a(47);
                    throw null;
                }
                SimpleType defaultType = kotlinBuiltIns.c(strAsString).getDefaultType();
                if (defaultType == null) {
                    KotlinBuiltIns.a(48);
                    throw null;
                }
                String strAsString2 = primitiveType.getArrayTypeName().asString();
                if (strAsString2 == null) {
                    KotlinBuiltIns.a(47);
                    throw null;
                }
                SimpleType defaultType2 = kotlinBuiltIns.c(strAsString2).getDefaultType();
                if (defaultType2 == null) {
                    KotlinBuiltIns.a(48);
                    throw null;
                }
                enumMap.put(primitiveType, defaultType2);
                map.put(defaultType, defaultType2);
                map2.put(defaultType2, defaultType);
            }
            return new e(enumMap, map, map2);
        }
    }

    public class c implements Function1<Name, ClassDescriptor> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function1
        public ClassDescriptor invoke(Name name) {
            ClassifierDescriptor classifierDescriptorMo5779getContributedClassifier = KotlinBuiltIns.this.getBuiltInsPackageScope().mo5779getContributedClassifier(name, NoLookupLocation.FROM_BUILTINS);
            if (classifierDescriptorMo5779getContributedClassifier == null) {
                throw new AssertionError("Built-in class " + StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(name) + " is not found");
            }
            if (classifierDescriptorMo5779getContributedClassifier instanceof ClassDescriptor) {
                return (ClassDescriptor) classifierDescriptorMo5779getContributedClassifier;
            }
            throw new AssertionError("Must be a class descriptor " + name + ", but was " + classifierDescriptorMo5779getContributedClassifier);
        }
    }

    public class d implements Function0<Void> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ModuleDescriptorImpl f80098p0;

        public d(ModuleDescriptorImpl moduleDescriptorImpl) {
            this.f80098p0 = moduleDescriptorImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        public Void invoke() {
            KotlinBuiltIns kotlinBuiltIns = KotlinBuiltIns.this;
            ModuleDescriptorImpl moduleDescriptorImpl = kotlinBuiltIns.f80090a;
            ModuleDescriptorImpl moduleDescriptorImpl2 = this.f80098p0;
            if (moduleDescriptorImpl == null) {
                kotlinBuiltIns.f80090a = moduleDescriptorImpl2;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + kotlinBuiltIns.f80090a + " (attempting to reset to " + moduleDescriptorImpl2 + ")");
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<PrimitiveType, SimpleType> f80100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<KotlinType, SimpleType> f80101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<SimpleType, SimpleType> f80102c;

        public e() {
            throw null;
        }

        public e(EnumMap enumMap, HashMap map, HashMap map2) {
            this.f80100a = enumMap;
            this.f80102c = map2;
        }
    }

    public KotlinBuiltIns(@NotNull StorageManager storageManager) {
        if (storageManager == null) {
            a(0);
            throw null;
        }
        this.f80094e = storageManager;
        this.f80092c = storageManager.createLazyValue(new a());
        this.f80091b = storageManager.createLazyValue(new b());
        this.f80093d = storageManager.createMemoizedFunction(new c());
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                i11 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 73:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 77:
            case 78:
            case 90:
            case 97:
            case 104:
            case 108:
            case 109:
            case 144:
            case 147:
            case 148:
            case 150:
            case 158:
            case 159:
            case 160:
            case 161:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 99:
            case 101:
            case 103:
            case 105:
            case 107:
            case 136:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 98:
            case 100:
            case 106:
            case 110:
            case 111:
            case 112:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 145:
            case 146:
            case 149:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 163:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
                objArr[0] = "arrayType";
                break;
            case 72:
                objArr[0] = "notNullArrayType";
                break;
            case 74:
                objArr[0] = "primitiveType";
                break;
            case 76:
                objArr[0] = "kotlinType";
                break;
            case 79:
            case 83:
                objArr[0] = "projectionType";
                break;
            case 80:
            case 84:
            case 86:
                objArr[0] = "argument";
                break;
            case 81:
                objArr[0] = "annotations";
                break;
            case 102:
                objArr[0] = "typeConstructor";
                break;
            case 113:
                objArr[0] = "classDescriptor";
                break;
            case 162:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKType";
                break;
            case 23:
                objArr[1] = "getKCallable";
                break;
            case 24:
                objArr[1] = "getKProperty";
                break;
            case 25:
                objArr[1] = "getKProperty0";
                break;
            case 26:
                objArr[1] = "getKProperty1";
                break;
            case 27:
                objArr[1] = "getKProperty2";
                break;
            case 28:
                objArr[1] = "getKMutableProperty0";
                break;
            case 29:
                objArr[1] = "getKMutableProperty1";
                break;
            case 30:
                objArr[1] = "getKMutableProperty2";
                break;
            case 31:
                objArr[1] = "getIterator";
                break;
            case 32:
                objArr[1] = "getIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterable";
                break;
            case 34:
                objArr[1] = "getMutableIterator";
                break;
            case 35:
                objArr[1] = "getCollection";
                break;
            case 36:
                objArr[1] = "getMutableCollection";
                break;
            case 37:
                objArr[1] = "getList";
                break;
            case 38:
                objArr[1] = "getMutableList";
                break;
            case 39:
                objArr[1] = "getSet";
                break;
            case 40:
                objArr[1] = "getMutableSet";
                break;
            case 41:
                objArr[1] = "getMap";
                break;
            case 42:
                objArr[1] = "getMutableMap";
                break;
            case 43:
                objArr[1] = "getMapEntry";
                break;
            case 44:
                objArr[1] = "getMutableMapEntry";
                break;
            case 45:
                objArr[1] = "getListIterator";
                break;
            case 46:
                objArr[1] = "getMutableListIterator";
                break;
            case 48:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 49:
                objArr[1] = "getNothingType";
                break;
            case 50:
                objArr[1] = "getNullableNothingType";
                break;
            case 51:
                objArr[1] = "getAnyType";
                break;
            case 52:
                objArr[1] = "getNullableAnyType";
                break;
            case 53:
                objArr[1] = "getDefaultBound";
                break;
            case 55:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 56:
                objArr[1] = "getNumberType";
                break;
            case 57:
                objArr[1] = "getByteType";
                break;
            case 58:
                objArr[1] = "getShortType";
                break;
            case 59:
                objArr[1] = "getIntType";
                break;
            case 60:
                objArr[1] = "getLongType";
                break;
            case 61:
                objArr[1] = "getFloatType";
                break;
            case 62:
                objArr[1] = "getDoubleType";
                break;
            case 63:
                objArr[1] = "getCharType";
                break;
            case 64:
                objArr[1] = "getBooleanType";
                break;
            case 65:
                objArr[1] = "getUnitType";
                break;
            case 66:
                objArr[1] = "getStringType";
                break;
            case 67:
                objArr[1] = "getIterableType";
                break;
            case 69:
            case 70:
            case 71:
                objArr[1] = "getArrayElementType";
                break;
            case 75:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 82:
            case 85:
                objArr[1] = "getArrayType";
                break;
            case 87:
                objArr[1] = "getEnumType";
                break;
            case 88:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 72:
            case 73:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 76:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 77:
            case 94:
                objArr[2] = "getPrimitiveType";
                break;
            case 78:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
                objArr[2] = "getArrayType";
                break;
            case 86:
                objArr[2] = "getEnumType";
                break;
            case 89:
                objArr[2] = "isArray";
                break;
            case 90:
            case 91:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 92:
                objArr[2] = "isPrimitiveArray";
                break;
            case 93:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 95:
                objArr[2] = "isPrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 97:
                objArr[2] = "isPrimitiveClass";
                break;
            case 98:
            case 99:
            case 100:
            case 101:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 102:
            case 103:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 104:
            case 105:
                objArr[2] = "classFqNameEquals";
                break;
            case 106:
            case 107:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 108:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 109:
            case 110:
                objArr[2] = "isAny";
                break;
            case 111:
            case 113:
                objArr[2] = "isBoolean";
                break;
            case 112:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 114:
                objArr[2] = "isNumber";
                break;
            case 115:
                objArr[2] = "isChar";
                break;
            case 116:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 117:
                objArr[2] = "isInt";
                break;
            case 118:
                objArr[2] = "isByte";
                break;
            case 119:
                objArr[2] = "isLong";
                break;
            case 120:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 121:
                objArr[2] = "isShort";
                break;
            case 122:
                objArr[2] = "isFloat";
                break;
            case 123:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 124:
                objArr[2] = "isDouble";
                break;
            case 125:
                objArr[2] = "isUByte";
                break;
            case 126:
                objArr[2] = "isUShort";
                break;
            case 127:
                objArr[2] = "isUInt";
                break;
            case 128:
                objArr[2] = "isULong";
                break;
            case 129:
                objArr[2] = "isUByteArray";
                break;
            case 130:
                objArr[2] = "isUShortArray";
                break;
            case 131:
                objArr[2] = "isUIntArray";
                break;
            case 132:
                objArr[2] = "isULongArray";
                break;
            case 133:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 134:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 135:
            case 136:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 137:
                objArr[2] = "isNothing";
                break;
            case 138:
                objArr[2] = "isNullableNothing";
                break;
            case 139:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 140:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 141:
                objArr[2] = "isNullableAny";
                break;
            case 142:
                objArr[2] = "isDefaultBound";
                break;
            case 143:
                objArr[2] = "isUnit";
                break;
            case 144:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 145:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 146:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 147:
                objArr[2] = "isMemberOfAny";
                break;
            case 148:
            case 149:
                objArr[2] = "isEnum";
                break;
            case 150:
            case 151:
                objArr[2] = "isComparable";
                break;
            case 152:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 153:
                objArr[2] = "isListOrNullableList";
                break;
            case 154:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 155:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 156:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 157:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 158:
                objArr[2] = "isThrowable";
                break;
            case 159:
                objArr[2] = "isKClass";
                break;
            case 160:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 161:
                objArr[2] = "isCloneable";
                break;
            case 162:
                objArr[2] = "isDeprecated";
                break;
            case 163:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                throw new IllegalStateException(str2);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean b(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull FqNameUnsafe fqNameUnsafe) {
        if (classifierDescriptor == null) {
            a(104);
            throw null;
        }
        if (fqNameUnsafe != null) {
            return classifierDescriptor.getName().equals(fqNameUnsafe.shortName()) && fqNameUnsafe.equals(DescriptorUtils.getFqName(classifierDescriptor));
        }
        a(105);
        throw null;
    }

    public static boolean d(@NotNull KotlinType kotlinType, @NotNull FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            a(98);
            throw null;
        }
        if (fqNameUnsafe != null) {
            return isTypeConstructorForGivenClass(kotlinType.getConstructor(), fqNameUnsafe);
        }
        a(99);
        throw null;
    }

    public static boolean e(@NotNull KotlinType kotlinType, @NotNull FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            a(135);
            throw null;
        }
        if (fqNameUnsafe != null) {
            return d(kotlinType, fqNameUnsafe) && !kotlinType.isMarkedNullable();
        }
        a(136);
        throw null;
    }

    public static boolean f(@NotNull KotlinType kotlinType, @NotNull FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            a(106);
            throw null;
        }
        if (fqNameUnsafe != null) {
            return !kotlinType.isMarkedNullable() && d(kotlinType, fqNameUnsafe);
        }
        a(107);
        throw null;
    }

    @Nullable
    public static PrimitiveType getPrimitiveArrayElementType(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            a(93);
            throw null;
        }
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = kotlinType.getConstructor().mo5778getDeclarationDescriptor();
        if (classifierDescriptorMo5778getDeclarationDescriptor == null) {
            return null;
        }
        return getPrimitiveArrayType(classifierDescriptorMo5778getDeclarationDescriptor);
    }

    @Nullable
    public static PrimitiveType getPrimitiveArrayType(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(78);
            throw null;
        }
        if (StandardNames.FqNames.primitiveArrayTypeShortNames.contains(declarationDescriptor.getName())) {
            return StandardNames.FqNames.arrayClassFqNameToPrimitiveType.get(DescriptorUtils.getFqName(declarationDescriptor));
        }
        return null;
    }

    @Nullable
    public static PrimitiveType getPrimitiveType(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(77);
            throw null;
        }
        if (StandardNames.FqNames.primitiveTypeShortNames.contains(declarationDescriptor.getName())) {
            return StandardNames.FqNames.fqNameToPrimitiveType.get(DescriptorUtils.getFqName(declarationDescriptor));
        }
        return null;
    }

    public static boolean isAny(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor != null) {
            return b(classDescriptor, StandardNames.FqNames.any);
        }
        a(109);
        throw null;
    }

    public static boolean isAnyOrNullableAny(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return d(kotlinType, StandardNames.FqNames.any);
        }
        a(140);
        throw null;
    }

    public static boolean isArray(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return d(kotlinType, StandardNames.FqNames.array);
        }
        a(89);
        throw null;
    }

    public static boolean isArrayOrPrimitiveArray(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor != null) {
            return b(classDescriptor, StandardNames.FqNames.array) || getPrimitiveArrayType(classDescriptor) != null;
        }
        a(90);
        throw null;
    }

    public static boolean isBoolean(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return e(kotlinType, StandardNames.FqNames._boolean);
        }
        a(111);
        throw null;
    }

    public static boolean isBuiltIn(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor != null) {
            return DescriptorUtils.getParentOfType(declarationDescriptor, BuiltInsPackageFragment.class, false) != null;
        }
        a(9);
        throw null;
    }

    public static boolean isDefaultBound(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return isNullableAny(kotlinType);
        }
        a(142);
        throw null;
    }

    public static boolean isDeprecated(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(162);
            throw null;
        }
        if (declarationDescriptor.getOriginal().getAnnotations().hasAnnotation(StandardNames.FqNames.deprecated)) {
            return true;
        }
        if (!(declarationDescriptor instanceof PropertyDescriptor)) {
            return false;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) declarationDescriptor;
        boolean zIsVar = propertyDescriptor.isVar();
        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        PropertySetterDescriptor setter = propertyDescriptor.getSetter();
        if (getter != null && isDeprecated(getter)) {
            if (!zIsVar) {
                return true;
            }
            if (setter != null && isDeprecated(setter)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isKClass(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor != null) {
            return b(classDescriptor, StandardNames.FqNames.kClass);
        }
        a(159);
        throw null;
    }

    public static boolean isNothing(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return isNothingOrNullableNothing(kotlinType) && !TypeUtils.isNullableType(kotlinType);
        }
        a(137);
        throw null;
    }

    public static boolean isNothingOrNullableNothing(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return d(kotlinType, StandardNames.FqNames.nothing);
        }
        a(139);
        throw null;
    }

    public static boolean isNullableAny(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return isAnyOrNullableAny(kotlinType) && kotlinType.isMarkedNullable();
        }
        a(141);
        throw null;
    }

    public static boolean isPrimitiveArray(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = kotlinType.getConstructor().mo5778getDeclarationDescriptor();
            return (classifierDescriptorMo5778getDeclarationDescriptor == null || getPrimitiveArrayType(classifierDescriptorMo5778getDeclarationDescriptor) == null) ? false : true;
        }
        a(92);
        throw null;
    }

    public static boolean isPrimitiveClass(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor != null) {
            return getPrimitiveType(classDescriptor) != null;
        }
        a(97);
        throw null;
    }

    public static boolean isPrimitiveType(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return !kotlinType.isMarkedNullable() && isPrimitiveTypeOrNullablePrimitiveType(kotlinType);
        }
        a(95);
        throw null;
    }

    public static boolean isPrimitiveTypeOrNullablePrimitiveType(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = kotlinType.getConstructor().mo5778getDeclarationDescriptor();
            return (classifierDescriptorMo5778getDeclarationDescriptor instanceof ClassDescriptor) && isPrimitiveClass((ClassDescriptor) classifierDescriptorMo5778getDeclarationDescriptor);
        }
        a(96);
        throw null;
    }

    public static boolean isSpecialClassWithNoSupertypes(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor != null) {
            return b(classDescriptor, StandardNames.FqNames.any) || b(classDescriptor, StandardNames.FqNames.nothing);
        }
        a(108);
        throw null;
    }

    public static boolean isString(@Nullable KotlinType kotlinType) {
        return kotlinType != null && f(kotlinType, StandardNames.FqNames.string);
    }

    public static boolean isTypeConstructorForGivenClass(@NotNull TypeConstructor typeConstructor, @NotNull FqNameUnsafe fqNameUnsafe) {
        if (typeConstructor == null) {
            a(102);
            throw null;
        }
        if (fqNameUnsafe != null) {
            ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = typeConstructor.mo5778getDeclarationDescriptor();
            return (classifierDescriptorMo5778getDeclarationDescriptor instanceof ClassDescriptor) && b(classifierDescriptorMo5778getDeclarationDescriptor, fqNameUnsafe);
        }
        a(103);
        throw null;
    }

    public static boolean isUByteArray(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return e(kotlinType, StandardNames.FqNames.uByteArrayFqName.toUnsafe());
        }
        a(129);
        throw null;
    }

    public static boolean isUIntArray(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return e(kotlinType, StandardNames.FqNames.uIntArrayFqName.toUnsafe());
        }
        a(131);
        throw null;
    }

    public static boolean isULongArray(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return e(kotlinType, StandardNames.FqNames.uLongArrayFqName.toUnsafe());
        }
        a(132);
        throw null;
    }

    public static boolean isUShortArray(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return e(kotlinType, StandardNames.FqNames.uShortArrayFqName.toUnsafe());
        }
        a(130);
        throw null;
    }

    public static boolean isUnderKotlinPackage(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(10);
            throw null;
        }
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                return ((PackageFragmentDescriptor) declarationDescriptor).getFqName().startsWith(StandardNames.BUILT_INS_PACKAGE_NAME);
            }
            declarationDescriptor = declarationDescriptor.getContainingDeclaration();
        }
        return false;
    }

    public static boolean isUnit(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return f(kotlinType, StandardNames.FqNames.unit);
        }
        a(143);
        throw null;
    }

    public static boolean isUnsignedArrayType(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return isUByteArray(kotlinType) || isUShortArray(kotlinType) || isUIntArray(kotlinType) || isULongArray(kotlinType);
        }
        a(133);
        throw null;
    }

    @NotNull
    public final ClassDescriptor c(@NotNull String str) {
        if (str == null) {
            a(14);
            throw null;
        }
        ClassDescriptor classDescriptorInvoke = this.f80093d.invoke(Name.identifier(str));
        if (classDescriptorInvoke != null) {
            return classDescriptorInvoke;
        }
        a(15);
        throw null;
    }

    public void createBuiltInsModule(boolean z10) {
        ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(BUILTINS_MODULE_NAME, this.f80094e, this, null);
        this.f80090a = moduleDescriptorImpl;
        moduleDescriptorImpl.initialize(BuiltInsLoader.Companion.getInstance().createPackageFragmentProvider(this.f80094e, this.f80090a, getClassDescriptorFactories(), getPlatformDependentDeclarationFilter(), getAdditionalClassPartsProvider(), z10));
        ModuleDescriptorImpl moduleDescriptorImpl2 = this.f80090a;
        moduleDescriptorImpl2.setDependencies(moduleDescriptorImpl2);
    }

    @NotNull
    public AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        AdditionalClassPartsProvider.None none = AdditionalClassPartsProvider.None.INSTANCE;
        if (none != null) {
            return none;
        }
        a(3);
        throw null;
    }

    @NotNull
    public ClassDescriptor getAny() {
        return c("Any");
    }

    @NotNull
    public SimpleType getAnyType() {
        SimpleType defaultType = getAny().getDefaultType();
        if (defaultType != null) {
            return defaultType;
        }
        a(51);
        throw null;
    }

    @NotNull
    public ClassDescriptor getArray() {
        return c("Array");
    }

    @NotNull
    public KotlinType getArrayElementType(@NotNull KotlinType kotlinType) {
        ClassId classId;
        ClassId unsignedClassIdByArrayClassId;
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies;
        SimpleType defaultType = null;
        if (kotlinType == null) {
            a(68);
            throw null;
        }
        if (isArray(kotlinType)) {
            if (kotlinType.getArguments().size() != 1) {
                throw new IllegalStateException();
            }
            KotlinType type = kotlinType.getArguments().get(0).getType();
            if (type != null) {
                return type;
            }
            a(69);
            throw null;
        }
        KotlinType kotlinTypeMakeNotNullable = TypeUtils.makeNotNullable(kotlinType);
        SimpleType simpleType = this.f80091b.invoke().f80102c.get(kotlinTypeMakeNotNullable);
        if (simpleType != null) {
            return simpleType;
        }
        ModuleDescriptor containingModuleOrNull = DescriptorUtils.getContainingModuleOrNull(kotlinTypeMakeNotNullable);
        if (containingModuleOrNull != null) {
            if (kotlinTypeMakeNotNullable == null) {
                a(72);
                throw null;
            }
            ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = kotlinTypeMakeNotNullable.getConstructor().mo5778getDeclarationDescriptor();
            if (classifierDescriptorMo5778getDeclarationDescriptor != null) {
                UnsignedTypes unsignedTypes = UnsignedTypes.INSTANCE;
                if (unsignedTypes.isShortNameOfUnsignedArray(classifierDescriptorMo5778getDeclarationDescriptor.getName()) && (classId = DescriptorUtilsKt.getClassId(classifierDescriptorMo5778getDeclarationDescriptor)) != null && (unsignedClassIdByArrayClassId = unsignedTypes.getUnsignedClassIdByArrayClassId(classId)) != null && (classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(containingModuleOrNull, unsignedClassIdByArrayClassId)) != null) {
                    defaultType = classDescriptorFindClassAcrossModuleDependencies.getDefaultType();
                }
            }
            if (defaultType != null) {
                return defaultType;
            }
        }
        throw new IllegalStateException("not array: " + kotlinType);
    }

    @NotNull
    public SimpleType getArrayType(@NotNull Variance variance, @NotNull KotlinType kotlinType, @NotNull Annotations annotations) {
        if (variance == null) {
            a(79);
            throw null;
        }
        if (kotlinType == null) {
            a(80);
            throw null;
        }
        if (annotations == null) {
            a(81);
            throw null;
        }
        SimpleType simpleTypeSimpleNotNullType = KotlinTypeFactory.simpleNotNullType(TypeAttributesKt.toDefaultAttributes(annotations), getArray(), Collections.singletonList(new TypeProjectionImpl(variance, kotlinType)));
        if (simpleTypeSimpleNotNullType != null) {
            return simpleTypeSimpleNotNullType;
        }
        a(82);
        throw null;
    }

    @NotNull
    public SimpleType getBooleanType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.BOOLEAN);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        a(64);
        throw null;
    }

    @NotNull
    public ClassDescriptor getBuiltInClassByFqName(@NotNull FqName fqName) {
        if (fqName == null) {
            a(12);
            throw null;
        }
        ClassDescriptor classDescriptorResolveClassByFqName = DescriptorUtilKt.resolveClassByFqName(getBuiltInsModule(), fqName, NoLookupLocation.FROM_BUILTINS);
        if (classDescriptorResolveClassByFqName != null) {
            return classDescriptorResolveClassByFqName;
        }
        a(13);
        throw null;
    }

    @NotNull
    public ModuleDescriptorImpl getBuiltInsModule() {
        this.f80090a.getClass();
        ModuleDescriptorImpl moduleDescriptorImpl = this.f80090a;
        if (moduleDescriptorImpl != null) {
            return moduleDescriptorImpl;
        }
        a(7);
        throw null;
    }

    @NotNull
    public MemberScope getBuiltInsPackageScope() {
        MemberScope memberScope = getBuiltInsModule().getPackage(StandardNames.BUILT_INS_PACKAGE_FQ_NAME).getMemberScope();
        if (memberScope != null) {
            return memberScope;
        }
        a(11);
        throw null;
    }

    @NotNull
    public SimpleType getByteType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.BYTE);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        a(57);
        throw null;
    }

    @NotNull
    public SimpleType getCharType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.CHAR);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        a(63);
        throw null;
    }

    @NotNull
    public Iterable<ClassDescriptorFactory> getClassDescriptorFactories() {
        List listSingletonList = Collections.singletonList(new BuiltInFictitiousFunctionClassFactory(this.f80094e, getBuiltInsModule()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    @NotNull
    public ClassDescriptor getCollection() {
        ClassDescriptor builtInClassByFqName = getBuiltInClassByFqName(StandardNames.FqNames.collection);
        if (builtInClassByFqName != null) {
            return builtInClassByFqName;
        }
        a(35);
        throw null;
    }

    @NotNull
    public ClassDescriptor getComparable() {
        return c("Comparable");
    }

    @NotNull
    public SimpleType getDefaultBound() {
        SimpleType nullableAnyType = getNullableAnyType();
        if (nullableAnyType != null) {
            return nullableAnyType;
        }
        a(53);
        throw null;
    }

    @NotNull
    public SimpleType getDoubleType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.DOUBLE);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        a(62);
        throw null;
    }

    @NotNull
    public SimpleType getFloatType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.FLOAT);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        a(61);
        throw null;
    }

    @NotNull
    public ClassDescriptor getFunction(int i10) {
        return c(StandardNames.getFunctionName(i10));
    }

    @NotNull
    public SimpleType getIntType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.INT);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        a(59);
        throw null;
    }

    @NotNull
    public ClassDescriptor getKClass() {
        ClassDescriptor builtInClassByFqName = getBuiltInClassByFqName(StandardNames.FqNames.kClass.toSafe());
        if (builtInClassByFqName != null) {
            return builtInClassByFqName;
        }
        a(21);
        throw null;
    }

    @NotNull
    public SimpleType getLongType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.LONG);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        a(60);
        throw null;
    }

    @NotNull
    public ClassDescriptor getNothing() {
        return c("Nothing");
    }

    @NotNull
    public SimpleType getNothingType() {
        SimpleType defaultType = getNothing().getDefaultType();
        if (defaultType != null) {
            return defaultType;
        }
        a(49);
        throw null;
    }

    @NotNull
    public SimpleType getNullableAnyType() {
        SimpleType simpleTypeMakeNullableAsSpecified = getAnyType().makeNullableAsSpecified(true);
        if (simpleTypeMakeNullableAsSpecified != null) {
            return simpleTypeMakeNullableAsSpecified;
        }
        a(52);
        throw null;
    }

    @NotNull
    public SimpleType getNullableNothingType() {
        SimpleType simpleTypeMakeNullableAsSpecified = getNothingType().makeNullableAsSpecified(true);
        if (simpleTypeMakeNullableAsSpecified != null) {
            return simpleTypeMakeNullableAsSpecified;
        }
        a(50);
        throw null;
    }

    @NotNull
    public ClassDescriptor getNumber() {
        return c("Number");
    }

    @NotNull
    public SimpleType getNumberType() {
        SimpleType defaultType = getNumber().getDefaultType();
        if (defaultType != null) {
            return defaultType;
        }
        a(56);
        throw null;
    }

    @NotNull
    public PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        PlatformDependentDeclarationFilter.NoPlatformDependent noPlatformDependent = PlatformDependentDeclarationFilter.NoPlatformDependent.INSTANCE;
        if (noPlatformDependent != null) {
            return noPlatformDependent;
        }
        a(4);
        throw null;
    }

    @NotNull
    public SimpleType getPrimitiveArrayKotlinType(@NotNull PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(74);
            throw null;
        }
        SimpleType simpleType = this.f80091b.invoke().f80100a.get(primitiveType);
        if (simpleType != null) {
            return simpleType;
        }
        a(75);
        throw null;
    }

    @NotNull
    public SimpleType getPrimitiveKotlinType(@NotNull PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(54);
            throw null;
        }
        if (primitiveType == null) {
            a(16);
            throw null;
        }
        SimpleType defaultType = c(primitiveType.getTypeName().asString()).getDefaultType();
        if (defaultType != null) {
            return defaultType;
        }
        a(55);
        throw null;
    }

    @NotNull
    public SimpleType getShortType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.SHORT);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        a(58);
        throw null;
    }

    @NotNull
    public StorageManager getStorageManager() {
        StorageManager storageManager = this.f80094e;
        if (storageManager != null) {
            return storageManager;
        }
        a(6);
        throw null;
    }

    @NotNull
    public ClassDescriptor getString() {
        return c("String");
    }

    @NotNull
    public SimpleType getStringType() {
        SimpleType defaultType = getString().getDefaultType();
        if (defaultType != null) {
            return defaultType;
        }
        a(66);
        throw null;
    }

    @NotNull
    public ClassDescriptor getSuspendFunction(int i10) {
        ClassDescriptor builtInClassByFqName = getBuiltInClassByFqName(StandardNames.COROUTINES_PACKAGE_FQ_NAME.child(Name.identifier(StandardNames.getSuspendFunctionName(i10))));
        if (builtInClassByFqName != null) {
            return builtInClassByFqName;
        }
        a(18);
        throw null;
    }

    @NotNull
    public ClassDescriptor getUnit() {
        return c("Unit");
    }

    @NotNull
    public SimpleType getUnitType() {
        SimpleType defaultType = getUnit().getDefaultType();
        if (defaultType != null) {
            return defaultType;
        }
        a(65);
        throw null;
    }

    public void setBuiltInsModule(@NotNull ModuleDescriptorImpl moduleDescriptorImpl) {
        if (moduleDescriptorImpl == null) {
            a(1);
            throw null;
        }
        this.f80094e.compute(new d(moduleDescriptorImpl));
    }

    public static boolean isArrayOrPrimitiveArray(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return isArray(kotlinType) || isPrimitiveArray(kotlinType);
        }
        a(91);
        throw null;
    }

    @NotNull
    public SimpleType getArrayType(@NotNull Variance variance, @NotNull KotlinType kotlinType) {
        if (variance == null) {
            a(83);
            throw null;
        }
        if (kotlinType != null) {
            SimpleType arrayType = getArrayType(variance, kotlinType, Annotations.Companion.getEMPTY());
            if (arrayType != null) {
                return arrayType;
            }
            a(85);
            throw null;
        }
        a(84);
        throw null;
    }
}
