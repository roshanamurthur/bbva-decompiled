package com.afollestad.materialdialogs.message;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.annotation.StringRes;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.internal.message.LinkTransformationMethod;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.google.firebase.dynamiclinks.DynamicLink;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DialogMessageSettings.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J-\u0010\f\u001a\u00020\u00002%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005J%\u0010\u0013\u001a\u00020\n2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/afollestad/materialdialogs/message/DialogMessageSettings;", "", "", "multiplier", "lineSpacing", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", DynamicLink.Builder.KEY_LINK, "", "onLinkClick", "html", "", "res", "", "text", "setText$com_afollestad_material_dialogs_core", "(Ljava/lang/Integer;Ljava/lang/CharSequence;)V", "setText", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "getMessageTextView", "()Landroid/widget/TextView;", "messageTextView", "Lcom/afollestad/materialdialogs/MaterialDialog;", "dialog", "<init>", "(Lcom/afollestad/materialdialogs/MaterialDialog;Landroid/widget/TextView;)V", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
public final class DialogMessageSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialDialog f25550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextView messageTextView;

    public DialogMessageSettings(@NotNull MaterialDialog materialDialog, @NotNull TextView textView) {
        this.f25550b = materialDialog;
        this.messageTextView = textView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DialogMessageSettings html$default(DialogMessageSettings dialogMessageSettings, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        return dialogMessageSettings.html(function1);
    }

    @NotNull
    public final TextView getMessageTextView() {
        return this.messageTextView;
    }

    @NotNull
    public final DialogMessageSettings html(@Nullable Function1<? super String, Unit> onLinkClick) {
        this.f25549a = true;
        TextView textView = this.messageTextView;
        if (onLinkClick != null) {
            textView.setTransformationMethod(new LinkTransformationMethod(onLinkClick));
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return this;
    }

    @NotNull
    public final DialogMessageSettings lineSpacing(float multiplier) {
        this.messageTextView.setLineSpacing(0.0f, multiplier);
        return this;
    }

    public final void setText$com_afollestad_material_dialogs_core(@StringRes @Nullable Integer res, @Nullable CharSequence text) {
        boolean z10 = this.f25549a;
        if (text == null) {
            text = null;
        } else if (z10) {
            text = Html.fromHtml(text.toString());
        }
        if (text == null) {
            text = MDUtil.resolveString$default(MDUtil.INSTANCE, this.f25550b, res, (Integer) null, this.f25549a, 4, (Object) null);
        }
        this.messageTextView.setText(text);
    }
}
