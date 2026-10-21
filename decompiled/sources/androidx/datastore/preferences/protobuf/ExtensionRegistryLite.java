package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ExtensionRegistryLite {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f20882b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class<?> f20883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile ExtensionRegistryLite f20884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ExtensionRegistryLite f20885e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<a, GeneratedMessageLite.GeneratedExtension<?, ?>> f20886a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f20887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20888b;

        public a(Object obj, int i10) {
            this.f20887a = obj;
            this.f20888b = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f20887a == aVar.f20887a && this.f20888b == aVar.f20888b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f20887a) * 65535) + this.f20888b;
        }
    }

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f20883c = cls;
        f20885e = new ExtensionRegistryLite(0);
    }

    public ExtensionRegistryLite() {
        this.f20886a = new HashMap();
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        ExtensionRegistryLite extensionRegistryLite = f20884d;
        if (extensionRegistryLite == null) {
            synchronized (ExtensionRegistryLite.class) {
                try {
                    extensionRegistryLite = f20884d;
                    if (extensionRegistryLite == null) {
                        Class<?> cls = j.f21069a;
                        if (cls != null) {
                            try {
                                extensionRegistryLite = (ExtensionRegistryLite) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                            } catch (Exception unused) {
                                extensionRegistryLite = f20885e;
                            }
                        } else {
                            extensionRegistryLite = f20885e;
                        }
                        f20884d = extensionRegistryLite;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return extensionRegistryLite;
    }

    public static boolean isEagerlyParseMessageSets() {
        return f20882b;
    }

    public static ExtensionRegistryLite newInstance() {
        Class<?> cls = j.f21069a;
        if (cls != null) {
            try {
                return (ExtensionRegistryLite) cls.getDeclaredMethod("newInstance", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return new ExtensionRegistryLite();
    }

    public static void setEagerlyParseMessageSets(boolean z10) {
        f20882b = z10;
    }

    public final void add(GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.f20886a.put(new a(generatedExtension.getContainingTypeDefaultInstance(), generatedExtension.getNumber()), generatedExtension);
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i10) {
        return (GeneratedMessageLite.GeneratedExtension) this.f20886a.get(new a(containingtype, i10));
    }

    public ExtensionRegistryLite getUnmodifiable() {
        return new ExtensionRegistryLite(this);
    }

    public ExtensionRegistryLite(ExtensionRegistryLite extensionRegistryLite) {
        if (extensionRegistryLite == f20885e) {
            this.f20886a = Collections.emptyMap();
        } else {
            this.f20886a = Collections.unmodifiableMap(extensionRegistryLite.f20886a);
        }
    }

    public final void add(ExtensionLite<?, ?> extensionLite) {
        if (GeneratedMessageLite.GeneratedExtension.class.isAssignableFrom(extensionLite.getClass())) {
            add((GeneratedMessageLite.GeneratedExtension<?, ?>) extensionLite);
        }
        Class<?> cls = j.f21069a;
        if (cls == null || !cls.isAssignableFrom(getClass())) {
            return;
        }
        try {
            getClass().getMethod("add", f20883c).invoke(this, extensionLite);
        } catch (Exception e5) {
            throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", extensionLite), e5);
        }
    }

    public ExtensionRegistryLite(int i10) {
        this.f20886a = Collections.emptyMap();
    }
}
