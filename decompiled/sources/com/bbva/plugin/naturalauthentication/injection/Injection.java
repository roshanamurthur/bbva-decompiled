package com.bbva.plugin.naturalauthentication.injection;

import android.app.Application;
import com.bbva.ethermobilesdk.naturalauthentication.NaturalAuthentication;
import com.bbva.nativesettings.common.Constants;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Injection.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/injection/Injection;", "", "initializeNaturalAuthentication", "", Constants.APPLICATION, "Landroid/app/Application;", "getNaturalAuthentication", "Lcom/bbva/ethermobilesdk/naturalauthentication/NaturalAuthentication;", "getFidoSession", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoSession;", com.bbva.component.dm.naturalauth.Constants.backendRequestUserId, "", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Injection {
    @NotNull
    FidoSession getFidoSession(@NotNull String userId);

    @Nullable
    NaturalAuthentication getNaturalAuthentication();

    void initializeNaturalAuthentication(@NotNull Application application);
}
