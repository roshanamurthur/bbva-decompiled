package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class HttpException extends RuntimeException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f93003p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f93004q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final transient Response<?> f93005r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpException(Response<?> response) {
        super("HTTP " + response.code() + " " + response.message());
        Objects.requireNonNull(response, "response == null");
        this.f93003p0 = response.code();
        this.f93004q0 = response.message();
        this.f93005r0 = response;
    }

    public int code() {
        return this.f93003p0;
    }

    public String message() {
        return this.f93004q0;
    }

    @Nullable
    public Response<?> response() {
        return this.f93005r0;
    }
}
