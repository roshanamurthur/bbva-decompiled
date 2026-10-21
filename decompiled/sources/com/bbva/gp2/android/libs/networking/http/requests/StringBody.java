package com.bbva.gp2.android.libs.networking.http.requests;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpRequestBody.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J\t\u0010\n\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bbva/gp2/android/libs/networking/http/requests/StringBody;", "Lcom/bbva/gp2/android/libs/networking/http/requests/HttpRequestBody;", "string", "", "charset", "Ljava/nio/charset/Charset;", "(Ljava/lang/String;Ljava/nio/charset/Charset;)V", "bytes", "", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "gp2-ethermobile-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class StringBody extends HttpRequestBody {

    @NotNull
    private final Charset charset;

    @NotNull
    private final String string;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public StringBody(@NotNull String string) {
        this(string, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(string, "string");
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getString() {
        return this.string;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final Charset getCharset() {
        return this.charset;
    }

    public static /* synthetic */ StringBody copy$default(StringBody stringBody, String str, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = stringBody.string;
        }
        if ((i10 & 2) != 0) {
            charset = stringBody.charset;
        }
        return stringBody.copy(str, charset);
    }

    @Override // com.bbva.gp2.android.libs.networking.http.requests.HttpRequestBody
    @NotNull
    public byte[] bytes() {
        byte[] bytes = this.string.getBytes(this.charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @NotNull
    public final StringBody copy(@NotNull String string, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new StringBody(string, charset);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StringBody)) {
            return false;
        }
        StringBody stringBody = (StringBody) other;
        return Intrinsics.areEqual(this.string, stringBody.string) && Intrinsics.areEqual(this.charset, stringBody.charset);
    }

    public int hashCode() {
        return this.charset.hashCode() + (this.string.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "StringBody(string=" + this.string + ", charset=" + this.charset + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ StringBody(String str, Charset charset, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? Charsets.UTF_8 : charset);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StringBody(@NotNull String string, @NotNull Charset charset) {
        super(null);
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.string = string;
        this.charset = charset;
    }
}
