package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ExtensionRegistryLite {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f47046b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile ExtensionRegistryLite f47047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ExtensionRegistryLite f47048d = new ExtensionRegistryLite(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<b, GeneratedMessageLite.GeneratedExtension<?, ?>> f47049a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Class<?> f47050a;

        static {
            Class<?> cls;
            try {
                cls = Class.forName("com.google.crypto.tink.shaded.protobuf.Extension");
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            f47050a = cls;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f47051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f47052b;

        public b(Object obj, int i10) {
            this.f47051a = obj;
            this.f47052b = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f47051a == bVar.f47051a && this.f47052b == bVar.f47052b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f47051a) * 65535) + this.f47052b;
        }
    }

    public ExtensionRegistryLite() {
        this.f47049a = new HashMap();
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        ExtensionRegistryLite extensionRegistryLiteA = f47047c;
        if (extensionRegistryLiteA == null) {
            synchronized (ExtensionRegistryLite.class) {
                try {
                    extensionRegistryLiteA = f47047c;
                    if (extensionRegistryLiteA == null) {
                        extensionRegistryLiteA = h.a("getEmptyRegistry");
                        if (extensionRegistryLiteA == null) {
                            extensionRegistryLiteA = f47048d;
                        }
                        f47047c = extensionRegistryLiteA;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return extensionRegistryLiteA;
    }

    public static boolean isEagerlyParseMessageSets() {
        return f47046b;
    }

    public static ExtensionRegistryLite newInstance() {
        ExtensionRegistryLite extensionRegistryLiteA = h.a("newInstance");
        return extensionRegistryLiteA != null ? extensionRegistryLiteA : new ExtensionRegistryLite();
    }

    public static void setEagerlyParseMessageSets(boolean z10) {
        f47046b = z10;
    }

    public final void add(GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.f47049a.put(new b(generatedExtension.getContainingTypeDefaultInstance(), generatedExtension.getNumber()), generatedExtension);
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i10) {
        return (GeneratedMessageLite.GeneratedExtension) this.f47049a.get(new b(containingtype, i10));
    }

    public ExtensionRegistryLite getUnmodifiable() {
        return new ExtensionRegistryLite(this);
    }

    public ExtensionRegistryLite(ExtensionRegistryLite extensionRegistryLite) {
        if (extensionRegistryLite == f47048d) {
            this.f47049a = Collections.emptyMap();
        } else {
            this.f47049a = Collections.unmodifiableMap(extensionRegistryLite.f47049a);
        }
    }

    public final void add(ExtensionLite<?, ?> extensionLite) {
        if (GeneratedMessageLite.GeneratedExtension.class.isAssignableFrom(extensionLite.getClass())) {
            add((GeneratedMessageLite.GeneratedExtension<?, ?>) extensionLite);
        }
        Class<?> cls = h.f47223a;
        if (cls == null || !cls.isAssignableFrom(getClass())) {
            return;
        }
        try {
            getClass().getMethod("add", a.f47050a).invoke(this, extensionLite);
        } catch (Exception e5) {
            throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", extensionLite), e5);
        }
    }

    public ExtensionRegistryLite(int i10) {
        this.f47049a = Collections.emptyMap();
    }
}
