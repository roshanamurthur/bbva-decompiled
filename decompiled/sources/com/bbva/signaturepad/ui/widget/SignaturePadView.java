package com.bbva.signaturepad.ui.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.camera.core.processing.o;
import androidx.core.view.ViewCompat;
import com.bbva.plugin.localstorage.command.ClearCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SignaturePadView.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u0019\u001a\u001bB'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¨\u0006\u001c"}, d2 = {"Lcom/bbva/signaturepad/ui/widget/SignaturePadView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", ClearCommand.ID, "Lcom/bbva/signaturepad/ui/widget/SignaturePadView$OnSignatureSaveListener;", "signatureSaveListener", "save", "Lcom/bbva/signaturepad/ui/widget/SignaturePadView$SignatureCallback;", "signatureCallback", "setSignatureCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "OnSignatureSaveListener", "SignatureCallback", "signaturepad_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSignaturePadView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignaturePadView.kt\ncom/bbva/signaturepad/ui/widget/SignaturePadView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
public final class SignaturePadView extends View {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Path f36575p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Paint f36576q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public SignatureCallback f36577r0;

    /* JADX INFO: compiled from: SignaturePadView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bbva/signaturepad/ui/widget/SignaturePadView$Companion;", "", "()V", "DOT_OFFSET", "", "STROKE_WIDTH", "signaturepad_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: SignaturePadView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bbva/signaturepad/ui/widget/SignaturePadView$OnSignatureSaveListener;", "", "onSignatureSaveFailed", "", "onSignatureSaved", "signaturepad_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnSignatureSaveListener {
        void onSignatureSaveFailed();

        void onSignatureSaved();
    }

    /* JADX INFO: compiled from: SignaturePadView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bbva/signaturepad/ui/widget/SignaturePadView$SignatureCallback;", "", "onClear", "", "onStart", "signaturepad_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SignatureCallback {
        void onClear();

        void onStart();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SignaturePadView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void clear() {
        this.f36575p0.reset();
        invalidate();
        SignatureCallback signatureCallback = this.f36577r0;
        if (signatureCallback != null) {
            signatureCallback.onClear();
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.f36575p0, this.f36576q0);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        float x4 = event.getX();
        float y7 = event.getY();
        int action = event.getAction();
        Path path = this.f36575p0;
        if (action == 0) {
            path.moveTo(x4, y7);
            path.addRect(x4 - 0.5f, y7 - 0.5f, x4 + 0.5f, y7 + 0.5f, Path.Direction.CCW);
            invalidate();
        } else if (action == 1) {
            SignatureCallback signatureCallback = this.f36577r0;
            if (signatureCallback != null) {
                signatureCallback.onStart();
            }
        } else if (action == 2) {
            path.lineTo(x4, y7);
            invalidate();
        }
        return true;
    }

    public final void save(@NotNull OnSignatureSaveListener signatureSaveListener) {
        Intrinsics.checkNotNullParameter(signatureSaveListener, "signatureSaveListener");
        setDrawingCacheEnabled(true);
        buildDrawingCache(false);
        post(new o(getDrawingCache(false), signatureSaveListener, 1));
    }

    public final void setSignatureCallback(@Nullable SignatureCallback signatureCallback) {
        this.f36577r0 = signatureCallback;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SignaturePadView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SignaturePadView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SignaturePadView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f36575p0 = new Path();
        Paint paint = new Paint();
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(5.0f);
        this.f36576q0 = paint;
    }
}
