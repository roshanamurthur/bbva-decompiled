package androidx.datastore.preferences.core;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import bk.q;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Preferences.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\u0004H&J\u001d\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u0005H¦\u0002J$\u0010\n\u001a\u0004\u0018\u0001H\b\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u0005H¦\u0002¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u0000¨\u0006\u0011"}, d2 = {"Landroidx/datastore/preferences/core/Preferences;", "", "()V", "asMap", "", "Landroidx/datastore/preferences/core/Preferences$Key;", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", ExifInterface.GPS_DIRECTION_TRUE, "key", "get", "(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;", "toMutablePreferences", "Landroidx/datastore/preferences/core/MutablePreferences;", "toPreferences", "Key", "Pair", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class Preferences {

    /* JADX INFO: compiled from: Preferences.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/datastore/preferences/core/Preferences$Key;", ExifInterface.GPS_DIRECTION_TRUE, "", "value", "Landroidx/datastore/preferences/core/Preferences$Pair;", TypedValues.TransitionType.S_TO, "(Ljava/lang/Object;)Landroidx/datastore/preferences/core/Preferences$Pair;", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "<init>", "(Ljava/lang/String;)V", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1})
    public static final class Key<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String name;

        public Key(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        public boolean equals(@Nullable Object other) {
            if (!(other instanceof Key)) {
                return false;
            }
            return Intrinsics.areEqual(this.name, ((Key) other).name);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @NotNull
        public final Pair<T> to(T value) {
            return new Pair<>(this, value);
        }

        @NotNull
        public String toString() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: Preferences.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\b\u0000\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/datastore/preferences/core/Preferences$Pair;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/datastore/preferences/core/Preferences$Key;", "a", "Landroidx/datastore/preferences/core/Preferences$Key;", "getKey$datastore_preferences_core", "()Landroidx/datastore/preferences/core/Preferences$Key;", "key", "b", "Ljava/lang/Object;", "getValue$datastore_preferences_core", "()Ljava/lang/Object;", "value", "<init>", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1})
    public static final class Pair<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Key<T> key;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final T value;

        public Pair(@NotNull Key<T> key, T t10) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.value = t10;
        }

        @NotNull
        public final Key<T> getKey$datastore_preferences_core() {
            return this.key;
        }

        public final T getValue$datastore_preferences_core() {
            return this.value;
        }
    }

    @NotNull
    public abstract Map<Key<?>, Object> asMap();

    public abstract <T> boolean contains(@NotNull Key<T> key);

    @Nullable
    public abstract <T> T get(@NotNull Key<T> key);

    @NotNull
    public final MutablePreferences toMutablePreferences() {
        return new MutablePreferences(q.toMutableMap(asMap()), false);
    }

    @NotNull
    public final Preferences toPreferences() {
        return new MutablePreferences(q.toMutableMap(asMap()), true);
    }
}
