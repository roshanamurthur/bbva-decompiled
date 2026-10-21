package com.bbva.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.ui.R;
import com.bbva.ui.extensions.FloatKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BbvaRatingBar.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0011\b\u0016\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*B\u0019\b\u0016\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b)\u0010-B!\b\u0016\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020\u0003¢\u0006\u0004\b)\u0010/J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0014J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\fH\u0016J)\u0010\u0015\u001a\u00020\u00062!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00060\u0010R$\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR$\u0010!\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR*\u0010&\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u001a¨\u00061"}, d2 = {"Lcom/bbva/ui/widget/BbvaRatingBar;", "Landroid/view/View;", "Landroid/view/View$OnTouchListener;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", SharedPrefsStorage.VERSION_KEY, "Landroid/view/MotionEvent;", "event", "", "onTouch", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newRating", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnRatingChangedListener", "value", "s0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setRatingCount", "(I)V", "ratingCount", "t0", "setRatingSize", "ratingSize", "u0", "setRatingMargin", "ratingMargin", "w0", "getRating", "()I", "setRating", "rating", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBbvaRatingBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BbvaRatingBar.kt\ncom/bbva/ui/widget/BbvaRatingBar\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
public final class BbvaRatingBar extends View implements View.OnTouchListener {
    public static final int RATING_COUNT_DEFAULT = 5;
    public static final int RATING_MARGIN_DEFAULT = 10;
    public static final int RATING_SIZE_DEFAULT = 48;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Rect f37662p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Bitmap f37663q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Bitmap f37664r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public int ratingCount;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public int ratingSize;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public int ratingMargin;

    @Nullable
    public Function1<? super Integer, Unit> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    public int rating;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BbvaRatingBar(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f37662p0 = new Rect();
        b(context, null);
    }

    private final void setRating(int i10) {
        int iCoerceIn = c.coerceIn(i10, 0, this.ratingCount);
        this.rating = iCoerceIn;
        Function1<? super Integer, Unit> function1 = this.v0;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(iCoerceIn));
        }
        invalidate();
    }

    private final void setRatingCount(int i10) {
        this.ratingCount = i10;
        requestLayout();
    }

    private final void setRatingMargin(int i10) {
        this.ratingMargin = i10;
        requestLayout();
    }

    private final void setRatingSize(int i10) {
        this.ratingSize = i10;
        requestLayout();
    }

    public final Bitmap a(Drawable drawable) {
        float intrinsicWidth = drawable.getIntrinsicWidth();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = (int) FloatKt.toPx(intrinsicWidth, context);
        float intrinsicHeight = drawable.getIntrinsicHeight();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(px, (int) FloatKt.toPx(intrinsicHeight, context2), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BbvaRatingBar);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        setRatingCount(typedArrayObtainStyledAttributes.getInteger(R.styleable.BbvaRatingBar_ratingCount, 5));
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.BbvaRatingBar_ratingEmpty);
        if (drawable == null) {
            drawable = ContextCompat.getDrawable(context, R.drawable.ui_ic_star_off);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.BbvaRatingBar_ratingFilled);
        if (drawable2 == null) {
            drawable2 = ContextCompat.getDrawable(context, R.drawable.ui_ic_star_on);
        }
        setRatingSize((int) typedArrayObtainStyledAttributes.getDimension(R.styleable.BbvaRatingBar_ratingSize, TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics())));
        setRatingMargin((int) typedArrayObtainStyledAttributes.getDimension(R.styleable.BbvaRatingBar_ratingMargin, TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics())));
        typedArrayObtainStyledAttributes.recycle();
        if (this.ratingSize < 0) {
            throw new IllegalArgumentException("Rating size < 0 is not possible.");
        }
        if (this.ratingCount < 1) {
            throw new IllegalArgumentException("Rating count < 1 is not possible.");
        }
        Intrinsics.checkNotNull(drawable);
        this.f37663q0 = a(drawable);
        Intrinsics.checkNotNull(drawable2);
        this.f37664r0 = a(drawable2);
        setOnTouchListener(this);
    }

    public final int getRating() {
        return this.rating;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i10 = this.ratingSize;
        Rect rect = this.f37662p0;
        rect.set(0, 0, i10, i10);
        int i11 = this.ratingCount;
        int i12 = this.rating;
        int i13 = i11 - i12;
        for (int i14 = 0; i14 < i12; i14++) {
            Bitmap bitmap = this.f37664r0;
            if (bitmap == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bitmapFilled");
                bitmap = null;
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, (Paint) null);
            rect.offset(this.ratingSize + this.ratingMargin, 0);
        }
        for (int i15 = 0; i15 < i13; i15++) {
            Bitmap bitmap2 = this.f37663q0;
            if (bitmap2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bitmapEmpty");
                bitmap2 = null;
            }
            canvas.drawBitmap(bitmap2, (Rect) null, rect, (Paint) null);
            rect.offset(this.ratingSize + this.ratingMargin, 0);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i10 = this.ratingSize;
        int i11 = this.ratingCount;
        setMeasuredDimension(View.resolveSize(((i11 - 1) * this.ratingMargin) + (i10 * i11), widthMeasureSpec), View.resolveSize(this.ratingSize, heightMeasureSpec));
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NotNull View v3, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(v3, "v");
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0 && actionMasked != 2) {
            return onTouchEvent(event);
        }
        if (event.getX() < 0.0f || event.getX() > getWidth()) {
            return false;
        }
        setRating((int) Math.round(((double) ((event.getX() / getWidth()) * this.ratingCount)) + 0.5d));
        return true;
    }

    public final void setOnRatingChangedListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.v0 = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BbvaRatingBar(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f37662p0 = new Rect();
        b(context, attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BbvaRatingBar(@NotNull Context context, @NotNull AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f37662p0 = new Rect();
        b(context, attrs);
    }
}
