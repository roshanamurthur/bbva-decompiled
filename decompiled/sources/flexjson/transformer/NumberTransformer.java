package flexjson.transformer;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class NumberTransformer extends AbstractTransformer {
    @Override // flexjson.transformer.Transformer
    public void transform(Object obj) {
        if (obj instanceof Double) {
            Double d2 = (Double) obj;
            if (Double.isInfinite(d2.doubleValue()) || Double.isNaN(d2.doubleValue())) {
                getContext().write(AbstractJsonLexerKt.NULL);
                return;
            }
        }
        if (obj instanceof Float) {
            Float f6 = (Float) obj;
            if (Float.isInfinite(f6.floatValue()) || Float.isNaN(f6.floatValue())) {
                getContext().write(AbstractJsonLexerKt.NULL);
                return;
            }
        }
        getContext().write(obj.toString());
    }
}
