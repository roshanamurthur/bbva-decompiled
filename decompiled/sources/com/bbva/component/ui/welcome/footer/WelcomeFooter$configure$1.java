package com.bbva.component.ui.welcome.footer;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: WelcomeFooter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 0})
public final class WelcomeFooter$configure$1 implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function1 f28784p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ButtonConfig f28785q0;

    public WelcomeFooter$configure$1(Function1 function1, ButtonConfig buttonConfig) {
        this.f28784p0 = function1;
        this.f28785q0 = buttonConfig;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f28784p0.invoke(this.f28785q0);
    }
}
