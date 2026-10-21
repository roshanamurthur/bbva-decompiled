package com.bbva.ethermobilesdk.sharedstorage.model.entry;

import com.bbva.ethermobilesdk.token.plugin.EtherTokenPlugin;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 com.bbva.ethermobilesdk.sharedstorage.model.entry.EntryType[], still in use, count: 1, list:
  (r4v3 com.bbva.ethermobilesdk.sharedstorage.model.entry.EntryType[]) from 0x002f: INVOKE (r4v3 com.bbva.ethermobilesdk.sharedstorage.model.entry.EntryType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:48)
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
/* JADX INFO: compiled from: Entry.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/model/entry/EntryType;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", EtherTokenPlugin.ID, "EncryptionCert", "DeviceUid", "shared-storage_release"}, k = 1, mv = {1, 9, 0})
public final class EntryType {
    EtherToken("ether.token"),
    EncryptionCert("encryption.cert"),
    DeviceUid("ether.deviceuid");

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @NotNull
    private final String id;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(entryTypeArr);
    }

    public EntryType(String str) {
        super(str, i);
        this.id = str;
    }

    @NotNull
    public static EnumEntries<EntryType> getEntries() {
        return $ENTRIES;
    }

    public static EntryType valueOf(String str) {
        return (EntryType) Enum.valueOf(EntryType.class, str);
    }

    public static EntryType[] values() {
        return (EntryType[]) $VALUES.clone();
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
