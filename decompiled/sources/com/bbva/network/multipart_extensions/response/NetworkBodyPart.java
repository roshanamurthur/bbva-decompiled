package com.bbva.network.multipart_extensions.response;

import bk.q;
import com.bbva.network.model.response.body.Body;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MultipartNetworkResponse.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001b\u0010\u0003\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/bbva/network/multipart_extensions/response/NetworkBodyPart;", "Lcom/bbva/network/model/response/body/Body;", "", "string", "Ljava/io/InputStream;", "inputStream", "c", "Lkotlin/Lazy;", "getString", "()Ljava/lang/String;", "", "d", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "headers", "e", "Ljava/lang/String;", "getContentType", "contentType", "f", "getFilename", "filename", "Ljavax/mail/BodyPart;", "bodyPart", "<init>", "(Ljavax/mail/BodyPart;)V", "network-multipart-extensions_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultipartNetworkResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartNetworkResponse.kt\ncom/bbva/network/multipart_extensions/response/NetworkBodyPart\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
public final class NetworkBodyPart implements Body {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f35167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f35168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy string;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> headers;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String contentType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String filename;

    /* JADX INFO: compiled from: MultipartNetworkResponse.kt */
    public static final class a extends Lambda implements Function0<ByteArrayInputStream> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ByteArrayInputStream invoke() {
            return new ByteArrayInputStream(NetworkBodyPart.this.f35167a);
        }
    }

    /* JADX INFO: compiled from: MultipartNetworkResponse.kt */
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return new String(NetworkBodyPart.this.f35167a, Charsets.UTF_8);
        }
    }

    public NetworkBodyPart(@NotNull BodyPart bodyPart) throws MessagingException, IOException {
        Object objM5535constructorimpl;
        Object objM5535constructorimpl2;
        Object objM5535constructorimpl3;
        Intrinsics.checkNotNullParameter(bodyPart, "bodyPart");
        InputStream inputStream = bodyPart.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "bodyPart.inputStream");
        this.f35167a = ByteStreamsKt.readBytes(inputStream);
        this.f35168b = LazyKt__LazyJVMKt.lazy(new a());
        this.string = LazyKt__LazyJVMKt.lazy(new b());
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(MultipartNetworkResponseKt.access$headers(bodyPart));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        this.headers = (Map) (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null ? q.emptyMap() : objM5535constructorimpl);
        try {
            objM5535constructorimpl2 = Result.m5535constructorimpl(bodyPart.getContentType());
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            objM5535constructorimpl2 = Result.m5535constructorimpl(ResultKt.createFailure(th3));
        }
        this.contentType = (String) (Result.m5540isFailureimpl(objM5535constructorimpl2) ? null : objM5535constructorimpl2);
        try {
            objM5535constructorimpl3 = Result.m5535constructorimpl(bodyPart.getFileName());
        } catch (Throwable th4) {
            Result.Companion companion4 = Result.INSTANCE;
            objM5535constructorimpl3 = Result.m5535constructorimpl(ResultKt.createFailure(th4));
        }
        this.filename = (String) (Result.m5540isFailureimpl(objM5535constructorimpl3) ? null : objM5535constructorimpl3);
    }

    @Override // com.bbva.network.model.response.body.Body
    public long contentLength() {
        return Body.DefaultImpls.contentLength(this);
    }

    @Nullable
    public final String getContentType() {
        return this.contentType;
    }

    @Nullable
    public final String getFilename() {
        return this.filename;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final String getString() {
        return (String) this.string.getValue();
    }

    @Override // com.bbva.network.model.response.body.Body
    @NotNull
    public InputStream inputStream() {
        return (InputStream) this.f35168b.getValue();
    }

    @Override // com.bbva.network.model.response.body.Body
    @NotNull
    public String string() {
        return getString();
    }
}
