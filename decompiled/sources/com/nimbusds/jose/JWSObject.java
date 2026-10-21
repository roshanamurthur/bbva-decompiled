package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.StandardCharset;
import java.text.ParseException;
import java.util.concurrent.atomic.AtomicReference;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class JWSObject extends JOSEObject {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final JWSHeader f62546p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f62547q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Base64URL f62548r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AtomicReference<State> f62549s0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State SIGNED;
        public static final State UNSIGNED;
        public static final State VERIFIED;

        static {
            State state = new State("UNSIGNED", 0);
            UNSIGNED = state;
            State state2 = new State("SIGNED", 1);
            SIGNED = state2;
            State state3 = new State("VERIFIED", 2);
            VERIFIED = state3;
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

    public class a implements CompletableJWSObjectSigning {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActionRequiredForJWSCompletionException f62550a;

        public a(ActionRequiredForJWSCompletionException actionRequiredForJWSCompletionException) {
            this.f62550a = actionRequiredForJWSCompletionException;
        }

        @Override // com.nimbusds.jose.CompletableJWSObjectSigning
        public final Base64URL complete() throws JOSEException {
            Base64URL base64URLComplete = this.f62550a.getCompletableJWSObjectSigning().complete();
            JWSObject jWSObject = JWSObject.this;
            jWSObject.f62548r0 = base64URLComplete;
            jWSObject.f62549s0.set(State.SIGNED);
            return jWSObject.f62548r0;
        }
    }

    public JWSObject(JWSHeader jWSHeader, Payload payload) {
        AtomicReference<State> atomicReference = new AtomicReference<>();
        this.f62549s0 = atomicReference;
        if (jWSHeader == null) {
            throw new IllegalArgumentException("The JWS header must not be null");
        }
        this.f62546p0 = jWSHeader;
        if (payload == null) {
            throw new IllegalArgumentException("The payload must not be null");
        }
        setPayload(payload);
        this.f62547q0 = a();
        this.f62548r0 = null;
        atomicReference.set(State.UNSIGNED);
    }

    public static JWSObject parse(String str) throws ParseException {
        Base64URL[] base64URLArrSplit = JOSEObject.split(str);
        if (base64URLArrSplit.length == 3) {
            return new JWSObject(base64URLArrSplit[0], base64URLArrSplit[1], base64URLArrSplit[2]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be three", 0);
    }

    public final String a() {
        if (this.f62546p0.isBase64URLEncodePayload()) {
            return getHeader().toBase64URL().toString() + '.' + getPayload().toBase64URL().toString();
        }
        return getHeader().toBase64URL().toString() + '.' + getPayload().toString();
    }

    public final void b(JWSSigner jWSSigner) throws JOSEException {
        if (jWSSigner.supportedJWSAlgorithms().contains(getHeader().getAlgorithm())) {
            return;
        }
        throw new JOSEException("The \"" + getHeader().getAlgorithm() + "\" algorithm is not allowed or supported by the JWS signer: Supported algorithms: " + jWSSigner.supportedJWSAlgorithms());
    }

    public Base64URL getSignature() {
        return this.f62548r0;
    }

    public byte[] getSigningInput() {
        return this.f62547q0.getBytes(StandardCharset.UTF_8);
    }

    public State getState() {
        return this.f62549s0.get();
    }

    public String serialize(boolean z10) {
        AtomicReference<State> atomicReference = this.f62549s0;
        if (atomicReference.get() != State.SIGNED && atomicReference.get() != State.VERIFIED) {
            throw new IllegalStateException("The JWS object must be in a signed or verified state");
        }
        if (z10) {
            return this.f62546p0.toBase64URL().toString() + ".." + this.f62548r0.toString();
        }
        return this.f62547q0 + '.' + this.f62548r0.toString();
    }

    public synchronized void sign(JWSSigner jWSSigner) throws JOSEException {
        if (this.f62549s0.get() != State.UNSIGNED) {
            throw new IllegalStateException("The JWS object must be in an unsigned state");
        }
        b(jWSSigner);
        try {
            try {
                try {
                    this.f62548r0 = jWSSigner.sign(getHeader(), getSigningInput());
                    this.f62549s0.set(State.SIGNED);
                } catch (JOSEException e5) {
                    throw e5;
                }
            } catch (Exception e7) {
                throw new JOSEException(e7.getMessage(), e7);
            }
        } catch (ActionRequiredForJWSCompletionException e10) {
            throw new ActionRequiredForJWSCompletionException(e10.getMessage(), e10.getTriggeringOption(), new a(e10));
        }
    }

    public synchronized boolean verify(JWSVerifier jWSVerifier) throws JOSEException {
        boolean zVerify;
        AtomicReference<State> atomicReference = this.f62549s0;
        if (atomicReference.get() != State.SIGNED && atomicReference.get() != State.VERIFIED) {
            throw new IllegalStateException("The JWS object must be in a signed or verified state");
        }
        try {
            zVerify = jWSVerifier.verify(getHeader(), getSigningInput(), getSignature());
            if (zVerify) {
                this.f62549s0.set(State.VERIFIED);
            }
        } catch (JOSEException e5) {
            throw e5;
        } catch (Exception e7) {
            throw new JOSEException(e7.getMessage(), e7);
        }
        return zVerify;
    }

    @Override // com.nimbusds.jose.JOSEObject
    public JWSHeader getHeader() {
        return this.f62546p0;
    }

    public static JWSObject parse(String str, Payload payload) throws ParseException {
        Base64URL[] base64URLArrSplit = JOSEObject.split(str);
        if (base64URLArrSplit.length == 3) {
            if (base64URLArrSplit[1].toString().isEmpty()) {
                return new JWSObject(base64URLArrSplit[0], payload, base64URLArrSplit[2]);
            }
            throw new ParseException("The payload Base64URL part must be empty", 0);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be three", 0);
    }

    @Override // com.nimbusds.jose.JOSEObject
    public String serialize() {
        return serialize(false);
    }

    public JWSObject(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3) throws ParseException {
        this(base64URL, new Payload(base64URL2), base64URL3);
    }

    public JWSObject(Base64URL base64URL, Payload payload, Base64URL base64URL2) throws ParseException {
        AtomicReference<State> atomicReference = new AtomicReference<>();
        this.f62549s0 = atomicReference;
        if (base64URL != null) {
            try {
                this.f62546p0 = JWSHeader.parse(base64URL);
                if (payload != null) {
                    setPayload(payload);
                    this.f62547q0 = a();
                    if (base64URL2 != null) {
                        this.f62548r0 = base64URL2;
                        atomicReference.set(State.SIGNED);
                        if (getHeader().isBase64URLEncodePayload()) {
                            setParsedParts(base64URL, payload.toBase64URL(), base64URL2);
                            return;
                        } else {
                            setParsedParts(base64URL, new Base64URL(""), base64URL2);
                            return;
                        }
                    }
                    throw new IllegalArgumentException("The third part must not be null");
                }
                throw new IllegalArgumentException("The payload (second part) must not be null");
            } catch (ParseException e5) {
                throw new ParseException("Invalid JWS header: " + e5.getMessage(), 0);
            }
        }
        throw new IllegalArgumentException("The first part must not be null");
    }
}
