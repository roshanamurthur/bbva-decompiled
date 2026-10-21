package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;
import java.text.ParseException;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class JWEObject extends JOSEObject {
    private static final long serialVersionUID = 1;
    private Base64URL authTag;
    private Base64URL cipherText;
    private Base64URL encryptedKey;
    private JWEHeader header;
    private Base64URL iv;
    private State state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State DECRYPTED;
        public static final State ENCRYPTED;
        public static final State UNENCRYPTED;

        static {
            State state = new State("UNENCRYPTED", 0);
            UNENCRYPTED = state;
            State state2 = new State("ENCRYPTED", 1);
            ENCRYPTED = state2;
            State state3 = new State("DECRYPTED", 2);
            DECRYPTED = state3;
            $VALUES = new State[]{state, state2, state3};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public JWEObject(JWEHeader jWEHeader, Payload payload) {
        if (jWEHeader == null) {
            throw new IllegalArgumentException("The JWE header must not be null");
        }
        this.header = jWEHeader;
        if (payload == null) {
            throw new IllegalArgumentException("The payload must not be null");
        }
        setPayload(payload);
        this.encryptedKey = null;
        this.cipherText = null;
        this.state = State.UNENCRYPTED;
    }

    private void ensureEncryptedOrDecryptedState() {
        State state = this.state;
        if (state != State.ENCRYPTED && state != State.DECRYPTED) {
            throw new IllegalStateException("The JWE object must be in an encrypted or decrypted state");
        }
    }

    private void ensureEncryptedState() {
        if (this.state != State.ENCRYPTED) {
            throw new IllegalStateException("The JWE object must be in an encrypted state");
        }
    }

    private void ensureJWEEncrypterSupport(JWEEncrypter jWEEncrypter) throws JOSEException {
        if (!jWEEncrypter.supportedJWEAlgorithms().contains(getHeader().getAlgorithm())) {
            throw new JOSEException("The \"" + getHeader().getAlgorithm() + "\" algorithm is not supported by the JWE encrypter: Supported algorithms: " + jWEEncrypter.supportedJWEAlgorithms());
        }
        if (jWEEncrypter.supportedEncryptionMethods().contains(getHeader().getEncryptionMethod())) {
            return;
        }
        throw new JOSEException("The \"" + getHeader().getEncryptionMethod() + "\" encryption method or key size is not supported by the JWE encrypter: Supported methods: " + jWEEncrypter.supportedEncryptionMethods());
    }

    private void ensureUnencryptedState() {
        if (this.state != State.UNENCRYPTED) {
            throw new IllegalStateException("The JWE object must be in an unencrypted state");
        }
    }

    public static JWEObject parse(String str) throws ParseException {
        Base64URL[] base64URLArrSplit = JOSEObject.split(str);
        if (base64URLArrSplit.length == 5) {
            return new JWEObject(base64URLArrSplit[0], base64URLArrSplit[1], base64URLArrSplit[2], base64URLArrSplit[3], base64URLArrSplit[4]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be five", 0);
    }

    public synchronized void decrypt(JWEDecrypter jWEDecrypter) throws JOSEException {
        ensureEncryptedState();
        try {
            setPayload(new Payload(jWEDecrypter.decrypt(getHeader(), getEncryptedKey(), getIV(), getCipherText(), getAuthTag())));
            this.state = State.DECRYPTED;
        } catch (JOSEException e5) {
            throw e5;
        } catch (Exception e7) {
            throw new JOSEException(e7.getMessage(), e7);
        }
    }

    public synchronized void encrypt(JWEEncrypter jWEEncrypter) throws JOSEException {
        try {
            ensureUnencryptedState();
            ensureJWEEncrypterSupport(jWEEncrypter);
            try {
                try {
                    JWECryptoParts jWECryptoPartsEncrypt = jWEEncrypter.encrypt(getHeader(), getPayload().toBytes());
                    if (jWECryptoPartsEncrypt.getHeader() != null) {
                        this.header = jWECryptoPartsEncrypt.getHeader();
                    }
                    this.encryptedKey = jWECryptoPartsEncrypt.getEncryptedKey();
                    this.iv = jWECryptoPartsEncrypt.getInitializationVector();
                    this.cipherText = jWECryptoPartsEncrypt.getCipherText();
                    this.authTag = jWECryptoPartsEncrypt.getAuthenticationTag();
                    this.state = State.ENCRYPTED;
                } catch (Exception e5) {
                    throw new JOSEException(e5.getMessage(), e5);
                }
            } catch (JOSEException e7) {
                throw e7;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public Base64URL getAuthTag() {
        return this.authTag;
    }

    public Base64URL getCipherText() {
        return this.cipherText;
    }

    public Base64URL getEncryptedKey() {
        return this.encryptedKey;
    }

    public Base64URL getIV() {
        return this.iv;
    }

    public State getState() {
        return this.state;
    }

    @Override // com.nimbusds.jose.JOSEObject
    public String serialize() {
        ensureEncryptedOrDecryptedState();
        StringBuilder sb2 = new StringBuilder(this.header.toBase64URL().toString());
        sb2.append('.');
        Base64URL base64URL = this.encryptedKey;
        if (base64URL != null) {
            sb2.append(base64URL.toString());
        }
        sb2.append('.');
        Base64URL base64URL2 = this.iv;
        if (base64URL2 != null) {
            sb2.append(base64URL2.toString());
        }
        sb2.append('.');
        sb2.append(this.cipherText.toString());
        sb2.append('.');
        Base64URL base64URL3 = this.authTag;
        if (base64URL3 != null) {
            sb2.append(base64URL3.toString());
        }
        return sb2.toString();
    }

    @Override // com.nimbusds.jose.JOSEObject
    public JWEHeader getHeader() {
        return this.header;
    }

    public JWEObject(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5) throws ParseException {
        if (base64URL != null) {
            try {
                this.header = JWEHeader.parse(base64URL);
                if (base64URL2 != null && !base64URL2.toString().isEmpty()) {
                    this.encryptedKey = base64URL2;
                } else {
                    this.encryptedKey = null;
                }
                if (base64URL3 != null && !base64URL3.toString().isEmpty()) {
                    this.iv = base64URL3;
                } else {
                    this.iv = null;
                }
                if (base64URL4 != null) {
                    this.cipherText = base64URL4;
                    if (base64URL5 != null && !base64URL5.toString().isEmpty()) {
                        this.authTag = base64URL5;
                    } else {
                        this.authTag = null;
                    }
                    this.state = State.ENCRYPTED;
                    setParsedParts(base64URL, base64URL2, base64URL3, base64URL4, base64URL5);
                    return;
                }
                throw new IllegalArgumentException("The fourth part must not be null");
            } catch (ParseException e5) {
                throw new ParseException("Invalid JWE header: " + e5.getMessage(), 0);
            }
        }
        throw new IllegalArgumentException("The first part must not be null");
    }
}
