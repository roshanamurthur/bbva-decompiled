package h9;

import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.infoscreen.webView.force.WebViewForceUpdateContract;
import com.bbva.glomohybrid.infoscreen.webView.force.viewmodel.WebViewForceUpdateViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WebViewForceUpdateViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.infoscreen.webView.force.viewmodel.WebViewForceUpdateViewModel$navigateToMarket$1", f = "WebViewForceUpdateViewModel.kt", i = {}, l = {30, 34}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f69354p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ WebViewForceUpdateViewModel f69355q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(WebViewForceUpdateViewModel webViewForceUpdateViewModel, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f69355q0 = webViewForceUpdateViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f69355q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f69354p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            WebViewForceUpdateViewModel webViewForceUpdateViewModel = this.f69355q0;
            String strExecute = webViewForceUpdateViewModel.f32503p0.execute();
            if (strExecute != null) {
                Channel channel = webViewForceUpdateViewModel.f32504q0;
                WebViewForceUpdateContract.Event.Navigation navigation = new WebViewForceUpdateContract.Event.Navigation(WebViewForceUpdateContract.Event.Navigation.Type.MARKET, new Route(strExecute, null, null, 6, null));
                this.f69354p0 = 1;
                if (channel.send(navigation, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Channel channel2 = webViewForceUpdateViewModel.f32504q0;
                WebViewForceUpdateContract.Event.StoreUrlError storeUrlError = WebViewForceUpdateContract.Event.StoreUrlError.INSTANCE;
                this.f69354p0 = 2;
                if (channel2.send(storeUrlError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
