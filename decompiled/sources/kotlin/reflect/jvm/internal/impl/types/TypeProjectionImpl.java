package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class TypeProjectionImpl extends TypeProjectionBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Variance f81987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KotlinType f81988b;

    public TypeProjectionImpl(@NotNull Variance variance, @NotNull KotlinType kotlinType) {
        if (variance == null) {
            a(0);
            throw null;
        }
        if (kotlinType == null) {
            a(1);
            throw null;
        }
        this.f81987a = variance;
        this.f81988b = kotlinType;
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i10 == 3) {
            objArr[2] = "replaceType";
        } else if (i10 != 4 && i10 != 5) {
            if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public Variance getProjectionKind() {
        Variance variance = this.f81987a;
        if (variance != null) {
            return variance;
        }
        a(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public KotlinType getType() {
        KotlinType kotlinType = this.f81988b;
        if (kotlinType != null) {
            return kotlinType;
        }
        a(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public boolean isStarProjection() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public TypeProjection refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner != null) {
            return new TypeProjectionImpl(this.f81987a, kotlinTypeRefiner.refineType((KotlinTypeMarker) this.f81988b));
        }
        a(6);
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeProjectionImpl(@NotNull KotlinType kotlinType) {
        this(Variance.INVARIANT, kotlinType);
        if (kotlinType != null) {
        } else {
            a(2);
            throw null;
        }
    }
}
