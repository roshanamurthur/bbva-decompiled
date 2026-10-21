package ln;

import java.util.ArrayList;
import org.junit.rules.ExternalResource;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.Statement;

/* JADX INFO: compiled from: ExternalResource.java */
/* JADX INFO: loaded from: classes13.dex */
public final class b extends Statement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Statement f83227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExternalResource f83228b;

    public b(ExternalResource externalResource, Statement statement) {
        this.f83228b = externalResource;
        this.f83227a = statement;
    }

    @Override // org.junit.runners.model.Statement
    public final void evaluate() throws Exception {
        ExternalResource externalResource = this.f83228b;
        externalResource.before();
        ArrayList arrayList = new ArrayList();
        try {
            try {
                this.f83227a.evaluate();
                externalResource.after();
            } catch (Throwable th2) {
                arrayList.add(th2);
            }
        } catch (Throwable th3) {
            try {
                arrayList.add(th3);
                externalResource.after();
            } catch (Throwable th4) {
                try {
                    externalResource.after();
                } catch (Throwable th5) {
                    arrayList.add(th5);
                }
                throw th4;
            }
        }
        MultipleFailureException.assertEmpty(arrayList);
    }
}
