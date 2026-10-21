package com.google.crypto.tink.monitoring;

import com.google.crypto.tink.KeyStatus;
import com.google.crypto.tink.annotations.Alpha;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
@Alpha
public final class MonitoringKeysetInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MonitoringAnnotations f46817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Entry> f46818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Integer f46819c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public ArrayList<Entry> f46820a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MonitoringAnnotations f46821b = MonitoringAnnotations.EMPTY;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f46822c = null;

        @CanIgnoreReturnValue
        public Builder addEntry(KeyStatus keyStatus, int i10, String str, String str2) {
            ArrayList<Entry> arrayList = this.f46820a;
            if (arrayList == null) {
                throw new IllegalStateException("addEntry cannot be called after build()");
            }
            arrayList.add(new Entry(keyStatus, i10, str, str2));
            return this;
        }

        public MonitoringKeysetInfo build() throws GeneralSecurityException {
            if (this.f46820a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            Integer num = this.f46822c;
            if (num != null) {
                int iIntValue = num.intValue();
                Iterator<Entry> it = this.f46820a.iterator();
                while (it.hasNext()) {
                    if (it.next().getKeyId() == iIntValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            MonitoringKeysetInfo monitoringKeysetInfo = new MonitoringKeysetInfo(this.f46821b, Collections.unmodifiableList(this.f46820a), this.f46822c);
            this.f46820a = null;
            return monitoringKeysetInfo;
        }

        @CanIgnoreReturnValue
        public Builder setAnnotations(MonitoringAnnotations monitoringAnnotations) {
            if (this.f46820a == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build()");
            }
            this.f46821b = monitoringAnnotations;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPrimaryKeyId(int i10) {
            if (this.f46820a == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            this.f46822c = Integer.valueOf(i10);
            return this;
        }
    }

    @Immutable
    public static final class Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KeyStatus f46823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f46825c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f46826d;

        public Entry(KeyStatus keyStatus, int i10, String str, String str2) {
            this.f46823a = keyStatus;
            this.f46824b = i10;
            this.f46825c = str;
            this.f46826d = str2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.f46823a == entry.f46823a && this.f46824b == entry.f46824b && this.f46825c.equals(entry.f46825c) && this.f46826d.equals(entry.f46826d);
        }

        public int getKeyId() {
            return this.f46824b;
        }

        public String getKeyPrefix() {
            return this.f46826d;
        }

        public String getKeyType() {
            return this.f46825c;
        }

        public KeyStatus getStatus() {
            return this.f46823a;
        }

        public int hashCode() {
            return Objects.hash(this.f46823a, Integer.valueOf(this.f46824b), this.f46825c, this.f46826d);
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f46823a, Integer.valueOf(this.f46824b), this.f46825c, this.f46826d);
        }
    }

    public MonitoringKeysetInfo() {
        throw null;
    }

    public MonitoringKeysetInfo(MonitoringAnnotations monitoringAnnotations, List list, Integer num) {
        this.f46817a = monitoringAnnotations;
        this.f46818b = list;
        this.f46819c = num;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MonitoringKeysetInfo)) {
            return false;
        }
        MonitoringKeysetInfo monitoringKeysetInfo = (MonitoringKeysetInfo) obj;
        return this.f46817a.equals(monitoringKeysetInfo.f46817a) && this.f46818b.equals(monitoringKeysetInfo.f46818b) && Objects.equals(this.f46819c, monitoringKeysetInfo.f46819c);
    }

    public MonitoringAnnotations getAnnotations() {
        return this.f46817a;
    }

    public List<Entry> getEntries() {
        return this.f46818b;
    }

    @Nullable
    public Integer getPrimaryKeyId() {
        return this.f46819c;
    }

    public int hashCode() {
        return Objects.hash(this.f46817a, this.f46818b);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f46817a, this.f46818b, this.f46819c);
    }
}
