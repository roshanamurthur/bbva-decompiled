package mx.openpay.library.data.bluetooth.eglobal.model;

import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.c;
import androidx.camera.core.impl.v;
import androidx.collection.k;
import androidx.core.app.NotificationCompat;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.google.pay.GoogleTapAndPay;
import com.google.gson.annotations.SerializedName;
import com.sun.mail.imap.IMAPStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.util.EglobalUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: C51Response.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\bK\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0002\u0010\u001cJ\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003Jû\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010S\u001a\u00020\u0003HÖ\u0001J\t\u0010T\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0016\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0016\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0016\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0016\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0016\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0016\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0016\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001eR\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001eR\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001e¨\u0006U"}, d2 = {"Lmx/openpay/library/data/bluetooth/eglobal/model/C51Response;", "", "codResponse", "", "status", "", "message", IMAPStore.ID_COMMAND, "resProc", GoogleTapAndPay.KEY_PAN, "cardHolder", "cardBin", "track3", EglobalUtils.TRACK2, "track1", "ccv", "readMode", "e1", "e2", "serial", "version", "pinStatus", "model", "tokenES", "tokenR1", "tokenEZ", "tokenEY", "tokenCZ", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardBin", "()Ljava/lang/String;", "getCardHolder", "getCcv", "getCodResponse", "()I", "getCommand", "getE1", "getE2", "getMessage", "getModel", "getPan", "getPinStatus", "getReadMode", "getResProc", "getSerial", "getStatus", "getTokenCZ", "getTokenES", "getTokenEY", "getTokenEZ", "getTokenR1", "getTrack1", "getTrack2", "getTrack3", "getVersion", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class C51Response {

    @SerializedName("cardbin")
    @NotNull
    private final String cardBin;

    @SerializedName("cardholder")
    @NotNull
    private final String cardHolder;

    @SerializedName("ccv")
    @NotNull
    private final String ccv;

    @SerializedName("codResponse")
    private final int codResponse;

    @SerializedName(IMAPStore.ID_COMMAND)
    @NotNull
    private final String command;

    @SerializedName("e1")
    @NotNull
    private final String e1;

    @SerializedName("e2")
    @NotNull
    private final String e2;

    @SerializedName(NotificationCompat.CATEGORY_MESSAGE)
    @NotNull
    private final String message;

    @SerializedName("modelo")
    @NotNull
    private final String model;

    @SerializedName(GoogleTapAndPay.KEY_PAN)
    @NotNull
    private final String pan;

    @SerializedName("pinstatus")
    @NotNull
    private final String pinStatus;

    @SerializedName("read_mode")
    @NotNull
    private final String readMode;

    @SerializedName("res_proc")
    @NotNull
    private final String resProc;

    @SerializedName("serial")
    @NotNull
    private final String serial;

    @SerializedName("status")
    @NotNull
    private final String status;

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
    @Nullable
    private final String tokenEZ;

    @SerializedName("tokenR1")
    @NotNull
    private final String tokenR1;

    @SerializedName("track1")
    @NotNull
    private final String track1;

    @SerializedName(EglobalUtils.TRACK2)
    @NotNull
    private final String track2;

    @SerializedName("track3")
    @NotNull
    private final String track3;

    @SerializedName("version")
    @NotNull
    private final String version;

    public C51Response(int i10, @NotNull String status, @NotNull String message, @NotNull String command, @NotNull String resProc, @NotNull String pan, @NotNull String cardHolder, @NotNull String cardBin, @NotNull String track3, @NotNull String track2, @NotNull String track1, @NotNull String ccv, @NotNull String readMode, @NotNull String e5, @NotNull String e7, @NotNull String serial, @NotNull String version, @NotNull String pinStatus, @NotNull String model, @NotNull String tokenES, @NotNull String tokenR1, @Nullable String str, @NotNull String tokenEY, @NotNull String tokenCZ) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(resProc, "resProc");
        Intrinsics.checkNotNullParameter(pan, "pan");
        Intrinsics.checkNotNullParameter(cardHolder, "cardHolder");
        Intrinsics.checkNotNullParameter(cardBin, "cardBin");
        Intrinsics.checkNotNullParameter(track3, "track3");
        Intrinsics.checkNotNullParameter(track2, "track2");
        Intrinsics.checkNotNullParameter(track1, "track1");
        Intrinsics.checkNotNullParameter(ccv, "ccv");
        Intrinsics.checkNotNullParameter(readMode, "readMode");
        Intrinsics.checkNotNullParameter(e5, "e1");
        Intrinsics.checkNotNullParameter(e7, "e2");
        Intrinsics.checkNotNullParameter(serial, "serial");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(pinStatus, "pinStatus");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tokenES, "tokenES");
        Intrinsics.checkNotNullParameter(tokenR1, "tokenR1");
        Intrinsics.checkNotNullParameter(tokenEY, "tokenEY");
        Intrinsics.checkNotNullParameter(tokenCZ, "tokenCZ");
        this.codResponse = i10;
        this.status = status;
        this.message = message;
        this.command = command;
        this.resProc = resProc;
        this.pan = pan;
        this.cardHolder = cardHolder;
        this.cardBin = cardBin;
        this.track3 = track3;
        this.track2 = track2;
        this.track1 = track1;
        this.ccv = ccv;
        this.readMode = readMode;
        this.e1 = e5;
        this.e2 = e7;
        this.serial = serial;
        this.version = version;
        this.pinStatus = pinStatus;
        this.model = model;
        this.tokenES = tokenES;
        this.tokenR1 = tokenR1;
        this.tokenEZ = str;
        this.tokenEY = tokenEY;
        this.tokenCZ = tokenCZ;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCodResponse() {
        return this.codResponse;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTrack2() {
        return this.track2;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTrack1() {
        return this.track1;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCcv() {
        return this.ccv;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getReadMode() {
        return this.readMode;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getE1() {
        return this.e1;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getE2() {
        return this.e2;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getSerial() {
        return this.serial;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPinStatus() {
        return this.pinStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getTokenES() {
        return this.tokenES;
    }

    @NotNull
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getTokenR1() {
        return this.tokenR1;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getTokenEZ() {
        return this.tokenEZ;
    }

    @NotNull
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getTokenEY() {
        return this.tokenEY;
    }

    @NotNull
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getTokenCZ() {
        return this.tokenCZ;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getResProc() {
        return this.resProc;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPan() {
        return this.pan;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCardHolder() {
        return this.cardHolder;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCardBin() {
        return this.cardBin;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTrack3() {
        return this.track3;
    }

    @NotNull
    public final C51Response copy(int codResponse, @NotNull String status, @NotNull String message, @NotNull String command, @NotNull String resProc, @NotNull String pan, @NotNull String cardHolder, @NotNull String cardBin, @NotNull String track3, @NotNull String track2, @NotNull String track1, @NotNull String ccv, @NotNull String readMode, @NotNull String e5, @NotNull String e7, @NotNull String serial, @NotNull String version, @NotNull String pinStatus, @NotNull String model, @NotNull String tokenES, @NotNull String tokenR1, @Nullable String tokenEZ, @NotNull String tokenEY, @NotNull String tokenCZ) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(resProc, "resProc");
        Intrinsics.checkNotNullParameter(pan, "pan");
        Intrinsics.checkNotNullParameter(cardHolder, "cardHolder");
        Intrinsics.checkNotNullParameter(cardBin, "cardBin");
        Intrinsics.checkNotNullParameter(track3, "track3");
        Intrinsics.checkNotNullParameter(track2, "track2");
        Intrinsics.checkNotNullParameter(track1, "track1");
        Intrinsics.checkNotNullParameter(ccv, "ccv");
        Intrinsics.checkNotNullParameter(readMode, "readMode");
        Intrinsics.checkNotNullParameter(e5, "e1");
        Intrinsics.checkNotNullParameter(e7, "e2");
        Intrinsics.checkNotNullParameter(serial, "serial");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(pinStatus, "pinStatus");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tokenES, "tokenES");
        Intrinsics.checkNotNullParameter(tokenR1, "tokenR1");
        Intrinsics.checkNotNullParameter(tokenEY, "tokenEY");
        Intrinsics.checkNotNullParameter(tokenCZ, "tokenCZ");
        return new C51Response(codResponse, status, message, command, resProc, pan, cardHolder, cardBin, track3, track2, track1, ccv, readMode, e5, e7, serial, version, pinStatus, model, tokenES, tokenR1, tokenEZ, tokenEY, tokenCZ);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C51Response)) {
            return false;
        }
        C51Response c51Response = (C51Response) other;
        return this.codResponse == c51Response.codResponse && Intrinsics.areEqual(this.status, c51Response.status) && Intrinsics.areEqual(this.message, c51Response.message) && Intrinsics.areEqual(this.command, c51Response.command) && Intrinsics.areEqual(this.resProc, c51Response.resProc) && Intrinsics.areEqual(this.pan, c51Response.pan) && Intrinsics.areEqual(this.cardHolder, c51Response.cardHolder) && Intrinsics.areEqual(this.cardBin, c51Response.cardBin) && Intrinsics.areEqual(this.track3, c51Response.track3) && Intrinsics.areEqual(this.track2, c51Response.track2) && Intrinsics.areEqual(this.track1, c51Response.track1) && Intrinsics.areEqual(this.ccv, c51Response.ccv) && Intrinsics.areEqual(this.readMode, c51Response.readMode) && Intrinsics.areEqual(this.e1, c51Response.e1) && Intrinsics.areEqual(this.e2, c51Response.e2) && Intrinsics.areEqual(this.serial, c51Response.serial) && Intrinsics.areEqual(this.version, c51Response.version) && Intrinsics.areEqual(this.pinStatus, c51Response.pinStatus) && Intrinsics.areEqual(this.model, c51Response.model) && Intrinsics.areEqual(this.tokenES, c51Response.tokenES) && Intrinsics.areEqual(this.tokenR1, c51Response.tokenR1) && Intrinsics.areEqual(this.tokenEZ, c51Response.tokenEZ) && Intrinsics.areEqual(this.tokenEY, c51Response.tokenEY) && Intrinsics.areEqual(this.tokenCZ, c51Response.tokenCZ);
    }

    @NotNull
    public final String getCardBin() {
        return this.cardBin;
    }

    @NotNull
    public final String getCardHolder() {
        return this.cardHolder;
    }

    @NotNull
    public final String getCcv() {
        return this.ccv;
    }

    public final int getCodResponse() {
        return this.codResponse;
    }

    @NotNull
    public final String getCommand() {
        return this.command;
    }

    @NotNull
    public final String getE1() {
        return this.e1;
    }

    @NotNull
    public final String getE2() {
        return this.e2;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getPan() {
        return this.pan;
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
    public final String getResProc() {
        return this.resProc;
    }

    @NotNull
    public final String getSerial() {
        return this.serial;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
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

    @Nullable
    public final String getTokenEZ() {
        return this.tokenEZ;
    }

    @NotNull
    public final String getTokenR1() {
        return this.tokenR1;
    }

    @NotNull
    public final String getTrack1() {
        return this.track1;
    }

    @NotNull
    public final String getTrack2() {
        return this.track2;
    }

    @NotNull
    public final String getTrack3() {
        return this.track3;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iC = n1.c(this.tokenR1, n1.c(this.tokenES, n1.c(this.model, n1.c(this.pinStatus, n1.c(this.version, n1.c(this.serial, n1.c(this.e2, n1.c(this.e1, n1.c(this.readMode, n1.c(this.ccv, n1.c(this.track1, n1.c(this.track2, n1.c(this.track3, n1.c(this.cardBin, n1.c(this.cardHolder, n1.c(this.pan, n1.c(this.resProc, n1.c(this.command, n1.c(this.message, n1.c(this.status, this.codResponse * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        String str = this.tokenEZ;
        return this.tokenCZ.hashCode() + n1.c(this.tokenEY, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i10 = this.codResponse;
        String str = this.status;
        String str2 = this.message;
        String str3 = this.command;
        String str4 = this.resProc;
        String str5 = this.pan;
        String str6 = this.cardHolder;
        String str7 = this.cardBin;
        String str8 = this.track3;
        String str9 = this.track2;
        String str10 = this.track1;
        String str11 = this.ccv;
        String str12 = this.readMode;
        String str13 = this.e1;
        String str14 = this.e2;
        String str15 = this.serial;
        String str16 = this.version;
        String str17 = this.pinStatus;
        String str18 = this.model;
        String str19 = this.tokenES;
        String str20 = this.tokenR1;
        String str21 = this.tokenEZ;
        String str22 = this.tokenEY;
        String str23 = this.tokenCZ;
        StringBuilder sbE = v.e("C51Response(codResponse=", i10, ", status=", str, ", message=");
        k.e(sbE, str2, ", command=", str3, ", resProc=");
        k.e(sbE, str4, ", pan=", str5, ", cardHolder=");
        k.e(sbE, str6, ", cardBin=", str7, ", track3=");
        k.e(sbE, str8, ", track2=", str9, ", track1=");
        k.e(sbE, str10, ", ccv=", str11, ", readMode=");
        k.e(sbE, str12, ", e1=", str13, ", e2=");
        k.e(sbE, str14, ", serial=", str15, ", version=");
        k.e(sbE, str16, ", pinStatus=", str17, ", model=");
        k.e(sbE, str18, ", tokenES=", str19, ", tokenR1=");
        k.e(sbE, str20, ", tokenEZ=", str21, ", tokenEY=");
        return c.b(sbE, str22, ", tokenCZ=", str23, ")");
    }
}
