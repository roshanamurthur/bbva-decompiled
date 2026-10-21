package com.afollestad.materialdialogs.internal.message;

import android.graphics.Rect;
import android.text.Spannable;
import android.text.method.TransformationMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.google.firebase.dynamiclinks.DynamicLink;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LinkTransformationMethod.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B*\u0012!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J0\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0018"}, d2 = {"Lcom/afollestad/materialdialogs/internal/message/LinkTransformationMethod;", "Landroid/text/method/TransformationMethod;", "", "source", "Landroid/view/View;", "view", "getTransformation", "sourceText", "", "focused", "", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "", "onFocusChanged", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", DynamicLink.Builder.KEY_LINK, "onLinkClick", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
public final class LinkTransformationMethod implements TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1<String, Unit> f25548a;

    /* JADX WARN: Multi-variable type inference failed */
    public LinkTransformationMethod(@NotNull Function1<? super String, Unit> function1) {
        this.f25548a = function1;
    }

    @Override // android.text.method.TransformationMethod
    @NotNull
    public CharSequence getTransformation(@NotNull CharSequence source, @NotNull View view) {
        if (!(view instanceof TextView)) {
            return source;
        }
        TextView textView = (TextView) view;
        if (textView.getText() == null || !(textView.getText() instanceof Spannable)) {
            return source;
        }
        CharSequence text = textView.getText();
        if (text == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.text.Spannable");
        }
        Spannable spannable = (Spannable) text;
        for (URLSpan span : (URLSpan[]) spannable.getSpans(0, textView.length(), URLSpan.class)) {
            int spanStart = spannable.getSpanStart(span);
            int spanEnd = spannable.getSpanEnd(span);
            Intrinsics.checkExpressionValueIsNotNull(span, "span");
            String url = span.getURL();
            spannable.removeSpan(span);
            Intrinsics.checkExpressionValueIsNotNull(url, "url");
            spannable.setSpan(new CustomUrlSpan(url, this.f25548a), spanStart, spanEnd, 33);
        }
        return spannable;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(@NotNull View view, @NotNull CharSequence sourceText, boolean focused, int direction, @NotNull Rect previouslyFocusedRect) {
    }
}
