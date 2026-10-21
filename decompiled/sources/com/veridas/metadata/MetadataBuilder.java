package com.veridas.metadata;

import android.os.Build;
import android.util.Base64;
import androidx.constraintlayout.motion.widget.Key;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.salesforce.marketingcloud.storage.db.k;
import com.veridas.Veridas;
import com.veridas.bidicode.entities.BidiCodeInfo;
import com.veridas.bidicode.entities.BidiCodeRegion;
import com.veridas.lib.entities.resources.bidicode.BidiType;
import com.veridas.metadata.entities.Agent;
import com.veridas.metadata.entities.ArtifactClass;
import com.veridas.metadata.entities.Integrity;
import com.veridas.metadata.entities.PayloadClass;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: compiled from: MetadataBuilder.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J$\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0004J,\u0010\u000f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0004J\u001c\u0010\u0012\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0004J\b\u0010\u0013\u001a\u00020\u0006H\u0004J \u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0004J\u0012\u0010\u0019\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0018H\u0004J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fJ\u0016\u0010%\u001a\u00020\u00002\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0004J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0018J\u0006\u0010+\u001a\u00020\u0006¨\u0006."}, d2 = {"Lcom/veridas/metadata/MetadataBuilder;", "", "Lcom/veridas/metadata/entities/Agent;", "agent", "", "version", "Lorg/json/JSONObject;", "platformObject", "createAgentObject", "Lcom/veridas/metadata/entities/ArtifactClass;", "artifactClass", "mimeType", "paramsObject", "Lorg/json/JSONArray;", "payloads", "createArtifactObject", "width", "height", "createArtifactParamsObject", "createPlatformObject", "timestamp", "artifactObject", "agentObject", "createMetaDataObject", "Ljava/util/Date;", "createUtcDateString", "setAgent", "agentVersion", "setAgentVersion", "setArtifactClass", "setHeight", "Lcom/veridas/metadata/entities/Integrity;", "integrity", "setIntegrity", "", "Lcom/veridas/bidicode/entities/BidiCodeInfo;", "bidis", "setBidis", "setWidth", "setMimeType", "mrz", "setMRZ", "setTimestamp", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "<init>", "()V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMetadataBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetadataBuilder.kt\ncom/veridas/metadata/MetadataBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,462:1\n1855#2,2:463\n*S KotlinDebug\n*F\n+ 1 MetadataBuilder.kt\ncom/veridas/metadata/MetadataBuilder\n*L\n96#1:463,2\n*E\n"})
public class MetadataBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f67235a = Pattern.compile(Veridas.MIME_TYPE_PATTERN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SimpleDateFormat f67236b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ROOT);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Agent f67237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f67238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ArtifactClass f67239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f67240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integrity f67241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public List<BidiCodeInfo> f67242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f67243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public String f67244j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Date f67245k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public String f67246l;

    @NotNull
    public final JSONObject build() throws JSONException {
        List<BidiCodeInfo> list;
        if (this.f67241g == null) {
            throw new IllegalArgumentException("The MRZ can't be empty.");
        }
        JSONObject jSONObjectCreateAgentObject = createAgentObject(this.f67237c, this.f67238d, createPlatformObject());
        JSONObject jSONObjectCreateArtifactParamsObject = createArtifactParamsObject(this.f67246l, this.f67240f);
        JSONArray jSONArray = new JSONArray();
        String str = this.f67244j;
        if (str != null && str.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Name.LABEL, PayloadClass.MRZ.getClassName());
            jSONObject.put("mime-type", Veridas.BASE64_MIME_TYPE);
            jSONObject.put("name", "mrz");
            String str2 = this.f67244j;
            Intrinsics.checkNotNull(str2);
            byte[] bytes = str2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            jSONObject.put("body", Base64.encodeToString(bytes, 0));
            jSONArray.put(jSONObject);
        }
        List<BidiCodeInfo> list2 = this.f67242h;
        if (list2 != null && !list2.isEmpty() && (list = this.f67242h) != null) {
            for (BidiCodeInfo bidiCodeInfo : list) {
                JSONObject jSONObject2 = new JSONObject();
                BidiCodeRegion region = bidiCodeInfo.getPlacement().getRegion();
                jSONObject2.put(Name.LABEL, PayloadClass.BIDI_CODE.getClassName());
                jSONObject2.put("mime-type", Veridas.BASE64_MIME_TYPE);
                jSONObject2.put("name", BidiType.INSTANCE.getNameFrom(bidiCodeInfo.getPlacement().getType()));
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("x", Float.valueOf(region.getX()));
                jSONObject3.put("y", Float.valueOf(region.getY()));
                jSONObject3.put("w", Float.valueOf(region.getW()));
                jSONObject3.put("h", Float.valueOf(region.getH()));
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("region", jSONObject3);
                jSONObject4.put(Key.ROTATION, Float.valueOf(bidiCodeInfo.getPlacement().getRotation()));
                jSONObject4.put("side", bidiCodeInfo.getPlacement().getSide());
                jSONObject4.put("type", bidiCodeInfo.getPlacement().getType());
                jSONObject2.put("params", jSONObject4);
                jSONObject2.put("body", bidiCodeInfo.getData());
                jSONArray.put(jSONObject2);
            }
        }
        return createMetaDataObject(createUtcDateString(this.f67245k), createArtifactObject(this.f67239e, this.f67243i, jSONObjectCreateArtifactParamsObject, jSONArray), jSONObjectCreateAgentObject);
    }

    @NotNull
    public final JSONObject createAgentObject(@Nullable Agent agent, @Nullable String version, @NotNull JSONObject platformObject) throws JSONException {
        Intrinsics.checkNotNullParameter(platformObject, "platformObject");
        if (agent == null) {
            throw new IllegalArgumentException("The agent is not set.");
        }
        if (version == null) {
            throw new IllegalArgumentException("The agent version is not set.");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", agent.getAgentName());
        jSONObject.put(Name.LABEL, "native-android");
        jSONObject.put("version", version);
        jSONObject.put(k.a.f65035b, platformObject);
        Object obj = JSONObject.NULL;
        jSONObject.put("runtime", obj);
        jSONObject.put("settings", obj);
        return jSONObject;
    }

    @NotNull
    public final JSONObject createArtifactObject(@Nullable ArtifactClass artifactClass, @Nullable String mimeType, @NotNull JSONObject paramsObject, @NotNull JSONArray payloads) throws JSONException {
        Intrinsics.checkNotNullParameter(paramsObject, "paramsObject");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (artifactClass == null) {
            throw new IllegalArgumentException("The artifact class is not set.");
        }
        if (mimeType == null) {
            throw new IllegalArgumentException("The mime type is not set.");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Name.LABEL, artifactClass.getClassName());
        jSONObject.put("mime-type", mimeType);
        jSONObject.put("params", paramsObject);
        if (payloads.length() == 0) {
            jSONObject.put(BanxicoConstants.KEY_HISTORICAL_PAYLOAD, JSONObject.NULL);
        } else {
            jSONObject.put(BanxicoConstants.KEY_HISTORICAL_PAYLOAD, payloads);
        }
        return jSONObject;
    }

    @NotNull
    public final JSONObject createArtifactParamsObject(@Nullable String width, @Nullable String height) throws JSONException {
        if (height == null) {
            throw new IllegalArgumentException("The value for height is not set.");
        }
        if (width == null) {
            throw new IllegalArgumentException("The value for width is not set.");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", width);
        jSONObject.put("height", height);
        return jSONObject;
    }

    @NotNull
    public final JSONObject createMetaDataObject(@NotNull String timestamp, @NotNull JSONObject artifactObject, @NotNull JSONObject agentObject) throws JSONException {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(artifactObject, "artifactObject");
        Intrinsics.checkNotNullParameter(agentObject, "agentObject");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", "1.0");
        jSONObject.put("timestamp", timestamp);
        jSONObject.put("artifact", artifactObject);
        jSONObject.put("agent", agentObject);
        Integrity integrity = this.f67241g;
        Integrity integrity2 = null;
        if (integrity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("integrity");
            integrity = null;
        }
        jSONObject.put("rev", integrity.getRev());
        Integrity integrity3 = this.f67241g;
        if (integrity3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("integrity");
        } else {
            integrity2 = integrity3;
        }
        jSONObject.put("salt", integrity2.getSalt64());
        return jSONObject;
    }

    @NotNull
    public final JSONObject createPlatformObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", "Android");
        jSONObject.put("version", Build.VERSION.RELEASE);
        jSONObject.put(Constants.device, Build.DEVICE);
        jSONObject.put("params", JSONObject.NULL);
        return jSONObject;
    }

    @NotNull
    public final String createUtcDateString(@Nullable Date timestamp) {
        SimpleDateFormat simpleDateFormat = this.f67236b;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        if (timestamp == null) {
            String str = simpleDateFormat.format(new Date());
            Intrinsics.checkNotNull(str);
            return str;
        }
        String str2 = simpleDateFormat.format(timestamp);
        Intrinsics.checkNotNull(str2);
        return str2;
    }

    @NotNull
    public final MetadataBuilder setAgent(@NotNull Agent agent) {
        Intrinsics.checkNotNullParameter(agent, "agent");
        this.f67237c = agent;
        return this;
    }

    @NotNull
    public final MetadataBuilder setAgentVersion(@NotNull String agentVersion) {
        Intrinsics.checkNotNullParameter(agentVersion, "agentVersion");
        this.f67238d = agentVersion;
        return this;
    }

    @NotNull
    public final MetadataBuilder setArtifactClass(@NotNull ArtifactClass artifactClass) {
        Intrinsics.checkNotNullParameter(artifactClass, "artifactClass");
        this.f67239e = artifactClass;
        return this;
    }

    @NotNull
    public final MetadataBuilder setBidis(@Nullable List<BidiCodeInfo> bidis) {
        this.f67242h = bidis;
        return this;
    }

    @NotNull
    public final MetadataBuilder setHeight(@NotNull String height) {
        Intrinsics.checkNotNullParameter(height, "height");
        if (Integer.parseInt(height) < 0) {
            throw new IllegalArgumentException("The height can't be a negative value.");
        }
        this.f67240f = height;
        return this;
    }

    @NotNull
    public final MetadataBuilder setIntegrity(@NotNull Integrity integrity) {
        Intrinsics.checkNotNullParameter(integrity, "integrity");
        this.f67241g = integrity;
        return this;
    }

    @NotNull
    public final MetadataBuilder setMRZ(@NotNull String mrz) {
        Intrinsics.checkNotNullParameter(mrz, "mrz");
        if (mrz.length() == 0) {
            throw new IllegalArgumentException("The MRZ can't be empty.");
        }
        this.f67244j = mrz;
        return this;
    }

    @NotNull
    public final MetadataBuilder setMimeType(@NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        if (mimeType.length() == 0) {
            throw new IllegalArgumentException("The mimetype can't be empty.");
        }
        if (!this.f67235a.matcher(mimeType).matches()) {
            throw new IllegalArgumentException("The mimetype is not valid.");
        }
        this.f67243i = mimeType;
        return this;
    }

    @NotNull
    public final MetadataBuilder setTimestamp(@NotNull Date timestamp) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.f67245k = timestamp;
        return this;
    }

    @NotNull
    public final MetadataBuilder setWidth(@NotNull String width) {
        Intrinsics.checkNotNullParameter(width, "width");
        if (Integer.parseInt(width) < 0) {
            throw new IllegalArgumentException("The width can't be a negative value.");
        }
        this.f67246l = width;
        return this;
    }
}
