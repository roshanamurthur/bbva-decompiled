package mx.openpay.library.data.datasource.local.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MerchantEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Entity(tableName = "merchant")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lmx/openpay/library/data/datasource/local/database/entity/MerchantEntity;", "", "id", "", "slotKey", "merchantName", "", "keyName", "renewKey", "(IILjava/lang/String;Ljava/lang/String;I)V", "getId", "()I", "setId", "(I)V", "getKeyName", "()Ljava/lang/String;", "getMerchantName", "getRenewKey", "getSlotKey", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MerchantEntity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @NotNull
    private final String keyName;

    @NotNull
    private final String merchantName;
    private final int renewKey;
    private final int slotKey;

    public MerchantEntity(int i10, int i11, @NotNull String merchantName, @NotNull String keyName, int i12) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        this.id = i10;
        this.slotKey = i11;
        this.merchantName = merchantName;
        this.keyName = keyName;
        this.renewKey = i12;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getKeyName() {
        return this.keyName;
    }

    @NotNull
    public final String getMerchantName() {
        return this.merchantName;
    }

    public final int getRenewKey() {
        return this.renewKey;
    }

    public final int getSlotKey() {
        return this.slotKey;
    }

    public final void setId(int i10) {
        this.id = i10;
    }

    public /* synthetic */ MerchantEntity(int i10, int i11, String str, String str2, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i10, i11, str, str2, i12);
    }
}
