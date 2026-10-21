package ta;

import android.content.Context;
import com.bbva.network.model.request.NetworkRequestBody;
import com.bbva.networkplugin.command.params.FormDataPart;
import com.bbva.networkplugin.command.params.RequestParams;
import com.bbva.networkplugin.command.request.RequestCreator;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RequestCreator.kt */
/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension({"SMAP\nRequestCreator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestCreator.kt\ncom/bbva/networkplugin/command/request/RequestCreator$createMultipart$1$1\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,62:1\n32#2,2:63\n*S KotlinDebug\n*F\n+ 1 RequestCreator.kt\ncom/bbva/networkplugin/command/request/RequestCreator$createMultipart$1$1\n*L\n30#1:63,2\n*E\n"})
public final class a extends Lambda implements Function1<NetworkRequestBody.MultipartBody, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ RequestParams f93488p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ RequestCreator f93489q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Context f93490r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RequestParams requestParams, RequestCreator requestCreator, Context context) {
        super(1);
        this.f93488p0 = requestParams;
        this.f93489q0 = requestCreator;
        this.f93490r0 = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(NetworkRequestBody.MultipartBody multipartBody) {
        NetworkRequestBody.MultipartBody body = multipartBody;
        Intrinsics.checkNotNullParameter(body, "$this$body");
        Iterator it = ArrayIteratorKt.iterator(this.f93488p0.getMultipart().getParts());
        while (it.hasNext()) {
            FormDataPart formDataPart = (FormDataPart) it.next();
            if (formDataPart.getFilename() != null) {
                body.addFormPart(formDataPart.getName(), formDataPart.getFilename(), formDataPart.getBody().getMediaType(), this.f93489q0.f35253a.save(this.f93490r0, formDataPart.getBody().getContent()));
            } else {
                body.addFormPart(formDataPart.getName(), formDataPart.getBody().getContent(), formDataPart.getBody().getMediaType());
            }
        }
        return Unit.INSTANCE;
    }
}
