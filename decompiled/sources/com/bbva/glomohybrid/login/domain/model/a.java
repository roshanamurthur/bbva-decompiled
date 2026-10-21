package com.bbva.glomohybrid.login.domain.model;

import com.bbva.cells.componentkit.model.dsl.Resource;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.glomohybrid.login.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CredentialsViewState.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends Lambda implements Function1<TextSettings, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CredentialsViewState f33417p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CredentialsViewState credentialsViewState) {
        super(1);
        this.f33417p0 = credentialsViewState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TextSettings textSettings) {
        TextSettings textSettings2 = textSettings;
        Intrinsics.checkNotNullParameter(textSettings2, "$this$textSettings");
        textSettings2.setText(new Resource(this.f33417p0.f33383a.getString(R.string.login_get_into), (ResourceId) null, 2, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }
}
