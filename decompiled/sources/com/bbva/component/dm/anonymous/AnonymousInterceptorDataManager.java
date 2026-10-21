package com.bbva.component.dm.anonymous;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.cells.component.kit.datamanager.DataManager;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.network.NetworkWorker;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnonymousInterceptorDataManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0004R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/bbva/component/dm/anonymous/AnonymousInterceptorDataManager;", "Lcom/bbva/cells/component/kit/datamanager/DataManager;", "", "getId", "", "onPropertiesBound", "token", "onTokenReceived", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL, "", "whiteList", "Ljava/util/List;", "getWhiteList$component_dm_anonymous_release", "()Ljava/util/List;", "setWhiteList$component_dm_anonymous_release", "(Ljava/util/List;)V", "headerName", "Ljava/lang/String;", "getHeaderName$component_dm_anonymous_release", "()Ljava/lang/String;", "setHeaderName$component_dm_anonymous_release", "(Ljava/lang/String;)V", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "<init>", "(Lcom/bbva/network/NetworkWorker;)V", "Companion", "component-dm-anonymous_release"}, k = 1, mv = {1, 9, 0})
public final class AnonymousInterceptorDataManager extends DataManager {

    @NotNull
    public static final String ID = "component-dm-anonymous-interceptor";
    public String headerName;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f27423p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AnonymousLoginInterceptor f27424q0;
    public List<String> whiteList;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Unit> f27421r0 = new ActionSpec<>("action-anonymous-required");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Unit> f27422s0 = new ActionSpec<>("action-anonymous-token-clear");

    /* JADX INFO: compiled from: AnonymousInterceptorDataManager.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bbva/component/dm/anonymous/AnonymousInterceptorDataManager$Companion;", "", "()V", "ACTION_ANONYMOUS_REQUIRED", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "", "getACTION_ANONYMOUS_REQUIRED", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "ACTION_CLEAR_TOKEN", "getACTION_CLEAR_TOKEN", "ID", "", "component-dm-anonymous_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<Unit> getACTION_ANONYMOUS_REQUIRED() {
            return AnonymousInterceptorDataManager.f27421r0;
        }

        @NotNull
        public final ActionSpec<Unit> getACTION_CLEAR_TOKEN() {
            return AnonymousInterceptorDataManager.f27422s0;
        }
    }

    /* JADX INFO: compiled from: AnonymousInterceptorDataManager.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
        public a(Object obj) {
            super(0, obj, AnonymousInterceptorDataManager.class, "requestAnonymousToken", "requestAnonymousToken()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AnonymousInterceptorDataManager.access$requestAnonymousToken((AnonymousInterceptorDataManager) this.receiver);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AnonymousInterceptorDataManager.kt */
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        public b(Object obj) {
            super(0, obj, AnonymousInterceptorDataManager.class, "clearAnonymousToken", "clearAnonymousToken()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AnonymousInterceptorDataManager.access$clearAnonymousToken((AnonymousInterceptorDataManager) this.receiver);
            return Unit.INSTANCE;
        }
    }

    public AnonymousInterceptorDataManager(@NotNull NetworkWorker networkWorker) {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        this.f27423p0 = networkWorker;
        newProperty("whiteList", new u4.a(this, 0));
        newProperty("authHeaderName", new u4.b(this, 0));
    }

    public static final void access$clearAnonymousToken(AnonymousInterceptorDataManager anonymousInterceptorDataManager) {
        anonymousInterceptorDataManager.fire(f27422s0);
    }

    public static final void access$requestAnonymousToken(AnonymousInterceptorDataManager anonymousInterceptorDataManager) {
        anonymousInterceptorDataManager.fire(f27421r0);
    }

    public final void cancel() {
        AnonymousLoginInterceptor anonymousLoginInterceptor = this.f27424q0;
        if (anonymousLoginInterceptor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("interceptor");
            anonymousLoginInterceptor = null;
        }
        anonymousLoginInterceptor.cancel();
    }

    @NotNull
    public final String getHeaderName$component_dm_anonymous_release() {
        String str = this.headerName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("headerName");
        return null;
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getE0() {
        return ID;
    }

    @NotNull
    public final List<String> getWhiteList$component_dm_anonymous_release() {
        List<String> list = this.whiteList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("whiteList");
        return null;
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent
    public void onPropertiesBound() {
        super.onPropertiesBound();
        AnonymousLoginInterceptor anonymousLoginInterceptor = new AnonymousLoginInterceptor(new InterceptorConfiguration(getWhiteList$component_dm_anonymous_release(), getHeaderName$component_dm_anonymous_release()), new a(this), new b(this));
        this.f27424q0 = anonymousLoginInterceptor;
        this.f27423p0.addInterceptor(anonymousLoginInterceptor);
    }

    public final void onTokenReceived(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        AnonymousLoginInterceptor anonymousLoginInterceptor = this.f27424q0;
        if (anonymousLoginInterceptor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("interceptor");
            anonymousLoginInterceptor = null;
        }
        anonymousLoginInterceptor.continueWith(token);
    }

    public final void setHeaderName$component_dm_anonymous_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.headerName = str;
    }

    public final void setWhiteList$component_dm_anonymous_release(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.whiteList = list;
    }
}
