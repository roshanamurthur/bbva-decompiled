package flexjson.transformer;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class BooleanAsStringTransformer extends AbstractTransformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68521b;

    public BooleanAsStringTransformer(String str, String str2) {
        this.f68520a = str;
        this.f68521b = str2;
    }

    @Override // flexjson.transformer.Transformer
    public void transform(Object obj) {
        if (obj == null) {
            getContext().write(AbstractJsonLexerKt.NULL);
        } else {
            getContext().writeQuoted(((Boolean) obj).booleanValue() ? this.f68520a : this.f68521b);
        }
    }
}
