package com.bbva.glomoconfig.landing;

import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Landing.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bbva/glomoconfig/landing/Landing;", "", "()V", "ECommerce", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Landing {

    @NotNull
    public static final Landing INSTANCE = new Landing();

    /* JADX INFO: compiled from: Landing.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomoconfig/landing/Landing$ECommerce;", "", "()V", "LABEL_PARAMS_ID", "", "getLABEL_PARAMS_ID", "()Ljava/lang/String;", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ECommerce {

        @NotNull
        public static final ECommerce INSTANCE = new ECommerce();

        @NotNull
        public final String getLABEL_PARAMS_ID() {
            return ConfigConstantsKt.LANDING_LABEL_ECOMMERCE_CARD_PARAMS_ID;
        }
    }
}
