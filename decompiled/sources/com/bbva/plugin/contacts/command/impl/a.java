package com.bbva.plugin.contacts.command.impl;

import android.app.Activity;
import android.provider.ContactsContract;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResultRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: PickContactCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a extends Lambda implements Function1<ActivityResultRequest.Builder, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Activity f35607p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Activity activity) {
        super(1);
        this.f35607p0 = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ActivityResultRequest.Builder builder) {
        ActivityResultRequest.Builder create = builder;
        Intrinsics.checkNotNullParameter(create, "$this$create");
        create.setTarget(this.f35607p0.getClass());
        create.setAction("android.intent.action.PICK");
        create.setUri(ContactsContract.Contacts.CONTENT_URI);
        return Unit.INSTANCE;
    }
}
