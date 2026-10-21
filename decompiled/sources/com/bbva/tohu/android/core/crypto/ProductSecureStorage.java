package com.bbva.tohu.android.core.crypto;

import android.content.Context;
import androidx.collection.f;
import com.bbva.tohu.android.core.exceptions.CryptoException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class ProductSecureStorage {
    public static final String PRODUCT_SEPARATOR = "#";
    private Set<String> keyIds = new HashSet();
    private String productId;
    private SecureStorage secureStorage;

    public ProductSecureStorage(String str, SecureStorage secureStorage) {
        this.productId = str;
        this.secureStorage = secureStorage;
    }

    private String generatedProductKeyId(String str) {
        return f.c(new StringBuilder(), this.productId, "#", str);
    }

    public static ProductSecureStorage getInstance(String str, Context context, String str2, String str3) {
        return new ProductSecureStorage(str, SecureStorage.getInstance(context, str2, str3));
    }

    public void clearAllEntries() throws CryptoException {
        Iterator<String> it = this.keyIds.iterator();
        while (it.hasNext()) {
            this.secureStorage.removeEntry(it.next());
        }
        this.keyIds.clear();
    }

    public byte[] getEntry(String str) throws CryptoException {
        return this.secureStorage.getEntry(generatedProductKeyId(str));
    }

    public byte[] getGlobalEntry(String str) throws CryptoException {
        return this.secureStorage.getEntry(str);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void putEntry(String str, byte[] bArr) throws CryptoException {
        String strGeneratedProductKeyId = generatedProductKeyId(str);
        this.secureStorage.putEntry(strGeneratedProductKeyId, bArr);
        if (strGeneratedProductKeyId.contains(strGeneratedProductKeyId)) {
            return;
        }
        this.keyIds.add(strGeneratedProductKeyId);
    }

    public void putGlobalEntry(String str, byte[] bArr) throws CryptoException {
        this.secureStorage.putEntry(str, bArr);
    }

    public void removeEntry(String str) throws CryptoException {
        String strGeneratedProductKeyId = generatedProductKeyId(str);
        this.secureStorage.removeEntry(strGeneratedProductKeyId);
        this.keyIds.remove(strGeneratedProductKeyId);
    }
}
