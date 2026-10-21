package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes2.dex */
@Entity
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class Preference {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "key")
    public String mKey;

    @Nullable
    @ColumnInfo(name = "long_value")
    public Long mValue;

    public Preference(@NonNull String str, boolean z10) {
        this(str, z10 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) obj;
        if (!this.mKey.equals(preference.mKey)) {
            return false;
        }
        Long l6 = this.mValue;
        Long l7 = preference.mValue;
        if (l6 != null) {
            return l6.equals(l7);
        }
        return l7 == null;
    }

    public int hashCode() {
        int iHashCode = this.mKey.hashCode() * 31;
        Long l6 = this.mValue;
        return iHashCode + (l6 != null ? l6.hashCode() : 0);
    }

    public Preference(@NonNull String str, long j10) {
        this.mKey = str;
        this.mValue = Long.valueOf(j10);
    }
}
