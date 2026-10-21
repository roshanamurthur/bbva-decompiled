package com.bbva.glomoconfig.login.configurator;

import bk.q;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.sharedstorage.ConstantsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.util.EglobalUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GlobalConfigurator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u0000 \f2\u00020\u0001:\u0001\fB#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/glomoconfig/login/configurator/GlobalConfigurator;", "Lcom/bbva/glomoconfig/login/configurator/Configurator;", "", "consumerId", "", "", "config", "host", "path", "anonymousConsumerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class GlobalConfigurator implements Configurator {

    @NotNull
    public static final String ID = "globalConfigurator";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f30948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f30949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f30950c;

    public GlobalConfigurator(@NotNull String host, @NotNull String path, @Nullable String str) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        this.f30948a = host;
        this.f30949b = path;
        this.f30950c = str;
    }

    @Override // com.bbva.glomoconfig.login.configurator.Configurator
    @NotNull
    public Map<String, Object> config(@NotNull String consumerId) {
        Intrinsics.checkNotNullParameter(consumerId, "consumerId");
        Pair[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.to("type", ConstantsKt.SCOPE_DEFAULT);
        Pair[] pairArr2 = new Pair[8];
        pairArr2[0] = TuplesKt.to("host", this.f30948a);
        pairArr2[1] = TuplesKt.to("path", this.f30949b);
        pairArr2[2] = TuplesKt.to("isBackendUserRequired", Boolean.TRUE);
        String str = this.f30950c;
        if (str == null) {
            str = "";
        }
        pairArr2[3] = TuplesKt.to("anonymousConsumerId", str);
        pairArr2[4] = TuplesKt.to("anonymousAuthenticationType", EglobalUtils.INITIALIZED_KEYS_WRONG_COMMAND);
        pairArr2[5] = TuplesKt.to(Constants.idAuthenticationData, "password");
        pairArr2[6] = TuplesKt.to(Constants.authenticationType, "02");
        pairArr2[7] = TuplesKt.to("consumerId", consumerId);
        pairArr[1] = TuplesKt.to("config", q.mapOf(pairArr2));
        return q.mapOf(pairArr);
    }

    public /* synthetic */ GlobalConfigurator(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3);
    }
}
