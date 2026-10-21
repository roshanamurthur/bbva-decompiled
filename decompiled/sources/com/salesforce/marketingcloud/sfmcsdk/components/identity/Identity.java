package com.salesforce.marketingcloud.sfmcsdk.components.identity;

import ad.d;
import androidx.camera.core.processing.f;
import androidx.room.a;
import bk.p;
import bk.q;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.plugin.devicemanager.command.DeviceIdCommand;
import com.bbva.ethermobilesdk.tokencompat.service.RelayedService;
import com.google.android.gms.common.Scopes;
import com.mypinpad.tsdk.isolation.y2;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleIdentifier;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Identity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 62\u00020\u0001:\u00016B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J+\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0014\b\u0002\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0017\"\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0018J1\u0010\u0019\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0014\b\u0002\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0017\"\u00020\u0007H\u0007¢\u0006\u0002\u0010\u001bJ\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0002J\u0015\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\bH\u0000¢\u0006\u0002\b!J/\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00072\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0017\"\u00020\u0007¢\u0006\u0002\u0010&JE\u0010\"\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u00032\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u0010%\u001a\u00020\u00072\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0017\"\u00020\u0007¢\u0006\u0002\u0010)J\u001a\u0010\"\u001a\u00020\u00142\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$0\nJ5\u0010+\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0017\"\u00020\u0007H\u0007¢\u0006\u0002\u0010,J9\u0010-\u001a\u00020\u00142\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0014\b\u0002\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0017\"\u00020\u0007H\u0007¢\u0006\u0002\u0010.J+\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u00032\u0014\b\u0002\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0017\"\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0018J\u001a\u0010/\u001a\u00020\u00142\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\nJ\u0006\u00102\u001a\u000203J\b\u00104\u001a\u00020\u0003H\u0016J\u0012\u00105\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/Identity;", "", Constants.registrationId, "", "(Ljava/lang/String;)V", "_moduleIdentities", "", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleIdentifier;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/ModuleIdentity;", "moduleIdentities", "", "getModuleIdentities", "()Ljava/util/Map;", k.a.f65035b, "getPlatform", "()Ljava/lang/String;", "getRegistrationId", "reservedKeys", "", "clearProfileAttribute", "", "key", "modules", "", "(Ljava/lang/String;[Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleIdentifier;)V", "clearProfileAttributes", "keys", "(Ljava/util/List;[Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleIdentifier;)V", "isValidEventAttributeValue", "", "value", "setModuleIdentity", "moduleIdentity", "setModuleIdentity$sfmcsdk_release", "setProfile", Scopes.PROFILE, "Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/Profile;", "module", "(Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/Profile;Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleIdentifier;[Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleIdentifier;)V", "profileId", k.a.f65041h, "(Ljava/lang/String;Ljava/util/Map;Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleIdentifier;[Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleIdentifier;)V", "identities", "setProfileAttribute", "(Ljava/lang/String;Ljava/lang/String;[Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleIdentifier;)V", "setProfileAttributes", "(Ljava/util/Map;[Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleIdentifier;)V", "setProfileId", "id", RelayedService.KEY_IDS, "toJson", "Lorg/json/JSONObject;", "toString", "validatedEventAttributeKey", "Companion", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Identity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "~$Identity";

    @Nullable
    private static Identity _instance;

    @NotNull
    private final Map<ModuleIdentifier, ModuleIdentity> _moduleIdentities;

    @NotNull
    private final String platform;

    @NotNull
    private final String registrationId;

    @NotNull
    private final List<String> reservedKeys;

    public /* synthetic */ Identity(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public static /* synthetic */ void clearProfileAttribute$default(Identity identity, String str, ModuleIdentifier[] moduleIdentifierArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            moduleIdentifierArr = ModuleIdentifier.values();
        }
        identity.clearProfileAttribute(str, moduleIdentifierArr);
    }

    public static /* synthetic */ void clearProfileAttributes$default(Identity identity, List list, ModuleIdentifier[] moduleIdentifierArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            moduleIdentifierArr = ModuleIdentifier.values();
        }
        identity.clearProfileAttributes(list, moduleIdentifierArr);
    }

    private final boolean isValidEventAttributeValue(Object value) {
        return (value instanceof Number) || (value instanceof Boolean) || (value instanceof String) || (value instanceof Character) || value == null;
    }

    public static /* synthetic */ void setProfileAttribute$default(Identity identity, String str, String str2, ModuleIdentifier[] moduleIdentifierArr, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            moduleIdentifierArr = ModuleIdentifier.values();
        }
        identity.setProfileAttribute(str, str2, moduleIdentifierArr);
    }

    public static /* synthetic */ void setProfileAttributes$default(Identity identity, Map map, ModuleIdentifier[] moduleIdentifierArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            moduleIdentifierArr = ModuleIdentifier.values();
        }
        identity.setProfileAttributes(map, moduleIdentifierArr);
    }

    public static /* synthetic */ void setProfileId$default(Identity identity, String str, ModuleIdentifier[] moduleIdentifierArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            moduleIdentifierArr = ModuleIdentifier.values();
        }
        identity.setProfileId(str, moduleIdentifierArr);
    }

    private final String validatedEventAttributeKey(final String key) {
        final String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(this.reservedKeys, ",", null, null, 0, null, null, 62, null);
        final String string = StringsKt__StringsKt.trim((CharSequence) key).toString();
        if (l.isBlank(key)) {
            SFMCSdkLogger.INSTANCE.w(TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.components.identity.Identity.validatedEventAttributeKey.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return d.f(new StringBuilder("Key '"), key, "' is invalid. Key cannot be empty. The key value pair was dropped.");
                }
            });
        } else {
            List<String> list = this.reservedKeys;
            Locale locale = Locale.US;
            if (!list.contains(a.d(locale, "US", key, locale, "this as java.lang.String).toLowerCase(locale)"))) {
                if (Intrinsics.areEqual(key, string)) {
                    return string;
                }
                SFMCSdkLogger.INSTANCE.w(TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.components.identity.Identity.validatedEventAttributeKey.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        StringBuilder sb2 = new StringBuilder("The key '");
                        sb2.append(key);
                        sb2.append("' was trimmed to '");
                        return y2.b(sb2, string, '\'');
                    }
                });
                return string;
            }
            SFMCSdkLogger.INSTANCE.w(TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.components.identity.Identity.validatedEventAttributeKey.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Key '" + key + "' is reserved. The key value pair was dropped. Other reserved keys: " + strJoinToString$default;
                }
            });
        }
        return null;
    }

    @JvmOverloads
    public final void clearProfileAttribute(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        clearProfileAttribute$default(this, key, null, 2, null);
    }

    @JvmOverloads
    public final void clearProfileAttributes(@NotNull List<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        clearProfileAttributes$default(this, keys, null, 2, null);
    }

    @NotNull
    public final Map<ModuleIdentifier, ModuleIdentity> getModuleIdentities() {
        return this._moduleIdentities;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    @NotNull
    public final String getRegistrationId() {
        return this.registrationId;
    }

    public final void setModuleIdentity$sfmcsdk_release(@NotNull ModuleIdentity moduleIdentity) {
        Intrinsics.checkNotNullParameter(moduleIdentity, "moduleIdentity");
        synchronized (this._moduleIdentities) {
            this._moduleIdentities.put(moduleIdentity.getModuleName(), moduleIdentity);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void setProfile(@NotNull String profileId, @NotNull Map<String, String> attributes, @NotNull ModuleIdentifier module, @NotNull ModuleIdentifier... modules) {
        Intrinsics.checkNotNullParameter(profileId, "profileId");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(modules, "modules");
        setProfile(new Profile(profileId, attributes), module, (ModuleIdentifier[]) Arrays.copyOf(modules, modules.length));
    }

    @JvmOverloads
    public final void setProfileAttribute(@NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        setProfileAttribute$default(this, key, str, null, 4, null);
    }

    @JvmOverloads
    public final void setProfileAttributes(@NotNull Map<String, String> attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        setProfileAttributes$default(this, attributes, null, 2, null);
    }

    @JvmOverloads
    public final void setProfileId(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        setProfileId$default(this, id, null, 2, null);
    }

    @NotNull
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(k.a.f65035b, this.platform);
        jSONObject.put(Constants.registrationId, this.registrationId);
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<ModuleIdentifier, ModuleIdentity> entry : this._moduleIdentities.entrySet()) {
            String lowerCase = entry.getKey().name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            jSONObject2.put(lowerCase, entry.getValue().toJson());
        }
        Unit unit = Unit.INSTANCE;
        jSONObject.put("moduleIdentities", jSONObject2);
        return jSONObject;
    }

    @NotNull
    public String toString() {
        String string = toJson().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toJson().toString()");
        return string;
    }

    private Identity(String str) {
        this.registrationId = str;
        this.platform = "Android";
        this._moduleIdentities = new LinkedHashMap();
        this.reservedKeys = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{DeviceIdCommand.ID, "userid", "eventid", "sessionid", "datetime", "eventtype", "category", "latitude", "longitude"});
    }

    @JvmOverloads
    public final void clearProfileAttribute(@NotNull String key, @NotNull ModuleIdentifier... modules) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modules, "modules");
        setProfileAttributes(p.mapOf(TuplesKt.to(key, "")), (ModuleIdentifier[]) Arrays.copyOf(modules, modules.length));
    }

    @JvmOverloads
    public final void clearProfileAttributes(@NotNull List<String> keys, @NotNull ModuleIdentifier... modules) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(modules, "modules");
        List<String> list = keys;
        LinkedHashMap linkedHashMap = new LinkedHashMap(f.a(list, 10, 16));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.put((String) it.next(), "");
        }
        setProfileAttributes(linkedHashMap, (ModuleIdentifier[]) Arrays.copyOf(modules, modules.length));
    }

    public final void setProfile(@NotNull Profile profile, @NotNull ModuleIdentifier module, @NotNull ModuleIdentifier... modules) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(modules, "modules");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(module, profile);
        for (ModuleIdentifier moduleIdentifier : modules) {
            if (!Intrinsics.areEqual(moduleIdentifier.name(), module.name())) {
                linkedHashMap.put(moduleIdentifier, profile);
            }
        }
        setProfile(linkedHashMap);
    }

    @JvmOverloads
    public final void setProfileAttribute(@NotNull String key, @Nullable String value, @NotNull ModuleIdentifier... modules) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modules, "modules");
        setProfileAttributes(p.mapOf(TuplesKt.to(key, value)), (ModuleIdentifier[]) Arrays.copyOf(modules, modules.length));
    }

    @JvmOverloads
    public final void setProfileAttributes(@NotNull Map<String, String> attributes, @NotNull ModuleIdentifier... modules) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(modules, "modules");
        synchronized (this._moduleIdentities) {
            try {
                for (ModuleIdentifier moduleIdentifier : modules) {
                    ModuleIdentity moduleIdentity = this._moduleIdentities.get(moduleIdentifier);
                    if (moduleIdentity != null) {
                        moduleIdentity.getCustomProperties().put(k.a.f65041h, attributes);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Event eventIdentityEvent$sfmcsdk_release = EventManager.INSTANCE.identityEvent$sfmcsdk_release();
        if (eventIdentityEvent$sfmcsdk_release != null) {
            eventIdentityEvent$sfmcsdk_release.track();
        }
    }

    @JvmOverloads
    public final void setProfileId(@NotNull String id, @NotNull ModuleIdentifier... modules) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(modules, "modules");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ModuleIdentifier moduleIdentifier : modules) {
            linkedHashMap.put(moduleIdentifier, id);
        }
        setProfileId(linkedHashMap);
    }

    public final void setProfileId(@NotNull Map<ModuleIdentifier, String> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        synchronized (this._moduleIdentities) {
            try {
                Iterator<T> it = ids.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    ModuleIdentity moduleIdentity = this._moduleIdentities.get(entry.getKey());
                    if (moduleIdentity != null) {
                        moduleIdentity.setProfileId((String) entry.getValue());
                    }
                }
                Event eventIdentityEvent$sfmcsdk_release = EventManager.INSTANCE.identityEvent$sfmcsdk_release();
                if (eventIdentityEvent$sfmcsdk_release != null) {
                    eventIdentityEvent$sfmcsdk_release.track();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setProfile(@NotNull Map<ModuleIdentifier, Profile> identities) {
        Intrinsics.checkNotNullParameter(identities, "identities");
        synchronized (this._moduleIdentities) {
            try {
                for (Map.Entry<ModuleIdentifier, Profile> entry : identities.entrySet()) {
                    ModuleIdentity moduleIdentity = this._moduleIdentities.get(entry.getKey());
                    if (moduleIdentity != null) {
                        moduleIdentity.setProfileId(entry.getValue().getProfileId());
                        moduleIdentity.getCustomProperties().put(k.a.f65041h, q.toMutableMap(entry.getValue().getAttributes()));
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Event eventIdentityEvent$sfmcsdk_release = EventManager.INSTANCE.identityEvent$sfmcsdk_release();
        if (eventIdentityEvent$sfmcsdk_release != null) {
            eventIdentityEvent$sfmcsdk_release.track();
        }
    }

    /* JADX INFO: compiled from: Identity.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0010J\u0019\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0012H\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R$\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/Identity$Companion;", "", "()V", "TAG", "", "_instance", "Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/Identity;", "get_instance$annotations", "value", "instance", "getInstance", "()Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/Identity;", "setInstance", "(Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/Identity;)V", "create", Constants.registrationId, "create$sfmcsdk_release", "toEvent", "", "toEvent$sfmcsdk_release", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Identity create$sfmcsdk_release(@NotNull String registrationId) {
            Intrinsics.checkNotNullParameter(registrationId, "registrationId");
            Identity identity = Identity._instance;
            if (identity != null) {
                return identity;
            }
            Identity identity2 = new Identity(registrationId, null);
            Identity.INSTANCE.setInstance(identity2);
            return identity2;
        }

        @NotNull
        public final Identity getInstance() {
            Identity identity = Identity._instance;
            if (identity != null) {
                return identity;
            }
            throw new IllegalStateException("You must initialize the SDK before attempting to use Identity.");
        }

        public final void setInstance(@NotNull final Identity value) {
            Intrinsics.checkNotNullParameter(value, "value");
            SFMCSdkLogger.INSTANCE.d(Identity.TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.components.identity.Identity$Companion$instance$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "instance = " + value + ", _instance = " + Identity._instance;
                }
            });
            Identity._instance = value;
        }

        @NotNull
        public final Map<String, Object> toEvent$sfmcsdk_release() throws JSONException {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Identity identity = Identity._instance;
            if (identity != null) {
                linkedHashMap.put(k.a.f65035b, identity.getPlatform());
                linkedHashMap.put(Constants.registrationId, identity.getRegistrationId());
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : identity._moduleIdentities.entrySet()) {
                    String lowerCase = ((ModuleIdentifier) entry.getKey()).name().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    jSONObject.put(lowerCase, ((ModuleIdentity) entry.getValue()).toJson());
                }
                Unit unit = Unit.INSTANCE;
                linkedHashMap.put("moduleIdentities", jSONObject);
            }
            return linkedHashMap;
        }

        private static /* synthetic */ void get_instance$annotations() {
        }
    }
}
