package com.bbva.glomohybrid.base.deeplink.usecase;

import androidx.collection.f;
import com.bbva.component.dm.settings.AppSettingsResultExtensionsKt;
import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.component.dm.settings.domain.model.GlomoContinuityUseCaseModel;
import com.bbva.component.dm.settings.repository.AppSettingsRepository;
import com.bbva.component.dm.settings.repository.SettingsPolicy;
import com.bbva.dynamiclinks.model.DynamicLinkData;
import com.bbva.firebase.analytics.FirebaseAnalyticsManager;
import com.bbva.glomohybrid.base.deeplink.FirebaseDynamicLinkHandler;
import com.bbva.glomohybrid.base.deeplink.GlomoDynamicLinkHandler;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.glomohybrid.base.deeplink.model.LinkParams;
import com.bbva.glomohybrid.base.deeplink.model.QRPayload;
import com.bbva.glomohybrid.base.deeplink.usecase.params.DynamicLinkParams;
import com.bbva.glomohybrid.base.deeplink.usecase.result.Deeplink;
import com.bbva.glomohybrid.base.deeplink.usecase.result.DynamicLinkResult;
import com.bbva.glomohybrid.base.deeplink.usecase.result.NotValidLink;
import com.bbva.glomohybrid.base.deeplink.usecase.result.QRCard;
import com.bbva.glomohybrid.base.extensions.StringExtensionsKt;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.glomoutils.usecase.SuspendUseCaseWithParams;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DynamicLinkUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B3\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/usecase/DynamicLinkUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCaseWithParams;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$DynamicLink;", "Lcom/bbva/glomohybrid/base/deeplink/usecase/result/DynamicLinkResult;", "params", "execute", "(Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$DynamicLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "qrUrl", "Lcom/bbva/component/dm/settings/repository/AppSettingsRepository;", "appSettings", "Lcom/bbva/firebase/analytics/FirebaseAnalyticsManager;", "firebaseAnalytics", "Lcom/bbva/glomohybrid/base/deeplink/GlomoDynamicLinkHandler;", "dynamicLinkHandler", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "threadDispatchers", "<init>", "(Ljava/lang/String;Lcom/bbva/component/dm/settings/repository/AppSettingsRepository;Lcom/bbva/firebase/analytics/FirebaseAnalyticsManager;Lcom/bbva/glomohybrid/base/deeplink/GlomoDynamicLinkHandler;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class DynamicLinkUseCase implements SuspendUseCaseWithParams<LinkParams.DynamicLink, DynamicLinkResult> {

    @NotNull
    public static final String DEEPLINK = "2";

    @NotNull
    public static final String LINK_NOT_VALID = "Not valid or recognized link";

    @NotNull
    public static final String QR_CARD = "1";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f31282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AppSettingsRepository f31283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final FirebaseAnalyticsManager f31284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final GlomoDynamicLinkHandler f31285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f31286e;

    /* JADX INFO: compiled from: DynamicLinkUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.base.deeplink.usecase.DynamicLinkUseCase$execute$2", f = "DynamicLinkUseCase.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DynamicLinkResult>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31287p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LinkParams.DynamicLink f31289r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LinkParams.DynamicLink dynamicLink, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f31289r0 = dynamicLink;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DynamicLinkUseCase.this.new a(this.f31289r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DynamicLinkResult> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31287p0;
            DynamicLinkUseCase dynamicLinkUseCase = DynamicLinkUseCase.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f31287p0 = 1;
                obj = DynamicLinkUseCase.access$readDynamicLink(dynamicLinkUseCase, this.f31289r0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            DynamicLinkData dynamicLinkData = (DynamicLinkData) obj;
            return dynamicLinkData == null ? new NotValidLink(DynamicLinkUseCase.LINK_NOT_VALID) : DynamicLinkUseCase.access$handleDynamicLink(dynamicLinkUseCase, dynamicLinkData);
        }
    }

    public DynamicLinkUseCase(@NotNull String qrUrl, @NotNull AppSettingsRepository appSettings, @NotNull FirebaseAnalyticsManager firebaseAnalytics, @NotNull GlomoDynamicLinkHandler dynamicLinkHandler, @NotNull ThreadDispatchers threadDispatchers) {
        Intrinsics.checkNotNullParameter(qrUrl, "qrUrl");
        Intrinsics.checkNotNullParameter(appSettings, "appSettings");
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "firebaseAnalytics");
        Intrinsics.checkNotNullParameter(dynamicLinkHandler, "dynamicLinkHandler");
        Intrinsics.checkNotNullParameter(threadDispatchers, "threadDispatchers");
        this.f31282a = qrUrl;
        this.f31283b = appSettings;
        this.f31284c = firebaseAnalytics;
        this.f31285d = dynamicLinkHandler;
        this.f31286e = threadDispatchers;
    }

    public static final DynamicLinkResult access$handleDynamicLink(DynamicLinkUseCase dynamicLinkUseCase, DynamicLinkData dynamicLinkData) {
        DynamicLinkResult qRCard;
        AppSettingsResult settings = dynamicLinkUseCase.f31283b.getSettings(SettingsPolicy.Local);
        if (!(settings instanceof AppSettingsResult.FreshResult) && !(settings instanceof AppSettingsResult.CachedResult)) {
            settings = null;
        }
        DynamicLinkParams params = DeepLinkExtensionsKt.toParams(dynamicLinkData);
        if (params == null) {
            return new NotValidLink(LINK_NOT_VALID);
        }
        String id = params.getId();
        String strDecodeBase64 = StringExtensionsKt.decodeBase64(params.getData());
        String origin = params.getOrigin();
        if (origin == null) {
            origin = "";
        }
        GlomoContinuityUseCaseModel glomoContinuityUseCaseModelFindContinuityUseCaseBy = AppSettingsResultExtensionsKt.findContinuityUseCaseBy(settings, id);
        String id2 = glomoContinuityUseCaseModelFindContinuityUseCaseBy != null ? glomoContinuityUseCaseModelFindContinuityUseCaseBy.getId() : null;
        if (Intrinsics.areEqual(id2, "2")) {
            qRCard = new Deeplink(id, strDecodeBase64, origin);
        } else {
            qRCard = Intrinsics.areEqual(id2, "1") ? new QRCard(id, new QRPayload(f.c(new StringBuilder(), dynamicLinkUseCase.f31282a, "#", strDecodeBase64)), origin) : new NotValidLink(LINK_NOT_VALID);
        }
        Pair<String, Map<String, Object>> analytics = DeepLinkExtensionsKt.toAnalytics(qRCard);
        dynamicLinkUseCase.f31284c.log(analytics.component1(), analytics.component2());
        return qRCard;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$readDynamicLink(DynamicLinkUseCase dynamicLinkUseCase, LinkParams.DynamicLink dynamicLink, Continuation continuation) {
        z7.a aVar;
        Object objM5535constructorimpl;
        dynamicLinkUseCase.getClass();
        if (continuation instanceof z7.a) {
            aVar = (z7.a) continuation;
            int i10 = aVar.f95009r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f95009r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new z7.a(dynamicLinkUseCase, continuation);
            }
        } else {
            aVar = new z7.a(dynamicLinkUseCase, continuation);
        }
        Object objHandleLink = aVar.f95007p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f95009r0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objHandleLink);
                Result.Companion companion = Result.INSTANCE;
                GlomoDynamicLinkHandler glomoDynamicLinkHandler = dynamicLinkUseCase.f31285d;
                aVar.f95009r0 = 1;
                objHandleLink = glomoDynamicLinkHandler.handleLink(dynamicLink, aVar);
                if (objHandleLink == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objHandleLink);
            }
            objM5535constructorimpl = Result.m5535constructorimpl((DynamicLinkData) objHandleLink);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        return objM5535constructorimpl;
    }

    @Override // com.bbva.glomoutils.usecase.SuspendUseCaseWithParams
    @Nullable
    public Object execute(@NotNull LinkParams.DynamicLink dynamicLink, @NotNull Continuation<? super DynamicLinkResult> continuation) {
        return BuildersKt.withContext(this.f31286e.io(), new a(dynamicLink, null), continuation);
    }

    public /* synthetic */ DynamicLinkUseCase(String str, AppSettingsRepository appSettingsRepository, FirebaseAnalyticsManager firebaseAnalyticsManager, GlomoDynamicLinkHandler glomoDynamicLinkHandler, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, appSettingsRepository, firebaseAnalyticsManager, (i10 & 8) != 0 ? new FirebaseDynamicLinkHandler() : glomoDynamicLinkHandler, (i10 & 16) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
