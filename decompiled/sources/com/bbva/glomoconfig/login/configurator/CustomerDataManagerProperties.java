package com.bbva.glomoconfig.login.configurator;

import com.bbva.glomo.user.domain.model.UserType;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CustomerDataManagerProperties.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomoconfig/login/configurator/CustomerDataManagerProperties;", "", "config", "", "", "usertype", "Lcom/bbva/glomo/user/domain/model/UserType;", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CustomerDataManagerProperties {
    @NotNull
    Map<String, Object> config(@NotNull UserType usertype);
}
