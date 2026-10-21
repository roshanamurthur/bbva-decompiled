package com.bbva.plugin.geolocation.command;

import android.location.Address;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.geolocation.command.GetAddressFromLocationCommand;
import com.bbva.plugin.geolocation.command.params.GetAddressFromLocationParams;
import com.bbva.plugin.geolocation.command.response.GeolocationErrors;
import com.bbva.plugin.geolocation.command.validator.GetAddressFromLocationParamsValidator;
import com.bbva.plugin.geolocation.common.ExtensionsKt;
import com.bbva.plugin.geolocation.di.Injector;
import com.bbva.plugin.geolocation.manager.Locator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: GetAddressFromLocationCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\nH\u0014R\u0012\u0010\u000b\u001a\u00020\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/bbva/plugin/geolocation/command/GetAddressFromLocationCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/geolocation/command/params/GetAddressFromLocationParams;", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Companion", "geolocation-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetAddressFromLocationCommand extends AbstractCommand<GetAddressFromLocationParams> implements CoroutineScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ID = "getaddressfromlocation";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f35637p0;

    /* JADX INFO: compiled from: GetAddressFromLocationCommand.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bbva/plugin/geolocation/command/GetAddressFromLocationCommand$Companion;", "", "<init>", "()V", "ID", "", "geolocation-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: GetAddressFromLocationCommand.kt */
    @DebugMetadata(c = "com.bbva.plugin.geolocation.command.GetAddressFromLocationCommand$execute$1$1", f = "GetAddressFromLocationCommand.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f35638p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f35639q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Locator f35640r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ double f35641s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ double f35642t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35643u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Locator locator, double d2, double d3, CommandCallback commandCallback, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35640r0 = locator;
            this.f35641s0 = d2;
            this.f35642t0 = d3;
            this.f35643u0 = commandCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f35640r0, this.f35641s0, this.f35642t0, this.f35643u0, continuation);
            aVar.f35639q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
            Object objM5535constructorimpl;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35638p0;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Locator locator = this.f35640r0;
                    double d2 = this.f35641s0;
                    double d3 = this.f35642t0;
                    Result.Companion companion = Result.INSTANCE;
                    this.f35638p0 = 1;
                    obj = locator.reverseResolution(d2, d3, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM5535constructorimpl = Result.m5535constructorimpl((Address) obj);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            boolean zM5541isSuccessimpl = Result.m5541isSuccessimpl(objM5535constructorimpl);
            CommandCallback commandCallback = this.f35643u0;
            if (zM5541isSuccessimpl) {
                Address address = (Address) objM5535constructorimpl;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("number", address.getSubThoroughfare());
                jSONObject.put("address", address.getThoroughfare());
                jSONObject.put("country", address.getCountryName());
                jSONObject.put("municipality", address.getSubLocality());
                jSONObject.put("postalCode", address.getPostalCode());
                jSONObject.put("fullAddress", ExtensionsKt.toPrettyString(address));
                jSONObject.put("city", address.getLocality());
                jSONObject.put("province", address.getAdminArea());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("address", jSONObject);
                commandCallback.sendEvent(jSONObject2);
            }
            Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
            if (thM5538exceptionOrNullimpl != null) {
                if (thM5538exceptionOrNullimpl instanceof IllegalArgumentException) {
                    commandCallback.sendError(GeolocationErrors.ErrorReverseLocation);
                } else if (thM5538exceptionOrNullimpl instanceof RuntimeException) {
                    commandCallback.sendError(GeolocationErrors.ErrorGeocode);
                } else {
                    commandCallback.sendError(Errors.ErrorDefault);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public GetAddressFromLocationCommand() {
        super(GetAddressFromLocationParams.class, new GetAddressFromLocationParamsValidator());
        this.f35637p0 = CoroutineScopeKt.MainScope();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f35637p0.getCoroutineContext();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable final GetAddressFromLocationParams params, @NotNull final CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Injector.INSTANCE.withLocator(new Function1() { // from class: eb.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                GetAddressFromLocationCommand getAddressFromLocationCommand = this;
                CommandCallback commandCallback = callback;
                Locator locator = (Locator) obj;
                GetAddressFromLocationCommand.Companion companion = GetAddressFromLocationCommand.INSTANCE;
                Intrinsics.checkNotNullParameter(locator, "locator");
                GetAddressFromLocationParams getAddressFromLocationParams = params;
                Intrinsics.checkNotNull(getAddressFromLocationParams);
                String latitude = getAddressFromLocationParams.getLatitude();
                Intrinsics.checkNotNull(latitude);
                double d2 = Double.parseDouble(latitude);
                String longitude = getAddressFromLocationParams.getLongitude();
                Intrinsics.checkNotNull(longitude);
                BuildersKt__Builders_commonKt.launch$default(getAddressFromLocationCommand, null, null, new GetAddressFromLocationCommand.a(locator, d2, Double.parseDouble(longitude), commandCallback, null), 3, null);
                return Unit.INSTANCE;
            }
        });
    }
}
