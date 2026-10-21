package com.bbva.smartassistance.listeners;

import bk.q;
import com.bbva.glomo.localstorage.DeviceIdDataSource;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.smartassistance.constants.SmartAssistanceConstants;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import net.ipsoft.amelia.sdk.BaseAuthSystem;
import net.ipsoft.amelia.sdk.BaseConversation;
import net.ipsoft.amelia.sdk.BaseDomain;
import net.ipsoft.amelia.sdk.BaseSessionListener;
import net.ipsoft.amelia.sdk.IAmeliaChat;
import net.ipsoft.amelia.sdk.IAmeliaError;
import net.ipsoft.amelia.sdk.ISessionInfo;
import net.ipsoft.amelia.sdk.LoginOptions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomBaseSessionListener.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fH\u0016J\u0012\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J(\u0010\u001d\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019J\u0010\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eJ\u0016\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!¨\u0006+"}, d2 = {"Lcom/bbva/smartassistance/listeners/CustomBaseSessionListener;", "Lnet/ipsoft/amelia/sdk/BaseSessionListener;", "Lnet/ipsoft/amelia/sdk/IAmeliaError;", "error", "", "onSessionFail", "onDomainFail", "onConversationFail", "onSessionInitFail", "Lnet/ipsoft/amelia/sdk/ISessionInfo;", "sessionInfo", "sessionInitialized", "", "Lnet/ipsoft/amelia/sdk/BaseAuthSystem;", "authSystems", "onLoginRequired", "onLoginFail", "Lnet/ipsoft/amelia/sdk/BaseDomain;", DynamicLink.Builder.KEY_DOMAIN, "onDomainSelectionRequired", "Lnet/ipsoft/amelia/sdk/BaseConversation;", "conversation", "onConversationStart", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "rememberedUser", "", "ameliaEmail", "ameliaKey", "tsec", "setAttributesToDoLogin", "Lnet/ipsoft/amelia/sdk/IAmeliaChat;", "iAmeliaChat", "setIAmeliaChat", "", "digital", "physical", "reloadFlags", "Lcom/bbva/glomo/localstorage/DeviceIdDataSource;", "dataSource", "Lcom/bbva/smartassistance/listeners/CustomBaseConversation;", "baseConversation", "<init>", "(Lcom/bbva/glomo/localstorage/DeviceIdDataSource;Lcom/bbva/smartassistance/listeners/CustomBaseConversation;)V", "gl-smart-assistance_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCustomBaseSessionListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomBaseSessionListener.kt\ncom/bbva/smartassistance/listeners/CustomBaseSessionListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n1855#2,2:151\n766#2:153\n857#2,2:154\n1855#2,2:156\n*S KotlinDebug\n*F\n+ 1 CustomBaseSessionListener.kt\ncom/bbva/smartassistance/listeners/CustomBaseSessionListener\n*L\n62#1:151,2\n77#1:153\n77#1:154,2\n83#1:156,2\n*E\n"})
public final class CustomBaseSessionListener extends BaseSessionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DeviceIdDataSource f36812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CustomBaseConversation f36813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f36815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public IAmeliaChat f36816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public RememberedUser f36817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f36818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public String f36819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public String f36820i;

    public CustomBaseSessionListener(@NotNull DeviceIdDataSource dataSource, @NotNull CustomBaseConversation baseConversation) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(baseConversation, "baseConversation");
        this.f36812a = dataSource;
        this.f36813b = baseConversation;
        this.f36814c = true;
        this.f36815d = true;
        this.f36818g = "";
        this.f36819h = "";
        this.f36820i = "";
    }

    public final void a(BaseAuthSystem baseAuthSystem) {
        if (baseAuthSystem == null || !baseAuthSystem.getRedirect()) {
            LoginOptions loginOptions = new LoginOptions(baseAuthSystem, this.f36818g, this.f36819h);
            loginOptions.setInitialAttributes(b());
            IAmeliaChat iAmeliaChat = this.f36816e;
            if (iAmeliaChat != null) {
                iAmeliaChat.login(loginOptions);
            }
        }
    }

    public final Map<String, String> b() {
        RememberedUser rememberedUser = this.f36817f;
        if (rememberedUser == null) {
            return null;
        }
        Pair[] pairArr = new Pair[8];
        String deviceId = this.f36812a.getDeviceId();
        if (deviceId == null) {
            deviceId = "";
        }
        pairArr[0] = TuplesKt.to("vnd.bbva.device-id", deviceId);
        pairArr[1] = TuplesKt.to("userID", rememberedUser.getDocument());
        pairArr[2] = TuplesKt.to(SmartAssistanceConstants.IMAGE_URL, "");
        pairArr[3] = TuplesKt.to("userName", rememberedUser.getUsername());
        String customerId = rememberedUser.getCustomerId();
        pairArr[4] = TuplesKt.to(SmartAssistanceConstants.CUSTOMER_ID, customerId != null ? customerId : "");
        pairArr[5] = TuplesKt.to("tsec", this.f36820i);
        pairArr[6] = TuplesKt.to(SmartAssistanceConstants.FIRST_TIME_DIGITAL, String.valueOf(this.f36814c));
        pairArr[7] = TuplesKt.to(SmartAssistanceConstants.FIRST_TIME_PHYSICAL, String.valueOf(this.f36815d));
        return q.mapOf(pairArr);
    }

    @Override // net.ipsoft.amelia.sdk.BaseSessionListener, net.ipsoft.amelia.sdk.ISessionListener
    public void onConversationFail(@Nullable IAmeliaError error) {
        super.onConversationFail(error);
    }

    @Override // net.ipsoft.amelia.sdk.BaseSessionListener, net.ipsoft.amelia.sdk.ISessionListener
    public void onConversationStart(@Nullable BaseConversation conversation) {
        super.onConversationStart(conversation);
        this.f36813b.setBaseConversation(conversation);
    }

    @Override // net.ipsoft.amelia.sdk.BaseSessionListener, net.ipsoft.amelia.sdk.ISessionListener
    public void onDomainFail(@Nullable IAmeliaError error) {
        super.onDomainFail(error);
    }

    @Override // net.ipsoft.amelia.sdk.BaseSessionListener, net.ipsoft.amelia.sdk.ISessionListener
    public void onDomainSelectionRequired(@Nullable List<BaseDomain> domain) {
        super.onDomainSelectionRequired(domain);
        List<BaseDomain> list = domain;
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList<BaseDomain> arrayList = new ArrayList();
        for (Object obj : domain) {
            if (l.equals(((BaseDomain) obj).getName(), SmartAssistanceConstants.AMELIA_DOMAIN, true)) {
                arrayList.add(obj);
            }
        }
        for (BaseDomain baseDomain : arrayList) {
            IAmeliaChat iAmeliaChat = this.f36816e;
            if (iAmeliaChat != null) {
                iAmeliaChat.selectDomain(baseDomain);
            }
        }
    }

    @Override // net.ipsoft.amelia.sdk.BaseSessionListener, net.ipsoft.amelia.sdk.ISessionListener
    public void onLoginFail(@Nullable IAmeliaError error) {
        super.onLoginFail(error);
    }

    @Override // net.ipsoft.amelia.sdk.BaseSessionListener, net.ipsoft.amelia.sdk.ISessionListener
    public void onLoginRequired(@Nullable List<BaseAuthSystem> authSystems) {
        super.onLoginRequired(authSystems);
        if (authSystems != null) {
            for (BaseAuthSystem baseAuthSystem : authSystems) {
                boolean redirect = baseAuthSystem.getRedirect();
                if (redirect) {
                    a(baseAuthSystem);
                } else if (!redirect) {
                    a(null);
                }
            }
        }
    }

    @Override // net.ipsoft.amelia.sdk.BaseSessionListener, net.ipsoft.amelia.sdk.ISessionListener
    public void onSessionFail(@Nullable IAmeliaError error) {
        super.onSessionFail(error);
    }

    @Override // net.ipsoft.amelia.sdk.BaseSessionListener, net.ipsoft.amelia.sdk.ISessionListener
    public void onSessionInitFail(@Nullable IAmeliaError error) {
        super.onSessionInitFail(error);
    }

    public final void reloadFlags(boolean digital, boolean physical) {
        this.f36814c = digital;
        this.f36815d = physical;
        IAmeliaChat iAmeliaChat = this.f36816e;
        if (iAmeliaChat != null) {
            iAmeliaChat.sendCustomConversationAttributes(this.f36813b.getBaseConversation(), b());
        }
    }

    @Override // net.ipsoft.amelia.sdk.BaseSessionListener, net.ipsoft.amelia.sdk.ISessionListener
    public void sessionInitialized(@Nullable ISessionInfo sessionInfo) {
        super.sessionInitialized(sessionInfo);
        if (sessionInfo != null) {
            boolean zIsAnonymousAllowed = sessionInfo.isAnonymousAllowed();
            if (zIsAnonymousAllowed) {
                IAmeliaChat iAmeliaChat = this.f36816e;
                if (iAmeliaChat != null) {
                    iAmeliaChat.startNewConversation(b(), null);
                    return;
                }
                return;
            }
            if (zIsAnonymousAllowed) {
                throw new NoWhenBranchMatchedException();
            }
            IAmeliaChat iAmeliaChat2 = this.f36816e;
            if (iAmeliaChat2 != null) {
                iAmeliaChat2.stepupLogin();
            }
        }
    }

    public final void setAttributesToDoLogin(@Nullable RememberedUser rememberedUser, @NotNull String ameliaEmail, @NotNull String ameliaKey, @NotNull String tsec) {
        Intrinsics.checkNotNullParameter(ameliaEmail, "ameliaEmail");
        Intrinsics.checkNotNullParameter(ameliaKey, "ameliaKey");
        Intrinsics.checkNotNullParameter(tsec, "tsec");
        this.f36817f = rememberedUser;
        this.f36818g = ameliaEmail;
        this.f36819h = ameliaKey;
        this.f36820i = tsec;
    }

    public final void setIAmeliaChat(@Nullable IAmeliaChat iAmeliaChat) {
        this.f36816e = iAmeliaChat;
    }
}
