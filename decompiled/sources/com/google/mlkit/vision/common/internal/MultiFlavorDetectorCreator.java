package com.google.mlkit.vision.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.inject.Provider;
import com.google.mlkit.common.sdkinternal.ClientPriority;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class MultiFlavorDetectorCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f49594a = new HashMap();

    /* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
    @KeepForSdk
    public interface DetectorCreator<DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> {
        @NonNull
        @KeepForSdk
        DetectorT create(@NonNull OptionsT optionst);
    }

    /* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
    @KeepForSdk
    public interface DetectorOptions<DetectorT> {
    }

    /* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
    @KeepForSdk
    public interface MultiFlavorDetector {
    }

    /* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
    @KeepForSdk
    public static class Registration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f49595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Provider f49596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @ClientPriority
        public final int f49597c;

        @KeepForSdk
        public <DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> Registration(@NonNull Class<? extends OptionsT> cls, @NonNull Provider<? extends DetectorCreator<DetectorT, OptionsT>> provider, @ClientPriority int i10) {
            this.f49595a = cls;
            this.f49596b = provider;
            this.f49597c = i10;
        }

        @KeepForSdk
        public <DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> Registration(@NonNull Class<? extends OptionsT> cls, @NonNull Provider<? extends DetectorCreator<DetectorT, OptionsT>> provider) {
            this(cls, provider, 100);
        }
    }

    public MultiFlavorDetectorCreator(Set set) {
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Registration registration = (Registration) it.next();
            Class cls = registration.f49595a;
            boolean zContainsKey = this.f49594a.containsKey(cls);
            int i10 = registration.f49597c;
            if (!zContainsKey || i10 >= ((Integer) Preconditions.checkNotNull((Integer) map.get(cls))).intValue()) {
                this.f49594a.put(cls, registration.f49596b);
                map.put(cls, Integer.valueOf(i10));
            }
        }
    }

    @NonNull
    @KeepForSdk
    public static synchronized MultiFlavorDetectorCreator getInstance() {
        return (MultiFlavorDetectorCreator) MlKitContext.getInstance().get(MultiFlavorDetectorCreator.class);
    }

    @NonNull
    @KeepForSdk
    public <DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> DetectorT create(@NonNull OptionsT optionst) {
        return (DetectorT) ((DetectorCreator) ((Provider) Preconditions.checkNotNull((Provider) this.f49594a.get(optionst.getClass()))).get()).create(optionst);
    }
}
