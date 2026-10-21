package com.afollestad.materialdialogs.internal.message;

import android.text.style.URLSpan;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CustomUrlSpan.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/afollestad/materialdialogs/internal/message/CustomUrlSpan;", "Landroid/text/style/URLSpan;", "Landroid/view/View;", "widget", "", "onClick", "", "url", "Lkotlin/Function1;", "onLinkClick", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
public final class CustomUrlSpan extends URLSpan {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function1<String, Unit> f25539p0;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomUrlSpan(@NotNull String str, @NotNull Function1<? super String, Unit> function1) {
        super(str);
        this.f25539p0 = function1;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(@NotNull View widget) {
        String url = getURL();
        Intrinsics.checkExpressionValueIsNotNull(url, "url");
        this.f25539p0.invoke(url);
    }
}
