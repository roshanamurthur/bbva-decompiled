package mx.openpay.library.data.datasource.remote.model.request.eglobal;

import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.c;
import androidx.camera.core.impl.v;
import androidx.collection.k;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.util.EglobalUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EncryptedCardRequestDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\bC\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0002\u0010\u001eJ\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0012HÆ\u0003J\t\u0010A\u001a\u00020\u0012HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\u0087\u0002\u0010T\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u0005HÆ\u0001J\u0013\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010X\u001a\u00020YHÖ\u0001J\t\u0010Z\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u001d\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u001c\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0016\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0016\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0016\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0016\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0016\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0016\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0016\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010 R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010 ¨\u0006["}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/request/eglobal/EncryptedCardRequestDto;", "", "emvTags", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/EmvTagsRequestDto;", "holderName", "", "model", "pinStatus", "readMode", "serialKey", "tokenES", "tokenEZ", "track2Op", "version", "versionName", "tokenEY", "tokenCZ", "longitude", "", "latitude", "hexSign", "realCounter", "track2Length", EglobalUtils.TRACK2, "track2Crc", "tokenR1", "cardBin", "serial", "applicationPreferredName", "applicationLabel", "(Lmx/openpay/library/data/datasource/remote/model/request/eglobal/EmvTagsRequestDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplicationLabel", "()Ljava/lang/String;", "getApplicationPreferredName", "getCardBin", "getEmvTags", "()Lmx/openpay/library/data/datasource/remote/model/request/eglobal/EmvTagsRequestDto;", "getHexSign", "getHolderName", "getLatitude", "()D", "getLongitude", "getModel", "getPinStatus", "getReadMode", "getRealCounter", "getSerial", "getSerialKey", "getTokenCZ", "getTokenES", "getTokenEY", "getTokenEZ", "getTokenR1", "getTrack2", "getTrack2Crc", "getTrack2Length", "getTrack2Op", "getVersion", "getVersionName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EncryptedCardRequestDto {

    @SerializedName("application_label")
    @NotNull
    private final String applicationLabel;

    @SerializedName("application_preferred_name")
    @NotNull
    private final String applicationPreferredName;

    @SerializedName("bin")
    @NotNull
    private final String cardBin;

    @SerializedName("emv_tags")
    @Nullable
    private final EmvTagsRequestDto emvTags;

    @SerializedName("hex_sign")
    @Nullable
    private final String hexSign;

    @SerializedName("holder_name")
    @NotNull
    private final String holderName;

    @SerializedName("latitude")
    private final double latitude;

    @SerializedName("longitude")
    private final double longitude;

    @SerializedName("model")
    @NotNull
    private final String model;

    @SerializedName("pin_status")
    @NotNull
    private final String pinStatus;

    @SerializedName("read_mode")
    @NotNull
    private final String readMode;

    @SerializedName(EglobalUtils.REAL_COUNTER)
    @NotNull
    private final String realCounter;

    @SerializedName("serial")
    @NotNull
    private final String serial;

    @SerializedName(EglobalUtils.SERIAL_KEY)
    @NotNull
    private final String serialKey;

    @SerializedName("tokenCZ")
    @NotNull
    private final String tokenCZ;

    @SerializedName("tokenES")
    @NotNull
    private final String tokenES;

    @SerializedName("tokenEY")
    @NotNull
    private final String tokenEY;

    @SerializedName("tokenEZ")
    @NotNull
    private final String tokenEZ;

    @SerializedName("tokenR1")
    @NotNull
    private final String tokenR1;

    @SerializedName(EglobalUtils.TRACK2)
    @NotNull
    private final String track2;

    @SerializedName(EglobalUtils.TRACK2_CRC)
    @NotNull
    private final String track2Crc;

    @SerializedName(EglobalUtils.TRACK2_LENGTH)
    @NotNull
    private final String track2Length;

    @SerializedName("track2_op")
    @NotNull
    private final String track2Op;

    @SerializedName("version")
    @NotNull
    private final String version;

    @SerializedName("version_name")
    @NotNull
    private final String versionName;

    public EncryptedCardRequestDto(@Nullable EmvTagsRequestDto emvTagsRequestDto, @NotNull String holderName, @NotNull String model, @NotNull String pinStatus, @NotNull String readMode, @NotNull String serialKey, @NotNull String tokenES, @NotNull String tokenEZ, @NotNull String track2Op, @NotNull String version, @NotNull String versionName, @NotNull String tokenEY, @NotNull String tokenCZ, double d2, double d3, @Nullable String str, @NotNull String realCounter, @NotNull String track2Length, @NotNull String track2, @NotNull String track2Crc, @NotNull String tokenR1, @NotNull String cardBin, @NotNull String serial, @NotNull String applicationPreferredName, @NotNull String applicationLabel) {
        Intrinsics.checkNotNullParameter(holderName, "holderName");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(pinStatus, "pinStatus");
        Intrinsics.checkNotNullParameter(readMode, "readMode");
        Intrinsics.checkNotNullParameter(serialKey, "serialKey");
        Intrinsics.checkNotNullParameter(tokenES, "tokenES");
        Intrinsics.checkNotNullParameter(tokenEZ, "tokenEZ");
        Intrinsics.checkNotNullParameter(track2Op, "track2Op");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(tokenEY, "tokenEY");
        Intrinsics.checkNotNullParameter(tokenCZ, "tokenCZ");
        Intrinsics.checkNotNullParameter(realCounter, "realCounter");
        Intrinsics.checkNotNullParameter(track2Length, "track2Length");
        Intrinsics.checkNotNullParameter(track2, "track2");
        Intrinsics.checkNotNullParameter(track2Crc, "track2Crc");
        Intrinsics.checkNotNullParameter(tokenR1, "tokenR1");
        Intrinsics.checkNotNullParameter(cardBin, "cardBin");
        Intrinsics.checkNotNullParameter(serial, "serial");
        Intrinsics.checkNotNullParameter(applicationPreferredName, "applicationPreferredName");
        Intrinsics.checkNotNullParameter(applicationLabel, "applicationLabel");
        this.emvTags = emvTagsRequestDto;
        this.holderName = holderName;
        this.model = model;
        this.pinStatus = pinStatus;
        this.readMode = readMode;
        this.serialKey = serialKey;
        this.tokenES = tokenES;
        this.tokenEZ = tokenEZ;
        this.track2Op = track2Op;
        this.version = version;
        this.versionName = versionName;
        this.tokenEY = tokenEY;
        this.tokenCZ = tokenCZ;
        this.longitude = d2;
        this.latitude = d3;
        this.hexSign = str;
        this.realCounter = realCounter;
        this.track2Length = track2Length;
        this.track2 = track2;
        this.track2Crc = track2Crc;
        this.tokenR1 = tokenR1;
        this.cardBin = cardBin;
        this.serial = serial;
        this.applicationPreferredName = applicationPreferredName;
        this.applicationLabel = applicationLabel;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EmvTagsRequestDto getEmvTags() {
        return this.emvTags;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTokenEY() {
        return this.tokenEY;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTokenCZ() {
        return this.tokenCZ;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getHexSign() {
        return this.hexSign;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getRealCounter() {
        return this.realCounter;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getTrack2Length() {
        return this.track2Length;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getTrack2() {
        return this.track2;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHolderName() {
        return this.holderName;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getTrack2Crc() {
        return this.track2Crc;
    }

    @NotNull
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getTokenR1() {
        return this.tokenR1;
    }

    @NotNull
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getCardBin() {
        return this.cardBin;
    }

    @NotNull
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getSerial() {
        return this.serial;
    }

    @NotNull
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getApplicationPreferredName() {
        return this.applicationPreferredName;
    }

    @NotNull
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getApplicationLabel() {
        return this.applicationLabel;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPinStatus() {
        return this.pinStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getReadMode() {
        return this.readMode;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSerialKey() {
        return this.serialKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTokenES() {
        return this.tokenES;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTokenEZ() {
        return this.tokenEZ;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTrack2Op() {
        return this.track2Op;
    }

    @NotNull
    public final EncryptedCardRequestDto copy(@Nullable EmvTagsRequestDto emvTags, @NotNull String holderName, @NotNull String model, @NotNull String pinStatus, @NotNull String readMode, @NotNull String serialKey, @NotNull String tokenES, @NotNull String tokenEZ, @NotNull String track2Op, @NotNull String version, @NotNull String versionName, @NotNull String tokenEY, @NotNull String tokenCZ, double longitude, double latitude, @Nullable String hexSign, @NotNull String realCounter, @NotNull String track2Length, @NotNull String track2, @NotNull String track2Crc, @NotNull String tokenR1, @NotNull String cardBin, @NotNull String serial, @NotNull String applicationPreferredName, @NotNull String applicationLabel) {
        Intrinsics.checkNotNullParameter(holderName, "holderName");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(pinStatus, "pinStatus");
        Intrinsics.checkNotNullParameter(readMode, "readMode");
        Intrinsics.checkNotNullParameter(serialKey, "serialKey");
        Intrinsics.checkNotNullParameter(tokenES, "tokenES");
        Intrinsics.checkNotNullParameter(tokenEZ, "tokenEZ");
        Intrinsics.checkNotNullParameter(track2Op, "track2Op");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(tokenEY, "tokenEY");
        Intrinsics.checkNotNullParameter(tokenCZ, "tokenCZ");
        Intrinsics.checkNotNullParameter(realCounter, "realCounter");
        Intrinsics.checkNotNullParameter(track2Length, "track2Length");
        Intrinsics.checkNotNullParameter(track2, "track2");
        Intrinsics.checkNotNullParameter(track2Crc, "track2Crc");
        Intrinsics.checkNotNullParameter(tokenR1, "tokenR1");
        Intrinsics.checkNotNullParameter(cardBin, "cardBin");
        Intrinsics.checkNotNullParameter(serial, "serial");
        Intrinsics.checkNotNullParameter(applicationPreferredName, "applicationPreferredName");
        Intrinsics.checkNotNullParameter(applicationLabel, "applicationLabel");
        return new EncryptedCardRequestDto(emvTags, holderName, model, pinStatus, readMode, serialKey, tokenES, tokenEZ, track2Op, version, versionName, tokenEY, tokenCZ, longitude, latitude, hexSign, realCounter, track2Length, track2, track2Crc, tokenR1, cardBin, serial, applicationPreferredName, applicationLabel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncryptedCardRequestDto)) {
            return false;
        }
        EncryptedCardRequestDto encryptedCardRequestDto = (EncryptedCardRequestDto) other;
        return Intrinsics.areEqual(this.emvTags, encryptedCardRequestDto.emvTags) && Intrinsics.areEqual(this.holderName, encryptedCardRequestDto.holderName) && Intrinsics.areEqual(this.model, encryptedCardRequestDto.model) && Intrinsics.areEqual(this.pinStatus, encryptedCardRequestDto.pinStatus) && Intrinsics.areEqual(this.readMode, encryptedCardRequestDto.readMode) && Intrinsics.areEqual(this.serialKey, encryptedCardRequestDto.serialKey) && Intrinsics.areEqual(this.tokenES, encryptedCardRequestDto.tokenES) && Intrinsics.areEqual(this.tokenEZ, encryptedCardRequestDto.tokenEZ) && Intrinsics.areEqual(this.track2Op, encryptedCardRequestDto.track2Op) && Intrinsics.areEqual(this.version, encryptedCardRequestDto.version) && Intrinsics.areEqual(this.versionName, encryptedCardRequestDto.versionName) && Intrinsics.areEqual(this.tokenEY, encryptedCardRequestDto.tokenEY) && Intrinsics.areEqual(this.tokenCZ, encryptedCardRequestDto.tokenCZ) && Double.compare(this.longitude, encryptedCardRequestDto.longitude) == 0 && Double.compare(this.latitude, encryptedCardRequestDto.latitude) == 0 && Intrinsics.areEqual(this.hexSign, encryptedCardRequestDto.hexSign) && Intrinsics.areEqual(this.realCounter, encryptedCardRequestDto.realCounter) && Intrinsics.areEqual(this.track2Length, encryptedCardRequestDto.track2Length) && Intrinsics.areEqual(this.track2, encryptedCardRequestDto.track2) && Intrinsics.areEqual(this.track2Crc, encryptedCardRequestDto.track2Crc) && Intrinsics.areEqual(this.tokenR1, encryptedCardRequestDto.tokenR1) && Intrinsics.areEqual(this.cardBin, encryptedCardRequestDto.cardBin) && Intrinsics.areEqual(this.serial, encryptedCardRequestDto.serial) && Intrinsics.areEqual(this.applicationPreferredName, encryptedCardRequestDto.applicationPreferredName) && Intrinsics.areEqual(this.applicationLabel, encryptedCardRequestDto.applicationLabel);
    }

    @NotNull
    public final String getApplicationLabel() {
        return this.applicationLabel;
    }

    @NotNull
    public final String getApplicationPreferredName() {
        return this.applicationPreferredName;
    }

    @NotNull
    public final String getCardBin() {
        return this.cardBin;
    }

    @Nullable
    public final EmvTagsRequestDto getEmvTags() {
        return this.emvTags;
    }

    @Nullable
    public final String getHexSign() {
        return this.hexSign;
    }

    @NotNull
    public final String getHolderName() {
        return this.holderName;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getPinStatus() {
        return this.pinStatus;
    }

    @NotNull
    public final String getReadMode() {
        return this.readMode;
    }

    @NotNull
    public final String getRealCounter() {
        return this.realCounter;
    }

    @NotNull
    public final String getSerial() {
        return this.serial;
    }

    @NotNull
    public final String getSerialKey() {
        return this.serialKey;
    }

    @NotNull
    public final String getTokenCZ() {
        return this.tokenCZ;
    }

    @NotNull
    public final String getTokenES() {
        return this.tokenES;
    }

    @NotNull
    public final String getTokenEY() {
        return this.tokenEY;
    }

    @NotNull
    public final String getTokenEZ() {
        return this.tokenEZ;
    }

    @NotNull
    public final String getTokenR1() {
        return this.tokenR1;
    }

    @NotNull
    public final String getTrack2() {
        return this.track2;
    }

    @NotNull
    public final String getTrack2Crc() {
        return this.track2Crc;
    }

    @NotNull
    public final String getTrack2Length() {
        return this.track2Length;
    }

    @NotNull
    public final String getTrack2Op() {
        return this.track2Op;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        EmvTagsRequestDto emvTagsRequestDto = this.emvTags;
        int iC = n1.c(this.tokenCZ, n1.c(this.tokenEY, n1.c(this.versionName, n1.c(this.version, n1.c(this.track2Op, n1.c(this.tokenEZ, n1.c(this.tokenES, n1.c(this.serialKey, n1.c(this.readMode, n1.c(this.pinStatus, n1.c(this.model, n1.c(this.holderName, (emvTagsRequestDto == null ? 0 : emvTagsRequestDto.hashCode()) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        long jDoubleToLongBits = Double.doubleToLongBits(this.longitude);
        int i10 = (iC + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.latitude);
        int i11 = (i10 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        String str = this.hexSign;
        return this.applicationLabel.hashCode() + n1.c(this.applicationPreferredName, n1.c(this.serial, n1.c(this.cardBin, n1.c(this.tokenR1, n1.c(this.track2Crc, n1.c(this.track2, n1.c(this.track2Length, n1.c(this.realCounter, (i11 + (str != null ? str.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        EmvTagsRequestDto emvTagsRequestDto = this.emvTags;
        String str = this.holderName;
        String str2 = this.model;
        String str3 = this.pinStatus;
        String str4 = this.readMode;
        String str5 = this.serialKey;
        String str6 = this.tokenES;
        String str7 = this.tokenEZ;
        String str8 = this.track2Op;
        String str9 = this.version;
        String str10 = this.versionName;
        String str11 = this.tokenEY;
        String str12 = this.tokenCZ;
        double d2 = this.longitude;
        double d3 = this.latitude;
        String str13 = this.hexSign;
        String str14 = this.realCounter;
        String str15 = this.track2Length;
        String str16 = this.track2;
        String str17 = this.track2Crc;
        String str18 = this.tokenR1;
        String str19 = this.cardBin;
        String str20 = this.serial;
        String str21 = this.applicationPreferredName;
        String str22 = this.applicationLabel;
        StringBuilder sb2 = new StringBuilder("EncryptedCardRequestDto(emvTags=");
        sb2.append(emvTagsRequestDto);
        sb2.append(", holderName=");
        sb2.append(str);
        sb2.append(", model=");
        k.e(sb2, str2, ", pinStatus=", str3, ", readMode=");
        k.e(sb2, str4, ", serialKey=", str5, ", tokenES=");
        k.e(sb2, str6, ", tokenEZ=", str7, ", track2Op=");
        k.e(sb2, str8, ", version=", str9, ", versionName=");
        k.e(sb2, str10, ", tokenEY=", str11, ", tokenCZ=");
        sb2.append(str12);
        sb2.append(", longitude=");
        sb2.append(d2);
        v.f(sb2, ", latitude=", d3, ", hexSign=");
        k.e(sb2, str13, ", realCounter=", str14, ", track2Length=");
        k.e(sb2, str15, ", track2=", str16, ", track2Crc=");
        k.e(sb2, str17, ", tokenR1=", str18, ", cardBin=");
        k.e(sb2, str19, ", serial=", str20, ", applicationPreferredName=");
        return c.b(sb2, str21, ", applicationLabel=", str22, ")");
    }

    public /* synthetic */ EncryptedCardRequestDto(EmvTagsRequestDto emvTagsRequestDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, double d2, double d3, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : emvTagsRequestDto, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, d2, d3, (i10 & 32768) != 0 ? null : str13, str14, str15, str16, str17, str18, str19, str20, str21, str22);
    }
}
