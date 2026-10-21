package com.bbva.ethermobilesdk.cipher.jwt.model;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Date;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JwtPayload.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u00120\b\u0002\u0010\n\u001a*\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000bj\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\f¢\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J1\u0010\u001e\u001a*\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000bj\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\fHÆ\u0003J\u0083\u0001\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u000320\b\u0002\u0010\n\u001a*\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000bj\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR9\u0010\n\u001a*\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000bj\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006&"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/jwt/model/JwtPayload;", "", "issuer", "", "subject", "audience", "expirationTime", "Ljava/util/Date;", "notBeforeTime", "jwtId", "claim", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/HashMap;)V", "getAudience", "()Ljava/lang/String;", "getClaim", "()Ljava/util/HashMap;", "getExpirationTime", "()Ljava/util/Date;", "getIssuer", "getJwtId", "getNotBeforeTime", "getSubject", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "jwt-sign_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class JwtPayload {

    @Nullable
    private final String audience;

    @Nullable
    private final HashMap<String, Object> claim;

    @Nullable
    private final Date expirationTime;

    @Nullable
    private final String issuer;

    @Nullable
    private final String jwtId;

    @Nullable
    private final Date notBeforeTime;

    @Nullable
    private final String subject;

    public JwtPayload() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JwtPayload copy$default(JwtPayload jwtPayload, String str, String str2, String str3, Date date, Date date2, String str4, HashMap map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = jwtPayload.issuer;
        }
        if ((i10 & 2) != 0) {
            str2 = jwtPayload.subject;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = jwtPayload.audience;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            date = jwtPayload.expirationTime;
        }
        Date date3 = date;
        if ((i10 & 16) != 0) {
            date2 = jwtPayload.notBeforeTime;
        }
        Date date4 = date2;
        if ((i10 & 32) != 0) {
            str4 = jwtPayload.jwtId;
        }
        String str7 = str4;
        if ((i10 & 64) != 0) {
            map = jwtPayload.claim;
        }
        return jwtPayload.copy(str, str5, str6, date3, date4, str7, map);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAudience() {
        return this.audience;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getExpirationTime() {
        return this.expirationTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getNotBeforeTime() {
        return this.notBeforeTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getJwtId() {
        return this.jwtId;
    }

    @Nullable
    public final HashMap<String, Object> component7() {
        return this.claim;
    }

    @NotNull
    public final JwtPayload copy(@Nullable String issuer, @Nullable String subject, @Nullable String audience, @Nullable Date expirationTime, @Nullable Date notBeforeTime, @Nullable String jwtId, @Nullable HashMap<String, Object> claim) {
        return new JwtPayload(issuer, subject, audience, expirationTime, notBeforeTime, jwtId, claim);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JwtPayload)) {
            return false;
        }
        JwtPayload jwtPayload = (JwtPayload) other;
        return Intrinsics.areEqual(this.issuer, jwtPayload.issuer) && Intrinsics.areEqual(this.subject, jwtPayload.subject) && Intrinsics.areEqual(this.audience, jwtPayload.audience) && Intrinsics.areEqual(this.expirationTime, jwtPayload.expirationTime) && Intrinsics.areEqual(this.notBeforeTime, jwtPayload.notBeforeTime) && Intrinsics.areEqual(this.jwtId, jwtPayload.jwtId) && Intrinsics.areEqual(this.claim, jwtPayload.claim);
    }

    @Nullable
    public final String getAudience() {
        return this.audience;
    }

    @Nullable
    public final HashMap<String, Object> getClaim() {
        return this.claim;
    }

    @Nullable
    public final Date getExpirationTime() {
        return this.expirationTime;
    }

    @Nullable
    public final String getIssuer() {
        return this.issuer;
    }

    @Nullable
    public final String getJwtId() {
        return this.jwtId;
    }

    @Nullable
    public final Date getNotBeforeTime() {
        return this.notBeforeTime;
    }

    @Nullable
    public final String getSubject() {
        return this.subject;
    }

    public int hashCode() {
        String str = this.issuer;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subject;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.audience;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Date date = this.expirationTime;
        int iHashCode4 = (iHashCode3 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.notBeforeTime;
        int iHashCode5 = (iHashCode4 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str4 = this.jwtId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        HashMap<String, Object> map = this.claim;
        return iHashCode6 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.issuer;
        String str2 = this.subject;
        String str3 = this.audience;
        Date date = this.expirationTime;
        Date date2 = this.notBeforeTime;
        String str4 = this.jwtId;
        HashMap<String, Object> map = this.claim;
        StringBuilder sbC = a.c("JwtPayload(issuer=", str, ", subject=", str2, ", audience=");
        sbC.append(str3);
        sbC.append(", expirationTime=");
        sbC.append(date);
        sbC.append(", notBeforeTime=");
        sbC.append(date2);
        sbC.append(", jwtId=");
        sbC.append(str4);
        sbC.append(", claim=");
        sbC.append(map);
        sbC.append(")");
        return sbC.toString();
    }

    public JwtPayload(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Date date, @Nullable Date date2, @Nullable String str4, @Nullable HashMap<String, Object> map) {
        this.issuer = str;
        this.subject = str2;
        this.audience = str3;
        this.expirationTime = date;
        this.notBeforeTime = date2;
        this.jwtId = str4;
        this.claim = map;
    }

    public /* synthetic */ JwtPayload(String str, String str2, String str3, Date date, Date date2, String str4, HashMap map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : date, (i10 & 16) != 0 ? null : date2, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : map);
    }
}
