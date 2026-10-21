package com.bbva.plugin.zoomauthp.command;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityCreatorRequest;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResult;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResultRequest;
import com.bbva.androidtoolkit.plugin.activity.result.LaunchResultCallback;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.PermissionCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.zoomauthp.validators.ZoomAuthParamsValidator;
import com.bbva.zoomauth.data.ZoomParams;
import com.bbva.zoomauth.facialauth.constant.RequestCodeConstants;
import com.bbva.zoomauth.ui.ZoomActivity;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ZoomAuthCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\t"}, d2 = {"Lcom/bbva/plugin/zoomauthp/command/ZoomAuthCommand;", "Lcom/bbva/androidtoolkit/plugin/command/PermissionCommand;", "Lcom/bbva/zoomauth/data/ZoomParams;", "", "executeWithPermissionsGranted", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityCreatorRequest;", "activityLauncher", "<init>", "(Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityCreatorRequest;)V", "zoomauth-plugin_release"}, k = 1, mv = {1, 5, 1})
public final class ZoomAuthCommand extends PermissionCommand<ZoomParams> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final ActivityCreatorRequest f36090q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f36091r0;

    /* JADX INFO: compiled from: ZoomAuthCommand.kt */
    public static final class a extends Lambda implements Function1<ActivityResultRequest.Builder, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResultRequest.Builder builder) {
            ActivityResultRequest.Builder create = builder;
            Intrinsics.checkNotNullParameter(create, "$this$create");
            create.setTarget(ZoomActivity.class);
            Bundle bundle = new Bundle();
            String userName = ((ZoomParams) ((PermissionCommand) ZoomAuthCommand.this).mParams).getUserName();
            Intrinsics.checkNotNull(userName);
            bundle.putString("userName", userName);
            bundle.putInt("requestCode", RequestCodeConstants.REQUEST_ZOOM_AUTH);
            Unit unit = Unit.INSTANCE;
            create.setExtras(bundle);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ZoomAuthCommand.kt */
    public static final class b extends Lambda implements Function1<ActivityResult, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResult activityResult) {
            ActivityResult it = activityResult;
            Intrinsics.checkNotNullParameter(it, "it");
            boolean z10 = it instanceof ActivityResult.Success;
            ZoomAuthCommand zoomAuthCommand = ZoomAuthCommand.this;
            if (z10) {
                ZoomCommandUtil zoomCommandUtil = ZoomCommandUtil.INSTANCE;
                Intent intent = ((ActivityResult.Success) it).getIntent();
                CommandCallback mCommandCallback = ((PermissionCommand) zoomAuthCommand).mCommandCallback;
                Intrinsics.checkNotNullExpressionValue(mCommandCallback, "mCommandCallback");
                CoroutineScope coroutineScope = zoomAuthCommand.f36091r0;
                Gson mGson = ((AbstractCommand) zoomAuthCommand).mGson;
                Intrinsics.checkNotNullExpressionValue(mGson, "mGson");
                zoomCommandUtil.sendEvent(intent, mCommandCallback, coroutineScope, mGson);
            } else if (it instanceof ActivityResult.Cancel) {
                ZoomCommandUtil zoomCommandUtil2 = ZoomCommandUtil.INSTANCE;
                CommandCallback mCommandCallback2 = ((PermissionCommand) zoomAuthCommand).mCommandCallback;
                Intrinsics.checkNotNullExpressionValue(mCommandCallback2, "mCommandCallback");
                Gson mGson2 = ((AbstractCommand) zoomAuthCommand).mGson;
                Intrinsics.checkNotNullExpressionValue(mGson2, "mGson");
                zoomCommandUtil2.sendErrorEvent("Cancelled", mCommandCallback2, mGson2);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomAuthCommand(@NotNull ActivityCreatorRequest activityLauncher) {
        super(ZoomParams.class, "android.permission.CAMERA");
        Intrinsics.checkNotNullParameter(activityLauncher, "activityLauncher");
        this.f36090q0 = activityLauncher;
        this.f36091r0 = CoroutineScopeKt.MainScope();
        setValidator(new ZoomAuthParamsValidator());
    }

    @Override // com.bbva.androidtoolkit.plugin.command.PermissionCommand
    public void executeWithPermissionsGranted() {
        Optional<Activity> optional = this.mActivityContainer.get();
        if (!optional.isPresent()) {
            ZoomCommandUtil zoomCommandUtil = ZoomCommandUtil.INSTANCE;
            CommandCallback mCommandCallback = this.mCommandCallback;
            Intrinsics.checkNotNullExpressionValue(mCommandCallback, "mCommandCallback");
            Gson mGson = this.mGson;
            Intrinsics.checkNotNullExpressionValue(mGson, "mGson");
            zoomCommandUtil.sendErrorEvent(null, mCommandCallback, mGson);
            return;
        }
        if (this.mParams == 0) {
            this.mCommandCallback.sendError(Errors.ErrorMalformedParam);
            return;
        }
        try {
            LaunchResultCallback launchResultCallbackListen = this.f36090q0.create(new a()).listen(new b());
            Activity activity = optional.get();
            Intrinsics.checkNotNullExpressionValue(activity, "optionalActivity.get()");
            launchResultCallbackListen.launch(activity);
        } catch (Exception unused) {
            ZoomCommandUtil zoomCommandUtil2 = ZoomCommandUtil.INSTANCE;
            CommandCallback mCommandCallback2 = this.mCommandCallback;
            Intrinsics.checkNotNullExpressionValue(mCommandCallback2, "mCommandCallback");
            Gson mGson2 = this.mGson;
            Intrinsics.checkNotNullExpressionValue(mGson2, "mGson");
            zoomCommandUtil2.sendErrorEvent(null, mCommandCallback2, mGson2);
        }
    }
}
