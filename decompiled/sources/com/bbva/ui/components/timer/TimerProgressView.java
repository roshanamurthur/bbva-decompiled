package com.bbva.ui.components.timer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import com.bbva.ui.R;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TimerProgressView.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00101\u001a\u000200\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00104\u001a\u00020\u0002¢\u0006\u0004\b5\u00106J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u000f\u001a\u00020\u0007H\u0014JW\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00102%\b\u0002\u0010\u0019\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00152\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001aJ\u0006\u0010\u001e\u001a\u00020\u001dR*\u0010'\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010/\u001a\u00020(2\u0006\u0010 \u001a\u00020(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00067"}, d2 = {"Lcom/bbva/ui/components/timer/TimerProgressView;", "Landroid/view/View;", "", "w", "h", "oldw", "oldh", "", "onSizeChanged", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "onDetachedFromWindow", "", "time", "Lcom/bbva/ui/components/timer/TimeFormat;", "timeFormat", "timeInterval", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "millisUntilFinished", "onCurrentTick", "Lkotlin/Function0;", "onTimeFinished", "startCounter", "", "startTimer", "", "value", "u0", "Ljava/lang/String;", "getProgressText", "()Ljava/lang/String;", "setProgressText", "(Ljava/lang/String;)V", "progressText", "", "E0", "F", "getCurrentProgressValue", "()F", "setCurrentProgressValue", "(F)V", "currentProgressValue", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTimerProgressView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimerProgressView.kt\ncom/bbva/ui/components/timer/TimerProgressView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n1#2:305\n*E\n"})
public final class TimerProgressView extends View {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public float currentProgressValue;
    public final float F0;

    @Nullable
    public AnonymousClass1 G0;

    @NotNull
    public final Paint H0;

    @NotNull
    public final Paint I0;

    @NotNull
    public final Paint J0;

    @NotNull
    public final Paint K0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f37032p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f37033q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f37034r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final float f37035s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f37036t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String progressText;
    public final float v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final float f37038w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public float f37039x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final RectF f37040y0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TimerProgressView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void access$formatProgressText(TimerProgressView timerProgressView, SimpleDateFormat simpleDateFormat, long j10) {
        timerProgressView.getClass();
        String str = simpleDateFormat.format(new Date(j10));
        Intrinsics.checkNotNull(str);
        timerProgressView.setProgressText(str);
    }

    public final float getCurrentProgressValue() {
        return this.currentProgressValue;
    }

    @NotNull
    public final String getProgressText() {
        return this.progressText;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        AnonymousClass1 anonymousClass1 = this.G0;
        if (anonymousClass1 != null) {
            anonymousClass1.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawCircle(this.f37039x0 + this.F0, getHeight() / 2, this.f37039x0, this.J0);
        RectF rectF = this.f37040y0;
        canvas.drawArc(rectF, 0.0f, 360.0f, false, this.I0);
        float f6 = 360;
        canvas.drawArc(rectF, this.v0, f6 - ((this.currentProgressValue / this.f37038w0) * f6), false, this.H0);
        String str = this.progressText;
        Paint paint = this.K0;
        canvas.drawText(str, canvas.getWidth() / 2.0f, (canvas.getHeight() / 2.0f) - ((paint.ascent() + paint.descent()) / 2.0f), paint);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int iCoerceAtMost = c.coerceAtMost(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
        setMeasuredDimension(iCoerceAtMost, iCoerceAtMost);
    }

    @Override // android.view.View
    public void onSizeChanged(int w6, int h4, int oldw, int oldh) {
        super.onSizeChanged(w6, h4, oldw, oldh);
        float fCoerceAtMost = c.coerceAtMost(w6, h4) / 2.0f;
        float f6 = this.F0;
        float f10 = fCoerceAtMost - f6;
        this.f37039x0 = f10;
        float f11 = (f10 * 2) + f6;
        this.f37040y0.set(f6, f6, f11, f11);
    }

    public final void setCurrentProgressValue(float f6) {
        this.currentProgressValue = f6;
        invalidate();
    }

    public final void setProgressText(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.progressText = value;
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [com.bbva.ui.components.timer.TimerProgressView$startCounter$1] */
    public final void startCounter(long time, @NotNull TimeFormat timeFormat, long timeInterval, @Nullable Function1<? super Long, Unit> onCurrentTick, @Nullable Function0<Unit> onTimeFinished) {
        Intrinsics.checkNotNullParameter(timeFormat, "timeFormat");
        AnonymousClass1 anonymousClass1 = this.G0;
        if (anonymousClass1 != null) {
            anonymousClass1.cancel();
        }
        this.G0 = new CountDownTimer(TimeFormatKt.toMilliSeconds(timeFormat, time), timeInterval, this, timeFormat.getDateFormat(), onCurrentTick, onTimeFinished) { // from class: com.bbva.ui.components.timer.TimerProgressView.startCounter.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f37041a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TimerProgressView f37042b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ SimpleDateFormat f37043c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Function1<Long, Unit> f37044d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f37045e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(j, timeInterval);
                this.f37041a = j;
                this.f37042b = this;
                this.f37043c = simpleDateFormat;
                this.f37044d = onCurrentTick;
                this.f37045e = onTimeFinished;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                TimerProgressView timerProgressView = this.f37042b;
                timerProgressView.setCurrentProgressValue(timerProgressView.f37038w0);
                timerProgressView.setProgressText("0");
                onTick(0L);
                Function0<Unit> function0 = this.f37045e;
                if (function0 != null) {
                    function0.invoke();
                }
                timerProgressView.invalidate();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
                long j10 = this.f37041a;
                double d2 = (j10 - millisUntilFinished) / j10;
                TimerProgressView timerProgressView = this.f37042b;
                timerProgressView.setCurrentProgressValue((float) (((double) timerProgressView.f37038w0) * d2));
                TimerProgressView.access$formatProgressText(timerProgressView, this.f37043c, millisUntilFinished);
                Function1<Long, Unit> function1 = this.f37044d;
                if (function1 != null) {
                    function1.invoke(Long.valueOf(millisUntilFinished));
                }
                timerProgressView.invalidate();
            }
        };
    }

    public final boolean startTimer() {
        AnonymousClass1 anonymousClass1 = this.G0;
        return (anonymousClass1 == null || anonymousClass1.start() == null) ? false : true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TimerProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TimerProgressView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TimerProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f37032p0 = -16776961;
        float fApplyDimension = TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
        this.f37033q0 = -7829368;
        float fApplyDimension2 = TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        this.f37034r0 = ViewCompat.MEASURED_STATE_MASK;
        this.f37035s0 = TypedValue.applyDimension(2, 12.0f, getResources().getDisplayMetrics());
        this.f37036t0 = ViewCompat.MEASURED_STATE_MASK;
        this.progressText = "";
        this.v0 = 270.0f;
        this.f37038w0 = 100.0f;
        this.f37040y0 = new RectF();
        this.currentProgressValue = 100.0f;
        this.F0 = fApplyDimension;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(fApplyDimension);
        paint.setColor(this.f37032p0);
        this.H0 = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(fApplyDimension2);
        paint2.setStrokeCap(Paint.Cap.SQUARE);
        paint2.setColor(this.f37033q0);
        this.I0 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(this.f37034r0);
        this.J0 = paint3;
        Paint paint4 = new Paint();
        paint4.setAntiAlias(true);
        paint4.setColor(this.f37032p0);
        paint4.setTextAlign(Paint.Align.CENTER);
        this.K0 = paint4;
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.BBVATheme, i10, 0);
        this.f37034r0 = typedArrayObtainStyledAttributes.getColor(R.styleable.BBVATheme_surface_ambient_default, this.f37034r0);
        this.f37033q0 = typedArrayObtainStyledAttributes.getColor(R.styleable.BBVATheme_surface_ambient_preloading, this.f37033q0);
        this.f37032p0 = typedArrayObtainStyledAttributes.getColor(R.styleable.BBVATheme_process_in_progress, this.f37032p0);
        this.f37036t0 = typedArrayObtainStyledAttributes.getColor(R.styleable.BBVATheme_text_01_default, this.f37036t0);
        TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, R.styleable.TimerProgressView, i10, 0);
        String string = typedArrayObtainStyledAttributes2.getString(R.styleable.TimerProgressView_timerProgressViewText);
        setProgressText(string != null ? string : "");
        this.f37035s0 = typedArrayObtainStyledAttributes2.getDimension(R.styleable.TimerProgressView_timerProgressViewTextSize, this.f37035s0);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(this.f37032p0 & ViewCompat.MEASURED_SIZE_MASK)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        paint.setColor(Color.parseColor(str));
        paint.setStrokeWidth(fApplyDimension);
        paint.setStrokeCap(Paint.Cap.BUTT);
        String str2 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(this.f37033q0 & ViewCompat.MEASURED_SIZE_MASK)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        paint2.setColor(Color.parseColor(str2));
        paint2.setStrokeWidth(fApplyDimension2);
        String str3 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(this.f37034r0 & ViewCompat.MEASURED_SIZE_MASK)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        paint3.setColor(Color.parseColor(str3));
        String str4 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(this.f37036t0 & ViewCompat.MEASURED_SIZE_MASK)}, 1));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        paint4.setColor(Color.parseColor(str4));
        paint4.setTextSize(this.f37035s0);
        typedArrayObtainStyledAttributes2.recycle();
    }
}
