package net.ipsoft.amelia.sdk;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public interface ISessionListener {
    void onConversationEnd(BaseConversation baseConversation);

    void onConversationFail(IAmeliaError iAmeliaError);

    void onConversationInfoList(List<ConversationInfo> list);

    void onConversationStart(BaseConversation baseConversation);

    void onDomainFail(IAmeliaError iAmeliaError);

    void onDomainSelectionRequired(List<BaseDomain> list);

    void onJoinConversationFail(IAmeliaError iAmeliaError);

    void onLanguageChange(String str, String str2);

    void onLoginFail(IAmeliaError iAmeliaError);

    void onLoginRequired(List<BaseAuthSystem> list);

    void onLoginSuccess();

    void onLogout();

    void onSessionFail(IAmeliaError iAmeliaError);

    void onSessionInitFail(IAmeliaError iAmeliaError);

    void onSessionStart();

    void onUserInit(String str, String str2);

    void sessionInitialized(ISessionInfo iSessionInfo);
}
