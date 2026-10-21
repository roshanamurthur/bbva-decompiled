package com.bbva.plugin.zoomauthp.command;

import android.content.Intent;
import android.os.Bundle;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.zoomauth.data.ZoomAuthResponseData;
import com.bbva.zoomauth.facialauth.AuxCache;
import com.bbva.zoomauth.facialauth.ResponseDataUtil;
import com.bbva.zoomauth.ui.ZoomActivity;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: ZoomCommandUtil.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ \u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/bbva/plugin/zoomauthp/command/ZoomCommandUtil;", "", "Landroid/content/Intent;", "intent", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/google/gson/Gson;", "gson", "", "sendEvent", "", "error", "sendErrorEvent", "USER_CANCELLED", "Ljava/lang/String;", "USER_NAME", "<init>", "()V", "zoomauth-plugin_release"}, k = 1, mv = {1, 5, 1})
public final class ZoomCommandUtil {

    @NotNull
    public static final ZoomCommandUtil INSTANCE = new ZoomCommandUtil();

    @NotNull
    public static final String USER_CANCELLED = "Cancelled";

    @NotNull
    public static final String USER_NAME = "userName";

    /* JADX INFO: compiled from: ZoomCommandUtil.kt */
    @DebugMetadata(c = "com.bbva.plugin.zoomauthp.command.ZoomCommandUtil$sendEvent$1$1", f = "ZoomCommandUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f36094p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f36095q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Gson f36096r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, CommandCallback commandCallback, Gson gson, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f36094p0 = str;
            this.f36095q0 = commandCallback;
            this.f36096r0 = gson;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f36094p0, this.f36095q0, this.f36096r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String it = this.f36094p0;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (it.length() > 0) {
                ZoomAuthResponseData zoomAuthResponseData = (ZoomAuthResponseData) new Gson().fromJson(it, ZoomAuthResponseData.class);
                ZoomCommandUtil.access$addLargeData(ZoomCommandUtil.INSTANCE, zoomAuthResponseData);
                this.f36095q0.sendEvent(new JSONObject(this.f36096r0.toJson(zoomAuthResponseData)));
            }
            return Unit.INSTANCE;
        }
    }

    public static final void access$addLargeData(ZoomCommandUtil zoomCommandUtil, ZoomAuthResponseData zoomAuthResponseData) {
        zoomCommandUtil.getClass();
        AuxCache auxCache = AuxCache.INSTANCE;
        if (auxCache.getSUCCESS_FACIAL_AUTH_DATA().length() > 0) {
            try {
                zoomAuthResponseData.setData((JsonObject) new Gson().fromJson(auxCache.getSUCCESS_FACIAL_AUTH_DATA(), JsonObject.class));
                if (auxCache.getSUCCESS_BASE_64_DATA().length() > 0) {
                    zoomAuthResponseData.setBase64Img(auxCache.getSUCCESS_BASE_64_DATA());
                }
            } catch (JsonParseException unused) {
                zoomAuthResponseData.setCode(3);
                zoomAuthResponseData.setData(null);
                zoomAuthResponseData.setMessage("Plugin Zoom parsing error");
            }
            AuxCache auxCache2 = AuxCache.INSTANCE;
            auxCache2.setSUCCESS_FACIAL_AUTH_DATA("");
            auxCache2.setSUCCESS_BASE_64_DATA("");
        }
    }

    public final void sendErrorEvent(@Nullable String error, @NotNull CommandCallback callback, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(gson, "gson");
        callback.sendEvent(new JSONObject(gson.toJson(ResponseDataUtil.INSTANCE.getErrorResponse(error))));
    }

    public final void sendEvent(@NotNull Intent intent, @NotNull CommandCallback callback, @NotNull CoroutineScope scope, @NotNull Gson gson) {
        String string;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Bundle extras = intent.getExtras();
        if (extras == null || (string = extras.getString(ZoomActivity.EXTRA_ZOOM_AUTH_RESULT)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new a(string, callback, gson, null), 3, null);
    }
}
