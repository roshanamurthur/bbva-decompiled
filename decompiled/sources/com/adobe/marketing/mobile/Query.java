package com.adobe.marketing.mobile;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class Query {
    private String[] columns;
    private String groupBy;
    private String having;
    private String limit;
    private String orderBy;
    private String selection;
    private String[] selectionArgs;
    private String table;

    public static class Builder {
        private Query query;

        public Builder(String str, String[] strArr) {
            Query query = new Query();
            this.query = query;
            query.table = str;
            this.query.columns = strArr;
        }

        public Query build() {
            return this.query;
        }

        public Builder groupBy(String str) {
            this.query.groupBy = str;
            return this;
        }

        public Builder having(String str) {
            this.query.having = str;
            return this;
        }

        public Builder limit(String str) {
            this.query.limit = str;
            return this;
        }

        public Builder orderBy(String str) {
            this.query.orderBy = str;
            return this;
        }

        public Builder selection(String str, String[] strArr) {
            this.query.selection = str;
            this.query.selectionArgs = strArr;
            return this;
        }
    }

    public String[] getColumns() {
        String[] strArr = this.columns;
        if (strArr != null) {
            return (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        return null;
    }

    public String getGroupBy() {
        return this.groupBy;
    }

    public String getHaving() {
        return this.having;
    }

    public String getLimit() {
        return this.limit;
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public String getSelection() {
        return this.selection;
    }

    public String[] getSelectionArgs() {
        String[] strArr = this.selectionArgs;
        if (strArr != null) {
            return (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        return null;
    }

    public String getTable() {
        return this.table;
    }

    private Query() {
    }
}
