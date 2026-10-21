package androidx.datastore.migrations;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SharedPreferencesMigration.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"", "", "a", "Ljava/util/Set;", "getMIGRATE_ALL_KEYS", "()Ljava/util/Set;", "MIGRATE_ALL_KEYS", "datastore_release"}, k = 2, mv = {1, 5, 1})
public final class SharedPreferencesMigrationKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final LinkedHashSet f20758a = new LinkedHashSet();

    @NotNull
    public static final Set<String> getMIGRATE_ALL_KEYS() {
        return f20758a;
    }
}
