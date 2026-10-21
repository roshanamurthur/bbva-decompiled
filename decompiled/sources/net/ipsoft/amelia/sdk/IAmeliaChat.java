package net.ipsoft.amelia.sdk;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface IAmeliaChat {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InputStateChangeReason {
        private static final /* synthetic */ InputStateChangeReason[] $VALUES;
        public static final InputStateChangeReason disconnected;
        public static final InputStateChangeReason form;
        public static final InputStateChangeReason idle;
        public static final InputStateChangeReason unknown;
        public static final InputStateChangeReason upload;

        static {
            InputStateChangeReason inputStateChangeReason = new InputStateChangeReason("unknown", 0);
            unknown = inputStateChangeReason;
            InputStateChangeReason inputStateChangeReason2 = new InputStateChangeReason("upload", 1);
            upload = inputStateChangeReason2;
            InputStateChangeReason inputStateChangeReason3 = new InputStateChangeReason("form", 2);
            form = inputStateChangeReason3;
            InputStateChangeReason inputStateChangeReason4 = new InputStateChangeReason("idle", 3);
            idle = inputStateChangeReason4;
            InputStateChangeReason inputStateChangeReason5 = new InputStateChangeReason("disconnected", 4);
            disconnected = inputStateChangeReason5;
            $VALUES = new InputStateChangeReason[]{inputStateChangeReason, inputStateChangeReason2, inputStateChangeReason3, inputStateChangeReason4, inputStateChangeReason5};
        }

        public InputStateChangeReason() {
            throw null;
        }

        public static InputStateChangeReason valueOf(String str) {
            return (InputStateChangeReason) Enum.valueOf(InputStateChangeReason.class, str);
        }

        public static InputStateChangeReason[] values() {
            return (InputStateChangeReason[]) $VALUES.clone();
        }
    }

    void addConversationListener(IConversationListener iConversationListener);

    void addSessionListener(ISessionListener iSessionListener);

    void ask(BaseConversation baseConversation, String str);

    void cancleFileUpload(BaseConversation baseConversation);

    void clearChatHistory(BaseConversation baseConversation);

    void endConversation(BaseConversation baseConversation);

    long getTimeOfLastMessage(BaseConversation baseConversation);

    IAmeliaUser getUser();

    void initialize();

    void joinConversation(ConversationInfo conversationInfo);

    void login(LoginOptions loginOptions);

    void logout();

    void mute(BaseConversation baseConversation);

    void removeConversationListener(IConversationListener iConversationListener);

    void removeSessionListener(ISessionListener iSessionListener);

    void resetConversation(BaseConversation baseConversation);

    void runAction(BaseConversation baseConversation, String str, String str2, String str3);

    void say(BaseConversation baseConversation, String str);

    void selectDomain(BaseDomain baseDomain);

    void sendCustomConversationAttributes(BaseConversation baseConversation, Map<String, String> map);

    void startNewConversation();

    void startNewConversation(@Nullable Map<String, String> map, @Nullable Map<String, String> map2);

    void startNewConversationWithDefaultDomain(@Nullable Map<String, String> map, @Nullable Map<String, String> map2);

    void stepupLogin();

    void stopPlayAudio(BaseConversation baseConversation);

    void submitForm(BaseConversation baseConversation, FormInputData formInputData, String str);

    void unmute(BaseConversation baseConversation);

    void uploadFile(BaseConversation baseConversation, Uri uri);
}
