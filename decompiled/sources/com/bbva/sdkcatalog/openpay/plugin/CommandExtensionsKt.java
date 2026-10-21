package com.bbva.sdkcatalog.openpay.plugin;

import android.app.Activity;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.component.ActivityContainer;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.sdkcatalog.openpay.plugin.data.error.OpenPayError;
import com.bbva.sdkcatalog.openpay.plugin.data.model.MessageDTOModel;
import com.bbva.sdkcatalog.openpay.plugin.di.InjectorKt;
import com.bbva.sdkcatalog.openpay.plugin.permissions.PermissionExtensionsKt;
import com.google.gson.Gson;
import com.sun.mail.imap.IMAPStore;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: CommandExtensions.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\u0010\u000f\u001ak\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\u0013*\u00020\u00062\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u00160\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00142\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00170\f2\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001b\u001a\u001c\u0010\u001c\u001a\u00020\u0003*\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u001a\u001a%\u0010\u001e\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0012*\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u0002H\u0012¢\u0006\u0002\u0010 \u001a%\u0010!\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0012*\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u0002H\u0012¢\u0006\u0002\u0010 \u001a\u001c\u0010\"\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001\u001a\u001d\u0010#\u001a\u00020$\"\u0004\b\u0000\u0010\u0012*\u00020\u001a2\u0006\u0010%\u001a\u0002H\u0012¢\u0006\u0002\u0010&\u001a\u001d\u0010'\u001a\u00020(\"\u0004\b\u0000\u0010\u0012*\u00020\u001a2\u0006\u0010%\u001a\u0002H\u0012¢\u0006\u0002\u0010)\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"EMPTY_STRING", "", "invokeCommand", "", "Lcom/bbva/androidtoolkit/plugin/component/ActivityContainer;", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "code", "", "error", "Lcom/bbva/sdkcatalog/openpay/plugin/data/error/OpenPayError;", IMAPStore.ID_COMMAND, "Lkotlin/Function2;", "Lcom/bbva/sdkcatalog/openpay/plugin/OpenPayManager;", "Landroid/app/Activity;", "(Lcom/bbva/androidtoolkit/plugin/component/ActivityContainer;Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;Ljava/lang/Integer;Lcom/bbva/sdkcatalog/openpay/plugin/data/error/OpenPayError;Lkotlin/jvm/functions/Function2;)V", "handleResult", "Lkotlinx/coroutines/Job;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", "", "sendEvent", "gson", "Lcom/google/gson/Gson;", "(Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lcom/google/gson/Gson;)Lkotlinx/coroutines/Job;", "handleError", "message", "sendJsonArrayEvent", DigipassManagerConstants.KEY_RESPONSE, "(Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;Lcom/google/gson/Gson;Ljava/lang/Object;)V", "sendJsonObjectEvent", "sendJsonObjectError", "getJSONObject", "Lorg/json/JSONObject;", "value", "(Lcom/google/gson/Gson;Ljava/lang/Object;)Lorg/json/JSONObject;", "getJSONArray", "Lorg/json/JSONArray;", "(Lcom/google/gson/Gson;Ljava/lang/Object;)Lorg/json/JSONArray;", "openpay-plugin_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CommandExtensionsKt {

    @NotNull
    public static final String EMPTY_STRING = "";

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.CommandExtensionsKt$handleResult$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommandExtensions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.CommandExtensionsKt$handleResult$1", f = "CommandExtensions.kt", i = {}, l = {77, 79}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super Result<? extends T>>, Object> $command;
        final /* synthetic */ Gson $gson;
        final /* synthetic */ Function2<T, Continuation<? super V>, Object> $sendEvent;
        final /* synthetic */ CommandCallback $this_handleResult;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super Continuation<? super Result<? extends T>>, ? extends Object> function1, Function2<? super T, ? super Continuation<? super V>, ? extends Object> function2, CommandCallback commandCallback, Gson gson, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$command = function1;
            this.$sendEvent = function2;
            this.$this_handleResult = commandCallback;
            this.$gson = gson;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$command, this.$sendEvent, this.$this_handleResult, this.$gson, continuation);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.bbva.sdkcatalog.openpay.plugin.CommandExtensionsKt$handleResult$1 for r4v2 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = ek.a.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r4.L$0
                kotlin.ResultKt.throwOnFailure(r5)
                goto L48
            L14:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1c:
                kotlin.ResultKt.throwOnFailure(r5)
                goto L2e
            L20:
                kotlin.ResultKt.throwOnFailure(r5)
                kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Result<? extends T>>, java.lang.Object> r5 = r4.$command
                r4.label = r3
                java.lang.Object r5 = r5.invoke(r4)
                if (r5 != r0) goto L2e
                return r0
            L2e:
                kotlin.Result r5 = (kotlin.Result) r5
                java.lang.Object r5 = r5.getF79387p0()
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super V>, java.lang.Object> r1 = r4.$sendEvent
                boolean r3 = kotlin.Result.m5541isSuccessimpl(r5)
                if (r3 == 0) goto L49
                r4.L$0 = r5
                r4.label = r2
                java.lang.Object r1 = r1.invoke(r5, r4)
                if (r1 != r0) goto L47
                return r0
            L47:
                r0 = r5
            L48:
                r5 = r0
            L49:
                com.bbva.androidtoolkit.plugin.command.callback.CommandCallback r0 = r4.$this_handleResult
                com.google.gson.Gson r1 = r4.$gson
                java.lang.Throwable r5 = kotlin.Result.m5538exceptionOrNullimpl(r5)
                if (r5 == 0) goto L64
                boolean r2 = r5 instanceof kotlin.UninitializedPropertyAccessException
                if (r2 == 0) goto L5d
                com.bbva.sdkcatalog.openpay.plugin.data.error.OpenPayError r5 = com.bbva.sdkcatalog.openpay.plugin.data.error.OpenPayError.ErrorInitOpenPay
                r0.sendError(r5)
                goto L64
            L5d:
                java.lang.String r5 = r5.getMessage()
                com.bbva.sdkcatalog.openpay.plugin.CommandExtensionsKt.handleError(r0, r5, r1)
            L64:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbva.sdkcatalog.openpay.plugin.CommandExtensionsKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @NotNull
    public static final <T> JSONArray getJSONArray(@NotNull Gson gson, T t10) {
        Intrinsics.checkNotNullParameter(gson, "<this>");
        return new JSONArray(gson.toJson(t10));
    }

    @NotNull
    public static final <T> JSONObject getJSONObject(@NotNull Gson gson, T t10) {
        Intrinsics.checkNotNullParameter(gson, "<this>");
        return new JSONObject(gson.toJson(t10));
    }

    public static final void handleError(@NotNull CommandCallback commandCallback, @Nullable String str, @NotNull Gson gson) {
        List listSplit$default;
        Intrinsics.checkNotNullParameter(commandCallback, "<this>");
        Intrinsics.checkNotNullParameter(gson, "gson");
        if (str == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"#"}, false, 0, 6, (Object) null)) == null) {
            return;
        }
        if (listSplit$default.size() == 3) {
            commandCallback.sendError(getJSONObject(gson, new MessageDTOModel(false, Integer.valueOf(Integer.parseInt((String) listSplit$default.get(1))), (String) listSplit$default.get(2))));
        } else {
            commandCallback.sendError(OpenPayError.ErrorGeneric);
        }
    }

    @NotNull
    public static final <T, V> Job handleResult(@NotNull CommandCallback commandCallback, @NotNull Function1<? super Continuation<? super Result<? extends T>>, ? extends Object> command, @NotNull Function2<? super T, ? super Continuation<? super V>, ? extends Object> sendEvent, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(commandCallback, "<this>");
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(sendEvent, "sendEvent");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new AnonymousClass1(command, sendEvent, commandCallback, gson, null), 2, null);
    }

    public static final void invokeCommand(@NotNull ActivityContainer activityContainer, @NotNull final CommandCallback callback, @Nullable final Integer num, @Nullable final OpenPayError openPayError, @NotNull final Function2<? super OpenPayManager, ? super Activity, Unit> command) {
        Intrinsics.checkNotNullParameter(activityContainer, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(command, "command");
        final Optional<Activity> optional = activityContainer.get();
        if (optional.isPresent()) {
            InjectorKt.withOpenPayManager(callback, new Function1() { // from class: com.bbva.sdkcatalog.openpay.plugin.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CommandExtensionsKt.invokeCommand$lambda$4(optional, callback, num, openPayError, command, (OpenPayManager) obj);
                }
            });
        } else {
            callback.sendError(Errors.ErrorNotAvailable);
        }
    }

    public static /* synthetic */ void invokeCommand$default(ActivityContainer activityContainer, CommandCallback commandCallback, Integer num, OpenPayError openPayError, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            openPayError = null;
        }
        invokeCommand(activityContainer, commandCallback, num, openPayError, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeCommand$lambda$4(Optional optional, CommandCallback commandCallback, Integer num, OpenPayError openPayError, final Function2 function2, final OpenPayManager openPayManager) {
        Intrinsics.checkNotNullParameter(openPayManager, "openPayManager");
        try {
            Object obj = optional.get();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.app.Activity");
            final Activity activity = (Activity) obj;
            if (num != null && num.intValue() == 1001) {
                PermissionExtensionsKt.launchBluetoothPermissions(activity, commandCallback, openPayError, new Function0() { // from class: com.bbva.sdkcatalog.openpay.plugin.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CommandExtensionsKt.invokeCommand$lambda$4$lambda$3$lambda$0(function2, openPayManager, activity);
                    }
                });
            } else if (num != null && num.intValue() == 1002) {
                PermissionExtensionsKt.launchLocationPermissions(activity, commandCallback, new Function0() { // from class: com.bbva.sdkcatalog.openpay.plugin.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CommandExtensionsKt.invokeCommand$lambda$4$lambda$3$lambda$1(function2, openPayManager, activity);
                    }
                });
            } else if (num != null && num.intValue() == 1003) {
                PermissionExtensionsKt.launchStoragePermissions(activity, commandCallback, new Function0() { // from class: com.bbva.sdkcatalog.openpay.plugin.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CommandExtensionsKt.invokeCommand$lambda$4$lambda$3$lambda$2(function2, openPayManager, activity);
                    }
                });
            } else if (num == null) {
                function2.invoke(openPayManager, activity);
            }
        } catch (Exception unused) {
            commandCallback.sendError(OpenPayError.ErrorIncorrectParameters);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeCommand$lambda$4$lambda$3$lambda$0(Function2 function2, OpenPayManager openPayManager, Activity activity) {
        function2.invoke(openPayManager, activity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeCommand$lambda$4$lambda$3$lambda$1(Function2 function2, OpenPayManager openPayManager, Activity activity) {
        function2.invoke(openPayManager, activity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeCommand$lambda$4$lambda$3$lambda$2(Function2 function2, OpenPayManager openPayManager, Activity activity) {
        function2.invoke(openPayManager, activity);
        return Unit.INSTANCE;
    }

    public static final <T> void sendJsonArrayEvent(@NotNull CommandCallback commandCallback, @NotNull Gson gson, T t10) {
        Intrinsics.checkNotNullParameter(commandCallback, "<this>");
        Intrinsics.checkNotNullParameter(gson, "gson");
        commandCallback.sendEvent(getJSONArray(gson, t10));
    }

    public static final void sendJsonObjectError(@NotNull CommandCallback commandCallback, @NotNull Gson gson, @Nullable String str) {
        Intrinsics.checkNotNullParameter(commandCallback, "<this>");
        Intrinsics.checkNotNullParameter(gson, "gson");
        commandCallback.sendError(getJSONObject(gson, new MessageDTOModel(false, 0, str)));
    }

    public static final <T> void sendJsonObjectEvent(@NotNull CommandCallback commandCallback, @NotNull Gson gson, T t10) {
        Intrinsics.checkNotNullParameter(commandCallback, "<this>");
        Intrinsics.checkNotNullParameter(gson, "gson");
        commandCallback.sendEvent(getJSONObject(gson, t10));
    }
}
