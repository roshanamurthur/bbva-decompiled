package com.bbva.plugin.contacts.command.impl;

import com.bbva.androidtoolkit.plugin.activity.result.ActivityResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: PickContactCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b extends Lambda implements Function1<ActivityResult, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ PickContactCommand f35608p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PickContactCommand pickContactCommand) {
        super(1);
        this.f35608p0 = pickContactCommand;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ActivityResult activityResult) {
        ActivityResult result = activityResult;
        Intrinsics.checkNotNullParameter(result, "result");
        boolean z10 = result instanceof ActivityResult.Success;
        PickContactCommand pickContactCommand = this.f35608p0;
        if (z10) {
            PickContactCommand.access$onSuccess(pickContactCommand, ((ActivityResult.Success) result).getIntent());
        } else if (result instanceof ActivityResult.Cancel) {
            pickContactCommand.mCommandCallback.sendError(((ActivityResult.Cancel) result).getError());
        }
        return Unit.INSTANCE;
    }
}
