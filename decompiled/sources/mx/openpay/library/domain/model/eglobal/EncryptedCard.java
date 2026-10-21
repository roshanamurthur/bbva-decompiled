package mx.openpay.library.domain.model.eglobal;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.util.EglobalUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EncryptedCard.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b=\b\u0086\b\u0018\u00002\u00020\u0001Bó\u0001\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020\u0004\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010)\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u0006\u0010+\u001a\u00020\u0004\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u00105\u001a\u00020\u0004\u0012\u0006\u00106\u001a\u00020\u0004\u0012\u0006\u00107\u001a\u00020\u0004¢\u0006\u0004\by\u0010zJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\u009e\u0002\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u00105\u001a\u00020\u00042\b\b\u0002\u00106\u001a\u00020\u00042\b\b\u0002\u00107\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b8\u00109J\t\u0010:\u001a\u00020\u0004HÖ\u0001J\t\u0010<\u001a\u00020;HÖ\u0001J\u0013\u0010?\u001a\u00020>2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bH\u0010E\u001a\u0004\bI\u0010GR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bJ\u0010E\u001a\u0004\bK\u0010GR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bL\u0010E\u001a\u0004\bM\u0010GR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bN\u0010E\u001a\u0004\bO\u0010GR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bP\u0010E\u001a\u0004\bQ\u0010GR\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u0010E\u001a\u0004\bS\u0010GR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bT\u0010E\u001a\u0004\bU\u0010GR\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bV\u0010E\u001a\u0004\bW\u0010GR\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bX\u0010E\u001a\u0004\bY\u0010GR\u0017\u0010*\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bZ\u0010E\u001a\u0004\b[\u0010GR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\\\u0010E\u001a\u0004\b]\u0010GR\u0019\u0010,\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010\u0013R\u0019\u0010-\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\ba\u0010_\u001a\u0004\bb\u0010\u0013R$\u0010.\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010E\u001a\u0004\bd\u0010G\"\u0004\be\u0010fR\u0019\u0010/\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bg\u0010E\u001a\u0004\bh\u0010GR\u0019\u00100\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bi\u0010E\u001a\u0004\bj\u0010GR\u0019\u00101\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bk\u0010E\u001a\u0004\bl\u0010GR\u0019\u00102\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bm\u0010E\u001a\u0004\bn\u0010GR\u0019\u00103\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bo\u0010E\u001a\u0004\bp\u0010GR\u0019\u00104\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bq\u0010E\u001a\u0004\br\u0010GR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bs\u0010E\u001a\u0004\bt\u0010GR\u0017\u00106\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bu\u0010E\u001a\u0004\bv\u0010GR\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bw\u0010E\u001a\u0004\bx\u0010G¨\u0006{"}, d2 = {"Lmx/openpay/library/domain/model/eglobal/EncryptedCard;", "", "Lmx/openpay/library/domain/model/eglobal/EmvTags;", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "", "component14", "()Ljava/lang/Double;", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "emvTags", "holderName", "model", "pinStatus", "readMode", "serialKey", "tokenES", "tokenEZ", "track2Op", "version", "versionName", "tokenEY", "tokenCZ", "longitude", "latitude", "hexSign", "realCounter", "track2Length", EglobalUtils.TRACK2, "track2Crc", "tokenR1", "cardBin", "serial", "applicationPreferredName", "applicationLabel", "copy", "(Lmx/openpay/library/domain/model/eglobal/EmvTags;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lmx/openpay/library/domain/model/eglobal/EncryptedCard;", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lmx/openpay/library/domain/model/eglobal/EmvTags;", "getEmvTags", "()Lmx/openpay/library/domain/model/eglobal/EmvTags;", "b", "Ljava/lang/String;", "getHolderName", "()Ljava/lang/String;", "c", "getModel", "d", "getPinStatus", "e", "getReadMode", "f", "getSerialKey", "g", "getTokenES", "h", "getTokenEZ", "i", "getTrack2Op", "j", "getVersion", "k", "getVersionName", "l", "getTokenEY", "m", "getTokenCZ", "n", "Ljava/lang/Double;", "getLongitude", "o", "getLatitude", "p", "getHexSign", "setHexSign", "(Ljava/lang/String;)V", "q", "getRealCounter", "r", "getTrack2Length", "s", "getTrack2", "t", "getTrack2Crc", "u", "getTokenR1", SharedPrefsStorage.VERSION_KEY, "getCardBin", "w", "getSerial", "x", "getApplicationPreferredName", "y", "getApplicationLabel", "<init>", "(Lmx/openpay/library/domain/model/eglobal/EmvTags;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class EncryptedCard {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final EmvTags emvTags;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String holderName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String model;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String pinStatus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String readMode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String serialKey;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tokenES;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tokenEZ;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String track2Op;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String version;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String versionName;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tokenEY;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final String tokenCZ;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Double longitude;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Double latitude;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String hexSign;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String realCounter;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String track2Length;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String track2;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String track2Crc;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String tokenR1;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String cardBin;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String serial;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String applicationPreferredName;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String applicationLabel;

    public EncryptedCard(@Nullable EmvTags emvTags, @NotNull String holderName, @NotNull String model, @NotNull String pinStatus, @NotNull String readMode, @NotNull String serialKey, @NotNull String tokenES, @NotNull String tokenEZ, @NotNull String track2Op, @NotNull String version, @NotNull String versionName, @NotNull String tokenEY, @NotNull String tokenCZ, @Nullable Double d2, @Nullable Double d3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull String serial, @NotNull String applicationPreferredName, @NotNull String applicationLabel) {
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
        Intrinsics.checkNotNullParameter(serial, "serial");
        Intrinsics.checkNotNullParameter(applicationPreferredName, "applicationPreferredName");
        Intrinsics.checkNotNullParameter(applicationLabel, "applicationLabel");
        this.emvTags = emvTags;
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
        this.realCounter = str2;
        this.track2Length = str3;
        this.track2 = str4;
        this.track2Crc = str5;
        this.tokenR1 = str6;
        this.cardBin = str7;
        this.serial = serial;
        this.applicationPreferredName = applicationPreferredName;
        this.applicationLabel = applicationLabel;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EmvTags getEmvTags() {
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

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getHexSign() {
        return this.hexSign;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getRealCounter() {
        return this.realCounter;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getTrack2Length() {
        return this.track2Length;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getTrack2() {
        return this.track2;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHolderName() {
        return this.holderName;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getTrack2Crc() {
        return this.track2Crc;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getTokenR1() {
        return this.tokenR1;
    }

    @Nullable
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
    public final EncryptedCard copy(@Nullable EmvTags emvTags, @NotNull String holderName, @NotNull String model, @NotNull String pinStatus, @NotNull String readMode, @NotNull String serialKey, @NotNull String tokenES, @NotNull String tokenEZ, @NotNull String track2Op, @NotNull String version, @NotNull String versionName, @NotNull String tokenEY, @NotNull String tokenCZ, @Nullable Double longitude, @Nullable Double latitude, @Nullable String hexSign, @Nullable String realCounter, @Nullable String track2Length, @Nullable String track2, @Nullable String track2Crc, @Nullable String tokenR1, @Nullable String cardBin, @NotNull String serial, @NotNull String applicationPreferredName, @NotNull String applicationLabel) {
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
        Intrinsics.checkNotNullParameter(serial, "serial");
        Intrinsics.checkNotNullParameter(applicationPreferredName, "applicationPreferredName");
        Intrinsics.checkNotNullParameter(applicationLabel, "applicationLabel");
        return new EncryptedCard(emvTags, holderName, model, pinStatus, readMode, serialKey, tokenES, tokenEZ, track2Op, version, versionName, tokenEY, tokenCZ, longitude, latitude, hexSign, realCounter, track2Length, track2, track2Crc, tokenR1, cardBin, serial, applicationPreferredName, applicationLabel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncryptedCard)) {
            return false;
        }
        EncryptedCard encryptedCard = (EncryptedCard) other;
        return Intrinsics.areEqual(this.emvTags, encryptedCard.emvTags) && Intrinsics.areEqual(this.holderName, encryptedCard.holderName) && Intrinsics.areEqual(this.model, encryptedCard.model) && Intrinsics.areEqual(this.pinStatus, encryptedCard.pinStatus) && Intrinsics.areEqual(this.readMode, encryptedCard.readMode) && Intrinsics.areEqual(this.serialKey, encryptedCard.serialKey) && Intrinsics.areEqual(this.tokenES, encryptedCard.tokenES) && Intrinsics.areEqual(this.tokenEZ, encryptedCard.tokenEZ) && Intrinsics.areEqual(this.track2Op, encryptedCard.track2Op) && Intrinsics.areEqual(this.version, encryptedCard.version) && Intrinsics.areEqual(this.versionName, encryptedCard.versionName) && Intrinsics.areEqual(this.tokenEY, encryptedCard.tokenEY) && Intrinsics.areEqual(this.tokenCZ, encryptedCard.tokenCZ) && Intrinsics.areEqual((Object) this.longitude, (Object) encryptedCard.longitude) && Intrinsics.areEqual((Object) this.latitude, (Object) encryptedCard.latitude) && Intrinsics.areEqual(this.hexSign, encryptedCard.hexSign) && Intrinsics.areEqual(this.realCounter, encryptedCard.realCounter) && Intrinsics.areEqual(this.track2Length, encryptedCard.track2Length) && Intrinsics.areEqual(this.track2, encryptedCard.track2) && Intrinsics.areEqual(this.track2Crc, encryptedCard.track2Crc) && Intrinsics.areEqual(this.tokenR1, encryptedCard.tokenR1) && Intrinsics.areEqual(this.cardBin, encryptedCard.cardBin) && Intrinsics.areEqual(this.serial, encryptedCard.serial) && Intrinsics.areEqual(this.applicationPreferredName, encryptedCard.applicationPreferredName) && Intrinsics.areEqual(this.applicationLabel, encryptedCard.applicationLabel);
    }

    @NotNull
    public final String getApplicationLabel() {
        return this.applicationLabel;
    }

    @NotNull
    public final String getApplicationPreferredName() {
        return this.applicationPreferredName;
    }

    @Nullable
    public final String getCardBin() {
        return this.cardBin;
    }

    @Nullable
    public final EmvTags getEmvTags() {
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

    @Nullable
    public final Double getLatitude() {
        return this.latitude;
    }

    @Nullable
    public final Double getLongitude() {
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

    @Nullable
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

    @Nullable
    public final String getTokenR1() {
        return this.tokenR1;
    }

    @Nullable
    public final String getTrack2() {
        return this.track2;
    }

    @Nullable
    public final String getTrack2Crc() {
        return this.track2Crc;
    }

    @Nullable
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
        EmvTags emvTags = this.emvTags;
        int iC = n1.c(this.tokenCZ, n1.c(this.tokenEY, n1.c(this.versionName, n1.c(this.version, n1.c(this.track2Op, n1.c(this.tokenEZ, n1.c(this.tokenES, n1.c(this.serialKey, n1.c(this.readMode, n1.c(this.pinStatus, n1.c(this.model, n1.c(this.holderName, (emvTags == null ? 0 : emvTags.hashCode()) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        Double d2 = this.longitude;
        int iHashCode = (iC + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.latitude;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str = this.hexSign;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.realCounter;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.track2Length;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.track2;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.track2Crc;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tokenR1;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.cardBin;
        return this.applicationLabel.hashCode() + n1.c(this.applicationPreferredName, n1.c(this.serial, (iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31, 31), 31);
    }

    public final void setHexSign(@Nullable String str) {
        this.hexSign = str;
    }

    @NotNull
    public String toString() {
        String str = this.hexSign;
        StringBuilder sb2 = new StringBuilder("EncryptedCard(emvTags=");
        sb2.append(this.emvTags);
        sb2.append(", holderName=");
        sb2.append(this.holderName);
        sb2.append(", model=");
        sb2.append(this.model);
        sb2.append(", pinStatus=");
        sb2.append(this.pinStatus);
        sb2.append(", readMode=");
        sb2.append(this.readMode);
        sb2.append(", serialKey=");
        sb2.append(this.serialKey);
        sb2.append(", tokenES=");
        sb2.append(this.tokenES);
        sb2.append(", tokenEZ=");
        sb2.append(this.tokenEZ);
        sb2.append(", track2Op=");
        sb2.append(this.track2Op);
        sb2.append(", version=");
        sb2.append(this.version);
        sb2.append(", versionName=");
        sb2.append(this.versionName);
        sb2.append(", tokenEY=");
        sb2.append(this.tokenEY);
        sb2.append(", tokenCZ=");
        sb2.append(this.tokenCZ);
        sb2.append(", longitude=");
        sb2.append(this.longitude);
        sb2.append(", latitude=");
        sb2.append(this.latitude);
        sb2.append(", hexSign=");
        sb2.append(str);
        sb2.append(", realCounter=");
        sb2.append(this.realCounter);
        sb2.append(", track2Length=");
        sb2.append(this.track2Length);
        sb2.append(", track2=");
        sb2.append(this.track2);
        sb2.append(", track2Crc=");
        sb2.append(this.track2Crc);
        sb2.append(", tokenR1=");
        sb2.append(this.tokenR1);
        sb2.append(", cardBin=");
        sb2.append(this.cardBin);
        sb2.append(", serial=");
        sb2.append(this.serial);
        sb2.append(", applicationPreferredName=");
        sb2.append(this.applicationPreferredName);
        sb2.append(", applicationLabel=");
        return d.f(sb2, this.applicationLabel, ")");
    }

    public /* synthetic */ EncryptedCard(EmvTags emvTags, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Double d2, Double d3, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : emvTags, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, d2, d3, (i10 & 32768) != 0 ? null : str13, (i10 & 65536) != 0 ? null : str14, (i10 & 131072) != 0 ? null : str15, (i10 & 262144) != 0 ? null : str16, (i10 & 524288) != 0 ? null : str17, (i10 & 1048576) != 0 ? null : str18, (i10 & 2097152) != 0 ? null : str19, str20, str21, str22);
    }
}
