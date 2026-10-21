package com.adobe.marketing.mobile;

import androidx.camera.camera2.internal.n1;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class VisitorID {
    private static final int RANDOM_HASH_BASE = 17;
    private static final int RANDOM_HASH_PADDING = 31;
    private AuthenticationState authenticationState;
    private final String id;
    private final String idOrigin;
    private final String idType;
    public static final VariantSerializer<VisitorID> VARIANT_SERIALIZER = new VisitorIDVariantSerializer();
    public static final VariantSerializer<List<VisitorID>> LIST_VARIANT_SERIALIZER = new TypedListVariantSerializer(new VisitorIDVariantSerializer());

    public enum AuthenticationState {
        UNKNOWN(0),
        AUTHENTICATED(1),
        LOGGED_OUT(2);

        private final int value;

        AuthenticationState(int i10) {
            this.value = i10;
        }

        public static AuthenticationState fromInteger(int i10) {
            for (AuthenticationState authenticationState : values()) {
                if (authenticationState.getValue() == i10) {
                    return authenticationState;
                }
            }
            return UNKNOWN;
        }

        public int getValue() {
            return this.value;
        }
    }

    public VisitorID(String str, String str2, String str3, AuthenticationState authenticationState) {
        String strCleanContextDataKey = ContextDataUtil.cleanContextDataKey(str2);
        if (StringUtils.isNullOrEmpty(strCleanContextDataKey)) {
            throw new IllegalStateException("idType parameter cannot be null or empty");
        }
        if (StringUtils.isNullOrEmpty(str3)) {
            Log.debug("VisitorID", "The custom VisitorID should not have null/empty id, this VisitorID will be ignored", new Object[0]);
        }
        this.idOrigin = str;
        this.idType = strCleanContextDataKey;
        this.id = str3;
        this.authenticationState = authenticationState;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VisitorID)) {
            return false;
        }
        VisitorID visitorID = (VisitorID) obj;
        if (!this.idType.equals(visitorID.idType)) {
            return false;
        }
        String str = this.id;
        if (str == null) {
            return visitorID.id == null;
        }
        String str2 = visitorID.id;
        return str2 != null && str.compareTo(str2) == 0;
    }

    public AuthenticationState getAuthenticationState() {
        return this.authenticationState;
    }

    public final String getId() {
        return this.id;
    }

    public final String getIdOrigin() {
        return this.idOrigin;
    }

    public final String getIdType() {
        return this.idType;
    }

    public int hashCode() {
        return this.idType.hashCode() + n1.c(this.id, 527, 31);
    }
}
