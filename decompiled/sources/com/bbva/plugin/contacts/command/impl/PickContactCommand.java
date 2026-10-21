package com.bbva.plugin.contacts.command.impl;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.optional.function.Consumer;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityLauncher;
import com.bbva.androidtoolkit.plugin.activity.result.LaunchResultCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.contacts.ContactAccessor;
import com.bbva.plugin.contacts.command.impl.base.ContactCommand;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: compiled from: PickContactCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/bbva/plugin/contacts/command/impl/PickContactCommand;", "Lcom/bbva/plugin/contacts/command/impl/base/ContactCommand;", "", "executeWithPermissionsGranted", "Lcom/bbva/contacts/ContactAccessor;", "contactAccessor", "<init>", "(Lcom/bbva/contacts/ContactAccessor;)V", "contacts-plugin_release"}, k = 1, mv = {1, 9, 0})
public final class PickContactCommand extends ContactCommand<Unit> {

    /* JADX INFO: compiled from: PickContactCommand.kt */
    public static final class a extends Lambda implements Function1<Activity, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Activity activity) {
            Activity activity2 = activity;
            LaunchResultCallback launchResultCallbackListen = new ActivityLauncher().create(new com.bbva.plugin.contacts.command.impl.a(activity2)).listen(new b(PickContactCommand.this));
            Intrinsics.checkNotNull(activity2);
            launchResultCallbackListen.launch(activity2);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickContactCommand(@NotNull ContactAccessor contactAccessor) {
        super(contactAccessor, Unit.class, 0);
        Intrinsics.checkNotNullParameter(contactAccessor, "contactAccessor");
    }

    public static final void access$onSuccess(PickContactCommand pickContactCommand, Intent intent) {
        Object objM5535constructorimpl;
        String lastPathSegment;
        pickContactCommand.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            Uri data = intent.getData();
            if (data == null || (lastPathSegment = data.getLastPathSegment()) == null) {
                lastPathSegment = "";
            }
            Intrinsics.checkNotNull(lastPathSegment);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(pickContactCommand.getMContactAccessor().getContactById(lastPathSegment));
            pickContactCommand.mCommandCallback.sendEvent(jSONArray);
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) == null) {
            return;
        }
        pickContactCommand.mCommandCallback.sendError(Errors.ErrorDefault);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.PermissionCommand
    public void executeWithPermissionsGranted() {
        Optional<Activity> optional = this.mActivityContainer.get();
        final a aVar = new a();
        optional.ifPresent(new Consumer() { // from class: cb.a
            @Override // com.bbva.androidtoolkit.optional.function.Consumer
            public final void accept(Object obj) {
                Function1 tmp0 = aVar;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }
        });
    }
}
