package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;
import java.text.ParseException;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class PlainObject extends JOSEObject {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final PlainHeader f62560p0;

    public PlainObject(Payload payload) {
        if (payload == null) {
            throw new IllegalArgumentException("The payload must not be null");
        }
        setPayload(payload);
        this.f62560p0 = new PlainHeader();
    }

    public static PlainObject parse(String str) throws ParseException {
        Base64URL[] base64URLArrSplit = JOSEObject.split(str);
        if (base64URLArrSplit[2].toString().isEmpty()) {
            return new PlainObject(base64URLArrSplit[0], base64URLArrSplit[1]);
        }
        throw new ParseException("Unexpected third Base64URL part", 0);
    }

    @Override // com.nimbusds.jose.JOSEObject
    public String serialize() {
        return this.f62560p0.toBase64URL().toString() + '.' + getPayload().toBase64URL().toString() + '.';
    }

    @Override // com.nimbusds.jose.JOSEObject
    public PlainHeader getHeader() {
        return this.f62560p0;
    }

    public PlainObject(PlainHeader plainHeader, Payload payload) {
        if (plainHeader != null) {
            this.f62560p0 = plainHeader;
            if (payload != null) {
                setPayload(payload);
                return;
            }
            throw new IllegalArgumentException("The payload must not be null");
        }
        throw new IllegalArgumentException("The unsecured header must not be null");
    }

    public PlainObject(Base64URL base64URL, Base64URL base64URL2) throws ParseException {
        if (base64URL != null) {
            try {
                this.f62560p0 = PlainHeader.parse(base64URL);
                if (base64URL2 != null) {
                    setPayload(new Payload(base64URL2));
                    setParsedParts(base64URL, base64URL2, null);
                    return;
                }
                throw new IllegalArgumentException("The second part must not be null");
            } catch (ParseException e5) {
                throw new ParseException("Invalid unsecured header: " + e5.getMessage(), 0);
            }
        }
        throw new IllegalArgumentException("The first part must not be null");
    }
}
