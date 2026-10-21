package com.bbva.plugin.rateapp.command;

import android.app.Activity;
import android.content.Context;
import androidx.activity.f;
import bk.q;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.optional.function.Consumer;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.androidtoolkit.plugin.response.SimpleResponse;
import com.bbva.plugin.rateapp.Injector;
import kb.c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InAppReviewCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/bbva/plugin/rateapp/command/InAppReviewCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Ljava/lang/Void;", "Lkotlinx/coroutines/CoroutineScope;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "rateapp-plugin_release"}, k = 1, mv = {1, 7, 1})
public final class InAppReviewCommand extends AbstractCommand<Void> implements CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f35990p0;

    /* JADX INFO: compiled from: InAppReviewCommand.kt */
    public static final class a extends Lambda implements Function1<Activity, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35992q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CommandCallback commandCallback) {
            super(1);
            this.f35992q0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Activity activity) {
            Activity it = activity;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            InAppReviewCommand.access$executeReview(InAppReviewCommand.this, this.f35992q0, it);
            return Unit.INSTANCE;
        }
    }

    public InAppReviewCommand() {
        super(Void.class);
        this.f35990p0 = CoroutineScopeKt.MainScope();
    }

    public static final void access$executeReview(InAppReviewCommand inAppReviewCommand, CommandCallback commandCallback, Activity activity) {
        inAppReviewCommand.getClass();
        Injector injector = Injector.INSTANCE;
        Context applicationContext = inAppReviewCommand.mApplication.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "mApplication.applicationContext");
        injector.withReviewFactory(applicationContext, new c(inAppReviewCommand, commandCallback, activity));
    }

    public static final void access$sendError(InAppReviewCommand inAppReviewCommand, CommandCallback commandCallback, Throwable th2) {
        String message;
        inAppReviewCommand.getClass();
        Pair[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.to("code", -1);
        if (th2 == null || (message = th2.getMessage()) == null) {
            message = "In-App Review cannot be shown";
        }
        pairArr[1] = TuplesKt.to("message", message);
        commandCallback.sendError(SimpleResponse.toJson(q.mapOf(pairArr)));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f35990p0.getCoroutineContext();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Void params, @NotNull CommandCallback callback) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            Optional<Activity> optional = this.mActivityContainer.get();
            final a aVar = new a(callback);
            optional.ifPresentOrElse(new Consumer() { // from class: kb.a
                @Override // com.bbva.androidtoolkit.optional.function.Consumer
                public final void accept(Object obj) {
                    Function1 tmp0 = aVar;
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    tmp0.invoke(obj);
                }
            }, new f(callback, 7));
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
            callback.sendError(Errors.ErrorDefault);
        }
    }
}
