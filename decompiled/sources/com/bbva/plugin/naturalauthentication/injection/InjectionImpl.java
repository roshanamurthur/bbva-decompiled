package com.bbva.plugin.naturalauthentication.injection;

import android.app.Application;
import com.bbva.ethermobilesdk.naturalauthentication.NaturalAuthentication;
import com.bbva.ethermobilesdk.naturalauthentication.NaturalAuthenticationConfig;
import com.bbva.nativesettings.common.Constants;
import com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InjectionImpl.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0014"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/injection/InjectionImpl;", "Lcom/bbva/plugin/naturalauthentication/injection/Injection;", "Landroid/app/Application;", Constants.APPLICATION, "", "initializeNaturalAuthentication", "Lcom/bbva/ethermobilesdk/naturalauthentication/NaturalAuthentication;", "getNaturalAuthentication", "", com.bbva.component.dm.naturalauth.Constants.backendRequestUserId, "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoSession;", "getFidoSession", com.bbva.component.dm.naturalauth.Constants.policy, "Lcom/bbva/sl/ar/android/secsdk/fido/FidoNetworkManager;", "networkManager", "tenant", "", "selectionTimeout", "<init>", "(Ljava/lang/String;Lcom/bbva/sl/ar/android/secsdk/fido/FidoNetworkManager;Ljava/lang/String;I)V", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0})
public final class InjectionImpl implements Injection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f35884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FidoNetworkManager f35885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f35886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public NaturalAuthentication f35888e;

    public InjectionImpl(@NotNull String policy, @NotNull FidoNetworkManager networkManager, @NotNull String tenant, int i10) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(networkManager, "networkManager");
        Intrinsics.checkNotNullParameter(tenant, "tenant");
        this.f35884a = policy;
        this.f35885b = networkManager;
        this.f35886c = tenant;
        this.f35887d = i10;
    }

    @Override // com.bbva.plugin.naturalauthentication.injection.Injection
    @NotNull
    public FidoSession getFidoSession(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new FidoSession(userId, this.f35884a);
    }

    @Override // com.bbva.plugin.naturalauthentication.injection.Injection
    @Nullable
    /* JADX INFO: renamed from: getNaturalAuthentication, reason: from getter */
    public NaturalAuthentication getF35888e() {
        return this.f35888e;
    }

    @Override // com.bbva.plugin.naturalauthentication.injection.Injection
    public void initializeNaturalAuthentication(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f35888e = new NaturalAuthentication(new NaturalAuthenticationConfig(this.f35885b, this.f35886c, Integer.valueOf(this.f35887d)));
    }
}
