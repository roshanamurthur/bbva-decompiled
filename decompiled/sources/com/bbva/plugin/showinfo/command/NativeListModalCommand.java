package com.bbva.plugin.showinfo.command;

import android.app.Activity;
import android.os.Bundle;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResult;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResultRequest;
import com.bbva.androidtoolkit.plugin.activity.result.LaunchResultCallback;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.showinfo.NativeListValidator;
import com.bbva.plugin.showinfo.di.Injector;
import com.bbva.showinfo.nativemodal.ConstantsKt;
import com.bbva.showinfo.nativemodal.activity.NativeListModalActivity;
import com.bbva.showinfo.nativemodal.modal.NativeListModalConfiguration;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: NativeListModalCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/plugin/showinfo/command/NativeListModalCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/showinfo/nativemodal/modal/NativeListModalConfiguration;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "commandCallback", "", "execute", "<init>", "()V", "Companion", "showinfo-plugin_release"}, k = 1, mv = {1, 9, 0})
public final class NativeListModalCommand extends AbstractCommand<NativeListModalConfiguration> {

    @NotNull
    public static final String ID = "shownativelistmodal";

    /* JADX INFO: compiled from: NativeListModalCommand.kt */
    @SourceDebugExtension({"SMAP\nNativeListModalCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeListModalCommand.kt\ncom/bbva/plugin/showinfo/command/NativeListModalCommand$execute$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
    public static final class a extends Lambda implements Function1<ActivityResultRequest.Builder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ NativeListModalConfiguration f36000p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NativeListModalConfiguration nativeListModalConfiguration) {
            super(1);
            this.f36000p0 = nativeListModalConfiguration;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResultRequest.Builder builder) {
            ActivityResultRequest.Builder create = builder;
            Intrinsics.checkNotNullParameter(create, "$this$create");
            Bundle bundle = new Bundle();
            bundle.putParcelable(ConstantsKt.NATIVE_MODAL_CONFIG, this.f36000p0);
            create.setExtras(bundle);
            create.setTarget(NativeListModalActivity.class);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NativeListModalCommand.kt */
    public static final class b extends Lambda implements Function1<ActivityResult, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f36002q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CommandCallback commandCallback) {
            super(1);
            this.f36002q0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResult activityResult) throws JSONException {
            ActivityResult it = activityResult;
            Intrinsics.checkNotNullParameter(it, "it");
            NativeListModalCommand.access$processActivityResult(NativeListModalCommand.this, it, this.f36002q0);
            return Unit.INSTANCE;
        }
    }

    public NativeListModalCommand() {
        super(NativeListModalConfiguration.class, new NativeListValidator());
    }

    public static final void access$processActivityResult(NativeListModalCommand nativeListModalCommand, ActivityResult activityResult, CommandCallback commandCallback) throws JSONException {
        nativeListModalCommand.getClass();
        if (!(activityResult instanceof ActivityResult.Success)) {
            if (activityResult instanceof ActivityResult.Cancel) {
                commandCallback.sendError(Errors.ErrorCanceled);
            }
        } else {
            JSONObject jSONObject = new JSONObject();
            Bundle extras = ((ActivityResult.Success) activityResult).getIntent().getExtras();
            if (extras != null) {
                jSONObject.put(ConstantsKt.NATIVE_MODAL_ITEM_SELECTED, extras.getString(ConstantsKt.NATIVE_MODAL_ITEM_SELECTED));
            }
            commandCallback.sendEvent(jSONObject);
        }
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull NativeListModalConfiguration params, @NotNull CommandCallback commandCallback) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(commandCallback, "commandCallback");
        Optional<Activity> optional = this.mActivityContainer.get();
        if (!optional.isPresent()) {
            commandCallback.sendError(Errors.ErrorDefault);
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            LaunchResultCallback launchResultCallbackListen = Injector.INSTANCE.getActivityLauncher().create(new a(params)).listen(new b(commandCallback));
            Activity activity = optional.get();
            Intrinsics.checkNotNullExpressionValue(activity, "get(...)");
            launchResultCallbackListen.launch(activity);
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
            commandCallback.sendError(Errors.ErrorDefault);
        }
    }
}
