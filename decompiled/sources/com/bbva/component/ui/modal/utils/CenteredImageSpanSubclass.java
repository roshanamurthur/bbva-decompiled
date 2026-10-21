package com.bbva.component.ui.modal.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.androidtoolkit.utils.PluginUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CenteredImageSpanSubclass.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JR\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, d2 = {"Lcom/bbva/component/ui/modal/utils/CenteredImageSpanSubclass;", "Landroid/text/style/ImageSpan;", PluginUtils.IDENTIFIER_DRAWABLE, "Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "", "end", "x", "", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CenteredImageSpanSubclass extends ImageSpan {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenteredImageSpanSubclass(@NotNull Drawable drawable) {
        super(drawable);
        Intrinsics.checkNotNullParameter(drawable, "drawable");
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @Nullable CharSequence text, int start, int end, float x4, int top, int y7, int bottom, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.save();
        canvas.translate(x4, (((bottom - top) / 2) - (getDrawable().getBounds().height() / 2)) - end);
        getDrawable().draw(canvas);
        canvas.restore();
    }
}
