package com.nimbusds.jwt;

import com.nimbusds.jose.JOSEObject;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.PlainHeader;
import com.nimbusds.jose.PlainObject;
import com.nimbusds.jose.util.Base64URL;
import java.text.ParseException;
import java.util.Map;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class PlainJWT extends PlainObject implements JWT {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public JWTClaimsSet f62836q0;

    public PlainJWT(JWTClaimsSet jWTClaimsSet) {
        super(new Payload(jWTClaimsSet.toJSONObject()));
        this.f62836q0 = jWTClaimsSet;
    }

    public static PlainJWT parse(String str) throws ParseException {
        Base64URL[] base64URLArrSplit = JOSEObject.split(str);
        if (base64URLArrSplit[2].toString().isEmpty()) {
            return new PlainJWT(base64URLArrSplit[0], base64URLArrSplit[1]);
        }
        throw new ParseException("Unexpected third Base64URL part in the unsecured JWT object", 0);
    }

    @Override // com.nimbusds.jwt.JWT
    public JWTClaimsSet getJWTClaimsSet() throws ParseException {
        JWTClaimsSet jWTClaimsSet = this.f62836q0;
        if (jWTClaimsSet != null) {
            return jWTClaimsSet;
        }
        Map<String, Object> jSONObject = getPayload().toJSONObject();
        if (jSONObject == null) {
            throw new ParseException("Payload of unsecured JOSE object is not a valid JSON object", 0);
        }
        JWTClaimsSet jWTClaimsSet2 = JWTClaimsSet.parse(jSONObject);
        this.f62836q0 = jWTClaimsSet2;
        return jWTClaimsSet2;
    }

    @Override // com.nimbusds.jose.JOSEObject
    public void setPayload(Payload payload) {
        this.f62836q0 = null;
        super.setPayload(payload);
    }

    public PlainJWT(PlainHeader plainHeader, JWTClaimsSet jWTClaimsSet) {
        super(plainHeader, new Payload(jWTClaimsSet.toJSONObject()));
        this.f62836q0 = jWTClaimsSet;
    }

    public PlainJWT(Base64URL base64URL, Base64URL base64URL2) throws ParseException {
        super(base64URL, base64URL2);
    }
}
