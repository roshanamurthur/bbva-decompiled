package com.bbva.ethermobilesdk.devicemanager.di;

import com.bbva.ethermobilesdk.cipher.jwt.JwtSign;
import com.bbva.ethermobilesdk.devicemanager.data.cipher.repository.JwtSignRepository;
import com.bbva.ethermobilesdk.devicemanager.data.cipher.repository.JwtSignRepositoryImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CipherJwtSignModule.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/di/CipherJwtSignModule;", "", "Lcom/bbva/ethermobilesdk/devicemanager/data/cipher/repository/JwtSignRepository;", "provideCipherJwtSignRepository$devicemanager_release", "()Lcom/bbva/ethermobilesdk/devicemanager/data/cipher/repository/JwtSignRepository;", "provideCipherJwtSignRepository", "<init>", "()V", "devicemanager_release"}, k = 1, mv = {2, 0, 0})
public final class CipherJwtSignModule {
    @NotNull
    public final JwtSignRepository provideCipherJwtSignRepository$devicemanager_release() {
        return new JwtSignRepositoryImpl(new JwtSign());
    }
}
