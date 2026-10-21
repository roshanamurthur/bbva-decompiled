package com.bbva.ethermobilesdk.naturalauthentication;

import android.app.Activity;
import android.content.Context;
import bk.d;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.sl.ar.android.secsdk.fido.FidoSdk;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl;
import com.bbva.sl.ar.android.secsdk.fido.model.Accepted;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import com.bbva.sl.ar.android.secsdk.fido.model.Policy;
import com.google.gson.Gson;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NaturalAuthentication.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J \u0010\u001a\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0019J*\u0010\u001d\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u000fJ2\u0010 \u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u001f2\b\b\u0002\u0010\u001c\u001a\u00020\u000fJ\u001e\u0010\"\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020!J \u0010$\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020#J&\u0010(\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0%2\u0006\u0010\u0005\u001a\u00020'J*\u0010*\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020)2\b\b\u0002\u0010\u001c\u001a\u00020\u000fJ2\u0010,\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020+2\b\b\u0002\u0010\u001c\u001a\u00020\u000fJ.\u00100\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020/J\u000e\u00102\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u000201J.\u00106\u001a\u00020\u00062\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u000205J&\u00107\u001a\u00020\u00062\u0006\u00103\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u000205J\u001e\u00108\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u000205J\u001e\u00109\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u000205J&\u0010:\u001a\u00020\u00062\u0006\u00104\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u000205J\u0016\u0010<\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020;J\u001e\u0010>\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020;J\u0016\u0010@\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020?J\u0016\u0010B\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020AJ\u0016\u0010D\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020C¨\u0006I"}, d2 = {"Lcom/bbva/ethermobilesdk/naturalauthentication/NaturalAuthentication;", "", "Landroid/content/Context;", "context", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoInitializeCallback;", "callback", "", "initialize", "", "getDeviceId", "getFacetsUrl", "externalDeviceId", "setExternalDeviceId", "facetsUrl", "setFacetsUrl", "", "quickAuthState", "setQuickAuthEnabled", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoUISelectionListener;", "uiSelectionListener", "setSelectionUIListener", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoSession;", "session", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoCheckRegisterCallback;", "checkRegistrationPossible", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoRegisterCallback;", "confirmationRequired", "registerAuthenticator", "oobData", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoOobRegisterCallback;", "oobRegisterAuthenticator", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoListingCallback;", "listAuthenticators", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoCheckAuthenticateCallback;", "checkAuthenticationPossible", "", "aaids", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoCheckLocalAuthCallback;", "hasSuitableAuthenticator", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoAuthenticateCallback;", NaturalAuthenticationCommandFactory.ACTION_AUTHENTICATE, "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoOobAuthenticateCallback;", "oobAuthenticate", "transactionId", "transactionDescription", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoSignCallback;", "signTransaction", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoUITransactionListener;", "setTransactionUIListener", "authenticatorHandle", "deviceId", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoDeleteCallback;", "deleteAuthenticator", "deleteAuthenticatorLocally", "deleteAllAuthenticators", "deleteAllAuthenticatorsLocally", "deleteAllAuthenticatorsFromDevice", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoOperationListener;", "createAuthMessage", "message", "processAuthMessage", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoDiscoverBiometricCapabilitiesCallback;", "discoverBiometricCapabilities", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoDiscoverCapabilitiesCallback;", "discoverCapabilities", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoQuickAuthDataCallback;", IAppSDKPlus.EXTRA_KEY_QUICK_DATA, "Lcom/bbva/ethermobilesdk/naturalauthentication/NaturalAuthenticationConfig;", "naturalAuthenticationConfig", "<init>", "(Lcom/bbva/ethermobilesdk/naturalauthentication/NaturalAuthenticationConfig;)V", "naturalauthentication_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nNaturalAuthentication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NaturalAuthentication.kt\ncom/bbva/ethermobilesdk/naturalauthentication/NaturalAuthentication\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,467:1\n1557#2:468\n1628#2,3:469\n*S KotlinDebug\n*F\n+ 1 NaturalAuthentication.kt\ncom/bbva/ethermobilesdk/naturalauthentication/NaturalAuthentication\n*L\n201#1:468\n201#1:469,3\n*E\n"})
public final class NaturalAuthentication {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NaturalAuthenticationConfig f29879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public FidoSdkImpl f29880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public FidoException f29881c;

    public NaturalAuthentication(@NotNull NaturalAuthenticationConfig naturalAuthenticationConfig) {
        Intrinsics.checkNotNullParameter(naturalAuthenticationConfig, "naturalAuthenticationConfig");
        this.f29879a = naturalAuthenticationConfig;
    }

    public static /* synthetic */ void authenticate$default(NaturalAuthentication naturalAuthentication, Activity activity, FidoSession fidoSession, FidoSdk.FidoAuthenticateCallback fidoAuthenticateCallback, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        naturalAuthentication.authenticate(activity, fidoSession, fidoAuthenticateCallback, z10);
    }

    public static /* synthetic */ void oobAuthenticate$default(NaturalAuthentication naturalAuthentication, Activity activity, FidoSession fidoSession, String str, FidoSdk.FidoOobAuthenticateCallback fidoOobAuthenticateCallback, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        naturalAuthentication.oobAuthenticate(activity, fidoSession, str, fidoOobAuthenticateCallback, z10);
    }

    public static /* synthetic */ void oobRegisterAuthenticator$default(NaturalAuthentication naturalAuthentication, Activity activity, FidoSession fidoSession, String str, FidoSdk.FidoOobRegisterCallback fidoOobRegisterCallback, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        naturalAuthentication.oobRegisterAuthenticator(activity, fidoSession, str, fidoOobRegisterCallback, z10);
    }

    public static /* synthetic */ void registerAuthenticator$default(NaturalAuthentication naturalAuthentication, Activity activity, FidoSession fidoSession, FidoSdk.FidoRegisterCallback fidoRegisterCallback, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        naturalAuthentication.registerAuthenticator(activity, fidoSession, fidoRegisterCallback, z10);
    }

    public final void authenticate(@Nullable Activity activity, @NotNull FidoSession session, @NotNull FidoSdk.FidoAuthenticateCallback callback, boolean confirmationRequired) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FidoException fidoException = this.f29881c;
        if (fidoException != null) {
            callback.authenticateFailed(session, fidoException);
            return;
        }
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.authenticate(activity, session, callback, confirmationRequired);
        }
    }

    public final void checkAuthenticationPossible(@Nullable Activity activity, @NotNull FidoSession session, @NotNull FidoSdk.FidoCheckAuthenticateCallback callback) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FidoException fidoException = this.f29881c;
        if (fidoException != null) {
            callback.checkFailed(session, fidoException);
            return;
        }
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.checkAuthenticationPossible(activity, session, callback);
        }
    }

    public final void checkRegistrationPossible(@Nullable Activity activity, @NotNull FidoSession session, @NotNull FidoSdk.FidoCheckRegisterCallback callback) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FidoException fidoException = this.f29881c;
        if (fidoException != null) {
            callback.checkFailed(session, fidoException);
            return;
        }
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.checkRegistrationPossible(activity, session, callback);
        }
    }

    public final void createAuthMessage(@NotNull Activity activity, @NotNull FidoSdk.FidoOperationListener callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FidoException fidoException = this.f29881c;
        if (fidoException != null) {
            callback.failure(fidoException);
            return;
        }
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.createAuthMessage(activity, callback);
        }
    }

    public final void deleteAllAuthenticators(@NotNull Activity activity, @NotNull FidoSession session, @NotNull FidoSdk.FidoDeleteCallback callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FidoException fidoException = this.f29881c;
        if (fidoException != null) {
            callback.deleteAllFailed(session, fidoException);
            return;
        }
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.deleteAllAuthenticators(activity, session, callback);
        }
    }

    public final void deleteAllAuthenticatorsFromDevice(@NotNull String deviceId, @NotNull Activity activity, @NotNull FidoSession session, @NotNull FidoSdk.FidoDeleteCallback callback) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FidoException fidoException = this.f29881c;
        if (fidoException != null) {
            callback.deleteAllFailed(session, fidoException);
            return;
        }
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.deleteAllAuthenticatorsFromDevice(deviceId, activity, session, callback);
        }
    }

    public final void deleteAllAuthenticatorsLocally(@NotNull Activity activity, @NotNull FidoSession session, @NotNull FidoSdk.FidoDeleteCallback callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FidoException fidoException = this.f29881c;
        if (fidoException != null) {
            callback.deleteAllFailed(session, fidoException);
            return;
        }
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.deleteAllAuthenticatorsLocally(activity, session, callback);
        }
    }

    public final void deleteAuthenticator(@NotNull String authenticatorHandle, @NotNull String deviceId, @NotNull Activity activity, @NotNull FidoSession session, @NotNull FidoSdk.FidoDeleteCallback callback) {
        Intrinsics.checkNotNullParameter(authenticatorHandle, "authenticatorHandle");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FidoException fidoException = this.f29881c;
        if (fidoException != null) {
            callback.deleteOneFailed(session, fidoException, authenticatorHandle);
            return;
        }
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.deleteAuthenticator(authenticatorHandle, deviceId, activity, session, callback);
        }
    }

    public final void deleteAuthenticatorLocally(@NotNull String authenticatorHandle, @NotNull Activity activity, @NotNull FidoSession session, @NotNull FidoSdk.FidoDeleteCallback callback) {
        Intrinsics.checkNotNullParameter(authenticatorHandle, "authenticatorHandle");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FidoException fidoException = this.f29881c;
        if (fidoException != null) {
            callback.deleteOneFailed(session, fidoException, authenticatorHandle);
            return;
        }
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.deleteAuthenticatorLocally(authenticatorHandle, activity, session, callback);
        }
    }

    public final void discoverBiometricCapabilities(@NotNull Activity activity, @NotNull FidoSdk.FidoDiscoverBiometricCapabilitiesCallback callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FidoException fidoException = this.f29881c;
        if (fidoException != null) {
            callback.failure(fidoException);
            return;
        }
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.discoverBiometricCapabilities(activity, callback);
        }
    }

    public final void discoverCapabilities(@NotNull Activity activity, @NotNull FidoSdk.FidoDiscoverCapabilitiesCallback callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FidoException fidoException = this.f29881c;
        if (fidoException != null) {
            callback.failure(fidoException);
            return;
        }
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.discoverCapabilities(activity, callback);
        }
    }

    @Nullable
    public final String getDeviceId() {
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            return fidoSdkImpl.getDeviceId();
        }
        return null;
    }

    @Nullable
    public final String getFacetsUrl() {
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            return fidoSdkImpl.getFacetsUrl();
        }
        return null;
    }

    public final void hasSuitableAuthenticator(@Nullable Activity activity, @NotNull List<String> aaids, @NotNull FidoSdk.FidoCheckLocalAuthCallback callback) {
        Intrinsics.checkNotNullParameter(aaids, "aaids");
        Intrinsics.checkNotNullParameter(callback, "callback");
        List<String> list = aaids;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Accepted(CollectionsKt__CollectionsKt.arrayListOf((String) it.next())));
        }
        String json = new Gson().toJson(new Policy(d.listOf(arrayList)));
        if (this.f29881c != null) {
            callback.checkCompleted(false);
            return;
        }
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            String facetsUrl = fidoSdkImpl.getFacetsUrl();
            if (facetsUrl != null) {
                fidoSdkImpl.checkLocalAuthPossible(activity, facetsUrl, json, callback);
                return;
            }
            String facetId = fidoSdkImpl.getFacetId();
            if (facetId != null) {
                fidoSdkImpl.checkLocalAuthPossible(activity, facetId, json, callback);
            } else {
                callback.checkCompleted(false);
            }
        }
    }

    public final void initialize(@NotNull Context context, @NotNull FidoSdk.FidoInitializeCallback callback) {
        NaturalAuthenticationConfig naturalAuthenticationConfig = this.f29879a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            FidoSdkImpl fidoSdkImpl = new FidoSdkImpl(context, naturalAuthenticationConfig.getNetworkManager(), naturalAuthenticationConfig.getTenant(), naturalAuthenticationConfig.getSelectionTimeout());
            this.f29880b = fidoSdkImpl;
            fidoSdkImpl.initialize(callback);
        } catch (FidoException e5) {
            this.f29881c = e5;
            callback.initFailed(e5);
        }
    }

    public final void listAuthenticators(@NotNull Activity activity, @NotNull FidoSession session, @NotNull FidoSdk.FidoListingCallback callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FidoException fidoException = this.f29881c;
        if (fidoException != null) {
            callback.listingFailed(session, fidoException);
            return;
        }
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.listAuthenticators(activity, session, callback);
        }
    }

    public final void oobAuthenticate(@Nullable Activity activity, @NotNull FidoSession session, @NotNull String oobData, @NotNull FidoSdk.FidoOobAuthenticateCallback callback, boolean confirmationRequired) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(oobData, "oobData");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FidoException fidoException = this.f29881c;
        if (fidoException != null) {
            callback.authenticateFailed(session, fidoException);
            return;
        }
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.oobAuthenticate(activity, session, oobData, callback, confirmationRequired);
        }
    }

    public final void oobRegisterAuthenticator(@Nullable Activity activity, @NotNull FidoSession session, @NotNull String oobData, @NotNull FidoSdk.FidoOobRegisterCallback callback, boolean confirmationRequired) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(oobData, "oobData");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FidoException fidoException = this.f29881c;
        if (fidoException != null) {
            callback.registerFailed(session, fidoException);
            return;
        }
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.oobRegisterAuthenticator(activity, session, oobData, callback, confirmationRequired);
        }
    }

    public final void processAuthMessage(@NotNull Activity activity, @NotNull String message, @NotNull FidoSdk.FidoOperationListener callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FidoException fidoException = this.f29881c;
        if (fidoException != null) {
            callback.failure(fidoException);
            return;
        }
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.processAuthMessage(activity, message, callback);
        }
    }

    public final void quickAuthData(@NotNull FidoSession session, @NotNull FidoSdk.FidoQuickAuthDataCallback callback) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FidoException fidoException = this.f29881c;
        if (fidoException != null) {
            callback.failure(fidoException);
            return;
        }
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.quickAuthData(session, callback);
        }
    }

    public final void registerAuthenticator(@Nullable Activity activity, @NotNull FidoSession session, @NotNull FidoSdk.FidoRegisterCallback callback, boolean confirmationRequired) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FidoException fidoException = this.f29881c;
        if (fidoException != null) {
            callback.registerFailed(session, fidoException);
            return;
        }
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.registerAuthenticator(activity, session, callback, confirmationRequired);
        }
    }

    public final void setExternalDeviceId(@NotNull String externalDeviceId) {
        Intrinsics.checkNotNullParameter(externalDeviceId, "externalDeviceId");
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.setExternalDeviceId(externalDeviceId);
        }
    }

    public final void setFacetsUrl(@NotNull String facetsUrl) {
        Intrinsics.checkNotNullParameter(facetsUrl, "facetsUrl");
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.setFacetsUrl(facetsUrl);
        }
    }

    public final void setQuickAuthEnabled(boolean quickAuthState) {
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.setQuickAuthEnabled(quickAuthState);
        }
    }

    public final void setSelectionUIListener(@NotNull FidoSdk.FidoUISelectionListener uiSelectionListener) {
        Intrinsics.checkNotNullParameter(uiSelectionListener, "uiSelectionListener");
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.registerSelectionUIListener(uiSelectionListener);
        }
    }

    public final void setTransactionUIListener(@NotNull FidoSdk.FidoUITransactionListener callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.setTransactionUIListener(callback);
        }
    }

    public final void signTransaction(@NotNull Activity activity, @NotNull FidoSession session, @NotNull String transactionId, @NotNull String transactionDescription, @NotNull FidoSdk.FidoSignCallback callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(transactionDescription, "transactionDescription");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FidoException fidoException = this.f29881c;
        if (fidoException != null) {
            callback.signFailed(session, fidoException);
            return;
        }
        FidoSdkImpl fidoSdkImpl = this.f29880b;
        if (fidoSdkImpl != null) {
            fidoSdkImpl.signTransaction(activity, session, transactionId, transactionDescription, callback);
        }
    }
}
