package com.veridas.metadata.entities;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 com.veridas.metadata.entities.Agent[], still in use, count: 1, list:
  (r8v3 com.veridas.metadata.entities.Agent[]) from 0x004b: INVOKE (r8v3 com.veridas.metadata.entities.Agent[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:76)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: Agent.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/veridas/metadata/entities/Agent;", "", "", "agentName", "Ljava/lang/String;", "getAgentName", "()Ljava/lang/String;", "SDK_DOCUMENT_CAPTURE", "SDK_PHOTO_SELFIE_CAPTURE", "SDK_SELFIE_ALIVE_CAPTURE", "SDK_VIDEO_SELFIE_CAPTURE", "SDK_NFC", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class Agent {
    SDK_DOCUMENT_CAPTURE("sdk-document-capture"),
    SDK_PHOTO_SELFIE_CAPTURE("sdk-photo-selfie-capture"),
    SDK_SELFIE_ALIVE_CAPTURE("sdk-selfie-alive-capture"),
    SDK_VIDEO_SELFIE_CAPTURE("sdk-video-selfie-capture"),
    SDK_NFC("sdk-nfc");

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @NotNull
    private final String agentName;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(agentArr);
    }

    public Agent(String str) {
        super(str, i);
        this.agentName = str;
    }

    @NotNull
    public static EnumEntries<Agent> getEntries() {
        return $ENTRIES;
    }

    public static Agent valueOf(String str) {
        return (Agent) Enum.valueOf(Agent.class, str);
    }

    public static Agent[] values() {
        return (Agent[]) $VALUES.clone();
    }

    @NotNull
    public final String getAgentName() {
        return this.agentName;
    }
}
