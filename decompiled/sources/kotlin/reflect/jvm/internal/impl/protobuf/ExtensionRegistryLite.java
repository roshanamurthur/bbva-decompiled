package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ExtensionRegistryLite {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExtensionRegistryLite f81385b = new ExtensionRegistryLite(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<a, GeneratedMessageLite.GeneratedExtension<?, ?>> f81386a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f81387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81388b;

        public a(Object obj, int i10) {
            this.f81387a = obj;
            this.f81388b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f81387a == aVar.f81387a && this.f81388b == aVar.f81388b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f81387a) * 65535) + this.f81388b;
        }
    }

    public ExtensionRegistryLite() {
        this.f81386a = new HashMap();
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        return f81385b;
    }

    public static ExtensionRegistryLite newInstance() {
        return new ExtensionRegistryLite();
    }

    public final void add(GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.f81386a.put(new a(generatedExtension.getContainingTypeDefaultInstance(), generatedExtension.getNumber()), generatedExtension);
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i10) {
        return (GeneratedMessageLite.GeneratedExtension) this.f81386a.get(new a(containingtype, i10));
    }

    public ExtensionRegistryLite(int i10) {
        this.f81386a = Collections.emptyMap();
    }
}
