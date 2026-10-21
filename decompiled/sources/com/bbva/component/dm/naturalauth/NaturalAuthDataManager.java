package com.bbva.component.dm.naturalauth;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.cells.component.kit.datamanager.DataManager;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.dm.naturalauth.NaturalAuthDataManager;
import com.bbva.component.dm.naturalauth.data.mapper.common.response.ExceptionsResponseMapper;
import com.bbva.component.dm.naturalauth.domain.model.AuthenticationResponse;
import com.bbva.component.dm.naturalauth.domain.model.NaturalAuthEndpoints;
import com.bbva.component.dm.naturalauth.domain.model.ServiceType;
import com.bbva.component.dm.naturalauth.domain.model.params.AuthenticationParams;
import com.bbva.component.dm.naturalauth.domain.model.params.DeleteParams;
import com.bbva.component.dm.naturalauth.domain.model.params.ListAuthenticatorsParams;
import com.bbva.component.dm.naturalauth.domain.model.params.RegisterParams;
import com.bbva.component.dm.naturalauth.domain.usecase.AuthenticateUseCase;
import com.bbva.component.dm.naturalauth.domain.usecase.DeleteUseCase;
import com.bbva.component.dm.naturalauth.domain.usecase.ListAuthenticatorsUseCase;
import com.bbva.component.dm.naturalauth.domain.usecase.RegisterUseCase;
import com.bbva.component.dm.naturalauth.domain.usecase.UseCaseFactory;
import com.bbva.glomohybrid.logs.LoggerKt;
import com.bbva.glomoutils.Mapper;
import com.bbva.network.NetworkWorker;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager;
import com.bbva.sl.ar.android.secsdk.fido.error.FidoError;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoPayload;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoResult;
import io.reactivex.Completable;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NaturalAuthDataManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B=\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$¢\u0006\u0004\b(\u0010)J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003J\b\u0010\n\u001a\u00020\u0006H\u0014J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0012H\u0016J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0012H\u0016J(\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0017H\u0016J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0017H\u0016J \u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0017H\u0016J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u001bH\u0016J\u0018\u0010\u001d\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¨\u0006+"}, d2 = {"Lcom/bbva/component/dm/naturalauth/NaturalAuthDataManager;", "Lcom/bbva/cells/component/kit/datamanager/DataManager;", "Lcom/bbva/component/dm/naturalauth/NaturalAuthNetworkManager;", "", "getId", "consumerId", "", "setConsumerId", "host", "refreshHost", "onPropertiesBound", "dispose", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoPayload;", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "Lcom/bbva/sl/ar/android/secsdk/fido/FidoNetworkManager$FidoNetworkAuthenticateCallback;", "callback", "initAuthentication", "finishAuthentication", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoNetworkManager$FidoNetworkRegisterCallback;", "initRegistration", "finishRegistration", "authenticator", "deviceId", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoNetworkManager$FidoNetworkDeleteAuthenticatorsCallback;", "deleteAuthenticator", "deleteAllAuthenticators", "deleteAllAuthenticatorsFromDevice", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoNetworkManager$FidoNetworkListRegisteredAuthenticatorsCallback;", "listRegisteredAuthenticators", "quickAuthentication", "Lcom/bbva/component/dm/naturalauth/domain/model/ServiceType;", "serviceType", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "Lcom/bbva/component/dm/naturalauth/domain/model/NaturalAuthEndpoints;", "endpoints", "Lcom/bbva/glomoutils/Mapper;", "", "Lcom/bbva/sl/ar/android/secsdk/fido/exception/FidoException;", "exceptionMapper", "<init>", "(Lcom/bbva/component/dm/naturalauth/domain/model/ServiceType;Lcom/bbva/network/NetworkWorker;Lcom/bbva/component/dm/naturalauth/domain/model/NaturalAuthEndpoints;Ljava/lang/String;Lcom/bbva/glomoutils/Mapper;)V", "Companion", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNaturalAuthDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NaturalAuthDataManager.kt\ncom/bbva/component/dm/naturalauth/NaturalAuthDataManager\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,268:1\n13309#2,2:269\n*S KotlinDebug\n*F\n+ 1 NaturalAuthDataManager.kt\ncom/bbva/component/dm/naturalauth/NaturalAuthDataManager\n*L\n72#1:269,2\n*E\n"})
public final class NaturalAuthDataManager extends DataManager implements NaturalAuthNetworkManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ID = "component-dm-naturalauth";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final NaturalAuthEndpoints f27748p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public String f27749q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Mapper<Throwable, FidoException> f27750r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final ListAuthenticatorsUseCase f27751s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final RegisterUseCase f27752t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final AuthenticateUseCase f27753u0;

    @NotNull
    public final DeleteUseCase v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public AuthenticationResponse f27754w0;

    /* JADX INFO: compiled from: NaturalAuthDataManager.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/component/dm/naturalauth/NaturalAuthDataManager$Companion;", "", "()V", "ID", "", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: NaturalAuthDataManager.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback f27755p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FidoPayload f27756q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FidoPayload fidoPayload, FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback fidoNetworkDeleteAuthenticatorsCallback) {
            super(0);
            this.f27755p0 = fidoNetworkDeleteAuthenticatorsCallback;
            this.f27756q0 = fidoPayload;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f27755p0.didDeleteAll(new FidoResult(this.f27756q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NaturalAuthDataManager.kt */
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback f27757p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FidoException f27758q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback fidoNetworkDeleteAuthenticatorsCallback, FidoException fidoException) {
            super(0);
            this.f27757p0 = fidoNetworkDeleteAuthenticatorsCallback;
            this.f27758q0 = fidoException;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f27757p0.didDeleteAll(new FidoResult(this.f27758q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NaturalAuthDataManager.kt */
    public static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback f27759p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FidoPayload f27760q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FidoPayload fidoPayload, FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback fidoNetworkDeleteAuthenticatorsCallback) {
            super(0);
            this.f27759p0 = fidoNetworkDeleteAuthenticatorsCallback;
            this.f27760q0 = fidoPayload;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f27759p0.didDeleteAll(new FidoResult(this.f27760q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NaturalAuthDataManager.kt */
    public static final class d extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback f27761p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FidoException f27762q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback fidoNetworkDeleteAuthenticatorsCallback, FidoException fidoException) {
            super(0);
            this.f27761p0 = fidoNetworkDeleteAuthenticatorsCallback;
            this.f27762q0 = fidoException;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f27761p0.didDeleteAll(new FidoResult(this.f27762q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NaturalAuthDataManager.kt */
    public static final class e extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback f27763p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f27764q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ FidoPayload f27765r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, FidoPayload fidoPayload, FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback fidoNetworkDeleteAuthenticatorsCallback) {
            super(0);
            this.f27763p0 = fidoNetworkDeleteAuthenticatorsCallback;
            this.f27764q0 = str;
            this.f27765r0 = fidoPayload;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f27763p0.didDelete(this.f27764q0, new FidoResult(this.f27765r0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NaturalAuthDataManager.kt */
    public static final class f extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback f27766p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f27767q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ FidoException f27768r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback fidoNetworkDeleteAuthenticatorsCallback, String str, FidoException fidoException) {
            super(0);
            this.f27766p0 = fidoNetworkDeleteAuthenticatorsCallback;
            this.f27767q0 = str;
            this.f27768r0 = fidoException;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f27766p0.didDelete(this.f27767q0, new FidoResult(this.f27768r0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NaturalAuthDataManager.kt */
    public static final class g extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FidoNetworkManager.FidoNetworkAuthenticateCallback f27769p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FidoPayload f27770q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(FidoPayload fidoPayload, FidoNetworkManager.FidoNetworkAuthenticateCallback fidoNetworkAuthenticateCallback) {
            super(0);
            this.f27769p0 = fidoNetworkAuthenticateCallback;
            this.f27770q0 = fidoPayload;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f27769p0.didFinishAuthentication(new FidoResult(this.f27770q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NaturalAuthDataManager.kt */
    public static final class h extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FidoNetworkManager.FidoNetworkAuthenticateCallback f27771p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FidoException f27772q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(FidoNetworkManager.FidoNetworkAuthenticateCallback fidoNetworkAuthenticateCallback, FidoException fidoException) {
            super(0);
            this.f27771p0 = fidoNetworkAuthenticateCallback;
            this.f27772q0 = fidoException;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f27771p0.didInitAuthentication(new FidoResult(this.f27772q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NaturalAuthDataManager.kt */
    public static final class i extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FidoNetworkManager.FidoNetworkRegisterCallback f27773p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FidoPayload f27774q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(FidoPayload fidoPayload, FidoNetworkManager.FidoNetworkRegisterCallback fidoNetworkRegisterCallback) {
            super(0);
            this.f27773p0 = fidoNetworkRegisterCallback;
            this.f27774q0 = fidoPayload;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f27773p0.didFinishRegistration(new FidoResult(this.f27774q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NaturalAuthDataManager.kt */
    public static final class j extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FidoNetworkManager.FidoNetworkRegisterCallback f27775p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FidoException f27776q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(FidoNetworkManager.FidoNetworkRegisterCallback fidoNetworkRegisterCallback, FidoException fidoException) {
            super(0);
            this.f27775p0 = fidoNetworkRegisterCallback;
            this.f27776q0 = fidoException;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f27775p0.didInitRegistration(new FidoResult(this.f27776q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NaturalAuthDataManager.kt */
    public static final class k extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FidoNetworkManager.FidoNetworkAuthenticateCallback f27777p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FidoPayload f27778q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(FidoPayload fidoPayload, FidoNetworkManager.FidoNetworkAuthenticateCallback fidoNetworkAuthenticateCallback) {
            super(0);
            this.f27777p0 = fidoNetworkAuthenticateCallback;
            this.f27778q0 = fidoPayload;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f27777p0.didInitAuthentication(new FidoResult(this.f27778q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NaturalAuthDataManager.kt */
    public static final class l extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FidoNetworkManager.FidoNetworkAuthenticateCallback f27779p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FidoException f27780q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(FidoNetworkManager.FidoNetworkAuthenticateCallback fidoNetworkAuthenticateCallback, FidoException fidoException) {
            super(0);
            this.f27779p0 = fidoNetworkAuthenticateCallback;
            this.f27780q0 = fidoException;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f27779p0.didInitAuthentication(new FidoResult(this.f27780q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NaturalAuthDataManager.kt */
    public static final class m extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FidoNetworkManager.FidoNetworkRegisterCallback f27781p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FidoPayload f27782q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(FidoPayload fidoPayload, FidoNetworkManager.FidoNetworkRegisterCallback fidoNetworkRegisterCallback) {
            super(0);
            this.f27781p0 = fidoNetworkRegisterCallback;
            this.f27782q0 = fidoPayload;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f27781p0.didInitRegistration(new FidoResult(this.f27782q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NaturalAuthDataManager.kt */
    public static final class n extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FidoNetworkManager.FidoNetworkRegisterCallback f27783p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FidoException f27784q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(FidoNetworkManager.FidoNetworkRegisterCallback fidoNetworkRegisterCallback, FidoException fidoException) {
            super(0);
            this.f27783p0 = fidoNetworkRegisterCallback;
            this.f27784q0 = fidoException;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f27783p0.didInitRegistration(new FidoResult(this.f27784q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NaturalAuthDataManager.kt */
    public static final class o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FidoNetworkManager.FidoNetworkAuthenticateCallback f27785p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FidoPayload f27786q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(FidoPayload fidoPayload, FidoNetworkManager.FidoNetworkAuthenticateCallback fidoNetworkAuthenticateCallback) {
            super(0);
            this.f27785p0 = fidoNetworkAuthenticateCallback;
            this.f27786q0 = fidoPayload;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f27785p0.didFinishAuthentication(new FidoResult(this.f27786q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NaturalAuthDataManager.kt */
    public static final class p extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FidoNetworkManager.FidoNetworkAuthenticateCallback f27787p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FidoException f27788q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(FidoNetworkManager.FidoNetworkAuthenticateCallback fidoNetworkAuthenticateCallback, FidoException fidoException) {
            super(0);
            this.f27787p0 = fidoNetworkAuthenticateCallback;
            this.f27788q0 = fidoException;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f27787p0.didFinishAuthentication(new FidoResult(this.f27788q0));
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ NaturalAuthDataManager(ServiceType serviceType, NetworkWorker networkWorker, NaturalAuthEndpoints naturalAuthEndpoints, String str, Mapper mapper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(serviceType, networkWorker, naturalAuthEndpoints, str, (i10 & 16) != 0 ? new ExceptionsResponseMapper() : mapper);
    }

    public static void a(final Function0 function0) {
        Completable.fromAction(new Action() { // from class: b5.h
            @Override // io.reactivex.functions.Action
            public final void run() {
                NaturalAuthDataManager.Companion companion = NaturalAuthDataManager.INSTANCE;
                Function0 delegate = function0;
                Intrinsics.checkNotNullParameter(delegate, "$delegate");
                delegate.invoke();
            }
        }).subscribeOn(Schedulers.io()).subscribe();
    }

    public static void b(String str, Throwable th2) {
        LoggerKt.logError$default(u.g("TAG[NaturalAuthDataManager] method: ", str, " - Exception[", th2.getMessage(), Constant.BRACKET_CLOSE), th2, null, 4, null);
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager
    public void deleteAllAuthenticators(@NotNull final FidoPayload payload, @NotNull final FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback callback) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.v0.execute(new DeleteParams.DeleteAllAuthenticators(payload, this.f27749q0), new UseCase.UseCaseSuccessCallback() { // from class: b5.b
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
            public final void onUseCaseComplete(Object obj) {
                NaturalAuthDataManager.Companion companion = NaturalAuthDataManager.INSTANCE;
                FidoPayload payload2 = payload;
                Intrinsics.checkNotNullParameter(payload2, "$payload");
                NaturalAuthDataManager this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                FidoPayload fidoPayloadM4970clone = payload2.m4970clone();
                Intrinsics.checkNotNullExpressionValue(fidoPayloadM4970clone, "clone(...)");
                fidoPayloadM4970clone.setMessage((String) obj);
                NaturalAuthDataManager.a aVar = new NaturalAuthDataManager.a(fidoPayloadM4970clone, callback2);
                this$0.getClass();
                NaturalAuthDataManager.a(aVar);
            }
        }, new UseCase.UseCaseErrorCallback() { // from class: b5.c
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
            public final void onUseCaseError(Throwable th2) {
                NaturalAuthDataManager.Companion companion = NaturalAuthDataManager.INSTANCE;
                NaturalAuthDataManager this$0 = this.f24844a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                NaturalAuthDataManager.b bVar = new NaturalAuthDataManager.b(callback2, new FidoException.Builder(FidoError.SDK_DELETE_ALL_OPERATION).build());
                this$0.getClass();
                NaturalAuthDataManager.a(bVar);
            }
        });
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager
    public void deleteAllAuthenticatorsFromDevice(@NotNull String deviceId, @NotNull final FidoPayload payload, @NotNull final FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback callback) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.v0.execute(new DeleteParams.DeleteAllAuthenticatorsFromDevice(deviceId, payload, this.f27749q0), new UseCase.UseCaseSuccessCallback() { // from class: b5.d
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
            public final void onUseCaseComplete(Object obj) {
                NaturalAuthDataManager.Companion companion = NaturalAuthDataManager.INSTANCE;
                FidoPayload payload2 = payload;
                Intrinsics.checkNotNullParameter(payload2, "$payload");
                NaturalAuthDataManager this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                FidoPayload fidoPayloadM4970clone = payload2.m4970clone();
                Intrinsics.checkNotNullExpressionValue(fidoPayloadM4970clone, "clone(...)");
                fidoPayloadM4970clone.setMessage((String) obj);
                NaturalAuthDataManager.c cVar = new NaturalAuthDataManager.c(fidoPayloadM4970clone, callback2);
                this$0.getClass();
                NaturalAuthDataManager.a(cVar);
            }
        }, new UseCase.UseCaseErrorCallback() { // from class: b5.e
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
            public final void onUseCaseError(Throwable th2) {
                NaturalAuthDataManager.Companion companion = NaturalAuthDataManager.INSTANCE;
                NaturalAuthDataManager this$0 = this.f24849a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                NaturalAuthDataManager.d dVar = new NaturalAuthDataManager.d(callback2, new FidoException.Builder(FidoError.SDK_DELETE_ALL_OPERATION).build());
                this$0.getClass();
                NaturalAuthDataManager.a(dVar);
            }
        });
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager
    public void deleteAuthenticator(@NotNull String authenticator, @NotNull final String deviceId, @NotNull final FidoPayload payload, @NotNull final FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback callback) {
        Intrinsics.checkNotNullParameter(authenticator, "authenticator");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.v0.execute(new DeleteParams.DeleteOneAuthenticatorParams(authenticator, deviceId, payload, this.f27749q0), new UseCase.UseCaseSuccessCallback() { // from class: b5.f
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
            public final void onUseCaseComplete(Object obj) {
                NaturalAuthDataManager.Companion companion = NaturalAuthDataManager.INSTANCE;
                FidoPayload payload2 = payload;
                Intrinsics.checkNotNullParameter(payload2, "$payload");
                NaturalAuthDataManager this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                String deviceId2 = deviceId;
                Intrinsics.checkNotNullParameter(deviceId2, "$deviceId");
                FidoPayload fidoPayloadM4970clone = payload2.m4970clone();
                Intrinsics.checkNotNullExpressionValue(fidoPayloadM4970clone, "clone(...)");
                fidoPayloadM4970clone.setMessage((String) obj);
                NaturalAuthDataManager.e eVar = new NaturalAuthDataManager.e(deviceId2, fidoPayloadM4970clone, callback2);
                this$0.getClass();
                NaturalAuthDataManager.a(eVar);
            }
        }, new UseCase.UseCaseErrorCallback() { // from class: b5.g
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
            public final void onUseCaseError(Throwable th2) {
                NaturalAuthDataManager.Companion companion = NaturalAuthDataManager.INSTANCE;
                NaturalAuthDataManager this$0 = this.f24855a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                String deviceId2 = deviceId;
                Intrinsics.checkNotNullParameter(deviceId2, "$deviceId");
                NaturalAuthDataManager.f fVar = new NaturalAuthDataManager.f(callback2, deviceId2, new FidoException.Builder(FidoError.SDK_DELETE_ONE_OPERATION).build());
                this$0.getClass();
                NaturalAuthDataManager.a(fVar);
            }
        });
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent, com.bbva.cells.component.kit.common.Disposable
    public void dispose() {
        super.dispose();
        UseCase[] useCaseArr = {this.f27751s0, this.f27752t0, this.f27753u0, this.v0};
        for (int i10 = 0; i10 < 4; i10++) {
            useCaseArr[i10].dispose();
        }
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager
    public void finishAuthentication(@NotNull final FidoPayload payload, @NotNull final FidoNetworkManager.FidoNetworkAuthenticateCallback callback) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String str = this.f27749q0;
        AuthenticationResponse authenticationResponse = this.f27754w0;
        String id = authenticationResponse != null ? authenticationResponse.getId() : null;
        if (id == null) {
            id = "";
        }
        this.f27753u0.execute(new AuthenticationParams.Finish(str, payload, id), new UseCase.UseCaseSuccessCallback() { // from class: b5.l
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
            public final void onUseCaseComplete(Object obj) {
                NaturalAuthDataManager.Companion companion = NaturalAuthDataManager.INSTANCE;
                FidoPayload payload2 = payload;
                Intrinsics.checkNotNullParameter(payload2, "$payload");
                NaturalAuthDataManager this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FidoNetworkManager.FidoNetworkAuthenticateCallback callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                FidoPayload fidoPayloadM4970clone = payload2.m4970clone();
                Intrinsics.checkNotNullExpressionValue(fidoPayloadM4970clone, "clone(...)");
                fidoPayloadM4970clone.setMessage(((AuthenticationResponse) obj).getMessage());
                NaturalAuthDataManager.g gVar = new NaturalAuthDataManager.g(fidoPayloadM4970clone, callback2);
                this$0.getClass();
                NaturalAuthDataManager.a(gVar);
            }
        }, new UseCase.UseCaseErrorCallback() { // from class: b5.m
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
            public final void onUseCaseError(Throwable th2) {
                NaturalAuthDataManager.Companion companion = NaturalAuthDataManager.INSTANCE;
                NaturalAuthDataManager this$0 = this.f24869a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FidoNetworkManager.FidoNetworkAuthenticateCallback callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                Intrinsics.checkNotNull(th2);
                this$0.getClass();
                NaturalAuthDataManager.b("finishAuthentication", th2);
                NaturalAuthDataManager.a(new NaturalAuthDataManager.h(callback2, this$0.f27750r0.map(th2)));
            }
        });
    }

    @Override // com.bbva.component.dm.naturalauth.NaturalAuthNetworkManager, com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager
    public void finishOobAuthentication(@NotNull FidoPayload fidoPayload, @NotNull FidoNetworkManager.OobAuthenticateCallback oobAuthenticateCallback) {
        NaturalAuthNetworkManager.DefaultImpls.finishOobAuthentication(this, fidoPayload, oobAuthenticateCallback);
    }

    @Override // com.bbva.component.dm.naturalauth.NaturalAuthNetworkManager, com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager
    public void finishOobRegistration(@NotNull FidoPayload fidoPayload, @NotNull FidoNetworkManager.OobRegisterCallback oobRegisterCallback) {
        NaturalAuthNetworkManager.DefaultImpls.finishOobRegistration(this, fidoPayload, oobRegisterCallback);
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager
    public void finishRegistration(@NotNull final FidoPayload payload, @NotNull final FidoNetworkManager.FidoNetworkRegisterCallback callback) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f27752t0.execute(new RegisterParams.Finish(payload, this.f27749q0), new UseCase.UseCaseSuccessCallback() { // from class: b5.p
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
            public final void onUseCaseComplete(Object obj) {
                NaturalAuthDataManager.Companion companion = NaturalAuthDataManager.INSTANCE;
                FidoPayload payload2 = payload;
                Intrinsics.checkNotNullParameter(payload2, "$payload");
                NaturalAuthDataManager this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FidoNetworkManager.FidoNetworkRegisterCallback callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                FidoPayload fidoPayloadM4970clone = payload2.m4970clone();
                Intrinsics.checkNotNullExpressionValue(fidoPayloadM4970clone, "clone(...)");
                fidoPayloadM4970clone.setMessage((String) obj);
                NaturalAuthDataManager.i iVar = new NaturalAuthDataManager.i(fidoPayloadM4970clone, callback2);
                this$0.getClass();
                NaturalAuthDataManager.a(iVar);
            }
        }, new UseCase.UseCaseErrorCallback() { // from class: b5.q
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
            public final void onUseCaseError(Throwable th2) {
                NaturalAuthDataManager.Companion companion = NaturalAuthDataManager.INSTANCE;
                NaturalAuthDataManager this$0 = this.f24879a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FidoNetworkManager.FidoNetworkRegisterCallback callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                Mapper<Throwable, FidoException> mapper = this$0.f27750r0;
                Intrinsics.checkNotNull(th2);
                NaturalAuthDataManager.a(new NaturalAuthDataManager.j(callback2, mapper.map(th2)));
            }
        });
    }

    @Override // com.bbva.component.dm.naturalauth.NaturalAuthNetworkManager, com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager
    public void finishSign(@NotNull FidoPayload fidoPayload, @NotNull FidoNetworkManager.FidoNetworkSignCallback fidoNetworkSignCallback) {
        NaturalAuthNetworkManager.DefaultImpls.finishSign(this, fidoPayload, fidoNetworkSignCallback);
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF28076q0() {
        return ID;
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager
    public void initAuthentication(@NotNull final FidoPayload payload, @NotNull final FidoNetworkManager.FidoNetworkAuthenticateCallback callback) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f27753u0.execute(new AuthenticationParams.Init(this.f27749q0, payload, null, 4, null), new UseCase.UseCaseSuccessCallback() { // from class: b5.j
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
            public final void onUseCaseComplete(Object obj) {
                AuthenticationResponse authenticationResponse = (AuthenticationResponse) obj;
                NaturalAuthDataManager.Companion companion = NaturalAuthDataManager.INSTANCE;
                FidoPayload payload2 = payload;
                Intrinsics.checkNotNullParameter(payload2, "$payload");
                NaturalAuthDataManager this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FidoNetworkManager.FidoNetworkAuthenticateCallback callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                FidoPayload fidoPayloadM4970clone = payload2.m4970clone();
                fidoPayloadM4970clone.setMessage(authenticationResponse.getMessage());
                fidoPayloadM4970clone.setLifetime(authenticationResponse.getLifetime());
                Intrinsics.checkNotNullExpressionValue(fidoPayloadM4970clone, "apply(...)");
                this$0.f27754w0 = authenticationResponse;
                NaturalAuthDataManager.a(new NaturalAuthDataManager.k(fidoPayloadM4970clone, callback2));
            }
        }, new UseCase.UseCaseErrorCallback() { // from class: b5.k
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
            public final void onUseCaseError(Throwable th2) {
                NaturalAuthDataManager.Companion companion = NaturalAuthDataManager.INSTANCE;
                NaturalAuthDataManager this$0 = this.f24864a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FidoNetworkManager.FidoNetworkAuthenticateCallback callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                Intrinsics.checkNotNull(th2);
                this$0.getClass();
                NaturalAuthDataManager.b("initAuthentication", th2);
                NaturalAuthDataManager.a(new NaturalAuthDataManager.l(callback2, this$0.f27750r0.map(th2)));
            }
        });
    }

    @Override // com.bbva.component.dm.naturalauth.NaturalAuthNetworkManager, com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager
    public void initOobAuthentication(@NotNull FidoPayload fidoPayload, @NotNull FidoNetworkManager.OobAuthenticateCallback oobAuthenticateCallback) {
        NaturalAuthNetworkManager.DefaultImpls.initOobAuthentication(this, fidoPayload, oobAuthenticateCallback);
    }

    @Override // com.bbva.component.dm.naturalauth.NaturalAuthNetworkManager, com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager
    public void initOobRegistration(@NotNull FidoPayload fidoPayload, @NotNull FidoNetworkManager.OobRegisterCallback oobRegisterCallback) {
        NaturalAuthNetworkManager.DefaultImpls.initOobRegistration(this, fidoPayload, oobRegisterCallback);
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager
    public void initRegistration(@NotNull final FidoPayload payload, @NotNull final FidoNetworkManager.FidoNetworkRegisterCallback callback) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f27752t0.execute(new RegisterParams.Init(payload, this.f27749q0), new UseCase.UseCaseSuccessCallback() { // from class: b5.a
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
            public final void onUseCaseComplete(Object obj) {
                NaturalAuthDataManager.Companion companion = NaturalAuthDataManager.INSTANCE;
                FidoPayload payload2 = payload;
                Intrinsics.checkNotNullParameter(payload2, "$payload");
                NaturalAuthDataManager this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FidoNetworkManager.FidoNetworkRegisterCallback callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                FidoPayload fidoPayloadM4970clone = payload2.m4970clone();
                Intrinsics.checkNotNullExpressionValue(fidoPayloadM4970clone, "clone(...)");
                fidoPayloadM4970clone.setMessage((String) obj);
                NaturalAuthDataManager.m mVar = new NaturalAuthDataManager.m(fidoPayloadM4970clone, callback2);
                this$0.getClass();
                NaturalAuthDataManager.a(mVar);
            }
        }, new UseCase.UseCaseErrorCallback() { // from class: b5.i
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
            public final void onUseCaseError(Throwable th2) {
                NaturalAuthDataManager.Companion companion = NaturalAuthDataManager.INSTANCE;
                NaturalAuthDataManager this$0 = this.f24859a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FidoNetworkManager.FidoNetworkRegisterCallback callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                NaturalAuthDataManager.n nVar = new NaturalAuthDataManager.n(callback2, new FidoException.Builder(FidoError.SDK_REGISTER_OPERATION).build());
                this$0.getClass();
                NaturalAuthDataManager.a(nVar);
            }
        });
    }

    @Override // com.bbva.component.dm.naturalauth.NaturalAuthNetworkManager, com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager
    public void initSign(@NotNull FidoPayload fidoPayload, @NotNull FidoNetworkManager.FidoNetworkSignCallback fidoNetworkSignCallback) {
        NaturalAuthNetworkManager.DefaultImpls.initSign(this, fidoPayload, fidoNetworkSignCallback);
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager
    public void listRegisteredAuthenticators(@NotNull FidoPayload payload, @NotNull FidoNetworkManager.FidoNetworkListRegisteredAuthenticatorsCallback callback) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f27751s0.execute(new ListAuthenticatorsParams(this.f27749q0), new y4.a(callback, 1), new y4.b(callback, 1));
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager
    public void quickAuthentication(@NotNull final FidoPayload payload, @NotNull final FidoNetworkManager.FidoNetworkAuthenticateCallback callback) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f27753u0.execute(new AuthenticationParams.Init(this.f27749q0, payload, Constants.authTypeAsoRequestQuickLogin), new UseCase.UseCaseSuccessCallback() { // from class: b5.n
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
            public final void onUseCaseComplete(Object obj) {
                NaturalAuthDataManager.Companion companion = NaturalAuthDataManager.INSTANCE;
                FidoPayload payload2 = payload;
                Intrinsics.checkNotNullParameter(payload2, "$payload");
                NaturalAuthDataManager this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FidoNetworkManager.FidoNetworkAuthenticateCallback callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                FidoPayload fidoPayloadM4970clone = payload2.m4970clone();
                fidoPayloadM4970clone.setMessage(((AuthenticationResponse) obj).getMessage());
                Intrinsics.checkNotNullExpressionValue(fidoPayloadM4970clone, "apply(...)");
                NaturalAuthDataManager.o oVar = new NaturalAuthDataManager.o(fidoPayloadM4970clone, callback2);
                this$0.getClass();
                NaturalAuthDataManager.a(oVar);
            }
        }, new UseCase.UseCaseErrorCallback() { // from class: b5.o
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
            public final void onUseCaseError(Throwable th2) {
                NaturalAuthDataManager.Companion companion = NaturalAuthDataManager.INSTANCE;
                NaturalAuthDataManager this$0 = this.f24874a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FidoNetworkManager.FidoNetworkAuthenticateCallback callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                Intrinsics.checkNotNull(th2);
                this$0.getClass();
                NaturalAuthDataManager.b("initQuickAuthentication", th2);
                NaturalAuthDataManager.a(new NaturalAuthDataManager.p(callback2, this$0.f27750r0.map(th2)));
            }
        });
    }

    public final void refreshHost(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.f27748p0.refreshHost(host);
    }

    public final void setConsumerId(@NotNull String consumerId) {
        Intrinsics.checkNotNullParameter(consumerId, "consumerId");
        this.f27749q0 = consumerId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NaturalAuthDataManager(@NotNull ServiceType serviceType, @NotNull NetworkWorker networkWorker, @NotNull NaturalAuthEndpoints endpoints, @NotNull String consumerId, @NotNull Mapper<? super Throwable, ? extends FidoException> exceptionMapper) {
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        Intrinsics.checkNotNullParameter(endpoints, "endpoints");
        Intrinsics.checkNotNullParameter(consumerId, "consumerId");
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        this.f27748p0 = endpoints;
        this.f27749q0 = consumerId;
        this.f27750r0 = exceptionMapper;
        UseCaseFactory useCaseFactory = new UseCaseFactory(serviceType, networkWorker, endpoints);
        this.f27751s0 = useCaseFactory.getListAuthenticatorsUseCase();
        this.f27752t0 = useCaseFactory.getRegisterUseCase();
        this.f27753u0 = useCaseFactory.getAuthenticateUseCase();
        this.v0 = useCaseFactory.getDeleteUseCase();
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent
    public void onPropertiesBound() {
    }
}
