package flexjson.transformer;

import flexjson.TypeContext;

/* JADX INFO: loaded from: classes7.dex */
public class IterableTransformer extends AbstractTransformer {
    @Override // flexjson.transformer.Transformer
    public void transform(Object obj) {
        TypeContext typeContextWriteOpenArray = getContext().writeOpenArray();
        for (Object obj2 : (Iterable) obj) {
            if (!typeContextWriteOpenArray.isFirst()) {
                getContext().writeComma();
            }
            typeContextWriteOpenArray.increment();
            getContext().transform(obj2);
        }
        getContext().writeCloseArray();
    }
}
