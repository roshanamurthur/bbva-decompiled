package com.adobe.marketing.mobile;

import android.database.Cursor;

/* JADX INFO: loaded from: classes2.dex */
class AndroidCursor implements DatabaseService.QueryResult {
    private final Cursor cursor;

    public AndroidCursor(Cursor cursor) {
        this.cursor = cursor;
    }

    @Override // com.adobe.marketing.mobile.DatabaseService.QueryResult
    public void close() {
        try {
            this.cursor.close();
        } catch (Exception unused) {
        }
    }

    @Override // com.adobe.marketing.mobile.DatabaseService.QueryResult
    public int getCount() throws Exception {
        return this.cursor.getCount();
    }

    @Override // com.adobe.marketing.mobile.DatabaseService.QueryResult
    public double getDouble(int i10) throws Exception {
        return this.cursor.getDouble(i10);
    }

    @Override // com.adobe.marketing.mobile.DatabaseService.QueryResult
    public float getFloat(int i10) throws Exception {
        return this.cursor.getFloat(i10);
    }

    @Override // com.adobe.marketing.mobile.DatabaseService.QueryResult
    public int getInt(int i10) throws Exception {
        return this.cursor.getInt(i10);
    }

    @Override // com.adobe.marketing.mobile.DatabaseService.QueryResult
    public long getLong(int i10) throws Exception {
        return this.cursor.getLong(i10);
    }

    @Override // com.adobe.marketing.mobile.DatabaseService.QueryResult
    public String getString(int i10) throws Exception {
        return this.cursor.getString(i10);
    }

    @Override // com.adobe.marketing.mobile.DatabaseService.QueryResult
    public boolean isNull(int i10) throws Exception {
        return this.cursor.isNull(i10);
    }

    @Override // com.adobe.marketing.mobile.DatabaseService.QueryResult
    public boolean moveToFirst() throws Exception {
        return this.cursor.moveToFirst();
    }

    @Override // com.adobe.marketing.mobile.DatabaseService.QueryResult
    public boolean moveToLast() throws Exception {
        return this.cursor.moveToLast();
    }

    @Override // com.adobe.marketing.mobile.DatabaseService.QueryResult
    public boolean moveToNext() throws Exception {
        return this.cursor.moveToNext();
    }
}
