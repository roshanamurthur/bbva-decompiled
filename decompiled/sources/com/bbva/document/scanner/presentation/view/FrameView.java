package com.bbva.document.scanner.presentation.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.document.scanner.Ratio;
import com.bbva.documentscanner.R;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FrameView.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0002)*B\u001d\b\u0016\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&B%\b\u0016\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010'\u001a\u00020\u001a¢\u0006\u0004\b%\u0010(J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0001H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R+\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010 \u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006+"}, d2 = {"Lcom/bbva/document/scanner/presentation/view/FrameView;", "Landroid/view/View;", "Lcom/bbva/document/scanner/presentation/view/BoxProvider;", "Landroid/graphics/Canvas;", "canvas", "", "draw", "view", "Landroid/graphics/Rect;", "bounds", "", "<set-?>", "t0", "Lkotlin/properties/ReadWriteProperty;", "getHighlight", "()Z", "setHighlight", "(Z)V", "highlight", "Lcom/bbva/document/scanner/Ratio;", "v0", "getRatio", "()Lcom/bbva/document/scanner/Ratio;", "setRatio", "(Lcom/bbva/document/scanner/Ratio;)V", "ratio", "", "w0", "getCornerColor", "()I", "setCornerColor", "(I)V", "cornerColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "Corners", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFrameView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameView.kt\ncom/bbva/document/scanner/presentation/view/FrameView\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,170:1\n33#2,3:171\n33#2,3:174\n33#2,3:177\n33#2,3:180\n33#2,3:183\n*S KotlinDebug\n*F\n+ 1 FrameView.kt\ncom/bbva/document/scanner/presentation/view/FrameView\n*L\n44#1:171,3\n54#1:174,3\n60#1:177,3\n54#1:180,3\n60#1:183,3\n*E\n"})
public final class FrameView extends View implements BoxProvider {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f29212p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f29213q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f29214r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f29215s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final ObservableProperty f29216t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Rect f29217u0;

    @NotNull
    public final ObservableProperty v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final ObservableProperty f29218w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f29210x0 = {c.e(FrameView.class, "highlight", "getHighlight()Z", 0), c.e(FrameView.class, "ratio", "getRatio()Lcom/bbva/document/scanner/Ratio;", 0), c.e(FrameView.class, "cornerColor", "getCornerColor()I", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public static final String f29211y0 = Reflection.getOrCreateKotlinClass(FrameView.class).getSimpleName();

    /* JADX INFO: compiled from: FrameView.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/bbva/document/scanner/presentation/view/FrameView$Companion;", "", "()V", "CORNER_WIDTH", "", "TAG", "", "getTAG", "()Ljava/lang/String;", "document-scanner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final String getTAG() {
            return FrameView.f29211y0;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: FrameView.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/bbva/document/scanner/presentation/view/FrameView$Corners;", "", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/drawable/Drawable;", PluginUtils.IDENTIFIER_DRAWABLE, "Landroid/util/Size;", "viewSize", "", "draw", "", "drawableResId", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getDrawableResId", "()I", "TopLeft", "TopRight", "BottomLeft", "BottomRight", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
    public static final class Corners {
        private static final /* synthetic */ Corners[] $VALUES;
        public static final Corners BottomLeft;
        public static final Corners BottomRight;
        public static final Corners TopLeft;
        public static final Corners TopRight;
        private final int drawableResId;

        /* JADX INFO: compiled from: FrameView.kt */
        public static final class a extends Corners {
            @Override // com.bbva.document.scanner.presentation.view.FrameView.Corners
            public final void draw(@NotNull Canvas canvas, @NotNull Drawable drawable, @NotNull Size viewSize) {
                Intrinsics.checkNotNullParameter(canvas, "canvas");
                Intrinsics.checkNotNullParameter(drawable, "drawable");
                Intrinsics.checkNotNullParameter(viewSize, "viewSize");
                drawable.setBounds(0, viewSize.getHeight() - drawable.getIntrinsicHeight(), drawable.getIntrinsicWidth(), viewSize.getHeight());
                drawable.draw(canvas);
            }
        }

        /* JADX INFO: compiled from: FrameView.kt */
        public static final class b extends Corners {
            @Override // com.bbva.document.scanner.presentation.view.FrameView.Corners
            public final void draw(@NotNull Canvas canvas, @NotNull Drawable drawable, @NotNull Size viewSize) {
                Intrinsics.checkNotNullParameter(canvas, "canvas");
                Intrinsics.checkNotNullParameter(drawable, "drawable");
                Intrinsics.checkNotNullParameter(viewSize, "viewSize");
                drawable.setBounds(viewSize.getWidth() - drawable.getIntrinsicWidth(), viewSize.getHeight() - drawable.getIntrinsicHeight(), viewSize.getWidth(), viewSize.getHeight());
                drawable.draw(canvas);
            }
        }

        /* JADX INFO: compiled from: FrameView.kt */
        public static final class c extends Corners {
            @Override // com.bbva.document.scanner.presentation.view.FrameView.Corners
            public final void draw(@NotNull Canvas canvas, @NotNull Drawable drawable, @NotNull Size viewSize) {
                Intrinsics.checkNotNullParameter(canvas, "canvas");
                Intrinsics.checkNotNullParameter(drawable, "drawable");
                Intrinsics.checkNotNullParameter(viewSize, "viewSize");
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                drawable.draw(canvas);
            }
        }

        /* JADX INFO: compiled from: FrameView.kt */
        public static final class d extends Corners {
            @Override // com.bbva.document.scanner.presentation.view.FrameView.Corners
            public final void draw(@NotNull Canvas canvas, @NotNull Drawable drawable, @NotNull Size viewSize) {
                Intrinsics.checkNotNullParameter(canvas, "canvas");
                Intrinsics.checkNotNullParameter(drawable, "drawable");
                Intrinsics.checkNotNullParameter(viewSize, "viewSize");
                drawable.setBounds(viewSize.getWidth() - drawable.getIntrinsicWidth(), 0, viewSize.getWidth(), drawable.getIntrinsicHeight());
                drawable.draw(canvas);
            }
        }

        static {
            c cVar = new c("TopLeft", 0, R.drawable.corner_top_left, null);
            TopLeft = cVar;
            d dVar = new d("TopRight", 1, R.drawable.corner_top_right, null);
            TopRight = dVar;
            a aVar = new a("BottomLeft", 2, R.drawable.corner_bottom_left, null);
            BottomLeft = aVar;
            b bVar = new b("BottomRight", 3, R.drawable.corner_bottom_right, null);
            BottomRight = bVar;
            $VALUES = new Corners[]{cVar, dVar, aVar, bVar};
        }

        public Corners() {
            throw null;
        }

        public Corners(String str, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            super(str, i10);
            this.drawableResId = i11;
        }

        public static Corners valueOf(String str) {
            return (Corners) Enum.valueOf(Corners.class, str);
        }

        public static Corners[] values() {
            return (Corners[]) $VALUES.clone();
        }

        public abstract void draw(@NotNull Canvas canvas, @NotNull Drawable drawable, @NotNull Size viewSize);

        public final int getDrawableResId() {
            return this.drawableResId;
        }
    }

    public FrameView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29212p0 = 10;
        this.f29213q0 = true;
        this.f29214r0 = ContextCompat.getColor(getContext(), com.bbva.cellswidgets.R.color.BBVA_SKY_BLUE);
        this.f29215s0 = ContextCompat.getColor(getContext(), com.bbva.cellswidgets.R.color.BBVA_MEDIUM_AQUA);
        Delegates delegates = Delegates.INSTANCE;
        final Boolean bool = Boolean.FALSE;
        this.f29216t0 = new ObservableProperty<Boolean>(bool) { // from class: com.bbva.document.scanner.presentation.view.FrameView$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                boolean zBooleanValue = newValue.booleanValue();
                oldValue.booleanValue();
                FrameView frameView = this;
                frameView.setCornerColor(zBooleanValue ? frameView.f29215s0 : frameView.f29214r0);
            }
        };
        this.f29217u0 = new Rect();
        final Ratio check = Ratio.INSTANCE.getCheck();
        this.v0 = new ObservableProperty<Ratio>(check) { // from class: com.bbva.document.scanner.presentation.view.FrameView$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Ratio oldValue, Ratio newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                Ratio ratio = newValue;
                FrameView frameView = this;
                ViewGroup.LayoutParams layoutParams = frameView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.dimensionRatio = String.valueOf(ratio.aspectRatio());
                frameView.setLayoutParams(layoutParams2);
            }
        };
        final int i10 = -1;
        this.f29218w0 = new ObservableProperty<Integer>(i10) { // from class: com.bbva.document.scanner.presentation.view.FrameView$special$$inlined$observable$3
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Integer oldValue, Integer newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                newValue.intValue();
                oldValue.intValue();
                this.invalidate();
            }
        };
        a(attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int getCornerColor() {
        return ((Number) this.f29218w0.getValue(this, f29210x0[2])).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCornerColor(int i10) {
        this.f29218w0.setValue(this, f29210x0[2], Integer.valueOf(i10));
    }

    public final void a(AttributeSet attributeSet, int i10) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.FrameView, i10, R.style.FrameStyle);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr….FrameStyle\n            )");
            this.f29213q0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FrameView_cameraFrame_showCorners, this.f29213q0);
            this.f29214r0 = typedArrayObtainStyledAttributes.getColor(R.styleable.FrameView_cameraFrame_cornerColorDefault, this.f29214r0);
            this.f29215s0 = typedArrayObtainStyledAttributes.getColor(R.styleable.FrameView_cameraFrame_cornerColorHighlighted, this.f29215s0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // com.bbva.document.scanner.presentation.view.BoxProvider
    @NotNull
    public Rect bounds() {
        Rect rect = new Rect(getLeft(), getTop(), getRight(), getBottom());
        int i10 = this.f29212p0;
        rect.inset(i10, i10);
        return rect;
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.draw(canvas);
        int width = getWidth();
        int i10 = this.f29212p0;
        this.f29217u0.set(i10, i10, width - i10, getHeight() - i10);
        if (this.f29213q0) {
            Size size = new Size(getWidth(), getHeight());
            for (Corners corners : Corners.values()) {
                Drawable drawable = AppCompatResources.getDrawable(getContext(), corners.getDrawableResId());
                if (drawable != null) {
                    drawable.setTint(getCornerColor());
                    corners.draw(canvas, drawable, size);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHighlight() {
        return ((Boolean) this.f29216t0.getValue(this, f29210x0[0])).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Ratio getRatio() {
        return (Ratio) this.v0.getValue(this, f29210x0[1]);
    }

    public final void setHighlight(boolean z10) {
        this.f29216t0.setValue(this, f29210x0[0], Boolean.valueOf(z10));
    }

    public final void setRatio(@NotNull Ratio ratio) {
        Intrinsics.checkNotNullParameter(ratio, "<set-?>");
        this.v0.setValue(this, f29210x0[1], ratio);
    }

    public FrameView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f29212p0 = 10;
        this.f29213q0 = true;
        this.f29214r0 = ContextCompat.getColor(getContext(), com.bbva.cellswidgets.R.color.BBVA_SKY_BLUE);
        this.f29215s0 = ContextCompat.getColor(getContext(), com.bbva.cellswidgets.R.color.BBVA_MEDIUM_AQUA);
        Delegates delegates = Delegates.INSTANCE;
        final Boolean bool = Boolean.FALSE;
        this.f29216t0 = new ObservableProperty<Boolean>(bool) { // from class: com.bbva.document.scanner.presentation.view.FrameView$special$$inlined$observable$4
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                boolean zBooleanValue = newValue.booleanValue();
                oldValue.booleanValue();
                FrameView frameView = this;
                frameView.setCornerColor(zBooleanValue ? frameView.f29215s0 : frameView.f29214r0);
            }
        };
        this.f29217u0 = new Rect();
        final Ratio check = Ratio.INSTANCE.getCheck();
        this.v0 = new ObservableProperty<Ratio>(check) { // from class: com.bbva.document.scanner.presentation.view.FrameView$special$$inlined$observable$5
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Ratio oldValue, Ratio newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                Ratio ratio = newValue;
                FrameView frameView = this;
                ViewGroup.LayoutParams layoutParams = frameView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.dimensionRatio = String.valueOf(ratio.aspectRatio());
                frameView.setLayoutParams(layoutParams2);
            }
        };
        final int i11 = -1;
        this.f29218w0 = new ObservableProperty<Integer>(i11) { // from class: com.bbva.document.scanner.presentation.view.FrameView$special$$inlined$observable$6
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Integer oldValue, Integer newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                newValue.intValue();
                oldValue.intValue();
                this.invalidate();
            }
        };
        a(attributeSet, i10);
    }

    @Override // com.bbva.document.scanner.presentation.view.BoxProvider
    @NotNull
    public View view() {
        return this;
    }
}
