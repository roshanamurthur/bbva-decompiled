package com.bbva.zoomauth.facialauth.constant;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AuthConstants.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bbva/zoomauth/facialauth/constant/AuthConstants;", "", "()V", "AES", "", "ALGORITHM_AES", "ALGORITHM_RSA", "CELLPHONE", "CHANNEL", "EXPONENTIAL", "EXTRA_KEY_FACIAL_AUTH_DATA", "FACE_MAP", "FACIAL_AUTH_CHANNEL", "FACIAL_AUTH_PROVIDER", "IMAGE", "INITIALIZATION_VECTOR", "PRIVATE_KEY", "PROVIDER", "RSA", "SESSION_ID", AuthConstants.SHA1PRNG, "zoomauth_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AuthConstants {

    @NotNull
    public static final String AES = "AES";

    @NotNull
    public static final String ALGORITHM_AES = "AES/CBC/PKCS5Padding";

    @NotNull
    public static final String ALGORITHM_RSA = "RSA/ECB/PKCS1Padding";

    @NotNull
    public static final String CELLPHONE = "cellPhone";

    @NotNull
    public static final String CHANNEL = "channel";

    @NotNull
    public static final String EXPONENTIAL = "65537";

    @NotNull
    public static final String EXTRA_KEY_FACIAL_AUTH_DATA = "facialAuthExtraData";

    @NotNull
    public static final String FACE_MAP = "facemap";

    @NotNull
    public static final String FACIAL_AUTH_CHANNEL = "MG";

    @NotNull
    public static final String FACIAL_AUTH_PROVIDER = "MORPHO";

    @NotNull
    public static final String IMAGE = "image";

    @NotNull
    public static final String INITIALIZATION_VECTOR = "initializationVector";

    @NotNull
    public static final AuthConstants INSTANCE = new AuthConstants();

    @NotNull
    public static final String PRIVATE_KEY = "key";

    @NotNull
    public static final String PROVIDER = "provider";

    @NotNull
    public static final String RSA = "RSA";

    @NotNull
    public static final String SESSION_ID = "sessionId";

    @NotNull
    public static final String SHA1PRNG = "SHA1PRNG";
}
