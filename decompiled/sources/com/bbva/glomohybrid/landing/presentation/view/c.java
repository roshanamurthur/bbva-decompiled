package com.bbva.glomohybrid.landing.presentation.view;

import android.view.View;
import androidx.fragment.app.DialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LandingChangeUserModalsView.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class c extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DialogFragment f33110p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LandingChangeUserModalsView f33111q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DialogFragment dialogFragment, LandingChangeUserModalsView landingChangeUserModalsView) {
        super(1);
        this.f33110p0 = dialogFragment;
        this.f33111q0 = landingChangeUserModalsView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f33110p0.dismiss();
        LandingChangeUserModalsView.access$emitPositiveIntent(this.f33111q0, LandingChangeUserModalsView.Intent.ConfirmChangeUser.INSTANCE);
        return Unit.INSTANCE;
    }
}
