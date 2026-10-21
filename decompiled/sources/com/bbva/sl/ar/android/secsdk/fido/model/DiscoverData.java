package com.bbva.sl.ar.android.secsdk.fido.model;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.bbva.sl.ar.android.secsdk.fido.BiometricCapability;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class DiscoverData {
    private static final String AVAILABLE_AUTHENTICATORS_TAG = "availableAuthenticators";

    @SerializedName(AVAILABLE_AUTHENTICATORS_TAG)
    public List<DiscoverAuthenticator> availableAuthenticators;
    private static final HashSet<String> WEAK_AUTHENTICATOR_AAIDS = new HashSet<>(Arrays.asList("4e4e#40aa", "4e4e#40ab", "4e4e#40ac", "4e4e#40ad", "4e4e#40ae", "4e4e#40af"));
    private static final HashSet<String> STRONG_AUTHENTICATOR_AAIDS = new HashSet<>(Arrays.asList("4e4e#4010", "4e4e#4011", "4e4e#4012", "4e4e#4013", "4e4e#4018", "4e4e#4038", "4e4e#4039", "4e4e#403a", "4e4e#40a1"));

    /* JADX INFO: renamed from: com.bbva.sl.ar.android.secsdk.fido.model.DiscoverData$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$bbva$sl$ar$android$secsdk$fido$BiometricCapability;

        static {
            int[] iArr = new int[BiometricCapability.values().length];
            $SwitchMap$com$bbva$sl$ar$android$secsdk$fido$BiometricCapability = iArr;
            try {
                iArr[BiometricCapability.BIOMETRIC_STRONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bbva$sl$ar$android$secsdk$fido$BiometricCapability[BiometricCapability.BIOMETRIC_WEAK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Keep
    public static class DiscoverAuthenticator {

        @Nullable
        @SerializedName("aaid")
        private String aaid;

        @Nullable
        @SerializedName("description")
        private String description;

        @Nullable
        @SerializedName("keyProtection")
        private int keyProtection;

        @Nullable
        @SerializedName("name")
        private int name;

        @Nullable
        @SerializedName("userVerification")
        private int userVerification;

        public String getAaid() {
            return this.aaid;
        }

        public String getDescription() {
            return this.description;
        }

        public int getKeyProtection() {
            return this.keyProtection;
        }

        public int getName() {
            return this.name;
        }

        public int getUserVerification() {
            return this.userVerification;
        }
    }

    public boolean contains(BiometricCapability biometricCapability) {
        HashSet<String> hashSet;
        if (this.availableAuthenticators == null) {
            return false;
        }
        int i10 = AnonymousClass1.$SwitchMap$com$bbva$sl$ar$android$secsdk$fido$BiometricCapability[biometricCapability.ordinal()];
        if (i10 != 1) {
            hashSet = i10 != 2 ? new HashSet<>() : WEAK_AUTHENTICATOR_AAIDS;
        } else {
            hashSet = STRONG_AUTHENTICATOR_AAIDS;
        }
        Iterator<DiscoverAuthenticator> it = this.availableAuthenticators.iterator();
        while (it.hasNext()) {
            if (hashSet.contains(it.next().aaid)) {
                return true;
            }
        }
        return false;
    }

    public List<String> getAaids() {
        ArrayList arrayList = new ArrayList();
        List<DiscoverAuthenticator> list = this.availableAuthenticators;
        if (list != null) {
            for (DiscoverAuthenticator discoverAuthenticator : list) {
                if (discoverAuthenticator.aaid != null) {
                    arrayList.add(discoverAuthenticator.aaid);
                }
            }
        }
        return arrayList;
    }

    public boolean isEmpty() {
        List<DiscoverAuthenticator> list = this.availableAuthenticators;
        return list == null || list.isEmpty();
    }
}
