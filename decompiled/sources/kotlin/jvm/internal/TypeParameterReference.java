package kotlin.jvm.internal;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TypeParameterReference.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.4")
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B)\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b#\u0010$J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0013\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006&"}, d2 = {"Lkotlin/jvm/internal/TypeParameterReference;", "Lkotlin/reflect/KTypeParameter;", "", "Lkotlin/reflect/KType;", "upperBounds", "", "setUpperBounds", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "q0", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "Lkotlin/reflect/KVariance;", "r0", "Lkotlin/reflect/KVariance;", "getVariance", "()Lkotlin/reflect/KVariance;", "variance", "s0", "Z", "isReified", "()Z", "getUpperBounds", "()Ljava/util/List;", "getUpperBounds$annotations", "()V", "container", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Lkotlin/reflect/KVariance;Z)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTypeParameterReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterReference.kt\nkotlin/jvm/internal/TypeParameterReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
public final class TypeParameterReference implements KTypeParameter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public final Object f79735p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final KVariance variance;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public final boolean isReified;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public volatile List<? extends KType> f79739t0;

    /* JADX INFO: compiled from: TypeParameterReference.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/jvm/internal/TypeParameterReference$Companion;", "", "()V", "toString", "", "typeParameter", "Lkotlin/reflect/KTypeParameter;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: TypeParameterReference.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[KVariance.values().length];
                try {
                    iArr[KVariance.INVARIANT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[KVariance.IN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[KVariance.OUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String toString(@NotNull KTypeParameter typeParameter) {
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i10 = WhenMappings.$EnumSwitchMapping$0[typeParameter.getVariance().ordinal()];
            if (i10 == 2) {
                sb2.append("in ");
            } else if (i10 == 3) {
                sb2.append("out ");
            }
            sb2.append(typeParameter.getName());
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }

    public TypeParameterReference(@Nullable Object obj, @NotNull String name, @NotNull KVariance variance, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(variance, "variance");
        this.f79735p0 = obj;
        this.name = name;
        this.variance = variance;
        this.isReified = z10;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof TypeParameterReference) {
            TypeParameterReference typeParameterReference = (TypeParameterReference) other;
            if (Intrinsics.areEqual(this.f79735p0, typeParameterReference.f79735p0) && Intrinsics.areEqual(getName(), typeParameterReference.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    public List<KType> getUpperBounds() {
        List list = this.f79739t0;
        if (list != null) {
            return list;
        }
        List<KType> listListOf = bk.d.listOf(Reflection.nullableTypeOf(Object.class));
        this.f79739t0 = listListOf;
        return listListOf;
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    public KVariance getVariance() {
        return this.variance;
    }

    public int hashCode() {
        Object obj = this.f79735p0;
        return getName().hashCode() + ((obj != null ? obj.hashCode() : 0) * 31);
    }

    @Override // kotlin.reflect.KTypeParameter
    /* JADX INFO: renamed from: isReified, reason: from getter */
    public boolean getIsReified() {
        return this.isReified;
    }

    public final void setUpperBounds(@NotNull List<? extends KType> upperBounds) {
        Intrinsics.checkNotNullParameter(upperBounds, "upperBounds");
        if (this.f79739t0 == null) {
            this.f79739t0 = upperBounds;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
    }

    @NotNull
    public String toString() {
        return INSTANCE.toString(this);
    }

    public static /* synthetic */ void getUpperBounds$annotations() {
    }
}
