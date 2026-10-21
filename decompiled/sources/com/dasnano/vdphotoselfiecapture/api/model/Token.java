package com.dasnano.vdphotoselfiecapture.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.gson.Gson;
import java.nio.charset.Charset;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Token.kt */
/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fHÖ\u0001R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012¨\u0006&"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/api/model/Token;", "Landroid/os/Parcelable;", "schema", "", "id", "timestamp", "Ljava/util/Date;", "expires", ClientData.KEY_CHALLENGE, "Lcom/dasnano/vdphotoselfiecapture/api/model/Challenge;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lcom/dasnano/vdphotoselfiecapture/api/model/Challenge;)V", "getChallenge", "()Lcom/dasnano/vdphotoselfiecapture/api/model/Challenge;", "setChallenge", "(Lcom/dasnano/vdphotoselfiecapture/api/model/Challenge;)V", "getExpires", "()Ljava/util/Date;", "setExpires", "(Ljava/util/Date;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "()Z", "getSchema", "setSchema", "getTimestamp", "setTimestamp", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Token implements Parcelable {

    @NotNull
    private Challenge challenge;

    @NotNull
    private Date expires;

    @NotNull
    private String id;

    @NotNull
    private String schema;

    @NotNull
    private Date timestamp;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Token> CREATOR = new Creator();

    /* JADX INFO: compiled from: Token.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/api/model/Token$Companion;", "", "", "token", "Lcom/dasnano/vdphotoselfiecapture/api/model/Token;", "getTokenFromJWS", "<init>", "()V", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Token.kt\ncom/dasnano/vdphotoselfiecapture/api/model/Token$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,72:1\n37#2,2:73\n*S KotlinDebug\n*F\n+ 1 Token.kt\ncom/dasnano/vdphotoselfiecapture/api/model/Token$Companion\n*L\n64#1:73,2\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final Token getTokenFromJWS(@NotNull String token) throws Exception {
            Intrinsics.checkNotNullParameter(token, "token");
            String strF = ((String[]) new Regex("\\.").split(token, 0).toArray(new String[0]))[1];
            if (strF.length() % 4 != 0) {
                String strSubstring = "====".substring(strF.length() % 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                strF = u.f(strF, strSubstring);
            }
            byte[] bArrDecode = Base64.decode(strF, 0);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            Token token2 = (Token) new Gson().fromJson(new String(bArrDecode, charsetForName), Token.class);
            Intrinsics.checkNotNull(token2);
            if (token2.isValid()) {
                return token2;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: Token.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Token> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Token createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Token(parcel.readString(), parcel.readString(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), Challenge.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Token[] newArray(int i10) {
            return new Token[i10];
        }
    }

    public Token(@NotNull String schema, @NotNull String id, @NotNull Date timestamp, @NotNull Date expires, @NotNull Challenge challenge) {
        Intrinsics.checkNotNullParameter(schema, "schema");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(expires, "expires");
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        this.schema = schema;
        this.id = id;
        this.timestamp = timestamp;
        this.expires = expires;
        this.challenge = challenge;
    }

    @JvmStatic
    @Nullable
    public static final Token getTokenFromJWS(@NotNull String str) throws Exception {
        return INSTANCE.getTokenFromJWS(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid() {
        return this.challenge.isValid();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final Challenge getChallenge() {
        return this.challenge;
    }

    @NotNull
    public final Date getExpires() {
        return this.expires;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getSchema() {
        return this.schema;
    }

    @NotNull
    public final Date getTimestamp() {
        return this.timestamp;
    }

    public final void setChallenge(@NotNull Challenge challenge) {
        Intrinsics.checkNotNullParameter(challenge, "<set-?>");
        this.challenge = challenge;
    }

    public final void setExpires(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.expires = date;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setSchema(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.schema = str;
    }

    public final void setTimestamp(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.timestamp = date;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.schema);
        parcel.writeString(this.id);
        parcel.writeSerializable(this.timestamp);
        parcel.writeSerializable(this.expires);
        this.challenge.writeToParcel(parcel, flags);
    }
}
