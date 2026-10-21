package flexjson.transformer;

import flexjson.TypeContext;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes7.dex */
public class ArrayTransformer extends AbstractTransformer {
    @Override // flexjson.transformer.Transformer
    public void transform(Object obj) {
        TypeContext typeContextWriteOpenArray = getContext().writeOpenArray();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            if (!typeContextWriteOpenArray.isFirst()) {
                getContext().writeComma();
            }
            typeContextWriteOpenArray.increment();
            getContext().transform(Array.get(obj, i10));
        }
        getContext().writeCloseArray();
    }
}
