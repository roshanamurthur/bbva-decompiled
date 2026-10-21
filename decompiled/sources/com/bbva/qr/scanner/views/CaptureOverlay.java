package com.bbva.qr.scanner.views;

import android.content.Context;
import android.util.AttributeSet;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.qr.extension.ContextKt;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CaptureOverlay.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¨\u0006\u000f"}, d2 = {"Lcom/bbva/qr/scanner/views/CaptureOverlay;", "Lcom/bbva/qr/scanner/views/GraphicOverlay;", "Lcom/bbva/qr/scanner/views/GraphicOverlay$Graphic;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", PluginUtils.IDENTIFIER_LAYOUT, "", Parameters.DIRECTION.LEFT, "", "top", Parameters.DIRECTION.RIGHT, "bottom", "qr_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CaptureOverlay extends GraphicOverlay<GraphicOverlay.Graphic> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureOverlay(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @Override // android.view.View
    public void layout(int left, int top, int right, int bottom) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int iDpToPx = ContextKt.dpToPx(context, 30);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        int iDpToPx2 = ContextKt.dpToPx(context2, 70);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        int iDpToPx3 = right - ContextKt.dpToPx(context3, 30);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        super.layout(iDpToPx, iDpToPx2, iDpToPx3, bottom - ContextKt.dpToPx(context4, 300));
    }
}
