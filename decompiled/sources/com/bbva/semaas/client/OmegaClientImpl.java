package com.bbva.semaas.client;

import android.content.Context;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.semaas.Cipher;
import com.bbva.semaas.OmegaConfig;
import com.bbva.semaas.datasource.DataSource;
import com.bbva.semaas.model.Omega;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OmegaClient.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, d2 = {"Lcom/bbva/semaas/client/OmegaClientImpl;", "Lcom/bbva/semaas/client/Client;", "Lcom/bbva/semaas/model/Omega;", "Lcom/bbva/semaas/client/OmegaClient;", "context", "Landroid/content/Context;", "config", "Lcom/bbva/semaas/OmegaConfig;", "dataSource", "Lcom/bbva/semaas/datasource/DataSource;", "cipher", "Lcom/bbva/semaas/Cipher;", "(Landroid/content/Context;Lcom/bbva/semaas/OmegaConfig;Lcom/bbva/semaas/datasource/DataSource;Lcom/bbva/semaas/Cipher;)V", LogKeysKt.LOG, "", "event", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OmegaClientImpl extends Client<Omega> implements OmegaClient {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OmegaClientImpl(@NotNull Context context, @NotNull OmegaConfig config, @NotNull DataSource<Omega> dataSource, @NotNull Cipher cipher) {
        super(context, config, dataSource, cipher, Omega.INSTANCE.serializer());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
    }

    @Override // com.bbva.semaas.client.OmegaClient
    public void log(@NotNull Omega event) {
        Intrinsics.checkNotNullParameter(event, "event");
        getRepository().add(event);
    }
}
