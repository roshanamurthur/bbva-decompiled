package com.bbva.ethermobilesdk.tokencompat.model.legacy;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: STToken.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STToken;", "", "rc", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "getRc", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "value", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "getValue", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "isOk", "", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface STToken {

    /* JADX INFO: compiled from: STToken.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean isOk(@NotNull STToken sTToken) {
            return sTToken.getRc().isOk();
        }
    }

    @NotNull
    STReturnCode getRc();

    @Nullable
    TokenPub getValue();

    boolean isOk();
}
