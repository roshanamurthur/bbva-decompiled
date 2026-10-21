package com.bbva.glomohybrid.login.domain.usecase;

import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.passchecker.model.api.input.Policy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PasswordQualityConfigurator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/usecase/PasswordQualityConfigurator;", "", Constants.policy, "Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Policy;", "getPolicy", "()Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Policy;", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PasswordQualityConfigurator {
    @NotNull
    Policy getPolicy();
}
