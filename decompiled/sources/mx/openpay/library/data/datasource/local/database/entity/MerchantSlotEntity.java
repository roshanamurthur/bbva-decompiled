package mx.openpay.library.data.datasource.local.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MerchantEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Entity(tableName = "merchant_slot")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lmx/openpay/library/data/datasource/local/database/entity/MerchantSlotEntity;", "", "id", "", "keyInjected", "renewKey", "slotKey", "terminalSerialId", "", "(IIIILjava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getKeyInjected", "getRenewKey", "getSlotKey", "getTerminalSerialId", "()Ljava/lang/String;", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MerchantSlotEntity {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private final int keyInjected;
    private final int renewKey;
    private final int slotKey;

    @NotNull
    private final String terminalSerialId;

    public MerchantSlotEntity(int i10, int i11, int i12, int i13, @NotNull String terminalSerialId) {
        Intrinsics.checkNotNullParameter(terminalSerialId, "terminalSerialId");
        this.id = i10;
        this.keyInjected = i11;
        this.renewKey = i12;
        this.slotKey = i13;
        this.terminalSerialId = terminalSerialId;
    }

    public final int getId() {
        return this.id;
    }

    public final int getKeyInjected() {
        return this.keyInjected;
    }

    public final int getRenewKey() {
        return this.renewKey;
    }

    public final int getSlotKey() {
        return this.slotKey;
    }

    @NotNull
    public final String getTerminalSerialId() {
        return this.terminalSerialId;
    }

    public final void setId(int i10) {
        this.id = i10;
    }

    public /* synthetic */ MerchantSlotEntity(int i10, int i11, int i12, int i13, String str, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i10, i11, i12, i13, str);
    }
}
