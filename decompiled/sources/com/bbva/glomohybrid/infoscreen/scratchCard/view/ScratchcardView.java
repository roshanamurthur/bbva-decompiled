package com.bbva.glomohybrid.infoscreen.scratchCard.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewKt;
import com.bbva.glomohybrid.base.activityConfigurators.ScratchcardConfiguration;
import com.bbva.glomohybrid.infoscreen.R;
import com.bbva.glomohybrid.infoscreen.databinding.ScratchcardBinding;
import com.bbva.glomohybrid.infoscreen.scratchCard.models.ScratchcardEvents;
import com.bbva.glomohybrid.infoscreen.scratchCard.view.ScratchcardCoverView;
import com.bbva.glomohybrid.infoscreen.scratchCard.view.ScratchcardView;
import f9.a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w8.b;

/* JADX INFO: compiled from: ScratchcardView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010\u0007\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0014R\u0014\u0010\u0013\u001a\u00020\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/scratchCard/view/ScratchcardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/glomohybrid/base/activityConfigurators/ScratchcardConfiguration;", "config", "", "setupViews", "setupScratchcard", "Lcom/bbva/glomohybrid/infoscreen/scratchCard/view/ScratchcardViewModel;", "viewModel", "setup", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "onDetachedFromWindow", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class ScratchcardView extends ConstraintLayout implements CoroutineScope {
    public static final /* synthetic */ int E0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f32476p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ScratchcardViewModel f32477q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final ScratchcardBinding f32478r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public a f32479s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f32480t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f32481u0;
    public float v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public Bitmap f32482w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public Canvas f32483x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final Paint f32484y0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScratchcardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [f9.a] */
    private final void setupScratchcard(final ScratchcardConfiguration config) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final ScratchcardCoverView scratchcardCoverView = new ScratchcardCoverView(context, null, 0, 6, null);
        scratchcardCoverView.setupViews(config);
        if (this.f32480t0) {
            return;
        }
        this.f32479s0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: f9.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int i10 = ScratchcardView.E0;
                ScratchcardView this$0 = this.f68391p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ScratchcardCoverView coverView = scratchcardCoverView;
                Intrinsics.checkNotNullParameter(coverView, "$coverView");
                Bitmap bitmap = this$0.f32482w0;
                ScratchcardBinding scratchcardBinding = this$0.f32478r0;
                if (bitmap == null) {
                    coverView.measure(View.MeasureSpec.makeMeasureSpec(scratchcardBinding.backgroundView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(scratchcardBinding.backgroundView.getHeight(), 1073741824));
                    coverView.layout(0, 0, scratchcardBinding.backgroundView.getWidth(), scratchcardBinding.backgroundView.getHeight());
                    Bitmap bitmapDrawToBitmap$default = ViewKt.drawToBitmap$default(coverView, null, 1, null);
                    this$0.f32482w0 = bitmapDrawToBitmap$default;
                    if (bitmapDrawToBitmap$default != null) {
                        this$0.f32483x0 = new Canvas(bitmapDrawToBitmap$default);
                        this$0.f32484y0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        scratchcardBinding.coverImage.setImageBitmap(bitmapDrawToBitmap$default);
                    }
                }
                scratchcardBinding.backgroundView.setupViews(config);
                scratchcardBinding.backgroundView.setImportantForAccessibility(4);
                this$0.f32480t0 = true;
                if (this$0.f32479s0 == null || !this$0.getViewTreeObserver().isAlive()) {
                    return;
                }
                this$0.getViewTreeObserver().removeOnGlobalLayoutListener(this$0.f32479s0);
                this$0.f32479s0 = null;
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.f32479s0);
    }

    private final void setupViews(ScratchcardConfiguration config) {
        ScratchcardBinding scratchcardBinding = this.f32478r0;
        scratchcardBinding.titleModalLabel.setText(config != null ? config.getTitleModal() : null);
        scratchcardBinding.closeImage.setOnClickListener(new b(this, 1));
        scratchcardBinding.coverImage.setContentDescription(config != null ? config.getTitleScreen() : null);
        scratchcardBinding.textButton.setText(config != null ? config.getTextButton() : null);
        scratchcardBinding.textButton.setOnClickListener(new s5.a(this, 3));
        scratchcardBinding.titleButton.setText(config != null ? config.getTitleButton() : null);
        scratchcardBinding.titleButton.setOnClickListener(new t5.a(this, 1));
    }

    public final void a() {
        ScratchcardViewModel scratchcardViewModel = this.f32477q0;
        if (scratchcardViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scratchcardViewModel = null;
        }
        scratchcardViewModel.setScratchcardRevealed(true);
        ScratchcardViewModel scratchcardViewModel2 = this.f32477q0;
        if (scratchcardViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scratchcardViewModel2 = null;
        }
        scratchcardViewModel2.onTapped(ScratchcardEvents.OnRevealedTapped.INSTANCE);
        ScratchcardBinding scratchcardBinding = this.f32478r0;
        scratchcardBinding.coverImage.setImageBitmap(null);
        scratchcardBinding.textButton.setEnabled(false);
        scratchcardBinding.textButton.setAlpha(0.4f);
        scratchcardBinding.titleButton.setEnabled(true);
        scratchcardBinding.titleButton.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.scratchcard_text_button_color_active));
        scratchcardBinding.backgroundView.setImportantForAccessibility(0);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f32476p0.getCoroutineContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f32479s0 == null || !getViewTreeObserver().isAlive()) {
            return;
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f32479s0);
        this.f32479s0 = null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f32481u0 = event.getX();
        this.v0 = event.getY();
        ScratchcardViewModel scratchcardViewModel = this.f32477q0;
        ScratchcardViewModel scratchcardViewModel2 = null;
        if (scratchcardViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scratchcardViewModel = null;
        }
        if (!scratchcardViewModel.getIsScratchcardRevealed() && (event.getAction() == 2 || event.getAction() == 0)) {
            Canvas canvas = this.f32483x0;
            if (canvas != null) {
                canvas.drawCircle(this.f32481u0 - 20, this.v0 - 200, 80.0f, this.f32484y0);
            }
            this.f32478r0.coverImage.setImageBitmap(this.f32482w0);
            ScratchcardViewModel scratchcardViewModel3 = this.f32477q0;
            if (scratchcardViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                scratchcardViewModel3 = null;
            }
            scratchcardViewModel3.setTouchCount(scratchcardViewModel3.getTouchCount() + 1);
            ScratchcardViewModel scratchcardViewModel4 = this.f32477q0;
            if (scratchcardViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                scratchcardViewModel2 = scratchcardViewModel4;
            }
            if (scratchcardViewModel2.getTouchCount() > 300) {
                a();
            }
        }
        return true;
    }

    public final void setup(@NotNull ScratchcardViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f32477q0 = viewModel;
        setVisibility(0);
        setupViews(viewModel.getConfiguration());
        setupScratchcard(viewModel.getConfiguration());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScratchcardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ScratchcardView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScratchcardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f32476p0 = CoroutineScopeKt.MainScope();
        ScratchcardBinding scratchcardBindingInflate = ScratchcardBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(scratchcardBindingInflate, "inflate(...)");
        this.f32478r0 = scratchcardBindingInflate;
        this.f32484y0 = new Paint();
    }
}
