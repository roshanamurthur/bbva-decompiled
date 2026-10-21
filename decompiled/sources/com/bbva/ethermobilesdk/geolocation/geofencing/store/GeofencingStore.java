package com.bbva.ethermobilesdk.geolocation.geofencing.store;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.compat.u;
import androidx.collection.k;
import com.bbva.ethermobilesdk.geolocation.geofencing.model.GeofenceModel;
import com.bbva.networkplugin.command.impl.PutCommand;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GeofencingStore.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\u0012"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/geofencing/store/GeofencingStore;", "", "", "key", "Lcom/bbva/ethermobilesdk/geolocation/geofencing/model/GeofenceModel;", "get", "value", "", PutCommand.ID, RemoveCommand.ID, "Landroid/content/SharedPreferences;", "prefs", "setPreferences", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "geolocation_release"}, k = 1, mv = {2, 0, 0})
public final class GeofencingStore {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f29823b = u.f(GeofencingStore.class.getCanonicalName(), ".KEY");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public SharedPreferences f29824a;

    public GeofencingStore(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("GEOFENCING_STORE", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.f29824a = sharedPreferences;
    }

    public static String a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        k.e(sb2, f29823b, PushConstants.GE_PARAMS_SEPARATOR, str, PushConstants.GE_PARAMS_SEPARATOR);
        sb2.append(str2);
        return sb2.toString();
    }

    @Nullable
    public final GeofenceModel get(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f29824a.contains(a(key, "LATITUDE")) || !this.f29824a.contains(a(key, "LONGITUDE"))) {
            return null;
        }
        GeofenceModel.Builder builder = new GeofenceModel.Builder(key, 0.0d, 0.0d, 0.0f, 0L, 0, 0, 126, null);
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
        return builder.setLatitude(Double.longBitsToDouble(this.f29824a.getLong(a(key, "LATITUDE"), 0L))).setLongitude(Double.longBitsToDouble(this.f29824a.getLong(a(key, "LONGITUDE"), 0L))).setRadius(this.f29824a.getFloat(a(key, "RADIUS"), 0.0f)).setTransition(this.f29824a.getInt(a(key, "TRANSITION"), 0)).setExpiration(this.f29824a.getLong(a(key, "EXPIRATION"), 0L)).setLoiteringDelay(this.f29824a.getInt(a(key, "LOITERING_DELAY"), 0)).build();
    }

    public final void put(@NotNull String key, @Nullable GeofenceModel value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (value != null) {
            SharedPreferences.Editor editorEdit = this.f29824a.edit();
            editorEdit.putLong(a(key, "LATITUDE"), Double.doubleToLongBits(value.getLatitude()));
            editorEdit.putLong(a(key, "LONGITUDE"), Double.doubleToLongBits(value.getLongitude()));
            editorEdit.putFloat(a(key, "RADIUS"), value.getRadius());
            editorEdit.putInt(a(key, "TRANSITION"), value.getTransition());
            editorEdit.putLong(a(key, "EXPIRATION"), value.getExpiration());
            editorEdit.putInt(a(key, "LOITERING_DELAY"), value.getLoiteringDelay());
            editorEdit.apply();
        }
    }

    public final void remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorEdit = this.f29824a.edit();
        editorEdit.remove(a(key, "LATITUDE"));
        editorEdit.remove(a(key, "LONGITUDE"));
        editorEdit.remove(a(key, "RADIUS"));
        editorEdit.remove(a(key, "TRANSITION"));
        editorEdit.remove(a(key, "EXPIRATION"));
        editorEdit.remove(a(key, "LOITERING_DELAY"));
        editorEdit.apply();
    }

    @VisibleForTesting
    public final void setPreferences(@NotNull SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.f29824a = prefs;
    }
}
