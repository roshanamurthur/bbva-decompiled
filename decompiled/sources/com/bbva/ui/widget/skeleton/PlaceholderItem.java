package com.bbva.ui.widget.skeleton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ui.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PlaceholderItem.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/bbva/ui/widget/skeleton/PlaceholderItem;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "", "r0", "Z", "isAnimatedLayer$ui_release", "()Z", "setAnimatedLayer$ui_release", "(Z)V", "isAnimatedLayer", "Landroid/graphics/Paint;", "v0", "Lkotlin/Lazy;", "getPaint", "()Landroid/graphics/Paint;", "paint", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "ui_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPlaceholderItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderItem.kt\ncom/bbva/ui/widget/skeleton/PlaceholderItem\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,85:1\n233#2,3:86\n*S KotlinDebug\n*F\n+ 1 PlaceholderItem.kt\ncom/bbva/ui/widget/skeleton/PlaceholderItem\n*L\n40#1:86,3\n*E\n"})
public final class PlaceholderItem extends View {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final float f37738p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final float f37739q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public boolean isAnimatedLayer;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f37741s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final SkeletonColorStyle f37742t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Path f37743u0;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public final Lazy paint;

    /* JADX INFO: compiled from: PlaceholderItem.kt */
    public static final class a extends Lambda implements Function0<Paint> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Context f37745q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.f37745q0 = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Paint invoke() {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(PlaceholderItem.this.f37742t0.getDefaultColor(this.f37745q0));
            return paint;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PlaceholderItem(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Paint getPaint() {
        return (Paint) this.paint.getValue();
    }

    /* JADX INFO: renamed from: isAnimatedLayer$ui_release, reason: from getter */
    public final boolean getIsAnimatedLayer() {
        return this.isAnimatedLayer;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f37741s0) {
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2.0f, getPaint());
            return;
        }
        Path path = this.f37743u0;
        path.reset();
        path.moveTo(this.f37738p0 + 0.0f, 0.0f);
        path.lineTo(getWidth(), 0.0f);
        path.lineTo(getWidth() - this.f37739q0, getHeight());
        path.lineTo(0.0f, getHeight());
        path.close();
        canvas.drawPath(path, getPaint());
    }

    public final void setAnimatedLayer$ui_release(boolean z10) {
        this.isAnimatedLayer = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PlaceholderItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PlaceholderItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PlaceholderItem(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PlaceholderItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f37742t0 = SkeletonColorStyle.AMBIENT;
        this.f37743u0 = new Path();
        this.paint = LazyKt__LazyJVMKt.lazy(new a(context));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PlaceholderItem);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f37738p0 = typedArrayObtainStyledAttributes.getDimension(R.styleable.PlaceholderItem_sharpOffsetStart, this.f37738p0);
        this.f37739q0 = typedArrayObtainStyledAttributes.getDimension(R.styleable.PlaceholderItem_sharpOffsetEnd, this.f37739q0);
        this.isAnimatedLayer = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlaceholderItem_isAnimated, this.isAnimatedLayer);
        this.f37741s0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlaceholderItem_isRoundShape, this.f37741s0);
        this.f37742t0 = SkeletonColorStyle.getEntries().get(typedArrayObtainStyledAttributes.getInt(R.styleable.PlaceholderItem_preloaderColorStyle, 0));
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
    }
}
