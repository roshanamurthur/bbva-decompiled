package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntSizeKt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b2\u00103J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\f\u0010\b\u001a\u00020\u0007*\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R/\u0010 \u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010(\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010,\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R$\u00101\u001a\u00020\t2\u0006\u0010!\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00064"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "", "draw", "", "toString", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "b", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "getRoot", "()Landroidx/compose/ui/graphics/vector/GroupComponent;", "root", "Lkotlin/Function0;", "e", "Lkotlin/jvm/functions/Function0;", "getInvalidateCallback$ui_release", "()Lkotlin/jvm/functions/Function0;", "setInvalidateCallback$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "invalidateCallback", "<set-?>", "f", "Landroidx/compose/runtime/MutableState;", "getIntrinsicColorFilter$ui_release", "()Landroidx/compose/ui/graphics/ColorFilter;", "setIntrinsicColorFilter$ui_release", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "intrinsicColorFilter", "value", "g", "F", "getViewportWidth", "()F", "setViewportWidth", "(F)V", "viewportWidth", "h", "getViewportHeight", "setViewportHeight", "viewportHeight", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,536:1\n81#2:537\n107#2,2:538\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n*L\n115#1:537\n115#1:538,2\n*E\n"})
public final class VectorComponent extends VNode {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final GroupComponent root;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final DrawCache f16033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function0<Unit> invalidateCallback;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState intrinsicColorFilter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public float viewportWidth;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public float viewportHeight;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f16038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final a f16039j;

    /* JADX INFO: compiled from: Vector.kt */
    @SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent$drawVectorBlock$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,536:1\n1#2:537\n*E\n"})
    public static final class a extends Lambda implements Function1<DrawScope, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope drawScope2 = drawScope;
            Intrinsics.checkNotNullParameter(drawScope2, "$this$null");
            VectorComponent.this.getRoot().draw(drawScope2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Vector.kt */
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f16041p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Vector.kt */
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VectorComponent.access$doInvalidate(VectorComponent.this);
            return Unit.INSTANCE;
        }
    }

    public VectorComponent() {
        super(null);
        GroupComponent groupComponent = new GroupComponent();
        groupComponent.setPivotX(0.0f);
        groupComponent.setPivotY(0.0f);
        groupComponent.setInvalidateListener$ui_release(new c());
        this.root = groupComponent;
        this.f16032c = true;
        this.f16033d = new DrawCache();
        this.invalidateCallback = b.f16041p0;
        this.intrinsicColorFilter = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f16038i = Size.INSTANCE.m2352getUnspecifiedNHjbRc();
        this.f16039j = new a();
    }

    public static final void access$doInvalidate(VectorComponent vectorComponent) {
        vectorComponent.f16032c = true;
        vectorComponent.invalidateCallback.invoke();
    }

    public final void draw(@NotNull DrawScope drawScope, float f6, @Nullable ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        if (colorFilter == null) {
            colorFilter = getIntrinsicColorFilter$ui_release();
        }
        if (this.f16032c || !Size.m2340equalsimpl0(this.f16038i, drawScope.mo2909getSizeNHjbRc())) {
            float fM2344getWidthimpl = Size.m2344getWidthimpl(drawScope.mo2909getSizeNHjbRc()) / this.viewportWidth;
            GroupComponent groupComponent = this.root;
            groupComponent.setScaleX(fM2344getWidthimpl);
            groupComponent.setScaleY(Size.m2341getHeightimpl(drawScope.mo2909getSizeNHjbRc()) / this.viewportHeight);
            this.f16033d.m3008drawCachedImageCJJARo(IntSizeKt.IntSize((int) Math.ceil(Size.m2344getWidthimpl(drawScope.mo2909getSizeNHjbRc())), (int) Math.ceil(Size.m2341getHeightimpl(drawScope.mo2909getSizeNHjbRc()))), drawScope, drawScope.getLayoutDirection(), this.f16039j);
            this.f16032c = false;
            this.f16038i = drawScope.mo2909getSizeNHjbRc();
        }
        this.f16033d.drawInto(drawScope, f6, colorFilter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return (ColorFilter) this.intrinsicColorFilter.getValue();
    }

    @NotNull
    public final Function0<Unit> getInvalidateCallback$ui_release() {
        return this.invalidateCallback;
    }

    @NotNull
    public final String getName() {
        return this.root.getName();
    }

    @NotNull
    public final GroupComponent getRoot() {
        return this.root;
    }

    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    public final void setIntrinsicColorFilter$ui_release(@Nullable ColorFilter colorFilter) {
        this.intrinsicColorFilter.setValue(colorFilter);
    }

    public final void setInvalidateCallback$ui_release(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.invalidateCallback = function0;
    }

    public final void setName(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.root.setName(value);
    }

    public final void setViewportHeight(float f6) {
        if (this.viewportHeight == f6) {
            return;
        }
        this.viewportHeight = f6;
        this.f16032c = true;
        this.invalidateCallback.invoke();
    }

    public final void setViewportWidth(float f6) {
        if (this.viewportWidth == f6) {
            return;
        }
        this.viewportWidth = f6;
        this.f16032c = true;
        this.invalidateCallback.invoke();
    }

    @NotNull
    public String toString() {
        String str = "Params: \tname: " + getName() + "\n\tviewportWidth: " + this.viewportWidth + "\n\tviewportHeight: " + this.viewportHeight + RootService.LINE_BREAK;
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(@NotNull DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        draw(drawScope, 1.0f, null);
    }
}
