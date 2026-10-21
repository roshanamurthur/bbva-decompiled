package kotlin.reflect.jvm.internal.impl.resolve;

import com.bbva.tohu.android.product.valkyria.sdk.constants.NotifyProvisionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class OverridingUtil {
    public static final OverridingUtil DEFAULT;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<ExternalOverridabilityCondition> f81510e = CollectionsKt___CollectionsKt.toList(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f81511f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KotlinTypeRefiner f81512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KotlinTypePreparator f81513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KotlinTypeChecker.TypeConstructorEquality f81514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function2<KotlinType, KotlinType, Boolean> f81515d;

    public static class OverrideCompatibilityInfo {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final OverrideCompatibilityInfo f81516b = new OverrideCompatibilityInfo(Result.OVERRIDABLE, NotifyProvisionResult.SUCCESS_RESULT);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Result f81517a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Result {
            private static final /* synthetic */ Result[] $VALUES;
            public static final Result CONFLICT;
            public static final Result INCOMPATIBLE;
            public static final Result OVERRIDABLE;

            static {
                Result result = new Result("OVERRIDABLE", 0);
                OVERRIDABLE = result;
                Result result2 = new Result("INCOMPATIBLE", 1);
                INCOMPATIBLE = result2;
                Result result3 = new Result("CONFLICT", 2);
                CONFLICT = result3;
                $VALUES = new Result[]{result, result2, result3};
            }

            public Result() {
                throw null;
            }

            public static Result valueOf(String str) {
                return (Result) Enum.valueOf(Result.class, str);
            }

            public static Result[] values() {
                return (Result[]) $VALUES.clone();
            }
        }

        public OverrideCompatibilityInfo(@NotNull Result result, @NotNull String str) {
            if (result == null) {
                a(3);
                throw null;
            }
            if (str != null) {
                this.f81517a = result;
            } else {
                a(4);
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0031  */
        public static /* synthetic */ void a(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 3 : 2];
            if (i10 == 1 || i10 == 2) {
                objArr[0] = "debugMessage";
            } else if (i10 == 3) {
                objArr[0] = "success";
            } else if (i10 != 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
            } else {
                objArr[0] = "debugMessage";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    break;
                case 5:
                    objArr[1] = "getResult";
                    break;
                case 6:
                    objArr[1] = "getDebugMessage";
                    break;
                default:
                    objArr[1] = "success";
                    break;
            }
            if (i10 == 1) {
                objArr[2] = "incompatible";
            } else if (i10 == 2) {
                objArr[2] = "conflict";
            } else if (i10 == 3 || i10 == 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
                throw new IllegalStateException(str2);
            }
            throw new IllegalArgumentException(str2);
        }

        @NotNull
        public static OverrideCompatibilityInfo conflict(@NotNull String str) {
            if (str != null) {
                return new OverrideCompatibilityInfo(Result.CONFLICT, str);
            }
            a(2);
            throw null;
        }

        @NotNull
        public static OverrideCompatibilityInfo incompatible(@NotNull String str) {
            if (str != null) {
                return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, str);
            }
            a(1);
            throw null;
        }

        @NotNull
        public static OverrideCompatibilityInfo success() {
            OverrideCompatibilityInfo overrideCompatibilityInfo = f81516b;
            if (overrideCompatibilityInfo != null) {
                return overrideCompatibilityInfo;
            }
            a(0);
            throw null;
        }

        @NotNull
        public Result getResult() {
            Result result = this.f81517a;
            if (result != null) {
                return result;
            }
            a(5);
            throw null;
        }
    }

    public static class a implements KotlinTypeChecker.TypeConstructorEquality {
        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
        public boolean equals(@NotNull TypeConstructor typeConstructor, @NotNull TypeConstructor typeConstructor2) {
            if (typeConstructor == null) {
                a(0);
                throw null;
            }
            if (typeConstructor2 != null) {
                return typeConstructor.equals(typeConstructor2);
            }
            a(1);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    public static class b<D> implements Function2<D, D, Pair<CallableDescriptor, CallableDescriptor>> {
        /* JADX WARN: Incorrect types in method signature: (TD;TD;)Lkotlin/Pair<Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;>; */
        @Override // kotlin.jvm.functions.Function2
        public Pair invoke(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
            return new Pair(callableDescriptor, callableDescriptor2);
        }
    }

    public static class c implements Function1<CallableMemberDescriptor, CallableDescriptor> {
        @Override // kotlin.jvm.functions.Function1
        public CallableMemberDescriptor invoke(CallableMemberDescriptor callableMemberDescriptor) {
            return callableMemberDescriptor;
        }
    }

    public static class d implements Function1<CallableMemberDescriptor, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ClassDescriptor f81518p0;

        public d(ClassDescriptor classDescriptor) {
            this.f81518p0 = classDescriptor;
        }

        @Override // kotlin.jvm.functions.Function1
        public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
            boolean z10 = false;
            if (!DescriptorVisibilities.isPrivate(callableMemberDescriptor.getVisibility()) && DescriptorVisibilities.isVisibleIgnoringReceiver(callableMemberDescriptor, this.f81518p0, false)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f81520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f81521c;

        static {
            int[] iArr = new int[Modality.values().length];
            f81521c = iArr;
            try {
                iArr[Modality.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81521c[Modality.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81521c[Modality.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f81521c[Modality.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[OverrideCompatibilityInfo.Result.values().length];
            f81520b = iArr2;
            try {
                iArr2[OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f81520b[OverrideCompatibilityInfo.Result.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f81520b[OverrideCompatibilityInfo.Result.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[ExternalOverridabilityCondition.Result.values().length];
            f81519a = iArr3;
            try {
                iArr3[ExternalOverridabilityCondition.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f81519a[ExternalOverridabilityCondition.Result.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f81519a[ExternalOverridabilityCondition.Result.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f81519a[ExternalOverridabilityCondition.Result.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static {
        a aVar = new a();
        f81511f = aVar;
        DEFAULT = new OverridingUtil(aVar, KotlinTypeRefiner.Default.INSTANCE, KotlinTypePreparator.Default.INSTANCE);
    }

    public OverridingUtil(@NotNull KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality, @NotNull KotlinTypeRefiner kotlinTypeRefiner, @NotNull KotlinTypePreparator.Default r4) {
        if (typeConstructorEquality == null) {
            a(5);
            throw null;
        }
        if (kotlinTypeRefiner == null) {
            a(6);
            throw null;
        }
        if (r4 == null) {
            a(7);
            throw null;
        }
        this.f81514c = typeConstructorEquality;
        this.f81512a = kotlinTypeRefiner;
        this.f81513b = r4;
        this.f81515d = null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
            switch (i10) {
                default:
                    switch (i10) {
                        default:
                            switch (i10) {
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
            switch (i10) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    i11 = 2;
                    break;
                default:
                    switch (i10) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            i11 = 2;
                            break;
                        default:
                            switch (i10) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    i11 = 2;
                                    break;
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            i11 = 2;
                                            break;
                                        default:
                                            i11 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 44:
            case 45:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case 103:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case 30:
            case 40:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 31:
            case 41:
                objArr[0] = "subDescriptor";
                break;
            case 42:
                objArr[0] = "firstParameters";
                break;
            case 43:
                objArr[0] = "secondParameters";
                break;
            case 46:
                objArr[0] = "typeInSuper";
                break;
            case 47:
                objArr[0] = "typeInSub";
                break;
            case 48:
            case 51:
            case 77:
                objArr[0] = "typeCheckerState";
                break;
            case 49:
                objArr[0] = "superTypeParameter";
                break;
            case 50:
                objArr[0] = "subTypeParameter";
                break;
            case 52:
                objArr[0] = "name";
                break;
            case 53:
                objArr[0] = "membersFromSupertypes";
                break;
            case 54:
                objArr[0] = "membersFromCurrent";
                break;
            case 55:
            case 61:
            case 64:
            case 86:
            case 89:
            case 96:
                objArr[0] = "current";
                break;
            case 56:
            case 62:
            case 66:
            case 87:
            case 106:
                objArr[0] = "strategy";
                break;
            case 57:
                objArr[0] = "overriding";
                break;
            case 58:
                objArr[0] = "fromSuper";
                break;
            case 59:
                objArr[0] = "fromCurrent";
                break;
            case 60:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 63:
            case 65:
                objArr[0] = "notOverridden";
                break;
            case 67:
            case 69:
            case 73:
                objArr[0] = "a";
                break;
            case 68:
            case 70:
            case 75:
                objArr[0] = "b";
                break;
            case 71:
                objArr[0] = "candidate";
                break;
            case 72:
            case 88:
            case 93:
            case 109:
                objArr[0] = "descriptors";
                break;
            case 74:
                objArr[0] = "aReturnType";
                break;
            case 76:
                objArr[0] = "bReturnType";
                break;
            case 78:
            case 85:
                objArr[0] = "overridables";
                break;
            case 79:
            case 101:
                objArr[0] = "descriptorByHandle";
                break;
            case 94:
                objArr[0] = "classModality";
                break;
            case 97:
                objArr[0] = "toFilter";
                break;
            case 99:
            case 104:
                objArr[0] = "overrider";
                break;
            case 100:
            case 105:
                objArr[0] = "extractFrom";
                break;
            case 102:
                objArr[0] = "onConflict";
                break;
            case 107:
            case 108:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i10 == 11 || i10 == 12) {
            objArr[1] = "filterOverrides";
        } else if (i10 == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i10 == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i10 == 95) {
            objArr[1] = "getMinimalModality";
        } else if (i10 == 98) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i10 == 103) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i10 != 44 && i10 != 45) {
            switch (i10) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i10) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i10) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i10) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 44:
            case 45:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case 103:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case 30:
            case 31:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 40:
            case 41:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 42:
            case 43:
                objArr[2] = "createTypeCheckerState";
                break;
            case 46:
            case 47:
            case 48:
                objArr[2] = "areTypesEquivalent";
                break;
            case 49:
            case 50:
            case 51:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 57:
            case 58:
                objArr[2] = "isVisibleForOverride";
                break;
            case 59:
            case 60:
            case 61:
            case 62:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 63:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 64:
            case 65:
            case 66:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 67:
            case 68:
                objArr[2] = "isMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 71:
            case 72:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 78:
            case 79:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 85:
            case 86:
            case 87:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 88:
            case 89:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 93:
            case 94:
                objArr[2] = "getMinimalModality";
                break;
            case 96:
            case 97:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 99:
            case 100:
            case 101:
            case 102:
            case 104:
            case 105:
            case 106:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 107:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 108:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 109:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
            switch (i10) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
                default:
                    switch (i10) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (i10) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    break;
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull TypeCheckerState typeCheckerState) {
        if (kotlinType == null) {
            a(46);
            throw null;
        }
        if (kotlinType2 == null) {
            a(47);
            throw null;
        }
        if (typeCheckerState == null) {
            a(48);
            throw null;
        }
        if (KotlinTypeKt.isError(kotlinType) && KotlinTypeKt.isError(kotlinType2)) {
            return true;
        }
        return AbstractTypeChecker.INSTANCE.equalTypes(typeCheckerState, kotlinType.unwrap(), kotlinType2.unwrap());
    }

    public static void c(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull LinkedHashSet linkedHashSet) {
        if (callableMemberDescriptor == null) {
            a(17);
            throw null;
        }
        if (callableMemberDescriptor.getKind().isReal()) {
            linkedHashSet.add(callableMemberDescriptor);
            return;
        }
        if (callableMemberDescriptor.getOverriddenDescriptors().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + callableMemberDescriptor);
        }
        Iterator<? extends CallableMemberDescriptor> it = callableMemberDescriptor.getOverriddenDescriptors().iterator();
        while (it.hasNext()) {
            c(it.next(), linkedHashSet);
        }
    }

    @NotNull
    public static OverridingUtil create(@NotNull KotlinTypeRefiner kotlinTypeRefiner, @NotNull KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality) {
        if (kotlinTypeRefiner == null) {
            a(3);
            throw null;
        }
        if (typeConstructorEquality != null) {
            return new OverridingUtil(typeConstructorEquality, kotlinTypeRefiner, KotlinTypePreparator.Default.INSTANCE);
        }
        a(4);
        throw null;
    }

    @NotNull
    public static OverridingUtil createWithTypeRefiner(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner != null) {
            return new OverridingUtil(f81511f, kotlinTypeRefiner, KotlinTypePreparator.Default.INSTANCE);
        }
        a(0);
        throw null;
    }

    public static ArrayList d(CallableDescriptor callableDescriptor) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        ArrayList arrayList = new ArrayList();
        if (extensionReceiverParameter != null) {
            arrayList.add(extensionReceiverParameter.getType());
        }
        Iterator<ValueParameterDescriptor> it = callableDescriptor.getValueParameters().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    public static void e(@NotNull Collection<CallableMemberDescriptor> collection, @NotNull ClassDescriptor classDescriptor, @NotNull OverridingStrategy overridingStrategy) {
        Modality modality;
        Modality modality2;
        if (collection == null) {
            a(85);
            throw null;
        }
        if (classDescriptor == null) {
            a(86);
            throw null;
        }
        if (overridingStrategy == null) {
            a(87);
            throw null;
        }
        Collection<CallableMemberDescriptor> collectionFilterVisibleFakeOverrides = filterVisibleFakeOverrides(classDescriptor, collection);
        boolean zIsEmpty = collectionFilterVisibleFakeOverrides.isEmpty();
        if (!zIsEmpty) {
            collection = collectionFilterVisibleFakeOverrides;
        }
        if (collection == null) {
            a(88);
            throw null;
        }
        if (classDescriptor == null) {
            a(89);
            throw null;
        }
        Iterator<CallableMemberDescriptor> it = collection.iterator();
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            if (it.hasNext()) {
                CallableMemberDescriptor next = it.next();
                int i10 = e.f81521c[next.getModality().ordinal()];
                if (i10 == 1) {
                    modality2 = Modality.FINAL;
                    if (modality2 == null) {
                        a(90);
                        throw null;
                    }
                } else {
                    if (i10 == 2) {
                        throw new IllegalStateException("Member cannot have SEALED modality: " + next);
                    }
                    if (i10 == 3) {
                        z11 = true;
                    } else if (i10 == 4) {
                        z12 = true;
                    }
                }
            } else {
                if (classDescriptor.isExpect() && classDescriptor.getModality() != Modality.ABSTRACT && classDescriptor.getModality() != Modality.SEALED) {
                    z10 = true;
                }
                if (z11 && !z12) {
                    modality2 = Modality.OPEN;
                    if (modality2 == null) {
                        a(91);
                        throw null;
                    }
                } else {
                    if (z11 || !z12) {
                        HashSet hashSet = new HashSet();
                        Iterator<CallableMemberDescriptor> it2 = collection.iterator();
                        while (it2.hasNext()) {
                            hashSet.addAll(getOverriddenDeclarations(it2.next()));
                        }
                        Set<CallableMemberDescriptor> setFilterOutOverridden = filterOutOverridden(hashSet);
                        Modality modality3 = classDescriptor.getModality();
                        if (setFilterOutOverridden == null) {
                            a(93);
                            throw null;
                        }
                        if (modality3 == null) {
                            a(94);
                            throw null;
                        }
                        Modality modality4 = Modality.ABSTRACT;
                        for (CallableMemberDescriptor callableMemberDescriptor : setFilterOutOverridden) {
                            Modality modality5 = (z10 && callableMemberDescriptor.getModality() == Modality.ABSTRACT) ? modality3 : callableMemberDescriptor.getModality();
                            if (modality5.compareTo(modality4) < 0) {
                                modality4 = modality5;
                            }
                        }
                        if (modality4 != null) {
                            modality = modality4;
                            break;
                        } else {
                            a(95);
                            throw null;
                        }
                    }
                    modality2 = z10 ? classDescriptor.getModality() : Modality.ABSTRACT;
                    if (modality2 == null) {
                        a(92);
                        throw null;
                    }
                }
            }
            modality = modality2;
            break;
        }
        CallableMemberDescriptor callableMemberDescriptorCopy = ((CallableMemberDescriptor) selectMostSpecificMember(collection, new c())).copy(classDescriptor, modality, zIsEmpty ? DescriptorVisibilities.INVISIBLE_FAKE : DescriptorVisibilities.INHERITED, CallableMemberDescriptor.Kind.FAKE_OVERRIDE, false);
        overridingStrategy.setOverriddenDescriptors(callableMemberDescriptorCopy, collection);
        overridingStrategy.addFakeOverride(callableMemberDescriptorCopy);
    }

    @NotNull
    public static <H> Collection<H> extractMembersOverridableInBothWays(@NotNull H h4, @NotNull Collection<H> collection, @NotNull Function1<H, CallableDescriptor> function1, @NotNull Function1<H, Unit> function2) {
        if (h4 == null) {
            a(99);
            throw null;
        }
        if (collection == null) {
            a(100);
            throw null;
        }
        if (function1 == null) {
            a(101);
            throw null;
        }
        if (function2 == null) {
            a(102);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h4);
        CallableDescriptor callableDescriptorInvoke = function1.invoke(h4);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            CallableDescriptor callableDescriptorInvoke2 = function1.invoke(next);
            if (h4 == next) {
                it.remove();
            } else {
                OverrideCompatibilityInfo.Result bothWaysOverridability = getBothWaysOverridability(callableDescriptorInvoke, callableDescriptorInvoke2);
                if (bothWaysOverridability == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (bothWaysOverridability == OverrideCompatibilityInfo.Result.CONFLICT) {
                    function2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public static <D extends CallableDescriptor> Set<D> filterOutOverridden(@NotNull Set<D> set) {
        if (set != null) {
            return filterOverrides(set, !set.isEmpty() && DescriptorUtilsKt.isTypeRefinementEnabled(DescriptorUtilsKt.getModule(set.iterator().next())), null, new b());
        }
        a(8);
        throw null;
    }

    @NotNull
    public static <D> Set<D> filterOverrides(@NotNull Set<D> set, boolean z10, @Nullable Function0<?> function0, @NotNull Function2<? super D, ? super D, Pair<CallableDescriptor, CallableDescriptor>> function2) {
        if (set == null) {
            a(9);
            throw null;
        }
        if (function2 == null) {
            a(10);
            throw null;
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (function0 != null) {
                function0.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                Pair<CallableDescriptor, CallableDescriptor> pairInvoke = function2.invoke(obj, (Object) it.next());
                CallableDescriptor callableDescriptorComponent1 = pairInvoke.component1();
                CallableDescriptor callableDescriptorComponent2 = pairInvoke.component2();
                if (!overrides(callableDescriptorComponent1, callableDescriptorComponent2, z10, true)) {
                    if (overrides(callableDescriptorComponent2, callableDescriptorComponent1, z10, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    @NotNull
    public static Collection<CallableMemberDescriptor> filterVisibleFakeOverrides(@NotNull ClassDescriptor classDescriptor, @NotNull Collection<CallableMemberDescriptor> collection) {
        if (classDescriptor == null) {
            a(96);
            throw null;
        }
        if (collection == null) {
            a(97);
            throw null;
        }
        List listFilter = CollectionsKt___CollectionsKt.filter(collection, new d(classDescriptor));
        if (listFilter != null) {
            return listFilter;
        }
        a(98);
        throw null;
    }

    @Nullable
    public static DescriptorVisibility findMaxVisibility(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        DescriptorVisibility descriptorVisibility;
        if (collection == null) {
            a(109);
            throw null;
        }
        if (collection.isEmpty()) {
            return DescriptorVisibilities.DEFAULT_VISIBILITY;
        }
        Iterator<? extends CallableMemberDescriptor> it = collection.iterator();
        loop0: while (true) {
            descriptorVisibility = null;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                DescriptorVisibility visibility = it.next().getVisibility();
                if (descriptorVisibility != null) {
                    Integer numCompare = DescriptorVisibilities.compare(visibility, descriptorVisibility);
                    if (numCompare == null) {
                        break;
                    }
                    if (numCompare.intValue() > 0) {
                    }
                }
                descriptorVisibility = visibility;
            }
        }
        if (descriptorVisibility == null) {
            return null;
        }
        Iterator<? extends CallableMemberDescriptor> it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer numCompare2 = DescriptorVisibilities.compare(descriptorVisibility, it2.next().getVisibility());
            if (numCompare2 == null || numCompare2.intValue() < 0) {
                return null;
            }
        }
        return descriptorVisibility;
    }

    public static boolean g(@NotNull CallableDescriptor callableDescriptor, @NotNull KotlinType kotlinType, @NotNull CallableDescriptor callableDescriptor2, @NotNull KotlinType kotlinType2, @NotNull TypeCheckerState typeCheckerState) {
        if (callableDescriptor == null) {
            a(73);
            throw null;
        }
        if (kotlinType == null) {
            a(74);
            throw null;
        }
        if (callableDescriptor2 == null) {
            a(75);
            throw null;
        }
        if (kotlinType2 == null) {
            a(76);
            throw null;
        }
        if (typeCheckerState != null) {
            return AbstractTypeChecker.INSTANCE.isSubtypeOf(typeCheckerState, kotlinType.unwrap(), kotlinType2.unwrap());
        }
        a(77);
        throw null;
    }

    @Nullable
    public static OverrideCompatibilityInfo getBasicOverridabilityProblem(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2) {
        boolean z10;
        OverrideCompatibilityInfo overrideCompatibilityInfoIncompatible;
        if (callableDescriptor == null) {
            a(40);
            throw null;
        }
        if (callableDescriptor2 == null) {
            a(41);
            throw null;
        }
        boolean z11 = callableDescriptor instanceof FunctionDescriptor;
        if ((z11 && !(callableDescriptor2 instanceof FunctionDescriptor)) || (((z10 = callableDescriptor instanceof PropertyDescriptor)) && !(callableDescriptor2 instanceof PropertyDescriptor))) {
            return OverrideCompatibilityInfo.incompatible("Member kind mismatch");
        }
        if (!z11 && !z10) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + callableDescriptor);
        }
        if (!callableDescriptor.getName().equals(callableDescriptor2.getName())) {
            return OverrideCompatibilityInfo.incompatible("Name mismatch");
        }
        if ((callableDescriptor.getExtensionReceiverParameter() == null) != (callableDescriptor2.getExtensionReceiverParameter() == null)) {
            overrideCompatibilityInfoIncompatible = OverrideCompatibilityInfo.incompatible("Receiver presence mismatch");
        } else {
            overrideCompatibilityInfoIncompatible = callableDescriptor.getValueParameters().size() != callableDescriptor2.getValueParameters().size() ? OverrideCompatibilityInfo.incompatible("Value parameter number mismatch") : null;
        }
        if (overrideCompatibilityInfoIncompatible != null) {
            return overrideCompatibilityInfoIncompatible;
        }
        return null;
    }

    @Nullable
    public static OverrideCompatibilityInfo.Result getBothWaysOverridability(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        OverridingUtil overridingUtil = DEFAULT;
        OverrideCompatibilityInfo.Result result = overridingUtil.isOverridableBy(callableDescriptor2, callableDescriptor, null).getResult();
        OverrideCompatibilityInfo.Result result2 = overridingUtil.isOverridableBy(callableDescriptor, callableDescriptor2, null).getResult();
        OverrideCompatibilityInfo.Result result3 = OverrideCompatibilityInfo.Result.OVERRIDABLE;
        if (result == result3 && result2 == result3) {
            return result3;
        }
        OverrideCompatibilityInfo.Result result4 = OverrideCompatibilityInfo.Result.CONFLICT;
        return (result == result4 || result2 == result4) ? result4 : OverrideCompatibilityInfo.Result.INCOMPATIBLE;
    }

    @NotNull
    public static Set<CallableMemberDescriptor> getOverriddenDeclarations(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            a(15);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c(callableMemberDescriptor, linkedHashSet);
        return linkedHashSet;
    }

    public static boolean h(@NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2) {
        if (declarationDescriptorWithVisibility == null) {
            a(69);
            throw null;
        }
        if (declarationDescriptorWithVisibility2 != null) {
            Integer numCompare = DescriptorVisibilities.compare(declarationDescriptorWithVisibility.getVisibility(), declarationDescriptorWithVisibility2.getVisibility());
            return numCompare == null || numCompare.intValue() >= 0;
        }
        a(70);
        throw null;
    }

    public static boolean isMoreSpecific(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2) {
        if (callableDescriptor == null) {
            a(67);
            throw null;
        }
        if (callableDescriptor2 == null) {
            a(68);
            throw null;
        }
        KotlinType returnType = callableDescriptor.getReturnType();
        KotlinType returnType2 = callableDescriptor2.getReturnType();
        if (!h(callableDescriptor, callableDescriptor2)) {
            return false;
        }
        TypeCheckerState typeCheckerStateF = DEFAULT.f(callableDescriptor.getTypeParameters(), callableDescriptor2.getTypeParameters());
        if (callableDescriptor instanceof FunctionDescriptor) {
            return g(callableDescriptor, returnType, callableDescriptor2, returnType2, typeCheckerStateF);
        }
        if (!(callableDescriptor instanceof PropertyDescriptor)) {
            throw new IllegalArgumentException("Unexpected callable: " + callableDescriptor.getClass());
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) callableDescriptor;
        PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) callableDescriptor2;
        PropertySetterDescriptor setter = propertyDescriptor.getSetter();
        PropertySetterDescriptor setter2 = propertyDescriptor2.getSetter();
        if (setter != null && setter2 != null && !h(setter, setter2)) {
            return false;
        }
        if (propertyDescriptor.isVar() && propertyDescriptor2.isVar()) {
            return AbstractTypeChecker.INSTANCE.equalTypes(typeCheckerStateF, returnType.unwrap(), returnType2.unwrap());
        }
        return (propertyDescriptor.isVar() || !propertyDescriptor2.isVar()) && g(callableDescriptor, returnType, callableDescriptor2, returnType2, typeCheckerStateF);
    }

    public static boolean isVisibleForOverride(@NotNull MemberDescriptor memberDescriptor, @NotNull MemberDescriptor memberDescriptor2, boolean z10) {
        if (memberDescriptor == null) {
            a(57);
            throw null;
        }
        if (memberDescriptor2 != null) {
            return !DescriptorVisibilities.isPrivate(memberDescriptor2.getVisibility()) && DescriptorVisibilities.isVisibleIgnoringReceiver(memberDescriptor2, memberDescriptor, z10);
        }
        a(58);
        throw null;
    }

    public static <D extends CallableDescriptor> boolean overrides(@NotNull D d2, @NotNull D d3, boolean z10, boolean z11) {
        if (d2 == null) {
            a(13);
            throw null;
        }
        if (d3 == null) {
            a(14);
            throw null;
        }
        if (!d2.equals(d3) && DescriptorEquivalenceForOverrides.INSTANCE.areEquivalent(d2.getOriginal(), d3.getOriginal(), z10, z11)) {
            return true;
        }
        CallableDescriptor original = d3.getOriginal();
        Iterator it = DescriptorUtils.getAllOverriddenDescriptors(d2).iterator();
        while (it.hasNext()) {
            if (DescriptorEquivalenceForOverrides.INSTANCE.areEquivalent(original, (CallableDescriptor) it.next(), z10, z11)) {
                return true;
            }
        }
        return false;
    }

    public static void resolveUnknownVisibilityForMember(@NotNull CallableMemberDescriptor callableMemberDescriptor, @Nullable Function1<CallableMemberDescriptor, Unit> function1) {
        DescriptorVisibility descriptorVisibility;
        if (callableMemberDescriptor == null) {
            a(107);
            throw null;
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.getOverriddenDescriptors()) {
            if (callableMemberDescriptor2.getVisibility() == DescriptorVisibilities.INHERITED) {
                resolveUnknownVisibilityForMember(callableMemberDescriptor2, function1);
            }
        }
        if (callableMemberDescriptor.getVisibility() != DescriptorVisibilities.INHERITED) {
            return;
        }
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        DescriptorVisibility descriptorVisibilityFindMaxVisibility = findMaxVisibility(overriddenDescriptors);
        if (descriptorVisibilityFindMaxVisibility == null) {
            descriptorVisibilityFindMaxVisibility = null;
            break;
        }
        if (callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            for (CallableMemberDescriptor callableMemberDescriptor3 : overriddenDescriptors) {
                if (callableMemberDescriptor3.getModality() != Modality.ABSTRACT && !callableMemberDescriptor3.getVisibility().equals(descriptorVisibilityFindMaxVisibility)) {
                    descriptorVisibilityFindMaxVisibility = null;
                    break;
                }
            }
        } else {
            descriptorVisibilityFindMaxVisibility = descriptorVisibilityFindMaxVisibility.normalize();
        }
        if (descriptorVisibilityFindMaxVisibility == null) {
            if (function1 != null) {
                function1.invoke(callableMemberDescriptor);
            }
            descriptorVisibility = DescriptorVisibilities.PUBLIC;
        } else {
            descriptorVisibility = descriptorVisibilityFindMaxVisibility;
        }
        if (callableMemberDescriptor instanceof PropertyDescriptorImpl) {
            ((PropertyDescriptorImpl) callableMemberDescriptor).setVisibility(descriptorVisibility);
            Iterator<PropertyAccessorDescriptor> it = ((PropertyDescriptor) callableMemberDescriptor).getAccessors().iterator();
            while (it.hasNext()) {
                resolveUnknownVisibilityForMember(it.next(), descriptorVisibilityFindMaxVisibility == null ? null : function1);
            }
            return;
        }
        if (callableMemberDescriptor instanceof FunctionDescriptorImpl) {
            ((FunctionDescriptorImpl) callableMemberDescriptor).setVisibility(descriptorVisibility);
            return;
        }
        PropertyAccessorDescriptorImpl propertyAccessorDescriptorImpl = (PropertyAccessorDescriptorImpl) callableMemberDescriptor;
        propertyAccessorDescriptorImpl.setVisibility(descriptorVisibility);
        if (descriptorVisibility != propertyAccessorDescriptorImpl.getCorrespondingProperty().getVisibility()) {
            propertyAccessorDescriptorImpl.setDefault(false);
        }
    }

    @NotNull
    public static <H> H selectMostSpecificMember(@NotNull Collection<H> collection, @NotNull Function1<H, CallableDescriptor> function1) {
        H h4;
        if (collection == null) {
            a(78);
            throw null;
        }
        if (function1 == null) {
            a(79);
            throw null;
        }
        if (collection.size() == 1) {
            H h7 = (H) CollectionsKt___CollectionsKt.first(collection);
            if (h7 != null) {
                return h7;
            }
            a(80);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        List map = CollectionsKt___CollectionsKt.map(collection, function1);
        H h10 = (H) CollectionsKt___CollectionsKt.first(collection);
        CallableDescriptor callableDescriptorInvoke = function1.invoke(h10);
        for (H h11 : collection) {
            CallableDescriptor callableDescriptorInvoke2 = function1.invoke(h11);
            if (callableDescriptorInvoke2 == null) {
                a(71);
                throw null;
            }
            if (map == null) {
                a(72);
                throw null;
            }
            Iterator it = map.iterator();
            do {
                if (!it.hasNext()) {
                    arrayList.add(h11);
                    break;
                }
            } while (isMoreSpecific(callableDescriptorInvoke2, (CallableDescriptor) it.next()));
            if (isMoreSpecific(callableDescriptorInvoke2, callableDescriptorInvoke) && !isMoreSpecific(callableDescriptorInvoke, callableDescriptorInvoke2)) {
                h10 = h11;
            }
        }
        if (arrayList.isEmpty()) {
            if (h10 != null) {
                return h10;
            }
            a(81);
            throw null;
        }
        if (arrayList.size() == 1) {
            H h12 = (H) CollectionsKt___CollectionsKt.first((Iterable) arrayList);
            if (h12 != null) {
                return h12;
            }
            a(82);
            throw null;
        }
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                h4 = null;
                break;
            }
            h4 = (H) it2.next();
        } while (FlexibleTypesKt.isFlexible(function1.invoke(h4).getReturnType()));
        if (h4 != null) {
            return h4;
        }
        H h13 = (H) CollectionsKt___CollectionsKt.first((Iterable) arrayList);
        if (h13 != null) {
            return h13;
        }
        a(84);
        throw null;
    }

    @NotNull
    public final TypeCheckerState f(@NotNull List<TypeParameterDescriptor> list, @NotNull List<TypeParameterDescriptor> list2) {
        if (list == null) {
            a(42);
            throw null;
        }
        if (list2 == null) {
            a(43);
            throw null;
        }
        if (list.isEmpty()) {
            TypeCheckerState typeCheckerStateNewTypeCheckerState = new OverridingUtilTypeSystemContext(null, this.f81514c, this.f81512a, this.f81513b, this.f81515d).newTypeCheckerState(true, true);
            if (typeCheckerStateNewTypeCheckerState != null) {
                return typeCheckerStateNewTypeCheckerState;
            }
            a(44);
            throw null;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.put(list.get(i10).getTypeConstructor(), list2.get(i10).getTypeConstructor());
        }
        TypeCheckerState typeCheckerStateNewTypeCheckerState2 = new OverridingUtilTypeSystemContext(map, this.f81514c, this.f81512a, this.f81513b, this.f81515d).newTypeCheckerState(true, true);
        if (typeCheckerStateNewTypeCheckerState2 != null) {
            return typeCheckerStateNewTypeCheckerState2;
        }
        a(45);
        throw null;
    }

    public void generateOverridesInFunctionGroup(@NotNull Name name, @NotNull Collection<? extends CallableMemberDescriptor> collection, @NotNull Collection<? extends CallableMemberDescriptor> collection2, @NotNull ClassDescriptor classDescriptor, @NotNull OverridingStrategy overridingStrategy) {
        if (name == null) {
            a(52);
            throw null;
        }
        if (collection == null) {
            a(53);
            throw null;
        }
        if (collection2 == null) {
            a(54);
            throw null;
        }
        if (classDescriptor == null) {
            a(55);
            throw null;
        }
        if (overridingStrategy == null) {
            a(56);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        for (CallableMemberDescriptor callableMemberDescriptor : collection2) {
            if (callableMemberDescriptor == null) {
                a(59);
                throw null;
            }
            if (collection == null) {
                a(60);
                throw null;
            }
            if (classDescriptor == null) {
                a(61);
                throw null;
            }
            if (overridingStrategy == null) {
                a(62);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            SmartSet smartSetCreate = SmartSet.create();
            for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
                OverrideCompatibilityInfo.Result result = isOverridableBy(callableMemberDescriptor2, callableMemberDescriptor, classDescriptor).getResult();
                boolean zIsVisibleForOverride = isVisibleForOverride(callableMemberDescriptor, callableMemberDescriptor2, false);
                int i10 = e.f81520b[result.ordinal()];
                if (i10 == 1) {
                    if (zIsVisibleForOverride) {
                        smartSetCreate.add(callableMemberDescriptor2);
                    }
                    arrayList.add(callableMemberDescriptor2);
                } else if (i10 == 2) {
                    if (zIsVisibleForOverride) {
                        overridingStrategy.overrideConflict(callableMemberDescriptor2, callableMemberDescriptor);
                    }
                    arrayList.add(callableMemberDescriptor2);
                }
            }
            overridingStrategy.setOverriddenDescriptors(callableMemberDescriptor, smartSetCreate);
            linkedHashSet.removeAll(arrayList);
        }
        if (classDescriptor == null) {
            a(64);
            throw null;
        }
        if (overridingStrategy == null) {
            a(66);
            throw null;
        }
        if (linkedHashSet.size() < 2 || CollectionsKt___CollectionsKt.all(linkedHashSet, new dl.c(((CallableMemberDescriptor) linkedHashSet.iterator().next()).getContainingDeclaration()))) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                e(Collections.singleton((CallableMemberDescriptor) it.next()), classDescriptor, overridingStrategy);
            }
            return;
        }
        LinkedList linkedList = new LinkedList(linkedHashSet);
        while (!linkedList.isEmpty()) {
            CallableMemberDescriptor callableMemberDescriptorFindMemberWithMaxVisibility = VisibilityUtilKt.findMemberWithMaxVisibility(linkedList);
            if (callableMemberDescriptorFindMemberWithMaxVisibility == null) {
                a(104);
                throw null;
            }
            e(extractMembersOverridableInBothWays(callableMemberDescriptorFindMemberWithMaxVisibility, linkedList, new dl.d(), new dl.e(overridingStrategy, callableMemberDescriptorFindMemberWithMaxVisibility)), classDescriptor, overridingStrategy);
        }
    }

    @NotNull
    public OverrideCompatibilityInfo isOverridableBy(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, @Nullable ClassDescriptor classDescriptor) {
        if (callableDescriptor == null) {
            a(19);
            throw null;
        }
        if (callableDescriptor2 == null) {
            a(20);
            throw null;
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoIsOverridableBy = isOverridableBy(callableDescriptor, callableDescriptor2, classDescriptor, false);
        if (overrideCompatibilityInfoIsOverridableBy != null) {
            return overrideCompatibilityInfoIsOverridableBy;
        }
        a(21);
        throw null;
    }

    @NotNull
    public OverrideCompatibilityInfo isOverridableByWithoutExternalConditions(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, boolean z10) {
        if (callableDescriptor == null) {
            a(30);
            throw null;
        }
        if (callableDescriptor2 == null) {
            a(31);
            throw null;
        }
        OverrideCompatibilityInfo basicOverridabilityProblem = getBasicOverridabilityProblem(callableDescriptor, callableDescriptor2);
        if (basicOverridabilityProblem != null) {
            return basicOverridabilityProblem;
        }
        ArrayList arrayListD = d(callableDescriptor);
        ArrayList arrayListD2 = d(callableDescriptor2);
        List<TypeParameterDescriptor> typeParameters = callableDescriptor.getTypeParameters();
        List<TypeParameterDescriptor> typeParameters2 = callableDescriptor2.getTypeParameters();
        int i10 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i10 < arrayListD.size()) {
                if (!KotlinTypeChecker.DEFAULT.equalTypes((KotlinType) arrayListD.get(i10), (KotlinType) arrayListD2.get(i10))) {
                    OverrideCompatibilityInfo overrideCompatibilityInfoIncompatible = OverrideCompatibilityInfo.incompatible("Type parameter number mismatch");
                    if (overrideCompatibilityInfoIncompatible != null) {
                        return overrideCompatibilityInfoIncompatible;
                    }
                    a(33);
                    throw null;
                }
                i10++;
            }
            OverrideCompatibilityInfo overrideCompatibilityInfoConflict = OverrideCompatibilityInfo.conflict("Type parameter number mismatch");
            if (overrideCompatibilityInfoConflict != null) {
                return overrideCompatibilityInfoConflict;
            }
            a(34);
            throw null;
        }
        TypeCheckerState typeCheckerStateF = f(typeParameters, typeParameters2);
        int i11 = 0;
        loop1: while (true) {
            if (i11 >= typeParameters.size()) {
                while (i10 < arrayListD.size()) {
                    if (!b((KotlinType) arrayListD.get(i10), (KotlinType) arrayListD2.get(i10), typeCheckerStateF)) {
                        OverrideCompatibilityInfo overrideCompatibilityInfoIncompatible2 = OverrideCompatibilityInfo.incompatible("Value parameter type mismatch");
                        if (overrideCompatibilityInfoIncompatible2 != null) {
                            return overrideCompatibilityInfoIncompatible2;
                        }
                        a(36);
                        throw null;
                    }
                    i10++;
                }
                if ((callableDescriptor instanceof FunctionDescriptor) && (callableDescriptor2 instanceof FunctionDescriptor) && ((FunctionDescriptor) callableDescriptor).isSuspend() != ((FunctionDescriptor) callableDescriptor2).isSuspend()) {
                    OverrideCompatibilityInfo overrideCompatibilityInfoConflict2 = OverrideCompatibilityInfo.conflict("Incompatible suspendability");
                    if (overrideCompatibilityInfoConflict2 != null) {
                        return overrideCompatibilityInfoConflict2;
                    }
                    a(37);
                    throw null;
                }
                if (z10) {
                    KotlinType returnType = callableDescriptor.getReturnType();
                    KotlinType returnType2 = callableDescriptor2.getReturnType();
                    if (returnType != null && returnType2 != null && ((!KotlinTypeKt.isError(returnType2) || !KotlinTypeKt.isError(returnType)) && !AbstractTypeChecker.INSTANCE.isSubtypeOf(typeCheckerStateF, returnType2.unwrap(), returnType.unwrap()))) {
                        OverrideCompatibilityInfo overrideCompatibilityInfoConflict3 = OverrideCompatibilityInfo.conflict("Return type mismatch");
                        if (overrideCompatibilityInfoConflict3 != null) {
                            return overrideCompatibilityInfoConflict3;
                        }
                        a(38);
                        throw null;
                    }
                }
                OverrideCompatibilityInfo overrideCompatibilityInfoSuccess = OverrideCompatibilityInfo.success();
                if (overrideCompatibilityInfoSuccess != null) {
                    return overrideCompatibilityInfoSuccess;
                }
                a(39);
                throw null;
            }
            TypeParameterDescriptor typeParameterDescriptor = typeParameters.get(i11);
            TypeParameterDescriptor typeParameterDescriptor2 = typeParameters2.get(i11);
            if (typeParameterDescriptor == null) {
                a(49);
                throw null;
            }
            if (typeParameterDescriptor2 == null) {
                a(50);
                throw null;
            }
            if (typeCheckerStateF == null) {
                a(51);
                throw null;
            }
            List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            ArrayList arrayList = new ArrayList(typeParameterDescriptor2.getUpperBounds());
            if (upperBounds.size() != arrayList.size()) {
                break;
            }
            for (KotlinType kotlinType : upperBounds) {
                ListIterator listIterator = arrayList.listIterator();
                do {
                    if (!listIterator.hasNext()) {
                        break loop1;
                    }
                } while (!b(kotlinType, (KotlinType) listIterator.next(), typeCheckerStateF));
                listIterator.remove();
            }
            i11++;
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoIncompatible3 = OverrideCompatibilityInfo.incompatible("Type parameter bounds mismatch");
        if (overrideCompatibilityInfoIncompatible3 != null) {
            return overrideCompatibilityInfoIncompatible3;
        }
        a(35);
        throw null;
    }

    @NotNull
    public OverrideCompatibilityInfo isOverridableBy(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, @Nullable ClassDescriptor classDescriptor, boolean z10) {
        if (callableDescriptor == null) {
            a(22);
            throw null;
        }
        if (callableDescriptor2 != null) {
            OverrideCompatibilityInfo overrideCompatibilityInfoIsOverridableByWithoutExternalConditions = isOverridableByWithoutExternalConditions(callableDescriptor, callableDescriptor2, z10);
            boolean z11 = overrideCompatibilityInfoIsOverridableByWithoutExternalConditions.getResult() == OverrideCompatibilityInfo.Result.OVERRIDABLE;
            List<ExternalOverridabilityCondition> list = f81510e;
            for (ExternalOverridabilityCondition externalOverridabilityCondition : list) {
                if (externalOverridabilityCondition.getContract() != ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY && (!z11 || externalOverridabilityCondition.getContract() != ExternalOverridabilityCondition.Contract.SUCCESS_ONLY)) {
                    int i10 = e.f81519a[externalOverridabilityCondition.isOverridable(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                    if (i10 == 1) {
                        z11 = true;
                    } else {
                        if (i10 == 2) {
                            OverrideCompatibilityInfo overrideCompatibilityInfoConflict = OverrideCompatibilityInfo.conflict("External condition failed");
                            if (overrideCompatibilityInfoConflict != null) {
                                return overrideCompatibilityInfoConflict;
                            }
                            a(24);
                            throw null;
                        }
                        if (i10 == 3) {
                            OverrideCompatibilityInfo overrideCompatibilityInfoIncompatible = OverrideCompatibilityInfo.incompatible("External condition");
                            if (overrideCompatibilityInfoIncompatible != null) {
                                return overrideCompatibilityInfoIncompatible;
                            }
                            a(25);
                            throw null;
                        }
                    }
                }
            }
            if (!z11) {
                return overrideCompatibilityInfoIsOverridableByWithoutExternalConditions;
            }
            for (ExternalOverridabilityCondition externalOverridabilityCondition2 : list) {
                if (externalOverridabilityCondition2.getContract() == ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY) {
                    int i11 = e.f81519a[externalOverridabilityCondition2.isOverridable(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                    if (i11 == 1) {
                        throw new IllegalStateException("Contract violation in " + externalOverridabilityCondition2.getClass().getName() + " condition. It's not supposed to end with success");
                    }
                    if (i11 == 2) {
                        OverrideCompatibilityInfo overrideCompatibilityInfoConflict2 = OverrideCompatibilityInfo.conflict("External condition failed");
                        if (overrideCompatibilityInfoConflict2 != null) {
                            return overrideCompatibilityInfoConflict2;
                        }
                        a(27);
                        throw null;
                    }
                    if (i11 == 3) {
                        OverrideCompatibilityInfo overrideCompatibilityInfoIncompatible2 = OverrideCompatibilityInfo.incompatible("External condition");
                        if (overrideCompatibilityInfoIncompatible2 != null) {
                            return overrideCompatibilityInfoIncompatible2;
                        }
                        a(28);
                        throw null;
                    }
                }
            }
            OverrideCompatibilityInfo overrideCompatibilityInfoSuccess = OverrideCompatibilityInfo.success();
            if (overrideCompatibilityInfoSuccess != null) {
                return overrideCompatibilityInfoSuccess;
            }
            a(29);
            throw null;
        }
        a(23);
        throw null;
    }
}
