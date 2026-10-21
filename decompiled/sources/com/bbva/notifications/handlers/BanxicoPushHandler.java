package com.bbva.notifications.handlers;

import android.content.Context;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.notifications.delegate.LogEventDelegate;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.plugin.push.command.UnregisterCommand;
import com.bbva.push.creator.NotificationCreator;
import com.bbva.push.firebase.ManualFirebasePushHandler;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.ktx.FirebaseKt;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.tasks.TasksKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BanxicoPushHandler.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0013\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/bbva/notifications/handlers/BanxicoPushHandler;", "Lcom/bbva/push/firebase/ManualFirebasePushHandler;", "", "", "", "configurationOptions", "", "configure", "token", "onNewToken", "", UnregisterCommand.ID, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "handlerId", "Lcom/google/firebase/FirebaseOptions;", "options", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "Lcom/bbva/notifications/delegate/LogEventDelegate;", "logEvent", "Lcom/bbva/push/creator/NotificationCreator;", "notificationCreator", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/google/firebase/FirebaseOptions;Lcom/bbva/glomo/storage/MainStorage;Lcom/bbva/notifications/delegate/LogEventDelegate;Lcom/bbva/push/creator/NotificationCreator;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class BanxicoPushHandler extends ManualFirebasePushHandler {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f35366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MainStorage f35367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final LogEventDelegate f35368g;

    /* JADX INFO: compiled from: BanxicoPushHandler.kt */
    @DebugMetadata(c = "com.bbva.notifications.handlers.BanxicoPushHandler", f = "BanxicoPushHandler.kt", i = {0}, l = {61}, m = UnregisterCommand.ID, n = {"$this$unregister_u24lambda_u244_u24lambda_u243"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public FirebaseApp f35369p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f35370q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f35372s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35370q0 = obj;
            this.f35372s0 |= Integer.MIN_VALUE;
            return BanxicoPushHandler.this.unregister(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BanxicoPushHandler(@NotNull Context context, @NotNull String handlerId, @Nullable FirebaseOptions firebaseOptions, @NotNull MainStorage storage, @NotNull LogEventDelegate logEvent, @NotNull NotificationCreator notificationCreator) {
        super(context, handlerId, firebaseOptions, notificationCreator);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handlerId, "handlerId");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(logEvent, "logEvent");
        Intrinsics.checkNotNullParameter(notificationCreator, "notificationCreator");
        this.f35366e = handlerId;
        this.f35367f = storage;
        this.f35368g = logEvent;
        String string$default = MainStorage.getString$default(storage, BanxicoConstants.KEY_PROJECT_OPTIONS, null, true, null, 10, null);
        if (string$default != null) {
            HashMap map = (HashMap) new Gson().fromJson(string$default, (Type) HashMap.class);
            Intrinsics.checkNotNull(map);
            super.configure(map);
        }
    }

    @Override // com.bbva.push.firebase.ManualFirebasePushHandler, com.bbva.push.handler.PushHandler
    public void configure(@NotNull Map<String, ? extends Object> configurationOptions) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(configurationOptions, "configurationOptions");
        try {
            Result.Companion companion = Result.INSTANCE;
            super.configure(configurationOptions);
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
            if (configurationOptions.containsKey(BanxicoConstants.KEY_PROJECT_OPTIONS)) {
                MainStorage.put$default(this.f35367f, BanxicoConstants.KEY_PROJECT_OPTIONS, new Gson().toJson(configurationOptions), true, null, 8, null);
            }
        }
        ResultKt.throwOnFailure(objM5535constructorimpl);
    }

    @Override // com.bbva.push.firebase.ManualFirebasePushHandler, com.bbva.push.handler.PushHandler
    public void onNewToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        super.onNewToken(token);
        this.f35368g.storeInformPushAction(BanxicoConstants.UNIFIED_LOG_EVENT_RECEIVE_REGISTRATION_TOKEN);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.push.firebase.ManualFirebasePushHandler, com.bbva.push.handler.PushHandler
    @Nullable
    public Object unregister(@NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        Object objM5535constructorimpl;
        FirebaseApp firebaseApp;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f35372s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f35372s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f35370q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f35372s0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                Result.Companion companion = Result.INSTANCE;
                FirebaseApp firebaseAppApp = FirebaseKt.app(Firebase.INSTANCE, this.f35366e);
                Task<Void> taskDeleteToken = ((FirebaseMessaging) firebaseAppApp.get(FirebaseMessaging.class)).deleteToken();
                Intrinsics.checkNotNullExpressionValue(taskDeleteToken, "deleteToken(...)");
                aVar.f35369p0 = firebaseAppApp;
                aVar.f35372s0 = 1;
                if (TasksKt.await(taskDeleteToken, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                firebaseApp = firebaseAppApp;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                firebaseApp = aVar.f35369p0;
                ResultKt.throwOnFailure(obj);
            }
            firebaseApp.delete();
            objM5535constructorimpl = Result.m5535constructorimpl(Boxing.boxBoolean(true));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        return Result.m5540isFailureimpl(objM5535constructorimpl) ? Boxing.boxBoolean(false) : objM5535constructorimpl;
    }
}
