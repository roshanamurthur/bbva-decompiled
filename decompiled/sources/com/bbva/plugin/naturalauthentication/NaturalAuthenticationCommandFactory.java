package com.bbva.plugin.naturalauthentication;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import j6.b;
import j6.c;
import j6.d;
import j6.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import z6.a;
import z6.i;
import z6.j;
import z6.k;
import z6.l;
import z6.m;
import z6.n;
import z6.o;
import z6.p;
import z6.q;
import z6.r;
import z6.s;
import z6.t;
import z6.u;

/* JADX INFO: compiled from: NaturalAuthenticationCommandFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/NaturalAuthenticationCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "<init>", "()V", "Companion", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NaturalAuthenticationCommandFactory extends CommandFactory {

    @NotNull
    public static final String ACTION_AUTHENTICATE = "authenticate";

    @NotNull
    public static final String ACTION_CREATE_AUTH_MESSAGE = "createauthmessage";

    @NotNull
    public static final String ACTION_DELETE = "delete";

    @NotNull
    public static final String ACTION_DISCOVER_BIOMETRIC_CAPABILITIES = "discoverbiometriccapabilities";

    @NotNull
    public static final String ACTION_DISCOVER_CAPABILITIES = "discovercapabilities";

    @NotNull
    public static final String ACTION_GET_DEVICE_ID = "getdeviceid";

    @NotNull
    public static final String ACTION_GET_FACETS_URL_ID = "getfacetsurl";

    @NotNull
    public static final String ACTION_HAS_SUITABLE_AUTHENTICATOR = "hassuitableauthenticator";

    @NotNull
    public static final String ACTION_INITIALIZE = "initialize";

    @NotNull
    public static final String ACTION_LIST_AUTHENTICATORS = "list";

    @NotNull
    public static final String ACTION_OOB_AUTHENTICATE = "oobauthenticate";

    @NotNull
    public static final String ACTION_OOB_REGISTER = "oobregister";

    @NotNull
    public static final String ACTION_PROCESS_AUTH_MESSAGE = "processauthmessage";

    @NotNull
    public static final String ACTION_QUICK_AUTH_DATA = "quickauthdata";

    @NotNull
    public static final String ACTION_REGISTER = "register";

    @NotNull
    public static final String ACTION_SET_EXTERNAL_DEVICE_ID = "setexternaldeviceId";

    @NotNull
    public static final String ACTION_SET_FACETS_URL = "setfacetsurl";

    @NotNull
    public static final String ACTION_SET_QUICK_AUTH_ENABLED = "setquickauthenabled";

    @NotNull
    public static final String ACTION_SIGN_TRANSACTION = "signtransaction";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: NaturalAuthenticationCommandFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/NaturalAuthenticationCommandFactory$Companion;", "", "<init>", "()V", "ACTION_INITIALIZE", "", "ACTION_REGISTER", "ACTION_OOB_REGISTER", "ACTION_DELETE", "ACTION_SIGN_TRANSACTION", "ACTION_LIST_AUTHENTICATORS", "ACTION_AUTHENTICATE", "ACTION_OOB_AUTHENTICATE", "ACTION_GET_DEVICE_ID", "ACTION_CREATE_AUTH_MESSAGE", "ACTION_PROCESS_AUTH_MESSAGE", "ACTION_SET_FACETS_URL", "ACTION_DISCOVER_CAPABILITIES", "ACTION_DISCOVER_BIOMETRIC_CAPABILITIES", "ACTION_HAS_SUITABLE_AUTHENTICATOR", "ACTION_SET_QUICK_AUTH_ENABLED", "ACTION_QUICK_AUTH_DATA", "ACTION_SET_EXTERNAL_DEVICE_ID", "ACTION_GET_FACETS_URL_ID", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public NaturalAuthenticationCommandFactory() {
        int i10 = 3;
        addCommandProvider("initialize", new i(3));
        addCommandProvider("register", new a(5));
        addCommandProvider(ACTION_OOB_REGISTER, new l(5));
        addCommandProvider("delete", new o(6));
        addCommandProvider(ACTION_SIGN_TRANSACTION, new p(5));
        addCommandProvider(ACTION_LIST_AUTHENTICATORS, new q(4));
        addCommandProvider(ACTION_AUTHENTICATE, new r(4));
        addCommandProvider(ACTION_OOB_AUTHENTICATE, new s(5));
        addCommandProvider("getdeviceid", new t(4));
        addCommandProvider(ACTION_CREATE_AUTH_MESSAGE, new u(4));
        addCommandProvider(ACTION_PROCESS_AUTH_MESSAGE, new j6.a(i10));
        addCommandProvider(ACTION_SET_FACETS_URL, new b(4));
        addCommandProvider(ACTION_DISCOVER_CAPABILITIES, new c(i10));
        addCommandProvider(ACTION_DISCOVER_BIOMETRIC_CAPABILITIES, new d(i10));
        addCommandProvider(ACTION_HAS_SUITABLE_AUTHENTICATOR, new e(i10));
        int i11 = 2;
        addCommandProvider(ACTION_SET_QUICK_AUTH_ENABLED, new j(i11));
        addCommandProvider(ACTION_QUICK_AUTH_DATA, new k(i11));
        addCommandProvider(ACTION_SET_EXTERNAL_DEVICE_ID, new m(2));
        addCommandProvider(ACTION_GET_FACETS_URL_ID, new n(4));
    }
}
