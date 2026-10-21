package net.ipsoft.amelia.sdk;

/* JADX INFO: loaded from: classes12.dex */
public interface IAmeliaError {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Code {
        private static final /* synthetic */ Code[] $VALUES;
        public static final Code authenticationFailure;
        public static final Code error;
        public static final Code illegalAnonymousLogin;
        public static final Code invalidContent;
        public static final Code invalidSession;
        public static final Code missingSessionCookie;
        public static final Code networkError;
        public static final Code unexpectedResponse;
        public static final Code unsupportedSdkVersion;

        static {
            Code code = new Code("error", 0);
            error = code;
            Code code2 = new Code("invalidContent", 1);
            invalidContent = code2;
            Code code3 = new Code("networkError", 2);
            networkError = code3;
            Code code4 = new Code("unexpectedResponse", 3);
            unexpectedResponse = code4;
            Code code5 = new Code("illegalAnonymousLogin", 4);
            illegalAnonymousLogin = code5;
            Code code6 = new Code("invalidSession", 5);
            invalidSession = code6;
            Code code7 = new Code("unsupportedSdkVersion", 6);
            unsupportedSdkVersion = code7;
            Code code8 = new Code("missingSessionCookie", 7);
            missingSessionCookie = code8;
            Code code9 = new Code("authenticationFailure", 8);
            authenticationFailure = code9;
            $VALUES = new Code[]{code, code2, code3, code4, code5, code6, code7, code8, code9};
        }

        public Code() {
            throw null;
        }

        public static Code valueOf(String str) {
            return (Code) Enum.valueOf(Code.class, str);
        }

        public static Code[] values() {
            return (Code[]) $VALUES.clone();
        }
    }

    Throwable getCause();

    Code getCode();

    String getMessage();
}
