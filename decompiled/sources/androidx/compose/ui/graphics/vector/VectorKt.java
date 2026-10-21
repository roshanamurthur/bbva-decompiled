package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b\"\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f\"\u0014\u0010\u0014\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000f\"\u0014\u0010\u0015\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f\"\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\f\"\u0014\u0010\u001c\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000f\"\u0014\u0010\u001d\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000f\"\u0014\u0010\u001e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000f\"\u0014\u0010\u001f\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000f\"\u0014\u0010 \u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u000f\"\u001a\u0010&\u001a\u00020!8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u001a\u0010*\u001a\u00020'8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u001a\u0010.\u001a\u00020+8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010%\"\u001a\u00104\u001a\u00020/8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u001a\u00108\u001a\u0002058\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010#\u001a\u0004\b7\u0010%\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u00069"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "PathData", "", "pathStr", "addPathNodes", "DefaultGroupName", "Ljava/lang/String;", "", "DefaultRotation", "F", "DefaultPivotX", "DefaultPivotY", "DefaultScaleX", "DefaultScaleY", "DefaultTranslationX", "DefaultTranslationY", "a", "Ljava/util/List;", "getEmptyPath", "()Ljava/util/List;", "EmptyPath", "DefaultPathName", "DefaultStrokeLineWidth", "DefaultStrokeLineMiter", "DefaultTrimPathStart", "DefaultTrimPathEnd", "DefaultTrimPathOffset", "Landroidx/compose/ui/graphics/StrokeCap;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getDefaultStrokeLineCap", "()I", "DefaultStrokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "c", "getDefaultStrokeLineJoin", "DefaultStrokeLineJoin", "Landroidx/compose/ui/graphics/BlendMode;", "d", "getDefaultTintBlendMode", "DefaultTintBlendMode", "Landroidx/compose/ui/graphics/Color;", "e", "J", "getDefaultTintColor", "()J", "DefaultTintColor", "Landroidx/compose/ui/graphics/PathFillType;", "f", "getDefaultFillType", "DefaultFillType", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class VectorKt {

    @NotNull
    public static final String DefaultGroupName = "";

    @NotNull
    public static final String DefaultPathName = "";
    public static final float DefaultPivotX = 0.0f;
    public static final float DefaultPivotY = 0.0f;
    public static final float DefaultRotation = 0.0f;
    public static final float DefaultScaleX = 1.0f;
    public static final float DefaultScaleY = 1.0f;
    public static final float DefaultStrokeLineMiter = 4.0f;
    public static final float DefaultStrokeLineWidth = 0.0f;
    public static final float DefaultTranslationX = 0.0f;
    public static final float DefaultTranslationY = 0.0f;
    public static final float DefaultTrimPathEnd = 1.0f;
    public static final float DefaultTrimPathOffset = 0.0f;
    public static final float DefaultTrimPathStart = 0.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final List<PathNode> f16097a = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16098b = StrokeCap.INSTANCE.m2808getButtKaPHkGw();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16099c = StrokeJoin.INSTANCE.m2819getMiterLxFBmk8();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16100d = BlendMode.INSTANCE.m2457getSrcIn0nO6VwU();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f16101e = Color.INSTANCE.m2543getTransparent0d7_KjU();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f16102f = PathFillType.INSTANCE.m2749getNonZeroRgk1Os();

    @NotNull
    public static final List<PathNode> PathData(@NotNull Function1<? super PathBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        PathBuilder pathBuilder = new PathBuilder();
        block.invoke(pathBuilder);
        return pathBuilder.getNodes();
    }

    @NotNull
    public static final List<PathNode> addPathNodes(@Nullable String str) {
        return str == null ? f16097a : new PathParser().parsePathString(str).toNodes();
    }

    public static final int getDefaultFillType() {
        return f16102f;
    }

    public static final int getDefaultStrokeLineCap() {
        return f16098b;
    }

    public static final int getDefaultStrokeLineJoin() {
        return f16099c;
    }

    public static final int getDefaultTintBlendMode() {
        return f16100d;
    }

    public static final long getDefaultTintColor() {
        return f16101e;
    }

    @NotNull
    public static final List<PathNode> getEmptyPath() {
        return f16097a;
    }
}
