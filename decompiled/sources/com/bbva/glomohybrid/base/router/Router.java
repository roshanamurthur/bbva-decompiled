package com.bbva.glomohybrid.base.router;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.camera.core.processing.f;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.R;
import com.bbva.glomohybrid.base.extensions.IntentExtensionsKt;
import com.bbva.glomohybrid.logs.LoggerKt;
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
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Router.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(JB\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010!R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/bbva/glomohybrid/base/router/Router;", "", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "", "route", "Lcom/bbva/glomohybrid/base/Animation;", "animation", "Landroid/os/Bundle;", "bundle", "Lcom/bbva/glomohybrid/base/router/IntentExtra;", "parcel", "", "clearHistory", "", "navigate", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "Lcom/bbva/glomohybrid/base/router/Route;", "a", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "getACTION_NAVIGATE", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "ACTION_NAVIGATE", "b", "getACTION_CLOSE_SCREEN", "ACTION_CLOSE_SCREEN", "Lkotlinx/coroutines/CoroutineScope;", "d", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope", "ID", "Ljava/lang/String;", "Lkotlinx/coroutines/flow/Flow;", "Ljava/lang/Exception;", "getNAVIGATION_ERROR_FLOW", "()Lkotlinx/coroutines/flow/Flow;", "NAVIGATION_ERROR_FLOW", "<init>", "()V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class Router {

    @NotNull
    public static final String ID = "router";

    @NotNull
    public static final Router INSTANCE = new Router();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ActionSpec<Route> ACTION_NAVIGATE = new ActionSpec<>("action-navigate");

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ActionSpec<Unit> ACTION_CLOSE_SCREEN = new ActionSpec<>("action-close-screen");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Channel<Exception> f31494c = ChannelKt.Channel$default(0, null, null, 7, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final CoroutineScope scope = CoroutineScopeKt.MainScope();

    /* JADX INFO: compiled from: Router.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.base.router.Router$navigate$1", f = "Router.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31496p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ActivityNotFoundException f31497q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ActivityNotFoundException activityNotFoundException, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f31497q0 = activityNotFoundException;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f31497q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31496p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = Router.f31494c;
                this.f31496p0 = 1;
                if (channel.send(this.f31497q0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void navigate$default(Router router, Activity activity, String str, Animation animation, Bundle bundle, IntentExtra intentExtra, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            animation = Animation.Fade.INSTANCE;
        }
        Animation animation2 = animation;
        Bundle bundle2 = (i10 & 8) != 0 ? null : bundle;
        IntentExtra intentExtra2 = (i10 & 16) != 0 ? null : intentExtra;
        if ((i10 & 32) != 0) {
            z10 = false;
        }
        router.navigate(activity, str, animation2, bundle2, intentExtra2, z10);
    }

    @NotNull
    public final ActionSpec<Unit> getACTION_CLOSE_SCREEN() {
        return ACTION_CLOSE_SCREEN;
    }

    @NotNull
    public final ActionSpec<Route> getACTION_NAVIGATE() {
        return ACTION_NAVIGATE;
    }

    @NotNull
    public final Flow<Exception> getNAVIGATION_ERROR_FLOW() {
        return FlowKt.receiveAsFlow(f31494c);
    }

    @NotNull
    public final CoroutineScope getScope() {
        return scope;
    }

    public final void navigate(@NotNull Activity activity, @NotNull String route, @NotNull Animation animation, @Nullable Bundle bundle, @Nullable IntentExtra parcel, boolean clearHistory) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(animation, "animation");
        try {
            Uri uriBuild = new Uri.Builder().scheme(activity.getString(R.string.deep_linking_scheme)).authority(activity.getString(R.string.deep_linking_host)).path(route).build();
            Intent intent = new Intent("action.glomo.open", uriBuild);
            intent.setPackage(activity.getPackageName());
            if (bundle == null) {
                bundle = Bundle.EMPTY;
            }
            intent.putExtras(bundle);
            INSTANCE.getClass();
            if (parcel instanceof IntentExtra.Parcel) {
                IntentExtra.Parcel parcel2 = (IntentExtra.Parcel) parcel;
                intent.putExtra(parcel2.getKey(), parcel2.getValue());
            } else if (parcel instanceof IntentExtra.StringExtra) {
                IntentExtra.StringExtra stringExtra = (IntentExtra.StringExtra) parcel;
                intent.putExtra(stringExtra.getKey(), stringExtra.getValue());
            }
            if (clearHistory) {
                intent.addFlags(IntentExtensionsKt.clearStackFrags(intent));
            }
            LoggerKt.logDebug$default("TAG[router] Navigate from " + activity.getClass().getSimpleName() + ": " + uriBuild, null, 2, null);
            activity.startActivity(intent, ActivityOptions.makeCustomAnimation(activity, animation.getEnterAnim(), animation.getExitAnim()).toBundle());
        } catch (ActivityNotFoundException e5) {
            LoggerKt.logError$default(f.d("TAG[router] Not found activity with this route ", route), e5, null, 4, null);
            BuildersKt__Builders_commonKt.launch$default(scope, null, null, new a(e5, null), 3, null);
        }
    }
}
