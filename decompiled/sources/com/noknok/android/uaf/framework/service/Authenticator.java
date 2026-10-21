package com.noknok.android.uaf.framework.service;

import ad.d;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.fido.android.framework.service.IAuthenticatorUIAdapter;
import com.fido.android.framework.service.Mfac;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mastercard.sonic.androidsvg.SVGParser;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.asm.api.UserVerification;
import com.noknok.android.client.asm.api.uaf.IUafAsmBinder;
import com.noknok.android.client.asm.api.uaf.json.ASMRequest;
import com.noknok.android.client.asm.api.uaf.json.ASMResponse;
import com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo;
import com.noknok.android.client.asm.api.uaf.json.DeregisterIn;
import com.noknok.android.client.asm.api.uaf.json.GetInfoOut;
import com.noknok.android.client.asm.api.uaf.json.GetRegistrationsOut;
import com.noknok.android.client.asm.api.uaf.json.Version;
import com.noknok.android.client.utils.JsonObjectAdapter;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class Authenticator implements IAuthenticatorUIAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f63561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AuthenticatorInfo f63562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GetRegistrationsOut f63563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IUafAsmBinder f63564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<String> f63565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private short f63566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f63567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Version f63568h;

    public enum StateEnum {
        Activated,
        Setup,
        Enabled,
        RegCommitted
    }

    public Authenticator(AuthenticatorInfo authenticatorInfo, String str, IUafAsmBinder iUafAsmBinder) {
        this.f63567g = null;
        this.f63561a = str;
        this.f63562b = authenticatorInfo;
        if (iUafAsmBinder != null) {
            this.f63564d = iUafAsmBinder;
        }
        a(authenticatorInfo);
    }

    private void a(AuthenticatorInfo authenticatorInfo) {
        List<Version> list;
        if (authenticatorInfo == null || (list = authenticatorInfo.asmVersions) == null || list.size() <= 0) {
            throw new AsmException(Outcome.NOT_SUPPORTED);
        }
        this.f63568h = authenticatorInfo.asmVersions.get(0);
    }

    public ASMResponse authenticate(ASMRequest aSMRequest) {
        aSMRequest.requestType = ASMRequest.RequestType.Authenticate;
        aSMRequest.authenticatorIndex = Short.valueOf(this.f63562b.authenticatorIndex);
        aSMRequest.asmVersion = this.f63568h;
        return AuthenticatorManager.executeAsmRequest(aSMRequest, this.f63567g);
    }

    public void deregister(ASMRequest aSMRequest) {
        this.f63563c = null;
        aSMRequest.requestType = ASMRequest.RequestType.Deregister;
        aSMRequest.authenticatorIndex = Short.valueOf(this.f63562b.authenticatorIndex);
        aSMRequest.asmVersion = this.f63568h;
        AuthenticatorManager.executeAsmRequest(aSMRequest, this.f63567g);
    }

    public IUafAsmBinder getAsmBinder() {
        return this.f63564d;
    }

    public String getAsmDestination() {
        return this.f63567g;
    }

    public short getAttestationType() {
        return this.f63566f;
    }

    public AuthenticatorInfo getAuthnrInfo() {
        return this.f63562b;
    }

    @Override // com.fido.android.framework.service.IAuthenticatorUIAdapter
    public Drawable getIcon() {
        return this.f63564d.getIcon();
    }

    @Override // com.fido.android.framework.service.IAuthenticatorUIAdapter
    public String getId() {
        return this.f63561a;
    }

    public List<String> getKeyIDs() {
        return this.f63565e;
    }

    public GetRegistrationsOut getRegistrations() {
        GetRegistrationsOut getRegistrationsOut = this.f63563c;
        if (getRegistrationsOut != null) {
            return getRegistrationsOut;
        }
        ASMRequest aSMRequest = new ASMRequest();
        aSMRequest.requestType = ASMRequest.RequestType.GetRegistrations;
        aSMRequest.authenticatorIndex = Short.valueOf(this.f63562b.authenticatorIndex);
        aSMRequest.asmVersion = this.f63568h;
        GetRegistrationsOut getRegistrationsOut2 = (GetRegistrationsOut) JsonObjectAdapter.GsonBuilder().create().fromJson((JsonElement) AuthenticatorManager.executeAsmRequest(aSMRequest, this.f63567g).responseData, GetRegistrationsOut.class);
        this.f63563c = getRegistrationsOut2;
        return getRegistrationsOut2;
    }

    @Override // com.fido.android.framework.service.IAuthenticatorUIAdapter
    public IAuthenticatorUIAdapter.GetUIOut getUI() {
        IAuthenticatorUIAdapter.GetUIOut getUIOut = new IAuthenticatorUIAdapter.GetUIOut();
        String strF = this.f63562b.title;
        if (strF == null) {
            StringBuilder sb2 = new StringBuilder();
            if ((this.f63562b.userVerification & UserVerification.USER_VERIFY_PRESENCE.getUafValue()) != 0) {
                sb2.append("User presence confirmation and ");
            }
            if ((this.f63562b.userVerification & UserVerification.USER_VERIFY_FINGERPRINT.getUafValue()) != 0) {
                sb2.append("Fingerprint and ");
            }
            if ((this.f63562b.userVerification & UserVerification.USER_VERIFY_PASSCODE.getUafValue()) != 0) {
                sb2.append("Passcode and ");
            }
            if ((this.f63562b.userVerification & UserVerification.USER_VERIFY_VOICEPRINT.getUafValue()) != 0) {
                sb2.append("Voiceprint and ");
            }
            if ((this.f63562b.userVerification & UserVerification.USER_VERIFY_FACEPRINT.getUafValue()) != 0) {
                sb2.append("Face Recognition and ");
            }
            if ((this.f63562b.userVerification & UserVerification.USER_VERIFY_LOCATION.getUafValue()) != 0) {
                sb2.append("Location sensor or measurement and ");
            }
            if ((this.f63562b.userVerification & UserVerification.USER_VERIFY_EYEPRINT.getUafValue()) != 0) {
                sb2.append("Eye biometric and ");
            }
            if ((this.f63562b.userVerification & UserVerification.USER_VERIFY_PATTERN.getUafValue()) != 0) {
                sb2.append("Drawn pattern and ");
            }
            if ((this.f63562b.userVerification & UserVerification.USER_VERIFY_HANDPRINT.getUafValue()) != 0) {
                sb2.append("Full hand (palm-print, hand geometry or vein geometry) and ");
            }
            if ((this.f63562b.userVerification & UserVerification.USER_VERIFY_NONE.getUafValue()) != 0) {
                sb2.append("No user interaction and ");
            }
            if (sb2.length() == 0) {
                sb2.append("Unknown type");
            } else {
                sb2.delete(sb2.length() - 5, sb2.length());
            }
            sb2.append(" Authenticator (");
            strF = d.f(sb2, this.f63562b.aaid, ")");
        }
        getUIOut.Title = strF;
        AuthenticatorInfo authenticatorInfo = this.f63562b;
        getUIOut.Icon = authenticatorInfo.icon;
        String strF2 = authenticatorInfo.description;
        if (strF2 == null) {
            strF2 = d.f(new StringBuilder("You can set up "), getUIOut.Title, " on your Android device to sign in to websites that use Nok Nok authentication.It's secure and more convenient than signing in with your username and password.");
        }
        getUIOut.Text = strF2;
        getUIOut.hasSettings = this.f63562b.hasSettings;
        return getUIOut;
    }

    public GetInfoOut getinfo() {
        ASMRequest aSMRequest = new ASMRequest();
        aSMRequest.requestType = ASMRequest.RequestType.GetInfo;
        aSMRequest.asmVersion = new Version((short) 1, (short) 0);
        return (GetInfoOut) JsonObjectAdapter.GsonBuilder().create().fromJson((JsonElement) AuthenticatorManager.executeAsmRequest(aSMRequest, this.f63567g).responseData, GetInfoOut.class);
    }

    @Override // com.fido.android.framework.service.IAuthenticatorUIAdapter
    public boolean isEnabled() {
        return "yes".equalsIgnoreCase(Mfac.Instance().getContext().getSharedPreferences("authnr_state", 0).getString(this.f63561a + StateEnum.Enabled, "yes"));
    }

    public boolean isKeyIDRegistered(String str) {
        try {
            GetRegistrationsOut registrations = getRegistrations();
            if (registrations == null) {
                return false;
            }
            Iterator<GetRegistrationsOut.AppRegistration> it = registrations.appRegs.iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().keyIDs.iterator();
                while (it2.hasNext()) {
                    if (it2.next().equals(str)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (AsmException e5) {
            Logger.e("Authenticator", "Error while checking is keyID registered", e5);
            return false;
        }
    }

    public boolean isRegistered(String str) {
        try {
            Iterator<GetRegistrationsOut.AppRegistration> it = getRegistrations().appRegs.iterator();
            while (it.hasNext()) {
                if (it.next().appID.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (AsmException e5) {
            Logger.e("Authenticator", "isRegistered failed", e5);
            return false;
        }
    }

    @Override // com.fido.android.framework.service.IAuthenticatorUIAdapter
    public boolean isTokenRegistered() {
        try {
            return !getRegistrations().appRegs.isEmpty();
        } catch (AsmException e5) {
            Logger.e("Authenticator", "Error while getting state", e5);
            return false;
        }
    }

    @Override // com.fido.android.framework.service.IAuthenticatorUIAdapter
    public void openSettings(String str) {
        Logger.i("Authenticator", "Execute called with params: " + str);
        ASMRequest aSMRequest = new ASMRequest();
        Gson gsonCreate = JsonObjectAdapter.GsonBuilder().create();
        if ("manage".equals(str)) {
            aSMRequest.requestType = ASMRequest.RequestType.OpenSettings;
            aSMRequest.authenticatorIndex = Short.valueOf(this.f63562b.authenticatorIndex);
            aSMRequest.asmVersion = this.f63568h;
            AuthenticatorManager.executeAsmRequest(aSMRequest, this.f63567g);
            return;
        }
        if (ClearCommand.ID.equals(str)) {
            for (GetRegistrationsOut.AppRegistration appRegistration : getRegistrations().appRegs) {
                for (String str2 : appRegistration.keyIDs) {
                    DeregisterIn deregisterIn = new DeregisterIn();
                    deregisterIn.appID = appRegistration.appID;
                    deregisterIn.keyID = str2;
                    aSMRequest.args = (JsonObject) gsonCreate.toJsonTree(deregisterIn);
                    deregister(aSMRequest);
                }
            }
        }
    }

    public ASMResponse register(ASMRequest aSMRequest) {
        this.f63563c = null;
        aSMRequest.requestType = ASMRequest.RequestType.Register;
        aSMRequest.authenticatorIndex = Short.valueOf(this.f63562b.authenticatorIndex);
        aSMRequest.asmVersion = this.f63568h;
        return AuthenticatorManager.executeAsmRequest(aSMRequest, this.f63567g);
    }

    public void setAttestationType(short s4) {
        this.f63566f = s4;
    }

    @Override // com.fido.android.framework.service.IAuthenticatorUIAdapter
    public void setEnabled(boolean z10) {
        SharedPreferences.Editor editorEdit = Mfac.Instance().getContext().getSharedPreferences("authnr_state", 0).edit();
        editorEdit.putString(this.f63561a + StateEnum.Enabled, z10 ? "yes" : SVGParser.XML_STYLESHEET_ATTR_ALTERNATE_NO);
        editorEdit.apply();
    }

    public void setKeyIDs(List<String> list) {
        this.f63565e = list;
    }

    public void setVersion(Version version) {
        this.f63568h = version;
    }

    public Authenticator(AuthenticatorInfo authenticatorInfo, String str, String str2) {
        this.f63567g = null;
        this.f63561a = str;
        this.f63562b = authenticatorInfo;
        this.f63564d = null;
        if (str2 != null) {
            this.f63567g = str2;
        }
        a(authenticatorInfo);
    }
}
