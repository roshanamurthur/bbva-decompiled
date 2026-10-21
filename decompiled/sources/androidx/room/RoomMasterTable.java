package androidx.room;

import androidx.annotation.RestrictTo;
import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RoomMasterTable.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\r"}, d2 = {"Landroidx/room/RoomMasterTable;", "", "", HashCommand.ID, "createInsertQuery", "TABLE_NAME", "Ljava/lang/String;", "NAME", "DEFAULT_ID", "CREATE_QUERY", "READ_QUERY", "<init>", "()V", "room-common"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class RoomMasterTable {

    @NotNull
    public static final String CREATE_QUERY = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";

    @NotNull
    public static final String DEFAULT_ID = "42";

    @NotNull
    public static final RoomMasterTable INSTANCE = new RoomMasterTable();

    @NotNull
    public static final String NAME = "room_master_table";

    @NotNull
    public static final String READ_QUERY = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";

    @NotNull
    public static final String TABLE_NAME = "room_master_table";

    @JvmStatic
    @NotNull
    public static final String createInsertQuery(@NotNull String hash) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')";
    }
}
