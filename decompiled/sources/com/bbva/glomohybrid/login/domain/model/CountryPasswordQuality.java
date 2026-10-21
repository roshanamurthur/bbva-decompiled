package com.bbva.glomohybrid.login.domain.model;

import bk.d;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.passchecker.model.api.input.Allow;
import com.bbva.ethermobilesdk.passchecker.model.api.input.Limit;
import com.bbva.ethermobilesdk.passchecker.model.api.input.Policy;
import com.bbva.ethermobilesdk.passchecker.model.api.input.QualityMap;
import com.bbva.ethermobilesdk.passchecker.model.api.input.Require;
import com.bbva.glomohybrid.login.domain.usecase.PasswordQualityConfigurator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CountryPasswordQuality.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/model/CountryPasswordQuality;", "Lcom/bbva/glomohybrid/login/domain/usecase/PasswordQualityConfigurator;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Policy;", "a", "Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Policy;", "getPolicy", "()Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Policy;", Constants.policy, "<init>", "()V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class CountryPasswordQuality implements PasswordQualityConfigurator {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Policy policy = new Policy(new Allow(true, true, false, false, "ñÑ"), new Require(9, 0, 0, 0, 0, 0, 1, 1), new Limit(10, 3, 0, 0, 3, 3, 3), new QualityMap(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{3, 4}), d.listOf(2), d.listOf(1)));

    @Override // com.bbva.glomohybrid.login.domain.usecase.PasswordQualityConfigurator
    @NotNull
    public Policy getPolicy() {
        return this.policy;
    }
}
