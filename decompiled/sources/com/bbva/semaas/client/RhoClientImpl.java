package com.bbva.semaas.client;

import android.content.Context;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.semaas.Cipher;
import com.bbva.semaas.RhoConfig;
import com.bbva.semaas.datasource.DataSource;
import com.bbva.semaas.model.Rho;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RhoClient.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, d2 = {"Lcom/bbva/semaas/client/RhoClientImpl;", "Lcom/bbva/semaas/client/Client;", "Lcom/bbva/semaas/model/Rho;", "Lcom/bbva/semaas/client/RhoClient;", "context", "Landroid/content/Context;", "config", "Lcom/bbva/semaas/RhoConfig;", "dataSource", "Lcom/bbva/semaas/datasource/DataSource;", "cipher", "Lcom/bbva/semaas/Cipher;", "(Landroid/content/Context;Lcom/bbva/semaas/RhoConfig;Lcom/bbva/semaas/datasource/DataSource;Lcom/bbva/semaas/Cipher;)V", LogKeysKt.TRACE, "", "event", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RhoClientImpl extends Client<Rho> implements RhoClient {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhoClientImpl(@NotNull Context context, @NotNull RhoConfig config, @NotNull DataSource<Rho> dataSource, @NotNull Cipher cipher) {
        super(context, config, dataSource, cipher, Rho.INSTANCE.serializer());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
    }

    @Override // com.bbva.semaas.client.RhoClient
    public void trace(@NotNull Rho event) {
        Intrinsics.checkNotNullParameter(event, "event");
        getRepository().add(event);
    }
}
