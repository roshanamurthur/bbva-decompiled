package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: typeQualifiers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JavaTypeQualifiers {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final JavaTypeQualifiers f80783e = new JavaTypeQualifiers(null, null, false, false, 8, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final NullabilityQualifier f80784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final MutabilityQualifier f80785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f80786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f80787d;

    /* JADX INFO: compiled from: typeQualifiers.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JavaTypeQualifiers getNONE() {
            return JavaTypeQualifiers.f80783e;
        }
    }

    public JavaTypeQualifiers(@Nullable NullabilityQualifier nullabilityQualifier, @Nullable MutabilityQualifier mutabilityQualifier, boolean z10, boolean z11) {
        this.f80784a = nullabilityQualifier;
        this.f80785b = mutabilityQualifier;
        this.f80786c = z10;
        this.f80787d = z11;
    }

    public final boolean getDefinitelyNotNull() {
        return this.f80786c;
    }

    @Nullable
    public final MutabilityQualifier getMutability() {
        return this.f80785b;
    }

    @Nullable
    public final NullabilityQualifier getNullability() {
        return this.f80784a;
    }

    public final boolean isNullabilityQualifierForWarning() {
        return this.f80787d;
    }

    public /* synthetic */ JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, mutabilityQualifier, z10, (i10 & 8) != 0 ? false : z11);
    }
}
