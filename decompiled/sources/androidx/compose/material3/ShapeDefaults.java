package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.tokens.ShapeTokens;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Shapes.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/ShapeDefaults;", "", "Landroidx/compose/foundation/shape/CornerBasedShape;", "a", "Landroidx/compose/foundation/shape/CornerBasedShape;", "getExtraSmall", "()Landroidx/compose/foundation/shape/CornerBasedShape;", "ExtraSmall", "b", "getSmall", "Small", "c", "getMedium", "Medium", "d", "getLarge", "Large", "e", "getExtraLarge", "ExtraLarge", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class ShapeDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final ShapeDefaults INSTANCE = new ShapeDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final RoundedCornerShape f11268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final RoundedCornerShape f11269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final RoundedCornerShape f11270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final RoundedCornerShape f11271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final RoundedCornerShape f11272e;

    static {
        ShapeTokens shapeTokens = ShapeTokens.INSTANCE;
        f11268a = shapeTokens.getCornerExtraSmall();
        f11269b = shapeTokens.getCornerSmall();
        f11270c = shapeTokens.getCornerMedium();
        f11271d = shapeTokens.getCornerLarge();
        f11272e = shapeTokens.getCornerExtraLarge();
    }

    @NotNull
    public final CornerBasedShape getExtraLarge() {
        return f11272e;
    }

    @NotNull
    public final CornerBasedShape getExtraSmall() {
        return f11268a;
    }

    @NotNull
    public final CornerBasedShape getLarge() {
        return f11271d;
    }

    @NotNull
    public final CornerBasedShape getMedium() {
        return f11270c;
    }

    @NotNull
    public final CornerBasedShape getSmall() {
        return f11269b;
    }
}
