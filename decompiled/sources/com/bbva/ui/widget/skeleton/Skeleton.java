package com.bbva.ui.widget.skeleton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewKt;
import com.bbva.ui.R;
import com.bbva.ui.databinding.SkeletonLayoutBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Skeleton.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004¨\u0006\u0012"}, d2 = {"Lcom/bbva/ui/widget/skeleton/Skeleton;", "Landroidx/constraintlayout/motion/widget/MotionLayout;", "", "enabled", "", "setAnimationLoop", "onAttachedToWindow", "startAnimation", "stopAnimation", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "ui_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSkeleton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Skeleton.kt\ncom/bbva/ui/widget/skeleton/Skeleton\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,167:1\n233#2,3:168\n*S KotlinDebug\n*F\n+ 1 Skeleton.kt\ncom/bbva/ui/widget/skeleton/Skeleton\n*L\n41#1:168,3\n*E\n"})
public final class Skeleton extends MotionLayout {
    public static final int $stable = 8;
    public final int N1;

    @NotNull
    public final SkeletonColorStyle O1;
    public boolean P1;

    /* JADX INFO: compiled from: Skeleton.kt */
    @SourceDebugExtension({"SMAP\nSkeleton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Skeleton.kt\ncom/bbva/ui/widget/skeleton/Skeleton$PlaceHoldersOverlay\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,167:1\n1313#2,2:168\n*S KotlinDebug\n*F\n+ 1 Skeleton.kt\ncom/bbva/ui/widget/skeleton/Skeleton$PlaceHoldersOverlay\n*L\n141#1:168,2\n*E\n"})
    public static final class a extends View {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @Nullable
        public ViewGroup f37746p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NotNull
        public final Paint f37747q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @NotNull
        public final Paint f37748r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Context context, @NotNull SkeletonColorStyle colorStyle) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(colorStyle, "colorStyle");
            Paint paint = new Paint();
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            this.f37747q0 = paint;
            Paint paint2 = new Paint();
            paint2.setStyle(style);
            this.f37748r0 = paint2;
            setLayerType(2, null);
            setBackgroundColor(colorStyle.getDefaultColor(context));
        }

        public final void a(ViewGroup viewGroup, Canvas canvas, float f6, float f10) {
            for (View view : ViewGroupKt.getChildren(viewGroup)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) view;
                    a(viewGroup2, canvas, viewGroup2.getLeft() + f6, viewGroup2.getTop() + f10);
                } else {
                    PlaceholderItem placeholderItem = view instanceof PlaceholderItem ? (PlaceholderItem) view : null;
                    boolean z10 = false;
                    if (placeholderItem != null && placeholderItem.getIsAnimatedLayer()) {
                        z10 = true;
                    }
                    canvas.drawBitmap(ViewKt.drawToBitmap$default(view, null, 1, null), view.getLeft() + f6, view.getTop() + f10, !z10 ? this.f37748r0 : this.f37747q0);
                }
            }
        }

        @Override // android.view.View
        public final void onDraw(@NotNull Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            ViewGroup viewGroup = this.f37746p0;
            if (viewGroup != null) {
                a(viewGroup, canvas, 0.0f, 0.0f);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Skeleton(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setAnimationLoop(boolean enabled) {
        MotionScene.Transition transition = getTransition(R.id.initial_step);
        if (transition != null) {
            transition.setAutoTransition(enabled ? 4 : 0);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        loadLayoutDescription(R.xml.skeleton_scene);
        setTransition(R.id.initial_step);
        if (this.P1) {
            startAnimation();
            this.P1 = false;
        }
    }

    public final void startAnimation() {
        if (!isAttachedToWindow()) {
            this.P1 = true;
            return;
        }
        setAnimationLoop(true);
        setTransition(R.id.initial_step);
        transitionToEnd();
    }

    public final void stopAnimation() {
        if (isAttachedToWindow()) {
            setAnimationLoop(false);
        } else {
            this.P1 = false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Skeleton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ Skeleton(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Skeleton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        SkeletonLayoutBinding skeletonLayoutBindingInflate = SkeletonLayoutBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(skeletonLayoutBindingInflate, "inflate(...)");
        this.O1 = SkeletonColorStyle.AMBIENT;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Skeleton);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.N1 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.Skeleton_contentLayout, this.N1);
        this.O1 = SkeletonColorStyle.getEntries().get(typedArrayObtainStyledAttributes.getInt(R.styleable.Skeleton_preloaderColorStyle, 0));
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        View view = skeletonLayoutBindingInflate.skeletonMask;
        SkeletonColorStyle skeletonColorStyle = this.O1;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        view.setBackgroundColor(skeletonColorStyle.getPreloadingColor(context2));
        if (this.N1 != 0) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.N1, (ViewGroup) null);
            skeletonLayoutBindingInflate.skeletonContentLayout.removeAllViews();
            skeletonLayoutBindingInflate.skeletonContentLayout.addView(viewInflate);
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            a aVar = new a(context3, this.O1);
            aVar.setId(R.id.placeholders_overlay);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
            layoutParams.leftToLeft = 0;
            layoutParams.rightToRight = 0;
            layoutParams.topToTop = 0;
            layoutParams.bottomToBottom = 0;
            aVar.setLayoutParams(layoutParams);
            aVar.f37746p0 = viewInflate instanceof ViewGroup ? (ViewGroup) viewInflate : null;
            aVar.invalidate();
            addView(aVar);
        }
    }
}
