package com.bbva.glomohybrid.base.session;

import com.bbva.component.dm.customer.domain.model.Customer;
import com.bbva.component.dm.headers.interceptor.AccessToken;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Session.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/bbva/glomohybrid/base/session/Session;", "", "initialize", "Lcom/bbva/component/dm/customer/domain/model/Customer;", "getCustomer", "newUser", "", "setCustomer", "setCustomerIndicatorsLogins", HearingDisabilitiesConstants.CLOSE_MODAL, "", "hasSessionOpened", "comeFromSplash", "setComeFromSplash", "Lcom/bbva/component/dm/headers/interceptor/AccessToken;", "accessToken", "addAccessToken", "", "getAccessTokens", "()Ljava/util/List;", "accessTokens", "<init>", "()V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class Session {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Customer f31500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Object f31501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f31504e = new LinkedHashMap();

    public final void addAccessToken(@NotNull AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        LinkedHashMap linkedHashMap = this.f31504e;
        String id = accessToken.getId();
        if (id == null) {
            id = "GLOMO";
        }
        linkedHashMap.put(id, accessToken);
    }

    public final void close() {
        this.f31502c = false;
        this.f31500a = null;
        this.f31504e.clear();
    }

    /* JADX INFO: renamed from: comeFromSplash, reason: from getter */
    public final boolean getF31503d() {
        return this.f31503d;
    }

    @NotNull
    public final List<AccessToken> getAccessTokens() {
        return CollectionsKt___CollectionsKt.toList(this.f31504e.values());
    }

    @NotNull
    public final Customer getCustomer() throws SessionClosedException {
        if (!this.f31502c) {
            throw new SessionClosedException();
        }
        Customer customer = this.f31500a;
        if (customer != null) {
            return customer;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX INFO: renamed from: hasSessionOpened, reason: from getter */
    public final boolean getF31502c() {
        return this.f31502c;
    }

    @NotNull
    public final Session initialize() {
        this.f31502c = true;
        return this;
    }

    public final void setComeFromSplash(boolean comeFromSplash) {
        this.f31503d = comeFromSplash;
    }

    public final void setCustomer(@NotNull Customer newUser) {
        Intrinsics.checkNotNullParameter(newUser, "newUser");
        if (!this.f31502c) {
            throw new SessionClosedException();
        }
        this.f31500a = newUser;
    }

    public final void setCustomerIndicatorsLogins(@NotNull Object newUser) throws SessionClosedException {
        Intrinsics.checkNotNullParameter(newUser, "newUser");
        if (!this.f31502c) {
            throw new SessionClosedException();
        }
        this.f31501b = newUser;
    }
}
