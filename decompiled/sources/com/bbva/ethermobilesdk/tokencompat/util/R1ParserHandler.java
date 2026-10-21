package com.bbva.ethermobilesdk.tokencompat.util;

import androidx.camera.core.processing.f;
import com.bbva.ethermobilesdk.tokencompat.model.R1ServerResponse;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: R1ParserHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/util/R1ParserHandler;", "", "Ljava/io/InputStream;", "inputStream", "", "Lcom/bbva/ethermobilesdk/tokencompat/model/R1ServerResponse;", "parse", "<init>", "()V", "Companion", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public final class R1ParserHandler {

    @NotNull
    public static final String STS_ENROLL_ACTIVATION_DATA = "ACTDATA";

    @NotNull
    public static final String STS_ENROLL_SEED = "ENSSEMILLA_C";

    @NotNull
    public static final String STS_ENROLL_XML_CONFIG = "RETURNXMLCFG";

    @NotNull
    public static final String STS_OBJECT = "VariableRetornoSTS";

    @NotNull
    public static final String STS_OBJECT_CODE = "codVarRetornoSTS";

    @NotNull
    public static final String STS_OBJECT_VALUE = "valorVarRetornoSTS";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList<R1ServerResponse> f30667a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public R1ServerResponse f30668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f30669c;

    @NotNull
    public final List<R1ServerResponse> parse(@Nullable InputStream inputStream) {
        Object objM5535constructorimpl;
        R1ServerResponse r1ServerResponse;
        ArrayList<R1ServerResponse> arrayList = this.f30667a;
        try {
            Result.Companion companion = Result.INSTANCE;
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
            XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                String name = xmlPullParserNewPullParser.getName();
                if (eventType != 2) {
                    if (eventType != 3) {
                        if (eventType == 4) {
                            this.f30669c = xmlPullParserNewPullParser.getText();
                        }
                    } else if (l.equals(name, STS_OBJECT, true)) {
                        R1ServerResponse r1ServerResponse2 = this.f30668b;
                        if (r1ServerResponse2 != null) {
                            arrayList.add(r1ServerResponse2);
                        }
                    } else if (l.equals(name, STS_OBJECT_CODE, true)) {
                        R1ServerResponse r1ServerResponse3 = this.f30668b;
                        if (r1ServerResponse3 != null) {
                            r1ServerResponse3.setCode(this.f30669c);
                        }
                    } else if (l.equals(name, STS_OBJECT_VALUE, true) && (r1ServerResponse = this.f30668b) != null) {
                        r1ServerResponse.setValue(this.f30669c);
                    }
                } else if (l.equals(name, STS_OBJECT, true)) {
                    this.f30668b = new R1ServerResponse(null, null, 3, null);
                }
            }
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return arrayList;
        }
        throw new IllegalArgumentException(f.d("Could not parse all fields for SOAP response ", thM5538exceptionOrNullimpl.getMessage()));
    }
}
