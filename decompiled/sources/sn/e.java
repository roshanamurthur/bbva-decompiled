package sn;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.BufferedSink;

/* JADX INFO: compiled from: RequestBuilder.java */
/* JADX INFO: loaded from: classes13.dex */
public final class e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char[] f93289l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpUrl f93291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f93292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public HttpUrl.Builder f93293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Request.Builder f93294e = new Request.Builder();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Headers.Builder f93295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public MediaType f93296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f93297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final MultipartBody.Builder f93298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final FormBody.Builder f93299j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public RequestBody f93300k;

    /* JADX INFO: compiled from: RequestBuilder.java */
    public static class a extends RequestBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RequestBody f93301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaType f93302b;

        public a(RequestBody requestBody, MediaType mediaType) {
            this.f93301a = requestBody;
            this.f93302b = mediaType;
        }

        @Override // okhttp3.RequestBody
        public final long contentLength() throws IOException {
            return this.f93301a.contentLength();
        }

        @Override // okhttp3.RequestBody
        /* JADX INFO: renamed from: contentType */
        public final MediaType getF85587d() {
            return this.f93302b;
        }

        @Override // okhttp3.RequestBody
        public final void writeTo(BufferedSink bufferedSink) throws IOException {
            this.f93301a.writeTo(bufferedSink);
        }
    }

    public e(String str, HttpUrl httpUrl, @Nullable String str2, @Nullable Headers headers, @Nullable MediaType mediaType, boolean z10, boolean z11, boolean z12) {
        this.f93290a = str;
        this.f93291b = httpUrl;
        this.f93292c = str2;
        this.f93296g = mediaType;
        this.f93297h = z10;
        if (headers != null) {
            this.f93295f = headers.newBuilder();
        } else {
            this.f93295f = new Headers.Builder();
        }
        if (z11) {
            this.f93299j = new FormBody.Builder();
        } else if (z12) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f93298i = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    public final void a(String str, String str2) {
        if (!DigipassManagerConstants.KEY_CONTENT_TYPE.equalsIgnoreCase(str)) {
            this.f93295f.add(str, str2);
            return;
        }
        try {
            this.f93296g = MediaType.get(str2);
        } catch (IllegalArgumentException e5) {
            throw new IllegalArgumentException(androidx.camera.core.processing.f.d("Malformed content type: ", str2), e5);
        }
    }

    public final void b(String str, @Nullable String str2, boolean z10) {
        String str3 = this.f93292c;
        if (str3 != null) {
            HttpUrl httpUrl = this.f93291b;
            HttpUrl.Builder builderNewBuilder = httpUrl.newBuilder(str3);
            this.f93293d = builderNewBuilder;
            if (builderNewBuilder == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + this.f93292c);
            }
            this.f93292c = null;
        }
        if (z10) {
            this.f93293d.addEncodedQueryParameter(str, str2);
        } else {
            this.f93293d.addQueryParameter(str, str2);
        }
    }
}
