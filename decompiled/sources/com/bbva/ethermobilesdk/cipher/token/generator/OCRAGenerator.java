package com.bbva.ethermobilesdk.cipher.token.generator;

import com.bbva.ethermobilesdk.cipher.model.CipherResult;
import com.bbva.ethermobilesdk.cipher.token.generator.impl.OCRAGeneratorImpl;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OCRAGenerator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/token/generator/OCRAGenerator;", "", "()V", "getOcra", "Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;", "", ClientData.KEY_CHALLENGE, "seed", "", "timeIncrement", "", "timeDrift", "ocraSuite", "currentTimeInMillis", "", "cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OCRAGenerator {

    @NotNull
    public static final OCRAGenerator INSTANCE = new OCRAGenerator();

    @NotNull
    public final CipherResult<String> getOcra(@NotNull String challenge, @NotNull byte[] seed, int timeIncrement, int timeDrift, @NotNull String ocraSuite, long currentTimeInMillis) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        Intrinsics.checkNotNullParameter(seed, "seed");
        Intrinsics.checkNotNullParameter(ocraSuite, "ocraSuite");
        try {
            return new CipherResult.Success(new OCRAGeneratorImpl().getOcra(challenge, seed, timeIncrement, timeDrift, ocraSuite, currentTimeInMillis));
        } catch (Exception e5) {
            return new CipherResult.Error(e5);
        }
    }
}
