package com.bbva.qr.scanner.graphics;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bbva.qr.scanner.views.GraphicOverlay;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BarcodeGraphic.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0013\u0012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/bbva/qr/scanner/graphics/BarcodeGraphic;", "Lcom/bbva/qr/scanner/views/GraphicOverlay$Graphic;", "Lcom/google/mlkit/vision/barcode/common/Barcode;", OptionalModuleUtils.BARCODE, "", "updateItem", "Landroid/graphics/Canvas;", "canvas", "draw", "", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getId", "()I", "setId", "(I)V", "id", "<set-?>", "e", "Lcom/google/mlkit/vision/barcode/common/Barcode;", "getBarcode", "()Lcom/google/mlkit/vision/barcode/common/Barcode;", "Lcom/bbva/qr/scanner/views/GraphicOverlay;", "overlay", "<init>", "(Lcom/bbva/qr/scanner/views/GraphicOverlay;)V", "Companion", "qr_release"}, k = 1, mv = {1, 8, 0})
public final class BarcodeGraphic extends GraphicOverlay.Graphic {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final int[] f36318f = {-16776961, -16711681, -16711936};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f36319g;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int id;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Paint f36321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Paint f36322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public volatile Barcode barcode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeGraphic(@NotNull GraphicOverlay<?> overlay) {
        super(overlay);
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        int i10 = f36319g + 1;
        int[] iArr = f36318f;
        int length = i10 % iArr.length;
        f36319g = length;
        int i11 = iArr[length];
        Paint paint = new Paint();
        paint.setColor(i11);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        this.f36321c = paint;
        Paint paint2 = new Paint();
        paint2.setColor(i11);
        paint2.setTextSize(36.0f);
        this.f36322d = paint2;
    }

    @Override // com.bbva.qr.scanner.views.GraphicOverlay.Graphic
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Barcode barcode = this.barcode;
        if (barcode == null) {
            return;
        }
        RectF rectF = new RectF(barcode.getBoundingBox());
        rectF.left = translateX(rectF.left);
        rectF.top = translateY(rectF.top);
        rectF.right = translateX(rectF.right);
        rectF.bottom = translateY(rectF.bottom);
        canvas.drawRect(rectF, this.f36321c);
        String rawValue = barcode.getRawValue();
        Intrinsics.checkNotNull(rawValue);
        canvas.drawText(rawValue, rectF.left, rectF.bottom, this.f36322d);
    }

    @Nullable
    public final Barcode getBarcode() {
        return this.barcode;
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i10) {
        this.id = i10;
    }

    public final void updateItem(@NotNull Barcode barcode) {
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        this.barcode = barcode;
        postInvalidate();
    }
}
