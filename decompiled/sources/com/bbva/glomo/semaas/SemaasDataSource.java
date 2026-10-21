package com.bbva.glomo.semaas;

import android.content.Context;
import bk.q;
import com.adobe.marketing.mobile.UserProfileKeyConstants;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.glomo.securesharing.SecureSharingConstantsKt;
import com.bbva.glomo.semaas.data.SemaasConfigProvider;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.semaas.OmegaConfig;
import com.bbva.semaas.RhoConfig;
import com.bbva.semaas.SEMaaS;
import com.bbva.semaas.SEMaaSConfig;
import com.bbva.semaas.TokenConfig;
import com.bbva.semaas.client.OmegaClient;
import com.bbva.semaas.client.RhoClient;
import com.bbva.semaas.model.Omega;
import com.bbva.semaas.model.Rho;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SemaasDataSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J<\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bJ<\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b¨\u0006\u0019"}, d2 = {"Lcom/bbva/glomo/semaas/SemaasDataSource;", "", "", "spanId", "", Constants.creationDate, "level", "message", "", LogKeysKt.PROPERTIES, "", "sendOmegaEvent", "name", LogKeysKt.START_DATE, "finishDate", "sendRhoEvent", "Landroid/content/Context;", "context", "Lcom/bbva/glomo/semaas/data/SemaasConfigProvider;", "config", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Landroid/content/Context;Lcom/bbva/glomo/semaas/data/SemaasConfigProvider;Lcom/bbva/glomo/storage/MainStorage;)V", "Companion", "glomo-semaas_release"}, k = 1, mv = {1, 9, 0})
public final class SemaasDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SemaasConfigProvider f30732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MainStorage f30733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f30734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SEMaaS f30735d;

    /* JADX INFO: compiled from: SemaasDataSource.kt */
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String string$default = MainStorage.getString$default(SemaasDataSource.this.f30733b, SecureSharingConstantsKt.KEY_CUSTOMER_BIOCATCH, null, true, TargetStorage.All, 2, null);
            return string$default == null ? "" : string$default;
        }
    }

    public SemaasDataSource(@NotNull Context context, @NotNull SemaasConfigProvider config, @NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f30732a = config;
        this.f30733b = storage;
        this.f30734c = LazyKt__LazyJVMKt.lazy(new a());
        this.f30735d = new SEMaaS(context, new SEMaaSConfig(new TokenConfig(config.getTokenConfigHost(), config.getConsumerId(), config.getValidationPolicy()), new RhoConfig(config.getRhoHost(), config.getNamespace(), config.getMrId(), 0, 0, 24, null), new OmegaConfig(config.getOmegaHost(), config.getNamespace(), config.getMrId(), 0, 0, 24, null)), config.getNetworkWorker(), config.getRefreshTokenProvider(), null, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendOmegaEvent$default(SemaasDataSource semaasDataSource, String str, long j10, String str2, String str3, Map map, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            map = new LinkedHashMap();
        }
        semaasDataSource.sendOmegaEvent(str, j10, str2, str3, map);
    }

    public final void sendOmegaEvent(@NotNull String spanId, long creationDate, @NotNull String level, @NotNull String message, @NotNull Map<String, String> properties) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(properties, "properties");
        OmegaClient omega = this.f30735d.getOmega();
        if (omega != null) {
            String mrId = this.f30732a.getMrId();
            String str = (String) this.f30734c.getValue();
            String string$default = MainStorage.getString$default(this.f30733b, "remembered_user_document", null, false, TargetStorage.Shared, 6, null);
            if (string$default == null) {
                string$default = "";
            }
            omega.log(new Omega(mrId, spanId, str, q.plus(properties, TuplesKt.to(UserProfileKeyConstants.USER_ID, string$default)), creationDate, level, message));
        }
    }

    public final void sendRhoEvent(@NotNull String spanId, @NotNull String name, long startDate, long finishDate, @NotNull Map<String, String> properties) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(properties, "properties");
        RhoClient rho = this.f30735d.getRho();
        if (rho != null) {
            String mrId = this.f30732a.getMrId();
            String str = (String) this.f30734c.getValue();
            String string$default = MainStorage.getString$default(this.f30733b, "remembered_user_document", null, false, TargetStorage.Shared, 6, null);
            if (string$default == null) {
                string$default = "";
            }
            rho.trace(new Rho(mrId, spanId, str, q.plus(properties, TuplesKt.to(UserProfileKeyConstants.USER_ID, string$default)), name, startDate, finishDate));
        }
    }
}
