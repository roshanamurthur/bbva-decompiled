package com.bbva.glomohybrid.landing.presentation.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LandingChangeUserModalsView.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LandingChangeUserModalsView f33116p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LandingChangeUserModalsView landingChangeUserModalsView) {
        super(0);
        this.f33116p0 = landingChangeUserModalsView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LandingChangeUserModalsView.access$emitPositiveIntent(this.f33116p0, LandingChangeUserModalsView.Intent.ConfirmChangeUser.INSTANCE);
        return Unit.INSTANCE;
    }
}
