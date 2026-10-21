package com.google.crypto.tink;

import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.monitoring.MonitoringAnnotations;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Hex;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class PrimitiveSet<P> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentMap<a, List<Entry<P>>> f46435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Entry<P> f46436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<P> f46437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MonitoringAnnotations f46438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f46439e;

    public static class Builder<P> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<P> f46440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ConcurrentHashMap f46441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Entry<P> f46442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public MonitoringAnnotations f46443d;

        public Builder() {
            throw null;
        }

        public Builder(Class cls) {
            this.f46441b = new ConcurrentHashMap();
            this.f46440a = cls;
            this.f46443d = MonitoringAnnotations.EMPTY;
        }

        @CanIgnoreReturnValue
        public final void a(@Nullable Object obj, @Nullable Object obj2, Keyset.Key key, boolean z10) throws GeneralSecurityException {
            if (this.f46441b == null) {
                throw new IllegalStateException("addPrimitive cannot be called after build");
            }
            if (obj == null && obj2 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (key.getStatus() != KeyStatusType.ENABLED) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            Entry<P> entryA = PrimitiveSet.a(obj, obj2, key, this.f46441b);
            if (z10) {
                if (this.f46442c != null) {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
                this.f46442c = entryA;
            }
        }

        @CanIgnoreReturnValue
        public Builder<P> addFullPrimitiveAndOptionalPrimitive(@Nullable P p4, @Nullable P p10, Keyset.Key key) throws GeneralSecurityException {
            a(p4, p10, key, false);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<P> addPrimaryFullPrimitiveAndOptionalPrimitive(@Nullable P p4, @Nullable P p10, Keyset.Key key) throws GeneralSecurityException {
            a(p4, p10, key, true);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<P> addPrimaryPrimitive(P p4, Keyset.Key key) throws GeneralSecurityException {
            a(null, p4, key, true);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<P> addPrimitive(P p4, Keyset.Key key) throws GeneralSecurityException {
            a(null, p4, key, false);
            return this;
        }

        public PrimitiveSet<P> build() throws GeneralSecurityException {
            ConcurrentHashMap concurrentHashMap = this.f46441b;
            if (concurrentHashMap == null) {
                throw new IllegalStateException("build cannot be called twice");
            }
            PrimitiveSet<P> primitiveSet = new PrimitiveSet<>(concurrentHashMap, this.f46442c, this.f46443d, this.f46440a);
            this.f46441b = null;
            return primitiveSet;
        }

        @CanIgnoreReturnValue
        public Builder<P> setAnnotations(MonitoringAnnotations monitoringAnnotations) {
            if (this.f46441b == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            this.f46443d = monitoringAnnotations;
            return this;
        }
    }

    public static final class Entry<P> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final P f46444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final P f46445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f46446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final KeyStatusType f46447d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final OutputPrefixType f46448e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f46449f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f46450g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Key f46451h;

        public Entry(@Nullable P p4, @Nullable P p10, byte[] bArr, KeyStatusType keyStatusType, OutputPrefixType outputPrefixType, int i10, String str, Key key) {
            this.f46444a = p4;
            this.f46445b = p10;
            this.f46446c = Arrays.copyOf(bArr, bArr.length);
            this.f46447d = keyStatusType;
            this.f46448e = outputPrefixType;
            this.f46449f = i10;
            this.f46450g = str;
            this.f46451h = key;
        }

        @Nullable
        public P getFullPrimitive() {
            return this.f46444a;
        }

        @Nullable
        public final byte[] getIdentifier() {
            byte[] bArr = this.f46446c;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public Key getKey() {
            return this.f46451h;
        }

        public int getKeyId() {
            return this.f46449f;
        }

        public String getKeyType() {
            return this.f46450g;
        }

        public OutputPrefixType getOutputPrefixType() {
            return this.f46448e;
        }

        @Nullable
        public Parameters getParameters() {
            Key key = this.f46451h;
            if (key == null) {
                return null;
            }
            return key.getParameters();
        }

        @Nullable
        public P getPrimitive() {
            return this.f46445b;
        }

        public KeyStatusType getStatus() {
            return this.f46447d;
        }
    }

    public static class a implements Comparable<a> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final byte[] f46452p0;

        public a(byte[] bArr) {
            this.f46452p0 = Arrays.copyOf(bArr, bArr.length);
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            a aVar2 = aVar;
            byte[] bArr = this.f46452p0;
            int length = bArr.length;
            byte[] bArr2 = aVar2.f46452p0;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i10 = 0; i10 < bArr.length; i10++) {
                byte b10 = bArr[i10];
                byte b11 = aVar2.f46452p0[i10];
                if (b10 != b11) {
                    return b10 - b11;
                }
            }
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Arrays.equals(this.f46452p0, ((a) obj).f46452p0);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f46452p0);
        }

        public final String toString() {
            return Hex.encode(this.f46452p0);
        }
    }

    public PrimitiveSet() {
        throw null;
    }

    public PrimitiveSet(Class<P> cls) {
        this.f46435a = new ConcurrentHashMap();
        this.f46437c = cls;
        this.f46438d = MonitoringAnnotations.EMPTY;
        this.f46439e = true;
    }

    public static <P> Entry<P> a(@Nullable P p4, @Nullable P p10, Keyset.Key key, ConcurrentMap<a, List<Entry<P>>> concurrentMap) throws GeneralSecurityException {
        Integer numValueOf = Integer.valueOf(key.getKeyId());
        if (key.getOutputPrefixType() == OutputPrefixType.RAW) {
            numValueOf = null;
        }
        Entry<P> entry = new Entry<>(p4, p10, CryptoFormat.getOutputPrefix(key), key.getStatus(), key.getOutputPrefixType(), key.getKeyId(), key.getKeyData().getTypeUrl(), MutableSerializationRegistry.globalInstance().parseKeyWithLegacyFallback(ProtoKeySerialization.create(key.getKeyData().getTypeUrl(), key.getKeyData().getValue(), key.getKeyData().getKeyMaterialType(), key.getOutputPrefixType(), numValueOf), InsecureSecretKeyAccess.get()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(entry);
        a aVar = new a(entry.getIdentifier());
        List<Entry<P>> listPut = concurrentMap.put(aVar, Collections.unmodifiableList(arrayList));
        if (listPut != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listPut);
            arrayList2.add(entry);
            concurrentMap.put(aVar, Collections.unmodifiableList(arrayList2));
        }
        return entry;
    }

    public static <P> Builder<P> newBuilder(Class<P> cls) {
        return new Builder<>(cls);
    }

    @Deprecated
    public static <P> PrimitiveSet<P> newPrimitiveSet(Class<P> cls) {
        return new PrimitiveSet<>(cls);
    }

    @CanIgnoreReturnValue
    @Deprecated
    public Entry<P> addPrimitive(P p4, Keyset.Key key) throws GeneralSecurityException {
        if (!this.f46439e) {
            throw new IllegalStateException("addPrimitive cannot be called on an immutable primitive set");
        }
        if (key.getStatus() == KeyStatusType.ENABLED) {
            return a(null, p4, key, this.f46435a);
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    public Collection<List<Entry<P>>> getAll() {
        return this.f46435a.values();
    }

    public MonitoringAnnotations getAnnotations() {
        return this.f46438d;
    }

    @Nullable
    public Entry<P> getPrimary() {
        return this.f46436b;
    }

    public List<Entry<P>> getPrimitive(byte[] bArr) {
        List<Entry<P>> list = this.f46435a.get(new a(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public Class<P> getPrimitiveClass() {
        return this.f46437c;
    }

    public List<Entry<P>> getRawPrimitives() {
        return getPrimitive(CryptoFormat.RAW_PREFIX);
    }

    public boolean hasAnnotations() {
        return !this.f46438d.toMap().isEmpty();
    }

    @Deprecated
    public void setPrimary(Entry<P> entry) {
        if (!this.f46439e) {
            throw new IllegalStateException("setPrimary cannot be called on an immutable primitive set");
        }
        if (entry == null) {
            throw new IllegalArgumentException("the primary entry must be non-null");
        }
        if (entry.getStatus() != KeyStatusType.ENABLED) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
        if (getPrimitive(entry.getIdentifier()).isEmpty()) {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        this.f46436b = entry;
    }

    public PrimitiveSet(ConcurrentMap concurrentMap, Entry entry, MonitoringAnnotations monitoringAnnotations, Class cls) {
        this.f46435a = concurrentMap;
        this.f46436b = entry;
        this.f46437c = cls;
        this.f46438d = monitoringAnnotations;
        this.f46439e = false;
    }
}
