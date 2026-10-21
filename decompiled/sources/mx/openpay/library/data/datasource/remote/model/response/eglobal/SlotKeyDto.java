package mx.openpay.library.data.datasource.remote.model.response.eglobal;

import ad.d;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SlotKeyDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/response/eglobal/SlotKeyDto;", "", "keyName", "", "processor", "slotKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKeyName", "()Ljava/lang/String;", "getProcessor", "getSlotKey", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SlotKeyDto {

    @SerializedName("key_name")
    @NotNull
    private final String keyName;

    @SerializedName("processor")
    @NotNull
    private final String processor;

    @SerializedName("slot_key")
    @NotNull
    private final String slotKey;

    public SlotKeyDto(@NotNull String keyName, @NotNull String processor, @NotNull String slotKey) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(slotKey, "slotKey");
        this.keyName = keyName;
        this.processor = processor;
        this.slotKey = slotKey;
    }

    public static /* synthetic */ SlotKeyDto copy$default(SlotKeyDto slotKeyDto, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = slotKeyDto.keyName;
        }
        if ((i10 & 2) != 0) {
            str2 = slotKeyDto.processor;
        }
        if ((i10 & 4) != 0) {
            str3 = slotKeyDto.slotKey;
        }
        return slotKeyDto.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKeyName() {
        return this.keyName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProcessor() {
        return this.processor;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSlotKey() {
        return this.slotKey;
    }

    @NotNull
    public final SlotKeyDto copy(@NotNull String keyName, @NotNull String processor, @NotNull String slotKey) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(slotKey, "slotKey");
        return new SlotKeyDto(keyName, processor, slotKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotKeyDto)) {
            return false;
        }
        SlotKeyDto slotKeyDto = (SlotKeyDto) other;
        return Intrinsics.areEqual(this.keyName, slotKeyDto.keyName) && Intrinsics.areEqual(this.processor, slotKeyDto.processor) && Intrinsics.areEqual(this.slotKey, slotKeyDto.slotKey);
    }

    @NotNull
    public final String getKeyName() {
        return this.keyName;
    }

    @NotNull
    public final String getProcessor() {
        return this.processor;
    }

    @NotNull
    public final String getSlotKey() {
        return this.slotKey;
    }

    public int hashCode() {
        return this.slotKey.hashCode() + n1.c(this.processor, this.keyName.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.keyName;
        String str2 = this.processor;
        return d.f(a.c("SlotKeyDto(keyName=", str, ", processor=", str2, ", slotKey="), this.slotKey, ")");
    }
}
