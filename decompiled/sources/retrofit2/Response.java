package retrofit2;

import androidx.appcompat.widget.g0;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes13.dex */
public final class Response<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final okhttp3.Response f93018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final T f93019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ResponseBody f93020c;

    public Response(okhttp3.Response response, @Nullable T t10, @Nullable ResponseBody responseBody) {
        this.f93018a = response;
        this.f93019b = t10;
        this.f93020c = responseBody;
    }

    public static <T> Response<T> error(int i10, ResponseBody responseBody) {
        Objects.requireNonNull(responseBody, "body == null");
        if (i10 >= 400) {
            return error(responseBody, new okhttp3.Response.Builder().body(new d.c(responseBody.contentType(), responseBody.contentLength())).code(i10).message("Response.error()").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException(g0.c("code < 400: ", i10));
    }

    public static <T> Response<T> success(@Nullable T t10) {
        return success(t10, new okhttp3.Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    @Nullable
    public T body() {
        return this.f93019b;
    }

    public int code() {
        return this.f93018a.code();
    }

    @Nullable
    public ResponseBody errorBody() {
        return this.f93020c;
    }

    public Headers headers() {
        return this.f93018a.headers();
    }

    public boolean isSuccessful() {
        return this.f93018a.isSuccessful();
    }

    public String message() {
        return this.f93018a.message();
    }

    public okhttp3.Response raw() {
        return this.f93018a;
    }

    public String toString() {
        return this.f93018a.toString();
    }

    public static <T> Response<T> success(int i10, @Nullable T t10) {
        if (i10 >= 200 && i10 < 300) {
            return success(t10, new okhttp3.Response.Builder().code(i10).message("Response.success()").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException(g0.c("code < 200 or >= 300: ", i10));
    }

    public static <T> Response<T> error(ResponseBody responseBody, okhttp3.Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (!response.isSuccessful()) {
            return new Response<>(response, null, responseBody);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> Response<T> success(@Nullable T t10, Headers headers) {
        Objects.requireNonNull(headers, "headers == null");
        return success(t10, new okhttp3.Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).headers(headers).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    public static <T> Response<T> success(@Nullable T t10, okhttp3.Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new Response<>(response, t10, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }
}
