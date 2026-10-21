package com.bbva.glomoconfig.consumerid;

import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PersonalConsumerIdSelector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomoconfig/consumerid/PersonalConsumerIdSelector;", "Lcom/bbva/glomoconfig/consumerid/ConsumerIdSelector;", "()V", "getConsumerId", "", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class PersonalConsumerIdSelector implements ConsumerIdSelector {
    @Override // com.bbva.glomoconfig.consumerid.ConsumerIdSelector
    @NotNull
    public String getConsumerId() {
        return ConfigConstantsKt.GLOMO_CONSUMER_ID;
    }
}
