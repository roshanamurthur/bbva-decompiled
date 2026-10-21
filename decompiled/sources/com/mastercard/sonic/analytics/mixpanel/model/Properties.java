package com.mastercard.sonic.analytics.mixpanel.model;

import androidx.camera.camera2.internal.n1;
import androidx.collection.k;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.gson.annotations.SerializedName;
import com.veridas.contextualdata.ContextualDataConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Properties.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0003\b\u0086\u0001\b\u0080\b\u0018\u00002\u00020\u0001:\u0002¦\u0001Bù\u0001\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\u0006\u00100\u001a\u00020\u0002\u0012\b\u00101\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u00102\u001a\u00020\u0002\u0012\u0006\u00103\u001a\u00020\u0002\u0012\u0006\u00104\u001a\u00020\u0015\u0012\u0006\u00105\u001a\u00020\u0015\u0012\u0006\u00106\u001a\u00020\u0015\u0012\u0006\u00107\u001a\u00020\u0015\u0012\u0006\u00108\u001a\u00020\u0015\u0012\u0006\u00109\u001a\u00020\u0015\u0012\u0006\u0010:\u001a\u00020\u0015\u0012\u0006\u0010;\u001a\u00020\u0015\u0012\u0006\u0010<\u001a\u00020\u0015\u0012\u0006\u0010=\u001a\u00020\u0015\u0012\u0006\u0010>\u001a\u00020\u0015\u0012\u0006\u0010?\u001a\u00020!\u0012\u0006\u0010@\u001a\u00020!\u0012\u0006\u0010A\u001a\u00020\u0015¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0015HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0015HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0015HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0015HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0015HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0015HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0015HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0015HÆ\u0003J\t\u0010 \u001a\u00020\u0015HÆ\u0003J\t\u0010\"\u001a\u00020!HÆ\u0003J\t\u0010#\u001a\u00020!HÆ\u0003J\t\u0010$\u001a\u00020\u0015HÆ\u0003Jº\u0002\u0010B\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020\u00022\b\b\u0002\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u00022\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0002\u00100\u001a\u00020\u00022\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u00102\u001a\u00020\u00022\b\b\u0002\u00103\u001a\u00020\u00022\b\b\u0002\u00104\u001a\u00020\u00152\b\b\u0002\u00105\u001a\u00020\u00152\b\b\u0002\u00106\u001a\u00020\u00152\b\b\u0002\u00107\u001a\u00020\u00152\b\b\u0002\u00108\u001a\u00020\u00152\b\b\u0002\u00109\u001a\u00020\u00152\b\b\u0002\u0010:\u001a\u00020\u00152\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\b\b\u0002\u0010=\u001a\u00020\u00152\b\b\u0002\u0010>\u001a\u00020\u00152\b\b\u0002\u0010?\u001a\u00020!2\b\b\u0002\u0010@\u001a\u00020!2\b\b\u0002\u0010A\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\bB\u0010CJ\t\u0010D\u001a\u00020\u0002HÖ\u0001J\t\u0010E\u001a\u00020\u0015HÖ\u0001J\u0013\u0010G\u001a\u00020!2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010%\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\"\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010'\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010I\u001a\u0004\bS\u0010KR\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010I\u001a\u0004\bU\u0010K\"\u0004\bV\u0010WR\u001a\u0010)\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010I\u001a\u0004\bY\u0010KR\"\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bZ\u0010I\u001a\u0004\b[\u0010K\"\u0004\b\\\u0010WR\u001a\u0010+\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010I\u001a\u0004\b^\u0010KR\u001a\u0010,\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010I\u001a\u0004\b`\u0010KR\u001a\u0010-\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010I\u001a\u0004\bb\u0010KR\u001a\u0010.\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010I\u001a\u0004\bd\u0010KR \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010\u0010R\u001a\u00100\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010I\u001a\u0004\bi\u0010KR\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010I\u001a\u0004\bk\u0010KR\u001a\u00102\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010I\u001a\u0004\bm\u0010KR\"\u00103\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bn\u0010I\u001a\u0004\bo\u0010K\"\u0004\bp\u0010WR\"\u00104\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u00105\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bw\u0010r\u001a\u0004\bx\u0010t\"\u0004\by\u0010vR\"\u00106\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bz\u0010r\u001a\u0004\b{\u0010t\"\u0004\b|\u0010vR\"\u00107\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b}\u0010r\u001a\u0004\b~\u0010t\"\u0004\b\u007f\u0010vR%\u00108\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010r\u001a\u0005\b\u0081\u0001\u0010t\"\u0005\b\u0082\u0001\u0010vR%\u00109\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010r\u001a\u0005\b\u0084\u0001\u0010t\"\u0005\b\u0085\u0001\u0010vR%\u0010:\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010r\u001a\u0005\b\u0087\u0001\u0010t\"\u0005\b\u0088\u0001\u0010vR%\u0010;\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010r\u001a\u0005\b\u008a\u0001\u0010t\"\u0005\b\u008b\u0001\u0010vR%\u0010<\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010r\u001a\u0005\b\u008d\u0001\u0010t\"\u0005\b\u008e\u0001\u0010vR%\u0010=\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010r\u001a\u0005\b\u0090\u0001\u0010t\"\u0005\b\u0091\u0001\u0010vR%\u0010>\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010r\u001a\u0005\b\u0093\u0001\u0010t\"\u0005\b\u0094\u0001\u0010vR(\u0010?\u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R(\u0010@\u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u0096\u0001\u001a\u0006\b\u009c\u0001\u0010\u0098\u0001\"\u0006\b\u009d\u0001\u0010\u009a\u0001R%\u0010A\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u009e\u0001\u0010r\u001a\u0005\b\u009f\u0001\u0010t\"\u0005\b \u0001\u0010vR\u001d\u0010£\u0001\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u000e\n\u0005\b¡\u0001\u0010I\u001a\u0005\b¢\u0001\u0010K¨\u0006§\u0001"}, d2 = {"Lcom/mastercard/sonic/analytics/mixpanel/model/Properties;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "", "component11", "()[Ljava/lang/String;", "component12", "component13", "component14", "component15", "", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "", "component27", "component28", "component29", "token", "time", "distinctId", "insertId", "startTime", "endTime", ContextualDataConstants.CD_SDK_VERSION, "applicationId", "merchantName", "merchantId", "merchantCategoryCode", "country", "city", "cueName", "cueVersion", "failure", "success", "total", "animationOnly", "soundOnly", "animationAndSound", "animationFailure", "soundFailure", "animationAndSoundFailure", "unknownFailure", "mutedPlay", "hapticsEnabled", "hapticsSupported", "hapticsPlay", "copy", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIIIIZZI)Lcom/mastercard/sonic/analytics/mixpanel/model/Properties;", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "b", "J", "getTime", "()J", "setTime", "(J)V", "c", "getDistinctId", "d", "getInsertId", "setInsertId", "(Ljava/lang/String;)V", "e", "getStartTime", "f", "getEndTime", "setEndTime", "g", "getSdkVersion", "h", "getApplicationId", "i", "getMerchantName", "j", "getMerchantId", "k", "[Ljava/lang/String;", "getMerchantCategoryCode", "l", "getCountry", "m", "getCity", "n", "getCueName", "o", "getCueVersion", "setCueVersion", "p", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFailure", "()I", "setFailure", "(I)V", "q", "getSuccess", "setSuccess", "r", "getTotal", "setTotal", "s", "getAnimationOnly", "setAnimationOnly", "t", "getSoundOnly", "setSoundOnly", "u", "getAnimationAndSound", "setAnimationAndSound", SharedPrefsStorage.VERSION_KEY, "getAnimationFailure", "setAnimationFailure", "w", "getSoundFailure", "setSoundFailure", "x", "getAnimationAndSoundFailure", "setAnimationAndSoundFailure", "y", "getUnknownFailure", "setUnknownFailure", "z", "getMutedPlay", "setMutedPlay", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Z", "getHapticsEnabled", "()Z", "setHapticsEnabled", "(Z)V", "B", "getHapticsSupported", "setHapticsSupported", "C", "getHapticsPlay", "setHapticsPlay", "D", "getChannel", "channel", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIIIIZZI)V", "Builder", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Properties {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("hapticsEnabled")
    private boolean hapticsEnabled;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("hapticsSupported")
    private boolean hapticsSupported;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("hapticsPlay")
    private int hapticsPlay;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("channel")
    @NotNull
    private final String channel;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("token")
    @NotNull
    private final String token;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("time")
    private long time;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distinct_id")
    @NotNull
    private final String distinctId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("insert_id")
    @NotNull
    private String insertId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTime")
    @NotNull
    private final String startTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endTime")
    @NotNull
    private String endTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName(ContextualDataConstants.CD_SDK_VERSION)
    @NotNull
    private final String sdkVersion;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("applicationId")
    @NotNull
    private final String applicationId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("merchantName")
    @NotNull
    private final String merchantName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("merchantId")
    @NotNull
    private final String merchantId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mcc")
    @NotNull
    private final String[] merchantCategoryCode;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("country")
    @NotNull
    private final String country;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @SerializedName("city")
    @Nullable
    private final String city;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cueName")
    @NotNull
    private final String cueName;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cueVersion")
    @NotNull
    private String cueVersion;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("failure")
    private int failure;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("success")
    private int success;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("total")
    private int total;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @SerializedName("animationOnly")
    private int animationOnly;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("soundOnly")
    private int soundOnly;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @SerializedName("animationAndSound")
    private int animationAndSound;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("animationFailure")
    private int animationFailure;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("soundFailure")
    private int soundFailure;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("animationAndSoundFailure")
    private int animationAndSoundFailure;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unknownFailure")
    private int unknownFailure;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mutedPlay")
    private int mutedPlay;

    /* JADX INFO: compiled from: Properties.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0002J\u001b\u0010\u000f\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0015J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0015J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0015J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0015J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0015J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0015J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020!J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0015J\u0006\u0010&\u001a\u00020%¨\u0006)"}, d2 = {"Lcom/mastercard/sonic/analytics/mixpanel/model/Properties$Builder;", "", "", "token", "", "time", "distinctId", "insertId", "startTime", "endTime", ContextualDataConstants.CD_SDK_VERSION, "applicationId", "merchantName", "merchantId", "", "merchantCategoryCode", "([Ljava/lang/String;)Lcom/mastercard/sonic/analytics/mixpanel/model/Properties$Builder;", "country", "city", "cueName", "cueVersion", "", "failure", "success", "total", "animationOnly", "soundOnly", "animationAndSound", "animationFailure", "soundFailure", "animationAndSoundFailure", "unknownFailure", "mutedPlay", "", "hapticsEnabled", "hapticsSupported", "hapticsPlay", "Lcom/mastercard/sonic/analytics/mixpanel/model/Properties;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Properties.kt\ncom/mastercard/sonic/analytics/mixpanel/model/Properties$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
    public static final class Builder {
        public boolean A;
        public boolean B;
        public int C;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f51092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Long f51093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f51094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public String f51095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public String f51096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public String f51097f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public String f51098g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public String f51099h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public String f51100i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public String f51101j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public String[] f51102k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public String f51103l;

        @Nullable
        public String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public String f51104n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @Nullable
        public String f51105o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f51106p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f51107q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f51108r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f51109s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f51110t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f51111u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f51112v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f51113w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f51114x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f51115y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f51116z;

        @NotNull
        public final Builder animationAndSound(int animationAndSound) {
            this.f51111u = animationAndSound;
            return this;
        }

        @NotNull
        public final Builder animationAndSoundFailure(int animationAndSoundFailure) {
            this.f51114x = animationAndSoundFailure;
            return this;
        }

        @NotNull
        public final Builder animationFailure(int animationFailure) {
            this.f51112v = animationFailure;
            return this;
        }

        @NotNull
        public final Builder animationOnly(int animationOnly) {
            this.f51109s = animationOnly;
            return this;
        }

        @NotNull
        public final Builder applicationId(@NotNull String applicationId) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            this.f51099h = applicationId;
            return this;
        }

        @NotNull
        public final Properties build() {
            String str = this.f51092a;
            if (str != null) {
                Intrinsics.checkNotNull(str);
                if (str.length() > 0) {
                    Long l6 = this.f51093b;
                    if (l6 != null) {
                        Intrinsics.checkNotNull(l6);
                        if (l6.longValue() > 0) {
                            String str2 = this.f51094c;
                            if (str2 != null) {
                                Intrinsics.checkNotNull(str2);
                                if (str2.length() > 0) {
                                    String str3 = this.f51096e;
                                    if (str3 != null) {
                                        Intrinsics.checkNotNull(str3);
                                        if (str3.length() > 0) {
                                            String str4 = this.f51097f;
                                            if (str4 != null) {
                                                Intrinsics.checkNotNull(str4);
                                                if (str4.length() > 0) {
                                                    String str5 = this.f51098g;
                                                    if (str5 != null) {
                                                        Intrinsics.checkNotNull(str5);
                                                        if (str5.length() > 0) {
                                                            String str6 = this.f51099h;
                                                            if (str6 != null) {
                                                                Intrinsics.checkNotNull(str6);
                                                                if (str6.length() > 0) {
                                                                    String str7 = this.f51100i;
                                                                    if (str7 != null) {
                                                                        Intrinsics.checkNotNull(str7);
                                                                        if (str7.length() > 0) {
                                                                            String str8 = this.f51101j;
                                                                            if (str8 != null) {
                                                                                Intrinsics.checkNotNull(str8);
                                                                                if (str8.length() > 0) {
                                                                                    String[] strArr = this.f51102k;
                                                                                    if (strArr != null) {
                                                                                        Intrinsics.checkNotNull(strArr);
                                                                                        if (!(strArr.length == 0)) {
                                                                                            String str9 = this.f51103l;
                                                                                            if (str9 != null) {
                                                                                                Intrinsics.checkNotNull(str9);
                                                                                                if (str9.length() > 0) {
                                                                                                    String str10 = this.f51104n;
                                                                                                    if (str10 != null) {
                                                                                                        Intrinsics.checkNotNull(str10);
                                                                                                        if (str10.length() > 0) {
                                                                                                            String str11 = this.f51105o;
                                                                                                            if (str11 != null) {
                                                                                                                Intrinsics.checkNotNull(str11);
                                                                                                                if (str11.length() > 0) {
                                                                                                                    String str12 = this.f51092a;
                                                                                                                    Intrinsics.checkNotNull(str12);
                                                                                                                    Long l7 = this.f51093b;
                                                                                                                    Intrinsics.checkNotNull(l7);
                                                                                                                    long jLongValue = l7.longValue();
                                                                                                                    String str13 = this.f51094c;
                                                                                                                    Intrinsics.checkNotNull(str13);
                                                                                                                    String str14 = this.f51095d;
                                                                                                                    Intrinsics.checkNotNull(str14);
                                                                                                                    String str15 = this.f51096e;
                                                                                                                    Intrinsics.checkNotNull(str15);
                                                                                                                    String str16 = this.f51097f;
                                                                                                                    Intrinsics.checkNotNull(str16);
                                                                                                                    String str17 = this.f51098g;
                                                                                                                    Intrinsics.checkNotNull(str17);
                                                                                                                    String str18 = this.f51099h;
                                                                                                                    Intrinsics.checkNotNull(str18);
                                                                                                                    String str19 = this.f51100i;
                                                                                                                    Intrinsics.checkNotNull(str19);
                                                                                                                    String str20 = this.f51101j;
                                                                                                                    Intrinsics.checkNotNull(str20);
                                                                                                                    String[] strArr2 = this.f51102k;
                                                                                                                    Intrinsics.checkNotNull(strArr2);
                                                                                                                    String str21 = this.f51103l;
                                                                                                                    Intrinsics.checkNotNull(str21);
                                                                                                                    String str22 = this.m;
                                                                                                                    String str23 = this.f51104n;
                                                                                                                    Intrinsics.checkNotNull(str23);
                                                                                                                    String str24 = this.f51105o;
                                                                                                                    Intrinsics.checkNotNull(str24);
                                                                                                                    return new Properties(str12, jLongValue, str13, str14, str15, str16, str17, str18, str19, str20, strArr2, str21, str22, str23, str24, this.f51106p, this.f51107q, this.f51108r, this.f51109s, this.f51110t, this.f51111u, this.f51112v, this.f51113w, this.f51114x, this.f51115y, this.f51116z, this.A, this.B, this.C);
                                                                                                                }
                                                                                                            }
                                                                                                            throw new IllegalArgumentException("cueVersion must be initialized".toString());
                                                                                                        }
                                                                                                    }
                                                                                                    throw new IllegalArgumentException("cueName must be initialized".toString());
                                                                                                }
                                                                                            }
                                                                                            throw new IllegalArgumentException("country must be initialized with size > 0".toString());
                                                                                        }
                                                                                    }
                                                                                    throw new IllegalArgumentException("merchantCategoryCode must be initialized with size > 0".toString());
                                                                                }
                                                                            }
                                                                            throw new IllegalArgumentException("merchantId must be initialized".toString());
                                                                        }
                                                                    }
                                                                    throw new IllegalArgumentException("merchantName must be initialized".toString());
                                                                }
                                                            }
                                                            throw new IllegalArgumentException("applicationId must be initialized".toString());
                                                        }
                                                    }
                                                    throw new IllegalArgumentException("sdkVersion must be initialized".toString());
                                                }
                                            }
                                            throw new IllegalArgumentException("endTime must be initialized".toString());
                                        }
                                    }
                                    throw new IllegalArgumentException("startTime must be initialized".toString());
                                }
                            }
                            throw new IllegalArgumentException("distinctId must be initialized".toString());
                        }
                    }
                    throw new IllegalArgumentException("time must be initialized".toString());
                }
            }
            throw new IllegalArgumentException("token must be initialized".toString());
        }

        @NotNull
        public final Builder city(@Nullable String city) {
            this.m = city;
            return this;
        }

        @NotNull
        public final Builder country(@NotNull String country) {
            Intrinsics.checkNotNullParameter(country, "country");
            this.f51103l = country;
            return this;
        }

        @NotNull
        public final Builder cueName(@NotNull String cueName) {
            Intrinsics.checkNotNullParameter(cueName, "cueName");
            this.f51104n = cueName;
            return this;
        }

        @NotNull
        public final Builder cueVersion(@NotNull String cueVersion) {
            Intrinsics.checkNotNullParameter(cueVersion, "cueVersion");
            this.f51105o = cueVersion;
            return this;
        }

        @NotNull
        public final Builder distinctId(@NotNull String distinctId) {
            Intrinsics.checkNotNullParameter(distinctId, "distinctId");
            this.f51094c = distinctId;
            return this;
        }

        @NotNull
        public final Builder endTime(@NotNull String endTime) {
            Intrinsics.checkNotNullParameter(endTime, "endTime");
            this.f51097f = endTime;
            return this;
        }

        @NotNull
        public final Builder failure(int failure) {
            this.f51106p = failure;
            return this;
        }

        @NotNull
        public final Builder hapticsEnabled(boolean hapticsEnabled) {
            this.A = hapticsEnabled;
            return this;
        }

        @NotNull
        public final Builder hapticsPlay(int hapticsPlay) {
            this.C = hapticsPlay;
            return this;
        }

        @NotNull
        public final Builder hapticsSupported(boolean hapticsSupported) {
            this.B = hapticsSupported;
            return this;
        }

        @NotNull
        public final Builder insertId(@NotNull String insertId) {
            Intrinsics.checkNotNullParameter(insertId, "insertId");
            this.f51095d = insertId;
            return this;
        }

        @NotNull
        public final Builder merchantCategoryCode(@NotNull String[] merchantCategoryCode) {
            Intrinsics.checkNotNullParameter(merchantCategoryCode, "merchantCategoryCode");
            this.f51102k = merchantCategoryCode;
            return this;
        }

        @NotNull
        public final Builder merchantId(@NotNull String merchantId) {
            Intrinsics.checkNotNullParameter(merchantId, "merchantId");
            this.f51101j = merchantId;
            return this;
        }

        @NotNull
        public final Builder merchantName(@NotNull String merchantName) {
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            this.f51100i = merchantName;
            return this;
        }

        @NotNull
        public final Builder mutedPlay(int unknownFailure) {
            this.f51116z = unknownFailure;
            return this;
        }

        @NotNull
        public final Builder sdkVersion(@NotNull String sdkVersion) {
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            this.f51098g = sdkVersion;
            return this;
        }

        @NotNull
        public final Builder soundFailure(int soundFailure) {
            this.f51113w = soundFailure;
            return this;
        }

        @NotNull
        public final Builder soundOnly(int soundOnly) {
            this.f51110t = soundOnly;
            return this;
        }

        @NotNull
        public final Builder startTime(@NotNull String startTime) {
            Intrinsics.checkNotNullParameter(startTime, "startTime");
            this.f51096e = startTime;
            return this;
        }

        @NotNull
        public final Builder success(int success) {
            this.f51107q = success;
            return this;
        }

        @NotNull
        public final Builder time(long time) {
            this.f51093b = Long.valueOf(time);
            return this;
        }

        @NotNull
        public final Builder token(@NotNull String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            this.f51092a = token;
            return this;
        }

        @NotNull
        public final Builder total(int total) {
            this.f51108r = total;
            return this;
        }

        @NotNull
        public final Builder unknownFailure(int unknownFailure) {
            this.f51115y = unknownFailure;
            return this;
        }
    }

    public Properties(@NotNull String token, long j10, @NotNull String distinctId, @NotNull String insertId, @NotNull String startTime, @NotNull String endTime, @NotNull String sdkVersion, @NotNull String applicationId, @NotNull String merchantName, @NotNull String merchantId, @NotNull String[] merchantCategoryCode, @NotNull String country, @Nullable String str, @NotNull String cueName, @NotNull String cueVersion, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, boolean z10, boolean z11, int i21) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(distinctId, "distinctId");
        Intrinsics.checkNotNullParameter(insertId, "insertId");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(merchantCategoryCode, "merchantCategoryCode");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(cueName, "cueName");
        Intrinsics.checkNotNullParameter(cueVersion, "cueVersion");
        this.token = token;
        this.time = j10;
        this.distinctId = distinctId;
        this.insertId = insertId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.sdkVersion = sdkVersion;
        this.applicationId = applicationId;
        this.merchantName = merchantName;
        this.merchantId = merchantId;
        this.merchantCategoryCode = merchantCategoryCode;
        this.country = country;
        this.city = str;
        this.cueName = cueName;
        this.cueVersion = cueVersion;
        this.failure = i10;
        this.success = i11;
        this.total = i12;
        this.animationOnly = i13;
        this.soundOnly = i14;
        this.animationAndSound = i15;
        this.animationFailure = i16;
        this.soundFailure = i17;
        this.animationAndSoundFailure = i18;
        this.unknownFailure = i19;
        this.mutedPlay = i20;
        this.hapticsEnabled = z10;
        this.hapticsSupported = z11;
        this.hapticsPlay = i21;
        this.channel = "Android";
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String[] getMerchantCategoryCode() {
        return this.merchantCategoryCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCueName() {
        return this.cueName;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCueVersion() {
        return this.cueVersion;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getFailure() {
        return this.failure;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getAnimationOnly() {
        return this.animationOnly;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getSoundOnly() {
        return this.soundOnly;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getAnimationAndSound() {
        return this.animationAndSound;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getAnimationFailure() {
        return this.animationFailure;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getSoundFailure() {
        return this.soundFailure;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getAnimationAndSoundFailure() {
        return this.animationAndSoundFailure;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final int getUnknownFailure() {
        return this.unknownFailure;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final int getMutedPlay() {
        return this.mutedPlay;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final boolean getHapticsEnabled() {
        return this.hapticsEnabled;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final boolean getHapticsSupported() {
        return this.hapticsSupported;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final int getHapticsPlay() {
        return this.hapticsPlay;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDistinctId() {
        return this.distinctId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInsertId() {
        return this.insertId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    @NotNull
    public final Properties copy(@NotNull String token, long time, @NotNull String distinctId, @NotNull String insertId, @NotNull String startTime, @NotNull String endTime, @NotNull String sdkVersion, @NotNull String applicationId, @NotNull String merchantName, @NotNull String merchantId, @NotNull String[] merchantCategoryCode, @NotNull String country, @Nullable String city, @NotNull String cueName, @NotNull String cueVersion, int failure, int success, int total, int animationOnly, int soundOnly, int animationAndSound, int animationFailure, int soundFailure, int animationAndSoundFailure, int unknownFailure, int mutedPlay, boolean hapticsEnabled, boolean hapticsSupported, int hapticsPlay) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(distinctId, "distinctId");
        Intrinsics.checkNotNullParameter(insertId, "insertId");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(merchantCategoryCode, "merchantCategoryCode");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(cueName, "cueName");
        Intrinsics.checkNotNullParameter(cueVersion, "cueVersion");
        return new Properties(token, time, distinctId, insertId, startTime, endTime, sdkVersion, applicationId, merchantName, merchantId, merchantCategoryCode, country, city, cueName, cueVersion, failure, success, total, animationOnly, soundOnly, animationAndSound, animationFailure, soundFailure, animationAndSoundFailure, unknownFailure, mutedPlay, hapticsEnabled, hapticsSupported, hapticsPlay);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Properties)) {
            return false;
        }
        Properties properties = (Properties) other;
        return Intrinsics.areEqual(this.token, properties.token) && this.time == properties.time && Intrinsics.areEqual(this.distinctId, properties.distinctId) && Intrinsics.areEqual(this.insertId, properties.insertId) && Intrinsics.areEqual(this.startTime, properties.startTime) && Intrinsics.areEqual(this.endTime, properties.endTime) && Intrinsics.areEqual(this.sdkVersion, properties.sdkVersion) && Intrinsics.areEqual(this.applicationId, properties.applicationId) && Intrinsics.areEqual(this.merchantName, properties.merchantName) && Intrinsics.areEqual(this.merchantId, properties.merchantId) && Intrinsics.areEqual(this.merchantCategoryCode, properties.merchantCategoryCode) && Intrinsics.areEqual(this.country, properties.country) && Intrinsics.areEqual(this.city, properties.city) && Intrinsics.areEqual(this.cueName, properties.cueName) && Intrinsics.areEqual(this.cueVersion, properties.cueVersion) && this.failure == properties.failure && this.success == properties.success && this.total == properties.total && this.animationOnly == properties.animationOnly && this.soundOnly == properties.soundOnly && this.animationAndSound == properties.animationAndSound && this.animationFailure == properties.animationFailure && this.soundFailure == properties.soundFailure && this.animationAndSoundFailure == properties.animationAndSoundFailure && this.unknownFailure == properties.unknownFailure && this.mutedPlay == properties.mutedPlay && this.hapticsEnabled == properties.hapticsEnabled && this.hapticsSupported == properties.hapticsSupported && this.hapticsPlay == properties.hapticsPlay;
    }

    public final int getAnimationAndSound() {
        return this.animationAndSound;
    }

    public final int getAnimationAndSoundFailure() {
        return this.animationAndSoundFailure;
    }

    public final int getAnimationFailure() {
        return this.animationFailure;
    }

    public final int getAnimationOnly() {
        return this.animationOnly;
    }

    @NotNull
    public final String getApplicationId() {
        return this.applicationId;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getCueName() {
        return this.cueName;
    }

    @NotNull
    public final String getCueVersion() {
        return this.cueVersion;
    }

    @NotNull
    public final String getDistinctId() {
        return this.distinctId;
    }

    @NotNull
    public final String getEndTime() {
        return this.endTime;
    }

    public final int getFailure() {
        return this.failure;
    }

    public final boolean getHapticsEnabled() {
        return this.hapticsEnabled;
    }

    public final int getHapticsPlay() {
        return this.hapticsPlay;
    }

    public final boolean getHapticsSupported() {
        return this.hapticsSupported;
    }

    @NotNull
    public final String getInsertId() {
        return this.insertId;
    }

    @NotNull
    public final String[] getMerchantCategoryCode() {
        return this.merchantCategoryCode;
    }

    @NotNull
    public final String getMerchantId() {
        return this.merchantId;
    }

    @NotNull
    public final String getMerchantName() {
        return this.merchantName;
    }

    public final int getMutedPlay() {
        return this.mutedPlay;
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final int getSoundFailure() {
        return this.soundFailure;
    }

    public final int getSoundOnly() {
        return this.soundOnly;
    }

    @NotNull
    public final String getStartTime() {
        return this.startTime;
    }

    public final int getSuccess() {
        return this.success;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getUnknownFailure() {
        return this.unknownFailure;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [int] */
    /* JADX WARN: Type inference failed for: r0v44, types: [int] */
    /* JADX WARN: Type inference failed for: r2v31, types: [int] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iHashCode = this.token.hashCode() * 31;
        long j10 = this.time;
        int iC = n1.c(this.country, (n1.c(this.merchantId, n1.c(this.merchantName, n1.c(this.applicationId, n1.c(this.sdkVersion, n1.c(this.endTime, n1.c(this.startTime, n1.c(this.insertId, n1.c(this.distinctId, (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31), 31), 31), 31), 31), 31), 31), 31) + Arrays.hashCode(this.merchantCategoryCode)) * 31, 31);
        String str = this.city;
        int iC2 = (((((((((((((((((((((n1.c(this.cueVersion, n1.c(this.cueName, (iC + (str == null ? 0 : str.hashCode())) * 31, 31), 31) + this.failure) * 31) + this.success) * 31) + this.total) * 31) + this.animationOnly) * 31) + this.soundOnly) * 31) + this.animationAndSound) * 31) + this.animationFailure) * 31) + this.soundFailure) * 31) + this.animationAndSoundFailure) * 31) + this.unknownFailure) * 31) + this.mutedPlay) * 31;
        boolean z10 = this.hapticsEnabled;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int i10 = (iC2 + r3) * 31;
        boolean z11 = this.hapticsSupported;
        return ((i10 + (z11 ? 1 : z11)) * 31) + this.hapticsPlay;
    }

    public final void setAnimationAndSound(int i10) {
        this.animationAndSound = i10;
    }

    public final void setAnimationAndSoundFailure(int i10) {
        this.animationAndSoundFailure = i10;
    }

    public final void setAnimationFailure(int i10) {
        this.animationFailure = i10;
    }

    public final void setAnimationOnly(int i10) {
        this.animationOnly = i10;
    }

    public final void setCueVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cueVersion = str;
    }

    public final void setEndTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.endTime = str;
    }

    public final void setFailure(int i10) {
        this.failure = i10;
    }

    public final void setHapticsEnabled(boolean z10) {
        this.hapticsEnabled = z10;
    }

    public final void setHapticsPlay(int i10) {
        this.hapticsPlay = i10;
    }

    public final void setHapticsSupported(boolean z10) {
        this.hapticsSupported = z10;
    }

    public final void setInsertId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.insertId = str;
    }

    public final void setMutedPlay(int i10) {
        this.mutedPlay = i10;
    }

    public final void setSoundFailure(int i10) {
        this.soundFailure = i10;
    }

    public final void setSoundOnly(int i10) {
        this.soundOnly = i10;
    }

    public final void setSuccess(int i10) {
        this.success = i10;
    }

    public final void setTime(long j10) {
        this.time = j10;
    }

    public final void setTotal(int i10) {
        this.total = i10;
    }

    public final void setUnknownFailure(int i10) {
        this.unknownFailure = i10;
    }

    @NotNull
    public String toString() {
        String str = this.token;
        long j10 = this.time;
        String str2 = this.distinctId;
        String str3 = this.insertId;
        String str4 = this.startTime;
        String str5 = this.endTime;
        String str6 = this.sdkVersion;
        String str7 = this.applicationId;
        String str8 = this.merchantName;
        String str9 = this.merchantId;
        String string = Arrays.toString(this.merchantCategoryCode);
        String str10 = this.country;
        String str11 = this.city;
        String str12 = this.cueName;
        String str13 = this.cueVersion;
        int i10 = this.failure;
        int i11 = this.success;
        int i12 = this.total;
        int i13 = this.animationOnly;
        int i14 = this.soundOnly;
        int i15 = this.animationAndSound;
        int i16 = this.animationFailure;
        int i17 = this.soundFailure;
        int i18 = this.animationAndSoundFailure;
        int i19 = this.unknownFailure;
        int i20 = this.mutedPlay;
        boolean z10 = this.hapticsEnabled;
        boolean z11 = this.hapticsSupported;
        int i21 = this.hapticsPlay;
        StringBuilder sb2 = new StringBuilder("Properties(token=");
        sb2.append(str);
        sb2.append(", time=");
        sb2.append(j10);
        k.e(sb2, ", distinctId=", str2, ", insertId=", str3);
        k.e(sb2, ", startTime=", str4, ", endTime=", str5);
        k.e(sb2, ", sdkVersion=", str6, ", applicationId=", str7);
        k.e(sb2, ", merchantName=", str8, ", merchantId=", str9);
        k.e(sb2, ", merchantCategoryCode=", string, ", country=", str10);
        k.e(sb2, ", city=", str11, ", cueName=", str12);
        sb2.append(", cueVersion=");
        sb2.append(str13);
        sb2.append(", failure=");
        sb2.append(i10);
        sb2.append(", success=");
        sb2.append(i11);
        sb2.append(", total=");
        sb2.append(i12);
        sb2.append(", animationOnly=");
        sb2.append(i13);
        sb2.append(", soundOnly=");
        sb2.append(i14);
        sb2.append(", animationAndSound=");
        sb2.append(i15);
        sb2.append(", animationFailure=");
        sb2.append(i16);
        sb2.append(", soundFailure=");
        sb2.append(i17);
        sb2.append(", animationAndSoundFailure=");
        sb2.append(i18);
        sb2.append(", unknownFailure=");
        sb2.append(i19);
        sb2.append(", mutedPlay=");
        sb2.append(i20);
        sb2.append(", hapticsEnabled=");
        sb2.append(z10);
        sb2.append(", hapticsSupported=");
        sb2.append(z11);
        sb2.append(", hapticsPlay=");
        sb2.append(i21);
        sb2.append(")");
        return sb2.toString();
    }
}
