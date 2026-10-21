package com.bbva.plugin.naturalauthentication.injection;

import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.naturalauthentication.NaturalAuthentication;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/injection/Injector;", "", "<init>", "()V", "naturalAuthentication", "Lcom/bbva/ethermobilesdk/naturalauthentication/NaturalAuthentication;", "getNaturalAuthentication", "()Lcom/bbva/ethermobilesdk/naturalauthentication/NaturalAuthentication;", "setNaturalAuthentication", "(Lcom/bbva/ethermobilesdk/naturalauthentication/NaturalAuthentication;)V", Constants.policy, "", "getPolicy", "()Ljava/lang/String;", "setPolicy", "(Ljava/lang/String;)V", "initialize", "", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Injector {

    @NotNull
    public static final Injector INSTANCE = new Injector();
    public static NaturalAuthentication naturalAuthentication;
    public static String policy;

    @NotNull
    public final NaturalAuthentication getNaturalAuthentication() {
        NaturalAuthentication naturalAuthentication2 = naturalAuthentication;
        if (naturalAuthentication2 != null) {
            return naturalAuthentication2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("naturalAuthentication");
        return null;
    }

    @NotNull
    public final String getPolicy() {
        String str = policy;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Constants.policy);
        return null;
    }

    public final void initialize(@NotNull NaturalAuthentication naturalAuthentication2, @NotNull String policy2) {
        Intrinsics.checkNotNullParameter(naturalAuthentication2, "naturalAuthentication");
        Intrinsics.checkNotNullParameter(policy2, "policy");
        setNaturalAuthentication(naturalAuthentication2);
        setPolicy(policy2);
    }

    public final void setNaturalAuthentication(@NotNull NaturalAuthentication naturalAuthentication2) {
        Intrinsics.checkNotNullParameter(naturalAuthentication2, "<set-?>");
        naturalAuthentication = naturalAuthentication2;
    }

    public final void setPolicy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        policy = str;
    }
}
