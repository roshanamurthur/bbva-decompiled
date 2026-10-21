package com.bbva.glomohybrid.landing.presentation.viewmodel.handler;

import android.os.Bundle;
import androidx.camera.core.imagecapture.a;
import bk.q;
import com.bbva.bridge.navigate.NavigateDispatcher;
import com.bbva.bridge.navigate.WebNavigationState;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.document.scanner.plugin.validators.ValidationConstantsKt;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomo.user.domain.model.UserTypeKt;
import com.bbva.glomoconfig.DefaultConfigConstantsKt;
import com.bbva.glomoconfig.constants.CountryRouteConstants;
import com.bbva.glomoconfig.constants.RouteConstants;
import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.handler.DeepLinkHandler;
import com.bbva.glomohybrid.base.handler.ShortcutHandler;
import com.bbva.glomohybrid.base.inappupdate.InAppUpdatesHandler;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.base.models.InAppUpdateInfo;
import com.bbva.glomohybrid.base.models.InAppUpdateType;
import com.bbva.glomohybrid.base.models.ShortcutModel;
import com.bbva.glomohybrid.base.router.IntentExtra;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.base.webApp.WebAppConstants;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardButtonModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingShortcutItemModel;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingECommerceCardModel;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import com.bbva.glomohybrid.landing.presentation.extensions.LandingECommerceCardModelExtensionsKt;
import com.bbva.glomohybrid.landing.presentation.extensions.LandingLinkExtensionsKt;
import com.bbva.glomohybrid.landing.presentation.extensions.LandingMessageCardButtonModelExtensionsKt;
import com.bbva.glomohybrid.landing.presentation.extensions.LandingShortcutItemModelExtensionsKt;
import com.bbva.glomohybrid.landing.presentation.extensions.UserProfileExtensionsKt;
import com.bbva.glomohybrid.landing.presentation.model.LandingInAppUpdate;
import com.bbva.glomohybrid.landing.presentation.model.LandingLink;
import com.bbva.glomohybrid.landing.presentation.model.LandingNavigationPayload;
import com.bbva.glomoutils.StringExtensionsKt;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.slidemenuview.cells.components.dm.MenuDataManager;
import com.bbva.slidemenuview.domain.model.MenuItemAction;
import com.bbva.slidemenuview.extensions.MenuExtensionsKt;
import com.bbva.ui.component.menu.model.MenuItem;
import com.google.android.gms.common.Scopes;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: LandingAccessesHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001;B\u000f\u0012\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J%\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\tJ%\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004J$\u0010\u0014\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J$\u0010\u0017\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u0016\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bJ#\u0010!\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0006\u0010#\u001a\u00020\u0006J\u0006\u0010$\u001a\u00020\u0006R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020-0,8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingAccessesHandler;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/ui/component/menu/model/MenuItem;", AnalyticsConstants.Key.ITEM, "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", Scopes.PROFILE, "", "onTap", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingShortcutItemModel;", "(Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingShortcutItemModel;Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardButtonModel;", "(Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardButtonModel;Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceCardModel;", ValidationConstantsKt.Card, "", "route", "", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "deeplink", "onNotification", "Lcom/bbva/glomohybrid/base/models/ShortcutModel;", "shortcut", "onShortcut", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingLink;", DynamicLink.Builder.KEY_LINK, "onLinkTap", "", "animated", "openLogin", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingInAppUpdate;", "update", "isImmediate", "openAppUpdates", "(Lcom/bbva/glomohybrid/landing/presentation/model/LandingInAppUpdate;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attemptPendingNavigation", "cancelPendingNavigation", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event;", "E0", "Lkotlinx/coroutines/flow/Flow;", "getEvents", "()Lkotlinx/coroutines/flow/Flow;", "events", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingAccessesHandler$AccessesState;", "G0", "Lkotlinx/coroutines/flow/StateFlow;", "getAccessesState", "()Lkotlinx/coroutines/flow/StateFlow;", "accessesState", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "AccessesState", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingAccessesHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingAccessesHandler.kt\ncom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingAccessesHandler\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,553:1\n56#2,6:554\n56#2,6:560\n29#3,4:566\n42#3,4:571\n1#4:570\n120#5:575\n158#6:576\n*S KotlinDebug\n*F\n+ 1 LandingAccessesHandler.kt\ncom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingAccessesHandler\n*L\n69#1:554,6\n71#1:560,6\n77#1:566,4\n266#1:571,4\n266#1:575\n266#1:576\n*E\n"})
public final class LandingAccessesHandler implements CoroutineScope {

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    @NotNull
    public final Flow<LandingContract.Event> events;

    @NotNull
    public final MutableStateFlow<AccessesState> F0;

    @NotNull
    public final MutableStateFlow G0;

    @Nullable
    public LandingContract.Event.Navigation H0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ViewModelComponentsProviders f33192p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f33193q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f33194r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final List<String> f33195s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f33196t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy f33197u0;

    @NotNull
    public final Lazy v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final Lazy f33198w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final Lazy f33199x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final Channel<LandingContract.Event> f33200y0;

    /* JADX INFO: compiled from: LandingAccessesHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingAccessesHandler$AccessesState;", "", "()V", "NotAvailable", "Ready", "Lcom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingAccessesHandler$AccessesState$NotAvailable;", "Lcom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingAccessesHandler$AccessesState$Ready;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class AccessesState {

        /* JADX INFO: compiled from: LandingAccessesHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingAccessesHandler$AccessesState$NotAvailable;", "Lcom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingAccessesHandler$AccessesState;", "()V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NotAvailable extends AccessesState {

            @NotNull
            public static final NotAvailable INSTANCE = new NotAvailable();

            public NotAvailable() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: LandingAccessesHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingAccessesHandler$AccessesState$Ready;", "Lcom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingAccessesHandler$AccessesState;", "()V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Ready extends AccessesState {

            @NotNull
            public static final Ready INSTANCE = new Ready();

            public Ready() {
                super(null);
            }
        }

        public AccessesState() {
        }

        public /* synthetic */ AccessesState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: LandingAccessesHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[MenuItemAction.values().length];
            try {
                iArr[MenuItemAction.APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MenuItemAction.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MenuItemAction.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MenuItemAction.PAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MenuItemAction.PRIVATE_PAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LandingAEMModel.SystemScheme.values().length];
            try {
                iArr2[LandingAEMModel.SystemScheme.APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[LandingAEMModel.SystemScheme.DIALER.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[LandingAEMModel.SystemScheme.MARKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[LandingAEMModel.SystemScheme.IMMEDIATE_UPDATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[LandingAEMModel.SystemScheme.EXTERNAL_BROWSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[LandingAEMModel.SystemScheme.INTERNAL_BROWSER.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[LandingAEMModel.SystemScheme.INTERNAL_BROWSER_ON_BOARDING.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[LandingContract.Event.Navigation.Type.values().length];
            try {
                iArr3[LandingContract.Event.Navigation.Type.WEB.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[LandingContract.Event.Navigation.Type.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: compiled from: LandingAccessesHandler.kt */
    public static final class a extends Lambda implements Function0<DeepLinkHandler> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DeepLinkHandler invoke() {
            return (DeepLinkHandler) LandingAccessesHandler.this.f33192p0.provide(DeepLinkHandler.ID);
        }
    }

    /* JADX INFO: compiled from: LandingAccessesHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAccessesHandler", f = "LandingAccessesHandler.kt", i = {0}, l = {450}, m = "getImmediateUpdateNavigation", n = {"route"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public String f33202p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f33203q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f33205s0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33203q0 = obj;
            this.f33205s0 |= Integer.MIN_VALUE;
            return LandingAccessesHandler.this.e(null, this);
        }
    }

    /* JADX INFO: compiled from: LandingAccessesHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAccessesHandler$notifyEvent$1", f = "LandingAccessesHandler.kt", i = {}, l = {544}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33206p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LandingContract.Event f33208r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LandingContract.Event event, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f33208r0 = event;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LandingAccessesHandler.this.new c(this.f33208r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33206p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = LandingAccessesHandler.this.f33200y0;
                this.f33206p0 = 1;
                if (channel.send(this.f33208r0, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: LandingAccessesHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAccessesHandler$notifyEvent$2", f = "LandingAccessesHandler.kt", i = {}, l = {547}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33209p0;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LandingAccessesHandler.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33209p0;
            LandingAccessesHandler landingAccessesHandler = LandingAccessesHandler.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                if (landingAccessesHandler.F0.getValue() instanceof AccessesState.NotAvailable) {
                    long j10 = landingAccessesHandler.f33194r0;
                    this.f33209p0 = 1;
                    if (DelayKt.delay(j10, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            landingAccessesHandler.F0.setValue(AccessesState.Ready.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LandingAccessesHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAccessesHandler", f = "LandingAccessesHandler.kt", i = {0, 0, 0}, l = {131}, m = "onTap", n = {"this", AnalyticsConstants.Key.ITEM, Scopes.PROFILE}, s = {"L$0", "L$1", "L$2"})
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LandingAccessesHandler f33211p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public LandingShortcutItemModel f33212q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public UserProfileConfiguration f33213r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f33214s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f33216u0;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33214s0 = obj;
            this.f33216u0 |= Integer.MIN_VALUE;
            return LandingAccessesHandler.this.onTap((LandingShortcutItemModel) null, (UserProfileConfiguration) null, this);
        }
    }

    /* JADX INFO: compiled from: LandingAccessesHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAccessesHandler", f = "LandingAccessesHandler.kt", i = {0, 0, 0}, l = {157}, m = "onTap", n = {"this", AnalyticsConstants.Key.ITEM, Scopes.PROFILE}, s = {"L$0", "L$1", "L$2"})
    public static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LandingAccessesHandler f33217p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public LandingMessageCardButtonModel f33218q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public UserProfileConfiguration f33219r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f33220s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f33222u0;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33220s0 = obj;
            this.f33222u0 |= Integer.MIN_VALUE;
            return LandingAccessesHandler.this.onTap((LandingMessageCardButtonModel) null, (UserProfileConfiguration) null, this);
        }
    }

    /* JADX INFO: compiled from: LandingAccessesHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAccessesHandler", f = "LandingAccessesHandler.kt", i = {0}, l = {439}, m = "openAppUpdates", n = {"this"}, s = {"L$0"})
    public static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LandingAccessesHandler f33223p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f33224q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f33226s0;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33224q0 = obj;
            this.f33226s0 |= Integer.MIN_VALUE;
            return LandingAccessesHandler.this.openAppUpdates(null, false, this);
        }
    }

    /* JADX INFO: compiled from: LandingAccessesHandler.kt */
    public static final class h extends Lambda implements Function0<ShortcutHandler> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ShortcutHandler invoke() {
            return (ShortcutHandler) LandingAccessesHandler.this.f33192p0.provide(ShortcutHandler.ID);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LandingAccessesHandler(@NotNull final ViewModelComponentsProviders provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f33192p0 = provider;
        this.f33193q0 = CoroutineScopeKt.MainScope();
        this.f33194r0 = 1000L;
        this.f33195s0 = bk.d.listOf(CountryRouteConstants.INSTANCE.getMenuSoftTokenRoute());
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f33196t0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<MenuDataManager>() { // from class: com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAccessesHandler$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.slidemenuview.cells.components.dm.MenuDataManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MenuDataManager invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(MenuDataManager.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f33197u0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<NavigateDispatcher>() { // from class: com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAccessesHandler$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.bridge.navigate.NavigateDispatcher, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigateDispatcher invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(NavigateDispatcher.class), objArr2, objArr3);
            }
        });
        this.v0 = LazyKt__LazyJVMKt.lazy(new a());
        this.f33198w0 = LazyKt__LazyJVMKt.lazy(new h());
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.f33199x0 = LazyKt__LazyJVMKt.lazy(new Function0<InAppUpdatesHandler>() { // from class: com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAccessesHandler$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.base.inappupdate.InAppUpdatesHandler, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final InAppUpdatesHandler invoke() {
                return a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(InAppUpdatesHandler.class), objArr4, objArr5);
            }
        });
        Channel<LandingContract.Event> channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this.f33200y0 = channelChannel$default;
        this.events = FlowKt.receiveAsFlow(channelChannel$default);
        MutableStateFlow<AccessesState> MutableStateFlow = StateFlowKt.MutableStateFlow(AccessesState.Ready.INSTANCE);
        this.F0 = MutableStateFlow;
        this.G0 = MutableStateFlow;
    }

    public static final NavigateDispatcher access$getWebNavigationHandler(LandingAccessesHandler landingAccessesHandler) {
        return (NavigateDispatcher) landingAccessesHandler.f33197u0.getValue();
    }

    public static final void access$handleNavigationState(LandingAccessesHandler landingAccessesHandler, WebNavigationState webNavigationState, LandingContract.Event.Navigation navigation) {
        landingAccessesHandler.getClass();
        if (webNavigationState instanceof WebNavigationState.Loaded) {
            landingAccessesHandler.i(navigation);
        } else if (Intrinsics.areEqual(webNavigationState, WebNavigationState.Loading.INSTANCE)) {
            landingAccessesHandler.F0.setValue(AccessesState.NotAvailable.INSTANCE);
        }
    }

    public static final Object access$mapToEvent(LandingAccessesHandler landingAccessesHandler, LandingMessageCardButtonModel landingMessageCardButtonModel, UserProfileConfiguration userProfileConfiguration, Continuation continuation) {
        landingAccessesHandler.getClass();
        return landingAccessesHandler.d(landingMessageCardButtonModel.getNavigationType(), landingMessageCardButtonModel.getAction(), userProfileConfiguration, landingMessageCardButtonModel.getTargetProfile(), continuation);
    }

    public static LandingContract.Event.Navigation c(String str) {
        if (str == null) {
            return null;
        }
        return new LandingContract.Event.Navigation(LandingContract.Event.Navigation.Type.DIALER, new Route(str, Animation.SlideRight.INSTANCE, null, 4, null), false, null, 12, null);
    }

    public static LandingContract.Event.Navigation f(UserProfileConfiguration userProfileConfiguration, Animation animation) {
        return new LandingContract.Event.Navigation(LandingContract.Event.Navigation.Type.NATIVE, new Route("login", animation, userProfileConfiguration != null ? new IntentExtra.Parcel(DefaultConfigConstantsKt.INTENT_KEY_LOGIN_CONFIG_DATA, UserProfileExtensionsKt.toLoginConfiguration(userProfileConfiguration)) : null), false, null, 8, null);
    }

    public final void a(LandingContract.Event.Navigation navigation) {
        int i10 = WhenMappings.$EnumSwitchMapping$2[navigation.getType().ordinal()];
        if (i10 == 1) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new p9.a(navigation, this, null), 3, null);
        } else if (i10 != 2) {
            i(navigation);
        } else {
            this.H0 = LandingContract.Event.Navigation.copy$default(navigation, LandingContract.Event.Navigation.Type.WEB, null, false, null, 14, null);
            i(new LandingContract.Event.CustomNavigation(navigation.getRoute().getRoute()));
        }
    }

    public final void attemptPendingNavigation() {
        LandingContract.Event.Navigation navigation = this.H0;
        if (navigation != null) {
            a(navigation);
            cancelPendingNavigation();
        }
    }

    public final DeepLinkHandler b() {
        return (DeepLinkHandler) this.v0.getValue();
    }

    public final void cancelPendingNavigation() {
        this.H0 = null;
    }

    public final Object d(String str, String str2, UserProfileConfiguration userProfileConfiguration, String str3, Continuation<? super LandingContract.Event> continuation) {
        UserType type;
        if (Intrinsics.areEqual(str, LandingAEMModel.Navigation.SYSTEM.getValue())) {
            return g(str2, continuation);
        }
        if (Intrinsics.areEqual(str, LandingAEMModel.Navigation.CELLS.getValue())) {
            if (str2 == null) {
                return null;
            }
            return new LandingContract.Event.Navigation(this.f33195s0.contains(str2) ? LandingContract.Event.Navigation.Type.CUSTOM : LandingContract.Event.Navigation.Type.WEB, new Route(str2, Animation.SlideRight.INSTANCE, null, 4, null), false, null, 12, null);
        }
        if (!Intrinsics.areEqual(str, LandingAEMModel.Navigation.PRIVATE_CELLS.getValue())) {
            return null;
        }
        if (str3 == null || (type = UserTypeKt.toUserType(str3)) == null) {
            type = userProfileConfiguration.getType();
        }
        return f(UserProfileConfiguration.copy$default(userProfileConfiguration, null, type, 1, null), Animation.SlideRight.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, Continuation<? super LandingContract.Event.ImmediateUpdateNavigation> continuation) {
        b bVar;
        InAppUpdateInfo inAppUpdateInfo;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f33205s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f33205s0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object infoForDownload = bVar.f33203q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f33205s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(infoForDownload);
            inAppUpdateInfo = null;
            if (str == null) {
                return null;
            }
            this.F0.setValue(AccessesState.NotAvailable.INSTANCE);
            InAppUpdatesHandler inAppUpdatesHandler = (InAppUpdatesHandler) this.f33199x0.getValue();
            if (inAppUpdatesHandler != null) {
                InAppUpdateType inAppUpdateType = InAppUpdateType.IMMEDIATE;
                bVar.f33202p0 = str;
                bVar.f33205s0 = 1;
                infoForDownload = inAppUpdatesHandler.getInfoForDownload(inAppUpdateType, bVar);
                if (infoForDownload == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return new LandingContract.Event.ImmediateUpdateNavigation(new LandingInAppUpdate(str, inAppUpdateInfo));
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = bVar.f33202p0;
        ResultKt.throwOnFailure(infoForDownload);
        inAppUpdateInfo = (InAppUpdateInfo) infoForDownload;
        return new LandingContract.Event.ImmediateUpdateNavigation(new LandingInAppUpdate(str, inAppUpdateInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(String str, Continuation<? super LandingContract.Event> continuation) {
        LandingContract.Event.Navigation navigation;
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{LandingAEMModel.INSTANCE.getSYSTEM_DELIMITER()}, false, 2, 2, (Object) null);
        String str2 = (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default, 0);
        Object navigation2 = null;
        if (str2 == null) {
            return null;
        }
        String str3 = (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default, 1);
        String str4 = (str3 == null || !(l.isBlank(str3) ^ true)) ? null : str3;
        LandingAEMModel.SystemScheme systemSchemeFrom = LandingAEMModel.SystemScheme.INSTANCE.from(str2);
        switch (systemSchemeFrom == null ? -1 : WhenMappings.$EnumSwitchMapping$1[systemSchemeFrom.ordinal()]) {
            case -1:
                return c(str);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                if (str4 != null) {
                    navigation = new LandingContract.Event.Navigation(LandingContract.Event.Navigation.Type.EXTERNAL_APP, new Route(str4, Animation.SlideRight.INSTANCE, null, 4, null), false, null, 12, null);
                    navigation2 = navigation;
                }
                return navigation2;
            case 2:
                return c(str4);
            case 3:
                if (str4 != null) {
                    navigation = new LandingContract.Event.Navigation(LandingContract.Event.Navigation.Type.MARKET, new Route(str4, null, null, 6, null), false, null, 12, null);
                    navigation2 = navigation;
                }
                return navigation2;
            case 4:
                Object objE = e(str4, continuation);
                return objE == ek.a.getCOROUTINE_SUSPENDED() ? objE : (LandingContract.Event) objE;
            case 5:
                if (str4 != null) {
                    navigation2 = new LandingContract.Event.Navigation(LandingContract.Event.Navigation.Type.EXTERNAL_WEB_LINK, new Route(str4, null, null, 6, null), false, null, 12, null);
                }
                return navigation2;
            case 6:
                if (str4 != null) {
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = TuplesKt.to("url", str4);
                    String urlHost = StringExtensionsKt.getUrlHost(str4);
                    if (urlHost == null) {
                        urlHost = "";
                    }
                    pairArr[1] = TuplesKt.to("title", urlHost);
                    navigation2 = new LandingContract.Event.Navigation(LandingContract.Event.Navigation.Type.NATIVE, new Route("webview", null, null, 6, null), false, new LandingNavigationPayload(q.mapOf(pairArr)), 4, null);
                }
                return navigation2;
            case 7:
                Bundle bundle = (Bundle) androidx.camera.core.impl.utils.c.f(this.f33192p0).getOrNull(Reflection.getOrCreateKotlinClass(Bundle.class), QualifierKt.named(WebAppConstants.CUENTA_EN_LINEA_WEB_APP_BUNDLE), null);
                return new LandingContract.Event.Navigation(LandingContract.Event.Navigation.Type.NATIVE, new Route(RouteConstants.WEBAPP, null, null, 6, null), false, bundle != null ? new LandingNavigationPayload(bundle) : null, 4, null);
        }
    }

    @NotNull
    public final StateFlow<AccessesState> getAccessesState() {
        return this.G0;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f33193q0.getCoroutineContext();
    }

    @NotNull
    public final Flow<LandingContract.Event> getEvents() {
        return this.events;
    }

    public final void h(String str, LandingContract.Event event, UserProfileConfiguration userProfileConfiguration, String str2) {
        if (!(event instanceof LandingContract.Event.Navigation)) {
            i(event);
            return;
        }
        LandingContract.Event.Navigation navigation = (LandingContract.Event.Navigation) event;
        UserType userType = str2 != null ? UserTypeKt.toUserType(str2) : null;
        if (!Intrinsics.areEqual(str, LandingAEMModel.Navigation.PRIVATE_CELLS.getValue()) || userType == null || userType == userProfileConfiguration.getType()) {
            a(navigation);
        } else if (Intrinsics.areEqual(str2, UserType.ENTERPRISE.getValue())) {
            i(LandingContract.Event.EnterpriseNavigation.INSTANCE);
        }
    }

    public final void i(LandingContract.Event event) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(event, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new d(null), 3, null);
    }

    public final void onLinkTap(@NotNull LandingLink link, @NotNull UserProfileConfiguration profile) {
        DeepLinkHandler deepLinkHandlerB;
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(profile, "profile");
        DeepLinkModel deepLink = LandingLinkExtensionsKt.toDeepLink(link);
        if (deepLink != null && (deepLinkHandlerB = b()) != null) {
            deepLinkHandlerB.setDeepLink(deepLink);
        }
        LandingContract.Event.Navigation navigationF = null;
        if (link.isInApp()) {
            navigationF = link.isPrivate() ? f(UserProfileConfiguration.copy$default(profile, null, profile.getType(), 1, null), Animation.SlideRight.INSTANCE) : new LandingContract.Event.Navigation(LandingContract.Event.Navigation.Type.WEB, new Route(link.getRoute(), null, null, 6, null), false, null, 12, null);
        } else {
            String route = link.getRoute();
            if (route != null) {
                navigationF = new LandingContract.Event.Navigation(LandingContract.Event.Navigation.Type.EXTERNAL_WEB_LINK, new Route(route, null, null, 6, null), false, null, 12, null);
            }
        }
        if (navigationF == null) {
            return;
        }
        a(navigationF);
    }

    public final void onNotification(@Nullable String route, @Nullable Object payload, @Nullable DeepLinkModel deeplink) {
        if (route == null) {
            return;
        }
        DeepLinkHandler deepLinkHandlerB = b();
        if (deepLinkHandlerB != null) {
            deepLinkHandlerB.setDeepLink(deeplink);
        }
        a(new LandingContract.Event.Navigation(LandingContract.Event.Navigation.Type.WEB, new Route(route, Animation.Fade.INSTANCE, null, 4, null), false, payload != null ? new LandingNavigationPayload(payload) : null, 4, null));
    }

    public final void onShortcut(@Nullable String route, @Nullable Object payload, @Nullable ShortcutModel shortcut) {
        if (route == null) {
            return;
        }
        ShortcutHandler shortcutHandler = (ShortcutHandler) this.f33198w0.getValue();
        if (shortcutHandler != null) {
            shortcutHandler.setShortcut(shortcut);
        }
        a(new LandingContract.Event.Navigation(LandingContract.Event.Navigation.Type.WEB, new Route(route, Animation.Fade.INSTANCE, null, 4, null), false, payload != null ? new LandingNavigationPayload(payload) : null, 4, null));
    }

    public final void onTap(@NotNull MenuItem item, @NotNull UserProfileConfiguration profile) {
        LandingContract.Event.Navigation navigation;
        LandingContract.Event.Navigation navigationC;
        DeepLinkHandler deepLinkHandlerB;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(profile, "profile");
        DeepLinkModel deepLink = MenuExtensionsKt.toDeepLink(item, item.getRoute());
        if (deepLink != null && (deepLinkHandlerB = b()) != null) {
            deepLinkHandlerB.setDeepLink(deepLink);
        }
        String route = item.getRoute();
        int i10 = WhenMappings.$EnumSwitchMapping$0[MenuItemAction.INSTANCE.from(item.getClickAction()).ordinal()];
        LandingContract.Event.Navigation navigation2 = null;
        if (i10 == 1) {
            if (route != null) {
                navigation = new LandingContract.Event.Navigation(LandingContract.Event.Navigation.Type.EXTERNAL_APP, new Route(route, Animation.SlideRight.INSTANCE, null, 4, null), false, null, 12, null);
                navigation2 = navigation;
            }
            navigationC = navigation2;
        } else if (i10 == 2) {
            navigationC = c(route);
        } else if (i10 == 3) {
            if (route != null) {
                navigation = new LandingContract.Event.Navigation(LandingContract.Event.Navigation.Type.CUSTOM, new Route(route, Animation.SlideRight.INSTANCE, null, 4, null), false, null, 12, null);
                navigation2 = navigation;
            }
            navigationC = navigation2;
        } else if (i10 == 4) {
            if (route != null) {
                navigation = new LandingContract.Event.Navigation(LandingContract.Event.Navigation.Type.WEB, new Route(route, Animation.SlideRight.INSTANCE, null, 4, null), false, null, 12, null);
                navigation2 = navigation;
            }
            navigationC = navigation2;
        } else {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            navigationC = f(UserProfileConfiguration.copy$default(profile, null, profile.getType(), 1, null), Animation.SlideRight.INSTANCE);
        }
        if (navigationC == null) {
            return;
        }
        a(navigationC);
        ((MenuDataManager) this.f33196t0.getValue()).markItemAsVisited(item.getId());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object openAppUpdates(@NotNull LandingInAppUpdate landingInAppUpdate, boolean z10, @NotNull Continuation<? super Unit> continuation) {
        g gVar;
        LandingContract.Event navigation;
        LandingAccessesHandler landingAccessesHandler;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i10 = gVar.f33226s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f33226s0 = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objE = gVar.f33224q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = gVar.f33226s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objE);
            if (z10) {
                String packageId = landingInAppUpdate.getPackageId();
                gVar.f33223p0 = this;
                gVar.f33226s0 = 1;
                objE = e(packageId, gVar);
                if (objE == coroutine_suspended) {
                    return coroutine_suspended;
                }
                landingAccessesHandler = this;
            } else {
                if (z10) {
                    throw new NoWhenBranchMatchedException();
                }
                String packageId2 = landingInAppUpdate.getPackageId();
                navigation = packageId2 == null ? null : new LandingContract.Event.Navigation(LandingContract.Event.Navigation.Type.MARKET, new Route(packageId2, null, null, 6, null), false, null, 12, null);
                landingAccessesHandler = this;
            }
            if (navigation == null) {
                return Unit.INSTANCE;
            }
            landingAccessesHandler.i(navigation);
            return Unit.INSTANCE;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        landingAccessesHandler = gVar.f33223p0;
        ResultKt.throwOnFailure(objE);
        navigation = (LandingContract.Event) objE;
        if (navigation == null) {
            return Unit.INSTANCE;
        }
        landingAccessesHandler.i(navigation);
        return Unit.INSTANCE;
    }

    public final void openLogin(@NotNull UserProfileConfiguration profile, boolean animated) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        Animation animation = Animation.SlideRight.INSTANCE;
        if (!animated) {
            animation = null;
        }
        if (animation == null) {
            animation = Animation.None.INSTANCE;
        }
        a(f(profile, animation));
    }

    public static final Object access$mapToEvent(LandingAccessesHandler landingAccessesHandler, LandingShortcutItemModel landingShortcutItemModel, UserProfileConfiguration userProfileConfiguration, Continuation continuation) {
        landingAccessesHandler.getClass();
        return landingAccessesHandler.d(landingShortcutItemModel.getNavigationType(), landingShortcutItemModel.getRoute(), userProfileConfiguration, landingShortcutItemModel.getTargetProfile(), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object onTap(@Nullable LandingShortcutItemModel landingShortcutItemModel, @NotNull UserProfileConfiguration userProfileConfiguration, @NotNull Continuation<? super Unit> continuation) {
        e eVar;
        LandingAccessesHandler landingAccessesHandler;
        DeepLinkHandler deepLinkHandlerB;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i10 = eVar.f33216u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f33216u0 = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        e eVar2 = eVar;
        Object objD = eVar2.f33214s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar2.f33216u0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objD);
            if (landingShortcutItemModel != null) {
                DeepLinkModel deepLink = LandingShortcutItemModelExtensionsKt.toDeepLink(landingShortcutItemModel);
                if (deepLink != null && (deepLinkHandlerB = b()) != null) {
                    deepLinkHandlerB.setDeepLink(deepLink);
                }
                eVar2.f33211p0 = this;
                eVar2.f33212q0 = landingShortcutItemModel;
                eVar2.f33213r0 = userProfileConfiguration;
                eVar2.f33216u0 = 1;
                objD = d(landingShortcutItemModel.getNavigationType(), landingShortcutItemModel.getRoute(), userProfileConfiguration, landingShortcutItemModel.getTargetProfile(), eVar2);
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
                landingAccessesHandler = this;
            }
            return Unit.INSTANCE;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        userProfileConfiguration = eVar2.f33213r0;
        landingShortcutItemModel = eVar2.f33212q0;
        landingAccessesHandler = eVar2.f33211p0;
        ResultKt.throwOnFailure(objD);
        LandingContract.Event event = (LandingContract.Event) objD;
        if (event != null) {
            landingAccessesHandler.h(landingShortcutItemModel.getNavigationType(), event, userProfileConfiguration, landingShortcutItemModel.getTargetProfile());
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object onTap(@Nullable LandingMessageCardButtonModel landingMessageCardButtonModel, @NotNull UserProfileConfiguration userProfileConfiguration, @NotNull Continuation<? super Unit> continuation) {
        f fVar;
        LandingAccessesHandler landingAccessesHandler;
        DeepLinkHandler deepLinkHandlerB;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i10 = fVar.f33222u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f33222u0 = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        f fVar2 = fVar;
        Object objD = fVar2.f33220s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = fVar2.f33222u0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objD);
            if (landingMessageCardButtonModel != null) {
                DeepLinkModel deepLink = LandingMessageCardButtonModelExtensionsKt.toDeepLink(landingMessageCardButtonModel);
                if (deepLink != null && (deepLinkHandlerB = b()) != null) {
                    deepLinkHandlerB.setDeepLink(deepLink);
                }
                fVar2.f33217p0 = this;
                fVar2.f33218q0 = landingMessageCardButtonModel;
                fVar2.f33219r0 = userProfileConfiguration;
                fVar2.f33222u0 = 1;
                objD = d(landingMessageCardButtonModel.getNavigationType(), landingMessageCardButtonModel.getAction(), userProfileConfiguration, landingMessageCardButtonModel.getTargetProfile(), fVar2);
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
                landingAccessesHandler = this;
            }
            return Unit.INSTANCE;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        userProfileConfiguration = fVar2.f33219r0;
        landingMessageCardButtonModel = fVar2.f33218q0;
        landingAccessesHandler = fVar2.f33217p0;
        ResultKt.throwOnFailure(objD);
        LandingContract.Event event = (LandingContract.Event) objD;
        if (event != null) {
            landingAccessesHandler.h(landingMessageCardButtonModel.getNavigationType(), event, userProfileConfiguration, landingMessageCardButtonModel.getTargetProfile());
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final void onTap(@Nullable LandingECommerceCardModel card, @NotNull UserProfileConfiguration profile) {
        Unit unit;
        Intrinsics.checkNotNullParameter(profile, "profile");
        DeepLinkModel deepLink = LandingECommerceCardModelExtensionsKt.toDeepLink(card);
        if (deepLink != null) {
            DeepLinkHandler deepLinkHandlerB = b();
            if (deepLinkHandlerB != null) {
                deepLinkHandlerB.setDeepLink(deepLink);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            return;
        }
        a(f(UserProfileConfiguration.copy$default(profile, null, profile.getType(), 1, null), Animation.SlideRight.INSTANCE));
    }
}
