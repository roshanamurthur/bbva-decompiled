package com.veridas.dialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PopupWindowBuilder.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eH&J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0013H&J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eH&J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eH&J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u001d"}, d2 = {"Lcom/veridas/dialog/PopupWindowBuilder;", "", "backgroundColor", "value", "", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Landroid/widget/PopupWindow;", "container", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "focusable", "", "height", "layoutInflater", "Landroid/view/LayoutInflater;", "message", "", "outsideTouchable", "popupTextViewId", "popupViewId", "textColor", "touchListener", "Landroid/view/View$OnTouchListener;", "touchable", "verticalScrollbarEnabled", "width", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PopupWindowBuilder {
    @NotNull
    PopupWindowBuilder backgroundColor(int value);

    @NotNull
    PopupWindowBuilder backgroundDrawable(@NotNull Drawable value);

    @NotNull
    PopupWindow build();

    @NotNull
    PopupWindowBuilder container(@NotNull ViewGroup value);

    @NotNull
    PopupWindowBuilder context(@NotNull Context value);

    @NotNull
    PopupWindowBuilder focusable(boolean value);

    @NotNull
    PopupWindowBuilder height(int value);

    @NotNull
    PopupWindowBuilder layoutInflater(@NotNull LayoutInflater value);

    @NotNull
    PopupWindowBuilder message(@NotNull String value);

    @NotNull
    PopupWindowBuilder outsideTouchable(boolean value);

    @NotNull
    PopupWindowBuilder popupTextViewId(int value);

    @NotNull
    PopupWindowBuilder popupViewId(int value);

    @NotNull
    PopupWindowBuilder textColor(@NotNull String value);

    @NotNull
    PopupWindowBuilder touchListener(@NotNull View.OnTouchListener value);

    @NotNull
    PopupWindowBuilder touchable(boolean value);

    @NotNull
    PopupWindowBuilder verticalScrollbarEnabled(boolean value);

    @NotNull
    PopupWindowBuilder width(int value);
}
