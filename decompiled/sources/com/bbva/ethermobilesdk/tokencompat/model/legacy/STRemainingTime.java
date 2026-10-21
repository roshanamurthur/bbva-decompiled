package com.bbva.ethermobilesdk.tokencompat.model.legacy;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: STRemainingTime.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STRemainingTime;", "", "rc", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "getRc", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "remainingTime", "", "getRemainingTime", "()I", "isOk", "", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface STRemainingTime {

    /* JADX INFO: compiled from: STRemainingTime.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean isOk(@NotNull STRemainingTime sTRemainingTime) {
            return sTRemainingTime.getRc().isOk();
        }
    }

    @NotNull
    STReturnCode getRc();

    int getRemainingTime();

    boolean isOk();
}
