package net.ipsoft.amelia.sdk;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class BaseSessionListener implements ISessionListener {
    @Override // net.ipsoft.amelia.sdk.ISessionListener
    public void onLoginSuccess() {
    }

    @Override // net.ipsoft.amelia.sdk.ISessionListener
    public void onLogout() {
    }

    @Override // net.ipsoft.amelia.sdk.ISessionListener
    public void onSessionStart() {
    }

    @Override // net.ipsoft.amelia.sdk.ISessionListener
    public void onConversationEnd(BaseConversation baseConversation) {
    }

    @Override // net.ipsoft.amelia.sdk.ISessionListener
    public void onConversationFail(IAmeliaError iAmeliaError) {
    }

    @Override // net.ipsoft.amelia.sdk.ISessionListener
    public void onConversationInfoList(List<ConversationInfo> list) {
    }

    @Override // net.ipsoft.amelia.sdk.ISessionListener
    public void onConversationStart(BaseConversation baseConversation) {
    }

    @Override // net.ipsoft.amelia.sdk.ISessionListener
    public void onDomainFail(IAmeliaError iAmeliaError) {
    }

    @Override // net.ipsoft.amelia.sdk.ISessionListener
    public void onDomainSelectionRequired(List<BaseDomain> list) {
    }

    @Override // net.ipsoft.amelia.sdk.ISessionListener
    public void onJoinConversationFail(IAmeliaError iAmeliaError) {
    }

    @Override // net.ipsoft.amelia.sdk.ISessionListener
    public void onLoginFail(IAmeliaError iAmeliaError) {
    }

    @Override // net.ipsoft.amelia.sdk.ISessionListener
    public void onLoginRequired(List<BaseAuthSystem> list) {
    }

    @Override // net.ipsoft.amelia.sdk.ISessionListener
    public void onSessionFail(IAmeliaError iAmeliaError) {
    }

    @Override // net.ipsoft.amelia.sdk.ISessionListener
    public void onSessionInitFail(IAmeliaError iAmeliaError) {
    }

    @Override // net.ipsoft.amelia.sdk.ISessionListener
    public void sessionInitialized(ISessionInfo iSessionInfo) {
    }

    @Override // net.ipsoft.amelia.sdk.ISessionListener
    public void onLanguageChange(String str, String str2) {
    }

    @Override // net.ipsoft.amelia.sdk.ISessionListener
    public void onUserInit(String str, String str2) {
    }
}
