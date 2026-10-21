package com.bbva.component.ic.security;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.r1;
import androidx.camera.core.impl.o;
import androidx.camera.core.impl.q;
import c5.b;
import c5.c;
import com.bbva.cells.component.kit.datamanager.DataManager;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.component.ic.security.factory.InterceptorsFactory;
import com.bbva.component.ic.security.interceptor.SecurityInterceptor;
import com.bbva.component.ic.security.model.HandlerConfig;
import com.bbva.component.ic.security.utils.SecurityType;
import com.bbva.component.ic.security.utils.SecurityVerification;
import com.bbva.network.NetworkWorker;
import h2.j;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SecurityDataManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J\u001a\u0010\n\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0014J\u0016\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003J\u001a\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007J\u0006\u0010\u0011\u001a\u00020\u0005R\"\u0010\u0012\u001a\u00020\u00038\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/bbva/component/ic/security/SecurityDataManager;", "Lcom/bbva/cells/component/kit/datamanager/DataManager;", "", "", "whiteList", "", "setWhiteList", "", "", "config", "setUnauthorizedCode", "getId", "onPropertiesBound", "securityType", "securityCode", "setAdditionalSecurityRequired", "headers", "cancelSecurityRequest", "type", "Ljava/lang/String;", "getType$component_ic_security_release", "()Ljava/lang/String;", "setType$component_ic_security_release", "(Ljava/lang/String;)V", "Lcom/bbva/network/NetworkWorker;", "worker", "<init>", "(Lcom/bbva/network/NetworkWorker;)V", "Companion", "component-ic-security_release"}, k = 1, mv = {2, 0, 0})
public final class SecurityDataManager extends DataManager {

    @NotNull
    public static final String ID = "component-ic-security-security-interceptor";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f28167p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Lazy f28168q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public List<String> f28169r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public HandlerConfig f28170s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public SecurityInterceptor f28171t0;
    public String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<List<SecurityType>> f28164u0 = new ActionSpec<>("otp-additional-security-operation");

    @NotNull
    public static final ActionSpec<Map<String, String>> v0 = new ActionSpec<>("otp-headers-security-operation");

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<String> f28165w0 = new ActionSpec<>("second-factor-additional-security-needed");

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Object> f28166x0 = new ActionSpec<>("wrong-params-additional-security");

    /* JADX INFO: compiled from: SecurityDataManager.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<SecurityVerification, Unit> {
        public a(Object obj) {
            super(1, obj, SecurityDataManager.class, "onSecurityNeeded", "onSecurityNeeded(Lcom/bbva/component/ic/security/utils/SecurityVerification;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SecurityVerification securityVerification) {
            SecurityVerification p4 = securityVerification;
            Intrinsics.checkNotNullParameter(p4, "p0");
            SecurityDataManager.access$onSecurityNeeded((SecurityDataManager) this.receiver, p4);
            return Unit.INSTANCE;
        }
    }

    public SecurityDataManager(@NotNull NetworkWorker worker) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        this.f28167p0 = worker;
        this.f28168q0 = LazyKt__LazyJVMKt.lazy(new b());
        newProperty("type", new d4.a(this, 2));
        newProperty("whitelist", new Consumer() { // from class: c5.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                this.f25370p0.setWhiteList((List) obj);
            }
        });
        newProperty("config", new e4.a(this, 1));
    }

    public static final void access$onSecurityNeeded(SecurityDataManager securityDataManager, SecurityVerification securityVerification) {
        securityDataManager.getClass();
        if (securityVerification instanceof SecurityVerification.HeaderSecurityTypes) {
            SecurityVerification.HeaderSecurityTypes headerSecurityTypes = (SecurityVerification.HeaderSecurityTypes) securityVerification;
            new Handler(Looper.getMainLooper()).post(new q(securityDataManager, bk.q.toMap(headerSecurityTypes.getHeaders()), 2));
            new Handler(Looper.getMainLooper()).post(new o(securityDataManager, headerSecurityTypes.getSecurityTypeList(), 2));
            return;
        }
        if (securityVerification instanceof SecurityVerification.SecondFactor) {
            new Handler(Looper.getMainLooper()).post(new j(securityDataManager, ((SecurityVerification.SecondFactor) securityVerification).getToken(), 3));
        } else {
            if (!(securityVerification instanceof SecurityVerification.WrongSecurityHeaders)) {
                throw new NoWhenBranchMatchedException();
            }
            new Handler(Looper.getMainLooper()).post(new q(securityDataManager, bk.q.emptyMap(), 2));
            new Handler(Looper.getMainLooper()).post(new r1(securityDataManager, 4));
        }
    }

    @NotNull
    public static final ActionSpec<List<SecurityType>> getOTP_ADDITIONAL_SECURITY_OPERATION() {
        return INSTANCE.getOTP_ADDITIONAL_SECURITY_OPERATION();
    }

    @NotNull
    public static final ActionSpec<Map<String, String>> getOTP_HEADERS_SECURITY_OPERATION() {
        return INSTANCE.getOTP_HEADERS_SECURITY_OPERATION();
    }

    @NotNull
    public static final ActionSpec<String> getSECOND_FACTOR_ADDITIONAL_SECURITY_NEEDED() {
        return INSTANCE.getSECOND_FACTOR_ADDITIONAL_SECURITY_NEEDED();
    }

    @NotNull
    public static final ActionSpec<Object> getWRONG_PARAMS_ADDITIONAL_SECURITY() {
        return INSTANCE.getWRONG_PARAMS_ADDITIONAL_SECURITY();
    }

    public final void a(Function0<Unit> function0) {
        function0.invoke();
        SecurityInterceptor securityInterceptor = this.f28171t0;
        if (securityInterceptor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("securityInterceptor");
            securityInterceptor = null;
        }
        securityInterceptor.unlock();
    }

    public final void cancelSecurityRequest() {
        a(new c(this, 0));
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getK0() {
        return ID;
    }

    @NotNull
    public final String getType$component_ic_security_release() {
        String str = this.type;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("type");
        return null;
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent
    public void onPropertiesBound() {
        super.onPropertiesBound();
        InterceptorsFactory interceptorsFactory = (InterceptorsFactory) this.f28168q0.getValue();
        String type$component_ic_security_release = getType$component_ic_security_release();
        List<String> listEmptyList = this.f28169r0;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        SecurityInterceptor securityInterceptorCreate = interceptorsFactory.create(type$component_ic_security_release, listEmptyList, this.f28170s0, new a(this));
        this.f28171t0 = securityInterceptorCreate;
        if (securityInterceptorCreate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("securityInterceptor");
            securityInterceptorCreate = null;
        }
        this.f28167p0.addInterceptor(securityInterceptorCreate);
    }

    public final void setAdditionalSecurityRequired(@NotNull final String securityType, @NotNull final String securityCode) {
        Intrinsics.checkNotNullParameter(securityType, "securityType");
        Intrinsics.checkNotNullParameter(securityCode, "securityCode");
        a(new Function0() { // from class: c5.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SecurityInterceptor securityInterceptor = this.f25363p0.f28171t0;
                if (securityInterceptor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("securityInterceptor");
                    securityInterceptor = null;
                }
                securityInterceptor.setSecurity(securityType, securityCode);
                return Unit.INSTANCE;
            }
        });
    }

    public final void setType$component_ic_security_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final void setUnauthorizedCode(@NotNull Map<String, ? extends Object> config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f28170s0 = new HandlerConfig(config);
    }

    public final void setWhiteList(@Nullable List<String> whiteList) {
        this.f28169r0 = whiteList;
    }

    public final void setAdditionalSecurityRequired(@NotNull final Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        a(new Function0() { // from class: c5.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SecurityInterceptor securityInterceptor = this.f25368p0.f28171t0;
                if (securityInterceptor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("securityInterceptor");
                    securityInterceptor = null;
                }
                securityInterceptor.setHeadersSecurity(headers);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: compiled from: SecurityDataManager.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R(\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\fR0\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u0010\u0010\fR\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0013\u0010\fR$\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/bbva/component/ic/security/SecurityDataManager$Companion;", "", "<init>", "()V", "ID", "", "OTP_ADDITIONAL_SECURITY_OPERATION", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "", "Lcom/bbva/component/ic/security/utils/SecurityType;", "getOTP_ADDITIONAL_SECURITY_OPERATION$annotations", "getOTP_ADDITIONAL_SECURITY_OPERATION", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "OTP_HEADERS_SECURITY_OPERATION", "", "getOTP_HEADERS_SECURITY_OPERATION$annotations", "getOTP_HEADERS_SECURITY_OPERATION", "SECOND_FACTOR_ADDITIONAL_SECURITY_NEEDED", "getSECOND_FACTOR_ADDITIONAL_SECURITY_NEEDED$annotations", "getSECOND_FACTOR_ADDITIONAL_SECURITY_NEEDED", "WRONG_PARAMS_ADDITIONAL_SECURITY", "getWRONG_PARAMS_ADDITIONAL_SECURITY$annotations", "getWRONG_PARAMS_ADDITIONAL_SECURITY", "component-ic-security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<List<SecurityType>> getOTP_ADDITIONAL_SECURITY_OPERATION() {
            return SecurityDataManager.f28164u0;
        }

        @NotNull
        public final ActionSpec<Map<String, String>> getOTP_HEADERS_SECURITY_OPERATION() {
            return SecurityDataManager.v0;
        }

        @NotNull
        public final ActionSpec<String> getSECOND_FACTOR_ADDITIONAL_SECURITY_NEEDED() {
            return SecurityDataManager.f28165w0;
        }

        @NotNull
        public final ActionSpec<Object> getWRONG_PARAMS_ADDITIONAL_SECURITY() {
            return SecurityDataManager.f28166x0;
        }

        @JvmStatic
        public static /* synthetic */ void getOTP_ADDITIONAL_SECURITY_OPERATION$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getOTP_HEADERS_SECURITY_OPERATION$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSECOND_FACTOR_ADDITIONAL_SECURITY_NEEDED$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getWRONG_PARAMS_ADDITIONAL_SECURITY$annotations() {
        }
    }
}
