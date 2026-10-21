package com.bbva.glomohybrid.login.presentation.animation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FadeAnimation.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/animation/FadeOut;", "Lcom/bbva/glomohybrid/login/presentation/animation/Fade;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FadeOut extends Fade {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FadeOut(@NotNull View view) {
        super(view, 1.0f, null);
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
