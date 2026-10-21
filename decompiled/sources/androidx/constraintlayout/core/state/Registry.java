package androidx.constraintlayout.core.state;

import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class Registry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Registry f19028b = new Registry();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, RegistryCallback> f19029a = new HashMap<>();

    public static Registry getInstance() {
        return f19028b;
    }

    public String currentContent(String str) {
        RegistryCallback registryCallback = this.f19029a.get(str);
        if (registryCallback != null) {
            return registryCallback.currentMotionScene();
        }
        return null;
    }

    public String currentLayoutInformation(String str) {
        RegistryCallback registryCallback = this.f19029a.get(str);
        if (registryCallback != null) {
            return registryCallback.currentLayoutInformation();
        }
        return null;
    }

    public long getLastModified(String str) {
        RegistryCallback registryCallback = this.f19029a.get(str);
        if (registryCallback != null) {
            return registryCallback.getLastModified();
        }
        return Long.MAX_VALUE;
    }

    public Set<String> getLayoutList() {
        return this.f19029a.keySet();
    }

    public void register(String str, RegistryCallback registryCallback) {
        this.f19029a.put(str, registryCallback);
    }

    public void setDrawDebug(String str, int i10) {
        RegistryCallback registryCallback = this.f19029a.get(str);
        if (registryCallback != null) {
            registryCallback.setDrawDebug(i10);
        }
    }

    public void setLayoutInformationMode(String str, int i10) {
        RegistryCallback registryCallback = this.f19029a.get(str);
        if (registryCallback != null) {
            registryCallback.setLayoutInformationMode(i10);
        }
    }

    public void unregister(String str, RegistryCallback registryCallback) {
        this.f19029a.remove(str);
    }

    public void updateContent(String str, String str2) {
        RegistryCallback registryCallback = this.f19029a.get(str);
        if (registryCallback != null) {
            registryCallback.onNewMotionScene(str2);
        }
    }

    public void updateDimensions(String str, int i10, int i11) {
        RegistryCallback registryCallback = this.f19029a.get(str);
        if (registryCallback != null) {
            registryCallback.onDimensions(i10, i11);
        }
    }

    public void updateProgress(String str, float f6) {
        RegistryCallback registryCallback = this.f19029a.get(str);
        if (registryCallback != null) {
            registryCallback.onProgress(f6);
        }
    }
}
