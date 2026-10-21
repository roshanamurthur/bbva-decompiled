package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractTypeChecker.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,835:1\n1#2:836\n*E\n"})
public class TypeCheckerState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f81965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f81966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f81967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TypeSystemContext f81968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final AbstractTypePreparator f81969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final AbstractTypeRefiner f81970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f81971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public ArrayDeque<SimpleTypeMarker> f81972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public SmartSet f81973i;

    /* JADX INFO: compiled from: AbstractTypeChecker.kt */
    public interface ForkPointContext {

        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        public static final class Default implements ForkPointContext {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f81974a;

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.ForkPointContext
            public void fork(@NotNull Function0<Boolean> block) {
                Intrinsics.checkNotNullParameter(block, "block");
                if (this.f81974a) {
                    return;
                }
                this.f81974a = block.invoke().booleanValue();
            }

            public final boolean getResult() {
                return this.f81974a;
            }
        }

        void fork(@NotNull Function0<Boolean> function0);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: AbstractTypeChecker.kt */
    public static final class LowerCapturedTypePolicy {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LowerCapturedTypePolicy[] $VALUES;
        public static final LowerCapturedTypePolicy CHECK_ONLY_LOWER;
        public static final LowerCapturedTypePolicy CHECK_SUBTYPE_AND_LOWER;
        public static final LowerCapturedTypePolicy SKIP_LOWER;

        static {
            LowerCapturedTypePolicy lowerCapturedTypePolicy = new LowerCapturedTypePolicy("CHECK_ONLY_LOWER", 0);
            CHECK_ONLY_LOWER = lowerCapturedTypePolicy;
            LowerCapturedTypePolicy lowerCapturedTypePolicy2 = new LowerCapturedTypePolicy("CHECK_SUBTYPE_AND_LOWER", 1);
            CHECK_SUBTYPE_AND_LOWER = lowerCapturedTypePolicy2;
            LowerCapturedTypePolicy lowerCapturedTypePolicy3 = new LowerCapturedTypePolicy("SKIP_LOWER", 2);
            SKIP_LOWER = lowerCapturedTypePolicy3;
            LowerCapturedTypePolicy[] lowerCapturedTypePolicyArr = {lowerCapturedTypePolicy, lowerCapturedTypePolicy2, lowerCapturedTypePolicy3};
            $VALUES = lowerCapturedTypePolicyArr;
            $ENTRIES = EnumEntriesKt.enumEntries(lowerCapturedTypePolicyArr);
        }

        public LowerCapturedTypePolicy() {
            throw null;
        }

        public static LowerCapturedTypePolicy valueOf(String str) {
            return (LowerCapturedTypePolicy) Enum.valueOf(LowerCapturedTypePolicy.class, str);
        }

        public static LowerCapturedTypePolicy[] values() {
            return (LowerCapturedTypePolicy[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: AbstractTypeChecker.kt */
    public static abstract class SupertypesPolicy {

        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        public static abstract class DoCustomTransform extends SupertypesPolicy {
            public DoCustomTransform() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        @SourceDebugExtension({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState$SupertypesPolicy$LowerIfFlexible\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,835:1\n1#2:836\n*E\n"})
        public static final class LowerIfFlexible extends SupertypesPolicy {

            @NotNull
            public static final LowerIfFlexible INSTANCE = new LowerIfFlexible();

            public LowerIfFlexible() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            @NotNull
            /* JADX INFO: renamed from: transformType */
            public SimpleTypeMarker mo5781transformType(@NotNull TypeCheckerState state, @NotNull KotlinTypeMarker type) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                return state.getTypeSystemContext().lowerBoundIfFlexible(type);
            }
        }

        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        public static final class None extends SupertypesPolicy {

            @NotNull
            public static final None INSTANCE = new None();

            public None() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            /* JADX INFO: renamed from: transformType, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ SimpleTypeMarker mo5781transformType(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker) {
                return (SimpleTypeMarker) transformType(typeCheckerState, kotlinTypeMarker);
            }

            @NotNull
            public Void transformType(@NotNull TypeCheckerState state, @NotNull KotlinTypeMarker type) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        @SourceDebugExtension({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState$SupertypesPolicy$UpperIfFlexible\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,835:1\n1#2:836\n*E\n"})
        public static final class UpperIfFlexible extends SupertypesPolicy {

            @NotNull
            public static final UpperIfFlexible INSTANCE = new UpperIfFlexible();

            public UpperIfFlexible() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            @NotNull
            /* JADX INFO: renamed from: transformType */
            public SimpleTypeMarker mo5781transformType(@NotNull TypeCheckerState state, @NotNull KotlinTypeMarker type) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                return state.getTypeSystemContext().upperBoundIfFlexible(type);
            }
        }

        public SupertypesPolicy() {
        }

        public /* synthetic */ SupertypesPolicy(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: transformType */
        public abstract SimpleTypeMarker mo5781transformType(@NotNull TypeCheckerState typeCheckerState, @NotNull KotlinTypeMarker kotlinTypeMarker);
    }

    public TypeCheckerState(boolean z10, boolean z11, boolean z12, @NotNull TypeSystemContext typeSystemContext, @NotNull AbstractTypePreparator kotlinTypePreparator, @NotNull AbstractTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(typeSystemContext, "typeSystemContext");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f81965a = z10;
        this.f81966b = z11;
        this.f81967c = z12;
        this.f81968d = typeSystemContext;
        this.f81969e = kotlinTypePreparator;
        this.f81970f = kotlinTypeRefiner;
    }

    public static /* synthetic */ Boolean addSubtypeConstraint$default(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return typeCheckerState.addSubtypeConstraint(kotlinTypeMarker, kotlinTypeMarker2, z10);
    }

    @Nullable
    public Boolean addSubtypeConstraint(@NotNull KotlinTypeMarker subType, @NotNull KotlinTypeMarker superType, boolean z10) {
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return null;
    }

    public final void clear() {
        ArrayDeque<SimpleTypeMarker> arrayDeque = this.f81972h;
        Intrinsics.checkNotNull(arrayDeque);
        arrayDeque.clear();
        SmartSet smartSet = this.f81973i;
        Intrinsics.checkNotNull(smartSet);
        smartSet.clear();
    }

    public boolean customIsSubtypeOf(@NotNull KotlinTypeMarker subType, @NotNull KotlinTypeMarker superType) {
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return true;
    }

    @NotNull
    public LowerCapturedTypePolicy getLowerCapturedTypePolicy(@NotNull SimpleTypeMarker subType, @NotNull CapturedTypeMarker superType) {
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER;
    }

    @Nullable
    public final ArrayDeque<SimpleTypeMarker> getSupertypesDeque() {
        return this.f81972h;
    }

    @Nullable
    public final Set<SimpleTypeMarker> getSupertypesSet() {
        return this.f81973i;
    }

    @NotNull
    public final TypeSystemContext getTypeSystemContext() {
        return this.f81968d;
    }

    public final void initialize() {
        if (this.f81972h == null) {
            this.f81972h = new ArrayDeque<>(4);
        }
        if (this.f81973i == null) {
            this.f81973i = SmartSet.Companion.create();
        }
    }

    public final boolean isAllowedTypeVariable(@NotNull KotlinTypeMarker type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f81967c && this.f81968d.isTypeVariableType(type);
    }

    public final boolean isErrorTypeEqualsToAnything() {
        return this.f81965a;
    }

    public final boolean isStubTypeEqualsToAnything() {
        return this.f81966b;
    }

    @NotNull
    public final KotlinTypeMarker prepareType(@NotNull KotlinTypeMarker type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f81969e.prepareType(type);
    }

    @NotNull
    public final KotlinTypeMarker refineType(@NotNull KotlinTypeMarker type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f81970f.refineType(type);
    }

    public boolean runForkingPoint(@NotNull Function1<? super ForkPointContext, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ForkPointContext.Default r1 = new ForkPointContext.Default();
        block.invoke(r1);
        return r1.getResult();
    }
}
