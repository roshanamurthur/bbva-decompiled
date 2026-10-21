package com.bbva.ethermobilesdk.devicemanager.data.cipher.repository;

import com.bbva.ethermobilesdk.cipher.jwt.JwtSign;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JwtSignRepositoryImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/data/cipher/repository/JwtSignRepositoryImpl;", "Lcom/bbva/ethermobilesdk/devicemanager/data/cipher/repository/JwtSignRepository;", "Lcom/bbva/ethermobilesdk/cipher/jwt/JwtSign;", "jwtSign", "<init>", "(Lcom/bbva/ethermobilesdk/cipher/jwt/JwtSign;)V", "devicemanager_release"}, k = 1, mv = {2, 0, 0})
public final class JwtSignRepositoryImpl implements JwtSignRepository {
    public JwtSignRepositoryImpl(@NotNull JwtSign jwtSign) {
        Intrinsics.checkNotNullParameter(jwtSign, "jwtSign");
    }
}
