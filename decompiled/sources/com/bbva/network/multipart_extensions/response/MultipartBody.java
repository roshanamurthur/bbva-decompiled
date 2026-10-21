package com.bbva.network.multipart_extensions.response;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MultipartNetworkResponse.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"Lcom/bbva/network/multipart_extensions/response/MultipartBody;", "", "", "responseType", "", "ignoreBoundary", "", "Lcom/bbva/network/multipart_extensions/response/NetworkBodyPart;", "parts", "Ljava/io/InputStream;", "inputStream", "<init>", "(Ljava/io/InputStream;)V", "Companion", "network-multipart-extensions_release"}, k = 1, mv = {1, 8, 0})
public final class MultipartBody {

    @NotNull
    public static final String IGNORE_BOUNDARY = "mail.mime.multipart.ignoreexistingboundaryparameter";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final InputStream f35164a;

    public MultipartBody(@Nullable InputStream inputStream) {
        this.f35164a = inputStream;
    }

    public static /* synthetic */ List parts$default(MultipartBody multipartBody, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return multipartBody.parts(str, z10);
    }

    @NotNull
    public final List<NetworkBodyPart> parts(@NotNull String responseType, boolean ignoreBoundary) throws MessagingException {
        Intrinsics.checkNotNullParameter(responseType, "responseType");
        System.setProperty(IGNORE_BOUNDARY, String.valueOf(ignoreBoundary));
        MimeMultipart mimeMultipart = new MimeMultipart(new ByteArrayDataSource(this.f35164a, responseType));
        ArrayList arrayList = new ArrayList();
        int count = mimeMultipart.getCount();
        for (int i10 = 0; i10 < count; i10++) {
            BodyPart bodyPart = mimeMultipart.getBodyPart(i10);
            Intrinsics.checkNotNullExpressionValue(bodyPart, "multipart.getBodyPart(i)");
            arrayList.add(new NetworkBodyPart(bodyPart));
        }
        System.clearProperty(IGNORE_BOUNDARY);
        return arrayList;
    }
}
