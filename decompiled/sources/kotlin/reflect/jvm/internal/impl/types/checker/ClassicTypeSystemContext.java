package kotlin.reflect.jvm.internal.impl.types.checker;

import androidx.collection.k;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.DynamicType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextKt;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ClassicTypeSystemContext.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface ClassicTypeSystemContext extends TypeSystemCommonBackendContext, TypeSystemInferenceExtensionContext {
    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    CapturedTypeMarker asCapturedType(@NotNull SimpleTypeMarker simpleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    SimpleTypeMarker asSimpleType(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    KotlinTypeMarker createFlexibleType(@NotNull SimpleTypeMarker simpleTypeMarker, @NotNull SimpleTypeMarker simpleTypeMarker2);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    boolean isSingleClassifierType(@NotNull SimpleTypeMarker simpleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    SimpleTypeMarker lowerBound(@NotNull FlexibleTypeMarker flexibleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    TypeConstructorMarker typeConstructor(@NotNull SimpleTypeMarker simpleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    SimpleTypeMarker upperBound(@NotNull FlexibleTypeMarker flexibleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    SimpleTypeMarker withNullability(@NotNull SimpleTypeMarker simpleTypeMarker, boolean z10);

    /* JADX INFO: compiled from: ClassicTypeSystemContext.kt */
    @SourceDebugExtension({"SMAP\nClassicTypeSystemContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicTypeSystemContext.kt\norg/jetbrains/kotlin/types/checker/ClassicTypeSystemContext$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ClassicTypeSystemContext.kt\norg/jetbrains/kotlin/types/checker/ClassicTypeSystemContextKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n+ 6 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n*L\n1#1,964:1\n1#2:965\n958#3:966\n958#3:967\n958#3:968\n958#3:969\n958#3:970\n958#3:971\n958#3:972\n958#3:973\n958#3:974\n958#3:975\n958#3:976\n958#3:977\n958#3:978\n958#3:979\n958#3:980\n958#3:981\n958#3:982\n958#3:983\n958#3:984\n958#3:985\n958#3:986\n958#3:987\n958#3:988\n958#3:989\n958#3:990\n958#3:991\n958#3:992\n958#3:993\n958#3:994\n958#3:995\n958#3:996\n958#3:997\n958#3:998\n958#3:999\n958#3:1000\n958#3:1001\n958#3:1002\n958#3:1003\n958#3:1004\n958#3:1005\n958#3:1006\n958#3:1007\n958#3:1008\n958#3:1009\n958#3:1010\n958#3:1011\n958#3:1012\n958#3:1013\n958#3:1014\n958#3:1015\n958#3:1016\n958#3:1017\n958#3:1018\n958#3:1019\n958#3:1020\n958#3:1021\n958#3:1022\n958#3:1023\n958#3:1024\n958#3:1025\n958#3:1026\n958#3:1027\n958#3:1028\n958#3:1029\n958#3:1030\n958#3:1031\n958#3:1032\n958#3:1033\n958#3:1034\n958#3:1035\n958#3:1036\n958#3:1037\n958#3:1038\n958#3:1042\n958#3:1043\n958#3:1044\n958#3:1045\n958#3:1046\n958#3:1047\n958#3:1048\n958#3:1049\n958#3:1055\n958#3:1056\n958#3:1057\n958#3:1058\n958#3:1059\n958#3:1060\n958#3:1067\n958#3:1068\n958#3:1069\n958#3:1084\n958#3:1085\n958#3:1086\n958#3:1087\n958#3:1088\n958#3:1089\n958#3:1103\n958#3:1104\n958#3:1105\n958#3:1106\n958#3:1107\n958#3:1108\n958#3:1109\n958#3:1110\n958#3:1111\n958#3:1112\n958#3:1113\n958#3:1114\n958#3:1115\n958#3:1116\n958#3:1117\n958#3:1118\n958#3:1119\n958#3:1120\n958#3:1121\n958#3:1122\n958#3:1123\n958#3:1124\n958#3:1125\n958#3:1126\n958#3:1127\n958#3:1128\n819#4:1039\n847#4,2:1040\n766#4:1052\n857#4,2:1053\n1549#4:1063\n1620#4,3:1064\n1549#4:1070\n1620#4,3:1071\n2661#4,7:1074\n819#4:1081\n847#4,2:1082\n819#4:1090\n847#4,2:1091\n1549#4:1093\n1620#4,3:1094\n1271#4,2:1097\n1285#4,4:1099\n20#5,2:1050\n280#6,2:1061\n*S KotlinDebug\n*F\n+ 1 ClassicTypeSystemContext.kt\norg/jetbrains/kotlin/types/checker/ClassicTypeSystemContext$DefaultImpls\n*L\n41#1:966\n46#1:967\n59#1:968\n64#1:969\n70#1:970\n76#1:971\n81#1:972\n86#1:973\n91#1:974\n96#1:975\n101#1:976\n106#1:977\n111#1:978\n120#1:979\n126#1:980\n131#1:981\n136#1:982\n137#1:983\n142#1:984\n147#1:985\n152#1:986\n157#1:987\n166#1:988\n171#1:989\n176#1:990\n181#1:991\n189#1:992\n194#1:993\n199#1:994\n204#1:995\n209#1:996\n214#1:997\n219#1:998\n224#1:999\n229#1:1000\n234#1:1001\n235#1:1002\n240#1:1003\n246#1:1004\n251#1:1005\n256#1:1006\n261#1:1007\n266#1:1008\n271#1:1009\n276#1:1010\n281#1:1011\n286#1:1012\n291#1:1013\n292#1:1014\n298#1:1015\n299#1:1016\n304#1:1017\n309#1:1018\n314#1:1019\n320#1:1020\n328#1:1021\n334#1:1022\n339#1:1023\n344#1:1024\n349#1:1025\n354#1:1026\n359#1:1027\n373#1:1028\n383#1:1029\n388#1:1030\n414#1:1031\n419#1:1032\n424#1:1033\n425#1:1034\n465#1:1035\n471#1:1036\n476#1:1037\n481#1:1038\n487#1:1042\n492#1:1043\n509#1:1044\n515#1:1045\n520#1:1046\n525#1:1047\n532#1:1048\n543#1:1049\n566#1:1055\n571#1:1056\n576#1:1057\n583#1:1058\n588#1:1059\n594#1:1060\n600#1:1067\n622#1:1068\n623#1:1069\n679#1:1084\n684#1:1085\n689#1:1086\n694#1:1087\n699#1:1088\n704#1:1089\n742#1:1103\n747#1:1104\n752#1:1105\n757#1:1106\n762#1:1107\n767#1:1108\n772#1:1109\n777#1:1110\n782#1:1111\n787#1:1112\n792#1:1113\n797#1:1114\n802#1:1115\n807#1:1116\n812#1:1117\n817#1:1118\n822#1:1119\n827#1:1120\n832#1:1121\n841#1:1122\n842#1:1123\n853#1:1124\n858#1:1125\n863#1:1126\n894#1:1127\n901#1:1128\n482#1:1039\n482#1:1040,2\n551#1:1052\n551#1:1053,2\n596#1:1063\n596#1:1064,3\n665#1:1070\n665#1:1071,3\n665#1:1074,7\n671#1:1081\n671#1:1082,2\n705#1:1090\n705#1:1091,2\n730#1:1093\n730#1:1094,3\n731#1:1097,2\n731#1:1099,4\n545#1:1050,2\n596#1:1061,2\n*E\n"})
    public static final class DefaultImpls {
        public static boolean areEqualTypeConstructors(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker c10, @NotNull TypeConstructorMarker c11) {
            Intrinsics.checkNotNullParameter(c10, "c1");
            Intrinsics.checkNotNullParameter(c11, "c2");
            if (!(c10 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c10 + ", " + Reflection.getOrCreateKotlinClass(c10.getClass())).toString());
            }
            if (c11 instanceof TypeConstructor) {
                return Intrinsics.areEqual(c10, c11);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c11 + ", " + Reflection.getOrCreateKotlinClass(c11.getClass())).toString());
        }

        public static int argumentsCount(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).getArguments().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static TypeArgumentListMarker asArgumentList(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return (TypeArgumentListMarker) receiver;
            }
            StringBuilder sbD = k.d("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
            sbD.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
            throw new IllegalArgumentException(sbD.toString().toString());
        }

        @Nullable
        public static CapturedTypeMarker asCapturedType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (!(receiver instanceof SimpleType)) {
                StringBuilder sbD = k.d("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
                sbD.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
                throw new IllegalArgumentException(sbD.toString().toString());
            }
            if (receiver instanceof SimpleTypeWithEnhancement) {
                return classicTypeSystemContext.asCapturedType(((SimpleTypeWithEnhancement) receiver).getOrigin());
            }
            if (receiver instanceof NewCapturedType) {
                return (NewCapturedType) receiver;
            }
            return null;
        }

        @Nullable
        public static DefinitelyNotNullTypeMarker asDefinitelyNotNullType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                if (receiver instanceof DefinitelyNotNullType) {
                    return (DefinitelyNotNullType) receiver;
                }
                return null;
            }
            StringBuilder sbD = k.d("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
            sbD.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
            throw new IllegalArgumentException(sbD.toString().toString());
        }

        @Nullable
        public static DynamicTypeMarker asDynamicType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof FlexibleType) {
                if (receiver instanceof DynamicType) {
                    return (DynamicType) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static FlexibleTypeMarker asFlexibleType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                UnwrappedType unwrappedTypeUnwrap = ((KotlinType) receiver).unwrap();
                if (unwrappedTypeUnwrap instanceof FlexibleType) {
                    return (FlexibleType) unwrappedTypeUnwrap;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static SimpleTypeMarker asSimpleType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                UnwrappedType unwrappedTypeUnwrap = ((KotlinType) receiver).unwrap();
                if (unwrappedTypeUnwrap instanceof SimpleType) {
                    return (SimpleType) unwrappedTypeUnwrap;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static TypeArgumentMarker asTypeArgument(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return TypeUtilsKt.asTypeProjection((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static SimpleTypeMarker captureFromArguments(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker type, @NotNull CaptureStatus status) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(status, "status");
            if (type instanceof SimpleType) {
                return NewCapturedTypeKt.captureFromArguments((SimpleType) type, status);
            }
            StringBuilder sbD = k.d("ClassicTypeSystemContext couldn't handle: ", type, ", ");
            sbD.append(Reflection.getOrCreateKotlinClass(type.getClass()));
            throw new IllegalArgumentException(sbD.toString().toString());
        }

        @NotNull
        public static CaptureStatus captureStatus(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).getCaptureStatus();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static KotlinTypeMarker createFlexibleType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker lowerBound, @NotNull SimpleTypeMarker upperBound) {
            Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
            Intrinsics.checkNotNullParameter(upperBound, "upperBound");
            if (!(lowerBound instanceof SimpleType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + classicTypeSystemContext + ", " + Reflection.getOrCreateKotlinClass(classicTypeSystemContext.getClass())).toString());
            }
            if (upperBound instanceof SimpleType) {
                return KotlinTypeFactory.flexibleType((SimpleType) lowerBound, (SimpleType) upperBound);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + classicTypeSystemContext + ", " + Reflection.getOrCreateKotlinClass(classicTypeSystemContext.getClass())).toString());
        }

        @NotNull
        public static TypeArgumentMarker getArgument(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver, int i10) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).getArguments().get(i10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static List<TypeArgumentMarker> getArguments(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).getArguments();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static FqNameUnsafe getClassFqNameUnsafe(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = ((TypeConstructor) receiver).mo5778getDeclarationDescriptor();
                Intrinsics.checkNotNull(classifierDescriptorMo5778getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return DescriptorUtilsKt.getFqNameUnsafe((ClassDescriptor) classifierDescriptorMo5778getDeclarationDescriptor);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static TypeParameterMarker getParameter(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver, int i10) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                TypeParameterDescriptor typeParameterDescriptor = ((TypeConstructor) receiver).getParameters().get(i10);
                Intrinsics.checkNotNullExpressionValue(typeParameterDescriptor, "get(...)");
                return typeParameterDescriptor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static List<TypeParameterMarker> getParameters(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                List<TypeParameterDescriptor> parameters = ((TypeConstructor) receiver).getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                return parameters;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static PrimitiveType getPrimitiveArrayType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = ((TypeConstructor) receiver).mo5778getDeclarationDescriptor();
                Intrinsics.checkNotNull(classifierDescriptorMo5778getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return KotlinBuiltIns.getPrimitiveArrayType((ClassDescriptor) classifierDescriptorMo5778getDeclarationDescriptor);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static PrimitiveType getPrimitiveType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = ((TypeConstructor) receiver).mo5778getDeclarationDescriptor();
                Intrinsics.checkNotNull(classifierDescriptorMo5778getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return KotlinBuiltIns.getPrimitiveType((ClassDescriptor) classifierDescriptorMo5778getDeclarationDescriptor);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static KotlinTypeMarker getRepresentativeUpperBound(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeParameterDescriptor) {
                return TypeUtilsKt.getRepresentativeUpperBound((TypeParameterDescriptor) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static KotlinTypeMarker getType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeArgumentMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeProjection) {
                return ((TypeProjection) receiver).getType().unwrap();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static TypeParameterMarker getTypeParameter(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeVariableTypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof NewTypeVariableConstructor) {
                return ((NewTypeVariableConstructor) receiver).getOriginalTypeParameter();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static TypeParameterMarker getTypeParameterClassifier(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = ((TypeConstructor) receiver).mo5778getDeclarationDescriptor();
                if (classifierDescriptorMo5778getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                    return (TypeParameterDescriptor) classifierDescriptorMo5778getDeclarationDescriptor;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static KotlinTypeMarker getUnsubstitutedUnderlyingType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return InlineClassesUtilsKt.unsubstitutedUnderlyingType((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static List<KotlinTypeMarker> getUpperBounds(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeParameterDescriptor) {
                List<KotlinType> upperBounds = ((TypeParameterDescriptor) receiver).getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static TypeVariance getVariance(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeArgumentMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeProjection) {
                Variance projectionKind = ((TypeProjection) receiver).getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind, "getProjectionKind(...)");
                return TypeSystemContextKt.convertVariance(projectionKind);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean hasAnnotation(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver, @NotNull FqName fqName) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).getAnnotations().hasAnnotation(fqName);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean hasRecursiveBounds(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker receiver, @Nullable TypeConstructorMarker typeConstructorMarker) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (!(receiver instanceof TypeParameterDescriptor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
            }
            if (typeConstructorMarker == null || (typeConstructorMarker instanceof TypeConstructor)) {
                return TypeUtilsKt.hasTypeParameterRecursiveBounds$default((TypeParameterDescriptor) receiver, (TypeConstructor) typeConstructorMarker, null, 4, null);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean identicalArguments(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker a10, @NotNull SimpleTypeMarker b10) {
            Intrinsics.checkNotNullParameter(a10, "a");
            Intrinsics.checkNotNullParameter(b10, "b");
            if (!(a10 instanceof SimpleType)) {
                StringBuilder sbD = k.d("ClassicTypeSystemContext couldn't handle: ", a10, ", ");
                sbD.append(Reflection.getOrCreateKotlinClass(a10.getClass()));
                throw new IllegalArgumentException(sbD.toString().toString());
            }
            if (b10 instanceof SimpleType) {
                return ((SimpleType) a10).getArguments() == ((SimpleType) b10).getArguments();
            }
            StringBuilder sbD2 = k.d("ClassicTypeSystemContext couldn't handle: ", b10, ", ");
            sbD2.append(Reflection.getOrCreateKotlinClass(b10.getClass()));
            throw new IllegalArgumentException(sbD2.toString().toString());
        }

        @NotNull
        public static KotlinTypeMarker intersectTypes(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull List<? extends KotlinTypeMarker> types) {
            Intrinsics.checkNotNullParameter(types, "types");
            return IntersectionTypeKt.intersectTypes(types);
        }

        public static boolean isAnyConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return KotlinBuiltIns.isTypeConstructorForGivenClass((TypeConstructor) receiver, StandardNames.FqNames.any);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isClassTypeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).mo5778getDeclarationDescriptor() instanceof ClassDescriptor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isCommonFinalClassConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = ((TypeConstructor) receiver).mo5778getDeclarationDescriptor();
                ClassDescriptor classDescriptor = classifierDescriptorMo5778getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo5778getDeclarationDescriptor : null;
                return (classDescriptor == null || !ModalityUtilsKt.isFinalClass(classDescriptor) || classDescriptor.getKind() == ClassKind.ENUM_ENTRY || classDescriptor.getKind() == ClassKind.ANNOTATION_CLASS) ? false : true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isDenotable(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).isDenotable();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isError(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return KotlinTypeKt.isError((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isInlineClass(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = ((TypeConstructor) receiver).mo5778getDeclarationDescriptor();
                ClassDescriptor classDescriptor = classifierDescriptorMo5778getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo5778getDeclarationDescriptor : null;
                return (classDescriptor != null ? classDescriptor.getValueClassRepresentation() : null) instanceof InlineClassRepresentation;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isIntegerLiteralTypeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return receiver instanceof IntegerLiteralTypeConstructor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isIntersection(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return receiver instanceof IntersectionTypeConstructor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isMarkedNullable(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return ((SimpleType) receiver).isMarkedNullable();
            }
            StringBuilder sbD = k.d("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
            sbD.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
            throw new IllegalArgumentException(sbD.toString().toString());
        }

        public static boolean isNotNullTypeParameter(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return receiver instanceof NotNullTypeParameter;
        }

        public static boolean isNothingConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return KotlinBuiltIns.isTypeConstructorForGivenClass((TypeConstructor) receiver, StandardNames.FqNames.nothing);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isNullableType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return TypeUtils.isNullableType((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isOldCapturedType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return receiver instanceof CapturedType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isPrimitiveType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return KotlinBuiltIns.isPrimitiveType((KotlinType) receiver);
            }
            StringBuilder sbD = k.d("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
            sbD.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
            throw new IllegalArgumentException(sbD.toString().toString());
        }

        public static boolean isProjectionNotNull(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).isProjectionNotNull();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isRawType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return receiver instanceof RawType;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isSingleClassifierType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (!(receiver instanceof SimpleType)) {
                StringBuilder sbD = k.d("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
                sbD.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
                throw new IllegalArgumentException(sbD.toString().toString());
            }
            if (!KotlinTypeKt.isError((KotlinType) receiver)) {
                SimpleType simpleType = (SimpleType) receiver;
                if (!(simpleType.getConstructor().mo5778getDeclarationDescriptor() instanceof TypeAliasDescriptor) && (simpleType.getConstructor().mo5778getDeclarationDescriptor() != null || (receiver instanceof CapturedType) || (receiver instanceof NewCapturedType) || (receiver instanceof DefinitelyNotNullType) || (simpleType.getConstructor() instanceof IntegerLiteralTypeConstructor) || ((receiver instanceof SimpleTypeWithEnhancement) && classicTypeSystemContext.isSingleClassifierType(((SimpleTypeWithEnhancement) receiver).getOrigin())))) {
                    return true;
                }
            }
            return false;
        }

        public static boolean isStarProjection(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeArgumentMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeProjection) {
                return ((TypeProjection) receiver).isStarProjection();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isStubType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return TypeUtilsKt.isStubType((KotlinType) receiver);
            }
            StringBuilder sbD = k.d("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
            sbD.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
            throw new IllegalArgumentException(sbD.toString().toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isStubTypeForBuilderInference(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return TypeUtilsKt.isStubTypeForBuilderInference((KotlinType) receiver);
            }
            StringBuilder sbD = k.d("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
            sbD.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
            throw new IllegalArgumentException(sbD.toString().toString());
        }

        public static boolean isTypeVariableType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (receiver instanceof UnwrappedType) && (((UnwrappedType) receiver).getConstructor() instanceof NewTypeVariableConstructor);
        }

        public static boolean isUnderKotlinPackage(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = ((TypeConstructor) receiver).mo5778getDeclarationDescriptor();
                return classifierDescriptorMo5778getDeclarationDescriptor != null && KotlinBuiltIns.isUnderKotlinPackage(classifierDescriptorMo5778getDeclarationDescriptor);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static SimpleTypeMarker lowerBound(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof FlexibleType) {
                return ((FlexibleType) receiver).getLowerBound();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @Nullable
        public static KotlinTypeMarker lowerType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).getLowerType();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static KotlinTypeMarker makeDefinitelyNotNullOrNotNull(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof UnwrappedType) {
                return SpecialTypesKt.makeDefinitelyNotNullOrNotNull$default((UnwrappedType) receiver, false, 1, null);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static TypeCheckerState newTypeCheckerState(@NotNull ClassicTypeSystemContext classicTypeSystemContext, boolean z10, boolean z11) {
            return ClassicTypeCheckerStateKt.createClassicTypeCheckerState$default(z10, z11, classicTypeSystemContext, null, null, 24, null);
        }

        @NotNull
        public static SimpleTypeMarker original(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull DefinitelyNotNullTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof DefinitelyNotNullType) {
                return ((DefinitelyNotNullType) receiver).getOriginal();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static int parametersCount(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static Collection<KotlinTypeMarker> possibleIntegerTypes(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            TypeConstructorMarker typeConstructorMarkerTypeConstructor = classicTypeSystemContext.typeConstructor(receiver);
            if (typeConstructorMarkerTypeConstructor instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor) typeConstructorMarkerTypeConstructor).getPossibleTypes();
            }
            StringBuilder sbD = k.d("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
            sbD.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
            throw new IllegalArgumentException(sbD.toString().toString());
        }

        @NotNull
        public static TypeArgumentMarker projection(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof NewCapturedTypeConstructor) {
                return ((NewCapturedTypeConstructor) receiver).getProjection();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static TypeCheckerState.SupertypesPolicy substitutionSupertypePolicy(@NotNull final ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (type instanceof SimpleType) {
                final TypeSubstitutor typeSubstitutorBuildSubstitutor = TypeConstructorSubstitution.Companion.create((KotlinType) type).buildSubstitutor();
                return new TypeCheckerState.SupertypesPolicy.DoCustomTransform() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext$substitutionSupertypePolicy$2
                    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
                    @NotNull
                    /* JADX INFO: renamed from: transformType */
                    public SimpleTypeMarker mo5781transformType(@NotNull TypeCheckerState state, @NotNull KotlinTypeMarker type2) {
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(type2, "type");
                        ClassicTypeSystemContext classicTypeSystemContext2 = classicTypeSystemContext;
                        Object objLowerBoundIfFlexible = classicTypeSystemContext2.lowerBoundIfFlexible(type2);
                        Intrinsics.checkNotNull(objLowerBoundIfFlexible, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                        Variance variance = Variance.INVARIANT;
                        KotlinType kotlinTypeSafeSubstitute = typeSubstitutorBuildSubstitutor.safeSubstitute((KotlinType) objLowerBoundIfFlexible, variance);
                        Intrinsics.checkNotNullExpressionValue(kotlinTypeSafeSubstitute, "safeSubstitute(...)");
                        SimpleTypeMarker simpleTypeMarkerAsSimpleType = classicTypeSystemContext2.asSimpleType(kotlinTypeSafeSubstitute);
                        Intrinsics.checkNotNull(simpleTypeMarkerAsSimpleType);
                        return simpleTypeMarkerAsSimpleType;
                    }
                };
            }
            StringBuilder sbD = k.d("ClassicTypeSystemContext couldn't handle: ", type, ", ");
            sbD.append(Reflection.getOrCreateKotlinClass(type.getClass()));
            throw new IllegalArgumentException(sbD.toString().toString());
        }

        @NotNull
        public static Collection<KotlinTypeMarker> supertypes(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                Collection<KotlinType> supertypes = ((TypeConstructor) receiver).getSupertypes();
                Intrinsics.checkNotNullExpressionValue(supertypes, "getSupertypes(...)");
                return supertypes;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static TypeConstructorMarker typeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return ((SimpleType) receiver).getConstructor();
            }
            StringBuilder sbD = k.d("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
            sbD.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
            throw new IllegalArgumentException(sbD.toString().toString());
        }

        @NotNull
        public static SimpleTypeMarker upperBound(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof FlexibleType) {
                return ((FlexibleType) receiver).getUpperBound();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static SimpleTypeMarker withNullability(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker receiver, boolean z10) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return ((SimpleType) receiver).makeNullableAsSpecified(z10);
            }
            StringBuilder sbD = k.d("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
            sbD.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
            throw new IllegalArgumentException(sbD.toString().toString());
        }

        @NotNull
        public static TypeVariance getVariance(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof TypeParameterDescriptor) {
                Variance variance = ((TypeParameterDescriptor) receiver).getVariance();
                Intrinsics.checkNotNullExpressionValue(variance, "getVariance(...)");
                return TypeSystemContextKt.convertVariance(variance);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static CapturedTypeConstructorMarker typeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).getConstructor();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        @NotNull
        public static KotlinTypeMarker withNullability(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker receiver, boolean z10) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof SimpleTypeMarker) {
                return classicTypeSystemContext.withNullability((SimpleTypeMarker) receiver, z10);
            }
            if (!(receiver instanceof FlexibleTypeMarker)) {
                throw new IllegalStateException("sealed".toString());
            }
            FlexibleTypeMarker flexibleTypeMarker = (FlexibleTypeMarker) receiver;
            return classicTypeSystemContext.createFlexibleType(classicTypeSystemContext.withNullability(classicTypeSystemContext.lowerBound(flexibleTypeMarker), z10), classicTypeSystemContext.withNullability(classicTypeSystemContext.upperBound(flexibleTypeMarker), z10));
        }
    }
}
