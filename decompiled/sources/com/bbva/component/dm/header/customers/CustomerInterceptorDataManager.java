package com.bbva.component.dm.header.customers;

import com.bbva.cells.component.kit.datamanager.DataManager;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.reactor.e;
import com.bbva.network.NetworkWorker;
import io.reactivex.functions.Consumer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u4.b;

/* JADX INFO: compiled from: CustomerInterceptorDataManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0014R\"\u0010\u0006\u001a\u00020\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/bbva/component/dm/header/customers/CustomerInterceptorDataManager;", "Lcom/bbva/cells/component/kit/datamanager/DataManager;", "", "getId", "", "onPropertiesBound", "authHeaderName", "Ljava/lang/String;", "getAuthHeaderName$component_dm_header_customers_release", "()Ljava/lang/String;", "setAuthHeaderName$component_dm_header_customers_release", "(Ljava/lang/String;)V", "", "whiteList", "Ljava/util/List;", "getWhiteList$component_dm_header_customers_release", "()Ljava/util/List;", "setWhiteList$component_dm_header_customers_release", "(Ljava/util/List;)V", "cleanList", "getCleanList$component_dm_header_customers_release", "setCleanList$component_dm_header_customers_release", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "<init>", "(Lcom/bbva/network/NetworkWorker;)V", "Companion", "component-dm-header-customers_release"}, k = 1, mv = {1, 9, 0})
public final class CustomerInterceptorDataManager extends DataManager {

    @NotNull
    public static final String ID = "component-dm-customers-interceptor";
    public String authHeaderName;
    public List<String> cleanList;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f27649p0;
    public List<String> whiteList;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<String> f27648q0 = new ActionSpec<>("access-token-change");

    /* JADX INFO: compiled from: CustomerInterceptorDataManager.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bbva/component/dm/header/customers/CustomerInterceptorDataManager$Companion;", "", "()V", "ACCESS_TOKEN_CHANGE", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "", "getACCESS_TOKEN_CHANGE", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "ID", "component-dm-header-customers_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<String> getACCESS_TOKEN_CHANGE() {
            return CustomerInterceptorDataManager.f27648q0;
        }
    }

    /* JADX INFO: compiled from: CustomerInterceptorDataManager.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<String, Unit> {
        public a(Object obj) {
            super(1, obj, CustomerInterceptorDataManager.class, "sendTsecCustomer", "sendTsecCustomer(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String p4 = str;
            Intrinsics.checkNotNullParameter(p4, "p0");
            CustomerInterceptorDataManager.access$sendTsecCustomer((CustomerInterceptorDataManager) this.receiver, p4);
            return Unit.INSTANCE;
        }
    }

    public CustomerInterceptorDataManager(@NotNull NetworkWorker networkWorker) {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        this.f27649p0 = networkWorker;
        newProperty("authHeaderName", new b(this, 1));
        newProperty("whiteList", new Consumer() { // from class: z4.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                this.f94976p0.whiteList = (List) obj;
            }
        });
        newProperty("cleanList", new e(this, 1));
    }

    public static final void access$sendTsecCustomer(CustomerInterceptorDataManager customerInterceptorDataManager, String str) {
        customerInterceptorDataManager.fire(f27648q0, str);
    }

    @NotNull
    public final String getAuthHeaderName$component_dm_header_customers_release() {
        String str = this.authHeaderName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authHeaderName");
        return null;
    }

    @NotNull
    public final List<String> getCleanList$component_dm_header_customers_release() {
        List<String> list = this.cleanList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cleanList");
        return null;
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getE0() {
        return ID;
    }

    @NotNull
    public final List<String> getWhiteList$component_dm_header_customers_release() {
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
        this.f27649p0.addInterceptor(new CustomerInterceptor(new CustomerInterceptorConfig(getAuthHeaderName$component_dm_header_customers_release(), getWhiteList$component_dm_header_customers_release(), getCleanList$component_dm_header_customers_release()), new a(this)));
    }

    public final void setAuthHeaderName$component_dm_header_customers_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.authHeaderName = str;
    }

    public final void setCleanList$component_dm_header_customers_release(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.cleanList = list;
    }

    public final void setWhiteList$component_dm_header_customers_release(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.whiteList = list;
    }
}
